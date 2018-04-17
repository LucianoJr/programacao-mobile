# Tutorial GIT

1. Criar repositório no [github](https://github.com/)

2. Baixar o [git](https://git-scm.com/downloads)

3. Abrir o git em modo linha de comando.

4. Configurar o usuário do git pela linha de comando:

```
git config --global user.name "Seu nome"
git config --global user.email "seunome@example.com"
```

5. Clonar o repositório

```
git clone https://github.com/chaua/teste.git
```

6. Depois as alterações podem ser realizadas normalmente dentro do diretório.

7. Para verificar quais arquivos foram alterados:

```
git status
```

8. Para subir os arquivos para o repositório é necessário adicionar eles no pacote de alterações e então realizar o *commit*:

```
git add -A
git commit -m 'descricao da alteracao'
```

9. Para subir as alterações para o github:

```
git push
```

10. Para baixar a última versão do github:


```
git pull
```







