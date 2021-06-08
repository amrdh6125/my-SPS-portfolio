async function showScramPage()
{
    const responseServer = await fetch('/scram');
    const textResponse = await responseServer.text();

    const scramContainer = document.getElementById('scram-container');
    scramContainer.innerText = textResponse;
}