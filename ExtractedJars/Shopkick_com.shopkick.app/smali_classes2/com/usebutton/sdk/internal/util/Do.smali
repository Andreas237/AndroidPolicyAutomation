.class public Lcom/usebutton/sdk/internal/util/Do;
.super Ljava/lang/Object;
.source "Do.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ifNotNull(Ljava/lang/Object;Ljava/lang/Runnable;)V
    .locals 0

    if-nez p0, :cond_0

    return-void

    .line 6
    :cond_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method
