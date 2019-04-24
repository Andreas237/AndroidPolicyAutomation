.class public final Lcom/google/dexmaker/dx/dex/code/SimpleInsn;
.super Lcom/google/dexmaker/dx/dex/code/FixedSizeInsn;
.source "SimpleInsn.java"


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/dex/code/Dop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2, p3}, Lcom/google/dexmaker/dx/dex/code/FixedSizeInsn;-><init>(Lcom/google/dexmaker/dx/dex/code/Dop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    return-void
.end method


# virtual methods
.method protected argString()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public withOpcode(Lcom/google/dexmaker/dx/dex/code/Dop;)Lcom/google/dexmaker/dx/dex/code/DalvInsn;
    .locals 3

    .line 45
    new-instance v0, Lcom/google/dexmaker/dx/dex/code/SimpleInsn;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/SimpleInsn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/SimpleInsn;->getRegisters()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v2

    invoke-direct {v0, p1, v1, v2}, Lcom/google/dexmaker/dx/dex/code/SimpleInsn;-><init>(Lcom/google/dexmaker/dx/dex/code/Dop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    return-object v0
.end method

.method public withRegisters(Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)Lcom/google/dexmaker/dx/dex/code/DalvInsn;
    .locals 3

    .line 51
    new-instance v0, Lcom/google/dexmaker/dx/dex/code/SimpleInsn;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/SimpleInsn;->getOpcode()Lcom/google/dexmaker/dx/dex/code/Dop;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/SimpleInsn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v2

    invoke-direct {v0, v1, v2, p1}, Lcom/google/dexmaker/dx/dex/code/SimpleInsn;-><init>(Lcom/google/dexmaker/dx/dex/code/Dop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    return-object v0
.end method
