.class public final synthetic Ljava9/util/function/Function$-CC;
.super Ljava/lang/Object;
.source "Function.java"


# direct methods
.method public static $default$andThen(Ljava9/util/function/Function;Ljava9/util/function/Function;)Ljava9/util/function/Function;
    .locals 1
    .param p0, "-this"    # Ljava9/util/function/Function;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/Function<",
            "-TR;+TV;>;)",
            "Ljava9/util/function/Function<",
            "TT;TV;>;"
        }
    .end annotation

    .line 86
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    new-instance v0, Ljava9/util/function/-$$Lambda$Function$xGCgZ6jEYzkpOZc_eB8PlPG24PY;

    invoke-direct {v0, p0, p1}, Ljava9/util/function/-$$Lambda$Function$xGCgZ6jEYzkpOZc_eB8PlPG24PY;-><init>(Ljava9/util/function/Function;Ljava9/util/function/Function;)V

    return-object v0
.end method

.method public static $default$compose(Ljava9/util/function/Function;Ljava9/util/function/Function;)Ljava9/util/function/Function;
    .locals 1
    .param p0, "-this"    # Ljava9/util/function/Function;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/Function<",
            "-TV;+TT;>;)",
            "Ljava9/util/function/Function<",
            "TV;TR;>;"
        }
    .end annotation

    .line 66
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    new-instance v0, Ljava9/util/function/-$$Lambda$Function$0sJMCnjbo99OnY9kDWbV4i22570;

    invoke-direct {v0, p0, p1}, Ljava9/util/function/-$$Lambda$Function$0sJMCnjbo99OnY9kDWbV4i22570;-><init>(Ljava9/util/function/Function;Ljava9/util/function/Function;)V

    return-object v0
.end method

.method public static identity()Ljava9/util/function/Function;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava9/util/function/Function<",
            "TT;TT;>;"
        }
    .end annotation

    .line 97
    sget-object v0, Ljava9/util/function/-$$Lambda$Function$Rt-pyU4FulWNtOIuWDe-iGTGr7Q;->INSTANCE:Ljava9/util/function/-$$Lambda$Function$Rt-pyU4FulWNtOIuWDe-iGTGr7Q;

    return-object v0
.end method

.method public static synthetic lambda$andThen$2(Ljava9/util/function/Function;Ljava9/util/function/Function;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 87
    invoke-interface {p0, p2}, Ljava9/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava9/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic lambda$compose$1(Ljava9/util/function/Function;Ljava9/util/function/Function;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 67
    invoke-interface {p1, p2}, Ljava9/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava9/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic lambda$identity$3(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p0
.end method
