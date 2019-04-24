.class public Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;
.super Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;
.source "SourceFile"


# static fields
.field public static final INTENT_BUNDLE_KEY_TITLE_WEB_VIEW:Ljava/lang/String; = "title"

.field public static final INTENT_BUNDLE_KEY_URL_TO_LOAD:Ljava/lang/String; = "intent_bundle_url"


# instance fields
.field private final TAG:Ljava/lang/String;

.field private mInstructionUrl:Ljava/lang/String;

.field private titleStr:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;-><init>()V

    .line 25
    const-class v0, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->TAG:Ljava/lang/String;

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->titleStr:Ljava/lang/String;

    return-void
.end method

.method private initAndLoadCardInstructionUrl()V
    .locals 3

    .line 128
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->mInstructionUrl:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 129
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "queryBankIssuerInfoCallback is ok.mInstructionUrl."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->mInstructionUrl:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->mInstructionUrl:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->loadWebView(Ljava/lang/String;)V

    .line 132
    :cond_0
    return-void
.end method

.method private initParams()Z
    .locals 4

    .line 104
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 105
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 106
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->TAG:Ljava/lang/String;

    const-string v1, "initParams intent empty."

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    const/4 v0, 0x0

    return v0

    .line 110
    :cond_0
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 111
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 112
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->TAG:Ljava/lang/String;

    const-string v1, "bundle empty."

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    const/4 v0, 0x0

    return v0

    .line 116
    :cond_1
    const-string v0, "intent_bundle_url"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->mInstructionUrl:Ljava/lang/String;

    .line 117
    const-string v0, "title"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->titleStr:Ljava/lang/String;

    .line 118
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->mInstructionUrl:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->titleStr:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 119
    :cond_2
    const/4 v0, 0x0

    return v0

    .line 121
    :cond_3
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public getTitleStrResc()Ljava/lang/String;
    .locals 4

    .line 64
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 65
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 66
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->TAG:Ljava/lang/String;

    const-string v1, "initParams intent empty."

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    const/4 v0, 0x0

    return-object v0

    .line 70
    :cond_0
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 71
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 72
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->TAG:Ljava/lang/String;

    const-string v1, "bundle empty."

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    const/4 v0, 0x0

    return-object v0

    .line 75
    :cond_1
    const-string v0, "title"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->titleStr:Ljava/lang/String;

    .line 76
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->titleStr:Ljava/lang/String;

    return-object v0
.end method

.method public loadWebviewFailed()V
    .locals 2

    .line 87
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->TAG:Ljava/lang/String;

    const-string v1, "loadWebviewFailed"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->acceptButton:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 89
    return-void
.end method

.method public loadWebviewSuccess()V
    .locals 2

    .line 81
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->TAG:Ljava/lang/String;

    const-string v1, "loadWebviewSuccess"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->acceptButton:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 83
    return-void
.end method

.method public loadingProgress()V
    .locals 2

    .line 93
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->TAG:Ljava/lang/String;

    const-string v1, "loadingProgress"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->acceptButton:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 95
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->acceptButton:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 96
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .line 137
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->onBackPressed()V

    .line 138
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->finish()V

    .line 139
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 51
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->onCreate(Landroid/os/Bundle;)V

    .line 52
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->setRequestedOrientation(I)V

    .line 53
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->initParams()Z

    move-result v0

    if-nez v0, :cond_0

    .line 54
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->finish()V

    .line 55
    return-void

    .line 58
    :cond_0
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;->initAndLoadCardInstructionUrl()V

    .line 59
    return-void
.end method
