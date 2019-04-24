.class public Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsMinimumPurchaseRequirementReceiptTileConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;
.source "OfferDetailsMinimumPurchaseRequirementReceiptTileConfigurator.java"


# direct methods
.method public constructor <init>(Lcom/shopkick/app/screens/AppScreen;Landroid/content/Context;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/application/ClientFlagsManager;)V
    .locals 0

    .line 31
    invoke-direct/range {p0 .. p9}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;-><init>(Lcom/shopkick/app/screens/AppScreen;Landroid/content/Context;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/application/ClientFlagsManager;)V

    return-void
.end method

.method public static synthetic lambda$onBindViewHolder$249(Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsMinimumPurchaseRequirementReceiptTileConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View;)V
    .locals 0

    .line 71
    invoke-virtual {p0, p3, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsMinimumPurchaseRequirementReceiptTileConfigurator;->receiptButtonClick(Landroid/view/View;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c0134

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 9

    .line 49
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsMinimumPurchaseRequirementReceiptTileConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    const v0, 0x7f090494

    .line 50
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    const v1, 0x7f090499

    .line 51
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/widget/SKTextView;

    const v2, 0x7f090589

    .line 52
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v2

    const v3, 0x7f090587

    .line 53
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object v3

    .line 54
    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsMinimumPurchaseRequirementReceiptTileConfigurator;->context:Landroid/content/Context;

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v6, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->minimumPurchaseRequirement:Ljava/lang/Integer;

    .line 55
    invoke-virtual {v6}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v5, v7

    iget-object v6, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x1

    aput-object v6, v5, v8

    const v6, 0x7f110452

    .line 54
    invoke-virtual {v4, v6, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 56
    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsMinimumPurchaseRequirementReceiptTileConfigurator;->context:Landroid/content/Context;

    new-array v5, v8, [Ljava/lang/Object;

    iget-object v6, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->minimumPurchaseRequirement:Ljava/lang/Integer;

    aput-object v6, v5, v7

    const v6, 0x7f110451

    invoke-virtual {v4, v6, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 58
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsMinimumPurchaseRequirementReceiptTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v4, 0x7f060022

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 59
    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsMinimumPurchaseRequirementReceiptTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0600c6

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    .line 60
    iget-object v5, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-nez v5, :cond_1

    iget-object v5, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    if-nez v5, :cond_0

    iget-object v5, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    if-nez v5, :cond_0

    iget-object v5, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    if-nez v5, :cond_0

    goto :goto_0

    .line 67
    :cond_0
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    const v0, 0x7f080262

    .line 68
    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 69
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsMinimumPurchaseRequirementReceiptTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080091

    .line 70
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 69
    invoke-virtual {v3, v0}, Lcom/shopkick/app/widget/SKButton;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 71
    new-instance v0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$OfferDetailsMinimumPurchaseRequirementReceiptTileConfigurator$qpf2UEsT2xFpMvw8-hsHJTZ3Bjw;

    invoke-direct {v0, p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$OfferDetailsMinimumPurchaseRequirementReceiptTileConfigurator$qpf2UEsT2xFpMvw8-hsHJTZ3Bjw;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsMinimumPurchaseRequirementReceiptTileConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    invoke-virtual {v3, v0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    :goto_0
    const v1, 0x7f080261

    .line 62
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 63
    invoke-virtual {v0, v4}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 64
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsMinimumPurchaseRequirementReceiptTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080187

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/shopkick/app/widget/SKButton;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 65
    invoke-virtual {v3, v7}, Lcom/shopkick/app/widget/SKButton;->setClickable(Z)V

    .line 73
    :goto_1
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsMinimumPurchaseRequirementReceiptTileConfigurator;->setupLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method
