.class public abstract Lcom/google/dexmaker/dx/ssa/SsaInsn;
.super Ljava/lang/Object;
.source "SsaInsn.java"

# interfaces
.implements Lcom/google/dexmaker/dx/util/ToHuman;
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/dexmaker/dx/ssa/SsaInsn$Visitor;
    }
.end annotation


# instance fields
.field private final block:Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

.field private result:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;


# direct methods
.method protected constructor <init>(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    .line 44
    iput-object p2, p0, Lcom/google/dexmaker/dx/ssa/SsaInsn;->block:Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 45
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/SsaInsn;->result:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    return-void

    .line 41
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "block == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static makeFromRop(Lcom/google/dexmaker/dx/rop/code/Insn;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)Lcom/google/dexmaker/dx/ssa/SsaInsn;
    .locals 1

    .line 56
    new-instance v0, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;

    invoke-direct {v0, p0, p1}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Insn;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V

    return-object v0
.end method


# virtual methods
.method public abstract accept(Lcom/google/dexmaker/dx/ssa/SsaInsn$Visitor;)V
.end method

.method public abstract canThrow()Z
.end method

.method public changeResultReg(I)V
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaInsn;->result:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    if-eqz v0, :cond_0

    .line 127
    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->withReg(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/SsaInsn;->result:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    :cond_0
    return-void
.end method

.method public clone()Lcom/google/dexmaker/dx/ssa/SsaInsn;
    .locals 3

    .line 63
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/dexmaker/dx/ssa/SsaInsn;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 65
    new-instance v1, Ljava/lang/RuntimeException;

    const-string/jumbo v2, "unexpected"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 25
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->clone()Lcom/google/dexmaker/dx/ssa/SsaInsn;

    move-result-object v0

    return-object v0
.end method

.method public getBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaInsn;->block:Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    return-object v0
.end method

.method public getLocalAssignment()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;
    .locals 1

    .line 197
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaInsn;->result:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/google/dexmaker/dx/rop/code/LocalItem;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 198
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaInsn;->result:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;
.end method

.method public abstract getOriginalRopInsn()Lcom/google/dexmaker/dx/rop/code/Insn;
.end method

.method public getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaInsn;->result:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    return-object v0
.end method

.method public abstract getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;
.end method

.method public abstract hasSideEffect()Z
.end method

.method public isMoveException()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isNormalMoveInsn()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract isPhiOrMove()Z
.end method

.method public isRegASource(I)Z
    .locals 1

    .line 212
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->specForRegister(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isResultReg(I)Z
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaInsn;->result:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final mapRegisters(Lcom/google/dexmaker/dx/ssa/RegisterMapper;)V
    .locals 2

    .line 153
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaInsn;->result:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    .line 155
    invoke-virtual {p1, v0}, Lcom/google/dexmaker/dx/ssa/RegisterMapper;->map(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v1

    iput-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaInsn;->result:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    .line 156
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaInsn;->block:Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getParent()Lcom/google/dexmaker/dx/ssa/SsaMethod;

    move-result-object v1

    invoke-virtual {v1, p0, v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->updateOneDefinition(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    .line 157
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->mapSourceRegisters(Lcom/google/dexmaker/dx/ssa/RegisterMapper;)V

    return-void
.end method

.method public abstract mapSourceRegisters(Lcom/google/dexmaker/dx/ssa/RegisterMapper;)V
.end method

.method protected setResult(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 88
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/SsaInsn;->result:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    return-void

    .line 85
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "result == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setResultLocal(Lcom/google/dexmaker/dx/rop/code/LocalItem;)V
    .locals 2

    .line 138
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaInsn;->result:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/google/dexmaker/dx/rop/code/LocalItem;

    move-result-object v0

    if-eq p1, v0, :cond_1

    if-eqz p1, :cond_0

    .line 140
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaInsn;->result:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/google/dexmaker/dx/rop/code/LocalItem;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/dexmaker/dx/rop/code/LocalItem;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 142
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaInsn;->result:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaInsn;->result:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->makeLocalOptional(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/code/LocalItem;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/SsaInsn;->result:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    :cond_1
    return-void
.end method

.method public abstract toRopInsn()Lcom/google/dexmaker/dx/rop/code/Insn;
.end method
