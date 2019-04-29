.class public Lcom/mopub/mobileads/MoPubView;
.super Landroid/widget/FrameLayout;
.source "MoPubView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/mobileads/MoPubView$BannerAdListener;
    }
.end annotation


# instance fields
.field protected mAdViewController:Lcom/mopub/mobileads/AdViewController;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mBannerAdListener:Lcom/mopub/mobileads/MoPubView$BannerAdListener;

.field private mContext:Landroid/content/Context;

.field protected mCustomEventBannerAdapter:Lcom/mopub/mobileads/CustomEventBannerAdapter;

.field private mScreenStateReceiver:Landroid/content/BroadcastReceiver;

.field private mScreenVisibility:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 48
    invoke-direct {p0, p1, v0}, Lcom/mopub/mobileads/MoPubView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 54
    invoke-static {p1}, Lcom/mopub/common/util/ManifestUtils;->checkWebViewActivitiesDeclared(Landroid/content/Context;)V

    .line 56
    iput-object p1, p0, Lcom/mopub/mobileads/MoPubView;->mContext:Landroid/content/Context;

    .line 57
    invoke-virtual {p0}, Lcom/mopub/mobileads/MoPubView;->getVisibility()I

    move-result p2

    iput p2, p0, Lcom/mopub/mobileads/MoPubView;->mScreenVisibility:I

    const/4 p2, 0x0

    .line 59
    invoke-virtual {p0, p2}, Lcom/mopub/mobileads/MoPubView;->setHorizontalScrollBarEnabled(Z)V

    .line 60
    invoke-virtual {p0, p2}, Lcom/mopub/mobileads/MoPubView;->setVerticalScrollBarEnabled(Z)V

    .line 67
    invoke-static {p1}, Landroid/webkit/WebViewDatabase;->getInstance(Landroid/content/Context;)Landroid/webkit/WebViewDatabase;

    move-result-object p2

    if-nez p2, :cond_0

    const-string p1, "Disabling MoPub. Local cache file is inaccessible so MoPub will fail if we try to create a WebView. Details of this Android bug found at:https://code.google.com/p/android/issues/detail?id=10789"

    .line 68
    invoke-static {p1}, Lcom/mopub/common/logging/MoPubLog;->e(Ljava/lang/String;)V

    return-void

    .line 74
    :cond_0
    invoke-static {p1, p0}, Lcom/mopub/mobileads/factories/AdViewControllerFactory;->create(Landroid/content/Context;Lcom/mopub/mobileads/MoPubView;)Lcom/mopub/mobileads/AdViewController;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    .line 75
    invoke-direct {p0}, Lcom/mopub/mobileads/MoPubView;->registerScreenStateBroadcastReceiver()V

    return-void
.end method

.method static synthetic access$000(Lcom/mopub/mobileads/MoPubView;)I
    .locals 0

    .line 28
    iget p0, p0, Lcom/mopub/mobileads/MoPubView;->mScreenVisibility:I

    return p0
.end method

.method static synthetic access$100(Lcom/mopub/mobileads/MoPubView;I)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lcom/mopub/mobileads/MoPubView;->setAdVisibility(I)V

    return-void
.end method

.method private registerScreenStateBroadcastReceiver()V
    .locals 3

    .line 79
    new-instance v0, Lcom/mopub/mobileads/MoPubView$1;

    invoke-direct {v0, p0}, Lcom/mopub/mobileads/MoPubView$1;-><init>(Lcom/mopub/mobileads/MoPubView;)V

    iput-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mScreenStateReceiver:Landroid/content/BroadcastReceiver;

    .line 95
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.SCREEN_OFF"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const-string v1, "android.intent.action.USER_PRESENT"

    .line 96
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 97
    iget-object v1, p0, Lcom/mopub/mobileads/MoPubView;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/mopub/mobileads/MoPubView;->mScreenStateReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method private setAdVisibility(I)V
    .locals 1

    .line 190
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    if-nez v0, :cond_0

    return-void

    .line 194
    :cond_0
    invoke-static {p1}, Lcom/mopub/common/util/Visibility;->isScreenVisible(I)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 195
    iget-object p1, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {p1}, Lcom/mopub/mobileads/AdViewController;->unpauseRefresh()V

    goto :goto_0

    .line 197
    :cond_1
    iget-object p1, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {p1}, Lcom/mopub/mobileads/AdViewController;->pauseRefresh()V

    :goto_0
    return-void
