.class public Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "KicksActivityReceiptDetailsScreen.java"

# interfaces
.implements Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final SupportedTileTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

.field private dispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field private firstFetchMade:Z

.field private mainView:Landroid/widget/RelativeLayout;

.field private receiptId:Ljava/lang/Long;

.field private recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x9

    .line 51
    new-array v0, v0, [Ljava/lang/Integer;

    const/16 v1, 0x3a

    .line 52
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/16 v1, 0x38

    .line 53
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/16 v1, 0x39

    .line 54
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/16 v1, -0x2a

    .line 55
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const/16 v1, -0x2b

    .line 56
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const/16 v1, -0x2c

    .line 57
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const/4 v1, -0x1

    .line 58
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const/4 v1, -0x2

    .line 59
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const/16 v1, -0x2d

    .line 60
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    .line 52
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->SupportedTileTypes:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    const/4 v0, 0x0

    .line 62
    iput-object v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->mainView:Landroid/widget/RelativeLayout;

    return-void
.end method

.method public static synthetic lambda$processResponse$75(Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    .line 194
    iget-object p2, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->dispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    const p2, 0x7f110382

    .line 82
    invoke-virtual {p0, p2}, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->setAppScreenTitle(I)V

    const p2, 0x7f0c00ff

    const/4 p3, 0x0

    const/4 v0, 0x0

    .line 83
    invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->mainView:Landroid/widget/RelativeLayout;

    .line 84
    iget-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->mainView:Landroid/widget/RelativeLayout;

    const p2, 0x7f0903b2

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iput-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 86
    new-instance p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    iget-object v1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v4, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    sget-object v5, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->SupportedTileTypes:Ljava/util/List;

    const/4 v6, 0x0

    move-object v0, p1

    move-object v2, p0

    move-object v3, p0

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V

    iput-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    .line 87
    iget-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->removeDefaultItemDecoration()V

    .line 88
    iget-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object p2, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 89
    new-instance p1, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;

    invoke-virtual {p0}, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;-><init>(Landroid/content/Context;)V

    const/4 p2, 0x1

    .line 90
    invoke-virtual {p1, p2}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 91
    iget-object p2, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 93
    iget-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->mainView:Landroid/widget/RelativeLayout;

    return-object p1
.end method

.method public getPageRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 2

    .line 122
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivityReceiptDetailsRequest;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivityReceiptDetailsRequest;-><init>()V

    .line 124
    move-object v0, p1

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivityReceiptDetailsRequest;

    iget-object v1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->receiptId:Ljava/lang/Long;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivityReceiptDetailsRequest;->receiptId:Ljava/lang/Long;

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "receipt_id"

    .line 71
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 72
    invoke-virtual {p0}, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->removeScreen()V

    return-void

    .line 75
    :cond_0
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p1}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->dispatcher:Lcom/shopkick/app/url/URLDispatcher;

    const-string p1, "receipt_id"

    .line 76
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->receiptId:Ljava/lang/Long;

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 210
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 211
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p1

    .line 213
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "image_index"

    .line 214
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "origin_screen"

    const/16 v1, 0x97

    .line 216
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 215
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    const-class p1, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptImagesScreen;

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->goToScreenInCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    const/4 v0, 0x0

    .line 99
    iput-object v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->mainView:Landroid/widget/RelativeLayout;

    .line 100
    iget-object v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->dispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {v0}, Lcom/shopkick/app/url/URLDispatcher;->destroy()V

    .line 101
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    .line 102
    iget-object v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    if-eqz v0, :cond_0

    .line 103
    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->destroy()V

    :cond_0
    return-void
.end method

.method public onScreenDidShow()V
    .locals 1

    .line 110
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidShow()V

    .line 111
    iget-boolean v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->firstFetchMade:Z

    if-nez v0, :cond_0

    .line 112
    iget-object v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->fetchNextPage()V

    const/4 v0, 0x1

    .line 113
    iput-boolean v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->firstFetchMade:Z

    :cond_0
    return-void
.end method

.method public processResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;
    .locals 6

    .line 132
    new-instance p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    invoke-direct {p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;-><init>()V

    .line 135
    iget-boolean v0, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    instance-of v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivityReceiptDetailsResponse;

    if-eqz v0, :cond_0

    .line 136
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivityReceiptDetailsResponse;

    goto :goto_0

    :cond_0
    move-object p2, v1

    :goto_0
    if-nez p2, :cond_1

    .line 141
    sget-object p2, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_RELOAD:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p2, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    goto/16 :goto_2

    .line 145
    :cond_1
    sget-object v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 146
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    .line 148
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivityReceiptDetailsResponse;->receiptStatus:Ljava/lang/Integer;

    const/4 v2, 0x2

    if-eqz v0, :cond_2

    .line 149
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivityReceiptDetailsResponse;->receiptStatus:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1

    :cond_2
    move v0, v2

    .line 152
    :goto_1
    new-instance v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v3}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 153
    invoke-virtual {p0}, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/activities/KicksActivity;

    .line 155
    iget-object v5, p2, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivityReceiptDetailsResponse;->receiptImages:Ljava/util/List;

    invoke-virtual {v4, v5}, Lcom/shopkick/app/activities/KicksActivity;->setReceiptImageURLs(Ljava/util/List;)V

    .line 156
    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivityReceiptDetailsResponse;->totalKicks:Ljava/lang/Integer;

    iput-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    .line 157
    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivityReceiptDetailsResponse;->totalKicksString:Ljava/lang/String;

    iput-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmountText:Ljava/lang/String;

    .line 158
    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivityReceiptDetailsResponse;->submissionTimestamp:Ljava/lang/Long;

    iput-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->occurrenceTimestampMs:Ljava/lang/Long;

    .line 159
    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivityReceiptDetailsResponse;->statusText:Ljava/lang/String;

    iput-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->footerText:Ljava/lang/String;

    const/16 v4, -0x2a

    .line 160
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 161
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kicksActivityType:Ljava/lang/Integer;

    .line 163
    new-instance v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v4}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/16 v5, -0x2b

    .line 164
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iput-object v5, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 165
    iget-object v5, p2, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivityReceiptDetailsResponse;->processedTimestamp:Ljava/lang/Long;

    iput-object v5, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->availabilityTimestampMs:Ljava/lang/Long;

    .line 167
    iget-object v5, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 168
    iget-object v3, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eq v0, v2, :cond_3

    .line 171
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/16 v3, -0x2c

    .line 172
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 173
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->featuredContentType:Ljava/lang/Integer;

    .line 174
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivityReceiptDetailsResponse;->storeName:Ljava/lang/String;

    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    .line 175
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivityReceiptDetailsResponse;->purchaseTimestamp:Ljava/lang/Long;

    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->occurrenceTimestampMs:Ljava/lang/Long;

    .line 176
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivityReceiptDetailsResponse;->receiptTotal:Ljava/lang/String;

    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->completedText:Ljava/lang/String;

    .line 177
    iget-object v3, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 179
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivityReceiptDetailsResponse;->receiptItemDetails:Ljava/util/List;

    if-eqz v2, :cond_3

    .line 180
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 181
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivityReceiptDetailsResponse;->totalKicks:Ljava/lang/Integer;

    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    .line 182
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivityReceiptDetailsResponse;->totalKicksString:Ljava/lang/String;

    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmountText:Ljava/lang/String;

    const/16 v3, -0x2d

    .line 183
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 184
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kicksActivityType:Ljava/lang/Integer;

    .line 185
    iget-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivityReceiptDetailsResponse;->receiptItemDetails:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 186
    iget-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 189
    :cond_3
    iput-object v1, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->nextPageKey:Ljava/lang/String;

    .line 191
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivityReceiptDetailsResponse;->totalKicks:Ljava/lang/Integer;

    const v1, 0x7f0902e2

    const v2, 0x7f090014

    if-eqz v0, :cond_4

    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivityReceiptDetailsResponse;->totalKicks:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_5

    :cond_4
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivityReceiptDetailsResponse;->storeSkLink:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 192
    iget-object v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->mainView:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    .line 193
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivityReceiptDetailsResponse;->storeSkLink:Ljava/lang/String;

    .line 194
    new-instance v3, Lcom/shopkick/app/kicksActivity/-$$Lambda$KicksActivityReceiptDetailsScreen$G6-Jt7oaL04y9TKqq9NDuuhCLPE;

    invoke-direct {v3, p0, p2}, Lcom/shopkick/app/kicksActivity/-$$Lambda$KicksActivityReceiptDetailsScreen$G6-Jt7oaL04y9TKqq9NDuuhCLPE;-><init>(Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 195
    iget-object p2, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->mainView:Landroid/widget/RelativeLayout;

    invoke-virtual {p2, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 196
    iget-object p2, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->mainView:Landroid/widget/RelativeLayout;

    invoke-virtual {p2, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 198
    :cond_5
    iget-object p2, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->mainView:Landroid/widget/RelativeLayout;

    invoke-virtual {p2, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 199
    iget-object p2, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;->mainView:Landroid/widget/RelativeLayout;

    invoke-virtual {p2, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    :goto_2
    return-object p1
.end method
