.class Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$ProductImageResizeAsyncTask;
.super Landroid/os/AsyncTask;
.source "SpotlightActivity.java"

# interfaces
.implements Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;
.implements Lcom/newrelic/agent/android/api/v2/TraceFieldInterface;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ProductImageResizeAsyncTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/io/File;",
        ">;",
        "Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;"
    }
.end annotation


# instance fields
.field public _nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

.field private final failedVerificationProductImagePath:Ljava/lang/String;

.field private final pipelineFactory:Lcom/ibotta/android/util/pipeline/PipelineFactory;

.field private final targetWidthInPx:I

.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/util/pipeline/PipelineFactory;ILjava/lang/String;)V
    .locals 0

    .line 836
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$ProductImageResizeAsyncTask;->this$0:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 837
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$ProductImageResizeAsyncTask;->pipelineFactory:Lcom/ibotta/android/util/pipeline/PipelineFactory;

    .line 838
    iput p3, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$ProductImageResizeAsyncTask;->targetWidthInPx:I

    .line 839
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$ProductImageResizeAsyncTask;->failedVerificationProductImagePath:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public _nr_setTrace(Lcom/newrelic/agent/android/tracing/Trace;)V
    .locals 0

    :try_start_0
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$ProductImageResizeAsyncTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/io/File;
    .locals 2

    .line 853
    new-instance p1, Ljava/io/File;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$ProductImageResizeAsyncTask;->failedVerificationProductImagePath:Ljava/lang/String;

    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 856
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$ProductImageResizeAsyncTask;->pipelineFactory:Lcom/ibotta/android/util/pipeline/PipelineFactory;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$ProductImageResizeAsyncTask;->targetWidthInPx:I

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/util/pipeline/PipelineFactory;->createProductImageResizePipeline(Ljava/io/File;I)Lcom/ibotta/android/util/pipeline/Pipeline;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ibotta/android/util/pipeline/Pipeline;->process(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/File;

    return-object p1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$ProductImageResizeAsyncTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "SpotlightActivity$ProductImageResizeAsyncTask#doInBackground"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "SpotlightActivity$ProductImageResizeAsyncTask#doInBackground"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 828
    :goto_0
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$ProductImageResizeAsyncTask;->doInBackground([Ljava/lang/Void;)Ljava/io/File;

    move-result-object p1

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    invoke-static {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->unloadTraceContext(Ljava/lang/Object;)V

    return-object p1
.end method

.method public onDialogFragmentCancelled(Ljava/lang/String;)V
    .locals 0

    const/4 p1, 0x1

    .line 873
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$ProductImageResizeAsyncTask;->cancel(Z)Z

    return-void
.end method

.method public onDialogFragmentDismissed(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method protected onPostExecute(Ljava/io/File;)V
    .locals 3

    .line 861
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 863
    sget-object v0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$ProductImageResizeAsyncTask;->this$0:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;

    const-string v2, "processing_product_image"

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->hide(Lcom/ibotta/android/activity/CompatSupplier;Ljava/lang/String;)V

    .line 864
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$ProductImageResizeAsyncTask;->this$0:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$ProductImageResizeAsyncTask;->isCancelled()Z

    move-result v1

    invoke-static {v0, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->access$100(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Ljava/io/File;Z)V

    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$ProductImageResizeAsyncTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "SpotlightActivity$ProductImageResizeAsyncTask#onPostExecute"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "SpotlightActivity$ProductImageResizeAsyncTask#onPostExecute"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 828
    :goto_0
    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$ProductImageResizeAsyncTask;->onPostExecute(Ljava/io/File;)V

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-void
.end method

.method protected onPreExecute()V
    .locals 4

    .line 844
    invoke-super {p0}, Landroid/os/AsyncTask;->onPreExecute()V

    .line 845
    invoke-static {}, Lcom/ibotta/android/fragment/dialog/LoadingIndicatorDialogFragment;->newInstance()Lcom/ibotta/android/fragment/dialog/LoadingIndicatorDialogFragment;

    move-result-object v0

    .line 846
    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/LoadingIndicatorDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    const/4 v1, 0x1

    .line 847
    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/dialog/LoadingIndicatorDialogFragment;->setCancelable(Z)V

    .line 848
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$ProductImageResizeAsyncTask;->this$0:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;

    const-string v3, "processing_product_image"

    invoke-virtual {v1, v2, v0, v3}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void
.end method