.end method

.method private unregisterScreenStateBroadcastReceiver()V
    .locals 2

    .line 102
    :try_start_0
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/mopub/mobileads/MoPubView;->mScreenStateReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "Failed to unregister screen state broadcast receiver (never registered)."

    .line 104
    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    :goto_0
    return-void
.end method


# virtual methods
.method protected adClicked()V
    .locals 1

    .line 228
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mBannerAdListener:Lcom/mopub/mobileads/MoPubView$BannerAdListener;

    if-eqz v0, :cond_0

    .line 229
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mBannerAdListener:Lcom/mopub/mobileads/MoPubView$BannerAdListener;

    invoke-interface {v0, p0}, Lcom/mopub/mobileads/MoPubView$BannerAdListener;->onBannerClicked(Lcom/mopub/mobileads/MoPubView;)V

    :cond_0
    return-void
.end method

.method protected adClosed()V
    .locals 1

    .line 222
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mBannerAdListener:Lcom/mopub/mobileads/MoPubView$BannerAdListener;

    if-eqz v0, :cond_0

    .line 223
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mBannerAdListener:Lcom/mopub/mobileads/MoPubView$BannerAdListener;

    invoke-interface {v0, p0}, Lcom/mopub/mobileads/MoPubView$BannerAdListener;->onBannerCollapsed(Lcom/mopub/mobileads/MoPubView;)V

    :cond_0
    return-void
.end method

.method protected adFailed(Lcom/mopub/mobileads/MoPubErrorCode;)V
    .locals 1

    .line 210
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mBannerAdListener:Lcom/mopub/mobileads/MoPubView$BannerAdListener;

    if-eqz v0, :cond_0

    .line 211
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mBannerAdListener:Lcom/mopub/mobileads/MoPubView$BannerAdListener;

    invoke-interface {v0, p0, p1}, Lcom/mopub/mobileads/MoPubView$BannerAdListener;->onBannerFailed(Lcom/mopub/mobileads/MoPubView;Lcom/mopub/mobileads/MoPubErrorCode;)V

    :cond_0
    return-void
.end method

.method protected adLoaded()V
    .locals 1

    const-string v0, "adLoaded"

    .line 202
    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 204
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mBannerAdListener:Lcom/mopub/mobileads/MoPubView$BannerAdListener;

    if-eqz v0, :cond_0

    .line 205
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mBannerAdListener:Lcom/mopub/mobileads/MoPubView$BannerAdListener;

    invoke-interface {v0, p0}, Lcom/mopub/mobileads/MoPubView$BannerAdListener;->onBannerLoaded(Lcom/mopub/mobileads/MoPubView;)V

    :cond_0
    return-void
.end method

.method protected adPresentedOverlay()V
    .locals 1

    .line 216
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mBannerAdListener:Lcom/mopub/mobileads/MoPubView$BannerAdListener;

    if-eqz v0, :cond_0

    .line 217
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mBannerAdListener:Lcom/mopub/mobileads/MoPubView$BannerAdListener;

    invoke-interface {v0, p0}, Lcom/mopub/mobileads/MoPubView$BannerAdListener;->onBannerExpanded(Lcom/mopub/mobileads/MoPubView;)V

    :cond_0
    return-void
.end method

.method public destroy()V
    .locals 2

    .line 119
    invoke-direct {p0}, Lcom/mopub/mobileads/MoPubView;->unregisterScreenStateBroadcastReceiver()V

    .line 120
    invoke-virtual {p0}, Lcom/mopub/mobileads/MoPubView;->removeAllViews()V

    .line 122
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 123
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->cleanup()V

    .line 124
    iput-object v1, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    .line 127
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mCustomEventBannerAdapter:Lcom/mopub/mobileads/CustomEventBannerAdapter;

    if-eqz v0, :cond_1

    .line 128
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mCustomEventBannerAdapter:Lcom/mopub/mobileads/CustomEventBannerAdapter;

    invoke-virtual {v0}, Lcom/mopub/mobileads/CustomEventBannerAdapter;->invalidate()V

    .line 129
    iput-object v1, p0, Lcom/mopub/mobileads/MoPubView;->mCustomEventBannerAdapter:Lcom/mopub/mobileads/CustomEventBannerAdapter;

    :cond_1
    return-void
