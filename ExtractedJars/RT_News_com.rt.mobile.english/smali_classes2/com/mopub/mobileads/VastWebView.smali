.class Lcom/mopub/mobileads/VastWebView;
.super Lcom/mopub/mobileads/BaseWebView;
.source "VastWebView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/mobileads/VastWebView$VastWebViewOnTouchListener;,
        Lcom/mopub/mobileads/VastWebView$VastWebViewClickListener;
    }
.end annotation


# instance fields
.field mVastWebViewClickListener:Lcom/mopub/mobileads/VastWebView$VastWebViewClickListener;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 30
    invoke-direct {p0, p1}, Lcom/mopub/mobileads/BaseWebView;-><init>(Landroid/content/Context;)V

    .line 32
    invoke-direct {p0}, Lcom/mopub/mobileads/VastWebView;->disableScrollingAndZoom()V

    .line 33
    invoke-virtual {p0}, Lcom/mopub/mobileads/VastWebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 35
    invoke-static {}, Lcom/mopub/common/util/VersionCode;->currentApiLevel()Lcom/mopub/common/util/VersionCode;

    move-result-object p1

    sget-object v1, Lcom/mopub/common/util/VersionCode;->ICE_CREAM_SANDWICH:Lcom/mopub/common/util/VersionCode;

    invoke-virtual {p1, v1}, Lcom/mopub/common/util/VersionCode;->isAtLeast(Lcom/mopub/common/util/VersionCode;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 36
    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/VastWebView;->enablePlugins(Z)V

    :cond_0
    const/4 p1, 0x0

    .line 39
    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/VastWebView;->setBackgroundColor(I)V

    .line 40
    new-instance p1, Lcom/mopub/mobileads/VastWebView$VastWebViewOnTouchListener;

    invoke-direct {p1, p0}, Lcom/mopub/mobileads/VastWebView$VastWebViewOnTouchListener;-><init>(Lcom/mopub/mobileads/VastWebView;)V

    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/VastWebView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 41
    invoke-static {}, Lcom/mopub/common/util/Utils;->generateUniqueId()J

    move-result-wide v0

    long-to-int p1, v0

    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/VastWebView;->setId(I)V

    return-void
.end method

.method static createView(Landroid/content/Context;Lcom/mopub/mobileads/VastResource;)Lcom/mopub/mobileads/VastWebView;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/mopub/mobileads/VastResource;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 72
    invoke-static {p0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 73
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 75
    new-instance v0, Lcom/mopub/mobileads/VastWebView;

    invoke-direct {v0, p0}, Lcom/mopub/mobileads/VastWebView;-><init>(Landroid/content/Context;)V

    .line 76
    invoke-virtual {p1, v0}, Lcom/mopub/mobileads/VastResource;->initializeWebView(Lcom/mopub/mobileads/VastWebView;)V

    return-object v0
.end method

.method private disableScrollingAndZoom()V
    .locals 2

    const/4 v0, 0x0

    .line 54
    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/VastWebView;->setHorizontalScrollBarEnabled(Z)V

    .line 55
    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/VastWebView;->setHorizontalScrollbarOverlay(Z)V

    .line 56
    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/VastWebView;->setVerticalScrollBarEnabled(Z)V

    .line 57
    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/VastWebView;->setVerticalScrollbarOverlay(Z)V

    .line 58
    invoke-virtual {p0}, Lcom/mopub/mobileads/VastWebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 59
    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/VastWebView;->setScrollBarStyle(I)V

    return-void
.end method


# virtual methods
.method getVastWebViewClickListener()Lcom/mopub/mobileads/VastWebView$VastWebViewClickListener;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 111
    iget-object v0, p0, Lcom/mopub/mobileads/VastWebView;->mVastWebViewClickListener:Lcom/mopub/mobileads/VastWebView$VastWebViewClickListener;

    return-object v0
.end method

.method loadData(Ljava/lang/String;)V
    .locals 8

    .line 45
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

    invoke-virtual/range {v2 .. v7}, Lcom/mopub/mobileads/VastWebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method setVastWebViewClickListener(Lcom/mopub/mobileads/VastWebView$VastWebViewClickListener;)V
    .locals 0
    .param p1    # Lcom/mopub/mobileads/VastWebView$VastWebViewClickListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 50
    iput-object p1, p0, Lcom/mopub/mobileads/VastWebView;->mVastWebViewClickListener:Lcom/mopub/mobileads/VastWebView$VastWebViewClickListener;

    return-void
.end method
