.class public Lcom/google/dexmaker/dx/ssa/back/SsaToRop;
.super Ljava/lang/Object;
.source "SsaToRop.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/dexmaker/dx/ssa/back/SsaToRop$PhiVisitor;
    }
.end annotation


# static fields
.field private static final DEBUG:Z = false


# instance fields
.field private final interference:Lcom/google/dexmaker/dx/ssa/back/InterferenceGraph;

.field private final minimizeRegisters:Z

.field private final ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;


# direct methods
.method private constructor <init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;Z)V
    .locals 0

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    iput-boolean p2, p0, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->minimizeRegisters:Z

    .line 82
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    .line 83
    invoke-static {p1}, Lcom/google/dexmaker/dx/ssa/back/LivenessAnalyzer;->constructInterferenceGraph(Lcom/google/dexmaker/dx/ssa/SsaMethod;)Lcom/google/dexmaker/dx/ssa/back/InterferenceGraph;

    move-result-object p1

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->interference:Lcom/google/dexmaker/dx/ssa/back/InterferenceGraph;

    return-void
.end method

.method static synthetic access$000(Lcom/google/dexmaker/dx/ssa/back/SsaToRop;)Lcom/google/dexmaker/dx/ssa/SsaMethod;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    return-object p0
.end method

.method private convert()Lcom/google/dexmaker/dx/rop/code/RopMethod;
    .locals 4

    .line 101
    new-instance v0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;

    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->interference:Lcom/google/dexmaker/dx/ssa/back/InterferenceGraph;

    iget-boolean v3, p0, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->minimizeRegisters:Z

    invoke-direct {v0, v1, v2, v3}, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;-><init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;Lcom/google/dexmaker/dx/ssa/back/InterferenceGraph;Z)V

    .line 105
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/back/RegisterAllocator;->allocateRegisters()Lcom/google/dexmaker/dx/ssa/RegisterMapper;

    move-result-object v1

    .line 112
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->setBackMode()V

    .line 114
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v2, v1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->mapRegisters(Lcom/google/dexmaker/dx/ssa/RegisterMapper;)V

    .line 116
    invoke-direct {p0}, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->removePhiFunctions()V

    .line 118
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/back/RegisterAllocator;->wantsParamsMovedHigh()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 119
    invoke-direct {p0}, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->moveParametersToHighRegisters()V

    .line 122
    :cond_0
    invoke-direct {p0}, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->removeEmptyGotos()V

    .line 124
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/RopMethod;

    invoke-direct {p0}, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->convertBasicBlocks()Lcom/google/dexmaker/dx/rop/code/BasicBlockList;

    move-result-object v1

    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getEntryBlockIndex()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->blockIndexToRopLabel(I)I

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/google/dexmaker/dx/rop/code/RopMethod;-><init>(Lcom/google/dexmaker/dx/rop/code/BasicBlockList;I)V

    .line 126
    new-instance v1, Lcom/google/dexmaker/dx/ssa/back/IdenticalBlockCombiner;

    invoke-direct {v1, v0}, Lcom/google/dexmaker/dx/ssa/back/IdenticalBlockCombiner;-><init>(Lcom/google/dexmaker/dx/rop/code/RopMethod;)V

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/back/IdenticalBlockCombiner;->process()Lcom/google/dexmaker/dx/rop/code/RopMethod;

    move-result-object v0

    return-object v0
.end method

