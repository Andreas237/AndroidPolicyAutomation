.class public final Lcom/squareup/haha/guava/collect/ArrayListMultimap;
.super Lcom/squareup/haha/guava/collect/AbstractListMultimap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Lcom/squareup/haha/guava/collect/AbstractListMultimap<TK;TV;>;"
    }
.end annotation


# instance fields
.field private transient expectedValuesPerKey:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 107
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-direct {p0, v0}, Lcom/squareup/haha/guava/collect/AbstractListMultimap;-><init>(Ljava/util/Map;)V

    .line 108
    const/4 v0, 0x3

    iput v0, p0, Lcom/squareup/haha/guava/collect/ArrayListMultimap;->expectedValuesPerKey:I

    .line 109
    return-void
.end method

.method public static create()Lcom/squareup/haha/guava/collect/ArrayListMultimap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:Ljava/lang/Object;V:Ljava/lang/Object;>()Lcom/squareup/haha/guava/collect/ArrayListMultimap<TK;TV;>;"
        }
    .end annotation

    .line 78
    new-instance v0, Lcom/squareup/haha/guava/collect/ArrayListMultimap;

    invoke-direct {v0}, Lcom/squareup/haha/guava/collect/ArrayListMultimap;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic asMap()Ljava/util/Map;
    .locals 1

    .line 66
    invoke-super {p0}, Lcom/squareup/haha/guava/collect/AbstractListMultimap;->asMap()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic clear()V
    .locals 0

    .line 66
    invoke-super {p0}, Lcom/squareup/haha/guava/collect/AbstractListMultimap;->clear()V

    return-void
.end method

.method public final bridge synthetic containsEntry(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 66
    invoke-super {p0, p1, p2}, Lcom/squareup/haha/guava/collect/AbstractListMultimap;->containsEntry(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic containsValue(Ljava/lang/Object;)Z
    .locals 1

    .line 66
    invoke-super {p0, p1}, Lcom/squareup/haha/guava/collect/AbstractListMultimap;->containsValue(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method final bridge synthetic createCollection()Ljava/util/Collection;
    .locals 1

    .line 66
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/ArrayListMultimap;->createCollection()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method final createCollection()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<TV;>;"
        }
    .end annotation

    .line 130
    new-instance v0, Ljava/util/ArrayList;

    iget v1, p0, Lcom/squareup/haha/guava/collect/ArrayListMultimap;->expectedValuesPerKey:I

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    return-object v0
.end method

.method public final bridge synthetic entries()Ljava/util/Collection;
    .locals 1

    .line 66
    invoke-super {p0}, Lcom/squareup/haha/guava/collect/AbstractListMultimap;->entries()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic equals(Ljava/lang/Object;)Z
    .locals 1

    .line 66
    invoke-super {p0, p1}, Lcom/squareup/haha/guava/collect/AbstractListMultimap;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic get(Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    .line 66
    invoke-super {p0, p1}, Lcom/squareup/haha/guava/collect/AbstractListMultimap;->get(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic hashCode()I
    .locals 1

    .line 66
    invoke-super {p0}, Lcom/squareup/haha/guava/collect/AbstractListMultimap;->hashCode()I

    move-result v0

    return v0
.end method

.method public final bridge synthetic keySet()Ljava/util/Set;
    .locals 1

    .line 66
    invoke-super {p0}, Lcom/squareup/haha/guava/collect/AbstractListMultimap;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic put(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 66
    invoke-super {p0, p1, p2}, Lcom/squareup/haha/guava/collect/AbstractListMultimap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 66
    invoke-super {p0, p1, p2}, Lcom/squareup/haha/guava/collect/AbstractListMultimap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic size()I
    .locals 1

    .line 66
    invoke-super {p0}, Lcom/squareup/haha/guava/collect/AbstractListMultimap;->size()I

    move-result v0

    return v0
.end method

.method public final bridge synthetic toString()Ljava/lang/String;
    .locals 1

    .line 66
    invoke-super {p0}, Lcom/squareup/haha/guava/collect/AbstractListMultimap;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic values()Ljava/util/Collection;
    .locals 1

    .line 66
    invoke-super {p0}, Lcom/squareup/haha/guava/collect/AbstractListMultimap;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
