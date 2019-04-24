.class public Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsScreenCategoryKickTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "StoreDetailsScreenCategoryKickTileViewHolderConfigurator.java"


# instance fields
.field private mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/app/url/URLDispatcher;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsScreenCategoryKickTileViewHolderConfigurator;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    .line 25
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsScreenCategoryKickTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c01cd

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 9

    .line 42
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const v0, 0x7f0900d7

    .line 43
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    const v0, 0x7f0903ef

    .line 46
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v1

    .line 47
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmountText:Ljava/lang/String;

    invoke-static {v2}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v2

    const/16 v3, 0x8

    const/4 v4, 0x0

    if-nez v2, :cond_2

    .line 48
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmountText:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 51
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isDisabled:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 52
    invoke-virtual {v1}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f060120

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {v1}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0600c8

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 57
    :cond_2
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 61
    :goto_0
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->layoutVersion:Ljava/lang/Integer;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v0

    const v1, 0x7f090220

    if-eqz v0, :cond_3

    .line 62
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 64
    :cond_3
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 68
    :goto_1
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x178

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 69
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 70
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->retailerCategoryId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCategoryId(Ljava/lang/String;)V

    .line 72
    new-instance v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 73
    invoke-virtual {p0, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsScreenCategoryKickTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 74
    iget-object v3, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 75
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 77
    iget-object v3, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    check-cast v3, Lcom/shopkick/app/logging/IUserEventView;

    iget-object v5, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsScreenCategoryKickTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-interface {v3, v0, v5, v2}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 81
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isDisabled:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 82
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/view/View;->setClickable(Z)V

    .line 83
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 86
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 87
    new-instance v0, Lcom/shopkick/app/util/CommonClickUtils$OnlineOfferButtonClickListener;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsScreenCategoryKickTileViewHolderConfigurator;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    invoke-direct {v0, v1, p2}, Lcom/shopkick/app/util/CommonClickUtils$OnlineOfferButtonClickListener;-><init>(Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    goto :goto_2

    .line 89
    :cond_4
    new-instance v0, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;

    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsScreenCategoryKickTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsScreenCategoryKickTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v5, p2, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    const/4 v6, 0x0

    .line 93
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;-><init>(Lcom/shopkick/app/url/URLDispatcher;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    goto :goto_2

    .line 99
    :cond_5
    iget-object p2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p2, v4}, Landroid/view/View;->setClickable(Z)V

    .line 100
    iget-object p2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p2, v4}, Landroid/view/View;->setEnabled(Z)V

    const/4 v0, 0x0

    .line 104
    :goto_2
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;)Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;
    .locals 0

    .line 30
    invoke-super {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->onCreateViewHolder(Landroid/view/ViewGroup;)Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    move-result-object p1

    .line 31
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsScreenCategoryKickTileViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    return-object p1
.end method
