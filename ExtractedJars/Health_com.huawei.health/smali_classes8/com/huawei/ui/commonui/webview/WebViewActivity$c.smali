.class Lcom/huawei/ui/commonui/webview/WebViewActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/webkit/DownloadListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/commonui/webview/WebViewActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/commonui/webview/WebViewActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/ui/commonui/webview/WebViewActivity;)V
    .locals 0

    .line 229
    iput-object p1, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity$c;->e:Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/commonui/webview/WebViewActivity;Lcom/huawei/ui/commonui/webview/WebViewActivity$5;)V
    .locals 0

    .line 229
    invoke-direct {p0, p1}, Lcom/huawei/ui/commonui/webview/WebViewActivity$c;-><init>(Lcom/huawei/ui/commonui/webview/WebViewActivity;)V

    return-void
.end method


# virtual methods
.method public onDownloadStart(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 3

    .line 234
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 235
    new-instance v2, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 236
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity$c;->e:Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-virtual {v0, v2}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->startActivity(Landroid/content/Intent;)V

    .line 237
    return-void
.end method
