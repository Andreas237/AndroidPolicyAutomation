.class public final synthetic Ljava9/util/function/BiFunction$-CC;
.super Ljava/lang/Object;
.source "BiFunction.java"


# direct methods
.method public static $default$andThen(Ljava9/util/function/BiFunction;Ljava9/util/function/Function;)Ljava9/util/function/BiFunction;
    .locals 1
    .param p0, "-this"    # Ljava9/util/function/BiFunction;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/Function<",
            "-TR;+TV;>;)",
            "Ljava9/util/function/BiFunction<",
            "TT;TU;TV;>;"
        }
    .end annotation

    .line 69
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    new-instance v0, Ljava9/util/function/-$$Lambda$BiFunction$zH81Qn4HwVKXA2UvaFVA8KSDJKA;

    invoke-direct {v0, p0, p1}, Ljava9/util/function/-$$Lambda$BiFunction$zH81Qn4HwVKXA2UvaFVA8KSDJKA;-><init>(Ljava9/util/function/BiFunction;Ljava9/util/function/Function;)V

    return-object v0
.end method

.method public static synthetic lambda$andThen$19(Ljava9/util/function/BiFunction;Ljava9/util/function/Function;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 70
    invoke-interface {p0, p2, p3}, Ljava9/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava9/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
