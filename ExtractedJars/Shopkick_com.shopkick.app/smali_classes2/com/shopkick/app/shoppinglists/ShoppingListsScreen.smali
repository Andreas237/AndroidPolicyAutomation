.class public Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;
.super Lcom/shopkick/app/tabs/TabScreen;
.source "ShoppingListsScreen.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# static fields
.field public static final ANIMATION_DURATION:I = 0x12c

.field public static final FOOTER_HEIGHT_DP:I = 0xa


# instance fields
.field private adapter:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private converter:Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;

.field private headerAnim:Landroid/animation/ValueAnimator;

.field private isHeaderShown:Z

.field private mainView:Landroid/view/View;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

.field private recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

.field private screenLoadingSpinner:Landroid/widget/ProgressBar;

.field private selectedShoppingListId:Ljava/lang/String;

.field private shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

.field private shoppingListSyncAlertController:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

.field private shouldRefresh:Z

.field private slEntryPickerController:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

.field private slFirstUseAnimationController:Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;

.field private slListsDropdownController:Lcom/shopkick/app/shoppinglists/SLListDropdownController;

.field private slPopularItemsController:Lcom/shopkick/app/shoppinglists/SLPopularItemsController;

.field private slSearchDummyController:Lcom/shopkick/app/shoppinglists/SLSearchDummyController;

.field private tabLayout:Landroid/view/View;

.field private tabLayoutHeight:I

.field private taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

.field private toolbar:Landroid/view/View;

.field private toolbarHeight:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 51
    invoke-direct {p0}, Lcom/shopkick/app/tabs/TabScreen;-><init>()V

    const/4 v0, 0x1

    .line 84
    iput-boolean v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->isHeaderShown:Z

    const/high16 v0, -0x80000000

    .line 85
    iput v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->tabLayoutHeight:I

    .line 86
    iput v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->toolbarHeight:I

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;Ljava/lang/String;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->setSelectedShoppingListId(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->updateList()V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;)Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;
    .locals 0

    .line 51
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->adapter:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;)Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;
    .locals 0

    .line 51
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->slFirstUseAnimationController:Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;)Landroid/view/View;
    .locals 0

    .line 51
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->tabLayout:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;)I
    .locals 0

    .line 51
    iget p0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->tabLayoutHeight:I

    return p0
.end method

.method static synthetic access$600(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;)Landroid/view/View;
    .locals 0

    .line 51
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->toolbar:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$700(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;)I
    .locals 0

    .line 51
    iget p0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->toolbarHeight:I

    return p0
.end method

.method static synthetic access$802(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;Landroid/animation/ValueAnimator;)Landroid/animation/ValueAnimator;
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->headerAnim:Landroid/animation/ValueAnimator;

    return-object p1
.end method

