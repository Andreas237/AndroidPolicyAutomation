.class public Lcom/ibotta/android/async/image/ImageSaveAsyncTask;
.super Landroid/os/AsyncTask;
.source "ImageSaveAsyncTask.java"

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
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public _nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

.field private final bitmap:Landroid/graphics/Bitmap;

.field private final compressFormat:Landroid/graphics/Bitmap$CompressFormat;

.field private final fileToSave:Ljava/io/File;

.field private listener:Lcom/ibotta/android/async/image/ImageSaveAsyncListener;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final quality:I

.field private success:Z


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;ILjava/io/File;Lcom/ibotta/android/async/image/ImageSaveAsyncListener;)V
    .locals 1

    .line 37
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const/4 v0, 0x0

    .line 30
    iput-boolean v0, p0, Lcom/ibotta/android/async/image/ImageSaveAsyncTask;->success:Z

    .line 38
    iput-object p1, p0, Lcom/ibotta/android/async/image/ImageSaveAsyncTask;->bitmap:Landroid/graphics/Bitmap;

    .line 39
    iput-object p2, p0, Lcom/ibotta/android/async/image/ImageSaveAsyncTask;->compressFormat:Landroid/graphics/Bitmap$CompressFormat;

    .line 40
    iput p3, p0, Lcom/ibotta/android/async/image/ImageSaveAsyncTask;->quality:I

    .line 41
    iput-object p4, p0, Lcom/ibotta/android/async/image/ImageSaveAsyncTask;->fileToSave:Ljava/io/File;

    .line 42
    iput-object p5, p0, Lcom/ibotta/android/async/image/ImageSaveAsyncTask;->listener:Lcom/ibotta/android/async/image/ImageSaveAsyncListener;

    return-void
.end method

.method private handleError(Ljava/io/FileNotFoundException;)V
    .locals 2

    .line 88
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Failed to save image."

    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 89
    invoke-static {v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;)V

    .line 90
    sget-object p1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public _nr_setTrace(Lcom/newrelic/agent/android/tracing/Trace;)V
    .locals 0

    :try_start_0
    iput-object p1, p0, Lcom/ibotta/android/async/image/ImageSaveAsyncTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public disconnect()V
    .locals 1

    const/4 v0, 0x0

    .line 83
    iput-object v0, p0, Lcom/ibotta/android/async/image/ImageSaveAsyncTask;->listener:Lcom/ibotta/android/async/image/ImageSaveAsyncListener;

    const/4 v0, 0x1

    .line 84
    invoke-super {p0, v0}, Landroid/os/AsyncTask;->cancel(Z)Z

    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/async/image/ImageSaveAsyncTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "ImageSaveAsyncTask#doInBackground"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "ImageSaveAsyncTask#doInBackground"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    :goto_0
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/async/image/ImageSaveAsyncTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    invoke-static {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->unloadTraceContext(Ljava/lang/Object;)V

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 7

    const/4 p1, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 50
    :try_start_0
    new-instance v2, Ljava/io/FileOutputStream;

    iget-object v3, p0, Lcom/ibotta/android/async/image/ImageSaveAsyncTask;->fileToSave:Ljava/io/File;

    invoke-direct {v2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    :try_start_1
    iget-object v3, p0, Lcom/ibotta/android/async/image/ImageSaveAsyncTask;->bitmap:Landroid/graphics/Bitmap;

    iget-object v4, p0, Lcom/ibotta/android/async/image/ImageSaveAsyncTask;->compressFormat:Landroid/graphics/Bitmap$CompressFormat;

    iget v5, p0, Lcom/ibotta/android/async/image/ImageSaveAsyncTask;->quality:I

    invoke-virtual {v3, v4, v5, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    move-result v3

    iput-boolean v3, p0, Lcom/ibotta/android/async/image/ImageSaveAsyncTask;->success:Z
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 57
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catch_0
    move-exception v2

    const-string v3, "Failed to close FileOutputStream for: %1$s"

    .line 60
    new-array v1, v1, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/ibotta/android/async/image/ImageSaveAsyncTask;->fileToSave:Ljava/io/File;

    aput-object v4, v1, v0

    goto :goto_1

    :catch_1
    move-exception v3

    goto :goto_0

    :catchall_0
    move-exception v2

    move-object v6, v2

    move-object v2, p1

    move-object p1, v6

    goto :goto_3

    :catch_2
    move-exception v3

    move-object v2, p1

    .line 53
    :goto_0
    :try_start_3
    invoke-direct {p0, v3}, Lcom/ibotta/android/async/image/ImageSaveAsyncTask;->handleError(Ljava/io/FileNotFoundException;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v2, :cond_0

    .line 57
    :try_start_4
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_2

    :catch_3
    move-exception v2

    const-string v3, "Failed to close FileOutputStream for: %1$s"

    .line 60
    new-array v1, v1, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/ibotta/android/async/image/ImageSaveAsyncTask;->fileToSave:Ljava/io/File;

    aput-object v4, v1, v0

    :goto_1
    invoke-static {v2, v3, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :goto_2
    return-object p1

    :catchall_1
    move-exception p1

    :goto_3
    if-eqz v2, :cond_1

    .line 57
    :try_start_5
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    goto :goto_4

    :catch_4
    move-exception v2

    .line 60
    new-array v1, v1, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/android/async/image/ImageSaveAsyncTask;->fileToSave:Ljava/io/File;

    aput-object v3, v1, v0

    const-string v0, "Failed to close FileOutputStream for: %1$s"

    invoke-static {v2, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    :cond_1
    :goto_4
    throw p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/async/image/ImageSaveAsyncTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "ImageSaveAsyncTask#onPostExecute"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "ImageSaveAsyncTask#onPostExecute"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    :goto_0
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/async/image/ImageSaveAsyncTask;->onPostExecute(Ljava/lang/Void;)V

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Void;)V
    .locals 1

    .line 69
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 71
    iget-object p1, p0, Lcom/ibotta/android/async/image/ImageSaveAsyncTask;->listener:Lcom/ibotta/android/async/image/ImageSaveAsyncListener;

    if-nez p1, :cond_0

    return-void

    .line 75
    :cond_0
    iget-boolean v0, p0, Lcom/ibotta/android/async/image/ImageSaveAsyncTask;->success:Z

    if-eqz v0, :cond_1

    .line 76
    invoke-interface {p1}, Lcom/ibotta/android/async/image/ImageSaveAsyncListener;->onImageFileSavedSuccessfully()V

    goto :goto_0

    .line 78
    :cond_1
    invoke-interface {p1}, Lcom/ibotta/android/async/image/ImageSaveAsyncListener;->onImageFileSaveFailed()V

    :goto_0
    return-void
.end method
