#python teste.py
import sys
import os
os.system("clear")

iplit = raw_input("Endereco de ip: ")
bitint = input("Numero de bits da mascara: ")
ipint = iplit.split('.')


if int(ipint[0]) <=127: #classe A
  while (bitint < 8 or bitint > 30):
    bitint = input("Numero de bits invalido escreva novamente: ")

if int(ipint[0]) >127 and int(ipint[0]) <=191: #Classe B
  while (bitint < 16 or bitint > 30):
    bitint = input("Numero de bits invalido escreva novamente: ")

if int(ipint[0]) >191 and int(ipint[0]) <=223: #Classe C
    while (bitint < 24 or bitint > 30):
      bitint = input("Numero de bits invalido escreva novamente: ")

mask = [0, 0, 0, 0]
for i in range(bitint):
    mask[i/8] = mask[i/8] + (1 << (7 - i % 8))


rede = []
for i in range(4):
    rede.append(int(ipint[i]) & mask[i])


broad = list(rede)
brange = 32 - bitint

for i in range(brange):
    broad[3 - i/8] = broad[3 - i/8] + (1 << (i % 8))


host = 2 ** brange - 2

print "Tabela de  Sub-Redes"
print 'Resultados:..............'
print "Endereco: " , iplit
print "Mascara: " , ".".join(map(str, mask))
print "Rede: " , ".".join(map(str, rede))
print "Faixa de ips usaveis por subrede: " , host
print "Broadcast: " , ".".join(map(str, broad))

if int(ipint[0]) <=127:
    print ("Classe..: A")
if int(ipint[0]) >127 and int(ipint[0]) <=191:
        print ("Classe..: B")
if int(ipint[0]) >191 and int(ipint[0]) <=223:
    print ("Classe..: C")
   

#Tabela de subredes

 
if (bitint >=24 and bitint <=30):
    print "\n-------------- Sub-Redes --------------"
    while (broad[3]<=255):
        print "Rede: " , ".".join(map(str, rede))
        print '\n'
        rede[3]=rede[3] + 1
        print  ".".join(map(str, rede)),"<== Primeira Rede Util"
        broad[3] = broad[3] -1
        print  ".".join(map(str, broad)),"<== Ultima Rede Util";
        print '\n'
        broad[3] = broad[3] +1
        print "Broadcast: " , ".".join(map(str, broad))
        rede[3] = (rede[3] -1 ) + 2 ** (32 - bitint) 
        broad[3] = (broad[3]) + 2 ** (32 - bitint) 
        print "---------------------------------------"
