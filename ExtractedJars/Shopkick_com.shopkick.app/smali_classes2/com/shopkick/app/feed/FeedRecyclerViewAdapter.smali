.class public Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "FeedRecyclerViewAdapter.java"

# interfaces
.implements Lcom/shopkick/app/controllers/IRecyclerViewImageControllerCallback;
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Lcom/shopkick/app/tileViewHolderConfigurators/ReloadTileViewHolderConfigurator$IReloadButtonClickCallback;
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;,
        Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;,
        Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterItemDecorationRule;,
        Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;",
        ">;",
        "Lcom/shopkick/app/controllers/IRecyclerViewImageControllerCallback;",
        "Lcom/shopkick/fetchers/api/IAPICallback;",
        "Lcom/shopkick/app/tileViewHolderConfigurators/ReloadTileViewHolderConfigurator$IReloadButtonClickCallback;",
        "Lcom/shopkick/app/util/INotificationObserver;"
    }
.end annotation


# static fields
.field public static final ACTION_BUTTONS_TILE_TYPE:I = -0x4

.field public static final APPBOY_NEWS_FEED_TILE:I = -0x3b

.field public static final BRANDED_LOOKBOOK_COVER_TILE_TYPE:I = -0x17

.field public static final BRANDED_LOOKBOOK_END_TILE_TYPE:I = -0x18

.field public static final CATEGORY_HEADER_TILE_TYPE:I = -0x35

.field public static final ERROR_TILE_TYPE:I = -0xc

.field public static final FETCHING_TILE_TYPE:I = -0x7

.field public static final FILTERABLE_ADAPTER_SEARCH_TILE_TYPE:I = -0x2f

.field public static final JUMP_TO_CATEGORY_TILE_TYPE:I = -0x28

.field public static final KICKS_ACTIVITY_KICKS_TOTAL_TILE_TYPE:I = -0x2d

.field public static final KICKS_ACTIVITY_RECEIPT_DETAILS_HEADER:I = -0x2a

.field public static final KICKS_ACTIVITY_RECEIPT_DETAILS_IMAGES:I = -0x2b

.field public static final KICKS_ACTIVITY_RECEIPT_DETAILS_STORE_INFO:I = -0x2c

.field public static final LOADING_TILE_TYPE:I = -0x1

.field public static final LOOKBOOK_DESCRIPTION_TILE_TYPE:I = -0x37

.field public static final LOOKBOOK_SCREEN_HEADER_TILE_TYPE:I = -0x16

.field public static final NO_SAVES_TILE_TYPE:I = -0x19

.field public static final OFFER_DETAILS_STORE_TILE_TYPE:I = -0x36

.field public static final OFFLINE_EDUCATION_TILE_TYPE:I = -0xd

.field public static final ONLINE_OFFERS_WIDGET_EXCLUDE_CURRENT_PRODUCT:I = -0x39

.field public static final POST_SCAN_VIDEO_TILE:I = -0x3a

.field public static final PRODUCT_DETAILS_TILE_TYPE:I = -0xb

.field public static final PRODUCT_INFO_TILE_TYPE:I = -0xa

.field public static final PROMO_CAROUSEL_TILE_TYPE:I = -0xe

.field public static final RECEIPT_PRODUCT_SELECTOR_BUNDLE_ASSOCIATED_OFFER_TILE_TYPE:I = -0x38

.field public static final RECEIPT_RULES_TC_TILE_TYPE:I = -0x25

.field public static final RECEIPT_RULES_TILE_TYPE:I = -0x24

.field public static final RELOAD_TILE_TYPE:I = -0x2

.field public static final SEARCH_RESULT_CATEGORY_HEADER_TILE_TYPE:I = -0x6

.field public static final SEARCH_RESULT_STATUS:I = -0x8

.field public static final SECTION_HEADER_TILE_TYPE:I = -0x5

.field public static final SHARE_OPTIONS_TILE_TYPE:I = -0x3

.field public static final STORE_DETAILS_ADDRESS_TILE_TYPE:I = -0x20

.field public static final STORE_DETAILS_KICKS_TILE_TYPE:I = -0x23

.field public static final STORE_DETAILS_LOADING_PLACEHOLDER_TILE_TYPE:I = -0x1e

.field public static final STORE_DETAILS_ONLINE_KICKS_TILE_TYPE:I = -0x34

.field public static final STORE_DETAILS_VIDEO_LESSON_TILE:I = -0x3e7

.field public static final STORE_SELECTOR_HEADER_TILE_TYPE:I = -0x2e


# instance fields
.field private ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field protected apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field protected appScreenWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field

.field protected callbackWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;",
            ">;"
        }
    .end annotation
.end field

.field protected clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field protected configuratorMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;",
            ">;"
        }
    .end annotation
.end field

.field protected currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

.field private dividerItemDecoration:Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;

.field protected dividerItemDecorationRule:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterItemDecorationRule;

.field protected feedTiles:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation
.end field

.field private isAutoFetch:Z

.field private listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

.field protected nextPageKey:Ljava/lang/String;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private offlineEducationTilePosition:I

.field private recordedContentPerformance:Z

.field protected recyclerViewImageController:Lcom/shopkick/app/controllers/RecyclerViewImageController;

.field protected recyclerViewWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;",
            ">;"
        }
    .end annotation
.end field

.field protected savedPageResponse:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

.field protected scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

.field protected scrollOrientation:I

.field protected shouldSavePageResponse:Z

.field protected supportedTileTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field private userEventCoordinators:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/logging/IUserEventCoordinator;",
            ">;"
        }
    .end annotation
.end field

.field private userEventRecyclerViewCoordinator:Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;

