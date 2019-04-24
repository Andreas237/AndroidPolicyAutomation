.class public Lcom/google/dexmaker/dx/ssa/LocalVariableExtractor;
.super Ljava/lang/Object;
.source "LocalVariableExtractor.java"


# instance fields
.field private final blocks:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;",
            ">;"
        }
    .end annotation
.end field

.field private final method:Lcom/google/dexmaker/dx/ssa/SsaMethod;

.field private final resultInfo:Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;

.field private final workSet:Ljava/util/BitSet;


# direct methods
.method private constructor <init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V
    .locals 2

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 69
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object v0

    .line 71
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableExtractor;->method:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    .line 72
    iput-object v0, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableExtractor;->blocks:Ljava/util/ArrayList;

    .line 73
    new-instance v1, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;

    invoke-direct {v1, p1}, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;-><init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    iput-object v1, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableExtractor;->resultInfo:Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;

    .line 74
    new-instance p1, Ljava/util/BitSet;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/BitSet;-><init>(I)V

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableExtractor;->workSet:Ljava/util/BitSet;

    return-void

    .line 66
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "method == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private doit()Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;
    .locals 2

    .line 85
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableExtractor;->method:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getRegCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 86
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableExtractor;->method:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getEntryBlockIndex()I

    move-result v0

    :goto_0
    if-ltz v0, :cond_0

    .line 89
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableExtractor;->workSet:Ljava/util/BitSet;

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->clear(I)V

    .line 90
    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/ssa/LocalVariableExtractor;->processBlock(I)V

    .line 88
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableExtractor;->workSet:Ljava/util/BitSet;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v0

    goto :goto_0

    .line 94
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableExtractor;->resultInfo:Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;->setImmutable()V

    .line 95
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableExtractor;->resultInfo:Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;

    return-object v0
.end method

.method public static extract(Lcom/google/dexmaker/dx/ssa/SsaMethod;)Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;
    .locals 1

    .line 55
    new-instance v0, Lcom/google/dexmaker/dx/ssa/LocalVariableExtractor;

    invoke-direct {v0, p0}, Lcom/google/dexmaker/dx/ssa/LocalVariableExtractor;-><init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    .line 56
    invoke-direct {v0}, Lcom/google/dexmaker/dx/ssa/LocalVariableExtractor;->doit()Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;

    move-result-object p0

    return-object p0
.end method

.method private processBlock(I)V
    .locals 13

    .line 104
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableExtractor;->resultInfo:Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;->mutableCopyOfStarts(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    move-result-object v0

    .line 106
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableExtractor;->blocks:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 107
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object v2

    .line 108
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    .line 111
    iget-object v4, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableExtractor;->method:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v4}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getExitBlockIndex()I

    move-result v4

    if-ne p1, v4, :cond_0

    return-void

    :cond_0
    add-int/lit8 p1, v3, -0x1

    .line 122
    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 123
    invoke-virtual {v4}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getOriginalRopInsn()Lcom/google/dexmaker/dx/rop/code/Insn;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/dexmaker/dx/rop/code/Insn;->getCatches()Lcom/google/dexmaker/dx/rop/type/TypeList;

    move-result-object v5

    invoke-interface {v5}, Lcom/google/dexmaker/dx/rop/type/TypeList;->size()I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v5, :cond_1

    move v5, v7

    goto :goto_0

    :cond_1
    move v5, v6

    :goto_0
    if-eqz v5, :cond_2

    .line 125
    invoke-virtual {v4}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v4

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    move v7, v6

    :goto_1
    move-object v5, v0

    move v4, v6

    :goto_2
    if-ge v4, v3, :cond_7

    if-eqz v7, :cond_3

    if-ne v4, p1, :cond_3

    .line 138
    invoke-virtual {v5}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->setImmutable()V

    .line 139
    invoke-virtual {v5}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->mutableCopy()Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    move-result-object v5

    .line 142
    :cond_3
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 145
    invoke-virtual {v8}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getLocalAssignment()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v9

    if-nez v9, :cond_4

    .line 150
    invoke-virtual {v8}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v8

    if-eqz v8, :cond_6

    .line 152
    invoke-virtual {v8}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v9

    invoke-virtual {v5, v9}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v9

    if-eqz v9, :cond_6

    .line 153
    invoke-virtual {v8}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v8

    invoke-virtual {v5, v8}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v8

    invoke-virtual {v5, v8}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->remove(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    goto :goto_3

    .line 158
    :cond_4
    invoke-virtual {v9}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->withSimpleType()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v9

    .line 160
    invoke-virtual {v5, v9}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->get(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v10

    .line 166
    invoke-virtual {v9, v10}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_6

    .line 172
    invoke-virtual {v9}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/google/dexmaker/dx/rop/code/LocalItem;

    move-result-object v10

    invoke-virtual {v5, v10}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->localItemToSpec(Lcom/google/dexmaker/dx/rop/code/LocalItem;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v10

    if-eqz v10, :cond_5

    .line 175
    invoke-virtual {v10}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v11

    invoke-virtual {v9}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v12

    if-eq v11, v12, :cond_5

    .line 178
    invoke-virtual {v5, v10}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->remove(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    .line 181
    :cond_5
    iget-object v10, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableExtractor;->resultInfo:Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;

    invoke-virtual {v10, v8, v9}, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;->addAssignment(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    .line 182
    invoke-virtual {v5, v9}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->put(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    :cond_6
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 186
    :cond_7
    invoke-virtual {v5}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->setImmutable()V

    .line 194
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getSuccessorList()Lcom/google/dexmaker/dx/util/IntList;

    move-result-object p1

    .line 195
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/util/IntList;->size()I

    move-result v2

    .line 196
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getPrimarySuccessorIndex()I

    move-result v1

    :goto_4
    if-ge v6, v2, :cond_a

    .line 199
    invoke-virtual {p1, v6}, Lcom/google/dexmaker/dx/util/IntList;->get(I)I

    move-result v3

    if-ne v3, v1, :cond_8

    move-object v4, v5

    goto :goto_5

    :cond_8
    move-object v4, v0

    .line 203
    :goto_5
    iget-object v7, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableExtractor;->resultInfo:Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;

    invoke-virtual {v7, v3, v4}, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;->mergeStarts(ILcom/google/dexmaker/dx/rop/code/RegisterSpecSet;)Z

    move-result v4

    if-eqz v4, :cond_9

    .line 204
    iget-object v4, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableExtractor;->workSet:Ljava/util/BitSet;

    invoke-virtual {v4, v3}, Ljava/util/BitSet;->set(I)V

    :cond_9
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_a
    return-void
.end method
