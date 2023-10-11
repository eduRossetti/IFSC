entrar = input('digite o usuario: ')
senha = input('digite a senha: ')

checkSenha = "floda123"
checkUsuario = "Eduardo"

if checkUsuario == entrar and checkSenha == senha:
    print('Seja bem vindo')
elif checkUsuario != entrar and checkSenha == senha:
    print('Usuario incorreto')
elif checkUsuario == entrar and checkSenha != senha:
    print('senha incorreta')
else:
    print('Dados incorretos')