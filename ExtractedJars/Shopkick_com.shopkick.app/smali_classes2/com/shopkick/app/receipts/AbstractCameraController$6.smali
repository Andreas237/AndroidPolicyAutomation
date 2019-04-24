.class Lcom/shopkick/app/receipts/AbstractCameraController$6;
.super Ljava/lang/Object;
.source "AbstractCameraController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/receipts/AbstractCameraController;->analyzeReceipt(Landroid/graphics/Bitmap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/receipts/AbstractCameraController;

.field final synthetic val$ocrDialogBuilder:Landroid/app/AlertDialog$Builder;

.field final synthetic val$skocrProcessor:Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;

.field final synthetic val$tSpend:D


# direct methods
.method constructor <init>(Lcom/shopkick/app/receipts/AbstractCameraController;Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;DLandroid/app/AlertDialog$Builder;)V
    .locals 0

    .line 279
    iput-object p1, p0, Lcom/shopkick/app/receipts/AbstractCameraController$6;->this$0:Lcom/shopkick/app/receipts/AbstractCameraController;

    iput-object p2, p0, Lcom/shopkick/app/receipts/AbstractCameraController$6;->val$skocrProcessor:Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;

    iput-wide p3, p0, Lcom/shopkick/app/receipts/AbstractCameraController$6;->val$tSpend:D

    iput-object p5, p0, Lcom/shopkick/app/receipts/AbstractCameraController$6;->val$ocrDialogBuilder:Landroid/app/AlertDialog$Builder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 282
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    .line 283
    iget-object v1, p0, Lcom/shopkick/app/receipts/AbstractCameraController$6;->val$skocrProcessor:Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;

    invoke-virtual {v1}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->getStdImgSize()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOcrImageSize(Ljava/lang/Integer;)V

    .line 284
    iget-wide v1, p0, Lcom/shopkick/app/receipts/AbstractCameraController$6;->val$tSpend:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOcrProcessTime(Ljava/lang/Double;)V

    .line 285
    iget-object v1, p0, Lcom/shopkick/app/receipts/AbstractCameraController$6;->this$0:Lcom/shopkick/app/receipts/AbstractCameraController;

    iget-object v2, p0, Lcom/shopkick/app/receipts/AbstractCameraController$6;->val$skocrProcessor:Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;

    invoke-virtual {v2}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->getResultBrightness()F

    move-result v2

    iget-object v3, p0, Lcom/shopkick/app/receipts/AbstractCameraController$6;->val$skocrProcessor:Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;

    .line 286
    invoke-virtual {v3}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->getResultContrast()F

    move-result v3

    iget-object v4, p0, Lcom/shopkick/app/receipts/AbstractCameraController$6;->val$skocrProcessor:Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;

    invoke-virtual {v4}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->getResultElementAmount()I

    move-result v4

    iget-object v5, p0, Lcom/shopkick/app/receipts/AbstractCameraController$6;->val$skocrProcessor:Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;

    .line 287
    invoke-virtual {v5}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->getResultTopologicScore()F

    move-result v5

    .line 285
    invoke-static {v1, v2, v3, v4, v5}, Lcom/shopkick/app/receipts/AbstractCameraController;->access$000(Lcom/shopkick/app/receipts/AbstractCameraController;FFIF)D

    move-result-wide v1

    double-to-int v3, v1

    .line 288
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOcrScore(Ljava/lang/Integer;)V

    const-string v3, "1.6.5"

    .line 289
    invoke-virtual {v0, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOcrVersion(Ljava/lang/String;)V

    const-wide/high16 v3, 0x4039000000000000L    # 25.0

    cmpg-double v1, v1, v3

    const/4 v2, 0x0

    if-gez v1, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    move v3, v2

    .line 290
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOcrIsGoodReceipt(Ljava/lang/Boolean;)V

    .line 291
    iget-object v3, p0, Lcom/shopkick/app/receipts/AbstractCameraController$6;->this$0:Lcom/shopkick/app/receipts/AbstractCameraController;

    iget-object v3, v3, Lcom/shopkick/app/receipts/AbstractCameraController;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    iget-object v3, v3, Lcom/shopkick/app/receipts/ReceiptScanScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v3, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 292
    iget-object v0, p0, Lcom/shopkick/app/receipts/AbstractCameraController$6;->this$0:Lcom/shopkick/app/receipts/AbstractCameraController;

    iget-object v0, v0, Lcom/shopkick/app/receipts/AbstractCameraController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableOcrTest:Ljava/lang/Boolean;

    invoke-static {v0, v2}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 293
    iget-object v0, p0, Lcom/shopkick/app/receipts/AbstractCameraController$6;->val$ocrDialogBuilder:Landroid/app/AlertDialog$Builder;

    iget-object v3, p0, Lcom/shopkick/app/receipts/AbstractCameraController$6;->this$0:Lcom/shopkick/app/receipts/AbstractCameraController;

    iget-object v4, p0, Lcom/shopkick/app/receipts/AbstractCameraController$6;->val$skocrProcessor:Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;

    iget-wide v5, p0, Lcom/shopkick/app/receipts/AbstractCameraController$6;->val$tSpend:D

    invoke-static {v3, v4, v5, v6}, Lcom/shopkick/app/receipts/AbstractCameraController;->access$100(Lcom/shopkick/app/receipts/AbstractCameraController;Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;D)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 294
    iget-object v0, p0, Lcom/shopkick/app/receipts/AbstractCameraController$6;->val$ocrDialogBuilder:Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 295
    iget-object v0, p0, Lcom/shopkick/app/receipts/AbstractCameraController$6;->val$ocrDialogBuilder:Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 297
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/receipts/AbstractCameraController$6;->val$skocrProcessor:Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;

    invoke-virtual {v0}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->releaseOCRProcessor()V

    .line 300
    iget-object v0, p0, Lcom/shopkick/app/receipts/AbstractCameraController$6;->this$0:Lcom/shopkick/app/receipts/AbstractCameraController;

    iput-boolean v2, v0, Lcom/shopkick/app/receipts/AbstractCameraController;->isProcessingReceipt:Z

    if-gez v1, :cond_2

    .line 302
    iget-object v0, v0, Lcom/shopkick/app/receipts/AbstractCameraController;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->updateUIFromState(I)V

    goto :goto_1

    .line 304
    :cond_2
    iget-object v0, v0, Lcom/shopkick/app/receipts/AbstractCameraController;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->updateUIFromState(I)V

    :goto_1
    return-void
.end method
