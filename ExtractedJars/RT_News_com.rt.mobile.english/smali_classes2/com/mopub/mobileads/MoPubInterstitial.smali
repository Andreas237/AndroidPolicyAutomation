.class public Lcom/mopub/mobileads/MoPubInterstitial;
.super Ljava/lang/Object;
.source "MoPubInterstitial.java"

# interfaces
.implements Lcom/mopub/mobileads/CustomEventInterstitialAdapter$CustomEventInterstitialAdapterListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;,
        Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;,
        Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;
    }
.end annotation


# instance fields
.field private mActivity:Landroid/app/Activity;

.field private mAdUnitId:Ljava/lang/String;

.field private mCurrentInterstitialState:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

.field private mCustomEventInterstitialAdapter:Lcom/mopub/mobileads/CustomEventInterstitialAdapter;

.field private mInterstitialAdListener:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;

.field private mInterstitialView:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

.field private mIsDestroyed:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mActivity:Landroid/app/Activity;

    .line 48
    iput-object p2, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mAdUnitId:Ljava/lang/String;

    .line 50
    new-instance p1, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    iget-object p2, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mActivity:Landroid/app/Activity;

    invoke-direct {p1, p0, p2}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;-><init>(Lcom/mopub/mobileads/MoPubInterstitial;Landroid/content/Context;)V

    iput-object p1, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialView:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    .line 51
    iget-object p1, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialView:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    iget-object p2, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mAdUnitId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->setAdUnitId(Ljava/lang/String;)V

    .line 53
    sget-object p1, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;->NOT_READY:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

    iput-object p1, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mCurrentInterstitialState:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

    return-void
.end method

.method static synthetic access$000(Lcom/mopub/mobileads/MoPubInterstitial;)Lcom/mopub/mobileads/CustomEventInterstitialAdapter;
    .locals 0

    .line 19
    iget-object p0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mCustomEventInterstitialAdapter:Lcom/mopub/mobileads/CustomEventInterstitialAdapter;

    return-object p0
.end method

.method static synthetic access$002(Lcom/mopub/mobileads/MoPubInterstitial;Lcom/mopub/mobileads/CustomEventInterstitialAdapter;)Lcom/mopub/mobileads/CustomEventInterstitialAdapter;
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mCustomEventInterstitialAdapter:Lcom/mopub/mobileads/CustomEventInterstitialAdapter;

    return-object p1
.end method

.method static synthetic access$100(Lcom/mopub/mobileads/MoPubInterstitial;)Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;
    .locals 0

    .line 19
    iget-object p0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialAdListener:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;

    return-object p0
.end method

.method private resetCurrentInterstitial()V
    .locals 1

    .line 68
    sget-object v0, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;->NOT_READY:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

    iput-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mCurrentInterstitialState:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

    .line 70
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mCustomEventInterstitialAdapter:Lcom/mopub/mobileads/CustomEventInterstitialAdapter;

    if-eqz v0, :cond_0

    .line 71
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mCustomEventInterstitialAdapter:Lcom/mopub/mobileads/CustomEventInterstitialAdapter;

    invoke-virtual {v0}, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->invalidate()V

    const/4 v0, 0x0

    .line 72
    iput-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mCustomEventInterstitialAdapter:Lcom/mopub/mobileads/CustomEventInterstitialAdapter;

    :cond_0
    const/4 v0, 0x0

    .line 75
    iput-boolean v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mIsDestroyed:Z

    return-void
.end method

.method private showCustomEventInterstitial()V
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mCustomEventInterstitialAdapter:Lcom/mopub/mobileads/CustomEventInterstitialAdapter;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mCustomEventInterstitialAdapter:Lcom/mopub/mobileads/CustomEventInterstitialAdapter;

    invoke-virtual {v0}, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->showInterstitial()V

    :cond_0
    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 2

    const/4 v0, 0x1

    .line 126
    iput-boolean v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mIsDestroyed:Z

    .line 128
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mCustomEventInterstitialAdapter:Lcom/mopub/mobileads/CustomEventInterstitialAdapter;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 129
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mCustomEventInterstitialAdapter:Lcom/mopub/mobileads/CustomEventInterstitialAdapter;

    invoke-virtual {v0}, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->invalidate()V

    .line 130
    iput-object v1, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mCustomEventInterstitialAdapter:Lcom/mopub/mobileads/CustomEventInterstitialAdapter;

    .line 133
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialView:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->setBannerAdListener(Lcom/mopub/mobileads/MoPubView$BannerAdListener;)V

    .line 134
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialView:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->destroy()V

    return-void
.end method

.method public forceRefresh()V
    .locals 1

    .line 63
    invoke-direct {p0}, Lcom/mopub/mobileads/MoPubInterstitial;->resetCurrentInterstitial()V

    .line 64
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialView:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->forceRefresh()V

    return-void
.end method

.method public getActivity()Landroid/app/Activity;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mActivity:Landroid/app/Activity;

    return-object v0
.end method

