.class public Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "ReceiptStoreSelectorScreen.java"

# interfaces
.implements Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;
.implements Lcom/shopkick/app/feed/ISearchBarPressedCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen$CancelOnClickListener;
    }
.end annotation


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
.field private adapter:Lcom/shopkick/app/feed/FilterableAdapter;

.field private cancelButton:Landroid/widget/ImageView;

.field private displaySearch:Z

.field private firstFetchMade:Z

.field private final initiateLocationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

.field private latitude:Ljava/lang/Double;

.field private final locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

.field private longitude:Ljava/lang/Double;

.field private mainView:Landroid/widget/RelativeLayout;

.field private permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

.field private recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

.field private searchTextField:Landroid/widget/EditText;

.field private searchTextWatcher:Landroid/text/TextWatcher;

.field private stickySearchBar:Landroid/view/View;

.field private topSearchBar:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x5

    .line 56
    new-array v0, v0, [Ljava/lang/Integer;

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, -0x2

    .line 57
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/16 v1, -0x2e

    .line 58
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/16 v1, -0x2f

    .line 59
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const/16 v1, 0x3c

    .line 60
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 56
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->SupportedTileTypes:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 53
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    const/4 v0, 0x0

    .line 65
    iput-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->firstFetchMade:Z

    const/4 v0, 0x1

    .line 69
    iput-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->displaySearch:Z

    .line 73
    new-instance v0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen$1;-><init>(Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->searchTextWatcher:Landroid/text/TextWatcher;

    .line 95
    new-instance v0, Lcom/shopkick/app/receipts/-$$Lambda$ReceiptStoreSelectorScreen$xRYGmfLt2FSlMGJWejEOWjwh7MY;

    invoke-direct {v0, p0}, Lcom/shopkick/app/receipts/-$$Lambda$ReceiptStoreSelectorScreen$xRYGmfLt2FSlMGJWejEOWjwh7MY;-><init>(Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->initiateLocationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    .line 96
    new-instance v0, Lcom/shopkick/app/receipts/-$$Lambda$ReceiptStoreSelectorScreen$xRYGmfLt2FSlMGJWejEOWjwh7MY;

    invoke-direct {v0, p0}, Lcom/shopkick/app/receipts/-$$Lambda$ReceiptStoreSelectorScreen$xRYGmfLt2FSlMGJWejEOWjwh7MY;-><init>(Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;)Landroid/widget/EditText;
    .locals 0

    .line 53
    iget-object p0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->searchTextField:Landroid/widget/EditText;

    return-object p0
.end method

.method static synthetic access$002(Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;Landroid/widget/EditText;)Landroid/widget/EditText;
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->searchTextField:Landroid/widget/EditText;

    return-object p1
.end method

.method static synthetic access$100(Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;)Lcom/shopkick/app/feed/FilterableAdapter;
    .locals 0

    .line 53
    iget-object p0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->adapter:Lcom/shopkick/app/feed/FilterableAdapter;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;)Z
    .locals 0

    .line 53
    iget-boolean p0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->displaySearch:Z

    return p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;)Landroid/view/View;
    .locals 0

    .line 53
    iget-object p0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->stickySearchBar:Landroid/view/View;

    return-object p0
.end method

.method private handleLocationUpdate(Landroid/location/Location;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 162
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->latitude:Ljava/lang/Double;

    .line 163
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->longitude:Ljava/lang/Double;

    .line 164
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->startRequest()V

    :cond_0
    return-void
.end method

.method public static synthetic lambda$createScreen$212(Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;Landroid/view/View;)V
    .locals 0

    .line 155
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->searchBarSelected()V

    return-void
.end method

.method public static synthetic lambda$processResponse$213(Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 279
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->finish()V

    return-void
.end method

.method public static synthetic lambda$xRYGmfLt2FSlMGJWejEOWjwh7MY(Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;Landroid/location/Location;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->handleLocationUpdate(Landroid/location/Location;)V

    return-void
.end method

.method private startRequest()V
    .locals 2

    .line 220
    :try_start_0
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    .line 221
    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    .line 222
    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/presence/LocationManager;->removeLocationUpdateListener(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    .line 223
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->adapter:Lcom/shopkick/app/feed/FilterableAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FilterableAdapter;->fetchNextPage()V

    const/4 v0, 0x1

    .line 224
    iput-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->firstFetchMade:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 227
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 8

    const p3, 0x7f110552

    .line 111
    invoke-virtual {p0, p3}, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->setAppScreenTitle(I)V

    const/4 p3, 0x0

    const v0, 0x7f0c017a

    .line 112
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->mainView:Landroid/widget/RelativeLayout;

    .line 113
    new-instance p1, Lcom/shopkick/app/permissions/PermissionsRequestController;

    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-direct {p1, p0, p2}, Lcom/shopkick/app/permissions/PermissionsRequestController;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/logging/UserEventLogger;)V

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    .line 114
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    const-string p2, "android.permission.ACCESS_COARSE_LOCATION"

    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090443

    .line 115
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 114
    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->requestPermission(Ljava/lang/String;Landroid/view/View;)V

    .line 117
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->mainView:Landroid/widget/RelativeLayout;

    const p2, 0x7f09059a

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 118
    new-instance p1, Lcom/shopkick/app/feed/FilterableAdapter;

    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v4, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    sget-object v5, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->SupportedTileTypes:Ljava/util/List;

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v0, p1

    move-object v2, p0

    move-object v3, p0

    invoke-direct/range {v0 .. v7}, Lcom/shopkick/app/feed/FilterableAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;I)V

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->adapter:Lcom/shopkick/app/feed/FilterableAdapter;

    .line 125
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance p2, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen$2;

    invoke-direct {p2, p0}, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen$2;-><init>(Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;)V

    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addOnScrollListener(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V

    .line 141
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->adapter:Lcom/shopkick/app/feed/FilterableAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/feed/FilterableAdapter;->removeDefaultItemDecoration()V

    .line 142
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->adapter:Lcom/shopkick/app/feed/FilterableAdapter;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 143
    new-instance p1, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;

    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;-><init>(Landroid/content/Context;)V

    const/4 p2, 0x1

    .line 144
    invoke-virtual {p1, p2}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 145
    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 147
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->mainView:Landroid/widget/RelativeLayout;

    const p2, 0x7f09010b

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->cancelButton:Landroid/widget/ImageView;

    .line 148
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->cancelButton:Landroid/widget/ImageView;

    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 149
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->cancelButton:Landroid/widget/ImageView;

    new-instance p2, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen$CancelOnClickListener;

    iget-object p3, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->searchTextField:Landroid/widget/EditText;

    invoke-direct {p2, p0, p3}, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen$CancelOnClickListener;-><init>(Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;Landroid/widget/EditText;)V

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 150
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->mainView:Landroid/widget/RelativeLayout;

    const p2, 0x7f09064a

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->searchTextField:Landroid/widget/EditText;

    .line 151
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/activities/BaseActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    const-string p2, "fonts/AvenirLTStd-Medium.otf"

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p1

    .line 152
    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->searchTextField:Landroid/widget/EditText;

    invoke-virtual {p2, p1}, Landroid/widget/EditText;->setTypeface(Landroid/graphics/Typeface;)V

    .line 153
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->searchTextField:Landroid/widget/EditText;

    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->searchTextWatcher:Landroid/text/TextWatcher;

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 154
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->mainView:Landroid/widget/RelativeLayout;

    const p2, 0x7f0906de

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->stickySearchBar:Landroid/view/View;

    .line 155
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->stickySearchBar:Landroid/view/View;

    new-instance p2, Lcom/shopkick/app/receipts/-$$Lambda$ReceiptStoreSelectorScreen$XR_1ZtCRgPvoOM2BeycnB0LQVaU;

    invoke-direct {p2, p0}, Lcom/shopkick/app/receipts/-$$Lambda$ReceiptStoreSelectorScreen$XR_1ZtCRgPvoOM2BeycnB0LQVaU;-><init>(Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 156
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->mainView:Landroid/widget/RelativeLayout;

    const p2, 0x7f09063b

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->topSearchBar:Landroid/view/View;

    .line 157
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->mainView:Landroid/widget/RelativeLayout;

    return-object p1
.end method

.method public getPageRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 1

    .line 236
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/GetListForStoreSelectorRequest;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/GetListForStoreSelectorRequest;-><init>()V

    .line 237
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->latitude:Ljava/lang/Double;

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetListForStoreSelectorRequest;->latitude:Ljava/lang/Double;

    .line 238
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->longitude:Ljava/lang/Double;

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetListForStoreSelectorRequest;->longitude:Ljava/lang/Double;

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 2
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

    .line 101
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 103
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->latitude:Ljava/lang/Double;

    .line 104
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->longitude:Ljava/lang/Double;

    :cond_0
    return-void
.end method

.method public onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;
    .locals 1

    .line 170
    iget-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->displaySearch:Z

    if-nez v0, :cond_0

    .line 171
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->searchBarHidden()V

    .line 172
    sget-object v0, Lcom/shopkick/app/screens/AppScreen$BackPressedState;->DONT_GO_BACK:Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    return-object v0

    .line 174
    :cond_0
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    move-result-object v0

    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .line 180
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->adapter:Lcom/shopkick/app/feed/FilterableAdapter;

    if-eqz v0, :cond_0

    .line 181
    invoke-virtual {v0}, Lcom/shopkick/app/feed/FilterableAdapter;->destroy()V

    .line 184
    :cond_0
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    .line 185
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/presence/LocationManager;->removeLocationUpdateListener(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    .line 186
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->initiateLocationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/presence/LocationManager;->cancelLocationUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    .line 187
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onScreenDidShow()V
    .locals 3

    .line 193
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidShow()V

    .line 194
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    invoke-virtual {v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->showPermViewsIfDisabled()V

    .line 195
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    if-eqz v0, :cond_0

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    .line 196
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->latitude:Ljava/lang/Double;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->longitude:Ljava/lang/Double;

    if-nez v0, :cond_2

    .line 198
    :cond_0
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 200
    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->latitude:Ljava/lang/Double;

    .line 201
    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->longitude:Ljava/lang/Double;

    goto :goto_0

    .line 203
    :cond_1
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    .line 204
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/presence/LocationManager;->addLocationUpdateListener(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    .line 205
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->initiateLocationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/presence/LocationManager;->initiateLocationUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    .line 208
    :cond_2
    :goto_0
    iget-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->firstFetchMade:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->latitude:Ljava/lang/Double;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->longitude:Ljava/lang/Double;

    if-eqz v0, :cond_3

    .line 209
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->startRequest()V

    :cond_3
    return-void
.end method

.method public processResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;
    .locals 3

    .line 248
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    instance-of p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetListForStoreSelectorResponse;

    if-eqz p1, :cond_0

    .line 249
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetListForStoreSelectorResponse;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 252
    :goto_0
    new-instance v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    invoke-direct {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;-><init>()V

    .line 253
    iget-boolean p2, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p2, :cond_5

    if-nez p1, :cond_1

    goto :goto_1

    .line 261
    :cond_1
    sget-object p2, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 262
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {p2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/16 v1, -0x2e

    .line 263
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 264
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/16 v2, -0x2f

    .line 265
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 266
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    .line 267
    iget-object v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    invoke-interface {v2, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 268
    iget-object p2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 269
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/GetListForStoreSelectorResponse;->errorDialogHeader:Ljava/lang/String;

    if-nez p2, :cond_2

    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/GetListForStoreSelectorResponse;->errorDialogBody:Ljava/lang/String;

    if-nez p2, :cond_2

    .line 270
    iget-object p2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetListForStoreSelectorResponse;->listTiles:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    .line 272
    :cond_2
    new-instance p2, Landroid/support/v7/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {p2, v1}, Landroid/support/v7/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 273
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetListForStoreSelectorResponse;->errorDialogHeader:Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 274
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetListForStoreSelectorResponse;->errorDialogHeader:Ljava/lang/String;

    invoke-virtual {p2, v1}, Landroid/support/v7/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/support/v7/app/AlertDialog$Builder;

    .line 276
    :cond_3
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetListForStoreSelectorResponse;->errorDialogBody:Ljava/lang/String;

    if-eqz v1, :cond_4

    .line 277
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetListForStoreSelectorResponse;->errorDialogBody:Ljava/lang/String;

    invoke-virtual {p2, p1}, Landroid/support/v7/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/support/v7/app/AlertDialog$Builder;

    :cond_4
    const p1, 0x7f110140

    .line 279
    new-instance v1, Lcom/shopkick/app/receipts/-$$Lambda$ReceiptStoreSelectorScreen$tyerS4PdgJNRumUM--1Js3-Oi5k;

    invoke-direct {v1, p0}, Lcom/shopkick/app/receipts/-$$Lambda$ReceiptStoreSelectorScreen$tyerS4PdgJNRumUM--1Js3-Oi5k;-><init>(Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;)V

    invoke-virtual {p2, p1, v1}, Landroid/support/v7/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;

    const/4 p1, 0x0

    .line 280
    invoke-virtual {p2, p1}, Landroid/support/v7/app/AlertDialog$Builder;->setCancelable(Z)Landroid/support/v7/app/AlertDialog$Builder;

    .line 281
    invoke-virtual {p2}, Landroid/support/v7/app/AlertDialog$Builder;->show()Landroid/support/v7/app/AlertDialog;

    goto :goto_2

    .line 256
    :cond_5
    :goto_1
    sget-object p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_RELOAD:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    :goto_2
    return-object v0
.end method

.method public searchBarHidden()V
    .locals 4

    const/4 v0, 0x1

    .line 302
    iput-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->displaySearch:Z

    .line 303
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->topSearchBar:Landroid/view/View;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 304
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->searchTextField:Landroid/widget/EditText;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 305
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->adapter:Lcom/shopkick/app/feed/FilterableAdapter;

    invoke-virtual {v1}, Lcom/shopkick/app/feed/FilterableAdapter;->getFilter()Landroid/widget/Filter;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;)V

    .line 306
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v3, "input_method"

    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 308
    iget-object v3, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v3}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->findViewByPosition(I)Landroid/view/View;

    move-result-object v0

    const/4 v3, 0x0

    if-nez v0, :cond_0

    .line 310
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->stickySearchBar:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 312
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->stickySearchBar:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 314
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->searchTextField:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    invoke-virtual {v1, v0, v3}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    return-void
.end method

.method public searchBarSelected()V
    .locals 3

    const/4 v0, 0x0

    .line 291
    iput-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->displaySearch:Z

    .line 292
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->adapter:Lcom/shopkick/app/feed/FilterableAdapter;

    invoke-virtual {v1}, Lcom/shopkick/app/feed/FilterableAdapter;->setupForSearch()V

    .line 293
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->topSearchBar:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 294
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->stickySearchBar:Landroid/view/View;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 295
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->searchTextField:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->requestFocus()Z

    .line 296
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "input_method"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 297
    iget-object v2, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->searchTextField:Landroid/widget/EditText;

    invoke-virtual {v1, v2, v0}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    return-void
.end method
