.class public final synthetic Ljava9/util/stream/Sink$OfLong$-CC;
.super Ljava/lang/Object;
.source "Sink.java"


# direct methods
.method public static $default$accept(Ljava9/util/stream/Sink$OfLong;Ljava/lang/Long;)V
    .locals 2
    .param p0, "-this"    # Ljava9/util/stream/Sink$OfLong;

    .line 210
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-interface {p0, v0, v1}, Ljava9/util/stream/Sink$OfLong;->accept(J)V

    return-void
.end method

.method public static synthetic $default$accept(Ljava9/util/stream/Sink$OfLong;Ljava/lang/Object;)V
    .locals 0
    .param p0, "-this"    # Ljava9/util/stream/Sink$OfLong;

    .line 204
    check-cast p1, Ljava/lang/Long;

    invoke-interface {p0, p1}, Ljava9/util/stream/Sink$OfLong;->accept(Ljava/lang/Long;)V

    return-void
.end method
