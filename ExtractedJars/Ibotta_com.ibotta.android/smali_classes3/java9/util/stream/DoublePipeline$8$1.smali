.class Ljava9/util/stream/DoublePipeline$8$1;
.super Ljava9/util/stream/Sink$ChainedDouble;
.source "DoublePipeline.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljava9/util/stream/DoublePipeline$8;->opWrapSink(ILjava9/util/stream/Sink;)Ljava9/util/stream/Sink;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava9/util/stream/Sink$ChainedDouble<",
        "Ljava/lang/Double;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Ljava9/util/stream/DoublePipeline$8;


# direct methods
.method constructor <init>(Ljava9/util/stream/DoublePipeline$8;Ljava9/util/stream/Sink;)V
    .locals 0

    .line 349
    iput-object p1, p0, Ljava9/util/stream/DoublePipeline$8$1;->this$1:Ljava9/util/stream/DoublePipeline$8;

    invoke-direct {p0, p2}, Ljava9/util/stream/Sink$ChainedDouble;-><init>(Ljava9/util/stream/Sink;)V

    return-void
.end method


# virtual methods
.method public accept(D)V
    .locals 1

    .line 352
    iget-object v0, p0, Ljava9/util/stream/DoublePipeline$8$1;->this$1:Ljava9/util/stream/DoublePipeline$8;

    iget-object v0, v0, Ljava9/util/stream/DoublePipeline$8;->val$action:Ljava9/util/function/DoubleConsumer;

    invoke-interface {v0, p1, p2}, Ljava9/util/function/DoubleConsumer;->accept(D)V

    .line 353
    iget-object v0, p0, Ljava9/util/stream/DoublePipeline$8$1;->downstream:Ljava9/util/stream/Sink;

    invoke-interface {v0, p1, p2}, Ljava9/util/stream/Sink;->accept(D)V

    return-void
.end method
