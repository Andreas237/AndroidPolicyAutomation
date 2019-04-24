.class public final synthetic Ljava9/util/stream/-$$Lambda$ZYIfHchh3rC0i43ByP-SFQOzpC8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/LongConsumer;


# instance fields
.field private final synthetic f$0:Ljava9/util/stream/Sink;


# direct methods
.method public synthetic constructor <init>(Ljava9/util/stream/Sink;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljava9/util/stream/-$$Lambda$ZYIfHchh3rC0i43ByP-SFQOzpC8;->f$0:Ljava9/util/stream/Sink;

    return-void
.end method


# virtual methods
.method public final accept(J)V
    .locals 1

    iget-object v0, p0, Ljava9/util/stream/-$$Lambda$ZYIfHchh3rC0i43ByP-SFQOzpC8;->f$0:Ljava9/util/stream/Sink;

    invoke-interface {v0, p1, p2}, Ljava9/util/stream/Sink;->accept(J)V

    return-void
.end method

.method public synthetic andThen(Ljava9/util/function/LongConsumer;)Ljava9/util/function/LongConsumer;
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/function/LongConsumer$-CC;->$default$andThen(Ljava9/util/function/LongConsumer;Ljava9/util/function/LongConsumer;)Ljava9/util/function/LongConsumer;

    move-result-object p1

    return-object p1
.end method
