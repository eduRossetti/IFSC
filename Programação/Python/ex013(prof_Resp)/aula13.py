velocidade = int(input('Digite a sua velocidade numero inteiro: '))
# velocidade atual do carro
local_carro = int(input('Digite o seu local em numero inteiro: '))  
# local em que o carro está na estrada

RADAR_1 = 60  # velocidade máxima do radar 1
LOCAL_1 = 100  # local onde o radar 1 está
RADAR_RANGE = 1  # A distância onde o radar pega

Vel_carro_no_radar_1 = velocidade > RADAR_1  # retornam True ou False
carro_esta_no_radar_1 = local_carro >= (LOCAL_1 - RADAR_RANGE) and \
local_carro <= (LOCAL_1 + RADAR_RANGE)
carro_multado_radar_1 = carro_esta_no_radar_1 and Vel_carro_no_radar_1
# a barra invertida ali no meio é para poder quebrar uma linha e
# continuar o codigo ser dar erro

if Vel_carro_no_radar_1:
    print('Velocidade do carro é maior do que a permitida')
else:
    print('Velocidade do carro esta dentro do limite')

if carro_esta_no_radar_1 == True:
    print('Carro passou radar 1')

if carro_multado_radar_1 == True:
    print('Carro multado em radar 1')
else:
    print('carro passou sem multas')