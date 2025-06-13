//intro.js
function Intro()
{
    return(
        <div>
        <h1>Welcome to reactjs sessions</h1>
        <p>hi</p>


        </div>
    );
}
export default Intro;

//app.js

import './App.css';
 import Intro from'./intro.js';

function App() {
  return (
    <div className="App">
      { <header className="App-header">
        <img src="https://www.sviet.edu.in/wp-content/uploads/2023/06/SVIET-LOGO-Edited-1.png" className="App-logo" alt="logo" />
        <p>
         SRI VASAVI INSTITUTE OF ENGINEERING AND TECHNOLOGY
        </p>
        <a
          className="App-link"
          href="https://www.sviet.edu.in/"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
        <Intro></Intro>
      </header> }
    

    </div>
  );
}

export default App;
