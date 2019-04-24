.class public Lcom/shopkick/app/webview/WebViewScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "WebViewScreen.java"

# interfaces
.implements Lcom/shopkick/app/webview/IWebViewStatusCallback;
.implements Lcom/shopkick/app/webview/IWebViewURLHandlingCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/webview/WebViewScreen$PopScreenRunnable;,
        Lcom/shopkick/app/webview/WebViewScreen$OAButtonClickListener;
    }
.end annotation


# instance fields
.field private chainId:Ljava/lang/String;

.field protected dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private dispatcherCallback:Lcom/shopkick/app/url/IURLDispatcherCallback;

.field private footer:Ljava/lang/String;

.field private headerTitle:Ljava/lang/String;

.field private popScreenRunnable:Lcom/shopkick/app/webview/WebViewScreen$PopScreenRunnable;

.field protected receivedError:Z

.field private shouldShowNavBar:Z

.field private transparent:Z

.field private urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

.field protected urlString:Ljava/lang/String;

.field protected webView:Lcom/shopkick/app/webview/SKWebView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method public static skParams(Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;ILjava/lang/String;)Ljava/util/HashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;",
            "I",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 136
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;->url:Ljava/lang/String;

    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;->type:Ljava/lang/Integer;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;->type:Ljava/lang/Integer;

    .line 137
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    if-ne p0, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 136
    :goto_0
    invoke-static {v0, v2, p1, p2}, Lcom/shopkick/app/webview/WebViewScreen;->skParams(Ljava/lang/String;ZILjava/lang/String;)Ljava/util/HashMap;

    move-result-object p0

    return-object p0
.end method

