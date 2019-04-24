.class public final synthetic Ljava9/util/Spliterator$OfDouble$-CC;
.super Ljava/lang/Object;
.source "Spliterator.java"


# direct methods
.method public static synthetic $default$forEachRemaining(Ljava9/util/Spliterator$OfDouble;Ljava/lang/Object;)V
    .locals 0
    .param p0, "-this"    # Ljava9/util/Spliterator$OfDouble;

    .line 774
    check-cast p1, Ljava9/util/function/DoubleConsumer;

    invoke-interface {p0, p1}, Ljava9/util/Spliterator$OfDouble;->forEachRemaining(Ljava9/util/function/DoubleConsumer;)V

    return-void
.end method

.method public static $default$forEachRemaining(Ljava9/util/Spliterator$OfDouble;Ljava9/util/function/Consumer;)V
    .locals 1
    .param p0, "-this"    # Ljava9/util/Spliterator$OfDouble;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    .line 820
    instance-of v0, p1, Ljava9/util/function/DoubleConsumer;

    if-eqz v0, :cond_0

    .line 821
    check-cast p1, Ljava9/util/function/DoubleConsumer;

    invoke-interface {p0, p1}, Ljava9/util/Spliterator$OfDouble;->forEachRemaining(Ljava9/util/function/DoubleConsumer;)V

    goto :goto_0

    .line 824
    :cond_0
    invoke-static {p1}, Ljava9/util/RefConsumer;->toDoubleConsumer(Ljava9/util/function/Consumer;)Ljava9/util/function/DoubleConsumer;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava9/util/Spliterator$OfDouble;->forEachRemaining(Ljava9/util/function/DoubleConsumer;)V

    :goto_0
    return-void
.end method

.method public static $default$forEachRemaining(Ljava9/util/Spliterator$OfDouble;Ljava9/util/function/DoubleConsumer;)V
    .locals 1
    .param p0, "-this"    # Ljava9/util/Spliterator$OfDouble;

    .line 784
    :cond_0
    invoke-interface {p0, p1}, Ljava9/util/Spliterator$OfDouble;->tryAdvance(Ljava9/util/function/DoubleConsumer;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void
.end method

.method public static synthetic $default$tryAdvance(Ljava9/util/Spliterator$OfDouble;Ljava/lang/Object;)Z
    .locals 0
    .param p0, "-this"    # Ljava9/util/Spliterator$OfDouble;

    .line 774
    check-cast p1, Ljava9/util/function/DoubleConsumer;

    invoke-interface {p0, p1}, Ljava9/util/Spliterator$OfDouble;->tryAdvance(Ljava9/util/function/DoubleConsumer;)Z

    move-result p1

    return p1
.end method

.method public static $default$tryAdvance(Ljava9/util/Spliterator$OfDouble;Ljava9/util/function/Consumer;)Z
    .locals 1
    .param p0, "-this"    # Ljava9/util/Spliterator$OfDouble;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-",
            "Ljava/lang/Double;",
            ">;)Z"
        }
    .end annotation

    .line 799
    instance-of v0, p1, Ljava9/util/function/DoubleConsumer;

    if-eqz v0, :cond_0

    .line 800
    check-cast p1, Ljava9/util/function/DoubleConsumer;

    invoke-interface {p0, p1}, Ljava9/util/Spliterator$OfDouble;->tryAdvance(Ljava9/util/function/DoubleConsumer;)Z

    move-result p1

    return p1

    .line 803
    :cond_0
    invoke-static {p1}, Ljava9/util/RefConsumer;->toDoubleConsumer(Ljava9/util/function/Consumer;)Ljava9/util/function/DoubleConsumer;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava9/util/Spliterator$OfDouble;->tryAdvance(Ljava9/util/function/DoubleConsumer;)Z

    move-result p1

    return p1
.end method

.method public static synthetic $default$trySplit(Ljava9/util/Spliterator$OfDouble;)Ljava9/util/Spliterator$OfPrimitive;
    .locals 1
    .param p0, "-this"    # Ljava9/util/Spliterator$OfDouble;

    .line 774
    invoke-interface {p0}, Ljava9/util/Spliterator$OfDouble;->trySplit()Ljava9/util/Spliterator$OfDouble;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $default$trySplit(Ljava9/util/Spliterator$OfDouble;)Ljava9/util/Spliterator;
    .locals 1
    .param p0, "-this"    # Ljava9/util/Spliterator$OfDouble;

    .line 774
    invoke-interface {p0}, Ljava9/util/Spliterator$OfDouble;->trySplit()Ljava9/util/Spliterator$OfDouble;

    move-result-object v0

    return-object v0
.end method
