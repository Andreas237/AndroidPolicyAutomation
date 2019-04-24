.class public final Lcom/google/dexmaker/dx/io/instructions/RegisterRangeDecodedInstruction;
.super Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;
.source "RegisterRangeDecodedInstruction.java"


# instance fields
.field private final a:I

.field private final registerCount:I


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJII)V
    .locals 0

    .line 38
    invoke-direct/range {p0 .. p7}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJ)V

    .line 40
    iput p8, p0, Lcom/google/dexmaker/dx/io/instructions/RegisterRangeDecodedInstruction;->a:I

    .line 41
    iput p9, p0, Lcom/google/dexmaker/dx/io/instructions/RegisterRangeDecodedInstruction;->registerCount:I

    return-void
.end method


# virtual methods
.method public getA()I
    .locals 1

    .line 51
    iget v0, p0, Lcom/google/dexmaker/dx/io/instructions/RegisterRangeDecodedInstruction;->a:I

    return v0
.end method

.method public getRegisterCount()I
    .locals 1

    .line 46
    iget v0, p0, Lcom/google/dexmaker/dx/io/instructions/RegisterRangeDecodedInstruction;->registerCount:I

    return v0
.end method

.method public withIndex(I)Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;
    .locals 11

    .line 56
    new-instance v10, Lcom/google/dexmaker/dx/io/instructions/RegisterRangeDecodedInstruction;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/RegisterRangeDecodedInstruction;->getFormat()Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/RegisterRangeDecodedInstruction;->getOpcode()I

    move-result v2

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/RegisterRangeDecodedInstruction;->getIndexType()Lcom/google/dexmaker/dx/io/IndexType;

    move-result-object v4

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/RegisterRangeDecodedInstruction;->getTarget()I

    move-result v5

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/RegisterRangeDecodedInstruction;->getLiteral()J

    move-result-wide v6

    iget v8, p0, Lcom/google/dexmaker/dx/io/instructions/RegisterRangeDecodedInstruction;->a:I

    iget v9, p0, Lcom/google/dexmaker/dx/io/instructions/RegisterRangeDecodedInstruction;->registerCount:I

    move-object v0, v10

    move v3, p1

    invoke-direct/range {v0 .. v9}, Lcom/google/dexmaker/dx/io/instructions/RegisterRangeDecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJII)V

    return-object v10
.end method
