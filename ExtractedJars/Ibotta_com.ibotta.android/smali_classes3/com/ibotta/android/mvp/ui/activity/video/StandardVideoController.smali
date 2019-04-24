.class public Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;
.super Ljava/lang/Object;
.source "StandardVideoController.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;
.implements Landroid/media/MediaPlayer$OnErrorListener;
.implements Landroid/media/MediaPlayer$OnPreparedListener;
.implements Lcom/ibotta/android/mvp/ui/activity/video/VideoController;
.implements Lcom/ibotta/android/view/video/IbottaVideoView$IbottaVideoListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/media/MediaPlayer$OnCompletionListener;",
        "Landroid/media/MediaPlayer$OnErrorListener;",
        "Landroid/media/MediaPlayer$OnPreparedListener;",
        "Lcom/ibotta/android/mvp/ui/activity/video/VideoController<",
        "Lcom/ibotta/android/view/video/IbottaVideoView;",
        ">;",
        "Lcom/ibotta/android/view/video/IbottaVideoView$IbottaVideoListener;"
    }
.end annotation


# instance fields
.field private listener:Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private mc:Landroid/widget/MediaController;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private position:I

.field private prepared:Z

.field private vvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private isPrepared()Z
    .locals 1

    .line 173
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->prepared:Z

    return v0
.end method


# virtual methods
.method public destroy()V
    .locals 2

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->vvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 115
    invoke-virtual {v0}, Lcom/ibotta/android/view/video/IbottaVideoView;->destroyCountdownTimer()V

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->vvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/video/IbottaVideoView;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->vvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/video/IbottaVideoView;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->vvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/video/IbottaVideoView;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->vvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/video/IbottaVideoView;->setListener(Lcom/ibotta/android/view/video/IbottaVideoView$IbottaVideoListener;)V

    .line 122
    :cond_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->listener:Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;

    const/4 v0, 0x0

    .line 123
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->prepared:Z

    return-void
.end method

.method public getCurrentPosition()I
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->vvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 73
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/view/video/IbottaVideoView;->getCurrentPosition()I

    move-result v0

    return v0
.end method

.method public isPlaying()Z
    .locals 1

    .line 165
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->vvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 169
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/view/video/IbottaVideoView;->isPlaying()Z

    move-result v0

    return v0
.end method

.method public onAllowSkip()V
    .locals 1

    .line 159
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->listener:Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;

    if-eqz v0, :cond_0

    .line 160
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;->onAllowSkip()V

    :cond_0
    return-void
.end method

.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 0

    .line 128
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->listener:Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;

    if-eqz p1, :cond_0

    .line 129
    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;->onCompleted()V

    :cond_0
    return-void
.end method

.method public onError(Landroid/media/MediaPlayer;II)Z
    .locals 0

    .line 135
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->listener:Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;

    if-eqz p2, :cond_0

    .line 136
    invoke-interface {p2}, Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;->onError()V

    .line 140
    :cond_0
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->reset()V

    const/4 p1, 0x1

    return p1
.end method

.method public onPrepared(Landroid/media/MediaPlayer;)V
    .locals 1

    const/4 p1, 0x1

    .line 146
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->prepared:Z

    .line 148
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->vvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;

    if-eqz p1, :cond_0

    .line 149
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->position:I

    invoke-virtual {p1, v0}, Lcom/ibotta/android/view/video/IbottaVideoView;->seekTo(I)V

    .line 152
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->listener:Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;

    if-eqz p1, :cond_1

    .line 153
    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;->onPrepared()V

    :cond_1
    return-void
.end method

.method public pause()V
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->vvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->vvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/video/IbottaVideoView;->getCurrentPosition()I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->position:I

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->listener:Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;

    if-eqz v0, :cond_0

    .line 94
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;->onVideoPause()V

    .line 96
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->vvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/video/IbottaVideoView;->pause()V

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->mc:Landroid/widget/MediaController;

    if-eqz v0, :cond_1

    .line 99
    invoke-virtual {v0}, Landroid/widget/MediaController;->show()V

    :cond_1
    return-void
.end method

.method public setAllowSkip(Z)V
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->vvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;

    if-eqz v0, :cond_0

    .line 63
    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/video/IbottaVideoView;->setAllowSkip(Z)V

    :cond_0
    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->listener:Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;

    return-void
.end method

.method public bridge synthetic setPlayerView(Landroid/view/View;)V
    .locals 0

    .line 20
    check-cast p1, Lcom/ibotta/android/view/video/IbottaVideoView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->setPlayerView(Lcom/ibotta/android/view/video/IbottaVideoView;)V

    return-void
.end method

.method public setPlayerView(Lcom/ibotta/android/view/video/IbottaVideoView;)V
    .locals 2

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->vvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;

    .line 32
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->vvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/view/video/IbottaVideoView;->setListener(Lcom/ibotta/android/view/video/IbottaVideoView$IbottaVideoListener;)V

    .line 33
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->vvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/view/video/IbottaVideoView;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 34
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->vvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/view/video/IbottaVideoView;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 35
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->vvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/view/video/IbottaVideoView;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 37
    new-instance p1, Landroid/widget/MediaController;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->vvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/video/IbottaVideoView;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Landroid/widget/MediaController;-><init>(Landroid/content/Context;Z)V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->mc:Landroid/widget/MediaController;

    .line 38
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->vvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->mc:Landroid/widget/MediaController;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/view/video/IbottaVideoView;->setMediaController(Landroid/widget/MediaController;)V

    return-void
.end method

.method public setScrubForwardDisabled(Z)V
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->vvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;

    if-eqz v0, :cond_0

    .line 56
    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/video/IbottaVideoView;->setScrubForwardDisabled(Z)V

    :cond_0
    return-void
.end method

.method public setVideoUrl(Ljava/lang/String;)V
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->vvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;

    if-eqz v0, :cond_0

    .line 49
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/video/IbottaVideoView;->setVideoURI(Landroid/net/Uri;)V

    :cond_0
    return-void
.end method

.method public start()V
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->vvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->isPrepared()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 82
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->listener:Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;

    if-eqz v0, :cond_1

    .line 83
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;->onVideoPlay()V

    .line 85
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->vvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/video/IbottaVideoView;->start()V

    return-void

    :cond_2
    :goto_0
    return-void
.end method

.method public stop()V
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->vvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->vvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/video/IbottaVideoView;->getCurrentPosition()I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->position:I

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/StandardVideoController;->vvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/video/IbottaVideoView;->stopPlayback()V

    :cond_0
    return-void
.end method
