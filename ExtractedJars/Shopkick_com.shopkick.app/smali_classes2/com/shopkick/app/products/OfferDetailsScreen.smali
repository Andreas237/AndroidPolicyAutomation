.class public Lcom/shopkick/app/products/OfferDetailsScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "OfferDetailsScreen.java"

# interfaces
.implements Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;
.implements Lcom/shopkick/app/util/INotificationObserver;


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "OfferDetailsScreen"


# instance fields
.field private adapter:Lcom/shopkick/app/products/OfferDetailsAdapter;

.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private bundleIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private chainId:Ljava/lang/String;

.field private irCollTokenID:Ljava/lang/String;

.field private isOfferBundle:Z

.field private isOnlineOffer:Z

.field private locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

.field private locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

.field private locations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;",
            ">;"
        }
    .end annotation
.end field

.field private mainView:Landroid/view/View;

.field private nearbyLocationsDataSource:Lcom/shopkick/app/location/NearbyLocationsDataSource;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private productFamilyId:Ljava/lang/String;

.field private productFamilyTileInfos:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation
.end field

.field private progressBar:Landroid/widget/ProgressBar;

.field private recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

.field private scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

.field private scanIRDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;

.field private shouldRefreshScreen:Z

.field private showVideoDialogOnResume:Z

.field private taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

.field private tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private videoBonusKicksDialogFragment:Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;

.field private videoKicks:I

