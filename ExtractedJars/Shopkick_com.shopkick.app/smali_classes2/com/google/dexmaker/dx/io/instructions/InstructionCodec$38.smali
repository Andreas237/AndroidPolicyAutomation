.class final enum Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$38;
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

    .line 741
    invoke-direct {p0, p1, p2, v0}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;-><init>(Ljava/lang/String;ILcom/google/dexmaker/dx/io/instructions/InstructionCodec$1;)V

    return-void
.end method


# virtual methods
.method public decode(ILcom/google/dexmaker/dx/io/instructions/CodeInput;)Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/EOFException;
        }
    .end annotation

    .line 744
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->baseAddressForCursor()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 745
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->read()I

    move-result v1

    .line 746
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->readInt()I

    move-result v2

    .line 747
    new-array v3, v1, [I

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_0

    .line 750
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->readInt()I

    move-result v5

    add-int/2addr v5, v0

    aput v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 753
    :cond_0
    new-instance p2, Lcom/google/dexmaker/dx/io/instructions/PackedSwitchPayloadDecodedInstruction;

    invoke-direct {p2, p0, p1, v2, v3}, Lcom/google/dexmaker/dx/io/instructions/PackedSwitchPayloadDecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;II[I)V

    return-object p2
.end method

.method public encode(Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;Lcom/google/dexmaker/dx/io/instructions/CodeOutput;)V
    .locals 4

    .line 758
    check-cast p1, Lcom/google/dexmaker/dx/io/instructions/PackedSwitchPayloadDecodedInstruction;

    .line 760
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/PackedSwitchPayloadDecodedInstruction;->getTargets()[I

    move-result-object v0

    .line 761
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeOutput;->baseAddressForCursor()I

    move-result v1

    .line 763
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/PackedSwitchPayloadDecodedInstruction;->getOpcodeUnit()S

    move-result v2

    invoke-interface {p2, v2}, Lcom/google/dexmaker/dx/io/instructions/CodeOutput;->write(S)V

    .line 764
    array-length v2, v0

    invoke-static {v2}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$1700(I)S

    move-result v2

    invoke-interface {p2, v2}, Lcom/google/dexmaker/dx/io/instructions/CodeOutput;->write(S)V

    .line 765
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/PackedSwitchPayloadDecodedInstruction;->getFirstKey()I

    move-result p1

    invoke-interface {p2, p1}, Lcom/google/dexmaker/dx/io/instructions/CodeOutput;->writeInt(I)V

    .line 767
    array-length p1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    aget v3, v0, v2

    sub-int/2addr v3, v1

    .line 768
    invoke-interface {p2, v3}, Lcom/google/dexmaker/dx/io/instructions/CodeOutput;->writeInt(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
