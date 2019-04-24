.class final Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList$WrappedListIterator;
.super Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection$WrappedIterator;
.source "SourceFile"

# interfaces
.implements Ljava/util/ListIterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "WrappedListIterator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap<TK;TV;>.WrappedCollection.WrappedIterator;Ljava/util/ListIterator<TV;>;"
    }
.end annotation


# instance fields
.field private synthetic this$1:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;


# direct methods
.method constructor <init>(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;)V
    .locals 0

    .line 852
    iput-object p1, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList$WrappedListIterator;->this$1:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;

    invoke-direct {p0, p1}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection$WrappedIterator;-><init>(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;)V

    return-void
.end method

.method public constructor <init>(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;I)V
    .locals 1

    .line 854
    iput-object p1, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList$WrappedListIterator;->this$1:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;

    .line 855
    invoke-virtual {p1}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->getListDelegate()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection$WrappedIterator;-><init>(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;Ljava/util/Iterator;)V

    .line 856
    return-void
.end method

.method private getDelegateListIterator()Ljava/util/ListIterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ListIterator<TV;>;"
        }
    .end annotation

    .line 859
    .line 1497
    move-object v1, p0

    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection$WrappedIterator;->validateIterator()V

    .line 1498
    iget-object v0, v1, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection$WrappedIterator;->delegateIterator:Ljava/util/Iterator;

    .line 859
    check-cast v0, Ljava/util/ListIterator;

    return-object v0
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    .line 889
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList$WrappedListIterator;->this$1:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;

    invoke-virtual {v0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->isEmpty()Z

    move-result v1

    .line 890
    invoke-direct {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList$WrappedListIterator;->getDelegateListIterator()Ljava/util/ListIterator;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/ListIterator;->add(Ljava/lang/Object;)V

    .line 891
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList$WrappedListIterator;->this$1:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;

    iget-object v0, v0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    invoke-static {v0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;->access$208(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;)I

    .line 892
    if-eqz v1, :cond_0

    .line 893
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList$WrappedListIterator;->this$1:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;

    invoke-virtual {v0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;->addToMap()V

    .line 895
    :cond_0
    return-void
.end method

.method public final hasPrevious()Z
    .locals 1

    .line 864
    invoke-direct {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList$WrappedListIterator;->getDelegateListIterator()Ljava/util/ListIterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    return v0
.end method

.method public final nextIndex()I
    .locals 1

    .line 874
    invoke-direct {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList$WrappedListIterator;->getDelegateListIterator()Ljava/util/ListIterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    move-result v0

    return v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .line 869
    invoke-direct {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList$WrappedListIterator;->getDelegateListIterator()Ljava/util/ListIterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final previousIndex()I
    .locals 1

    .line 879
    invoke-direct {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList$WrappedListIterator;->getDelegateListIterator()Ljava/util/ListIterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/ListIterator;->previousIndex()I

    move-result v0

    return v0
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    .line 884
    invoke-direct {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList$WrappedListIterator;->getDelegateListIterator()Ljava/util/ListIterator;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    .line 885
    return-void
.end method