.field protected widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Lcom/shopkick/app/screens/AppScreen;",
            "Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;",
            "Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/logging/IUserEventCoordinator;",
            ">;)V"
        }
    .end annotation

    const/4 v7, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 187
    invoke-direct/range {v0 .. v7}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;I)V

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Lcom/shopkick/app/screens/AppScreen;",
            "Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;",
            "Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/logging/IUserEventCoordinator;",
            ">;I)V"
        }
    .end annotation

    .line 202
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 203
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iput-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 204
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iput-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    .line 205
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 206
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->callbackWeakReference:Ljava/lang/ref/WeakReference;

    .line 207
    new-instance p3, Ljava/lang/ref/WeakReference;

    invoke-direct {p3, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p3, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    .line 208
    new-instance p3, Ljava/lang/ref/WeakReference;

    invoke-direct {p3, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p3, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->recyclerViewWeakReference:Ljava/lang/ref/WeakReference;

    .line 209
    iget-object p3, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p3, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 210
    iget-object p3, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object p3, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 211
    iget-object p3, p1, Lcom/shopkick/app/application/ScreenGlobals;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    iput-object p3, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    .line 212
    iput p7, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->scrollOrientation:I

    .line 213
    new-instance p3, Lcom/shopkick/app/account/AgeVerificationController;

    iget-object v1, p1, Lcom/shopkick/app/application/ScreenGlobals;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v2, p1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v3, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v4, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v5, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v6, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    move-object v0, p3

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/shopkick/app/account/AgeVerificationController;-><init>(Lcom/shopkick/app/application/ProfileInfo;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/screens/AppScreen;)V

    iput-object p3, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    .line 222
    new-instance p3, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p7

    .line 223
    invoke-virtual {p7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p7

    invoke-direct {p3, p7}, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;-><init>(Ljava/lang/String;)V

    .line 224
    invoke-virtual {p4, p3}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    .line 227
    iget-object p7, p2, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    if-eqz p7, :cond_0

    .line 228
    iget-object p7, p2, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p7, p3}, Lcom/shopkick/app/logging/UserEventLogger;->addUserEventCoordinator(Lcom/shopkick/app/logging/IUserEventCoordinator;)V

    .line 230
    :cond_0
    iput-object p3, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->userEventRecyclerViewCoordinator:Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;

    if-eqz p6, :cond_1

    .line 232
    invoke-virtual {p6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p7

    if-nez p7, :cond_1

    .line 233
    iput-object p6, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->userEventCoordinators:Ljava/util/ArrayList;

    .line 234
    iget-object p6, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->userEventCoordinators:Ljava/util/ArrayList;

    invoke-virtual {p6, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 238
    :cond_1
    iget-object p3, p2, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    if-eqz p3, :cond_2

    .line 239
    iget-object p3, p2, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p4, p3}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    .line 243
    :cond_2
    new-instance p3, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;

    invoke-direct {p3}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;-><init>()V

    iput-object p3, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->dividerItemDecoration:Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;

    .line 244
    iget-object p3, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->dividerItemDecoration:Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;

    invoke-virtual {p4, p3}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 247
    invoke-virtual {p4}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getItemAnimator()Landroid/support/v7/widget/RecyclerView$ItemAnimator;

    move-result-object p3

    .line 248
    instance-of p6, p3, Landroid/support/v7/widget/SimpleItemAnimator;

    const/4 p7, 0x0

    if-eqz p6, :cond_3

    .line 249
    check-cast p3, Landroid/support/v7/widget/SimpleItemAnimator;

    invoke-virtual {p3, p7}, Landroid/support/v7/widget/SimpleItemAnimator;->setSupportsChangeAnimations(Z)V

    .line 253
    :cond_3
    new-instance p3, Lcom/shopkick/app/controllers/RecyclerViewImageController;

    invoke-direct {p3, p4, p0}, Lcom/shopkick/app/controllers/RecyclerViewImageController;-><init>(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Lcom/shopkick/app/controllers/IRecyclerViewImageControllerCallback;)V

    iput-object p3, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->recyclerViewImageController:Lcom/shopkick/app/controllers/RecyclerViewImageController;

    .line 256
    new-instance p3, Ljava/util/HashSet;

    invoke-direct {p3, p5}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object p3, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->supportedTileTypes:Ljava/util/Set;

    const/16 p3, 0x12

    .line 257
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p5, p3}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_4

    .line 258
    invoke-static {p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p5, p3}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_5

    .line 261
    :cond_4
    iget-object p3, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->supportedTileTypes:Ljava/util/Set;

    const/16 p4, 0x1b

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {p3, p4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_5
    const/16 p3, -0xd

    .line 265
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p5, p3}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_6

    .line 266
    iget-object p3, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->supportedTileTypes:Ljava/util/Set;

    const/16 p4, 0x3f6

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {p3, p4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 269
    :cond_6
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    .line 270
    iget-object p3, p2, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-direct {p0, p3, p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->populateConfiguratorsForTypes(Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/application/ScreenGlobals;)V

    .line 272
    invoke-virtual {p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->shouldEnableDynamicContentLogging()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 273
    sget-object p1, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->DYNAMIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/screens/AppScreen;->addResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    .line 276
    :cond_7
    iput p7, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->offlineEducationTilePosition:I

    .line 277
    invoke-virtual {p0, p7}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->setIsAutoFetch(Z)V

    .line 279
    iget-object p1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo p2, "tabChangedEvent"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 280
    iget-object p1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "EventModuleRequestSuccess"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 281
    iget-object p1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "EventModuleRequestFailed"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method private copyFields(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 5

    .line 1769
    const-class v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v0}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    .line 1771
    :try_start_0
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 1772
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v4

    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    .line 1773
    :cond_0
    invoke-virtual {v3, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, p2, v4}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catch_0
    :cond_1
    return-void
.end method

.method private filterTileList(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation

    .line 1064
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 1065
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 1066
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    if-eqz v2, :cond_0

    .line 1067
    iget-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 1072
    :goto_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1073
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 1074
    invoke-static {}, Lcom/shopkick/app/util/FeatureFlagHelper;->isAffilateStoreEnabled()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-static {v2}, Lcom/shopkick/app/util/Affiliate;->isAffiliateStore(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_2

    .line 1077
    :cond_3
    iget-object v3, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->supportedTileTypes:Ljava/util/Set;

    iget-object v4, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 1078
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1081
    invoke-virtual {p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getPositionIgnoredTileTypes()Ljava/util/Set;

    move-result-object v3

    iget-object v4, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    add-int/lit8 v3, v0, 0x1

    .line 1082
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    move v0, v3

    goto :goto_2

    :cond_4
    return-object v1
.end method

.method private getConfiguratorForType(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/url/URLDispatcher;I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
    .locals 14

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v9, p2

    move/from16 v2, p3

    .line 438
    iget-object v3, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->recyclerViewWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/support/v7/widget/RecyclerView;

    const/4 v4, 0x0

    if-nez v3, :cond_0

    return-object v4

    .line 443
    :cond_0
    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v6

    .line 444
    iget-object v10, v1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    packed-switch v2, :pswitch_data_0

    packed-switch v2, :pswitch_data_1

    packed-switch v2, :pswitch_data_2

    packed-switch v2, :pswitch_data_3

    packed-switch v2, :pswitch_data_4

    packed-switch v2, :pswitch_data_5

    packed-switch v2, :pswitch_data_6

    packed-switch v2, :pswitch_data_7

    packed-switch v2, :pswitch_data_8

    packed-switch v2, :pswitch_data_9

    packed-switch v2, :pswitch_data_a

    packed-switch v2, :pswitch_data_b

    packed-switch v2, :pswitch_data_c

    packed-switch v2, :pswitch_data_d

    packed-switch v2, :pswitch_data_e

    packed-switch v2, :pswitch_data_f

    packed-switch v2, :pswitch_data_10

    packed-switch v2, :pswitch_data_11

    packed-switch v2, :pswitch_data_12

    packed-switch v2, :pswitch_data_13

    packed-switch v2, :pswitch_data_14

    packed-switch v2, :pswitch_data_15

    packed-switch v2, :pswitch_data_16

    packed-switch v2, :pswitch_data_17

    sparse-switch v2, :sswitch_data_0

    return-object v4

    .line 925
    :sswitch_0
    iget-object v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/screens/AppScreen;

    if-nez v2, :cond_1

    return-object v4

    .line 929
    :cond_1
    new-instance v3, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesV2ViewHolderConfigurator;

    invoke-direct {v3, p1, v9, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesV2ViewHolderConfigurator;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/screens/AppScreen;)V

    return-object v3

    .line 858
    :sswitch_1
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/CPGLocationWidgetTileViewHolderConfigurator;

    iget-object v3, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    .line 860
    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/screens/AppScreen;

    invoke-direct {v2, p1, v9, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/CPGLocationWidgetTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/screens/AppScreen;)V

    return-object v2

    .line 900
    :sswitch_2
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsOnlinePurchaseTileConfigurator;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    invoke-direct {v2, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsOnlinePurchaseTileConfigurator;-><init>(Lcom/shopkick/app/store/MCommerceManager;)V

    return-object v2

    .line 569
    :sswitch_3
    iget v1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->scrollOrientation:I

    if-nez v1, :cond_2

    .line 570
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalNoContentTileViewHolderConfigurator;

    invoke-direct {v1, v6}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalNoContentTileViewHolderConfigurator;-><init>(Landroid/content/Context;)V

    return-object v1

    .line 572
    :cond_2
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator;

    invoke-direct {v1, v6}, Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator;-><init>(Landroid/content/Context;)V

    return-object v1

    .line 844
    :sswitch_4
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookOnlineOfferTileViewHolderConfigurator;

    iget-object v3, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/screens/AppScreen;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    iget-object v4, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-direct {v2, v3, v1, v4}, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookOnlineOfferTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/app/application/ClientFlagsManager;)V

    return-object v2

    .line 506
    :sswitch_5
    new-instance v2, Lcom/shopkick/app/kicksActivity/KicksActivityBirthdayKicksViewHolderConfigurator;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-direct {v2, v1}, Lcom/shopkick/app/kicksActivity/KicksActivityBirthdayKicksViewHolderConfigurator;-><init>(Lcom/shopkick/app/application/ProfileInfo;)V

    return-object v2

    :sswitch_6
    const-string/jumbo v2, "storiesSaveDoneEvent"

    .line 518
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string/jumbo v2, "story_read_state_updated"

    .line 519
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string/jumbo v2, "storiesSavedStateUpdated"

    .line 520
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 521
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    iget-object v3, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v4, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-direct {v2, v1, v9, v3, v4}, Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/stories/StoriesDataSource;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/account/AgeVerificationController;)V

    return-object v2

    .line 686
    :sswitch_7
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsLoadingPlaceHolderTileViewHolderConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsLoadingPlaceHolderTileViewHolderConfigurator;-><init>()V

    return-object v1

    .line 680
    :sswitch_8
    new-instance v8, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;

    iget-object v3, v1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v4, v1, Lcom/shopkick/app/application/ScreenGlobals;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    iget-object v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    .line 682
    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcom/shopkick/app/screens/AppScreen;

    iget-object v6, v1, Lcom/shopkick/app/application/ScreenGlobals;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    iget-object v7, v1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/app/account/UserAccount;)V

    return-object v8

    .line 540
    :sswitch_9
    iget-object v1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/screens/AppScreen;

    if-nez v1, :cond_3

    return-object v4

    .line 544
    :cond_3
    instance-of v1, v1, Lcom/shopkick/app/receipts/JumpCapableScreen;

    if-eqz v1, :cond_4

    .line 545
    new-instance v1, Lcom/shopkick/app/receipts/JumpToCategoryTileConfigurator;

    iget-object v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/receipts/JumpCapableScreen;

    invoke-direct {v1, v2}, Lcom/shopkick/app/receipts/JumpToCategoryTileConfigurator;-><init>(Lcom/shopkick/app/receipts/JumpCapableScreen;)V

    return-object v1

    :cond_4
    return-object v4

    .line 854
    :sswitch_a
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/AppboyNewsfeedTileViewHolderConfigurator;

    invoke-direct {v1, v9}, Lcom/shopkick/app/tileViewHolderConfigurators/AppboyNewsfeedTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/url/URLDispatcher;)V

    return-object v1

    .line 971
    :sswitch_b
    new-instance v7, Lcom/shopkick/app/tileViewHolderConfigurators/FTUEStoreDetailsLessonVideoTileViewHolderConfigurator;

    iget-object v3, v1, Lcom/shopkick/app/application/ScreenGlobals;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    iget-object v5, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    iget-object v8, v1, Lcom/shopkick/app/application/ScreenGlobals;->videoController:Lcom/shopkick/app/video/VideoController;

    move-object v1, v7

    move-object v2, v6

    move-object/from16 v4, p2

    move-object v6, v8

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/app/tileViewHolderConfigurators/FTUEStoreDetailsLessonVideoTileViewHolderConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/stories/StoriesDataSource;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/video/VideoController;)V

    return-object v7

    .line 881
    :pswitch_0
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/QuickKicksViewHolderConfigurator;

    iget-object v3, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/screens/AppScreen;

    invoke-direct {v2, p1, v9, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/QuickKicksViewHolderConfigurator;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/screens/AppScreen;)V

    return-object v2

    .line 879
    :pswitch_1
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/SponsoredBrowseStoryViewHolderConfigurator;

    iget-object v3, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/screens/AppScreen;

    invoke-direct {v2, p1, v9, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/SponsoredBrowseStoryViewHolderConfigurator;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/screens/AppScreen;)V

    return-object v2

    .line 877
    :pswitch_2
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/BrowseStoryViewHolderConfigurator;

    iget-object v3, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/screens/AppScreen;

    invoke-direct {v2, p1, v9, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/BrowseStoryViewHolderConfigurator;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/screens/AppScreen;)V

    return-object v2

    .line 862
    :pswitch_3
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/CPGCategoryWidgetTileViewHolderConfigurator;

    iget-object v3, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    .line 864
    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/screens/AppScreen;

    invoke-direct {v2, p1, v9, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/CPGCategoryWidgetTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/screens/AppScreen;)V

    return-object v2

    :pswitch_4
    const-string v2, "eventOnlineOfferClickSucceeded"

    .line 867
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 868
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOffersWidgetTileViewHolderConfigurator;

    iget-object v3, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    .line 870
    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/screens/AppScreen;

    invoke-direct {v2, p1, v9, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOffersWidgetTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/screens/AppScreen;)V

    return-object v2

    .line 733
    :pswitch_5
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/DailyGoalsBannerTileViewHolderConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/DailyGoalsBannerTileViewHolderConfigurator;-><init>()V

    return-object v1

    .line 741
    :pswitch_6
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/VerticalStoreTileViewHolderConfigurator;

    iget-object v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    .line 742
    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/screens/AppScreen;

    invoke-direct {v1, v6, v2, v9}, Lcom/shopkick/app/tileViewHolderConfigurators/VerticalStoreTileViewHolderConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/url/URLDispatcher;)V

    return-object v1

    .line 693
    :pswitch_7
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator;

    iget-object v3, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    .line 695
    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/screens/AppScreen;

    invoke-direct {v2, p1, v9, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/screens/AppScreen;)V

    return-object v2

    .line 952
    :pswitch_8
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;

    iget-object v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-direct {v1, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/application/ClientFlagsManager;)V

    return-object v1

    .line 945
    :pswitch_9
    iget-object v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/screens/AppScreen;

    if-nez v2, :cond_5

    return-object v4

    .line 949
    :cond_5
    new-instance v8, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleScanMissionTileConfigurator;

    iget-object v4, v1, Lcom/shopkick/app/application/ScreenGlobals;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    iget-object v5, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    iget-object v7, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    move-object v1, v8

    move-object v3, v6

    move-object/from16 v6, p2

    invoke-direct/range {v1 .. v7}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleScanMissionTileConfigurator;-><init>(Lcom/shopkick/app/screens/AppScreen;Landroid/content/Context;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/application/ClientFlagsManager;)V

    return-object v8

    :pswitch_a
    const-string v2, "eventPostScanNotificationUpdated"

    .line 907
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 908
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->postScanNotificationController:Lcom/shopkick/app/products/PostScanNotificationController;

    invoke-direct {v2, v6, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferPostScanNotificationTileConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/products/PostScanNotificationController;)V

    return-object v2

    .line 919
    :pswitch_b
    iget-object v1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/screens/AppScreen;

    if-nez v1, :cond_6

    return-object v4

    .line 923
    :cond_6
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/OfferBundleAssociatedOffersTileConfigurator;

    invoke-direct {v2, v6, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferBundleAssociatedOffersTileConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/screens/AppScreen;)V

    return-object v2

    .line 931
    :pswitch_c
    iget-object v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/screens/AppScreen;

    if-nez v2, :cond_7

    return-object v4

    .line 935
    :cond_7
    new-instance v11, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleReceiptTileConfigurator;

    iget-object v4, v1, Lcom/shopkick/app/application/ScreenGlobals;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    iget-object v5, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    iget-object v8, v1, Lcom/shopkick/app/application/ScreenGlobals;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    iget-object v12, v1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v13, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    move-object v1, v11

    move-object v3, v6

    move-object/from16 v6, p2

    move-object v7, v10

    move-object v9, v12

    move-object v10, v13

    invoke-direct/range {v1 .. v10}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleReceiptTileConfigurator;-><init>(Lcom/shopkick/app/screens/AppScreen;Landroid/content/Context;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/application/ClientFlagsManager;)V

    return-object v11

    .line 913
    :pswitch_d
    iget-object v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/screens/AppScreen;

    .line 914
    new-instance v11, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsMinimumPurchaseRequirementReceiptTileConfigurator;

    iget-object v4, v1, Lcom/shopkick/app/application/ScreenGlobals;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    iget-object v5, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    iget-object v7, v1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v8, v1, Lcom/shopkick/app/application/ScreenGlobals;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    iget-object v10, v1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v12, v1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    move-object v1, v11

    move-object v3, v6

    move-object/from16 v6, p2

    move-object v9, v10

    move-object v10, v12

    invoke-direct/range {v1 .. v10}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsMinimumPurchaseRequirementReceiptTileConfigurator;-><init>(Lcom/shopkick/app/screens/AppScreen;Landroid/content/Context;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/application/ClientFlagsManager;)V

    return-object v11

    .line 904
    :pswitch_e
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsOfferNotAvailableTileConfigurator;

    iget-object v3, v1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-direct {v2, v6, v3, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsOfferNotAvailableTileConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/util/NotificationCenter;)V

    return-object v2

    .line 894
    :pswitch_f
    iget-object v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/screens/AppScreen;

    .line 895
    new-instance v11, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;

    iget-object v4, v1, Lcom/shopkick/app/application/ScreenGlobals;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    iget-object v5, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    iget-object v7, v1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v8, v1, Lcom/shopkick/app/application/ScreenGlobals;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    iget-object v10, v1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v12, v1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    move-object v1, v11

    move-object v3, v6

    move-object/from16 v6, p2

    move-object v9, v10

    move-object v10, v12

    invoke-direct/range {v1 .. v10}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;-><init>(Lcom/shopkick/app/screens/AppScreen;Landroid/content/Context;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/application/ClientFlagsManager;)V

    return-object v11

    .line 889
    :pswitch_10
    iget-object v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/screens/AppScreen;

    .line 890
    new-instance v11, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;

    iget-object v4, v1, Lcom/shopkick/app/application/ScreenGlobals;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    iget-object v5, v1, Lcom/shopkick/app/application/ScreenGlobals;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v7, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    iget-object v8, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v12, v1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    move-object v1, v11

    move-object v3, v6

    move-object v6, v7

    move-object/from16 v7, p2

    move-object v9, v12

    invoke-direct/range {v1 .. v10}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;-><init>(Lcom/shopkick/app/screens/AppScreen;Landroid/content/Context;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/util/NotificationCenter;)V

    return-object v11

    :pswitch_11
    const-string v2, "EVENT_LIST_ADD_CONTROLLER_ITEM_ADDED"

    .line 886
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 887
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v3, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    invoke-direct {v2, v1, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;-><init>(Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/shoppinglists/ListAddController;)V

    return-object v2

    .line 884
    :pswitch_12
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsTileConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsTileConfigurator;-><init>()V

    return-object v1

    .line 826
    :pswitch_13
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSeeMoreTileViewHolderConfigurator;

    invoke-direct {v1, v9}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSeeMoreTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/url/URLDispatcher;)V

    return-object v1

    .line 662
    :pswitch_14
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/PaddingTileViewHolderConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/PaddingTileViewHolderConfigurator;-><init>()V

    return-object v1

    .line 777
    :pswitch_15
    new-instance v11, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;

    iget-object v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/screens/AppScreen;

    iget-object v3, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object v4, v1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v5, v1, Lcom/shopkick/app/application/ScreenGlobals;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    iget-object v6, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    iget-object v7, v1, Lcom/shopkick/app/application/ScreenGlobals;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iget-object v8, v1, Lcom/shopkick/app/application/ScreenGlobals;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v10, v1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    move-object v1, v11

    move-object/from16 v9, p2

    invoke-direct/range {v1 .. v10}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/shoppinglists/ListAddController;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/application/AppPreferences;)V

    return-object v11

    :pswitch_16
    const-string v2, "eventTaxonomyLoaded"

    .line 772
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 773
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator;

    iget-object v3, v1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-direct {v2, v3, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;)V

    return-object v2

    :pswitch_17
    const-string v2, "eventShoppingListEntryCompletionToggled"

    .line 763
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string v2, "eventShoppingListInvalidated"

    .line 765
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 766
    new-instance v7, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;

    iget-object v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object v3, v1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v4, v1, Lcom/shopkick/app/application/ScreenGlobals;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iget-object v1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    .line 770
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/shopkick/app/screens/AppScreen;

    move-object v1, v7

    move-object/from16 v5, p2

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/screens/AppScreen;)V

    return-object v7

    .line 602
    :pswitch_18
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator;

    iget-object v3, v1, Lcom/shopkick/app/application/ScreenGlobals;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    invoke-direct {v2, v9, v3, v1, v6}, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator;-><init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;Landroid/content/Context;)V

    return-object v2

    .line 966
    :pswitch_19
    new-instance v7, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

    iget-object v3, v1, Lcom/shopkick/app/application/ScreenGlobals;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v4, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    move-object v1, v7

    move-object v2, v6

    move-object v5, v10

    move-object/from16 v6, p2

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/video/VideoController;Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/url/URLDispatcher;)V

    return-object v7

    :pswitch_1a
    const-string v2, "EventVideoAwardRequestStart"

    .line 735
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string v2, "EventVideoAwardRequestCompleted"

    .line 736
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 737
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/Promo320x160VideoViewHolderConfigurator;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v3, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-direct {v2, v1, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/Promo320x160VideoViewHolderConfigurator;-><init>(Lcom/shopkick/app/video/VideoController;Lcom/shopkick/app/account/AgeVerificationController;)V

    return-object v2

    .line 708
    :pswitch_1b
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/BBYSingleBarcodePromoTileViewHolderConfigurator;

    iget-object v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    iget-object v3, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-direct {v1, v9, v2, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/BBYSingleBarcodePromoTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/url/URLDispatcher;Ljava/lang/ref/WeakReference;Lcom/shopkick/app/application/ClientFlagsManager;)V

    return-object v1

    .line 703
    :pswitch_1c
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/BBYBarcodePromoTileViewHolderConfigurator;

    iget-object v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    iget-object v3, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-direct {v1, v6, v9, v2, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/BBYBarcodePromoTileViewHolderConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/url/URLDispatcher;Ljava/lang/ref/WeakReference;Lcom/shopkick/app/application/ClientFlagsManager;)V

    return-object v1

    .line 701
    :pswitch_1d
    :sswitch_c
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/PromoTileViewHolderConfigurator;

    invoke-direct {v1, v9, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/PromoTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/url/URLDispatcher;I)V

    return-object v1

    .line 739
    :pswitch_1e
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderCenteredTileViewHolderConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderCenteredTileViewHolderConfigurator;-><init>()V

    return-object v1

    .line 969
    :pswitch_1f
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-direct {v2, v6, v1, v9}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/url/URLDispatcher;)V

    return-object v2

    .line 761
    :pswitch_20
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-direct {v2, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/InlineProgrammaticVideoTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/video/VideoController;)V

    return-object v2

    .line 958
    :pswitch_21
    instance-of v2, v0, Lcom/shopkick/app/store/KicksUnitAdapter;

    if-eqz v2, :cond_8

    .line 959
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitCategoryTileViewHolderConfigurator;

    iget-object v3, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    invoke-direct {v2, v3, v1, v9}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineKicksUnitCategoryTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/app/url/URLDispatcher;)V

    return-object v2

    .line 963
    :cond_8
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsScreenCategoryKickTileViewHolderConfigurator;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    invoke-direct {v2, v1, v9}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsScreenCategoryKickTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/app/url/URLDispatcher;)V

    return-object v2

    :pswitch_22
    const-string v1, "EventAllVideoCompleted"

    .line 597
    invoke-virtual {v10, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 598
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderV5TileViewHolderConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderV5TileViewHolderConfigurator;-><init>()V

    return-object v1

    .line 759
    :pswitch_23
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalProgrammaticVideoTileViewHolderConfigurator;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-direct {v2, v6, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalProgrammaticVideoTileViewHolderConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/video/VideoController;)V

    return-object v2

    .line 956
    :pswitch_24
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorFooterViewHolderConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorFooterViewHolderConfigurator;-><init>()V

    return-object v1

    .line 954
    :pswitch_25
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;

    invoke-direct {v1, v6, v9}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/url/URLDispatcher;)V

    return-object v1

    :pswitch_26
    const-string v2, "EventVideoAwardRequestStart"

    .line 745
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string v2, "EventVideoAwardRequestCompleted"

    .line 746
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    :pswitch_27
    const-string/jumbo v2, "story_read_state_updated"

    .line 749
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 750
    new-instance v7, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSponsoredLookbookTileViewHolderConfigurator;

    iget-object v3, v1, Lcom/shopkick/app/application/ScreenGlobals;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    iget-object v5, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    iget-object v8, v1, Lcom/shopkick/app/application/ScreenGlobals;->videoController:Lcom/shopkick/app/video/VideoController;

    move-object v1, v7

    move-object v2, v6

    move-object/from16 v4, p2

    move-object v6, v8

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSponsoredLookbookTileViewHolderConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/stories/StoriesDataSource;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/video/VideoController;)V

    return-object v7

    :pswitch_28
    const-string v2, "EventVideoAwardRequestStart"

    .line 752
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string v2, "EventVideoAwardRequestCompleted"

    .line 753
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    :pswitch_29
    const-string/jumbo v2, "story_read_state_updated"

    .line 756
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 757
    new-instance v7, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalLookbookTileViewHolderConfigurator;

    iget-object v3, v1, Lcom/shopkick/app/application/ScreenGlobals;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    iget-object v5, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    iget-object v8, v1, Lcom/shopkick/app/application/ScreenGlobals;->videoController:Lcom/shopkick/app/video/VideoController;

    move-object v1, v7

    move-object v2, v6

    move-object/from16 v4, p2

    move-object v6, v8

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalLookbookTileViewHolderConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/stories/StoriesDataSource;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/video/VideoController;)V

    return-object v7

    .line 595
    :pswitch_2a
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderV4TileViewHolderConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderV4TileViewHolderConfigurator;-><init>()V

    return-object v1

    .line 942
    :pswitch_2b
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;

    iget-object v7, v1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v8, v1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v9, v1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v10, v1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    move-object v5, v2

    invoke-direct/range {v5 .. v10}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;)V

    return-object v2

    .line 911
    :pswitch_2c
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;

    invoke-direct {v2, p1, v6}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Landroid/content/Context;)V

    return-object v2

    .line 852
    :pswitch_2d
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/RetailerReceiptOfferCategoryTileViewHolderConfigurator;

    invoke-direct {v1, v9}, Lcom/shopkick/app/tileViewHolderConfigurators/RetailerReceiptOfferCategoryTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/url/URLDispatcher;)V

    return-object v1

    .line 849
    :pswitch_2e
    iget-object v1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/screens/AppScreen;

    .line 850
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalRetailerReceiptOfferTileViewHolderConfigurator;

    invoke-direct {v2, v1, v9}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalRetailerReceiptOfferTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/url/URLDispatcher;)V

    return-object v2

    .line 593
    :pswitch_2f
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderV3TileViewHolderConfigurator;

    invoke-direct {v1, v9}, Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderV3TileViewHolderConfigurator;-><init>(Lcom/shopkick/app/url/URLDispatcher;)V

    return-object v1

    .line 828
    :pswitch_30
    iget-object v2, v1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v2}, Lcom/shopkick/app/util/FeatureFlagHelper;->useOnlineOfferTileV2(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 829
    iget v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->scrollOrientation:I

    if-nez v2, :cond_9

    .line 830
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalOnlineOfferTileV2ViewHolderConfigurator;

    iget-object v3, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/screens/AppScreen;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    iget-object v4, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-direct {v2, v3, v1, v4}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalOnlineOfferTileV2ViewHolderConfigurator;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/app/application/ClientFlagsManager;)V

    return-object v2

    .line 833
    :cond_9
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOfferTileV2ViewHolderConfigurator;

    iget-object v3, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/screens/AppScreen;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    iget-object v4, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-direct {v2, v3, v1, v4}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOfferTileV2ViewHolderConfigurator;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/app/application/ClientFlagsManager;)V

    return-object v2

    .line 837
    :cond_a
    iget v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->scrollOrientation:I

    if-nez v2, :cond_b

    .line 838
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalOnlineOfferTileViewHolderConfigurator;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    invoke-direct {v2, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalOnlineOfferTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/store/MCommerceManager;)V

    return-object v2

    .line 840
    :cond_b
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOfferTileViewHolderConfigurator;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    invoke-direct {v2, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOfferTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/store/MCommerceManager;)V

    return-object v2

    .line 847
    :pswitch_31
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineStoreDescriptionTileViewHolderConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineStoreDescriptionTileViewHolderConfigurator;-><init>()V

    return-object v1

    .line 813
    :pswitch_32
    new-instance v1, Lcom/shopkick/app/receipts/ReceiptStoreCellTileConfigurator;

    invoke-direct {v1, v9}, Lcom/shopkick/app/receipts/ReceiptStoreCellTileConfigurator;-><init>(Lcom/shopkick/app/url/URLDispatcher;)V

    return-object v1

    .line 793
    :pswitch_33
    new-instance v1, Lcom/shopkick/app/activities/KicksActivityReceiptDetailsViewHolderConfigurator;

    iget-object v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-direct {v1, v2}, Lcom/shopkick/app/activities/KicksActivityReceiptDetailsViewHolderConfigurator;-><init>(Lcom/shopkick/app/application/ClientFlagsManager;)V

    return-object v1

    .line 789
    :pswitch_34
    new-instance v1, Lcom/shopkick/app/kicksActivity/KicksActivityAggregatedReceiptViewHolderConfigurator;

    invoke-direct {v1, v9}, Lcom/shopkick/app/kicksActivity/KicksActivityAggregatedReceiptViewHolderConfigurator;-><init>(Lcom/shopkick/app/url/URLDispatcher;)V

    return-object v1

    .line 613
    :pswitch_35
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/FeaturedContentTileViewHolderConfigurator;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v3, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-direct {v2, v9, v1, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/FeaturedContentTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/video/VideoController;Lcom/shopkick/app/account/AgeVerificationController;)V

    return-object v2

    :pswitch_36
    const-string v2, "EventVideoAwardRequestStart"

    .line 607
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string v2, "EventVideoAwardRequestCompleted"

    .line 608
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 609
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;

    iget-object v3, v1, Lcom/shopkick/app/application/ScreenGlobals;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->storyCardDataSource:Lcom/shopkick/app/storycards/StoryCardDataSource;

    iget-object v4, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-direct {v2, v3, v1, v4}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeVideoTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/video/VideoController;Lcom/shopkick/app/storycards/StoryCardDataSource;Lcom/shopkick/app/account/AgeVerificationController;)V

    return-object v2

    .line 566
    :pswitch_37
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookV2TileViewHolderConfigurator;

    iget-object v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v3, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-direct {v1, v9, v2, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookV2TileViewHolderConfigurator;-><init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/account/AgeVerificationController;)V

    return-object v1

    .line 533
    :pswitch_38
    instance-of v1, v0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    if-eqz v1, :cond_c

    .line 534
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator;

    move-object v2, v0

    check-cast v2, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    iget-object v3, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-direct {v1, v2, v3, v6}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator;-><init>(Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;Lcom/shopkick/app/account/AgeVerificationController;Landroid/content/Context;)V

    return-object v1

    :cond_c
    return-object v4

    .line 527
    :pswitch_39
    instance-of v1, v0, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    if-eqz v1, :cond_d

    .line 528
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorReceiptTileConfigurator;

    move-object v2, v0

    check-cast v2, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    invoke-direct {v1, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorReceiptTileConfigurator;-><init>(Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;)V

    return-object v1

    :cond_d
    return-object v4

    .line 550
    :pswitch_3a
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksCategoryHeaderTileViewHolderConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksCategoryHeaderTileViewHolderConfigurator;-><init>()V

    return-object v1

    .line 591
    :pswitch_3b
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderV2TileViewHolderConfigurator;

    invoke-direct {v1, v9}, Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderV2TileViewHolderConfigurator;-><init>(Lcom/shopkick/app/url/URLDispatcher;)V

    return-object v1

    .line 553
    :pswitch_3c
    :sswitch_d
    new-instance v10, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;

    iget-object v3, v1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v4, v1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v5, v1, Lcom/shopkick/app/application/ScreenGlobals;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    iget-object v7, v1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v8, v1, Lcom/shopkick/app/application/ScreenGlobals;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    iget-object v1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    .line 559
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lcom/shopkick/app/screens/AppScreen;

    move-object v1, v10

    move-object v2, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v11

    move-object/from16 v9, p2

    invoke-direct/range {v1 .. v9}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/url/URLDispatcher;)V

    return-object v10

    :pswitch_3d
    const-string v2, "EventVideoAwardRequestStart"

    .line 729
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string v2, "EventVideoAwardRequestCompleted"

    .line 730
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 731
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/VideoTileViewHolderConfigurator;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v3, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-direct {v2, v1, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/VideoTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/video/VideoController;Lcom/shopkick/app/account/AgeVerificationController;)V

    return-object v2

    :pswitch_3e
    if-eqz v6, :cond_e

    .line 724
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptRulesKickBateItemTileConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptRulesKickBateItemTileConfigurator;-><init>()V

    return-object v1

    :cond_e
    return-object v4

    .line 501
    :pswitch_3f
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;

    move-object v2, v0

    check-cast v2, Lcom/shopkick/app/products/ScansListAdapter;

    invoke-direct {v1, v9, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;-><init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/products/ScansListAdapter;)V

    return-object v1

    .line 516
    :pswitch_40
    new-instance v1, Lcom/shopkick/app/kicksActivity/KicksActivityPendingReceiptViewHolderConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/kicksActivity/KicksActivityPendingReceiptViewHolderConfigurator;-><init>()V

    return-object v1

    .line 514
    :pswitch_41
    new-instance v1, Lcom/shopkick/app/kicksActivity/KicksActivityInvalidReceiptViewHolderConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/kicksActivity/KicksActivityInvalidReceiptViewHolderConfigurator;-><init>()V

    return-object v1

    .line 508
    :pswitch_42
    new-instance v1, Lcom/shopkick/app/kicksActivity/KicksActivityPendingViewHolderConfigurator;

    invoke-direct {v1, v6}, Lcom/shopkick/app/kicksActivity/KicksActivityPendingViewHolderConfigurator;-><init>(Landroid/content/Context;)V

    return-object v1

    .line 510
    :pswitch_43
    new-instance v1, Lcom/shopkick/app/kicksActivity/KicksActivityPastHeaderViewHolderConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/kicksActivity/KicksActivityPastHeaderViewHolderConfigurator;-><init>()V

    return-object v1

    :pswitch_44
    const-string v2, "instantBonusAwardedEvent"

    .line 585
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string v2, "instantBonusFailed"

    .line 586
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 587
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusLargeTileViewHolderConfigurator;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->instantBonusAwarder:Lcom/shopkick/app/lookbooks/InstantBonusAwarder;

    invoke-direct {v2, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusLargeTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/lookbooks/InstantBonusAwarder;)V

    return-object v2

    :pswitch_45
    const-string/jumbo v2, "storyCardSavedStateUpdated"

    .line 580
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 581
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->storyCardDataSource:Lcom/shopkick/app/storycards/StoryCardDataSource;

    invoke-direct {v2, v1, v9, v6}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/storycards/StoryCardDataSource;Lcom/shopkick/app/url/URLDispatcher;Landroid/content/Context;)V

    return-object v2

    .line 512
    :pswitch_46
    new-instance v1, Lcom/shopkick/app/kicksActivity/KicksActivityPendingHeaderViewHolderConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/kicksActivity/KicksActivityPendingHeaderViewHolderConfigurator;-><init>()V

    return-object v1

    .line 504
    :pswitch_47
    new-instance v1, Lcom/shopkick/app/kicksActivity/KicksActivityPastViewHolderConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/kicksActivity/KicksActivityPastViewHolderConfigurator;-><init>()V

    return-object v1

    :pswitch_48
    const-string/jumbo v2, "storyCardSavedStateUpdated"

    .line 577
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 578
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->storyCardDataSource:Lcom/shopkick/app/storycards/StoryCardDataSource;

    invoke-direct {v2, v1, v9}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/storycards/StoryCardDataSource;Lcom/shopkick/app/url/URLDispatcher;)V

    return-object v2

    .line 575
    :pswitch_49
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedBannerTileViewHolderConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedBannerTileViewHolderConfigurator;-><init>()V

    return-object v1

    :pswitch_4a
    const-string v2, "productSavedStateUpdated"

    .line 447
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string v2, "EVENT_LIST_ADD_CONTROLLER_ITEM_ADDED"

    .line 448
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 449
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;

    iget-object v3, v1, Lcom/shopkick/app/application/ScreenGlobals;->productsDataSource:Lcom/shopkick/app/products/ProductsDataSource;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v4, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    invoke-direct {v2, v3, v9, v1, v4}, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/products/ProductsDataSource;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/shoppinglists/ListAddController;)V

    return-object v2

    :pswitch_4b
    if-eqz v6, :cond_f

    .line 493
    instance-of v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderScanMissionViewHolderConfigurator$IScanMissionTileAdapter;

    if-eqz v1, :cond_f

    .line 495
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderScanMissionViewHolderConfigurator;

    move-object v2, v0

    check-cast v2, Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderScanMissionViewHolderConfigurator$IScanMissionTileAdapter;

    invoke-direct {v1, v6, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderScanMissionViewHolderConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderScanMissionViewHolderConfigurator$IScanMissionTileAdapter;)V

    return-object v1

    :cond_f
    return-object v4

    .line 458
    :pswitch_4c
    iget-object v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcom/shopkick/app/screens/AppScreen;

    if-eqz v6, :cond_11

    if-eqz v5, :cond_11

    const-string v2, "ScanBCSucceeded"

    .line 460
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string v2, "EVENT_LIST_ADD_CONTROLLER_ITEM_ADDED"

    .line 461
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 463
    iget v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->scrollOrientation:I

    if-nez v2, :cond_10

    .line 464
    new-instance v12, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalScanTileViewHolderConfigurator;

    iget-object v3, v1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v4, v1, Lcom/shopkick/app/application/ScreenGlobals;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    const/4 v7, 0x0

    iget-object v8, v1, Lcom/shopkick/app/application/ScreenGlobals;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v10, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    iget-object v11, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    iget-object v13, v1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    move-object v1, v12

    move-object v2, v6

    move-object v6, v7

    move-object/from16 v7, p2

    move-object v9, v10

    move-object v10, v11

    move-object v11, v13

    invoke-direct/range {v1 .. v11}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalScanTileViewHolderConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$IScanV3TileAdapter;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/shoppinglists/ListAddController;Lcom/shopkick/app/application/AppPreferences;)V

    return-object v12

    .line 474
    :cond_10
    instance-of v2, v0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$IScanV3TileAdapter;

    if-eqz v2, :cond_11

    .line 475
    new-instance v12, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;

    iget-object v3, v1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v4, v1, Lcom/shopkick/app/application/ScreenGlobals;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    move-object v7, v0

    check-cast v7, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$IScanV3TileAdapter;

    iget-object v8, v1, Lcom/shopkick/app/application/ScreenGlobals;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v10, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    iget-object v11, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    iget-object v13, v1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    move-object v1, v12

    move-object v2, v6

    move-object v6, v7

    move-object/from16 v7, p2

    move-object v9, v10

    move-object v10, v11

    move-object v11, v13

    invoke-direct/range {v1 .. v11}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$IScanV3TileAdapter;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/shoppinglists/ListAddController;Lcom/shopkick/app/application/AppPreferences;)V

    return-object v12

    :cond_11
    return-object v4

    .line 491
    :pswitch_4d
    :sswitch_e
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderGrayViewHolderConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderGrayViewHolderConfigurator;-><init>()V

    return-object v1

    .line 712
    :pswitch_4e
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookSimpleTileViewHolderConfigurator;

    iget-object v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/screens/AppScreen;

    invoke-direct {v1, v2, v9}, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookSimpleTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/url/URLDispatcher;)V

    return-object v1

    .line 589
    :pswitch_4f
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderViewHolderConfigurator;

    invoke-direct {v1, v9}, Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderViewHolderConfigurator;-><init>(Lcom/shopkick/app/url/URLDispatcher;)V

    return-object v1

    :pswitch_50
    const-string v2, "instantBonusAwardedEvent"

    .line 454
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string v2, "instantBonusFailed"

    .line 455
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 456
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusTileViewHolderConfigurator;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->instantBonusAwarder:Lcom/shopkick/app/lookbooks/InstantBonusAwarder;

    invoke-direct {v2, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/lookbooks/InstantBonusAwarder;)V

    return-object v2

    .line 563
    :pswitch_51
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookTileViewHolderConfigurator;

    iget-object v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v3, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-direct {v1, v9, v2, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/account/AgeVerificationController;)V

    return-object v1

    .line 621
    :pswitch_52
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/LoadingTileViewHolderConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/LoadingTileViewHolderConfigurator;-><init>()V

    return-object v1

    .line 623
    :pswitch_53
    iget v1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->scrollOrientation:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_12

    .line 624
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/ReloadTileViewHolderConfigurator;

    invoke-direct {v1, p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ReloadTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/ReloadTileViewHolderConfigurator$IReloadButtonClickCallback;)V

    return-object v1

    .line 626
    :cond_12
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalReloadTileViewHolderConfigurator;

    invoke-direct {v1, v6}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalReloadTileViewHolderConfigurator;-><init>(Landroid/content/Context;)V

    return-object v1

    .line 634
    :pswitch_54
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/ShareOptionsTileViewHolderConfigurator;

    invoke-direct {v1, v9}, Lcom/shopkick/app/tileViewHolderConfigurators/ShareOptionsTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/url/URLDispatcher;)V

    return-object v1

    .line 638
    :pswitch_55
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/ActionButtonsTileViewHolderConfigurator;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->productsDataSource:Lcom/shopkick/app/products/ProductsDataSource;

    iget-object v3, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v4, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    invoke-direct {v2, v9, v1, v3, v4}, Lcom/shopkick/app/tileViewHolderConfigurators/ActionButtonsTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/products/ProductsDataSource;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/shoppinglists/ListAddController;)V

    return-object v2

    .line 643
    :pswitch_56
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderGrayViewHolderConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderGrayViewHolderConfigurator;-><init>()V

    return-object v1

    .line 645
    :pswitch_57
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultSectionHeaderViewHolderConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultSectionHeaderViewHolderConfigurator;-><init>()V

    return-object v1

    .line 617
    :pswitch_58
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/SearchLoadingTileViewHolderConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/SearchLoadingTileViewHolderConfigurator;-><init>()V

    return-object v1

    .line 619
    :pswitch_59
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator;-><init>()V

    return-object v1

    :pswitch_5a
    const-string v2, "productSavedStateUpdated"

    .line 629
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 630
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-direct {v2, v1, v9, v6}, Lcom/shopkick/app/tileViewHolderConfigurators/ProductInfoTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/url/URLDispatcher;Landroid/content/Context;)V

    return-object v2

    .line 636
    :pswitch_5b
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/ProductDetailsTileViewHolderConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/ProductDetailsTileViewHolderConfigurator;-><init>()V

    return-object v1

    .line 647
    :pswitch_5c
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/ErrorTileViewHolderConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/ErrorTileViewHolderConfigurator;-><init>()V

    return-object v1

    .line 649
    :pswitch_5d
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileViewHolderConfigurator;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    invoke-direct {v2, v9, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/awards/AwardsManager;)V

    return-object v2

    .line 660
    :pswitch_5e
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/CarouselPromoViewHolderConfigurator;

    iget-object v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-direct {v1, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/CarouselPromoViewHolderConfigurator;-><init>(Lcom/shopkick/app/account/AgeVerificationController;)V

    return-object v1

    :pswitch_5f
    const-string/jumbo v2, "storiesSaveDoneEvent"

    .line 651
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string/jumbo v2, "storiesSaveFailedEvent"

    .line 652
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string/jumbo v2, "storiesSavedStateUpdated"

    .line 653
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 654
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;

    iget-object v3, v1, Lcom/shopkick/app/application/ScreenGlobals;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->bitmapHelpers:Lcom/shopkick/app/graphics/BitmapHelpers;

    invoke-direct {v2, v3, v1, v9}, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/stories/StoriesDataSource;Lcom/shopkick/app/graphics/BitmapHelpers;Lcom/shopkick/app/url/URLDispatcher;)V

    return-object v2

    .line 664
    :pswitch_60
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookCoverTileViewHolderConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookCoverTileViewHolderConfigurator;-><init>()V

    return-object v1

    :pswitch_61
    const-string/jumbo v1, "storiesSaveDoneEvent"

    .line 666
    invoke-virtual {v10, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string/jumbo v1, "storiesSaveFailedEvent"

    .line 667
    invoke-virtual {v10, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string/jumbo v1, "storiesSavedStateUpdated"

    .line 668
    invoke-virtual {v10, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 669
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator;-><init>()V

    return-object v1

    .line 671
    :pswitch_62
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/NoSavesViewHolderConfigurator;

    invoke-direct {v1, v6, v9}, Lcom/shopkick/app/tileViewHolderConfigurators/NoSavesViewHolderConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/url/URLDispatcher;)V

    return-object v1

    .line 674
    :pswitch_63
    new-instance v7, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;

    iget-object v4, v1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v5, v1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v8, v1, Lcom/shopkick/app/application/ScreenGlobals;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    move-object v1, v7

    move-object v2, v6

    move-object/from16 v3, p2

    move-object v6, v8

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsKicksTileViewHolderConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/awards/AwardsManager;)V

    return-object v7

    .line 714
    :pswitch_64
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptRulesTileConfigurator;

    iget-object v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptRulesTileConfigurator;-><init>(Ljava/lang/ref/WeakReference;)V

    return-object v1

    .line 716
    :pswitch_65
    iget-object v1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/screens/AppScreen;

    if-eqz v1, :cond_13

    .line 718
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptRulesTermsAndConditionsTileConfigurator;

    invoke-direct {v2, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptRulesTermsAndConditionsTileConfigurator;-><init>(Lcom/shopkick/app/screens/AppScreen;)V

    return-object v2

    :cond_13
    return-object v4

    .line 795
    :pswitch_66
    new-instance v1, Lcom/shopkick/app/feed/KicksActivityReceiptDetailsHeaderViewHolderConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/feed/KicksActivityReceiptDetailsHeaderViewHolderConfigurator;-><init>()V

    return-object v1

    .line 797
    :pswitch_67
    iget-object v1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/screens/AppScreen;

    if-nez v1, :cond_14

    return-object v4

    .line 802
    :cond_14
    invoke-virtual {v1}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v2

    instance-of v2, v2, Lcom/shopkick/app/activities/KicksActivity;

    if-eqz v2, :cond_15

    instance-of v2, v1, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;

    if-eqz v2, :cond_15

    .line 804
    new-instance v2, Lcom/shopkick/app/feed/KicksActivityReceiptDetailsReceiptImagesViewConfigurator;

    invoke-virtual {v1}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/activities/KicksActivity;

    check-cast v1, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;

    invoke-direct {v2, v3, v1}, Lcom/shopkick/app/feed/KicksActivityReceiptDetailsReceiptImagesViewConfigurator;-><init>(Lcom/shopkick/app/activities/KicksActivity;Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;)V

    return-object v2

    :cond_15
    return-object v4

    .line 809
    :pswitch_68
    new-instance v1, Lcom/shopkick/app/feed/KicksActivityReceiptDetailsStoreInfoViewHolderConfigurator;

    iget-object v2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-direct {v1, v2}, Lcom/shopkick/app/feed/KicksActivityReceiptDetailsStoreInfoViewHolderConfigurator;-><init>(Lcom/shopkick/app/application/ClientFlagsManager;)V

    return-object v1

    .line 811
    :pswitch_69
    new-instance v1, Lcom/shopkick/app/feed/KicksActivityKicksTotalViewConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/feed/KicksActivityKicksTotalViewConfigurator;-><init>()V

    return-object v1

    .line 815
    :pswitch_6a
    new-instance v1, Lcom/shopkick/app/receipts/ReceiptStoreSelectorHeaderTileConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/receipts/ReceiptStoreSelectorHeaderTileConfigurator;-><init>()V

    return-object v1

    .line 817
    :pswitch_6b
    iget-object v1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/screens/AppScreen;

    if-nez v1, :cond_16

    return-object v4

    .line 821
    :cond_16
    instance-of v2, v1, Lcom/shopkick/app/feed/ISearchBarPressedCallback;

    if-eqz v2, :cond_17

    .line 822
    new-instance v2, Lcom/shopkick/app/feed/FilterableSearchTileConfigurator;

    check-cast v1, Lcom/shopkick/app/feed/ISearchBarPressedCallback;

    invoke-direct {v2, v1}, Lcom/shopkick/app/feed/FilterableSearchTileConfigurator;-><init>(Lcom/shopkick/app/feed/ISearchBarPressedCallback;)V

    return-object v2

    :cond_17
    return-object v4

    .line 688
    :pswitch_6c
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;

    iget-object v3, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    invoke-direct {v2, v6, v3, v1, v9}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsOnlineKicksTileViewHolderConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/app/url/URLDispatcher;)V

    return-object v2

    .line 600
    :pswitch_6d
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/CategoryHeaderTileViewHolderConfigurator;

    invoke-direct {v1, v9}, Lcom/shopkick/app/tileViewHolderConfigurators/CategoryHeaderTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/url/URLDispatcher;)V

    return-object v1

    .line 902
    :pswitch_6e
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsStoreTileConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsStoreTileConfigurator;-><init>()V

    return-object v1

    .line 658
    :pswitch_6f
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookDescriptionTileViewHolderConfigurator;

    invoke-direct {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookDescriptionTileViewHolderConfigurator;-><init>()V

    return-object v1

    .line 940
    :pswitch_70
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorScreenBundleAssociatedOfferTileConfigurator;

    invoke-direct {v1, v6}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorScreenBundleAssociatedOfferTileConfigurator;-><init>(Landroid/content/Context;)V

    return-object v1

    :pswitch_71
    const-string v2, "eventOnlineOfferClickSucceeded"

    .line 872
    invoke-virtual {v10, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 873
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOffersWidgetExcludeProductTileViewHolderConfigurator;

    iget-object v3, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    .line 875
    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/screens/AppScreen;

    invoke-direct {v2, p1, v9, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/OnlineOffersWidgetExcludeProductTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/screens/AppScreen;)V

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch -0x39
        :pswitch_71
        :pswitch_70
        :pswitch_6f
        :pswitch_6e
        :pswitch_6d
        :pswitch_6c
    .end packed-switch

    :pswitch_data_1
    .packed-switch -0x2f
        :pswitch_6b
        :pswitch_6a
        :pswitch_69
        :pswitch_68
        :pswitch_67
        :pswitch_66
    .end packed-switch

    :pswitch_data_2
    .packed-switch -0x25
        :pswitch_65
        :pswitch_64
        :pswitch_63
    .end packed-switch

    :pswitch_data_3
    .packed-switch -0x19
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
    .end packed-switch

    :pswitch_data_4
    .packed-switch -0xe
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
    .end packed-switch

    :pswitch_data_5
    .packed-switch -0x8
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_52
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0xb
        :pswitch_51
        :pswitch_50
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0x10
        :pswitch_4f
        :pswitch_4e
    .end packed-switch

    :pswitch_data_8
    .packed-switch 0x16
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
    .end packed-switch

    :pswitch_data_9
    .packed-switch 0x1b
        :pswitch_4a
        :pswitch_51
    .end packed-switch

    :pswitch_data_a
    .packed-switch 0x1e
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
    .end packed-switch

    :pswitch_data_b
    .packed-switch 0x2b
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_34
        :pswitch_33
        :pswitch_33
        :pswitch_33
        :pswitch_34
        :pswitch_32
    .end packed-switch

    :pswitch_data_c
    .packed-switch 0x3f
        :pswitch_31
        :pswitch_30
        :pswitch_2f
    .end packed-switch

    :pswitch_data_d
    .packed-switch 0x43
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
    .end packed-switch

    :pswitch_data_e
    .packed-switch 0x49
        :pswitch_2b
        :pswitch_2a
        :pswitch_28
        :pswitch_29
        :pswitch_29
        :pswitch_26
        :pswitch_27
        :pswitch_27
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
    .end packed-switch

    :pswitch_data_f
    .packed-switch 0x64
        :pswitch_1d
        :pswitch_1d
        :pswitch_1d
        :pswitch_1d
    .end packed-switch

    :pswitch_data_10
    .packed-switch 0x6c
        :pswitch_1c
        :pswitch_1b
    .end packed-switch

    :pswitch_data_11
    .packed-switch 0x71
        :pswitch_1a
        :pswitch_19
    .end packed-switch

    :pswitch_data_12
    .packed-switch 0x3f6
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_15
    .end packed-switch

    :pswitch_data_13
    .packed-switch 0x403
        :pswitch_14
        :pswitch_13
    .end packed-switch

    :pswitch_data_14
    .packed-switch 0x40a
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
    .end packed-switch

    :pswitch_data_15
    .packed-switch 0x415
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch

    :pswitch_data_16
    .packed-switch 0xfa5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_17
    .packed-switch 0xfab
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x3e7 -> :sswitch_b
        -0x3b -> :sswitch_a
        -0x28 -> :sswitch_9
        -0x20 -> :sswitch_8
        -0x1e -> :sswitch_7
        0x3 -> :sswitch_6
        0xe -> :sswitch_d
        0x14 -> :sswitch_e
        0x29 -> :sswitch_5
        0x47 -> :sswitch_4
        0x69 -> :sswitch_c
        0x3ed -> :sswitch_3
        0x413 -> :sswitch_2
        0xfa1 -> :sswitch_1
        0xfa9 -> :sswitch_0
    .end sparse-switch
.end method

.method private handlePageResponse(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;)V
    .locals 2

    .line 1396
    iget-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    if-eq v0, v1, :cond_3

    iget-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS_CLEAR:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 1414
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getIsAutoFetch()Z

    move-result v0

    if-nez v0, :cond_6

    .line 1416
    iget-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_RELOAD:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    if-ne v0, v1, :cond_1

    .line 1417
    invoke-virtual {p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addReloadTile()V

    goto :goto_1

    .line 1418
    :cond_1
    iget-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_OFFLINE_EDUCATION:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    if-ne v0, v1, :cond_2

    .line 1419
    invoke-virtual {p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addOfflineEducationTile()V

    goto :goto_1

    .line 1420
    :cond_2
    iget-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->NO_CONTENT:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    if-ne v0, v1, :cond_6

    .line 1421
    iget-object p1, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->noContentMessage:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addNoContentTile(Ljava/lang/String;)V

    goto :goto_1

    .line 1399
    :cond_3
    :goto_0
    iget-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS_CLEAR:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    if-ne v0, v1, :cond_4

    .line 1400
    invoke-virtual {p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clear()V

    .line 1403
    :cond_4
    iget-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->nextPageKey:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->nextPageKey:Ljava/lang/String;

    .line 1406
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->nextPageKey:Ljava/lang/String;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_5

    iget-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    if-eqz v0, :cond_5

    iget-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    .line 1407
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 1408
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/4 v1, -0x1

    .line 1409
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 1410
    iget-object v1, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1413
    :cond_5
    iget-object p1, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addTiles(Ljava/util/List;)V

    :cond_6
    :goto_1
    return-void
.end method

.method private invalidateTilesWithItemId(Ljava/lang/String;ZZ)V
    .locals 6

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 1214
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 1215
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v1, p1}, Lcom/shopkick/app/util/TileUtils;->isTileItemIdEqual(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    if-eqz p2, :cond_2

    .line 1216
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->globalSaveCount:Ljava/lang/Long;

    if-eqz v1, :cond_2

    const-wide/16 v1, 0x1

    if-eqz p3, :cond_1

    .line 1218
    iget-object v3, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->globalSaveCount:Ljava/lang/Long;

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->globalSaveCount:Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    add-long/2addr v4, v1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->globalSaveCount:Ljava/lang/Long;

    goto :goto_1

    .line 1220
    :cond_1
    iget-object v3, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->globalSaveCount:Ljava/lang/Long;

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->globalSaveCount:Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    sub-long/2addr v4, v1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->globalSaveCount:Ljava/lang/Long;

    .line 1223
    :cond_2
    :goto_1
    invoke-virtual {p0, v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notifyItemChanged(I)V

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method private isContentRow(I)Z
    .locals 0

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private populateConfiguratorsForTypes(Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/application/ScreenGlobals;)V
    .locals 10

    .line 405
    iget-object v0, p2, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {v0}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 406
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->configuratorMap:Ljava/util/HashMap;

    .line 408
    new-instance v0, Lcom/shopkick/app/shoppinglists/ListAddController;

    iget-object v2, p2, Lcom/shopkick/app/application/ScreenGlobals;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iget-object v3, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v4, p2, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object v5, p2, Lcom/shopkick/app/application/ScreenGlobals;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v6, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v7, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    iget-object v8, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    move-object v1, v0

    move-object v9, p1

    invoke-direct/range {v1 .. v9}, Lcom/shopkick/app/shoppinglists/ListAddController;-><init>(Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/util/NotificationCenter;Ljava/lang/ref/WeakReference;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/logging/UserEventLogger;)V

    iput-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    .line 417
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->supportedTileTypes:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 418
    iget-object v2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->configuratorMap:Ljava/util/HashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 419
    iget-object v2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-direct {p0, p2, v2, v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getConfiguratorForType(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/url/URLDispatcher;I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 423
    iget-object v3, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->userEventCoordinators:Ljava/util/ArrayList;

    if-eqz v3, :cond_1

    .line 424
    invoke-virtual {v2, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->setUserEventCoordinators(Ljava/util/ArrayList;)V

    goto :goto_1

    .line 426
    :cond_1
    iget-object v3, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->userEventRecyclerViewCoordinator:Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;

    invoke-virtual {v2, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->setUserEventCoordinator(Lcom/shopkick/app/logging/IUserEventCoordinator;)V

    .line 428
    :goto_1
    invoke-virtual {v2, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->setUserEventLogger(Lcom/shopkick/app/logging/UserEventLogger;)V

    .line 429
    iget-object v3, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->configuratorMap:Ljava/util/HashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-void
.end method

.method private replaceTileWithItemId(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 4

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    .line 1145
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 1146
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 1147
    iget-object v2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v2, p1}, Lcom/shopkick/app/util/TileUtils;->isTileItemIdEqual(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    if-ne v2, v3, :cond_1

    .line 1148
    iget-object p1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    iput-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    .line 1149
    iget-object p1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p1, v0, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1150
    invoke-virtual {p0, v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notifyItemChanged(I)V

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void

    :cond_3
    :goto_2
    return-void
.end method


# virtual methods
.method public addLoadingTile()V
    .locals 2

    .line 1020
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/4 v1, -0x1

    .line 1021
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 1022
    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1023
    invoke-virtual {p0, v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addTiles(Ljava/util/List;)V

    return-void
.end method

.method protected addNoContentTile(Ljava/lang/String;)V
    .locals 3

    .line 1280
    invoke-virtual {p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->removeLoadingTiles()V

    .line 1281
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_0

    if-ltz v0, :cond_1

    .line 1282
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x3ed

    if-eq v1, v2, :cond_1

    .line 1283
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-static {p1}, Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator;->getNoContentTile(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    .line 1284
    invoke-virtual {p0, v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notifyItemInserted(I)V

    :cond_1
    return-void
.end method

.method public addOfflineEducationTile()V
    .locals 3

    .line 1245
    invoke-virtual {p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->removeLoadingTiles()V

    .line 1247
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0x3f6

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    iget v2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->offlineEducationTilePosition:I

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v1, :cond_0

    return-void

    .line 1251
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 1252
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 1253
    iget v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->offlineEducationTilePosition:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    .line 1254
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    iget v2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->offlineEducationTilePosition:I

    invoke-virtual {v1, v2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1255
    iget v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->offlineEducationTilePosition:I

    invoke-virtual {p0, v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notifyItemInserted(I)V

    return-void
.end method

.method public addReloadTile()V
    .locals 3

    .line 1260
    invoke-virtual {p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->removeLoadingTiles()V

    .line 1261
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, -0x2

    if-ltz v0, :cond_0

    if-ltz v0, :cond_1

    .line 1265
    iget-object v2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-eq v2, v1, :cond_1

    .line 1266
    :cond_0
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 1267
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 1268
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    .line 1269
    invoke-virtual {p0, v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notifyItemInserted(I)V

    .line 1272
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    if-eqz v0, :cond_1

    .line 1274
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->disableScreenResponsivenessLogging()V

    :cond_1
    return-void
.end method

.method public addSupportedTileType(ILcom/shopkick/app/application/ScreenGlobals;)V
    .locals 3

    .line 384
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    if-nez v0, :cond_0

    return-void

    .line 387
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->supportedTileTypes:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 388
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->configuratorMap:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 389
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-direct {p0, p2, v1, p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getConfiguratorForType(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/url/URLDispatcher;I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 393
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->userEventCoordinators:Ljava/util/ArrayList;

    if-eqz v1, :cond_1

    .line 394
    invoke-virtual {p2, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->setUserEventCoordinators(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 396
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->userEventRecyclerViewCoordinator:Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;

    invoke-virtual {p2, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->setUserEventCoordinator(Lcom/shopkick/app/logging/IUserEventCoordinator;)V

    .line 398
    :goto_0
    iget-object v0, v0, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->setUserEventLogger(Lcom/shopkick/app/logging/UserEventLogger;)V

    .line 399
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->configuratorMap:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public addTiles(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;)V"
        }
    .end annotation

    .line 1033
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addTilesAtPosition(Ljava/util/List;I)V

    return-void
.end method

.method public addTilesAtPosition(Ljava/util/List;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;I)V"
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 1037
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1041
    :cond_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->filterTileList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 1042
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, p2, p1}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    .line 1043
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->dividerItemDecorationRule:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterItemDecorationRule;

    if-eqz v0, :cond_1

    .line 1044
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-interface {v0, p0, v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterItemDecorationRule;->setDecorationRule(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;Ljava/util/ArrayList;)V

    .line 1046
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {p0, p2, p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notifyItemRangeInserted(II)V

    .line 1047
    iget-object p1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, p2

    invoke-virtual {p0, p2, p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notifyItemRangeChanged(II)V

    return-void

    :cond_2
    :goto_0
    return-void
.end method

.method public addTilesWithLoading(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 1009
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1013
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/4 v1, -0x1

    .line 1014
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 1015
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1016
    invoke-virtual {p0, p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addTiles(Ljava/util/List;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method protected cancelCurrentRequest()V
    .locals 2

    .line 333
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-eqz v0, :cond_0

    .line 334
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    const/4 v0, 0x0

    .line 335
    iput-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    :cond_0
    const/4 v0, 0x0

    .line 337
    invoke-virtual {p0, v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->setIsAutoFetch(Z)V

    return-void
.end method

.method public cancelImageLoadingForViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 2

    .line 1494
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result v0

    if-ltz v0, :cond_0

    .line 1495
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 1496
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->configuratorMap:Ljava/util/HashMap;

    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;->getItemViewType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    if-eqz v0, :cond_0

    .line 1499
    :try_start_0
    check-cast p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->cancelImageLoadingForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public clear()V
    .locals 3

    .line 341
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/url/URLDispatcher;->getActiveAsyncHandler()Lcom/shopkick/app/url/URLHandler;

    move-result-object v0

    instance-of v0, v0, Lcom/shopkick/app/urlhandlers/ScreenHandler;

    if-eqz v0, :cond_0

    .line 344
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {v0}, Lcom/shopkick/app/url/URLDispatcher;->getActiveAsyncHandler()Lcom/shopkick/app/url/URLHandler;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/url/URLDispatcher;->handlerDidFinish(Lcom/shopkick/app/url/URLHandler;)V

    .line 347
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->cancelCurrentRequest()V

    const/4 v0, 0x0

    .line 349
    iput-boolean v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->shouldSavePageResponse:Z

    const/4 v1, 0x0

    .line 350
    iput-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->savedPageResponse:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    .line 352
    iget-object v2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 353
    invoke-virtual {p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notifyDataSetChanged()V

    .line 355
    iput-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->nextPageKey:Ljava/lang/String;

    .line 357
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/screens/AppScreen;

    .line 358
    invoke-virtual {p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->shouldEnableDynamicContentLogging()Z

    move-result v2

    if-eqz v2, :cond_1

    if-eqz v1, :cond_1

    .line 359
    iput-boolean v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->recordedContentPerformance:Z

    .line 360
    sget-object v0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->DYNAMIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/screens/AppScreen;->addResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    :cond_1
    return-void
.end method

.method public clearWidgets()V
    .locals 3

    .line 366
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 367
    iget-object v2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    invoke-virtual {v2, v1}, Lcom/shopkick/app/widget/WidgetDataSource;->flush(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 2

    .line 1373
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->callbackWeakReference:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    return-void

    .line 1376
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;

    if-nez v0, :cond_1

    return-void

    .line 1382
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->removeLoadingTiles()V

    .line 1384
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-ne p1, v1, :cond_3

    const/4 v1, 0x0

    .line 1385
    iput-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 1386
    invoke-interface {v0, p1, p2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;->processResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    move-result-object p1

    .line 1387
    iget-boolean p2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->shouldSavePageResponse:Z

    if-eqz p2, :cond_2

    .line 1388
    iput-object p1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->savedPageResponse:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    goto :goto_0

    .line 1390
    :cond_2
    invoke-direct {p0, p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->handlePageResponse(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public containsTileOfType(I)Z
    .locals 2

    .line 1760
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 1761
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public destroy()V
    .locals 3

    .line 300
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->recyclerViewImageController:Lcom/shopkick/app/controllers/RecyclerViewImageController;

    invoke-virtual {v0}, Lcom/shopkick/app/controllers/RecyclerViewImageController;->destroy()V

    .line 301
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 302
    iget-object v2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v2, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 303
    iput-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 305
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-virtual {v0}, Lcom/shopkick/app/account/AgeVerificationController;->destroy()V

    .line 306
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ListAddController;->destroy()V

    .line 307
    iput-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->callbackWeakReference:Ljava/lang/ref/WeakReference;

    .line 308
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    return-void
.end method

.method public fetchNextPage()V
    .locals 1

    const/4 v0, 0x0

    .line 1332
    invoke-virtual {p0, v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->fetchNextPage(Z)V

    return-void
.end method

.method public fetchNextPage(Z)V
    .locals 8

    .line 1336
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->callbackWeakReference:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    return-void

    .line 1339
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;

    if-nez v0, :cond_1

    return-void

    .line 1343
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-eqz v1, :cond_2

    return-void

    .line 1346
    :cond_2
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->savedPageResponse:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    if-eqz v1, :cond_3

    return-void

    .line 1349
    :cond_3
    invoke-virtual {p0, p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->setIsAutoFetch(Z)V

    .line 1350
    iget-object p1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->nextPageKey:Ljava/lang/String;

    invoke-interface {v0, p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;->getPageRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 1351
    iget-object p1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-eqz p1, :cond_4

    .line 1355
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v1, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    iget-object v2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    const/4 v4, 0x1

    sget-object v5, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v6, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v7, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v3, p0

    invoke-virtual/range {v0 .. v7}, Lcom/shopkick/fetchers/api/APIManager;->fetch(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_4
    return-void
.end method

.method public getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
    .locals 1

    .line 991
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->configuratorMap:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    return-object p1
.end method

.method public getDividerItemDecoration()Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;
    .locals 1

    .line 979
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->dividerItemDecoration:Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;

    return-object v0
.end method

.method protected getIsAutoFetch()Z
    .locals 1

    .line 1324
    iget-boolean v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->isAutoFetch:Z

    return v0
.end method

.method public getItem(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 1

    .line 1431
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    .line 1467
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 1436
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public getListAddController()Lcom/shopkick/app/shoppinglists/ListAddController;
    .locals 1

    .line 379
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    return-object v0
.end method

.method protected getPositionIgnoredTileTypes()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1110
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Integer;

    const/16 v2, 0x3e7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/16 v2, 0x403

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getRecyclerViewImageController()Lcom/shopkick/app/controllers/RecyclerViewImageController;
    .locals 1

    .line 285
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->recyclerViewImageController:Lcom/shopkick/app/controllers/RecyclerViewImageController;

    return-object v0
.end method

.method public getUserEventRecyclerViewCoordinator()Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;
    .locals 1

    .line 296
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->userEventRecyclerViewCoordinator:Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;

    return-object v0
.end method

.method public invalidatePendingScanTile()V
    .locals 4

    const/4 v0, 0x0

    .line 1193
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 1194
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 1195
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x17

    if-ne v2, v3, :cond_0

    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    .line 1196
    invoke-virtual {v2, v1}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->isPending(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1197
    invoke-virtual {p0, v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notifyItemChanged(I)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public invalidateTilesOfType(I)V
    .locals 2

    const/4 v0, 0x0

    .line 1185
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 1186
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, p1, :cond_0

    .line 1187
    invoke-virtual {p0, v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notifyItemChanged(I)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public invalidateTilesWithCacheKey(Ljava/lang/String;ZZ)V
    .locals 6

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 1170
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 1171
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    if-eqz p2, :cond_2

    .line 1172
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->globalSaveCount:Ljava/lang/Long;

    if-eqz v1, :cond_2

    const-wide/16 v1, 0x1

    if-eqz p3, :cond_1

    .line 1174
    iget-object v3, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->globalSaveCount:Ljava/lang/Long;

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->globalSaveCount:Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    add-long/2addr v4, v1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->globalSaveCount:Ljava/lang/Long;

    goto :goto_1

    .line 1176
    :cond_1
    iget-object v3, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->globalSaveCount:Ljava/lang/Long;

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->globalSaveCount:Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    sub-long/2addr v4, v1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->globalSaveCount:Ljava/lang/Long;

    .line 1179
    :cond_2
    :goto_1
    invoke-virtual {p0, v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notifyItemChanged(I)V

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public isEmpty()Z
    .locals 1

    .line 1005
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    return v0
.end method

.method protected isFetching()Z
    .locals 1

    .line 329
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public loadImagesForViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;Z)V
    .locals 3

    .line 1477
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result v0

    if-ltz v0, :cond_0

    .line 1478
    invoke-virtual {p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getItemCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 1479
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->configuratorMap:Ljava/util/HashMap;

    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;->getItemViewType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    if-eqz v1, :cond_0

    .line 1482
    :try_start_0
    check-cast p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getItem(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    invoke-virtual {v1, p1, v0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public maybeAddLoadingTile()V
    .locals 1

    .line 1027
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->nextPageKey:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1028
    invoke-virtual {p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addLoadingTile()V

    :cond_0
    return-void
.end method

.method public maybeHandleSavedPageResponse()V
    .locals 1

    .line 1237
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->savedPageResponse:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    if-eqz v0, :cond_0

    .line 1238
    invoke-direct {p0, v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->handlePageResponse(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;)V

    :cond_0
    const/4 v0, 0x0

    .line 1240
    iput-boolean v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->shouldSavePageResponse:Z

    const/4 v0, 0x0

    .line 1241
    iput-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->savedPageResponse:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 100
    check-cast p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V
    .locals 3

    .line 1446
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getItemViewType()I

    move-result v0

    .line 1447
    invoke-virtual {p0, p2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getItem(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p2

    .line 1448
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->setTileInfo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 1449
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->configuratorMap:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    .line 1450
    invoke-virtual {v1, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 1451
    iget-object p2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->recyclerViewImageController:Lcom/shopkick/app/controllers/RecyclerViewImageController;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/controllers/RecyclerViewImageController;->fetchImages(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V

    .line 1453
    iget-object p2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/screens/AppScreen;

    .line 1454
    invoke-virtual {p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->shouldEnableDynamicContentLogging()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz p2, :cond_0

    iget-boolean v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->recordedContentPerformance:Z

    if-nez v1, :cond_0

    invoke-direct {p0, v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->isContentRow(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1456
    sget-object v0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->DYNAMIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/screens/AppScreen;->removeResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    const/4 p2, 0x1

    .line 1457
    iput-boolean p2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->recordedContentPerformance:Z

    .line 1460
    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getItemViewType()I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    const/4 p1, 0x0

    .line 1461
    invoke-virtual {p0, p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->fetchNextPage(Z)V

    :cond_1
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 100
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;
    .locals 1

    .line 1441
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->configuratorMap:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->onCreateViewHolder(Landroid/view/ViewGroup;)Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 7
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

    .line 1530
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "eventShoppingListEntryCompletionToggled"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0xd

    goto/16 :goto_1

    :sswitch_1
    const-string/jumbo v0, "storyCardSavedStateUpdated"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto/16 :goto_1

    :sswitch_2
    const-string v0, "productSavedStateUpdated"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v1

    goto/16 :goto_1

    :sswitch_3
    const-string v0, "eventOnlineOfferClickSucceeded"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x12

    goto/16 :goto_1

    :sswitch_4
    const-string v0, "ScanBCSucceeded"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v2

    goto/16 :goto_1

    :sswitch_5
    const-string/jumbo v0, "storiesSaveFailedEvent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x6

    goto/16 :goto_1

    :sswitch_6
    const-string v0, "instantBonusAwardedEvent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x7

    goto/16 :goto_1

    :sswitch_7
    const-string/jumbo v0, "story_read_state_updated"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x5

    goto/16 :goto_1

    :sswitch_8
    const-string v0, "EventVideoAwardRequestStart"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x9

    goto/16 :goto_1

    :sswitch_9
    const-string v0, "EventAllVideoCompleted"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x14

    goto/16 :goto_1

    :sswitch_a
    const-string/jumbo v0, "storiesSaveDoneEvent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto/16 :goto_1

    :sswitch_b
    const-string v0, "eventTaxonomyLoaded"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0xb

    goto/16 :goto_1

    :sswitch_c
    const-string v0, "EVENT_LIST_ADD_CONTROLLER_ITEM_ADDED"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0xe

    goto :goto_1

    :sswitch_d
    const-string v0, "eventShoppingListInvalidated"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0xc

    goto :goto_1

    :sswitch_e
    const-string/jumbo v0, "tabChangedEvent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0xf

    goto :goto_1

    :sswitch_f
    const-string v0, "EventModuleRequestFailed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x11

    goto :goto_1

    :sswitch_10
    const-string v0, "eventPostScanNotificationUpdated"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x13

    goto :goto_1

    :sswitch_11
    const-string v0, "instantBonusFailed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x8

    goto :goto_1

    :sswitch_12
    const-string v0, "EventModuleRequestSuccess"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x10

    goto :goto_1

    :sswitch_13
    const-string v0, "EventVideoAwardRequestCompleted"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0xa

    goto :goto_1

    :sswitch_14
    const-string/jumbo v0, "storiesSavedStateUpdated"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    goto :goto_1

    :cond_0
    :goto_0
    const/4 p1, -0x1

    :goto_1
    const v0, 0x7f11044a

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_6

    :pswitch_0
    const-string p1, "ParamWidgetId"

    .line 1713
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_1

    goto/16 :goto_6

    .line 1715
    :cond_1
    iget-object p2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 1716
    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x54

    if-ne v2, v3, :cond_2

    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetId:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1717
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoCompleted:Ljava/lang/Boolean;

    .line 1718
    iget-object p1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notifyItemChanged(I)V

    goto/16 :goto_6

    :pswitch_1
    const/16 p1, 0x415

    .line 1710
    invoke-virtual {p0, p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->invalidateTilesOfType(I)V

    goto/16 :goto_6

    :pswitch_2
    const/16 p1, 0xfa5

    .line 1705
    invoke-virtual {p0, p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->invalidateTilesOfType(I)V

    const/16 p1, 0xfae

    .line 1706
    invoke-virtual {p0, p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->invalidateTilesOfType(I)V

    const/16 p1, -0x39

    .line 1707
    invoke-virtual {p0, p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->invalidateTilesOfType(I)V

    goto/16 :goto_6

    :pswitch_3
    const-string p1, "ParamModuleRequestWidgetTypes"

    .line 1695
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/HashSet;

    if-eqz p1, :cond_10

    .line 1697
    :goto_2
    iget-object p2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ge v2, p2, :cond_10

    .line 1698
    iget-object p2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {p1, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 1699
    invoke-virtual {p0, v2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notifyItemChanged(I)V

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 1690
    :pswitch_4
    invoke-virtual {p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->resetListAddController()V

    goto/16 :goto_6

    :pswitch_5
    const-string p1, "PARAM_LIST_ADD_CONTROLLER_ADDED_ITEM_ID"

    .line 1683
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_10

    .line 1685
    invoke-direct {p0, p1, v2, v2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->invalidateTilesWithItemId(Ljava/lang/String;ZZ)V

    goto/16 :goto_6

    :pswitch_6
    const-string p1, "paramShoppingListEntryId"

    .line 1677
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_10

    .line 1679
    invoke-direct {p0, p1, v2, v2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->invalidateTilesWithItemId(Ljava/lang/String;ZZ)V

    goto/16 :goto_6

    :pswitch_7
    const-string p1, "paramTaxonomyNode"

    .line 1663
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;

    if-eqz p1, :cond_10

    .line 1665
    :goto_3
    iget-object p2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ge v2, p2, :cond_10

    .line 1666
    iget-object p2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 1668
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;->taxonomyNodeId:Ljava/lang/String;

    invoke-static {p2, v0}, Lcom/shopkick/app/util/TileUtils;->isTileItemIdEqual(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1669
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;->name:Ljava/lang/String;

    iput-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    .line 1670
    invoke-virtual {p0, v2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notifyItemChanged(I)V

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 1653
    :pswitch_8
    iget-object p1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/screens/AppScreen;

    if-nez p1, :cond_5

    goto/16 :goto_6

    .line 1657
    :cond_5
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->isTopScreen()Z

    move-result p1

    if-eqz p1, :cond_10

    const-string p1, "ParamVideoId"

    .line 1658
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 1659
    invoke-direct {p0, p1, v2, v2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->invalidateTilesWithItemId(Ljava/lang/String;ZZ)V

    goto/16 :goto_6

    :pswitch_9
    const-string p1, "instantBonusId"

    .line 1629
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1, v2, v2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->invalidateTilesWithItemId(Ljava/lang/String;ZZ)V

    .line 1630
    iget-object p1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/screens/AppScreen;

    if-nez p1, :cond_6

    goto/16 :goto_6

    .line 1634
    :cond_6
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->isTopScreen()Z

    move-result p1

    if-eqz p1, :cond_10

    const-string p1, "instantBonusErrorMessageKey"

    .line 1635
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_7

    .line 1637
    iget-object p2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto/16 :goto_6

    .line 1639
    :cond_7
    iget-object p1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    .line 1640
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v1, 0x0

    iget-object p1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    .line 1641
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/screens/AppScreen;

    const p2, 0x7f110155

    invoke-virtual {p1, p2}, Lcom/shopkick/app/screens/AppScreen;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object p1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    .line 1642
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/screens/AppScreen;

    const p2, 0x7f110142

    invoke-virtual {p1, p2}, Lcom/shopkick/app/screens/AppScreen;->getString(I)Ljava/lang/String;

    move-result-object v3

    iget-object p1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    .line 1643
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/screens/AppScreen;

    const p2, 0x7f11014f

    invoke-virtual {p1, p2}, Lcom/shopkick/app/screens/AppScreen;->getString(I)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/shopkick/app/feed/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;->INSTANCE:Lcom/shopkick/app/feed/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;

    const/4 v6, 0x0

    .line 1640
    invoke-virtual/range {v0 .. v6}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogAcknowledge(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto/16 :goto_6

    :pswitch_a
    const-string p1, "instantBonusId"

    .line 1623
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string v0, "instantBonusLargeKey"

    .line 1624
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 1623
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->replaceTileWithItemId(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    const-string p1, "instantBonusId"

    .line 1625
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string v0, "instantBonusSmallKey"

    .line 1626
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 1625
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->replaceTileWithItemId(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    goto/16 :goto_6

    .line 1611
    :pswitch_b
    iget-object p1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/screens/AppScreen;

    if-nez p1, :cond_8

    goto/16 :goto_6

    .line 1615
    :cond_8
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->isTopScreen()Z

    move-result p1

    if-eqz p1, :cond_9

    .line 1616
    iget-object p1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/screens/AppScreen;

    .line 1617
    invoke-virtual {v1}, Lcom/shopkick/app/screens/AppScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 1618
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 1616
    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    :cond_9
    const-string/jumbo p1, "updateStoryKey"

    .line 1620
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, v2, v2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->invalidateTilesWithCacheKey(Ljava/lang/String;ZZ)V

    goto/16 :goto_6

    :pswitch_c
    const-string/jumbo p1, "updateStoryKey"

    .line 1608
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, v2, v2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->invalidateTilesWithCacheKey(Ljava/lang/String;ZZ)V

    goto/16 :goto_6

    .line 1592
    :pswitch_d
    iget-object p1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/screens/AppScreen;

    if-nez p1, :cond_a

    goto/16 :goto_6

    :cond_a
    const-string v2, "itemIdKey"

    .line 1596
    invoke-virtual {p2, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "itemSaveStateKey"

    .line 1598
    invoke-virtual {p2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    .line 1596
    invoke-virtual {p0, v2, v1, v3}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->invalidateTilesWithCacheKey(Ljava/lang/String;ZZ)V

    const-string v1, "itemSaveStateUpdatedDueToFailure"

    .line 1599
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_10

    .line 1600
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->isTopScreen()Z

    move-result p1

    if-eqz p1, :cond_10

    .line 1601
    iget-object p1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object p2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/screens/AppScreen;

    .line 1602
    invoke-virtual {p2}, Lcom/shopkick/app/screens/AppScreen;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    .line 1603
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 1601
    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto/16 :goto_6

    .line 1577
    :pswitch_e
    iget-object p1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/screens/AppScreen;

    if-nez p1, :cond_b

    goto/16 :goto_6

    :cond_b
    const-string v0, "itemIdKey"

    .line 1581
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v2, "itemSaveStateKey"

    .line 1583
    invoke-virtual {p2, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    .line 1581
    invoke-direct {p0, v0, v1, v2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->invalidateTilesWithItemId(Ljava/lang/String;ZZ)V

    const-string v0, "itemSaveStateUpdatedDueToFailure"

    .line 1584
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_10

    .line 1585
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->isTopScreen()Z

    move-result p1

    if-eqz p1, :cond_10

    .line 1586
    iget-object p1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object p2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/screens/AppScreen;

    .line 1587
    invoke-virtual {p2}, Lcom/shopkick/app/screens/AppScreen;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f110151

    .line 1588
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 1586
    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto/16 :goto_6

    :pswitch_f
    const-string p1, "scanTileInfo"

    .line 1532
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-nez p1, :cond_c

    return-void

    .line 1536
    :cond_c
    iget p2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->scrollOrientation:I

    const/16 v0, 0x17

    if-nez p2, :cond_e

    .line 1538
    :try_start_0
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->toJsonTree()Lcom/google/gson/JsonObject;

    move-result-object p2

    .line 1539
    :goto_4
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v2, v1, :cond_10

    .line 1540
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 1541
    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v3, v0, :cond_d

    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    if-eqz v3, :cond_d

    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    iget-object v4, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    .line 1542
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    .line 1543
    iget-object p1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetType:Ljava/lang/Integer;

    .line 1547
    invoke-static {v1, p2}, Lcom/shopkick/app/util/GsonUtils;->merge(Ljava/lang/Object;Lcom/google/gson/JsonObject;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 1548
    invoke-direct {p0, p2, v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->copyFields(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 1549
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 1550
    iput-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetType:Ljava/lang/Integer;

    .line 1551
    invoke-virtual {p0, v2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notifyItemChanged(I)V
    :try_end_0
    .catch Lcom/shopkick/app/util/GsonUtils$JsonObjectExtensionConflictException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_6

    :cond_d
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 1559
    :cond_e
    :goto_5
    iget-object p2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ge v2, p2, :cond_10

    .line 1560
    iget-object p2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 1561
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v0, :cond_f

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    if-eqz v1, :cond_f

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    .line 1562
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    .line 1563
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    iput-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 1564
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetType:Ljava/lang/Integer;

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetType:Ljava/lang/Integer;

    .line 1565
    iget-object p2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p2, v2, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1567
    invoke-virtual {p0, v2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notifyItemChanged(I)V

    :cond_f
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :catch_0
    :cond_10
    :goto_6
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x71480102 -> :sswitch_14
        -0x6bae06a8 -> :sswitch_13
        -0x6b4bce66 -> :sswitch_12
        -0x5edd7765 -> :sswitch_11
        -0x5978c027 -> :sswitch_10
        -0x4c486c3a -> :sswitch_f
        -0x46a8f385 -> :sswitch_e
        -0x364a1f77 -> :sswitch_d
        -0x2eb25a03 -> :sswitch_c
        -0x1da98810 -> :sswitch_b
        -0x11e2d658 -> :sswitch_a
        -0xa840b49 -> :sswitch_9
        0xa6955ef -> :sswitch_8
        0xb224fae -> :sswitch_7
        0xeadca1c -> :sswitch_6
        0x176159cd -> :sswitch_5
        0x2ae28463 -> :sswitch_4
        0x556e6c68 -> :sswitch_3
        0x5ac5dde2 -> :sswitch_2
        0x660207ec -> :sswitch_1
        0x757353c2 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onReloadClicked()V
    .locals 3

    .line 1514
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-gez v0, :cond_0

    return-void

    .line 1518
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    const/4 v2, -0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 1519
    invoke-virtual {p0, v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notifyItemChanged(I)V

    const/4 v0, 0x0

    .line 1521
    invoke-virtual {p0, v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->fetchNextPage(Z)V

    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public registerImageController(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V
    .locals 1

    .line 325
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->recyclerViewImageController:Lcom/shopkick/app/controllers/RecyclerViewImageController;

    invoke-virtual {v0, p0, p1}, Lcom/shopkick/app/controllers/RecyclerViewImageController;->register(Lcom/shopkick/app/controllers/IRecyclerViewImageControllerCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V

    return-void
.end method

.method public removeDefaultItemDecoration()V
    .locals 2

    .line 372
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->recyclerViewWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    .line 374
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->dividerItemDecoration:Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->removeItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    :cond_0
    return-void
.end method

.method public removeLoadingTiles()V
    .locals 3

    .line 1102
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_0

    .line 1103
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    .line 1104
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1105
    invoke-virtual {p0, v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notifyItemRemoved(I)V

    :cond_0
    return-void
.end method

.method public removeTilesAtPosition(II)V
    .locals 1

    if-ltz p1, :cond_1

    if-ltz p2, :cond_1

    .line 1090
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gt v0, p1, :cond_0

    goto :goto_0

    .line 1094
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/2addr p2, p1

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 1095
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    sub-int/2addr p2, p1

    .line 1097
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notifyItemRangeRemoved(II)V

    .line 1098
    iget-object p2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    sub-int/2addr p2, p1

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notifyItemRangeChanged(II)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public replaceTileWithCacheKey(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 3

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    .line 1130
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 1131
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 1132
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    if-eqz v2, :cond_1

    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1133
    iget-object p1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    iput-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    .line 1134
    iget-object p1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p1, v0, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1135
    invoke-virtual {p0, v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notifyItemChanged(I)V

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void

    :cond_3
    :goto_2
    return-void
.end method

.method public resetListAddController()V
    .locals 1

    .line 320
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ListAddController;->clear()V

    .line 321
    invoke-virtual {p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public scrollToTop()V
    .locals 2

    .line 289
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->recyclerViewWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 291
    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->scrollToPosition(I)V

    :cond_0
    return-void
.end method

.method public seenTileOfType(I)Z
    .locals 2

    .line 1118
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 1119
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public setDividerItemDecorationRule(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterItemDecorationRule;)V
    .locals 0

    .line 983
    iput-object p1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->dividerItemDecorationRule:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterItemDecorationRule;

    return-void
.end method

.method protected setIsAutoFetch(Z)V
    .locals 0

    .line 1328
    iput-boolean p1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->isAutoFetch:Z

    return-void
.end method

.method public setOfflineEducationTilePosition(I)V
    .locals 0

    .line 987
    iput p1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->offlineEducationTilePosition:I

    return-void
.end method

.method public setShouldSavePageResponse(Z)V
    .locals 0

    .line 1233
    iput-boolean p1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->shouldSavePageResponse:Z

    return-void
.end method

.method public shouldEnableDynamicContentLogging()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public tryRefreshWithoutClear()V
    .locals 9

    .line 1296
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->callbackWeakReference:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    return-void

    .line 1299
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;

    if-nez v0, :cond_1

    return-void

    .line 1303
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 1304
    iget-object v3, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v3, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 1305
    iput-object v2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 1308
    :cond_2
    invoke-interface {v0, v2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;->getPageRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 1309
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-eqz v0, :cond_3

    .line 1313
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v2, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    iget-object v3, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    const/4 v5, 0x1

    sget-object v6, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v7, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v8, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v4, p0

    invoke-virtual/range {v1 .. v8}, Lcom/shopkick/fetchers/api/APIManager;->fetch(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_3
    return-void
.end method

.method public tryRemovingDynamicContentConstraint()V
    .locals 2

    .line 997
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    .line 998
    invoke-virtual {p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->shouldEnableDynamicContentLogging()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->recordedContentPerformance:Z

    if-nez v1, :cond_0

    .line 999
    sget-object v1, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->DYNAMIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/screens/AppScreen;->removeResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    const/4 v0, 0x1

    .line 1000
    iput-boolean v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->recordedContentPerformance:Z

    :cond_0
    return-void
.end method

.method public unregisterImageController()V
    .locals 2

    .line 312
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->recyclerViewImageController:Lcom/shopkick/app/controllers/RecyclerViewImageController;

    invoke-virtual {v0}, Lcom/shopkick/app/controllers/RecyclerViewImageController;->unregister()V

    .line 313
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-eqz v0, :cond_0

    .line 314
    iget-object v1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    const/4 v0, 0x0

    .line 315
    iput-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    :cond_0
    return-void
.end method

.method public updateTilesWithDiffCallback(Ljava/util/List;Lcom/shopkick/app/feed/FeedRecyclerViewAdapterDiffCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;",
            "Lcom/shopkick/app/feed/FeedRecyclerViewAdapterDiffCallback;",
            ")V"
        }
    .end annotation

    .line 1051
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->filterTileList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapterDiffCallback;->setLists(Ljava/util/List;Ljava/util/List;)V

    .line 1052
    invoke-static {p2}, Landroid/support/v7/util/DiffUtil;->calculateDiff(Landroid/support/v7/util/DiffUtil$Callback;)Landroid/support/v7/util/DiffUtil$DiffResult;

    move-result-object p2

    .line 1054
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1055
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1056
    invoke-virtual {p2, p0}, Landroid/support/v7/util/DiffUtil$DiffResult;->dispatchUpdatesTo(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    return-void
.end method
