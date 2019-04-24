.class public final synthetic Ljava9/util/function/BinaryOperator$-CC;
.super Ljava/lang/Object;
.source "BinaryOperator.java"


# direct methods
.method public static synthetic lambda$maxBy$18(Ljava/util/Comparator;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 75
    invoke-interface {p0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    if-ltz p0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, p2

    :goto_0
    return-object p1
.end method

.method public static synthetic lambda$minBy$17(Ljava/util/Comparator;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 60
    invoke-interface {p0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    if-gtz p0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, p2

    :goto_0
    return-object p1
.end method

.method public static maxBy(Ljava/util/Comparator;)Ljava9/util/function/BinaryOperator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "-TT;>;)",
            "Ljava9/util/function/BinaryOperator<",
            "TT;>;"
        }
    .end annotation

    .line 74
    invoke-static {p0}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    new-instance v0, Ljava9/util/function/-$$Lambda$BinaryOperator$rjSsuY0GStNSONqu3r1qmANtdos;

    invoke-direct {v0, p0}, Ljava9/util/function/-$$Lambda$BinaryOperator$rjSsuY0GStNSONqu3r1qmANtdos;-><init>(Ljava/util/Comparator;)V

    return-object v0
.end method

.method public static minBy(Ljava/util/Comparator;)Ljava9/util/function/BinaryOperator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "-TT;>;)",
            "Ljava9/util/function/BinaryOperator<",
            "TT;>;"
        }
    .end annotation

    .line 59
    invoke-static {p0}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    new-instance v0, Ljava9/util/function/-$$Lambda$BinaryOperator$jhFhYJZmI60VlOhISR6MhAwRmeE;

    invoke-direct {v0, p0}, Ljava9/util/function/-$$Lambda$BinaryOperator$jhFhYJZmI60VlOhISR6MhAwRmeE;-><init>(Ljava/util/Comparator;)V

    return-object v0
.end method
