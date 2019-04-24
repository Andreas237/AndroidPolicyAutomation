.class public Lcom/squareup/haha/perflib/analysis/Dominators;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

.field private final mTopSort:Lcom/squareup/haha/guava/collect/ImmutableList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/haha/guava/collect/ImmutableList<Lcom/squareup/haha/perflib/Instance;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/squareup/haha/perflib/Snapshot;Lcom/squareup/haha/guava/collect/ImmutableList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/squareup/haha/perflib/Snapshot;Lcom/squareup/haha/guava/collect/ImmutableList<Lcom/squareup/haha/perflib/Instance;>;)V"
        }
    .end annotation

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lcom/squareup/haha/perflib/analysis/Dominators;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    .line 47
    iput-object p2, p0, Lcom/squareup/haha/perflib/analysis/Dominators;->mTopSort:Lcom/squareup/haha/guava/collect/ImmutableList;

    .line 52
    invoke-virtual {p1}, Lcom/squareup/haha/perflib/Snapshot;->getGCRoots()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/squareup/haha/perflib/RootObj;

    .line 53
    invoke-virtual {v2}, Lcom/squareup/haha/perflib/RootObj;->getReferredInstance()Lcom/squareup/haha/perflib/Instance;

    move-result-object v3

    .line 54
    if-eqz v3, :cond_0

    .line 55
    sget-object v0, Lcom/squareup/haha/perflib/Snapshot;->SENTINEL_ROOT:Lcom/squareup/haha/perflib/Instance;

    invoke-virtual {v3, v0}, Lcom/squareup/haha/perflib/Instance;->setImmediateDominator(Lcom/squareup/haha/perflib/Instance;)V

    .line 57
    :cond_0
    goto :goto_0

    .line 58
    :cond_1
    return-void
.end method

.method private computeDominators()V
    .locals 10

    .line 63
    const/4 v2, 0x1

    .line 64
    :goto_0
    if-eqz v2, :cond_7

    .line 65
    const/4 v2, 0x0

    .line 67
    const/4 v3, 0x0

    :goto_1
    iget-object v0, p0, Lcom/squareup/haha/perflib/analysis/Dominators;->mTopSort:Lcom/squareup/haha/guava/collect/ImmutableList;

    invoke-virtual {v0}, Lcom/squareup/haha/guava/collect/ImmutableList;->size()I

    move-result v0

    if-ge v3, v0, :cond_6

    .line 68
    iget-object v0, p0, Lcom/squareup/haha/perflib/analysis/Dominators;->mTopSort:Lcom/squareup/haha/guava/collect/ImmutableList;

    invoke-virtual {v0, v3}, Lcom/squareup/haha/guava/collect/ImmutableList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/squareup/haha/perflib/Instance;

    .line 70
    invoke-virtual {v4}, Lcom/squareup/haha/perflib/Instance;->getImmediateDominator()Lcom/squareup/haha/perflib/Instance;

    move-result-object v0

    sget-object v1, Lcom/squareup/haha/perflib/Snapshot;->SENTINEL_ROOT:Lcom/squareup/haha/perflib/Instance;

    if-eq v0, v1, :cond_5

    .line 71
    const/4 v5, 0x0

    .line 73
    const/4 v6, 0x0

    :goto_2
    invoke-virtual {v4}, Lcom/squareup/haha/perflib/Instance;->getHardReferences()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_4

    .line 74
    invoke-virtual {v4}, Lcom/squareup/haha/perflib/Instance;->getHardReferences()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/squareup/haha/perflib/Instance;

    .line 75
    invoke-virtual {v7}, Lcom/squareup/haha/perflib/Instance;->getImmediateDominator()Lcom/squareup/haha/perflib/Instance;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 79
    if-nez v5, :cond_0

    .line 80
    move-object v5, v7

    goto :goto_4

    .line 82
    :cond_0
    move-object v8, v5

    .line 83
    move-object v9, v7

    .line 84
    :goto_3
    if-eq v8, v9, :cond_2

    .line 85
    invoke-virtual {v8}, Lcom/squareup/haha/perflib/Instance;->getTopologicalOrder()I

    move-result v0

    invoke-virtual {v9}, Lcom/squareup/haha/perflib/Instance;->getTopologicalOrder()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 86
    invoke-virtual {v9}, Lcom/squareup/haha/perflib/Instance;->getImmediateDominator()Lcom/squareup/haha/perflib/Instance;

    move-result-object v9

    goto :goto_3

    .line 88
    :cond_1
    invoke-virtual {v8}, Lcom/squareup/haha/perflib/Instance;->getImmediateDominator()Lcom/squareup/haha/perflib/Instance;

    move-result-object v8

    goto :goto_3

    .line 91
    :cond_2
    move-object v5, v8

    .line 73
    :cond_3
    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 95
    :cond_4
    invoke-virtual {v4}, Lcom/squareup/haha/perflib/Instance;->getImmediateDominator()Lcom/squareup/haha/perflib/Instance;

    move-result-object v0

    if-eq v0, v5, :cond_5

    .line 96
    invoke-virtual {v4, v5}, Lcom/squareup/haha/perflib/Instance;->setImmediateDominator(Lcom/squareup/haha/perflib/Instance;)V

    .line 97
    const/4 v2, 0x1

    .line 67
    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_1

    :cond_6
    goto/16 :goto_0

    .line 102
    :cond_7
    return-void
