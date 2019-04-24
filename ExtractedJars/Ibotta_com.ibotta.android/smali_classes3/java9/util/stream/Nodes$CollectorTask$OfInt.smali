.class final Ljava9/util/stream/Nodes$CollectorTask$OfInt;
.super Ljava9/util/stream/Nodes$CollectorTask;
.source "Nodes.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljava9/util/stream/Nodes$CollectorTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "OfInt"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P_IN:",
        "Ljava/lang/Object;",
        ">",
        "Ljava9/util/stream/Nodes$CollectorTask<",
        "TP_IN;",
        "Ljava/lang/Integer;",
        "Ljava9/util/stream/Node$OfInt;",
        "Ljava9/util/stream/Node$Builder$OfInt;",
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
            "Ljava/lang/Integer;",
            ">;",
            "Ljava9/util/Spliterator<",
            "TP_IN;>;)V"
        }
    .end annotation

    .line 2156
    sget-object v0, Ljava9/util/stream/-$$Lambda$Ecl_QJ8VOcUt9gEx1vGKij2myms;->INSTANCE:Ljava9/util/stream/-$$Lambda$Ecl_QJ8VOcUt9gEx1vGKij2myms;

    sget-object v1, Ljava9/util/stream/-$$Lambda$zpiasH_s4pNaJ6mw7cZk6vMwhuE;->INSTANCE:Ljava9/util/stream/-$$Lambda$zpiasH_s4pNaJ6mw7cZk6vMwhuE;

    invoke-direct {p0, p1, p2, v0, v1}, Ljava9/util/stream/Nodes$CollectorTask;-><init>(Ljava9/util/stream/PipelineHelper;Ljava9/util/Spliterator;Ljava9/util/function/LongFunction;Ljava9/util/function/BinaryOperator;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic doLeaf()Ljava/lang/Object;
    .locals 1

    .line 2153
    invoke-super {p0}, Ljava9/util/stream/Nodes$CollectorTask;->doLeaf()Ljava9/util/stream/Node;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic makeChild(Ljava9/util/Spliterator;)Ljava9/util/stream/AbstractTask;
    .locals 0

    .line 2153
    invoke-super {p0, p1}, Ljava9/util/stream/Nodes$CollectorTask;->makeChild(Ljava9/util/Spliterator;)Ljava9/util/stream/Nodes$CollectorTask;

    move-result-object p1

    return-object p1
.end method
