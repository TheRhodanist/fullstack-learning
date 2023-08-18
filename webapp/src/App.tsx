import React, { useState } from "react";
import logo from "./logo.svg";
import "./App.css";
import Button from "@mui/material/Button";
import { setSelectionRange } from "@testing-library/user-event/dist/utils";

import "@fontsource/roboto/300.css";
import "@fontsource/roboto/400.css";
import "@fontsource/roboto/500.css";
import "@fontsource/roboto/700.css";

function App() {
  const [counter, setCounter] = useState(5);
  return (
    <div className="App">
      <header className="App-header">
        <Button
          variant="contained"
          onClick={() => {
            setCounter(counter + 5);
          }}
        >
          Testcounter:{counter}
        </Button>
      </header>
    </div>
  );
}

export default App;
