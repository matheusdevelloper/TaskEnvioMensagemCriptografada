function criptografarMensagem(){
   const mensagem = document.getElementById("mensagem").value
   const msg = {mensagem}

   fetch("/mensagem", {
      method: "POST",
      headers: {'Content-Type': 'application/json'},
      body: JSON.stringify(msg)
   })
   .then(response => response.text())
   .then (data => {
      document.getElementById("resposta").innerText = `Mensagem Criptografada enviada com sucesso! ${data}`
      document.getElementById("mensagem").value = ""
      setTimeout(()=>{
         document.getElementById("resposta").innerText = ""
      }, 3000)
      
   })
}



  
