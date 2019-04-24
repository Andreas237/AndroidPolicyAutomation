.class public Lcom/shopkick/app/video/InlineProgrammaticVideoController;
.super Ljava/lang/Object;
.source "InlineProgrammaticVideoController.java"

# interfaces
.implements Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator$IReloadVideoButtonClickCallback;
.implements Lcom/appscend/utilities/APSMediaPlayerTrackingEventListener;


# static fields
.field private static TOOLTIP_HEIGHT_DP:I = 0x28


# instance fields
.field private adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

.field private bottomTooltip:Landroid/view/View;

.field private handler:Landroid/os/Handler;

.field private hideBottomAnimator:Landroid/animation/ObjectAnimator;

.field private hideTopAnimator:Landroid/animation/ObjectAnimator;

.field private isVideoPaused:Z

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

.field private showBottomAnimator:Landroid/animation/ObjectAnimator;

.field private showTopAnimator:Landroid/animation/ObjectAnimator;

.field private tooltipHeight:F

.field private topTooltip:Landroid/view/View;

.field private videoConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;

.field private videoController:Lcom/shopkick/app/video/VideoController;

.field private videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private videoViewHeight:I

.field private videoViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/video/VideoController;Landroid/view/View;Landroid/view/View;)V
    .locals 1

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 46
    iput-boolean v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->isVideoPaused:Z

    const/high16 v0, -0x80000000

    .line 49
    iput v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoViewHeight:I

    .line 62
    iput-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 63
    iput-object p2, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoController:Lcom/shopkick/app/video/VideoController;

    .line 65
    iput-object p3, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->topTooltip:Landroid/view/View;

    .line 66
    iput-object p4, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->bottomTooltip:Landroid/view/View;

    .line 67
    sget p2, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->TOOLTIP_HEIGHT_DP:I

    int-to-float p2, p2

    invoke-virtual {p3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p3

    const/4 p4, 0x1

    invoke-static {p4, p2, p3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p2

    iput p2, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->tooltipHeight:F

    .line 69
    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p3

    invoke-direct {p2, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->handler:Landroid/os/Handler;

    .line 71
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object p2

    invoke-virtual {p2, p0}, Lcom/appscend/media/APSMediaPlayer;->addTrackingEventListener(Lcom/appscend/utilities/APSMediaPlayerTrackingEventListener;)V

    const-string p2, "EventAutoplaySettingChanged"

    .line 72
    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p2, "EventVideoAwardRequestCompleted"

    .line 73
    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/video/InlineProgrammaticVideoController;)Landroid/os/Handler;
    .locals 0

    .line 30
    iget-object p0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->handler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/video/InlineProgrammaticVideoController;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;
    .locals 0

    .line 30
    iget-object p0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    return-object p0
.end method

.method private getVideoHeight(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 2

    const/high16 v0, -0x80000000

    if-nez p1, :cond_0

    .line 182
    iput v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoViewHeight:I

    goto :goto_0

    :cond_0
    const v1, 0x7f09080d

    .line 184
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 185
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    :cond_1
    iput v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoViewHeight:I

    :goto_0
    return-void
.end method

.method private hideTooltip()V
    .locals 7

    .line 163
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->showTopAnimator:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 164
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->showTopAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->cancel()V

    .line 166
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->showBottomAnimator:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 167
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->showBottomAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->cancel()V

    .line 170
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->hideTopAnimator:Landroid/animation/ObjectAnimator;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->isRunning()Z

    move-result v0

    if-nez v0, :cond_3

    .line 171
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->topTooltip:Landroid/view/View;

    const-string/jumbo v4, "translationY"

    new-array v5, v3, [F

    invoke-virtual {v0}, Landroid/view/View;->getTranslationY()F

    move-result v6

    aput v6, v5, v2

    iget v6, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->tooltipHeight:F

    neg-float v6, v6

    aput v6, v5, v1

    invoke-static {v0, v4, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->hideTopAnimator:Landroid/animation/ObjectAnimator;

    .line 172
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->hideTopAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 174
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->hideBottomAnimator:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->isRunning()Z

    move-result v0

    if-nez v0, :cond_5

    .line 175
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->bottomTooltip:Landroid/view/View;

    const-string/jumbo v4, "translationY"

    new-array v3, v3, [F

    invoke-virtual {v0}, Landroid/view/View;->getTranslationY()F

    move-result v5

    aput v5, v3, v2

    iget v2, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->tooltipHeight:F

    aput v2, v3, v1

    invoke-static {v0, v4, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->hideBottomAnimator:Landroid/animation/ObjectAnimator;

    .line 176
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->hideBottomAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    :cond_5
    return-void
.end method

.method public static synthetic lambda$checkAvailableVideo$56(Lcom/shopkick/app/video/InlineProgrammaticVideoController;)V
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->maybeStartVideoTile(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V

    return-void
.end method

.method public static synthetic lambda$onEvent$58(Lcom/shopkick/app/video/InlineProgrammaticVideoController;)V
    .locals 1

    .line 406
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz v0, :cond_0

    .line 407
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->removeInlineProgrammaticVideoSection(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private removeInlineProgrammaticVideoSection(Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x0

    .line 223
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getItemCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 224
    iget-object v1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getItem(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v1

    const/16 v2, 0x56

    .line 225
    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v2, v3, :cond_0

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/high16 v0, -0x80000000

    :goto_1
    if-lez v0, :cond_2

    .line 232
    iget-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->removeTilesAtPosition(II)V

    .line 236
    iget-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getItemAnimator()Landroid/support/v7/widget/RecyclerView$ItemAnimator;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getItemCount()I

    move-result p1

    if-ge v0, p1, :cond_2

    .line 237
    iget-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getItemAnimator()Landroid/support/v7/widget/RecyclerView$ItemAnimator;

    move-result-object p1

    new-instance v1, Lcom/shopkick/app/video/InlineProgrammaticVideoController$1;

    invoke-direct {v1, p0, v0}, Lcom/shopkick/app/video/InlineProgrammaticVideoController$1;-><init>(Lcom/shopkick/app/video/InlineProgrammaticVideoController;I)V

    invoke-virtual {p1, v1}, Landroid/support/v7/widget/RecyclerView$ItemAnimator;->isRunning(Landroid/support/v7/widget/RecyclerView$ItemAnimator$ItemAnimatorFinishedListener;)Z

    :cond_2
    return-void
.end method

.method private showBottomTooltip()V
    .locals 5

    .line 148
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->showBottomAnimator:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 149
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->hideTopAnimator:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 150
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->hideTopAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->cancel()V

    .line 152
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->hideBottomAnimator:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 153
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->hideBottomAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->cancel()V

    .line 156
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz v0, :cond_4

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isSaved:Ljava/lang/Boolean;

    if-nez v0, :cond_3

    goto :goto_0

    .line 158
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->bottomTooltip:Landroid/view/View;

    const-string/jumbo v1, "translationY"

    const/4 v2, 0x2

    new-array v2, v2, [F

    const/4 v3, 0x0

    invoke-virtual {v0}, Landroid/view/View;->getTranslationY()F

    move-result v4

    aput v4, v2, v3

    const/4 v3, 0x1

    const/4 v4, 0x0

    aput v4, v2, v3

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->showBottomAnimator:Landroid/animation/ObjectAnimator;

    .line 159
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->showBottomAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    return-void

    :cond_4
    :goto_0
    return-void
.end method

.method private showTopTooltip()V
    .locals 5

    .line 132
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->showTopAnimator:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 133
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->hideTopAnimator:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 134
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->hideTopAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->cancel()V

    .line 136
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->hideBottomAnimator:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 137
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->hideBottomAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->cancel()V

    .line 140
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz v0, :cond_4

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isSaved:Ljava/lang/Boolean;

    if-nez v0, :cond_3

    goto :goto_0

    .line 142
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->topTooltip:Landroid/view/View;

    const-string/jumbo v1, "translationY"

    const/4 v2, 0x2

    new-array v2, v2, [F

    const/4 v3, 0x0

    invoke-virtual {v0}, Landroid/view/View;->getTranslationY()F

    move-result v4

    aput v4, v2, v3

    const/4 v3, 0x1

    const/4 v4, 0x0

    aput v4, v2, v3

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->showTopAnimator:Landroid/animation/ObjectAnimator;

    .line 143
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->showTopAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    return-void

    :cond_4
    :goto_0
    return-void
.end method


# virtual methods
.method public checkAvailableVideo()V
    .locals 2

    .line 102
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v1, Lcom/shopkick/app/video/-$$Lambda$InlineProgrammaticVideoController$RWwYbNwUA7oHBuTwGBnO-UMtyiU;

    invoke-direct {v1, p0}, Lcom/shopkick/app/video/-$$Lambda$InlineProgrammaticVideoController$RWwYbNwUA7oHBuTwGBnO-UMtyiU;-><init>(Lcom/shopkick/app/video/InlineProgrammaticVideoController;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public destroy()V
    .locals 2

    .line 77
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;

    if-eqz v0, :cond_0

    .line 78
    invoke-virtual {v0}, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->clearHandler()V

    .line 81
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->handler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 82
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->showTopAnimator:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 83
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->showTopAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->cancel()V

    .line 85
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->showBottomAnimator:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 86
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->showBottomAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->cancel()V

    .line 88
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->hideTopAnimator:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 89
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->hideTopAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->cancel()V

    .line 91
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->hideBottomAnimator:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 92
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->hideBottomAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->cancel()V

    .line 95
    :cond_4
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/appscend/media/APSMediaPlayer;->removeTrackingEventListener(Lcom/appscend/utilities/APSMediaPlayerTrackingEventListener;)V

    .line 96
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 97
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->removeModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    return-void
.end method

.method public maybeStartVideoTile(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V
    .locals 6

    if-nez p1, :cond_0

    return-void

    .line 256
    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->isHardwareAccelerated()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 258
    :cond_1
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findFirstVisibleItemPosition()I

    move-result v0

    .line 259
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findLastVisibleItemPosition()I

    move-result v1

    .line 261
    iget-object v2, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    if-eqz v2, :cond_11

    if-ltz v0, :cond_11

    if-ltz v1, :cond_11

    invoke-virtual {v2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getItemCount()I

    move-result v2

    if-lt v1, v2, :cond_2

    goto/16 :goto_5

    .line 266
    :cond_2
    iget-object v2, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v2}, Lcom/shopkick/app/video/VideoController;->getLastConfiguredVideoId()Ljava/lang/String;

    move-result-object v2

    .line 267
    iget-object v3, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v3, v2}, Lcom/shopkick/app/video/VideoController;->isVideoPlayCompleted(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v3, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v3, v2}, Lcom/shopkick/app/video/VideoController;->isVideoOnProcessingAward(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 270
    :cond_3
    iget-object v3, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v3}, Lcom/shopkick/app/video/VideoController;->stopVideo()V

    .line 271
    iget-object v3, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v3, v2}, Lcom/shopkick/app/video/VideoController;->isVideoOnProcessingAward(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    return-void

    :cond_4
    const/4 v2, 0x0

    .line 278
    iput-object v2, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    const/4 v2, -0x1

    move v3, v0

    :goto_0
    if-gt v3, v1, :cond_6

    const/16 v4, 0x56

    .line 281
    iget-object v5, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v5, v3}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getItemViewType(I)I

    move-result v5

    if-ne v4, v5, :cond_5

    .line 283
    iget-object v2, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v2, v3}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getItem(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v2

    iput-object v2, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move v2, v3

    goto :goto_1

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 289
    :cond_6
    :goto_1
    iget-object v3, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz v3, :cond_7

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoCompleted:Ljava/lang/Boolean;

    invoke-static {v3}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    return-void

    .line 292
    :cond_7
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findViewHolderForAdapterPosition(I)Landroid/support/v7/widget/RecyclerView$ViewHolder;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    iput-object v3, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    .line 293
    iget v3, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoViewHeight:I

    if-gtz v3, :cond_8

    iget-object v3, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    if-eqz v3, :cond_8

    invoke-direct {p0, v3}, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->getVideoHeight(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    .line 296
    :cond_8
    iget-object v3, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v3}, Lcom/shopkick/app/video/VideoController;->isInPlayableConnection()Z

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_a

    .line 297
    invoke-direct {p0}, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->hideTooltip()V

    .line 299
    iget-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz p1, :cond_9

    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;

    if-eqz v0, :cond_9

    .line 300
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isDisabled:Ljava/lang/Boolean;

    .line 301
    iget-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoController;->stopVideo()V

    .line 302
    iget-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;

    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    iget-object v1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->updateCountdown(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 303
    iget-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;

    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    iget-object v1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->setRetryButtonVisible(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    :cond_9
    return-void

    .line 309
    :cond_a
    iget-object v3, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    if-eqz v3, :cond_10

    iget-object v3, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz v3, :cond_10

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-static {v3}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_10

    iget-object v3, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v5, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    .line 310
    invoke-virtual {v3, v5}, Lcom/shopkick/app/video/VideoController;->isVideoPlayCompleted(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_10

    iget v3, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoViewHeight:I

    if-gtz v3, :cond_b

    goto/16 :goto_4

    .line 316
    :cond_b
    iget-object v3, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    iget-object v3, v3, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    if-ne v2, v0, :cond_d

    .line 319
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v0

    neg-int v0, v0

    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getPaddingTop()I

    move-result p1

    add-int/2addr v0, p1

    .line 320
    iget p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoViewHeight:I

    if-ge v0, p1, :cond_c

    .line 321
    invoke-direct {p0}, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->showTopTooltip()V

    goto :goto_2

    .line 323
    :cond_c
    invoke-direct {p0}, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->hideTooltip()V

    .line 327
    :goto_2
    iget-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoController;->pauseVideo()V

    goto :goto_3

    :cond_d
    if-ne v2, v1, :cond_f

    .line 331
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getHeight()I

    move-result v0

    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getPaddingTop()I

    move-result p1

    add-int/2addr v0, p1

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result p1

    sub-int/2addr v0, p1

    .line 332
    iget p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoViewHeight:I

    if-lt v0, p1, :cond_e

    .line 334
    iget-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isSaved:Ljava/lang/Boolean;

    .line 335
    iget-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoController;->playVideo()V

    .line 336
    invoke-direct {p0}, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->hideTooltip()V

    goto :goto_3

    .line 339
    :cond_e
    iget-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoController;->pauseVideo()V

    .line 340
    invoke-direct {p0}, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->showBottomTooltip()V

    goto :goto_3

    .line 344
    :cond_f
    iget-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const v2, 0x7f09080d

    .line 345
    invoke-virtual {v1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    .line 344
    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/video/VideoController;->setupVideo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/ViewGroup;)Z

    .line 347
    iget-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isSaved:Ljava/lang/Boolean;

    .line 348
    iget-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoController;->playVideo()V

    .line 349
    invoke-direct {p0}, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->hideTooltip()V

    :goto_3
    return-void

    .line 311
    :cond_10
    :goto_4
    iget-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoController;->pauseVideo()V

    .line 312
    invoke-direct {p0}, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->hideTooltip()V

    return-void

    :cond_11
    :goto_5
    return-void
.end method

.method public onAttach(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V
    .locals 0

    .line 355
    iput-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 385
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x6bae06a8

    if-eq v0, v1, :cond_1

    const v1, -0x151ffa5f

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "EventAutoplaySettingChanged"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    const-string v0, "EventVideoAwardRequestCompleted"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto :goto_3

    :pswitch_0
    if-nez p2, :cond_3

    return-void

    :cond_3
    const-string p1, "ParamVideoId"

    .line 396
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 397
    iget-object p2, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz p2, :cond_6

    if-eqz p1, :cond_6

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_2

    .line 400
    :cond_4
    iget-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    if-eqz p1, :cond_5

    .line 401
    iget-object p2, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->setTransparency(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    .line 405
    :cond_5
    iget-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->handler:Landroid/os/Handler;

    new-instance p2, Lcom/shopkick/app/video/-$$Lambda$InlineProgrammaticVideoController$yfbBeCz32UF4BCNDQWg_-XDg20M;

    invoke-direct {p2, p0}, Lcom/shopkick/app/video/-$$Lambda$InlineProgrammaticVideoController$yfbBeCz32UF4BCNDQWg_-XDg20M;-><init>(Lcom/shopkick/app/video/InlineProgrammaticVideoController;)V

    sget v0, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->FADEOUT_ANIM_DELAY_MS:I

    sget v1, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->FADEOUT_ANIM_DURATION_MS:I

    add-int/2addr v0, v1

    int-to-long v0, v0

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_3

    :cond_6
    :goto_2
    return-void

    .line 387
    :pswitch_1
    iget-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoController;->isInPlayableConnection()Z

    move-result p1

    if-nez p1, :cond_7

    .line 388
    invoke-direct {p0}, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->hideTooltip()V

    .line 389
    invoke-virtual {p0}, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->removeAllInlineProgrammaticVideoSections()V

    :cond_7
    :goto_3
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onItemActive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public onItemInactive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public onRefreshScreen()V
    .locals 1

    .line 117
    invoke-direct {p0}, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->hideTooltip()V

    const/4 v0, 0x0

    .line 119
    iput-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 120
    iput-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    .line 121
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;

    if-eqz v0, :cond_0

    .line 122
    invoke-virtual {v0}, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->clearHandler()V

    :cond_0
    return-void
.end method

.method public onReloadVideoButtonClicked()V
    .locals 2

    .line 420
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    .line 423
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isDisabled:Ljava/lang/Boolean;

    .line 424
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/video/VideoController;->loadVideo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 425
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->maybeStartVideoTile(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public onScrollStateChanged(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;I)V
    .locals 0

    return-void
.end method

.method public onScrolled(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;II)V
    .locals 0

    .line 360
    invoke-virtual {p0, p1}, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->maybeStartVideoTile(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V

    return-void
.end method

.method public onTrackingEventReceived(Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;Landroid/os/Bundle;)V
    .locals 1

    .line 434
    iget-object p2, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;

    if-eqz p2, :cond_6

    iget-object p2, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    if-eqz p2, :cond_6

    iget-object p2, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz p2, :cond_6

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    if-nez p2, :cond_0

    goto/16 :goto_3

    .line 436
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p2}, Lcom/shopkick/app/video/VideoController;->getCurrentTileInfo()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p2

    if-eqz p2, :cond_5

    iget-object p2, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->getCurrentTileInfo()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_2

    .line 438
    :cond_1
    iget-object p2, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isDisabled:Ljava/lang/Boolean;

    invoke-static {p2}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    iget-object p2, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoCompleted:Ljava/lang/Boolean;

    invoke-static {p2}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_1

    .line 440
    :cond_2
    sget-object p2, Lcom/shopkick/app/video/InlineProgrammaticVideoController$2;->$SwitchMap$com$appscend$media$APSMediaTrackingEvents$MediaEventType:[I

    invoke-virtual {p1}, Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x1

    packed-switch p1, :pswitch_data_0

    .line 457
    iget-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;

    iget-object p2, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->updateCountdown(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    goto :goto_0

    .line 450
    :pswitch_0
    iget-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoController;->isVideoShowing()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 451
    iget-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoCompleted:Ljava/lang/Boolean;

    .line 452
    iget-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;

    iget-object p2, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->setVideoCompleted(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    goto :goto_0

    .line 442
    :pswitch_1
    iget-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isDisabled:Ljava/lang/Boolean;

    .line 443
    iget-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoController;->stopVideo()V

    .line 444
    iget-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;

    iget-object p2, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->setRetryButtonVisible(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    :cond_3
    :goto_0
    return-void

    :cond_4
    :goto_1
    return-void

    :cond_5
    :goto_2
    return-void

    :cond_6
    :goto_3
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onViewRecycled(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 0

    return-void
.end method

.method public removeAllInlineProgrammaticVideoSections()V
    .locals 5

    .line 195
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoController:Lcom/shopkick/app/video/VideoController;

    .line 196
    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->getCurrentTileInfo()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    iget-object v1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoController:Lcom/shopkick/app/video/VideoController;

    .line 197
    invoke-virtual {v1}, Lcom/shopkick/app/video/VideoController;->getCurrentTileInfo()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v1

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 198
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->stopVideo()V

    .line 202
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 203
    iget-object v1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getItemCount()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    :goto_0
    if-ltz v1, :cond_2

    const/16 v3, 0x56

    .line 204
    iget-object v4, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v4, v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getItemViewType(I)I

    move-result v4

    if-ne v3, v4, :cond_1

    .line 205
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 210
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-lez v1, :cond_3

    .line 213
    iget-object v3, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    add-int/lit8 v1, v1, -0x1

    const/4 v4, 0x2

    invoke-virtual {v3, v1, v4}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->removeTilesAtPosition(II)V

    goto :goto_1

    .line 215
    :cond_3
    iget-object v3, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v3, v1, v2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->removeTilesAtPosition(II)V

    goto :goto_1

    :cond_4
    return-void
.end method

.method public setAdapter(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;)V
    .locals 1

    .line 106
    iput-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    if-eqz p1, :cond_0

    const/16 v0, 0x56

    .line 108
    invoke-virtual {p1, v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;

    iput-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;

    .line 109
    iget-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->setReloadVideoButtonCallback(Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator$IReloadVideoButtonClickCallback;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 111
    iput-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->videoConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;

    :goto_0
    return-void
.end method
