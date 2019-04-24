.class public Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;
.super Lcom/shopkick/app/screens/BottomDialogFragment;
.source "VideoBonusKicksDialogFragment.java"

# interfaces
.implements Lcom/appscend/utilities/APSMediaPlayerTrackingEventListener;
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final COUNT_DOWN_STRING_FORMAT:Ljava/lang/String; = "%02d"

.field private static final DEFAULT_ANIM_DURATION_0_5:I = 0xc8

.field private static final DEFAULT_ANIM_DURATION_1_0:I = 0x190

.field private static final DEFAULT_ANIM_DURATION_1_5:I = 0x258

.field public static final EVENT_HIDE_VIDEOBONUSKICKS_DIALOGFRAGMENT:Ljava/lang/String; = "ShowVideoBonusKicksDialogFragment"

.field public static final EVENT_SHOW_VIDEOBONUSKICKS_DIALOGFRAGMENT:Ljava/lang/String; = "ShowVideoBonusKicksDialogFragment"

.field public static final EVENT_VIDEOBONUSKICKS_COMPLETED:Ljava/lang/String; = "EventVideoBonusKicksCompleted"

.field public static final EVENT_VIDEOBONUSKICKS_ERROR:Ljava/lang/String; = "EventVideoBonusKicksError"

.field private static final MARGIN_START_END_VIDEO_LAYOUT:I = 0x10


# instance fields
.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private animatorBGAlpha:Landroid/animation/ValueAnimator;

.field private animatorContentAlpha:Landroid/animation/ValueAnimator;

.field private animatorContentContainerAlpha:Landroid/animation/ValueAnimator;

.field private animatorContentContainerTransY:Landroid/animation/ValueAnimator;

.field private animatorUpdateListenerContent:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

.field private animatorVideoProgress:Landroid/animation/ValueAnimator;

.field private background:Landroid/view/ViewGroup;

.field private bonusContainer:Landroid/view/ViewGroup;

.field private bonusIcon:Landroid/widget/ImageView;

.field private bonusLabel:Lcom/shopkick/app/widget/SKTextView;

.field private contentContainer:Landroid/view/ViewGroup;

.field private contentContainerHeightInPixels:I

.field private contentContainerWidthInPixels:I

.field private eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

.field private handler:Landroid/os/Handler;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private res:Landroid/content/res/Resources;

.field private skipButton:Lcom/shopkick/app/widget/SKButton;

.field private tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private videoClickLayout:Landroid/view/ViewGroup;

.field private videoController:Lcom/shopkick/app/video/VideoController;

.field private videoCountdownRunnable:Ljava/lang/Runnable;

.field private videoCountdownTV:Lcom/shopkick/app/widget/SKTextView;

.field private videoDesc:Lcom/shopkick/app/widget/SKTextView;

.field private videoIsLoading:Z

.field private videoLayout:Landroid/widget/RelativeLayout;

.field private videoMuteToggle:Lcom/shopkick/app/logging/UserEventImageView;

.field private videoProgress:Landroid/widget/ProgressBar;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 54
    invoke-direct {p0}, Lcom/shopkick/app/screens/BottomDialogFragment;-><init>()V

    const/4 v0, 0x0

    .line 113
    iput-boolean v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoIsLoading:Z

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;)Landroid/widget/ProgressBar;
    .locals 0

    .line 54
    iget-object p0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoProgress:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->startVideo()V

    return-void
.end method

