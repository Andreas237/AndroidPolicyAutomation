.class public Lcom/shopkick/app/tileViewHolderConfigurators/ActionButtonsTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "ActionButtonsTileViewHolderConfigurator.java"


# instance fields
.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

.field private productsDataSource:Lcom/shopkick/app/products/ProductsDataSource;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/products/ProductsDataSource;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/shoppinglists/ListAddController;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ActionButtonsTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 38
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ActionButtonsTileViewHolderConfigurator;->productsDataSource:Lcom/shopkick/app/products/ProductsDataSource;

    .line 39
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ActionButtonsTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 40
    iput-object p4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ActionButtonsTileViewHolderConfigurator;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    return-void
.end method

.method private configureForProduct(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)V
    .locals 9

    const v0, 0x7f0907e8

    .line 69
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object v2

    const v0, 0x7f0905f6

    .line 70
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object v0

    .line 71
    iget-object v7, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->simpleUserEventCoordinator:Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

    .line 72
    iget-object v1, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->simpleUserEventCoordinator:Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_0
    move-object v8, v1

    .line 73
    iget-object v1, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->product:Lcom/shopkick/app/fetchers/api/skapi/Product;

    if-eqz v1, :cond_1

    .line 74
    iget-object v3, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->product:Lcom/shopkick/app/fetchers/api/skapi/Product;

    move-object v1, p0

    move-object v4, p1

    move-object v5, v7

    move-object v6, v8

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/app/tileViewHolderConfigurators/ActionButtonsTileViewHolderConfigurator;->updateFloatingUseButton(Lcom/shopkick/app/widget/SKButton;Lcom/shopkick/app/fetchers/api/skapi/Product;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/logging/IUserEventCoordinator;Ljava/lang/Integer;)V

    .line 75
    iget-object v5, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->product:Lcom/shopkick/app/fetchers/api/skapi/Product;

    move-object v3, p0

    move-object v4, v0

    move-object v6, p1

    invoke-direct/range {v3 .. v8}, Lcom/shopkick/app/tileViewHolderConfigurators/ActionButtonsTileViewHolderConfigurator;->updateFloatingSaveButton(Lcom/shopkick/app/widget/SKButton;Lcom/shopkick/app/fetchers/api/skapi/Product;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/logging/IUserEventCoordinator;Ljava/lang/Integer;)V

    goto :goto_1

    .line 77
    :cond_1
    invoke-direct {p0, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/ActionButtonsTileViewHolderConfigurator;->hideUseButton(Lcom/shopkick/app/widget/SKButton;)V

    .line 78
    invoke-direct {p0, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ActionButtonsTileViewHolderConfigurator;->hideSaveButton(Lcom/shopkick/app/widget/SKButton;)V

    :goto_1
    return-void
.end method

.method private createOptionalSetupParams(Lcom/shopkick/app/logging/IUserEventCoordinator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Ljava/lang/Integer;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;
    .locals 1

    .line 95
    new-instance v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v0}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    if-eqz p1, :cond_0

    .line 97
    iput-object p1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    goto :goto_0

    .line 99
    :cond_0
    invoke-virtual {p0, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ActionButtonsTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 101
    :goto_0
    iget-object p1, p2, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object p1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 102
    iput-object p3, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    return-object v0
.end method

.method private hideSaveButton(Lcom/shopkick/app/widget/SKButton;)V
    .locals 1

    const/16 v0, 0x8

    .line 88
    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    const/4 v0, 0x0

    .line 89
    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private hideUseButton(Lcom/shopkick/app/widget/SKButton;)V
    .locals 1

    const/16 v0, 0x8

    .line 83
    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    const/4 v0, 0x0

    .line 84
    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private updateFloatingSaveButton(Lcom/shopkick/app/widget/SKButton;Lcom/shopkick/app/fetchers/api/skapi/Product;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/logging/IUserEventCoordinator;Ljava/lang/Integer;)V
    .locals 6

    .line 138
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ActionButtonsTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isShoppingListEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 139
    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 140
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ActionButtonsTileViewHolderConfigurator;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/Product;->productId:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/shoppinglists/ListAddController;->hasBeenAdded(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const v0, 0x7f0800ad

    .line 141
    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setBackgroundResource(I)V

    const v0, 0x7f08024f

    .line 142
    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setButtonIcon(I)V

    const v0, 0x7f11068a

    .line 143
    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    const/16 v0, 0x46

    goto :goto_0

    :cond_0
    const v0, 0x7f08018c

    .line 147
    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setBackgroundResource(I)V

    const v0, 0x7f08024e

    .line 148
    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setButtonIcon(I)V

    const v0, 0x7f11068d

    .line 149
    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    const/16 v0, 0x41

    :goto_0
    const/16 v1, 0xd8

    .line 153
    new-instance v2, Lcom/shopkick/app/util/CommonClickUtils$ProductSaveClickListener;

    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ActionButtonsTileViewHolderConfigurator;->productsDataSource:Lcom/shopkick/app/products/ProductsDataSource;

    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ActionButtonsTileViewHolderConfigurator;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    iget-object v5, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ActionButtonsTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-direct {v2, v3, p2, v4, v5}, Lcom/shopkick/app/util/CommonClickUtils$ProductSaveClickListener;-><init>(Lcom/shopkick/app/products/ProductsDataSource;Lcom/shopkick/app/fetchers/api/skapi/Product;Lcom/shopkick/app/shoppinglists/ListAddController;Lcom/shopkick/app/application/ClientFlagsManager;)V

    invoke-virtual {p1, v2}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    move v2, v0

    move v0, v1

    goto :goto_2

    .line 158
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ActionButtonsTileViewHolderConfigurator;->productsDataSource:Lcom/shopkick/app/products/ProductsDataSource;

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/Product;->productId:Ljava/lang/String;

    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/Product;->isSaved:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v0, v2, v3}, Lcom/shopkick/app/products/ProductsDataSource;->getSaveStateForItem(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    const v0, 0x7f08019e

    .line 159
    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setButtonIcon(I)V

    const v0, 0x7f110229

    .line 160
    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    const/4 v0, 0x4

    const/16 v2, 0xf

    goto :goto_1

    :cond_2
    const v0, 0x7f08019f

    .line 164
    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setButtonIcon(I)V

    const v0, 0x7f11022a

    .line 165
    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    const/4 v0, 0x3

    const/16 v2, 0x10

    .line 170
    :goto_1
    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 171
    new-instance v1, Lcom/shopkick/app/util/CommonClickUtils$ProductSaveClickListener;

    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ActionButtonsTileViewHolderConfigurator;->productsDataSource:Lcom/shopkick/app/products/ProductsDataSource;

    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ActionButtonsTileViewHolderConfigurator;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    iget-object v5, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ActionButtonsTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-direct {v1, v3, p2, v4, v5}, Lcom/shopkick/app/util/CommonClickUtils$ProductSaveClickListener;-><init>(Lcom/shopkick/app/products/ProductsDataSource;Lcom/shopkick/app/fetchers/api/skapi/Product;Lcom/shopkick/app/shoppinglists/ListAddController;Lcom/shopkick/app/application/ClientFlagsManager;)V

    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_2
    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    if-ne v2, v1, :cond_3

    return-void

    .line 182
    :cond_3
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 183
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/Product;->productId:Ljava/lang/String;

    invoke-virtual {v1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductId(Ljava/lang/String;)V

    .line 184
    invoke-virtual {v1, p5}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 185
    invoke-direct {p0, p4, p3, p5}, Lcom/shopkick/app/tileViewHolderConfigurators/ActionButtonsTileViewHolderConfigurator;->createOptionalSetupParams(Lcom/shopkick/app/logging/IUserEventCoordinator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Ljava/lang/Integer;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    move-result-object p2

    .line 188
    iget-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ActionButtonsTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, v1, p3, p2}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method

.method private updateFloatingUseButton(Lcom/shopkick/app/widget/SKButton;Lcom/shopkick/app/fetchers/api/skapi/Product;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/logging/IUserEventCoordinator;Ljava/lang/Integer;)V
    .locals 4

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 111
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/Product;->buyLink:Ljava/lang/String;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    if-eqz v1, :cond_1

    .line 113
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ActionButtonsTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v1}, Lcom/shopkick/app/util/FeatureFlagHelper;->isOnlineOffersEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v1

    if-nez v1, :cond_1

    const v1, 0x7f11015a

    .line 114
    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    .line 115
    new-instance v1, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ActionButtonsTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/Product;->buyLink:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;-><init>(Lcom/shopkick/app/url/URLDispatcher;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 116
    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 119
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xd

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 120
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/Product;->productId:Ljava/lang/String;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductId(Ljava/lang/String;)V

    .line 121
    invoke-virtual {v0, p5}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 122
    invoke-direct {p0, p4, p3, p5}, Lcom/shopkick/app/tileViewHolderConfigurators/ActionButtonsTileViewHolderConfigurator;->createOptionalSetupParams(Lcom/shopkick/app/logging/IUserEventCoordinator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Ljava/lang/Integer;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    move-result-object p2

    .line 125
    iget-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ActionButtonsTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, v0, p3, p2}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    goto :goto_1

    .line 127
    :cond_1
    invoke-direct {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ActionButtonsTileViewHolderConfigurator;->hideUseButton(Lcom/shopkick/app/widget/SKButton;)V

    :goto_1
    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c00c8

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 2

    .line 50
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    if-eqz v0, :cond_0

    .line 51
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    .line 52
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    const/4 v1, 0x1

    .line 53
    invoke-virtual {v0, v1}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->setFullSpan(Z)V

    .line 56
    :cond_0
    instance-of v0, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    if-nez v0, :cond_1

    return-void

    .line 60
    :cond_1
    check-cast p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    .line 61
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/ActionButtonsTileViewHolderConfigurator;->configureForProduct(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)V

    .line 63
    iget-object v0, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->backgroundColor:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 64
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iget-object p2, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->backgroundColor:Ljava/lang/String;

    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_2
    return-void
.end method
