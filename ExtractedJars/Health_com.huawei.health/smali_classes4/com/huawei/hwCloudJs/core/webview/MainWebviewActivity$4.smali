.class Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$4;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;


# direct methods
.method constructor <init>(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$4;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x1001

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$4;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->g(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$4;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->d(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$4;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->k(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/widget/FrameLayout;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$4;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v0, "MainWebviewActivity"

    const-string v1, "onProgressChanged show"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$4;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->k(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/widget/FrameLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$4;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->d(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$4;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    :cond_0
    return-void
.end method
