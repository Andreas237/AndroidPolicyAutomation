.class public Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "OwnTheTripVideoTileViewHolderConfigurator.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/appscend/utilities/APSMediaPlayerTrackingEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$VideoPromoTileOnClickListener;
    }
.end annotation


# static fields
.field private static final COUNT_DOWN_STRING_FORMAT:Ljava/lang/String; = "%02d"

.field private static final SHORT_COUNT_DOWN_BACKGROUND_WIDTH_DIP:I = 0x64

.field private static final SLIDING_ANIMATION_DELAY:I = 0xfa0

.field private static final SLIDING_ANIMATION_DURATION:I = 0x3e8


# instance fields
.field private ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

.field private checkMark:Landroid/widget/ImageView;

.field private context:Landroid/content/Context;

.field private countDownBackground:Landroid/widget/ImageView;

.field private countDownText:Landroid/widget/TextView;

.field private handler:Landroid/os/Handler;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private ottImageView:Lcom/shopkick/app/logging/UserEventImageView;

.field private previewImage:Landroid/widget/ImageView;

.field private progressBar:Landroid/widget/ProgressBar;

.field private screenWidth:I

.field private tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field private verifyAgeClickListener:Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;

.field private videoController:Lcom/shopkick/app/video/VideoController;

.field private videoOverlay:Lcom/shopkick/app/widget/UserEventRelativeLayout;

.field private videoView:Landroid/support/constraint/ConstraintLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/video/VideoController;Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/url/URLDispatcher;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 69
    iput-object p2, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    .line 70
    iput-object p3, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    .line 71
    iput-object p1, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->context:Landroid/content/Context;

    .line 72
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->handler:Landroid/os/Handler;

    .line 73
    iput-object p4, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 74
    iput-object p5, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    const-string p1, "EventExitFullScreen"

    .line 75
    invoke-virtual {p4, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)Lcom/shopkick/app/url/URLDispatcher;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)Lcom/shopkick/app/video/VideoController;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)Landroid/widget/ImageView;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->previewImage:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)Landroid/widget/ProgressBar;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->progressBar:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)Landroid/content/Context;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->context:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$600(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)Landroid/widget/TextView;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->countDownText:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic access$700(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)Landroid/widget/ImageView;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->checkMark:Landroid/widget/ImageView;

    return-object p0
.end method

