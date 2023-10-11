nome = input('Digite seu nome: ')
idade = input('digite sua idade: ')

if nome and idade:
    print(f'Seu nome é {nome}')
    print(f'Seu nome invertido é {nome [::-1]}')

    if ' ' in nome:
        print('tem espaço no nome')
    else:
        print('NÃO tem espaços')
    
    print(f'Primeira letra do seu nome: {nome [0:1:1]}')
    print(f'Ultima letra do seu nome: {nome [-1:-2:-1]}')
else:
    print("desculpe vc deixou campos vazios")