.class public Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "SelectedRewardTileViewHolderConfigurator.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;
    }
.end annotation


# static fields
.field private static final CARD_HEIGHT:I = 0x32

.field private static final CARD_WIDTH:I = 0x4e

.field private static final CORNER_RADIUS:I = 0xa

.field private static final KICK_NUMBER_3DIGIT_THRESHOLD:I = 0x3e8

.field private static final KICK_NUMBER_4DIGIT_THRESHOLD:I = 0x2710

.field private static final KICK_NUMBER_5DIGIT_THRESHOLD:I = 0x186a0

.field private static final LAST_WIDGET_ANIMATION_TS:I = 0x1388


# instance fields
.field private animatorSet:Landroid/animation/AnimatorSet;

.field private bottomButton:Lcom/shopkick/app/widget/SKButton;

.field private circleGlowImageView:Landroid/widget/ImageView;

.field private context:Landroid/content/Context;

.field private didInitialize:Z

.field private giftCardDenominationLabel:Lcom/shopkick/app/widget/SKTextView;

.field private giftCardImageView:Landroid/widget/ImageView;

.field private kickAmountLabel:Lcom/shopkick/app/widget/SKTextView;

.field private kickAmountTitleLabel:Lcom/shopkick/app/widget/SKTextView;

.field private kicksNeededLabel:Lcom/shopkick/app/widget/SKTextView;

.field private kicksNeededTitleLabel:Lcom/shopkick/app/widget/SKTextView;

.field private lastUpdateUITs:J

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private profileInfo:Lcom/shopkick/app/application/ProfileInfo;

.field private profilePoints:Lcom/shopkick/app/points/ProfilePoints;

.field private progressBar:Lcom/shopkick/app/view/RoundedEdgeCircularProgressBar;

.field private rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

.field private tileState:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

.field private urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ScreenGlobals;Landroid/content/Context;)V
    .locals 1
    .param p1    # Lcom/shopkick/app/application/ScreenGlobals;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 97
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 98
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    .line 102
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    .line 103
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    .line 104
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    .line 105
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 107
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->context:Landroid/content/Context;

    .line 109
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "UserAccountIdChangedEvent"

    const/4 v0, 0x0

    invoke-virtual {p1, p0, p2, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 116
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "ProfilePointsChangedEvent"

    invoke-virtual {p1, p0, p2, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 117
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "rewards_reload_completed"

    invoke-virtual {p1, p0, p2, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 118
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "SelectedRewardIdUpdated"

    invoke-virtual {p1, p0, p2, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;)Landroid/widget/ImageView;
    .locals 0

    .line 59
    iget-object p0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->giftCardImageView:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->cropGiftCardBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$1000(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;)Lcom/shopkick/app/application/ProfileInfo;
    .locals 0

    .line 59
    iget-object p0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;Landroid/graphics/Bitmap;)Lcom/shopkick/app/drawables/RoundedImageDrawable;
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->getRoundedImageDrawable(Landroid/graphics/Bitmap;)Lcom/shopkick/app/drawables/RoundedImageDrawable;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;)Lcom/shopkick/app/widget/SKTextView;
    .locals 0

    .line 59
    iget-object p0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->kickAmountTitleLabel:Lcom/shopkick/app/widget/SKTextView;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;)Lcom/shopkick/app/widget/SKTextView;
    .locals 0

    .line 59
    iget-object p0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->kickAmountLabel:Lcom/shopkick/app/widget/SKTextView;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;)Lcom/shopkick/app/widget/SKButton;
    .locals 0

    .line 59
    iget-object p0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->bottomButton:Lcom/shopkick/app/widget/SKButton;

    return-object p0
.end method

