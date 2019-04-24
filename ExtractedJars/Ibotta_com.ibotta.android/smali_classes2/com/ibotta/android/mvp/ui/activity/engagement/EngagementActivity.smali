.class public Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "EngagementActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;
.implements Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog$RetailerPickerDialogListener;
.implements Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;",
        "Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog$RetailerPickerDialogListener;",
        "Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;"
    }
.end annotation


# static fields
.field private static final MAX_IMPRESSION_DURATION:J = 0x927c0L

.field public static final RESP_CODE_SUCCESS:I = 0x1


# instance fields
.field private currentEngagementView:Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;

.field private data:Landroid/content/Intent;

.field private engagementDuration:J

.field protected flContent:Landroid/widget/FrameLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901ec
    .end annotation
.end field

.field private isShareable:Z

.field protected llRoot:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090327
    .end annotation
.end field

.field protected pixelTrackingManager:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private postResultsLater:Z

.field private postUnlockIntent:Landroid/content/Intent;

.field private requestCode:I

.field private resultCode:I

.field private retailerPickerDialog:Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;

.field protected trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 56
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    .line 76
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->engagementDuration:J

    return-void
.end method

.method private createRewardEvent()Lcom/ibotta/android/tracking/proprietary/event/RewardEvent;
    .locals 2

    .line 391
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/RewardEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/RewardEvent;-><init>()V

    .line 392
    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->ENGAGEMENT:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/RewardEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    .line 393
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;->getRetailerId()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/RewardEvent;->setRetailerId(Ljava/lang/Integer;)V

    .line 394
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;->getOfferId()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/RewardEvent;->setOfferId(Ljava/lang/Integer;)V

    .line 396
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;->getLastRewardIdSeen()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;->getLastRewardIdSeen()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->intValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 395
    :goto_0
    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/RewardEvent;->setOfferRewardId(Ljava/lang/Integer;)V

    .line 397
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;->getLastEngagementSegmentIdSeen()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/RewardEvent;->setEngagementId(Ljava/lang/Long;)V

    return-object v0
.end method

.method public static synthetic lambda$showEngagementSuccess$0(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;Landroid/content/DialogInterface;)V
    .locals 0

    .line 281
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->onUnlockAnimationClosed()V

    return-void
.end method

.method public static synthetic lambda$showEngagementSuccess$1(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;Landroid/content/DialogInterface;)V
    .locals 0

    .line 281
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->onUnlockAnimationClosed()V

    return-void
.end method

