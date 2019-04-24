.class public Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;
.super Ljava/lang/Object;
.source "IMAVideoController.java"

# interfaces
.implements Lcom/google/ads/interactivemedia/v3/api/AdErrorEvent$AdErrorListener;
.implements Lcom/google/ads/interactivemedia/v3/api/AdEvent$AdEventListener;
.implements Lcom/ibotta/android/mvp/ui/activity/video/VideoController;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/ads/interactivemedia/v3/api/AdErrorEvent$AdErrorListener;",
        "Lcom/google/ads/interactivemedia/v3/api/AdEvent$AdEventListener;",
        "Lcom/ibotta/android/mvp/ui/activity/video/VideoController<",
        "Landroid/view/ViewGroup;",
        ">;"
    }
.end annotation


# instance fields
.field private adDisplayed:Z

.field private adsLoader:Lcom/google/ads/interactivemedia/v3/api/AdsLoader;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private adsManager:Lcom/google/ads/interactivemedia/v3/api/AdsManager;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private imaSdkFactory:Lcom/google/ads/interactivemedia/v3/api/ImaSdkFactory;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private paused:Z

.field private playing:Z

.field private vvViewGroup:Landroid/view/ViewGroup;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;)Lcom/google/ads/interactivemedia/v3/api/AdsManager;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->adsManager:Lcom/google/ads/interactivemedia/v3/api/AdsManager;

    return-object p0
.end method

.method static synthetic access$002(Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;Lcom/google/ads/interactivemedia/v3/api/AdsManager;)Lcom/google/ads/interactivemedia/v3/api/AdsManager;
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->adsManager:Lcom/google/ads/interactivemedia/v3/api/AdsManager;

    return-object p1
.end method

.method private init()V
    .locals 2

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->vvViewGroup:Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    return-void

    .line 47
    :cond_0
    invoke-static {}, Lcom/google/ads/interactivemedia/v3/api/ImaSdkFactory;->getInstance()Lcom/google/ads/interactivemedia/v3/api/ImaSdkFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->imaSdkFactory:Lcom/google/ads/interactivemedia/v3/api/ImaSdkFactory;

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->imaSdkFactory:Lcom/google/ads/interactivemedia/v3/api/ImaSdkFactory;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->vvViewGroup:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/ads/interactivemedia/v3/api/ImaSdkFactory;->createAdsLoader(Landroid/content/Context;)Lcom/google/ads/interactivemedia/v3/api/AdsLoader;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->adsLoader:Lcom/google/ads/interactivemedia/v3/api/AdsLoader;

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->adsLoader:Lcom/google/ads/interactivemedia/v3/api/AdsLoader;

    invoke-interface {v0, p0}, Lcom/google/ads/interactivemedia/v3/api/AdsLoader;->addAdErrorListener(Lcom/google/ads/interactivemedia/v3/api/AdErrorEvent$AdErrorListener;)V

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->adsLoader:Lcom/google/ads/interactivemedia/v3/api/AdsLoader;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;)V

    invoke-interface {v0, v1}, Lcom/google/ads/interactivemedia/v3/api/AdsLoader;->addAdsLoadedListener(Lcom/google/ads/interactivemedia/v3/api/AdsLoader$AdsLoadedListener;)V

    return-void
.end method

