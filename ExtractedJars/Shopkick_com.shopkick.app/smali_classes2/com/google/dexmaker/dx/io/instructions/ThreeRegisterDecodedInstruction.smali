.class public final Lcom/google/dexmaker/dx/io/instructions/ThreeRegisterDecodedInstruction;
.super Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;
.source "ThreeRegisterDecodedInstruction.java"


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJIII)V
    .locals 0

    .line 40
    invoke-direct/range {p0 .. p7}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJ)V

    .line 42
    iput p8, p0, Lcom/google/dexmaker/dx/io/instructions/ThreeRegisterDecodedInstruction;->a:I

    .line 43
    iput p9, p0, Lcom/google/dexmaker/dx/io/instructions/ThreeRegisterDecodedInstruction;->b:I

    .line 44
    iput p10, p0, Lcom/google/dexmaker/dx/io/instructions/ThreeRegisterDecodedInstruction;->c:I

    return-void
.end method


# virtual methods
.method public getA()I
    .locals 1

    .line 54
    iget v0, p0, Lcom/google/dexmaker/dx/io/instructions/ThreeRegisterDecodedInstruction;->a:I

    return v0
.end method

.method public getB()I
    .locals 1

    .line 59
    iget v0, p0, Lcom/google/dexmaker/dx/io/instructions/ThreeRegisterDecodedInstruction;->b:I

    return v0
.end method

.method public getC()I
    .locals 1

    .line 64
    iget v0, p0, Lcom/google/dexmaker/dx/io/instructions/ThreeRegisterDecodedInstruction;->c:I

    return v0
.end method

.method public getRegisterCount()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public withIndex(I)Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;
    .locals 12

    .line 69
    new-instance v11, Lcom/google/dexmaker/dx/io/instructions/ThreeRegisterDecodedInstruction;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/ThreeRegisterDecodedInstruction;->getFormat()Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/ThreeRegisterDecodedInstruction;->getOpcode()I

    move-result v2

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/ThreeRegisterDecodedInstruction;->getIndexType()Lcom/google/dexmaker/dx/io/IndexType;

    move-result-object v4

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/ThreeRegisterDecodedInstruction;->getTarget()I

    move-result v5

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/ThreeRegisterDecodedInstruction;->getLiteral()J

    move-result-wide v6

    iget v8, p0, Lcom/google/dexmaker/dx/io/instructions/ThreeRegisterDecodedInstruction;->a:I

    iget v9, p0, Lcom/google/dexmaker/dx/io/instructions/ThreeRegisterDecodedInstruction;->b:I

    iget v10, p0, Lcom/google/dexmaker/dx/io/instructions/ThreeRegisterDecodedInstruction;->c:I

    move-object v0, v11

    move v3, p1

    invoke-direct/range {v0 .. v10}, Lcom/google/dexmaker/dx/io/instructions/ThreeRegisterDecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJIII)V

    return-object v11
.end method
