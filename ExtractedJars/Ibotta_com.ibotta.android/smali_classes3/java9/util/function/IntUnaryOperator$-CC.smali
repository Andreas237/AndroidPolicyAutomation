.class public final synthetic Ljava9/util/function/IntUnaryOperator$-CC;
.super Ljava/lang/Object;
.source "IntUnaryOperator.java"


# direct methods
.method public static $default$andThen(Ljava9/util/function/IntUnaryOperator;Ljava9/util/function/IntUnaryOperator;)Ljava9/util/function/IntUnaryOperator;
    .locals 1
    .param p0, "-this"    # Ljava9/util/function/IntUnaryOperator;

    .line 83
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    new-instance v0, Ljava9/util/function/-$$Lambda$IntUnaryOperator$atZkRLsmXzM4RLDHJEDrlRBtmpw;

    invoke-direct {v0, p0, p1}, Ljava9/util/function/-$$Lambda$IntUnaryOperator$atZkRLsmXzM4RLDHJEDrlRBtmpw;-><init>(Ljava9/util/function/IntUnaryOperator;Ljava9/util/function/IntUnaryOperator;)V

    return-object v0
.end method

.method public static $default$compose(Ljava9/util/function/IntUnaryOperator;Ljava9/util/function/IntUnaryOperator;)Ljava9/util/function/IntUnaryOperator;
    .locals 1
    .param p0, "-this"    # Ljava9/util/function/IntUnaryOperator;

    .line 65
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    new-instance v0, Ljava9/util/function/-$$Lambda$IntUnaryOperator$DG3J5f4L4fAz-_Zy58I7v3GbdYA;

    invoke-direct {v0, p0, p1}, Ljava9/util/function/-$$Lambda$IntUnaryOperator$DG3J5f4L4fAz-_Zy58I7v3GbdYA;-><init>(Ljava9/util/function/IntUnaryOperator;Ljava9/util/function/IntUnaryOperator;)V

    return-object v0
.end method

.method public static identity()Ljava9/util/function/IntUnaryOperator;
    .locals 1

    .line 93
    sget-object v0, Ljava9/util/function/-$$Lambda$IntUnaryOperator$urePii8amvOOPvtvcwPmDy4MY7I;->INSTANCE:Ljava9/util/function/-$$Lambda$IntUnaryOperator$urePii8amvOOPvtvcwPmDy4MY7I;

    return-object v0
.end method

.method public static synthetic lambda$andThen$10(Ljava9/util/function/IntUnaryOperator;Ljava9/util/function/IntUnaryOperator;I)I
    .locals 0

    .line 84
    invoke-interface {p0, p2}, Ljava9/util/function/IntUnaryOperator;->applyAsInt(I)I

    move-result p2

    invoke-interface {p1, p2}, Ljava9/util/function/IntUnaryOperator;->applyAsInt(I)I

    move-result p1

    return p1
.end method

.method public static synthetic lambda$compose$9(Ljava9/util/function/IntUnaryOperator;Ljava9/util/function/IntUnaryOperator;I)I
    .locals 0

    .line 66
    invoke-interface {p1, p2}, Ljava9/util/function/IntUnaryOperator;->applyAsInt(I)I

    move-result p1

    invoke-interface {p0, p1}, Ljava9/util/function/IntUnaryOperator;->applyAsInt(I)I

    move-result p1

    return p1
.end method

.method public static synthetic lambda$identity$11(I)I
    .locals 0

    return p0
.end method