.method private requestAds(Ljava/lang/String;)V
    .locals 3

    const-string v0, "requestAds: %1$s"

    const/4 v1, 0x1

    .line 226
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->imaSdkFactory:Lcom/google/ads/interactivemedia/v3/api/ImaSdkFactory;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->adsLoader:Lcom/google/ads/interactivemedia/v3/api/AdsLoader;

    if-nez v1, :cond_0

    goto :goto_0

    .line 232
    :cond_0
    invoke-virtual {v0}, Lcom/google/ads/interactivemedia/v3/api/ImaSdkFactory;->createAdDisplayContainer()Lcom/google/ads/interactivemedia/v3/api/AdDisplayContainer;

    move-result-object v0

    .line 233
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->vvViewGroup:Landroid/view/ViewGroup;

    invoke-interface {v0, v1}, Lcom/google/ads/interactivemedia/v3/api/AdDisplayContainer;->setAdContainer(Landroid/view/ViewGroup;)V

    .line 236
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->imaSdkFactory:Lcom/google/ads/interactivemedia/v3/api/ImaSdkFactory;

    invoke-virtual {v1}, Lcom/google/ads/interactivemedia/v3/api/ImaSdkFactory;->createAdsRequest()Lcom/google/ads/interactivemedia/v3/api/AdsRequest;

    move-result-object v1

    .line 237
    invoke-interface {v1, p1}, Lcom/google/ads/interactivemedia/v3/api/AdsRequest;->setAdTagUrl(Ljava/lang/String;)V

    .line 238
    invoke-interface {v1, v0}, Lcom/google/ads/interactivemedia/v3/api/AdsRequest;->setAdDisplayContainer(Lcom/google/ads/interactivemedia/v3/api/AdDisplayContainer;)V

    .line 239
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController$2;

    invoke-direct {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;)V

    invoke-interface {v1, p1}, Lcom/google/ads/interactivemedia/v3/api/AdsRequest;->setContentProgressProvider(Lcom/google/ads/interactivemedia/v3/api/player/ContentProgressProvider;)V

    .line 247
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->adsLoader:Lcom/google/ads/interactivemedia/v3/api/AdsLoader;

    invoke-interface {p1, v1}, Lcom/google/ads/interactivemedia/v3/api/AdsLoader;->requestAds(Lcom/google/ads/interactivemedia/v3/api/AdsRequest;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->adsManager:Lcom/google/ads/interactivemedia/v3/api/AdsManager;

    if-eqz v0, :cond_0

    .line 142
    invoke-interface {v0, p0}, Lcom/google/ads/interactivemedia/v3/api/AdsManager;->removeAdEventListener(Lcom/google/ads/interactivemedia/v3/api/AdEvent$AdEventListener;)V

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->adsManager:Lcom/google/ads/interactivemedia/v3/api/AdsManager;

    invoke-interface {v0, p0}, Lcom/google/ads/interactivemedia/v3/api/AdsManager;->removeAdErrorListener(Lcom/google/ads/interactivemedia/v3/api/AdErrorEvent$AdErrorListener;)V

    .line 144
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->adsManager:Lcom/google/ads/interactivemedia/v3/api/AdsManager;

    invoke-interface {v0}, Lcom/google/ads/interactivemedia/v3/api/AdsManager;->destroy()V

    :cond_0
    const/4 v0, 0x0

    .line 147
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->listener:Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;

    return-void
.end method

.method public getCurrentPosition()I
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->adsManager:Lcom/google/ads/interactivemedia/v3/api/AdsManager;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 92
    :cond_0
    invoke-interface {v0}, Lcom/google/ads/interactivemedia/v3/api/AdsManager;->getAdProgress()Lcom/google/ads/interactivemedia/v3/api/player/VideoProgressUpdate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/ads/interactivemedia/v3/api/player/VideoProgressUpdate;->getCurrentTime()F

    move-result v0

    float-to-int v0, v0

    return v0
.end method

.method public isPlaying()Z
    .locals 1

    .line 97
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->playing:Z

    return v0
.end method

.method public onAdError(Lcom/google/ads/interactivemedia/v3/api/AdErrorEvent;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 153
    invoke-interface {p1}, Lcom/google/ads/interactivemedia/v3/api/AdErrorEvent;->getError()Lcom/google/ads/interactivemedia/v3/api/AdError;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 154
    invoke-interface {p1}, Lcom/google/ads/interactivemedia/v3/api/AdErrorEvent;->getError()Lcom/google/ads/interactivemedia/v3/api/AdError;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/ads/interactivemedia/v3/api/AdError;->getMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string v0, "onAdError: %1$s"

    const/4 v1, 0x1

    .line 157
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->listener:Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;

    if-eqz p1, :cond_1

    .line 160
    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;->onError()V

    :cond_1
    return-void
.end method

.method public onAdEvent(Lcom/google/ads/interactivemedia/v3/api/AdEvent;)V
    .locals 5

    const-string v0, "onAdEvent: %1$s"

    const/4 v1, 0x1

    .line 166
    new-array v2, v1, [Ljava/lang/Object;

    invoke-interface {p1}, Lcom/google/ads/interactivemedia/v3/api/AdEvent;->getType()Lcom/google/ads/interactivemedia/v3/api/AdEvent$AdEventType;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController$3;->$SwitchMap$com$google$ads$interactivemedia$v3$api$AdEvent$AdEventType:[I

    invoke-interface {p1}, Lcom/google/ads/interactivemedia/v3/api/AdEvent;->getType()Lcom/google/ads/interactivemedia/v3/api/AdEvent$AdEventType;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/ads/interactivemedia/v3/api/AdEvent$AdEventType;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 218
    :pswitch_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->pause()V

    goto :goto_0

    .line 214
    :pswitch_1
    iput-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->playing:Z

    .line 215
    iput-boolean v4, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->paused:Z

    goto :goto_0

    .line 209
    :pswitch_2
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->listener:Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;

    if-eqz p1, :cond_0

    .line 210
    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;->onCompleted()V

    goto :goto_0

    .line 205
    :pswitch_3
    iput-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->playing:Z

    .line 206
    iput-boolean v4, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->paused:Z

    goto :goto_0

    .line 201
    :pswitch_4
    iput-boolean v4, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->playing:Z

    .line 202
    iput-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->paused:Z

    goto :goto_0

    .line 195
    :pswitch_5
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->adsManager:Lcom/google/ads/interactivemedia/v3/api/AdsManager;

    if-eqz p1, :cond_0

    .line 196
    invoke-interface {p1}, Lcom/google/ads/interactivemedia/v3/api/AdsManager;->destroy()V

    const/4 p1, 0x0

    .line 197
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->adsManager:Lcom/google/ads/interactivemedia/v3/api/AdsManager;

    goto :goto_0

    .line 192
    :pswitch_6
    iput-boolean v4, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->adDisplayed:Z

    goto :goto_0

    .line 184
    :pswitch_7
    iput-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->adDisplayed:Z

    .line 185
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->listener:Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;

    if-eqz p1, :cond_0

    .line 186
    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;->onPrepared()V

    goto :goto_0

    .line 177
    :pswitch_8
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->listener:Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;

    if-eqz p1, :cond_0

    .line 178
    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;->onCompleted()V

    goto :goto_0

    .line 172
    :pswitch_9
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->adsManager:Lcom/google/ads/interactivemedia/v3/api/AdsManager;

    if-eqz p1, :cond_0

    .line 173
    invoke-interface {p1}, Lcom/google/ads/interactivemedia/v3/api/AdsManager;->start()V

    :cond_0
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public pause()V
    .locals 2

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->adsManager:Lcom/google/ads/interactivemedia/v3/api/AdsManager;

    if-nez v0, :cond_0

    return-void

    .line 125
    :cond_0
    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->playing:Z

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->adDisplayed:Z

    if-eqz v1, :cond_1

    .line 126
    invoke-interface {v0}, Lcom/google/ads/interactivemedia/v3/api/AdsManager;->pause()V

    .line 128
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->listener:Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;

    if-eqz v0, :cond_1

    .line 129
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;->onVideoPause()V

    :cond_1
    return-void
.end method

.method public setAllowSkip(Z)V
    .locals 0

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->listener:Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;

    return-void
.end method

.method public bridge synthetic setPlayerView(Landroid/view/View;)V
    .locals 0

    .line 24
    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->setPlayerView(Landroid/view/ViewGroup;)V

    return-void
.end method

.method public setPlayerView(Landroid/view/ViewGroup;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->vvViewGroup:Landroid/view/ViewGroup;

    .line 38
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->init()V

    return-void
.end method

.method public setScrubForwardDisabled(Z)V
    .locals 0

    return-void
.end method

.method public setVideoUrl(Ljava/lang/String;)V
    .locals 0

    .line 73
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->requestAds(Ljava/lang/String;)V

    return-void
.end method

.method public start()V
    .locals 2

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->adsManager:Lcom/google/ads/interactivemedia/v3/api/AdsManager;

    if-nez v0, :cond_0

    return-void

    .line 106
    :cond_0
    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->playing:Z

    if-nez v1, :cond_2

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->adDisplayed:Z

    if-eqz v1, :cond_2

    .line 107
    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->paused:Z

    if-eqz v1, :cond_1

    .line 108
    invoke-interface {v0}, Lcom/google/ads/interactivemedia/v3/api/AdsManager;->resume()V

    goto :goto_0

    .line 110
    :cond_1
    invoke-interface {v0}, Lcom/google/ads/interactivemedia/v3/api/AdsManager;->start()V

    .line 113
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->listener:Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;

    if-eqz v0, :cond_2

    .line 114
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;->onVideoPlay()V

    :cond_2
    return-void
.end method

.method public stop()V
    .locals 0

    .line 136
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->pause()V

    return-void
.end method