.method private convertBasicBlock(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)Lcom/google/dexmaker/dx/rop/code/BasicBlock;
    .locals 4

    .line 299
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getRopLabelSuccessorList()Lcom/google/dexmaker/dx/util/IntList;

    move-result-object v0

    .line 300
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getPrimarySuccessorRopLabel()I

    move-result v1

    .line 305
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getExitBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v2

    const/4 v3, -0x1

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    .line 306
    :cond_0
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getRopLabel()I

    move-result v2

    .line 308
    :goto_0
    invoke-virtual {v0, v2}, Lcom/google/dexmaker/dx/util/IntList;->contains(I)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 309
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/util/IntList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_1

    .line 314
    sget-object v0, Lcom/google/dexmaker/dx/util/IntList;->EMPTY:Lcom/google/dexmaker/dx/util/IntList;

    .line 317
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->verifyValidExitPredecessor(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V

    move v1, v3

    goto :goto_1

    .line 310
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exit predecessor must have no other successors"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getRopLabel()I

    move-result p1

    invoke-static {p1}, Lcom/google/dexmaker/dx/util/Hex;->u2(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 321
    :cond_2
    :goto_1
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/util/IntList;->setImmutable()V

    .line 323
    new-instance v2, Lcom/google/dexmaker/dx/rop/code/BasicBlock;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getRopLabel()I

    move-result v3

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->convertInsns(Ljava/util/ArrayList;)Lcom/google/dexmaker/dx/rop/code/InsnList;

    move-result-object p1

    invoke-direct {v2, v3, p1, v0, v1}, Lcom/google/dexmaker/dx/rop/code/BasicBlock;-><init>(ILcom/google/dexmaker/dx/rop/code/InsnList;Lcom/google/dexmaker/dx/util/IntList;I)V

    return-object v2
.end method

.method private convertBasicBlocks()Lcom/google/dexmaker/dx/rop/code/BasicBlockList;
    .locals 6

    .line 243
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object v0

    .line 246
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getExitBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v1

    .line 248
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->computeReachability()V

    .line 249
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getCountReachableBlocks()I

    move-result v2

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    .line 252
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->isReachable()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    sub-int/2addr v2, v4

    .line 254
    new-instance v4, Lcom/google/dexmaker/dx/rop/code/BasicBlockList;

    invoke-direct {v4, v2}, Lcom/google/dexmaker/dx/rop/code/BasicBlockList;-><init>(I)V

    .line 258
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 259
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->isReachable()Z

    move-result v5

    if-eqz v5, :cond_1

    if-eq v2, v1, :cond_1

    add-int/lit8 v5, v3, 0x1

    .line 260
    invoke-direct {p0, v2}, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->convertBasicBlock(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)Lcom/google/dexmaker/dx/rop/code/BasicBlock;

    move-result-object v2

    invoke-virtual {v4, v3, v2}, Lcom/google/dexmaker/dx/rop/code/BasicBlockList;->set(ILcom/google/dexmaker/dx/rop/code/BasicBlock;)V

    move v3, v5

    goto :goto_1

    :cond_2
    if-eqz v1, :cond_4

    .line 265
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    .line 266
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Exit block must have no insns when leaving SSA form"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_2
    return-object v4
.end method

.method private convertInsns(Ljava/util/ArrayList;)Lcom/google/dexmaker/dx/rop/code/InsnList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/ssa/SsaInsn;",
            ">;)",
            "Lcom/google/dexmaker/dx/rop/code/InsnList;"
        }
    .end annotation

    .line 338
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 339
    new-instance v1, Lcom/google/dexmaker/dx/rop/code/InsnList;

    invoke-direct {v1, v0}, Lcom/google/dexmaker/dx/rop/code/InsnList;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 342
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->toRopInsn()Lcom/google/dexmaker/dx/rop/code/Insn;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/google/dexmaker/dx/rop/code/InsnList;->set(ILcom/google/dexmaker/dx/rop/code/Insn;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 345
    :cond_0
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/InsnList;->setImmutable()V

    return-object v1
.end method

.method public static convertToRopMethod(Lcom/google/dexmaker/dx/ssa/SsaMethod;Z)Lcom/google/dexmaker/dx/rop/code/RopMethod;
    .locals 1

    .line 70
    new-instance v0, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;

    invoke-direct {v0, p0, p1}, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;-><init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;Z)V

    invoke-direct {v0}, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->convert()Lcom/google/dexmaker/dx/rop/code/RopMethod;

    move-result-object p0

    return-object p0
.end method

.method private moveParametersToHighRegisters()V
    .locals 6

    .line 218
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getParamWidth()I

    move-result v0

    .line 219
    new-instance v1, Lcom/google/dexmaker/dx/ssa/BasicRegisterMapper;

    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getRegCount()I

    move-result v2

    invoke-direct {v1, v2}, Lcom/google/dexmaker/dx/ssa/BasicRegisterMapper;-><init>(I)V

    .line 221
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getRegCount()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    const/4 v4, 0x1

    if-ge v3, v0, :cond_0

    sub-int v5, v2, v0

    add-int/2addr v5, v3

    .line 225
    invoke-virtual {v1, v3, v5, v4}, Lcom/google/dexmaker/dx/ssa/BasicRegisterMapper;->addMapping(III)V

    goto :goto_1

    :cond_0
    sub-int v5, v3, v0

    .line 227
    invoke-virtual {v1, v3, v5, v4}, Lcom/google/dexmaker/dx/ssa/BasicRegisterMapper;->addMapping(III)V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 236
    :cond_1
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->mapRegisters(Lcom/google/dexmaker/dx/ssa/RegisterMapper;)V

    return-void
.end method

.method private removeEmptyGotos()V
    .locals 3

    .line 140
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object v0

    .line 142
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    new-instance v2, Lcom/google/dexmaker/dx/ssa/back/SsaToRop$1;

    invoke-direct {v2, p0, v0}, Lcom/google/dexmaker/dx/ssa/back/SsaToRop$1;-><init>(Lcom/google/dexmaker/dx/ssa/back/SsaToRop;Ljava/util/ArrayList;)V

    const/4 v0, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->forEachBlockDepthFirst(ZLcom/google/dexmaker/dx/ssa/SsaBasicBlock$Visitor;)V

    return-void
.end method

.method private removePhiFunctions()V
    .locals 4

    .line 167
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object v0

    .line 169
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 171
    new-instance v3, Lcom/google/dexmaker/dx/ssa/back/SsaToRop$PhiVisitor;

    invoke-direct {v3, v0}, Lcom/google/dexmaker/dx/ssa/back/SsaToRop$PhiVisitor;-><init>(Ljava/util/ArrayList;)V

    invoke-virtual {v2, v3}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->forEachPhiInsn(Lcom/google/dexmaker/dx/ssa/PhiInsn$Visitor;)V

    .line 174
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->removeAllPhiInsns()V

    goto :goto_0

    .line 181
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 182
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->scheduleMovesFromPhis()V

    goto :goto_1

    :cond_1
    return-void
.end method

.method private verifyValidExitPredecessor(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V
    .locals 2

    .line 281
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object p1

    .line 282
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 283
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object p1

    .line 285
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/Rop;->getBranchingness()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    sget-object v0, Lcom/google/dexmaker/dx/rop/code/Rops;->THROW:Lcom/google/dexmaker/dx/rop/code/Rop;

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 287
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Exit predecessor must end in valid exit statement."

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public getRegistersByFrequency()[I
    .locals 5

    .line 358
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getRegCount()I

    move-result v0

    .line 359
    new-array v1, v0, [Ljava/lang/Integer;

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_0

    .line 362
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 365
    :cond_0
    new-instance v3, Lcom/google/dexmaker/dx/ssa/back/SsaToRop$2;

    invoke-direct {v3, p0}, Lcom/google/dexmaker/dx/ssa/back/SsaToRop$2;-><init>(Lcom/google/dexmaker/dx/ssa/back/SsaToRop;)V

    invoke-static {v1, v3}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 372
    new-array v3, v0, [I

    :goto_1
    if-ge v2, v0, :cond_1

    .line 375
    aget-object v4, v1, v2

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    aput v4, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-object v3
.end method
