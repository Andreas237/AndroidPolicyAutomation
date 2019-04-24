.class public Lcom/shopkick/app/activities/KicksCounterController;
.super Ljava/lang/Object;
.source "KicksCounterController.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/activities/KicksCounterController$JumpAnimationSet;
    }
.end annotation


# static fields
.field private static final KICK_AMOUNT_ANIMATION_DURATION:I = 0x190

.field private static final KICK_AMOUNT_ANIMATION_OFFSET:F = 0.5f


# instance fields
.field private appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private eventLogger:Lcom/shopkick/app/logging/UserEventLogger;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private kicksAmount:Lcom/shopkick/app/widget/SKTextView;

.field private kicksCounter:Landroid/view/View;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private profileInfo:Lcom/shopkick/app/application/ProfileInfo;

.field private profilePoints:Lcom/shopkick/app/points/ProfilePoints;

.field private rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ProfileInfo;Lcom/shopkick/app/points/ProfilePoints;Lcom/shopkick/app/rewards/RewardsDataController;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/logging/UserEventLogger;Landroid/view/View;)V
    .locals 0
    .param p8    # Lcom/shopkick/app/logging/UserEventLogger;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p1, p0, Lcom/shopkick/app/activities/KicksCounterController;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 58
    iput-object p2, p0, Lcom/shopkick/app/activities/KicksCounterController;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    .line 59
    iput-object p3, p0, Lcom/shopkick/app/activities/KicksCounterController;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    .line 60
    iput-object p4, p0, Lcom/shopkick/app/activities/KicksCounterController;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    .line 61
    iput-object p5, p0, Lcom/shopkick/app/activities/KicksCounterController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 62
    iput-object p6, p0, Lcom/shopkick/app/activities/KicksCounterController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 63
    iput-object p7, p0, Lcom/shopkick/app/activities/KicksCounterController;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 64
    iput-object p8, p0, Lcom/shopkick/app/activities/KicksCounterController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 65
    iput-object p9, p0, Lcom/shopkick/app/activities/KicksCounterController;->kicksCounter:Landroid/view/View;

    const p1, 0x7f0903b3

    .line 67
    invoke-virtual {p9, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKTextView;

    iput-object p1, p0, Lcom/shopkick/app/activities/KicksCounterController;->kicksAmount:Lcom/shopkick/app/widget/SKTextView;

    .line 69
    invoke-direct {p0}, Lcom/shopkick/app/activities/KicksCounterController;->refreshKicks()V

    const/4 p1, 0x0

    .line 71
    invoke-virtual {p0, p1}, Lcom/shopkick/app/activities/KicksCounterController;->setKicksCounterClickListener(Z)V

    const-string p2, "UserAccountIdChangedEvent"

    .line 73
    invoke-virtual {p5, p0, p2, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    const-string p2, "ProfilePointsChangedEvent"

    .line 74
    invoke-virtual {p5, p0, p2, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    const-string p2, "SelectedRewardIdUpdated"

    .line 75
    invoke-virtual {p5, p0, p2, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    return-void
.end method

.method private animateKicksCounter()V
    .locals 5

    .line 120
    iget-object v0, p0, Lcom/shopkick/app/activities/KicksCounterController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->hideKicksJumpAnimation:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 123
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/activities/KicksCounterController;->kicksAmount:Lcom/shopkick/app/widget/SKTextView;

    new-instance v1, Lcom/shopkick/app/activities/KicksCounterController$JumpAnimationSet;

    const/4 v2, 0x0

    const/16 v3, 0x190

    const/high16 v4, 0x3f000000    # 0.5f

    invoke-direct {v1, v2, v3, v4}, Lcom/shopkick/app/activities/KicksCounterController$JumpAnimationSet;-><init>(IIF)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private cancelNavBarAnimations()V
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/shopkick/app/activities/KicksCounterController;->kicksAmount:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKTextView;->clearAnimation()V

    .line 116
    iget-object v0, p0, Lcom/shopkick/app/activities/KicksCounterController;->kicksAmount:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKTextView;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    return-void
.end method

.method public static synthetic lambda$setKicksCounterClickListener$16(Lcom/shopkick/app/activities/KicksCounterController;Landroid/view/View;)V
    .locals 3

    .line 83
    new-instance p1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v0, Lcom/shopkick/app/activities/DetailsActivity;

    const-class v1, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;

    const/4 v2, 0x0

    invoke-direct {p1, v0, v1, v2}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 84
    iget-object v0, p0, Lcom/shopkick/app/activities/KicksCounterController;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void
.end method

.method private refreshKicks()V
    .locals 2

    .line 98
    iget-object v0, p0, Lcom/shopkick/app/activities/KicksCounterController;->kicksAmount:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/activities/KicksCounterController;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-virtual {v1}, Lcom/shopkick/app/points/ProfilePoints;->getCoinsBalance()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lcom/shopkick/app/util/NumberFormatter;->formatKicks(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 99
    invoke-virtual {p0}, Lcom/shopkick/app/activities/KicksCounterController;->showKicksCounter()V

    return-void
.end method


# virtual methods
.method public cancelKicksCounterAnimation()V
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/shopkick/app/activities/KicksCounterController;->kicksAmount:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKTextView;->clearAnimation()V

    return-void
.end method

.method public destroy()V
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/shopkick/app/activities/KicksCounterController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    return-void
.end method

.method hideKicksCounter()V
    .locals 2

    .line 111
    iget-object v0, p0, Lcom/shopkick/app/activities/KicksCounterController;->kicksAmount:Lcom/shopkick/app/widget/SKTextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    return-void
.end method

.method public maybeShowKicksCounterAnimation()V
    .locals 1

    .line 129
    iget-object v0, p0, Lcom/shopkick/app/activities/KicksCounterController;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-virtual {v0}, Lcom/shopkick/app/points/ProfilePoints;->shouldAnimateLastCoinsDelta()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 130
    invoke-direct {p0}, Lcom/shopkick/app/activities/KicksCounterController;->animateKicksCounter()V

    .line 131
    iget-object v0, p0, Lcom/shopkick/app/activities/KicksCounterController;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-virtual {v0}, Lcom/shopkick/app/points/ProfilePoints;->lastCoinsDeltaAnimated()V

    :cond_0
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

    .line 181
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const v0, -0x7894f8a

    const/4 v1, 0x0

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

    if-eqz p1, :cond_3

    const/4 p1, 0x2

    goto :goto_1

    :cond_1
    const-string p2, "UserAccountIdChangedEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    move p1, v1

    goto :goto_1

    :cond_2
    const-string p2, "SelectedRewardIdUpdated"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto :goto_2

    .line 187
    :pswitch_0
    iget-object p1, p0, Lcom/shopkick/app/activities/KicksCounterController;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    iget-object p2, p0, Lcom/shopkick/app/activities/KicksCounterController;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    .line 188
    invoke-virtual {p2}, Lcom/shopkick/app/application/ProfileInfo;->getSelectedRewardId()Ljava/lang/String;

    move-result-object p2

    .line 187
    invoke-virtual {p1, p2}, Lcom/shopkick/app/rewards/RewardsDataController;->getReward(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    move-result-object p1

    invoke-static {p1}, Lcom/shopkick/app/rewards/RewardsDataController;->getRewardCostInKicks(Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)I

    move-result p1

    const p2, 0x7fffffff

    if-eq p1, p2, :cond_4

    .line 189
    iget-object p2, p0, Lcom/shopkick/app/activities/KicksCounterController;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-virtual {p2}, Lcom/shopkick/app/points/ProfilePoints;->getCoinsBalance()I

    move-result p2

    if-ge p2, p1, :cond_4

    .line 190
    iget-object p1, p0, Lcom/shopkick/app/activities/KicksCounterController;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/application/AppPreferences;->setShownKicksCenterToast(Z)V

    .line 192
    :cond_4
    invoke-direct {p0}, Lcom/shopkick/app/activities/KicksCounterController;->refreshKicks()V

    .line 193
    invoke-virtual {p0}, Lcom/shopkick/app/activities/KicksCounterController;->maybeShowKicksCounterAnimation()V

    goto :goto_2

    .line 184
    :pswitch_1
    iget-object p1, p0, Lcom/shopkick/app/activities/KicksCounterController;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/application/AppPreferences;->setShownKicksCenterToast(Z)V

    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setEventLogger(Lcom/shopkick/app/logging/UserEventLogger;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/shopkick/app/activities/KicksCounterController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    return-void
.end method

.method public setKicksCounterClickListener(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 80
    iget-object p1, p0, Lcom/shopkick/app/activities/KicksCounterController;->kicksCounter:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 82
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/activities/KicksCounterController;->kicksCounter:Landroid/view/View;

    new-instance v0, Lcom/shopkick/app/activities/-$$Lambda$KicksCounterController$cvQrpsGRZdu9UpKXRy86JAr-t64;

    invoke-direct {v0, p0}, Lcom/shopkick/app/activities/-$$Lambda$KicksCounterController$cvQrpsGRZdu9UpKXRy86JAr-t64;-><init>(Lcom/shopkick/app/activities/KicksCounterController;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method public showKicksCounter()V
    .locals 3

    .line 103
    iget-object v0, p0, Lcom/shopkick/app/activities/KicksCounterController;->kicksAmount:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKTextView;->isShown()Z

    move-result v0

    if-nez v0, :cond_0

    .line 104
    invoke-direct {p0}, Lcom/shopkick/app/activities/KicksCounterController;->cancelNavBarAnimations()V

    .line 105
    iget-object v0, p0, Lcom/shopkick/app/activities/KicksCounterController;->kicksAmount:Lcom/shopkick/app/widget/SKTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 106
    iget-object v0, p0, Lcom/shopkick/app/activities/KicksCounterController;->kicksAmount:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKTextView;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v1, 0x96

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    :cond_0
    return-void
.end method
