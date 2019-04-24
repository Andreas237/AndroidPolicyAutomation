.class public Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsOfferNotAvailableTileConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "OfferDetailsOfferNotAvailableTileConfigurator.java"


# instance fields
.field private context:Landroid/content/Context;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsOfferNotAvailableTileConfigurator;->context:Landroid/content/Context;

    .line 25
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsOfferNotAvailableTileConfigurator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 26
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsOfferNotAvailableTileConfigurator;->userAccount:Lcom/shopkick/app/account/UserAccount;

    return-void
.end method

.method public static synthetic lambda$onBindViewHolder$250(Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsOfferNotAvailableTileConfigurator;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    .line 45
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 46
    invoke-direct {p0, p2, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsOfferNotAvailableTileConfigurator;->reportProductUnavailability(Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method

.method private reportProductUnavailability(Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 7

    .line 68
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsOfferNotAvailableTileConfigurator;->context:Landroid/content/Context;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsOfferNotAvailableTileConfigurator;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsOfferNotAvailableTileConfigurator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsOfferNotAvailableTileConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    iget-object v5, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    iget-object v6, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    invoke-static/range {v0 .. v6}, Lcom/shopkick/app/util/TileUtils;->reportProductUnavailability(Landroid/content/Context;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/logging/UserEventLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const p2, 0x7f090546

    .line 77
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    .line 78
    invoke-virtual {p2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    const/16 v0, 0x8

    .line 79
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    const p2, 0x7f090548

    .line 80
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 81
    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    const/4 p2, 0x0

    .line 82
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 83
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-virtual {p1, p2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c0138

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 5

    .line 36
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsOfferNotAvailableTileConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    .line 37
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsOfferNotAvailableTileConfigurator;->context:Landroid/content/Context;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsOfferNotAvailableTileConfigurator;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsOfferNotAvailableTileConfigurator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-static {v0, v1, v2}, Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;->getInstance(Landroid/content/Context;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/util/NotificationCenter;)Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;

    move-result-object v0

    .line 40
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-static {v1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x8

    if-nez v1, :cond_1

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    invoke-static {v1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    if-nez v1, :cond_1

    .line 42
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    invoke-virtual {v0, v1, v4}, Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;->isReported(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 43
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 44
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    new-instance v0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$OfferDetailsOfferNotAvailableTileConfigurator$vQ_AWMWBIIFz9UQ19GBTxG93xz0;

    invoke-direct {v0, p0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$OfferDetailsOfferNotAvailableTileConfigurator$vQ_AWMWBIIFz9UQ19GBTxG93xz0;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsOfferNotAvailableTileConfigurator;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    const v0, 0x7f090546

    .line 49
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f090548

    .line 50
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 51
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 55
    :goto_0
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0xf4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 56
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 57
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 58
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLocationId(Ljava/lang/String;)V

    .line 59
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsOfferNotAvailableTileConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    goto :goto_1

    .line 61
    :cond_1
    iget-object p2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 62
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_1
    return-void
.end method
