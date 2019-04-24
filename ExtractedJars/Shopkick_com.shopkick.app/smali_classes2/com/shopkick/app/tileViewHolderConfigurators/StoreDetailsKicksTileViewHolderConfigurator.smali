.class public Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "StoreDetailsKicksTileViewHolderConfigurator.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator$KicksTileV2ViewClickListener;
    }
.end annotation


# static fields
.field private static final BBY_CHAIN_ID:Ljava/lang/String; = "40560331"

.field private static final CHECK_GROW_DURATION:I = 0xc8

.field public static final CHECK_GROW_INITIAL_SCALE:F = 0.85f

.field private static final KICKS_EARNED_LABEL_BASE_RIGHT_MARGIN:I = 0x28

.field private static final KICKS_EARNED_LABEL_TOP_MARGIN:I = 0xe

.field private static final MAX_TEXT_ANIMATION_TIME_MS:I = 0x5dc

.field private static final PULSE_ANCHOR_RELATIVE_POS:F = 0.5f

.field private static final PULSE_GLOW_BUFFER_INTERVAL:I = 0x1

.field private static final PULSE_GLOW_FADE_DURATION:I = 0x190

.field private static final PULSE_GLOW_GROW_DELAY:I = 0x64

.field private static final PULSE_GLOW_GROW_DURATION:I = 0x190

.field private static final PULSE_GLOW_MAX_OPACITY:F = 0.7f

.field private static final PULSE_GLOW_MAX_SCALE:F = 1.4f

.field private static final PULSE_GLOW_MIN_OPACITY:F = 0.0f

.field private static final PULSE_GLOW_MIN_SCALE:F = 1.0f

.field private static final PULSE_GLOW_START_OFFSET:I = 0x1f4

.field private static final SCAN_MORE_LABEL_TEXT_SIZE_DE:I = 0x8

.field private static final TEXT_ANIMATION_INTERVAL_MS:I = 0xa


# instance fields
.field private address:Ljava/lang/String;

.field private awardsManager:Lcom/shopkick/app/awards/AwardsManager;

.field private bncLink:Ljava/lang/String;

.field private bonusWalkinKicksAvailable:Z

.field private chainId:Ljava/lang/String;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private context:Landroid/content/Context;

.field private daysUntilNextWalkin:I

.field private hasBNC:Z

.field private hasReceiptKicks:Z

.field private isInWalkinAnimation:Z

.field private isVisaOnly:Z

.field private kicksEarnedToday:Ljava/lang/Integer;

.field private locationId:Ljava/lang/String;

.field private purchasesKicksAvailable:Ljava/lang/String;

.field private receiptKicksAvailable:Ljava/lang/String;

.field private receiptLink:Ljava/lang/String;

.field private receiptPulseAnimation:Landroid/view/animation/AnimationSet;

.field private receiptScanLimitReached:Z

.field private scanKicksAvailable:I

.field private scanKicksTotal:I

.field private scanLink:Ljava/lang/String;

.field private scanPulseAnimation:Landroid/view/animation/AnimationSet;

.field private scannedToday:Z

.field private urlDispatcherRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/url/URLDispatcher;",
            ">;"
        }
    .end annotation
.end field

.field private userAccount:Lcom/shopkick/app/account/UserAccount;

.field private viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

.field private walkedInToday:Z

.field private walkinKicksAvailable:I

.field private walkinKicksTotal:I

.field private walkinLink:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/awards/AwardsManager;)V
    .locals 1

    .line 163
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    const/4 v0, 0x0

    .line 68
    iput v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkinKicksAvailable:I

    .line 69
    iput v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkinKicksTotal:I

    .line 70
    iput-boolean v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkedInToday:Z

    .line 71
    iput v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->daysUntilNextWalkin:I

    .line 72
    iput v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->scanKicksAvailable:I

    .line 73
    iput v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->scanKicksTotal:I

    .line 74
    iput-boolean v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->scannedToday:Z

    .line 75
    iput-boolean v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->hasBNC:Z

    .line 76
    iput-boolean v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->isVisaOnly:Z

    .line 78
    iput-boolean v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->hasReceiptKicks:Z

    .line 80
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->kicksEarnedToday:Ljava/lang/Integer;

    .line 164
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->context:Landroid/content/Context;

    .line 165
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->urlDispatcherRef:Ljava/lang/ref/WeakReference;

    .line 166
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 167
    iput-object p4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 168
    iput-object p5, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    return-void
.end method

