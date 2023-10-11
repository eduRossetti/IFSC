nome = 'Luiz'
preco = 1000.95897643
                                # mostra as variaveis que vão aparecer nos porcentos
variavel = '%s, o preço é R$%.2f' % (nome, preco) 
#           string          mostra o float com 2 casas decimais
print(variavel)
print('O hexadecimal de %d é %08X' % (1500, 1500))

# Os percentos são lá do 'C' %s(string) %f(float) %d(int) e o novo que é hexadecimal 
# %x ou %X(para aparecer maiusculo ou minusculo)