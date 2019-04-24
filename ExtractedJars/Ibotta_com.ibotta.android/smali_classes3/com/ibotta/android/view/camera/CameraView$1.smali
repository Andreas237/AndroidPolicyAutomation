.class Lcom/ibotta/android/view/camera/CameraView$1;
.super Landroid/os/AsyncTask;
.source "CameraView.java"

# interfaces
.implements Lcom/newrelic/agent/android/api/v2/TraceFieldInterface;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/view/camera/CameraView;->openCamera(Landroid/view/SurfaceHolder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
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

.field final synthetic this$0:Lcom/ibotta/android/view/camera/CameraView;

.field final synthetic val$holder:Landroid/view/SurfaceHolder;


# direct methods
.method constructor <init>(Lcom/ibotta/android/view/camera/CameraView;Landroid/view/SurfaceHolder;)V
    .locals 0

    .line 242
    iput-object p1, p0, Lcom/ibotta/android/view/camera/CameraView$1;->this$0:Lcom/ibotta/android/view/camera/CameraView;

    iput-object p2, p0, Lcom/ibotta/android/view/camera/CameraView$1;->val$holder:Landroid/view/SurfaceHolder;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method public _nr_setTrace(Lcom/newrelic/agent/android/tracing/Trace;)V
    .locals 0

    :try_start_0
    iput-object p1, p0, Lcom/ibotta/android/view/camera/CameraView$1;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/view/camera/CameraView$1;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "CameraView$1#doInBackground"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "CameraView$1#doInBackground"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 242
    :goto_0
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/camera/CameraView$1;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    invoke-static {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->unloadTraceContext(Ljava/lang/Object;)V

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 3

    .line 251
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView$1;->isCancelled()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    return-object v0

    .line 256
    :cond_0
    :try_start_0
    iget-object p1, p0, Lcom/ibotta/android/view/camera/CameraView$1;->this$0:Lcom/ibotta/android/view/camera/CameraView;

    invoke-static {}, Landroid/hardware/Camera;->open()Landroid/hardware/Camera;

    move-result-object v1

    iput-object v1, p1, Lcom/ibotta/android/view/camera/CameraView;->camera:Landroid/hardware/Camera;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 258
    iget-object v1, p0, Lcom/ibotta/android/view/camera/CameraView$1;->this$0:Lcom/ibotta/android/view/camera/CameraView;

    iput-object v0, v1, Lcom/ibotta/android/view/camera/CameraView;->camera:Landroid/hardware/Camera;

    const-string v1, "Failed to open camera."

    const/4 v2, 0x0

    .line 259
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-object v0
.end method

.method protected onCancelled()V
    .locals 1

    .line 266
    iget-object v0, p0, Lcom/ibotta/android/view/camera/CameraView$1;->this$0:Lcom/ibotta/android/view/camera/CameraView;

    invoke-static {v0}, Lcom/ibotta/android/view/camera/CameraView;->access$000(Lcom/ibotta/android/view/camera/CameraView;)V

    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/view/camera/CameraView$1;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "CameraView$1#onPostExecute"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "CameraView$1#onPostExecute"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 242
    :goto_0
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/camera/CameraView$1;->onPostExecute(Ljava/lang/Void;)V

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Void;)V
    .locals 3

    .line 270
    iget-object p1, p0, Lcom/ibotta/android/view/camera/CameraView$1;->this$0:Lcom/ibotta/android/view/camera/CameraView;

    iget-object p1, p1, Lcom/ibotta/android/view/camera/CameraView;->camera:Landroid/hardware/Camera;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "Camera is null. Can\'t initialize."

    .line 271
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 275
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView$1;->isCancelled()Z

    move-result p1

    if-nez p1, :cond_2

    .line 276
    iget-object p1, p0, Lcom/ibotta/android/view/camera/CameraView$1;->this$0:Lcom/ibotta/android/view/camera/CameraView;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lcom/ibotta/android/view/camera/CameraView;->access$102(Lcom/ibotta/android/view/camera/CameraView;Landroid/os/AsyncTask;)Landroid/os/AsyncTask;

    :try_start_0
    const-string p1, "Opening camera."

    .line 279
    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p1, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    iget-object p1, p0, Lcom/ibotta/android/view/camera/CameraView$1;->this$0:Lcom/ibotta/android/view/camera/CameraView;

    iget-object p1, p1, Lcom/ibotta/android/view/camera/CameraView;->camera:Landroid/hardware/Camera;

    iget-object v1, p0, Lcom/ibotta/android/view/camera/CameraView$1;->this$0:Lcom/ibotta/android/view/camera/CameraView;

    invoke-virtual {p1, v1}, Landroid/hardware/Camera;->setErrorCallback(Landroid/hardware/Camera$ErrorCallback;)V

    .line 281
    iget-object p1, p0, Lcom/ibotta/android/view/camera/CameraView$1;->this$0:Lcom/ibotta/android/view/camera/CameraView;

    invoke-virtual {p1}, Lcom/ibotta/android/view/camera/CameraView;->initCamera()V

    const-string p1, "Camera opened."

    .line 282
    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p1, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v1, "Failed to open camera."

    .line 284
    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/view/camera/CameraView$1;->this$0:Lcom/ibotta/android/view/camera/CameraView;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/view/camera/CameraView;->setVisibility(I)V

    .line 289
    iget-object p1, p0, Lcom/ibotta/android/view/camera/CameraView$1;->this$0:Lcom/ibotta/android/view/camera/CameraView;

    invoke-virtual {p1}, Lcom/ibotta/android/view/camera/CameraView;->onCameraOpened()V

    .line 291
    iget-object p1, p0, Lcom/ibotta/android/view/camera/CameraView$1;->this$0:Lcom/ibotta/android/view/camera/CameraView;

    invoke-virtual {p1}, Lcom/ibotta/android/view/camera/CameraView;->getContext()Landroid/content/Context;

    move-result-object p1

    instance-of p1, p1, Lcom/ibotta/android/view/camera/CameraView$CameraListener;

    if-eqz p1, :cond_1

    .line 292
    iget-object p1, p0, Lcom/ibotta/android/view/camera/CameraView$1;->this$0:Lcom/ibotta/android/view/camera/CameraView;

    invoke-virtual {p1}, Lcom/ibotta/android/view/camera/CameraView;->getContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/view/camera/CameraView$CameraListener;

    invoke-interface {p1}, Lcom/ibotta/android/view/camera/CameraView$CameraListener;->onCameraOpened()V

    .line 295
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/view/camera/CameraView$1;->this$0:Lcom/ibotta/android/view/camera/CameraView;

    iget-object v0, p0, Lcom/ibotta/android/view/camera/CameraView$1;->val$holder:Landroid/view/SurfaceHolder;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/camera/CameraView;->access$200(Lcom/ibotta/android/view/camera/CameraView;Landroid/view/SurfaceHolder;)V

    goto :goto_1

    .line 297
    :cond_2
    iget-object p1, p0, Lcom/ibotta/android/view/camera/CameraView$1;->this$0:Lcom/ibotta/android/view/camera/CameraView;

    invoke-static {p1}, Lcom/ibotta/android/view/camera/CameraView;->access$000(Lcom/ibotta/android/view/camera/CameraView;)V

    :goto_1
    return-void
.end method

.method protected onPreExecute()V
    .locals 1

    .line 244
    iget-object v0, p0, Lcom/ibotta/android/view/camera/CameraView$1;->this$0:Lcom/ibotta/android/view/camera/CameraView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/camera/CameraView;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/android/view/camera/CameraView$CameraListener;

    if-eqz v0, :cond_0

    .line 245
    iget-object v0, p0, Lcom/ibotta/android/view/camera/CameraView$1;->this$0:Lcom/ibotta/android/view/camera/CameraView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/camera/CameraView;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/camera/CameraView$CameraListener;

    invoke-interface {v0}, Lcom/ibotta/android/view/camera/CameraView$CameraListener;->onCameraOpening()V

    :cond_0
    return-void
.end method
