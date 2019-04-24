.class public Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "StoreDetailsOnlineKicksTileViewHolderConfigurator.java"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private context:Landroid/content/Context;

.field private mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

.field private onlineStoreClickedOnlineOfferToday:Ljava/lang/Boolean;

.field private onlineStoreTotalAvailableOnlineOfferKicks:Ljava/lang/Integer;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field private viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/app/url/URLDispatcher;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 50
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->context:Landroid/content/Context;

    .line 51
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 52
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    .line 53
    iput-object p4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-void
.end method

.method private kicksEarnedType(ZIZ)I
    .locals 0

    if-eqz p3, :cond_1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x3

    :goto_0
    return p1

    :cond_1
    if-gtz p2, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    if-eqz p1, :cond_3

    const/4 p1, 0x5

    return p1

    :cond_3
    const/4 p1, 0x2

    return p1
.end method

.method private populateKicksView(Lcom/shopkick/app/widget/UserEventRelativeLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Ljava/lang/String;IIILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;ILandroid/view/View$OnClickListener;)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p12

    const v8, 0x7f060022

    const/16 v9, 0x8

    const/4 v10, 0x4

    const v11, 0x7f0600ca

    const v12, 0x7f0600c6

    const/4 v13, 0x1

    const/4 v14, 0x0

    packed-switch p7, :pswitch_data_0

    if-eqz v2, :cond_3

    .line 238
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 239
    iget-object v6, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v12}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_1

    :pswitch_0
    if-eqz v2, :cond_0

    const-string v6, "0"

    .line 208
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 209
    iget-object v6, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v12}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 211
    :cond_0
    iget-object v2, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v11}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 212
    invoke-virtual {v4, v10}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 213
    invoke-virtual {v5, v14}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    :pswitch_1
    if-eqz v2, :cond_1

    .line 227
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 228
    iget-object v6, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 230
    :cond_1
    iget-object v2, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v11}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 231
    invoke-virtual {v4, v10}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 232
    invoke-virtual {v5, v14}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    :pswitch_2
    if-eqz v2, :cond_2

    .line 217
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 218
    iget-object v6, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 220
    :cond_2
    iget-object v2, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v11}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextColor(I)V

    move/from16 v2, p9

    .line 221
    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 222
    invoke-virtual {v4, v14}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 223
    invoke-virtual {v5, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    move v14, v13

    goto :goto_2

    .line 241
    :cond_3
    :goto_1
    iget-object v2, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v12}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextColor(I)V

    move/from16 v2, p8

    .line 242
    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 243
    invoke-virtual {v4, v14}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 244
    invoke-virtual {v5, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_2
    if-eqz v14, :cond_4

    if-eqz v7, :cond_4

    .line 250
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static/range {p11 .. p11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    move-object/from16 v3, p10

    .line 251
    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 252
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setIsOnlineStore(Ljava/lang/Boolean;)V

    .line 253
    invoke-static/range {p7 .. p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setKicksEarnedState(Ljava/lang/Integer;)V

    .line 254
    new-instance v3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v3}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 255
    invoke-virtual {p0, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 256
    iput-boolean v13, v3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 257
    iget-object v4, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    invoke-virtual {v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->verticalListDisplayPos:Ljava/lang/Integer;

    .line 258
    iget-object v4, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v2, v4, v3}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 259
    invoke-virtual {v1, v7}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
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
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c01ca

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 23

    move-object/from16 v13, p0

    move-object/from16 v14, p1

    move-object/from16 v15, p2

    .line 62
    invoke-virtual/range {p0 .. p1}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    if-nez v15, :cond_0

    return-void

    .line 68
    :cond_0
    iput-object v14, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    .line 71
    new-instance v12, Lcom/shopkick/app/util/CommonClickUtils$OnlineStoreButtonClickListener;

    iget-object v0, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    invoke-direct {v12, v0, v15}, Lcom/shopkick/app/util/CommonClickUtils$OnlineStoreButtonClickListener;-><init>(Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 75
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "filter_type"

    const/4 v11, 0x1

    .line 77
    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    .line 76
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "chain_id"

    .line 78
    iget-object v2, v15, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    new-instance v1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v2, Lcom/shopkick/app/activities/DetailsActivity;

    const-class v3, Lcom/shopkick/app/cpg/FilteredOffersListScreen;

    invoke-direct {v1, v2, v3, v0}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 82
    new-instance v10, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;

    iget-object v0, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {v1}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v10, v0, v1}, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;-><init>(Lcom/shopkick/app/url/URLDispatcher;Ljava/lang/String;)V

    const v0, 0x7f0903f1

    .line 85
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    const v0, 0x7f09038e

    .line 86
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/shopkick/app/widget/SKTextView;

    const v0, 0x7f09038f

    .line 87
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v3

    const v0, 0x7f09038d

    .line 88
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v4

    const v0, 0x7f09038c

    .line 89
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v5

    .line 90
    iget-object v0, v15, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreClickKickAmount:Ljava/lang/Integer;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v0

    const/4 v8, 0x0

    if-eqz v0, :cond_1

    iget-object v0, v15, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreClickKickAmount:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v8

    .line 92
    :goto_0
    iget-object v2, v15, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreClickKickTodayCompleted:Ljava/lang/Boolean;

    invoke-static {v2, v8}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;Z)Z

    move-result v7

    .line 93
    iget-object v2, v15, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreClickKickCompleted:Ljava/lang/Boolean;

    invoke-static {v2, v11}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;Z)Z

    move-result v2

    .line 94
    invoke-direct {v13, v2, v0, v7}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->kicksEarnedType(ZIZ)I

    move-result v6

    if-lez v0, :cond_2

    .line 95
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    const-string v0, "0"

    :goto_1
    move-object/from16 v16, v0

    const v17, 0x7f080231

    const v18, 0x7f080230

    const/16 v19, 0x135

    move-object/from16 v0, p0

    move-object v2, v9

    move/from16 v20, v6

    move-object/from16 v6, v16

    move/from16 v16, v7

    move/from16 v7, v20

    move/from16 v8, v17

    move-object/from16 v21, v9

    move/from16 v9, v18

    move-object/from16 v17, v10

    move-object/from16 v10, p2

    move/from16 v11, v19

    move-object/from16 v18, v12

    .line 97
    invoke-direct/range {v0 .. v12}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->populateKicksView(Lcom/shopkick/app/widget/UserEventRelativeLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Ljava/lang/String;IIILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;ILandroid/view/View$OnClickListener;)V

    const/4 v0, 0x5

    const/16 v12, 0x8

    move/from16 v1, v20

    if-ne v1, v0, :cond_4

    .line 110
    iget-object v0, v15, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreClickKickDaysUntilNext:Ljava/lang/Integer;

    .line 111
    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v0

    if-eqz v0, :cond_3

    if-nez v16, :cond_3

    move-object/from16 v0, v21

    .line 112
    invoke-virtual {v0, v12}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    const v0, 0x7f090390

    .line 113
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v1

    iget-object v2, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->context:Landroid/content/Context;

    .line 114
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0f003d

    iget-object v4, v15, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreClickKickDaysUntilNext:Ljava/lang/Integer;

    .line 116
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v11, 0x1

    new-array v5, v11, [Ljava/lang/Object;

    iget-object v6, v15, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreClickKickDaysUntilNext:Ljava/lang/Integer;

    const/4 v10, 0x0

    aput-object v6, v5, v10

    .line 115
    invoke-virtual {v2, v3, v4, v5}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 114
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 118
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setVisibility(I)V

    const v0, 0x7f090366

    .line 119
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    :cond_3
    const/4 v10, 0x0

    const/4 v11, 0x1

    goto :goto_2

    :cond_4
    const/4 v10, 0x0

    const/4 v11, 0x1

    :goto_2
    const v0, 0x7f0903f4

    .line 123
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    const v0, 0x7f090398

    .line 124
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/shopkick/app/widget/SKTextView;

    const v0, 0x7f090399

    .line 125
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v3

    const v0, 0x7f090397

    .line 126
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v4

    const v0, 0x7f090396

    .line 127
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v5

    .line 128
    iget-object v0, v15, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStorePurchaseKickAmountText:Ljava/lang/String;

    if-eqz v0, :cond_6

    const-string v0, "0"

    iget-object v6, v15, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStorePurchaseKickAmountText:Ljava/lang/String;

    .line 129
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_3

    :cond_5
    const/4 v0, 0x2

    .line 135
    iget-object v6, v15, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStorePurchaseKickAmountText:Ljava/lang/String;

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    move v7, v0

    goto :goto_4

    :cond_6
    :goto_3
    const/4 v0, 0x0

    move-object v6, v0

    move v7, v11

    :goto_4
    const v8, 0x7f08022d

    const v9, 0x7f08022c

    const/16 v16, 0x136

    move-object/from16 v0, p0

    move-object/from16 v10, p2

    move/from16 v22, v11

    move/from16 v11, v16

    move v15, v12

    move-object/from16 v12, v18

    .line 138
    invoke-direct/range {v0 .. v12}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->populateKicksView(Lcom/shopkick/app/widget/UserEventRelativeLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Ljava/lang/String;IIILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;ILandroid/view/View$OnClickListener;)V

    .line 151
    iget-object v0, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isOnlineOffersEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    const v1, 0x7f0903f2

    if-eqz v0, :cond_a

    .line 152
    invoke-virtual {v14, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    const v0, 0x7f090393

    .line 153
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/shopkick/app/widget/SKTextView;

    const v0, 0x7f090394

    .line 154
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v3

    const v0, 0x7f090392

    .line 155
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v4

    const v0, 0x7f090391

    .line 156
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v5

    .line 157
    iget-object v0, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->onlineStoreTotalAvailableOnlineOfferKicks:Ljava/lang/Integer;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->onlineStoreTotalAvailableOnlineOfferKicks:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    goto :goto_5

    :cond_7
    const/4 v8, 0x0

    :goto_5
    if-lez v8, :cond_8

    .line 158
    invoke-static {v8}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_6

    :cond_8
    const-string v0, "0"

    :goto_6
    move-object v6, v0

    .line 159
    iget-object v0, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->onlineStoreClickedOnlineOfferToday:Ljava/lang/Boolean;

    const/4 v7, 0x0

    invoke-static {v0, v7}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;Z)Z

    move-result v0

    if-nez v8, :cond_9

    move/from16 v7, v22

    .line 160
    :cond_9
    invoke-direct {v13, v7, v8, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->kicksEarnedType(ZIZ)I

    move-result v7

    const v8, 0x7f08022f

    const v9, 0x7f08022e

    const/16 v11, 0x138

    move-object/from16 v0, p0

    move-object/from16 v10, p2

    move-object/from16 v12, v17

    .line 162
    invoke-direct/range {v0 .. v12}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->populateKicksView(Lcom/shopkick/app/widget/UserEventRelativeLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Ljava/lang/String;IIILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;ILandroid/view/View$OnClickListener;)V

    goto :goto_7

    .line 175
    :cond_a
    invoke-virtual {v14, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    .line 176
    invoke-virtual {v0, v15}, Landroid/view/View;->setVisibility(I)V

    :goto_7
    const v0, 0x7f09041b

    .line 179
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Lcom/shopkick/app/util/CommonClickUtils$OnlineStoreButtonClickListener;

    iget-object v3, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    move-object/from16 v4, p2

    invoke-direct {v2, v3, v4}, Lcom/shopkick/app/util/CommonClickUtils$OnlineStoreButtonClickListener;-><init>(Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 180
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 181
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0x132

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 182
    iget-object v2, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 183
    invoke-static/range {v22 .. v22}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setIsOnlineStore(Ljava/lang/Boolean;)V

    .line 185
    new-instance v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 186
    invoke-virtual {v13, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    move/from16 v3, v22

    .line 187
    iput-boolean v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 189
    invoke-virtual {v14, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object v0

    iget-object v3, v13, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, v1, v3, v2}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method

.method public setData(Ljava/lang/Integer;Ljava/lang/Boolean;)V
    .locals 0

    .line 276
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->onlineStoreClickedOnlineOfferToday:Ljava/lang/Boolean;

    .line 277
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;->onlineStoreTotalAvailableOnlineOfferKicks:Ljava/lang/Integer;

    return-void
.end method
