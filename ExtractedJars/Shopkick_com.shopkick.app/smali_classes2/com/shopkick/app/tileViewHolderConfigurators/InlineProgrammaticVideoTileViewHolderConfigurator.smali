.class public Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "InlineProgrammaticVideoTileViewHolderConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator$IReloadVideoButtonClickCallback;
    }
.end annotation


# static fields
.field public static FADEOUT_ANIM_DELAY_MS:I = 0x7d0

.field public static FADEOUT_ANIM_DURATION_MS:I = 0x190

.field private static FADEOUT_ANIM_OPACITY:F = 0.5f


# instance fields
.field private callbackRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator$IReloadVideoButtonClickCallback;",
            ">;"
        }
    .end annotation
.end field

.field private handler:Landroid/os/Handler;

.field private videoController:Lcom/shopkick/app/video/VideoController;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/app/video/VideoController;)V
    .locals 2

    .line 41
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 32
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->handler:Landroid/os/Handler;

    .line 42
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    return-void
.end method

.method public static synthetic lambda$onCreateViewHolder$59(Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;Landroid/view/View;)V
    .locals 0

    .line 123
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->toggleMute()V

    return-void
.end method

.method static synthetic lambda$setRetryButtonVisible$63(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 1

    const v0, 0x7f0905ba

    .line 268
    invoke-virtual {p0, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method static synthetic lambda$setTransparency$62(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 3

    const v0, 0x7f09080d

    .line 251
    invoke-virtual {p0, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    sget v1, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->FADEOUT_ANIM_OPACITY:F

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    sget v1, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->FADEOUT_ANIM_DURATION_MS:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    const v0, 0x7f0901b3

    .line 252
    invoke-virtual {p0, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    sget v1, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->FADEOUT_ANIM_OPACITY:F

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    sget v1, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->FADEOUT_ANIM_DURATION_MS:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    const v0, 0x7f09054c

    .line 253
    invoke-virtual {p0, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p0

    sget v0, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->FADEOUT_ANIM_OPACITY:F

    invoke-virtual {p0, v0}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p0

    sget v0, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->FADEOUT_ANIM_DURATION_MS:I

    int-to-long v0, v0

    invoke-virtual {p0, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void
.end method

.method public static synthetic lambda$setVideoCompleted$61(Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 0

    .line 246
    invoke-direct {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->setViewsCompleted(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    return-void
.end method

.method public static synthetic lambda$updateCountdown$60(Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 10

    const v0, 0x7f09054a

    .line 217
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    const v1, 0x7f0901b3

    .line 218
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object p1

    .line 220
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v1}, Lcom/shopkick/app/video/VideoController;->getCurrentPlaybackTime()I

    move-result v1

    .line 221
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v2}, Lcom/shopkick/app/video/VideoController;->getVideoDuration()I

    move-result v2

    if-lez v2, :cond_1

    const/4 v3, 0x0

    .line 224
    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 225
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 227
    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 229
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x18

    const/4 v6, 0x1

    if-lt v4, v5, :cond_0

    .line 230
    invoke-virtual {v0, v1, v6}, Landroid/widget/ProgressBar;->setProgress(IZ)V

    goto :goto_0

    .line 232
    :cond_0
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 234
    :goto_0
    invoke-virtual {p1}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f0f0047

    iget-object v5, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    .line 235
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    aput-object p2, v7, v3

    .line 236
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p2

    const-string v8, "%02d"

    new-array v9, v6, [Ljava/lang/Object;

    sub-int/2addr v2, v1

    div-int/lit16 v2, v2, 0x3e8

    int-to-float v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v9, v3

    invoke-static {p2, v8, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    aput-object p2, v7, v6

    .line 234
    invoke-virtual {v0, v4, v5, v7}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_1
    const/16 p2, 0x8

    .line 239
    invoke-virtual {v0, p2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 240
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method public static synthetic lambda$zjp3BgofEhbndGMBDKBmAPJznt4(Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->reloadVideo(Landroid/view/View;)V

    return-void
.end method

.method private reloadVideo(Landroid/view/View;)V
    .locals 1

    const/16 v0, 0x8

    .line 101
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 103
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->callbackRef:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_0

    .line 104
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator$IReloadVideoButtonClickCallback;

    if-eqz p1, :cond_0

    .line 106
    invoke-interface {p1}, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator$IReloadVideoButtonClickCallback;->onReloadVideoButtonClicked()V

    :cond_0
    return-void
.end method

.method private setViewsCompleted(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    :cond_0
    const v0, 0x7f09054a

    .line 203
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f0901b3

    .line 204
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    const v0, 0x7f09054c

    .line 205
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f0907fd

    .line 206
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f090802

    .line 207
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0600c6

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    const v0, 0x7f09080d

    .line 208
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    const v0, 0x7f080313

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    return-void
.end method

.method private setupLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 5

    .line 47
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    const/16 v1, 0x179

    .line 48
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    .line 49
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVideoId(Ljava/lang/String;)V

    .line 50
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 51
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoRequestId:Ljava/lang/String;

    invoke-static {v1}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 52
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoRequestId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setRequestId(Ljava/lang/String;)V

    .line 55
    :cond_0
    new-instance v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v1}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 56
    invoke-virtual {p0, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 57
    iget-object v2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 58
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 59
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->trackingUrl:Ljava/lang/String;

    iput-object v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->trackingUrl:Ljava/lang/String;

    .line 60
    invoke-static {}, Lcom/shopkick/app/util/FeatureFlagHelper;->isMOATLookbookEnabled()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    .line 61
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iput-object v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    .line 62
    iput-boolean v3, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->useZMoatIID:Z

    .line 65
    :cond_1
    iget-object v2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    check-cast v2, Lcom/shopkick/app/logging/IUserEventView;

    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-interface {v2, v0, v4, v1}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 70
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0x1c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v4, 0x4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v1, v2, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 71
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVideoId(Ljava/lang/String;)V

    .line 72
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 73
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoRequestId:Ljava/lang/String;

    invoke-static {v2}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 74
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoRequestId:Ljava/lang/String;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setRequestId(Ljava/lang/String;)V

    .line 77
    :cond_2
    new-instance p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {p2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 78
    invoke-virtual {p0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 79
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v0, p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 80
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 81
    iput-boolean v3, p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    const v0, 0x7f0905ba

    .line 83
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/logging/IUserEventView;

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-interface {p1, v1, v0, p2}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method

.method private toggleMute()V
    .locals 5

    .line 87
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->isMuted()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    .line 88
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v1}, Lcom/shopkick/app/video/VideoController;->getCurrentTileInfo()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v1

    .line 89
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v2, v0}, Lcom/shopkick/app/video/VideoController;->setMute(Z)V

    .line 93
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v3, 0x179

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    if-eqz v1, :cond_0

    .line 94
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v2, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVideoId(Ljava/lang/String;)V

    .line 95
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setIsVideoMuted(Ljava/lang/Boolean;)V

    .line 97
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method


# virtual methods
.method public clearHandler()V
    .locals 2

    .line 212
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->handler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c00e8

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 11

    .line 133
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    const/4 v0, 0x0

    .line 136
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isDisabled:Ljava/lang/Boolean;

    .line 139
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/video/VideoController;->setVideoPlayNeverCompleted(Ljava/lang/String;)V

    const v1, 0x7f09080d

    .line 142
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    const/high16 v3, 0x3f800000    # 1.0f

    .line 143
    invoke-virtual {v2, v3}, Landroid/view/View;->setAlpha(F)V

    .line 144
    iget-object v4, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0600c9

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/view/View;->setBackgroundColor(I)V

    const v2, 0x7f090802

    .line 147
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v2

    const v4, 0x7f090800

    .line 148
    invoke-virtual {p1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    const v5, 0x7f0907fd

    .line 149
    invoke-virtual {p1, v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v5

    .line 150
    iget-object v6, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-static {v6}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v6

    const/16 v7, 0x8

    if-eqz v6, :cond_1

    .line 151
    invoke-virtual {v4, v0}, Landroid/view/View;->setVisibility(I)V

    .line 152
    invoke-virtual {v2}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v6, 0x7f0f0012

    iget-object v8, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    .line 153
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    const/4 v9, 0x1

    new-array v9, v9, [Ljava/lang/Object;

    iget-object v10, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    aput-object v10, v9, v0

    invoke-virtual {v4, v6, v8, v9}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 152
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 154
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 157
    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v6, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {v4, v6}, Lcom/shopkick/app/video/VideoController;->isVideoPlayCompleted(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoCompleted:Ljava/lang/Boolean;

    invoke-static {v4}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 158
    invoke-virtual {v5, v7}, Landroid/view/View;->setVisibility(I)V

    .line 159
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f060120

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 161
    :cond_0
    invoke-virtual {v5, v0}, Landroid/view/View;->setVisibility(I)V

    .line 162
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f0600c6

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 166
    :cond_1
    invoke-virtual {v4, v7}, Landroid/view/View;->setVisibility(I)V

    .line 167
    invoke-virtual {v5, v7}, Landroid/view/View;->setVisibility(I)V

    .line 168
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    const v0, 0x7f0901b3

    .line 172
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    const v2, 0x7f09054a

    .line 173
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ProgressBar;

    const v4, 0x7f09054c

    .line 174
    invoke-virtual {p1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    const/16 v5, 0x64

    .line 176
    invoke-virtual {v2, v5}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 177
    invoke-virtual {v2, v5}, Landroid/widget/ProgressBar;->setProgress(I)V

    const/4 v5, 0x4

    .line 178
    invoke-virtual {v2, v5}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 179
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setAlpha(F)V

    const/4 v2, 0x0

    .line 180
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 181
    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setVisibility(I)V

    .line 182
    invoke-virtual {v4, v3}, Landroid/view/View;->setAlpha(F)V

    .line 183
    invoke-virtual {v4, v7}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f0905ba

    .line 186
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 188
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/video/VideoController;->isVideoPlayCompleted(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoCompleted:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 190
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v0, p2, v1}, Lcom/shopkick/app/video/VideoController;->setupVideo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/ViewGroup;)Z

    .line 191
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/video/VideoController;->loadVideo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    goto :goto_1

    .line 193
    :cond_2
    invoke-direct {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->setViewsCompleted(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    .line 197
    :goto_1
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->setupLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;)Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;
    .locals 2

    .line 118
    invoke-super {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->onCreateViewHolder(Landroid/view/ViewGroup;)Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    move-result-object p1

    .line 119
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    const v0, 0x7f09010f

    .line 122
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$InlineProgrammaticVideoTileViewHolderConfigurator$YrHWKFoliBMQax6534bG-25S8dk;

    invoke-direct {v1, p0}, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$InlineProgrammaticVideoTileViewHolderConfigurator$YrHWKFoliBMQax6534bG-25S8dk;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;)V

    .line 123
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0905ba

    .line 126
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$InlineProgrammaticVideoTileViewHolderConfigurator$zjp3BgofEhbndGMBDKBmAPJznt4;

    invoke-direct {v1, p0}, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$InlineProgrammaticVideoTileViewHolderConfigurator$zjp3BgofEhbndGMBDKBmAPJznt4;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p1
.end method

.method public setReloadVideoButtonCallback(Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator$IReloadVideoButtonClickCallback;)V
    .locals 1

    .line 258
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->callbackRef:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public setRetryButtonVisible(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 3

    .line 263
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x1c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 264
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVideoId(Ljava/lang/String;)V

    .line 265
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 266
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 268
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->handler:Landroid/os/Handler;

    new-instance v0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$InlineProgrammaticVideoTileViewHolderConfigurator$FAbIVlizp6y4KBFe88vqbB-4WHM;

    invoke-direct {v0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$InlineProgrammaticVideoTileViewHolderConfigurator$FAbIVlizp6y4KBFe88vqbB-4WHM;-><init>(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public setTransparency(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 4

    .line 250
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$InlineProgrammaticVideoTileViewHolderConfigurator$oUBVaGb7Gia7RQUR7y7xNrBSeWA;

    invoke-direct {v1, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$InlineProgrammaticVideoTileViewHolderConfigurator$oUBVaGb7Gia7RQUR7y7xNrBSeWA;-><init>(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    sget p1, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->FADEOUT_ANIM_DELAY_MS:I

    int-to-long v2, p1

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public setVideoCompleted(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 2

    .line 246
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$InlineProgrammaticVideoTileViewHolderConfigurator$92mnyH_xnbC1Hhk7ogqj4h47V1U;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$InlineProgrammaticVideoTileViewHolderConfigurator$92mnyH_xnbC1Hhk7ogqj4h47V1U;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public updateCountdown(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 2

    .line 216
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$InlineProgrammaticVideoTileViewHolderConfigurator$guegVGlLjyabRF03CPNZ3GsGQsg;

    invoke-direct {v1, p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$InlineProgrammaticVideoTileViewHolderConfigurator$guegVGlLjyabRF03CPNZ3GsGQsg;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
