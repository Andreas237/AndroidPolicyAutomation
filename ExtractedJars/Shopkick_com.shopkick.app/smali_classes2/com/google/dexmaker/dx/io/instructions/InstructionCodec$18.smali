.class final enum Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$18;
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

    .line 362
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

    .line 365
    invoke-static {p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$100(I)I

    move-result v2

    .line 366
    invoke-static {p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$300(I)I

    move-result v8

    .line 367
    invoke-static {p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$400(I)I

    move-result v9

    .line 368
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->read()I

    move-result v3

    .line 369
    invoke-static {v2}, Lcom/google/dexmaker/dx/io/OpcodeInfo;->getIndexType(I)Lcom/google/dexmaker/dx/io/IndexType;

    move-result-object v4

    .line 370
    new-instance p1, Lcom/google/dexmaker/dx/io/instructions/TwoRegisterDecodedInstruction;

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    move-object v0, p1

    move-object v1, p0

    invoke-direct/range {v0 .. v9}, Lcom/google/dexmaker/dx/io/instructions/TwoRegisterDecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJII)V

    return-object p1
.end method

.method public encode(Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;Lcom/google/dexmaker/dx/io/instructions/CodeOutput;)V
    .locals 3

    .line 377
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getOpcode()I

    move-result v0

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getA()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getB()I

    move-result v2

    invoke-static {v1, v2}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$500(II)I

    move-result v1

    invoke-static {v0, v1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$600(II)S

    move-result v0

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getIndexUnit()S

    move-result p1

    invoke-interface {p2, v0, p1}, Lcom/google/dexmaker/dx/io/instructions/CodeOutput;->write(SS)V

    return-void
.end method
