.class public final Lcom/squareup/haha/guava/collect/Maps;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/haha/guava/collect/Maps$EntrySet;,
        Lcom/squareup/haha/guava/collect/Maps$Values;,
        Lcom/squareup/haha/guava/collect/Maps$KeySet;,
        Lcom/squareup/haha/guava/collect/Maps$ImprovedAbstractMap;,
        Lcom/squareup/haha/guava/collect/Maps$EntryFunction;
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 3453
    sget-object v2, Lcom/squareup/haha/guava/collect/Collections2;->STANDARD_JOINER:Lcom/squareup/haha/guava/base/Joiner;

    const-string v3, "="

    .line 5278
    new-instance v0, Lcom/squareup/haha/guava/base/Joiner$MapJoiner;

    const/4 v1, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/squareup/haha/guava/base/Joiner$MapJoiner;-><init>(Lcom/squareup/haha/guava/base/Joiner;Ljava/lang/String;B)V

    .line 3453
    return-void
.end method

.method public static capacity(I)I
    .locals 5

    .line 204
    const/4 v0, 0x3

    if-ge p0, v0, :cond_1

    .line 205
    const-string v4, "expectedSize"

    .line 5038
    move v3, p0

    if-gez p0, :cond_0

    .line 5039
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " cannot be negative but was: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 206
    :cond_0
    add-int/lit8 v0, p0, 0x1

    return v0

    .line 208
    :cond_1
    const/high16 v0, 0x40000000    # 2.0f

    if-ge p0, v0, :cond_2

    .line 209
    div-int/lit8 v0, p0, 0x3

    add-int/2addr v0, p0

    return v0

    .line 211
    :cond_2
    const v0, 0x7fffffff

    return v0
.end method

.method public static immutableEntry(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(TK;TV;)Ljava/util/Map$Entry<TK;TV;>;"
        }
    .end annotation

    .line 1207
    new-instance v0, Lcom/squareup/haha/guava/collect/ImmutableEntry;

    invoke-direct {v0, p0, p1}, Lcom/squareup/haha/guava/collect/ImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method static keyIterator(Ljava/util/Iterator;)Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/util/Iterator<Ljava/util/Map$Entry<TK;TV;>;>;)Ljava/util/Iterator<TK;>;"
        }
    .end annotation

    .line 113
    .line 4104
    sget-object v0, Lcom/squareup/haha/guava/collect/Maps$EntryFunction;->KEY:Lcom/squareup/haha/guava/collect/Maps$EntryFunction;

    .line 113
    invoke-static {p0, v0}, Lcom/squareup/haha/guava/collect/Iterators;->transform(Ljava/util/Iterator;Lcom/squareup/haha/guava/base/Function;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public static newHashMap()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:Ljava/lang/Object;V:Ljava/lang/Object;>()Ljava/util/HashMap<TK;TV;>;"
        }
    .end annotation

    .line 177
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    return-object v0
.end method

.method static safeContainsKey(Ljava/util/Map;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<**>;Ljava/lang/Object;)Z"
        }
    .end annotation

    .line 3361
    invoke-static {p0}, Lcom/squareup/haha/guava/base/Joiner;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3363
    :try_start_0
    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    return v0

    .line 3364
    .line 3365
    :catch_0
    const/4 v0, 0x0

    return v0

    .line 3366
    .line 3367
    :catch_1
    const/4 v0, 0x0

    return v0
.end method

.method static safeGet(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:Ljava/lang/Object;>(Ljava/util/Map<*TV;>;Ljava/lang/Object;)TV;"
        }
    .end annotation

    .line 3346
    invoke-static {p0}, Lcom/squareup/haha/guava/base/Joiner;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3348
    :try_start_0
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    .line 3349
    .line 3350
    :catch_0
    const/4 v0, 0x0

    return-object v0

    .line 3351
    .line 3352
    :catch_1
    const/4 v0, 0x0

    return-object v0
.end method

.method static safeRemove(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:Ljava/lang/Object;>(Ljava/util/Map<*TV;>;Ljava/lang/Object;)TV;"
        }
    .end annotation

    .line 3376
    invoke-static {p0}, Lcom/squareup/haha/guava/base/Joiner;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3378
    :try_start_0
    invoke-interface {p0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    .line 3379
    .line 3380
    :catch_0
    const/4 v0, 0x0

    return-object v0

    .line 3381
    .line 3382
    :catch_1
    const/4 v0, 0x0

    return-object v0
.end method

.method static valueIterator(Ljava/util/Iterator;)Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/util/Iterator<Ljava/util/Map$Entry<TK;TV;>;>;)Ljava/util/Iterator<TV;>;"
        }
    .end annotation

    .line 117
    .line 4109
    sget-object v0, Lcom/squareup/haha/guava/collect/Maps$EntryFunction;->VALUE:Lcom/squareup/haha/guava/collect/Maps$EntryFunction;

    .line 117
    invoke-static {p0, v0}, Lcom/squareup/haha/guava/collect/Iterators;->transform(Ljava/util/Iterator;Lcom/squareup/haha/guava/base/Function;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