.end method

.method public forceRefresh()V
    .locals 1

    .line 328
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mCustomEventBannerAdapter:Lcom/mopub/mobileads/CustomEventBannerAdapter;

    if-eqz v0, :cond_0

    .line 329
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mCustomEventBannerAdapter:Lcom/mopub/mobileads/CustomEventBannerAdapter;

    invoke-virtual {v0}, Lcom/mopub/mobileads/CustomEventBannerAdapter;->invalidate()V

    const/4 v0, 0x0

    .line 330
    iput-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mCustomEventBannerAdapter:Lcom/mopub/mobileads/CustomEventBannerAdapter;

    .line 333
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->forceRefresh()V

    :cond_1
    return-void
.end method

.method public getActivity()Landroid/app/Activity;
    .locals 1

    .line 273
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mContext:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    return-object v0
.end method

.method public getAdFormat()Lcom/mopub/common/AdFormat;
    .locals 1

    .line 341
    sget-object v0, Lcom/mopub/common/AdFormat;->BANNER:Lcom/mopub/common/AdFormat;

    return-object v0
.end method

.method public getAdHeight()I
    .locals 1

    .line 269
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->getAdHeight()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method getAdTimeoutDelay()Ljava/lang/Integer;
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->getAdTimeoutDelay()Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getAdUnitId()Ljava/lang/String;
    .locals 1

    .line 245
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->getAdUnitId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method getAdViewController()Lcom/mopub/mobileads/AdViewController;
    .locals 1

    .line 337
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    return-object v0
.end method

.method public getAdWidth()I
    .locals 1

    .line 265
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->getAdWidth()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getAutorefreshEnabled()Z
    .locals 1

    .line 302
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->getAutorefreshEnabled()Z

    move-result v0

    return v0

    :cond_0
    const-string v0, "Can\'t get autorefresh status for destroyed MoPubView. Returning false."

    .line 304
    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0
.end method

.method public getBannerAdListener()Lcom/mopub/mobileads/MoPubView$BannerAdListener;
    .locals 1

    .line 281
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mBannerAdListener:Lcom/mopub/mobileads/MoPubView$BannerAdListener;

    return-object v0
.end method

.method public getClickTrackingUrl()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getKeywords()Ljava/lang/String;
    .locals 1

    .line 253
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->getKeywords()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getLocalExtras()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 289
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    .line 290
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->getLocalExtras()Ljava/util/Map;

    move-result-object v0

    return-object v0

    .line 292
    :cond_0
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    return-object v0
.end method

.method public getLocation()Landroid/location/Location;
    .locals 1

    .line 261
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->getLocation()Landroid/location/Location;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getResponseString()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getTesting()Z
    .locals 1

    .line 319
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->getTesting()Z

    move-result v0

    return v0

    :cond_0
    const-string v0, "Can\'t get testing status for destroyed MoPubView. Returning false."

    .line 321
    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0
.end method

.method public loadAd()V
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    .line 110
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->loadAd()V

    :cond_0
    return-void
.end method

