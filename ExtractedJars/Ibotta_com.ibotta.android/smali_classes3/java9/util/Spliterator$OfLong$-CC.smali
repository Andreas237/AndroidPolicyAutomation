.class public final synthetic Ljava9/util/Spliterator$OfLong$-CC;
.super Ljava/lang/Object;
.source "Spliterator.java"


# direct methods
.method public static synthetic $default$forEachRemaining(Ljava9/util/Spliterator$OfLong;Ljava/lang/Object;)V
    .locals 0
    .param p0, "-this"    # Ljava9/util/Spliterator$OfLong;

    .line 716
    check-cast p1, Ljava9/util/function/LongConsumer;

    invoke-interface {p0, p1}, Ljava9/util/Spliterator$OfLong;->forEachRemaining(Ljava9/util/function/LongConsumer;)V

    return-void
.end method

.method public static $default$forEachRemaining(Ljava9/util/Spliterator$OfLong;Ljava9/util/function/Consumer;)V
    .locals 1
    .param p0, "-this"    # Ljava9/util/Spliterator$OfLong;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .line 761
    instance-of v0, p1, Ljava9/util/function/LongConsumer;

    if-eqz v0, :cond_0

    .line 762
    check-cast p1, Ljava9/util/function/LongConsumer;

    invoke-interface {p0, p1}, Ljava9/util/Spliterator$OfLong;->forEachRemaining(Ljava9/util/function/LongConsumer;)V

    goto :goto_0

    .line 765
    :cond_0
    invoke-static {p1}, Ljava9/util/RefConsumer;->toLongConsumer(Ljava9/util/function/Consumer;)Ljava9/util/function/LongConsumer;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava9/util/Spliterator$OfLong;->forEachRemaining(Ljava9/util/function/LongConsumer;)V

    :goto_0
    return-void
.end method

.method public static $default$forEachRemaining(Ljava9/util/Spliterator$OfLong;Ljava9/util/function/LongConsumer;)V
    .locals 1
    .param p0, "-this"    # Ljava9/util/Spliterator$OfLong;

    .line 726
    :cond_0
    invoke-interface {p0, p1}, Ljava9/util/Spliterator$OfLong;->tryAdvance(Ljava9/util/function/LongConsumer;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void
.end method

.method public static synthetic $default$tryAdvance(Ljava9/util/Spliterator$OfLong;Ljava/lang/Object;)Z
    .locals 0
    .param p0, "-this"    # Ljava9/util/Spliterator$OfLong;

    .line 716
    check-cast p1, Ljava9/util/function/LongConsumer;

    invoke-interface {p0, p1}, Ljava9/util/Spliterator$OfLong;->tryAdvance(Ljava9/util/function/LongConsumer;)Z

    move-result p1

    return p1
.end method

.method public static $default$tryAdvance(Ljava9/util/Spliterator$OfLong;Ljava9/util/function/Consumer;)Z
    .locals 1
    .param p0, "-this"    # Ljava9/util/Spliterator$OfLong;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-",
            "Ljava/lang/Long;",
            ">;)Z"
        }
    .end annotation

    .line 741
    instance-of v0, p1, Ljava9/util/function/LongConsumer;

    if-eqz v0, :cond_0

    .line 742
    check-cast p1, Ljava9/util/function/LongConsumer;

    invoke-interface {p0, p1}, Ljava9/util/Spliterator$OfLong;->tryAdvance(Ljava9/util/function/LongConsumer;)Z

    move-result p1

    return p1

    .line 745
    :cond_0
    invoke-static {p1}, Ljava9/util/RefConsumer;->toLongConsumer(Ljava9/util/function/Consumer;)Ljava9/util/function/LongConsumer;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava9/util/Spliterator$OfLong;->tryAdvance(Ljava9/util/function/LongConsumer;)Z

    move-result p1

    return p1
.end method

.method public static synthetic $default$trySplit(Ljava9/util/Spliterator$OfLong;)Ljava9/util/Spliterator$OfPrimitive;
    .locals 1
    .param p0, "-this"    # Ljava9/util/Spliterator$OfLong;

    .line 716
    invoke-interface {p0}, Ljava9/util/Spliterator$OfLong;->trySplit()Ljava9/util/Spliterator$OfLong;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $default$trySplit(Ljava9/util/Spliterator$OfLong;)Ljava9/util/Spliterator;
    .locals 1
    .param p0, "-this"    # Ljava9/util/Spliterator$OfLong;

    .line 716
    invoke-interface {p0}, Ljava9/util/Spliterator$OfLong;->trySplit()Ljava9/util/Spliterator$OfLong;

    move-result-object v0

    return-object v0
.end method
