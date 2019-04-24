.class final enum Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$23;
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

    .line 463
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

    .line 466
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->cursor()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 467
    invoke-static {p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$100(I)I

    move-result v3

    .line 468
    invoke-static {p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$200(I)I

    move-result v9

    .line 469
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->readInt()I

    move-result p1

    add-int v6, v0, p1

    packed-switch v3, :pswitch_data_0

    goto :goto_0

    .line 478
    :pswitch_0
    invoke-interface {p2, v6, v0}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->setBaseAddress(II)V

    .line 483
    :goto_0
    new-instance p1, Lcom/google/dexmaker/dx/io/instructions/OneRegisterDecodedInstruction;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v7, 0x0

    move-object v1, p1

    move-object v2, p0

    invoke-direct/range {v1 .. v9}, Lcom/google/dexmaker/dx/io/instructions/OneRegisterDecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJI)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x2b
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public encode(Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;Lcom/google/dexmaker/dx/io/instructions/CodeOutput;)V
    .locals 2

    .line 490
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeOutput;->cursor()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getTarget(I)I

    move-result v0

    .line 491
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getOpcode()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getA()I

    move-result p1

    invoke-static {v1, p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$600(II)S

    move-result p1

    invoke-static {v0}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$700(I)S

    move-result v1

    invoke-static {v0}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$800(I)S

    move-result v0

    invoke-interface {p2, p1, v1, v0}, Lcom/google/dexmaker/dx/io/instructions/CodeOutput;->write(SSS)V

    return-void
.end method
