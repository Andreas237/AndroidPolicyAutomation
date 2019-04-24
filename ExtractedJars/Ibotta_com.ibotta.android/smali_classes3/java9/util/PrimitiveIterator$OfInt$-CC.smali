.class public final synthetic Ljava9/util/PrimitiveIterator$OfInt$-CC;
.super Ljava/lang/Object;
.source "PrimitiveIterator.java"


# direct methods
.method public static synthetic $default$forEachRemaining(Ljava9/util/PrimitiveIterator$OfInt;Ljava/lang/Object;)V
    .locals 0
    .param p0, "-this"    # Ljava9/util/PrimitiveIterator$OfInt;

    .line 92
    check-cast p1, Ljava9/util/function/IntConsumer;

    invoke-interface {p0, p1}, Ljava9/util/PrimitiveIterator$OfInt;->forEachRemaining(Ljava9/util/function/IntConsumer;)V

    return-void
.end method

.method public static $default$forEachRemaining(Ljava9/util/PrimitiveIterator$OfInt;Ljava9/util/function/Consumer;)V
    .locals 1
    .param p0, "-this"    # Ljava9/util/PrimitiveIterator$OfInt;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 161
    instance-of v0, p1, Ljava9/util/function/IntConsumer;

    if-eqz v0, :cond_0

    .line 162
    check-cast p1, Ljava9/util/function/IntConsumer;

    invoke-interface {p0, p1}, Ljava9/util/PrimitiveIterator$OfInt;->forEachRemaining(Ljava9/util/function/IntConsumer;)V

    goto :goto_0

    .line 166
    :cond_0
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava9/util/-$$Lambda$mX1BEUMzE9TAxgWT5yJmuLvdJdM;

    invoke-direct {v0, p1}, Ljava9/util/-$$Lambda$mX1BEUMzE9TAxgWT5yJmuLvdJdM;-><init>(Ljava9/util/function/Consumer;)V

    invoke-interface {p0, v0}, Ljava9/util/PrimitiveIterator$OfInt;->forEachRemaining(Ljava9/util/function/IntConsumer;)V

    :goto_0
    return-void
.end method

.method public static $default$forEachRemaining(Ljava9/util/PrimitiveIterator$OfInt;Ljava9/util/function/IntConsumer;)V
    .locals 1
    .param p0, "-this"    # Ljava9/util/PrimitiveIterator$OfInt;

    .line 128
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    :goto_0
    invoke-interface {p0}, Ljava9/util/PrimitiveIterator$OfInt;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 130
    invoke-interface {p0}, Ljava9/util/PrimitiveIterator$OfInt;->nextInt()I

    move-result v0

    invoke-interface {p1, v0}, Ljava9/util/function/IntConsumer;->accept(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static $default$next(Ljava9/util/PrimitiveIterator$OfInt;)Ljava/lang/Integer;
    .locals 1
    .param p0, "-this"    # Ljava9/util/PrimitiveIterator$OfInt;

    .line 141
    invoke-interface {p0}, Ljava9/util/PrimitiveIterator$OfInt;->nextInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $default$next(Ljava9/util/PrimitiveIterator$OfInt;)Ljava/lang/Object;
    .locals 1
    .param p0, "-this"    # Ljava9/util/PrimitiveIterator$OfInt;

    .line 92
    invoke-interface {p0}, Ljava9/util/PrimitiveIterator$OfInt;->next()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
