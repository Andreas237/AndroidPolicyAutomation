.class final Ljava9/util/stream/Nodes$ToArrayTask$OfDouble;
.super Ljava9/util/stream/Nodes$ToArrayTask$OfPrimitive;
.source "Nodes.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljava9/util/stream/Nodes$ToArrayTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "OfDouble"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava9/util/stream/Nodes$ToArrayTask$OfPrimitive<",
        "Ljava/lang/Double;",
        "Ljava9/util/function/DoubleConsumer;",
        "[D",
        "Ljava9/util/Spliterator$OfDouble;",
        "Ljava9/util/stream/Node$OfDouble;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>(Ljava9/util/stream/Node$OfDouble;[DI)V
    .locals 1

    const/4 v0, 0x0

    .line 2095
    invoke-direct {p0, p1, p2, p3, v0}, Ljava9/util/stream/Nodes$ToArrayTask$OfPrimitive;-><init>(Ljava9/util/stream/Node$OfPrimitive;Ljava/lang/Object;ILjava9/util/stream/Nodes$1;)V

    return-void
.end method

.method synthetic constructor <init>(Ljava9/util/stream/Node$OfDouble;[DILjava9/util/stream/Nodes$1;)V
    .locals 0

    .line 2092
    invoke-direct {p0, p1, p2, p3}, Ljava9/util/stream/Nodes$ToArrayTask$OfDouble;-><init>(Ljava9/util/stream/Node$OfDouble;[DI)V

    return-void
.end method
