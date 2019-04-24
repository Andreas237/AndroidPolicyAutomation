.class public Lcom/ibotta/android/view/video/IbottaVideoView;
.super Landroid/widget/VideoView;
.source "IbottaVideoView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/view/video/IbottaVideoView$IbottaVideoListener;
    }
.end annotation


# static fields
.field private static final MINIMUM_OVERAGE_TIME:I = 0x5


# instance fields
.field private allowSkip:Z

.field appConfig:Lcom/ibotta/android/state/app/config/AppConfig;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private countDownTimer:Landroid/os/CountDownTimer;

.field private ignoreTicks:Z

.field private listener:Lcom/ibotta/android/view/video/IbottaVideoView$IbottaVideoListener;

.field private maxVideoDuration:I

.field private scrubForwardDisabled:Z

.field private secondsWatched:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 32
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/view/video/IbottaVideoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 36
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/view/video/IbottaVideoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/VideoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 41
    invoke-direct {p0}, Lcom/ibotta/android/view/video/IbottaVideoView;->init()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/view/video/IbottaVideoView;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/ibotta/android/view/video/IbottaVideoView;->onCountdownTick()V

    return-void
.end method

.method private init()V
    .locals 1

    .line 84
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/view/video/IbottaVideoView;)V

    .line 85
    iget-object v0, p0, Lcom/ibotta/android/view/video/IbottaVideoView;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getMaxVideoDuration()I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/view/video/IbottaVideoView;->maxVideoDuration:I

    return-void
.end method

.method private onCountdownTick()V
    .locals 3

    .line 144
    iget-boolean v0, p0, Lcom/ibotta/android/view/video/IbottaVideoView;->ignoreTicks:Z

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/ibotta/android/view/video/IbottaVideoView;->getCurrentPosition()I

    move-result v0

    const/4 v1, 0x1

    if-gtz v0, :cond_0

    iget v0, p0, Lcom/ibotta/android/view/video/IbottaVideoView;->secondsWatched:I

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "Tick"

    const/4 v2, 0x0

    .line 148
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    iget v0, p0, Lcom/ibotta/android/view/video/IbottaVideoView;->secondsWatched:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/ibotta/android/view/video/IbottaVideoView;->secondsWatched:I

    .line 152
    iget v0, p0, Lcom/ibotta/android/view/video/IbottaVideoView;->secondsWatched:I

    iget v1, p0, Lcom/ibotta/android/view/video/IbottaVideoView;->maxVideoDuration:I

    if-lt v0, v1, :cond_1

    .line 153
    invoke-direct {p0}, Lcom/ibotta/android/view/video/IbottaVideoView;->stopCountdown()V

    .line 154
    invoke-virtual {p0}, Lcom/ibotta/android/view/video/IbottaVideoView;->destroyCountdownTimer()V

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/view/video/IbottaVideoView;->listener:Lcom/ibotta/android/view/video/IbottaVideoView$IbottaVideoListener;

    if-eqz v0, :cond_1

    .line 156
    invoke-interface {v0}, Lcom/ibotta/android/view/video/IbottaVideoView$IbottaVideoListener;->onAllowSkip()V

    :cond_1
    return-void

    :cond_2
    :goto_0
    return-void
.end method

