.class public Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$DoubleClickReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "DoubleClickReceiver"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;)V
    .locals 0

    .line 401
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$DoubleClickReceiver;->this$0:Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 404
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$DoubleClickReceiver;->this$0:Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->access$100(Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DoubleClickReceiver onReceive()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 405
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$DoubleClickReceiver;->this$0:Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->access$300(Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;)Landroid/webkit/WebView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setScrollY(I)V

    .line 406
    return-void
.end method