.method getAdTimeoutDelay()Ljava/lang/Integer;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialView:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->getAdTimeoutDelay()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getInterstitialAdListener()Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;
    .locals 1

    .line 142
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialAdListener:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;

    return-object v0
.end method

.method public getKeywords()Ljava/lang/String;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialView:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->getKeywords()Ljava/lang/String;

    move-result-object v0

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

    .line 158
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialView:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->getLocalExtras()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getLocation()Landroid/location/Location;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialView:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->getLocation()Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method

.method getMoPubInterstitialView()Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialView:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    return-object v0
.end method

.method public getTesting()Z
    .locals 1

    .line 150
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialView:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->getTesting()Z

    move-result v0

    return v0
.end method

.method isDestroyed()Z
    .locals 1

    .line 83
    iget-boolean v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mIsDestroyed:Z

    return v0
.end method

.method public isReady()Z
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mCurrentInterstitialState:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;->isReady()Z

    move-result v0

    return v0
.end method

.method public load()V
    .locals 1

    .line 58
    invoke-direct {p0}, Lcom/mopub/mobileads/MoPubInterstitial;->resetCurrentInterstitial()V

    .line 59
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialView:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->loadAd()V

    return-void
.end method

.method public onCustomEventInterstitialClicked()V
    .locals 1

    .line 197
    invoke-virtual {p0}, Lcom/mopub/mobileads/MoPubInterstitial;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 199
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialView:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->registerClick()V

    .line 201
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialAdListener:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;

    if-eqz v0, :cond_1

    .line 202
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialAdListener:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;

    invoke-interface {v0, p0}, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;->onInterstitialClicked(Lcom/mopub/mobileads/MoPubInterstitial;)V

    :cond_1
    return-void
.end method

.method public onCustomEventInterstitialDismissed()V
    .locals 1

    .line 208
    invoke-virtual {p0}, Lcom/mopub/mobileads/MoPubInterstitial;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 210
    :cond_0
    sget-object v0, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;->NOT_READY:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

    iput-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mCurrentInterstitialState:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

    .line 212
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialAdListener:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;

    if-eqz v0, :cond_1

    .line 213
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialAdListener:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;

    invoke-interface {v0, p0}, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;->onInterstitialDismissed(Lcom/mopub/mobileads/MoPubInterstitial;)V

    :cond_1
    return-void
.end method

.method public onCustomEventInterstitialFailed(Lcom/mopub/mobileads/MoPubErrorCode;)V
    .locals 1

    .line 178
    invoke-virtual {p0}, Lcom/mopub/mobileads/MoPubInterstitial;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 180
    :cond_0
    sget-object v0, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;->NOT_READY:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

    iput-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mCurrentInterstitialState:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

    .line 181
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialView:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->loadFailUrl(Lcom/mopub/mobileads/MoPubErrorCode;)V

    return-void
.end method

.method public onCustomEventInterstitialLoaded()V
    .locals 1

    .line 167
    iget-boolean v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mIsDestroyed:Z

    if-eqz v0, :cond_0

    return-void

    .line 169
    :cond_0
    sget-object v0, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;->CUSTOM_EVENT_AD_READY:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

    iput-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mCurrentInterstitialState:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

    .line 171
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialAdListener:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;

    if-eqz v0, :cond_1

    .line 172
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialAdListener:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;

    invoke-interface {v0, p0}, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;->onInterstitialLoaded(Lcom/mopub/mobileads/MoPubInterstitial;)V

    :cond_1
    return-void
.end method

.method public onCustomEventInterstitialShown()V
    .locals 1

    .line 186
    invoke-virtual {p0}, Lcom/mopub/mobileads/MoPubInterstitial;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 188
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialView:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->trackImpression()V

    .line 190
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialAdListener:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;

    if-eqz v0, :cond_1

    .line 191
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialAdListener:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;

    invoke-interface {v0, p0}, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;->onInterstitialShown(Lcom/mopub/mobileads/MoPubInterstitial;)V

    :cond_1
    return-void
.end method

.method public setInterstitialAdListener(Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialAdListener:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;

    return-void
.end method

.method setInterstitialView(Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;)V
    .locals 0
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 275
    iput-object p1, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialView:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    return-void
.end method

.method public setKeywords(Ljava/lang/String;)V
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialView:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->setKeywords(Ljava/lang/String;)V

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

    .line 154
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialView:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->setLocalExtras(Ljava/util/Map;)V

    return-void
.end method

.method public setTesting(Z)V
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mInterstitialView:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->setTesting(Z)V

    return-void
.end method

.method public show()Z
    .locals 2

    .line 87
    sget-object v0, Lcom/mopub/mobileads/MoPubInterstitial$1;->$SwitchMap$com$mopub$mobileads$MoPubInterstitial$InterstitialState:[I

    iget-object v1, p0, Lcom/mopub/mobileads/MoPubInterstitial;->mCurrentInterstitialState:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;

    invoke-virtual {v1}, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialState;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 89
    :cond_0
    invoke-direct {p0}, Lcom/mopub/mobileads/MoPubInterstitial;->showCustomEventInterstitial()V

    return v1
.end method
