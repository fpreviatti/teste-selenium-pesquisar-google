# teste-selenium-pesquisar-google

Exemplo de automação com selenium feito em java para abrir o Chrome e procurar por uma palavra chave.

1)Clone o projeto para o seu diretório de preferência.

2)Configurações iniciais do git (init, etc);

3)Ajuste a linha 10 da classe TesteAutomatizado com o caminho em que o projeto foi clonado apontando para o driver do selenium (chromedriver.exe), passando o parâmetro do caminho, por exemplo, se o driver se encontra no C:\\ ficaria conforme abaixo:

System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

4)Verifique a versão do navegador e a versão do driver do selenium. O driver precisa ser correspondente à versão do chrome.
