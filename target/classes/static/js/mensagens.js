fetch("mensagem",{
    method: "GET",
    headers: {
        "Accept": "application/json"
    }
})

.then(response => response.json())
.then(data => {
    document.getElementById("listaMensagens").innerText = `${data.mensagem}`
    console.log("mensagens recebidas: ", data)
})