async function showScramPage()
{
    const responseServer = await fetch('/scram');
    const textResponse = await responseServer.json();
    const scramContainer = document.getElementById('scram-container');
    scramContainer.innerHTML = '';

    //Random message
    const x = Math.floor((Math.random() * 3) + 1); 

    if(x == 1)
    {
      scramContainer.appendChild(createElement(textResponse.Message1));
    }else if(x == 2)
    {
      scramContainer.appendChild(createElement(textResponse.Message2));
    }else if(x == 3)
    {
      scramContainer.appendChild(createElement(textResponse.Message3));
    }
}

function createElement(text) 
{
  const pElement = document.createElement('p');
  pElement.innerText = text;
  return pElement;
}