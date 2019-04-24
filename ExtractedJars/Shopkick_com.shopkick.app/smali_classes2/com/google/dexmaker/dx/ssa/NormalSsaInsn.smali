.class public final Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;
.super Lcom/google/dexmaker/dx/ssa/SsaInsn;
.source "NormalSsaInsn.java"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field private insn:Lcom/google/dexmaker/dx/rop/code/Insn;


# direct methods
.method constructor <init>(Lcom/google/dexmaker/dx/rop/code/Insn;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V
    .locals 1

    .line 35
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/Insn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/google/dexmaker/dx/ssa/SsaInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V

    .line 36
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->insn:Lcom/google/dexmaker/dx/rop/code/Insn;

    return-void
.end method


# virtual methods
.method public accept(Lcom/google/dexmaker/dx/ssa/SsaInsn$Visitor;)V
    .locals 1

    .line 198
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->isNormalMoveInsn()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 199
    invoke-interface {p1, p0}, Lcom/google/dexmaker/dx/ssa/SsaInsn$Visitor;->visitMoveInsn(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)V

    goto :goto_0

    .line 201
    :cond_0
    invoke-interface {p1, p0}, Lcom/google/dexmaker/dx/ssa/SsaInsn$Visitor;->visitNonMoveInsn(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)V

    :goto_0
    return-void
.end method

.method public canThrow()Z
    .locals 1

    .line 192
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->insn:Lcom/google/dexmaker/dx/rop/code/Insn;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Insn;->canThrow()Z

    move-result v0

    return v0
.end method

.method public final changeOneSource(ILcom/google/dexmaker/dx/rop/code/RegisterSpec;)V
    .locals 5

    .line 59
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->insn:Lcom/google/dexmaker/dx/rop/code/Insn;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Insn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    .line 60
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v1

    .line 61
    new-instance v2, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    invoke-direct {v2, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    if-ne v3, p1, :cond_0

    move-object v4, p2

    goto :goto_1

    .line 64
    :cond_0
    invoke-virtual {v0, v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v4

    :goto_1
    invoke-virtual {v2, v3, v4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->set(ILcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 67
    :cond_1
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->setImmutable()V

    .line 69
    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    .line 70
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v1

    if-eq v0, v1, :cond_2

    .line 75
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getParent()Lcom/google/dexmaker/dx/ssa/SsaMethod;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->onSourceChanged(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    .line 78
    :cond_2
    iget-object p1, p0, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->insn:Lcom/google/dexmaker/dx/rop/code/Insn;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p2

    invoke-virtual {p1, p2, v2}, Lcom/google/dexmaker/dx/rop/code/Insn;->withNewRegisters(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)Lcom/google/dexmaker/dx/rop/code/Insn;

    move-result-object p1

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->insn:Lcom/google/dexmaker/dx/rop/code/Insn;

    return-void
.end method

.method public clone()Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;
    .locals 1

    .line 100
    invoke-super {p0}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->clone()Lcom/google/dexmaker/dx/ssa/SsaInsn;

    move-result-object v0

    check-cast v0, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/dexmaker/dx/ssa/SsaInsn;
    .locals 1

    .line 24
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->clone()Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 24
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->clone()Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;

    move-result-object v0

    return-object v0
.end method

.method public getLocalAssignment()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;
    .locals 3

    .line 143
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->insn:Lcom/google/dexmaker/dx/rop/code/Insn;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Insn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Rop;->getOpcode()I

    move-result v0

    const/16 v1, 0x36

    if-ne v0, v1, :cond_0

    .line 144
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->insn:Lcom/google/dexmaker/dx/rop/code/Insn;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Insn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    goto :goto_0

    .line 146
    :cond_0
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    :goto_0
    const/4 v1, 0x0

    if-nez v0, :cond_1

    return-object v1

    .line 153
    :cond_1
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/google/dexmaker/dx/rop/code/LocalItem;

    move-result-object v2

    if-nez v2, :cond_2

    return-object v1

    :cond_2
    return-object v0
.end method

.method public getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;
    .locals 1

    .line 129
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->insn:Lcom/google/dexmaker/dx/rop/code/Insn;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Insn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v0

    return-object v0
.end method

.method public getOriginalRopInsn()Lcom/google/dexmaker/dx/rop/code/Insn;
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->insn:Lcom/google/dexmaker/dx/rop/code/Insn;

    return-object v0
.end method

.method public getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->insn:Lcom/google/dexmaker/dx/rop/code/Insn;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Insn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    return-object v0
.end method

.method public hasSideEffect()Z
    .locals 4

    .line 218
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v0

    .line 220
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Rop;->getBranchingness()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    return v2

    .line 224
    :cond_0
    invoke-static {}, Lcom/google/dexmaker/dx/ssa/Optimizer;->getPreserveLocals()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getLocalAssignment()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v1

    if-eqz v1, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 227
    :goto_0
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Rop;->getOpcode()I

    move-result v0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    const/4 v3, 0x5

    if-eq v0, v3, :cond_2

    const/16 v3, 0x37

    if-eq v0, v3, :cond_2

    return v2

    :cond_2
    return v1
.end method

.method public isMoveException()Z
    .locals 2

    .line 186
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->insn:Lcom/google/dexmaker/dx/rop/code/Insn;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Insn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Rop;->getOpcode()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isNormalMoveInsn()Z
    .locals 2

    .line 180
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->insn:Lcom/google/dexmaker/dx/rop/code/Insn;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Insn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Rop;->getOpcode()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isPhiOrMove()Z
    .locals 1

    .line 208
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->isNormalMoveInsn()Z

    move-result v0

    return v0
.end method

.method public final mapSourceRegisters(Lcom/google/dexmaker/dx/ssa/RegisterMapper;)V
    .locals 3

    .line 42
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->insn:Lcom/google/dexmaker/dx/rop/code/Insn;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Insn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    .line 43
    invoke-virtual {p1, v0}, Lcom/google/dexmaker/dx/ssa/RegisterMapper;->map(Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p1

    if-eq p1, v0, :cond_0

    .line 46
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->insn:Lcom/google/dexmaker/dx/rop/code/Insn;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Lcom/google/dexmaker/dx/rop/code/Insn;->withNewRegisters(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)Lcom/google/dexmaker/dx/rop/code/Insn;

    move-result-object p1

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->insn:Lcom/google/dexmaker/dx/rop/code/Insn;

    .line 47
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getParent()Lcom/google/dexmaker/dx/ssa/SsaMethod;

    move-result-object p1

    invoke-virtual {p1, p0, v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->onSourcesChanged(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    :cond_0
    return-void
.end method

.method public final setNewSources(Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V
    .locals 2

    .line 88
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->insn:Lcom/google/dexmaker/dx/rop/code/Insn;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Insn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    .line 90
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v0

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 94
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->insn:Lcom/google/dexmaker/dx/rop/code/Insn;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/google/dexmaker/dx/rop/code/Insn;->withNewRegisters(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)Lcom/google/dexmaker/dx/rop/code/Insn;

    move-result-object p1

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->insn:Lcom/google/dexmaker/dx/rop/code/Insn;

    return-void

    .line 91
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Sources counts don\'t match"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toHuman()Ljava/lang/String;
    .locals 1

    .line 115
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->toRopInsn()Lcom/google/dexmaker/dx/rop/code/Insn;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Insn;->toHuman()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toRopInsn()Lcom/google/dexmaker/dx/rop/code/Insn;
    .locals 3

    .line 121
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->insn:Lcom/google/dexmaker/dx/rop/code/Insn;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v1

    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->insn:Lcom/google/dexmaker/dx/rop/code/Insn;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/Insn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/dexmaker/dx/rop/code/Insn;->withNewRegisters(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)Lcom/google/dexmaker/dx/rop/code/Insn;

    move-result-object v0

    return-object v0
.end method

.method public upgradeToLiteral()V
    .locals 2

    .line 169
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->insn:Lcom/google/dexmaker/dx/rop/code/Insn;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Insn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    .line 171
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->insn:Lcom/google/dexmaker/dx/rop/code/Insn;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/Insn;->withSourceLiteral()Lcom/google/dexmaker/dx/rop/code/Insn;

    move-result-object v1

    iput-object v1, p0, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->insn:Lcom/google/dexmaker/dx/rop/code/Insn;

    .line 172
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getParent()Lcom/google/dexmaker/dx/ssa/SsaMethod;

    move-result-object v1

    invoke-virtual {v1, p0, v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->onSourcesChanged(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    return-void
.end method
