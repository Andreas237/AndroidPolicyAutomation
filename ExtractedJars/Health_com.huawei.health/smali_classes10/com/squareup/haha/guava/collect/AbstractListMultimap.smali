.class abstract Lcom/squareup/haha/guava/collect/AbstractListMultimap;
.super Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;
.source "SourceFile"

# interfaces
.implements Lcom/squareup/haha/guava/collect/ListMultimap;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap<TK;TV;>;Lcom/squareup/haha/guava/collect/ListMultimap<TK;TV;>;"
    }
.end annotation


# direct methods
.method protected constructor <init>(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<TK;Ljava/util/Collection<TV;>;>;)V"
        }
    .end annotation

    .line 46
    invoke-direct {p0, p1}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;-><init>(Ljava/util/Map;)V

    .line 47
    return-void
.end method


# virtual methods
.method public asMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<TK;Ljava/util/Collection<TV;>;>;"
        }
    .end annotation

    .line 110
    invoke-super {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;->asMap()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method bridge synthetic createCollection()Ljava/util/Collection;
    .locals 1

    .line 36
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractListMultimap;->createCollection()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method abstract createCollection()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<TV;>;"
        }
    .end annotation
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 121
    invoke-super {p0, p1}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic get(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 1

    .line 36
    invoke-virtual {p0, p1}, Lcom/squareup/haha/guava/collect/AbstractListMultimap;->get(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public get(Ljava/lang/Object;)Ljava/util/List;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)Ljava/util/List<TV;>;"
        }
    .end annotation

    .line 66
    invoke-super {p0, p1}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;->get(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)Z"
        }
    .end annotation

    .line 100
    invoke-super {p0, p1, p2}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
