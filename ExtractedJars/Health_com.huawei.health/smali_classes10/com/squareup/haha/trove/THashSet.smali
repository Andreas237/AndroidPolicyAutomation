.class public Lcom/squareup/haha/trove/THashSet;
.super Lcom/squareup/haha/trove/TObjectHash;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/haha/trove/THashSet$HashProcedure;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:Ljava/lang/Object;>Lcom/squareup/haha/trove/TObjectHash<TE;>;Ljava/util/Set<TE;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/squareup/haha/trove/TObjectHash;-><init>()V

    .line 48
    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .line 139
    invoke-virtual {p0, p1}, Lcom/squareup/haha/trove/THashSet;->insertionIndex(Ljava/lang/Object;)I

    move-result v0

    .line 141
    move v1, v0

    if-gez v0, :cond_0

    .line 142
    const/4 v0, 0x0

    return v0

    .line 145
    :cond_0
    iget-object v0, p0, Lcom/squareup/haha/trove/THashSet;->_set:[Ljava/lang/Object;

    aget-object v2, v0, v1

    .line 146
    iget-object v0, p0, Lcom/squareup/haha/trove/THashSet;->_set:[Ljava/lang/Object;

    aput-object p1, v0, v1

    .line 148
    if-nez v2, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lcom/squareup/haha/trove/THashSet;->postInsertHook(Z)V

    .line 149
    const/4 v0, 0x1

    return v0
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<+TE;>;)Z"
        }
    .end annotation

    .line 313
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    .line 315
    invoke-virtual {p0, v1}, Lcom/squareup/haha/trove/THashSet;->ensureCapacity(I)V

    .line 316
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 317
    const/4 v3, 0x0

    .line 318
    :cond_0
    :goto_0
    move v0, v1

    add-int/lit8 v1, v1, -0x1

    if-lez v0, :cond_1

    .line 319
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/squareup/haha/trove/THashSet;->add(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 320
    const/4 v3, 0x1

    goto :goto_0

    .line 323
    :cond_1
    return v3
.end method

.method public clear()V
    .locals 3

    .line 253
    invoke-super {p0}, Lcom/squareup/haha/trove/TObjectHash;->clear()V

    .line 254
    iget-object v1, p0, Lcom/squareup/haha/trove/THashSet;->_set:[Ljava/lang/Object;

    .line 256
    array-length v2, v1

    :goto_0
    move v0, v2

    add-int/lit8 v2, v2, -0x1

    if-lez v0, :cond_0

    .line 257
    const/4 v0, 0x0

    aput-object v0, v1, v2

    goto :goto_0

    .line 259
    :cond_0
    return-void
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<*>;)Z"
        }
    .end annotation

    .line 297
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 298
    invoke-virtual {p0, v2}, Lcom/squareup/haha/trove/THashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 299
    const/4 v0, 0x0

    return v0

    .line 301
    :cond_0
    goto :goto_0

    .line 302
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 153
    instance-of v0, p1, Ljava/util/Set;

    if-nez v0, :cond_0

    .line 154
    const/4 v0, 0x0

    return v0

    .line 156
    :cond_0
    move-object v2, p1

    check-cast v2, Ljava/util/Set;

    .line 157
    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v0

    invoke-virtual {p0}, Lcom/squareup/haha/trove/THashSet;->size()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 158
    const/4 v0, 0x0

    return v0

    .line 160
    :cond_1
    invoke-virtual {p0, v2}, Lcom/squareup/haha/trove/THashSet;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 164
    new-instance v1, Lcom/squareup/haha/trove/THashSet$HashProcedure;

    invoke-direct {v1, p0}, Lcom/squareup/haha/trove/THashSet$HashProcedure;-><init>(Lcom/squareup/haha/trove/THashSet;)V

    .line 165
    invoke-virtual {p0, v1}, Lcom/squareup/haha/trove/THashSet;->forEach(Lcom/squareup/haha/trove/TObjectProcedure;)Z

    .line 166
    .line 1176
    move-object v2, v1

    iget v0, v1, Lcom/squareup/haha/trove/THashSet$HashProcedure;->h:I

    .line 166
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Iterator<TE;>;"
        }
    .end annotation

    .line 285
    new-instance v0, Lcom/squareup/haha/trove/TObjectHashIterator;

    invoke-direct {v0, p0}, Lcom/squareup/haha/trove/TObjectHashIterator;-><init>(Lcom/squareup/haha/trove/TObjectHash;)V

    return-object v0
.end method

