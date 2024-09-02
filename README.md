
# SISTEMA DE GERENCIAMENTO DE TAREFAS
##  💻 API RestFul simples desenvolvida para executar ações simples de CRUD para gerenciar tarefas

### ☕ Utilizando o Framework SpringBoot + H2 Database + Spring Data JPA neste desenvolvimento

#### 🛠️ Ferramentas utilizadas

| Comando | Como Usar |
| ------- | --------- |
| Spring Boot | [Documentação](https://docs.spring.io/spring-framework/reference/overview.html) |
| H2 Database | [Documentação](https://www.h2database.com/html/tutorial.html) |
| Spring Data JPA | [Documentação](https://docs.spring.io/spring-framework/reference/data-access/orm/jpa.html#page-title) |


### 🔎 Passo a Passo para rodar a aplicação na linha de comando


#### ✅ Se caso você já possuir o JDK 17 instalado na sua máquina:

Na diretório raiz do projeto digite o seguinte comando:

```
java -jar target\taskSystemManagement-0.0.1-SNAPSHOT.jar
```

#### ❌ Se caso não possuir te ajudarei na instalação:

- Visite o site oficial da Oracle, na seção [Java Downloads](https://www.oracle.com/br/java/technologies/downloads/#java22);
- Escolha a opção JDK 17;
- Escolha a opção para download segundo o sistema operacional desejado, no meu caso estou utilizando windows;
- Se estiver utilizando também selecione o [x64 Installer](https://download.oracle.com/java/17/latest/jdk-17_windows-x64_bin.exe) e faça o download;
- Execute o instalador após o download;

- Siga as instruções e escolha o diretório padrão sugerido pelo instalador;

- Após a instalação vocÊ precisará configurar as variáveis de ambiente do sistema;

- Abra o prompt de comando;

- Digite o seguinte comando:
```
setx JAVA_HOME "C:\Program Files\Java\jdk-17"
```
- Logo após digite esse outro comando:
```
setx PATH "%PATH%;C:\Program Files\Java\jdk-17\bin"
```

- Após a conclusão, verifique se o java foi instalado com sucesso digitando o seguinte comando:
```
java --version
```

- Se a versão do java aparecer a instalaçãofoi concluída com sucesso;

- Então rode o projeto digitando o seguinte comando no diretório raíz do projeto:

```
java -jar target\taskSystemManagement-0.0.1-SNAPSHOT.jar
```
