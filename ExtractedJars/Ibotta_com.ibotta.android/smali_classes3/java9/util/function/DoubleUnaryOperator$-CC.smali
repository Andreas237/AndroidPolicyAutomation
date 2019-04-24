.class public final synthetic Ljava9/util/function/DoubleUnaryOperator$-CC;
.super Ljava/lang/Object;
.source "DoubleUnaryOperator.java"


# direct methods
.method public static $default$andThen(Ljava9/util/function/DoubleUnaryOperator;Ljava9/util/function/DoubleUnaryOperator;)Ljava9/util/function/DoubleUnaryOperator;
    .locals 1
    .param p0, "-this"    # Ljava9/util/function/DoubleUnaryOperator;

    .line 83
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    new-instance v0, Ljava9/util/function/-$$Lambda$DoubleUnaryOperator$21Dg7UPsMW-dvQKAOAXsaw7eg_E;

    invoke-direct {v0, p0, p1}, Ljava9/util/function/-$$Lambda$DoubleUnaryOperator$21Dg7UPsMW-dvQKAOAXsaw7eg_E;-><init>(Ljava9/util/function/DoubleUnaryOperator;Ljava9/util/function/DoubleUnaryOperator;)V

    return-object v0
.end method

.method public static $default$compose(Ljava9/util/function/DoubleUnaryOperator;Ljava9/util/function/DoubleUnaryOperator;)Ljava9/util/function/DoubleUnaryOperator;
    .locals 1
    .param p0, "-this"    # Ljava9/util/function/DoubleUnaryOperator;

    .line 65
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    new-instance v0, Ljava9/util/function/-$$Lambda$DoubleUnaryOperator$O5YGAnirq4IsDd3QP4tAuBr-YO0;

    invoke-direct {v0, p0, p1}, Ljava9/util/function/-$$Lambda$DoubleUnaryOperator$O5YGAnirq4IsDd3QP4tAuBr-YO0;-><init>(Ljava9/util/function/DoubleUnaryOperator;Ljava9/util/function/DoubleUnaryOperator;)V

    return-object v0
.end method

.method public static identity()Ljava9/util/function/DoubleUnaryOperator;
    .locals 1

    .line 93
    sget-object v0, Ljava9/util/function/-$$Lambda$DoubleUnaryOperator$YWBpEpyhrZKLK4ZgKWzpr5enST0;->INSTANCE:Ljava9/util/function/-$$Lambda$DoubleUnaryOperator$YWBpEpyhrZKLK4ZgKWzpr5enST0;

    return-object v0
.end method

.method public static synthetic lambda$andThen$31(Ljava9/util/function/DoubleUnaryOperator;Ljava9/util/function/DoubleUnaryOperator;D)D
    .locals 0

    .line 84
    invoke-interface {p0, p2, p3}, Ljava9/util/function/DoubleUnaryOperator;->applyAsDouble(D)D

    move-result-wide p2

    invoke-interface {p1, p2, p3}, Ljava9/util/function/DoubleUnaryOperator;->applyAsDouble(D)D

    move-result-wide p1

    return-wide p1
.end method

.method public static synthetic lambda$compose$30(Ljava9/util/function/DoubleUnaryOperator;Ljava9/util/function/DoubleUnaryOperator;D)D
    .locals 0

    .line 66
    invoke-interface {p1, p2, p3}, Ljava9/util/function/DoubleUnaryOperator;->applyAsDouble(D)D

    move-result-wide p1

    invoke-interface {p0, p1, p2}, Ljava9/util/function/DoubleUnaryOperator;->applyAsDouble(D)D

    move-result-wide p1

    return-wide p1
.end method

.method public static synthetic lambda$identity$32(D)D
    .locals 0

    return-wide p0
.end method
