.class Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$1;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$2:Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$1;


# direct methods
.method constructor <init>(Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$1;)V
    .locals 0

    .line 1558
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$1$1;->this$2:Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1562
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start reload reloadUrl"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1563
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$1$1;->this$2:Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$1;

    iget-object v0, v0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$1;->this$1:Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;

    iget-object v0, v0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$300(Lcom/huawei/operation/view/CustomWebView;)Landroid/webkit/WebView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$1$1;->this$2:Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$1;

    iget-object v1, v1, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$1;->val$reloadUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1564
    return-void
.end method
