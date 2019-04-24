.class public abstract Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;
.super Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$DoubleClickReceiver;
    }
.end annotation


# static fields
.field private static final CLICL_STATUS_BAR_ACTION:Ljava/lang/String; = "com.huawei.intent.action.CLICK_STATUSBAR"

.field private static final SYSTEMUI_PERMITION:Ljava/lang/String; = "huawei.permission.CLICK_STATUSBAR_BROADCAST"


# instance fields
.field private final FULL_PROGRESS:I

.field private final TAG:Ljava/lang/String;

.field public final WEBVIEW_LOAD_UNKNOW_ERROR_VALUE:I

.field public final WEBVIEW_STATE_DEFAULT_VALUE:I

.field public final WEBVIEW_STATE_NETWORK_ERROR_VALUE:I

.field public final WEBVIEW_STATE_NO_NETWORK_VALUE:I

.field protected acceptButton:Lo/egd;

.field private contentlayout:Landroid/widget/LinearLayout;

.field private loadingLayout:Landroid/widget/LinearLayout;

.field private loadingProgressBar:Landroid/widget/ProgressBar;

.field private mDoubleClickReceiver:Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$DoubleClickReceiver;

.field private mUrl:Ljava/lang/String;

.field private networkExceptionLayout:Landroid/widget/RelativeLayout;

.field private networkFailLayout:Landroid/widget/LinearLayout;

.field private webview:Landroid/webkit/WebView;

.field protected webviewCodeResult:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;-><init>()V

    .line 44
    const-class v0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->TAG:Ljava/lang/String;

    .line 49
    const/16 v0, 0x64

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->FULL_PROGRESS:I

    .line 54
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->WEBVIEW_STATE_DEFAULT_VALUE:I

    .line 59
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->WEBVIEW_STATE_NO_NETWORK_VALUE:I

    .line 64
    const/4 v0, -0x2

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->WEBVIEW_STATE_NETWORK_ERROR_VALUE:I

    .line 69
    const/4 v0, -0x3

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->WEBVIEW_LOAD_UNKNOW_ERROR_VALUE:I

    .line 109
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->webviewCodeResult:I

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;)Landroid/widget/ProgressBar;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->loadingProgressBar:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;)Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->showContentLayout()V

    return-void
.end method

.method static synthetic access$300(Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;)Landroid/webkit/WebView;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->webview:Landroid/webkit/WebView;

    return-object v0
.end method

