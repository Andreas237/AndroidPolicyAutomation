.class public Lcom/shopkick/app/util/AsyncTaskUtils;
.super Ljava/lang/Object;
.source "AsyncTaskUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static cancelTask(Landroid/os/AsyncTask;Z)Ljava/lang/Void;
    .locals 0

    .line 24
    invoke-virtual {p0, p1}, Landroid/os/AsyncTask;->cancel(Z)Z

    const/4 p0, 0x0

    return-object p0
.end method

.method public static executeTask(Landroid/os/AsyncTask;)Ljava/lang/Void;
    .locals 2

    .line 14
    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    const/4 p0, 0x0

    return-object p0
.end method

.method public static executeTask(Landroid/os/AsyncTask;Ljava/util/concurrent/Executor;)Ljava/lang/Void;
    .locals 1

    const/4 v0, 0x0

    .line 19
    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0, p1, v0}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    const/4 p0, 0x0

    return-object p0
.end method

.method public static isCanceled(Landroid/os/AsyncTask;)Z
    .locals 0

    .line 29
    invoke-virtual {p0}, Landroid/os/AsyncTask;->isCancelled()Z

    move-result p0

    return p0
.end method