.end method


# virtual methods
.method public computeRetainedSizes()V
    .locals 6

    .line 109
    iget-object v0, p0, Lcom/squareup/haha/perflib/analysis/Dominators;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0}, Lcom/squareup/haha/perflib/Snapshot;->getHeaps()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/squareup/haha/perflib/Heap;

    .line 110
    invoke-virtual {v3}, Lcom/squareup/haha/perflib/Heap;->getClasses()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {v3}, Lcom/squareup/haha/perflib/Heap;->getInstances()Ljava/util/Collection;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/squareup/haha/guava/collect/Iterables;->concat(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/squareup/haha/perflib/Instance;

    .line 111
    invoke-virtual {v5}, Lcom/squareup/haha/perflib/Instance;->resetRetainedSize()V

    .line 112
    goto :goto_1

    .line 113
    :cond_0
    goto :goto_0

    .line 114
    :cond_1
    invoke-direct {p0}, Lcom/squareup/haha/perflib/analysis/Dominators;->computeDominators()V

    .line 116
    iget-object v0, p0, Lcom/squareup/haha/perflib/analysis/Dominators;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0}, Lcom/squareup/haha/perflib/Snapshot;->getReachableInstances()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/squareup/haha/perflib/Instance;

    .line 117
    iget-object v0, p0, Lcom/squareup/haha/perflib/analysis/Dominators;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v3}, Lcom/squareup/haha/perflib/Instance;->getHeap()Lcom/squareup/haha/perflib/Heap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/squareup/haha/perflib/Snapshot;->getHeapIndex(Lcom/squareup/haha/perflib/Heap;)I

    move-result v4

    .line 120
    invoke-virtual {v3}, Lcom/squareup/haha/perflib/Instance;->getImmediateDominator()Lcom/squareup/haha/perflib/Instance;

    move-result-object v5

    :goto_3
    sget-object v0, Lcom/squareup/haha/perflib/Snapshot;->SENTINEL_ROOT:Lcom/squareup/haha/perflib/Instance;

    if-eq v5, v0, :cond_2

    .line 122
    invoke-virtual {v3}, Lcom/squareup/haha/perflib/Instance;->getSize()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v5, v4, v0, v1}, Lcom/squareup/haha/perflib/Instance;->addRetainedSize(IJ)V

    .line 121
    invoke-virtual {v5}, Lcom/squareup/haha/perflib/Instance;->getImmediateDominator()Lcom/squareup/haha/perflib/Instance;

    move-result-object v5

    goto :goto_3

    .line 124
    :cond_2
    goto :goto_2

    .line 125
    :cond_3
    return-void
.end method
