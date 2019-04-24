.class public Lcom/shopkick/app/receipts/KickbateItemDataSource;
.super Ljava/lang/Object;
.source "KickbateItemDataSource.java"

# interfaces
.implements Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;


# static fields
.field private static final RECEIPT_TILE_SUFFIX:Ljava/lang/String; = "_K4R"

.field private static final TILE_TYPE_BUNDLE_INFO:I = 0x3

.field private static final TILE_TYPE_HEADER:I = 0x1

.field private static final TILE_TYPE_KICKBATE:I = 0x2


# instance fields
.field private callback:Lcom/shopkick/app/receipts/DataSourcePageCompletedCallback;

.field private chain:Ljava/lang/String;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private latitude:Ljava/lang/Double;

.field private location:Ljava/lang/String;

.field private longitude:Ljava/lang/Double;

.field private suffix:Ljava/lang/String;

.field private final supportedTileTypes:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/receipts/DataSourcePageCompletedCallback;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Collection;Lcom/shopkick/app/application/ClientFlagsManager;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/receipts/DataSourcePageCompletedCallback;",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/shopkick/app/application/ClientFlagsManager;",
            ")V"
        }
    .end annotation

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    iput-object p1, p0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->callback:Lcom/shopkick/app/receipts/DataSourcePageCompletedCallback;

    .line 81
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1, p5}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->supportedTileTypes:Ljava/util/HashSet;

    .line 82
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 83
    iput-object p2, p0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->chain:Ljava/lang/String;

    .line 85
    :cond_0
    iput-object p3, p0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->longitude:Ljava/lang/Double;

    .line 86
    iput-object p4, p0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->latitude:Ljava/lang/Double;

    .line 87
    iput-object p6, p0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/app/receipts/DataSourcePageCompletedCallback;Ljava/lang/String;Ljava/util/Collection;Lcom/shopkick/app/application/ClientFlagsManager;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/receipts/DataSourcePageCompletedCallback;",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/shopkick/app/application/ClientFlagsManager;",
            ")V"
        }
    .end annotation

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput-object p1, p0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->callback:Lcom/shopkick/app/receipts/DataSourcePageCompletedCallback;

    .line 67
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1, p3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->supportedTileTypes:Ljava/util/HashSet;

    .line 68
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 69
    iput-object p2, p0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->location:Ljava/lang/String;

    .line 71
    :cond_0
    iput-object p4, p0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    return-void
.end method