.method private loadParams()V
    .locals 4

    .line 103
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 104
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "offer_id"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 105
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v3, "retailer_id"

    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    .line 107
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;

    invoke-interface {v2, v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;->setOfferId(I)V

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;->setRetailerId(Ljava/lang/Integer;)V

    .line 111
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;

    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v1

    sget-object v2, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->LOCATION:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/App;->hasPermission(Lcom/ibotta/android/state/app/permissions/PermissionProfile;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;->setPermissionsNeeded(Z)V

    return-void
.end method

.method private onUnlockAnimationClosed()V
    .locals 0

    .line 327
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->onUnlockAnimationComplete()V

    return-void
.end method

.method private trackEngagement(Lcom/ibotta/api/model/TaskModel;)V
    .locals 2

    .line 238
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;->getOfferId()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 239
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->trackRewardImpression()V

    .line 242
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->engagementDuration:J

    .line 243
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->trackPixelForNonVideoEngagements(Lcom/ibotta/api/model/TaskModel;)V

    return-void
.end method

.method private trackPixelForNonVideoEngagements(Lcom/ibotta/api/model/TaskModel;)V
    .locals 2
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 248
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity$1;->$SwitchMap$com$ibotta$api$model$TaskModel$Type:[I

    invoke-interface {p1}, Lcom/ibotta/api/model/TaskModel;->getTypeEnum()Lcom/ibotta/api/model/TaskModel$Type;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/TaskModel$Type;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 256
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->pixelTrackingManager:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    invoke-interface {p1}, Lcom/ibotta/api/model/TaskModel;->getTrackingImpressionUrl()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;->trackImpression(Ljava/lang/String;)V

    :pswitch_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private trackRewardEngaged()V
    .locals 2

    .line 360
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->createRewardEvent()Lcom/ibotta/android/tracking/proprietary/event/RewardEvent;

    move-result-object v0

    const/4 v1, 0x1

    .line 362
    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/RewardEvent;->setEngaged(I)V

    .line 363
    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/RewardEvent;->setCounter(I)V

    .line 364
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {v1, v0}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method private trackRewardImpression()V
    .locals 7

    .line 368
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;->getOfferId()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;

    .line 369
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;->getLastRewardIdSeen()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->engagementDuration:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    goto :goto_0

    .line 374
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v4, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->engagementDuration:J

    sub-long/2addr v0, v4

    iput-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->engagementDuration:J

    .line 375
    iget-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->engagementDuration:J

    const-wide/32 v4, 0x927c0

    cmp-long v6, v0, v4

    if-lez v6, :cond_1

    return-void

    :cond_1
    long-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    .line 381
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->createRewardEvent()Lcom/ibotta/android/tracking/proprietary/event/RewardEvent;

    move-result-object v1

    .line 383
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ibotta/android/tracking/proprietary/event/RewardEvent;->setDuration(Ljava/lang/Float;)V

    const/4 v0, 0x1

    .line 384
    invoke-virtual {v1, v0}, Lcom/ibotta/android/tracking/proprietary/event/RewardEvent;->setCounter(I)V

    .line 385
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    .line 387
    iput-wide v2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->engagementDuration:J

    return-void

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 56
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementComponent;
    .locals 1

    .line 81
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;

    move-result-object v0

    .line 82
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;)V

    .line 83
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;->engagementModule(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule;)Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;

    move-result-object p1

    .line 84
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementComponent;

    move-result-object p1

    return-object p1
.end method

.method public declareEngagementRequirements(Ljava/lang/String;Z)V
    .locals 0

    .line 339
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 340
    iput-boolean p2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->isShareable:Z

    .line 341
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->supportInvalidateOptionsMenu()V

    return-void
.end method

.method public dismissRetailerPickerDialog()V
    .locals 1

    .line 419
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->retailerPickerDialog:Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;->dismiss()V

    return-void
.end method

.method public getDefaultOfferName()Ljava/lang/String;
    .locals 1

    const v0, 0x7f1105a4

    .line 424
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hide()V
    .locals 2

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->llRoot:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 56
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementComponent;)V
    .locals 0

    .line 89
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;)V

    return-void
.end method

