.class final enum Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$31;
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

    .line 585
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

    .line 588
    invoke-static {p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$100(I)I

    move-result v2

    .line 589
    invoke-static {p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$200(I)I

    move-result v8

    .line 590
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->readLong()J

    move-result-wide v6

    .line 591
    new-instance p1, Lcom/google/dexmaker/dx/io/instructions/OneRegisterDecodedInstruction;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    move-object v1, p0

    invoke-direct/range {v0 .. v8}, Lcom/google/dexmaker/dx/io/instructions/OneRegisterDecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJI)V

    return-object p1
.end method

.method public encode(Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;Lcom/google/dexmaker/dx/io/instructions/CodeOutput;)V
    .locals 9

    .line 598
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getLiteral()J

    move-result-wide v0

    .line 599
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getOpcode()I

    move-result v2

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getA()I

    move-result p1

    invoke-static {v2, p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$600(II)S

    move-result v4

    invoke-static {v0, v1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$1300(J)S

    move-result v5

    invoke-static {v0, v1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$1400(J)S

    move-result v6

    invoke-static {v0, v1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$1500(J)S

    move-result v7

    invoke-static {v0, v1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$1600(J)S

    move-result v8

    move-object v3, p2

    invoke-interface/range {v3 .. v8}, Lcom/google/dexmaker/dx/io/instructions/CodeOutput;->write(SSSSS)V

    return-void
.end method
