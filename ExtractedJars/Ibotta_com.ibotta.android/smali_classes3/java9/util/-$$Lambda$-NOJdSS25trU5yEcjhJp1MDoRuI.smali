.class public final synthetic Ljava9/util/-$$Lambda$-NOJdSS25trU5yEcjhJp1MDoRuI;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/LongConsumer;


# instance fields
.field private final synthetic f$0:Ljava9/util/function/Consumer;


# direct methods
.method public synthetic constructor <init>(Ljava9/util/function/Consumer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljava9/util/-$$Lambda$-NOJdSS25trU5yEcjhJp1MDoRuI;->f$0:Ljava9/util/function/Consumer;

    return-void
.end method


# virtual methods
.method public final accept(J)V
    .locals 1

    iget-object v0, p0, Ljava9/util/-$$Lambda$-NOJdSS25trU5yEcjhJp1MDoRuI;->f$0:Ljava9/util/function/Consumer;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava9/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic andThen(Ljava9/util/function/LongConsumer;)Ljava9/util/function/LongConsumer;
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/function/LongConsumer$-CC;->$default$andThen(Ljava9/util/function/LongConsumer;Ljava9/util/function/LongConsumer;)Ljava9/util/function/LongConsumer;

    move-result-object p1

    return-object p1
.end method
