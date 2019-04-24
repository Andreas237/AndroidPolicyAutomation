.class final enum Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$15;
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

    .line 296
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

    .line 299
    invoke-static {p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$100(I)I

    move-result v2

    .line 300
    invoke-static {p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$200(I)I

    move-result v8

    .line 301
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->read()I

    move-result p1

    .line 302
    invoke-static {p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$100(I)I

    move-result v9

    .line 303
    invoke-static {p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$200(I)I

    move-result p1

    int-to-byte p1, p1

    .line 304
    new-instance p2, Lcom/google/dexmaker/dx/io/instructions/TwoRegisterDecodedInstruction;

    int-to-long v6, p1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p2

    move-object v1, p0

    invoke-direct/range {v0 .. v9}, Lcom/google/dexmaker/dx/io/instructions/TwoRegisterDecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJII)V

    return-object p2
.end method

.method public encode(Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;Lcom/google/dexmaker/dx/io/instructions/CodeOutput;)V
    .locals 2

    .line 311
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getOpcode()I

    move-result v0

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getA()I

    move-result v1

    invoke-static {v0, v1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$600(II)S

    move-result v0

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getB()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getLiteralByte()I

    move-result p1

    invoke-static {v1, p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->access$600(II)S

    move-result p1

    invoke-interface {p2, v0, p1}, Lcom/google/dexmaker/dx/io/instructions/CodeOutput;->write(SS)V

    return-void
.end method
