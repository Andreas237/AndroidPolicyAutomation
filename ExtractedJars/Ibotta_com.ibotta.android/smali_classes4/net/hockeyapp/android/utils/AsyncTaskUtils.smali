.class public Lnet/hockeyapp/android/utils/AsyncTaskUtils;
.super Ljava/lang/Object;
.source "AsyncTaskUtils.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# static fields
.field private static sCustomExecutor:Ljava/util/concurrent/Executor;


# direct methods
.method public static execute(Landroid/os/AsyncTask;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/AsyncTask<",
            "Ljava/lang/Void;",
            "**>;)V"
        }
    .end annotation

    .line 21
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0xc

    if-gt v0, v2, :cond_1

    .line 22
    new-array v0, v1, [Ljava/lang/Void;

    instance-of v1, p0, Landroid/os/AsyncTask;

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_1

    :cond_0
    check-cast p0, Landroid/os/AsyncTask;

    invoke-static {p0, v0}, Lcom/newrelic/agent/android/instrumentation/AsyncTaskInstrumentation;->execute(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_1

    .line 24
    :cond_1
    sget-object v0, Lnet/hockeyapp/android/utils/AsyncTaskUtils;->sCustomExecutor:Ljava/util/concurrent/Executor;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    :goto_0
    new-array v1, v1, [Ljava/lang/Void;

    instance-of v2, p0, Landroid/os/AsyncTask;

    if-nez v2, :cond_3

    invoke-virtual {p0, v0, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_1

    :cond_3
    check-cast p0, Landroid/os/AsyncTask;

    invoke-static {p0, v0, v1}, Lcom/newrelic/agent/android/instrumentation/AsyncTaskInstrumentation;->executeOnExecutor(Landroid/os/AsyncTask;Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_1
    return-void
.end method
