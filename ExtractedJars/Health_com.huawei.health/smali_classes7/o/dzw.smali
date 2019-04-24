.class public Lo/dzw;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    .line 44
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 45
    return-void

    .line 47
    :cond_0
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 49
    return-void
.end method

.method public static c(Ljava/lang/String;)Z
    .locals 1

    .line 36
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 37
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 39
    :cond_1
    const/4 v0, 0x0

    return v0
.end method
