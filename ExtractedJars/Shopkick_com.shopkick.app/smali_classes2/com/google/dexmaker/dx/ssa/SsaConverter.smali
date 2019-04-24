.class public Lcom/google/dexmaker/dx/ssa/SsaConverter;
.super Ljava/lang/Object;
.source "SsaConverter.java"


# static fields
.field public static final DEBUG:Z = false


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static convertToSsaMethod(Lcom/google/dexmaker/dx/rop/code/RopMethod;IZ)Lcom/google/dexmaker/dx/ssa/SsaMethod;
    .locals 0

    .line 45
    invoke-static {p0, p1, p2}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->newFromRopMethod(Lcom/google/dexmaker/dx/rop/code/RopMethod;IZ)Lcom/google/dexmaker/dx/ssa/SsaMethod;

    move-result-object p0

    .line 48
    invoke-static {p0}, Lcom/google/dexmaker/dx/ssa/SsaConverter;->edgeSplit(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    .line 50
    invoke-static {p0}, Lcom/google/dexmaker/dx/ssa/LocalVariableExtractor;->extract(Lcom/google/dexmaker/dx/ssa/SsaMethod;)Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;

    move-result-object p1

    const/4 p2, 0x0

    .line 52
    invoke-static {p0, p1, p2}, Lcom/google/dexmaker/dx/ssa/SsaConverter;->placePhiFunctions(Lcom/google/dexmaker/dx/ssa/SsaMethod;Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;I)V

    .line 53
    new-instance p1, Lcom/google/dexmaker/dx/ssa/SsaRenamer;

    invoke-direct {p1, p0}, Lcom/google/dexmaker/dx/ssa/SsaRenamer;-><init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->run()V

    .line 59
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->makeExitBlock()V

    return-object p0
.end method

.method private static edgeSplit(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V
    .locals 0

    .line 135
    invoke-static {p0}, Lcom/google/dexmaker/dx/ssa/SsaConverter;->edgeSplitPredecessors(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    .line 136
    invoke-static {p0}, Lcom/google/dexmaker/dx/ssa/SsaConverter;->edgeSplitMoveExceptionsAndResults(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    .line 137
    invoke-static {p0}, Lcom/google/dexmaker/dx/ssa/SsaConverter;->edgeSplitSuccessors(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    return-void
.end method

.method private static edgeSplitMoveExceptionsAndResults(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V
    .locals 8

    .line 188
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object p0

    .line 194
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_2

    .line 195
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 201
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->isExitBlock()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getPredecessors()Ljava/util/BitSet;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/BitSet;->cardinality()I

    move-result v3

    if-le v3, v1, :cond_1

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->isMoveException()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 206
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getPredecessors()Ljava/util/BitSet;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/BitSet;->clone()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/BitSet;

    .line 207
    invoke-virtual {v3, v4}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v5

    :goto_1
    if-ltz v5, :cond_0

    .line 209
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 210
    invoke-virtual {v6, v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insertNewSuccessor(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    move-result-object v6

    .line 217
    invoke-virtual {v6}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    invoke-virtual {v7}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->clone()Lcom/google/dexmaker/dx/ssa/SsaInsn;

    move-result-object v7

    invoke-virtual {v6, v4, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v5, v5, 0x1

    .line 208
    invoke-virtual {v3, v5}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v5

    goto :goto_1

    .line 221
    :cond_0
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private static edgeSplitPredecessors(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V
    .locals 3

    .line 147
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object p0

    .line 153
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 154
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 155
    invoke-static {v1}, Lcom/google/dexmaker/dx/ssa/SsaConverter;->nodeNeedsUniquePredecessor(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 156
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insertNewPredecessor()Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private static edgeSplitSuccessors(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V
    .locals 6

    .line 233
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object p0

    .line 239
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_2

    .line 240
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 243
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getSuccessors()Ljava/util/BitSet;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/BitSet;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/BitSet;

    const/4 v3, 0x0

    .line 244
    invoke-virtual {v2, v3}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v3

    :goto_1
    if-ltz v3, :cond_1

    .line 247
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 249
    invoke-static {v1, v4}, Lcom/google/dexmaker/dx/ssa/SsaConverter;->needsNewSuccessor(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 250
    invoke-virtual {v1, v4}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->insertNewSuccessor(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 245
    invoke-virtual {v2, v3}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v3

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private static needsNewSuccessor(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)Z
    .locals 2

    .line 268
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object p0

    .line 269
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 271
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result p0

    if-lez p0, :cond_1

    :cond_0
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getPredecessors()Ljava/util/BitSet;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/BitSet;->cardinality()I

    move-result p0

    if-le p0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private static nodeNeedsUniquePredecessor(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)Z
    .locals 2

    .line 172
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getPredecessors()Ljava/util/BitSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/BitSet;->cardinality()I

    move-result v0

    .line 173
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getSuccessors()Ljava/util/BitSet;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/BitSet;->cardinality()I

    move-result p0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    if-le p0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private static placePhiFunctions(Lcom/google/dexmaker/dx/ssa/SsaMethod;Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;I)V
    .locals 11

    .line 293
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object v0

    .line 294
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 295
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getRegCount()I

    move-result v2

    sub-int/2addr v2, p2

    .line 297
    new-instance v3, Lcom/google/dexmaker/dx/ssa/DomFront;

    invoke-direct {v3, p0}, Lcom/google/dexmaker/dx/ssa/DomFront;-><init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    .line 298
    invoke-virtual {v3}, Lcom/google/dexmaker/dx/ssa/DomFront;->run()[Lcom/google/dexmaker/dx/ssa/DomFront$DomInfo;

    move-result-object p0

    .line 301
    new-array v3, v2, [Ljava/util/BitSet;

    .line 304
    new-array v4, v2, [Ljava/util/BitSet;

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    if-ge v6, v2, :cond_0

    .line 307
    new-instance v7, Ljava/util/BitSet;

    invoke-direct {v7, v1}, Ljava/util/BitSet;-><init>(I)V

    aput-object v7, v3, v6

    .line 308
    new-instance v7, Ljava/util/BitSet;

    invoke-direct {v7, v1}, Ljava/util/BitSet;-><init>(I)V

    aput-object v7, v4, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 315
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    move v6, v5

    :goto_1
    if-ge v6, v1, :cond_3

    .line 316
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 318
    invoke-virtual {v7}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_1
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 319
    invoke-virtual {v8}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v8

    if-eqz v8, :cond_1

    .line 321
    invoke-virtual {v8}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v9

    sub-int/2addr v9, p2

    if-ltz v9, :cond_1

    .line 322
    invoke-virtual {v8}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v8

    sub-int/2addr v8, p2

    aget-object v8, v3, v8

    invoke-virtual {v8, v6}, Ljava/util/BitSet;->set(I)V

    goto :goto_2

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_3
    move v1, v5

    :goto_3
    if-ge v1, v2, :cond_8

    .line 349
    aget-object v6, v3, v1

    invoke-virtual {v6}, Ljava/util/BitSet;->clone()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/BitSet;

    .line 351
    :cond_4
    invoke-virtual {v6, v5}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v7

    if-ltz v7, :cond_7

    .line 352
    invoke-virtual {v6, v7}, Ljava/util/BitSet;->clear(I)V

    .line 353
    aget-object v7, p0, v7

    iget-object v7, v7, Lcom/google/dexmaker/dx/ssa/DomFront$DomInfo;->dominanceFrontiers:Lcom/google/dexmaker/dx/util/IntSet;

    invoke-interface {v7}, Lcom/google/dexmaker/dx/util/IntSet;->iterator()Lcom/google/dexmaker/dx/util/IntIterator;

    move-result-object v7

    .line 356
    :cond_5
    :goto_4
    invoke-interface {v7}, Lcom/google/dexmaker/dx/util/IntIterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    .line 357
    invoke-interface {v7}, Lcom/google/dexmaker/dx/util/IntIterator;->next()I

    move-result v8

    .line 359
    aget-object v9, v4, v1

    invoke-virtual {v9, v8}, Ljava/util/BitSet;->get(I)Z

    move-result v9

    if-nez v9, :cond_5

    .line 360
    aget-object v9, v4, v1

    invoke-virtual {v9, v8}, Ljava/util/BitSet;->set(I)V

    add-int v9, v1, p2

    .line 363
    invoke-virtual {p1, v8}, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;->getStarts(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    move-result-object v10

    invoke-virtual {v10, v9}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v10

    if-nez v10, :cond_6

    .line 367
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    invoke-virtual {v10, v9}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->addPhiInsnForReg(I)V

    goto :goto_5

    .line 369
    :cond_6
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    invoke-virtual {v9, v10}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->addPhiInsnForReg(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    .line 372
    :goto_5
    aget-object v9, v3, v1

    invoke-virtual {v9, v8}, Ljava/util/BitSet;->get(I)Z

    move-result v9

    if-nez v9, :cond_5

    .line 373
    invoke-virtual {v6, v8}, Ljava/util/BitSet;->set(I)V

    goto :goto_4

    :cond_7
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_8
    return-void
.end method

.method public static testEdgeSplit(Lcom/google/dexmaker/dx/rop/code/RopMethod;IZ)Lcom/google/dexmaker/dx/ssa/SsaMethod;
    .locals 0

    .line 90
    invoke-static {p0, p1, p2}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->newFromRopMethod(Lcom/google/dexmaker/dx/rop/code/RopMethod;IZ)Lcom/google/dexmaker/dx/ssa/SsaMethod;

    move-result-object p0

    .line 92
    invoke-static {p0}, Lcom/google/dexmaker/dx/ssa/SsaConverter;->edgeSplit(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    return-object p0
.end method

.method public static testPhiPlacement(Lcom/google/dexmaker/dx/rop/code/RopMethod;IZ)Lcom/google/dexmaker/dx/ssa/SsaMethod;
    .locals 0

    .line 110
    invoke-static {p0, p1, p2}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->newFromRopMethod(Lcom/google/dexmaker/dx/rop/code/RopMethod;IZ)Lcom/google/dexmaker/dx/ssa/SsaMethod;

    move-result-object p0

    .line 112
    invoke-static {p0}, Lcom/google/dexmaker/dx/ssa/SsaConverter;->edgeSplit(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    .line 114
    invoke-static {p0}, Lcom/google/dexmaker/dx/ssa/LocalVariableExtractor;->extract(Lcom/google/dexmaker/dx/ssa/SsaMethod;)Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;

    move-result-object p1

    const/4 p2, 0x0

    .line 116
    invoke-static {p0, p1, p2}, Lcom/google/dexmaker/dx/ssa/SsaConverter;->placePhiFunctions(Lcom/google/dexmaker/dx/ssa/SsaMethod;Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;I)V

    return-object p0
.end method

.method public static updateSsaMethod(Lcom/google/dexmaker/dx/ssa/SsaMethod;I)V
    .locals 1

    .line 72
    invoke-static {p0}, Lcom/google/dexmaker/dx/ssa/LocalVariableExtractor;->extract(Lcom/google/dexmaker/dx/ssa/SsaMethod;)Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;

    move-result-object v0

    .line 73
    invoke-static {p0, v0, p1}, Lcom/google/dexmaker/dx/ssa/SsaConverter;->placePhiFunctions(Lcom/google/dexmaker/dx/ssa/SsaMethod;Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;I)V

    .line 74
    new-instance v0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;

    invoke-direct {v0, p0, p1}, Lcom/google/dexmaker/dx/ssa/SsaRenamer;-><init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;I)V

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->run()V

    return-void
.end method
