.class Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;
.super Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;
.source "SourceFile"

# interfaces
.implements Ljava/util/List;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "WrappedList"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList$WrappedListIterator;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap<TK;TV;>.WrappedCollection;Ljava/util/List<TV;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;


# direct methods
.method constructor <init>(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;Ljava/lang/Object;Ljava/util/List;Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;)V
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
            "(TK;Ljava/util/List<TV;>;Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap<TK;TV;>.WrappedCollection;)V"
        }
    .end annotation

    .line 760
    iput-object p1, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    .line 761
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;-><init>(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;Ljava/lang/Object;Ljava/util/Collection;Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;)V

    .line 762
    return-void
.end method


# virtual methods
.method public add(ILjava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITV;)V"
        }
    .end annotation

    .line 799
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->refreshIfEmpty()V

    .line 800
    .line 3445
    move-object v2, p0

    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->delegate:Ljava/util/Collection;

    .line 800
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    .line 801
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->getListDelegate()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 802
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    invoke-static {v0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;->access$208(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;)I

    .line 803
    if-eqz v1, :cond_0

    .line 804
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->addToMap()V

    .line 806
    :cond_0
    return-void
.end method

.method public addAll(ILjava/util/Collection;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/Collection<+TV;>;)Z"
        }
    .end annotation

    .line 770
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 771
    const/4 v0, 0x0

    return v0

    .line 773
    :cond_0
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->size()I

    move-result v2

    .line 774
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->getListDelegate()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    move-result v0

    .line 775
    move v3, v0

    if-eqz v0, :cond_1

    .line 776
    .line 2445
    move-object v5, p0

    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->delegate:Ljava/util/Collection;

    .line 776
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v4

    .line 777
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    sub-int v1, v4, v2

    invoke-static {v0, v1}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;->access$212(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;I)I

    .line 778
    if-nez v2, :cond_1

    .line 779
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->addToMap()V

    .line 782
    :cond_1
    return v3
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TV;"
        }
    .end annotation

    .line 787
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->refreshIfEmpty()V

    .line 788
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->getListDelegate()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method final getListDelegate()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<TV;>;"
        }
    .end annotation

    .line 765
    .line 1445
    move-object v1, p0

    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->delegate:Ljava/util/Collection;

    .line 765
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 1

    .line 819
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->refreshIfEmpty()V

    .line 820
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->getListDelegate()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    .line 825
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->refreshIfEmpty()V

    .line 826
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->getListDelegate()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->lastIndexOf(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public listIterator()Ljava/util/ListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ListIterator<TV;>;"
        }
    .end annotation

    .line 831
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->refreshIfEmpty()V

    .line 832
    new-instance v0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList$WrappedListIterator;

    invoke-direct {v0, p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList$WrappedListIterator;-><init>(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;)V

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/ListIterator<TV;>;"
        }
    .end annotation

    .line 837
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->refreshIfEmpty()V

    .line 838
    new-instance v0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList$WrappedListIterator;

    invoke-direct {v0, p0, p1}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList$WrappedListIterator;-><init>(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;I)V

    return-object v0
.end method

.method public remove(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TV;"
        }
    .end annotation

    .line 810
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->refreshIfEmpty()V

    .line 811
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->getListDelegate()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v1

    .line 812
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    invoke-static {v0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;->access$210(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;)I

    .line 813
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->removeIfEmpty()V

    .line 814
    return-object v1
.end method

.method public set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITV;)TV;"
        }
    .end annotation

    .line 793
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->refreshIfEmpty()V

    .line 794
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->getListDelegate()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public subList(II)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)Ljava/util/List<TV;>;"
        }
    .end annotation

    .line 843
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->refreshIfEmpty()V

    .line 844
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    .line 4403
    move-object v4, p0

    iget-object v1, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->key:Ljava/lang/Object;

    .line 844
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->getListDelegate()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p1, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v2

    .line 4516
    move-object v4, p0

    iget-object v3, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->ancestor:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;

    .line 844
    if-nez v3, :cond_0

    move-object v3, p0

    goto :goto_0

    .line 5516
    :cond_0
    move-object v4, p0

    iget-object v3, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->ancestor:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;

    .line 844
    :goto_0
    invoke-static {v0, v1, v2, v3}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;->access$300(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;Ljava/lang/Object;Ljava/util/List;Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
