.class Ljava9/util/stream/DoublePipeline$8;
.super Ljava9/util/stream/DoublePipeline$StatelessOp;
.source "DoublePipeline.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljava9/util/stream/DoublePipeline;->peek(Ljava9/util/function/DoubleConsumer;)Ljava9/util/stream/DoubleStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava9/util/stream/DoublePipeline$StatelessOp<",
        "Ljava/lang/Double;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Ljava9/util/stream/DoublePipeline;

.field final synthetic val$action:Ljava9/util/function/DoubleConsumer;


# direct methods
.method constructor <init>(Ljava9/util/stream/DoublePipeline;Ljava9/util/stream/AbstractPipeline;Ljava9/util/stream/StreamShape;ILjava9/util/function/DoubleConsumer;)V
    .locals 0

    .line 346
    iput-object p1, p0, Ljava9/util/stream/DoublePipeline$8;->this$0:Ljava9/util/stream/DoublePipeline;

    iput-object p5, p0, Ljava9/util/stream/DoublePipeline$8;->val$action:Ljava9/util/function/DoubleConsumer;

    invoke-direct {p0, p2, p3, p4}, Ljava9/util/stream/DoublePipeline$StatelessOp;-><init>(Ljava9/util/stream/AbstractPipeline;Ljava9/util/stream/StreamShape;I)V

    return-void
.end method


# virtual methods
.method opWrapSink(ILjava9/util/stream/Sink;)Ljava9/util/stream/Sink;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava9/util/stream/Sink<",
            "Ljava/lang/Double;",
            ">;)",
            "Ljava9/util/stream/Sink<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    .line 349
    new-instance p1, Ljava9/util/stream/DoublePipeline$8$1;

    invoke-direct {p1, p0, p2}, Ljava9/util/stream/DoublePipeline$8$1;-><init>(Ljava9/util/stream/DoublePipeline$8;Ljava9/util/stream/Sink;)V

    return-object p1
.end method