.method private animateProgressOneSecond()V
    .locals 3

    .line 288
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->getCurrentPlaybackTime()I

    move-result v0

    const/4 v1, 0x2

    .line 289
    new-array v1, v1, [I

    const/4 v2, 0x0

    aput v0, v1, v2

    add-int/lit16 v0, v0, 0x3e8

    const/4 v2, 0x1

    aput v0, v1, v2

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorVideoProgress:Landroid/animation/ValueAnimator;

    .line 290
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorVideoProgress:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment$1;

    invoke-direct {v1, p0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment$1;-><init>(Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 296
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorVideoProgress:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x3e8

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 297
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorVideoProgress:Landroid/animation/ValueAnimator;

    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 298
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorVideoProgress:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method private disableViewsForErrorState()V
    .locals 2

    .line 307
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoController:Lcom/shopkick/app/video/VideoController;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->isVideoPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 308
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->stopVideo()V

    .line 310
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoClickLayout:Landroid/view/ViewGroup;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setClickable(Z)V

    return-void
.end method

.method private disableViewsForLoadingState()V
    .locals 2

    .line 302
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoClickLayout:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setClickable(Z)V

    return-void
.end method

.method private enableViewsForVideo()V
    .locals 2

    .line 314
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoClickLayout:Landroid/view/ViewGroup;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setClickable(Z)V

    return-void
.end method

.method private instantiateAnimatorUpdateListeners()V
    .locals 1

    .line 234
    new-instance v0, Lcom/shopkick/app/video/-$$Lambda$VideoBonusKicksDialogFragment$u4LzwnVJ__H3M0DjwJMV9dc3QkI;

    invoke-direct {v0, p0}, Lcom/shopkick/app/video/-$$Lambda$VideoBonusKicksDialogFragment$u4LzwnVJ__H3M0DjwJMV9dc3QkI;-><init>(Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;)V

    iput-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorUpdateListenerContent:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    return-void
.end method

.method private instantiateViews()V
    .locals 2

    .line 181
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->layout:Landroid/view/ViewGroup;

    const v1, 0x7f090207

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->background:Landroid/view/ViewGroup;

    .line 183
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->layout:Landroid/view/ViewGroup;

    const v1, 0x7f09020a

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->contentContainer:Landroid/view/ViewGroup;

    .line 185
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->contentContainer:Landroid/view/ViewGroup;

    const v1, 0x7f090213

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    iput-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoDesc:Lcom/shopkick/app/widget/SKTextView;

    .line 186
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->contentContainer:Landroid/view/ViewGroup;

    const v1, 0x7f090210

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoLayout:Landroid/widget/RelativeLayout;

    .line 187
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->contentContainer:Landroid/view/ViewGroup;

    const v1, 0x7f090211

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoClickLayout:Landroid/view/ViewGroup;

    .line 188
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoClickLayout:Landroid/view/ViewGroup;

    const v1, 0x7f09020f

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoProgress:Landroid/widget/ProgressBar;

    .line 189
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoClickLayout:Landroid/view/ViewGroup;

    const v1, 0x7f09020d

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    iput-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoCountdownTV:Lcom/shopkick/app/widget/SKTextView;

    .line 190
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoClickLayout:Landroid/view/ViewGroup;

    const v1, 0x7f090212

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/logging/UserEventImageView;

    iput-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoMuteToggle:Lcom/shopkick/app/logging/UserEventImageView;

    .line 192
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->contentContainer:Landroid/view/ViewGroup;

    const v1, 0x7f09020b

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->bonusContainer:Landroid/view/ViewGroup;

    .line 193
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->bonusContainer:Landroid/view/ViewGroup;

    const v1, 0x7f090208

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->bonusIcon:Landroid/widget/ImageView;

    .line 194
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->bonusContainer:Landroid/view/ViewGroup;

    const v1, 0x7f090209

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    iput-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->bonusLabel:Lcom/shopkick/app/widget/SKTextView;

    .line 196
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->contentContainer:Landroid/view/ViewGroup;

    const v1, 0x7f09020c

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    iput-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->skipButton:Lcom/shopkick/app/widget/SKButton;

    return-void
.end method

.method public static synthetic lambda$instantiateAnimatorUpdateListeners$189(Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 235
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    .line 236
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoDesc:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/SKTextView;->setAlpha(F)V

    .line 237
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 238
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoClickLayout:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setAlpha(F)V

    .line 239
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->bonusContainer:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setAlpha(F)V

    .line 240
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->skipButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/SKButton;->setAlpha(F)V

    return-void
.end method

.method public static synthetic lambda$onCreate$188(Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;)V
    .locals 9

    .line 127
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/video/VideoController;->isVideoPlayCompleted(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 128
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoProgress:Landroid/widget/ProgressBar;

    const/4 v3, 0x4

    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 129
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoKicks:Ljava/lang/Integer;

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoKicks:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 130
    :goto_0
    iget-object v3, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoCountdownTV:Lcom/shopkick/app/widget/SKTextView;

    iget-object v4, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->res:Landroid/content/res/Resources;

    const v5, 0x7f0f0012

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v1, v2

    invoke-virtual {v4, v5, v0, v1}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 131
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoCountdownTV:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    return-void

    .line 134
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->getVideoDuration()I

    move-result v0

    iget-object v3, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v3}, Lcom/shopkick/app/video/VideoController;->getCurrentPlaybackTime()I

    move-result v3

    sub-int/2addr v0, v3

    div-int/lit16 v0, v0, 0x3e8

    .line 135
    iget-object v3, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoKicks:Ljava/lang/Integer;

    if-nez v3, :cond_2

    move v3, v2

    goto :goto_1

    :cond_2
    iget-object v3, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoKicks:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 136
    :goto_1
    iget-object v4, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->res:Landroid/content/res/Resources;

    const v5, 0x7f0f0047

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    .line 139
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v2

    const-string v7, "%02d"

    new-array v8, v1, [Ljava/lang/Object;

    .line 140
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v8, v2

    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v6, v1

    .line 136
    invoke-virtual {v4, v5, v3, v6}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 142
    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoCountdownTV:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 143
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoProgress:Landroid/widget/ProgressBar;

    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v1}, Lcom/shopkick/app/video/VideoController;->getVideoDuration()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 144
    invoke-direct {p0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animateProgressOneSecond()V

    return-void
.end method

.method public static synthetic lambda$onTrackingEventReceived$190(Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;Ljava/lang/ref/WeakReference;)V
    .locals 0

    .line 593
    invoke-static {p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hideIfNotNull(Ljava/lang/ref/WeakReference;)V

    .line 594
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->hideOnScreen()V

    return-void
.end method

.method private setupViewDimens()V
    .locals 6

    .line 200
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 201
    invoke-static {v0}, Lcom/shopkick/app/util/FrameConfigurator;->maxScreenWidth(Landroid/content/Context;)I

    move-result v1

    iput v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->contentContainerWidthInPixels:I

    .line 202
    iget v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->contentContainerWidthInPixels:I

    const/16 v2, 0x10

    invoke-static {v2, v0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v3

    mul-int/lit8 v3, v3, 0x2

    sub-int/2addr v1, v3

    .line 203
    iget v3, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->contentContainerWidthInPixels:I

    mul-int/lit8 v3, v3, 0x9

    div-int/2addr v3, v2

    .line 206
    iget-object v4, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {v4}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroid/widget/RelativeLayout$LayoutParams;

    .line 207
    iput v1, v4, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 208
    iput v3, v4, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 209
    iget-object v5, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {v5, v4}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 212
    invoke-static {v2, v0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v4

    const/16 v5, 0x30

    .line 213
    invoke-static {v5, v0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v5

    add-int/2addr v4, v5

    .line 214
    invoke-static {v2, v0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v5

    add-int/2addr v4, v5

    const/16 v5, 0x12

    .line 215
    invoke-static {v5, v0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v5

    add-int/2addr v4, v5

    const/16 v5, 0x8

    .line 216
    invoke-static {v5, v0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v5

    add-int/2addr v4, v5

    const/16 v5, 0x14

    .line 217
    invoke-static {v5, v0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v5

    add-int/2addr v4, v5

    .line 218
    invoke-static {v2, v0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v5

    add-int/2addr v4, v5

    add-int/2addr v4, v3

    .line 220
    invoke-static {v2, v0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v0

    add-int/2addr v4, v0

    iput v4, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->contentContainerHeightInPixels:I

    .line 221
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->contentContainer:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 222
    iget v2, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->contentContainerWidthInPixels:I

    iput v2, v0, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 223
    iget v2, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->contentContainerHeightInPixels:I

    iput v2, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 224
    iget-object v2, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->contentContainer:Landroid/view/ViewGroup;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 227
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoClickLayout:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 228
    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 229
    iput v3, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 230
    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoClickLayout:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private setupViews()V
    .locals 8

    .line 245
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->background:Landroid/view/ViewGroup;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 246
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoClickLayout:Landroid/view/ViewGroup;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 247
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoClickLayout:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->bringToFront()V

    .line 248
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->contentContainer:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoClickLayout:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->bringChildToFront(Landroid/view/View;)V

    .line 249
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->skipButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 252
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoProgress:Landroid/widget/ProgressBar;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 253
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoProgress:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 256
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoKicks:Ljava/lang/Integer;

    .line 257
    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 258
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 260
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->bonusLabel:Lcom/shopkick/app/widget/SKTextView;

    .line 261
    invoke-virtual {v1}, Lcom/shopkick/app/widget/SKTextView;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0f002a

    .line 263
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v6, 0x1

    new-array v7, v6, [Ljava/lang/Object;

    aput-object v0, v7, v2

    .line 261
    invoke-virtual {v3, v4, v5, v7}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 260
    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 269
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoDesc:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoDescriptionText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 272
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x20

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 273
    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 274
    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVideoId(Ljava/lang/String;)V

    .line 276
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 277
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 279
    new-instance v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 280
    new-instance v3, Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

    invoke-direct {v3}, Lcom/shopkick/app/logging/SimpleUserEventCoordinator;-><init>()V

    iput-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    .line 281
    iput-boolean v6, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 283
    iget-object v3, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->skipButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v3, v1}, Lcom/shopkick/app/widget/SKButton;->setRepeatableLogActions(Ljava/util/ArrayList;)V

    .line 284
    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->skipButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v3, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0, v3, v2}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method

.method private startVideo()V
    .locals 3

    .line 438
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v2, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/video/VideoController;->setupVideo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/ViewGroup;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 439
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/video/VideoController;->loadVideo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 440
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->playVideo()V

    goto :goto_0

    .line 442
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->disableViewsForErrorState()V

    :goto_0
    return-void
.end method

.method private toggleMute()V
    .locals 4

    .line 350
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->isMuted()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 352
    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoMuteToggle:Lcom/shopkick/app/logging/UserEventImageView;

    const v2, 0x7f08031d

    invoke-virtual {v1, v2}, Lcom/shopkick/app/logging/UserEventImageView;->setImageResource(I)V

    goto :goto_0

    .line 354
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoMuteToggle:Lcom/shopkick/app/logging/UserEventImageView;

    const v2, 0x7f08031c

    invoke-virtual {v1, v2}, Lcom/shopkick/app/logging/UserEventImageView;->setImageResource(I)V

    .line 357
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoController:Lcom/shopkick/app/video/VideoController;

    xor-int/lit8 v2, v0, 0x1

    invoke-virtual {v1, v2}, Lcom/shopkick/app/video/VideoController;->setMute(Z)V

    .line 361
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0x17b

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 362
    iget-object v2, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 363
    iget-object v2, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVideoId(Ljava/lang/String;)V

    xor-int/lit8 v0, v0, 0x1

    .line 364
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setIsVideoMuted(Ljava/lang/Boolean;)V

    .line 366
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method


# virtual methods
.method protected animateForHide()V
    .locals 6

    .line 500
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->background:Landroid/view/ViewGroup;

    const-string v1, "alpha"

    const/4 v2, 0x2

    new-array v3, v2, [F

    fill-array-data v3, :array_0

    invoke-static {v0, v1, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorBGAlpha:Landroid/animation/ValueAnimator;

    .line 501
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->contentContainer:Landroid/view/ViewGroup;

    const-string v1, "alpha"

    new-array v3, v2, [F

    fill-array-data v3, :array_1

    invoke-static {v0, v1, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentContainerAlpha:Landroid/animation/ValueAnimator;

    .line 502
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->contentContainer:Landroid/view/ViewGroup;

    const-string/jumbo v1, "translationY"

    new-array v3, v2, [F

    const/4 v4, 0x0

    const/4 v5, 0x0

    aput v5, v3, v4

    iget v4, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->contentContainerHeightInPixels:I

    div-int/2addr v4, v2

    int-to-float v2, v4

    const/4 v4, 0x1

    aput v2, v3, v4

    invoke-static {v0, v1, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentContainerTransY:Landroid/animation/ValueAnimator;

    .line 504
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentAlpha:Landroid/animation/ValueAnimator;

    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorUpdateListenerContent:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->removeUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 505
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentAlpha:Landroid/animation/ValueAnimator;

    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorUpdateListenerContent:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 507
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorBGAlpha:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0xc8

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 508
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentContainerAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 509
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentContainerTransY:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 510
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 512
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorBGAlpha:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x190

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 513
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentContainerAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 514
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentContainerTransY:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 515
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentAlpha:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 521
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->removeAllListeners()V

    .line 522
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentContainerTransY:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->removeAllListeners()V

    .line 525
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentContainerTransY:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment$3;

    invoke-direct {v1, p0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment$3;-><init>(Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 541
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorBGAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 542
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentContainerAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 543
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentContainerTransY:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 544
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->reverse()V

    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method protected animateForReveal()V
    .locals 6

    .line 456
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->background:Landroid/view/ViewGroup;

    const-string v1, "alpha"

    const/4 v2, 0x2

    new-array v3, v2, [F

    fill-array-data v3, :array_0

    invoke-static {v0, v1, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorBGAlpha:Landroid/animation/ValueAnimator;

    .line 457
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->contentContainer:Landroid/view/ViewGroup;

    const-string v1, "alpha"

    new-array v3, v2, [F

    fill-array-data v3, :array_1

    invoke-static {v0, v1, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentContainerAlpha:Landroid/animation/ValueAnimator;

    .line 458
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->contentContainer:Landroid/view/ViewGroup;

    const-string/jumbo v1, "translationY"

    new-array v3, v2, [F

    iget v4, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->contentContainerHeightInPixels:I

    int-to-float v4, v4

    const/4 v5, 0x0

    aput v4, v3, v5

    const/4 v4, 0x1

    const/4 v5, 0x0

    aput v5, v3, v4

    invoke-static {v0, v1, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentContainerTransY:Landroid/animation/ValueAnimator;

    .line 459
    new-array v0, v2, [F

    fill-array-data v0, :array_2

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentAlpha:Landroid/animation/ValueAnimator;

    .line 460
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentAlpha:Landroid/animation/ValueAnimator;

    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorUpdateListenerContent:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->removeUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 461
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentAlpha:Landroid/animation/ValueAnimator;

    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorUpdateListenerContent:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 463
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorBGAlpha:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0xc8

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 464
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentContainerAlpha:Landroid/animation/ValueAnimator;

    const-wide/16 v3, 0x190

    invoke-virtual {v0, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 465
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentContainerTransY:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 466
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 468
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorBGAlpha:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 469
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentContainerAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 470
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentContainerTransY:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 471
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v3, v4}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 476
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentContainerTransY:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->removeAllListeners()V

    .line 477
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->removeAllListeners()V

    .line 480
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentAlpha:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment$2;

    invoke-direct {v1, p0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment$2;-><init>(Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 493
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorBGAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 494
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentContainerAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 495
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentContainerTransY:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 496
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_2
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public disableClicksForDismiss()V
    .locals 2

    .line 319
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->background:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setClickable(Z)V

    .line 320
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->skipButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setClickable(Z)V

    .line 321
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoClickLayout:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setClickable(Z)V

    return-void
.end method

.method protected getLayoutId()I
    .locals 1

    const v0, 0x7f0c00a5

    return v0
.end method

.method public hideOnScreen()V
    .locals 1

    .line 447
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoController:Lcom/shopkick/app/video/VideoController;

    if-eqz v0, :cond_0

    .line 448
    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->stopVideo()V

    .line 450
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 451
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animateForHide()V

    :cond_1
    return-void
.end method

.method protected obliterateAnimations()V
    .locals 2

    .line 411
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorBGAlpha:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 412
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorBGAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->end()V

    :cond_0
    const/4 v0, 0x0

    .line 414
    iput-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorBGAlpha:Landroid/animation/ValueAnimator;

    .line 416
    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentAlpha:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 417
    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->end()V

    .line 419
    :cond_1
    iput-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentAlpha:Landroid/animation/ValueAnimator;

    .line 421
    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentContainerAlpha:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 422
    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentContainerAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->end()V

    .line 424
    :cond_2
    iput-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentContainerAlpha:Landroid/animation/ValueAnimator;

    .line 426
    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentContainerTransY:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 427
    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentContainerTransY:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->end()V

    .line 429
    :cond_3
    iput-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorContentContainerTransY:Landroid/animation/ValueAnimator;

    .line 431
    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorVideoProgress:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 432
    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorVideoProgress:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->end()V

    .line 434
    :cond_4
    iput-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animatorVideoProgress:Landroid/animation/ValueAnimator;

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 326
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f090207

    if-eq p1, v0, :cond_3

    const v0, 0x7f09020c

    if-eq p1, v0, :cond_2

    const v0, 0x7f090211

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 338
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoController;->isVideoPlaying()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 339
    invoke-direct {p0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->toggleMute()V

    goto :goto_0

    .line 342
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/video/VideoController;->setupVideo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/ViewGroup;)Z

    .line 343
    iget-object p1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/video/VideoController;->loadVideo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 344
    iget-object p1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoController;->playVideo()V

    goto :goto_0

    .line 332
    :cond_2
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->disableClicksForDismiss()V

    .line 333
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->hideOnScreen()V

    goto :goto_0

    .line 328
    :cond_3
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->disableClicksForDismiss()V

    .line 329
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->hideOnScreen()V

    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 122
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/BottomDialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 124
    new-instance p1, Landroid/os/Handler;

    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    :goto_0
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->handler:Landroid/os/Handler;

    .line 126
    new-instance p1, Lcom/shopkick/app/video/-$$Lambda$VideoBonusKicksDialogFragment$z5V0B1uKMpqQGFzcLOtIfxKJrBs;

    invoke-direct {p1, p0}, Lcom/shopkick/app/video/-$$Lambda$VideoBonusKicksDialogFragment$z5V0B1uKMpqQGFzcLOtIfxKJrBs;-><init>(Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;)V

    iput-object p1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoCountdownRunnable:Ljava/lang/Runnable;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 167
    invoke-super {p0, p1, p2, p3}, Lcom/shopkick/app/screens/BottomDialogFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 169
    iget-object p1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->layout:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->res:Landroid/content/res/Resources;

    .line 171
    invoke-direct {p0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->instantiateViews()V

    .line 172
    invoke-direct {p0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->setupViewDimens()V

    .line 173
    invoke-direct {p0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->instantiateAnimatorUpdateListeners()V

    .line 174
    invoke-direct {p0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->setupViews()V

    .line 176
    iget-object p1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->layout:Landroid/view/ViewGroup;

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 400
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoController:Lcom/shopkick/app/video/VideoController;

    if-eqz v0, :cond_0

    .line 401
    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->stopVideo()V

    .line 402
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/video/VideoController;->removeTrackEventListener(Lcom/appscend/utilities/APSMediaPlayerTrackingEventListener;)V

    .line 404
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->handler:Landroid/os/Handler;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoCountdownRunnable:Ljava/lang/Runnable;

    if-eqz v1, :cond_1

    .line 405
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 407
    :cond_1
    invoke-super {p0}, Lcom/shopkick/app/screens/BottomDialogFragment;->onDestroy()V

    return-void
.end method

.method public onPause()V
    .locals 1

    .line 392
    invoke-super {p0}, Lcom/shopkick/app/screens/BottomDialogFragment;->onPause()V

    .line 393
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoController:Lcom/shopkick/app/video/VideoController;

    if-eqz v0, :cond_0

    .line 394
    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->pauseVideo()V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 3

    .line 371
    invoke-super {p0}, Lcom/shopkick/app/screens/BottomDialogFragment;->onResume()V

    .line 372
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoController:Lcom/shopkick/app/video/VideoController;

    if-eqz v0, :cond_0

    .line 373
    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->playVideo()V

    .line 378
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x17a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x56

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 379
    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 380
    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVideoId(Ljava/lang/String;)V

    .line 381
    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 384
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x20

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 385
    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 386
    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVideoId(Ljava/lang/String;)V

    .line 387
    iget-object v1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method public onTrackingEventReceived(Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;Landroid/os/Bundle;)V
    .locals 7

    .line 551
    sget-object p2, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment$4;->$SwitchMap$com$appscend$media$APSMediaTrackingEvents$MediaEventType:[I

    invoke-virtual {p1}, Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 600
    :pswitch_0
    iget-object p1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->handler:Landroid/os/Handler;

    iget-object p2, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoCountdownRunnable:Ljava/lang/Runnable;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 583
    :pswitch_1
    iget-object p1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "EventVideoBonusKicksError"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 584
    iget-boolean p1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoIsLoading:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 585
    iput-boolean p1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoIsLoading:Z

    .line 586
    invoke-direct {p0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->disableViewsForErrorState()V

    .line 588
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v1, 0x0

    const p1, 0x7f110155

    .line 589
    invoke-virtual {p0, p1}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    const p1, 0x7f110758

    .line 590
    invoke-virtual {p0, p1}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    const p1, 0x7f11014f

    .line 591
    invoke-virtual {p0, p1}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/shopkick/app/video/-$$Lambda$VideoBonusKicksDialogFragment$FK3cSucvjKi9y-MPjtlnGQ5sHO4;

    invoke-direct {v5, p0}, Lcom/shopkick/app/video/-$$Lambda$VideoBonusKicksDialogFragment$FK3cSucvjKi9y-MPjtlnGQ5sHO4;-><init>(Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;)V

    const/4 v6, 0x0

    .line 588
    invoke-virtual/range {v0 .. v6}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogAcknowledge(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto :goto_0

    .line 578
    :pswitch_2
    iget-object p1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "EventVideoBonusKicksCompleted"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 579
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->hideOnScreen()V

    goto :goto_0

    .line 573
    :pswitch_3
    invoke-direct {p0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->enableViewsForVideo()V

    .line 574
    iget-object p1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/video/VideoController;->setMute(Z)V

    .line 575
    iget-object p1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object p2

    const v0, 0x7f060021

    invoke-static {p2, v0}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    goto :goto_0

    .line 566
    :pswitch_4
    invoke-direct {p0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->disableViewsForErrorState()V

    goto :goto_0

    .line 559
    :pswitch_5
    iput-boolean p2, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoIsLoading:Z

    .line 560
    invoke-direct {p0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->disableViewsForLoadingState()V

    :goto_0
    :pswitch_6
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_4
        :pswitch_6
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setArgs(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    .line 152
    iput-object p2, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 153
    iput-object p3, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 154
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p2, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 155
    iput-object p4, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 157
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->videoController:Lcom/shopkick/app/video/VideoController;

    iput-object p1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoController:Lcom/shopkick/app/video/VideoController;

    .line 158
    iget-object p1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/video/VideoController;->addTrackingEventListener(Lcom/appscend/utilities/APSMediaPlayerTrackingEventListener;)V

    return-void
.end method
