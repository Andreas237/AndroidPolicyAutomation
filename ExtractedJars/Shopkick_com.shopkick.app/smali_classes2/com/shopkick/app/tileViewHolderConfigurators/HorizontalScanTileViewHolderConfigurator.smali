.class public Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalScanTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;
.source "HorizontalScanTileViewHolderConfigurator.java"

# interfaces
.implements Lcom/shopkick/app/cpg/LocationAvailableDialog$IScanGoToScreen;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$IScanV3TileAdapter;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/shoppinglists/ListAddController;Lcom/shopkick/app/application/AppPreferences;)V
    .locals 0

    .line 52
    invoke-direct/range {p0 .. p10}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$IScanV3TileAdapter;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/shoppinglists/ListAddController;Lcom/shopkick/app/application/AppPreferences;)V

    return-void
.end method

.method private getClickLogging(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;I)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;
    .locals 3

    .line 274
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x91

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 275
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 276
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalScanTileViewHolderConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-virtual {v1, p1}, Lcom/shopkick/app/account/AgeVerificationController;->getAgeVerificationStatus(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setMinimumAgeEligibility(Ljava/lang/Integer;)V

    .line 277
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productHierarchyId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductHierarchyId(Ljava/lang/String;)V

    .line 278
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanMissionId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setScanMissionId(Ljava/lang/String;)V

    .line 279
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNumKicks(Ljava/lang/Integer;)V

    .line 280
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setHorizontalListDataPos(Ljava/lang/Integer;)V

    .line 281
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetType:Ljava/lang/Integer;

    invoke-static {p2}, Lcom/shopkick/app/util/TileUtils;->getTileElement(Ljava/lang/Integer;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setWidgetType(Ljava/lang/Integer;)V

    .line 282
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-eqz p2, :cond_1

    .line 283
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanCompleted:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    move p2, v1

    goto :goto_0

    :cond_0
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    :goto_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNumScanKicks(Ljava/lang/Integer;)V

    .line 285
    :cond_1
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    if-eqz p2, :cond_3

    .line 286
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNumReceiptScanKicks(Ljava/lang/Integer;)V

    :cond_3
    return-object v0
.end method

.method private setupImpressionLogging(Lcom/shopkick/app/logging/UserEventImageView;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;ILandroid/view/View;)V
    .locals 4

    .line 234
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalScanTileViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    if-nez v0, :cond_0

    return-void

    .line 239
    :cond_0
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0x91

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 240
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 241
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productHierarchyId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductHierarchyId(Ljava/lang/String;)V

    .line 242
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanMissionId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setScanMissionId(Ljava/lang/String;)V

    .line 243
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNumKicks(Ljava/lang/Integer;)V

    .line 244
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setHorizontalListDataPos(Ljava/lang/Integer;)V

    .line 245
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetType:Ljava/lang/Integer;

    invoke-static {v2}, Lcom/shopkick/app/util/TileUtils;->getTileElement(Ljava/lang/Integer;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setWidgetType(Ljava/lang/Integer;)V

    .line 246
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    .line 247
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanCompleted:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    move v2, v3

    goto :goto_0

    :cond_1
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    :goto_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNumScanKicks(Ljava/lang/Integer;)V

    .line 249
    :cond_2
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    if-eqz v2, :cond_4

    .line 250
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    :goto_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNumReceiptScanKicks(Ljava/lang/Integer;)V

    .line 253
    :cond_4
    new-instance v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 254
    invoke-virtual {p0, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalScanTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 255
    iput-object p4, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 256
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    iput-object p4, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 257
    invoke-static {}, Lcom/shopkick/app/util/FeatureFlagHelper;->isMOATScanEnabled()Z

    move-result p4

    if-eqz p4, :cond_5

    .line 258
    iget-object p4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iput-object p4, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    const/4 p4, 0x1

    .line 259
    iput-boolean p4, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->useZMoatIID:Z

    .line 262
    :cond_5
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    iput-object p4, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->extraImpressionConstraintKeys:Ljava/util/ArrayList;

    .line 263
    invoke-virtual {p1}, Lcom/shopkick/app/logging/UserEventImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p4

    if-nez p4, :cond_6

    .line 264
    iget-object p4, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->extraImpressionConstraintKeys:Ljava/util/ArrayList;

    const-string v3, "ImageConstraintKey"

    invoke-virtual {p4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 266
    :cond_6
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    iput-object p3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->horizontalListDisplayPos:Ljava/lang/Integer;

    .line 267
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->trackingUrl:Ljava/lang/String;

    iput-object p2, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->trackingUrl:Ljava/lang/String;

    .line 269
    iget-object p2, v0, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, v1, p2, v2}, Lcom/shopkick/app/logging/UserEventImageView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c00e3

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 76
    iget-object v3, v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalScanTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f060022

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    .line 77
    iget-object v4, v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalScanTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0600c6

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    const v5, 0x7f0904ba

    .line 80
    invoke-virtual {v1, v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v5

    const v6, 0x7f090066

    .line 81
    invoke-virtual {v1, v6}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v6

    const v7, 0x7f0906bc

    .line 82
    invoke-virtual {v1, v7}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v7

    .line 83
    iget-object v8, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isSpecial:Ljava/lang/Boolean;

    invoke-static {v8}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v8

    const/16 v9, 0x8

    const/4 v10, 0x0

    if-eqz v8, :cond_0

    .line 84
    invoke-virtual {v7, v10}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 87
    :cond_0
    invoke-virtual {v7, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 91
    :goto_0
    iget-object v7, v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalScanTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v7}, Lcom/shopkick/app/util/FeatureFlagHelper;->areImageRecognitionScansEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v7

    .line 92
    invoke-static/range {p2 .. p2}, Lcom/shopkick/app/util/TileUtils;->isBarcodeScanAvailable(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v8

    .line 93
    iget-object v11, v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalScanTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v11, v2}, Lcom/shopkick/app/util/TileUtils;->isIRScanAvailable(Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v11

    .line 94
    iget-object v12, v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalScanTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v12, v2}, Lcom/shopkick/app/util/TileUtils;->isVideoAvailable(Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v12

    const v13, 0x7f090545

    .line 97
    invoke-virtual {v1, v13}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v13

    .line 98
    iget-object v14, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {v13, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 101
    iget-object v13, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-static {v13}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v13

    if-eqz v13, :cond_1

    iget-object v13, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    goto :goto_1

    :cond_1
    move v13, v10

    .line 102
    :goto_1
    iget-object v14, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanKicks:Ljava/lang/Integer;

    invoke-static {v14}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v14

    if-eqz v14, :cond_2

    iget-object v14, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanKicks:Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    goto :goto_2

    :cond_2
    move v14, v10

    .line 103
    :goto_2
    iget-object v15, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoKicks:Ljava/lang/Integer;

    invoke-static {v15}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v15

    if-eqz v15, :cond_3

    iget-object v15, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoKicks:Ljava/lang/Integer;

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v15

    goto :goto_3

    :cond_3
    move v15, v10

    .line 104
    :goto_3
    iget-object v9, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    invoke-static {v9}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v9

    if-eqz v9, :cond_4

    iget-object v9, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    goto :goto_4

    :cond_4
    move v9, v10

    :goto_4
    if-gtz v13, :cond_6

    if-eqz v7, :cond_5

    if-gtz v14, :cond_6

    if-lez v15, :cond_5

    goto :goto_5

    :cond_5
    const/16 v16, 0x0

    goto :goto_6

    :cond_6
    :goto_5
    const/16 v16, 0x1

    :goto_6
    if-lez v9, :cond_7

    const/16 v17, 0x1

    goto :goto_7

    :cond_7
    const/16 v17, 0x0

    :goto_7
    if-eqz v8, :cond_8

    add-int/lit8 v18, v13, 0x0

    goto :goto_8

    :cond_8
    const/16 v18, 0x0

    :goto_8
    if-eqz v11, :cond_9

    add-int v18, v18, v14

    :cond_9
    if-eqz v12, :cond_a

    add-int v18, v18, v15

    const/4 v10, 0x0

    goto :goto_9

    :cond_a
    const/4 v10, 0x0

    :goto_9
    add-int/2addr v13, v10

    if-eqz v7, :cond_b

    add-int/2addr v13, v14

    add-int/2addr v13, v15

    .line 133
    :cond_b
    invoke-virtual {v5, v10}, Landroid/widget/TextView;->setVisibility(I)V

    .line 134
    invoke-virtual {v6, v10}, Landroid/widget/ImageView;->setVisibility(I)V

    if-nez v8, :cond_c

    if-nez v11, :cond_c

    if-eqz v12, :cond_d

    .line 137
    :cond_c
    iget-object v7, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {v0, v7}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalScanTileViewHolderConfigurator;->isBBYScanLimitEnableAndReached(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_f

    :cond_d
    if-nez v16, :cond_e

    const/16 v7, 0x8

    .line 139
    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setVisibility(I)V

    .line 140
    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_a

    .line 143
    :cond_e
    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 144
    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setTextColor(I)V

    const v5, 0x7f080081

    .line 145
    invoke-virtual {v6, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_a

    .line 148
    :cond_f
    invoke-static/range {v18 .. v18}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 149
    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const v5, 0x7f08007f

    .line 150
    invoke-virtual {v6, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_a
    const v5, 0x7f090671

    .line 154
    invoke-virtual {v1, v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v5

    if-eqz v16, :cond_10

    if-eqz v17, :cond_10

    const/4 v6, 0x0

    goto :goto_b

    :cond_10
    const/16 v6, 0x8

    .line 155
    :goto_b
    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 159
    iget-object v5, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->minimumPurchaseRequirement:Ljava/lang/Integer;

    invoke-static {v5}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v5

    const v6, 0x7f090497

    const v7, 0x7f09058f

    if-eqz v5, :cond_11

    .line 160
    invoke-virtual {v1, v6}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v5

    .line 161
    invoke-virtual {v1, v7}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v6

    const/16 v8, 0x8

    invoke-virtual {v6, v8}, Landroid/view/View;->setVisibility(I)V

    goto :goto_c

    :cond_11
    const/16 v8, 0x8

    .line 163
    invoke-virtual {v1, v7}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v5

    .line 164
    invoke-virtual {v1, v6}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6, v8}, Landroid/view/View;->setVisibility(I)V

    .line 166
    :goto_c
    iget-object v6, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->minimumPurchaseRequirement:Ljava/lang/Integer;

    invoke-static {v6}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v6

    if-eqz v6, :cond_12

    const v6, 0x7f090498

    goto :goto_d

    :cond_12
    const v6, 0x7f090590

    :goto_d
    invoke-virtual {v1, v6}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v6

    const v7, 0x7f090589

    .line 168
    invoke-virtual {v1, v7}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v7

    const v8, 0x7f090494

    .line 169
    invoke-virtual {v1, v8}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v8

    if-eqz v17, :cond_15

    .line 171
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v9, 0x7f080262

    .line 176
    iget-object v10, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    if-eqz v10, :cond_13

    const v9, 0x7f080261

    move v3, v4

    .line 181
    :cond_13
    iget-object v4, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->minimumPurchaseRequirement:Ljava/lang/Integer;

    invoke-static {v4}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v4

    if-eqz v4, :cond_14

    .line 182
    iget-object v4, v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalScanTileViewHolderConfigurator;->context:Landroid/content/Context;

    const v10, 0x7f110630

    const/4 v11, 0x1

    new-array v12, v11, [Ljava/lang/Object;

    iget-object v11, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->minimumPurchaseRequirement:Ljava/lang/Integer;

    const/4 v13, 0x0

    aput-object v11, v12, v13

    invoke-virtual {v4, v10, v12}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v8, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_e

    :cond_14
    const/4 v13, 0x0

    .line 184
    :goto_e
    invoke-virtual {v8, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 185
    invoke-virtual {v6, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 186
    invoke-virtual {v7, v9}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 187
    invoke-virtual {v5, v13}, Landroid/view/View;->setVisibility(I)V

    goto :goto_f

    :cond_15
    const/16 v3, 0x8

    .line 189
    invoke-virtual {v5, v3}, Landroid/view/View;->setVisibility(I)V

    .line 193
    :goto_f
    invoke-virtual/range {p1 .. p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v3

    invoke-direct {v0, v2, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalScanTileViewHolderConfigurator;->getClickLogging(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;I)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object v3

    .line 194
    new-instance v4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v4}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 195
    invoke-virtual {v0, v4}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalScanTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    const/4 v5, 0x1

    .line 196
    iput-boolean v5, v4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 197
    iget-object v5, v1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    .line 199
    iget-object v6, v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalScanTileViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    if-eqz v6, :cond_16

    .line 200
    invoke-virtual/range {p1 .. p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v6

    invoke-virtual {v0, v5, v2, v6}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalScanTileViewHolderConfigurator;->setupOpenKDOClickListener(Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;I)V

    .line 201
    iget-object v6, v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalScanTileViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v6}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/shopkick/app/screens/AppScreen;

    if-eqz v6, :cond_16

    .line 202
    instance-of v7, v5, Lcom/shopkick/app/logging/IUserEventView;

    if-eqz v7, :cond_16

    .line 203
    check-cast v5, Lcom/shopkick/app/logging/IUserEventView;

    .line 204
    iget-object v6, v6, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-interface {v5, v3, v6, v4}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    :cond_16
    const v3, 0x7f090530

    .line 209
    invoke-virtual {v1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getUserEventImageView(I)Lcom/shopkick/app/logging/UserEventImageView;

    move-result-object v3

    .line 210
    iget-object v4, v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalScanTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v4}, Lcom/shopkick/app/util/FeatureFlagHelper;->isShoppingListEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v4

    if-eqz v4, :cond_19

    iget-object v4, v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalScanTileViewHolderConfigurator;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    if-eqz v4, :cond_19

    iget-object v4, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    .line 211
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_18

    const/4 v4, 0x0

    .line 212
    invoke-virtual {v3, v4}, Lcom/shopkick/app/logging/UserEventImageView;->setVisibility(I)V

    .line 213
    iget-object v4, v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalScanTileViewHolderConfigurator;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    const/4 v5, 0x0

    iget-object v6, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lcom/shopkick/app/shoppinglists/ListAddController;->hasBeenAdded(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_17

    const v4, 0x7f08024a

    .line 214
    invoke-virtual {v3, v4}, Lcom/shopkick/app/logging/UserEventImageView;->setImageResource(I)V

    goto :goto_10

    :cond_17
    const v4, 0x7f08018e

    .line 216
    invoke-virtual {v3, v4}, Lcom/shopkick/app/logging/UserEventImageView;->setImageResource(I)V

    .line 218
    :goto_10
    new-instance v4, Lcom/shopkick/app/util/ScanClickUtils$AddToListClickListener;

    iget-object v5, v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalScanTileViewHolderConfigurator;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    iget-object v6, v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalScanTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-direct {v4, v2, v5, v6}, Lcom/shopkick/app/util/ScanClickUtils$AddToListClickListener;-><init>(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/app/shoppinglists/ListAddController;Lcom/shopkick/app/logging/UserEventLogger;)V

    invoke-virtual {v3, v4}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_12

    :cond_18
    const/16 v4, 0x8

    goto :goto_11

    :cond_19
    const/16 v4, 0x8

    .line 222
    :goto_11
    invoke-virtual {v3, v4}, Lcom/shopkick/app/logging/UserEventImageView;->setVisibility(I)V

    :goto_12
    const v3, 0x7f09053e

    .line 226
    invoke-virtual {v1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getUserEventImageView(I)Lcom/shopkick/app/logging/UserEventImageView;

    move-result-object v3

    .line 227
    invoke-virtual/range {p1 .. p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v4

    iget-object v1, v1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-direct {v0, v3, v2, v4, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalScanTileViewHolderConfigurator;->setupImpressionLogging(Lcom/shopkick/app/logging/UserEventImageView;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;ILandroid/view/View;)V

    return-void
.end method
