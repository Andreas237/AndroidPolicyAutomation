.class public final synthetic Ljava9/util/stream/Sink$-CC;
.super Ljava/lang/Object;
.source "Sink.java"


# direct methods
.method public static $default$accept(Ljava9/util/stream/Sink;D)V
    .locals 0
    .param p0, "-this"    # Ljava9/util/stream/Sink;

    .line 181
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "called wrong accept method"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static $default$accept(Ljava9/util/stream/Sink;I)V
    .locals 1
    .param p0, "-this"    # Ljava9/util/stream/Sink;

    .line 159
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "called wrong accept method"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static $default$accept(Ljava9/util/stream/Sink;J)V
    .locals 0
    .param p0, "-this"    # Ljava9/util/stream/Sink;

    .line 170
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "called wrong accept method"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static $default$begin(Ljava9/util/stream/Sink;J)V
    .locals 0

    return-void
.end method

.method public static $default$cancellationRequested(Ljava9/util/stream/Sink;)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public static $default$end(Ljava9/util/stream/Sink;)V
    .locals 0

    return-void
.end method
