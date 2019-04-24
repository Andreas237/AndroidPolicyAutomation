.class Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;


# direct methods
.method constructor <init>(Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;)V
    .locals 0

    .line 1694
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$3;->this$1:Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1697
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$3;->this$1:Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;

    iget-object v0, v0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$300(Lcom/huawei/operation/view/CustomWebView;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V

    .line 1698
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$3;->this$1:Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;

    iget-object v0, v0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$300(Lcom/huawei/operation/view/CustomWebView;)Landroid/webkit/WebView;

    move-result-object v0

    const-string v1, "JsInteraction"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 1699
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$3;->this$1:Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;

    iget-object v0, v0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$300(Lcom/huawei/operation/view/CustomWebView;)Landroid/webkit/WebView;

    move-result-object v0

    const-string v1, "hbssdk"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 1700
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unsafeUrl removeJavascriptInterface and stoploading! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1701
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$3;->this$1:Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;

    iget-object v0, v0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$3;->this$1:Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;

    iget-object v1, v1, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v1}, Lcom/huawei/operation/view/CustomWebView;->access$1900(Lcom/huawei/operation/view/CustomWebView;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->reload(Ljava/lang/String;)V

    .line 1702
    return-void
.end method
