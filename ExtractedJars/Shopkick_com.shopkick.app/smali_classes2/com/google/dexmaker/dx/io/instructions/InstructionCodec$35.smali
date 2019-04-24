.class final enum Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$35;
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

    .line 671
    invoke-direct {p0, p1, p2, v0}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;-><init>(Ljava/lang/String;ILcom/google/dexmaker/dx/io/instructions/InstructionCodec$1;)V

    return-void
.end method


# virtual methods
.method public decode(ILcom/google/dexmaker/dx/io/instructions/CodeInput;)Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/EOFException;
        }
    .end annotation

    .line 674
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->readInt()I

    move-result v3

    .line 675
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->read()I

    move-result v8

    .line 676
    invoke-static {p1}, Lcom/google/dexmaker/dx/io/OpcodeInfo;->getIndexType(I)Lcom/google/dexmaker/dx/io/IndexType;

    move-result-object v4

    .line 677
    new-instance p2, Lcom/google/dexmaker/dx/io/instructions/OneRegisterDecodedInstruction;

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    move-object v0, p2

    move-object v1, p0

    move v2, p1

    invoke-direct/range {v0 .. v8}, Lcom/google/dexmaker/dx/io/instructions/OneRegisterDecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJI)V

    return-object p2
.end method

.method public encode(Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;Lcom/google/dexmaker/dx/io/instructions/CodeOutput;)V
    .locals 3

    .line 684
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getIndex()I

    move-result v0

    .line 685
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getOpcodeUnit()S

    move-result v1

    invoke-static {v0}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$700(I)S

    move-result v2

    invoke-static {v0}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$800(I)S

    move-result v0

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getAUnit()S

    move-result p1

    invoke-interface {p2, v1, v2, v0, p1}, Lcom/google/dexmaker/dx/io/instructions/CodeOutput;->write(SSSS)V

    return-void
.end method
