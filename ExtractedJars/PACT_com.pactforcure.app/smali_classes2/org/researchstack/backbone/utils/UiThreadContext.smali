.class public Lorg/researchstack/backbone/utils/UiThreadContext;
.super Ljava/lang/Object;
.source "UiThreadContext.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static assertBackgroundThread()V
    .locals 2

    .prologue
    .line 34
    invoke-static {}, Lorg/researchstack/backbone/utils/UiThreadContext;->isInUiThread()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 36
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "This call must be in background thread"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 38
    :cond_0
    return-void
.end method

.method public static assertUiThread()V
    .locals 2

    .prologue
    .line 15
    invoke-static {}, Lorg/researchstack/backbone/utils/UiThreadContext;->isInUiThread()Z

    move-result v0

    if-nez v0, :cond_0

    .line 17
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "This call must be in UI thread"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 19
    :cond_0
    return-void
.end method

.method public static isInUiThread()Z
    .locals 3

    .prologue
    .line 23
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    .line 24
    .local v1, "uiThread":Ljava/lang/Thread;
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    .line 26
    .local v0, "currentThread":Ljava/lang/Thread;
    if-ne v1, v0, :cond_0

    const/4 v2, 0x1

    :goto_0
    return v2

    :cond_0
    const/4 v2, 0x0

    goto :goto_0
.end method
