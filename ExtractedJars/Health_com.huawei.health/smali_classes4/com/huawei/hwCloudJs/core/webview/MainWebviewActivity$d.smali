.class Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$d;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;


# direct methods
.method constructor <init>(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$d;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    const-string v0, "MainWebviewActivity"

    const-string v1, "JS StartButtonClick"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$d;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->b(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Lcom/huawei/hwCloudJs/api/IJsActionbar;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$d;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->b(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Lcom/huawei/hwCloudJs/api/IJsActionbar;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/hwCloudJs/api/IJsActionbar;->getStartClickListenner()Lcom/huawei/hwCloudJs/api/ActionbarClickListenner;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$d;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->a(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/webkit/WebView;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$d;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->b(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Lcom/huawei/hwCloudJs/api/IJsActionbar;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/hwCloudJs/api/IJsActionbar;->getStartClickListenner()Lcom/huawei/hwCloudJs/api/ActionbarClickListenner;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$d;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v1}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->a(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/webkit/WebView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$d;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v2}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->a(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/webkit/WebView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/webkit/WebView;->getTitle()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$d;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v3}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->a(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/webkit/WebView;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$d;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v4}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->c(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/huawei/hwCloudJs/api/ActionbarClickListenner;->onActionbarClickListener(Ljava/lang/String;Ljava/lang/String;Landroid/webkit/WebView;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
