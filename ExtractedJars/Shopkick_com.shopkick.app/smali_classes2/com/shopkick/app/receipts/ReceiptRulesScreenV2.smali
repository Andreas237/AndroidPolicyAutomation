.class public Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;
.super Lcom/shopkick/app/screens/AppScreen;
.source "ReceiptRulesScreenV2.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/shopkick/app/receipts/JumpCapableScreen;


# static fields
.field public static final CHAIN_ID:Ljava/lang/String; = "CHAIN_ID"

.field public static final LOCATION_ID:Ljava/lang/String; = "LOCATION_ID"

.field public static final MAX_WEEKLY_SUBMISSIONS:Ljava/lang/String; = "MAX_WEEKLY_SUBMISSIONS"

.field public static final SUBMISSIONS_THIS_WEEK:Ljava/lang/String; = "SUBMISSIONS_THIS_WEEK"

.field private static final supportedTileTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

.field private button:Lcom/shopkick/app/widget/SKButton;

.field private categoryJumperController:Lcom/shopkick/app/products/CategoryJumperController;

.field private cfm:Lcom/shopkick/app/application/ClientFlagsManager;

.field private chainId:Ljava/lang/String;

.field private firstFetchMade:Z

.field private jumpHeader:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private lastBestLocation:Landroid/location/Location;

.field private latitude:Ljava/lang/Double;

.field private locationId:Ljava/lang/String;

.field private final locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

.field private longitude:Ljava/lang/Double;

.field private mainView:Landroid/widget/RelativeLayout;

.field private recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x8

    .line 58
    new-array v0, v0, [Ljava/lang/Integer;

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, -0x2

    .line 59
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/16 v1, -0x24

    .line 60
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/16 v1, -0x25

    .line 61
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const/16 v1, -0x28

    .line 62
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const/16 v1, 0x16

    .line 63
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const/16 v1, 0x30

    .line 64
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const/16 v1, 0x2c

    .line 65
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    .line 58
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->supportedTileTypes:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    const/4 v0, 0x0

    .line 67
    iput-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->firstFetchMade:Z

    .line 69
    new-instance v0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2$1;-><init>(Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;)V

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;)Ljava/lang/Double;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->longitude:Ljava/lang/Double;

    return-object p0
.end method

.method static synthetic access$002(Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;Ljava/lang/Double;)Ljava/lang/Double;
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->longitude:Ljava/lang/Double;

    return-object p1
.end method

.method static synthetic access$100(Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;)Ljava/lang/Double;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->latitude:Ljava/lang/Double;

    return-object p0
.end method

.method static synthetic access$102(Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;Ljava/lang/Double;)Ljava/lang/Double;
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->latitude:Ljava/lang/Double;

    return-object p1
.end method

.method static synthetic access$200(Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;)Landroid/location/Location;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->lastBestLocation:Landroid/location/Location;

    return-object p0
.end method

.method static synthetic access$202(Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;Landroid/location/Location;)Landroid/location/Location;
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->lastBestLocation:Landroid/location/Location;

    return-object p1
.end method

.method static synthetic access$300(Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;)Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    return-object p0
.end method

