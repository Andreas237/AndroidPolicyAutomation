.class public final synthetic Ljava9/util/Spliterator$-CC;
.super Ljava/lang/Object;
.source "Spliterator.java"


# direct methods
.method public static $default$forEachRemaining(Ljava9/util/Spliterator;Ljava9/util/function/Consumer;)V
    .locals 1
    .param p0, "-this"    # Ljava9/util/Spliterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-TT;>;)V"
        }
    .end annotation

    .line 331
    :cond_0
    invoke-interface {p0, p1}, Ljava9/util/Spliterator;->tryAdvance(Ljava9/util/function/Consumer;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void
.end method

.method public static $default$getComparator(Ljava9/util/Spliterator;)Ljava/util/Comparator;
    .locals 1
    .param p0, "-this"    # Ljava9/util/Spliterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator<",
            "-TT;>;"
        }
    .end annotation

    .line 470
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public static $default$getExactSizeIfKnown(Ljava9/util/Spliterator;)J
    .locals 2
    .param p0, "-this"    # Ljava9/util/Spliterator;

    .line 413
    invoke-interface {p0}, Ljava9/util/Spliterator;->characteristics()I

    move-result v0

    and-int/lit8 v0, v0, 0x40

    if-nez v0, :cond_0

    const-wide/16 v0, -0x1

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ljava9/util/Spliterator;->estimateSize()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public static $default$hasCharacteristics(Ljava9/util/Spliterator;I)Z
    .locals 1
    .param p0, "-this"    # Ljava9/util/Spliterator;

    .line 452
    invoke-interface {p0}, Ljava9/util/Spliterator;->characteristics()I

    move-result v0

    and-int/2addr v0, p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