.method protected loadCustomEvent(Ljava/lang/String;Ljava/util/Map;)V
    .locals 7
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

    .line 142
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    if-nez v0, :cond_0

    return-void

    .line 145
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "Couldn\'t invoke custom event because the server did not specify one."

    .line 146
    invoke-static {p1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 147
    sget-object p1, Lcom/mopub/mobileads/MoPubErrorCode;->ADAPTER_NOT_FOUND:Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/MoPubView;->loadFailUrl(Lcom/mopub/mobileads/MoPubErrorCode;)V

    return-void

    .line 151
    :cond_1
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mCustomEventBannerAdapter:Lcom/mopub/mobileads/CustomEventBannerAdapter;

    if-eqz v0, :cond_2

    .line 152
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mCustomEventBannerAdapter:Lcom/mopub/mobileads/CustomEventBannerAdapter;

    invoke-virtual {v0}, Lcom/mopub/mobileads/CustomEventBannerAdapter;->invalidate()V

    :cond_2
    const-string v0, "Loading custom event adapter."

    .line 155
    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 157
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->getBroadcastIdentifier()J

    move-result-wide v4

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->getAdReport()Lcom/mopub/common/AdReport;

    move-result-object v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/mopub/mobileads/factories/CustomEventBannerAdapterFactory;->create(Lcom/mopub/mobileads/MoPubView;Ljava/lang/String;Ljava/util/Map;JLcom/mopub/common/AdReport;)Lcom/mopub/mobileads/CustomEventBannerAdapter;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/mobileads/MoPubView;->mCustomEventBannerAdapter:Lcom/mopub/mobileads/CustomEventBannerAdapter;

    .line 163
    iget-object p1, p0, Lcom/mopub/mobileads/MoPubView;->mCustomEventBannerAdapter:Lcom/mopub/mobileads/CustomEventBannerAdapter;

    invoke-virtual {p1}, Lcom/mopub/mobileads/CustomEventBannerAdapter;->loadAd()V

    return-void
.end method

.method protected loadFailUrl(Lcom/mopub/mobileads/MoPubErrorCode;)V
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/AdViewController;->loadFailUrl(Lcom/mopub/mobileads/MoPubErrorCode;)V

    :cond_0
    return-void
.end method

.method protected nativeAdLoaded()V
    .locals 1

    .line 234
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->scheduleRefreshTimerIfEnabled()V

    .line 235
    :cond_0
    invoke-virtual {p0}, Lcom/mopub/mobileads/MoPubView;->adLoaded()V

    return-void
.end method

.method protected onWindowVisibilityChanged(I)V
    .locals 1

    .line 183
    iget v0, p0, Lcom/mopub/mobileads/MoPubView;->mScreenVisibility:I

    invoke-static {v0, p1}, Lcom/mopub/common/util/Visibility;->hasScreenVisibilityChanged(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 184
    iput p1, p0, Lcom/mopub/mobileads/MoPubView;->mScreenVisibility:I

    .line 185
    iget p1, p0, Lcom/mopub/mobileads/MoPubView;->mScreenVisibility:I

    invoke-direct {p0, p1}, Lcom/mopub/mobileads/MoPubView;->setAdVisibility(I)V

    :cond_0
    return-void
.end method

.method protected registerClick()V
    .locals 1

    .line 167
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    .line 168
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->registerClick()V

    .line 171
    invoke-virtual {p0}, Lcom/mopub/mobileads/MoPubView;->adClicked()V

    :cond_0
    return-void
.end method

.method public setAdContentView(Landroid/view/View;)V
    .locals 1

    .line 311
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/AdViewController;->setAdContentView(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public setAdUnitId(Ljava/lang/String;)V
    .locals 1

    .line 241
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/AdViewController;->setAdUnitId(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public setAutorefreshEnabled(Z)V
    .locals 1

    .line 296
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    .line 297
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/AdViewController;->forceSetAutorefreshEnabled(Z)V

    :cond_0
    return-void
.end method

.method public setBannerAdListener(Lcom/mopub/mobileads/MoPubView$BannerAdListener;)V
    .locals 0

    .line 277
    iput-object p1, p0, Lcom/mopub/mobileads/MoPubView;->mBannerAdListener:Lcom/mopub/mobileads/MoPubView$BannerAdListener;

    return-void
.end method

.method public setKeywords(Ljava/lang/String;)V
    .locals 1

    .line 249
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/AdViewController;->setKeywords(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public setLocalExtras(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 285
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/AdViewController;->setLocalExtras(Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public setLocation(Landroid/location/Location;)V
    .locals 1

    .line 257
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/AdViewController;->setLocation(Landroid/location/Location;)V

    :cond_0
    return-void
.end method

.method public setTesting(Z)V
    .locals 1

    .line 315
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/AdViewController;->setTesting(Z)V

    :cond_0
    return-void
.end method

.method public setTimeout(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method protected trackNativeImpression()V
    .locals 1

    const-string v0, "Tracking impression for native adapter."

    .line 176
    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 177
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->trackImpression()V

    :cond_0
    return-void
.end method
