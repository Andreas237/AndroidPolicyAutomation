.class public final Lcom/google/dexmaker/dx/io/instructions/FiveRegisterDecodedInstruction;
.super Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;
.source "FiveRegisterDecodedInstruction.java"


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:I


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJIIIII)V
    .locals 0

    .line 46
    invoke-direct/range {p0 .. p7}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJ)V

    .line 48
    iput p8, p0, Lcom/google/dexmaker/dx/io/instructions/FiveRegisterDecodedInstruction;->a:I

    .line 49
    iput p9, p0, Lcom/google/dexmaker/dx/io/instructions/FiveRegisterDecodedInstruction;->b:I

    .line 50
    iput p10, p0, Lcom/google/dexmaker/dx/io/instructions/FiveRegisterDecodedInstruction;->c:I

    .line 51
    iput p11, p0, Lcom/google/dexmaker/dx/io/instructions/FiveRegisterDecodedInstruction;->d:I

    .line 52
    iput p12, p0, Lcom/google/dexmaker/dx/io/instructions/FiveRegisterDecodedInstruction;->e:I

    return-void
.end method


# virtual methods
.method public getA()I
    .locals 1

    .line 62
    iget v0, p0, Lcom/google/dexmaker/dx/io/instructions/FiveRegisterDecodedInstruction;->a:I

    return v0
.end method

.method public getB()I
    .locals 1

    .line 67
    iget v0, p0, Lcom/google/dexmaker/dx/io/instructions/FiveRegisterDecodedInstruction;->b:I

    return v0
.end method

.method public getC()I
    .locals 1

    .line 72
    iget v0, p0, Lcom/google/dexmaker/dx/io/instructions/FiveRegisterDecodedInstruction;->c:I

    return v0
.end method

.method public getD()I
    .locals 1

    .line 77
    iget v0, p0, Lcom/google/dexmaker/dx/io/instructions/FiveRegisterDecodedInstruction;->d:I

    return v0
.end method

.method public getE()I
    .locals 1

    .line 82
    iget v0, p0, Lcom/google/dexmaker/dx/io/instructions/FiveRegisterDecodedInstruction;->e:I

    return v0
.end method

.method public getRegisterCount()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method

.method public withIndex(I)Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;
    .locals 14

    .line 87
    new-instance v13, Lcom/google/dexmaker/dx/io/instructions/FiveRegisterDecodedInstruction;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/FiveRegisterDecodedInstruction;->getFormat()Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/FiveRegisterDecodedInstruction;->getOpcode()I

    move-result v2

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/FiveRegisterDecodedInstruction;->getIndexType()Lcom/google/dexmaker/dx/io/IndexType;

    move-result-object v4

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/FiveRegisterDecodedInstruction;->getTarget()I

    move-result v5

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/FiveRegisterDecodedInstruction;->getLiteral()J

    move-result-wide v6

    iget v8, p0, Lcom/google/dexmaker/dx/io/instructions/FiveRegisterDecodedInstruction;->a:I

    iget v9, p0, Lcom/google/dexmaker/dx/io/instructions/FiveRegisterDecodedInstruction;->b:I

    iget v10, p0, Lcom/google/dexmaker/dx/io/instructions/FiveRegisterDecodedInstruction;->c:I

    iget v11, p0, Lcom/google/dexmaker/dx/io/instructions/FiveRegisterDecodedInstruction;->d:I

    iget v12, p0, Lcom/google/dexmaker/dx/io/instructions/FiveRegisterDecodedInstruction;->e:I

    move-object v0, v13

    move v3, p1

    invoke-direct/range {v0 .. v12}, Lcom/google/dexmaker/dx/io/instructions/FiveRegisterDecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJIIIII)V

    return-object v13
.end method