.method private updateVideoCountDown()V
    .locals 2

    .line 205
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$2;

    invoke-direct {v1, p0}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$2;-><init>(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public cancelImageLoadingForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 1

    const v0, 0x7f090806

    .line 271
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->cancelImageLoadingForImageView(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    const v0, 0x7f090807

    .line 272
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->cancelImageLoadingForImageView(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    return-void
.end method

.method public destroy()V
    .locals 2

    .line 246
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 248
    invoke-virtual {v0, p0}, Lcom/appscend/media/APSMediaPlayer;->removeTrackingEventListener(Lcom/appscend/utilities/APSMediaPlayerTrackingEventListener;)V

    .line 250
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v1, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/video/VideoController;->isVideoPlayCompleted(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 251
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->stopVideo()V

    .line 253
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    return-void
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c014c

    return v0
.end method

.method public isVideoPlaying()Z
    .locals 1

    .line 234
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->isVideoPlaying()Z

    move-result v0

    return v0
.end method

.method public loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 3

    if-nez p2, :cond_0

    return-void

    :cond_0
    const v0, 0x7f090806

    .line 263
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    .line 264
    iget-object v1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {v1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v1

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoThumbnailImageUrl:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    invoke-virtual {v1, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    const v0, 0x7f090807

    .line 265
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    .line 266
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p1

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 13

    .line 106
    iput-object p2, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 107
    invoke-virtual {p0, p1}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    .line 108
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    if-nez v0, :cond_0

    .line 109
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/video/VideoController;->setVideoPlayCompleted(Ljava/lang/String;)V

    .line 112
    :cond_0
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    const v1, 0x7f09080a

    if-nez v0, :cond_1

    .line 113
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 115
    :cond_1
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->brandName:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    const v2, 0x7f09009d

    if-nez v0, :cond_2

    .line 116
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->brandName:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 118
    :cond_2
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->descriptionText:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    const v3, 0x7f0901e7

    if-nez v0, :cond_3

    .line 119
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->descriptionText:Ljava/lang/String;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 121
    :cond_3
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->primaryTextColor:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 122
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "#"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->primaryTextColor:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 123
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "#"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->primaryTextColor:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 125
    :cond_4
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->secondaryTextColor:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 126
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "#"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->secondaryTextColor:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 128
    :cond_5
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->primaryBackgroundColor:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 129
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "#"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->primaryBackgroundColor:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 131
    :cond_6
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    const v1, 0x7f090805

    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v0, p2, v1}, Lcom/shopkick/app/video/VideoController;->setupVideo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/ViewGroup;)Z

    .line 132
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->isVideoStopped()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 133
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/video/VideoController;->loadVideo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    :cond_7
    const v0, 0x7f090806

    .line 135
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 136
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->isInPlayableConnection()Z

    move-result v0

    const v2, 0x7f09052d

    const v4, 0x7f0903aa

    const v5, 0x7f09052c

    const/16 v6, 0x8

    if-eqz v0, :cond_8

    .line 137
    invoke-virtual {p1, v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 138
    invoke-virtual {p1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 139
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 140
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->playVideo()V

    goto/16 :goto_1

    .line 141
    :cond_8
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->isInPlayableConnection()Z

    move-result v0

    if-nez v0, :cond_a

    .line 142
    invoke-virtual {p1, v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 143
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    if-nez v0, :cond_9

    move v0, v1

    goto :goto_0

    :cond_9
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 144
    :goto_0
    invoke-virtual {p1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v7

    iget-object v8, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v9, 0x7f0f0012

    const/4 v10, 0x1

    new-array v11, v10, [Ljava/lang/Object;

    .line 145
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    aput-object v12, v11, v1

    invoke-virtual {v8, v9, v0, v11}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 144
    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 146
    invoke-virtual {p1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 147
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    const/high16 v0, 0x41800000    # 16.0f

    .line 148
    iget-object v1, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-static {v10, v0, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    const/high16 v1, 0x41000000    # 8.0f

    .line 149
    iget-object v2, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    invoke-static {v10, v1, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    float-to-int v1, v1

    .line 150
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/support/constraint/ConstraintLayout$LayoutParams;

    .line 151
    invoke-virtual {v2, v0, v1, v0, v1}, Landroid/support/constraint/ConstraintLayout$LayoutParams;->setMargins(IIII)V

    .line 152
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 153
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->countDownBackground:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 154
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->countDownText:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 155
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->checkMark:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 156
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v6}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 157
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->stopVideo()V

    goto :goto_1

    .line 158
    :cond_a
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {v0, v3}, Lcom/shopkick/app/video/VideoController;->isVideoPlayCompleted(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 159
    invoke-virtual {p1, v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 160
    invoke-virtual {p1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 161
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 162
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->stopVideo()V

    .line 164
    :cond_b
    :goto_1
    new-instance v0, Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;

    iget-object v1, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    new-instance v2, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$VideoPromoTileOnClickListener;

    iget-object v3, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    .line 166
    invoke-virtual {p1, v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    invoke-direct {v2, v3, v4, p2}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$VideoPromoTileOnClickListener;-><init>(Lcom/shopkick/app/video/VideoController;Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    invoke-direct {v0, v1, p2, v2}, Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;-><init>(Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View$OnClickListener;)V

    iput-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->verifyAgeClickListener:Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;

    const v0, 0x7f09010f

    .line 167
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->verifyAgeClickListener:Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f090807

    .line 168
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    iget v2, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->screenWidth:I

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setX(F)V

    .line 169
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    new-instance v0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$1;

    invoke-direct {v0, p0, p2}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$1;-><init>(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;)Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;
    .locals 2

    .line 79
    invoke-super {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->onCreateViewHolder(Landroid/view/ViewGroup;)Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    move-result-object p1

    const v0, 0x7f090807

    .line 80
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/logging/UserEventImageView;

    iput-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->ottImageView:Lcom/shopkick/app/logging/UserEventImageView;

    const v0, 0x7f0907ff

    .line 81
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/ConstraintLayout;

    iput-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->videoView:Landroid/support/constraint/ConstraintLayout;

    const v0, 0x7f090806

    .line 82
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->previewImage:Landroid/widget/ImageView;

    const v0, 0x7f0901b3

    .line 83
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->countDownText:Landroid/widget/TextView;

    const v0, 0x7f09054a

    .line 84
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->progressBar:Landroid/widget/ProgressBar;

    const v0, 0x7f0901a5

    .line 85
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->countDownBackground:Landroid/widget/ImageView;

    const v0, 0x7f0900fe

    .line 86
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->checkMark:Landroid/widget/ImageView;

    const v0, 0x7f090805

    .line 87
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    iput-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->videoOverlay:Lcom/shopkick/app/widget/UserEventRelativeLayout;

    .line 88
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->screenWidth:I

    .line 89
    new-instance v0, Landroid/support/constraint/ConstraintLayout$LayoutParams;

    iget v1, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->screenWidth:I

    invoke-direct {v0, v1, v1}, Landroid/support/constraint/ConstraintLayout$LayoutParams;-><init>(II)V

    .line 90
    iget-object v1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 92
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 94
    invoke-virtual {v0, p0}, Lcom/appscend/media/APSMediaPlayer;->addTrackingEventListener(Lcom/appscend/utilities/APSMediaPlayerTrackingEventListener;)V

    :cond_0
    return-object p1
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 1
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

    .line 277
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const v0, 0x15bf20b3

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "EventExitFullScreen"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, -0x1

    :goto_1
    if-eqz p1, :cond_2

    goto :goto_2

    .line 279
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoController;->isVideoStopped()Z

    move-result p1

    if-nez p1, :cond_3

    .line 280
    iget-object p1, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object p2, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->videoOverlay:Lcom/shopkick/app/widget/UserEventRelativeLayout;

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/video/VideoController;->setupVideo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/ViewGroup;)Z

    .line 281
    iget-object p1, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoController;->playVideo()V

    :cond_3
    :goto_2
    return-void
.end method

.method public onTrackingEventReceived(Lcom/appscend/media/APSMediaTrackingEvents$MediaEventType;Landroid/os/Bundle;)V
    .locals 0

    .line 293
    iget-object p1, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoController;->getCurrentTileInfo()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    iget-object p2, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p2}, Lcom/shopkick/app/video/VideoController;->getCurrentTileInfo()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p2

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 295
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->updateVideoCountDown()V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public pauseVideo()V
    .locals 1

    .line 242
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->pauseVideo()V

    return-void
.end method

.method public playOTTVideo()V
    .locals 1

    .line 238
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->playVideo()V

    return-void
.end method

.method public startVideoCompleteAnimation()V
    .locals 12

    .line 178
    invoke-static {}, Lcom/appscend/media/APSMediaPlayer;->getInstance()Lcom/appscend/media/APSMediaPlayer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 180
    invoke-virtual {v0, p0}, Lcom/appscend/media/APSMediaPlayer;->removeTrackingEventListener(Lcom/appscend/utilities/APSMediaPlayerTrackingEventListener;)V

    .line 183
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->previewImage:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 184
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->progressBar:Landroid/widget/ProgressBar;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 185
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    if-nez v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 186
    :goto_0
    iget-object v2, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->countDownText:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0f0012

    const/4 v5, 0x1

    new-array v6, v5, [Ljava/lang/Object;

    .line 187
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v1

    invoke-virtual {v3, v4, v0, v6}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 186
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 188
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->countDownText:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 189
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->checkMark:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 190
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->countDownBackground:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/ConstraintLayout$LayoutParams;

    const/high16 v2, 0x42c80000    # 100.0f

    .line 191
    iget-object v3, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    invoke-static {v5, v2, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v2

    float-to-int v2, v2

    iput v2, v0, Landroid/support/constraint/ConstraintLayout$LayoutParams;->width:I

    .line 192
    iget-object v2, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->countDownBackground:Landroid/widget/ImageView;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 193
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->videoView:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v1}, Landroid/support/constraint/ConstraintLayout;->setClickable(Z)V

    .line 194
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 195
    iget-object v2, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->videoView:Landroid/support/constraint/ConstraintLayout;

    const-string/jumbo v3, "translationX"

    const/4 v4, 0x2

    new-array v6, v4, [F

    const/4 v7, 0x0

    aput v7, v6, v1

    iget v8, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->screenWidth:I

    neg-int v8, v8

    int-to-float v8, v8

    aput v8, v6, v5

    invoke-static {v2, v3, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v2

    const-wide/16 v8, 0x3e8

    .line 196
    invoke-virtual {v2, v8, v9}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 197
    iget-object v3, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->ottImageView:Lcom/shopkick/app/logging/UserEventImageView;

    const-string/jumbo v6, "translationX"

    new-array v10, v4, [F

    iget v11, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->screenWidth:I

    int-to-float v11, v11

    aput v11, v10, v1

    aput v7, v10, v5

    invoke-static {v3, v6, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v3

    .line 198
    invoke-virtual {v3, v8, v9}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 199
    new-array v4, v4, [Landroid/animation/Animator;

    aput-object v3, v4, v1

    aput-object v2, v4, v5

    invoke-virtual {v0, v4}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    const-wide/16 v1, 0xfa0

    .line 200
    invoke-virtual {v0, v1, v2}, Landroid/animation/AnimatorSet;->setStartDelay(J)V

    .line 201
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    return-void
.end method