.method public static skParams(Ljava/lang/String;ZILjava/lang/String;)Ljava/util/HashMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ZI",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 149
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v1, "url"

    .line 150
    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo p0, "transparent"

    const-string v1, "false"

    .line 151
    invoke-virtual {v0, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo p0, "show_nav_bar"

    .line 152
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p0, "request_code"

    .line 153
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p3, :cond_1

    const-string p0, "header_title"

    .line 155
    invoke-virtual {v0, p0, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 84
    iget-object p1, p0, Lcom/shopkick/app/webview/WebViewScreen;->headerTitle:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/webview/WebViewScreen;->setAppScreenTitle(Ljava/lang/String;)V

    .line 85
    new-instance p1, Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {p0}, Lcom/shopkick/app/webview/WebViewScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/shopkick/app/webview/SKWebView;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/shopkick/app/webview/WebViewScreen;->webView:Lcom/shopkick/app/webview/SKWebView;

    .line 86
    iget-object p1, p0, Lcom/shopkick/app/webview/WebViewScreen;->webView:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {p0}, Lcom/shopkick/app/webview/WebViewScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p2

    iget-object p3, p0, Lcom/shopkick/app/webview/WebViewScreen;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p1, p2, p3}, Lcom/shopkick/app/webview/SKWebView;->setup(Landroid/app/Activity;Lcom/shopkick/app/url/URLDispatcherFactory;)V

    .line 87
    iget-object p1, p0, Lcom/shopkick/app/webview/WebViewScreen;->webView:Lcom/shopkick/app/webview/SKWebView;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/shopkick/app/webview/SKWebView;->setProgressEnabled(Z)V

    .line 88
    iget-object p1, p0, Lcom/shopkick/app/webview/WebViewScreen;->webView:Lcom/shopkick/app/webview/SKWebView;

    iget-object p3, p0, Lcom/shopkick/app/webview/WebViewScreen;->dispatcherCallback:Lcom/shopkick/app/url/IURLDispatcherCallback;

    invoke-virtual {p1, p3}, Lcom/shopkick/app/webview/SKWebView;->setDispatcherCallback(Lcom/shopkick/app/url/IURLDispatcherCallback;)V

    .line 89
    iget-object p1, p0, Lcom/shopkick/app/webview/WebViewScreen;->webView:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/webview/SKWebView;->setVerticalScrollBarEnabled(Z)V

    .line 90
    invoke-virtual {p0}, Lcom/shopkick/app/webview/WebViewScreen;->setWebViewStatusCallback()V

    .line 91
    iget-object p1, p0, Lcom/shopkick/app/webview/WebViewScreen;->webView:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/webview/SKWebView;->setURLHandlingCallback(Lcom/shopkick/app/webview/IWebViewURLHandlingCallback;)V

    .line 92
    iget-boolean p1, p0, Lcom/shopkick/app/webview/WebViewScreen;->transparent:Z

    if-eqz p1, :cond_0

    .line 93
    iget-object p1, p0, Lcom/shopkick/app/webview/WebViewScreen;->webView:Lcom/shopkick/app/webview/SKWebView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/shopkick/app/webview/SKWebView;->setBackgroundColor(I)V

    goto :goto_0

    .line 95
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/webview/WebViewScreen;->webView:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {p0}, Lcom/shopkick/app/webview/WebViewScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p2

    invoke-virtual {p2}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const p3, 0x7f0600c6

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getColor(I)I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/webview/SKWebView;->setBackgroundColor(I)V

    .line 97
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/webview/WebViewScreen;->webView:Lcom/shopkick/app/webview/SKWebView;

    iget-object p2, p0, Lcom/shopkick/app/webview/WebViewScreen;->urlString:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/webview/SKWebView;->loadUrl(Ljava/lang/String;)V

    .line 99
    iget-boolean p1, p0, Lcom/shopkick/app/webview/WebViewScreen;->shouldShowNavBar:Z

    if-eqz p1, :cond_1

    .line 100
    iget-object p1, p0, Lcom/shopkick/app/webview/WebViewScreen;->webView:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {p1}, Lcom/shopkick/app/webview/SKWebView;->enableNavigation()V

    .line 103
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/webview/WebViewScreen;->footer:Ljava/lang/String;

    if-eqz p1, :cond_2

    iget-object p2, p0, Lcom/shopkick/app/webview/WebViewScreen;->chainId:Ljava/lang/String;

    if-eqz p2, :cond_2

    .line 104
    iget-object p2, p0, Lcom/shopkick/app/webview/WebViewScreen;->webView:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/webview/SKWebView;->enableFooter(Ljava/lang/String;)V

    .line 107
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/webview/WebViewScreen;->webView:Lcom/shopkick/app/webview/SKWebView;

    const p2, 0x7f0904e3

    invoke-virtual {p1, p2}, Lcom/shopkick/app/webview/SKWebView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lcom/shopkick/app/webview/WebViewScreen$OAButtonClickListener;

    iget-object p3, p0, Lcom/shopkick/app/webview/WebViewScreen;->chainId:Ljava/lang/String;

    invoke-direct {p2, p0, p3}, Lcom/shopkick/app/webview/WebViewScreen$OAButtonClickListener;-><init>(Lcom/shopkick/app/webview/WebViewScreen;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 109
    iget-object p1, p0, Lcom/shopkick/app/webview/WebViewScreen;->webView:Lcom/shopkick/app/webview/SKWebView;

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 60
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    iput-object v0, p0, Lcom/shopkick/app/webview/WebViewScreen;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    .line 61
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->dispatcherCallback:Lcom/shopkick/app/url/IURLDispatcherCallback;

    iput-object v0, p0, Lcom/shopkick/app/webview/WebViewScreen;->dispatcherCallback:Lcom/shopkick/app/url/IURLDispatcherCallback;

    .line 62
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p1, p0, Lcom/shopkick/app/webview/WebViewScreen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 63
    sget-object p1, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->DYNAMIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/webview/WebViewScreen;->addResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    const-string/jumbo p1, "url"

    .line 66
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/webview/WebViewScreen;->urlString:Ljava/lang/String;

    const-string/jumbo p1, "transparent"

    .line 67
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/shopkick/app/webview/WebViewScreen;->transparent:Z

    const-string/jumbo p1, "show_nav_bar"

    .line 68
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/shopkick/app/webview/WebViewScreen;->shouldShowNavBar:Z

    const-string p1, "header_title"

    .line 69
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/webview/WebViewScreen;->headerTitle:Ljava/lang/String;

    const-string p1, "chain_id"

    .line 70
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/webview/WebViewScreen;->chainId:Ljava/lang/String;

    const-string p1, "footer"

    .line 71
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/webview/WebViewScreen;->footer:Ljava/lang/String;

    .line 74
    new-instance p1, Lcom/shopkick/app/webview/WebViewScreen$PopScreenRunnable;

    invoke-direct {p1, p0}, Lcom/shopkick/app/webview/WebViewScreen$PopScreenRunnable;-><init>(Lcom/shopkick/app/webview/WebViewScreen;)V

    iput-object p1, p0, Lcom/shopkick/app/webview/WebViewScreen;->popScreenRunnable:Lcom/shopkick/app/webview/WebViewScreen$PopScreenRunnable;

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 118
    iget-object v0, p0, Lcom/shopkick/app/webview/WebViewScreen;->popScreenRunnable:Lcom/shopkick/app/webview/WebViewScreen$PopScreenRunnable;

    invoke-virtual {v0}, Lcom/shopkick/app/webview/WebViewScreen$PopScreenRunnable;->kill()V

    .line 119
    iget-object v0, p0, Lcom/shopkick/app/webview/WebViewScreen;->webView:Lcom/shopkick/app/webview/SKWebView;

    if-eqz v0, :cond_0

    .line 120
    invoke-virtual {v0}, Lcom/shopkick/app/webview/SKWebView;->destroy()V

    .line 121
    iget-object v0, p0, Lcom/shopkick/app/webview/WebViewScreen;->webView:Lcom/shopkick/app/webview/SKWebView;

    iget-object v1, p0, Lcom/shopkick/app/webview/WebViewScreen;->popScreenRunnable:Lcom/shopkick/app/webview/WebViewScreen$PopScreenRunnable;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/webview/SKWebView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 123
    :cond_0
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onPageClosed()V
    .locals 0

    return-void
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .line 168
    iget-boolean p1, p0, Lcom/shopkick/app/webview/WebViewScreen;->receivedError:Z

    if-nez p1, :cond_0

    .line 169
    sget-object p1, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->DYNAMIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/webview/WebViewScreen;->removeResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    :cond_0
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    const/4 p1, 0x1

    .line 175
    iput-boolean p1, p0, Lcom/shopkick/app/webview/WebViewScreen;->receivedError:Z

    .line 176
    iget-object p1, p0, Lcom/shopkick/app/webview/WebViewScreen;->webView:Lcom/shopkick/app/webview/SKWebView;

    const-string p2, "about:blank"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/webview/SKWebView;->loadUrl(Ljava/lang/String;)V

    .line 177
    iget-object p1, p0, Lcom/shopkick/app/webview/WebViewScreen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showWebViewErrorAlert()V

    return-void
.end method

.method protected setWebViewStatusCallback()V
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/shopkick/app/webview/WebViewScreen;->webView:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/webview/SKWebView;->setStatusCallback(Lcom/shopkick/app/webview/IWebViewStatusCallback;)V

    return-void
.end method

.method public shouldDisplayAppScreenHeader()Z
    .locals 1

    .line 79
    iget-boolean v0, p0, Lcom/shopkick/app/webview/WebViewScreen;->shouldShowNavBar:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public shouldHideBack()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public shouldOverrideURLLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 3

    const-string/jumbo v0, "sk://"

    .line 186
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 187
    invoke-static {p2}, Lcom/shopkick/app/url/URLDispatcher;->getUriKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v2, "webview_action"

    .line 188
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 189
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    .line 190
    invoke-virtual {p2}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object p2

    .line 191
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

    .line 192
    iget-object p2, p0, Lcom/shopkick/app/webview/WebViewScreen;->popScreenRunnable:Lcom/shopkick/app/webview/WebViewScreen$PopScreenRunnable;

    const-wide/16 v0, 0x3e8

    invoke-virtual {p1, p2, v0, v1}, Landroid/webkit/WebView;->postDelayed(Ljava/lang/Runnable;J)Z

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method
