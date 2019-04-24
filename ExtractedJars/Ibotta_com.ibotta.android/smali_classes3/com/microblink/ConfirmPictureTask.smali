.class Lcom/microblink/ConfirmPictureTask;
.super Landroid/os/AsyncTask;

# interfaces
.implements Lcom/newrelic/agent/android/api/v2/TraceFieldInterface;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Lcom/microblink/BitmapResult;",
        "Ljava/lang/Void;",
        "Ljava/io/File;",
        ">;"
    }
.end annotation


# static fields
.field private static final CAPTURED_PREFIX:Ljava/lang/String; = "captured"

.field private static final TAG:Ljava/lang/String; = "ConfirmPictureTask"


# instance fields
.field public _nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

.field private final callback:Lcom/microblink/CameraRecognizerCallback;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final context:Landroid/content/Context;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation

    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final options:Lcom/microblink/ScanOptions;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final receiptId:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/microblink/ScanOptions;Lcom/microblink/CameraRecognizerCallback;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/microblink/ScanOptions;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/microblink/CameraRecognizerCallback;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-object p4, p0, Lcom/microblink/ConfirmPictureTask;->callback:Lcom/microblink/CameraRecognizerCallback;

    iput-object p3, p0, Lcom/microblink/ConfirmPictureTask;->options:Lcom/microblink/ScanOptions;

    iput-object p2, p0, Lcom/microblink/ConfirmPictureTask;->receiptId:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/ConfirmPictureTask;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public _nr_setTrace(Lcom/newrelic/agent/android/tracing/Trace;)V
    .locals 0

    :try_start_0
    iput-object p1, p0, Lcom/microblink/ConfirmPictureTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method protected varargs doInBackground([Lcom/microblink/BitmapResult;)Ljava/io/File;
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Lcom/microblink/ConfirmPictureTask;->isCancelled()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string p1, "ConfirmPictureTask"

    const-string v2, "thread has been cancelled."

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {p1, v2, v3}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0

    :cond_0
    aget-object p1, p1, v1

    instance-of v2, p1, Lcom/microblink/TakePictureResult;

    if-eqz v2, :cond_1

    move-object v2, p1

    check-cast v2, Lcom/microblink/TakePictureResult;

    invoke-virtual {v2}, Lcom/microblink/TakePictureResult;->highResBitmap()Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/microblink/internal/BitmapUtils;->copy(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;

    move-result-object v2

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lcom/microblink/BitmapResult;->copy()Landroid/graphics/Bitmap;

    move-result-object v2

    :goto_0
    iget-object v3, p0, Lcom/microblink/ConfirmPictureTask;->options:Lcom/microblink/ScanOptions;

    invoke-virtual {v3}, Lcom/microblink/ScanOptions;->frameCharacteristics()Lcom/microblink/FrameCharacteristics;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/microblink/ConfirmPictureTask;->receiptId:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "_captured"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    invoke-interface {p1}, Lcom/microblink/BitmapResult;->blurScore()I

    move-result p1

    invoke-static {v4, v5, v6, p1, v3}, Lcom/microblink/internal/DiskUtils;->createName(Ljava/lang/String;IIILcom/microblink/FrameCharacteristics;)Ljava/lang/String;

    move-result-object p1

    iget-object v4, p0, Lcom/microblink/ConfirmPictureTask;->context:Landroid/content/Context;

    const-string v5, "/microblink/captured"

    invoke-static {v4, p1, v5, v2, v3}, Lcom/microblink/internal/DiskUtils;->writeToDisk(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/microblink/FrameCharacteristics;)Ljava/io/File;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string v2, "ConfirmPictureTask"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v2, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/ConfirmPictureTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "ConfirmPictureTask#doInBackground"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "ConfirmPictureTask#doInBackground"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    check-cast p1, [Lcom/microblink/BitmapResult;

    invoke-virtual {p0, p1}, Lcom/microblink/ConfirmPictureTask;->doInBackground([Lcom/microblink/BitmapResult;)Ljava/io/File;

    move-result-object p1

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    invoke-static {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->unloadTraceContext(Ljava/lang/Object;)V

    return-object p1
.end method

.method protected onPostExecute(Ljava/io/File;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/microblink/ConfirmPictureTask;->callback:Lcom/microblink/CameraRecognizerCallback;

    invoke-interface {v0, p1}, Lcom/microblink/CameraRecognizerCallback;->onConfirmPicture(Ljava/io/File;)V

    :cond_0
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/ConfirmPictureTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "ConfirmPictureTask#onPostExecute"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "ConfirmPictureTask#onPostExecute"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1}, Lcom/microblink/ConfirmPictureTask;->onPostExecute(Ljava/io/File;)V

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-void
.end method
