.class final enum Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$22;
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

    .line 442
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

    .line 445
    invoke-static {p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$100(I)I

    move-result v2

    .line 446
    invoke-static {p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$200(I)I

    move-result v8

    .line 447
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->readInt()I

    move-result p1

    .line 448
    new-instance p2, Lcom/google/dexmaker/dx/io/instructions/OneRegisterDecodedInstruction;

    int-to-long v6, p1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p2

    move-object v1, p0

    invoke-direct/range {v0 .. v8}, Lcom/google/dexmaker/dx/io/instructions/OneRegisterDecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJI)V

    return-object p2
.end method

.method public encode(Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;Lcom/google/dexmaker/dx/io/instructions/CodeOutput;)V
    .locals 2

    .line 455
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getLiteralInt()I

    move-result v0

    .line 456
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
