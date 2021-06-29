async function showDatastorePage()
{
    const responseServer = await fetch('/messages');
    const textResponse = await responseServer.json();
    const messageContainer = document.getElementById('message-container');
    messageContainer.innerHTML = textResponse;
}

function createElement(text) 
{
  const pElement = document.createElement('p');
  pElement.innerText = text;
  return pElement;
}