package br.pyedoardo.javacon.cpu;

import br.pyedoardo.javacon.mem.Memory;

public final class Cpu {
    private int pc; //contador
    private int a, x, y; //registradores acumuladores
    private int sp; //pontador da stack
    private int status; //registrador de status

    private Memory memoria;

    public Cpu(Memory memoria){
        this.memoria = memoria;
        reset();
    }
    public void reset(){
        pc = 0x0800;
        sp = 0xFD;
        a = 0;
        x = 0;
        y = 0;
        status = 0x24;
    }
    public void executarCiclo(){
        int opcode = Byte.toUnsignedInt(memoria.ler(pc));
        pc++;
        switch(opcode){ //lista de opcodes que o cpu 6502 mos aceita.
            case(0xA9): //LDA Immediate (Load to A)
                a = opcode;
                pc++;
            case(0xA2): //LDX Immediate (Load to X)
                x = opcode;
                pc++;
            case(0xA0): //LDY Immediate (Load to Y)
                y = opcode;
                pc++;


            default:
                throw new IllegalArgumentException("Opcode Desconhecido: " + opcode);
        }
    }
}
