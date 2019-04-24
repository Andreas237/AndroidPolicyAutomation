.class public Lcom/shopkick/app/video/VideoOverlayController;
.super Ljava/lang/Object;
.source "VideoOverlayController.java"


# instance fields
.field private final TITLE_ANIMATION_DURATION:I

.field private final TITLE_REMAINING_ON_THE_SCREEN_TIME:I

.field private animationEnded:Z

.field private hideRunnable:Ljava/lang/Runnable;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private overlayLayout:Landroid/widget/RelativeLayout;

.field private playerMainView:Landroid/view/ViewGroup;

.field private titlebarView:Landroid/view/View;

.field private videoController:Lcom/shopkick/app/video/VideoController;

.field private videoTitle:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/video/VideoController;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xbb8

    .line 20
    iput v0, p0, Lcom/shopkick/app/video/VideoOverlayController;->TITLE_REMAINING_ON_THE_SCREEN_TIME:I

    const/16 v0, 0x1f4

    .line 21
    iput v0, p0, Lcom/shopkick/app/video/VideoOverlayController;->TITLE_ANIMATION_DURATION:I

    const/4 v0, 0x1

    .line 31
    iput-boolean v0, p0, Lcom/shopkick/app/video/VideoOverlayController;->animationEnded:Z

    .line 35
    iput-object p1, p0, Lcom/shopkick/app/video/VideoOverlayController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 36
    iput-object p2, p0, Lcom/shopkick/app/video/VideoOverlayController;->videoController:Lcom/shopkick/app/video/VideoController;

    .line 37
    new-instance p1, Lcom/shopkick/app/video/-$$Lambda$VideoOverlayController$Z5p8J2cmiQkLfKYqGKOdxTuk3OY;

    invoke-direct {p1, p0}, Lcom/shopkick/app/video/-$$Lambda$VideoOverlayController$Z5p8J2cmiQkLfKYqGKOdxTuk3OY;-><init>(Lcom/shopkick/app/video/VideoOverlayController;)V

    iput-object p1, p0, Lcom/shopkick/app/video/VideoOverlayController;->hideRunnable:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/video/VideoOverlayController;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/shopkick/app/video/VideoOverlayController;->toggleTitlebar()V

    return-void
.end method

.method static synthetic access$102(Lcom/shopkick/app/video/VideoOverlayController;Z)Z
    .locals 0

    .line 18
    iput-boolean p1, p0, Lcom/shopkick/app/video/VideoOverlayController;->animationEnded:Z

    return p1
.end method

.method static synthetic access$200(Lcom/shopkick/app/video/VideoOverlayController;)Ljava/lang/Runnable;
    .locals 0

    .line 18
    iget-object p0, p0, Lcom/shopkick/app/video/VideoOverlayController;->hideRunnable:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/video/VideoOverlayController;)Landroid/view/View;
    .locals 0

    .line 18
    iget-object p0, p0, Lcom/shopkick/app/video/VideoOverlayController;->titlebarView:Landroid/view/View;

    return-object p0
.end method

