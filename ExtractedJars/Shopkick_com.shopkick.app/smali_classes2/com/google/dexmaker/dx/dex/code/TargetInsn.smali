.class public final Lcom/google/dexmaker/dx/dex/code/TargetInsn;
.super Lcom/google/dexmaker/dx/dex/code/FixedSizeInsn;
.source "TargetInsn.java"


# instance fields
.field private target:Lcom/google/dexmaker/dx/dex/code/CodeAddress;


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/dex/code/Dop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/dex/code/CodeAddress;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1, p2, p3}, Lcom/google/dexmaker/dx/dex/code/FixedSizeInsn;-><init>(Lcom/google/dexmaker/dx/dex/code/Dop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    if-eqz p4, :cond_0

    .line 49
    iput-object p4, p0, Lcom/google/dexmaker/dx/dex/code/TargetInsn;->target:Lcom/google/dexmaker/dx/dex/code/CodeAddress;

    return-void

    .line 46
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo p2, "target == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method protected argString()Ljava/lang/String;
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/code/TargetInsn;->target:Lcom/google/dexmaker/dx/dex/code/CodeAddress;

    if-nez v0, :cond_0

    const-string v0, "????"

    return-object v0

    .line 130
    :cond_0
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/code/CodeAddress;->identifierString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTarget()Lcom/google/dexmaker/dx/dex/code/CodeAddress;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/code/TargetInsn;->target:Lcom/google/dexmaker/dx/dex/code/CodeAddress;

    return-object v0
.end method

.method public getTargetAddress()I
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/code/TargetInsn;->target:Lcom/google/dexmaker/dx/dex/code/CodeAddress;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/code/CodeAddress;->getAddress()I

    move-result v0

    return v0
.end method

.method public getTargetOffset()I
    .locals 2

    .line 110
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/code/TargetInsn;->target:Lcom/google/dexmaker/dx/dex/code/CodeAddress;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/code/CodeAddress;->getAddress()I

    move-result v0

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/TargetInsn;->getAddress()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public hasTargetOffset()Z
    .locals 1

    .line 120
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/TargetInsn;->hasAddress()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/code/TargetInsn;->target:Lcom/google/dexmaker/dx/dex/code/CodeAddress;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/code/CodeAddress;->hasAddress()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public withNewTargetAndReversed(Lcom/google/dexmaker/dx/dex/code/CodeAddress;)Lcom/google/dexmaker/dx/dex/code/TargetInsn;
    .locals 4

    .line 75
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/TargetInsn;->getOpcode()Lcom/google/dexmaker/dx/dex/code/Dop;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/code/Dop;->getOppositeTest()Lcom/google/dexmaker/dx/dex/code/Dop;

    move-result-object v0

    .line 77
    new-instance v1, Lcom/google/dexmaker/dx/dex/code/TargetInsn;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/TargetInsn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/TargetInsn;->getRegisters()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v3

    invoke-direct {v1, v0, v2, v3, p1}, Lcom/google/dexmaker/dx/dex/code/TargetInsn;-><init>(Lcom/google/dexmaker/dx/dex/code/Dop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/dex/code/CodeAddress;)V

    return-object v1
.end method

.method public withOpcode(Lcom/google/dexmaker/dx/dex/code/Dop;)Lcom/google/dexmaker/dx/dex/code/DalvInsn;
    .locals 4

    .line 55
    new-instance v0, Lcom/google/dexmaker/dx/dex/code/TargetInsn;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/TargetInsn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/TargetInsn;->getRegisters()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v2

    iget-object v3, p0, Lcom/google/dexmaker/dx/dex/code/TargetInsn;->target:Lcom/google/dexmaker/dx/dex/code/CodeAddress;

    invoke-direct {v0, p1, v1, v2, v3}, Lcom/google/dexmaker/dx/dex/code/TargetInsn;-><init>(Lcom/google/dexmaker/dx/dex/code/Dop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/dex/code/CodeAddress;)V

    return-object v0
.end method

.method public withRegisters(Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)Lcom/google/dexmaker/dx/dex/code/DalvInsn;
    .locals 4

    .line 61
    new-instance v0, Lcom/google/dexmaker/dx/dex/code/TargetInsn;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/TargetInsn;->getOpcode()Lcom/google/dexmaker/dx/dex/code/Dop;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/TargetInsn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v2

    iget-object v3, p0, Lcom/google/dexmaker/dx/dex/code/TargetInsn;->target:Lcom/google/dexmaker/dx/dex/code/CodeAddress;

    invoke-direct {v0, v1, v2, p1, v3}, Lcom/google/dexmaker/dx/dex/code/TargetInsn;-><init>(Lcom/google/dexmaker/dx/dex/code/Dop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/dex/code/CodeAddress;)V

    return-object v0
.end method
