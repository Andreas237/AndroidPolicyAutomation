.class Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask;
.super Landroid/os/AsyncTask;

# interfaces
.implements Lcom/newrelic/agent/android/api/v2/TraceFieldInterface;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/internal/services/io/BitmapServiceImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "BitmapAsyncTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/util/List<",
        "Landroid/graphics/Bitmap;",
        ">;>;"
    }
.end annotation


# static fields
.field private static final DEFAULT_TIMEOUT:I = 0xa


# instance fields
.field public _nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

.field private listener:Lcom/microblink/OnNullableCompleteListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/microblink/OnNullableCompleteListener<",
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;>;"
        }
    .end annotation
.end field

.field private final timeout:I


# direct methods
.method constructor <init>(ILcom/microblink/OnNullableCompleteListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/microblink/OnNullableCompleteListener<",
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    const/16 p1, 0xa

    :goto_0
    iput p1, p0, Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask;->timeout:I

    iput-object p2, p0, Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask;->listener:Lcom/microblink/OnNullableCompleteListener;

    return-void
.end method


# virtual methods
.method public _nr_setTrace(Lcom/newrelic/agent/android/tracing/Trace;)V
    .locals 0

    :try_start_0
    iput-object p1, p0, Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "BitmapServiceImpl$BitmapAsyncTask#doInBackground"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "BitmapServiceImpl$BitmapAsyncTask#doInBackground"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask;->doInBackground([Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    invoke-static {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->unloadTraceContext(Ljava/lang/Object;)V

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/String;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Lcom/microblink/internal/ExecutorSupplier;->getInstance()Lcom/microblink/internal/ExecutorSupplier;

    move-result-object v1

    invoke-virtual {v1}, Lcom/microblink/internal/ExecutorSupplier;->network()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    array-length v3, p1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, p1, v4

    new-instance v6, Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask$1;

    sget-object v7, Lcom/microblink/internal/Priority;->MEDIUM:Lcom/microblink/internal/Priority;

    invoke-direct {v6, p0, v7, v5, v2}, Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask$1;-><init>(Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask;Lcom/microblink/internal/Priority;Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {v1, v6}, Ljava/util/concurrent/ThreadPoolExecutor;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    iget p1, p0, Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask;->timeout:I

    int-to-long v3, p1

    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v3, v4, p1}, Ljava/util/concurrent/ThreadPoolExecutor;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception p1

    const-string v1, "BitmapServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v0

    invoke-static {v1, v2, v3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "BitmapServiceImpl$BitmapAsyncTask#onPostExecute"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "BitmapServiceImpl$BitmapAsyncTask#onPostExecute"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask;->onPostExecute(Ljava/util/List;)V

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-void
.end method

.method protected onPostExecute(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask;->listener:Lcom/microblink/OnNullableCompleteListener;

    invoke-interface {v0, p1}, Lcom/microblink/OnNullableCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method
