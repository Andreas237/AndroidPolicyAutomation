.class public Lcom/google/dexmaker/dx/ssa/SCCP;
.super Ljava/lang/Object;
.source "SCCP.java"


# static fields
.field private static final CONSTANT:I = 0x1

.field private static final TOP:I = 0x0

.field private static final VARYING:I = 0x2


# instance fields
.field private branchWorklist:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/ssa/SsaInsn;",
            ">;"
        }
    .end annotation
.end field

.field private cfgPhiWorklist:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;",
            ">;"
        }
    .end annotation
.end field

.field private cfgWorklist:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;",
            ">;"
        }
    .end annotation
.end field

.field private executableBlocks:Ljava/util/BitSet;

.field private latticeConstants:[Lcom/google/dexmaker/dx/rop/cst/Constant;

.field private latticeValues:[I

.field private regCount:I

.field private ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

.field private ssaWorklist:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/ssa/SsaInsn;",
            ">;"
        }
    .end annotation
.end field

.field private varyingWorklist:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/ssa/SsaInsn;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V
    .locals 3

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    .line 72
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getRegCount()I

    move-result v0

    iput v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->regCount:I

    .line 73
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->regCount:I

    new-array v1, v0, [I

    iput-object v1, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->latticeValues:[I

    .line 74
    new-array v0, v0, [Lcom/google/dexmaker/dx/rop/cst/Constant;

    iput-object v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->latticeConstants:[Lcom/google/dexmaker/dx/rop/cst/Constant;

    .line 75
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->cfgWorklist:Ljava/util/ArrayList;

    .line 76
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->cfgPhiWorklist:Ljava/util/ArrayList;

    .line 77
    new-instance v0, Ljava/util/BitSet;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-direct {v0, p1}, Ljava/util/BitSet;-><init>(I)V

    iput-object v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->executableBlocks:Ljava/util/BitSet;

    .line 78
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->ssaWorklist:Ljava/util/ArrayList;

    .line 79
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->varyingWorklist:Ljava/util/ArrayList;

    .line 80
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->branchWorklist:Ljava/util/ArrayList;

    const/4 p1, 0x0

    move v0, p1

    .line 81
    :goto_0
    iget v1, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->regCount:I

    if-ge v0, v1, :cond_0

    .line 82
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->latticeValues:[I

    aput p1, v1, v0

    .line 83
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->latticeConstants:[Lcom/google/dexmaker/dx/rop/cst/Constant;

    const/4 v2, 0x0

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private addBlockToWorklist(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V
    .locals 2

    .line 101
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->executableBlocks:Ljava/util/BitSet;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getIndex()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 102
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->cfgWorklist:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->executableBlocks:Ljava/util/BitSet;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getIndex()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->set(I)V

    goto :goto_0

    .line 105
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->cfgPhiWorklist:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method private addUsersToWorklist(II)V
    .locals 1

    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    .line 116
    iget-object p2, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {p2, p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getUseListForRegister(I)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 117
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->varyingWorklist:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 120
    :cond_0
    iget-object p2, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {p2, p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getUseListForRegister(I)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 121
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->ssaWorklist:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    return-void
.end method

.method private static latticeValName(I)Ljava/lang/String;
    .locals 0

    packed-switch p0, :pswitch_data_0

    const-string p0, "UNKNOWN"

    return-object p0

    :pswitch_0
    const-string p0, "VARYING"

    return-object p0

    :pswitch_1
    const-string p0, "CONSTANT"

    return-object p0

    :pswitch_2
    const-string p0, "TOP"

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static process(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V
    .locals 1

    .line 92
    new-instance v0, Lcom/google/dexmaker/dx/ssa/SCCP;

    invoke-direct {v0, p0}, Lcom/google/dexmaker/dx/ssa/SCCP;-><init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    invoke-direct {v0}, Lcom/google/dexmaker/dx/ssa/SCCP;->run()V

    return-void
.end method

.method private replaceBranches()V
    .locals 9

    .line 656
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->branchWorklist:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 659
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v2

    .line 660
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getSuccessorList()Lcom/google/dexmaker/dx/util/IntList;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/util/IntList;->size()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, -0x1

    move v6, v5

    :goto_1
    if-ge v4, v3, :cond_2

    .line 662
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getSuccessorList()Lcom/google/dexmaker/dx/util/IntList;

    move-result-object v7

    invoke-virtual {v7, v4}, Lcom/google/dexmaker/dx/util/IntList;->get(I)I

    move-result v7

    .line 663
    iget-object v8, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->executableBlocks:Ljava/util/BitSet;

    invoke-virtual {v8, v7}, Ljava/util/BitSet;->get(I)Z

    move-result v8

    if-nez v8, :cond_1

    move v6, v7

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x2

    if-ne v3, v4, :cond_0

    if-ne v6, v5, :cond_3

    goto :goto_0

    .line 675
    :cond_3
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getOriginalRopInsn()Lcom/google/dexmaker/dx/rop/code/Insn;

    move-result-object v1

    .line 676
    new-instance v3, Lcom/google/dexmaker/dx/rop/code/PlainInsn;

    sget-object v4, Lcom/google/dexmaker/dx/rop/code/Rops;->GOTO:Lcom/google/dexmaker/dx/rop/code/Rop;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/Insn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v1

    const/4 v5, 0x0

    sget-object v7, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    invoke-direct {v3, v4, v1, v5, v7}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    invoke-virtual {v2, v3}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->replaceLastInsn(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    .line 678
    invoke-virtual {v2, v6}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->removeSuccessor(I)V

    goto :goto_0

    :cond_4
    return-void
.end method

.method private replaceConstants()V
    .locals 6

    const/4 v0, 0x0

    .line 603
    :goto_0
    iget v1, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->regCount:I

    if-ge v0, v1, :cond_5

    .line 604
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->latticeValues:[I

    aget v1, v1, v0

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    goto :goto_2

    .line 607
    :cond_0
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->latticeConstants:[Lcom/google/dexmaker/dx/rop/cst/Constant;

    aget-object v1, v1, v0

    instance-of v1, v1, Lcom/google/dexmaker/dx/rop/cst/TypedConstant;

    if-nez v1, :cond_1

    goto :goto_2

    .line 612
    :cond_1
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v1, v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getDefinitionForRegister(I)Lcom/google/dexmaker/dx/ssa/SsaInsn;

    move-result-object v1

    .line 613
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    move-result-object v2

    .line 615
    invoke-interface {v2}, Lcom/google/dexmaker/dx/rop/type/TypeBearer;->isConstant()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_2

    .line 624
    :cond_2
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    .line 625
    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->latticeConstants:[Lcom/google/dexmaker/dx/rop/cst/Constant;

    aget-object v3, v3, v0

    check-cast v3, Lcom/google/dexmaker/dx/rop/cst/TypedConstant;

    invoke-virtual {v2, v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->withType(Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    .line 627
    invoke-virtual {v1, v2}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->setResult(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    .line 633
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v1, v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getUseListForRegister(I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 634
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->isPhiOrMove()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    .line 638
    :cond_3
    move-object v3, v2

    check-cast v3, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;

    .line 639
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v2

    .line 641
    invoke-virtual {v2, v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->indexOfRegister(I)I

    move-result v4

    .line 643
    invoke-virtual {v2, v4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    .line 644
    iget-object v5, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->latticeConstants:[Lcom/google/dexmaker/dx/rop/cst/Constant;

    aget-object v5, v5, v0

    check-cast v5, Lcom/google/dexmaker/dx/rop/cst/TypedConstant;

    invoke-virtual {v2, v5}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->withType(Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    .line 647
    invoke-virtual {v3, v4, v2}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->changeOneSource(ILcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    goto :goto_1

    :cond_4
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    return-void
.end method

.method private run()V
    .locals 3

    .line 543
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getEntryBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v0

    .line 544
    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/ssa/SCCP;->addBlockToWorklist(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V

    .line 550
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->cfgWorklist:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->cfgPhiWorklist:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->ssaWorklist:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->varyingWorklist:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 593
    :cond_1
    invoke-direct {p0}, Lcom/google/dexmaker/dx/ssa/SCCP;->replaceConstants()V

    .line 594
    invoke-direct {p0}, Lcom/google/dexmaker/dx/ssa/SCCP;->replaceBranches()V

    return-void

    .line 551
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->cfgWorklist:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 552
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->cfgWorklist:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 553
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->cfgWorklist:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 554
    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/ssa/SCCP;->simulateBlock(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V

    goto :goto_0

    .line 557
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->cfgPhiWorklist:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 558
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->cfgPhiWorklist:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 559
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->cfgPhiWorklist:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 560
    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/ssa/SCCP;->simulatePhiBlock(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V

    goto :goto_1

    .line 563
    :cond_4
    :goto_2
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->varyingWorklist:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 564
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->varyingWorklist:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 565
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->varyingWorklist:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 567
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->executableBlocks:Ljava/util/BitSet;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getIndex()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_2

    .line 571
    :cond_5
    instance-of v1, v0, Lcom/google/dexmaker/dx/ssa/PhiInsn;

    if-eqz v1, :cond_6

    .line 572
    check-cast v0, Lcom/google/dexmaker/dx/ssa/PhiInsn;

    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/ssa/SCCP;->simulatePhi(Lcom/google/dexmaker/dx/ssa/PhiInsn;)V

    goto :goto_2

    .line 574
    :cond_6
    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/ssa/SCCP;->simulateStmt(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V

    goto :goto_2

    .line 577
    :cond_7
    :goto_3
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->ssaWorklist:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 578
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->ssaWorklist:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 579
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->ssaWorklist:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 581
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->executableBlocks:Ljava/util/BitSet;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getIndex()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_3

    .line 585
    :cond_8
    instance-of v1, v0, Lcom/google/dexmaker/dx/ssa/PhiInsn;

    if-eqz v1, :cond_9

    .line 586
    check-cast v0, Lcom/google/dexmaker/dx/ssa/PhiInsn;

    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/ssa/SCCP;->simulatePhi(Lcom/google/dexmaker/dx/ssa/PhiInsn;)V

    goto :goto_3

    .line 588
    :cond_9
    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/ssa/SCCP;->simulateStmt(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V

    goto :goto_3
.end method

.method private setLatticeValueTo(IILcom/google/dexmaker/dx/rop/cst/Constant;)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p2, v1, :cond_1

    .line 135
    iget-object p3, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->latticeValues:[I

    aget v2, p3, p1

    if-eq v2, p2, :cond_0

    .line 136
    aput p2, p3, p1

    return v1

    :cond_0
    return v0

    .line 141
    :cond_1
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->latticeValues:[I

    aget v2, v2, p1

    if-ne v2, p2, :cond_3

    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->latticeConstants:[Lcom/google/dexmaker/dx/rop/cst/Constant;

    aget-object v2, v2, p1

    invoke-virtual {v2, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    return v0

    .line 143
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->latticeValues:[I

    aput p2, v0, p1

    .line 144
    iget-object p2, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->latticeConstants:[Lcom/google/dexmaker/dx/rop/cst/Constant;

    aput-object p3, p2, p1

    return v1
.end method

.method private simulateBlock(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V
    .locals 2

    .line 204
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 205
    instance-of v1, v0, Lcom/google/dexmaker/dx/ssa/PhiInsn;

    if-eqz v1, :cond_0

    .line 206
    check-cast v0, Lcom/google/dexmaker/dx/ssa/PhiInsn;

    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/ssa/SCCP;->simulatePhi(Lcom/google/dexmaker/dx/ssa/PhiInsn;)V

    goto :goto_0

    .line 208
    :cond_0
    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/ssa/SCCP;->simulateStmt(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private simulateBranch(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V
    .locals 9

    .line 242
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v0

    .line 243
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v1

    .line 249
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Rop;->getBranchingness()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x4

    if-ne v2, v5, :cond_11

    .line 253
    invoke-virtual {v1, v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    .line 254
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v5

    .line 255
    iget-object v6, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v6, v2}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->isRegALocal(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Z

    move-result v2

    const/4 v6, 0x0

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->latticeValues:[I

    aget v2, v2, v5

    if-ne v2, v4, :cond_0

    .line 257
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->latticeConstants:[Lcom/google/dexmaker/dx/rop/cst/Constant;

    aget-object v2, v2, v5

    goto :goto_0

    :cond_0
    move-object v2, v6

    .line 260
    :goto_0
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v5

    const/4 v7, 0x2

    if-ne v5, v7, :cond_1

    .line 261
    invoke-virtual {v1, v4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v5

    .line 262
    invoke-virtual {v5}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v7

    .line 263
    iget-object v8, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v8, v5}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->isRegALocal(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Z

    move-result v5

    if-nez v5, :cond_1

    iget-object v5, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->latticeValues:[I

    aget v5, v5, v7

    if-ne v5, v4, :cond_1

    .line 265
    iget-object v5, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->latticeConstants:[Lcom/google/dexmaker/dx/rop/cst/Constant;

    aget-object v6, v5, v7

    :cond_1
    const/4 v5, 0x6

    if-eqz v2, :cond_9

    .line 270
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v1

    if-ne v1, v4, :cond_9

    .line 271
    move-object v1, v2

    check-cast v1, Lcom/google/dexmaker/dx/rop/cst/TypedConstant;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/cst/TypedConstant;->getBasicType()I

    move-result v1

    if-eq v1, v5, :cond_2

    move v0, v3

    move v1, v0

    goto/16 :goto_e

    .line 274
    :cond_2
    check-cast v2, Lcom/google/dexmaker/dx/rop/cst/CstInteger;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/cst/CstInteger;->getValue()I

    move-result v1

    .line 275
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Rop;->getOpcode()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 295
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Unexpected op"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    if-lez v1, :cond_3

    move v0, v4

    goto :goto_1

    :cond_3
    move v0, v3

    :goto_1
    move v1, v0

    move v0, v4

    goto/16 :goto_e

    :pswitch_1
    if-gtz v1, :cond_4

    move v0, v4

    goto :goto_2

    :cond_4
    move v0, v3

    :goto_2
    move v1, v0

    move v0, v4

    goto/16 :goto_e

    :pswitch_2
    if-ltz v1, :cond_5

    move v0, v4

    goto :goto_3

    :cond_5
    move v0, v3

    :goto_3
    move v1, v0

    move v0, v4

    goto/16 :goto_e

    :pswitch_3
    if-gez v1, :cond_6

    move v0, v4

    goto :goto_4

    :cond_6
    move v0, v3

    :goto_4
    move v1, v0

    move v0, v4

    goto/16 :goto_e

    :pswitch_4
    if-eqz v1, :cond_7

    move v0, v4

    goto :goto_5

    :cond_7
    move v0, v3

    :goto_5
    move v1, v0

    move v0, v4

    goto/16 :goto_e

    :pswitch_5
    if-nez v1, :cond_8

    move v0, v4

    goto :goto_6

    :cond_8
    move v0, v3

    :goto_6
    move v1, v0

    move v0, v4

    goto/16 :goto_e

    :cond_9
    if-eqz v2, :cond_11

    if-eqz v6, :cond_11

    .line 302
    move-object v1, v2

    check-cast v1, Lcom/google/dexmaker/dx/rop/cst/TypedConstant;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/cst/TypedConstant;->getBasicType()I

    move-result v1

    if-eq v1, v5, :cond_a

    goto/16 :goto_d

    .line 305
    :cond_a
    check-cast v2, Lcom/google/dexmaker/dx/rop/cst/CstInteger;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/cst/CstInteger;->getValue()I

    move-result v1

    .line 306
    check-cast v6, Lcom/google/dexmaker/dx/rop/cst/CstInteger;

    invoke-virtual {v6}, Lcom/google/dexmaker/dx/rop/cst/CstInteger;->getValue()I

    move-result v2

    .line 307
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Rop;->getOpcode()I

    move-result v0

    packed-switch v0, :pswitch_data_1

    .line 327
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Unexpected op"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_6
    if-le v1, v2, :cond_b

    move v0, v4

    goto :goto_7

    :cond_b
    move v0, v3

    :goto_7
    move v1, v0

    move v0, v4

    goto :goto_e

    :pswitch_7
    if-gt v1, v2, :cond_c

    move v0, v4

    goto :goto_8

    :cond_c
    move v0, v3

    :goto_8
    move v1, v0

    move v0, v4

    goto :goto_e

    :pswitch_8
    if-lt v1, v2, :cond_d

    move v0, v4

    goto :goto_9

    :cond_d
    move v0, v3

    :goto_9
    move v1, v0

    move v0, v4

    goto :goto_e

    :pswitch_9
    if-ge v1, v2, :cond_e

    move v0, v4

    goto :goto_a

    :cond_e
    move v0, v3

    :goto_a
    move v1, v0

    move v0, v4

    goto :goto_e

    :pswitch_a
    if-eq v1, v2, :cond_f

    move v0, v4

    goto :goto_b

    :cond_f
    move v0, v3

    :goto_b
    move v1, v0

    move v0, v4

    goto :goto_e

    :pswitch_b
    if-ne v1, v2, :cond_10

    move v0, v4

    goto :goto_c

    :cond_10
    move v0, v3

    :goto_c
    move v1, v0

    move v0, v4

    goto :goto_e

    :cond_11
    :goto_d
    move v0, v3

    move v1, v0

    .line 340
    :goto_e
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v2

    if-eqz v0, :cond_13

    if-eqz v1, :cond_12

    .line 345
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getSuccessorList()Lcom/google/dexmaker/dx/util/IntList;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/google/dexmaker/dx/util/IntList;->get(I)I

    move-result v0

    goto :goto_f

    .line 347
    :cond_12
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getSuccessorList()Lcom/google/dexmaker/dx/util/IntList;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/google/dexmaker/dx/util/IntList;->get(I)I

    move-result v0

    .line 349
    :goto_f
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/ssa/SCCP;->addBlockToWorklist(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V

    .line 350
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->branchWorklist:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_11

    .line 352
    :cond_13
    :goto_10
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getSuccessorList()Lcom/google/dexmaker/dx/util/IntList;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/util/IntList;->size()I

    move-result p1

    if-ge v3, p1, :cond_14

    .line 353
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getSuccessorList()Lcom/google/dexmaker/dx/util/IntList;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/google/dexmaker/dx/util/IntList;->get(I)I

    move-result p1

    .line 354
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/ssa/SCCP;->addBlockToWorklist(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_10

    :cond_14
    :goto_11
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x7
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method

.method private simulateMath(Lcom/google/dexmaker/dx/ssa/SsaInsn;I)Lcom/google/dexmaker/dx/rop/cst/Constant;
    .locals 7

    .line 367
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getOriginalRopInsn()Lcom/google/dexmaker/dx/rop/code/Insn;

    move-result-object v0

    .line 368
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/Rop;->getOpcode()I

    move-result v1

    .line 369
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p1

    const/4 v2, 0x0

    .line 370
    invoke-virtual {p1, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v3

    .line 374
    iget-object v4, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->latticeValues:[I

    aget v4, v4, v3

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v4, v6, :cond_0

    move-object v3, v5

    goto :goto_0

    .line 377
    :cond_0
    iget-object v4, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->latticeConstants:[Lcom/google/dexmaker/dx/rop/cst/Constant;

    aget-object v3, v4, v3

    .line 380
    :goto_0
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v4

    if-ne v4, v6, :cond_1

    .line 381
    check-cast v0, Lcom/google/dexmaker/dx/rop/code/CstInsn;

    .line 382
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/CstInsn;->getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object v0

    goto :goto_1

    .line 384
    :cond_1
    invoke-virtual {p1, v6}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    .line 385
    iget-object v4, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->latticeValues:[I

    aget v4, v4, v0

    if-eq v4, v6, :cond_2

    move-object v0, v5

    goto :goto_1

    .line 388
    :cond_2
    iget-object v4, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->latticeConstants:[Lcom/google/dexmaker/dx/rop/cst/Constant;

    aget-object v0, v4, v0

    :goto_1
    if-eqz v3, :cond_9

    if-nez v0, :cond_3

    goto/16 :goto_4

    :cond_3
    const/4 v4, 0x6

    if-eq p2, v4, :cond_4

    return-object v5

    .line 402
    :cond_4
    check-cast v3, Lcom/google/dexmaker/dx/rop/cst/CstInteger;

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/cst/CstInteger;->getValue()I

    move-result p2

    .line 403
    check-cast v0, Lcom/google/dexmaker/dx/rop/cst/CstInteger;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/cst/CstInteger;->getValue()I

    move-result v0

    packed-switch v1, :pswitch_data_0

    .line 455
    :pswitch_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Unexpected op"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    ushr-int p1, p2, v0

    goto :goto_2

    :pswitch_2
    shr-int p1, p2, v0

    goto :goto_2

    :pswitch_3
    shl-int p1, p2, v0

    goto :goto_2

    :pswitch_4
    xor-int p1, p2, v0

    goto :goto_2

    :pswitch_5
    or-int p1, p2, v0

    goto :goto_2

    :pswitch_6
    and-int p1, p2, v0

    goto :goto_2

    :pswitch_7
    if-nez v0, :cond_5

    move p1, v2

    move v2, v6

    goto :goto_2

    .line 451
    :cond_5
    rem-int p1, p2, v0

    goto :goto_2

    :pswitch_8
    if-nez v0, :cond_6

    move p1, v2

    move v2, v6

    goto :goto_2

    .line 425
    :cond_6
    div-int p1, p2, v0

    goto :goto_2

    :pswitch_9
    mul-int p1, p2, v0

    goto :goto_2

    .line 411
    :pswitch_a
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result p1

    if-ne p1, v6, :cond_7

    sub-int p1, v0, p2

    goto :goto_2

    :cond_7
    sub-int p1, p2, v0

    goto :goto_2

    :pswitch_b
    add-int p1, p2, v0

    :goto_2
    if-eqz v2, :cond_8

    goto :goto_3

    .line 458
    :cond_8
    invoke-static {p1}, Lcom/google/dexmaker/dx/rop/cst/CstInteger;->make(I)Lcom/google/dexmaker/dx/rop/cst/CstInteger;

    move-result-object v5

    :goto_3
    return-object v5

    :cond_9
    :goto_4
    return-object v5

    nop

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private simulatePhi(Lcom/google/dexmaker/dx/ssa/PhiInsn;)V
    .locals 11

    .line 161
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/PhiInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    .line 163
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->latticeValues:[I

    aget v1, v1, v0

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    return-void

    .line 167
    :cond_0
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/PhiInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v1

    const/4 v3, 0x0

    .line 170
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v4

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    if-ge v5, v4, :cond_5

    .line 173
    invoke-virtual {p1, v5}, Lcom/google/dexmaker/dx/ssa/PhiInsn;->predBlockIndexForSourcesIndex(I)I

    move-result v7

    .line 174
    invoke-virtual {v1, v5}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v8

    .line 175
    iget-object v9, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->latticeValues:[I

    aget v9, v9, v8

    .line 177
    iget-object v10, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->executableBlocks:Ljava/util/BitSet;

    invoke-virtual {v10, v7}, Ljava/util/BitSet;->get(I)Z

    move-result v7

    const/4 v10, 0x1

    if-nez v7, :cond_1

    goto :goto_1

    :cond_1
    if-ne v9, v10, :cond_4

    if-nez v3, :cond_2

    .line 183
    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->latticeConstants:[Lcom/google/dexmaker/dx/rop/cst/Constant;

    aget-object v3, v3, v8

    move v6, v10

    goto :goto_1

    .line 185
    :cond_2
    iget-object v7, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->latticeConstants:[Lcom/google/dexmaker/dx/rop/cst/Constant;

    aget-object v7, v7, v8

    invoke-virtual {v7, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    move v2, v9

    goto :goto_2

    :cond_5
    move v2, v6

    .line 194
    :goto_2
    invoke-direct {p0, v0, v2, v3}, Lcom/google/dexmaker/dx/ssa/SCCP;->setLatticeValueTo(IILcom/google/dexmaker/dx/rop/cst/Constant;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 195
    invoke-direct {p0, v0, v2}, Lcom/google/dexmaker/dx/ssa/SCCP;->addUsersToWorklist(II)V

    :cond_6
    return-void
.end method

.method private simulatePhiBlock(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V
    .locals 2

    .line 218
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 219
    instance-of v1, v0, Lcom/google/dexmaker/dx/ssa/PhiInsn;

    if-eqz v1, :cond_0

    .line 220
    check-cast v0, Lcom/google/dexmaker/dx/ssa/PhiInsn;

    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/ssa/SCCP;->simulatePhi(Lcom/google/dexmaker/dx/ssa/PhiInsn;)V

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    return-void
.end method

.method private simulateStmt(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V
    .locals 8

    .line 471
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getOriginalRopInsn()Lcom/google/dexmaker/dx/rop/code/Insn;

    move-result-object v0

    .line 472
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Insn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/Rop;->getBranchingness()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Insn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/Rop;->isCallLike()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 474
    :cond_0
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/ssa/SCCP;->simulateBranch(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V

    .line 477
    :cond_1
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/Rop;->getOpcode()I

    move-result v1

    .line 478
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v3

    const/4 v4, 0x0

    if-nez v3, :cond_4

    const/16 v3, 0x11

    if-eq v1, v3, :cond_3

    const/16 v3, 0x12

    if-ne v1, v3, :cond_2

    goto :goto_0

    :cond_2
    return-void

    .line 483
    :cond_3
    :goto_0
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getPrimarySuccessor()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v3

    .line 484
    invoke-virtual {v3}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v3

    .line 490
    :cond_4
    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    if-eq v1, v7, :cond_8

    const/4 v4, 0x5

    if-eq v1, v4, :cond_7

    const/16 v0, 0x38

    if-eq v1, v0, :cond_6

    packed-switch v1, :pswitch_data_0

    packed-switch v1, :pswitch_data_1

    goto :goto_1

    .line 520
    :pswitch_0
    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getBasicType()I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/google/dexmaker/dx/ssa/SCCP;->simulateMath(Lcom/google/dexmaker/dx/ssa/SsaInsn;I)Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object v6

    if-eqz v6, :cond_5

    goto :goto_2

    :cond_5
    move v2, v7

    goto :goto_2

    .line 527
    :cond_6
    iget-object p1, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->latticeValues:[I

    aget v0, p1, v5

    if-ne v0, v2, :cond_9

    .line 528
    aget v2, p1, v5

    .line 529
    iget-object p1, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->latticeConstants:[Lcom/google/dexmaker/dx/rop/cst/Constant;

    aget-object v6, p1, v5

    goto :goto_2

    .line 496
    :cond_7
    check-cast v0, Lcom/google/dexmaker/dx/rop/code/CstInsn;

    .line 498
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/CstInsn;->getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object v6

    goto :goto_2

    .line 502
    :cond_8
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v0

    if-ne v0, v2, :cond_9

    .line 503
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p1

    invoke-virtual {p1, v4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result p1

    .line 504
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->latticeValues:[I

    aget v2, v0, p1

    .line 505
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SCCP;->latticeConstants:[Lcom/google/dexmaker/dx/rop/cst/Constant;

    aget-object v6, v0, p1

    goto :goto_2

    :cond_9
    :goto_1
    move v2, v7

    .line 537
    :goto_2
    invoke-direct {p0, v5, v2, v6}, Lcom/google/dexmaker/dx/ssa/SCCP;->setLatticeValueTo(IILcom/google/dexmaker/dx/rop/cst/Constant;)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 538
    invoke-direct {p0, v5, v2}, Lcom/google/dexmaker/dx/ssa/SCCP;->addUsersToWorklist(II)V

    :cond_a
    return-void

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x14
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
