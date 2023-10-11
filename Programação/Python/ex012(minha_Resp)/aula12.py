"""
CONSTANTE = "Variáveis" que não vão mudar
Muitas condições no mesmo if (ruim)
    <- Contagem de complexidade (ruim)
"""
velocidade = int(input('Digite a sua velocidade numero inteiro: '))
# velocidade atual do carro
local_carro = int(input('Digite o seu local em numero inteiro: '))  
# local em que o carro está na estrada

RADAR_1 = 60  # velocidade máxima do radar 1
LOCAL_1 = 100  # local onde o radar 1 está
RADAR_RANGE = 1  # A distância onde o radar pega

if velocidade > RADAR_1+6 and (local_carro == LOCAL_1) or (local_carro == LOCAL_1 + RADAR_RANGE) or (local_carro == LOCAL_1 - RADAR_RANGE):
    print('Vc tomou uma multa de Excesso de velocidade')
else:
    print('Ta de boa os tira nn chegaram em vc')