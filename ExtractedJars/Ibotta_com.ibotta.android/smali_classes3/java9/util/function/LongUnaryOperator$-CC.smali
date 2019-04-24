.class public final synthetic Ljava9/util/function/LongUnaryOperator$-CC;
.super Ljava/lang/Object;
.source "LongUnaryOperator.java"


# direct methods
.method public static $default$andThen(Ljava9/util/function/LongUnaryOperator;Ljava9/util/function/LongUnaryOperator;)Ljava9/util/function/LongUnaryOperator;
    .locals 1
    .param p0, "-this"    # Ljava9/util/function/LongUnaryOperator;

    .line 83
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    new-instance v0, Ljava9/util/function/-$$Lambda$LongUnaryOperator$Gl1nUSCbwxtEz54daJQljS9GeqU;

    invoke-direct {v0, p0, p1}, Ljava9/util/function/-$$Lambda$LongUnaryOperator$Gl1nUSCbwxtEz54daJQljS9GeqU;-><init>(Ljava9/util/function/LongUnaryOperator;Ljava9/util/function/LongUnaryOperator;)V

    return-object v0
.end method

.method public static $default$compose(Ljava9/util/function/LongUnaryOperator;Ljava9/util/function/LongUnaryOperator;)Ljava9/util/function/LongUnaryOperator;
    .locals 1
    .param p0, "-this"    # Ljava9/util/function/LongUnaryOperator;

    .line 65
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    new-instance v0, Ljava9/util/function/-$$Lambda$LongUnaryOperator$XzxMHVXe9VjB8ZioPEJlvqei_pE;

    invoke-direct {v0, p0, p1}, Ljava9/util/function/-$$Lambda$LongUnaryOperator$XzxMHVXe9VjB8ZioPEJlvqei_pE;-><init>(Ljava9/util/function/LongUnaryOperator;Ljava9/util/function/LongUnaryOperator;)V

    return-object v0
.end method

.method public static identity()Ljava9/util/function/LongUnaryOperator;
    .locals 1

    .line 93
    sget-object v0, Ljava9/util/function/-$$Lambda$LongUnaryOperator$nWz-MLTUzfncfVm5b0jXPKfEITs;->INSTANCE:Ljava9/util/function/-$$Lambda$LongUnaryOperator$nWz-MLTUzfncfVm5b0jXPKfEITs;

    return-object v0
.end method

.method public static synthetic lambda$andThen$24(Ljava9/util/function/LongUnaryOperator;Ljava9/util/function/LongUnaryOperator;J)J
    .locals 0

    .line 84
    invoke-interface {p0, p2, p3}, Ljava9/util/function/LongUnaryOperator;->applyAsLong(J)J

    move-result-wide p2

    invoke-interface {p1, p2, p3}, Ljava9/util/function/LongUnaryOperator;->applyAsLong(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public static synthetic lambda$compose$23(Ljava9/util/function/LongUnaryOperator;Ljava9/util/function/LongUnaryOperator;J)J
    .locals 0

    .line 66
    invoke-interface {p1, p2, p3}, Ljava9/util/function/LongUnaryOperator;->applyAsLong(J)J

    move-result-wide p1

    invoke-interface {p0, p1, p2}, Ljava9/util/function/LongUnaryOperator;->applyAsLong(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public static synthetic lambda$identity$25(J)J
    .locals 0

    return-wide p0
.end method
