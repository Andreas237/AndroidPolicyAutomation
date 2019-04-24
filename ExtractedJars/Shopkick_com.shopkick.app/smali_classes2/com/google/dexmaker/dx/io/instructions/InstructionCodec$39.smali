.class final enum Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$39;
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

    .line 773
    invoke-direct {p0, p1, p2, v0}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;-><init>(Ljava/lang/String;ILcom/google/dexmaker/dx/io/instructions/InstructionCodec$1;)V

    return-void
.end method


# virtual methods
.method public decode(ILcom/google/dexmaker/dx/io/instructions/CodeInput;)Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/EOFException;
        }
    .end annotation

    .line 776
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->baseAddressForCursor()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 777
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->read()I

    move-result v1

    .line 778
    new-array v2, v1, [I

    .line 779
    new-array v3, v1, [I

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v1, :cond_0

    .line 782
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->readInt()I

    move-result v6

    aput v6, v2, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-ge v4, v1, :cond_1

    .line 786
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->readInt()I

    move-result v5

    add-int/2addr v5, v0

    aput v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 789
    :cond_1
    new-instance p2, Lcom/google/dexmaker/dx/io/instructions/SparseSwitchPayloadDecodedInstruction;

    invoke-direct {p2, p0, p1, v2, v3}, Lcom/google/dexmaker/dx/io/instructions/SparseSwitchPayloadDecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;I[I[I)V

    return-object p2
.end method

.method public encode(Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;Lcom/google/dexmaker/dx/io/instructions/CodeOutput;)V
    .locals 6

    .line 794
    check-cast p1, Lcom/google/dexmaker/dx/io/instructions/SparseSwitchPayloadDecodedInstruction;

    .line 796
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/SparseSwitchPayloadDecodedInstruction;->getKeys()[I

    move-result-object v0

    .line 797
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/SparseSwitchPayloadDecodedInstruction;->getTargets()[I

    move-result-object v1

    .line 798
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeOutput;->baseAddressForCursor()I

    move-result v2

    .line 800
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/SparseSwitchPayloadDecodedInstruction;->getOpcodeUnit()S

    move-result p1

    invoke-interface {p2, p1}, Lcom/google/dexmaker/dx/io/instructions/CodeOutput;->write(S)V

    .line 801
    array-length p1, v1

    invoke-static {p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$1700(I)S

    move-result p1

    invoke-interface {p2, p1}, Lcom/google/dexmaker/dx/io/instructions/CodeOutput;->write(S)V

    .line 803
    array-length p1, v0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, p1, :cond_0

    aget v5, v0, v4

    .line 804
    invoke-interface {p2, v5}, Lcom/google/dexmaker/dx/io/instructions/CodeOutput;->writeInt(I)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 807
    :cond_0
    array-length p1, v1

    :goto_1
    if-ge v3, p1, :cond_1

    aget v0, v1, v3

    sub-int/2addr v0, v2

    .line 808
    invoke-interface {p2, v0}, Lcom/google/dexmaker/dx/io/instructions/CodeOutput;->writeInt(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method
