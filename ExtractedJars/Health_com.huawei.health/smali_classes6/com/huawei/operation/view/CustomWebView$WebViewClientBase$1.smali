.class Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;

.field final synthetic val$reloadUrl:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;Ljava/lang/String;)V
    .locals 0

    .line 1544
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$1;->this$1:Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;

    iput-object p2, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$1;->val$reloadUrl:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 1547
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "load loadUrlVmall "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1548
    if-nez p1, :cond_0

    .line 1549
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$1;->this$1:Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;

    iget-object v0, v0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$000(Lcom/huawei/operation/view/CustomWebView;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1550
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$1;->this$1:Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;

    iget-object v0, v0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->access$002(Lcom/huawei/operation/view/CustomWebView;Z)Z

    .line 1551
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$1;->this$1:Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;

    iget-object v0, v0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$2200(Lcom/huawei/operation/view/CustomWebView;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xfa1

    const-wide/32 v2, 0x124f80

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 1552
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPageStarted isHealthVmall removeMessages(MAG_WEBVIEW_LOAD)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1553
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$1;->this$1:Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;

    iget-object v0, v0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$2000(Lcom/huawei/operation/view/CustomWebView;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xfa1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1555
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$1;->this$1:Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;

    iget-object v0, v0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$300(Lcom/huawei/operation/view/CustomWebView;)Landroid/webkit/WebView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1556
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pagerStartedWeb != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1558
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$1;->this$1:Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;

    iget-object v0, v0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$200(Lcom/huawei/operation/view/CustomWebView;)Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$1$1;

    invoke-direct {v1, p0}, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$1$1;-><init>(Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$1;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1569
    :cond_0
    return-void
.end method
