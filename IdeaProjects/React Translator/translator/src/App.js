import "./styles.css";
import React, { useState } from "react";
import Field from "./components/field";
import Languages from "./components/languages";
import Translate from "./components/translate";

export default function App() {
  const [language, setLanguage] = useState('ru');
  const[text, setText] = useState('');

  return (
      <div>
        <Field label="Enter English" onChange={setText} value={text} />
        <Languages language={language} onLanguageChange={setLanguage} />
        <hr />
        <Translate text={text} language={language} />
      </div>
  );
}


// import logo from './logo.svg';
// import './App.css';
//
// function App() {
//   return (
//     <div className="App">
//       <header className="App-header">
//         <img src={logo} className="App-logo" alt="logo" />
//         <p>
//           Edit <code>src/App.js</code> and save to reload.
//         </p>
//         <a
//           className="App-link"
//           href="https://reactjs.org"
//           target="_blank"
//           rel="noopener noreferrer"
//         >
//           Learn React
//         </a>
//       </header>
//     </div>
//   );
// }
//
// export default App;
