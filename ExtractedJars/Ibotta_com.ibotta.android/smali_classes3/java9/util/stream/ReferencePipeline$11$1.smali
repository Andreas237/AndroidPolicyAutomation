.class Ljava9/util/stream/ReferencePipeline$11$1;
.super Ljava9/util/stream/Sink$ChainedReference;
.source "ReferencePipeline.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljava9/util/stream/ReferencePipeline$11;->opWrapSink(ILjava9/util/stream/Sink;)Ljava9/util/stream/Sink;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava9/util/stream/Sink$ChainedReference<",
        "TP_OUT;TP_OUT;>;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Ljava9/util/stream/ReferencePipeline$11;


# direct methods
.method constructor <init>(Ljava9/util/stream/ReferencePipeline$11;Ljava9/util/stream/Sink;)V
    .locals 0

    .line 461
    iput-object p1, p0, Ljava9/util/stream/ReferencePipeline$11$1;->this$1:Ljava9/util/stream/ReferencePipeline$11;

    invoke-direct {p0, p2}, Ljava9/util/stream/Sink$ChainedReference;-><init>(Ljava9/util/stream/Sink;)V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP_OUT;)V"
        }
    .end annotation

    .line 464
    iget-object v0, p0, Ljava9/util/stream/ReferencePipeline$11$1;->this$1:Ljava9/util/stream/ReferencePipeline$11;

    iget-object v0, v0, Ljava9/util/stream/ReferencePipeline$11;->val$action:Ljava9/util/function/Consumer;

    invoke-interface {v0, p1}, Ljava9/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 465
    iget-object v0, p0, Ljava9/util/stream/ReferencePipeline$11$1;->downstream:Ljava9/util/stream/Sink;

    invoke-interface {v0, p1}, Ljava9/util/stream/Sink;->accept(Ljava/lang/Object;)V

    return-void
.end method
