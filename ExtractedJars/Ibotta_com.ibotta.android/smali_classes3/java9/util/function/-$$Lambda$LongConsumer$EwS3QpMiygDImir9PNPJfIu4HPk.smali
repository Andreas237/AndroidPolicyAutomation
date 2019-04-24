.class public final synthetic Ljava9/util/function/-$$Lambda$LongConsumer$EwS3QpMiygDImir9PNPJfIu4HPk;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/LongConsumer;


# instance fields
.field private final synthetic f$0:Ljava9/util/function/LongConsumer;

.field private final synthetic f$1:Ljava9/util/function/LongConsumer;


# direct methods
.method public synthetic constructor <init>(Ljava9/util/function/LongConsumer;Ljava9/util/function/LongConsumer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljava9/util/function/-$$Lambda$LongConsumer$EwS3QpMiygDImir9PNPJfIu4HPk;->f$0:Ljava9/util/function/LongConsumer;

    iput-object p2, p0, Ljava9/util/function/-$$Lambda$LongConsumer$EwS3QpMiygDImir9PNPJfIu4HPk;->f$1:Ljava9/util/function/LongConsumer;

    return-void
.end method


# virtual methods
.method public final accept(J)V
    .locals 2

    iget-object v0, p0, Ljava9/util/function/-$$Lambda$LongConsumer$EwS3QpMiygDImir9PNPJfIu4HPk;->f$0:Ljava9/util/function/LongConsumer;

    iget-object v1, p0, Ljava9/util/function/-$$Lambda$LongConsumer$EwS3QpMiygDImir9PNPJfIu4HPk;->f$1:Ljava9/util/function/LongConsumer;

    invoke-static {v0, v1, p1, p2}, Ljava9/util/function/LongConsumer$-CC;->lambda$andThen$26(Ljava9/util/function/LongConsumer;Ljava9/util/function/LongConsumer;J)V

    return-void
.end method

.method public synthetic andThen(Ljava9/util/function/LongConsumer;)Ljava9/util/function/LongConsumer;
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/function/LongConsumer$-CC;->$default$andThen(Ljava9/util/function/LongConsumer;Ljava9/util/function/LongConsumer;)Ljava9/util/function/LongConsumer;

    move-result-object p1

    return-object p1
.end method