.method private fadeInTitlebar()V
    .locals 3

    .line 98
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v1, 0x1f4

    .line 99
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 100
    new-instance v1, Lcom/shopkick/app/video/VideoOverlayController$2;

    invoke-direct {v1, p0}, Lcom/shopkick/app/video/VideoOverlayController$2;-><init>(Lcom/shopkick/app/video/VideoOverlayController;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 114
    iget-object v1, p0, Lcom/shopkick/app/video/VideoOverlayController;->titlebarView:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 115
    iget-object v1, p0, Lcom/shopkick/app/video/VideoOverlayController;->titlebarView:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 116
    iput-boolean v2, p0, Lcom/shopkick/app/video/VideoOverlayController;->animationEnded:Z

    return-void
.end method

.method private fadeOutTitlebar()V
    .locals 3

    .line 121
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v1, 0x1f4

    .line 122
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 123
    new-instance v1, Lcom/shopkick/app/video/VideoOverlayController$3;

    invoke-direct {v1, p0}, Lcom/shopkick/app/video/VideoOverlayController$3;-><init>(Lcom/shopkick/app/video/VideoOverlayController;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 136
    iget-object v1, p0, Lcom/shopkick/app/video/VideoOverlayController;->titlebarView:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 138
    iget-object v1, p0, Lcom/shopkick/app/video/VideoOverlayController;->titlebarView:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 139
    iput-boolean v2, p0, Lcom/shopkick/app/video/VideoOverlayController;->animationEnded:Z

    return-void
.end method

.method public static synthetic lambda$Z5p8J2cmiQkLfKYqGKOdxTuk3OY(Lcom/shopkick/app/video/VideoOverlayController;)V
    .locals 0

    invoke-direct {p0}, Lcom/shopkick/app/video/VideoOverlayController;->fadeOutTitlebar()V

    return-void
.end method

.method public static synthetic lambda$load$8(Lcom/shopkick/app/video/VideoOverlayController;Landroid/view/View;)V
    .locals 1

    .line 54
    iget-object p1, p0, Lcom/shopkick/app/video/VideoOverlayController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "EventVideoExitFullscreenButtonTapped"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 55
    iget-object p1, p0, Lcom/shopkick/app/video/VideoOverlayController;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoController;->exitFullScreen()V

    .line 56
    iget-object p1, p0, Lcom/shopkick/app/video/VideoOverlayController;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoController;->stopVideo()V

    return-void
.end method

.method private toggleTitlebar()V
    .locals 2

    .line 143
    iget-boolean v0, p0, Lcom/shopkick/app/video/VideoOverlayController;->animationEnded:Z

    if-nez v0, :cond_0

    return-void

    .line 144
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/video/VideoOverlayController;->titlebarView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 145
    iget-object v0, p0, Lcom/shopkick/app/video/VideoOverlayController;->titlebarView:Landroid/view/View;

    iget-object v1, p0, Lcom/shopkick/app/video/VideoOverlayController;->hideRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 146
    invoke-direct {p0}, Lcom/shopkick/app/video/VideoOverlayController;->fadeOutTitlebar()V

    goto :goto_0

    .line 148
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/video/VideoOverlayController;->fadeInTitlebar()V

    :goto_0
    return-void
.end method


# virtual methods
.method public didEnterFullscreen()V
    .locals 4

    .line 79
    iget-object v0, p0, Lcom/shopkick/app/video/VideoOverlayController;->overlayLayout:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_0

    .line 80
    iget-object v0, p0, Lcom/shopkick/app/video/VideoOverlayController;->videoTitle:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/video/VideoOverlayController;->setVideoTitle(Ljava/lang/String;)V

    .line 81
    iget-object v0, p0, Lcom/shopkick/app/video/VideoOverlayController;->titlebarView:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 82
    iget-object v0, p0, Lcom/shopkick/app/video/VideoOverlayController;->overlayLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 83
    iget-object v0, p0, Lcom/shopkick/app/video/VideoOverlayController;->titlebarView:Landroid/view/View;

    iget-object v1, p0, Lcom/shopkick/app/video/VideoOverlayController;->hideRunnable:Ljava/lang/Runnable;

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public didExitFullscreen()V
    .locals 2

    .line 88
    iget-object v0, p0, Lcom/shopkick/app/video/VideoOverlayController;->overlayLayout:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 89
    iput-boolean v0, p0, Lcom/shopkick/app/video/VideoOverlayController;->animationEnded:Z

    .line 90
    iget-object v0, p0, Lcom/shopkick/app/video/VideoOverlayController;->titlebarView:Landroid/view/View;

    iget-object v1, p0, Lcom/shopkick/app/video/VideoOverlayController;->hideRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 91
    iget-object v0, p0, Lcom/shopkick/app/video/VideoOverlayController;->titlebarView:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 92
    iget-object v0, p0, Lcom/shopkick/app/video/VideoOverlayController;->overlayLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public load(Landroid/content/Context;)V
    .locals 3

    .line 41
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appscend/media/APSMediaPlayer;->viewController()Landroid/view/ViewGroup;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/video/VideoOverlayController;->playerMainView:Landroid/view/ViewGroup;

    .line 43
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/video/VideoOverlayController;->playerMainView:Landroid/view/ViewGroup;

    const v1, 0x7f0c01e7

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/shopkick/app/video/VideoOverlayController;->overlayLayout:Landroid/widget/RelativeLayout;

    .line 44
    iget-object p1, p0, Lcom/shopkick/app/video/VideoOverlayController;->overlayLayout:Landroid/widget/RelativeLayout;

    const v0, 0x7f09080b

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/video/VideoOverlayController;->titlebarView:Landroid/view/View;

    .line 46
    iget-object p1, p0, Lcom/shopkick/app/video/VideoOverlayController;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoController;->isFullscreen()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 47
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoOverlayController;->didEnterFullscreen()V

    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoOverlayController;->didExitFullscreen()V

    .line 53
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/video/VideoOverlayController;->overlayLayout:Landroid/widget/RelativeLayout;

    const v0, 0x7f090112

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance v0, Lcom/shopkick/app/video/-$$Lambda$VideoOverlayController$jy4-RhQPD66smavyaJsmTnl17kM;

    invoke-direct {v0, p0}, Lcom/shopkick/app/video/-$$Lambda$VideoOverlayController$jy4-RhQPD66smavyaJsmTnl17kM;-><init>(Lcom/shopkick/app/video/VideoOverlayController;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 60
    iget-object p1, p0, Lcom/shopkick/app/video/VideoOverlayController;->overlayLayout:Landroid/widget/RelativeLayout;

    new-instance v0, Lcom/shopkick/app/video/VideoOverlayController$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/video/VideoOverlayController$1;-><init>(Lcom/shopkick/app/video/VideoOverlayController;)V

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 71
    iget-object p1, p0, Lcom/shopkick/app/video/VideoOverlayController;->playerMainView:Landroid/view/ViewGroup;

    iget-object v0, p0, Lcom/shopkick/app/video/VideoOverlayController;->overlayLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public setVideoTitle(Ljava/lang/String;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/shopkick/app/video/VideoOverlayController;->videoTitle:Ljava/lang/String;

    return-void
.end method
