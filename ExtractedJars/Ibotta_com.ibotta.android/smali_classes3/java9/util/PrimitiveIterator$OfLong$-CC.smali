.class public final synthetic Ljava9/util/PrimitiveIterator$OfLong$-CC;
.super Ljava/lang/Object;
.source "PrimitiveIterator.java"


# direct methods
.method public static synthetic $default$forEachRemaining(Ljava9/util/PrimitiveIterator$OfLong;Ljava/lang/Object;)V
    .locals 0
    .param p0, "-this"    # Ljava9/util/PrimitiveIterator$OfLong;

    .line 176
    check-cast p1, Ljava9/util/function/LongConsumer;

    invoke-interface {p0, p1}, Ljava9/util/PrimitiveIterator$OfLong;->forEachRemaining(Ljava9/util/function/LongConsumer;)V

    return-void
.end method

.method public static $default$forEachRemaining(Ljava9/util/PrimitiveIterator$OfLong;Ljava9/util/function/Consumer;)V
    .locals 1
    .param p0, "-this"    # Ljava9/util/PrimitiveIterator$OfLong;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .line 245
    instance-of v0, p1, Ljava9/util/function/LongConsumer;

    if-eqz v0, :cond_0

    .line 246
    check-cast p1, Ljava9/util/function/LongConsumer;

    invoke-interface {p0, p1}, Ljava9/util/PrimitiveIterator$OfLong;->forEachRemaining(Ljava9/util/function/LongConsumer;)V

    goto :goto_0

    .line 250
    :cond_0
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava9/util/-$$Lambda$-NOJdSS25trU5yEcjhJp1MDoRuI;

    invoke-direct {v0, p1}, Ljava9/util/-$$Lambda$-NOJdSS25trU5yEcjhJp1MDoRuI;-><init>(Ljava9/util/function/Consumer;)V

    invoke-interface {p0, v0}, Ljava9/util/PrimitiveIterator$OfLong;->forEachRemaining(Ljava9/util/function/LongConsumer;)V

    :goto_0
    return-void
.end method

.method public static $default$forEachRemaining(Ljava9/util/PrimitiveIterator$OfLong;Ljava9/util/function/LongConsumer;)V
    .locals 2
    .param p0, "-this"    # Ljava9/util/PrimitiveIterator$OfLong;

    .line 212
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    :goto_0
    invoke-interface {p0}, Ljava9/util/PrimitiveIterator$OfLong;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 214
    invoke-interface {p0}, Ljava9/util/PrimitiveIterator$OfLong;->nextLong()J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Ljava9/util/function/LongConsumer;->accept(J)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static $default$next(Ljava9/util/PrimitiveIterator$OfLong;)Ljava/lang/Long;
    .locals 2
    .param p0, "-this"    # Ljava9/util/PrimitiveIterator$OfLong;

    .line 225
    invoke-interface {p0}, Ljava9/util/PrimitiveIterator$OfLong;->nextLong()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $default$next(Ljava9/util/PrimitiveIterator$OfLong;)Ljava/lang/Object;
    .locals 1
    .param p0, "-this"    # Ljava9/util/PrimitiveIterator$OfLong;

    .line 176
    invoke-interface {p0}, Ljava9/util/PrimitiveIterator$OfLong;->next()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
