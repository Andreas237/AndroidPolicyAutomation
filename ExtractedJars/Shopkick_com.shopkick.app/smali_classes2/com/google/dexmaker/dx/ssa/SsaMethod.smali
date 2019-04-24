.class public final Lcom/google/dexmaker/dx/ssa/SsaMethod;
.super Ljava/lang/Object;
.source "SsaMethod.java"


# instance fields
.field private backMode:Z

.field private blocks:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;",
            ">;"
        }
    .end annotation
.end field

.field private borrowedSpareRegisters:I

.field private definitionList:[Lcom/google/dexmaker/dx/ssa/SsaInsn;

.field private entryBlockIndex:I

.field private exitBlockIndex:I

.field private final isStatic:Z

.field private maxLabel:I

.field private final paramWidth:I

.field private registerCount:I

.field private spareRegisterBase:I

.field private unmodifiableUseList:[Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/List<",
            "Lcom/google/dexmaker/dx/ssa/SsaInsn;",
            ">;"
        }
    .end annotation
.end field

.field private useList:[Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/ssa/SsaInsn;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/dexmaker/dx/rop/code/RopMethod;IZ)V
    .locals 0

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 120
    iput p2, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->paramWidth:I

    .line 121
    iput-boolean p3, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->isStatic:Z

    const/4 p2, 0x0

    .line 122
    iput-boolean p2, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->backMode:Z

    .line 123
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RopMethod;->getBlocks()Lcom/google/dexmaker/dx/rop/code/BasicBlockList;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/BasicBlockList;->getMaxLabel()I

    move-result p2

    iput p2, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->maxLabel:I

    .line 124
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RopMethod;->getBlocks()Lcom/google/dexmaker/dx/rop/code/BasicBlockList;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/BasicBlockList;->getRegCount()I

    move-result p1

    iput p1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->registerCount:I

    .line 125
    iget p1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->registerCount:I

    iput p1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->spareRegisterBase:I

    return-void
.end method

.method static synthetic access$000(Lcom/google/dexmaker/dx/ssa/SsaMethod;)[Lcom/google/dexmaker/dx/ssa/SsaInsn;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->definitionList:[Lcom/google/dexmaker/dx/ssa/SsaInsn;

    return-object p0
.end method

.method static synthetic access$100(Lcom/google/dexmaker/dx/ssa/SsaMethod;)[Ljava/util/ArrayList;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    return-object p0
.end method

.method static bitSetFromLabelList(Lcom/google/dexmaker/dx/rop/code/BasicBlockList;Lcom/google/dexmaker/dx/util/IntList;)Ljava/util/BitSet;
    .locals 4

    .line 138
    new-instance v0, Ljava/util/BitSet;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/BasicBlockList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    .line 140
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/util/IntList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 141
    invoke-virtual {p1, v2}, Lcom/google/dexmaker/dx/util/IntList;->get(I)I

    move-result v3

    invoke-virtual {p0, v3}, Lcom/google/dexmaker/dx/rop/code/BasicBlockList;->indexOfLabel(I)I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/util/BitSet;->set(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private buildUseList()V
    .locals 4

    .line 442
    iget-boolean v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->backMode:Z

    if-nez v0, :cond_2

    .line 446
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->registerCount:I

    new-array v0, v0, [Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    const/4 v0, 0x0

    move v1, v0

    .line 448
    :goto_0
    iget v2, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->registerCount:I

    if-ge v1, v2, :cond_0

    .line 449
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 452
    :cond_0
    new-instance v1, Lcom/google/dexmaker/dx/ssa/SsaMethod$2;

    invoke-direct {v1, p0}, Lcom/google/dexmaker/dx/ssa/SsaMethod$2;-><init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    invoke-virtual {p0, v1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->forEachInsn(Lcom/google/dexmaker/dx/ssa/SsaInsn$Visitor;)V

    .line 479
    iget v1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->registerCount:I

    new-array v1, v1, [Ljava/util/List;

    iput-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->unmodifiableUseList:[Ljava/util/List;

    .line 481
    :goto_1
    iget v1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->registerCount:I

    if-ge v0, v1, :cond_1

    .line 482
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->unmodifiableUseList:[Ljava/util/List;

    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    aget-object v2, v2, v0

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-void

    .line 443
    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "No use list in back mode"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private convertRopToSsaBlocks(Lcom/google/dexmaker/dx/rop/code/RopMethod;)V
    .locals 4

    .line 168
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RopMethod;->getBlocks()Lcom/google/dexmaker/dx/rop/code/BasicBlockList;

    move-result-object v0

    .line 169
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/BasicBlockList;->size()I

    move-result v0

    .line 171
    new-instance v1, Ljava/util/ArrayList;

    add-int/lit8 v2, v0, 0x2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 174
    invoke-static {p1, v1, p0}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->newFromRop(Lcom/google/dexmaker/dx/rop/code/RopMethod;ILcom/google/dexmaker/dx/ssa/SsaMethod;)Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v2

    .line 175
    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 179
    :cond_0
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RopMethod;->getBlocks()Lcom/google/dexmaker/dx/rop/code/BasicBlockList;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RopMethod;->getFirstLabel()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/rop/code/BasicBlockList;->indexOfLabel(I)I

    move-result p1

    .line 182
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insertNewPredecessor()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object p1

    .line 185
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getIndex()I

    move-result p1

    iput p1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->entryBlockIndex:I

    const/4 p1, -0x1

    .line 186
    iput p1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->exitBlockIndex:I

    return-void
.end method

.method private static getGoto(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)Lcom/google/dexmaker/dx/ssa/SsaInsn;
    .locals 6

    .line 226
    new-instance v0, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;

    new-instance v1, Lcom/google/dexmaker/dx/rop/code/PlainInsn;

    sget-object v2, Lcom/google/dexmaker/dx/rop/code/Rops;->GOTO:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v3, Lcom/google/dexmaker/dx/rop/code/SourcePosition;->NO_INFO:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    sget-object v4, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    const/4 v5, 0x0

    invoke-direct {v1, v2, v3, v5, v4}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    invoke-direct {v0, v1, p0}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Insn;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V

    return-object v0
.end method

.method public static indexListFromLabelList(Lcom/google/dexmaker/dx/rop/code/BasicBlockList;Lcom/google/dexmaker/dx/util/IntList;)Lcom/google/dexmaker/dx/util/IntList;
    .locals 4

    .line 158
    new-instance v0, Lcom/google/dexmaker/dx/util/IntList;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/util/IntList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/google/dexmaker/dx/util/IntList;-><init>(I)V

    .line 160
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/util/IntList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 161
    invoke-virtual {p1, v2}, Lcom/google/dexmaker/dx/util/IntList;->get(I)I

    move-result v3

    invoke-virtual {p0, v3}, Lcom/google/dexmaker/dx/rop/code/BasicBlockList;->indexOfLabel(I)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/google/dexmaker/dx/util/IntList;->add(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static newFromRopMethod(Lcom/google/dexmaker/dx/rop/code/RopMethod;IZ)Lcom/google/dexmaker/dx/ssa/SsaMethod;
    .locals 1

    .line 102
    new-instance v0, Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/dexmaker/dx/ssa/SsaMethod;-><init>(Lcom/google/dexmaker/dx/rop/code/RopMethod;IZ)V

    .line 104
    invoke-direct {v0, p0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->convertRopToSsaBlocks(Lcom/google/dexmaker/dx/rop/code/RopMethod;)V

    return-object v0
.end method

.method private removeFromUseList(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V
    .locals 4

    if-nez p2, :cond_0

    return-void

    .line 550
    :cond_0
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 552
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    invoke-virtual {p2, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v3

    aget-object v2, v2, v3

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 553
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string/jumbo p2, "use not found"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void
.end method


# virtual methods
.method public blockIndexToRopLabel(I)I
    .locals 1

    if-gez p1, :cond_0

    const/4 p1, -0x1

    return p1

    .line 285
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getRopLabel()I

    move-result p1

    return p1
.end method

.method public borrowSpareRegister(I)I
    .locals 2

    .line 320
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->spareRegisterBase:I

    iget v1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->borrowedSpareRegisters:I

    add-int/2addr v0, v1

    add-int/2addr v1, p1

    .line 322
    iput v1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->borrowedSpareRegisters:I

    .line 323
    iget v1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->registerCount:I

    add-int/2addr p1, v0

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->registerCount:I

    return v0
.end method

.method public computeReachability()V
    .locals 5

    .line 367
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 368
    invoke-virtual {v1, v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->setReachable(I)V

    goto :goto_0

    .line 371
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 372
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getEntryBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 374
    :cond_1
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    .line 375
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 376
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->isReachable()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x1

    .line 378
    invoke-virtual {v1, v3}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->setReachable(I)V

    .line 379
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getSuccessors()Ljava/util/BitSet;

    move-result-object v1

    .line 380
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v3

    :goto_2
    if-ltz v3, :cond_1

    .line 382
    iget-object v4, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    .line 381
    invoke-virtual {v1, v3}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v3

    goto :goto_2

    :cond_3
    return-void
.end method

.method public deleteInsns(Ljava/util/Set;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/google/dexmaker/dx/ssa/SsaInsn;",
            ">;)V"
        }
    .end annotation

    .line 824
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 825
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object v2

    .line 827
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    :goto_0
    if-ltz v3, :cond_2

    .line 828
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 830
    invoke-interface {p1, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 831
    invoke-virtual {p0, v5}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->onInsnRemoved(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V

    .line 832
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    .line 838
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v5, 0x0

    if-nez v3, :cond_3

    move-object v6, v5

    goto :goto_1

    :cond_3
    add-int/lit8 v6, v3, -0x1

    .line 839
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 841
    :goto_1
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getExitBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v7

    if-eq v1, v7, :cond_0

    if-eqz v3, :cond_4

    invoke-virtual {v6}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getOriginalRopInsn()Lcom/google/dexmaker/dx/rop/code/Insn;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v6}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getOriginalRopInsn()Lcom/google/dexmaker/dx/rop/code/Insn;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/code/Insn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/code/Rop;->getBranchingness()I

    move-result v3

    if-ne v3, v4, :cond_0

    .line 847
    :cond_4
    new-instance v3, Lcom/google/dexmaker/dx/rop/code/PlainInsn;

    sget-object v4, Lcom/google/dexmaker/dx/rop/code/Rops;->GOTO:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v6, Lcom/google/dexmaker/dx/rop/code/SourcePosition;->NO_INFO:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    sget-object v7, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    invoke-direct {v3, v4, v6, v5, v7}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    .line 849
    invoke-static {v3, v1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->makeFromRop(Lcom/google/dexmaker/dx/rop/code/Insn;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)Lcom/google/dexmaker/dx/ssa/SsaInsn;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 852
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getSuccessors()Ljava/util/BitSet;

    move-result-object v2

    const/4 v3, 0x0

    .line 853
    invoke-virtual {v2, v3}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v3

    :goto_2
    if-ltz v3, :cond_0

    .line 855
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getPrimarySuccessorIndex()I

    move-result v4

    if-eq v3, v4, :cond_5

    .line 856
    invoke-virtual {v1, v3}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->removeSuccessor(I)V

    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 854
    invoke-virtual {v2, v3}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v3

    goto :goto_2

    :cond_6
    return-void
.end method

.method public forEachBlockDepthFirst(ZLcom/google/dexmaker/dx/ssa/SsaBasicBlock$Visitor;)V
    .locals 7

    .line 756
    new-instance v0, Ljava/util/BitSet;

    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    .line 759
    new-instance v1, Ljava/util/Stack;

    invoke-direct {v1}, Ljava/util/Stack;-><init>()V

    if-eqz p1, :cond_0

    .line 761
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getExitBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getEntryBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v2

    :goto_0
    if-nez v2, :cond_1

    return-void

    :cond_1
    const/4 v3, 0x0

    .line 768
    invoke-virtual {v1, v3}, Ljava/util/Stack;->add(Ljava/lang/Object;)Z

    .line 769
    invoke-virtual {v1, v2}, Ljava/util/Stack;->add(Ljava/lang/Object;)Z

    .line 771
    :cond_2
    :goto_1
    invoke-virtual {v1}, Ljava/util/Stack;->size()I

    move-result v2

    if-lez v2, :cond_5

    .line 772
    invoke-virtual {v1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 773
    invoke-virtual {v1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 775
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getIndex()I

    move-result v4

    invoke-virtual {v0, v4}, Ljava/util/BitSet;->get(I)Z

    move-result v4

    if-nez v4, :cond_2

    if-eqz p1, :cond_3

    .line 776
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getPredecessors()Ljava/util/BitSet;

    move-result-object v4

    goto :goto_2

    :cond_3
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getSuccessors()Ljava/util/BitSet;

    move-result-object v4

    :goto_2
    const/4 v5, 0x0

    .line 778
    invoke-virtual {v4, v5}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v5

    :goto_3
    if-ltz v5, :cond_4

    .line 780
    invoke-virtual {v1, v2}, Ljava/util/Stack;->add(Ljava/lang/Object;)Z

    .line 781
    iget-object v6, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/Stack;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    .line 779
    invoke-virtual {v4, v5}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v5

    goto :goto_3

    .line 783
    :cond_4
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getIndex()I

    move-result v4

    invoke-virtual {v0, v4}, Ljava/util/BitSet;->set(I)V

    .line 784
    invoke-interface {p2, v2, v3}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock$Visitor;->visitBlock(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V

    goto :goto_1

    :cond_5
    return-void
.end method

.method public forEachBlockDepthFirstDom(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock$Visitor;)V
    .locals 6

    .line 797
    new-instance v0, Ljava/util/BitSet;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    .line 798
    new-instance v1, Ljava/util/Stack;

    invoke-direct {v1}, Ljava/util/Stack;-><init>()V

    .line 800
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getEntryBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/Stack;->add(Ljava/lang/Object;)Z

    .line 802
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/util/Stack;->size()I

    move-result v2

    if-lez v2, :cond_2

    .line 803
    invoke-virtual {v1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 804
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getDomChildren()Ljava/util/ArrayList;

    move-result-object v3

    .line 806
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getIndex()I

    move-result v4

    invoke-virtual {v0, v4}, Ljava/util/BitSet;->get(I)Z

    move-result v4

    if-nez v4, :cond_0

    .line 808
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    :goto_1
    if-ltz v4, :cond_1

    .line 809
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 810
    invoke-virtual {v1, v5}, Ljava/util/Stack;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, -0x1

    goto :goto_1

    .line 812
    :cond_1
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getIndex()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/util/BitSet;->set(I)V

    const/4 v3, 0x0

    .line 813
    invoke-interface {p1, v2, v3}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock$Visitor;->visitBlock(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public forEachInsn(Lcom/google/dexmaker/dx/ssa/SsaInsn$Visitor;)V
    .locals 2

    .line 728
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 729
    invoke-virtual {v1, p1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->forEachInsn(Lcom/google/dexmaker/dx/ssa/SsaInsn$Visitor;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public forEachPhiInsn(Lcom/google/dexmaker/dx/ssa/PhiInsn$Visitor;)V
    .locals 2

    .line 739
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 740
    invoke-virtual {v1, p1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->forEachPhiInsn(Lcom/google/dexmaker/dx/ssa/PhiInsn$Visitor;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public getBlocks()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;",
            ">;"
        }
    .end annotation

    .line 339
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getCountReachableBlocks()I
    .locals 3

    .line 351
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 353
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->isReachable()Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public getDefinitionForRegister(I)Lcom/google/dexmaker/dx/ssa/SsaInsn;
    .locals 1

    .line 410
    iget-boolean v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->backMode:Z

    if-nez v0, :cond_1

    .line 414
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->definitionList:[Lcom/google/dexmaker/dx/ssa/SsaInsn;

    if-eqz v0, :cond_0

    .line 415
    aget-object p1, v0, p1

    return-object p1

    .line 418
    :cond_0
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getRegCount()I

    move-result v0

    new-array v0, v0, [Lcom/google/dexmaker/dx/ssa/SsaInsn;

    iput-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->definitionList:[Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 420
    new-instance v0, Lcom/google/dexmaker/dx/ssa/SsaMethod$1;

    invoke-direct {v0, p0}, Lcom/google/dexmaker/dx/ssa/SsaMethod$1;-><init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    invoke-virtual {p0, v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->forEachInsn(Lcom/google/dexmaker/dx/ssa/SsaInsn$Visitor;)V

    .line 435
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->definitionList:[Lcom/google/dexmaker/dx/ssa/SsaInsn;

    aget-object p1, v0, p1

    return-object p1

    .line 411
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "No def list in back mode"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getEntryBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;
    .locals 2

    .line 259
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    iget v1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->entryBlockIndex:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    return-object v0
.end method

.method public getEntryBlockIndex()I
    .locals 1

    .line 252
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->entryBlockIndex:I

    return v0
.end method

.method public getExitBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;
    .locals 2

    .line 274
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->exitBlockIndex:I

    if-gez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    :goto_0
    return-object v0
.end method

.method public getExitBlockIndex()I
    .locals 1

    .line 266
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->exitBlockIndex:I

    return v0
.end method

.method public getParamWidth()I
    .locals 1

    .line 300
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->paramWidth:I

    return v0
.end method

.method public getRegCount()I
    .locals 1

    .line 292
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->registerCount:I

    return v0
.end method

.method public getUseListCopy()[Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/ssa/SsaInsn;",
            ">;"
        }
    .end annotation

    .line 653
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 654
    invoke-direct {p0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->buildUseList()V

    .line 657
    :cond_0
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->registerCount:I

    new-array v0, v0, [Ljava/util/ArrayList;

    check-cast v0, [Ljava/util/ArrayList;

    const/4 v1, 0x0

    .line 660
    :goto_0
    iget v2, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->registerCount:I

    if-ge v1, v2, :cond_1

    .line 661
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    aget-object v3, v3, v1

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public getUseListForRegister(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/google/dexmaker/dx/ssa/SsaInsn;",
            ">;"
        }
    .end annotation

    .line 640
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->unmodifiableUseList:[Ljava/util/List;

    if-nez v0, :cond_0

    .line 641
    invoke-direct {p0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->buildUseList()V

    .line 644
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->unmodifiableUseList:[Ljava/util/List;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public isRegALocal(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Z
    .locals 4

    .line 676
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getDefinitionForRegister(I)Lcom/google/dexmaker/dx/ssa/SsaInsn;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 684
    :cond_0
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getLocalAssignment()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    return v2

    .line 687
    :cond_1
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getUseListForRegister(I)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 688
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getOriginalRopInsn()Lcom/google/dexmaker/dx/rop/code/Insn;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 690
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Insn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Rop;->getOpcode()I

    move-result v0

    const/16 v3, 0x36

    if-ne v0, v3, :cond_2

    return v2

    :cond_3
    return v1
.end method

.method public isStatic()Z
    .locals 1

    .line 309
    iget-boolean v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->isStatic:Z

    return v0
.end method

.method makeExitBlock()V
    .locals 4

    .line 196
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->exitBlockIndex:I

    if-gez v0, :cond_2

    .line 200
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->exitBlockIndex:I

    .line 201
    new-instance v0, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    iget v1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->exitBlockIndex:I

    iget v2, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->maxLabel:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->maxLabel:I

    invoke-direct {v0, v1, v2, p0}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;-><init>(IILcom/google/dexmaker/dx/ssa/SsaMethod;)V

    .line 204
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 207
    invoke-virtual {v2, v0}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->exitBlockFixup(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V

    goto :goto_0

    .line 210
    :cond_0
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getPredecessors()Ljava/util/BitSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/BitSet;->cardinality()I

    move-result v0

    if-nez v0, :cond_1

    .line 212
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    iget v1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->exitBlockIndex:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    const/4 v0, -0x1

    .line 213
    iput v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->exitBlockIndex:I

    .line 214
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->maxLabel:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->maxLabel:I

    :cond_1
    return-void

    .line 197
    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "must be called at most once"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public makeNewGotoBlock()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;
    .locals 4

    .line 239
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 240
    new-instance v1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    iget v2, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->maxLabel:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->maxLabel:I

    invoke-direct {v1, v0, v2, p0}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;-><init>(IILcom/google/dexmaker/dx/ssa/SsaMethod;)V

    .line 242
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getGoto(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)Lcom/google/dexmaker/dx/ssa/SsaInsn;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 243
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v1
.end method

.method public makeNewSsaReg()I
    .locals 2

    .line 716
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->registerCount:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->registerCount:I

    .line 717
    iget v1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->registerCount:I

    iput v1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->spareRegisterBase:I

    .line 718
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->onInsnsChanged()V

    return v0
.end method

.method public mapRegisters(Lcom/google/dexmaker/dx/ssa/RegisterMapper;)V
    .locals 3

    .line 393
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 394
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 395
    invoke-virtual {v2, p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->mapRegisters(Lcom/google/dexmaker/dx/ssa/RegisterMapper;)V

    goto :goto_0

    .line 399
    :cond_1
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/RegisterMapper;->getNewRegisterCount()I

    move-result p1

    iput p1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->registerCount:I

    .line 400
    iget p1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->registerCount:I

    iput p1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->spareRegisterBase:I

    return-void
.end method

.method onInsnAdded(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V
    .locals 1

    const/4 v0, 0x0

    .line 565
    invoke-virtual {p0, p1, v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->onSourcesChanged(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    .line 566
    invoke-virtual {p0, p1, v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->updateOneDefinition(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    return-void
.end method

.method onInsnRemoved(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V
    .locals 2

    .line 576
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 577
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->removeFromUseList(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    .line 580
    :cond_0
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    .line 581
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->definitionList:[Lcom/google/dexmaker/dx/ssa/SsaInsn;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    .line 582
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result p1

    const/4 v1, 0x0

    aput-object v1, v0, p1

    :cond_1
    return-void
.end method

.method public onInsnsChanged()V
    .locals 1

    const/4 v0, 0x0

    .line 595
    iput-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->definitionList:[Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 598
    iput-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    .line 599
    iput-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->unmodifiableUseList:[Ljava/util/List;

    return-void
.end method

.method onSourceChanged(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V
    .locals 1

    .line 496
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p2, :cond_1

    .line 499
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result p2

    .line 500
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    aget-object p2, v0, p2

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 503
    :cond_1
    invoke-virtual {p3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result p2

    .line 504
    iget-object p3, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    array-length v0, p3

    if-gt v0, p2, :cond_2

    const/4 p1, 0x0

    .line 505
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    return-void

    .line 508
    :cond_2
    aget-object p2, p3, p2

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method onSourcesChanged(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V
    .locals 4

    .line 521
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p2, :cond_1

    .line 524
    invoke-direct {p0, p1, p2}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->removeFromUseList(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    .line 527
    :cond_1
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p2

    .line 528
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 531
    invoke-virtual {p2, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v2

    .line 532
    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    aget-object v2, v3, v2

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public returnSpareRegisters()V
    .locals 1

    const/4 v0, 0x0

    .line 332
    iput v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->borrowedSpareRegisters:I

    return-void
.end method

.method public setBackMode()V
    .locals 1

    const/4 v0, 0x1

    .line 869
    iput-boolean v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->backMode:Z

    const/4 v0, 0x0

    .line 870
    iput-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    .line 871
    iput-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->definitionList:[Lcom/google/dexmaker/dx/ssa/SsaInsn;

    return-void
.end method

.method setNewRegCount(I)V
    .locals 0

    .line 705
    iput p1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->registerCount:I

    .line 706
    iget p1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->registerCount:I

    iput p1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->spareRegisterBase:I

    .line 707
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->onInsnsChanged()V

    return-void
.end method

.method updateOneDefinition(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V
    .locals 2

    .line 612
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->definitionList:[Lcom/google/dexmaker/dx/ssa/SsaInsn;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p2, :cond_1

    .line 615
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result p2

    .line 616
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->definitionList:[Lcom/google/dexmaker/dx/ssa/SsaInsn;

    const/4 v1, 0x0

    aput-object v1, v0, p2

    .line 619
    :cond_1
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 622
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    .line 624
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaMethod;->definitionList:[Lcom/google/dexmaker/dx/ssa/SsaInsn;

    aget-object v0, v1, v0

    if-nez v0, :cond_2

    .line 627
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result p2

    aput-object p1, v1, p2

    goto :goto_0

    .line 625
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Duplicate add of insn"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    return-void
.end method
