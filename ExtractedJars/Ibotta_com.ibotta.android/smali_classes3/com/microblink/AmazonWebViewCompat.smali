.class final Lcom/microblink/AmazonWebViewCompat;
.super Ljava/lang/Object;


# static fields
.field private static final ORDERS_URL:Ljava/lang/String; = "https://www.amazon.com/gp/css/order-history/ref=nav_nav_orders_first"

.field private static final TAG:Ljava/lang/String; = "AmazonWebViewCompat"

.field private static final USER_AGENT:Ljava/lang/String; = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.167 Safari/537.36"
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# instance fields
.field private webView:Landroid/webkit/WebView;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/webkit/WebViewClient;Z)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/webkit/WebViewClient;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/webkit/WebView;

    invoke-direct {v0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/microblink/AmazonWebViewCompat;->webView:Landroid/webkit/WebView;

    iget-object p1, p0, Lcom/microblink/AmazonWebViewCompat;->webView:Landroid/webkit/WebView;

    invoke-virtual {p1, p3}, Landroid/webkit/WebView;->setWillNotDraw(Z)V

    iget-object p1, p0, Lcom/microblink/AmazonWebViewCompat;->webView:Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p3, 0x1

    invoke-virtual {p1, p3}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    const-string p3, "utf-8"

    invoke-virtual {p1, p3}, Landroid/webkit/WebSettings;->setDefaultTextEncodingName(Ljava/lang/String;)V

    const-string p1, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.167 Safari/537.36"

    invoke-virtual {p0, p1}, Lcom/microblink/AmazonWebViewCompat;->userAgent(Ljava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lcom/microblink/AmazonWebViewCompat;->webView:Landroid/webkit/WebView;

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    return-void
.end method


# virtual methods
.method public final clearCache()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/AmazonWebViewCompat;->webView:Landroid/webkit/WebView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->clearCache(Z)V

    return-void
.end method

.method public final clearCookies()V
    .locals 1

    new-instance v0, Lcom/microblink/AmazonWebViewCompat$1;

    invoke-direct {v0, p0}, Lcom/microblink/AmazonWebViewCompat$1;-><init>(Lcom/microblink/AmazonWebViewCompat;)V

    invoke-virtual {p0, v0}, Lcom/microblink/AmazonWebViewCompat;->clearCookies(Landroid/webkit/ValueCallback;)V

    return-void
.end method

.method public final clearCookies(Landroid/webkit/ValueCallback;)V
    .locals 2
    .param p1    # Landroid/webkit/ValueCallback;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/ValueCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v0

    new-instance v1, Lcom/microblink/AmazonWebViewCompat$2;

    invoke-direct {v1, p0, p1}, Lcom/microblink/AmazonWebViewCompat$2;-><init>(Lcom/microblink/AmazonWebViewCompat;Landroid/webkit/ValueCallback;)V

    invoke-virtual {v0, v1}, Landroid/webkit/CookieManager;->removeAllCookies(Landroid/webkit/ValueCallback;)V

    return-void

    :cond_0
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/CookieManager;->removeAllCookie()V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final headers()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "User-Agent"

    const-string v2, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.167 Safari/537.36"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final loadOrdersUrl()V
    .locals 1

    const-string v0, "https://www.amazon.com/gp/css/order-history/ref=nav_nav_orders_first"

    invoke-virtual {p0, v0}, Lcom/microblink/AmazonWebViewCompat;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method public final loadUrl(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/AmazonWebViewCompat;->webView:Landroid/webkit/WebView;

    invoke-virtual {p0}, Lcom/microblink/AmazonWebViewCompat;->headers()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final loadUrl(Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/AmazonWebViewCompat;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final userAgent(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/AmazonWebViewCompat;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final view()Landroid/webkit/WebView;
    .locals 1

    iget-object v0, p0, Lcom/microblink/AmazonWebViewCompat;->webView:Landroid/webkit/WebView;

    return-object v0
.end method
