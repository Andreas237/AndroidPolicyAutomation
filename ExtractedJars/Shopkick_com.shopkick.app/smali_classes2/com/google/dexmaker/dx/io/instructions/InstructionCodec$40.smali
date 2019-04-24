.class final enum Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$40;
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

    .line 813
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

    .line 816
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->read()I

    move-result v0

    .line 817
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->readInt()I

    move-result v1

    const/4 v2, 0x4

    const/4 v3, 0x0

    if-eq v0, v2, :cond_5

    const/16 v2, 0x8

    if-eq v0, v2, :cond_3

    packed-switch v0, :pswitch_data_0

    .line 859
    new-instance p1, Lcom/google/dexmaker/dx/util/DexException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bogus element_width: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lcom/google/dexmaker/dx/util/Hex;->u2(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/google/dexmaker/dx/util/DexException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 834
    :pswitch_0
    new-array v0, v1, [S

    :goto_0
    if-ge v3, v1, :cond_0

    .line 836
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->read()I

    move-result v2

    int-to-short v2, v2

    aput-short v2, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 838
    :cond_0
    new-instance p2, Lcom/google/dexmaker/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;

    invoke-direct {p2, p0, p1, v0}, Lcom/google/dexmaker/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;I[S)V

    return-object p2

    .line 821
    :pswitch_1
    new-array v0, v1, [B

    const/4 v4, 0x1

    move v5, v3

    :goto_1
    if-ge v3, v1, :cond_2

    if-eqz v4, :cond_1

    .line 825
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->read()I

    move-result v5

    :cond_1
    and-int/lit16 v6, v5, 0xff

    int-to-byte v6, v6

    .line 827
    aput-byte v6, v0, v3

    shr-int/2addr v5, v2

    add-int/lit8 v3, v3, 0x1

    xor-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 830
    :cond_2
    new-instance p2, Lcom/google/dexmaker/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;

    invoke-direct {p2, p0, p1, v0}, Lcom/google/dexmaker/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;I[B)V

    return-object p2

    .line 850
    :cond_3
    new-array v0, v1, [J

    :goto_2
    if-ge v3, v1, :cond_4

    .line 852
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->readLong()J

    move-result-wide v4

    aput-wide v4, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 854
    :cond_4
    new-instance p2, Lcom/google/dexmaker/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;

    invoke-direct {p2, p0, p1, v0}, Lcom/google/dexmaker/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;I[J)V

    return-object p2

    .line 842
    :cond_5
    new-array v0, v1, [I

    :goto_3
    if-ge v3, v1, :cond_6

    .line 844
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->readInt()I

    move-result v2

    aput v2, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 846
    :cond_6
    new-instance p2, Lcom/google/dexmaker/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;

    invoke-direct {p2, p0, p1, v0}, Lcom/google/dexmaker/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;I[I)V

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public encode(Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;Lcom/google/dexmaker/dx/io/instructions/CodeOutput;)V
    .locals 3

    .line 864
    check-cast p1, Lcom/google/dexmaker/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;

    .line 866
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;->getElementWidthUnit()S

    move-result v0

    .line 867
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;->getData()Ljava/lang/Object;

    move-result-object v1

    .line 869
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;->getOpcodeUnit()S

    move-result v2

    invoke-interface {p2, v2}, Lcom/google/dexmaker/dx/io/instructions/CodeOutput;->write(S)V

    .line 870
    invoke-interface {p2, v0}, Lcom/google/dexmaker/dx/io/instructions/CodeOutput;->write(S)V

    .line 871
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;->getSize()I

    move-result p1

    invoke-interface {p2, p1}, Lcom/google/dexmaker/dx/io/instructions/CodeOutput;->writeInt(I)V

    const/4 p1, 0x4

    if-eq v0, p1, :cond_1

    const/16 p1, 0x8

    if-eq v0, p1, :cond_0

    packed-switch v0, :pswitch_data_0

    .line 879
    new-instance p1, Lcom/google/dexmaker/dx/util/DexException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bogus element_width: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lcom/google/dexmaker/dx/util/Hex;->u2(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/google/dexmaker/dx/util/DexException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 875
    :pswitch_0
    check-cast v1, [S

    invoke-interface {p2, v1}, Lcom/google/dexmaker/dx/io/instructions/CodeOutput;->write([S)V

    goto :goto_0

    .line 874
    :pswitch_1
    check-cast v1, [B

    invoke-interface {p2, v1}, Lcom/google/dexmaker/dx/io/instructions/CodeOutput;->write([B)V

    goto :goto_0

    .line 877
    :cond_0
    check-cast v1, [J

    invoke-interface {p2, v1}, Lcom/google/dexmaker/dx/io/instructions/CodeOutput;->write([J)V

    goto :goto_0

    .line 876
    :cond_1
    check-cast v1, [I

    invoke-interface {p2, v1}, Lcom/google/dexmaker/dx/io/instructions/CodeOutput;->write([I)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
