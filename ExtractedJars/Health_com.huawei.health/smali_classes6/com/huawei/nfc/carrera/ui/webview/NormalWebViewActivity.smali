.class public Lcom/huawei/nfc/carrera/ui/webview/NormalWebViewActivity;
.super Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;
.source "SourceFile"


# static fields
.field public static final BUNDLE_KEY_WEBVEIW_TITLE:Ljava/lang/String; = "webview_title"

.field public static final BUNDLE_KEY_WEBVEIW_URL:Ljava/lang/String; = "webview_url"


# instance fields
.field private final TAG:Ljava/lang/String;

.field private mUrl:Ljava/lang/String;

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;-><init>()V

    .line 23
    const-class v0, Lcom/huawei/nfc/carrera/ui/webview/NormalWebViewActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/NormalWebViewActivity;->TAG:Ljava/lang/String;

    return-void
.end method

.method private initParams()Z
    .locals 4

    .line 92
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/webview/NormalWebViewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 94
    if-nez v2, :cond_0

    .line 96
    const/4 v0, 0x0

    return v0

    .line 99
    :cond_0
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 100
    if-nez v3, :cond_1

    .line 102
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/NormalWebViewActivity;->TAG:Ljava/lang/String;

    const-string v1, "bundle is null."

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    const/4 v0, 0x0

    return v0

    .line 106
    :cond_1
    const-string v0, "webview_url"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/NormalWebViewActivity;->mUrl:Ljava/lang/String;

    .line 107
    const-string v0, "webview_title"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/NormalWebViewActivity;->title:Ljava/lang/String;

    .line 109
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/NormalWebViewActivity;->mUrl:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/NormalWebViewActivity;->title:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 111
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/NormalWebViewActivity;->TAG:Ljava/lang/String;

    const-string v1, "params is illegal."

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    const/4 v0, 0x0

    return v0

    .line 115
    :cond_3
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method protected getTitleStrResc()Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/NormalWebViewActivity;->title:Ljava/lang/String;

    return-object v0
.end method

.method protected loadWebviewFailed()V
    .locals 2

    .line 76
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/NormalWebViewActivity;->acceptButton:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 77
    return-void
.end method

.method protected loadWebviewSuccess()V
    .locals 2

    .line 70
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/NormalWebViewActivity;->acceptButton:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 71
    return-void
.end method

.method protected loadingProgress()V
    .locals 2

    .line 82
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/NormalWebViewActivity;->acceptButton:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 83
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 48
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->onCreate(Landroid/os/Bundle;)V

    .line 49
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/webview/NormalWebViewActivity;->setRequestedOrientation(I)V

    .line 50
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/webview/NormalWebViewActivity;->initParams()Z

    move-result v0

    if-nez v0, :cond_0

    .line 52
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/webview/NormalWebViewActivity;->finish()V

    .line 53
    return-void

    .line 58
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/NormalWebViewActivity;->mUrl:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/webview/NormalWebViewActivity;->loadWebView(Ljava/lang/String;)V

    .line 59
    return-void
.end method
