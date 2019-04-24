.class public final synthetic Ljava9/util/stream/-$$Lambda$IntPipeline$vx8JYBadF-pEXBKoyj07oibHPYc;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/BinaryOperator;


# instance fields
.field private final synthetic f$0:Ljava9/util/function/BiConsumer;


# direct methods
.method public synthetic constructor <init>(Ljava9/util/function/BiConsumer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljava9/util/stream/-$$Lambda$IntPipeline$vx8JYBadF-pEXBKoyj07oibHPYc;->f$0:Ljava9/util/function/BiConsumer;

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava9/util/function/Function;)Ljava9/util/function/BiFunction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/Function<",
            "-TR;+TV;>;)",
            "Ljava9/util/function/BiFunction<",
            "TT;TU;TV;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/BiFunction$-CC;->$default$andThen(Ljava9/util/function/BiFunction;Ljava9/util/function/Function;)Ljava9/util/function/BiFunction;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ljava9/util/stream/-$$Lambda$IntPipeline$vx8JYBadF-pEXBKoyj07oibHPYc;->f$0:Ljava9/util/function/BiConsumer;

    invoke-static {v0, p1, p2}, Ljava9/util/stream/IntPipeline;->lambda$collect$46(Ljava9/util/function/BiConsumer;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
