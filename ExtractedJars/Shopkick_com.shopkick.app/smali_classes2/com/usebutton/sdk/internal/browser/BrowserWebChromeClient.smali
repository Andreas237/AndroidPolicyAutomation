.class public Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;
.super Landroid/webkit/WebChromeClient;
.source "BrowserWebChromeClient.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "BrowserWebChromeClient"


# instance fields
.field private final controls:Lcom/usebutton/sdk/internal/views/WebControls;

.field private popupWebView:Lcom/usebutton/sdk/internal/views/PopupWebView;

.field private final presenter:Lcom/usebutton/sdk/internal/WebViewPresenter;

.field private rootView:Landroid/view/ViewGroup;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/usebutton/sdk/internal/WebViewPresenter;Lcom/usebutton/sdk/internal/views/WebControls;Lcom/usebutton/sdk/internal/Navigable;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;->presenter:Lcom/usebutton/sdk/internal/WebViewPresenter;

    .line 38
    iput-object p2, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;->controls:Lcom/usebutton/sdk/internal/views/WebControls;

    .line 39
    invoke-direct {p0, p3}, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;->bindControls(Lcom/usebutton/sdk/internal/Navigable;)V

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;)Lcom/usebutton/sdk/internal/views/PopupWebView;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;->popupWebView:Lcom/usebutton/sdk/internal/views/PopupWebView;

    return-object p0
.end method

.method static synthetic access$002(Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;Lcom/usebutton/sdk/internal/views/PopupWebView;)Lcom/usebutton/sdk/internal/views/PopupWebView;
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;->popupWebView:Lcom/usebutton/sdk/internal/views/PopupWebView;

    return-object p1
.end method

.method static synthetic access$100(Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;)Landroid/view/ViewGroup;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;->rootView:Landroid/view/ViewGroup;

    return-object p0
.end method

.method private bindControls(Lcom/usebutton/sdk/internal/Navigable;)V
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;->controls:Lcom/usebutton/sdk/internal/views/WebControls;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/views/WebControls;->setController(Lcom/usebutton/sdk/internal/Navigable;)V

    return-void
.end method

.method private getContext()Landroid/content/Context;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;->controls:Lcom/usebutton/sdk/internal/views/WebControls;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/views/WebControls;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method private getHref(Landroid/webkit/WebView;)Ljava/lang/String;
    .locals 2

    .line 137
    invoke-virtual {p1}, Landroid/webkit/WebView;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 142
    :cond_0
    invoke-virtual {p1}, Landroid/webkit/WebView;->getHandler()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 143
    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->requestFocusNodeHref(Landroid/os/Message;)V

    .line 145
    invoke-virtual {v0}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v1

    .line 149
    :cond_1
    invoke-virtual {v0}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p1

    const-string/jumbo v0, "url"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private hasLocationPermission()Z
    .locals 2

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    .line 67
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;->hasPermission(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    .line 69
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;->hasPermission(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private hasPermission(Ljava/lang/String;)Z
    .locals 5

    .line 77
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 78
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/16 v4, 0x17

    if-lt v1, v4, :cond_1

    .line 79
    invoke-virtual {v0, p1}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    return v2

    .line 81
    :cond_1
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 82
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    move v2, v3

    :goto_1
    return v2
.end method

.method private openPopup(Landroid/webkit/WebView;Landroid/os/Message;)V
    .locals 2

    .line 120
    invoke-virtual {p1}, Landroid/webkit/WebView;->getRootView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;->rootView:Landroid/view/ViewGroup;

    .line 121
    new-instance v0, Lcom/usebutton/sdk/internal/views/PopupWebView;

    .line 122
    invoke-virtual {p1}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object p1

    new-instance v1, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient$1;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient$1;-><init>(Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;)V

    invoke-direct {v0, p1, v1}, Lcom/usebutton/sdk/internal/views/PopupWebView;-><init>(Landroid/content/Context;Lcom/usebutton/sdk/internal/views/PopupWebView$OnPopupClosedListener;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;->popupWebView:Lcom/usebutton/sdk/internal/views/PopupWebView;

    .line 129
    iget-object p1, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;->rootView:Landroid/view/ViewGroup;

    iget-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;->popupWebView:Lcom/usebutton/sdk/internal/views/PopupWebView;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 131
    iget-object p1, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Landroid/webkit/WebView$WebViewTransport;

    .line 132
    iget-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;->popupWebView:Lcom/usebutton/sdk/internal/views/PopupWebView;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/views/PopupWebView;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/webkit/WebView$WebViewTransport;->setWebView(Landroid/webkit/WebView;)V

    .line 133
    invoke-virtual {p2}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method


# virtual methods
.method public getPopupWebView()Lcom/usebutton/sdk/internal/views/PopupWebView;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;->popupWebView:Lcom/usebutton/sdk/internal/views/PopupWebView;

    return-object v0
.end method

.method public onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z
    .locals 5

    .line 52
    sget-object v0, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;->TAG:Ljava/lang/String;

    const-string v1, "onConsoleMessage %s: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    .line 53
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->messageLevel()Landroid/webkit/ConsoleMessage$MessageLevel;

    move-result-object v3

    invoke-virtual {v3}, Landroid/webkit/ConsoleMessage$MessageLevel;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 52
    invoke-static {v0, v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->verboseFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    invoke-super {p0, p1}, Landroid/webkit/WebChromeClient;->onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z

    move-result p1

    return p1
.end method

.method public onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z
    .locals 2

    .line 99
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;->getHref(Landroid/webkit/WebView;)Ljava/lang/String;

    move-result-object p3

    .line 101
    invoke-static {p3}, Lcom/usebutton/sdk/internal/browser/BrowserHelpers;->isStoreUrl(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 102
    iget-object p1, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;->presenter:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-virtual {p1, p3}, Lcom/usebutton/sdk/internal/WebViewPresenter;->onStoreUrl(Ljava/lang/String;)V

    return v1

    :cond_0
    if-eqz p2, :cond_1

    .line 108
    invoke-direct {p0, p1, p4}, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;->openPopup(Landroid/webkit/WebView;Landroid/os/Message;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    if-eqz p3, :cond_2

    .line 112
    invoke-virtual {p1, p3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return v1

    :cond_2
    return v1
.end method

.method public onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V
    .locals 1

    .line 60
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;->hasLocationPermission()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 61
    invoke-interface {p2, p1, v0, v0}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    .line 63
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V

    return-void
.end method

.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 0

    .line 93
    invoke-static {}, Lcom/usebutton/sdk/internal/WebViewObserver;->getInstance()Lcom/usebutton/sdk/internal/WebViewObserver;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/usebutton/sdk/internal/WebViewObserver;->updateProgress(I)V

    return-void
.end method
