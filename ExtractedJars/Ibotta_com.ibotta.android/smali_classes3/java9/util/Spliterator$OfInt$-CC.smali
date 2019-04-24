.class public final synthetic Ljava9/util/Spliterator$OfInt$-CC;
.super Ljava/lang/Object;
.source "Spliterator.java"


# direct methods
.method public static synthetic $default$forEachRemaining(Ljava9/util/Spliterator$OfInt;Ljava/lang/Object;)V
    .locals 0
    .param p0, "-this"    # Ljava9/util/Spliterator$OfInt;

    .line 658
    check-cast p1, Ljava9/util/function/IntConsumer;

    invoke-interface {p0, p1}, Ljava9/util/Spliterator$OfInt;->forEachRemaining(Ljava9/util/function/IntConsumer;)V

    return-void
.end method

.method public static $default$forEachRemaining(Ljava9/util/Spliterator$OfInt;Ljava9/util/function/Consumer;)V
    .locals 1
    .param p0, "-this"    # Ljava9/util/Spliterator$OfInt;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 703
    instance-of v0, p1, Ljava9/util/function/IntConsumer;

    if-eqz v0, :cond_0

    .line 704
    check-cast p1, Ljava9/util/function/IntConsumer;

    invoke-interface {p0, p1}, Ljava9/util/Spliterator$OfInt;->forEachRemaining(Ljava9/util/function/IntConsumer;)V

    goto :goto_0

    .line 707
    :cond_0
    invoke-static {p1}, Ljava9/util/RefConsumer;->toIntConsumer(Ljava9/util/function/Consumer;)Ljava9/util/function/IntConsumer;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava9/util/Spliterator$OfInt;->forEachRemaining(Ljava9/util/function/IntConsumer;)V

    :goto_0
    return-void
.end method

.method public static $default$forEachRemaining(Ljava9/util/Spliterator$OfInt;Ljava9/util/function/IntConsumer;)V
    .locals 1
    .param p0, "-this"    # Ljava9/util/Spliterator$OfInt;

    .line 668
    :cond_0
    invoke-interface {p0, p1}, Ljava9/util/Spliterator$OfInt;->tryAdvance(Ljava9/util/function/IntConsumer;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void
.end method

.method public static synthetic $default$tryAdvance(Ljava9/util/Spliterator$OfInt;Ljava/lang/Object;)Z
    .locals 0
    .param p0, "-this"    # Ljava9/util/Spliterator$OfInt;

    .line 658
    check-cast p1, Ljava9/util/function/IntConsumer;

    invoke-interface {p0, p1}, Ljava9/util/Spliterator$OfInt;->tryAdvance(Ljava9/util/function/IntConsumer;)Z

    move-result p1

    return p1
.end method

.method public static $default$tryAdvance(Ljava9/util/Spliterator$OfInt;Ljava9/util/function/Consumer;)Z
    .locals 1
    .param p0, "-this"    # Ljava9/util/Spliterator$OfInt;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-",
            "Ljava/lang/Integer;",
            ">;)Z"
        }
    .end annotation

    .line 683
    instance-of v0, p1, Ljava9/util/function/IntConsumer;

    if-eqz v0, :cond_0

    .line 684
    check-cast p1, Ljava9/util/function/IntConsumer;

    invoke-interface {p0, p1}, Ljava9/util/Spliterator$OfInt;->tryAdvance(Ljava9/util/function/IntConsumer;)Z

    move-result p1

    return p1

    .line 687
    :cond_0
    invoke-static {p1}, Ljava9/util/RefConsumer;->toIntConsumer(Ljava9/util/function/Consumer;)Ljava9/util/function/IntConsumer;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava9/util/Spliterator$OfInt;->tryAdvance(Ljava9/util/function/IntConsumer;)Z

    move-result p1

    return p1
.end method

.method public static synthetic $default$trySplit(Ljava9/util/Spliterator$OfInt;)Ljava9/util/Spliterator$OfPrimitive;
    .locals 1
    .param p0, "-this"    # Ljava9/util/Spliterator$OfInt;

    .line 658
    invoke-interface {p0}, Ljava9/util/Spliterator$OfInt;->trySplit()Ljava9/util/Spliterator$OfInt;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $default$trySplit(Ljava9/util/Spliterator$OfInt;)Ljava9/util/Spliterator;
    .locals 1
    .param p0, "-this"    # Ljava9/util/Spliterator$OfInt;

    .line 658
    invoke-interface {p0}, Ljava9/util/Spliterator$OfInt;->trySplit()Ljava9/util/Spliterator$OfInt;

    move-result-object v0

    return-object v0
.end method