.method public static synthetic lambda$createTabScreen$225(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;Landroid/view/View;)V
    .locals 2

    .line 124
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-static {p1, v0}, Lcom/shopkick/app/shoppinglists/SLUtils;->isNewModificationCreatable(Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 125
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->slEntryPickerController:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->showPicker(Z)V

    .line 128
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0xd9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 129
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method private maybeShowPopularItems()V
    .locals 1

    .line 445
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSelectedShoppingList()Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 447
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 448
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->slPopularItemsController:Lcom/shopkick/app/shoppinglists/SLPopularItemsController;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->initPopularItems()V

    .line 449
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->slPopularItemsController:Lcom/shopkick/app/shoppinglists/SLPopularItemsController;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->showPopularItems()V

    goto :goto_0

    .line 451
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->slPopularItemsController:Lcom/shopkick/app/shoppinglists/SLPopularItemsController;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->hidePopularItems()V

    :goto_0
    return-void
.end method

.method private setSelectedShoppingListId(Ljava/lang/String;)V
    .locals 1

    .line 405
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->selectedShoppingListId:Ljava/lang/String;

    .line 406
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->adapter:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->setShoppingListId(Ljava/lang/String;)V

    .line 407
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->setSelectedShoppingListId(Ljava/lang/String;)V

    return-void
.end method

.method private setupForRecyclerView()V
    .locals 11

    .line 231
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->adapter:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    if-eqz v0, :cond_0

    return-void

    .line 234
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v1, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;

    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 235
    new-instance v8, Ljava/util/HashSet;

    const/16 v0, 0x9

    new-array v0, v0, [Ljava/lang/Integer;

    const/16 v1, 0x3ed

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    const/16 v3, 0x3f7

    .line 236
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v1

    const/4 v1, 0x2

    const/16 v3, 0x3f8

    .line 237
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v1

    const/4 v1, 0x3

    const/16 v3, 0x3fa

    .line 238
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v1

    const/4 v1, 0x4

    const/16 v3, 0x3f9

    .line 239
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v1

    const/4 v1, 0x5

    const/16 v3, 0x403

    .line 240
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v1

    const/4 v1, 0x6

    const/4 v3, -0x1

    .line 241
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v1

    const/4 v1, 0x7

    const/4 v3, -0x2

    .line 242
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v1

    const/16 v1, 0x8

    const/16 v3, -0xd

    .line 243
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v1

    .line 235
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v8, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 245
    new-instance v0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    iget-object v4, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    const/4 v6, 0x0

    iget-object v7, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const/4 v9, 0x0

    iget-object v10, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->converter:Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;

    move-object v3, v0

    move-object v5, p0

    invoke-direct/range {v3 .. v10}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;)V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->adapter:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    .line 252
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->adapter:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->removeDefaultItemDecoration()V

    .line 253
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->adapter:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    const/16 v1, 0x32

    const/16 v3, 0xa

    invoke-virtual {v0, v1, v3}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->setPadding(II)V

    .line 255
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->adapter:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 256
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setVisibility(I)V

    return-void
.end method

.method private updateList()V
    .locals 2

    .line 412
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->isActiveScreen()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 413
    iput-boolean v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->shouldRefresh:Z

    return-void

    .line 417
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 420
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->slListsDropdownController:Lcom/shopkick/app/shoppinglists/SLListDropdownController;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->isShown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 421
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->slListsDropdownController:Lcom/shopkick/app/shoppinglists/SLListDropdownController;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->hideDropdown()V

    .line 424
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSelectedShoppingList()Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    move-result-object v0

    if-nez v0, :cond_2

    return-void

    .line 429
    :cond_2
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->setSelectedShoppingListId(Ljava/lang/String;)V

    .line 432
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->adapter:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    invoke-virtual {v1}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->refresh()V

    .line 435
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->slEntryPickerController:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->setSelectedListInfo(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;)V

    .line 436
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->slListsDropdownController:Lcom/shopkick/app/shoppinglists/SLListDropdownController;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->setSelectedListInfo(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;)V

    .line 437
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->slPopularItemsController:Lcom/shopkick/app/shoppinglists/SLPopularItemsController;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->setSelectedListInfo(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;)V

    .line 440
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->maybeShowPopularItems()V

    return-void
.end method


# virtual methods
.method public createTabScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 20

    move-object/from16 v9, p0

    const/4 v10, 0x0

    const v0, 0x7f0c01b4

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 119
    invoke-virtual {v1, v0, v2, v10}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->mainView:Landroid/view/View;

    .line 120
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->mainView:Landroid/view/View;

    const v1, 0x7f090628

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    .line 121
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->mainView:Landroid/view/View;

    const v1, 0x7f09059a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iput-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 122
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->mainView:Landroid/view/View;

    const v1, 0x7f09063e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v15

    .line 123
    new-instance v0, Lcom/shopkick/app/shoppinglists/-$$Lambda$ShoppingListsScreen$DYHRn6zfOwzoRhllhpAsvQOlBes;

    invoke-direct {v0, v9}, Lcom/shopkick/app/shoppinglists/-$$Lambda$ShoppingListsScreen$DYHRn6zfOwzoRhllhpAsvQOlBes;-><init>(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;)V

    invoke-virtual {v15, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 132
    new-instance v0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;

    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v4, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    iget-object v1, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v5, v1, Lcom/shopkick/app/application/ScreenGlobals;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v1, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v6, v1, Lcom/shopkick/app/application/ScreenGlobals;->productsDataSource:Lcom/shopkick/app/products/ProductsDataSource;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;-><init>(Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;Lcom/shopkick/app/products/ProductsDataSource;)V

    iput-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->converter:Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;

    .line 138
    new-instance v0, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;

    iget-object v1, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-direct {v0, v1, v15}, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;-><init>(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;)V

    iput-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->slSearchDummyController:Lcom/shopkick/app/shoppinglists/SLSearchDummyController;

    .line 140
    new-instance v8, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    iget-object v2, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v3, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v4, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iget-object v5, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->mainView:Landroid/view/View;

    const v1, 0x7f090251

    .line 145
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    iget-object v7, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    move-object v0, v8

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v7}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;Landroid/view/View;Lcom/shopkick/app/logging/UserEventLogger;)V

    iput-object v8, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->slEntryPickerController:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    .line 148
    new-instance v11, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$1;

    iget-object v2, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object v3, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v4, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iget-object v5, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v6, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->mainView:Landroid/view/View;

    const v0, 0x7f090423

    .line 153
    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->mainView:Landroid/view/View;

    const v1, 0x7f0906af

    .line 154
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    move-object v0, v11

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v8}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$1;-><init>(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Lcom/shopkick/app/logging/UserEventLogger;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    iput-object v11, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->slListsDropdownController:Lcom/shopkick/app/shoppinglists/SLListDropdownController;

    .line 164
    new-instance v0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;

    iget-object v1, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iget-object v2, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->mainView:Landroid/view/View;

    iget-object v3, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;-><init>(Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Landroid/view/View;Lcom/shopkick/app/logging/UserEventLogger;)V

    iput-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->slPopularItemsController:Lcom/shopkick/app/shoppinglists/SLPopularItemsController;

    .line 166
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v10}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 167
    invoke-direct/range {p0 .. p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->setupForRecyclerView()V

    .line 170
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const v1, 0x7f090772

    invoke-virtual {v0, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->toolbar:Landroid/view/View;

    .line 171
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const v1, 0x7f0906b3

    invoke-virtual {v0, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->tabLayout:Landroid/view/View;

    .line 172
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->tabLayout:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iput v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->tabLayoutHeight:I

    .line 173
    :cond_0
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->toolbar:Landroid/view/View;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iput v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->toolbarHeight:I

    .line 176
    :cond_1
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "UserAccountIdChangedEvent"

    invoke-virtual {v0, v9, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 177
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventShoppingListStartSync"

    invoke-virtual {v0, v9, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 178
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventShoppingListReady"

    invoke-virtual {v0, v9, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 179
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventShoppingListCreated"

    invoke-virtual {v0, v9, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 180
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventShoppingListChanged"

    invoke-virtual {v0, v9, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 181
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventShoppingListCreatedFinished"

    invoke-virtual {v0, v9, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 182
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventShoppingListDeleted"

    invoke-virtual {v0, v9, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 183
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventShoppingListEntryAdded"

    invoke-virtual {v0, v9, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 184
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventShoppingListEntryDeleted"

    invoke-virtual {v0, v9, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 185
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventShoppingListEntryCompletionToggled"

    invoke-virtual {v0, v9, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 186
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventShoppingListCleared"

    invoke-virtual {v0, v9, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 187
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventTaxonomyLoaded"

    invoke-virtual {v0, v9, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 188
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo v1, "shoppingItemsUpdatedEvent"

    invoke-virtual {v0, v9, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 189
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo v1, "shoppingItemsFailedEvent"

    invoke-virtual {v0, v9, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 190
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventScanIrResponseSuccess"

    invoke-virtual {v0, v9, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 191
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "EventVideoAwardRequestCompleted"

    invoke-virtual {v0, v9, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 193
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isShoppingListEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 194
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "scansBarcodeUpdatedEvent"

    invoke-virtual {v0, v9, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 195
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "scansBarcodeUpdateFailedEvent"

    invoke-virtual {v0, v9, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 196
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "ScanBCSucceeded"

    invoke-virtual {v0, v9, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 197
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "offlineScanBarcodeReady"

    invoke-virtual {v0, v9, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 198
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "offlineScanFailed"

    invoke-virtual {v0, v9, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 199
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "offlineScanBarcodeEnqueued"

    invoke-virtual {v0, v9, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 200
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "productsUpdatedEvent"

    invoke-virtual {v0, v9, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 201
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "productUpdateFailed"

    invoke-virtual {v0, v9, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 205
    :cond_2
    new-instance v0, Lcom/shopkick/app/permissions/PermissionsRequestController;

    iget-object v1, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-direct {v0, v9, v1}, Lcom/shopkick/app/permissions/PermissionsRequestController;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/logging/UserEventLogger;)V

    iput-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    .line 206
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    iget-object v2, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->mainView:Landroid/view/View;

    const v3, 0x7f090443

    .line 207
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 206
    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/permissions/PermissionsRequestController;->requestPermission(Ljava/lang/String;Landroid/view/View;)V

    .line 209
    new-instance v0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    iget-object v1, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->mainView:Landroid/view/View;

    const v2, 0x7f090693

    .line 210
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v12

    iget-object v13, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v14, 0x0

    iget-object v1, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v2, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    const/16 v18, 0x0

    iget-object v3, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    move-object v11, v0

    move-object v4, v15

    move-object v15, v1

    move-object/from16 v16, v2

    move-object/from16 v17, v4

    move-object/from16 v19, v3

    invoke-direct/range {v11 .. v19}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;-><init>(Landroid/view/View;Lcom/shopkick/app/application/dialog/DialogsManager;ZLcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Landroid/view/View;Landroid/view/View;Lcom/shopkick/app/logging/UserEventLogger;)V

    iput-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->shoppingListSyncAlertController:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    .line 219
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->mainView:Landroid/view/View;

    const v1, 0x7f09019b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/RelativeLayout;

    .line 220
    new-instance v0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;

    iget-object v3, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object v4, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iget-object v5, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->shoppingListSyncAlertController:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    iget-object v6, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;-><init>(Landroid/view/ViewGroup;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;Lcom/shopkick/app/application/AppPreferences;)V

    iput-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->slFirstUseAnimationController:Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;

    const v0, 0x7f11024f

    .line 226
    invoke-virtual {v9, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->setAppScreenTitle(I)V

    .line 227
    iget-object v0, v9, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->mainView:Landroid/view/View;

    return-object v0
.end method

.method public hideHeader()V
    .locals 3

    .line 322
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->headerAnim:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    .line 323
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    const/4 v0, 0x0

    .line 324
    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->headerAnim:Landroid/animation/ValueAnimator;

    :cond_0
    const/4 v0, 0x2

    .line 327
    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->headerAnim:Landroid/animation/ValueAnimator;

    .line 328
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->headerAnim:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x12c

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 329
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->headerAnim:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$2;

    invoke-direct {v1, p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$2;-><init>(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 338
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->headerAnim:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$3;

    invoke-direct {v1, p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$3;-><init>(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 346
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->headerAnim:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public hideHeader(Z)V
    .locals 1

    .line 310
    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->isHeaderShown:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 311
    iput-boolean v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->isHeaderShown:Z

    if-eqz p1, :cond_1

    .line 314
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->hideHeader()V

    goto :goto_0

    .line 316
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->tabLayout:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 317
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->toolbar:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public initTabScreen(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 0
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

    .line 95
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 96
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 97
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    .line 98
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    .line 99
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 100
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 p1, 0x1

    .line 102
    iput-boolean p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->shouldRefresh:Z

    .line 103
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppPreferences;->getSelectedShoppingListId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->selectedShoppingListId:Ljava/lang/String;

    return-void
.end method

.method public onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;
    .locals 2

    .line 262
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->slListsDropdownController:Lcom/shopkick/app/shoppinglists/SLListDropdownController;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 263
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->slListsDropdownController:Lcom/shopkick/app/shoppinglists/SLListDropdownController;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->hideDropdown()V

    .line 264
    sget-object v0, Lcom/shopkick/app/screens/AppScreen$BackPressedState;->DONT_GO_BACK:Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    return-object v0

    .line 265
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->slEntryPickerController:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->isShown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 266
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->slEntryPickerController:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->hidePicker(Z)V

    .line 267
    sget-object v0, Lcom/shopkick/app/screens/AppScreen$BackPressedState;->DONT_GO_BACK:Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    return-object v0

    .line 270
    :cond_1
    invoke-super {p0}, Lcom/shopkick/app/tabs/TabScreen;->onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    move-result-object v0

    return-object v0
.end method

.method public onDestroy()V
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->slSearchDummyController:Lcom/shopkick/app/shoppinglists/SLSearchDummyController;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->destroy()V

    .line 109
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 110
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->adapter:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->destroy()V

    .line 111
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->slListsDropdownController:Lcom/shopkick/app/shoppinglists/SLListDropdownController;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->destroy()V

    .line 112
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->shoppingListSyncAlertController:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->destroy()V

    .line 114
    invoke-super {p0}, Lcom/shopkick/app/tabs/TabScreen;->onDestroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 9
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

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    const-string v0, "paramShoppingListId"

    .line 466
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "paramPreviousShoppingListId"

    .line 467
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "paramShoppingListEntryId"

    .line 468
    invoke-virtual {p2, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object v8, v1

    move-object v1, v0

    move-object v0, v8

    goto :goto_0

    :cond_0
    move-object v1, v0

    move-object v2, v1

    :goto_0
    const/4 v3, -0x1

    .line 471
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x1

    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v4, "scansBarcodeUpdateFailedEvent"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v3, 0x12

    goto/16 :goto_1

    :sswitch_1
    const-string v4, "eventShoppingListCleared"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v3, 0x8

    goto/16 :goto_1

    :sswitch_2
    const-string v4, "eventShoppingListEntryCompletionToggled"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v3, 0x9

    goto/16 :goto_1

    :sswitch_3
    const-string v4, "eventShoppingListChanged"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v3, 0x4

    goto/16 :goto_1

    :sswitch_4
    const-string/jumbo v4, "shoppingItemsFailedEvent"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v3, 0x14

    goto/16 :goto_1

    :sswitch_5
    const-string v4, "offlineScanBarcodeEnqueued"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v3, 0x10

    goto/16 :goto_1

    :sswitch_6
    const-string v4, "eventShoppingListReady"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    move v3, v7

    goto/16 :goto_1

    :sswitch_7
    const-string v4, "scansBarcodeUpdatedEvent"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v3, 0xb

    goto/16 :goto_1

    :sswitch_8
    const-string v4, "ScanBCSucceeded"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v3, 0xd

    goto/16 :goto_1

    :sswitch_9
    const-string v4, "offlineScanBarcodeReady"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v3, 0xe

    goto/16 :goto_1

    :sswitch_a
    const-string v4, "UserAccountIdChangedEvent"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    move v3, v5

    goto/16 :goto_1

    :sswitch_b
    const-string v4, "offlineScanFailed"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v3, 0xf

    goto/16 :goto_1

    :sswitch_c
    const-string v4, "productsUpdatedEvent"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v3, 0xc

    goto/16 :goto_1

    :sswitch_d
    const-string v4, "eventScanIrResponseSuccess"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v3, 0x15

    goto :goto_1

    :sswitch_e
    const-string v4, "eventTaxonomyLoaded"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v3, 0xa

    goto :goto_1

    :sswitch_f
    const-string v4, "eventShoppingListEntryDeleted"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v3, 0x7

    goto :goto_1

    :sswitch_10
    const-string v4, "productUpdateFailed"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v3, 0x13

    goto :goto_1

    :sswitch_11
    const-string/jumbo v4, "shoppingItemsUpdatedEvent"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v3, 0x11

    goto :goto_1

    :sswitch_12
    const-string v4, "eventShoppingListEntryAdded"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v3, 0x6

    goto :goto_1

    :sswitch_13
    const-string v4, "eventShoppingListDeleted"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v3, 0x5

    goto :goto_1

    :sswitch_14
    const-string v4, "EventVideoAwardRequestCompleted"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v3, 0x16

    goto :goto_1

    :sswitch_15
    const-string v4, "eventShoppingListCreatedFinished"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v3, 0x3

    goto :goto_1

    :sswitch_16
    const-string v4, "eventShoppingListCreated"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    move v3, v6

    :cond_1
    :goto_1
    packed-switch v3, :pswitch_data_0

    goto/16 :goto_6

    .line 606
    :pswitch_0
    iput-boolean v7, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->shouldRefresh:Z

    goto/16 :goto_6

    .line 602
    :pswitch_1
    iput-boolean v7, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->shouldRefresh:Z

    goto/16 :goto_6

    .line 597
    :pswitch_2
    iput-boolean v7, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->shouldRefresh:Z

    goto/16 :goto_6

    .line 589
    :pswitch_3
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->updateList()V

    .line 590
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->slFirstUseAnimationController:Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->maybeDisplayFirstUseView()V

    goto/16 :goto_6

    :pswitch_4
    if-nez p2, :cond_2

    return-void

    .line 570
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->selectedShoppingListId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingList(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    move-result-object p1

    const-string v0, "paramTaxonomyNode"

    .line 571
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;

    if-eqz p1, :cond_19

    .line 572
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    if-eqz v0, :cond_19

    if-eqz p2, :cond_19

    .line 573
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 574
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    if-eqz v1, :cond_3

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;->taxonomyNodeId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 575
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->updateList()V

    goto/16 :goto_6

    :pswitch_5
    if-nez p2, :cond_4

    return-void

    :cond_4
    if-eqz v1, :cond_8

    .line 555
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->selectedShoppingListId:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_2

    .line 557
    :cond_5
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-virtual {p1, v1, v2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingListEntry(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 559
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->isActiveScreen()Z

    move-result p2

    if-eqz p2, :cond_7

    .line 560
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->adapter:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v6, :cond_6

    move v5, v7

    :cond_6
    invoke-virtual {p2, v2, v5}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->toggleCompleted(Ljava/lang/String;Z)V

    .line 561
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->slFirstUseAnimationController:Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->maybeDisplayFirstUseView()V

    .line 564
    :cond_7
    iput-boolean v7, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->shouldRefresh:Z

    goto/16 :goto_6

    :cond_8
    :goto_2
    return-void

    :pswitch_6
    if-nez p2, :cond_9

    return-void

    :cond_9
    if-eqz v1, :cond_c

    .line 541
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->selectedShoppingListId:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto :goto_3

    .line 543
    :cond_a
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->isActiveScreen()Z

    move-result p1

    if-eqz p1, :cond_b

    .line 544
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->adapter:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->clearCompletedEntries()V

    .line 545
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->maybeShowPopularItems()V

    .line 546
    iput-boolean v7, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->shouldRefresh:Z

    goto/16 :goto_6

    .line 549
    :cond_b
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->updateList()V

    goto/16 :goto_6

    :cond_c
    :goto_3
    return-void

    :pswitch_7
    if-nez p2, :cond_d

    return-void

    :cond_d
    if-eqz v1, :cond_10

    .line 527
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->selectedShoppingListId:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    goto :goto_4

    .line 529
    :cond_e
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->isActiveScreen()Z

    move-result p1

    if-eqz p1, :cond_f

    .line 530
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->adapter:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    invoke-virtual {p1, v2}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->deleteEntry(Ljava/lang/String;)V

    .line 531
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->maybeShowPopularItems()V

    .line 532
    iput-boolean v7, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->shouldRefresh:Z

    goto/16 :goto_6

    .line 535
    :cond_f
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->updateList()V

    goto/16 :goto_6

    :cond_10
    :goto_4
    return-void

    :pswitch_8
    if-nez p2, :cond_11

    return-void

    :cond_11
    if-eqz v1, :cond_13

    .line 520
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->selectedShoppingListId:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    goto :goto_5

    .line 521
    :cond_12
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->updateList()V

    .line 522
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->slFirstUseAnimationController:Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->maybeDisplayFirstUseView()V

    goto/16 :goto_6

    :cond_13
    :goto_5
    return-void

    .line 511
    :pswitch_9
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->selectedShoppingListId:Ljava/lang/String;

    if-eqz p1, :cond_14

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_19

    .line 512
    :cond_14
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSelectedShoppingList()Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    move-result-object p1

    .line 513
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->setSelectedShoppingListId(Ljava/lang/String;)V

    .line 514
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->updateList()V

    goto :goto_6

    .line 503
    :pswitch_a
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->selectedShoppingListId:Ljava/lang/String;

    if-eqz p1, :cond_15

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_15

    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->selectedShoppingListId:Ljava/lang/String;

    .line 504
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_19

    .line 505
    :cond_15
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->updateList()V

    goto :goto_6

    .line 495
    :pswitch_b
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->selectedShoppingListId:Ljava/lang/String;

    if-eqz p1, :cond_16

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_19

    .line 496
    :cond_16
    invoke-direct {p0, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->setSelectedShoppingListId(Ljava/lang/String;)V

    .line 497
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->updateList()V

    goto :goto_6

    .line 486
    :pswitch_c
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->selectedShoppingListId:Ljava/lang/String;

    if-eqz p1, :cond_17

    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->isActiveScreen()Z

    move-result p1

    if-eqz p1, :cond_19

    .line 487
    :cond_17
    invoke-direct {p0, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->setSelectedShoppingListId(Ljava/lang/String;)V

    .line 488
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->updateList()V

    .line 489
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->slFirstUseAnimationController:Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->maybeDisplayFirstUseView()V

    goto :goto_6

    .line 481
    :pswitch_d
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->updateList()V

    goto :goto_6

    .line 473
    :pswitch_e
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->converter:Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;

    if-eqz p1, :cond_18

    .line 474
    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->clear()V

    .line 476
    :cond_18
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const-string/jumbo p2, "shoppinglist_first_use_view_state"

    invoke-virtual {p1, p2, v7}, Lcom/shopkick/app/application/AppPreferences;->putInt(Ljava/lang/String;I)V

    :cond_19
    :goto_6
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fac9718 -> :sswitch_16
        -0x7bdcda86 -> :sswitch_15
        -0x6bae06a8 -> :sswitch_14
        -0x6090e5e7 -> :sswitch_13
        -0x5df7ca52 -> :sswitch_12
        -0x56e13a09 -> :sswitch_11
        -0x2def8f0b -> :sswitch_10
        -0x1e55eeb9 -> :sswitch_f
        -0x1da98810 -> :sswitch_e
        -0x1b10bf5e -> :sswitch_d
        -0x14a8f1dd -> :sswitch_c
        -0x106e20a3 -> :sswitch_b
        0x44e6563 -> :sswitch_a
        0x550c423 -> :sswitch_9
        0x2ae28463 -> :sswitch_8
        0x34e115c9 -> :sswitch_7
        0x39ad43a3 -> :sswitch_6
        0x43b738dc -> :sswitch_5
        0x6c7eda05 -> :sswitch_4
        0x6f104cb4 -> :sswitch_3
        0x757353c2 -> :sswitch_2
        0x76164dac -> :sswitch_1
        0x7e0a06ea -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onRefreshSelected()V
    .locals 0

    return-void
.end method

.method protected onScreenDidShow()V
    .locals 3

    .line 280
    invoke-super {p0}, Lcom/shopkick/app/tabs/TabScreen;->onScreenDidShow()V

    .line 283
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    .line 284
    instance-of v0, v0, Lcom/shopkick/app/activities/HomeActivity;

    if-eqz v0, :cond_0

    .line 285
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/activities/HomeActivity;

    const-string v1, "lists"

    const-string v2, "EventBadgeHide"

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/activities/HomeActivity;->setBadgeVisibility(Ljava/lang/String;Ljava/lang/String;)V

    .line 291
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    invoke-virtual {v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->showPermViewsIfDisabled()V

    .line 293
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->shoppingListSyncAlertController:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->checkListSyncingDone()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 294
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->slFirstUseAnimationController:Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->maybeDisplayFirstUseView()V

    .line 297
    :cond_1
    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->shouldRefresh:Z

    if-eqz v0, :cond_2

    .line 298
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->updateList()V

    const/4 v0, 0x0

    .line 299
    iput-boolean v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->shouldRefresh:Z

    .line 302
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->fetchPopularItems()V

    return-void
.end method

.method public showHeader()V
    .locals 3

    .line 366
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->headerAnim:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    .line 367
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    const/4 v0, 0x0

    .line 368
    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->headerAnim:Landroid/animation/ValueAnimator;

    :cond_0
    const/4 v0, 0x2

    .line 371
    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->headerAnim:Landroid/animation/ValueAnimator;

    .line 372
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->headerAnim:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x12c

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 373
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->headerAnim:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$4;

    invoke-direct {v1, p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$4;-><init>(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 382
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->headerAnim:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$5;

    invoke-direct {v1, p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$5;-><init>(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 397
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->headerAnim:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public showHeader(Z)V
    .locals 1

    .line 350
    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->isHeaderShown:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 351
    iput-boolean v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->isHeaderShown:Z

    if-eqz p1, :cond_1

    .line 354
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->showHeader()V

    goto :goto_0

    .line 357
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->tabLayout:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 358
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->toolbar:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 359
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->tabLayout:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    const/4 v0, -0x2

    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 360
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->toolbar:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 361
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->toolbar:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    :goto_0
    return-void
.end method
