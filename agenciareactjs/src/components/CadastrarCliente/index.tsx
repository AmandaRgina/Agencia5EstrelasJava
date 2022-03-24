function Cadastrar(){

return (
 <div className="row">
   <div className="col md-2">
<div className="container p-4">
 
<div className="card">
<div className="card-header text-center">
     <h4>Cadastro de Cliente</h4>
  <div>
<div className="card-body">
<form>
<div className="input-group mb-3">
  <span className="input-group-text" id="basic-addon1">Nome</span>
  <input name="nome" type="text" maxLength={45} className="form-control" placeholder="" aria-label="Username" aria-describedby="basic-addon1"/>
</div>
<div className="input-group mb-3 " >
  <span className="input-group-text" id="basic-addon1">Nascimento</span>
  <input name="nascimento" type="date" className="form-control" placeholder="" aria-label="Username" aria-describedby="basic-addon1"/>
</div>
<div className="input-group mb-3">
  <span className="input-group-text" id="basic-addon1">CPF</span>
  <input name="cpf" type="text" maxLength={11} className="form-control" placeholder="" aria-label="Username" aria-describedby="basic-addon1"/>
</div>
<div className="input-group mb-3">
  <span className="input-group-text" id="basic-addon1">Telefone</span>
  <input name="telefone" type="text" maxLength={11} className="form-control" placeholder="" aria-label="Username" aria-describedby="basic-addon1"/>
</div>
<div className="input-group mb-3">
  <label className="input-group-text" htmlFor="inputGroupSelect01">Situação</label>
  <select className="form-select" id="inputGroupSelect01">
    <option value="1">Ativo</option>
    <option value="2">Inativo</option>
    
  </select>
</div>
<div>
<button className="btn btn-primary" type="submit">Salvar</button>
</div>
</form>

</div>
</div>
</div>

</div>

</div>

</div>
</div>





);



}
export default Cadastrar;