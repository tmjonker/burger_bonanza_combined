import React from "react";
import ReactDOM from "react-dom/client";
import App from "./Components/App.jsx";
import { BrowserRouter, Route, Switch } from "react-router-dom";

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
    <BrowserRouter>
      <App />
    </BrowserRouter>
);