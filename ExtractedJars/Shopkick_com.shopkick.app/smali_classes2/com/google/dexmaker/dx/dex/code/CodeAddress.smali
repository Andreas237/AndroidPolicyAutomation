.class public final Lcom/google/dexmaker/dx/dex/code/CodeAddress;
.super Lcom/google/dexmaker/dx/dex/code/ZeroSizeInsn;
.source "CodeAddress.java"


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/rop/code/SourcePosition;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/dex/code/ZeroSizeInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/SourcePosition;)V

    return-void
.end method


# virtual methods
.method protected argString()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected listingString0(Z)Ljava/lang/String;
    .locals 0

    const-string p1, "code-address"

    return-object p1
.end method

.method public final withRegisters(Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)Lcom/google/dexmaker/dx/dex/code/DalvInsn;
    .locals 1

    .line 43
    new-instance p1, Lcom/google/dexmaker/dx/dex/code/CodeAddress;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/CodeAddress;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/google/dexmaker/dx/dex/code/CodeAddress;-><init>(Lcom/google/dexmaker/dx/rop/code/SourcePosition;)V

    return-object p1
.end method
