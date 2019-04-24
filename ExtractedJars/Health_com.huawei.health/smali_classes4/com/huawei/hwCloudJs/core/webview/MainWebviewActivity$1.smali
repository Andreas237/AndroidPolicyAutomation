.class Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->d()V
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

    iput-object p1, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$1;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    const-string v0, "MainWebviewActivity"

    const-string v1, "nonet_lay onClick"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/huawei/hwCloudJs/d/d;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MainWebviewActivity"

    const-string v1, "nonet_lay onClick isNetworkAvailable"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$1;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->a(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;I)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$1;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->a(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->reload()V

    :cond_0
    return-void
.end method
