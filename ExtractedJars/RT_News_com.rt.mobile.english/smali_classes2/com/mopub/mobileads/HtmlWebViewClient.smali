.class Lcom/mopub/mobileads/HtmlWebViewClient;
.super Landroid/webkit/WebViewClient;
.source "HtmlWebViewClient.java"


# static fields
.field static final MOPUB_FAIL_LOAD:Ljava/lang/String; = "mopub://failLoad"

.field static final MOPUB_FINISH_LOAD:Ljava/lang/String; = "mopub://finishLoad"


# instance fields
.field private final SUPPORTED_URL_ACTIONS:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "Lcom/mopub/common/UrlAction;",
            ">;"
        }
    .end annotation
.end field

.field private final mClickthroughUrl:Ljava/lang/String;

.field private final mContext:Landroid/content/Context;

.field private final mDspCreativeId:Ljava/lang/String;

.field private mHtmlWebView:Lcom/mopub/mobileads/BaseHtmlWebView;

.field private mHtmlWebViewListener:Lcom/mopub/mobileads/HtmlWebViewListener;

.field private final mRedirectUrl:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/HtmlWebViewListener;Lcom/mopub/mobileads/BaseHtmlWebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 44
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 24
    sget-object v0, Lcom/mopub/common/UrlAction;->HANDLE_MOPUB_SCHEME:Lcom/mopub/common/UrlAction;

    const/16 v1, 0x8

    new-array v1, v1, [Lcom/mopub/common/UrlAction;

    sget-object v2, Lcom/mopub/common/UrlAction;->IGNORE_ABOUT_SCHEME:Lcom/mopub/common/UrlAction;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lcom/mopub/common/UrlAction;->HANDLE_PHONE_SCHEME:Lcom/mopub/common/UrlAction;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    sget-object v2, Lcom/mopub/common/UrlAction;->OPEN_APP_MARKET:Lcom/mopub/common/UrlAction;

    const/4 v3, 0x2

    aput-object v2, v1, v3

    sget-object v2, Lcom/mopub/common/UrlAction;->OPEN_NATIVE_BROWSER:Lcom/mopub/common/UrlAction;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    sget-object v2, Lcom/mopub/common/UrlAction;->OPEN_IN_APP_BROWSER:Lcom/mopub/common/UrlAction;

    const/4 v3, 0x4

    aput-object v2, v1, v3

    sget-object v2, Lcom/mopub/common/UrlAction;->HANDLE_SHARE_TWEET:Lcom/mopub/common/UrlAction;

    const/4 v3, 0x5

    aput-object v2, v1, v3

    sget-object v2, Lcom/mopub/common/UrlAction;->FOLLOW_DEEP_LINK_WITH_FALLBACK:Lcom/mopub/common/UrlAction;

    const/4 v3, 0x6

    aput-object v2, v1, v3

    sget-object v2, Lcom/mopub/common/UrlAction;->FOLLOW_DEEP_LINK:Lcom/mopub/common/UrlAction;

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->SUPPORTED_URL_ACTIONS:Ljava/util/EnumSet;

    .line 45
    iput-object p1, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->mHtmlWebViewListener:Lcom/mopub/mobileads/HtmlWebViewListener;

    .line 46
    iput-object p2, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->mHtmlWebView:Lcom/mopub/mobileads/BaseHtmlWebView;

    .line 47
    iput-object p3, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->mClickthroughUrl:Ljava/lang/String;

    .line 48
    iput-object p4, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->mRedirectUrl:Ljava/lang/String;

    .line 49
    iput-object p5, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->mDspCreativeId:Ljava/lang/String;

    .line 50
    invoke-virtual {p2}, Lcom/mopub/mobileads/BaseHtmlWebView;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->mContext:Landroid/content/Context;

    return-void
.end method

.method static synthetic access$000(Lcom/mopub/mobileads/HtmlWebViewClient;)Lcom/mopub/mobileads/BaseHtmlWebView;
    .locals 0

    .line 20
    iget-object p0, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->mHtmlWebView:Lcom/mopub/mobileads/BaseHtmlWebView;

    return-object p0
.end method

.method static synthetic access$100(Lcom/mopub/mobileads/HtmlWebViewClient;)Lcom/mopub/mobileads/HtmlWebViewListener;
    .locals 0

    .line 20
    iget-object p0, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->mHtmlWebViewListener:Lcom/mopub/mobileads/HtmlWebViewListener;

    return-object p0
.end method


# virtual methods
.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 96
    iget-object p3, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->mRedirectUrl:Ljava/lang/String;

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->mRedirectUrl:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_1

    .line 97
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    .line 98
    iget-object p1, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->mHtmlWebView:Lcom/mopub/mobileads/BaseHtmlWebView;

    invoke-virtual {p1}, Lcom/mopub/mobileads/BaseHtmlWebView;->wasClicked()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 100
    :try_start_0
    iget-object p1, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->mContext:Landroid/content/Context;

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    iget-object p3, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->mDspCreativeId:Ljava/lang/String;

    invoke-static {p1, p2, p3}, Lcom/mopub/common/util/Intents;->showMoPubBrowserForUrl(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/mopub/exceptions/IntentNotResolvableException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 102
    invoke-virtual {p1}, Lcom/mopub/exceptions/IntentNotResolvableException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string p1, "Attempted to redirect without user interaction"

    .line 105
    invoke-static {p1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 2

    .line 55
    new-instance p1, Lcom/mopub/common/UrlHandler$Builder;

    invoke-direct {p1}, Lcom/mopub/common/UrlHandler$Builder;-><init>()V

    iget-object v0, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->mDspCreativeId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/mopub/common/UrlHandler$Builder;->withDspCreativeId(Ljava/lang/String;)Lcom/mopub/common/UrlHandler$Builder;

    move-result-object p1

    iget-object v0, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->SUPPORTED_URL_ACTIONS:Ljava/util/EnumSet;

    invoke-virtual {p1, v0}, Lcom/mopub/common/UrlHandler$Builder;->withSupportedUrlActions(Ljava/util/EnumSet;)Lcom/mopub/common/UrlHandler$Builder;

    move-result-object p1

    new-instance v0, Lcom/mopub/mobileads/HtmlWebViewClient$2;

    invoke-direct {v0, p0}, Lcom/mopub/mobileads/HtmlWebViewClient$2;-><init>(Lcom/mopub/mobileads/HtmlWebViewClient;)V

    invoke-virtual {p1, v0}, Lcom/mopub/common/UrlHandler$Builder;->withResultActions(Lcom/mopub/common/UrlHandler$ResultActions;)Lcom/mopub/common/UrlHandler$Builder;

    move-result-object p1

    new-instance v0, Lcom/mopub/mobileads/HtmlWebViewClient$1;

    invoke-direct {v0, p0}, Lcom/mopub/mobileads/HtmlWebViewClient$1;-><init>(Lcom/mopub/mobileads/HtmlWebViewClient;)V

    invoke-virtual {p1, v0}, Lcom/mopub/common/UrlHandler$Builder;->withMoPubSchemeListener(Lcom/mopub/common/UrlHandler$MoPubSchemeListener;)Lcom/mopub/common/UrlHandler$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mopub/common/UrlHandler$Builder;->build()Lcom/mopub/common/UrlHandler;

    move-result-object p1

    iget-object v0, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->mHtmlWebView:Lcom/mopub/mobileads/BaseHtmlWebView;

    invoke-virtual {v1}, Lcom/mopub/mobileads/BaseHtmlWebView;->wasClicked()Z

    move-result v1

    invoke-virtual {p1, v0, p2, v1}, Lcom/mopub/common/UrlHandler;->handleUrl(Landroid/content/Context;Ljava/lang/String;Z)V

    const/4 p1, 0x1

    return p1
.end method
