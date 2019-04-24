.class public final synthetic Ljava9/util/function/DoublePredicate$-CC;
.super Ljava/lang/Object;
.source "DoublePredicate.java"


# direct methods
.method public static $default$and(Ljava9/util/function/DoublePredicate;Ljava9/util/function/DoublePredicate;)Ljava9/util/function/DoublePredicate;
    .locals 1
    .param p0, "-this"    # Ljava9/util/function/DoublePredicate;

    .line 69
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    new-instance v0, Ljava9/util/function/-$$Lambda$DoublePredicate$LuJsCByZ8g1cl8ubkYjdGssalw0;

    invoke-direct {v0, p0, p1}, Ljava9/util/function/-$$Lambda$DoublePredicate$LuJsCByZ8g1cl8ubkYjdGssalw0;-><init>(Ljava9/util/function/DoublePredicate;Ljava9/util/function/DoublePredicate;)V

    return-object v0
.end method

.method public static $default$negate(Ljava9/util/function/DoublePredicate;)Ljava9/util/function/DoublePredicate;
    .locals 1
    .param p0, "-this"    # Ljava9/util/function/DoublePredicate;

    .line 81
    new-instance v0, Ljava9/util/function/-$$Lambda$DoublePredicate$EWwdWZzlQ391XfIz1isSlRo9nlM;

    invoke-direct {v0, p0}, Ljava9/util/function/-$$Lambda$DoublePredicate$EWwdWZzlQ391XfIz1isSlRo9nlM;-><init>(Ljava9/util/function/DoublePredicate;)V

    return-object v0
.end method

.method public static $default$or(Ljava9/util/function/DoublePredicate;Ljava9/util/function/DoublePredicate;)Ljava9/util/function/DoublePredicate;
    .locals 1
    .param p0, "-this"    # Ljava9/util/function/DoublePredicate;

    .line 101
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    new-instance v0, Ljava9/util/function/-$$Lambda$DoublePredicate$zra-9aY2vzMCNk-uRUFRlmNMCnw;

    invoke-direct {v0, p0, p1}, Ljava9/util/function/-$$Lambda$DoublePredicate$zra-9aY2vzMCNk-uRUFRlmNMCnw;-><init>(Ljava9/util/function/DoublePredicate;Ljava9/util/function/DoublePredicate;)V

    return-object v0
.end method

.method public static synthetic lambda$and$27(Ljava9/util/function/DoublePredicate;Ljava9/util/function/DoublePredicate;D)Z
    .locals 1

    .line 70
    invoke-interface {p0, p2, p3}, Ljava9/util/function/DoublePredicate;->test(D)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1, p2, p3}, Ljava9/util/function/DoublePredicate;->test(D)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public static synthetic lambda$negate$28(Ljava9/util/function/DoublePredicate;D)Z
    .locals 0

    .line 81
    invoke-interface {p0, p1, p2}, Ljava9/util/function/DoublePredicate;->test(D)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public static synthetic lambda$or$29(Ljava9/util/function/DoublePredicate;Ljava9/util/function/DoublePredicate;D)Z
    .locals 1

    .line 102
    invoke-interface {p0, p2, p3}, Ljava9/util/function/DoublePredicate;->test(D)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1, p2, p3}, Ljava9/util/function/DoublePredicate;->test(D)Z

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
