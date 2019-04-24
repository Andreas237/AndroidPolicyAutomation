.class public final Lcom/google/dexmaker/dx/io/instructions/FourRegisterDecodedInstruction;
.super Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;
.source "FourRegisterDecodedInstruction.java"


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:I


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJIIII)V
    .locals 0

    .line 43
    invoke-direct/range {p0 .. p7}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJ)V

    .line 45
    iput p8, p0, Lcom/google/dexmaker/dx/io/instructions/FourRegisterDecodedInstruction;->a:I

    .line 46
    iput p9, p0, Lcom/google/dexmaker/dx/io/instructions/FourRegisterDecodedInstruction;->b:I

    .line 47
    iput p10, p0, Lcom/google/dexmaker/dx/io/instructions/FourRegisterDecodedInstruction;->c:I

    .line 48
    iput p11, p0, Lcom/google/dexmaker/dx/io/instructions/FourRegisterDecodedInstruction;->d:I

    return-void
.end method


# virtual methods
.method public getA()I
    .locals 1

    .line 58
    iget v0, p0, Lcom/google/dexmaker/dx/io/instructions/FourRegisterDecodedInstruction;->a:I

    return v0
.end method

.method public getB()I
    .locals 1

    .line 63
    iget v0, p0, Lcom/google/dexmaker/dx/io/instructions/FourRegisterDecodedInstruction;->b:I

    return v0
.end method

.method public getC()I
    .locals 1

    .line 68
    iget v0, p0, Lcom/google/dexmaker/dx/io/instructions/FourRegisterDecodedInstruction;->c:I

    return v0
.end method

.method public getD()I
    .locals 1

    .line 73
    iget v0, p0, Lcom/google/dexmaker/dx/io/instructions/FourRegisterDecodedInstruction;->d:I

    return v0
.end method

.method public getRegisterCount()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public withIndex(I)Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;
    .locals 13

    .line 78
    new-instance v12, Lcom/google/dexmaker/dx/io/instructions/FourRegisterDecodedInstruction;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/FourRegisterDecodedInstruction;->getFormat()Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/FourRegisterDecodedInstruction;->getOpcode()I

    move-result v2

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/FourRegisterDecodedInstruction;->getIndexType()Lcom/google/dexmaker/dx/io/IndexType;

    move-result-object v4

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/FourRegisterDecodedInstruction;->getTarget()I

    move-result v5

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/FourRegisterDecodedInstruction;->getLiteral()J

    move-result-wide v6

    iget v8, p0, Lcom/google/dexmaker/dx/io/instructions/FourRegisterDecodedInstruction;->a:I

    iget v9, p0, Lcom/google/dexmaker/dx/io/instructions/FourRegisterDecodedInstruction;->b:I

    iget v10, p0, Lcom/google/dexmaker/dx/io/instructions/FourRegisterDecodedInstruction;->c:I

    iget v11, p0, Lcom/google/dexmaker/dx/io/instructions/FourRegisterDecodedInstruction;->d:I

    move-object v0, v12

    move v3, p1

    invoke-direct/range {v0 .. v11}, Lcom/google/dexmaker/dx/io/instructions/FourRegisterDecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJIIII)V

    return-object v12
.end method
