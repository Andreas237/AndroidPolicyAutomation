.class Lcom/usebutton/sdk/internal/ImageLoader$2;
.super Landroid/os/AsyncTask;
.source "ImageLoader.java"

# interfaces
.implements Lcom/newrelic/agent/android/api/v2/TraceFieldInterface;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/ImageLoader;->load(Landroid/net/Uri;Landroid/widget/ImageView;)Landroid/os/AsyncTask;
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
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public _nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

.field final synthetic this$0:Lcom/usebutton/sdk/internal/ImageLoader;

.field final synthetic val$drawableHeight:I

.field final synthetic val$drawableWidth:I

.field final synthetic val$image:Landroid/net/Uri;

.field final synthetic val$target:Ljava/lang/ref/WeakReference;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/ImageLoader;Landroid/net/Uri;IILjava/lang/ref/WeakReference;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/usebutton/sdk/internal/ImageLoader$2;->this$0:Lcom/usebutton/sdk/internal/ImageLoader;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/ImageLoader$2;->val$image:Landroid/net/Uri;

    iput p3, p0, Lcom/usebutton/sdk/internal/ImageLoader$2;->val$drawableWidth:I

    iput p4, p0, Lcom/usebutton/sdk/internal/ImageLoader$2;->val$drawableHeight:I

    iput-object p5, p0, Lcom/usebutton/sdk/internal/ImageLoader$2;->val$target:Ljava/lang/ref/WeakReference;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method public _nr_setTrace(Lcom/newrelic/agent/android/tracing/Trace;)V
    .locals 0

    :try_start_0
    iput-object p1, p0, Lcom/usebutton/sdk/internal/ImageLoader$2;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Landroid/graphics/Bitmap;
    .locals 3

    const/4 p1, 0x0

    .line 60
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ImageLoader$2;->this$0:Lcom/usebutton/sdk/internal/ImageLoader;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/ImageLoader$2;->val$image:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/ImageLoader;->getImageData(Landroid/net/Uri;)[B

    move-result-object v0

    .line 61
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/ImageLoader$2;->isCancelled()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p1

    .line 62
    :cond_0
    iget v1, p0, Lcom/usebutton/sdk/internal/ImageLoader$2;->val$drawableWidth:I

    iget v2, p0, Lcom/usebutton/sdk/internal/ImageLoader$2;->val$drawableHeight:I

    invoke-static {v0, v1, v2}, Lcom/usebutton/sdk/internal/util/ViewUtils;->decodeImageWithin([BII)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_0
    .catch Lcom/usebutton/sdk/internal/api/ButtonNetworkException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    return-object p1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/ImageLoader$2;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "ImageLoader$2#doInBackground"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "ImageLoader$2#doInBackground"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    :goto_0
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/ImageLoader$2;->doInBackground([Ljava/lang/Void;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    invoke-static {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->unloadTraceContext(Ljava/lang/Object;)V

    return-object p1
.end method

.method protected onPostExecute(Landroid/graphics/Bitmap;)V
    .locals 2

    .line 70
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ImageLoader$2;->val$target:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 71
    iget-object v1, p0, Lcom/usebutton/sdk/internal/ImageLoader$2;->this$0:Lcom/usebutton/sdk/internal/ImageLoader;

    invoke-static {v1, v0, p0}, Lcom/usebutton/sdk/internal/ImageLoader;->access$000(Lcom/usebutton/sdk/internal/ImageLoader;Landroid/widget/ImageView;Landroid/os/AsyncTask;)V

    if-nez v0, :cond_0

    return-void

    .line 75
    :cond_0
    invoke-virtual {v0}, Landroid/widget/ImageView;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    .line 76
    :cond_1
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/ImageLoader$2;->isCancelled()Z

    move-result v1

    if-eqz v1, :cond_2

    return-void

    .line 77
    :cond_2
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 78
    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/ViewUtils;->show(Landroid/view/View;)V

    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/ImageLoader$2;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "ImageLoader$2#onPostExecute"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "ImageLoader$2#onPostExecute"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    :goto_0
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/ImageLoader$2;->onPostExecute(Landroid/graphics/Bitmap;)V

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-void
.end method
