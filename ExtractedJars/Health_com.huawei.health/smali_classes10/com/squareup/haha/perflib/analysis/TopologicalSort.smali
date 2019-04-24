.class public Lcom/squareup/haha/perflib/analysis/TopologicalSort;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/haha/perflib/analysis/TopologicalSort$1;,
        Lcom/squareup/haha/perflib/analysis/TopologicalSort$TopologicalSortVisitor;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    return-void
.end method

.method public static compute(Ljava/lang/Iterable;)Lcom/squareup/haha/guava/collect/ImmutableList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<Lcom/squareup/haha/perflib/RootObj;>;)Lcom/squareup/haha/guava/collect/ImmutableList<Lcom/squareup/haha/perflib/Instance;>;"
        }
    .end annotation

    .line 35
    new-instance v2, Lcom/squareup/haha/perflib/analysis/TopologicalSort$TopologicalSortVisitor;

    const/4 v0, 0x0

    invoke-direct {v2, v0}, Lcom/squareup/haha/perflib/analysis/TopologicalSort$TopologicalSortVisitor;-><init>(Lcom/squareup/haha/perflib/analysis/TopologicalSort$1;)V

    .line 36
    invoke-virtual {v2, p0}, Lcom/squareup/haha/perflib/analysis/TopologicalSort$TopologicalSortVisitor;->doVisit(Ljava/lang/Iterable;)V

    .line 37
    invoke-virtual {v2}, Lcom/squareup/haha/perflib/analysis/TopologicalSort$TopologicalSortVisitor;->getOrderedInstances()Lcom/squareup/haha/guava/collect/ImmutableList;

    move-result-object v3

    .line 41
    sget-object v0, Lcom/squareup/haha/perflib/Snapshot;->SENTINEL_ROOT:Lcom/squareup/haha/perflib/Instance;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/squareup/haha/perflib/Instance;->setTopologicalOrder(I)V

    .line 45
    const/4 v4, 0x0

    .line 46
    invoke-virtual {v3}, Lcom/squareup/haha/guava/collect/ImmutableList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/squareup/haha/perflib/Instance;

    .line 47
    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v6, v4}, Lcom/squareup/haha/perflib/Instance;->setTopologicalOrder(I)V

    .line 48
    goto :goto_0

    .line 50
    :cond_0
    return-object v3
.end method
