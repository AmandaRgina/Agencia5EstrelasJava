import './style.css';

function Home(){

return(


<section className="carrosel">
<div id="carouselExampleControls" className="carousel slide col-9" data-ride="carousel">
  <div className="carousel-inner ">
    <div className="carousel-item active">
      <img className="d-block w-100" src="https://catracalivre.com.br/wp-content/uploads/2021/11/black-friday-pacotes-viagem-ofertas-768x512.jpg" alt="First slide"/>
    </div>
    <div className="carousel-item">
      <img className="d-block w-100" src="https://catracalivre.com.br/wp-content/uploads/2021/11/black-friday-pacotes-viagem-ofertas-768x512.jpg" alt="Second slide"/>
    </div>
    <div className="carousel-item">
      <img className="d-block w-100" src="..." alt="Third slide"/>
    </div>
    <div className = "buttons">
  <a className="btn btn-warning" href="/Clientes" role="button">Cadastrar Cliente</a>
<a className="btn btn-warning" href="/Destinos" role="button">Cadastrar Destino</a>
  
   </div>
  </div>
    
  
  <a className="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
    <span className="carousel-control-prev-icon" aria-hidden="true"></span>
    <span className="sr-only"></span>
  </a>
  <a className="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
    <span className="carousel-control-next-icon" aria-hidden="true"></span>
    <span className="sr-only"></span>
  </a>
 
  
</div>
  </section>



)



}

export default Home;