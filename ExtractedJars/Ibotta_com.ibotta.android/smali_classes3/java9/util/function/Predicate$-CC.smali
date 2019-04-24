.class public final synthetic Ljava9/util/function/Predicate$-CC;
.super Ljava/lang/Object;
.source "Predicate.java"


# direct methods
.method public static $default$and(Ljava9/util/function/Predicate;Ljava9/util/function/Predicate;)Ljava9/util/function/Predicate;
    .locals 1
    .param p0, "-this"    # Ljava9/util/function/Predicate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Predicate<",
            "-TT;>;)",
            "Ljava9/util/function/Predicate<",
            "TT;>;"
        }
    .end annotation

    .line 67
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    new-instance v0, Ljava9/util/function/-$$Lambda$Predicate$wOhXdu5GqlNG02ldT9YrhAMMwlQ;

    invoke-direct {v0, p0, p1}, Ljava9/util/function/-$$Lambda$Predicate$wOhXdu5GqlNG02ldT9YrhAMMwlQ;-><init>(Ljava9/util/function/Predicate;Ljava9/util/function/Predicate;)V

    return-object v0
.end method

.method public static $default$negate(Ljava9/util/function/Predicate;)Ljava9/util/function/Predicate;
    .locals 1
    .param p0, "-this"    # Ljava9/util/function/Predicate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava9/util/function/Predicate<",
            "TT;>;"
        }
    .end annotation

    .line 79
    new-instance v0, Ljava9/util/function/-$$Lambda$Predicate$YG35HFETGNGl9zgki9ab9jS6-14;

    invoke-direct {v0, p0}, Ljava9/util/function/-$$Lambda$Predicate$YG35HFETGNGl9zgki9ab9jS6-14;-><init>(Ljava9/util/function/Predicate;)V

    return-object v0
.end method

.method public static $default$or(Ljava9/util/function/Predicate;Ljava9/util/function/Predicate;)Ljava9/util/function/Predicate;
    .locals 1
    .param p0, "-this"    # Ljava9/util/function/Predicate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Predicate<",
            "-TT;>;)",
            "Ljava9/util/function/Predicate<",
            "TT;>;"
        }
    .end annotation

    .line 99
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    new-instance v0, Ljava9/util/function/-$$Lambda$Predicate$mGamZf0vbQfoBf5c8nJxuUpxMmI;

    invoke-direct {v0, p0, p1}, Ljava9/util/function/-$$Lambda$Predicate$mGamZf0vbQfoBf5c8nJxuUpxMmI;-><init>(Ljava9/util/function/Predicate;Ljava9/util/function/Predicate;)V

    return-object v0
.end method

.method public static isEqual(Ljava/lang/Object;)Ljava9/util/function/Predicate;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")",
            "Ljava9/util/function/Predicate<",
            "TT;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    .line 114
    sget-object p0, Ljava9/util/function/-$$Lambda$rRR-oBTS2NcDiu1C68RzamS6i14;->INSTANCE:Ljava9/util/function/-$$Lambda$rRR-oBTS2NcDiu1C68RzamS6i14;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava9/util/function/-$$Lambda$Predicate$P_fhXik0tcy3cFbX9YeHMl_My3Q;

    invoke-direct {v0, p0}, Ljava9/util/function/-$$Lambda$Predicate$P_fhXik0tcy3cFbX9YeHMl_My3Q;-><init>(Ljava/lang/Object;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static synthetic lambda$and$13(Ljava9/util/function/Predicate;Ljava9/util/function/Predicate;Ljava/lang/Object;)Z
    .locals 1

    .line 68
    invoke-interface {p0, p2}, Ljava9/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1, p2}, Ljava9/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public static synthetic lambda$isEqual$16(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 116
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$negate$14(Ljava9/util/function/Predicate;Ljava/lang/Object;)Z
    .locals 0

    .line 79
    invoke-interface {p0, p1}, Ljava9/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public static synthetic lambda$or$15(Ljava9/util/function/Predicate;Ljava9/util/function/Predicate;Ljava/lang/Object;)Z
    .locals 1

    .line 100
    invoke-interface {p0, p2}, Ljava9/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1, p2}, Ljava9/util/function/Predicate;->test(Ljava/lang/Object;)Z

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
