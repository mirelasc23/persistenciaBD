<?php

include './conexao.php';

$id = $_GET['id'];



$sql = 'delete from aluno where id = $1';

pg_query_params($conexao, $sql, array($id));

header("Location: form_aluno.php");
exit;

?>

