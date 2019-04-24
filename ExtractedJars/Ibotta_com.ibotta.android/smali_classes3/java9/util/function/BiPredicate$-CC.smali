.class public final synthetic Ljava9/util/function/BiPredicate$-CC;
.super Ljava/lang/Object;
.source "BiPredicate.java"


# direct methods
.method public static $default$and(Ljava9/util/function/BiPredicate;Ljava9/util/function/BiPredicate;)Ljava9/util/function/BiPredicate;
    .locals 1
    .param p0, "-this"    # Ljava9/util/function/BiPredicate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/BiPredicate<",
            "-TT;-TU;>;)",
            "Ljava9/util/function/BiPredicate<",
            "TT;TU;>;"
        }
    .end annotation

    .line 72
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    new-instance v0, Ljava9/util/function/-$$Lambda$BiPredicate$NX6R_o9Ti_LeDfjQK40dQJDZsKc;

    invoke-direct {v0, p0, p1}, Ljava9/util/function/-$$Lambda$BiPredicate$NX6R_o9Ti_LeDfjQK40dQJDZsKc;-><init>(Ljava9/util/function/BiPredicate;Ljava9/util/function/BiPredicate;)V

    return-object v0
.end method

.method public static $default$negate(Ljava9/util/function/BiPredicate;)Ljava9/util/function/BiPredicate;
    .locals 1
    .param p0, "-this"    # Ljava9/util/function/BiPredicate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava9/util/function/BiPredicate<",
            "TT;TU;>;"
        }
    .end annotation

    .line 84
    new-instance v0, Ljava9/util/function/-$$Lambda$BiPredicate$Biz7hsmV--CPM7QbTg6YWOdeyZQ;

    invoke-direct {v0, p0}, Ljava9/util/function/-$$Lambda$BiPredicate$Biz7hsmV--CPM7QbTg6YWOdeyZQ;-><init>(Ljava9/util/function/BiPredicate;)V

    return-object v0
.end method

.method public static $default$or(Ljava9/util/function/BiPredicate;Ljava9/util/function/BiPredicate;)Ljava9/util/function/BiPredicate;
    .locals 1
    .param p0, "-this"    # Ljava9/util/function/BiPredicate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/BiPredicate<",
            "-TT;-TU;>;)",
            "Ljava9/util/function/BiPredicate<",
            "TT;TU;>;"
        }
    .end annotation

    .line 104
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    new-instance v0, Ljava9/util/function/-$$Lambda$BiPredicate$SJsHV9KAxlhyJymxtA1-1GOSfvo;

    invoke-direct {v0, p0, p1}, Ljava9/util/function/-$$Lambda$BiPredicate$SJsHV9KAxlhyJymxtA1-1GOSfvo;-><init>(Ljava9/util/function/BiPredicate;Ljava9/util/function/BiPredicate;)V

    return-object v0
.end method

.method public static synthetic lambda$and$72(Ljava9/util/function/BiPredicate;Ljava9/util/function/BiPredicate;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 73
    invoke-interface {p0, p2, p3}, Ljava9/util/function/BiPredicate;->test(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1, p2, p3}, Ljava9/util/function/BiPredicate;->test(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public static synthetic lambda$negate$73(Ljava9/util/function/BiPredicate;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 84
    invoke-interface {p0, p1, p2}, Ljava9/util/function/BiPredicate;->test(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public static synthetic lambda$or$74(Ljava9/util/function/BiPredicate;Ljava9/util/function/BiPredicate;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 105
    invoke-interface {p0, p2, p3}, Ljava9/util/function/BiPredicate;->test(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1, p2, p3}, Ljava9/util/function/BiPredicate;->test(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
