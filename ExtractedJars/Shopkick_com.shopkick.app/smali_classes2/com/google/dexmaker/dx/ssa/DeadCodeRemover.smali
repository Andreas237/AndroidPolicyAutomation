.class public Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;
.super Ljava/lang/Object;
.source "DeadCodeRemover.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/dexmaker/dx/ssa/DeadCodeRemover$NoSideEffectVisitor;
    }
.end annotation


# instance fields
.field private final regCount:I

.field private final ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

.field private final useList:[Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/ssa/SsaInsn;",
            ">;"
        }
    .end annotation
.end field

.field private final worklist:Ljava/util/BitSet;


# direct methods
.method private constructor <init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V
    .locals 1

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    .line 72
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getRegCount()I

    move-result p1

    iput p1, p0, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->regCount:I

    .line 73
    new-instance p1, Ljava/util/BitSet;

    iget v0, p0, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->regCount:I

    invoke-direct {p1, v0}, Ljava/util/BitSet;-><init>(I)V

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->worklist:Ljava/util/BitSet;

    .line 74
    iget-object p1, p0, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getUseListCopy()[Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->useList:[Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic access$000(Lcom/google/dexmaker/dx/ssa/SsaInsn;)Z
    .locals 0

    .line 38
    invoke-static {p0}, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->hasSideEffect(Lcom/google/dexmaker/dx/ssa/SsaInsn;)Z

    move-result p0

    return p0
.end method

.method private static hasSideEffect(Lcom/google/dexmaker/dx/ssa/SsaInsn;)Z
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    .line 227
    :cond_0
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->hasSideEffect()Z

    move-result p0

    return p0
.end method

.method private isCircularNoSideEffect(ILjava/util/BitSet;)Z
    .locals 4

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    .line 183
    invoke-virtual {p2, p1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    .line 187
    :cond_0
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->useList:[Ljava/util/ArrayList;

    aget-object v1, v1, p1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 188
    invoke-static {v2}, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->hasSideEffect(Lcom/google/dexmaker/dx/ssa/SsaInsn;)Z

    move-result v2

    if-eqz v2, :cond_1

    return v3

    :cond_2
    if-nez p2, :cond_3

    .line 194
    new-instance p2, Ljava/util/BitSet;

    iget v1, p0, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->regCount:I

    invoke-direct {p2, v1}, Ljava/util/BitSet;-><init>(I)V

    .line 198
    :cond_3
    invoke-virtual {p2, p1}, Ljava/util/BitSet;->set(I)V

    .line 200
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->useList:[Ljava/util/ArrayList;

    aget-object p1, v1, p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 201
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 203
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v1

    invoke-direct {p0, v1, p2}, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->isCircularNoSideEffect(ILjava/util/BitSet;)Z

    move-result v1

    if-nez v1, :cond_4

    :cond_5
    return v3

    :cond_6
    return v0
.end method

.method public static process(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V
    .locals 1

    .line 60
    new-instance v0, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;

    invoke-direct {v0, p0}, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;-><init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    .line 61
    invoke-direct {v0}, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->run()V

    return-void
.end method

.method private pruneDeadInstructions()V
    .locals 11

    .line 133
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 135
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->computeReachability()V

    .line 137
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 138
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->isReachable()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    move v4, v3

    .line 141
    :goto_1
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_0

    .line 142
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 143
    invoke-virtual {v5}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v6

    .line 144
    invoke-virtual {v6}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v7

    if-eqz v7, :cond_2

    .line 148
    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_2
    move v8, v3

    :goto_2
    if-ge v8, v7, :cond_3

    .line 153
    invoke-virtual {v6, v8}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v9

    .line 154
    iget-object v10, p0, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->useList:[Ljava/util/ArrayList;

    invoke-virtual {v9}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v9

    aget-object v9, v10, v9

    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 158
    :cond_3
    invoke-virtual {v5}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v5

    if-nez v5, :cond_4

    goto :goto_4

    .line 160
    :cond_4
    iget-object v6, p0, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->useList:[Ljava/util/ArrayList;

    invoke-virtual {v5}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v7

    aget-object v6, v6, v7

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_5
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 161
    instance-of v8, v7, Lcom/google/dexmaker/dx/ssa/PhiInsn;

    if-eqz v8, :cond_5

    .line 162
    check-cast v7, Lcom/google/dexmaker/dx/ssa/PhiInsn;

    .line 163
    invoke-virtual {v7, v5}, Lcom/google/dexmaker/dx/ssa/PhiInsn;->removePhiRegister(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    goto :goto_3

    :cond_6
    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 169
    :cond_7
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v1, v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->deleteInsns(Ljava/util/Set;)V

    return-void
.end method

.method private run()V
    .locals 8

    .line 81
    invoke-direct {p0}, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->pruneDeadInstructions()V

    .line 83
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 85
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    new-instance v2, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover$NoSideEffectVisitor;

    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->worklist:Ljava/util/BitSet;

    invoke-direct {v2, v3}, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover$NoSideEffectVisitor;-><init>(Ljava/util/BitSet;)V

    invoke-virtual {v1, v2}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->forEachInsn(Lcom/google/dexmaker/dx/ssa/SsaInsn$Visitor;)V

    .line 89
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->worklist:Ljava/util/BitSet;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v1

    if-ltz v1, :cond_5

    .line 90
    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->worklist:Ljava/util/BitSet;

    invoke-virtual {v3, v1}, Ljava/util/BitSet;->clear(I)V

    .line 92
    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->useList:[Ljava/util/ArrayList;

    aget-object v3, v3, v1

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    invoke-direct {p0, v1, v3}, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->isCircularNoSideEffect(ILjava/util/BitSet;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 95
    :cond_1
    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v3, v1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getDefinitionForRegister(I)Lcom/google/dexmaker/dx/ssa/SsaInsn;

    move-result-object v1

    .line 98
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    .line 102
    :cond_2
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v3

    .line 104
    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v4

    :goto_1
    if-ge v2, v4, :cond_4

    .line 107
    invoke-virtual {v3, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v5

    .line 108
    iget-object v6, p0, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->useList:[Ljava/util/ArrayList;

    invoke-virtual {v5}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v7

    aget-object v6, v6, v7

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 110
    iget-object v6, p0, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v5}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v7

    invoke-virtual {v6, v7}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getDefinitionForRegister(I)Lcom/google/dexmaker/dx/ssa/SsaInsn;

    move-result-object v6

    invoke-static {v6}, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->hasSideEffect(Lcom/google/dexmaker/dx/ssa/SsaInsn;)Z

    move-result v6

    if-nez v6, :cond_3

    .line 117
    iget-object v6, p0, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->worklist:Ljava/util/BitSet;

    invoke-virtual {v5}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v5

    invoke-virtual {v6, v5}, Ljava/util/BitSet;->set(I)V

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 122
    :cond_4
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 126
    :cond_5
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v1, v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->deleteInsns(Ljava/util/Set;)V

    return-void
.end method
