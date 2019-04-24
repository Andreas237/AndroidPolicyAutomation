.class Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap;
.super Lcom/squareup/haha/guava/collect/Maps$ImprovedAbstractMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "AsMap"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap$AsMapIterator;,
        Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap$AsMapEntries;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/haha/guava/collect/Maps$ImprovedAbstractMap<TK;Ljava/util/Collection<TV;>;>;"
    }
.end annotation


# instance fields
.field final transient submap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<TK;Ljava/util/Collection<TV;>;>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;


# direct methods
.method constructor <init>(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<TK;Ljava/util/Collection<TV;>;>;)V"
        }
    .end annotation

    .line 1237
    iput-object p1, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    invoke-direct {p0}, Lcom/squareup/haha/guava/collect/Maps$ImprovedAbstractMap;-><init>()V

    .line 1238
    iput-object p2, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap;->submap:Ljava/util/Map;

    .line 1239
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 2

    .line 1298
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap;->submap:Ljava/util/Map;

    iget-object v1, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    invoke-static {v1}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;->access$000(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;)Ljava/util/Map;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 1299
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    invoke-virtual {v0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;->clear()V

    return-void

    .line 1301
    :cond_0
    new-instance v0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap$AsMapIterator;

    invoke-direct {v0, p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap$AsMapIterator;-><init>(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap;)V

    invoke-static {v0}, Lcom/squareup/haha/guava/collect/Iterators;->clear(Ljava/util/Iterator;)V

    .line 1303
    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 1249
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap;->submap:Ljava/util/Map;

    invoke-static {v0, p1}, Lcom/squareup/haha/guava/collect/Maps;->safeContainsKey(Ljava/util/Map;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method protected final createEntrySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Set<Ljava/util/Map$Entry<TK;Ljava/util/Collection<TV;>;>;>;"
        }
    .end annotation

    .line 1243
    new-instance v0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap$AsMapEntries;

    invoke-direct {v0, p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap$AsMapEntries;-><init>(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1285
    if-eq p0, p1, :cond_0

    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap;->submap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1230
    move-object v2, p1

    .line 3253
    move-object v1, p0

    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap;->submap:Ljava/util/Map;

    invoke-static {v0, v2}, Lcom/squareup/haha/guava/collect/Maps;->safeGet(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    .line 3254
    if-nez v3, :cond_0

    .line 3255
    const/4 v0, 0x0

    return-object v0

    .line 3258
    :cond_0
    move-object v4, v2

    .line 3259
    iget-object v0, v1, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    invoke-virtual {v0, v4, v3}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;->wrapCollection(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    .line 1230
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 1289
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap;->submap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->hashCode()I

    move-result v0

    return v0
.end method

.method public keySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Set<TK;>;"
        }
    .end annotation

    .line 1263
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    invoke-virtual {v0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public synthetic remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1230
    move-object v3, p1

    .line 2272
    move-object v2, p0

    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap;->submap:Ljava/util/Map;

    invoke-interface {v0, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/Collection;

    .line 2273
    if-nez v4, :cond_0

    .line 2274
    const/4 v0, 0x0

    return-object v0

    .line 2277
    :cond_0
    iget-object v0, v2, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    invoke-virtual {v0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;->createCollection()Ljava/util/Collection;

    move-result-object v5

    .line 2278
    invoke-interface {v5, v4}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 2279
    iget-object v0, v2, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-static {v0, v1}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;->access$220(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;I)I

    .line 2280
    invoke-interface {v4}, Ljava/util/Collection;->clear()V

    .line 1230
    .line 2281
    return-object v5
.end method

.method public size()I
    .locals 1

    .line 1268
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap;->submap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1293
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$AsMap;->submap:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
