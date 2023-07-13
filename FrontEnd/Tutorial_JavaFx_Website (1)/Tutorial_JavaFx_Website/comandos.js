function rolarAba(assunto) {
  console.log("Está sendo chamada.");
  var elementos = document.getElementsByTagName('h2');
  console.log(assunto);
  console.log(elementos[2]);
  for (var i = 0; i < elementos.length; i++) {
    if (elementos[i].innerText.toLowerCase().includes(assunto.toLowerCase())) {
      elementos[i].scrollIntoView({ behavior: 'smooth', block: 'start' });
      break;
    }
  }
}

  