.method public notifyRetailerClicked(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 414
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;->onRetailerPicked(Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public notifyRetailerPickerDialogDismissClicked()V
    .locals 1

    .line 404
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;->onRetailerPickerDialogDismissClicked()V

    return-void
.end method

.method public notifyRetailerPickerDialogDismissed()V
    .locals 1

    .line 409
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;->onRetailerPickerDialogDismissed()V

    return-void
.end method

.method public notifySuccess(Ljava/lang/String;)V
    .locals 1

    .line 346
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;->onCurrentEngagementSuccess(Ljava/lang/String;)V

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 171
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 173
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->currentEngagementView:Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;

    if-eqz v0, :cond_0

    .line 174
    invoke-virtual {v0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->onActivityResult(IILandroid/content/Intent;)V

    const/4 p1, 0x0

    .line 175
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->postResultsLater:Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 177
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->postResultsLater:Z

    .line 178
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->requestCode:I

    .line 179
    iput p2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->resultCode:I

    .line 180
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->data:Landroid/content/Intent;

    :goto_0
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->currentEngagementView:Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->onBackPressed()Z

    move-result v0

    if-nez v0, :cond_1

    .line 139
    :cond_0
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onBackPressed()V

    :cond_1
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 94
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0033

    .line 96
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->setContentView(I)V

    .line 97
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 99
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->loadParams()V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 145
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->isShareable:Z

    if-eqz v0, :cond_0

    .line 146
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0d0006

    .line 147
    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 150
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method protected onDestroy()V
    .locals 1

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->currentEngagementView:Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;

    if-eqz v0, :cond_0

    .line 130
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->onDestroy()V

    .line 133
    :cond_0
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onDestroy()V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 155
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 158
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v1, 0x7f090026

    if-eq p1, v1, :cond_0

    goto :goto_0

    .line 160
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->currentEngagementView:Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->onShareClicked()V

    const/4 v0, 0x1

    :cond_1
    :goto_0
    return v0
.end method

.method protected onPause()V
    .locals 2

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->currentEngagementView:Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;

    if-eqz v0, :cond_0

    .line 117
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->onPause()V

    .line 120
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->trackRewardImpression()V

    const-wide/16 v0, 0x0

    .line 122
    iput-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->engagementDuration:J

    .line 124
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onPause()V

    return-void
.end method

.method protected onUnlockAnimationComplete()V
    .locals 1

    .line 331
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->postUnlockIntent:Landroid/content/Intent;

    if-eqz v0, :cond_0

    .line 332
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->startActivity(Landroid/content/Intent;)V

    .line 333
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->finish()V

    :cond_0
    return-void
.end method

.method public promptForLocationPermissions(ILjava/lang/Integer;)V
    .locals 2

    .line 186
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    const v1, 0x7f11024c

    invoke-virtual {v0, v1}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 187
    new-instance v1, Lcom/ibotta/android/routing/intent/EngagementIntentCreator;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/routing/intent/EngagementIntentCreator;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, p2}, Lcom/ibotta/android/routing/intent/EngagementIntentCreator;->retailerId(Ljava/lang/Integer;)Lcom/ibotta/android/routing/intent/EngagementIntentCreator;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/EngagementIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    .line 188
    new-instance p2, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;

    sget-object v1, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->LOCATION:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    invoke-direct {p2, p0, v1, v0, p1}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/state/app/permissions/PermissionProfile;Ljava/lang/String;Landroid/content/Intent;)V

    .line 189
    invoke-virtual {p2}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    .line 190
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->startActivity(Landroid/content/Intent;)V

    .line 191
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->finish()V

    return-void
.end method

.method public requestShare(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 351
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;->onShareRequested(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setTitleForLoadFailure()V
    .locals 1

    const v0, 0x7f110138

    .line 429
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->setTitle(I)V

    return-void
.end method

.method public share(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 293
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.SEND"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "text/html"

    .line 294
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "android.intent.extra.SUBJECT"

    .line 295
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 298
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x18

    if-lt p1, v2, :cond_0

    .line 299
    invoke-static {p2, v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object p1

    goto :goto_0

    .line 301
    :cond_0
    invoke-static {p2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p1

    :goto_0
    const-string p2, "android.intent.extra.TEXT"

    .line 304
    invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/content/Intent;

    const p1, 0x7f1101e9

    .line 307
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    const-string p2, "Failed to share engagement content."

    .line 309
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const p1, 0x7f110136

    const/4 p2, 0x0

    .line 310
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->showErrorMessage(ILjava/lang/String;)V

    :goto_1
    return-void
.end method

.method public show()V
    .locals 2

    .line 196
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->llRoot:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method public showEngagement(Lcom/ibotta/api/model/RetailerModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/ibotta/api/model/TaskModel;Z)V
    .locals 9
    .param p1    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    move-object v0, p0

    .line 213
    invoke-interface {p6}, Lcom/ibotta/api/model/TaskModel;->getTypeEnum()Lcom/ibotta/api/model/TaskModel$Type;

    move-result-object v1

    invoke-static {p0, v1}, Lcom/ibotta/android/mvp/ui/view/engagement/EngagementViewFactory;->fromRewardType(Landroid/content/Context;Lcom/ibotta/api/model/TaskModel$Type;)Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;

    move-result-object v1

    move-object v8, p6

    .line 215
    invoke-direct {p0, p6}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->trackEngagement(Lcom/ibotta/api/model/TaskModel;)V

    .line 217
    iget-object v2, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->currentEngagementView:Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 218
    :cond_0
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->currentEngagementView:Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;

    .line 221
    :cond_1
    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->flContent:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 223
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 225
    iget-object v2, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->flContent:Landroid/widget/FrameLayout;

    iget-object v3, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->currentEngagementView:Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;

    invoke-virtual {v2, v3, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 227
    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->currentEngagementView:Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;

    invoke-virtual {v1, p0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->setEngagementHost(Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;)V

    .line 229
    iget-boolean v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->postResultsLater:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    .line 230
    iput-boolean v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->postResultsLater:Z

    .line 231
    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->currentEngagementView:Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;

    iget v2, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->requestCode:I

    iget v3, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->resultCode:I

    iget-object v4, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->data:Landroid/content/Intent;

    invoke-virtual {v1, v2, v3, v4}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->onActivityResult(IILandroid/content/Intent;)V

    .line 234
    :cond_2
    iget-object v2, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->currentEngagementView:Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move v7, p5

    move-object v8, p6

    invoke-virtual/range {v2 .. v8}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->setup(Lcom/ibotta/api/model/RetailerModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/ibotta/api/model/TaskModel;)V

    return-void
.end method

.method public showEngagementSuccess(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/api/model/TaskModel;JLjava/lang/Integer;)V
    .locals 1
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 264
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->trackRewardEngaged()V

    if-eqz p2, :cond_0

    .line 267
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->pixelTrackingManager:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    invoke-interface {p2}, Lcom/ibotta/api/model/TaskModel;->getTrackingClickUrl()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p2}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;->trackClick(Ljava/lang/String;)V

    :cond_0
    const/4 p2, 0x0

    .line 270
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->postUnlockIntent:Landroid/content/Intent;

    if-eqz p5, :cond_2

    if-eqz p1, :cond_1

    .line 272
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    .line 273
    :cond_1
    new-instance v0, Lcom/ibotta/android/routing/intent/LinkedOfferIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/LinkedOfferIntentCreator;-><init>(Landroid/content/Context;)V

    .line 274
    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    move-result p5

    invoke-virtual {v0, p5}, Lcom/ibotta/android/routing/intent/LinkedOfferIntentCreator;->setOfferId(I)Lcom/ibotta/android/routing/intent/LinkedOfferIntentCreator;

    move-result-object p5

    .line 275
    invoke-virtual {p5, p3, p4}, Lcom/ibotta/android/routing/intent/LinkedOfferIntentCreator;->setRewardId(J)Lcom/ibotta/android/routing/intent/LinkedOfferIntentCreator;

    move-result-object p3

    .line 276
    invoke-virtual {p3, p2}, Lcom/ibotta/android/routing/intent/LinkedOfferIntentCreator;->setOriginRetailerId(Ljava/lang/Integer;)Lcom/ibotta/android/routing/intent/LinkedOfferIntentCreator;

    move-result-object p2

    .line 277
    invoke-virtual {p2}, Lcom/ibotta/android/routing/intent/LinkedOfferIntentCreator;->create()Landroid/content/Intent;

    move-result-object p2

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->postUnlockIntent:Landroid/content/Intent;

    .line 280
    :cond_2
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->postUnlockIntent:Landroid/content/Intent;

    if-eqz p2, :cond_3

    .line 281
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/engagement/-$$Lambda$EngagementActivity$O_Uqll5-U9n1t7XA5zWKknF2NFA;

    invoke-direct {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/-$$Lambda$EngagementActivity$O_Uqll5-U9n1t7XA5zWKknF2NFA;-><init>(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;)V

    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/engagement/-$$Lambda$EngagementActivity$NOIc--KDBO8ny0JvurIi3-goIoQ;

    invoke-direct {p2, p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/-$$Lambda$EngagementActivity$NOIc--KDBO8ny0JvurIi3-goIoQ;-><init>(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;)V

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->showUnlockAnimation(Landroid/content/DialogInterface$OnCancelListener;Landroid/content/DialogInterface$OnDismissListener;)V

    goto :goto_0

    .line 284
    :cond_3
    new-instance p2, Landroid/content/Intent;

    invoke-direct {p2}, Landroid/content/Intent;-><init>()V

    const-string p3, "retailer_parcel"

    .line 285
    invoke-virtual {p2, p3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const/4 p1, 0x1

    .line 286
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->setResult(ILandroid/content/Intent;)V

    .line 287
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->finish()V

    :goto_0
    return-void
.end method

.method public showOfferNotFound()V
    .locals 3

    const v0, 0x7f1101c6

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 316
    invoke-virtual {p0, v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->showQuickMessage(IZZ)V

    return-void
.end method

.method public showQuickMessage(Ljava/lang/String;ZZ)V
    .locals 0

    const/4 p2, 0x0

    .line 356
    invoke-super {p0, p1, p2, p2}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->showQuickMessage(Ljava/lang/String;ZZ)V

    return-void
.end method

.method public showRetailerSelector(Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)V"
        }
    .end annotation

    .line 321
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->retailerPickerDialog:Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;

    .line 322
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->retailerPickerDialog:Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;

    invoke-virtual {v0, p0, p1, p2}, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;->setup(Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog$RetailerPickerDialogListener;Ljava/lang/String;Ljava/util/List;)V

    .line 323
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;->retailerPickerDialog:Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;->show()V

    return-void
.end method
