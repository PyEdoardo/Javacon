package br.pyedoardo.javacon.mem;

public class Memory {
    private byte[] ram = new byte[0x0800];
    private byte[] prgRom;

    public void lerRom(byte[] prgRom){
        this.prgRom = prgRom;
    }
    public byte ler(int endereco){
        if (endereco < 0x0800){
            return ram[endereco & 0x07FF];
        }
        else if (endereco >= 0x0800){
            return prgRom[endereco - 0x0800];
        }
        return 0; //devo adicionar mais mapeamento de hardware aqui.
    }
    public void escrever(int endereco, byte valor){
        if (endereco < 0x0800){
            ram[endereco & 0x07FF] = valor;
        }
        //adicionar mais escrita em mais locais da memoria.
    }
}
