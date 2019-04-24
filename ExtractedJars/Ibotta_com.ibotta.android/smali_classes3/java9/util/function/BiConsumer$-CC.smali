.class public final synthetic Ljava9/util/function/BiConsumer$-CC;
.super Ljava/lang/Object;
.source "BiConsumer.java"


# direct methods
.method public static $default$andThen(Ljava9/util/function/BiConsumer;Ljava9/util/function/BiConsumer;)Ljava9/util/function/BiConsumer;
    .locals 1
    .param p0, "-this"    # Ljava9/util/function/BiConsumer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/BiConsumer<",
            "-TT;-TU;>;)",
            "Ljava9/util/function/BiConsumer<",
            "TT;TU;>;"
        }
    .end annotation

    .line 68
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    new-instance v0, Ljava9/util/function/-$$Lambda$BiConsumer$0ThhB8ruKfFw0aRAqZ6HjRVH7F8;

    invoke-direct {v0, p0, p1}, Ljava9/util/function/-$$Lambda$BiConsumer$0ThhB8ruKfFw0aRAqZ6HjRVH7F8;-><init>(Ljava9/util/function/BiConsumer;Ljava9/util/function/BiConsumer;)V

    return-object v0
.end method

.method public static synthetic lambda$andThen$12(Ljava9/util/function/BiConsumer;Ljava9/util/function/BiConsumer;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 71
    invoke-interface {p0, p2, p3}, Ljava9/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 72
    invoke-interface {p1, p2, p3}, Ljava9/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
