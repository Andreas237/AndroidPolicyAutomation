.class Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$3;
.super Landroid/content/BroadcastReceiver;


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

    iput-object p1, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$3;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$3;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->a(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/webkit/WebView;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$3;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->a(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwCloudJs/d/d;->a()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setNetworkAvailable(Z)V

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v2, Lcom/huawei/hwCloudJs/service/jsapi/network/NetworkChangeMsg;

    invoke-direct {v2}, Lcom/huawei/hwCloudJs/service/jsapi/network/NetworkChangeMsg;-><init>()V

    invoke-static {}, Lcom/huawei/hwCloudJs/d/d;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/huawei/hwCloudJs/service/jsapi/network/NetworkChangeMsg;->setNetworkType(Ljava/lang/String;)V

    invoke-static {v2}, Lcom/huawei/hwCloudJs/JsClientApi;->notifyNativeMsg(Lcom/huawei/hwCloudJs/service/jsmsg/NativeMsg;)V

    :cond_0
    return-void
.end method
