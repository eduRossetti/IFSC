
nome = 'Otávio'
print(nome[2])
print(nome[-4])
print('vio' in nome) # procura se 'vio' esta em nome 
print('zero' in nome)
print(10 * '-') # coloca 10 traços
print('vio' not in nome) # procura se 'vio' não esta em nome 
print('zero' not in nome)
# resposta do "in" e "not in" retorna em boolean (True or False)

nome = input('Digite seu nome: ')
encontrar = input('Digite o que deseja encontrar: ')

if encontrar in nome: # O in vê se o valor da variavel "encontrar" esta em nome
    print(f'{encontrar} está em {nome}') # o f' ' serve para colocar variaveis no print
else:
    print(f'{encontrar} não está em {nome}')