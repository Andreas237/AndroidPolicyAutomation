.class public Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleReceiptTileConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;
.source "OfferDetailsBundleReceiptTileConfigurator.java"


# direct methods
.method public constructor <init>(Lcom/shopkick/app/screens/AppScreen;Landroid/content/Context;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/application/ClientFlagsManager;)V
    .locals 0

    .line 33
    invoke-direct/range {p0 .. p9}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;-><init>(Lcom/shopkick/app/screens/AppScreen;Landroid/content/Context;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/application/ClientFlagsManager;)V

    return-void
.end method

.method public static synthetic lambda$onBindViewHolder$248(Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleReceiptTileConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View;)V
    .locals 0

    .line 82
    invoke-virtual {p0, p3, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleReceiptTileConfigurator;->receiptButtonClick(Landroid/view/View;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c0133

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 13

    .line 50
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleReceiptTileConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    const v0, 0x7f0903e9

    .line 51
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    const v1, 0x7f0903e7

    .line 52
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/widget/SKTextView;

    const v2, 0x7f090091

    .line 53
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/widget/SKTextView;

    const v3, 0x7f090090

    .line 54
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v3

    const v4, 0x7f090589

    .line 55
    invoke-virtual {p1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v4

    const v5, 0x7f090587

    .line 56
    invoke-virtual {p1, v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object v5

    .line 57
    iget-object v6, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyIds:Ljava/util/List;

    const/4 v7, 0x0

    if-nez v6, :cond_0

    move v6, v7

    goto :goto_0

    :cond_0
    iget-object v6, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyIds:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    :goto_0
    const v8, 0x7f090618

    .line 58
    invoke-virtual {p1, v8}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v8

    iget-object v9, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleReceiptTileConfigurator;->context:Landroid/content/Context;

    const v10, 0x7f11044e

    const/4 v11, 0x1

    new-array v12, v11, [Ljava/lang/Object;

    .line 59
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v12, v7

    .line 58
    invoke-virtual {v9, v10, v12}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    iget-object v6, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 61
    iget-object v6, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleReceiptTileConfigurator;->context:Landroid/content/Context;

    const v8, 0x7f11019c

    invoke-virtual {v6, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 62
    iget-object v6, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleReceiptTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v8, 0x7f0f002a

    iget-object v9, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->bonusReceiptKicks:Ljava/lang/Integer;

    .line 63
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    new-array v10, v11, [Ljava/lang/Object;

    iget-object v12, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->bonusReceiptKicks:Ljava/lang/Integer;

    aput-object v12, v10, v7

    .line 62
    invoke-virtual {v6, v8, v9, v10}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 64
    iget-object v6, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleReceiptTileConfigurator;->context:Landroid/content/Context;

    const v8, 0x7f060022

    invoke-virtual {v6, v8}, Landroid/content/Context;->getColor(I)I

    move-result v6

    .line 65
    iget-object v8, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleReceiptTileConfigurator;->context:Landroid/content/Context;

    const v9, 0x7f0600c6

    invoke-virtual {v8, v9}, Landroid/content/Context;->getColor(I)I

    move-result v8

    .line 66
    iget-object v9, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-nez v9, :cond_2

    iget-object v9, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    if-nez v9, :cond_1

    iget-object v9, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    if-nez v9, :cond_1

    iget-object v9, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    if-nez v9, :cond_1

    goto :goto_1

    :cond_1
    const v7, 0x7f0800a4

    .line 76
    invoke-virtual {v4, v7}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 77
    invoke-virtual {v1, v6}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 78
    invoke-virtual {v0, v6}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 79
    invoke-virtual {v2, v6}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    const v0, 0x7f080262

    .line 80
    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 81
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleReceiptTileConfigurator;->context:Landroid/content/Context;

    const v1, 0x7f080091

    invoke-virtual {v0, v1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/shopkick/app/widget/SKButton;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 82
    new-instance v0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$OfferDetailsBundleReceiptTileConfigurator$NWsSc7CWUdNBsYQNpk14g93yIs8;

    invoke-direct {v0, p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$OfferDetailsBundleReceiptTileConfigurator$NWsSc7CWUdNBsYQNpk14g93yIs8;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleReceiptTileConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    invoke-virtual {v5, v0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 83
    invoke-virtual {v3, v7}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 84
    invoke-virtual {v5, v11}, Lcom/shopkick/app/widget/SKButton;->setClickable(Z)V

    goto :goto_2

    :cond_2
    :goto_1
    const v6, 0x7f080261

    .line 68
    invoke-virtual {v4, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    const v4, 0x7f0800a5

    .line 69
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 70
    invoke-virtual {v1, v8}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 71
    invoke-virtual {v0, v8}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 72
    invoke-virtual {v2, v8}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 73
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleReceiptTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080187

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/shopkick/app/widget/SKButton;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 74
    invoke-virtual {v5, v7}, Lcom/shopkick/app/widget/SKButton;->setClickable(Z)V

    .line 86
    :goto_2
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleReceiptTileConfigurator;->setupLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method

.method protected setupLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 4

    const v0, 0x7f090587

    .line 91
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object v0

    .line 92
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0x154

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 93
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 94
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    :goto_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNumScanKicks(Ljava/lang/Integer;)V

    .line 95
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setIsBundle(Ljava/lang/Boolean;)V

    .line 96
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->bonusReceiptKicks:Ljava/lang/Integer;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBonusReceiptKicks(Ljava/lang/Integer;)V

    .line 97
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    if-eqz v2, :cond_1

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 98
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBundleId(Ljava/lang/String;)V

    .line 101
    :cond_1
    new-instance v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 102
    invoke-virtual {p0, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleReceiptTileConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    const/4 v3, 0x1

    .line 103
    iput-boolean v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 104
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object p1, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 105
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    iput-object p1, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 107
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleReceiptTileConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, v1, p1, v2}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method
