.class abstract Lcom/squareup/haha/trove/THashIterator;
.super Lcom/squareup/haha/trove/TIterator;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:Ljava/lang/Object;>Lcom/squareup/haha/trove/TIterator;Ljava/util/Iterator<TV;>;"
    }
.end annotation


# instance fields
.field private _hash:Lcom/squareup/haha/trove/TObjectHash;


# direct methods
.method public constructor <init>(Lcom/squareup/haha/trove/TObjectHash;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Lcom/squareup/haha/trove/TIterator;-><init>(Lcom/squareup/haha/trove/THash;)V

    .line 54
    iput-object p1, p0, Lcom/squareup/haha/trove/THashIterator;->_hash:Lcom/squareup/haha/trove/TObjectHash;

    .line 55
    return-void
.end method


# virtual methods
.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .line 68
    invoke-virtual {p0}, Lcom/squareup/haha/trove/THashIterator;->moveToNextIndex()V

    .line 69
    iget v0, p0, Lcom/squareup/haha/trove/THashIterator;->_index:I

    invoke-virtual {p0, v0}, Lcom/squareup/haha/trove/THashIterator;->objectAtIndex(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected final nextIndex()I
    .locals 4

    .line 83
    iget v0, p0, Lcom/squareup/haha/trove/THashIterator;->_expectedSize:I

    iget-object v1, p0, Lcom/squareup/haha/trove/THashIterator;->_hash:Lcom/squareup/haha/trove/TObjectHash;

    invoke-virtual {v1}, Lcom/squareup/haha/trove/TObjectHash;->size()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 84
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    .line 87
    :cond_0
    iget-object v0, p0, Lcom/squareup/haha/trove/THashIterator;->_hash:Lcom/squareup/haha/trove/TObjectHash;

    iget-object v2, v0, Lcom/squareup/haha/trove/TObjectHash;->_set:[Ljava/lang/Object;

    .line 88
    iget v3, p0, Lcom/squareup/haha/trove/THashIterator;->_index:I

    .line 89
    :cond_1
    move v0, v3

    add-int/lit8 v3, v3, -0x1

    if-lez v0, :cond_2

    aget-object v0, v2, v3

    if-eqz v0, :cond_1

    aget-object v0, v2, v3

    sget-object v1, Lcom/squareup/haha/trove/TObjectHash;->REMOVED:Ljava/lang/Object;

    if-eq v0, v1, :cond_1

    .line 90
    :cond_2
    return v3
.end method

.method protected abstract objectAtIndex(I)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TV;"
        }
    .end annotation
.end method
