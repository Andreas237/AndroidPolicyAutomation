.class abstract Lcom/squareup/haha/guava/collect/Multimaps$Entries;
.super Ljava/util/AbstractCollection;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Ljava/util/AbstractCollection<Ljava/util/Map$Entry<TK;TV;>;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1639
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 1664
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/Multimaps$Entries;->multimap()Lcom/squareup/haha/guava/collect/Multimap;

    move-result-object v0

    invoke-interface {v0}, Lcom/squareup/haha/guava/collect/Multimap;->clear()V

    .line 1665
    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1648
    instance-of v0, p1, Ljava/util/Map$Entry;

    if-eqz v0, :cond_0

    .line 1649
    move-object v3, p1

    check-cast v3, Ljava/util/Map$Entry;

    .line 1650
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/Multimaps$Entries;->multimap()Lcom/squareup/haha/guava/collect/Multimap;

    move-result-object v0

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/squareup/haha/guava/collect/Multimap;->containsEntry(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 1652
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method abstract multimap()Lcom/squareup/haha/guava/collect/Multimap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/squareup/haha/guava/collect/Multimap<TK;TV;>;"
        }
    .end annotation
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1656
    instance-of v0, p1, Ljava/util/Map$Entry;

    if-eqz v0, :cond_0

    .line 1657
    move-object v3, p1

    check-cast v3, Ljava/util/Map$Entry;

    .line 1658
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/Multimaps$Entries;->multimap()Lcom/squareup/haha/guava/collect/Multimap;

    move-result-object v0

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/squareup/haha/guava/collect/Multimap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 1660
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public size()I
    .locals 1

    .line 1644
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/Multimaps$Entries;->multimap()Lcom/squareup/haha/guava/collect/Multimap;

    move-result-object v0

    invoke-interface {v0}, Lcom/squareup/haha/guava/collect/Multimap;->size()I

    move-result v0

    return v0
.end method
