.class public Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesV2ViewHolderConfigurator;
.source "OnlineKicksUnitTileViewHolderConfigurator.java"


# static fields
.field private static final CHAIN_LOGO_DIMENSION_DIP:I = 0x38

.field private static final LOGO_CIRCLE_RADIUS:I = 0x1c


# instance fields
.field private adapter:Lcom/shopkick/app/store/KicksUnitAdapter;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/screens/AppScreen;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesV2ViewHolderConfigurator;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/screens/AppScreen;)V

    .line 65
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    .line 66
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    return-void
.end method

.method private setupRecyclerArea(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 8

    .line 144
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isStrikethroughPricingEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    const v1, 0x7f09059a

    const/16 v2, 0x8

    const v3, 0x7f0904d6

    if-eqz v0, :cond_3

    .line 145
    invoke-virtual {p2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 146
    invoke-virtual {p2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    const/4 v4, 0x1

    if-ge v0, v4, :cond_0

    goto/16 :goto_2

    .line 152
    :cond_0
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->subtitle:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 153
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->subtitle:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    goto :goto_0

    .line 155
    :cond_1
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 158
    :goto_0
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 161
    new-instance v0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator;

    invoke-direct {v0}, Lcom/shopkick/app/feed/animate/WidgetItemAnimator;-><init>()V

    const-wide/16 v1, 0xfa

    .line 162
    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/feed/animate/WidgetItemAnimator;->setAddStartDelay(J)V

    const-wide/16 v3, 0x96

    .line 163
    invoke-virtual {v0, v3, v4}, Lcom/shopkick/app/feed/animate/WidgetItemAnimator;->setAddDuration(J)V

    .line 164
    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/feed/animate/WidgetItemAnimator;->setMoveDuration(J)V

    const-wide/16 v1, 0x12c

    .line 165
    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/feed/animate/WidgetItemAnimator;->setChangeDuration(J)V

    .line 166
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setItemAnimator(Landroid/support/v7/widget/RecyclerView$ItemAnimator;)V

    .line 169
    new-instance v0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator$1;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator;)V

    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addOnItemTouchListener(Landroid/support/v7/widget/RecyclerView$OnItemTouchListener;)V

    .line 187
    new-instance v7, Lcom/shopkick/app/store/KicksUnitAdapter;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    .line 189
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/shopkick/app/screens/AppScreen;

    const/4 v3, 0x0

    .line 192
    invoke-virtual {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator;->getSupportedTileTypes()Ljava/util/Set;

    move-result-object v5

    const/4 v6, 0x0

    move-object v0, v7

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/store/KicksUnitAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V

    iput-object v7, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator;->adapter:Lcom/shopkick/app/store/KicksUnitAdapter;

    .line 196
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 197
    invoke-virtual {p2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {p2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    if-lez v1, :cond_2

    .line 198
    invoke-virtual {p2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    move v3, v2

    .line 199
    :goto_1
    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v4

    if-ge v3, v4, :cond_2

    .line 200
    invoke-virtual {p2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 204
    :cond_2
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator;->adapter:Lcom/shopkick/app/store/KicksUnitAdapter;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/store/KicksUnitAdapter;->setCategoryTiles(Ljava/util/List;)V

    .line 205
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator;->adapter:Lcom/shopkick/app/store/KicksUnitAdapter;

    invoke-virtual {p2}, Lcom/shopkick/app/store/KicksUnitAdapter;->removeDefaultItemDecoration()V

    .line 207
    new-instance p2, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-direct {p2, v0, v2, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 208
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator;->adapter:Lcom/shopkick/app/store/KicksUnitAdapter;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    return-void

    .line 147
    :cond_3
    :goto_2
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 148
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private setupShopNowButton(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 4

    const v0, 0x7f0906e5

    .line 212
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Lcom/shopkick/app/util/CommonClickUtils$OnlineStoreButtonClickListener;

    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    invoke-direct {v2, v3, p2}, Lcom/shopkick/app/util/CommonClickUtils$OnlineStoreButtonClickListener;-><init>(Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 213
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 214
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0x132

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 215
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {v1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    const/4 p2, 0x1

    .line 216
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setIsOnlineStore(Ljava/lang/Boolean;)V

    .line 218
    new-instance v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 219
    invoke-virtual {p0, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 220
    iput-boolean p2, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 222
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, v1, p2, v2}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method

.method private setupStoreTileArea(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 7

    const v0, 0x7f0906ea

    .line 104
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    const v1, 0x7f0906e7

    .line 105
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v1

    const v2, 0x7f0906e8

    .line 106
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/widget/SKTextView;

    const v3, 0x7f0906e9

    .line 107
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/widget/SKTextView;

    .line 109
    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    invoke-virtual {v0, v4}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 111
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isStrikethroughPricingEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    const v4, 0x7f060120

    const v5, 0x7f0800cc

    const/16 v6, 0x8

    if-eqz v0, :cond_2

    .line 112
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreEnablePriceHighlight:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x7f0800cd

    .line 113
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 114
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f060123

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {v2, p1}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 115
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStorePurchaseKickAmountText:Ljava/lang/String;

    invoke-virtual {v2, p1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 117
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreStrikePrice:Ljava/lang/String;

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 118
    invoke-virtual {v3, p1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 119
    new-instance v0, Landroid/text/SpannableString;

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreStrikePrice:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 120
    new-instance v1, Landroid/text/style/StrikethroughSpan;

    invoke-direct {v1}, Landroid/text/style/StrikethroughSpan;-><init>()V

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreStrikePrice:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    const/16 v2, 0x21

    invoke-interface {v0, v1, p1, p2, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 121
    invoke-virtual {v3, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 123
    :cond_0
    invoke-virtual {v3, v6}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    goto :goto_0

    .line 127
    :cond_1
    invoke-virtual {v3, v6}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 128
    invoke-virtual {v1, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 129
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {v2, p1}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 130
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStorePurchaseKickAmountText:Ljava/lang/String;

    invoke-virtual {v2, p1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    goto :goto_0

    .line 133
    :cond_2
    invoke-virtual {v3, v6}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 134
    invoke-virtual {v1, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 135
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {v2, p1}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 136
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStorePurchaseKickAmountText:Ljava/lang/String;

    invoke-virtual {v2, p1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public cancelImageLoadingForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 1

    const v0, 0x7f0900e7

    .line 246
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator;->cancelImageLoadingForImageView(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    return-void
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c0143

    return v0
.end method

.method protected getSupportedTileTypes()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 227
    new-instance v0, Ljava/util/HashSet;

    const/16 v1, 0x55

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 3

    if-nez p2, :cond_0

    return-void

    :cond_0
    const v0, 0x7f0900e7

    .line 238
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x38

    .line 239
    invoke-static {v1, v0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v1

    const/16 v2, 0x1c

    .line 240
    invoke-static {v2, v0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v2

    .line 241
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/util/GlideRequests;->asBitmap()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainImageUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequest;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/shopkick/app/util/GlideRequest;->override(I)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    const/4 p2, 0x2

    new-array p2, p2, [Lcom/bumptech/glide/load/Transformation;

    const/4 p3, 0x0

    new-instance v1, Lcom/bumptech/glide/load/resource/bitmap/CenterCrop;

    invoke-direct {v1}, Lcom/bumptech/glide/load/resource/bitmap/CenterCrop;-><init>()V

    aput-object v1, p2, p3

    const/4 p3, 0x1

    new-instance v1, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;

    invoke-direct {v1, v2}, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;-><init>(I)V

    aput-object v1, p2, p3

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequest;->transforms([Lcom/bumptech/glide/load/Transformation;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 2

    if-nez p2, :cond_0

    return-void

    :cond_0
    const v0, 0x7f0900e7

    .line 89
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    .line 90
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 91
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 95
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator;->setupStoreTileArea(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 98
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator;->setupRecyclerArea(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 100
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator;->setupShopNowButton(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;)Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;
    .locals 0

    .line 79
    invoke-super {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesV2ViewHolderConfigurator;->onCreateViewHolder(Landroid/view/ViewGroup;)Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    move-result-object p1

    .line 80
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    return-object p1
.end method

.method protected willOverrideAdapter()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