.method private startCountdown()V
    .locals 9

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/view/video/IbottaVideoView;->countDownTimer:Landroid/os/CountDownTimer;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v0, "Resuming countdown and watching ticks."

    .line 102
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    iput-boolean v1, p0, Lcom/ibotta/android/view/video/IbottaVideoView;->ignoreTicks:Z

    return-void

    :cond_0
    const-string v0, "Starting countdown."

    .line 107
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    invoke-virtual {p0}, Lcom/ibotta/android/view/video/IbottaVideoView;->getDuration()I

    move-result v0

    div-int/lit16 v0, v0, 0x3e8

    .line 112
    iget v2, p0, Lcom/ibotta/android/view/video/IbottaVideoView;->maxVideoDuration:I

    sub-int v2, v0, v2

    const-string v3, "durationSeconds=%1$d, overageSeconds=%2$d, maxVideoDuration=%3$d"

    const/4 v4, 0x3

    .line 114
    new-array v4, v4, [Ljava/lang/Object;

    .line 116
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v4, v1

    const/4 v0, 0x1

    .line 117
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v0

    const/4 v0, 0x2

    iget v5, p0, Lcom/ibotta/android/view/video/IbottaVideoView;->maxVideoDuration:I

    .line 118
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v0

    .line 114
    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    iget-boolean v0, p0, Lcom/ibotta/android/view/video/IbottaVideoView;->allowSkip:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/ibotta/android/view/video/IbottaVideoView;->maxVideoDuration:I

    if-lez v0, :cond_2

    const/4 v0, 0x5

    if-ge v2, v0, :cond_1

    goto :goto_0

    .line 125
    :cond_1
    new-instance v0, Lcom/ibotta/android/view/video/IbottaVideoView$1;

    const-wide v5, 0x7fffffffffffffffL

    const-wide/16 v7, 0x3e8

    move-object v3, v0

    move-object v4, p0

    invoke-direct/range {v3 .. v8}, Lcom/ibotta/android/view/video/IbottaVideoView$1;-><init>(Lcom/ibotta/android/view/video/IbottaVideoView;JJ)V

    iput-object v0, p0, Lcom/ibotta/android/view/video/IbottaVideoView;->countDownTimer:Landroid/os/CountDownTimer;

    .line 135
    iget-object v0, p0, Lcom/ibotta/android/view/video/IbottaVideoView;->countDownTimer:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    return-void

    :cond_2
    :goto_0
    const-string v0, "Criteria not met to start countdown."

    .line 121
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private stopCountdown()V
    .locals 2

    const-string v0, "Ignoring ticks."

    const/4 v1, 0x0

    .line 139
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x1

    .line 140
    iput-boolean v0, p0, Lcom/ibotta/android/view/video/IbottaVideoView;->ignoreTicks:Z

    return-void
.end method


# virtual methods
.method public destroyCountdownTimer()V
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/view/video/IbottaVideoView;->countDownTimer:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    .line 66
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    const/4 v0, 0x0

    .line 67
    iput-object v0, p0, Lcom/ibotta/android/view/video/IbottaVideoView;->countDownTimer:Landroid/os/CountDownTimer;

    :cond_0
    return-void
.end method

.method public isAllowSkip()Z
    .locals 1

    .line 45
    iget-boolean v0, p0, Lcom/ibotta/android/view/video/IbottaVideoView;->allowSkip:Z

    return v0
.end method

.method public isScrubForwardDisabled()Z
    .locals 1

    .line 53
    iget-boolean v0, p0, Lcom/ibotta/android/view/video/IbottaVideoView;->scrubForwardDisabled:Z

    return v0
.end method

.method public pause()V
    .locals 0

    .line 79
    invoke-direct {p0}, Lcom/ibotta/android/view/video/IbottaVideoView;->stopCountdown()V

    .line 80
    invoke-super {p0}, Landroid/widget/VideoView;->pause()V

    return-void
.end method

.method public seekTo(I)V
    .locals 1

    .line 90
    iget-boolean v0, p0, Lcom/ibotta/android/view/video/IbottaVideoView;->scrubForwardDisabled:Z

    if-eqz v0, :cond_0

    .line 91
    invoke-virtual {p0}, Lcom/ibotta/android/view/video/IbottaVideoView;->getCurrentPosition()I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 93
    invoke-super {p0, p1}, Landroid/widget/VideoView;->seekTo(I)V

    goto :goto_0

    .line 96
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/VideoView;->seekTo(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setAllowSkip(Z)V
    .locals 0

    .line 49
    iput-boolean p1, p0, Lcom/ibotta/android/view/video/IbottaVideoView;->allowSkip:Z

    return-void
.end method

.method public setListener(Lcom/ibotta/android/view/video/IbottaVideoView$IbottaVideoListener;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/ibotta/android/view/video/IbottaVideoView;->listener:Lcom/ibotta/android/view/video/IbottaVideoView$IbottaVideoListener;

    return-void
.end method

.method public setScrubForwardDisabled(Z)V
    .locals 0

    .line 57
    iput-boolean p1, p0, Lcom/ibotta/android/view/video/IbottaVideoView;->scrubForwardDisabled:Z

    return-void
.end method

.method public start()V
    .locals 0

    .line 73
    invoke-super {p0}, Landroid/widget/VideoView;->start()V

    .line 74
    invoke-direct {p0}, Lcom/ibotta/android/view/video/IbottaVideoView;->startCountdown()V

    return-void
.end method