.method private startRequest()V
    .locals 2

    .line 109
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->fetchNextPage()V

    const/4 v0, 0x1

    .line 110
    iput-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->firstFetchMade:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 112
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public checkJumpHeaderTile()V
    .locals 4

    .line 222
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->categoryJumperController:Lcom/shopkick/app/products/CategoryJumperController;

    invoke-virtual {v0}, Lcom/shopkick/app/products/CategoryJumperController;->isShowingController()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 223
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->jumpHeader:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    const/4 v1, 0x1

    const/16 v2, -0x28

    if-nez v0, :cond_0

    .line 224
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 225
    new-instance v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v3}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    iput-object v3, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->jumpHeader:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 226
    iget-object v3, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->jumpHeader:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 227
    iget-object v2, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->jumpHeader:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    iget-object v2, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    invoke-virtual {v2, v0, v1}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->addTilesAtPosition(Ljava/util/List;I)V

    goto :goto_0

    .line 229
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->containsTileOfType(I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 230
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 231
    iget-object v2, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->jumpHeader:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 232
    iget-object v2, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    invoke-virtual {v2, v0, v1}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->addTilesAtPosition(Ljava/util/List;I)V

    goto :goto_0

    .line 235
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->removeJumpHeaderTile()V

    const/4 v0, 0x0

    .line 236
    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->jumpHeader:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    :cond_2
    :goto_0
    return-void
.end method

.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9

    const p2, 0x7f110525

    .line 133
    invoke-virtual {p0, p2}, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->setAppScreenTitle(I)V

    const/4 p2, 0x0

    const p3, 0x7f0c016f

    const/4 v0, 0x0

    .line 134
    invoke-virtual {p1, p3, v0, p2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->mainView:Landroid/widget/RelativeLayout;

    .line 135
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->mainView:Landroid/widget/RelativeLayout;

    const p3, 0x7f090592

    invoke-virtual {p1, p3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 136
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->locationId:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 137
    new-instance p1, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v3, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->locationId:Ljava/lang/String;

    iget-object v4, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    sget-object v5, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->supportedTileTypes:Ljava/util/List;

    const/4 v6, 0x0

    move-object v0, p1

    move-object v2, p0

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Ljava/lang/String;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter$IItemStateCallback;)V

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    goto :goto_0

    .line 143
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->chainId:Ljava/lang/String;

    if-eqz p1, :cond_2

    .line 144
    new-instance p1, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v3, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->chainId:Ljava/lang/String;

    iget-object v4, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->longitude:Ljava/lang/Double;

    iget-object v5, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->latitude:Ljava/lang/Double;

    iget-object v6, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    sget-object v7, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->supportedTileTypes:Ljava/util/List;

    const/4 v8, 0x0

    move-object v0, p1

    move-object v2, p0

    invoke-direct/range {v0 .. v8}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter$IItemStateCallback;)V

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    .line 152
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->lastBestLocation:Landroid/location/Location;

    .line 153
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->lastBestLocation:Landroid/location/Location;

    if-eqz p1, :cond_1

    .line 154
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->longitude:Ljava/lang/Double;

    .line 155
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->lastBestLocation:Landroid/location/Location;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->latitude:Ljava/lang/Double;

    .line 156
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    iget-object p3, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->longitude:Ljava/lang/Double;

    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->latitude:Ljava/lang/Double;

    invoke-virtual {p1, p3, v0}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->setCoordinate(Ljava/lang/Double;Ljava/lang/Double;)V

    goto :goto_0

    .line 158
    :cond_1
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    iget-object p3, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {p1, p3}, Lcom/shopkick/sdk/presence/LocationManager;->initiateLocationUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    .line 162
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->removeDefaultItemDecoration()V

    .line 163
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    const/16 p3, 0x30

    .line 164
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 165
    iget-object p3, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    invoke-virtual {p3, p1}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->setHeaderTileTypes(Ljava/util/Set;)V

    .line 166
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    new-instance p3, Ljava/util/HashSet;

    const/16 v0, -0x25

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p3, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p1, p3}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->setCountIgnoredTileTypes(Ljava/util/Set;)V

    .line 168
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object p3, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    invoke-virtual {p1, p3}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 170
    new-instance p1, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;

    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p1, p3}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;-><init>(Landroid/content/Context;)V

    const/4 p3, 0x1

    .line 171
    invoke-virtual {p1, p3}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 172
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 174
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->mainView:Landroid/widget/RelativeLayout;

    const v0, 0x7f090014

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKButton;

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->button:Lcom/shopkick/app/widget/SKButton;

    .line 175
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->button:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 176
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->button:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 178
    new-instance p1, Lcom/shopkick/app/products/CategoryJumperController;

    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->mainView:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-direct {p1, p0, p2, v0, v1}, Lcom/shopkick/app/products/CategoryJumperController;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/url/URLDispatcher;Landroid/view/View;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->categoryJumperController:Lcom/shopkick/app/products/CategoryJumperController;

    .line 179
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->categoryJumperController:Lcom/shopkick/app/products/CategoryJumperController;

    invoke-virtual {p1, p3}, Lcom/shopkick/app/products/CategoryJumperController;->setMinIndex(I)V

    .line 180
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->mainView:Landroid/widget/RelativeLayout;

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

    const-string v0, "location_id"

    .line 125
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->locationId:Ljava/lang/String;

    const-string v0, "chain_id"

    .line 126
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iput-object p2, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->chainId:Ljava/lang/String;

    .line 127
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p2}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 128
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->cfm:Lcom/shopkick/app/application/ClientFlagsManager;

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 243
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->chainId:Ljava/lang/String;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->locationId:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 244
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "chain_id"

    .line 245
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->chainId:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "location_id"

    .line 246
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->locationId:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    const-class v0, Lcom/shopkick/app/activities/ReceiptScanActivity;

    const-class v1, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;

    invoke-virtual {p0, v0, v1, p1}, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->goToActivityWithScreen(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 89
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 94
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/presence/LocationManager;->cancelLocationUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    .line 95
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->destroy()V

    .line 96
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onScreenDidShow()V
    .locals 1

    .line 101
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidShow()V

    .line 102
    iget-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->firstFetchMade:Z

    if-nez v0, :cond_0

    .line 103
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->startRequest()V

    :cond_0
    return-void
.end method

.method public onTilesLoaded(Ljava/util/ArrayList;Ljava/util/HashMap;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 185
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->categoryJumperController:Lcom/shopkick/app/products/CategoryJumperController;

    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->adapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->getFilteredTiles()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/products/CategoryJumperController;->setupJumpHeader(Ljava/util/List;)V

    .line 186
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->checkJumpHeaderTile()V

    const-string p1, "SUBMISSIONS_THIS_WEEK"

    .line 190
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string p1, "SUBMISSIONS_THIS_WEEK"

    .line 191
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    const-string v1, "MAX_WEEKLY_SUBMISSIONS"

    .line 193
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "MAX_WEEKLY_SUBMISSIONS"

    .line 194
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_1

    :cond_1
    move v1, v0

    :goto_1
    const-string v2, "CHAIN_ID"

    .line 196
    invoke-virtual {p2, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iput-object v2, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->chainId:Ljava/lang/String;

    const-string v2, "LOCATION_ID"

    .line 197
    invoke-virtual {p2, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iput-object p2, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->locationId:Ljava/lang/String;

    .line 198
    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->mainView:Landroid/widget/RelativeLayout;

    const v2, 0x7f090415

    invoke-virtual {p2, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKTextView;

    const v2, 0x7f11051f

    const/4 v3, 0x1

    .line 199
    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v0

    invoke-virtual {p0, v2, v4}, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 200
    invoke-virtual {p2, v2}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    if-lt p1, v1, :cond_2

    .line 202
    invoke-virtual {p2, v0}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 203
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->button:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 204
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->button:Lcom/shopkick/app/widget/SKButton;

    const p2, 0x3ecccccd    # 0.4f

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKButton;->setAlpha(F)V

    goto :goto_2

    :cond_2
    const/16 p1, 0x8

    .line 206
    invoke-virtual {p2, p1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 207
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->button:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1, v3}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 208
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->button:Lcom/shopkick/app/widget/SKButton;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKButton;->setAlpha(F)V

    :goto_2
    return-void
.end method

.method public showJumpToCategory()V
    .locals 1

    .line 217
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptRulesScreenV2;->categoryJumperController:Lcom/shopkick/app/products/CategoryJumperController;

    invoke-virtual {v0}, Lcom/shopkick/app/products/CategoryJumperController;->showJumpToCategoryList()V

    return-void
.end method
