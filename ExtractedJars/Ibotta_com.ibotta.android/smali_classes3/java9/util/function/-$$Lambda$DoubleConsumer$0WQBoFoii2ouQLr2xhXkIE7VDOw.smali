.class public final synthetic Ljava9/util/function/-$$Lambda$DoubleConsumer$0WQBoFoii2ouQLr2xhXkIE7VDOw;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/DoubleConsumer;


# instance fields
.field private final synthetic f$0:Ljava9/util/function/DoubleConsumer;

.field private final synthetic f$1:Ljava9/util/function/DoubleConsumer;


# direct methods
.method public synthetic constructor <init>(Ljava9/util/function/DoubleConsumer;Ljava9/util/function/DoubleConsumer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljava9/util/function/-$$Lambda$DoubleConsumer$0WQBoFoii2ouQLr2xhXkIE7VDOw;->f$0:Ljava9/util/function/DoubleConsumer;

    iput-object p2, p0, Ljava9/util/function/-$$Lambda$DoubleConsumer$0WQBoFoii2ouQLr2xhXkIE7VDOw;->f$1:Ljava9/util/function/DoubleConsumer;

    return-void
.end method


# virtual methods
.method public final accept(D)V
    .locals 2

    iget-object v0, p0, Ljava9/util/function/-$$Lambda$DoubleConsumer$0WQBoFoii2ouQLr2xhXkIE7VDOw;->f$0:Ljava9/util/function/DoubleConsumer;

    iget-object v1, p0, Ljava9/util/function/-$$Lambda$DoubleConsumer$0WQBoFoii2ouQLr2xhXkIE7VDOw;->f$1:Ljava9/util/function/DoubleConsumer;

    invoke-static {v0, v1, p1, p2}, Ljava9/util/function/DoubleConsumer$-CC;->lambda$andThen$33(Ljava9/util/function/DoubleConsumer;Ljava9/util/function/DoubleConsumer;D)V

    return-void
.end method

.method public synthetic andThen(Ljava9/util/function/DoubleConsumer;)Ljava9/util/function/DoubleConsumer;
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/function/DoubleConsumer$-CC;->$default$andThen(Ljava9/util/function/DoubleConsumer;Ljava9/util/function/DoubleConsumer;)Ljava9/util/function/DoubleConsumer;

    move-result-object p1

    return-object p1
.end method
