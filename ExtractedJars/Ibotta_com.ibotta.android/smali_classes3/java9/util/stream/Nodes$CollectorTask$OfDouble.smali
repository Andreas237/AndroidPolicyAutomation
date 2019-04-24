.class final Ljava9/util/stream/Nodes$CollectorTask$OfDouble;
.super Ljava9/util/stream/Nodes$CollectorTask;
.source "Nodes.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljava9/util/stream/Nodes$CollectorTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "OfDouble"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P_IN:",
        "Ljava/lang/Object;",
        ">",
        "Ljava9/util/stream/Nodes$CollectorTask<",
        "TP_IN;",
        "Ljava/lang/Double;",
        "Ljava9/util/stream/Node$OfDouble;",
        "Ljava9/util/stream/Node$Builder$OfDouble;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava9/util/stream/PipelineHelper;Ljava9/util/Spliterator;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/stream/PipelineHelper<",
            "Ljava/lang/Double;",
            ">;",
            "Ljava9/util/Spliterator<",
            "TP_IN;>;)V"
        }
    .end annotation

    .line 2170
    sget-object v0, Ljava9/util/stream/-$$Lambda$TtKXsahyvI4C02SIu1i69pr7HLk;->INSTANCE:Ljava9/util/stream/-$$Lambda$TtKXsahyvI4C02SIu1i69pr7HLk;

    sget-object v1, Ljava9/util/stream/-$$Lambda$Ajm65V-ygEIHZETXnFpjc9NYyac;->INSTANCE:Ljava9/util/stream/-$$Lambda$Ajm65V-ygEIHZETXnFpjc9NYyac;

    invoke-direct {p0, p1, p2, v0, v1}, Ljava9/util/stream/Nodes$CollectorTask;-><init>(Ljava9/util/stream/PipelineHelper;Ljava9/util/Spliterator;Ljava9/util/function/LongFunction;Ljava9/util/function/BinaryOperator;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic doLeaf()Ljava/lang/Object;
    .locals 1

    .line 2167
    invoke-super {p0}, Ljava9/util/stream/Nodes$CollectorTask;->doLeaf()Ljava9/util/stream/Node;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic makeChild(Ljava9/util/Spliterator;)Ljava9/util/stream/AbstractTask;
    .locals 0

    .line 2167
    invoke-super {p0, p1}, Ljava9/util/stream/Nodes$CollectorTask;->makeChild(Ljava9/util/Spliterator;)Ljava9/util/stream/Nodes$CollectorTask;

    move-result-object p1

    return-object p1
.end method
