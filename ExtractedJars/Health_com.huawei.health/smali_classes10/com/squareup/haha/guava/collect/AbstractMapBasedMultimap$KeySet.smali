.class Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$KeySet;
.super Lcom/squareup/haha/guava/collect/Maps$KeySet;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "KeySet"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/haha/guava/collect/Maps$KeySet<TK;Ljava/util/Collection<TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;


# direct methods
.method constructor <init>(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<TK;Ljava/util/Collection<TV;>;>;)V"
        }
    .end annotation

    .line 920
    iput-object p1, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$KeySet;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    .line 921
    invoke-direct {p0, p2}, Lcom/squareup/haha/guava/collect/Maps$KeySet;-><init>(Ljava/util/Map;)V

    .line 922
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 965
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$KeySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/haha/guava/collect/Iterators;->clear(Ljava/util/Iterator;)V

    .line 966
    return-void
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<*>;)Z"
        }
    .end annotation

    .line 969
    .line 6484
    move-object v1, p0

    iget-object v0, p0, Lcom/squareup/haha/guava/collect/Maps$KeySet;->map:Ljava/util/Map;

    .line 969
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 973
    if-eq p0, p1, :cond_0

    .line 7484
    move-object v1, p0

    iget-object v0, p0, Lcom/squareup/haha/guava/collect/Maps$KeySet;->map:Ljava/util/Map;

    .line 973
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 977
    .line 8484
    move-object v1, p0

    iget-object v0, p0, Lcom/squareup/haha/guava/collect/Maps$KeySet;->map:Ljava/util/Map;

    .line 977
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->hashCode()I

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Iterator<TK;>;"
        }
    .end annotation

    .line 925
    .line 4484
    move-object v2, p0

    iget-object v0, p0, Lcom/squareup/haha/guava/collect/Maps$KeySet;->map:Ljava/util/Map;

    .line 925
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 927
    new-instance v0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$KeySet$1;

    invoke-direct {v0, p0, v1}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$KeySet$1;-><init>(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$KeySet;Ljava/util/Iterator;)V

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 4

    .line 953
    const/4 v1, 0x0

    .line 954
    .line 5484
    move-object v3, p0

    iget-object v0, p0, Lcom/squareup/haha/guava/collect/Maps$KeySet;->map:Ljava/util/Map;

    .line 954
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    .line 955
    if-eqz v2, :cond_0

    .line 956
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v1

    .line 957
    invoke-interface {v2}, Ljava/util/Collection;->clear()V

    .line 958
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$KeySet;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    invoke-static {v0, v1}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;->access$220(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;I)I

    .line 960
    :cond_0
    if-lez v1, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method