.method protected rehash(I)V
    .locals 8

    .line 193
    iget-object v0, p0, Lcom/squareup/haha/trove/THashSet;->_set:[Ljava/lang/Object;

    array-length v3, v0

    .line 194
    iget-object v4, p0, Lcom/squareup/haha/trove/THashSet;->_set:[Ljava/lang/Object;

    .line 196
    new-array v0, p1, [Ljava/lang/Object;

    iput-object v0, p0, Lcom/squareup/haha/trove/THashSet;->_set:[Ljava/lang/Object;

    .line 198
    move v5, v3

    :cond_0
    :goto_0
    move v0, v5

    add-int/lit8 v5, v5, -0x1

    if-lez v0, :cond_2

    .line 199
    aget-object v0, v4, v5

    if-eqz v0, :cond_0

    aget-object v0, v4, v5

    sget-object v1, Lcom/squareup/haha/trove/THashSet;->REMOVED:Ljava/lang/Object;

    if-eq v0, v1, :cond_0

    .line 200
    aget-object v6, v4, v5

    .line 201
    invoke-virtual {p0, v6}, Lcom/squareup/haha/trove/THashSet;->insertionIndex(Ljava/lang/Object;)I

    move-result v0

    .line 202
    move v7, v0

    if-gez v0, :cond_1

    .line 203
    iget-object v0, p0, Lcom/squareup/haha/trove/THashSet;->_set:[Ljava/lang/Object;

    neg-int v1, v7

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    invoke-virtual {p0, v0, v6}, Lcom/squareup/haha/trove/THashSet;->throwObjectContractViolation(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 205
    :cond_1
    iget-object v0, p0, Lcom/squareup/haha/trove/THashSet;->_set:[Ljava/lang/Object;

    aput-object v6, v0, v7

    .line 206
    goto :goto_0

    .line 208
    :cond_2
    return-void
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 2

    .line 269
    invoke-virtual {p0, p1}, Lcom/squareup/haha/trove/THashSet;->index(Ljava/lang/Object;)I

    move-result v0

    .line 270
    move v1, v0

    if-ltz v0, :cond_0

    .line 271
    invoke-virtual {p0, v1}, Lcom/squareup/haha/trove/THashSet;->removeAt(I)V

    .line 272
    const/4 v0, 0x1

    return v0

    .line 274
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<*>;)Z"
        }
    .end annotation

    .line 334
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    .line 336
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 337
    const/4 v3, 0x0

    .line 338
    :cond_0
    :goto_0
    move v0, v1

    add-int/lit8 v1, v1, -0x1

    if-lez v0, :cond_1

    .line 339
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/squareup/haha/trove/THashSet;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 340
    const/4 v3, 0x1

    goto :goto_0

    .line 343
    :cond_1
    return v3
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<*>;)Z"
        }
    .end annotation

    .line 355
    invoke-virtual {p0}, Lcom/squareup/haha/trove/THashSet;->size()I

    move-result v1

    .line 357
    invoke-virtual {p0}, Lcom/squareup/haha/trove/THashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 358
    const/4 v3, 0x0

    .line 359
    :cond_0
    :goto_0
    move v0, v1

    add-int/lit8 v1, v1, -0x1

    if-lez v0, :cond_1

    .line 360
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 361
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 362
    const/4 v3, 0x1

    goto :goto_0

    .line 365
    :cond_1
    return v3
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 2

    .line 217
    invoke-virtual {p0}, Lcom/squareup/haha/trove/THashSet;->size()I

    move-result v0

    new-array v1, v0, [Ljava/lang/Object;

    .line 218
    new-instance v0, Lcom/squareup/haha/trove/ToObjectArrayProcedure;

    invoke-direct {v0, v1}, Lcom/squareup/haha/trove/ToObjectArrayProcedure;-><init>([Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/squareup/haha/trove/THashSet;->forEach(Lcom/squareup/haha/trove/TObjectProcedure;)Z

    .line 219
    return-object v1
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>([TT;)[TT;"
        }
    .end annotation

    .line 230
    invoke-virtual {p0}, Lcom/squareup/haha/trove/THashSet;->size()I

    move-result v1

    .line 231
    array-length v0, p1

    if-ge v0, v1, :cond_0

    .line 232
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    move-object p1, v0

    check-cast p1, [Ljava/lang/Object;

    .line 234
    :cond_0
    move-object v2, p1

    .line 236
    invoke-virtual {p0}, Lcom/squareup/haha/trove/THashSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 237
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_1

    .line 238
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v2, v4

    .line 237
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 241
    :cond_1
    array-length v0, p1

    if-le v0, v1, :cond_2

    .line 242
    const/4 v0, 0x0

    aput-object v0, p1, v1

    .line 245
    :cond_2
    return-object p1
.end method
