.class public final synthetic Ljava9/util/function/-$$Lambda$DoubleUnaryOperator$YWBpEpyhrZKLK4ZgKWzpr5enST0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/DoubleUnaryOperator;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/function/-$$Lambda$DoubleUnaryOperator$YWBpEpyhrZKLK4ZgKWzpr5enST0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/function/-$$Lambda$DoubleUnaryOperator$YWBpEpyhrZKLK4ZgKWzpr5enST0;

    invoke-direct {v0}, Ljava9/util/function/-$$Lambda$DoubleUnaryOperator$YWBpEpyhrZKLK4ZgKWzpr5enST0;-><init>()V

    sput-object v0, Ljava9/util/function/-$$Lambda$DoubleUnaryOperator$YWBpEpyhrZKLK4ZgKWzpr5enST0;->INSTANCE:Ljava9/util/function/-$$Lambda$DoubleUnaryOperator$YWBpEpyhrZKLK4ZgKWzpr5enST0;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava9/util/function/DoubleUnaryOperator;)Ljava9/util/function/DoubleUnaryOperator;
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/function/DoubleUnaryOperator$-CC;->$default$andThen(Ljava9/util/function/DoubleUnaryOperator;Ljava9/util/function/DoubleUnaryOperator;)Ljava9/util/function/DoubleUnaryOperator;

    move-result-object p1

    return-object p1
.end method

.method public final applyAsDouble(D)D
    .locals 0

    invoke-static {p1, p2}, Ljava9/util/function/DoubleUnaryOperator$-CC;->lambda$identity$32(D)D

    move-result-wide p1

    return-wide p1
.end method

.method public synthetic compose(Ljava9/util/function/DoubleUnaryOperator;)Ljava9/util/function/DoubleUnaryOperator;
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/function/DoubleUnaryOperator$-CC;->$default$compose(Ljava9/util/function/DoubleUnaryOperator;Ljava9/util/function/DoubleUnaryOperator;)Ljava9/util/function/DoubleUnaryOperator;

    move-result-object p1

    return-object p1
.end method
