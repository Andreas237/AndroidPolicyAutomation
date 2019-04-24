.class public final synthetic Ljava9/util/function/Consumer$-CC;
.super Ljava/lang/Object;
.source "Consumer.java"


# direct methods
.method public static $default$andThen(Ljava9/util/function/Consumer;Ljava9/util/function/Consumer;)Ljava9/util/function/Consumer;
    .locals 1
    .param p0, "-this"    # Ljava9/util/function/Consumer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-TT;>;)",
            "Ljava9/util/function/Consumer<",
            "TT;>;"
        }
    .end annotation

    .line 63
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    new-instance v0, Ljava9/util/function/-$$Lambda$Consumer$DI-UzSr284TH-TDI2vnNgHOHH2Y;

    invoke-direct {v0, p0, p1}, Ljava9/util/function/-$$Lambda$Consumer$DI-UzSr284TH-TDI2vnNgHOHH2Y;-><init>(Ljava9/util/function/Consumer;Ljava9/util/function/Consumer;)V

    return-object v0
.end method

.method public static synthetic lambda$andThen$4(Ljava9/util/function/Consumer;Ljava9/util/function/Consumer;Ljava/lang/Object;)V
    .locals 0

    .line 64
    invoke-interface {p0, p2}, Ljava9/util/function/Consumer;->accept(Ljava/lang/Object;)V

    invoke-interface {p1, p2}, Ljava9/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void
.end method
