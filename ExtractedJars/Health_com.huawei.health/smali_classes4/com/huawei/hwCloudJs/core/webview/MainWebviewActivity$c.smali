.class Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$c;
.super Landroid/content/BroadcastReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;


# direct methods
.method constructor <init>(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$c;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$c;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-virtual {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->finish()V

    return-void
.end method
