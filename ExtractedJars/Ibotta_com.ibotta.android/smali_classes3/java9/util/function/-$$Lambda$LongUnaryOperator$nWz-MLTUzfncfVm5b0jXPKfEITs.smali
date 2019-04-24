.class public final synthetic Ljava9/util/function/-$$Lambda$LongUnaryOperator$nWz-MLTUzfncfVm5b0jXPKfEITs;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/LongUnaryOperator;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/function/-$$Lambda$LongUnaryOperator$nWz-MLTUzfncfVm5b0jXPKfEITs;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/function/-$$Lambda$LongUnaryOperator$nWz-MLTUzfncfVm5b0jXPKfEITs;

    invoke-direct {v0}, Ljava9/util/function/-$$Lambda$LongUnaryOperator$nWz-MLTUzfncfVm5b0jXPKfEITs;-><init>()V

    sput-object v0, Ljava9/util/function/-$$Lambda$LongUnaryOperator$nWz-MLTUzfncfVm5b0jXPKfEITs;->INSTANCE:Ljava9/util/function/-$$Lambda$LongUnaryOperator$nWz-MLTUzfncfVm5b0jXPKfEITs;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava9/util/function/LongUnaryOperator;)Ljava9/util/function/LongUnaryOperator;
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/function/LongUnaryOperator$-CC;->$default$andThen(Ljava9/util/function/LongUnaryOperator;Ljava9/util/function/LongUnaryOperator;)Ljava9/util/function/LongUnaryOperator;

    move-result-object p1

    return-object p1
.end method

.method public final applyAsLong(J)J
    .locals 0

    invoke-static {p1, p2}, Ljava9/util/function/LongUnaryOperator$-CC;->lambda$identity$25(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public synthetic compose(Ljava9/util/function/LongUnaryOperator;)Ljava9/util/function/LongUnaryOperator;
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/function/LongUnaryOperator$-CC;->$default$compose(Ljava9/util/function/LongUnaryOperator;Ljava9/util/function/LongUnaryOperator;)Ljava9/util/function/LongUnaryOperator;

    move-result-object p1

    return-object p1
.end method