.method public static animatePulseGlowOnView(Landroid/view/View;IDLandroid/view/animation/Animation$AnimationListener;)Landroid/view/animation/AnimationSet;
    .locals 23

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p4

    const-wide/high16 v3, 0x4059000000000000L    # 100.0

    div-double v3, v3, p2

    double-to-long v3, v3

    const-wide/high16 v5, 0x4079000000000000L    # 400.0

    div-double v5, v5, p2

    double-to-long v5, v5

    .line 130
    new-instance v7, Landroid/view/animation/AnimationSet;

    const/4 v8, 0x1

    invoke-direct {v7, v8}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 131
    new-instance v9, Landroid/view/animation/AlphaAnimation;

    const v10, 0x3f333333    # 0.7f

    const/4 v11, 0x0

    invoke-direct {v9, v11, v10}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v12, 0x1

    .line 132
    invoke-virtual {v9, v12, v13}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    int-to-long v12, v1

    add-long/2addr v12, v3

    .line 133
    invoke-virtual {v9, v12, v13}, Landroid/view/animation/AlphaAnimation;->setStartOffset(J)V

    .line 134
    invoke-virtual {v7, v9}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 135
    new-instance v9, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v9, v10, v11}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 136
    invoke-virtual {v9, v5, v6}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    add-int/2addr v1, v8

    int-to-long v10, v1

    add-long/2addr v10, v3

    .line 137
    invoke-virtual {v9, v10, v11}, Landroid/view/animation/AlphaAnimation;->setStartOffset(J)V

    .line 138
    invoke-virtual {v7, v9}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 139
    new-instance v1, Landroid/view/animation/ScaleAnimation;

    const/high16 v15, 0x3f800000    # 1.0f

    const v16, 0x3fb33333    # 1.4f

    const/high16 v17, 0x3f800000    # 1.0f

    const v18, 0x3fb33333    # 1.4f

    const/16 v19, 0x1

    const/high16 v20, 0x3f000000    # 0.5f

    const/16 v21, 0x1

    const/high16 v22, 0x3f000000    # 0.5f

    move-object v14, v1

    invoke-direct/range {v14 .. v22}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    .line 147
    invoke-virtual {v1, v5, v6}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 148
    invoke-virtual {v1, v12, v13}, Landroid/view/animation/ScaleAnimation;->setStartOffset(J)V

    .line 149
    invoke-virtual {v7, v1}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 150
    invoke-virtual {v7, v8}, Landroid/view/animation/AnimationSet;->setFillAfter(Z)V

    if-eqz v2, :cond_0

    .line 152
    invoke-virtual {v7, v2}, Landroid/view/animation/AnimationSet;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    :cond_0
    const/4 v1, 0x0

    .line 154
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 155
    invoke-virtual {v0, v7}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-object v7
.end method

