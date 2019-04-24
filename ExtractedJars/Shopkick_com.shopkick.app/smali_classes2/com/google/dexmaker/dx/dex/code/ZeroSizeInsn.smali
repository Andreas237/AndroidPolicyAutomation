.class public abstract Lcom/google/dexmaker/dx/dex/code/ZeroSizeInsn;
.super Lcom/google/dexmaker/dx/dex/code/DalvInsn;
.source "ZeroSizeInsn.java"


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/rop/code/SourcePosition;)V
    .locals 2

    .line 36
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/Dops;->SPECIAL_FORMAT:Lcom/google/dexmaker/dx/dex/code/Dop;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    invoke-direct {p0, v0, p1, v1}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;-><init>(Lcom/google/dexmaker/dx/dex/code/Dop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    return-void
.end method


# virtual methods
.method public final codeSize()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final withOpcode(Lcom/google/dexmaker/dx/dex/code/Dop;)Lcom/google/dexmaker/dx/dex/code/DalvInsn;
    .locals 1

    .line 54
    new-instance p1, Ljava/lang/RuntimeException;

    const-string/jumbo v0, "unsupported"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public withRegisterOffset(I)Lcom/google/dexmaker/dx/dex/code/DalvInsn;
    .locals 1

    .line 60
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/ZeroSizeInsn;->getRegisters()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->withOffset(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/dex/code/ZeroSizeInsn;->withRegisters(Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)Lcom/google/dexmaker/dx/dex/code/DalvInsn;

    move-result-object p1

    return-object p1
.end method

.method public final writeTo(Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V
    .locals 0

    return-void
.end method
