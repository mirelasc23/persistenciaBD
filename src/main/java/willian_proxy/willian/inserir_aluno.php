<?php

include './conexao.php';

$nome = $_POST['nome'];
$email = $_POST['email'];


$sql = 'insert into aluno (nome, email, sexo_id) values ($1, $2)';

pg_query_params($conexao, $sql, array($nome, $email));





header("Location: form_aluno.php");
exit;



?>