.method private initView()V
    .locals 3

    .line 203
    sget v0, Lcom/huawei/wallet/R$id;->network_fail_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->networkFailLayout:Landroid/widget/LinearLayout;

    .line 204
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->networkFailLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 205
    sget v0, Lcom/huawei/wallet/R$id;->nfc_web_exception_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->networkExceptionLayout:Landroid/widget/RelativeLayout;

    .line 206
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->networkExceptionLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 207
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->networkExceptionLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 208
    sget v0, Lcom/huawei/wallet/R$id;->set_network_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/egd;

    .line 209
    invoke-virtual {v2, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 211
    sget v0, Lcom/huawei/wallet/R$id;->content_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->contentlayout:Landroid/widget/LinearLayout;

    .line 214
    sget v0, Lcom/huawei/wallet/R$id;->progress_bar_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->loadingLayout:Landroid/widget/LinearLayout;

    .line 216
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->loadingLayout:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/wallet/R$id;->progress_bar:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->loadingProgressBar:Landroid/widget/ProgressBar;

    .line 219
    sget v0, Lcom/huawei/wallet/R$id;->card_instruction_webview:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->webview:Landroid/webkit/WebView;

    .line 221
    sget v0, Lcom/huawei/wallet/R$id;->accept_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->acceptButton:Lo/egd;

    .line 223
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->initButton()V

    .line 225
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->initWebViewSettings()V

    .line 226
    return-void
.end method

.method private initWebViewSettings()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled"
        }
    .end annotation

    .line 246
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->webview:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 247
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->webview:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 249
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->webview:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 250
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->webview:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 251
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->webview:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$1;-><init>(Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 273
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->webview:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$2;-><init>(Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 323
    return-void
.end method

.method private showContentLayout()V
    .locals 2

    .line 366
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->loadingLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 367
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->networkFailLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 368
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->networkExceptionLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 370
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->contentlayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 371
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->webview:Landroid/webkit/WebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 372
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->loadWebviewSuccess()V

    .line 373
    return-void
.end method


# virtual methods
.method protected abstract getTitleStrResc()Ljava/lang/String;
.end method

.method protected initButton()V
    .locals 0

    .line 399
    return-void
.end method

.method public loadWebView(Ljava/lang/String;)V
    .locals 2

    .line 178
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->mUrl:Ljava/lang/String;

    .line 179
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->webviewCodeResult:I

    .line 180
    invoke-static {p0}, Lo/ecz;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 182
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 184
    const/4 v0, -0x3

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->webviewCodeResult:I

    .line 185
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->loadWebviewFailed()V

    goto :goto_0

    .line 189
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->webview:Landroid/webkit/WebView;

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 191
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->webview:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    goto :goto_0

    .line 196
    :cond_1
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->webviewCodeResult:I

    .line 197
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->showNoNetworkLayout()V

    .line 199
    :goto_0
    return-void
.end method

.method protected abstract loadWebviewFailed()V
.end method

.method protected abstract loadWebviewSuccess()V
.end method

.method protected abstract loadingProgress()V
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 378
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    .line 379
    sget v0, Lcom/huawei/wallet/R$id;->set_network_button:I

    if-ne v0, v2, :cond_0

    .line 381
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->TAG:Ljava/lang/String;

    const-string v1, "onClick set_network_button."

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 382
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/wallet/utils/BaseLibUtil;->c(Landroid/content/Context;)V

    goto :goto_0

    .line 384
    :cond_0
    sget v0, Lcom/huawei/wallet/R$id;->network_fail_layout:I

    if-eq v0, v2, :cond_1

    sget v0, Lcom/huawei/wallet/R$id;->nfc_web_exception_layout:I

    if-ne v0, v2, :cond_2

    .line 386
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->TAG:Ljava/lang/String;

    const-string v1, "onClick nfc_no_network_text."

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 387
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->showLoadingProgress()V

    .line 388
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->mUrl:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->loadWebView(Ljava/lang/String;)V

    .line 390
    :cond_2
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 125
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 126
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->setRequestedOrientation(I)V

    .line 128
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->getTitleStrResc()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->setTitle(Ljava/lang/String;)V

    .line 131
    sget v0, Lcom/huawei/wallet/R$layout;->nfc_carrera_activity_card_instruction:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->setContentView(I)V

    .line 134
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->initView()V

    .line 136
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->showLoadingProgress()V

    .line 138
    new-instance v0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$DoubleClickReceiver;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$DoubleClickReceiver;-><init>(Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->mDoubleClickReceiver:Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$DoubleClickReceiver;

    .line 139
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.intent.action.CLICK_STATUSBAR"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 140
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->mDoubleClickReceiver:Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$DoubleClickReceiver;

    const-string v2, "huawei.permission.CLICK_STATUSBAR_BROADCAST"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 141
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 412
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onDestroy()V

    .line 413
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->mDoubleClickReceiver:Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity$DoubleClickReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 414
    return-void
.end method

.method public showLoadingProgress()V
    .locals 2

    .line 330
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->webview:Landroid/webkit/WebView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 331
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->networkFailLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 332
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->networkExceptionLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 334
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->loadingLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 335
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->contentlayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 336
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->loadingProgress()V

    .line 337
    return-void
.end method

.method public showNetworkExceptionLayout()V
    .locals 2

    .line 355
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->acceptButton:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 356
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->contentlayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 357
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->networkFailLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 358
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->networkExceptionLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 359
    return-void
.end method

.method public showNoNetworkLayout()V
    .locals 2

    .line 344
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->acceptButton:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 345
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->contentlayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 346
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->networkExceptionLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 347
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->networkFailLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 348
    return-void
.end method
