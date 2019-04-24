.class Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$1;
.super Landroid/webkit/WebChromeClient;
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

    .line 252
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 2

    .line 256
    const/16 v0, 0x64

    if-ne v0, p2, :cond_0

    .line 258
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->access$000(Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 260
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->access$000(Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_0

    .line 265
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->access$000(Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 267
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->access$000(Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 270
    :cond_1
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V

    .line 271
    return-void
.end method
