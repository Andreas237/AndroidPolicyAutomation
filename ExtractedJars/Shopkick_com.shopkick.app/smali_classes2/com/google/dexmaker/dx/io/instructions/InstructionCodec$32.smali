.class final enum Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$32;
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

    .line 608
    invoke-direct {p0, p1, p2, v0}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;-><init>(Ljava/lang/String;ILcom/google/dexmaker/dx/io/instructions/InstructionCodec$1;)V

    return-void
.end method


# virtual methods
.method public decode(ILcom/google/dexmaker/dx/io/instructions/CodeInput;)Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/EOFException;
        }
    .end annotation

    .line 611
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->read()I

    move-result v0

    .line 612
    invoke-static {v0}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$100(I)I

    move-result v9

    .line 613
    invoke-static {v0}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$200(I)I

    move-result v10

    .line 614
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->read()I

    move-result v11

    .line 615
    new-instance p2, Lcom/google/dexmaker/dx/io/instructions/ThreeRegisterDecodedInstruction;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    move-object v1, p2

    move-object v2, p0

    move v3, p1

    invoke-direct/range {v1 .. v11}, Lcom/google/dexmaker/dx/io/instructions/ThreeRegisterDecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJIII)V

    return-object p2
.end method

.method public encode(Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;Lcom/google/dexmaker/dx/io/instructions/CodeOutput;)V
    .locals 3

    .line 622
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getOpcodeUnit()S

    move-result v0

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getA()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getB()I

    move-result v2

    invoke-static {v1, v2}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$600(II)S

    move-result v1

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getCUnit()S

    move-result p1

    invoke-interface {p2, v0, v1, p1}, Lcom/google/dexmaker/dx/io/instructions/CodeOutput;->write(SSS)V

    return-void
.end method