.method static synthetic access$600(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;)Landroid/content/Context;
    .locals 0

    .line 59
    iget-object p0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->context:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$700(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->logWidgetTap()V

    return-void
.end method

.method static synthetic access$800(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;)Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;
    .locals 0

    .line 59
    iget-object p0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->tileState:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

    return-object p0
.end method

.method static synthetic access$900(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;)Lcom/shopkick/app/url/URLDispatcherFactory;
    .locals 0

    .line 59
    iget-object p0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    return-object p0
.end method

.method private cropGiftCardBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 5
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 196
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const v1, 0x3d8ccccd    # 0.06875f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x3e600000    # 0.21875f

    mul-float/2addr v1, v2

    float-to-int v1, v1

    .line 197
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    const v3, 0x3f5ccccd    # 0.8625f

    mul-float/2addr v2, v3

    float-to-int v2, v2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-float v3, v3

    const/high16 v4, 0x3f100000    # 0.5625f

    mul-float/2addr v3, v4

    float-to-int v3, v3

    .line 196
    invoke-static {p1, v0, v1, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method private endAnimations()V
    .locals 1

    .line 260
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->animatorSet:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 261
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->animatorSet:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->end()V

    :cond_0
    return-void
.end method

.method private fadeInAlphaAnimator(Landroid/view/View;)Landroid/animation/Animator;
    .locals 2

    .line 393
    sget-object v0, Landroid/view/View;->ALPHA:Landroid/util/Property;

    const/4 v1, 0x2

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    invoke-static {p1, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    return-object p1

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private fadeOutAlphaAnimator(Landroid/view/View;)Landroid/animation/Animator;
    .locals 2

    .line 397
    sget-object v0, Landroid/view/View;->ALPHA:Landroid/util/Property;

    const/4 v1, 0x2

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    invoke-static {p1, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    return-object p1

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method private getCurrentRewardCostInKicks()Ljava/lang/Long;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 132
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {v0}, Lcom/shopkick/app/application/ProfileInfo;->getSelectedRewardDenominationInKicks()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 133
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {v0}, Lcom/shopkick/app/application/ProfileInfo;->getSelectedRewardDenominationInKicks()Ljava/lang/Long;

    move-result-object v0

    return-object v0

    .line 135
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->getSelectedReward()Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    move-result-object v0

    .line 136
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/rewards/RewardsDataController;->getHighestAffordableRewardCostInKicks(Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method private getKicksNeededForCurrentReward()I
    .locals 2

    .line 141
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->getCurrentRewardCostInKicks()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    move-result v0

    .line 142
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-virtual {v1}, Lcom/shopkick/app/points/ProfilePoints;->getCoinsBalance()I

    move-result v1

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method private getRoundedImageDrawable(Landroid/graphics/Bitmap;)Lcom/shopkick/app/drawables/RoundedImageDrawable;
    .locals 4
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 572
    new-instance v0, Lcom/shopkick/app/drawables/RoundedImageDrawable;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->giftCardImageView:Landroid/widget/ImageView;

    const/16 v2, 0x4e

    .line 573
    invoke-static {v2, v1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v1

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->giftCardImageView:Landroid/widget/ImageView;

    const/16 v3, 0x32

    .line 574
    invoke-static {v3, v2}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v2

    const/high16 v3, 0x41200000    # 10.0f

    invoke-direct {v0, p1, v1, v2, v3}, Lcom/shopkick/app/drawables/RoundedImageDrawable;-><init>(Landroid/graphics/Bitmap;IIF)V

    return-object v0
.end method

.method private getSelectedReward()Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 128
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {v1}, Lcom/shopkick/app/application/ProfileInfo;->getSelectedRewardId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/rewards/RewardsDataController;->getReward(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    move-result-object v0

    return-object v0
.end method

.method private kickCounterAnimator()Landroid/animation/Animator;
    .locals 5

    .line 365
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 367
    new-instance v1, Landroid/animation/ValueAnimator;

    invoke-direct {v1}, Landroid/animation/ValueAnimator;-><init>()V

    const/4 v2, 0x2

    .line 368
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-virtual {v3}, Lcom/shopkick/app/points/ProfilePoints;->getCoinsBalance()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setObjectValues([Ljava/lang/Object;)V

    .line 369
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$3;

    invoke-direct {v2, p0, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$3;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;Ljava/lang/ref/WeakReference;)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 382
    new-instance v0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$4;

    invoke-direct {v0, p0}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$4;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;)V

    invoke-virtual {v1, v0}, Landroid/animation/ValueAnimator;->setEvaluator(Landroid/animation/TypeEvaluator;)V

    .line 387
    new-instance v0, Lcom/daasuu/ei/EasingInterpolator;

    sget-object v2, Lcom/daasuu/ei/Ease;->QUAD_IN_OUT:Lcom/daasuu/ei/Ease;

    invoke-direct {v0, v2}, Lcom/daasuu/ei/EasingInterpolator;-><init>(Lcom/daasuu/ei/Ease;)V

    invoke-virtual {v1, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    return-object v1
.end method

.method public static synthetic lambda$onBindViewHolder$254(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;Ljava/lang/ref/WeakReference;Landroid/view/View;)V
    .locals 3

    .line 497
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;

    if-nez p1, :cond_0

    return-void

    .line 502
    :cond_0
    invoke-direct {p1}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->logButtonTap()V

    .line 504
    sget-object p2, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$6;->$SwitchMap$com$shopkick$app$tileViewHolderConfigurators$SelectedRewardTileViewHolderConfigurator$TileState:[I

    iget-object v0, p1, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->tileState:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

    invoke-virtual {v0}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;->ordinal()I

    move-result v0

    aget p2, p2, v0

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    const/4 v0, 0x3

    if-eq p2, v0, :cond_1

    goto :goto_0

    .line 513
    :cond_1
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const-string v0, "reward_id"

    .line 514
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {v1}, Lcom/shopkick/app/application/ProfileInfo;->getSelectedRewardId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "origin_element"

    const/16 v1, 0x155

    .line 515
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 516
    new-instance v0, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v1, Lcom/shopkick/app/activities/RewardActivity;

    const-class v2, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;

    invoke-direct {v0, v1, v2, p2}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 517
    iget-object p1, p1, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p1}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    invoke-virtual {v0}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    goto :goto_0

    .line 506
    :cond_2
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const-string v0, "origin_element"

    const/16 v1, 0x156

    .line 507
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 508
    new-instance v0, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v1, Lcom/shopkick/app/activities/RewardActivity;

    const-class v2, Lcom/shopkick/app/rewards/RewardsMallScreen;

    invoke-direct {v0, v1, v2, p2}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 509
    iget-object p1, p1, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p1}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    invoke-virtual {v0}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    :goto_0
    return-void
.end method

.method private logButtonTap()V
    .locals 4

    .line 449
    sget-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$6;->$SwitchMap$com$shopkick$app$tileViewHolderConfigurators$SelectedRewardTileViewHolderConfigurator$TileState:[I

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->tileState:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

    invoke-virtual {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 455
    :cond_0
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x155

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0, v0, v1, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->logEvent(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    goto :goto_0

    .line 451
    :cond_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x156

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0, v0, v1, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->logEvent(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    :goto_0
    return-void
.end method

.method private logEvent(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 1

    .line 466
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0, p2, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 467
    invoke-virtual {v0, p3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    .line 468
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method private logImpression()V
    .locals 3

    .line 407
    sget-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$6;->$SwitchMap$com$shopkick$app$tileViewHolderConfigurators$SelectedRewardTileViewHolderConfigurator$TileState:[I

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->tileState:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

    invoke-virtual {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/16 v1, 0x14b

    const/4 v2, 0x3

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 417
    :pswitch_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v2, 0xc3502

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->logEvent(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    goto :goto_0

    .line 413
    :pswitch_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v2, 0xc3501

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->logEvent(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    goto :goto_0

    .line 409
    :pswitch_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v2, 0xc3503

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->logEvent(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private logWidgetTap()V
    .locals 3

    .line 428
    sget-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$6;->$SwitchMap$com$shopkick$app$tileViewHolderConfigurators$SelectedRewardTileViewHolderConfigurator$TileState:[I

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->tileState:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

    invoke-virtual {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/16 v1, 0x14b

    const/4 v2, 0x4

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 438
    :pswitch_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v2, 0xc3502

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->logEvent(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    goto :goto_0

    .line 434
    :pswitch_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v2, 0xc3501

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->logEvent(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    goto :goto_0

    .line 430
    :pswitch_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v2, 0xc3503

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->logEvent(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private progressBarAnimator()Landroid/animation/Animator;
    .locals 5

    .line 342
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-virtual {v0}, Lcom/shopkick/app/points/ProfilePoints;->getCoinsBalance()I

    move-result v0

    int-to-float v0, v0

    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->getCurrentRewardCostInKicks()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    long-to-float v1, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v0, v1

    const/4 v2, 0x0

    cmpl-float v3, v0, v2

    const/high16 v4, 0x3fc00000    # 1.5f

    if-nez v3, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    cmpg-float v2, v0, v4

    if-gtz v2, :cond_1

    move v1, v4

    goto :goto_0

    :cond_1
    const/high16 v2, 0x42be0000    # 95.0f

    cmpg-float v2, v0, v2

    if-gtz v2, :cond_2

    float-to-double v0, v0

    .line 349
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-float v1, v0

    goto :goto_0

    :cond_2
    cmpg-float v0, v0, v1

    if-gez v0, :cond_3

    const/high16 v1, 0x42c20000    # 97.0f

    :cond_3
    :goto_0
    const/high16 v0, 0x41200000    # 10.0f

    mul-float/2addr v1, v0

    .line 358
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->progressBar:Lcom/shopkick/app/view/RoundedEdgeCircularProgressBar;

    const-string v2, "progress"

    const/4 v3, 0x2

    new-array v3, v3, [I

    const/4 v4, 0x0

    aput v4, v3, v4

    const/4 v4, 0x1

    float-to-int v1, v1

    aput v1, v3, v4

    invoke-static {v0, v2, v3}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Ljava/lang/String;[I)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 359
    new-instance v1, Lcom/daasuu/ei/EasingInterpolator;

    sget-object v2, Lcom/daasuu/ei/Ease;->CUBIC_IN_OUT:Lcom/daasuu/ei/Ease;

    invoke-direct {v1, v2}, Lcom/daasuu/ei/EasingInterpolator;-><init>(Lcom/daasuu/ei/Ease;)V

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    return-object v0
.end method

.method private scaleUpAnimator(Landroid/view/View;)Landroid/animation/Animator;
    .locals 4

    const/4 v0, 0x2

    .line 401
    new-array v1, v0, [Landroid/animation/PropertyValuesHolder;

    sget-object v2, Landroid/view/View;->SCALE_X:Landroid/util/Property;

    new-array v3, v0, [F

    fill-array-data v3, :array_0

    invoke-static {v2, v3}, Landroid/animation/PropertyValuesHolder;->ofFloat(Landroid/util/Property;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Landroid/view/View;->SCALE_Y:Landroid/util/Property;

    new-array v0, v0, [F

    fill-array-data v0, :array_1

    invoke-static {v2, v0}, Landroid/animation/PropertyValuesHolder;->ofFloat(Landroid/util/Property;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v0

    const/4 v2, 0x1

    aput-object v0, v1, v2

    invoke-static {p1, v1}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    move-result-object p1

    return-object p1

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
.end method

.method private startAnimations()V
    .locals 8

    .line 266
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->animatorSet:Landroid/animation/AnimatorSet;

    .line 268
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 270
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->kickCounterAnimator()Landroid/animation/Animator;

    move-result-object v1

    const-wide/16 v2, 0x578

    invoke-virtual {v1, v2, v3}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    move-result-object v1

    .line 271
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->progressBarAnimator()Landroid/animation/Animator;

    move-result-object v4

    invoke-virtual {v4, v2, v3}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    move-result-object v2

    .line 273
    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->animatorSet:Landroid/animation/AnimatorSet;

    invoke-virtual {v3, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 274
    sget-object v2, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$6;->$SwitchMap$com$shopkick$app$tileViewHolderConfigurators$SelectedRewardTileViewHolderConfigurator$TileState:[I

    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->tileState:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

    invoke-virtual {v3}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const-wide/16 v3, 0x12c

    const-wide/16 v5, 0xc8

    packed-switch v2, :pswitch_data_0

    goto/16 :goto_0

    .line 292
    :pswitch_0
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->kickAmountTitleLabel:Lcom/shopkick/app/widget/SKTextView;

    invoke-direct {p0, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->fadeOutAlphaAnimator(Landroid/view/View;)Landroid/animation/Animator;

    move-result-object v2

    invoke-virtual {v2, v3, v4}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    move-result-object v2

    .line 293
    iget-object v7, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->kickAmountLabel:Lcom/shopkick/app/widget/SKTextView;

    invoke-direct {p0, v7}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->fadeOutAlphaAnimator(Landroid/view/View;)Landroid/animation/Animator;

    move-result-object v7

    invoke-virtual {v7, v3, v4}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    move-result-object v3

    .line 294
    new-instance v4, Lcom/daasuu/ei/EasingInterpolator;

    sget-object v7, Lcom/daasuu/ei/Ease;->QUAD_IN_OUT:Lcom/daasuu/ei/Ease;

    invoke-direct {v4, v7}, Lcom/daasuu/ei/EasingInterpolator;-><init>(Lcom/daasuu/ei/Ease;)V

    invoke-virtual {v2, v4}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 295
    new-instance v4, Lcom/daasuu/ei/EasingInterpolator;

    sget-object v7, Lcom/daasuu/ei/Ease;->QUAD_IN_OUT:Lcom/daasuu/ei/Ease;

    invoke-direct {v4, v7}, Lcom/daasuu/ei/EasingInterpolator;-><init>(Lcom/daasuu/ei/Ease;)V

    invoke-virtual {v3, v4}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 296
    new-instance v4, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$2;

    invoke-direct {v4, p0, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$2;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;Ljava/lang/ref/WeakReference;)V

    invoke-virtual {v3, v4}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 313
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->animatorSet:Landroid/animation/AnimatorSet;

    invoke-virtual {v0, v2}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    const-wide/16 v3, 0x190

    invoke-virtual {v0, v3, v4}, Landroid/animation/AnimatorSet$Builder;->after(J)Landroid/animation/AnimatorSet$Builder;

    .line 315
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->kickAmountTitleLabel:Lcom/shopkick/app/widget/SKTextView;

    invoke-direct {p0, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->fadeInAlphaAnimator(Landroid/view/View;)Landroid/animation/Animator;

    move-result-object v0

    invoke-virtual {v0, v5, v6}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    move-result-object v0

    .line 316
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->kickAmountLabel:Lcom/shopkick/app/widget/SKTextView;

    invoke-direct {p0, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->fadeInAlphaAnimator(Landroid/view/View;)Landroid/animation/Animator;

    move-result-object v1

    invoke-virtual {v1, v5, v6}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    move-result-object v1

    .line 317
    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->bottomButton:Lcom/shopkick/app/widget/SKButton;

    invoke-direct {p0, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->fadeInAlphaAnimator(Landroid/view/View;)Landroid/animation/Animator;

    move-result-object v3

    invoke-virtual {v3, v5, v6}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    move-result-object v3

    .line 318
    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->circleGlowImageView:Landroid/widget/ImageView;

    invoke-direct {p0, v4}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->fadeInAlphaAnimator(Landroid/view/View;)Landroid/animation/Animator;

    move-result-object v4

    invoke-virtual {v4, v5, v6}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    move-result-object v4

    .line 319
    new-instance v5, Lcom/daasuu/ei/EasingInterpolator;

    sget-object v6, Lcom/daasuu/ei/Ease;->QUAD_IN_OUT:Lcom/daasuu/ei/Ease;

    invoke-direct {v5, v6}, Lcom/daasuu/ei/EasingInterpolator;-><init>(Lcom/daasuu/ei/Ease;)V

    invoke-virtual {v0, v5}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 320
    new-instance v5, Lcom/daasuu/ei/EasingInterpolator;

    sget-object v6, Lcom/daasuu/ei/Ease;->QUAD_IN_OUT:Lcom/daasuu/ei/Ease;

    invoke-direct {v5, v6}, Lcom/daasuu/ei/EasingInterpolator;-><init>(Lcom/daasuu/ei/Ease;)V

    invoke-virtual {v1, v5}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 321
    new-instance v5, Lcom/daasuu/ei/EasingInterpolator;

    sget-object v6, Lcom/daasuu/ei/Ease;->QUAD_IN_OUT:Lcom/daasuu/ei/Ease;

    invoke-direct {v5, v6}, Lcom/daasuu/ei/EasingInterpolator;-><init>(Lcom/daasuu/ei/Ease;)V

    invoke-virtual {v3, v5}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 322
    new-instance v5, Lcom/daasuu/ei/EasingInterpolator;

    sget-object v6, Lcom/daasuu/ei/Ease;->QUAD_IN_OUT:Lcom/daasuu/ei/Ease;

    invoke-direct {v5, v6}, Lcom/daasuu/ei/EasingInterpolator;-><init>(Lcom/daasuu/ei/Ease;)V

    invoke-virtual {v4, v5}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 324
    iget-object v5, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->animatorSet:Landroid/animation/AnimatorSet;

    invoke-virtual {v5, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    .line 325
    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    .line 326
    invoke-virtual {v0, v3}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    .line 327
    invoke-virtual {v0, v4}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    .line 328
    invoke-virtual {v0, v2}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    const-wide/16 v1, 0x64

    .line 329
    invoke-virtual {v0, v1, v2}, Landroid/animation/AnimatorSet$Builder;->after(J)Landroid/animation/AnimatorSet$Builder;

    goto :goto_0

    .line 283
    :pswitch_1
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->kicksNeededTitleLabel:Lcom/shopkick/app/widget/SKTextView;

    invoke-direct {p0, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->fadeInAlphaAnimator(Landroid/view/View;)Landroid/animation/Animator;

    move-result-object v0

    const-wide/16 v5, 0x1f4

    invoke-virtual {v0, v5, v6}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    move-result-object v0

    .line 284
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->kicksNeededLabel:Lcom/shopkick/app/widget/SKTextView;

    invoke-direct {p0, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->fadeInAlphaAnimator(Landroid/view/View;)Landroid/animation/Animator;

    move-result-object v2

    invoke-virtual {v2, v5, v6}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    move-result-object v2

    .line 285
    new-instance v5, Lcom/daasuu/ei/EasingInterpolator;

    sget-object v6, Lcom/daasuu/ei/Ease;->QUAD_IN_OUT:Lcom/daasuu/ei/Ease;

    invoke-direct {v5, v6}, Lcom/daasuu/ei/EasingInterpolator;-><init>(Lcom/daasuu/ei/Ease;)V

    invoke-virtual {v0, v5}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 286
    new-instance v5, Lcom/daasuu/ei/EasingInterpolator;

    sget-object v6, Lcom/daasuu/ei/Ease;->QUAD_IN_OUT:Lcom/daasuu/ei/Ease;

    invoke-direct {v5, v6}, Lcom/daasuu/ei/EasingInterpolator;-><init>(Lcom/daasuu/ei/Ease;)V

    invoke-virtual {v2, v5}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 288
    iget-object v5, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->animatorSet:Landroid/animation/AnimatorSet;

    invoke-virtual {v5, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Landroid/animation/AnimatorSet$Builder;->after(J)Landroid/animation/AnimatorSet$Builder;

    goto :goto_0

    .line 276
    :pswitch_2
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->bottomButton:Lcom/shopkick/app/widget/SKButton;

    invoke-direct {p0, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->fadeInAlphaAnimator(Landroid/view/View;)Landroid/animation/Animator;

    move-result-object v0

    invoke-virtual {v0, v5, v6}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    move-result-object v0

    .line 277
    new-instance v2, Lcom/daasuu/ei/EasingInterpolator;

    sget-object v5, Lcom/daasuu/ei/Ease;->QUAD_IN_OUT:Lcom/daasuu/ei/Ease;

    invoke-direct {v2, v5}, Lcom/daasuu/ei/EasingInterpolator;-><init>(Lcom/daasuu/ei/Ease;)V

    invoke-virtual {v0, v2}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 279
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->animatorSet:Landroid/animation/AnimatorSet;

    invoke-virtual {v2, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Landroid/animation/AnimatorSet$Builder;->after(J)Landroid/animation/AnimatorSet$Builder;

    .line 338
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->animatorSet:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private updateGiftCardInfo()V
    .locals 8

    .line 203
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->getSelectedReward()Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    move-result-object v0

    .line 206
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {v1}, Lcom/shopkick/app/application/ProfileInfo;->getSelectedRewardDenominationInKicks()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    .line 207
    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    if-eqz v2, :cond_1

    .line 208
    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    .line 209
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->costInKicks:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->longValue()J

    move-result-wide v4

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    cmp-long v4, v4, v6

    if-nez v4, :cond_0

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_3

    .line 216
    iget-object v1, v3, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->displayName:Ljava/lang/String;

    invoke-static {v1}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, v3, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->displayName:Ljava/lang/String;

    goto :goto_2

    :cond_3
    :goto_1
    const-string v1, ""

    :goto_2
    const-string v2, "^\\$\\d+(,\\d{3})*(\\.\\d{1,2})?$"

    .line 221
    invoke-virtual {v1, v2}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 222
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->giftCardDenominationLabel:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v2, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    goto :goto_3

    .line 225
    :cond_4
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->getCurrentRewardCostInKicks()Ljava/lang/Long;

    move-result-object v1

    .line 226
    invoke-virtual {v1}, Ljava/lang/Long;->intValue()I

    move-result v1

    invoke-static {v1}, Lcom/shopkick/app/rewards/RewardsDataController;->kicksToCurrency(I)I

    move-result v1

    .line 227
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->giftCardDenominationLabel:Lcom/shopkick/app/widget/SKTextView;

    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->context:Landroid/content/Context;

    const v4, 0x7f110221

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v5, v6

    invoke-virtual {v3, v4, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    :goto_3
    if-nez v0, :cond_5

    .line 231
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->giftCardImageView:Landroid/widget/ImageView;

    const v1, 0x7f0802b6

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_4

    .line 232
    :cond_5
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->thumbnailDetails:Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;

    if-eqz v1, :cond_6

    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->thumbnailDetails:Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;->thumbnailImageUrl:Ljava/lang/String;

    if-eqz v1, :cond_6

    .line 233
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$1;

    invoke-direct {v1, p0}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$1;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;)V

    .line 249
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->context:Landroid/content/Context;

    if-eqz v2, :cond_6

    .line 251
    :try_start_0
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->giftCardImageView:Landroid/widget/ImageView;

    invoke-static {v2}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/app/util/GlideRequests;->asBitmap()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v2

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->thumbnailDetails:Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;->thumbnailImageUrl:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/shopkick/app/util/GlideRequest;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/util/GlideRequest;->submit()Lcom/bumptech/glide/request/FutureTarget;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_6
    :goto_4
    return-void
.end method

.method private updateUI()V
    .locals 6

    .line 146
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->endAnimations()V

    .line 147
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->lastUpdateUITs:J

    .line 148
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->kicksNeededTitleLabel:Lcom/shopkick/app/widget/SKTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setAlpha(F)V

    .line 149
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->kicksNeededLabel:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setAlpha(F)V

    .line 150
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->bottomButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setAlpha(F)V

    .line 151
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->circleGlowImageView:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    .line 153
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {v0}, Lcom/shopkick/app/application/ProfileInfo;->getSelectedRewardId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 154
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->getKicksNeededForCurrentReward()I

    move-result v0

    if-nez v0, :cond_0

    .line 156
    sget-object v1, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;->COMPLETED:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

    iput-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->tileState:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

    goto :goto_0

    .line 158
    :cond_0
    sget-object v1, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;->IN_PROGRESS:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

    iput-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->tileState:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

    .line 161
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->kickAmountTitleLabel:Lcom/shopkick/app/widget/SKTextView;

    const v2, 0x7f11064e

    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    .line 162
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->kicksNeededLabel:Lcom/shopkick/app/widget/SKTextView;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f11064f

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/util/NumberFormatter;->formatKicks(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v5

    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 164
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-virtual {v0}, Lcom/shopkick/app/points/ProfilePoints;->getCoinsBalance()I

    move-result v0

    const/16 v1, 0x3e8

    if-ge v0, v1, :cond_1

    const/16 v0, 0x1e

    goto :goto_1

    :cond_1
    const/16 v1, 0x2710

    if-ge v0, v1, :cond_2

    const/16 v0, 0x1c

    goto :goto_1

    :cond_2
    const v1, 0x186a0

    if-ge v0, v1, :cond_3

    const/16 v0, 0x1a

    goto :goto_1

    :cond_3
    const/16 v0, 0x18

    .line 177
    :goto_1
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->kickAmountLabel:Lcom/shopkick/app/widget/SKTextView;

    int-to-float v0, v0

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKTextView;->setTextSize(F)V

    goto :goto_2

    .line 179
    :cond_4
    sget-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;->NO_REWARD:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->tileState:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

    .line 180
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->bottomButton:Lcom/shopkick/app/widget/SKButton;

    const v1, 0x7f110651

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    .line 183
    :goto_2
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->updateGiftCardInfo()V

    .line 184
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->startAnimations()V

    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    return-void
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c01ad

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 2

    .line 480
    iget-boolean p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->didInitialize:Z

    if-eqz p2, :cond_0

    return-void

    :cond_0
    const p2, 0x7f09066f

    .line 484
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/view/RoundedEdgeCircularProgressBar;

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->progressBar:Lcom/shopkick/app/view/RoundedEdgeCircularProgressBar;

    const p2, 0x7f090669

    .line 485
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->giftCardImageView:Landroid/widget/ImageView;

    const p2, 0x7f090668

    .line 486
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKTextView;

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->giftCardDenominationLabel:Lcom/shopkick/app/widget/SKTextView;

    const p2, 0x7f09066c

    .line 487
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKTextView;

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->kickAmountTitleLabel:Lcom/shopkick/app/widget/SKTextView;

    const p2, 0x7f09066b

    .line 488
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKTextView;

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->kickAmountLabel:Lcom/shopkick/app/widget/SKTextView;

    const p2, 0x7f09066e

    .line 489
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKTextView;

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->kicksNeededTitleLabel:Lcom/shopkick/app/widget/SKTextView;

    const p2, 0x7f09066d

    .line 490
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKTextView;

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->kicksNeededLabel:Lcom/shopkick/app/widget/SKTextView;

    const p2, 0x7f090667

    .line 491
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->bottomButton:Lcom/shopkick/app/widget/SKButton;

    const p2, 0x7f090107

    .line 492
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->circleGlowImageView:Landroid/widget/ImageView;

    .line 494
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 496
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->bottomButton:Lcom/shopkick/app/widget/SKButton;

    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$SelectedRewardTileViewHolderConfigurator$jNDpfrlxXrZ9fBooiNtNwMEX_Ho;

    invoke-direct {v1, p0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$SelectedRewardTileViewHolderConfigurator$jNDpfrlxXrZ9fBooiNtNwMEX_Ho;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;Ljava/lang/ref/WeakReference;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 527
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    check-cast p1, Lcom/shopkick/app/widget/UserEventConstraintLayout;

    .line 528
    new-instance v0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$5;

    invoke-direct {v0, p0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$5;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;Ljava/lang/ref/WeakReference;)V

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/UserEventConstraintLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 p1, 0x1

    .line 563
    iput-boolean p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->didInitialize:Z

    .line 565
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->updateUI()V

    .line 567
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->logImpression()V

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

    .line 581
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const v0, -0x783e8120

    if-eq p2, v0, :cond_3

    const v0, -0x7894f8a

    if-eq p2, v0, :cond_2

    const v0, 0x44e6563

    if-eq p2, v0, :cond_1

    const v0, 0x783d1232

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "ProfilePointsChangedEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const-string p2, "UserAccountIdChangedEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    const-string p2, "SelectedRewardIdUpdated"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x3

    goto :goto_1

    :cond_3
    const-string p2, "rewards_reload_completed"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x2

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto :goto_2

    .line 587
    :pswitch_0
    iget-boolean p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->didInitialize:Z

    if-eqz p1, :cond_5

    iget-wide p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->lastUpdateUITs:J

    const-wide/16 v0, 0x1388

    add-long/2addr p1, v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    cmp-long p1, p1, v0

    if-gez p1, :cond_5

    .line 588
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->updateUI()V

    :cond_5
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
