.class public final synthetic Ljava9/util/function/-$$Lambda$DoubleUnaryOperator$21Dg7UPsMW-dvQKAOAXsaw7eg_E;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/DoubleUnaryOperator;


# instance fields
.field private final synthetic f$0:Ljava9/util/function/DoubleUnaryOperator;

.field private final synthetic f$1:Ljava9/util/function/DoubleUnaryOperator;


# direct methods
.method public synthetic constructor <init>(Ljava9/util/function/DoubleUnaryOperator;Ljava9/util/function/DoubleUnaryOperator;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljava9/util/function/-$$Lambda$DoubleUnaryOperator$21Dg7UPsMW-dvQKAOAXsaw7eg_E;->f$0:Ljava9/util/function/DoubleUnaryOperator;

    iput-object p2, p0, Ljava9/util/function/-$$Lambda$DoubleUnaryOperator$21Dg7UPsMW-dvQKAOAXsaw7eg_E;->f$1:Ljava9/util/function/DoubleUnaryOperator;

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
    .locals 2

    iget-object v0, p0, Ljava9/util/function/-$$Lambda$DoubleUnaryOperator$21Dg7UPsMW-dvQKAOAXsaw7eg_E;->f$0:Ljava9/util/function/DoubleUnaryOperator;

    iget-object v1, p0, Ljava9/util/function/-$$Lambda$DoubleUnaryOperator$21Dg7UPsMW-dvQKAOAXsaw7eg_E;->f$1:Ljava9/util/function/DoubleUnaryOperator;

    invoke-static {v0, v1, p1, p2}, Ljava9/util/function/DoubleUnaryOperator$-CC;->lambda$andThen$31(Ljava9/util/function/DoubleUnaryOperator;Ljava9/util/function/DoubleUnaryOperator;D)D

    move-result-wide p1

    return-wide p1
.end method

.method public synthetic compose(Ljava9/util/function/DoubleUnaryOperator;)Ljava9/util/function/DoubleUnaryOperator;
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/function/DoubleUnaryOperator$-CC;->$default$compose(Ljava9/util/function/DoubleUnaryOperator;Ljava9/util/function/DoubleUnaryOperator;)Ljava9/util/function/DoubleUnaryOperator;

    move-result-object p1

    return-object p1
.end method
