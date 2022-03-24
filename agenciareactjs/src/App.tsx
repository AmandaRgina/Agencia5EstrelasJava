
import { FormspreeProvider } from '@formspree/react';
import Navbar from "./components/Navbar";
import CadastrarDestino from './components/CadastrarDestino';
import Cadastrar from "./components/CadastrarCliente";
import {
  BrowserRouter,
  Routes,
  Route
} from "react-router-dom";


// importação dos pacotes necessários
import { useEffect } from "react";
import axios from "axios";
import Home from './components/Home';


// configuração da url de comunicação com o backend (aqui você irá usar aquela url copiada)
const api = axios.create({
  baseURL: `http://localhost:8080/projetoAgenciaJava/`,
  headers: {
    "Content-type": "application/json",
  },
});

function App() {
  // aqui usamos um Effect que tem a função de executar o seu conteúdo na inicialização do App
  useEffect(() => {
    // aqui definimos a função que irá chamar a requisição na url que configuramos,
    // adicionando o trecho '/MeuServlet' na url
    // com isso, nossa requisição cairá no nosso Servlet
    const chamarRequisicao = async () => {
      const resposta = await api.get(`/MeuServlet`);
      console.log(resposta.data);
    };

    // aqui chamamos a função que acabamos de definir
    chamarRequisicao();
  }, []);

   // aqui vem o resto do código do seu app
  return (
    <BrowserRouter>
    <Navbar />
   
    <Routes>
      <Route path="/Clientes" element={<Cadastrar />} />
      <Route path="/Destinos" element={<CadastrarDestino/>} />
      <Route path="/" element={<Home/>} />

    </Routes>
  
  </BrowserRouter>
  );
}

export default App;