.field private widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method private getDeeplinkOnlineOfferTile()V
    .locals 6

    .line 592
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->chainId:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/16 v2, 0xfa5

    invoke-virtual {v0, v2, v1}, Lcom/shopkick/app/widget/WidgetDataSource;->getData(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 593
    instance-of v1, v0, Lcom/shopkick/fetchers/DataResponse;

    if-eqz v1, :cond_3

    check-cast v0, Lcom/shopkick/fetchers/DataResponse;

    iget-boolean v1, v0, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-nez v1, :cond_0

    goto :goto_0

    .line 597
    :cond_0
    iget-object v0, v0, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;

    .line 598
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;->onlineOfferTiles:Ljava/util/List;

    const/16 v2, 0x8

    if-eqz v1, :cond_2

    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;->onlineOfferTiles:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_2

    .line 599
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;->onlineOfferTiles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 600
    iget-object v4, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    iget-object v5, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 601
    invoke-virtual {v1, v3}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 602
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 603
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v0, v3}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setVisibility(I)V

    .line 604
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/products/OfferDetailsScreen;->setAppScreenTitle(Ljava/lang/String;)V

    .line 605
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->adapter:Lcom/shopkick/app/products/OfferDetailsAdapter;

    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->locations:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/products/OfferDetailsAdapter;->populateFeedTiles(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/util/List;)V

    .line 606
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->adapter:Lcom/shopkick/app/products/OfferDetailsAdapter;

    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/products/OfferDetailsAdapter;->processOnlineOfferDetailsScreen(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void

    .line 611
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 612
    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->goDefaultScreen()V

    return-void

    .line 594
    :cond_3
    :goto_0
    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->goDefaultScreen()V

    return-void
.end method

.method private getProductTileInfoAndSetupCategoryNameLocation()V
    .locals 2

    .line 404
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->getScanInfoForProductFamilyId(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/util/TileUtils;->convertProductScanInfoToTileInfo(Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 405
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->productFamilyId:Ljava/lang/String;

    .line 406
    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->setupLocations()V

    .line 407
    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->setupTaxonomyName()V

    return-void
.end method

.method private getUnfetchedProductIds()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 261
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 262
    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyIds:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 263
    iget-object v3, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    invoke-virtual {v3, v2}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->getScanInfoForProductFamilyId(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    move-result-object v3

    if-nez v3, :cond_0

    .line 264
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private goDefaultScreen()V
    .locals 7

    .line 619
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const v1, 0x7f11024a

    .line 621
    invoke-virtual {p0, v1}, Lcom/shopkick/app/products/OfferDetailsScreen;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v1, 0x7f11014f

    .line 622
    invoke-virtual {p0, v1}, Lcom/shopkick/app/products/OfferDetailsScreen;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/shopkick/app/products/-$$Lambda$OfferDetailsScreen$fonmAkDSCuAiPpbXszoinR6hH94;

    invoke-direct {v5, p0}, Lcom/shopkick/app/products/-$$Lambda$OfferDetailsScreen$fonmAkDSCuAiPpbXszoinR6hH94;-><init>(Lcom/shopkick/app/products/OfferDetailsScreen;)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x0

    .line 619
    invoke-virtual/range {v0 .. v6}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogAcknowledge(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    return-void
.end method

.method private initStandardScreenVars()V
    .locals 2

    .line 165
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    iput-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    .line 166
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 167
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->bundleIds:Ljava/util/List;

    .line 168
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 169
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    iput-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    .line 170
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->nearbyLocationsDataSource:Lcom/shopkick/app/location/NearbyLocationsDataSource;

    iput-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->nearbyLocationsDataSource:Lcom/shopkick/app/location/NearbyLocationsDataSource;

    .line 171
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    iput-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    .line 172
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iput-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    .line 173
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->scanIRDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;

    iput-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->scanIRDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;

    const/4 v0, 0x0

    .line 174
    iput-boolean v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->shouldRefreshScreen:Z

    .line 175
    iput-boolean v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->isOfferBundle:Z

    .line 176
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->productFamilyTileInfos:Ljava/util/List;

    .line 177
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->params:Ljava/util/Map;

    const-string v1, "product_family_id"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->productFamilyId:Ljava/lang/String;

    .line 178
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->params:Ljava/util/Map;

    const-string v1, "chain_id"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->chainId:Ljava/lang/String;

    .line 179
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    iput-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    return-void
.end method

.method public static synthetic lambda$goDefaultScreen$187(Lcom/shopkick/app/products/OfferDetailsScreen;Ljava/lang/ref/WeakReference;)V
    .locals 4

    .line 624
    invoke-static {p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hideIfNotNull(Ljava/lang/ref/WeakReference;)V

    .line 625
    invoke-virtual {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    invoke-static {p1}, Lcom/shopkick/app/util/NullUtils;->isNull(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 626
    invoke-virtual {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    new-instance v0, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v1, Lcom/shopkick/app/activities/HomeActivity;

    const-class v2, Lcom/shopkick/app/store/EarnScreen;

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    invoke-virtual {p1, v0}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    :cond_0
    return-void
.end method

.method private populateClientTileInfoV2FromOfferBundleInfo(Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;
    .locals 5

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 274
    :cond_0
    new-instance v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;-><init>()V

    .line 275
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->title:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->title:Ljava/lang/String;

    const/16 v1, 0x17

    .line 276
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->type:Ljava/lang/Integer;

    const/4 v1, 0x1

    .line 277
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    .line 278
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->subtitle:Ljava/lang/String;

    iput-object v2, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->subtitle:Ljava/lang/String;

    .line 279
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->additionalDetails:Ljava/lang/String;

    iput-object v2, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->footerText:Ljava/lang/String;

    .line 280
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->mainImageUrl:Ljava/lang/String;

    iput-object v2, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->mainImageUrl:Ljava/lang/String;

    .line 281
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->largeImageUrl:Ljava/lang/String;

    iput-object v2, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->largeImageUrl:Ljava/lang/String;

    .line 282
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->bonusReceiptKicks:Ljava/lang/Integer;

    const/4 v3, 0x0

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_0

    :cond_1
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->bonusReceiptKicks:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    :goto_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->bonusReceiptKicks:Ljava/lang/Integer;

    .line 284
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->sumProductReceiptKicks:Ljava/lang/Integer;

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->sumProductReceiptKicks:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    :goto_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    .line 285
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->chainIds:Ljava/util/List;

    iput-object v2, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->chainIds:Ljava/util/List;

    .line 286
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->offerBundleId:Ljava/lang/String;

    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->offerBundleIds:Ljava/util/List;

    .line 287
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->taxonomyNodeId:Ljava/lang/String;

    iput-object v2, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->taxonomyNodeId:Ljava/lang/String;

    .line 288
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 289
    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->productScanInfos:Ljava/util/List;

    if-eqz v3, :cond_3

    .line 290
    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->productScanInfos:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    .line 291
    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 294
    :cond_3
    iput-object v2, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->productFamilyIds:Ljava/util/List;

    .line 295
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->currentlyClaimable:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    xor-int/2addr p1, v1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    const/4 p1, -0x1

    .line 297
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->dataPos:Ljava/lang/Integer;

    return-object v0
.end method

.method private populateProductFamilyTileInfos()V
    .locals 4

    .line 254
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyIds:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 255
    iget-object v2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->productFamilyTileInfos:Ljava/util/List;

    iget-object v3, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    .line 256
    invoke-virtual {v3, v1}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->getScanInfoForProductFamilyId(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    move-result-object v1

    .line 255
    invoke-static {v1}, Lcom/shopkick/app/util/TileUtils;->convertProductScanInfoToTileInfo(Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method private processBundleOfferDetailsScreen(Lcom/shopkick/app/fetchers/api/skapi/GetOfferBundleInfosResponse;)V
    .locals 2

    .line 555
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfferBundleInfosResponse;->offerBundleInfos:Ljava/util/List;

    if-eqz v0, :cond_3

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfferBundleInfosResponse;->offerBundleInfos:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 558
    :cond_0
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfferBundleInfosResponse;->offerBundleInfos:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;

    .line 559
    invoke-direct {p0, p1}, Lcom/shopkick/app/products/OfferDetailsScreen;->populateClientTileInfoV2FromOfferBundleInfo(Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 560
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-nez v0, :cond_1

    return-void

    .line 563
    :cond_1
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;->productScanInfos:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    .line 564
    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->productFamilyTileInfos:Ljava/util/List;

    invoke-static {v0}, Lcom/shopkick/app/util/TileUtils;->convertProductScanInfoToTileInfo(Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 566
    :cond_2
    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->setupTaxonomyName()V

    .line 567
    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->setupLocations()V

    .line 568
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->adapter:Lcom/shopkick/app/products/OfferDetailsAdapter;

    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->locations:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/products/OfferDetailsAdapter;->populateFeedTiles(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/util/List;)V

    .line 569
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->adapter:Lcom/shopkick/app/products/OfferDetailsAdapter;

    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->productFamilyTileInfos:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/products/OfferDetailsAdapter;->setupBundleProductsWidget(Ljava/util/List;)V

    return-void

    :cond_3
    :goto_1
    return-void
.end method

.method private processProductOfferDetailsScreen(Lcom/shopkick/app/fetchers/api/skapi/GetOfferBundleInfosResponse;)V
    .locals 2

    .line 573
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfferBundleInfosResponse;->offerBundleInfos:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfferBundleInfosResponse;->offerBundleInfos:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 574
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 575
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfferBundleInfosResponse;->offerBundleInfos:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;

    .line 576
    invoke-direct {p0, v1}, Lcom/shopkick/app/products/OfferDetailsScreen;->populateClientTileInfoV2FromOfferBundleInfo(Lcom/shopkick/app/fetchers/api/skapi/OfferBundleInfo;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 578
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object p1

    const-string v1, "BUNDLE_INFO_TILES"

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 579
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->adapter:Lcom/shopkick/app/products/OfferDetailsAdapter;

    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->locations:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/products/OfferDetailsAdapter;->populateFeedTiles(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method private processProductScanInfoForProductOfferDetailsScreen()V
    .locals 3

    .line 584
    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->getProductTileInfoAndSetupCategoryNameLocation()V

    .line 585
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->bundleIds:Ljava/util/List;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    :goto_0
    iput-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->bundleIds:Ljava/util/List;

    .line 586
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->adapter:Lcom/shopkick/app/products/OfferDetailsAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/products/OfferDetailsAdapter;->fetchNextPage()V

    .line 587
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->adapter:Lcom/shopkick/app/products/OfferDetailsAdapter;

    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->locations:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/products/OfferDetailsAdapter;->populateFeedTiles(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/util/List;)V

    .line 588
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/products/OfferDetailsScreen;->setAppScreenTitle(Ljava/lang/String;)V

    return-void
.end method

.method private setupLocations()V
    .locals 3

    .line 372
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 374
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/cpg/LocationDataSource;->getLocationsList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->locations:Ljava/util/List;

    .line 375
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->locations:Ljava/util/List;

    if-nez v0, :cond_0

    .line 376
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "EventLocationsUpdated"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    goto :goto_0

    .line 378
    :cond_0
    invoke-direct {p0, v0}, Lcom/shopkick/app/products/OfferDetailsScreen;->sortByDistance(Ljava/util/List;)V

    goto :goto_0

    .line 382
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->locations:Ljava/util/List;

    .line 386
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    instance-of v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    if-eqz v1, :cond_3

    check-cast v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->chainIds:Ljava/util/List;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    check-cast v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->chainIds:Ljava/util/List;

    .line 387
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x0

    .line 389
    iput-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->locations:Ljava/util/List;

    .line 392
    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->nearbyLocationsDataSource:Lcom/shopkick/app/location/NearbyLocationsDataSource;

    invoke-virtual {v1}, Lcom/shopkick/app/location/NearbyLocationsDataSource;->isDataLatest()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 393
    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->updateLocationUsingChainIds()V

    goto :goto_0

    .line 395
    :cond_2
    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->nearbyLocationsDataSource:Lcom/shopkick/app/location/NearbyLocationsDataSource;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/location/NearbyLocationsDataSource;->fetchLocationsIfNeeded(Ljava/util/ArrayList;)V

    .line 396
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "NearbyLocationsUpdated"

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 397
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "NearbyLocationsFailed"

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    :cond_3
    :goto_0
    return-void
.end method

.method private setupObservers()V
    .locals 2

    .line 235
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "ScanBCSucceeded"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 236
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "Event2DIRScanSuccess"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 237
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "offlineScanBarcodeReady"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 238
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "offlineScanFailed"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 239
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "offlineScanBarcodeEnqueued"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 240
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "EventReceiptScanUploaded"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 241
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventOnlineOfferClickSucceeded"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 242
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "ShowVideoBonusKicksDialogFragment"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 243
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventScanIrResponseSuccess"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 244
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "DoneScanningBarcodes"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 245
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "EventUpdateUI2DIRAndVideoFeature"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 247
    iget-boolean v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->isOnlineOffer:Z

    if-eqz v0, :cond_0

    .line 248
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "EventModuleRequestSuccess"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 249
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "EventModuleRequestFailed"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private setupScreenFromTileInfo(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x0

    .line 184
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isDigit(C)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 185
    invoke-static {p1}, Lcom/shopkick/app/util/TileUtils;->deserialize(Ljava/lang/String;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object p1

    .line 186
    iput-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 188
    invoke-static {p1, v1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 189
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {p1}, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->extend(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object p1

    .line 193
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    iput-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->productFamilyId:Ljava/lang/String;

    .line 195
    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    invoke-static {v1}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->isOfferBundle:Z

    .line 196
    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->bundleIds:Ljava/util/List;

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    :goto_1
    iput-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->bundleIds:Ljava/util/List;

    .line 198
    invoke-static {p1}, Lcom/shopkick/app/util/Affiliate;->isOnlineOffer(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->isOnlineOffer:Z

    .line 199
    iget-boolean p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->isOnlineOffer:Z

    iput-boolean p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->shouldRefreshScreen:Z

    .line 202
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanKicks:Ljava/lang/Integer;

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result p1

    if-nez p1, :cond_2

    move p1, v0

    goto :goto_2

    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanKicks:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 204
    :goto_2
    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanCompleted:Ljava/lang/Boolean;

    invoke-static {v1}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    if-lez p1, :cond_4

    .line 205
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanTokenId:Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->irCollTokenID:Ljava/lang/String;

    .line 206
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->irCollTokenID:Ljava/lang/String;

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 207
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->scanIRDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;

    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->irCollTokenID:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->loadCollection(Ljava/lang/String;)V

    goto :goto_3

    :cond_3
    const-string p1, ""

    .line 209
    iput-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->irCollTokenID:Ljava/lang/String;

    goto :goto_3

    :cond_4
    const-string p1, ""

    .line 212
    iput-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->irCollTokenID:Ljava/lang/String;

    .line 216
    :goto_3
    iput-boolean v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->showVideoDialogOnResume:Z

    .line 217
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoKicks:Ljava/lang/Integer;

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result p1

    if-nez p1, :cond_5

    move p1, v0

    goto :goto_4

    :cond_5
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoKicks:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 219
    :goto_4
    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoCompleted:Ljava/lang/Boolean;

    invoke-static {v1}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    if-lez p1, :cond_6

    .line 220
    iput p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->videoKicks:I

    goto :goto_5

    .line 222
    :cond_6
    iput v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->videoKicks:I

    .line 226
    :goto_5
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->bonusReceiptKicks:Ljava/lang/Integer;

    .line 227
    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    .line 228
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->bonusReceiptKicks:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-le p1, v0, :cond_7

    .line 229
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->bonusReceiptKicks:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    :cond_7
    return-void
.end method

.method private setupTaxonomyName()V
    .locals 3

    .line 358
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->taxonomyNodeId:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 359
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->taxonomyNodeId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->getTaxonomyNode(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;

    move-result-object v0

    if-nez v0, :cond_0

    .line 361
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventTaxonomyLoaded"

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    goto :goto_0

    .line 363
    :cond_0
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;->name:Ljava/lang/String;

    invoke-static {v1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 364
    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v1

    const-string v2, "OFFER_HEADER_TILE_CATEGORY_NAME"

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;->name:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    return-void
.end method

.method private setupWidgetData()V
    .locals 5

    .line 495
    iget-boolean v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->isOnlineOffer:Z

    if-eqz v0, :cond_2

    .line 496
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/16 v3, 0xfa5

    if-eqz v0, :cond_0

    .line 497
    iget-object v4, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    aput-object v0, v2, v1

    invoke-virtual {v4, v3, v2}, Lcom/shopkick/app/widget/WidgetDataSource;->getData(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 500
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->adapter:Lcom/shopkick/app/products/OfferDetailsAdapter;

    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/products/OfferDetailsAdapter;->processOnlineOfferDetailsScreen(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    goto :goto_0

    .line 503
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->chainId:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 505
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->chainId:Ljava/lang/String;

    aput-object v4, v2, v1

    invoke-virtual {v0, v3, v2}, Lcom/shopkick/app/widget/WidgetDataSource;->getData(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 508
    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->getDeeplinkOnlineOfferTile()V

    goto :goto_0

    .line 512
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->goDefaultScreen()V

    :cond_2
    :goto_0
    return-void
.end method

.method private showVideoForBonusKicksDialog()V
    .locals 6

    .line 644
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->videoBonusKicksDialogFragment:Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->isVisible()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableImageRecognitionScans:Ljava/lang/Boolean;

    .line 645
    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz v0, :cond_4

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoCompleted:Ljava/lang/Boolean;

    .line 646
    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoKicks:Ljava/lang/Integer;

    .line 647
    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 650
    :cond_1
    new-instance v0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;

    invoke-direct {v0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->videoBonusKicksDialogFragment:Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;

    .line 652
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/16 v1, -0x3a

    .line 653
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 654
    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    const/4 v1, 0x1

    .line 655
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoUrlType:Ljava/lang/Integer;

    .line 656
    iget-object v2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    .line 657
    iget-object v2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoUrl:Ljava/lang/String;

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoUrl:Ljava/lang/String;

    .line 658
    iget-object v2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoKicks:Ljava/lang/Integer;

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoKicks:Ljava/lang/Integer;

    .line 659
    iget-object v2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoThumbnailImageUrl:Ljava/lang/String;

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoThumbnailImageUrl:Ljava/lang/String;

    .line 660
    iget-object v2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoDescriptionText:Ljava/lang/String;

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoDescriptionText:Ljava/lang/String;

    .line 662
    iget-object v2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v3, "EventVideoBonusKicksCompleted"

    const/4 v4, 0x0

    invoke-virtual {v2, p0, v3, v4}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 663
    iget-object v2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v3, "EventVideoBonusKicksError"

    invoke-virtual {v2, p0, v3, v4}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 666
    invoke-virtual {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 668
    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->videoBonusKicksDialogFragment:Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;

    iget-object v3, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v4, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object v5, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v3, v4, v5, v0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->setArgs(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 669
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->videoBonusKicksDialogFragment:Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;

    invoke-virtual {v2, v0}, Lcom/shopkick/app/activities/BaseActivity;->showDialog(Landroid/support/v4/app/DialogFragment;)V

    goto :goto_0

    .line 671
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->mainView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_3

    const v2, 0x7f110580

    .line 673
    invoke-static {v0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_3
    :goto_0
    return-void

    :cond_4
    :goto_1
    return-void
.end method

.method private sortByDistance(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;",
            ">;)V"
        }
    .end annotation

    .line 430
    new-instance v0, Lcom/shopkick/app/location/LocationDistanceComparator;

    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    invoke-direct {v0, v1}, Lcom/shopkick/app/location/LocationDistanceComparator;-><init>(Lcom/shopkick/app/location/LocationNotifier;)V

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-void
.end method

.method private updateLocationUsingChainIds()V
    .locals 4

    .line 411
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    if-nez v0, :cond_0

    .line 412
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    .line 414
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 415
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->locations:Ljava/util/List;

    .line 417
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    check-cast v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->chainIds:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 418
    iget-object v2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->nearbyLocationsDataSource:Lcom/shopkick/app/location/NearbyLocationsDataSource;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Lcom/shopkick/app/location/NearbyLocationsDataSource;->getBasicLocationInfo(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 420
    iget-object v2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->locations:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 423
    iget-object v2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    iget-object v3, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->locations:Ljava/util/List;

    invoke-virtual {v2, v3}, Lcom/shopkick/app/cpg/LocationDataSource;->addLocationsList(Ljava/util/List;)V

    .line 424
    iget-object v2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->locationId:Ljava/lang/String;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    .line 436
    iget-object p3, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-nez p3, :cond_0

    iget-object p3, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->productFamilyId:Ljava/lang/String;

    invoke-static {p3}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_0

    iget-object p3, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->bundleIds:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p3

    if-eqz p3, :cond_0

    .line 437
    new-instance p3, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v0, Lcom/shopkick/app/activities/HomeActivity;

    const-class v1, Lcom/shopkick/app/store/EarnScreen;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-direct {p3, v0, v1, v2}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 439
    invoke-virtual {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    :cond_0
    const p3, 0x7f0c013b

    const/4 v0, 0x0

    .line 442
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->mainView:Landroid/view/View;

    .line 443
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->mainView:Landroid/view/View;

    const p2, 0x7f09054a

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->progressBar:Landroid/widget/ProgressBar;

    .line 444
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->mainView:Landroid/view/View;

    const p2, 0x7f0904c5

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iput-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 445
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance p2, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;

    invoke-virtual {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p2, p3}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 446
    invoke-virtual {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    const/4 p2, 0x1

    if-eqz p1, :cond_1

    const p3, 0x7f090771

    .line 448
    invoke-virtual {p1, p3}, Lcom/shopkick/app/activities/BaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/widget/SKTextView;

    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/SKTextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 449
    invoke-virtual {p1, p3}, Lcom/shopkick/app/activities/BaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKTextView;->setMaxLines(I)V

    .line 452
    :cond_1
    new-instance v7, Ljava/util/HashSet;

    const/16 p1, 0x11

    new-array p1, p1, [Ljava/lang/Integer;

    const/4 p3, -0x1

    .line 453
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, p1, v0

    const/16 p3, 0x41

    .line 454
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const/16 p3, 0x10

    .line 455
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, p1, p2

    const/4 p2, 0x3

    const/16 v1, 0x40b

    .line 456
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, p1, p2

    const/4 p2, 0x4

    const/16 v2, 0x40c

    .line 457
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, p1, p2

    const/4 p2, 0x5

    const/16 v2, 0x40d

    .line 458
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, p1, p2

    const/4 p2, 0x6

    const/16 v2, 0x413

    .line 459
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, p1, p2

    const/4 p2, 0x7

    const/16 v2, 0x40e

    .line 460
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, p1, p2

    const/16 p2, 0x40f

    .line 461
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/16 v9, 0x8

    aput-object p2, p1, v9

    const/16 p2, 0x9

    const/16 v2, 0x411

    .line 462
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, p1, p2

    const/16 p2, 0xa

    const/16 v2, 0x410

    .line 463
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, p1, p2

    const/16 p2, 0xb

    const/16 v2, 0x416

    .line 464
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, p1, p2

    const/16 p2, 0xc

    const/16 v2, 0x415

    .line 465
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, p1, p2

    const/16 p2, 0xd

    const/16 v2, 0xfa9

    .line 466
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, p1, p2

    const/16 p2, 0xe

    const/16 v2, -0x36

    .line 467
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, p1, p2

    const/16 p2, 0xf

    const/16 v2, 0x3f6

    .line 468
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, p1, p2

    const/16 p2, 0x40a

    .line 469
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, p3

    .line 452
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v7, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 470
    iget-boolean p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->isOnlineOffer:Z

    if-eqz p1, :cond_2

    const/16 p1, 0x3f

    .line 471
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v7, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const/16 p1, -0x34

    .line 472
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v7, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const/16 p1, -0x39

    .line 473
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v7, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 474
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v7, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 476
    :cond_2
    new-instance p1, Lcom/shopkick/app/products/OfferDetailsAdapter;

    iget-object v2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    invoke-virtual {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v6, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const/4 v8, 0x0

    move-object v1, p1

    move-object v4, p0

    move-object v5, p0

    invoke-direct/range {v1 .. v8}, Lcom/shopkick/app/products/OfferDetailsAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Landroid/content/Context;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V

    iput-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->adapter:Lcom/shopkick/app/products/OfferDetailsAdapter;

    .line 478
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object p2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->adapter:Lcom/shopkick/app/products/OfferDetailsAdapter;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 479
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->adapter:Lcom/shopkick/app/products/OfferDetailsAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/products/OfferDetailsAdapter;->fetchNextPage()V

    .line 480
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz p1, :cond_3

    .line 481
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/OfferDetailsScreen;->setAppScreenTitle(Ljava/lang/String;)V

    .line 482
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->adapter:Lcom/shopkick/app/products/OfferDetailsAdapter;

    iget-object p2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p3, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->locations:Ljava/util/List;

    invoke-virtual {p1, p2, p3}, Lcom/shopkick/app/products/OfferDetailsAdapter;->populateFeedTiles(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/util/List;)V

    .line 483
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->adapter:Lcom/shopkick/app/products/OfferDetailsAdapter;

    iget-object p2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->productFamilyTileInfos:Ljava/util/List;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/products/OfferDetailsAdapter;->setupBundleProductsWidget(Ljava/util/List;)V

    .line 484
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setVisibility(I)V

    .line 485
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v9}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_0

    .line 487
    :cond_3
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 488
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {p1, v9}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setVisibility(I)V

    .line 491
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->mainView:Landroid/view/View;

    return-object p1
.end method

.method public getPageRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 2

    .line 519
    iget-boolean p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->isOnlineOffer:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    return-object v0

    .line 522
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->bundleIds:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->isOfferBundle:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz p1, :cond_1

    goto :goto_0

    .line 525
    :cond_1
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfferBundleInfosRequest;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/GetOfferBundleInfosRequest;-><init>()V

    .line 526
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->bundleIds:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfferBundleInfosRequest;->offerBundleIds:Ljava/util/List;

    return-object p1

    :cond_2
    :goto_0
    return-object v0
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

    .line 113
    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->initStandardScreenVars()V

    const-string/jumbo p1, "tile_info"

    .line 114
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 116
    invoke-static {p1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 119
    :try_start_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/products/OfferDetailsScreen;->setupScreenFromTileInfo(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "OfferDetailsScreen"

    const-string p2, "could not parse input json for tile info"

    .line 121
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 124
    :goto_0
    iget-boolean p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->isOnlineOffer:Z

    if-nez p1, :cond_0

    .line 125
    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->setupLocations()V

    .line 128
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->setupTaxonomyName()V

    goto :goto_3

    .line 130
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->productFamilyId:Ljava/lang/String;

    invoke-static {p1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p1

    const/4 v0, 0x1

    if-nez p1, :cond_5

    .line 131
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->chainId:Ljava/lang/String;

    invoke-static {p1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    const/4 p1, 0x0

    .line 132
    iput-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 133
    iput-boolean v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->shouldRefreshScreen:Z

    .line 134
    iput-boolean v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->isOnlineOffer:Z

    goto :goto_2

    .line 136
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object p2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->getScanInfoForProductFamilyId(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 137
    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->getProductTileInfoAndSetupCategoryNameLocation()V

    .line 138
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->bundleIds:Ljava/util/List;

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    :goto_1
    iput-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->bundleIds:Ljava/util/List;

    goto :goto_2

    .line 140
    :cond_4
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    new-instance p2, Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->productFamilyId:Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p1, p2}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->fetchScanInfos(Ljava/util/List;)V

    .line 141
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "scansBarcodeUpdatedEvent"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    :goto_2
    const/4 p1, 0x0

    .line 144
    iput-boolean p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->isOfferBundle:Z

    goto :goto_3

    :cond_5
    const-string p1, "bundle_id"

    .line 145
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_6

    .line 146
    iput-boolean v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->isOfferBundle:Z

    .line 147
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->bundleIds:Ljava/util/List;

    const-string v0, "bundle_id"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 151
    :cond_6
    :goto_3
    iget-boolean p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->isOfferBundle:Z

    if-eqz p1, :cond_8

    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz p1, :cond_8

    .line 152
    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->getUnfetchedProductIds()Ljava/util/ArrayList;

    move-result-object p1

    .line 153
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_7

    .line 154
    iget-object p2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "scansBarcodeUpdatedEvent"

    invoke-virtual {p2, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 155
    iget-object p2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->fetchScanInfos(Ljava/util/List;)V

    goto :goto_4

    .line 157
    :cond_7
    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->populateProductFamilyTileInfos()V

    .line 161
    :cond_8
    :goto_4
    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->setupObservers()V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 344
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    if-eqz v0, :cond_0

    .line 345
    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 348
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->adapter:Lcom/shopkick/app/products/OfferDetailsAdapter;

    if-eqz v0, :cond_1

    .line 349
    invoke-virtual {v0}, Lcom/shopkick/app/products/OfferDetailsAdapter;->destroy()V

    .line 352
    :cond_1
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onDestroyView()V
    .locals 2

    .line 335
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->scanIRDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->productFamilyId:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->getTokenID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 336
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->scanIRDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->deleteCollection()V

    .line 338
    :cond_0
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroyView()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 682
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x8

    const/4 v3, 0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "eventOnlineOfferClickSucceeded"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0xe

    goto/16 :goto_1

    :sswitch_1
    const-string v0, "offlineScanBarcodeEnqueued"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0xb

    goto/16 :goto_1

    :sswitch_2
    const-string v0, "scansBarcodeUpdatedEvent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x6

    goto/16 :goto_1

    :sswitch_3
    const-string v0, "Event2DIRScanSuccess"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0xf

    goto/16 :goto_1

    :sswitch_4
    const-string v0, "ScanBCSucceeded"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x5

    goto/16 :goto_1

    :sswitch_5
    const-string v0, "EventLocationsUpdated"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v3

    goto/16 :goto_1

    :sswitch_6
    const-string v0, "offlineScanBarcodeReady"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x9

    goto/16 :goto_1

    :sswitch_7
    const-string v0, "EventVideoBonusKicksCompleted"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x11

    goto/16 :goto_1

    :sswitch_8
    const-string v0, "offlineScanFailed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0xa

    goto/16 :goto_1

    :sswitch_9
    const-string v0, "eventScanIrResponseSuccess"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x7

    goto/16 :goto_1

    :sswitch_a
    const-string v0, "eventTaxonomyLoaded"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v1

    goto/16 :goto_1

    :sswitch_b
    const-string v0, "ShowVideoBonusKicksDialogFragment"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x10

    goto :goto_1

    :sswitch_c
    const-string v0, "EventUpdateUI2DIRAndVideoFeature"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x13

    goto :goto_1

    :sswitch_d
    const-string v0, "NearbyLocationsFailed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    goto :goto_1

    :sswitch_e
    const-string v0, "EventModuleRequestFailed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0xd

    goto :goto_1

    :sswitch_f
    const-string v0, "EventReceiptScanUploaded"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v2

    goto :goto_1

    :sswitch_10
    const-string v0, "EventVideoBonusKicksError"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x12

    goto :goto_1

    :sswitch_11
    const-string v0, "EventModuleRequestSuccess"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0xc

    goto :goto_1

    :sswitch_12
    const-string v0, "DoneScanningBarcodes"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_1

    :sswitch_13
    const-string v0, "NearbyLocationsUpdated"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_1

    :cond_0
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_4

    .line 858
    :pswitch_0
    iput-boolean v3, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->shouldRefreshScreen:Z

    goto/16 :goto_4

    .line 844
    :pswitch_1
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoCompleted:Ljava/lang/Boolean;

    .line 845
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->adapter:Lcom/shopkick/app/products/OfferDetailsAdapter;

    iget-object p2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->locations:Ljava/util/List;

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/products/OfferDetailsAdapter;->populateFeedTiles(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/util/List;)V

    .line 847
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "ShowVideoBonusKicksDialogFragment"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 848
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "EventVideoBonusKicksCompleted"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    goto/16 :goto_4

    .line 839
    :pswitch_2
    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->showVideoForBonusKicksDialog()V

    goto/16 :goto_4

    .line 830
    :pswitch_3
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->scanIRDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;

    invoke-virtual {p1}, Lcom/shopkick/app/products/scanning/datasources/ScanIRDataSource;->deleteCollection()V

    .line 831
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanCompleted:Ljava/lang/Boolean;

    .line 832
    iput-boolean v3, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->shouldRefreshScreen:Z

    goto/16 :goto_4

    .line 822
    :pswitch_4
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineOfferClickKickCompleted:Ljava/lang/Boolean;

    .line 823
    iput-boolean v3, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->shouldRefreshScreen:Z

    goto/16 :goto_4

    .line 809
    :pswitch_5
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz p1, :cond_1

    .line 810
    iget-object p2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->adapter:Lcom/shopkick/app/products/OfferDetailsAdapter;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/products/OfferDetailsAdapter;->processOnlineOfferDetailsScreen(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    goto :goto_2

    .line 812
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->getDeeplinkOnlineOfferTile()V

    .line 814
    :goto_2
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "EventModuleRequestSuccess"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 815
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "EventModuleRequestFailed"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    goto/16 :goto_4

    .line 800
    :pswitch_6
    iput-boolean v3, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->shouldRefreshScreen:Z

    goto/16 :goto_4

    .line 790
    :pswitch_7
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    .line 791
    iput-boolean v3, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->shouldRefreshScreen:Z

    goto/16 :goto_4

    :pswitch_8
    const-string p1, "scanIRResponseKey"

    .line 769
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanResponse;

    .line 770
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ImageRecognitionProductScanResponse;->updatedOfferTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iput-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 773
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz p1, :cond_2

    .line 775
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanCompleted:Ljava/lang/Boolean;

    .line 776
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoCompleted:Ljava/lang/Boolean;

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoKicks:Ljava/lang/Integer;

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 777
    iput-boolean v3, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->showVideoDialogOnResume:Z

    .line 781
    :cond_2
    iput-boolean v3, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->shouldRefreshScreen:Z

    .line 783
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "eventScanIrResponseSuccess"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    goto/16 :goto_4

    .line 751
    :pswitch_9
    iget-boolean p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->isOfferBundle:Z

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object p2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->getScanInfoForProductFamilyId(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    move-result-object p1

    if-nez p1, :cond_3

    goto/16 :goto_4

    .line 754
    :cond_3
    iget-boolean p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->isOfferBundle:Z

    if-eqz p1, :cond_4

    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->getUnfetchedProductIds()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 755
    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->populateProductFamilyTileInfos()V

    .line 756
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->adapter:Lcom/shopkick/app/products/OfferDetailsAdapter;

    iget-object p2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->locations:Ljava/util/List;

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/products/OfferDetailsAdapter;->populateFeedTiles(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/util/List;)V

    .line 757
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->adapter:Lcom/shopkick/app/products/OfferDetailsAdapter;

    iget-object p2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->productFamilyTileInfos:Ljava/util/List;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/products/OfferDetailsAdapter;->setupBundleProductsWidget(Ljava/util/List;)V

    .line 758
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "scansBarcodeUpdatedEvent"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 759
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 760
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setVisibility(I)V

    goto/16 :goto_4

    .line 761
    :cond_4
    iget-boolean p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->isOfferBundle:Z

    if-nez p1, :cond_7

    .line 762
    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->processProductScanInfoForProductOfferDetailsScreen()V

    .line 763
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "scansBarcodeUpdatedEvent"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 764
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 765
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setVisibility(I)V

    goto/16 :goto_4

    :pswitch_a
    const-string p1, "scanTileInfo"

    .line 743
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 744
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    if-eqz p2, :cond_7

    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7

    .line 745
    iput-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 746
    iput-boolean v3, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->shouldRefreshScreen:Z

    goto/16 :goto_4

    .line 733
    :pswitch_b
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoCompleted:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoKicks:Ljava/lang/Integer;

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 734
    invoke-virtual {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->isVisible()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 735
    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->showVideoForBonusKicksDialog()V

    goto :goto_3

    .line 737
    :cond_5
    iput-boolean v3, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->showVideoDialogOnResume:Z

    .line 740
    :cond_6
    :goto_3
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "DoneScanningBarcodes"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    goto/16 :goto_4

    .line 712
    :pswitch_c
    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->updateLocationUsingChainIds()V

    .line 713
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->adapter:Lcom/shopkick/app/products/OfferDetailsAdapter;

    iget-object p2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->locations:Ljava/util/List;

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/products/OfferDetailsAdapter;->populateFeedTiles(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/util/List;)V

    .line 714
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "NearbyLocationsUpdated"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 715
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "NearbyLocationsFailed"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    goto :goto_4

    .line 702
    :pswitch_d
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    iget-object p2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/cpg/LocationDataSource;->getLocationsList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 704
    iput-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->locations:Ljava/util/List;

    .line 705
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->locations:Ljava/util/List;

    invoke-direct {p0, p1}, Lcom/shopkick/app/products/OfferDetailsScreen;->sortByDistance(Ljava/util/List;)V

    .line 706
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->adapter:Lcom/shopkick/app/products/OfferDetailsAdapter;

    iget-object p2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->locations:Ljava/util/List;

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/products/OfferDetailsAdapter;->populateFeedTiles(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/util/List;)V

    .line 707
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "EventLocationsUpdated"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    goto :goto_4

    :pswitch_e
    const-string p1, "paramTaxonomyNode"

    .line 688
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;

    if-eqz p1, :cond_7

    .line 689
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;->taxonomyNodeId:Ljava/lang/String;

    if-eqz p2, :cond_7

    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;->taxonomyNodeId:Ljava/lang/String;

    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->taxonomyNodeId:Ljava/lang/String;

    .line 690
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7

    .line 691
    iget-object p2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {p2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object p2

    const-string v0, "OFFER_HEADER_TILE_CATEGORY_NAME"

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;->name:Ljava/lang/String;

    invoke-virtual {p2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 693
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->adapter:Lcom/shopkick/app/products/OfferDetailsAdapter;

    iget-object p2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->locations:Ljava/util/List;

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/products/OfferDetailsAdapter;->populateFeedTiles(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/util/List;)V

    .line 694
    iget-object p1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "paramTaxonomyNode"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    :cond_7
    :goto_4
    :pswitch_f
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7bc607c4 -> :sswitch_13
        -0x7440847a -> :sswitch_12
        -0x6b4bce66 -> :sswitch_11
        -0x6952cbc7 -> :sswitch_10
        -0x57c9a285 -> :sswitch_f
        -0x4c486c3a -> :sswitch_e
        -0x372df764 -> :sswitch_d
        -0x2ddd5220 -> :sswitch_c
        -0x2d11051c -> :sswitch_b
        -0x1da98810 -> :sswitch_a
        -0x1b10bf5e -> :sswitch_9
        -0x106e20a3 -> :sswitch_8
        -0xf052804 -> :sswitch_7
        0x550c423 -> :sswitch_6
        0x26814e17 -> :sswitch_5
        0x2ae28463 -> :sswitch_4
        0x30fdff11 -> :sswitch_3
        0x34e115c9 -> :sswitch_2
        0x43b738dc -> :sswitch_1
        0x556e6c68 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_f
        :pswitch_0
    .end packed-switch
.end method

.method public onScreenDidShow()V
    .locals 4

    .line 303
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidShow()V

    .line 306
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->videoBonusKicksDialogFragment:Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 307
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->videoBonusKicksDialogFragment:Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->disableClicksForDismiss()V

    .line 308
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->videoBonusKicksDialogFragment:Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->hideOnScreen()V

    const/4 v0, 0x1

    .line 309
    iput-boolean v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->shouldRefreshScreen:Z

    .line 312
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->shouldRefreshScreen:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 313
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz v0, :cond_1

    .line 314
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/products/OfferDetailsScreen;->setAppScreenTitle(Ljava/lang/String;)V

    .line 315
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->adapter:Lcom/shopkick/app/products/OfferDetailsAdapter;

    iget-object v2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v3, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->locations:Ljava/util/List;

    invoke-virtual {v0, v2, v3}, Lcom/shopkick/app/products/OfferDetailsAdapter;->populateFeedTiles(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/util/List;)V

    .line 317
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->setupWidgetData()V

    .line 318
    iput-boolean v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->shouldRefreshScreen:Z

    goto :goto_0

    .line 321
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->adapter:Lcom/shopkick/app/products/OfferDetailsAdapter;

    const/16 v2, 0x415

    invoke-virtual {v0, v2}, Lcom/shopkick/app/products/OfferDetailsAdapter;->invalidateTilesOfType(I)V

    .line 324
    :goto_0
    iget-boolean v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->showVideoDialogOnResume:Z

    if-eqz v0, :cond_3

    .line 325
    iput-boolean v1, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->showVideoDialogOnResume:Z

    .line 326
    invoke-direct {p0}, Lcom/shopkick/app/products/OfferDetailsScreen;->showVideoForBonusKicksDialog()V

    :cond_3
    return-void
.end method

.method public processResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;
    .locals 2

    .line 538
    new-instance p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    invoke-direct {p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;-><init>()V

    .line 539
    sget-object v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 540
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setVisibility(I)V

    .line 541
    iget-object v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->progressBar:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 542
    iget-boolean v0, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_1

    iget-object v0, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v0, :cond_1

    .line 543
    iget-boolean v0, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->isOfferBundle:Z

    if-eqz v0, :cond_0

    .line 544
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetOfferBundleInfosResponse;

    invoke-direct {p0, p2}, Lcom/shopkick/app/products/OfferDetailsScreen;->processBundleOfferDetailsScreen(Lcom/shopkick/app/fetchers/api/skapi/GetOfferBundleInfosResponse;)V

    goto :goto_0

    .line 546
    :cond_0
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetOfferBundleInfosResponse;

    invoke-direct {p0, p2}, Lcom/shopkick/app/products/OfferDetailsScreen;->processProductOfferDetailsScreen(Lcom/shopkick/app/fetchers/api/skapi/GetOfferBundleInfosResponse;)V

    goto :goto_0

    .line 549
    :cond_1
    iget-object p2, p0, Lcom/shopkick/app/products/OfferDetailsScreen;->adapter:Lcom/shopkick/app/products/OfferDetailsAdapter;

    invoke-virtual {p2}, Lcom/shopkick/app/products/OfferDetailsAdapter;->addOfflineEducationTile()V

    :goto_0
    return-object p1
.end method
