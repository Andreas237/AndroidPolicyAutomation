.class public Lcom/mopub/mobileads/BaseHtmlWebView;
.super Lcom/mopub/mobileads/BaseWebView;
.source "BaseHtmlWebView.java"

# interfaces
.implements Lcom/mopub/mobileads/ViewGestureDetector$UserClickListener;


# instance fields
.field private mClicked:Z

.field private final mViewGestureDetector:Lcom/mopub/mobileads/ViewGestureDetector;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/mopub/common/AdReport;)V
    .locals 2

    .line 22
    invoke-direct {p0, p1}, Lcom/mopub/mobileads/BaseWebView;-><init>(Landroid/content/Context;)V

    .line 24
    invoke-direct {p0}, Lcom/mopub/mobileads/BaseHtmlWebView;->disableScrollingAndZoom()V

    .line 25
    invoke-virtual {p0}, Lcom/mopub/mobileads/BaseHtmlWebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 27
    new-instance v0, Lcom/mopub/mobileads/ViewGestureDetector;

    invoke-direct {v0, p1, p0, p2}, Lcom/mopub/mobileads/ViewGestureDetector;-><init>(Landroid/content/Context;Landroid/view/View;Lcom/mopub/common/AdReport;)V

    iput-object v0, p0, Lcom/mopub/mobileads/BaseHtmlWebView;->mViewGestureDetector:Lcom/mopub/mobileads/ViewGestureDetector;

    .line 28
    iget-object p1, p0, Lcom/mopub/mobileads/BaseHtmlWebView;->mViewGestureDetector:Lcom/mopub/mobileads/ViewGestureDetector;

    invoke-virtual {p1, p0}, Lcom/mopub/mobileads/ViewGestureDetector;->setUserClickListener(Lcom/mopub/mobileads/ViewGestureDetector$UserClickListener;)V

    .line 30
    invoke-static {}, Lcom/mopub/common/util/VersionCode;->currentApiLevel()Lcom/mopub/common/util/VersionCode;

    move-result-object p1

    sget-object p2, Lcom/mopub/common/util/VersionCode;->ICE_CREAM_SANDWICH:Lcom/mopub/common/util/VersionCode;

    invoke-virtual {p1, p2}, Lcom/mopub/common/util/VersionCode;->isAtLeast(Lcom/mopub/common/util/VersionCode;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 31
    invoke-virtual {p0, v1}, Lcom/mopub/mobileads/BaseHtmlWebView;->enablePlugins(Z)V

    :cond_0
    const/4 p1, 0x0

    .line 33
    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/BaseHtmlWebView;->setBackgroundColor(I)V

    return-void
.end method

.method static synthetic access$000(Lcom/mopub/mobileads/BaseHtmlWebView;)Lcom/mopub/mobileads/ViewGestureDetector;
    .locals 0

    .line 17
    iget-object p0, p0, Lcom/mopub/mobileads/BaseHtmlWebView;->mViewGestureDetector:Lcom/mopub/mobileads/ViewGestureDetector;

    return-object p0
.end method

.method private disableScrollingAndZoom()V
    .locals 2

    const/4 v0, 0x0

    .line 51
    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/BaseHtmlWebView;->setHorizontalScrollBarEnabled(Z)V

    .line 52
    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/BaseHtmlWebView;->setHorizontalScrollbarOverlay(Z)V

    .line 53
    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/BaseHtmlWebView;->setVerticalScrollBarEnabled(Z)V

    .line 54
    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/BaseHtmlWebView;->setVerticalScrollbarOverlay(Z)V

    .line 55
    invoke-virtual {p0}, Lcom/mopub/mobileads/BaseHtmlWebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    return-void
.end method


# virtual methods
.method public init(Z)V
    .locals 0

    .line 37
    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/BaseHtmlWebView;->initializeOnTouchListener(Z)V

    return-void
.end method

.method initializeOnTouchListener(Z)V
    .locals 1

    .line 64
    new-instance v0, Lcom/mopub/mobileads/BaseHtmlWebView$1;

    invoke-direct {v0, p0, p1}, Lcom/mopub/mobileads/BaseHtmlWebView$1;-><init>(Lcom/mopub/mobileads/BaseHtmlWebView;Z)V

    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/BaseHtmlWebView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method loadHtmlResponse(Ljava/lang/String;)V
    .locals 8

    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/mopub/network/Networking;->getBaseUrlScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "ads.mopub.com"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, "text/html"

    const-string v6, "utf-8"

    const/4 v7, 0x0

    move-object v2, p0

    move-object v4, p1

    invoke-virtual/range {v2 .. v7}, Lcom/mopub/mobileads/BaseHtmlWebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public loadUrl(Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 44
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Loading url: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    const-string v0, "javascript:"

    .line 45
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 46
    invoke-super {p0, p1}, Lcom/mopub/mobileads/BaseWebView;->loadUrl(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public onResetUserClick()V
    .locals 1

    const/4 v0, 0x0

    .line 81
    iput-boolean v0, p0, Lcom/mopub/mobileads/BaseHtmlWebView;->mClicked:Z

    return-void
.end method

.method public onUserClick()V
    .locals 1

    const/4 v0, 0x1

    .line 76
    iput-boolean v0, p0, Lcom/mopub/mobileads/BaseHtmlWebView;->mClicked:Z

    return-void
.end method

.method public wasClicked()Z
    .locals 1

    .line 86
    iget-boolean v0, p0, Lcom/mopub/mobileads/BaseHtmlWebView;->mClicked:Z

    return v0
.end method
