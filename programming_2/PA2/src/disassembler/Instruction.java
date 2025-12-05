package disassembler;

/**
 * Instruction class represents a single instruction in the disassembler.
 * It contains information about the instruction type, label, value, and other properties.
 */
public class Instruction {
    private int count;
    private String type;
    private String label;
    private int val;
    private boolean branchTaken;
    private int branchTarget;
    private String printedInstruction;


    public Instruction(int val, int count) {
        this.count = count;
        this.val = val;
        this.type = "";
        this.label = "";
        this.branchTaken = false;
        this.branchTarget = 0;
        this.printedInstruction = "";
    }

    public int getCount() {
        return count;
    }
    public String getLabel() {
       return label;
    }
    public void setLabel(int count) {
        this.label = "label" + count;
    }
    public int getVal() {
        return val;
    }
    public void setBranchTarget(int target) {
        this.branchTarget = target;
    }
    public int getBranchTarget() {
        return branchTarget;
    }
    public String getPrintedInstruction() {
        return printedInstruction;
    }
    public void setPrintedInstruction(String printedInstruction) {
        this.printedInstruction = printedInstruction;
    }
    public void setBranchTaken(boolean taken) {
        this.branchTaken = taken;
    }
}