.class Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay$1;
.super Ljava/lang/Object;
.source "ReceiptProductSelectorHeaderOverlay.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;->createView(Landroid/content/Context;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;


# direct methods
.method constructor <init>(Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay$1;->this$0:Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 55
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0x172

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 56
    invoke-static {}, Lcom/shopkick/app/overlays/OverlayInfo;->getInstance()Lcom/shopkick/app/overlays/OverlayInfo;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay$1;->this$0:Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;

    invoke-static {v1}, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;->access$000(Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/overlays/OverlayInfo;->enumForKey(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOverlay(Ljava/lang/Integer;)V

    .line 57
    iget-object v0, p0, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay$1;->this$0:Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;

    iget-object v0, v0, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 58
    iget-object p1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay$1;->this$0:Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;

    invoke-static {p1}, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;->access$100(Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;)Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    const-string/jumbo v0, "sk://screen/top/webview?url=https://s3-us-west-2.amazonaws.com/shopkick-prod-programming/Grocery+Launch/Grocery+Receipt+Submission/how-to-receipt.html"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    .line 59
    iget-object p1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay$1;->this$0:Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;

    invoke-virtual {p1}, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;->dismiss()V

    return-void
.end method
