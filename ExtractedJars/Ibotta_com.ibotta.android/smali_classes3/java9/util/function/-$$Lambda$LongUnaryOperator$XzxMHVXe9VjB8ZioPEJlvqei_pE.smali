.class public final synthetic Ljava9/util/function/-$$Lambda$LongUnaryOperator$XzxMHVXe9VjB8ZioPEJlvqei_pE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/LongUnaryOperator;


# instance fields
.field private final synthetic f$0:Ljava9/util/function/LongUnaryOperator;

.field private final synthetic f$1:Ljava9/util/function/LongUnaryOperator;


# direct methods
.method public synthetic constructor <init>(Ljava9/util/function/LongUnaryOperator;Ljava9/util/function/LongUnaryOperator;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljava9/util/function/-$$Lambda$LongUnaryOperator$XzxMHVXe9VjB8ZioPEJlvqei_pE;->f$0:Ljava9/util/function/LongUnaryOperator;

    iput-object p2, p0, Ljava9/util/function/-$$Lambda$LongUnaryOperator$XzxMHVXe9VjB8ZioPEJlvqei_pE;->f$1:Ljava9/util/function/LongUnaryOperator;

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
    .locals 2

    iget-object v0, p0, Ljava9/util/function/-$$Lambda$LongUnaryOperator$XzxMHVXe9VjB8ZioPEJlvqei_pE;->f$0:Ljava9/util/function/LongUnaryOperator;

    iget-object v1, p0, Ljava9/util/function/-$$Lambda$LongUnaryOperator$XzxMHVXe9VjB8ZioPEJlvqei_pE;->f$1:Ljava9/util/function/LongUnaryOperator;

    invoke-static {v0, v1, p1, p2}, Ljava9/util/function/LongUnaryOperator$-CC;->lambda$compose$23(Ljava9/util/function/LongUnaryOperator;Ljava9/util/function/LongUnaryOperator;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public synthetic compose(Ljava9/util/function/LongUnaryOperator;)Ljava9/util/function/LongUnaryOperator;
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/function/LongUnaryOperator$-CC;->$default$compose(Ljava9/util/function/LongUnaryOperator;Ljava9/util/function/LongUnaryOperator;)Ljava9/util/function/LongUnaryOperator;

    move-result-object p1

    return-object p1
.end method
