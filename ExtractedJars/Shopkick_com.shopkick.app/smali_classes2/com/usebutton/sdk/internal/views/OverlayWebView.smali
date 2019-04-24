.class public Lcom/usebutton/sdk/internal/views/OverlayWebView;
.super Landroid/widget/FrameLayout;
.source "OverlayWebView.java"


# instance fields
.field private chrome:Landroid/view/View;

.field private webView:Lcom/usebutton/sdk/internal/views/ObservableWebView;

.field private webViewScrollManager:Lcom/usebutton/sdk/internal/views/WebViewScrollManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 26
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/OverlayWebView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/OverlayWebView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 36
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/OverlayWebView;->init()V

    return-void
.end method

.method private init()V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled"
        }
    .end annotation

    .line 41
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/OverlayWebView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    sget v1, Lcom/usebutton/sdk/R$layout;->btn_overlay_web_view:I

    const/4 v2, 0x1

    .line 42
    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 44
    sget v0, Lcom/usebutton/sdk/R$id;->overlay_web_chrome:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/OverlayWebView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/OverlayWebView;->chrome:Landroid/view/View;

    .line 45
    sget v0, Lcom/usebutton/sdk/R$id;->overlay_web_view:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/OverlayWebView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/views/ObservableWebView;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/OverlayWebView;->webView:Lcom/usebutton/sdk/internal/views/ObservableWebView;

    .line 46
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/OverlayWebView;->webView:Lcom/usebutton/sdk/internal/views/ObservableWebView;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/views/ObservableWebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 47
    new-instance v0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/views/OverlayWebView;->chrome:Landroid/view/View;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/views/OverlayWebView;->webView:Lcom/usebutton/sdk/internal/views/ObservableWebView;

    invoke-direct {v0, v1, v2}, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;-><init>(Landroid/view/View;Landroid/webkit/WebView;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/OverlayWebView;->webViewScrollManager:Lcom/usebutton/sdk/internal/views/WebViewScrollManager;

    .line 48
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/OverlayWebView;->webView:Lcom/usebutton/sdk/internal/views/ObservableWebView;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/views/OverlayWebView;->webViewScrollManager:Lcom/usebutton/sdk/internal/views/WebViewScrollManager;

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/views/ObservableWebView;->setCustomOnScrollChangeListener(Lcom/usebutton/sdk/internal/views/ObservableWebView$OnScrollChangeListener;)V

    return-void
.end method


# virtual methods
.method public canGoBack()Z
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/OverlayWebView;->webView:Lcom/usebutton/sdk/internal/views/ObservableWebView;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/views/ObservableWebView;->canGoBack()Z

    move-result v0

    return v0
.end method

.method public evaluateJavascript(Ljava/lang/String;)V
    .locals 2

    .line 60
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/OverlayWebView;->webView:Lcom/usebutton/sdk/internal/views/ObservableWebView;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/usebutton/sdk/internal/views/ObservableWebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    return-void
.end method

.method public goBack()V
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/OverlayWebView;->webView:Lcom/usebutton/sdk/internal/views/ObservableWebView;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/views/ObservableWebView;->goBack()V

    return-void
.end method

.method public loadUrl(Ljava/lang/String;)V
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/OverlayWebView;->webView:Lcom/usebutton/sdk/internal/views/ObservableWebView;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/views/ObservableWebView;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method public resetScroll()V
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/OverlayWebView;->webViewScrollManager:Lcom/usebutton/sdk/internal/views/WebViewScrollManager;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->reset()V

    return-void
.end method

.method public setWebViewClient(Landroid/webkit/WebViewClient;)V
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/OverlayWebView;->webView:Lcom/usebutton/sdk/internal/views/ObservableWebView;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/views/ObservableWebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    return-void
.end method
