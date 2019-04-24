.class Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$2;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->initWebViewSettings()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;)V
    .locals 0

    .line 274
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .line 286
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 287
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->access$100(Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "onPageFinished."

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;

    iget v0, v0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->webviewCodeResult:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 291
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->access$200(Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;)V

    goto :goto_0

    .line 293
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;

    iget v0, v0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->webviewCodeResult:I

    const/4 v1, -0x1

    if-ne v1, v0, :cond_1

    .line 295
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->showNoNetworkLayout()V

    .line 296
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->loadWebviewFailed()V

    goto :goto_0

    .line 298
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;

    iget v0, v0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->webviewCodeResult:I

    const/4 v1, -0x2

    if-ne v1, v0, :cond_2

    .line 300
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->showNetworkExceptionLayout()V

    .line 301
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->loadWebviewFailed()V

    .line 303
    :cond_2
    :goto_0
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2

    .line 278
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 279
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->access$100(Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "onPageStarted."

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WebViewActivity : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 281
    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 308
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    .line 309
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->access$100(Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onReceivedError.errorCode=="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  description=="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  failingUrl=="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 311
    const-string v0, "WebViewActivity : onReceivedError"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 312
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;

    invoke-static {v0}, Lo/ecz;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 314
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;

    const/4 v1, -0x2

    iput v1, v0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->webviewCodeResult:I

    goto :goto_0

    .line 318
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;

    const/4 v1, -0x1

    iput v1, v0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->webviewCodeResult:I

    .line 320
    :goto_0
    return-void
.end method
