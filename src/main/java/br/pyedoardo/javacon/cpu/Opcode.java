package br.pyedoardo.javacon.cpu;

public class Opcode {
    private int cycles;
    private int bytes;
    private int opcodeHex;

    public Opcode(int cycles, int bytes, int opcodeHex) {
        this.cycles = cycles;
        this.bytes = bytes;
        this.opcodeHex = opcodeHex;
    }
    //Getters e setters
    public int getCycles() {
        return cycles;
    }

    public void setCycles(int cycles) {
        this.cycles = cycles;
    }

    public int getBytes(){
        return bytes;
    }

    public void setBytes(int bytes){
        this.bytes = bytes;
    }

    public int getOpcodeHex() {
        return opcodeHex;
    }

    public void setOpcodeHex(int opcodeHex) {
        this.opcodeHex = opcodeHex;
    }

    @Override
    public String toString() {
        return getOpcodeHex() + " " + getCycles() + " " + getBytes();
    }
}
