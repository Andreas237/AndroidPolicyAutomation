.class public Lcom/usebutton/sdk/internal/browser/BrowserWebClient;
.super Landroid/webkit/WebViewClient;
.source "BrowserWebClient.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "BrowserWebClient"


# instance fields
.field private final blacklistedWebResources:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private blockedResources:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private isJsLoaded:Z

.field private final jsInterface:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;

.field private final navigator:Lcom/usebutton/sdk/internal/web/Navigator;

.field private final presenter:Lcom/usebutton/sdk/internal/WebViewPresenter;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/usebutton/sdk/internal/WebViewPresenter;Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;Lcom/usebutton/sdk/internal/web/Navigator;Ljava/util/Set;)V
    .locals 1
    .param p1    # Lcom/usebutton/sdk/internal/WebViewPresenter;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/usebutton/sdk/internal/web/Navigator;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/Set;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/sdk/internal/WebViewPresenter;",
            "Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;",
            "Lcom/usebutton/sdk/internal/web/Navigator;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 70
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 56
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->blockedResources:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 61
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->isJsLoaded:Z

    .line 71
    iput-object p1, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->presenter:Lcom/usebutton/sdk/internal/WebViewPresenter;

    .line 72
    iput-object p2, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->jsInterface:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;

    .line 73
    iput-object p3, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->navigator:Lcom/usebutton/sdk/internal/web/Navigator;

    .line 74
    iput-object p4, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->blacklistedWebResources:Ljava/util/Set;

    return-void
.end method

.method private emptyResponse()Landroid/webkit/WebResourceResponse;
    .locals 5

    .line 182
    new-instance v0, Landroid/webkit/WebResourceResponse;

    const-string/jumbo v1, "text/plain"

    const-string/jumbo v2, "utf-8"

    new-instance v3, Ljava/io/ByteArrayInputStream;

    const-string v4, ""

    .line 183
    invoke-virtual {v4}, Ljava/lang/String;->getBytes()[B

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v0, v1, v2, v3}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V

    return-object v0
.end method

.method private shouldBlock(Ljava/lang/String;)Z
    .locals 4

    .line 192
    iget-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->blacklistedWebResources:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 193
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    .line 194
    iget-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->blockedResources:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return v3

    .line 198
    :cond_1
    invoke-virtual {p1, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 199
    iget-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->blockedResources:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return v3

    :cond_2
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public getBlockedResources()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 173
    iget-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->blockedResources:Ljava/util/ArrayList;

    return-object v0
.end method

.method public onPageCommitVisible(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    .line 113
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageCommitVisible(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 114
    sget-object p1, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->TAG:Ljava/lang/String;

    const-string v0, "onPageCommitVisible %s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-static {p1, v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->verboseFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    iget-object p1, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->presenter:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-virtual {p1, p2}, Lcom/usebutton/sdk/internal/WebViewPresenter;->onPageCommitVisible(Ljava/lang/String;)V

    return-void
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 5

    .line 120
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 121
    sget-object v0, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->TAG:Ljava/lang/String;

    const-string v1, "onPageFinished %s"

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p2, v3, v4

    invoke-static {v0, v1, v3}, Lcom/usebutton/sdk/internal/util/ButtonLog;->verboseFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    iget-object p2, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->navigator:Lcom/usebutton/sdk/internal/web/Navigator;

    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/web/Navigator;->onNavigation()V

    .line 123
    iget-object p2, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->presenter:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/WebViewPresenter;->onPageFinished()V

    .line 125
    iget-boolean p2, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->isJsLoaded:Z

    if-eqz p2, :cond_0

    return-void

    .line 129
    :cond_0
    iget-object p2, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->jsInterface:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->loadNavJs(Landroid/content/Context;)V

    .line 130
    iput-boolean v2, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->isJsLoaded:Z

    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2

    .line 103
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 104
    sget-object p1, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->TAG:Ljava/lang/String;

    const-string p3, "onPageStarted %s"

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    invoke-static {p1, p3, v0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->verboseFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    iput-boolean v1, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->isJsLoaded:Z

    .line 106
    iget-object p1, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->presenter:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-virtual {p1, p2}, Lcom/usebutton/sdk/internal/WebViewPresenter;->onPageStarted(Ljava/lang/String;)V

    .line 107
    iget-object p1, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->navigator:Lcom/usebutton/sdk/internal/web/Navigator;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/web/Navigator;->onNavigation()V

    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 4

    .line 154
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    .line 155
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/16 v3, 0x17

    if-lt p1, v3, :cond_0

    .line 156
    sget-object p1, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->TAG:Ljava/lang/String;

    const-string v3, "onError req=%s, error=%s"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object p2

    aput-object p2, v2, v1

    .line 157
    invoke-virtual {p3}, Landroid/webkit/WebResourceError;->getDescription()Ljava/lang/CharSequence;

    move-result-object p2

    aput-object p2, v2, v0

    .line 156
    invoke-static {p1, v3, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->verboseFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 159
    :cond_0
    sget-object p1, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->TAG:Ljava/lang/String;

    const-string v3, "onError req=%s, error=%s"

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p2, v2, v1

    aput-object p3, v2, v0

    invoke-static {p1, v3, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->verboseFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 2

    .line 165
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V

    .line 166
    sget-object p1, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->TAG:Ljava/lang/String;

    const-string p2, "onReceivedSslError error=%s"

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p3}, Landroid/net/http/SslError;->toString()Ljava/lang/String;

    move-result-object p3

    const/4 v1, 0x0

    aput-object p3, v0, v1

    invoke-static {p1, p2, v0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->verboseFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 145
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->shouldBlock(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 146
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->emptyResponse()Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    .line 149
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method

.method public shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 1

    .line 136
    invoke-direct {p0, p2}, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->shouldBlock(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 137
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->emptyResponse()Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    .line 139
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 5

    .line 79
    sget-object p1, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->TAG:Ljava/lang/String;

    const-string/jumbo v0, "shouldOverrideUrlLoading %s"

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    invoke-static {p1, v0, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->verboseFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 81
    invoke-static {p2}, Lcom/usebutton/sdk/internal/browser/BrowserHelpers;->isStoreUrl(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 82
    iget-object p1, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->presenter:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-virtual {p1, p2}, Lcom/usebutton/sdk/internal/WebViewPresenter;->onStoreUrl(Ljava/lang/String;)V

    return v1

    :cond_0
    const-string v0, "file"

    .line 85
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "http"

    .line 86
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "https"

    .line 88
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    .line 87
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "intent"

    .line 91
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "S.market_referrer"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 92
    iget-object p1, p0, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->presenter:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-virtual {p1, p2}, Lcom/usebutton/sdk/internal/WebViewPresenter;->onStoreUrl(Ljava/lang/String;)V

    return v1

    .line 95
    :cond_2
    sget-object p2, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->TAG:Ljava/lang/String;

    const-string v0, "Stopping request to load custom scheme %s, %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    .line 96
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v1

    .line 95
    invoke-static {p2, v0, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->verboseFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return v1

    :cond_3
    :goto_0
    return v3
.end method
