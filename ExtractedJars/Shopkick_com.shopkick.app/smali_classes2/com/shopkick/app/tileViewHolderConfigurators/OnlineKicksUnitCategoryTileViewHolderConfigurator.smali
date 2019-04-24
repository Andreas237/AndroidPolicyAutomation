.class public Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitCategoryTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "OnlineKicksUnitCategoryTileViewHolderConfigurator.java"


# instance fields
.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/app/url/URLDispatcher;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitCategoryTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 40
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitCategoryTileViewHolderConfigurator;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    .line 41
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitCategoryTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-void
.end method

.method private setupLayoutOnClick(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 9

    .line 167
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isDisabled:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 168
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 169
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 172
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 173
    new-instance v0, Lcom/shopkick/app/util/CommonClickUtils$OnlineOfferButtonClickListener;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitCategoryTileViewHolderConfigurator;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    invoke-direct {v0, v1, p2}, Lcom/shopkick/app/util/CommonClickUtils$OnlineOfferButtonClickListener;-><init>(Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    goto :goto_0

    .line 175
    :cond_0
    new-instance v0, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;

    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitCategoryTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitCategoryTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v5, p2, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    const/4 v6, 0x0

    const/16 p2, 0x178

    .line 179
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;-><init>(Lcom/shopkick/app/url/URLDispatcher;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    goto :goto_0

    .line 185
    :cond_1
    iget-object p2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/view/View;->setClickable(Z)V

    .line 186
    iget-object p2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p2, v0}, Landroid/view/View;->setEnabled(Z)V

    const/4 v0, 0x0

    .line 190
    :goto_0
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private setupRatioData(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitCategoryTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isStrikethroughPricingEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 70
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitCategoryTileViewHolderConfigurator;->setupStateDefault(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    goto :goto_0

    .line 73
    :cond_0
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreEnablePriceHighlight:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 75
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreStrikePrice:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 77
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitCategoryTileViewHolderConfigurator;->setupStateStrikethrough(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    goto :goto_0

    .line 80
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitCategoryTileViewHolderConfigurator;->setupStateHighlightOnly(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    goto :goto_0

    .line 83
    :cond_2
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitCategoryTileViewHolderConfigurator;->setupStateDefault(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    :goto_0
    return-void
.end method

.method private setupStateDefault(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 5

    const v0, 0x7f090707

    .line 89
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    const v1, 0x7f090704

    .line 90
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v1

    const v2, 0x7f090705

    .line 91
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/widget/SKTextView;

    const v3, 0x7f090706

    .line 92
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/widget/SKTextView;

    .line 95
    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {v0, v4}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    const v0, 0x7f0800cc

    .line 98
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 101
    invoke-virtual {v1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v1, 0x0

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 104
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineOfferPurchaseKickAmountText:Ljava/lang/String;

    invoke-virtual {v2, p2}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    const/4 p2, 0x6

    .line 105
    invoke-virtual {v2, p2}, Lcom/shopkick/app/widget/SKTextView;->setDefaultFont(I)Z

    .line 106
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f060120

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {v2, p1}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    const/16 p1, 0x8

    .line 109
    invoke-virtual {v3, p1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    return-void
.end method

.method private setupStateHighlightOnly(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 5

    const v0, 0x7f090707

    .line 113
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    const v1, 0x7f090704

    .line 114
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v1

    const v2, 0x7f090705

    .line 115
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/widget/SKTextView;

    const v3, 0x7f090706

    .line 116
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/widget/SKTextView;

    .line 119
    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {v0, v4}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    const v0, 0x7f0800cd

    .line 122
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 125
    invoke-virtual {v1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v1, 0x0

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 128
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineOfferPurchaseKickAmountText:Ljava/lang/String;

    invoke-virtual {v2, p2}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 129
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f060123

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {v2, p1}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    const/16 p1, 0x8

    .line 130
    invoke-virtual {v2, p1}, Lcom/shopkick/app/widget/SKTextView;->setDefaultFont(I)Z

    .line 133
    invoke-virtual {v3, p1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    return-void
.end method

.method private setupStateStrikethrough(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 5

    const v0, 0x7f090707

    .line 137
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    const v1, 0x7f090704

    .line 138
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v1

    const v2, 0x7f090705

    .line 139
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/widget/SKTextView;

    const v3, 0x7f090706

    .line 140
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/widget/SKTextView;

    .line 143
    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {v0, v4}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    const v0, 0x7f0800cd

    .line 146
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 149
    invoke-virtual {v1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    const/4 v4, 0x4

    .line 150
    invoke-static {v4, v1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 153
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineOfferPurchaseKickAmountText:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    const/16 v0, 0x8

    .line 154
    invoke-virtual {v2, v0}, Lcom/shopkick/app/widget/SKTextView;->setDefaultFont(I)Z

    .line 155
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f060123

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {v2, p1}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 158
    new-instance p1, Landroid/text/SpannableString;

    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreStrikePrice:Ljava/lang/String;

    invoke-direct {p1, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 159
    new-instance v0, Landroid/text/style/StrikethroughSpan;

    invoke-direct {v0}, Landroid/text/style/StrikethroughSpan;-><init>()V

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreStrikePrice:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    const/4 v1, 0x0

    const/16 v2, 0x21

    invoke-interface {p1, v0, v1, p2, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 160
    invoke-virtual {v3, p1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/CharSequence;)V

    .line 161
    invoke-virtual {v3, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    return-void
.end method

.method private setupTitle(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 1

    const v0, 0x7f090707

    .line 64
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKTextView;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c01d4

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 3

    .line 51
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitCategoryTileViewHolderConfigurator;->setupTitle(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 52
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitCategoryTileViewHolderConfigurator;->setupRatioData(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 55
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v0

    if-eqz v0, :cond_0

    .line 56
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    const/16 v1, 0x8

    iget-object v2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    .line 57
    invoke-static {v1, v2}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 60
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitCategoryTileViewHolderConfigurator;->setupLayoutOnClick(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method
