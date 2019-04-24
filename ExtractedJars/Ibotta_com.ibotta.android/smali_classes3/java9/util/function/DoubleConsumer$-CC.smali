.class public final synthetic Ljava9/util/function/DoubleConsumer$-CC;
.super Ljava/lang/Object;
.source "DoubleConsumer.java"


# direct methods
.method public static $default$andThen(Ljava9/util/function/DoubleConsumer;Ljava9/util/function/DoubleConsumer;)Ljava9/util/function/DoubleConsumer;
    .locals 1
    .param p0, "-this"    # Ljava9/util/function/DoubleConsumer;

    .line 64
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    new-instance v0, Ljava9/util/function/-$$Lambda$DoubleConsumer$0WQBoFoii2ouQLr2xhXkIE7VDOw;

    invoke-direct {v0, p0, p1}, Ljava9/util/function/-$$Lambda$DoubleConsumer$0WQBoFoii2ouQLr2xhXkIE7VDOw;-><init>(Ljava9/util/function/DoubleConsumer;Ljava9/util/function/DoubleConsumer;)V

    return-object v0
.end method

.method public static synthetic lambda$andThen$33(Ljava9/util/function/DoubleConsumer;Ljava9/util/function/DoubleConsumer;D)V
    .locals 0

    .line 65
    invoke-interface {p0, p2, p3}, Ljava9/util/function/DoubleConsumer;->accept(D)V

    invoke-interface {p1, p2, p3}, Ljava9/util/function/DoubleConsumer;->accept(D)V

    return-void
.end method
