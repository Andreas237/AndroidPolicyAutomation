.class public Lcom/shopkick/sdk/webviewsdk/WebviewActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "WebviewActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/sdk/webviewsdk/WebviewActivity$MyWebViewClient;,
        Lcom/shopkick/sdk/webviewsdk/WebviewActivity$MyWebChromeClient;
    }
.end annotation


# static fields
.field private static final parcelKey:Ljava/lang/String; = "PARCEL_KEY"

.field static webviewEventListener:Lcom/shopkick/sdk/webviewsdk/IWebviewEventListener;


# instance fields
.field backButton:Landroid/view/View;

.field forwardButton:Landroid/view/View;

.field webView:Landroid/webkit/WebView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/sdk/webviewsdk/WebviewActivity;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->validateNavigationButton()V

    return-void
.end method

.method public static getLaunchIntent(Landroid/content/Context;Lcom/shopkick/sdk/webviewsdk/WebviewParam;)Landroid/content/Intent;
    .locals 2

    .line 30
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "PARCEL_KEY"

    .line 31
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const/high16 p0, 0x10000000

    .line 32
    invoke-virtual {v0, p0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    return-object v0
.end method

.method private goBack()V
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 101
    iget-object v0, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    :cond_0
    return-void
.end method

.method private goForward()V
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoForward()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 107
    iget-object v0, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goForward()V

    :cond_0
    return-void
.end method

.method public static setWebviewEventListener(Lcom/shopkick/sdk/webviewsdk/IWebviewEventListener;)V
    .locals 0

    .line 37
    sput-object p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->webviewEventListener:Lcom/shopkick/sdk/webviewsdk/IWebviewEventListener;

    return-void
.end method

.method private validateNavigationButton()V
    .locals 2

    .line 112
    iget-object v0, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    .line 113
    iget-object v1, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->backButton:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 114
    iget-object v1, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->backButton:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setClickable(Z)V

    .line 116
    iget-object v0, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoForward()Z

    move-result v0

    .line 117
    iget-object v1, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->forwardButton:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 118
    iget-object v1, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->forwardButton:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setClickable(Z)V

    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    return-void

    .line 96
    :cond_0
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onBackPressed()V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->forwardButton:Landroid/view/View;

    if-ne p1, v0, :cond_0

    const-string p1, "Webview"

    const-string v0, "navigate_forward buttonclicked"

    .line 124
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 125
    invoke-direct {p0}, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->goForward()V

    goto :goto_0

    .line 126
    :cond_0
    iget-object v0, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->backButton:Landroid/view/View;

    if-ne p1, v0, :cond_1

    .line 127
    invoke-direct {p0}, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->goBack()V

    const-string p1, "Webview"

    const-string v0, "navigate_back button clicked"

    .line 128
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 42
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 43
    invoke-virtual {p0}, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "PARCEL_KEY"

    .line 44
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/shopkick/sdk/webviewsdk/WebviewParam;

    .line 45
    invoke-virtual {p1}, Lcom/shopkick/sdk/webviewsdk/WebviewParam;->getStartUrl()Ljava/lang/String;

    move-result-object v0

    .line 46
    invoke-virtual {p1}, Lcom/shopkick/sdk/webviewsdk/WebviewParam;->getTitle()Ljava/lang/String;

    move-result-object v1

    .line 47
    invoke-virtual {p1}, Lcom/shopkick/sdk/webviewsdk/WebviewParam;->getSubTitle()Ljava/lang/String;

    move-result-object p1

    .line 48
    sget v2, Lcom/shopkick/sdk/webviewsdk/R$layout;->activity_webview:I

    invoke-virtual {p0, v2}, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->setContentView(I)V

    .line 50
    sget v2, Lcom/shopkick/sdk/webviewsdk/R$id;->toolbar:I

    invoke-virtual {p0, v2}, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/support/v7/widget/Toolbar;

    .line 51
    sget v3, Lcom/shopkick/sdk/webviewsdk/R$drawable;->close_button_x:I

    invoke-virtual {v2, v3}, Landroid/support/v7/widget/Toolbar;->setNavigationIcon(I)V

    .line 52
    invoke-virtual {p0, v2}, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->setSupportActionBar(Landroid/support/v7/widget/Toolbar;)V

    .line 53
    new-instance v3, Lcom/shopkick/sdk/webviewsdk/WebviewActivity$1;

    invoke-direct {v3, p0}, Lcom/shopkick/sdk/webviewsdk/WebviewActivity$1;-><init>(Lcom/shopkick/sdk/webviewsdk/WebviewActivity;)V

    invoke-virtual {v2, v3}, Landroid/support/v7/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 61
    sget v2, Lcom/shopkick/sdk/webviewsdk/R$id;->footer:I

    invoke-virtual {p0, v2}, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    invoke-virtual {p0}, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v2

    .line 65
    invoke-virtual {v2, v1}, Landroid/support/v7/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 66
    invoke-virtual {v2, p1}, Landroid/support/v7/app/ActionBar;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 67
    sget p1, Lcom/shopkick/sdk/webviewsdk/R$id;->forward:I

    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->forwardButton:Landroid/view/View;

    .line 68
    iget-object p1, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->forwardButton:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 69
    sget p1, Lcom/shopkick/sdk/webviewsdk/R$id;->back:I

    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->backButton:Landroid/view/View;

    .line 70
    iget-object p1, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->backButton:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 72
    sget p1, Lcom/shopkick/sdk/webviewsdk/R$id;->webview:I

    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    iput-object p1, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->webView:Landroid/webkit/WebView;

    .line 73
    iget-object p1, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 74
    iget-object p1, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->webView:Landroid/webkit/WebView;

    new-instance v1, Lcom/shopkick/sdk/webviewsdk/WebviewActivity$MyWebChromeClient;

    invoke-direct {v1, p0, v3}, Lcom/shopkick/sdk/webviewsdk/WebviewActivity$MyWebChromeClient;-><init>(Lcom/shopkick/sdk/webviewsdk/WebviewActivity;Lcom/shopkick/sdk/webviewsdk/WebviewActivity$1;)V

    invoke-virtual {p1, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 75
    iget-object p1, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->webView:Landroid/webkit/WebView;

    new-instance v1, Lcom/shopkick/sdk/webviewsdk/WebviewActivity$MyWebViewClient;

    invoke-direct {v1, p0}, Lcom/shopkick/sdk/webviewsdk/WebviewActivity$MyWebViewClient;-><init>(Lcom/shopkick/sdk/webviewsdk/WebviewActivity;)V

    invoke-virtual {p1, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 76
    iget-object p1, p0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 77
    invoke-direct {p0}, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->validateNavigationButton()V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 82
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onDestroy()V

    .line 83
    sget-object v0, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->webviewEventListener:Lcom/shopkick/sdk/webviewsdk/IWebviewEventListener;

    if-eqz v0, :cond_0

    .line 84
    invoke-interface {v0}, Lcom/shopkick/sdk/webviewsdk/IWebviewEventListener;->onWebviewClosed()V

    :cond_0
    return-void
.end method