.method private makeBundleProductTileInfoV2(Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 2

    .line 265
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/16 v1, -0x38

    .line 266
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 267
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->productFamilyId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    .line 268
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->title:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    .line 269
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->receiptScanKicks:Ljava/lang/Integer;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    .line 270
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->smallImageUrl:Ljava/lang/String;

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public getLocation()Ljava/lang/String;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->location:Ljava/lang/String;

    return-object v0
.end method

.method public getPageRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 3

    .line 287
    iget-object v0, p0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->location:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->chain:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 288
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "locationId and chainId are both not set or are empty. KickbateItemDataSource requires either a location_id or chain_id, longitude and latitude"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 293
    :cond_1
    :goto_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetSelectableReceiptScanItemsRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetSelectableReceiptScanItemsRequest;-><init>()V

    .line 294
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetSelectableReceiptScanItemsRequest;->previousPageKey:Ljava/lang/String;

    .line 295
    iget-object p1, p0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->location:Ljava/lang/String;

    if-eqz p1, :cond_2

    .line 296
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetSelectableReceiptScanItemsRequest;->locationId:Ljava/lang/String;

    goto :goto_1

    .line 297
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->chain:Ljava/lang/String;

    if-eqz p1, :cond_3

    iget-object v1, p0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->longitude:Ljava/lang/Double;

    if-eqz v1, :cond_3

    iget-object v2, p0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->latitude:Ljava/lang/Double;

    if-eqz v2, :cond_3

    .line 298
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetSelectableReceiptScanItemsRequest;->chainId:Ljava/lang/String;

    .line 299
    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetSelectableReceiptScanItemsRequest;->longitude:Ljava/lang/Double;

    .line 300
    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/GetSelectableReceiptScanItemsRequest;->latitude:Ljava/lang/Double;

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method public getSuffix()Ljava/lang/String;
    .locals 1

    .line 314
    iget-object v0, p0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->suffix:Ljava/lang/String;

    return-object v0
.end method

.method public processResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 118
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 119
    iget-object v3, v1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    instance-of v3, v3, Lcom/shopkick/app/fetchers/api/skapi/GetSelectableReceiptScanItemsResponse;

    if-eqz v3, :cond_0

    .line 120
    iget-object v3, v1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/GetSelectableReceiptScanItemsResponse;

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 122
    :goto_0
    new-instance v5, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    invoke-direct {v5}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;-><init>()V

    .line 123
    iget-boolean v1, v1, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v1, :cond_12

    if-nez v3, :cond_1

    goto/16 :goto_7

    .line 130
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 133
    iget-object v6, v0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->supportedTileTypes:Ljava/util/HashSet;

    const/16 v7, -0x24

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 134
    new-instance v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v6}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 135
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iput-object v7, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 136
    iget-object v7, v3, Lcom/shopkick/app/fetchers/api/skapi/GetSelectableReceiptScanItemsResponse;->rulesHeaderText:Ljava/lang/String;

    iput-object v7, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    .line 137
    invoke-virtual {v6}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v7

    const-string v8, "RULES"

    iget-object v9, v3, Lcom/shopkick/app/fetchers/api/skapi/GetSelectableReceiptScanItemsResponse;->receiptRules:Ljava/util/List;

    invoke-virtual {v7, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    iget-object v7, v3, Lcom/shopkick/app/fetchers/api/skapi/GetSelectableReceiptScanItemsResponse;->chainLogoImageUrl:Ljava/lang/String;

    iput-object v7, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainImageUrl:Ljava/lang/String;

    .line 139
    iget-object v7, v3, Lcom/shopkick/app/fetchers/api/skapi/GetSelectableReceiptScanItemsResponse;->restrictionsText:Ljava/lang/String;

    iput-object v7, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->footerText:Ljava/lang/String;

    .line 140
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    :cond_2
    iget-object v6, v3, Lcom/shopkick/app/fetchers/api/skapi/GetSelectableReceiptScanItemsResponse;->maxNumWeeklySubmissions:Ljava/lang/Integer;

    if-eqz v6, :cond_3

    const-string v6, "MAX_WEEKLY_SUBMISSIONS"

    .line 143
    iget-object v7, v3, Lcom/shopkick/app/fetchers/api/skapi/GetSelectableReceiptScanItemsResponse;->maxNumWeeklySubmissions:Ljava/lang/Integer;

    invoke-virtual {v2, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    :cond_3
    iget-object v6, v3, Lcom/shopkick/app/fetchers/api/skapi/GetSelectableReceiptScanItemsResponse;->numSubmissionsThisWeek:Ljava/lang/Integer;

    if-eqz v6, :cond_4

    const-string v6, "SUBMISSIONS_THIS_WEEK"

    .line 146
    iget-object v7, v3, Lcom/shopkick/app/fetchers/api/skapi/GetSelectableReceiptScanItemsResponse;->numSubmissionsThisWeek:Ljava/lang/Integer;

    invoke-virtual {v2, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    const-string v6, "CHAIN_ID"

    .line 148
    iget-object v7, v3, Lcom/shopkick/app/fetchers/api/skapi/GetSelectableReceiptScanItemsResponse;->chainId:Ljava/lang/String;

    invoke-virtual {v2, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "LOCATION_ID"

    .line 149
    iget-object v7, v3, Lcom/shopkick/app/fetchers/api/skapi/GetSelectableReceiptScanItemsResponse;->locationId:Ljava/lang/String;

    invoke-virtual {v2, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    sget-object v6, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v6, v5, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 154
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 155
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 156
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 158
    iget-object v9, v3, Lcom/shopkick/app/fetchers/api/skapi/GetSelectableReceiptScanItemsResponse;->receiptScanItems:Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v11, 0x0

    :cond_5
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_d

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;

    .line 159
    iget-object v13, v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->type:Ljava/lang/Integer;

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    const/4 v14, 0x1

    const/16 v15, 0x32

    packed-switch v13, :pswitch_data_0

    .line 220
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v4

    .line 221
    invoke-virtual {v4}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v4

    sget-object v10, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    .line 222
    invoke-virtual {v10}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v13

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "TileType invalid: "

    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v12, v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->type:Ljava/lang/Integer;

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    const/4 v12, 0x0

    new-array v15, v12, [Ljava/lang/Object;

    invoke-virtual {v4, v13, v14, v10, v15}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 193
    :pswitch_0
    new-instance v13, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v13}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 194
    iget-object v4, v0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->supportedTileTypes:Ljava/util/HashSet;

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v4, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 195
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v13, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 197
    :cond_6
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iput-object v4, v13, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    .line 198
    new-instance v4, Ljava/util/ArrayList;

    iget-object v10, v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->offerBundleInfo:Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;

    iget-object v10, v10, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->offerBundleId:Ljava/lang/String;

    invoke-static {v10}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    invoke-direct {v4, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v4, v13, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    .line 199
    iget-object v4, v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->offerBundleInfo:Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->title:Ljava/lang/String;

    iput-object v4, v13, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    .line 200
    iget-object v4, v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->offerBundleInfo:Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->subtitle:Ljava/lang/String;

    iput-object v4, v13, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->subtitle:Ljava/lang/String;

    .line 201
    iget-object v4, v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->offerBundleInfo:Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->additionalDetails:Ljava/lang/String;

    iput-object v4, v13, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->footerText:Ljava/lang/String;

    .line 202
    iget-object v4, v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->offerBundleInfo:Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->mainImageUrl:Ljava/lang/String;

    iput-object v4, v13, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    .line 203
    iget-object v4, v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->offerBundleInfo:Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->largeImageUrl:Ljava/lang/String;

    iput-object v4, v13, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->largeImageUrl:Ljava/lang/String;

    .line 204
    iget-object v4, v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->offerBundleInfo:Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->sumProductReceiptKicks:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v10, v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->offerBundleInfo:Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;

    iget-object v10, v10, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->bonusReceiptKicks:Ljava/lang/Integer;

    .line 205
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    add-int/2addr v4, v10

    .line 204
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v13, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    .line 206
    iget-object v4, v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->offerBundleInfo:Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->currentlyClaimable:Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    xor-int/2addr v4, v14

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iput-object v4, v13, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    .line 207
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 208
    iget-object v10, v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->offerBundleInfo:Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;

    iget-object v10, v10, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->productScanInfos:Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_7
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_8

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    .line 209
    invoke-direct {v0, v14}, Lcom/shopkick/app/receipts/KickbateItemDataSource;->makeBundleProductTileInfoV2(Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v15

    invoke-virtual {v4, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 210
    iget-object v15, v14, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->minimumAgeForKicks:Ljava/lang/Integer;

    if-eqz v15, :cond_7

    .line 211
    iget-object v14, v14, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->minimumAgeForKicks:Ljava/lang/Integer;

    iput-object v14, v13, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->minimumAgeForKicks:Ljava/lang/Integer;

    goto :goto_2

    .line 214
    :cond_8
    iget-object v10, v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->offerBundleInfo:Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;

    iget-object v10, v10, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->offerBundleId:Ljava/lang/String;

    invoke-virtual {v6, v10, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    iget-object v4, v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->offerBundleInfo:Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->offerBundleId:Ljava/lang/String;

    iget-object v10, v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->offerBundleInfo:Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;

    iget-object v10, v10, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->bonusReceiptKicks:Ljava/lang/Integer;

    if-eqz v10, :cond_9

    iget-object v10, v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->offerBundleInfo:Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;

    iget-object v10, v10, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->bonusReceiptKicks:Ljava/lang/Integer;

    .line 216
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    goto :goto_3

    :cond_9
    const/4 v10, 0x0

    .line 215
    :goto_3
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v8, v4, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 169
    :pswitch_1
    new-instance v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v4}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 170
    iget-object v10, v0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->supportedTileTypes:Ljava/util/HashSet;

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    .line 171
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    iput-object v10, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    goto :goto_4

    .line 172
    :cond_a
    iget-object v10, v0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->supportedTileTypes:Ljava/util/HashSet;

    const/16 v13, 0x2c

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual {v10, v14}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    .line 173
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    iput-object v10, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    const-string v10, "_K4R"

    .line 174
    iput-object v10, v0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->suffix:Ljava/lang/String;

    .line 178
    :cond_b
    :goto_4
    iget-object v10, v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->productScanInfo:Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    iget-object v10, v10, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->title:Ljava/lang/String;

    iput-object v10, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    .line 179
    iget-object v10, v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->productScanInfo:Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    iget-object v10, v10, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->subtitle:Ljava/lang/String;

    iput-object v10, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->subtitle:Ljava/lang/String;

    .line 180
    iget-object v10, v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->productScanInfo:Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    iget-object v10, v10, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->smallImageUrl:Ljava/lang/String;

    iput-object v10, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    .line 181
    iget-object v10, v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->productScanInfo:Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    iget-object v10, v10, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->receiptScanKicks:Ljava/lang/Integer;

    iput-object v10, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    .line 182
    iget-object v10, v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->productScanInfo:Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    iget-object v10, v10, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->productFamilyId:Ljava/lang/String;

    iput-object v10, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    .line 183
    iget-object v10, v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->productScanInfo:Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    iget-object v10, v10, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->receiptScanCompleted:Ljava/lang/Boolean;

    iput-object v10, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    .line 184
    iget-object v10, v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->productScanInfo:Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    iget-object v10, v10, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->minimumAgeForKicks:Ljava/lang/Integer;

    iput-object v10, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->minimumAgeForKicks:Ljava/lang/Integer;

    .line 185
    iget-object v10, v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->productScanInfo:Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    iget-object v10, v10, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->minimumPurchaseRequirement:Ljava/lang/Integer;

    iput-object v10, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->minimumPurchaseRequirement:Ljava/lang/Integer;

    const/4 v10, 0x0

    .line 186
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    iput-object v13, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    .line 187
    iget-object v10, v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->productScanInfo:Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    iget-object v10, v10, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->productFamilyId:Ljava/lang/String;

    iget-object v12, v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->productScanInfo:Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    iget-object v12, v12, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->receiptScanKicks:Ljava/lang/Integer;

    invoke-virtual {v7, v10, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 161
    :pswitch_2
    iget-object v4, v0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->supportedTileTypes:Ljava/util/HashSet;

    iget-object v10, v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->tile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v10, v10, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v4, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 162
    iget-object v4, v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->tile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/16 v10, 0x31

    if-ne v4, v10, :cond_c

    goto :goto_5

    :cond_c
    move v14, v11

    .line 165
    :goto_5
    iget-object v4, v12, Lcom/shopkick/app/fetchers/api/skapi/ListItemWrapper;->tile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v11, v14

    goto/16 :goto_1

    :cond_d
    const-string v4, "PRODUCT_SELECTOR_SCREEN_BUNDLE_PRODUCT_MAP_KEY"

    .line 226
    invoke-virtual {v2, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "PRODUCT_SELECTOR_SCREEN_OFFER_KICKS_MAP"

    .line 227
    invoke-virtual {v2, v4, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "PRODUCT_SELECTOR_SCREEN_BUNDLE_KICKS_MAP"

    .line 228
    invoke-virtual {v2, v4, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    iget-object v4, v0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->supportedTileTypes:Ljava/util/HashSet;

    const/16 v6, -0x25

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_f

    .line 232
    new-instance v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v4}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 233
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iput-object v6, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 234
    iget-object v6, v3, Lcom/shopkick/app/fetchers/api/skapi/GetSelectableReceiptScanItemsResponse;->learnMoreWebview:Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;

    if-eqz v6, :cond_e

    .line 235
    invoke-virtual {v4}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v6

    const-string v7, "LEARN_MORE"

    iget-object v8, v3, Lcom/shopkick/app/fetchers/api/skapi/GetSelectableReceiptScanItemsResponse;->learnMoreWebview:Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;

    iget-object v8, v8, Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;->url:Ljava/lang/String;

    .line 236
    invoke-virtual {v6, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    :cond_e
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 242
    :cond_f
    iget-object v4, v0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->supportedTileTypes:Ljava/util/HashSet;

    const/16 v6, 0x51

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_10

    iget-object v4, v0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 243
    invoke-static {v4}, Lcom/shopkick/app/util/FeatureFlagHelper;->isProductSelectorItemCheckHeaderEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v4

    if-eqz v4, :cond_10

    .line 244
    new-instance v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v4}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 245
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iput-object v6, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 246
    invoke-virtual {v4}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v6

    const-string v7, "BUTTON_STYLE_BASED_ON_K4RR_STORE"

    .line 248
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    .line 247
    invoke-virtual {v6, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    new-instance v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v6}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/16 v7, 0x52

    .line 250
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iput-object v7, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    const/4 v7, 0x0

    .line 251
    invoke-virtual {v1, v7, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 252
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 255
    :cond_10
    iget-object v4, v0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->callback:Lcom/shopkick/app/receipts/DataSourcePageCompletedCallback;

    if-eqz v4, :cond_11

    .line 256
    invoke-interface {v4, v1, v2}, Lcom/shopkick/app/receipts/DataSourcePageCompletedCallback;->pageLoaded(Ljava/util/ArrayList;Ljava/util/HashMap;)V

    const/4 v1, 0x0

    goto :goto_6

    :cond_11
    const/4 v1, 0x0

    .line 258
    :goto_6
    iput-object v1, v5, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    .line 259
    iget-object v1, v3, Lcom/shopkick/app/fetchers/api/skapi/GetSelectableReceiptScanItemsResponse;->pageKey:Ljava/lang/String;

    iput-object v1, v5, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->nextPageKey:Ljava/lang/String;

    goto :goto_8

    :cond_12
    :goto_7
    const/4 v1, 0x0

    .line 124
    sget-object v3, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_RELOAD:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v3, v5, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 125
    iget-object v3, v0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->callback:Lcom/shopkick/app/receipts/DataSourcePageCompletedCallback;

    if-eqz v3, :cond_13

    .line 126
    invoke-interface {v3, v1, v2}, Lcom/shopkick/app/receipts/DataSourcePageCompletedCallback;->pageLoaded(Ljava/util/ArrayList;Ljava/util/HashMap;)V

    :cond_13
    :goto_8
    return-object v5

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setCoordinate(Ljava/lang/Double;Ljava/lang/Double;)V
    .locals 0

    .line 102
    iput-object p2, p0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->latitude:Ljava/lang/Double;

    .line 103
    iput-object p1, p0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->longitude:Ljava/lang/Double;

    return-void
.end method

.method public setLocation(Ljava/lang/String;)V
    .locals 0

    .line 98
    iput-object p1, p0, Lcom/shopkick/app/receipts/KickbateItemDataSource;->location:Ljava/lang/String;

    return-void
.end method
