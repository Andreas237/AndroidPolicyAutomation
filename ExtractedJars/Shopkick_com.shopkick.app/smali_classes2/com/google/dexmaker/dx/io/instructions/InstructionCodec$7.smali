.class final enum Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$7;
.super Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;
.source "InstructionCodec.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4008
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 131
    invoke-direct {p0, p1, p2, v0}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;-><init>(Ljava/lang/String;ILcom/google/dexmaker/dx/io/instructions/InstructionCodec$1;)V

    return-void
.end method


# virtual methods
.method public decode(ILcom/google/dexmaker/dx/io/instructions/CodeInput;)Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/EOFException;
        }
    .end annotation

    .line 134
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->cursor()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 135
    invoke-static {p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$100(I)I

    move-result v3

    .line 136
    invoke-static {p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$200(I)I

    move-result p1

    .line 137
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->read()I

    move-result p2

    int-to-short p2, p2

    .line 138
    new-instance v9, Lcom/google/dexmaker/dx/io/instructions/ZeroRegisterDecodedInstruction;

    add-int v6, v0, p2

    int-to-long v7, p1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, v9

    move-object v2, p0

    invoke-direct/range {v1 .. v8}, Lcom/google/dexmaker/dx/io/instructions/ZeroRegisterDecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJ)V

    return-object v9
.end method

.method public encode(Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;Lcom/google/dexmaker/dx/io/instructions/CodeOutput;)V
    .locals 1

    .line 144
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeOutput;->cursor()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getTargetUnit(I)S

    move-result v0

    .line 145
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getOpcodeUnit()S

    move-result p1

    invoke-interface {p2, p1, v0}, Lcom/google/dexmaker/dx/io/instructions/CodeOutput;->write(SS)V

    return-void
.end method
