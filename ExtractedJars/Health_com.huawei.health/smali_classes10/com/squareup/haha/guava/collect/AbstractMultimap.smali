.class abstract Lcom/squareup/haha/guava/collect/AbstractMultimap;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/squareup/haha/guava/collect/Multimap;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/haha/guava/collect/AbstractMultimap$Values;,
        Lcom/squareup/haha/guava/collect/AbstractMultimap$EntrySet;,
        Lcom/squareup/haha/guava/collect/AbstractMultimap$Entries;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Ljava/lang/Object;Lcom/squareup/haha/guava/collect/Multimap<TK;TV;>;"
    }
.end annotation


# instance fields
.field private transient asMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<TK;Ljava/util/Collection<TV;>;>;"
        }
    .end annotation
.end field

.field private transient entries:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<Ljava/util/Map$Entry<TK;TV;>;>;"
        }
    .end annotation
.end field

.field private transient keySet:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<TK;>;"
        }
    .end annotation
.end field

.field private transient values:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 181
    return-void
.end method


# virtual methods
.method public asMap()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<TK;Ljava/util/Collection<TV;>;>;"
        }
    .end annotation

    .line 207
    iget-object v1, p0, Lcom/squareup/haha/guava/collect/AbstractMultimap;->asMap:Ljava/util/Map;

    .line 208
    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMultimap;->createAsMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMultimap;->asMap:Ljava/util/Map;

    return-object v0

    :cond_0
    return-object v1
.end method

.method public containsEntry(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 57
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMultimap;->asMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    .line 58
    if-eqz v1, :cond_0

    invoke-interface {v1, p2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 46
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMultimap;->asMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    .line 47
    invoke-interface {v2, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 48
    const/4 v0, 0x1

    return v0

    .line 50
    :cond_0
    goto :goto_0

    .line 52
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method abstract createAsMap()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<TK;Ljava/util/Collection<TV;>;>;"
        }
    .end annotation
.end method

.method createKeySet()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Set<TK;>;"
        }
    .end annotation

    .line 154
    new-instance v0, Lcom/squareup/haha/guava/collect/Maps$KeySet;

    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMultimap;->asMap()Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/squareup/haha/guava/collect/Maps$KeySet;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public entries()Ljava/util/Collection;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Collection<Ljava/util/Map$Entry<TK;TV;>;>;"
        }
    .end annotation

    .line 107
    iget-object v2, p0, Lcom/squareup/haha/guava/collect/AbstractMultimap;->entries:Ljava/util/Collection;

    .line 108
    if-nez v2, :cond_1

    .line 2112
    move-object v3, p0

    instance-of v0, p0, Lcom/squareup/haha/guava/collect/SetMultimap;

    if-eqz v0, :cond_0

    .line 2113
    new-instance v0, Lcom/squareup/haha/guava/collect/AbstractMultimap$EntrySet;

    const/4 v1, 0x0

    invoke-direct {v0, v3, v1}, Lcom/squareup/haha/guava/collect/AbstractMultimap$EntrySet;-><init>(Lcom/squareup/haha/guava/collect/AbstractMultimap;B)V

    goto :goto_0

    .line 2115
    :cond_0
    new-instance v0, Lcom/squareup/haha/guava/collect/AbstractMultimap$Entries;

    const/4 v1, 0x0

    invoke-direct {v0, v3, v1}, Lcom/squareup/haha/guava/collect/AbstractMultimap$Entries;-><init>(Lcom/squareup/haha/guava/collect/AbstractMultimap;B)V

    .line 108
    :goto_0
    iput-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMultimap;->entries:Ljava/util/Collection;

    return-object v0

    :cond_1
    return-object v2
.end method

.method abstract entryIterator()Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Iterator<Ljava/util/Map$Entry<TK;TV;>;>;"
        }
    .end annotation
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 216
    move-object v3, p1

    move-object v2, p0

    .line 3048
    if-ne v3, v2, :cond_0

    .line 3049
    const/4 v0, 0x1

    return v0

    .line 3051
    :cond_0
    instance-of v0, v3, Lcom/squareup/haha/guava/collect/Multimap;

    if-eqz v0, :cond_1

    .line 3052
    move-object v4, v3

    check-cast v4, Lcom/squareup/haha/guava/collect/Multimap;

    .line 3053
    invoke-interface {v2}, Lcom/squareup/haha/guava/collect/Multimap;->asMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v4}, Lcom/squareup/haha/guava/collect/Multimap;->asMap()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 216
    .line 3055
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 228
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMultimap;->asMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->hashCode()I

    move-result v0

    return v0
.end method

.method public keySet()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Set<TK;>;"
        }
    .end annotation

    .line 149
    iget-object v1, p0, Lcom/squareup/haha/guava/collect/AbstractMultimap;->keySet:Ljava/util/Set;

    .line 150
    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMultimap;->createKeySet()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMultimap;->keySet:Ljava/util/Set;

    return-object v0

    :cond_0
    return-object v1
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

    .line 69
    invoke-virtual {p0, p1}, Lcom/squareup/haha/guava/collect/AbstractMultimap;->get(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 63
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMultimap;->asMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    .line 64
    if-eqz v1, :cond_0

    invoke-interface {v1, p2}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 239
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMultimap;->asMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method valueIterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Iterator<TV;>;"
        }
    .end annotation

    .line 200
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMultimap;->entries()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/haha/guava/collect/Maps;->valueIterator(Ljava/util/Iterator;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public values()Ljava/util/Collection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Collection<TV;>;"
        }
    .end annotation

    .line 173
    iget-object v1, p0, Lcom/squareup/haha/guava/collect/AbstractMultimap;->values:Ljava/util/Collection;

    .line 174
    if-nez v1, :cond_0

    move-object v2, p0

    .line 2178
    new-instance v0, Lcom/squareup/haha/guava/collect/AbstractMultimap$Values;

    invoke-direct {v0, v2}, Lcom/squareup/haha/guava/collect/AbstractMultimap$Values;-><init>(Lcom/squareup/haha/guava/collect/AbstractMultimap;)V

    .line 174
    iput-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMultimap;->values:Ljava/util/Collection;

    return-object v0

    :cond_0
    return-object v1
.end method
