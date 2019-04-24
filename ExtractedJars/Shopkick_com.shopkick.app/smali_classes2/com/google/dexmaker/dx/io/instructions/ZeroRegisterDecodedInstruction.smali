.class public final Lcom/google/dexmaker/dx/io/instructions/ZeroRegisterDecodedInstruction;
.super Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;
.source "ZeroRegisterDecodedInstruction.java"


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJ)V
    .locals 0

    .line 30
    invoke-direct/range {p0 .. p7}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJ)V

    return-void
.end method


# virtual methods
.method public getRegisterCount()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public withIndex(I)Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;
    .locals 9

    .line 40
    new-instance v8, Lcom/google/dexmaker/dx/io/instructions/ZeroRegisterDecodedInstruction;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/ZeroRegisterDecodedInstruction;->getFormat()Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/ZeroRegisterDecodedInstruction;->getOpcode()I

    move-result v2

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/ZeroRegisterDecodedInstruction;->getIndexType()Lcom/google/dexmaker/dx/io/IndexType;

    move-result-object v4

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/ZeroRegisterDecodedInstruction;->getTarget()I

    move-result v5

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/ZeroRegisterDecodedInstruction;->getLiteral()J

    move-result-wide v6

    move-object v0, v8

    move v3, p1

    invoke-direct/range {v0 .. v7}, Lcom/google/dexmaker/dx/io/instructions/ZeroRegisterDecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJ)V

    return-object v8
.end method