.method private configureViewForAnimation()V
    .locals 5

    .line 498
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const v1, 0x7f0903a6

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    .line 499
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const v2, 0x7f0903a4

    invoke-virtual {v1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v1

    .line 500
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const v3, 0x7f0903dc

    invoke-virtual {v2, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v2

    .line 501
    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const v4, 0x7f09081d

    invoke-virtual {v3, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v3

    const-string v4, ""

    .line 502
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 v2, 0x8

    .line 503
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    const/4 v0, 0x4

    .line 504
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 505
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method private getTextWidth(Landroid/widget/TextView;Ljava/lang/String;)F
    .locals 0

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1

    .line 722
    :cond_0
    invoke-virtual {p1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object p1

    .line 723
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result p1

    return p1
.end method

.method public static kicksEarnedType(IIZ)I
    .locals 0

    if-lez p0, :cond_3

    if-lez p1, :cond_1

    if-eqz p2, :cond_0

    const/4 p0, 0x3

    goto :goto_0

    :cond_0
    const/4 p0, 0x2

    :goto_0
    return p0

    :cond_1
    if-eqz p2, :cond_2

    const/4 p0, 0x4

    goto :goto_1

    :cond_2
    const/4 p0, 0x5

    :goto_1
    return p0

    :cond_3
    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic lambda$maybeSetupAndShowRussellButton$236(Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;Landroid/view/View;)V
    .locals 4

    .line 404
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->urlDispatcherRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/url/URLDispatcher;

    if-nez p1, :cond_0

    return-void

    .line 409
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "chain_id"

    .line 410
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->chainId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "location_id"

    .line 411
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->locationId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "location_address"

    .line 412
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->address:Ljava/lang/String;

    const-string v3, "\n"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 413
    new-instance v1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v2, Lcom/shopkick/app/activities/DetailsActivity;

    const-class v3, Lcom/shopkick/app/more/ReportWalkinProblemScreen;

    invoke-direct {v1, v2, v3, v0}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 417
    invoke-virtual {v1}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    .line 418
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->logRussellButtonClick()V

    return-void
.end method

.method private logRussellButtonClick()V
    .locals 7

    .line 436
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x117

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x4e

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 437
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->locationId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLocationId(Ljava/lang/String;)V

    .line 438
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->chainId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 439
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->address:Ljava/lang/String;

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setWalkinIssueAddress(Ljava/lang/String;)V

    .line 441
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 443
    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLat(Ljava/lang/Double;)V

    .line 444
    invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLng(Ljava/lang/Double;)V

    .line 445
    invoke-virtual {v1}, Landroid/location/Location;->getAccuracy()F

    move-result v3

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAccuracy(Ljava/lang/Double;)V

    .line 446
    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-virtual {v1}, Landroid/location/Location;->getTime()J

    move-result-wide v5

    sub-long/2addr v3, v5

    long-to-int v1, v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCoordAge(Ljava/lang/Integer;)V

    .line 449
    :cond_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v1

    .line 450
    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->context:Landroid/content/Context;

    const-string v4, "android.permission.BLUETOOTH"

    invoke-static {v3, v4}, Landroid/support/v4/content/PermissionChecker;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    const/4 v4, -0x1

    const/4 v5, 0x1

    if-ne v3, v4, :cond_1

    const/4 v1, -0x2

    .line 453
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBtleAntennaState(Ljava/lang/Integer;)V

    goto :goto_0

    :cond_1
    if-nez v1, :cond_2

    .line 456
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBtleAntennaState(Ljava/lang/Integer;)V

    goto :goto_0

    .line 457
    :cond_2
    invoke-virtual {v1}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 459
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBtleAntennaState(Ljava/lang/Integer;)V

    goto :goto_0

    .line 462
    :cond_3
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBtleAntennaState(Ljava/lang/Integer;)V

    .line 465
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->context:Landroid/content/Context;

    const-string v2, "location"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/location/LocationManager;

    .line 467
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->context:Landroid/content/Context;

    const-string v3, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {v2, v3}, Landroid/support/v4/content/PermissionChecker;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setGpsPermissionStatus(Ljava/lang/Integer;)V

    const-string v2, "gps"

    .line 469
    invoke-virtual {v1, v2}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setGpsOn(Ljava/lang/Boolean;)V

    const-string v2, "passive"

    .line 470
    invoke-virtual {v1, v2}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setPassiveLocationProviderOn(Ljava/lang/Boolean;)V

    .line 471
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNetworkStatus(Ljava/lang/Integer;)V

    const-string v2, "network"

    .line 472
    invoke-virtual {v1, v2}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x3

    .line 473
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNetworkStatus(Ljava/lang/Integer;)V

    .line 475
    :cond_4
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->context:Landroid/content/Context;

    const-string v2, "connectivity"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    .line 477
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 478
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/NetworkInfo;->getType()I

    move-result v1

    if-ne v1, v5, :cond_5

    const/4 v1, 0x2

    .line 479
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNetworkStatus(Ljava/lang/Integer;)V

    .line 481
    :cond_5
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->context:Landroid/content/Context;

    const-string v2, "audio"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/media/AudioManager;

    .line 482
    invoke-virtual {v1}, Landroid/media/AudioManager;->isMicrophoneMute()Z

    move-result v1

    xor-int/2addr v1, v5

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setMicEnabled(Ljava/lang/Boolean;)V

    .line 484
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 485
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    invoke-virtual {v2}, Lcom/shopkick/app/awards/AwardsManager;->getVisibleLocationRequests()Ljava/util/ArrayList;

    move-result-object v2

    .line 486
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/queue/LocationApiRequestWrapper;

    .line 487
    iget-object v3, v3, Lcom/shopkick/app/queue/LocationApiRequestWrapper;->presenceCode:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 490
    :cond_6
    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setWalkinIssuePendingAwards(Ljava/util/ArrayList;)V

    .line 492
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->context:Landroid/content/Context;

    const-string v2, "android.permission.RECORD_AUDIO"

    invoke-static {v1, v2}, Landroid/support/v4/content/PermissionChecker;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setMicPermissionStatus(Ljava/lang/Integer;)V

    .line 494
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method private maybeSetupAndShowRussellButton()V
    .locals 5

    .line 395
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isRussellButtonOnStoreDetailsEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 396
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const v1, 0x7f0905f4

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object v0

    .line 397
    iget v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkinKicksAvailable:I

    if-gtz v1, :cond_0

    const/16 v1, 0x8

    .line 399
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 402
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 403
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$StoreDetailsKicksTileViewHolderConfigurator$xg7oK5Z3lwZJqpInm1QmVDFRJVw;

    invoke-direct {v2, p0}, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$StoreDetailsKicksTileViewHolderConfigurator$xg7oK5Z3lwZJqpInm1QmVDFRJVw;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;)V

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 422
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v3, 0x117

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 423
    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->locationId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLocationId(Ljava/lang/String;)V

    .line 424
    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->chainId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 425
    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->address:Ljava/lang/String;

    const-string v4, "\n"

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    aget-object v1, v3, v1

    invoke-virtual {v2, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setWalkinIssueAddress(Ljava/lang/String;)V

    .line 427
    new-instance v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v1}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 428
    invoke-virtual {p0, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 429
    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    invoke-virtual {v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->verticalListDisplayPos:Ljava/lang/Integer;

    .line 430
    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, v2, v3, v1}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private populateKicksView(Lcom/shopkick/app/widget/UserEventRelativeLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Ljava/lang/String;IIIILjava/lang/String;)V
    .locals 14

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move/from16 v8, p11

    const v9, 0x7f060022

    const v10, 0x7f0600ca

    const v11, 0x7f0600c6

    const/4 v12, 0x0

    const/16 v13, 0x8

    packed-switch p8, :pswitch_data_0

    if-eqz v2, :cond_4

    .line 564
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 565
    iget-object v7, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7, v11}, Landroid/content/res/Resources;->getColor(I)I

    move-result v7

    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_0

    :pswitch_0
    if-eqz v2, :cond_0

    .line 523
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 524
    iget-object v7, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7, v11}, Landroid/content/res/Resources;->getColor(I)I

    move-result v7

    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 526
    :cond_0
    iget-object v2, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 527
    invoke-virtual {v4, v13}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 528
    invoke-virtual {v5, v12}, Landroid/widget/ImageView;->setVisibility(I)V

    if-eqz v6, :cond_5

    .line 531
    invoke-virtual {v6, v13}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_1

    :pswitch_1
    if-eqz v2, :cond_1

    .line 536
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 537
    iget-object v7, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v7

    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 539
    :cond_1
    iget-object v2, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 540
    invoke-virtual {v4, v13}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 541
    invoke-virtual {v5, v12}, Landroid/widget/ImageView;->setVisibility(I)V

    if-eqz v6, :cond_5

    .line 542
    iget-boolean v2, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->isInWalkinAnimation:Z

    if-eqz v2, :cond_2

    const/16 v2, 0x70

    if-eq v8, v2, :cond_5

    .line 544
    :cond_2
    invoke-virtual {v6, v12}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    :pswitch_2
    if-eqz v2, :cond_3

    .line 549
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 550
    iget-object v7, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v7

    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 552
    :cond_3
    iget-object v2, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextColor(I)V

    move/from16 v2, p10

    .line 553
    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 554
    invoke-virtual {v4, v12}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 555
    invoke-virtual {v5, v13}, Landroid/widget/ImageView;->setVisibility(I)V

    if-eqz v6, :cond_5

    .line 557
    invoke-virtual {v6, v13}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 567
    :cond_4
    :goto_0
    iget-object v2, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v11}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextColor(I)V

    move/from16 v2, p9

    .line 568
    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 569
    invoke-virtual {v4, v12}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 570
    invoke-virtual {v5, v13}, Landroid/widget/ImageView;->setVisibility(I)V

    if-eqz v6, :cond_5

    .line 572
    invoke-virtual {v6, v13}, Landroid/widget/TextView;->setVisibility(I)V

    .line 576
    :cond_5
    :goto_1
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static/range {p11 .. p11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 577
    invoke-static/range {p8 .. p8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setKicksEarnedState(Ljava/lang/Integer;)V

    .line 578
    new-instance v3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v3}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 579
    invoke-virtual {p0, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    const/4 v4, 0x1

    .line 580
    iput-boolean v4, v3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 581
    iget-object v4, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    invoke-virtual {v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->verticalListDisplayPos:Ljava/lang/Integer;

    .line 582
    iget-object v4, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, v2, v4, v3}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 583
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator$KicksTileV2ViewClickListener;

    move-object/from16 v3, p12

    invoke-direct {v2, p0, v3, v8}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator$KicksTileV2ViewClickListener;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;Ljava/lang/String;I)V

    invoke-virtual {p1, v2}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public animateCheckAndKicksEarnedNumber(I)V
    .locals 16

    move-object/from16 v0, p0

    const/4 v1, 0x0

    .line 616
    iput-boolean v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->isInWalkinAnimation:Z

    .line 617
    iget-object v2, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    if-eqz v2, :cond_1

    const v3, 0x7f0903dc

    .line 618
    invoke-virtual {v2, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v6

    .line 619
    iget-object v2, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const v3, 0x7f0903de

    invoke-virtual {v2, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    .line 620
    iget-object v3, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const v4, 0x7f0903a4

    invoke-virtual {v3, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v3

    .line 621
    iget v4, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkinKicksAvailable:I

    sub-int v4, v4, p1

    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput v4, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkinKicksAvailable:I

    const/4 v4, 0x1

    .line 622
    iput-boolean v4, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkedInToday:Z

    .line 624
    new-instance v5, Landroid/view/animation/ScaleAnimation;

    const v8, 0x3f59999a    # 0.85f

    const/high16 v9, 0x3f800000    # 1.0f

    const v10, 0x3f59999a    # 0.85f

    const/high16 v11, 0x3f800000    # 1.0f

    const/4 v12, 0x1

    const/high16 v13, 0x3f000000    # 0.5f

    const/4 v14, 0x1

    const/high16 v15, 0x3f000000    # 0.5f

    move-object v7, v5

    invoke-direct/range {v7 .. v15}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    const-wide/16 v7, 0xc8

    .line 632
    invoke-virtual {v5, v7, v8}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 633
    new-instance v7, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v7}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v5, v7}, Landroid/view/animation/ScaleAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 634
    invoke-virtual {v5, v4}, Landroid/view/animation/ScaleAnimation;->setFillAfter(Z)V

    .line 635
    invoke-virtual {v3, v5}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 636
    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 638
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 639
    iget v2, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkinKicksTotal:I

    iget v3, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkinKicksAvailable:I

    iget-boolean v4, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkedInToday:Z

    invoke-static {v2, v3, v4}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->kicksEarnedType(IIZ)I

    move-result v2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_0

    .line 641
    iget-object v2, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const v3, 0x7f09081d

    invoke-virtual {v2, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v2

    .line 642
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 645
    :cond_0
    iget-object v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->kicksEarnedToday:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    sub-int v1, v1, p1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 v1, 0x5dc

    mul-int/lit8 v2, p1, 0xa

    .line 648
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    int-to-long v2, v1

    .line 649
    new-instance v9, Lcom/shopkick/app/animation/KicksEarnedTimer;

    const-wide/16 v4, 0xa

    iget-object v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->kicksEarnedToday:Ljava/lang/Integer;

    .line 653
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v8

    move-object v1, v9

    move/from16 v7, p1

    invoke-direct/range {v1 .. v8}, Lcom/shopkick/app/animation/KicksEarnedTimer;-><init>(JJLandroid/widget/TextView;II)V

    .line 654
    invoke-virtual {v9}, Lcom/shopkick/app/animation/KicksEarnedTimer;->start()Landroid/os/CountDownTimer;

    :cond_1
    return-void
.end method

.method public configureCellForFailedWalkin()V
    .locals 2

    const/4 v0, 0x0

    .line 659
    iput-boolean v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->isInWalkinAnimation:Z

    .line 660
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    if-nez v1, :cond_0

    return-void

    .line 665
    :cond_0
    iput v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkinKicksAvailable:I

    return-void
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c01c7

    return v0
.end method

.method public hasAvailableKicks()Z
    .locals 4

    .line 740
    iget v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkinKicksTotal:I

    iget v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkinKicksAvailable:I

    iget-boolean v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkedInToday:Z

    invoke-static {v0, v1, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->kicksEarnedType(IIZ)I

    move-result v0

    .line 741
    iget v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->scanKicksTotal:I

    iget v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->scanKicksAvailable:I

    iget-boolean v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->scannedToday:Z

    invoke-static {v1, v2, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->kicksEarnedType(IIZ)I

    move-result v1

    .line 742
    iget-boolean v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->hasBNC:Z

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    const/4 v2, 0x2

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    if-ne v0, v3, :cond_2

    if-ne v1, v3, :cond_2

    if-ne v2, v3, :cond_2

    .line 744
    iget-boolean v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->hasReceiptKicks:Z

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :cond_2
    :goto_1
    return v3
.end method

.method public hasWalkinKicksAvailable()Z
    .locals 3

    .line 749
    iget v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkinKicksTotal:I

    iget v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkinKicksAvailable:I

    iget-boolean v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkedInToday:Z

    invoke-static {v0, v1, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->kicksEarnedType(IIZ)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public kicksViewTapped(Ljava/lang/String;I)V
    .locals 3

    .line 754
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->urlDispatcherRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/url/URLDispatcher;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 756
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "origin_element"

    .line 757
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, v2, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 758
    invoke-virtual {v0, p1, v1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;Ljava/util/Map;)Z

    :cond_0
    return-void
.end method

.method public maybeStartReceiptPulseAnimationAfterScan()V
    .locals 4

    .line 692
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->receiptKicksAvailable:Ljava/lang/String;

    if-eqz v0, :cond_3

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    if-nez v0, :cond_0

    goto :goto_0

    .line 695
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkedInToday:Z

    if-nez v0, :cond_1

    iget v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkinKicksAvailable:I

    if-nez v0, :cond_2

    .line 696
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const v1, 0x7f090575

    .line 697
    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x1f4

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    invoke-static {v0, v1, v2, v3, p0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->animatePulseGlowOnView(Landroid/view/View;IDLandroid/view/animation/Animation$AnimationListener;)Landroid/view/animation/AnimationSet;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->receiptPulseAnimation:Landroid/view/animation/AnimationSet;

    :cond_2
    return-void

    :cond_3
    :goto_0
    return-void
.end method

.method public maybeStartReceiptPulseAnimationAfterWalkin()V
    .locals 4

    .line 679
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->receiptKicksAvailable:Ljava/lang/String;

    if-eqz v0, :cond_3

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    if-nez v0, :cond_0

    goto :goto_0

    .line 682
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->scannedToday:Z

    if-nez v0, :cond_1

    iget v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->scanKicksAvailable:I

    if-gtz v1, :cond_2

    if-nez v0, :cond_2

    .line 683
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const v1, 0x7f090575

    .line 684
    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x1f4

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    invoke-static {v0, v1, v2, v3, p0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->animatePulseGlowOnView(Landroid/view/View;IDLandroid/view/animation/Animation$AnimationListener;)Landroid/view/animation/AnimationSet;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->receiptPulseAnimation:Landroid/view/animation/AnimationSet;

    :cond_2
    return-void

    :cond_3
    :goto_0
    return-void
.end method

.method public maybeStartScanPulseAnimation()V
    .locals 4

    .line 669
    iget v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->scanKicksAvailable:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    if-eqz v0, :cond_0

    const v1, 0x7f090576

    .line 671
    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x1f4

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    invoke-static {v0, v1, v2, v3, p0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->animatePulseGlowOnView(Landroid/view/View;IDLandroid/view/animation/Animation$AnimationListener;)Landroid/view/animation/AnimationSet;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->scanPulseAnimation:Landroid/view/animation/AnimationSet;

    :cond_0
    return-void
.end method

.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 4

    .line 765
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->scanPulseAnimation:Landroid/view/animation/AnimationSet;

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    const/16 v3, 0x1f4

    if-ne v0, p1, :cond_0

    .line 766
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const v0, 0x7f090576

    .line 767
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v3, v1, v2, p0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->animatePulseGlowOnView(Landroid/view/View;IDLandroid/view/animation/Animation$AnimationListener;)Landroid/view/animation/AnimationSet;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->scanPulseAnimation:Landroid/view/animation/AnimationSet;

    goto :goto_0

    .line 771
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->receiptPulseAnimation:Landroid/view/animation/AnimationSet;

    if-ne v0, p1, :cond_1

    .line 772
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const v0, 0x7f090575

    .line 773
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v3, v1, v2, p0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->animatePulseGlowOnView(Landroid/view/View;IDLandroid/view/animation/Animation$AnimationListener;)Landroid/view/animation/AnimationSet;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->receiptPulseAnimation:Landroid/view/animation/AnimationSet;

    :cond_1
    :goto_0
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 21

    move-object/from16 v13, p0

    move-object/from16 v14, p1

    .line 228
    invoke-virtual/range {p0 .. p1}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    if-nez p2, :cond_0

    return-void

    .line 234
    :cond_0
    iput-object v14, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const v0, 0x7f0903f7

    .line 236
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    const v0, 0x7f0903a7

    .line 237
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/shopkick/app/widget/SKTextView;

    const/4 v12, 0x4

    .line 238
    invoke-virtual {v15, v12}, Lcom/shopkick/app/widget/SKTextView;->setDefaultFont(I)Z

    const v0, 0x7f0903a8

    .line 239
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v3

    const v0, 0x7f0903a6

    .line 240
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v4

    const v0, 0x7f0903a4

    .line 241
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v5

    const v0, 0x7f09081d

    .line 242
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v6

    .line 243
    iget v0, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkinKicksTotal:I

    iget v2, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkinKicksAvailable:I

    iget-boolean v7, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkedInToday:Z

    invoke-static {v0, v2, v7}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->kicksEarnedType(IIZ)I

    move-result v11

    .line 244
    iget v0, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkinKicksAvailable:I

    if-gez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v7, v0

    const v9, 0x7f080324

    const v10, 0x7f08031f

    const/16 v16, 0x70

    .line 246
    iget-object v8, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkinLink:Ljava/lang/String;

    move-object/from16 v0, p0

    move-object v2, v15

    move-object/from16 v17, v8

    move v8, v11

    move/from16 v18, v11

    move/from16 v11, v16

    move-object/from16 v12, v17

    invoke-direct/range {v0 .. v12}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->populateKicksView(Lcom/shopkick/app/widget/UserEventRelativeLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Ljava/lang/String;IIIILjava/lang/String;)V

    .line 258
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15}, Lcom/shopkick/app/widget/SKTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-boolean v1, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->bonusWalkinKicksAvailable:Z

    if-eqz v1, :cond_2

    const-string v1, "+"

    goto :goto_1

    :cond_2
    const-string v1, ""

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v15, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    const/4 v0, 0x5

    const v1, 0x7f09081b

    const v2, 0x7f0903a9

    const/4 v12, 0x1

    const/16 v11, 0x8

    const/4 v10, 0x0

    move/from16 v3, v18

    if-ne v3, v0, :cond_3

    .line 261
    iget v0, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->daysUntilNextWalkin:I

    if-lez v0, :cond_3

    iget-boolean v0, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkedInToday:Z

    if-nez v0, :cond_3

    .line 262
    invoke-virtual {v15, v11}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 263
    invoke-virtual {v14, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    iget-object v3, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->context:Landroid/content/Context;

    .line 264
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0f003d

    iget v5, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->daysUntilNextWalkin:I

    new-array v6, v12, [Ljava/lang/Object;

    .line 267
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v10

    .line 265
    invoke-virtual {v3, v4, v5, v6}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 264
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 268
    invoke-virtual {v14, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setVisibility(I)V

    .line 269
    invoke-virtual {v14, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f0905f4

    .line 272
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object v0

    invoke-virtual {v0, v11}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    goto :goto_2

    .line 274
    :cond_3
    invoke-virtual {v15, v10}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 275
    invoke-virtual {v14, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setVisibility(I)V

    .line 276
    invoke-virtual {v14, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v11}, Landroid/view/View;->setVisibility(I)V

    .line 278
    invoke-direct/range {p0 .. p0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->maybeSetupAndShowRussellButton()V

    :goto_2
    const v0, 0x7f0903f6

    .line 281
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    const v0, 0x7f0903a2

    .line 282
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/shopkick/app/widget/SKTextView;

    const/4 v15, 0x4

    .line 283
    invoke-virtual {v2, v15}, Lcom/shopkick/app/widget/SKTextView;->setDefaultFont(I)Z

    const v0, 0x7f0903a3

    .line 284
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v3

    const v0, 0x7f0903a1

    .line 285
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v4

    const v0, 0x7f09039f

    .line 286
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v5

    const v0, 0x7f09060f

    .line 287
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v6

    .line 288
    iget v0, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->scanKicksTotal:I

    iget v7, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->scanKicksAvailable:I

    iget-boolean v8, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->scannedToday:Z

    invoke-static {v0, v7, v8}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->kicksEarnedType(IIZ)I

    move-result v8

    .line 291
    iget-object v0, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    sget-object v7, Ljava/util/Locale;->GERMANY:Ljava/util/Locale;

    invoke-virtual {v0, v7}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v9, 0x2

    if-eqz v0, :cond_4

    const/high16 v0, 0x41000000    # 8.0f

    .line 292
    invoke-virtual {v6, v9, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 295
    :cond_4
    iget v0, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->scanKicksAvailable:I

    .line 301
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    const v16, 0x7f080297

    const v17, 0x7f080296

    const/16 v18, 0x71

    iget-object v0, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->scanLink:Ljava/lang/String;

    move-object/from16 v19, v0

    move-object/from16 v0, p0

    move/from16 v20, v9

    move/from16 v9, v16

    move/from16 v10, v17

    move v15, v11

    move/from16 v11, v18

    move v15, v12

    move-object/from16 v12, v19

    .line 295
    invoke-direct/range {v0 .. v12}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->populateKicksView(Lcom/shopkick/app/widget/UserEventRelativeLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Ljava/lang/String;IIIILjava/lang/String;)V

    .line 309
    iget-object v0, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const v1, 0x7f0903f0

    if-eq v0, v15, :cond_5

    .line 310
    invoke-virtual {v14, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_5

    .line 312
    :cond_5
    invoke-virtual {v14, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    const v0, 0x7f09038a

    .line 313
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/shopkick/app/widget/SKTextView;

    const/4 v0, 0x4

    .line 314
    invoke-virtual {v2, v0}, Lcom/shopkick/app/widget/SKTextView;->setDefaultFont(I)Z

    const v0, 0x7f09038b

    .line 315
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v3

    .line 316
    iget-object v0, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->chainId:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->chainId:Ljava/lang/String;

    const-string v4, "40560331"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const v0, 0x7f110175

    .line 317
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(I)V

    :cond_6
    const v0, 0x7f090389

    .line 319
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v4

    const v0, 0x7f090387

    .line 320
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v5

    const/4 v6, 0x0

    .line 322
    iget-boolean v0, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->hasBNC:Z

    if-eqz v0, :cond_7

    move/from16 v8, v20

    goto :goto_3

    :cond_7
    move v8, v15

    .line 324
    :goto_3
    iget-object v7, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->purchasesKicksAvailable:Ljava/lang/String;

    const v9, 0x7f080259

    iget-boolean v0, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->isVisaOnly:Z

    if-eqz v0, :cond_8

    const v0, 0x7f08025a

    goto :goto_4

    :cond_8
    const v0, 0x7f080258

    :goto_4
    move v10, v0

    const/16 v11, 0x72

    iget-object v12, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->bncLink:Ljava/lang/String;

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v12}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->populateKicksView(Lcom/shopkick/app/widget/UserEventRelativeLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Ljava/lang/String;IIIILjava/lang/String;)V

    .line 338
    :goto_5
    iget-object v0, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->hideStoreDetailsReceiptKicksSummary:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const v1, 0x7f0903f5

    if-eqz v0, :cond_9

    .line 339
    invoke-virtual {v14, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_9

    .line 341
    :cond_9
    invoke-virtual {v14, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    const v0, 0x7f09039d

    .line 342
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/shopkick/app/widget/SKTextView;

    const/4 v0, 0x4

    .line 343
    invoke-virtual {v2, v0}, Lcom/shopkick/app/widget/SKTextView;->setDefaultFont(I)Z

    const v3, 0x7f09039e

    .line 344
    invoke-virtual {v14, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v3

    const v4, 0x7f09039c

    .line 345
    invoke-virtual {v14, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v4

    const v5, 0x7f09039a

    .line 346
    invoke-virtual {v14, v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v5

    const/4 v6, 0x0

    .line 348
    iget-boolean v7, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->hasReceiptKicks:Z

    if-eqz v7, :cond_a

    move/from16 v12, v20

    goto :goto_6

    :cond_a
    move v12, v15

    .line 349
    :goto_6
    iget-boolean v7, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->receiptScanLimitReached:Z

    if-eqz v7, :cond_b

    goto :goto_7

    :cond_b
    move v0, v12

    .line 352
    :goto_7
    iget-object v7, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->receiptKicksAvailable:Ljava/lang/String;

    if-eqz v7, :cond_c

    const-string v8, "0"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    move v8, v15

    goto :goto_8

    :cond_c
    move v8, v0

    .line 356
    :goto_8
    iget-object v7, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->receiptKicksAvailable:Ljava/lang/String;

    const v9, 0x7f080260

    const v10, 0x7f08025f

    const/16 v11, 0xb7

    iget-object v12, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->receiptLink:Ljava/lang/String;

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v12}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->populateKicksView(Lcom/shopkick/app/widget/UserEventRelativeLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Ljava/lang/String;IIIILjava/lang/String;)V

    :goto_9
    const v0, 0x7f0903de

    .line 370
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0903dc

    .line 371
    invoke-virtual {v14, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v1

    .line 372
    iget-object v2, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->kicksEarnedToday:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-lez v2, :cond_d

    const v2, 0x7f0903dd

    .line 373
    invoke-virtual {v14, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v2

    .line 374
    iget-object v3, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->kicksEarnedToday:Ljava/lang/Integer;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v13, v2, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->getTextWidth(Landroid/widget/TextView;Ljava/lang/String;)F

    move-result v3

    .line 376
    invoke-virtual {v2}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    const/16 v5, 0xe

    .line 378
    invoke-static {v5, v2}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v5

    float-to-int v3, v3

    const/16 v6, 0x28

    .line 379
    invoke-static {v6, v2}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v6

    add-int/2addr v3, v6

    const/4 v6, 0x0

    .line 377
    invoke-virtual {v4, v6, v5, v3, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 382
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 383
    iget-object v2, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->kicksEarnedToday:Ljava/lang/Integer;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 384
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    goto :goto_a

    :cond_d
    const-string v2, "0"

    .line 386
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 v1, 0x8

    .line 387
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 389
    :goto_a
    iget-boolean v0, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->isInWalkinAnimation:Z

    if-eqz v0, :cond_e

    .line 390
    invoke-direct/range {p0 .. p0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->configureViewForAnimation()V

    :cond_e
    return-void
.end method

.method public prepareForWalkinAnimation(Ljava/lang/Integer;)V
    .locals 1

    const/4 v0, 0x1

    .line 608
    iput-boolean v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->isInWalkinAnimation:Z

    .line 609
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    if-eqz v0, :cond_0

    .line 610
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->configureViewForAnimation()V

    :cond_0
    if-eqz p1, :cond_1

    .line 612
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->kicksEarnedToday:Ljava/lang/Integer;

    return-void
.end method

.method public setData(IIZIIIZZLjava/lang/String;ZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    move-object v0, p0

    move v1, p1

    .line 193
    iput v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkinKicksAvailable:I

    move v1, p2

    .line 194
    iput v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkinKicksTotal:I

    move v1, p3

    .line 195
    iput-boolean v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkedInToday:Z

    move v1, p4

    .line 196
    iput v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->daysUntilNextWalkin:I

    move v1, p5

    .line 197
    iput v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->scanKicksAvailable:I

    move v1, p6

    .line 198
    iput v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->scanKicksTotal:I

    move v1, p7

    .line 199
    iput-boolean v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->scannedToday:Z

    move v1, p8

    .line 200
    iput-boolean v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->hasBNC:Z

    move v1, p10

    .line 201
    iput-boolean v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->isVisaOnly:Z

    move-object v1, p9

    .line 202
    iput-object v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->purchasesKicksAvailable:Ljava/lang/String;

    move v1, p11

    .line 203
    iput-boolean v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->hasReceiptKicks:Z

    move-object v1, p12

    .line 204
    iput-object v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->receiptKicksAvailable:Ljava/lang/String;

    .line 205
    invoke-static {p13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->kicksEarnedToday:Ljava/lang/Integer;

    move-object/from16 v1, p14

    .line 206
    iput-object v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->walkinLink:Ljava/lang/String;

    move-object/from16 v1, p15

    .line 207
    iput-object v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->scanLink:Ljava/lang/String;

    move-object/from16 v1, p16

    .line 208
    iput-object v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->bncLink:Ljava/lang/String;

    move-object/from16 v1, p17

    .line 209
    iput-object v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->receiptLink:Ljava/lang/String;

    move/from16 v1, p18

    .line 210
    iput-boolean v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->receiptScanLimitReached:Z

    move-object/from16 v1, p19

    .line 211
    iput-object v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->chainId:Ljava/lang/String;

    move-object/from16 v1, p20

    .line 212
    iput-object v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->locationId:Ljava/lang/String;

    move-object/from16 v1, p21

    .line 213
    iput-object v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->address:Ljava/lang/String;

    move/from16 v1, p22

    .line 214
    iput-boolean v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->bonusWalkinKicksAvailable:Z

    return-void
.end method

.method public setScanKicksAvailable(I)V
    .locals 0

    .line 219
    iput p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->scanKicksAvailable:I

    return-void
.end method

.method public stopReceiptPulseAnimation()V
    .locals 2

    .line 705
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 706
    iput-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->receiptPulseAnimation:Landroid/view/animation/AnimationSet;

    const v1, 0x7f090575

    .line 707
    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    :cond_0
    return-void
.end method

.method public stopScanPulseAnimation()V
    .locals 2

    .line 712
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 713
    iput-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->scanPulseAnimation:Landroid/view/animation/AnimationSet;

    const v1, 0x7f090576

    .line 714
    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    :cond_0
    return-void
.end method

.method public walkinCheckmarkDimensions()[I
    .locals 4

    const/4 v0, 0x2

    .line 597
    new-array v0, v0, [I

    .line 598
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const v2, 0x7f0903a5

    .line 601
    invoke-virtual {v1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getFrameLayout(I)Landroid/widget/FrameLayout;

    move-result-object v1

    const/4 v2, 0x0

    .line 602
    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v3

    aput v3, v0, v2

    const/4 v2, 0x1

    .line 603
    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v1

    aput v1, v0, v2

    return-object v0
.end method

.method public walkinCheckmarkLocationInWindow()[I
    .locals 3

    const/4 v0, 0x2

    .line 587
    new-array v0, v0, [I

    .line 588
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;->viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const v2, 0x7f0903a5

    .line 591
    invoke-virtual {v1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getFrameLayout(I)Landroid/widget/FrameLayout;

    move-result-object v1

    .line 592
    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->getLocationInWindow([I)V

    return-object v0
.end method
