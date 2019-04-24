.class public final synthetic Ljava9/util/function/LongPredicate$-CC;
.super Ljava/lang/Object;
.source "LongPredicate.java"


# direct methods
.method public static $default$and(Ljava9/util/function/LongPredicate;Ljava9/util/function/LongPredicate;)Ljava9/util/function/LongPredicate;
    .locals 1
    .param p0, "-this"    # Ljava9/util/function/LongPredicate;

    .line 69
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    new-instance v0, Ljava9/util/function/-$$Lambda$LongPredicate$Hx2WsIn7rGHyVjSyKGQAgqVh-vo;

    invoke-direct {v0, p0, p1}, Ljava9/util/function/-$$Lambda$LongPredicate$Hx2WsIn7rGHyVjSyKGQAgqVh-vo;-><init>(Ljava9/util/function/LongPredicate;Ljava9/util/function/LongPredicate;)V

    return-object v0
.end method

.method public static $default$negate(Ljava9/util/function/LongPredicate;)Ljava9/util/function/LongPredicate;
    .locals 1
    .param p0, "-this"    # Ljava9/util/function/LongPredicate;

    .line 81
    new-instance v0, Ljava9/util/function/-$$Lambda$LongPredicate$OJgFCQEUbHFXH06N_sXM3l-C1Cs;

    invoke-direct {v0, p0}, Ljava9/util/function/-$$Lambda$LongPredicate$OJgFCQEUbHFXH06N_sXM3l-C1Cs;-><init>(Ljava9/util/function/LongPredicate;)V

    return-object v0
.end method

.method public static $default$or(Ljava9/util/function/LongPredicate;Ljava9/util/function/LongPredicate;)Ljava9/util/function/LongPredicate;
    .locals 1
    .param p0, "-this"    # Ljava9/util/function/LongPredicate;

    .line 101
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    new-instance v0, Ljava9/util/function/-$$Lambda$LongPredicate$xeIFO0A68Y4g3jnmHy_1ssxXjqY;

    invoke-direct {v0, p0, p1}, Ljava9/util/function/-$$Lambda$LongPredicate$xeIFO0A68Y4g3jnmHy_1ssxXjqY;-><init>(Ljava9/util/function/LongPredicate;Ljava9/util/function/LongPredicate;)V

    return-object v0
.end method

.method public static synthetic lambda$and$20(Ljava9/util/function/LongPredicate;Ljava9/util/function/LongPredicate;J)Z
    .locals 1

    .line 70
    invoke-interface {p0, p2, p3}, Ljava9/util/function/LongPredicate;->test(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1, p2, p3}, Ljava9/util/function/LongPredicate;->test(J)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public static synthetic lambda$negate$21(Ljava9/util/function/LongPredicate;J)Z
    .locals 0

    .line 81
    invoke-interface {p0, p1, p2}, Ljava9/util/function/LongPredicate;->test(J)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public static synthetic lambda$or$22(Ljava9/util/function/LongPredicate;Ljava9/util/function/LongPredicate;J)Z
    .locals 1

    .line 102
    invoke-interface {p0, p2, p3}, Ljava9/util/function/LongPredicate;->test(J)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1, p2, p3}, Ljava9/util/function/LongPredicate;->test(J)Z

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
