.class public Lcom/shopkick/app/overlays/base/WebviewOverlay;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "WebviewOverlay.java"

# interfaces
.implements Lcom/shopkick/app/webview/IWebViewStatusCallback;
.implements Lcom/shopkick/app/webview/IWebViewURLHandlingCallback;


# instance fields
.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private dispatcherCallback:Lcom/shopkick/app/url/IURLDispatcherCallback;

.field private dispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

.field private mainView:Landroid/view/View;

.field private overlayKeyFields:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private webView:Lcom/shopkick/app/webview/SKWebView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 25
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    const/4 v0, 0x0

    .line 31
    iput-object v0, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay;->overlayKeyFields:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 2

    .line 62
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay;->mainView:Landroid/view/View;

    .line 64
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay;->mainView:Landroid/view/View;

    const v0, 0x7f090840

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/webview/SKWebView;

    iput-object p1, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay;->webView:Lcom/shopkick/app/webview/SKWebView;

    .line 65
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay;->webView:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {p0}, Lcom/shopkick/app/overlays/base/WebviewOverlay;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay;->dispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/webview/SKWebView;->setup(Landroid/app/Activity;Lcom/shopkick/app/url/URLDispatcherFactory;)V

    .line 66
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay;->webView:Lcom/shopkick/app/webview/SKWebView;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/webview/SKWebView;->setProgressEnabled(Z)V

    .line 67
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay;->webView:Lcom/shopkick/app/webview/SKWebView;

    iget-object v1, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay;->dispatcherCallback:Lcom/shopkick/app/url/IURLDispatcherCallback;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/webview/SKWebView;->setDispatcherCallback(Lcom/shopkick/app/url/IURLDispatcherCallback;)V

    .line 68
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay;->webView:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/webview/SKWebView;->setVerticalScrollBarEnabled(Z)V

    .line 69
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay;->webView:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/webview/SKWebView;->setStatusCallback(Lcom/shopkick/app/webview/IWebViewStatusCallback;)V

    .line 70
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay;->webView:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/webview/SKWebView;->setURLHandlingCallback(Lcom/shopkick/app/webview/IWebViewURLHandlingCallback;)V

    .line 72
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->videoUrl:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 73
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay;->webView:Lcom/shopkick/app/webview/SKWebView;

    iget-object v0, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->videoUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/webview/SKWebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0

    .line 75
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay;->webView:Lcom/shopkick/app/webview/SKWebView;

    iget-object v0, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->webviewUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/webview/SKWebView;->loadUrl(Ljava/lang/String;)V

    .line 77
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay;->mainView:Landroid/view/View;

    const v0, 0x7f090112

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    .line 78
    new-instance v0, Lcom/shopkick/app/overlays/base/WebviewOverlay$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/overlays/base/WebviewOverlay$1;-><init>(Lcom/shopkick/app/overlays/base/WebviewOverlay;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 85
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay;->mainView:Landroid/view/View;

    return-object p1
.end method

.method public destroy()V
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay;->webView:Lcom/shopkick/app/webview/SKWebView;

    if-eqz v0, :cond_0

    .line 55
    invoke-virtual {v0}, Lcom/shopkick/app/webview/SKWebView;->destroy()V

    .line 57
    :cond_0
    invoke-super {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;->destroy()V

    return-void
.end method

.method protected getOverlayTheme()I
    .locals 1

    const v0, 0x7f120230

    return v0
.end method

.method protected getResId()I
    .locals 1

    const v0, 0x7f0c01f1

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay;->mainView:Landroid/view/View;

    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 38
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 39
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    iput-object p2, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay;->dispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    .line 40
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->dispatcherCallback:Lcom/shopkick/app/url/IURLDispatcherCallback;

    iput-object p2, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay;->dispatcherCallback:Lcom/shopkick/app/url/IURLDispatcherCallback;

    .line 41
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p1, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    return-void
.end method

.method public onPageClosed()V
    .locals 0

    return-void
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 115
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay;->webView:Lcom/shopkick/app/webview/SKWebView;

    const-string p2, "about:blank"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/webview/SKWebView;->loadUrl(Ljava/lang/String;)V

    .line 116
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showWebViewErrorAlert()V

    return-void
.end method

.method public shouldOverrideURLLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 3

    const-string/jumbo v0, "sk://"

    .line 125
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 126
    invoke-static {p2}, Lcom/shopkick/app/url/URLDispatcher;->getUriKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v2, "webview_action"

    .line 127
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 128
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    .line 129
    invoke-virtual {p2}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object p2

    .line 130
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const-string v0, "close"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 131
    new-instance p2, Lcom/shopkick/app/overlays/base/WebviewOverlay$2;

    invoke-direct {p2, p0}, Lcom/shopkick/app/overlays/base/WebviewOverlay$2;-><init>(Lcom/shopkick/app/overlays/base/WebviewOverlay;)V

    const-wide/16 v0, 0x3e8

    invoke-virtual {p1, p2, v0, v1}, Landroid/webkit/WebView;->postDelayed(Ljava/lang/Runnable;J)Z

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public updateOriginScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 1

    .line 46
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->updateOriginScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 47
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyId:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 48
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
