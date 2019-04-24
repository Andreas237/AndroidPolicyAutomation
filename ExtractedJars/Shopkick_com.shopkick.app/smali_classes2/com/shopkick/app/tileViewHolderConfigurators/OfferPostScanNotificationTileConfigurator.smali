.class public Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "OfferPostScanNotificationTileConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator$NotificationSetClickListener;
    }
.end annotation


# instance fields
.field private context:Landroid/content/Context;

.field private postScanNotificationController:Lcom/shopkick/app/products/PostScanNotificationController;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/products/PostScanNotificationController;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator;->context:Landroid/content/Context;

    .line 34
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator;->postScanNotificationController:Lcom/shopkick/app/products/PostScanNotificationController;

    return-void
.end method

.method private convertTimestampToDateString(J)Ljava/lang/String;
    .locals 3

    .line 135
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "h:mm aa"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 136
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 137
    invoke-virtual {v1, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 138
    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private setupLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 8

    .line 92
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x16a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 93
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 94
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLocationId(Ljava/lang/String;)V

    .line 95
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 97
    new-instance v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 98
    invoke-virtual {p0, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 99
    iget-object v3, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 100
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    iput-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 102
    iget-object v3, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    check-cast v3, Lcom/shopkick/app/logging/IUserEventView;

    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-interface {v3, v0, v4, v2}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    const v0, 0x7f090014

    .line 105
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object v0

    const v2, 0x7f0900c6

    .line 106
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object v2

    .line 108
    new-instance v3, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-direct {v3, v4, v6}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 109
    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 110
    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLocationId(Ljava/lang/String;)V

    .line 111
    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 113
    new-instance v4, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v6, 0x30

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-direct {v4, v1, v7}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 114
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {v4, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 115
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    invoke-virtual {v4, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLocationId(Ljava/lang/String;)V

    .line 116
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v4, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 118
    new-instance v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v1}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 119
    invoke-virtual {p0, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    const/4 v7, 0x1

    .line 120
    iput-boolean v7, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 121
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object p1, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 122
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    iput-object p1, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 124
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 125
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, v3, p2, v1}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 129
    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/SKButton;->setRepeatableLogActions(Ljava/util/ArrayList;)V

    .line 130
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v2, v4, p2, v1}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 131
    invoke-virtual {v2, p1}, Lcom/shopkick/app/widget/SKButton;->setRepeatableLogActions(Ljava/util/ArrayList;)V

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c013e

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 44
    invoke-virtual/range {p0 .. p1}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    .line 46
    iget-object v3, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator;->postScanNotificationController:Lcom/shopkick/app/products/PostScanNotificationController;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    iget-object v6, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    iget-object v7, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    .line 47
    invoke-virtual {v3, v6, v7}, Lcom/shopkick/app/products/PostScanNotificationController;->isNotificationSet(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v5

    .line 49
    :goto_0
    iget-object v6, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    if-eqz v6, :cond_1

    iget-object v6, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    goto :goto_1

    :cond_1
    move v6, v5

    :goto_1
    const v7, 0x7f090767

    .line 50
    invoke-virtual {v1, v7}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v7

    const v8, 0x7f0901e6

    .line 51
    invoke-virtual {v1, v8}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v8

    const v9, 0x7f090014

    .line 52
    invoke-virtual {v1, v9}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object v9

    const v10, 0x7f0900c6

    .line 53
    invoke-virtual {v1, v10}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object v10

    const/16 v11, 0x8

    if-nez v3, :cond_2

    .line 57
    iget-object v3, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v12, 0x7f0f002b

    new-array v4, v4, [Ljava/lang/Object;

    .line 60
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    aput-object v13, v4, v5

    .line 58
    invoke-virtual {v3, v12, v6, v4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 57
    invoke-virtual {v7, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v3, 0x7f11045e

    .line 61
    invoke-virtual {v8, v3}, Landroid/widget/TextView;->setText(I)V

    .line 63
    invoke-virtual {v9, v5}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 64
    invoke-virtual {v10, v11}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    goto :goto_2

    :cond_2
    const v3, 0x7f11045c

    .line 68
    invoke-virtual {v7, v3}, Landroid/widget/TextView;->setText(I)V

    .line 69
    iget-object v3, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v6, 0x7f11045b

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v7, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator;->postScanNotificationController:Lcom/shopkick/app/products/PostScanNotificationController;

    iget-object v12, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    .line 71
    invoke-virtual {v7, v12}, Lcom/shopkick/app/products/PostScanNotificationController;->getScheduledTimestamp(Ljava/lang/String;)J

    move-result-wide v12

    invoke-direct {v0, v12, v13}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator;->convertTimestampToDateString(J)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v4, v5

    .line 70
    invoke-virtual {v3, v6, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 69
    invoke-virtual {v8, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 74
    invoke-virtual {v9, v11}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 75
    invoke-virtual {v10, v5}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 78
    :goto_2
    new-instance v3, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator$NotificationSetClickListener;

    iget-object v13, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator;->postScanNotificationController:Lcom/shopkick/app/products/PostScanNotificationController;

    iget-object v14, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    iget-object v15, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    iget-object v4, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    iget-object v5, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    move-object v12, v3

    move-object/from16 v16, v4

    move-object/from16 v17, v5

    invoke-direct/range {v12 .. v17}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator$NotificationSetClickListener;-><init>(Lcom/shopkick/app/products/PostScanNotificationController;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    invoke-virtual {v9, v3}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 85
    invoke-virtual {v10, v3}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 87
    invoke-direct/range {p0 .. p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator;->setupLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method
