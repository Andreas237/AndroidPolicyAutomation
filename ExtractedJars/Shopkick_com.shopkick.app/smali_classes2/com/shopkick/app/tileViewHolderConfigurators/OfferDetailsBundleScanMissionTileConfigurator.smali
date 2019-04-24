.class public Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleScanMissionTileConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "OfferDetailsBundleScanMissionTileConfigurator.java"


# instance fields
.field private ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

.field private appScreenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private context:Landroid/content/Context;

.field private locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/screens/AppScreen;Landroid/content/Context;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/application/ClientFlagsManager;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 39
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleScanMissionTileConfigurator;->context:Landroid/content/Context;

    .line 40
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleScanMissionTileConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    .line 41
    iput-object p4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleScanMissionTileConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    .line 42
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleScanMissionTileConfigurator;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    .line 43
    iput-object p5, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleScanMissionTileConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 44
    iput-object p6, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleScanMissionTileConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c0137

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v9, p2

    .line 53
    invoke-virtual/range {p0 .. p1}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleScanMissionTileConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    .line 54
    iget-object v2, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleScanMissionTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f060022

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 55
    iget-object v3, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleScanMissionTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0600c6

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    .line 56
    iget-object v4, v9, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-static {v4}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v4

    if-eqz v4, :cond_2

    const v4, 0x7f0903e9

    .line 58
    invoke-virtual {v1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/widget/SKTextView;

    const v5, 0x7f0903e7

    .line 59
    invoke-virtual {v1, v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Lcom/shopkick/app/widget/SKTextView;

    const v6, 0x7f090066

    .line 60
    invoke-virtual {v1, v6}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v6

    const v7, 0x7f090091

    .line 61
    invoke-virtual {v1, v7}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/shopkick/app/widget/SKTextView;

    .line 63
    iget-object v8, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleScanMissionTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v10, 0x7f0f000e

    iget-object v11, v9, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    .line 64
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    .line 63
    invoke-virtual {v8, v10, v11}, Landroid/content/res/Resources;->getQuantityText(II)Ljava/lang/CharSequence;

    move-result-object v8

    invoke-virtual {v5, v8}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    iget-object v8, v9, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-static {v8}, Lcom/shopkick/app/util/NumberFormatter;->formatKicks(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    const v8, 0x7f0905ff

    .line 66
    invoke-virtual {v1, v8}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v8

    move-object v10, v8

    check-cast v10, Lcom/shopkick/app/widget/SKButton;

    .line 67
    iget-object v8, v9, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->missionBonusKicks:Ljava/lang/Integer;

    invoke-static {v8}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v8

    const/4 v11, 0x0

    if-eqz v8, :cond_0

    iget-object v8, v9, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->missionBonusKicks:Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    goto :goto_0

    :cond_0
    move v8, v11

    :goto_0
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 69
    iget-object v12, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleScanMissionTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v12

    const v13, 0x7f0f002a

    .line 70
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v14

    const/4 v15, 0x1

    new-array v15, v15, [Ljava/lang/Object;

    aput-object v8, v15, v11

    .line 69
    invoke-virtual {v12, v13, v14, v15}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 72
    iget-object v7, v9, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanCompleted:Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_1

    .line 74
    invoke-virtual {v4, v3}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 75
    invoke-virtual {v5, v3}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    const v2, 0x7f080081

    .line 76
    invoke-virtual {v6, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 77
    iget-object v2, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleScanMissionTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f080187

    .line 78
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 77
    invoke-virtual {v10, v2}, Lcom/shopkick/app/widget/SKButton;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 79
    invoke-virtual {v10, v11}, Lcom/shopkick/app/widget/SKButton;->setClickable(Z)V

    goto :goto_1

    .line 82
    :cond_1
    invoke-virtual {v4, v2}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 83
    invoke-virtual {v5, v2}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    const v2, 0x7f08007f

    .line 84
    invoke-virtual {v6, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 85
    iget-object v2, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleScanMissionTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f080091

    .line 86
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 85
    invoke-virtual {v10, v2}, Lcom/shopkick/app/widget/SKButton;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 87
    new-instance v11, Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;

    iget-object v12, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleScanMissionTileConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    new-instance v13, Lcom/shopkick/app/util/ScanClickUtils$GoToScanClickListener;

    iget-object v3, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleScanMissionTileConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    iget-object v4, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleScanMissionTileConfigurator;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    new-instance v6, Ljava/lang/ref/WeakReference;

    iget-object v2, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleScanMissionTileConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-direct {v6, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v7, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleScanMissionTileConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v2, v9, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    .line 94
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    move-object v2, v13

    move-object/from16 v5, p2

    invoke-direct/range {v2 .. v8}, Lcom/shopkick/app/util/ScanClickUtils$GoToScanClickListener;-><init>(Ljava/lang/ref/WeakReference;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/lang/ref/WeakReference;Lcom/shopkick/app/application/ClientFlagsManager;I)V

    invoke-direct {v11, v12, v9, v13}, Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;-><init>(Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View$OnClickListener;)V

    .line 87
    invoke-virtual {v10, v11}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 97
    :cond_2
    :goto_1
    invoke-virtual/range {p0 .. p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleScanMissionTileConfigurator;->setupLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method

.method protected setupLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 4

    const v0, 0x7f0905ff

    .line 102
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object v0

    .line 103
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0x153

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 104
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 105
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanCompleted:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    :goto_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNumScanKicks(Ljava/lang/Integer;)V

    .line 106
    invoke-virtual {p2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v2

    const-string v3, "bundle_id"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBundleId(Ljava/lang/String;)V

    .line 108
    new-instance v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 109
    invoke-virtual {p0, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleScanMissionTileConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    const/4 v3, 0x1

    .line 110
    iput-boolean v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 111
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object p1, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 112
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    iput-object p1, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 114
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleScanMissionTileConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, v1, p1, v2}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method
