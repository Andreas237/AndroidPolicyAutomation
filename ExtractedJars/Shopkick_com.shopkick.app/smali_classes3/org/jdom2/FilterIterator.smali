.class final Lorg/jdom2/FilterIterator;
.super Ljava/lang/Object;
.source "FilterIterator.java"

# interfaces
.implements Lorg/jdom2/util/IteratorIterable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lorg/jdom2/util/IteratorIterable<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private canremove:Z

.field private final filter:Lorg/jdom2/filter/Filter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jdom2/filter/Filter<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final iterator:Lorg/jdom2/DescendantIterator;

.field private nextObject:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/jdom2/DescendantIterator;Lorg/jdom2/filter/Filter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdom2/DescendantIterator;",
            "Lorg/jdom2/filter/Filter<",
            "TT;>;)V"
        }
    .end annotation

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 74
    iput-boolean v0, p0, Lorg/jdom2/FilterIterator;->canremove:Z

    if-eqz p2, :cond_0

    .line 82
    iput-object p1, p0, Lorg/jdom2/FilterIterator;->iterator:Lorg/jdom2/DescendantIterator;

    .line 83
    iput-object p2, p0, Lorg/jdom2/FilterIterator;->filter:Lorg/jdom2/filter/Filter;

    return-void

    .line 79
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Cannot specify a null Filter for a FilterIterator"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public hasNext()Z
    .locals 4

    const/4 v0, 0x0

    .line 94
    iput-boolean v0, p0, Lorg/jdom2/FilterIterator;->canremove:Z

    .line 96
    iget-object v1, p0, Lorg/jdom2/FilterIterator;->nextObject:Ljava/lang/Object;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    return v2

    .line 100
    :cond_0
    iget-object v1, p0, Lorg/jdom2/FilterIterator;->iterator:Lorg/jdom2/DescendantIterator;

    invoke-virtual {v1}, Lorg/jdom2/DescendantIterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 101
    iget-object v1, p0, Lorg/jdom2/FilterIterator;->iterator:Lorg/jdom2/DescendantIterator;

    invoke-virtual {v1}, Lorg/jdom2/DescendantIterator;->next()Lorg/jdom2/Content;

    move-result-object v1

    .line 102
    iget-object v3, p0, Lorg/jdom2/FilterIterator;->filter:Lorg/jdom2/filter/Filter;

    invoke-interface {v3, v1}, Lorg/jdom2/filter/Filter;->filter(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 104
    iput-object v1, p0, Lorg/jdom2/FilterIterator;->nextObject:Ljava/lang/Object;

    return v2

    :cond_1
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    .line 88
    new-instance v0, Lorg/jdom2/FilterIterator;

    iget-object v1, p0, Lorg/jdom2/FilterIterator;->iterator:Lorg/jdom2/DescendantIterator;

    invoke-virtual {v1}, Lorg/jdom2/DescendantIterator;->iterator()Lorg/jdom2/DescendantIterator;

    move-result-object v1

    iget-object v2, p0, Lorg/jdom2/FilterIterator;->filter:Lorg/jdom2/filter/Filter;

    invoke-direct {v0, v1, v2}, Lorg/jdom2/FilterIterator;-><init>(Lorg/jdom2/DescendantIterator;Lorg/jdom2/filter/Filter;)V

    return-object v0
.end method

.method public next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 113
    invoke-virtual {p0}, Lorg/jdom2/FilterIterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 117
    iget-object v0, p0, Lorg/jdom2/FilterIterator;->nextObject:Ljava/lang/Object;

    const/4 v1, 0x0

    .line 118
    iput-object v1, p0, Lorg/jdom2/FilterIterator;->nextObject:Ljava/lang/Object;

    const/4 v1, 0x1

    .line 119
    iput-boolean v1, p0, Lorg/jdom2/FilterIterator;->canremove:Z

    return-object v0

    .line 114
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 2

    .line 125
    iget-boolean v0, p0, Lorg/jdom2/FilterIterator;->canremove:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 131
    iput-boolean v0, p0, Lorg/jdom2/FilterIterator;->canremove:Z

    .line 132
    iget-object v0, p0, Lorg/jdom2/FilterIterator;->iterator:Lorg/jdom2/DescendantIterator;

    invoke-virtual {v0}, Lorg/jdom2/DescendantIterator;->remove()V

    return-void

    .line 126
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "remove() can only be called on the FilterIterator immediately after a successful call to next(). A call to remove() immediately after a call to hasNext() or remove() will also fail."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
