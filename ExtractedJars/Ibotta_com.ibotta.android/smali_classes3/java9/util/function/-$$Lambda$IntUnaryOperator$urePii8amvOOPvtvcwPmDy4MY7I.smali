.class public final synthetic Ljava9/util/function/-$$Lambda$IntUnaryOperator$urePii8amvOOPvtvcwPmDy4MY7I;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/IntUnaryOperator;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/function/-$$Lambda$IntUnaryOperator$urePii8amvOOPvtvcwPmDy4MY7I;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/function/-$$Lambda$IntUnaryOperator$urePii8amvOOPvtvcwPmDy4MY7I;

    invoke-direct {v0}, Ljava9/util/function/-$$Lambda$IntUnaryOperator$urePii8amvOOPvtvcwPmDy4MY7I;-><init>()V

    sput-object v0, Ljava9/util/function/-$$Lambda$IntUnaryOperator$urePii8amvOOPvtvcwPmDy4MY7I;->INSTANCE:Ljava9/util/function/-$$Lambda$IntUnaryOperator$urePii8amvOOPvtvcwPmDy4MY7I;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava9/util/function/IntUnaryOperator;)Ljava9/util/function/IntUnaryOperator;
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/function/IntUnaryOperator$-CC;->$default$andThen(Ljava9/util/function/IntUnaryOperator;Ljava9/util/function/IntUnaryOperator;)Ljava9/util/function/IntUnaryOperator;

    move-result-object p1

    return-object p1
.end method

.method public final applyAsInt(I)I
    .locals 0

    invoke-static {p1}, Ljava9/util/function/IntUnaryOperator$-CC;->lambda$identity$11(I)I

    move-result p1

    return p1
.end method

.method public synthetic compose(Ljava9/util/function/IntUnaryOperator;)Ljava9/util/function/IntUnaryOperator;
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/function/IntUnaryOperator$-CC;->$default$compose(Ljava9/util/function/IntUnaryOperator;Ljava9/util/function/IntUnaryOperator;)Ljava9/util/function/IntUnaryOperator;

    move-result-object p1

    return-object p1
.end method
