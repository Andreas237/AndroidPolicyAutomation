.class public Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;
.super Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;
.source "VideoPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;
.implements Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/video/VideoView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;",
        "Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;"
    }
.end annotation


# instance fields
.field private allowCancel:Z

.field private allowSkip:Z

.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private pixelTrackingImpressionUrl:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final pixelTrackingManager:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

.field private url:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private urlIsAd:Z

.field private videoController:Lcom/ibotta/android/mvp/ui/activity/video/VideoController;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;Lcom/ibotta/android/util/AppHelper;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 31
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->pixelTrackingManager:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    .line 32
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method

.method private initVideoController()V
    .locals 4

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->url:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;->finishWithError()V

    return-void

    .line 114
    :cond_0
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->urlIsAd:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 115
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->videoController:Lcom/ibotta/android/mvp/ui/activity/video/VideoController;

    const/4 v0, 0x1

    goto :goto_0

    .line 118
    :cond_1
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->videoController:Lcom/ibotta/android/mvp/ui/activity/video/VideoController;

    const/4 v0, 0x0

    .line 122
    :goto_0
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->videoController:Lcom/ibotta/android/mvp/ui/activity/video/VideoController;

    invoke-interface {v2, v3, v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;->setVideoController(Lcom/ibotta/android/mvp/ui/activity/video/VideoController;Z)V

    .line 124
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->videoController:Lcom/ibotta/android/mvp/ui/activity/video/VideoController;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->url:Ljava/lang/String;

    invoke-interface {v0, v2}, Lcom/ibotta/android/mvp/ui/activity/video/VideoController;->setVideoUrl(Ljava/lang/String;)V

    .line 125
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->videoController:Lcom/ibotta/android/mvp/ui/activity/video/VideoController;

    iget-boolean v2, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->allowCancel:Z

    xor-int/2addr v1, v2

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/video/VideoController;->setScrubForwardDisabled(Z)V

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->videoController:Lcom/ibotta/android/mvp/ui/activity/video/VideoController;

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->allowSkip:Z

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/video/VideoController;->setAllowSkip(Z)V

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->videoController:Lcom/ibotta/android/mvp/ui/activity/video/VideoController;

    invoke-interface {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoController;->setListener(Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;)V

    return-void
.end method

.method private pauseVideo()V
    .locals 1

    .line 198
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->videoController:Lcom/ibotta/android/mvp/ui/activity/video/VideoController;

    if-nez v0, :cond_0

    .line 199
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;->finishWithError()V

    return-void

    .line 203
    :cond_0
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoController;->pause()V

    return-void
.end method

.method private startVideo()V
    .locals 1

    .line 185
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->videoController:Lcom/ibotta/android/mvp/ui/activity/video/VideoController;

    if-nez v0, :cond_0

    .line 186
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;->finishWithError()V

    return-void

    .line 190
    :cond_0
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoController;->start()V

    .line 192
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->videoController:Lcom/ibotta/android/mvp/ui/activity/video/VideoController;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoController;->getCurrentPosition()I

    move-result v0

    if-lez v0, :cond_1

    .line 193
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;->hideLoadingIndicator()V

    :cond_1
    return-void
.end method

.method private stopVideo()V
    .locals 1

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->videoController:Lcom/ibotta/android/mvp/ui/activity/video/VideoController;

    if-nez v0, :cond_0

    .line 208
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;->finishWithError()V

    return-void

    .line 212
    :cond_0
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoController;->stop()V

    .line 213
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->videoController:Lcom/ibotta/android/mvp/ui/activity/video/VideoController;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoController;->destroy()V

    return-void
.end method

.method private trackPixelImpression()V
    .locals 2

    .line 217
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->pixelTrackingImpressionUrl:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 218
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->pixelTrackingManager:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->pixelTrackingImpressionUrl:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;->trackImpression(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public onAllowSkip()V
    .locals 1

    .line 170
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;->showSkip()V

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 53
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->allowCancel:Z

    if-eqz v0, :cond_0

    .line 54
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->stopVideo()V

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;->finishWithCanceled()V

    goto :goto_0

    .line 57
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->pauseVideo()V

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;->confirmCancel()V

    :goto_0
    return-void
.end method

.method public onCancelClicked()V
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;->finishWithCanceled()V

    return-void
.end method

.method public onCancelConfirmed()V
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;->finishWithCanceled()V

    return-void
.end method

.method public onCancelNotConfirmed()V
    .locals 0

    .line 74
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->startVideo()V

    return-void
.end method

.method public onCompleted()V
    .locals 1

    .line 165
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;->finishWithSuccess()V

    return-void
.end method

.method public onDetach()V
    .locals 0

    .line 147
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->stopVideo()V

    .line 149
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;->onDetach()V

    return-void
.end method

.method public onError()V
    .locals 1

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;->showError()V

    return-void
.end method

.method public onErrorDialogClosed()V
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;->finishWithError()V

    return-void
.end method

.method public onPause()V
    .locals 0

    .line 140
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->pauseVideo()V

    .line 142
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;->onPause()V

    return-void
.end method

.method public onPrepared()V
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;->hideLoadingIndicator()V

    .line 155
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->startVideo()V

    return-void
.end method

.method public onResume()V
    .locals 1

    .line 132
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;->onResume()V

    .line 134
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;->showLoadingIndicator()V

    .line 135
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->startVideo()V

    return-void
.end method

.method public onSkipClicked()V
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;->finishWithSuccess()V

    return-void
.end method

.method public onVideoPause()V
    .locals 1
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 175
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;->showPause()V

    return-void
.end method

.method public onVideoPlay()V
    .locals 1
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 180
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->trackPixelImpression()V

    .line 181
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;->hidePause()V

    return-void
.end method

.method public onVideoPlayClicked()V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->startVideo()V

    return-void
.end method

.method public onVideoTouched()V
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->videoController:Lcom/ibotta/android/mvp/ui/activity/video/VideoController;

    if-nez v0, :cond_0

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoView;->finishWithError()V

    return-void

    .line 94
    :cond_0
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoController;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 95
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->pauseVideo()V

    goto :goto_0

    .line 97
    :cond_1
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->startVideo()V

    :goto_0
    return-void
.end method

.method public setParams(Ljava/lang/String;ZZZLjava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 42
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->url:Ljava/lang/String;

    .line 43
    iput-boolean p2, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->urlIsAd:Z

    .line 44
    iput-boolean p3, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->allowCancel:Z

    .line 45
    iput-boolean p4, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->allowSkip:Z

    .line 46
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->pixelTrackingImpressionUrl:Ljava/lang/String;

    .line 48
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenterImpl;->initVideoController()V

    return-void
.end method
