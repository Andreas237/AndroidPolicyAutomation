.class final Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedSortedSet;
.super Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;
.source "SourceFile"

# interfaces
.implements Ljava/util/SortedSet;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "WrappedSortedSet"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap<TK;TV;>.WrappedCollection;Ljava/util/SortedSet<TV;>;"
    }
.end annotation


# instance fields
.field private synthetic this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;


# direct methods
.method constructor <init>(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;Ljava/lang/Object;Ljava/util/SortedSet;Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;)V
    .locals 0
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;Ljava/util/SortedSet<TV;>;Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap<TK;TV;>.WrappedCollection;)V"
        }
    .end annotation

    .line 632
    iput-object p1, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedSortedSet;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    .line 633
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;-><init>(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;Ljava/lang/Object;Ljava/util/Collection;Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;)V

    .line 634
    return-void
.end method

.method private getSortedSetDelegate()Ljava/util/SortedSet;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/SortedSet<TV;>;"
        }
    .end annotation

    .line 637
    .line 1445
    move-object v1, p0

    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->delegate:Ljava/util/Collection;

    .line 637
    check-cast v0, Ljava/util/SortedSet;

    return-object v0
.end method


# virtual methods
.method public final comparator()Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Comparator<-TV;>;"
        }
    .end annotation

    .line 642
    invoke-direct {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedSortedSet;->getSortedSetDelegate()Ljava/util/SortedSet;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/SortedSet;->comparator()Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public final first()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .line 647
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedSortedSet;->refreshIfEmpty()V

    .line 648
    invoke-direct {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedSortedSet;->getSortedSetDelegate()Ljava/util/SortedSet;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/SortedSet;->first()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final headSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Ljava/util/SortedSet<TV;>;"
        }
    .end annotation

    .line 659
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedSortedSet;->refreshIfEmpty()V

    .line 660
    new-instance v0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedSortedSet;

    iget-object v1, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedSortedSet;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    .line 2403
    move-object v5, p0

    iget-object v2, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->key:Ljava/lang/Object;

    .line 660
    invoke-direct {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedSortedSet;->getSortedSetDelegate()Ljava/util/SortedSet;

    move-result-object v3

    invoke-interface {v3, p1}, Ljava/util/SortedSet;->headSet(Ljava/lang/Object;)Ljava/util/SortedSet;

    move-result-object v3

    .line 2516
    move-object v5, p0

    iget-object v4, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->ancestor:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;

    .line 660
    if-nez v4, :cond_0

    move-object v4, p0

    goto :goto_0

    .line 3516
    :cond_0
    move-object v5, p0

    iget-object v4, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->ancestor:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;

    .line 660
    :goto_0
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedSortedSet;-><init>(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;Ljava/lang/Object;Ljava/util/SortedSet;Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;)V

    return-object v0
.end method

.method public final last()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .line 653
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedSortedSet;->refreshIfEmpty()V

    .line 654
    invoke-direct {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedSortedSet;->getSortedSetDelegate()Ljava/util/SortedSet;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/SortedSet;->last()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;TV;)Ljava/util/SortedSet<TV;>;"
        }
    .end annotation

    .line 667
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedSortedSet;->refreshIfEmpty()V

    .line 668
    new-instance v0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedSortedSet;

    iget-object v1, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedSortedSet;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    .line 4403
    move-object v5, p0

    iget-object v2, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->key:Ljava/lang/Object;

    .line 668
    invoke-direct {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedSortedSet;->getSortedSetDelegate()Ljava/util/SortedSet;

    move-result-object v3

    invoke-interface {v3, p1, p2}, Ljava/util/SortedSet;->subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;

    move-result-object v3

    .line 4516
    move-object v5, p0

    iget-object v4, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->ancestor:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;

    .line 668
    if-nez v4, :cond_0

    move-object v4, p0

    goto :goto_0

    .line 5516
    :cond_0
    move-object v5, p0

    iget-object v4, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->ancestor:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;

    .line 668
    :goto_0
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedSortedSet;-><init>(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;Ljava/lang/Object;Ljava/util/SortedSet;Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;)V

    return-object v0
.end method

.method public final tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Ljava/util/SortedSet<TV;>;"
        }
    .end annotation

    .line 675
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedSortedSet;->refreshIfEmpty()V

    .line 676
    new-instance v0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedSortedSet;

    iget-object v1, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedSortedSet;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    .line 6403
    move-object v5, p0

    iget-object v2, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->key:Ljava/lang/Object;

    .line 676
    invoke-direct {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedSortedSet;->getSortedSetDelegate()Ljava/util/SortedSet;

    move-result-object v3

    invoke-interface {v3, p1}, Ljava/util/SortedSet;->tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;

    move-result-object v3

    .line 6516
    move-object v5, p0

    iget-object v4, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->ancestor:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;

    .line 676
    if-nez v4, :cond_0

    move-object v4, p0

    goto :goto_0

    .line 7516
    :cond_0
    move-object v5, p0

    iget-object v4, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->ancestor:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;

    .line 676
    :goto_0
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedSortedSet;-><init>(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;Ljava/lang/Object;Ljava/util/SortedSet;Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;)V

    return-object v0
.end method
