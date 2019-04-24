.class Ljava9/util/stream/WhileOps$3Op$1OpSink;
.super Ljava9/util/stream/Sink$ChainedLong;
.source "WhileOps.java"

# interfaces
.implements Ljava9/util/stream/WhileOps$DropWhileSink;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljava9/util/stream/WhileOps$3Op;->opWrapSink(Ljava9/util/stream/Sink;Z)Ljava9/util/stream/WhileOps$DropWhileSink;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "OpSink"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava9/util/stream/Sink$ChainedLong<",
        "Ljava/lang/Long;",
        ">;",
        "Ljava9/util/stream/WhileOps$DropWhileSink<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field dropCount:J

.field take:Z

.field final synthetic this$0:Ljava9/util/stream/WhileOps$3Op;

.field final synthetic val$retainAndCountDroppedElements:Z

.field final synthetic val$sink:Ljava9/util/stream/Sink;


# direct methods
.method constructor <init>(Ljava9/util/stream/WhileOps$3Op;Ljava9/util/stream/Sink;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 525
    iput-object p1, p0, Ljava9/util/stream/WhileOps$3Op$1OpSink;->this$0:Ljava9/util/stream/WhileOps$3Op;

    iput-object p2, p0, Ljava9/util/stream/WhileOps$3Op$1OpSink;->val$sink:Ljava9/util/stream/Sink;

    iput-boolean p3, p0, Ljava9/util/stream/WhileOps$3Op$1OpSink;->val$retainAndCountDroppedElements:Z

    .line 526
    invoke-direct {p0, p2}, Ljava9/util/stream/Sink$ChainedLong;-><init>(Ljava9/util/stream/Sink;)V

    return-void
.end method


# virtual methods
.method public synthetic accept(D)V
    .locals 0

    invoke-static {p0, p1, p2}, Ljava9/util/stream/Sink$-CC;->$default$accept(Ljava9/util/stream/Sink;D)V

    return-void
.end method

.method public synthetic accept(I)V
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/stream/Sink$-CC;->$default$accept(Ljava9/util/stream/Sink;I)V

    return-void
.end method

.method public accept(J)V
    .locals 6

    .line 531
    iget-boolean v0, p0, Ljava9/util/stream/WhileOps$3Op$1OpSink;->take:Z

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Ljava9/util/stream/WhileOps$3Op$1OpSink;->this$0:Ljava9/util/stream/WhileOps$3Op;

    iget-object v0, v0, Ljava9/util/stream/WhileOps$3Op;->val$predicate:Ljava9/util/function/LongPredicate;

    invoke-interface {v0, p1, p2}, Ljava9/util/function/LongPredicate;->test(J)Z

    move-result v0

    xor-int/2addr v0, v1

    iput-boolean v0, p0, Ljava9/util/stream/WhileOps$3Op$1OpSink;->take:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 535
    :cond_1
    :goto_0
    iget-boolean v0, p0, Ljava9/util/stream/WhileOps$3Op$1OpSink;->val$retainAndCountDroppedElements:Z

    if-eqz v0, :cond_2

    if-nez v1, :cond_2

    .line 536
    iget-wide v2, p0, Ljava9/util/stream/WhileOps$3Op$1OpSink;->dropCount:J

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    iput-wide v2, p0, Ljava9/util/stream/WhileOps$3Op$1OpSink;->dropCount:J

    .line 540
    :cond_2
    iget-boolean v0, p0, Ljava9/util/stream/WhileOps$3Op$1OpSink;->val$retainAndCountDroppedElements:Z

    if-nez v0, :cond_3

    if-eqz v1, :cond_4

    .line 541
    :cond_3
    iget-object v0, p0, Ljava9/util/stream/WhileOps$3Op$1OpSink;->downstream:Ljava9/util/stream/Sink;

    invoke-interface {v0, p1, p2}, Ljava9/util/stream/Sink;->accept(J)V

    :cond_4
    return-void
.end method

.method public synthetic accept(Ljava/lang/Long;)V
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/stream/Sink$OfLong$-CC;->$default$accept(Ljava9/util/stream/Sink$OfLong;Ljava/lang/Long;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/stream/Sink$OfLong$-CC;->$default$accept(Ljava9/util/stream/Sink$OfLong;Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic andThen(Ljava9/util/function/Consumer;)Ljava9/util/function/Consumer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-TT;>;)",
            "Ljava9/util/function/Consumer<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Consumer$-CC;->$default$andThen(Ljava9/util/function/Consumer;Ljava9/util/function/Consumer;)Ljava9/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public synthetic andThen(Ljava9/util/function/LongConsumer;)Ljava9/util/function/LongConsumer;
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/function/LongConsumer$-CC;->$default$andThen(Ljava9/util/function/LongConsumer;Ljava9/util/function/LongConsumer;)Ljava9/util/function/LongConsumer;

    move-result-object p1

    return-object p1
.end method

.method public getDropCount()J
    .locals 2

    .line 546
    iget-wide v0, p0, Ljava9/util/stream/WhileOps$3Op$1OpSink;->dropCount:J

    return-wide v0
.end method
