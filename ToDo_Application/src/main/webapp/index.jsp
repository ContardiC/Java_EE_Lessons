<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>To Do app</title>
    <link href="css/bootstrap.min.css" rel="stylesheet"/>
  </head>
  <body>
	  <nav class="navbar bg-light">
		  <div class="container-fluid">
		    <a class="navbar-brand">ToDo UP :-) </a>
		    <form class="d-flex" role="search">
				<input class="form-control me-2" type="search" placeholder="Search Tasks" aria-label="Search">
		      	<button class="btn btn-outline-success" type="submit">Search</button>
		    </form>
		  </div>
		</nav>
	 
    <div class="container-lg">
    	<div class="mb-3">
  			<label for="exampleFormControlInput1" class="form-label">Nome Progetto</label>
  			<input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Scrivere articolo Blog">
		</div>
    	<div class="form-check">
  			<input class="form-check-input" type="checkbox" value="" id="flexCheckDefault">
  			<label class="form-check-label" for="flexCheckDefault">
    		Primo Task
  			</label>
		</div>
		<div class="form-check">
  			<input class="form-check-input" type="checkbox" value="" id="flexCheckChecked" checked>
  			<label class="form-check-label" for="flexCheckChecked">
  			Secondo Task
  			</label>
		</div>
    </div>
    <div class="d-grid gap-2">
  		<button class="btn btn-primary" type="button">Salva</button>
  		<button class="btn btn-danger" type="button">Reset</button>
	</div>
    <script src="js/bootstrap.bundle.min.js"></script>
  </body>
</html>