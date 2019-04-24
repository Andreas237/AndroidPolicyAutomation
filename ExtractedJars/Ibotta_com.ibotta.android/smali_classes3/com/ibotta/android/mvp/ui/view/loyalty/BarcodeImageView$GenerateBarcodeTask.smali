.class Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;
.super Landroid/os/AsyncTask;
.source "BarcodeImageView.java"

# interfaces
.implements Lcom/newrelic/agent/android/api/v2/TraceFieldInterface;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "GenerateBarcodeTask"
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

.field private info:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;

.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;)V
    .locals 0

    .line 150
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;->this$0:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;

    .line 151
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 152
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;->info:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;

    return-void
.end method


# virtual methods
.method public _nr_setTrace(Lcom/newrelic/agent/android/tracing/Trace;)V
    .locals 0

    :try_start_0
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Landroid/graphics/Bitmap;
    .locals 4

    .line 167
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;->info:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->isValid()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "Generating: %1$s"

    .line 173
    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;->info:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v0

    invoke-static {p1, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;->info:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->getData()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;->info:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->getFormat()Lcom/ibotta/android/barcode/Format;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;->info:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->getWidth()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;->info:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->getHeight()I

    move-result v2

    invoke-static {p1, v0, v1, v2}, Lcom/ibotta/android/barcode/BarcodeGenerator;->generate(Ljava/lang/String;Lcom/ibotta/android/barcode/Format;II)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    .line 168
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;->info:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;

    const/4 v2, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_2
    move-object p1, v2

    :goto_1
    const-string v3, "Invalid barcode generation parameters: %1$s"

    .line 169
    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v0

    invoke-static {v3, v1}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v2
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "BarcodeImageView$GenerateBarcodeTask#doInBackground"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "BarcodeImageView$GenerateBarcodeTask#doInBackground"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 147
    :goto_0
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;->doInBackground([Ljava/lang/Void;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    invoke-static {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->unloadTraceContext(Ljava/lang/Object;)V

    return-object p1
.end method

.method public getBarcodeInfo()Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;->info:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;

    return-object v0
.end method

.method protected onPostExecute(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 179
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 180
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;->this$0:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;

    invoke-static {v0, p1}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->access$000(Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "BarcodeImageView$GenerateBarcodeTask#onPostExecute"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "BarcodeImageView$GenerateBarcodeTask#onPostExecute"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 147
    :goto_0
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;->onPostExecute(Landroid/graphics/Bitmap;)V

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-void
.end method

.method protected onPreExecute()V
    .locals 1

    .line 161
    invoke-super {p0}, Landroid/os/AsyncTask;->onPreExecute()V

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;->this$0:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->freeBitmap()V

    return-void
.end method
