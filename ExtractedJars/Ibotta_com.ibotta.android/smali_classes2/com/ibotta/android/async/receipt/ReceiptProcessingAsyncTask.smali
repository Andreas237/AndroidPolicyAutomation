.class public Lcom/ibotta/android/async/receipt/ReceiptProcessingAsyncTask;
.super Landroid/os/AsyncTask;
.source "ReceiptProcessingAsyncTask.java"

# interfaces
.implements Lcom/newrelic/agent/android/api/v2/TraceFieldInterface;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/io/File;",
        ">;"
    }
.end annotation


# instance fields
.field public _nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

.field private final outputStream:Ljava/io/ByteArrayOutputStream;

.field private final pipeline:Lcom/ibotta/android/util/pipeline/Pipeline;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ibotta/android/util/pipeline/Pipeline<",
            "Ljava/io/ByteArrayOutputStream;",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/pipeline/Pipeline;Ljava/io/ByteArrayOutputStream;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/util/pipeline/Pipeline<",
            "Ljava/io/ByteArrayOutputStream;",
            "Ljava/io/File;",
            ">;",
            "Ljava/io/ByteArrayOutputStream;",
            ")V"
        }
    .end annotation

    .line 20
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/async/receipt/ReceiptProcessingAsyncTask;->pipeline:Lcom/ibotta/android/util/pipeline/Pipeline;

    .line 22
    iput-object p2, p0, Lcom/ibotta/android/async/receipt/ReceiptProcessingAsyncTask;->outputStream:Ljava/io/ByteArrayOutputStream;

    return-void
.end method


# virtual methods
.method public _nr_setTrace(Lcom/newrelic/agent/android/tracing/Trace;)V
    .locals 0

    :try_start_0
    iput-object p1, p0, Lcom/ibotta/android/async/receipt/ReceiptProcessingAsyncTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/io/File;
    .locals 2

    .line 30
    :try_start_0
    iget-object p1, p0, Lcom/ibotta/android/async/receipt/ReceiptProcessingAsyncTask;->pipeline:Lcom/ibotta/android/util/pipeline/Pipeline;

    iget-object v0, p0, Lcom/ibotta/android/async/receipt/ReceiptProcessingAsyncTask;->outputStream:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/util/pipeline/Pipeline;->process(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/File;
    :try_end_0
    .catch Lcom/ibotta/android/util/pipeline/PipeProcessingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to process receipt image"

    const/4 v1, 0x0

    .line 32
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/async/receipt/ReceiptProcessingAsyncTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "ReceiptProcessingAsyncTask#doInBackground"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "ReceiptProcessingAsyncTask#doInBackground"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    :goto_0
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/async/receipt/ReceiptProcessingAsyncTask;->doInBackground([Ljava/lang/Void;)Ljava/io/File;

    move-result-object p1

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    invoke-static {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->unloadTraceContext(Ljava/lang/Object;)V

    return-object p1
.end method
