.class Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl$1;
.super Lcom/ibotta/android/async/receipt/ReceiptProcessingAsyncTask;
.source "ReceiptImageProcessorPipelineImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->processImage([B)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;Lcom/ibotta/android/util/pipeline/Pipeline;Ljava/io/ByteArrayOutputStream;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;

    invoke-direct {p0, p2, p3}, Lcom/ibotta/android/async/receipt/ReceiptProcessingAsyncTask;-><init>(Lcom/ibotta/android/util/pipeline/Pipeline;Ljava/io/ByteArrayOutputStream;)V

    return-void
.end method


# virtual methods
.method protected onPostExecute(Ljava/io/File;)V
    .locals 2

    .line 92
    invoke-super {p0, p1}, Lcom/ibotta/android/async/receipt/ReceiptProcessingAsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl$1;->isCancelled()Z

    move-result v1

    invoke-static {v0, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->access$000(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;Ljava/io/File;Z)V

    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 89
    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl$1;->onPostExecute(Ljava/io/File;)V

    return-void
.end method
