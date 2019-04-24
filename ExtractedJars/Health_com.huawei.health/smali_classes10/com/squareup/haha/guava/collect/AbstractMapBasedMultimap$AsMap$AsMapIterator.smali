.class final Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap$AsMapIterator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "AsMapIterator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Iterator<Ljava/util/Map$Entry<TK;Ljava/util/Collection<TV;>;>;>;"
    }
.end annotation


# instance fields
.field private collection:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<TV;>;"
        }
    .end annotation
.end field

.field private delegateIterator:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<Ljava/util/Map$Entry<TK;Ljava/util/Collection<TV;>;>;>;"
        }
    .end annotation
.end field

.field private synthetic this$1:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap;


# direct methods
.method constructor <init>(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap;)V
    .locals 1

    .line 1337
    iput-object p1, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap$AsMapIterator;->this$1:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1338
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap$AsMapIterator;->this$1:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap;

    iget-object v0, v0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap;->submap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap$AsMapIterator;->delegateIterator:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1344
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap$AsMapIterator;->delegateIterator:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final synthetic next()Ljava/lang/Object;
    .locals 7

    .line 1337
    .line 2349
    move-object v2, p0

    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap$AsMapIterator;->delegateIterator:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/Map$Entry;

    .line 2350
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    iput-object v0, v2, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap$AsMapIterator;->collection:Ljava/util/Collection;

    .line 2351
    iget-object v4, v2, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap$AsMapIterator;->this$1:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap;

    move-object v5, v3

    .line 3306
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    .line 3307
    iget-object v0, v4, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v0, v6, v1}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;->wrapCollection(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    invoke-static {v6, v0}, Lcom/squareup/haha/guava/collect/Maps;->immutableEntry(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v0

    .line 1337
    return-object v0
.end method

.method public final remove()V
    .locals 2

    .line 1356
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap$AsMapIterator;->delegateIterator:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 1357
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap$AsMapIterator;->this$1:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap;

    iget-object v0, v0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    iget-object v1, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap$AsMapIterator;->collection:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-static {v0, v1}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;->access$220(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;I)I

    .line 1358
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap$AsMapIterator;->collection:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    .line 1359
    return-void
.end method
