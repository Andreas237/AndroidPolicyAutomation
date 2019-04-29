.class public Lcom/mopub/mobileads/CustomEventBannerAdapter;
.super Ljava/lang/Object;
.source "CustomEventBannerAdapter.java"

# interfaces
.implements Lcom/mopub/mobileads/CustomEventBanner$CustomEventBannerListener;


# static fields
.field public static final DEFAULT_BANNER_TIMEOUT_DELAY:I = 0x2710


# instance fields
.field private mContext:Landroid/content/Context;

.field private mCustomEventBanner:Lcom/mopub/mobileads/CustomEventBanner;

.field private final mHandler:Landroid/os/Handler;

.field private mInvalidated:Z

.field private mLocalExtras:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private mMoPubView:Lcom/mopub/mobileads/MoPubView;

.field private mServerExtras:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mStoredAutorefresh:Z

.field private final mTimeout:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/mopub/mobileads/MoPubView;Ljava/lang/String;Ljava/util/Map;JLcom/mopub/common/AdReport;)V
    .locals 1
    .param p1    # Lcom/mopub/mobileads/MoPubView;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/mopub/common/AdReport;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mopub/mobileads/MoPubView;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;J",
            "Lcom/mopub/common/AdReport;",
            ")V"
        }
    .end annotation

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    invoke-static {p3}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 46
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mHandler:Landroid/os/Handler;

    .line 47
    iput-object p1, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mMoPubView:Lcom/mopub/mobileads/MoPubView;

    .line 48
    invoke-virtual {p1}, Lcom/mopub/mobileads/MoPubView;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mContext:Landroid/content/Context;

    .line 49
    new-instance p1, Lcom/mopub/mobileads/CustomEventBannerAdapter$1;

    invoke-direct {p1, p0}, Lcom/mopub/mobileads/CustomEventBannerAdapter$1;-><init>(Lcom/mopub/mobileads/CustomEventBannerAdapter;)V

    iput-object p1, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mTimeout:Ljava/lang/Runnable;

    .line 58
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Attempting to invoke custom event: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 60
    :try_start_0
    invoke-static {p2}, Lcom/mopub/mobileads/factories/CustomEventBannerFactory;->create(Ljava/lang/String;)Lcom/mopub/mobileads/CustomEventBanner;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mCustomEventBanner:Lcom/mopub/mobileads/CustomEventBanner;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    new-instance p1, Ljava/util/TreeMap;

    invoke-direct {p1, p3}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    iput-object p1, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mServerExtras:Ljava/util/Map;

    .line 70
    iget-object p1, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mMoPubView:Lcom/mopub/mobileads/MoPubView;

    invoke-virtual {p1}, Lcom/mopub/mobileads/MoPubView;->getLocalExtras()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mLocalExtras:Ljava/util/Map;

    .line 71
    iget-object p1, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mMoPubView:Lcom/mopub/mobileads/MoPubView;

    invoke-virtual {p1}, Lcom/mopub/mobileads/MoPubView;->getLocation()Landroid/location/Location;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 72
    iget-object p1, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mLocalExtras:Ljava/util/Map;

    const-string p2, "location"

    iget-object p3, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mMoPubView:Lcom/mopub/mobileads/MoPubView;

    invoke-virtual {p3}, Lcom/mopub/mobileads/MoPubView;->getLocation()Landroid/location/Location;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    :cond_0
    iget-object p1, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mLocalExtras:Ljava/util/Map;

    const-string p2, "broadcastIdentifier"

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    iget-object p1, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mLocalExtras:Ljava/util/Map;

    const-string p2, "mopub-intent-ad-report"

    invoke-interface {p1, p2, p6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    iget-object p1, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mLocalExtras:Ljava/util/Map;

    const-string p2, "com_mopub_ad_width"

    iget-object p3, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mMoPubView:Lcom/mopub/mobileads/MoPubView;

    invoke-virtual {p3}, Lcom/mopub/mobileads/MoPubView;->getAdWidth()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    iget-object p1, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mLocalExtras:Ljava/util/Map;

    const-string p2, "com_mopub_ad_height"

    iget-object p3, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mMoPubView:Lcom/mopub/mobileads/MoPubView;

    invoke-virtual {p3}, Lcom/mopub/mobileads/MoPubView;->getAdHeight()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 62
    :catch_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Couldn\'t locate or instantiate custom event: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 63
    iget-object p1, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mMoPubView:Lcom/mopub/mobileads/MoPubView;

    sget-object p2, Lcom/mopub/mobileads/MoPubErrorCode;->ADAPTER_NOT_FOUND:Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-virtual {p1, p2}, Lcom/mopub/mobileads/MoPubView;->loadFailUrl(Lcom/mopub/mobileads/MoPubErrorCode;)V

    return-void
.end method

.method private cancelTimeout()V
    .locals 2

    .line 119
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mTimeout:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method private getTimeoutDelayMilliseconds()I
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mMoPubView:Lcom/mopub/mobileads/MoPubView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mMoPubView:Lcom/mopub/mobileads/MoPubView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubView;->getAdTimeoutDelay()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mMoPubView:Lcom/mopub/mobileads/MoPubView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubView;->getAdTimeoutDelay()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gez v0, :cond_0

    goto :goto_0

    .line 129
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mMoPubView:Lcom/mopub/mobileads/MoPubView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubView;->getAdTimeoutDelay()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    return v0

    :cond_1
    :goto_0
    const/16 v0, 0x2710

    return v0
.end method


# virtual methods
.method invalidate()V
    .locals 2

    .line 98
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mCustomEventBanner:Lcom/mopub/mobileads/CustomEventBanner;

    if-eqz v0, :cond_0

    .line 102
    :try_start_0
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mCustomEventBanner:Lcom/mopub/mobileads/CustomEventBanner;

    invoke-virtual {v0}, Lcom/mopub/mobileads/CustomEventBanner;->onInvalidate()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Invalidating a custom event banner threw an exception"

    .line 104
    invoke-static {v1, v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 107
    iput-object v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mContext:Landroid/content/Context;

    .line 108
    iput-object v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mCustomEventBanner:Lcom/mopub/mobileads/CustomEventBanner;

    .line 109
    iput-object v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mLocalExtras:Ljava/util/Map;

    .line 110
    iput-object v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mServerExtras:Ljava/util/Map;

    const/4 v0, 0x1

    .line 111
    iput-boolean v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mInvalidated:Z

    return-void
.end method

.method isInvalidated()Z
    .locals 1

    .line 115
    iget-boolean v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mInvalidated:Z

    return v0
.end method

.method loadAd()V
    .locals 4

    .line 81
    invoke-virtual {p0}, Lcom/mopub/mobileads/CustomEventBannerAdapter;->isInvalidated()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mCustomEventBanner:Lcom/mopub/mobileads/CustomEventBanner;

    if-nez v0, :cond_0

    goto :goto_1

    .line 85
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mTimeout:Ljava/lang/Runnable;

    invoke-direct {p0}, Lcom/mopub/mobileads/CustomEventBannerAdapter;->getTimeoutDelayMilliseconds()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 90
    :try_start_0
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mCustomEventBanner:Lcom/mopub/mobileads/CustomEventBanner;

    iget-object v1, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mLocalExtras:Ljava/util/Map;

    iget-object v3, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mServerExtras:Ljava/util/Map;

    invoke-virtual {v0, v1, p0, v2, v3}, Lcom/mopub/mobileads/CustomEventBanner;->loadBanner(Landroid/content/Context;Lcom/mopub/mobileads/CustomEventBanner$CustomEventBannerListener;Ljava/util/Map;Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Loading a custom event banner threw an exception."

    .line 92
    invoke-static {v1, v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    sget-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->INTERNAL_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/CustomEventBannerAdapter;->onBannerFailed(Lcom/mopub/mobileads/MoPubErrorCode;)V

    :goto_0
    return-void

    :cond_1
    :goto_1
    return-void
.end method

.method public onBannerClicked()V
    .locals 1

    .line 190
    invoke-virtual {p0}, Lcom/mopub/mobileads/CustomEventBannerAdapter;->isInvalidated()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 194
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mMoPubView:Lcom/mopub/mobileads/MoPubView;

    if-eqz v0, :cond_1

    .line 195
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mMoPubView:Lcom/mopub/mobileads/MoPubView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubView;->registerClick()V

    :cond_1
    return-void
.end method

.method public onBannerCollapsed()V
    .locals 2

    .line 180
    invoke-virtual {p0}, Lcom/mopub/mobileads/CustomEventBannerAdapter;->isInvalidated()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 184
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mMoPubView:Lcom/mopub/mobileads/MoPubView;

    iget-boolean v1, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mStoredAutorefresh:Z

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/MoPubView;->setAutorefreshEnabled(Z)V

    .line 185
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mMoPubView:Lcom/mopub/mobileads/MoPubView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubView;->adClosed()V

    return-void
.end method

.method public onBannerExpanded()V
    .locals 2

    .line 169
    invoke-virtual {p0}, Lcom/mopub/mobileads/CustomEventBannerAdapter;->isInvalidated()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 173
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mMoPubView:Lcom/mopub/mobileads/MoPubView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubView;->getAutorefreshEnabled()Z

    move-result v0

    iput-boolean v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mStoredAutorefresh:Z

    .line 174
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mMoPubView:Lcom/mopub/mobileads/MoPubView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/MoPubView;->setAutorefreshEnabled(Z)V

    .line 175
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mMoPubView:Lcom/mopub/mobileads/MoPubView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubView;->adPresentedOverlay()V

    return-void
.end method

.method public onBannerFailed(Lcom/mopub/mobileads/MoPubErrorCode;)V
    .locals 1

    .line 154
    invoke-virtual {p0}, Lcom/mopub/mobileads/CustomEventBannerAdapter;->isInvalidated()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 158
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mMoPubView:Lcom/mopub/mobileads/MoPubView;

    if-eqz v0, :cond_2

    if-nez p1, :cond_1

    .line 160
    sget-object p1, Lcom/mopub/mobileads/MoPubErrorCode;->UNSPECIFIED:Lcom/mopub/mobileads/MoPubErrorCode;

    .line 162
    :cond_1
    invoke-direct {p0}, Lcom/mopub/mobileads/CustomEventBannerAdapter;->cancelTimeout()V

    .line 163
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mMoPubView:Lcom/mopub/mobileads/MoPubView;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/MoPubView;->loadFailUrl(Lcom/mopub/mobileads/MoPubErrorCode;)V

    :cond_2
    return-void
.end method

.method public onBannerLoaded(Landroid/view/View;)V
    .locals 1

    .line 137
    invoke-virtual {p0}, Lcom/mopub/mobileads/CustomEventBannerAdapter;->isInvalidated()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 141
    :cond_0
    invoke-direct {p0}, Lcom/mopub/mobileads/CustomEventBannerAdapter;->cancelTimeout()V

    .line 143
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mMoPubView:Lcom/mopub/mobileads/MoPubView;

    if-eqz v0, :cond_1

    .line 144
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mMoPubView:Lcom/mopub/mobileads/MoPubView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubView;->nativeAdLoaded()V

    .line 145
    iget-object v0, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mMoPubView:Lcom/mopub/mobileads/MoPubView;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/MoPubView;->setAdContentView(Landroid/view/View;)V

    .line 146
    instance-of p1, p1, Lcom/mopub/mobileads/HtmlBannerWebView;

    if-nez p1, :cond_1

    .line 147
    iget-object p1, p0, Lcom/mopub/mobileads/CustomEventBannerAdapter;->mMoPubView:Lcom/mopub/mobileads/MoPubView;

    invoke-virtual {p1}, Lcom/mopub/mobileads/MoPubView;->trackNativeImpression()V

    :cond_1
    return-void
.end method

.method public onLeaveApplication()V
    .locals 0

    .line 201
    invoke-virtual {p0}, Lcom/mopub/mobileads/CustomEventBannerAdapter;->onBannerClicked()V

    return-void
.end method
