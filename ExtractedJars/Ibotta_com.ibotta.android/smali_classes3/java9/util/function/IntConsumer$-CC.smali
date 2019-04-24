.class public final synthetic Ljava9/util/function/IntConsumer$-CC;
.super Ljava/lang/Object;
.source "IntConsumer.java"


# direct methods
.method public static $default$andThen(Ljava9/util/function/IntConsumer;Ljava9/util/function/IntConsumer;)Ljava9/util/function/IntConsumer;
    .locals 1
    .param p0, "-this"    # Ljava9/util/function/IntConsumer;

    .line 64
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    new-instance v0, Ljava9/util/function/-$$Lambda$IntConsumer$zqLZqPtYc58iBGw9KX93cdL1Kv8;

    invoke-direct {v0, p0, p1}, Ljava9/util/function/-$$Lambda$IntConsumer$zqLZqPtYc58iBGw9KX93cdL1Kv8;-><init>(Ljava9/util/function/IntConsumer;Ljava9/util/function/IntConsumer;)V

    return-object v0
.end method

.method public static synthetic lambda$andThen$5(Ljava9/util/function/IntConsumer;Ljava9/util/function/IntConsumer;I)V
    .locals 0

    .line 65
    invoke-interface {p0, p2}, Ljava9/util/function/IntConsumer;->accept(I)V

    invoke-interface {p1, p2}, Ljava9/util/function/IntConsumer;->accept(I)V

    return-void
.end method
