.class public final synthetic Ljava9/util/function/LongConsumer$-CC;
.super Ljava/lang/Object;
.source "LongConsumer.java"


# direct methods
.method public static $default$andThen(Ljava9/util/function/LongConsumer;Ljava9/util/function/LongConsumer;)Ljava9/util/function/LongConsumer;
    .locals 1
    .param p0, "-this"    # Ljava9/util/function/LongConsumer;

    .line 64
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    new-instance v0, Ljava9/util/function/-$$Lambda$LongConsumer$EwS3QpMiygDImir9PNPJfIu4HPk;

    invoke-direct {v0, p0, p1}, Ljava9/util/function/-$$Lambda$LongConsumer$EwS3QpMiygDImir9PNPJfIu4HPk;-><init>(Ljava9/util/function/LongConsumer;Ljava9/util/function/LongConsumer;)V

    return-object v0
.end method

.method public static synthetic lambda$andThen$26(Ljava9/util/function/LongConsumer;Ljava9/util/function/LongConsumer;J)V
    .locals 0

    .line 65
    invoke-interface {p0, p2, p3}, Ljava9/util/function/LongConsumer;->accept(J)V

    invoke-interface {p1, p2, p3}, Ljava9/util/function/LongConsumer;->accept(J)V

    return-void
.end method
