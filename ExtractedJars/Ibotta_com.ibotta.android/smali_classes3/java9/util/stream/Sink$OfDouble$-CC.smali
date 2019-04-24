.class public final synthetic Ljava9/util/stream/Sink$OfDouble$-CC;
.super Ljava/lang/Object;
.source "Sink.java"


# direct methods
.method public static $default$accept(Ljava9/util/stream/Sink$OfDouble;Ljava/lang/Double;)V
    .locals 2
    .param p0, "-this"    # Ljava9/util/stream/Sink$OfDouble;

    .line 225
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-interface {p0, v0, v1}, Ljava9/util/stream/Sink$OfDouble;->accept(D)V

    return-void
.end method

.method public static synthetic $default$accept(Ljava9/util/stream/Sink$OfDouble;Ljava/lang/Object;)V
    .locals 0
    .param p0, "-this"    # Ljava9/util/stream/Sink$OfDouble;

    .line 219
    check-cast p1, Ljava/lang/Double;

    invoke-interface {p0, p1}, Ljava9/util/stream/Sink$OfDouble;->accept(Ljava/lang/Double;)V

    return-void
.end method
