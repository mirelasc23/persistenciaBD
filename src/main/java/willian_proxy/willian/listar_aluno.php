<?php

include './conexao.php';

$sql = 'select id, nome, email from aluno';

$resultado = pg_query($conexao, $sql);

?>

<html>
    <head>
        <meta charset="UTF-8">
        <title>Aluno</title>
    </head>
    <body>
        <table border="1">
            <tr><th>id</th><th>nome</th><th>e-mail</th></tr>
            
            <?php
            
            while ($linha = pg_fetch_array($resultado)) {
                
               echo "<tr>"
                . "<td>{$linha['id']}</td>"
                . "<td>{$linha['nome']}</td>"
                . "<td>{$linha['email']}</td>"
                 . "<td>  <a href='excluir_aluno.php?id={$linha['id']}'>  <img src='excluir.png' width='20' height='20'/></a></td>"
                        . "</tr>"; 
            }
            ?>
   
        </table>
        
      
        
       
        
    </body>
</html>