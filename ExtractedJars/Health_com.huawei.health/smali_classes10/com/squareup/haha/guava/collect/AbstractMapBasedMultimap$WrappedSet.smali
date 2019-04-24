.class final Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedSet;
.super Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "WrappedSet"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap<TK;TV;>.WrappedCollection;Ljava/util/Set<TV;>;"
    }
.end annotation


# instance fields
.field private synthetic this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;


# direct methods
.method constructor <init>(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;Ljava/lang/Object;Ljava/util/Set;)V
    .locals 1
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;Ljava/util/Set<TV;>;)V"
        }
    .end annotation

    .line 602
    iput-object p1, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedSet;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    .line 603
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;-><init>(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;Ljava/lang/Object;Ljava/util/Collection;Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;)V

    .line 604
    return-void
.end method


# virtual methods
.method public final removeAll(Ljava/util/Collection;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<*>;)Z"
        }
    .end annotation

    .line 608
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 609
    const/4 v0, 0x0

    return v0

    .line 611
    :cond_0
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedSet;->size()I

    move-result v2

    .line 616
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedSet;->delegate:Ljava/util/Collection;

    check-cast v0, Ljava/util/Set;

    invoke-static {v0, p1}, Lcom/squareup/haha/guava/base/Joiner;->removeAllImpl(Ljava/util/Set;Ljava/util/Collection;)Z

    move-result v0

    .line 617
    move v3, v0

    if-eqz v0, :cond_1

    .line 618
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedSet;->delegate:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v4

    .line 619
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedSet;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    sub-int v1, v4, v2

    invoke-static {v0, v1}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;->access$212(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;I)I

    .line 620
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedSet;->removeIfEmpty()V

    .line 622
    :cond_1
    return v3
.end method
