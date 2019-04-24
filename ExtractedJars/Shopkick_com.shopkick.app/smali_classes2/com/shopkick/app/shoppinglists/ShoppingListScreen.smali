.class public Lcom/shopkick/app/shoppinglists/ShoppingListScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "ShoppingListScreen.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private adapter:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private chainId:Ljava/lang/String;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private converter:Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;

.field private locationId:Ljava/lang/String;

.field private mainView:Landroid/widget/FrameLayout;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

.field private screenLoadingSpinner:Landroid/widget/ProgressBar;

.field private shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

.field private shoppingListId:Ljava/lang/String;

.field private shoppingListSyncAlertController:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

.field private shouldRefresh:Z

.field private slEntryPickerController:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

.field private slSearchDummyController:Lcom/shopkick/app/shoppinglists/SLSearchDummyController;

.field private taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method private instantiateViews()V
    .locals 2

    .line 129
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->mainView:Landroid/widget/FrameLayout;

    const v1, 0x7f090628

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    .line 130
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->mainView:Landroid/widget/FrameLayout;

    const v1, 0x7f09059a

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    return-void
.end method

.method public static synthetic lambda$setupViews$222(Lcom/shopkick/app/shoppinglists/ShoppingListScreen;Landroid/view/View;)V
    .locals 2

    .line 135
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-static {p1, v0}, Lcom/shopkick/app/shoppinglists/SLUtils;->isNewModificationCreatable(Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 136
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->slEntryPickerController:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->showPicker(Z)V

    .line 139
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0xd9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 140
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method private setupRecycler()V
    .locals 12

    .line 176
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->adapter:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    if-eqz v0, :cond_0

    return-void

    .line 179
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v1, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;

    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 180
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

    .line 181
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v1

    const/4 v1, 0x2

    const/16 v3, 0x3f8

    .line 182
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v1

    const/4 v1, 0x3

    const/16 v3, 0x3fa

    .line 183
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v1

    const/4 v1, 0x4

    const/16 v11, 0x3f9

    .line 184
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v1

    const/4 v1, 0x5

    const/16 v3, 0x403

    .line 185
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v1

    const/4 v1, 0x6

    const/4 v3, -0x1

    .line 186
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v1

    const/4 v1, 0x7

    const/4 v3, -0x2

    .line 187
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v1

    const/16 v1, 0x8

    const/16 v3, -0xd

    .line 188
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v1

    .line 180
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v8, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 190
    new-instance v0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    iget-object v4, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    const/4 v6, 0x0

    iget-object v7, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const/4 v9, 0x0

    iget-object v10, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->converter:Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;

    move-object v3, v0

    move-object v5, p0

    invoke-direct/range {v3 .. v10}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;)V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->adapter:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    .line 197
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->adapter:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->removeDefaultItemDecoration()V

    .line 198
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->adapter:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    const/16 v1, 0x32

    const/16 v3, 0xa

    invoke-virtual {v0, v1, v3}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->setPadding(II)V

    .line 199
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->adapter:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->chainId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->setChainId(Ljava/lang/String;)V

    .line 200
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->adapter:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shoppingListId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->setShoppingListId(Ljava/lang/String;)V

    .line 202
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->adapter:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 203
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setVisibility(I)V

    .line 205
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->adapter:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    invoke-virtual {v0, v11}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->chainId:Ljava/lang/String;

    .line 206
    invoke-virtual {v0, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListProductTileViewHolderConfigurator;->setCurrentChainId(Ljava/lang/String;)V

    return-void
.end method

.method private setupScreenObservers()V
    .locals 2

    .line 93
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventShoppingListReady"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 94
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventShoppingListChanged"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 95
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventShoppingListCreatedFinished"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 96
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventShoppingListDeleted"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 97
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventShoppingListEntryAdded"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 98
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventShoppingListEntryDeleted"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 99
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventShoppingListEntryCompletionToggled"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 100
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventShoppingListCleared"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 101
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventTaxonomyLoaded"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 102
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo v1, "shoppingItemsUpdatedEvent"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 103
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo v1, "shoppingItemsFailedEvent"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 104
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "EventUpdateUI2DIRAndVideoFeature"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 106
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isShoppingListEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 107
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "scansBarcodeUpdatedEvent"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 108
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "scansBarcodeUpdateFailedEvent"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 109
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "ScanBCSucceeded"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 110
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "offlineScanBarcodeReady"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 111
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "offlineScanFailed"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 112
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "offlineScanBarcodeEnqueued"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 113
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "productsUpdatedEvent"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 114
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "productUpdateFailed"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private setupScreenParams(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string/jumbo v0, "shopping_list_id"

    .line 87
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shoppingListId:Ljava/lang/String;

    const-string v0, "location_id"

    .line 88
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->locationId:Ljava/lang/String;

    const-string v0, "chain_id"

    .line 89
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->chainId:Ljava/lang/String;

    return-void
.end method

.method private setupStandardScreenVars(Lcom/shopkick/app/application/ScreenGlobals;)V
    .locals 1

    .line 79
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 80
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 81
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 82
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    .line 83
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    return-void
.end method

.method private setupViews()V
    .locals 11

    .line 134
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->mainView:Landroid/widget/FrameLayout;

    const v1, 0x7f09063e

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v2, Lcom/shopkick/app/shoppinglists/-$$Lambda$ShoppingListScreen$gUWCMaQu6iE0-0Js0H9-TD2VT20;

    invoke-direct {v2, p0}, Lcom/shopkick/app/shoppinglists/-$$Lambda$ShoppingListScreen$gUWCMaQu6iE0-0Js0H9-TD2VT20;-><init>(Lcom/shopkick/app/shoppinglists/ShoppingListScreen;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 143
    new-instance v0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;

    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->getContext()Landroid/content/Context;

    move-result-object v4

    iget-object v5, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v6, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v7, v2, Lcom/shopkick/app/application/ScreenGlobals;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v8, v2, Lcom/shopkick/app/application/ScreenGlobals;->productsDataSource:Lcom/shopkick/app/products/ProductsDataSource;

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;-><init>(Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;Lcom/shopkick/app/products/ProductsDataSource;)V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->converter:Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;

    .line 149
    new-instance v0, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->mainView:Landroid/widget/FrameLayout;

    .line 150
    invoke-virtual {v3, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;-><init>(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;)V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->slSearchDummyController:Lcom/shopkick/app/shoppinglists/SLSearchDummyController;

    .line 152
    new-instance v0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    iget-object v5, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v6, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v7, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iget-object v8, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->mainView:Landroid/widget/FrameLayout;

    const v2, 0x7f090251

    .line 157
    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v9

    iget-object v10, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    move-object v3, v0

    move-object v4, p0

    invoke-direct/range {v3 .. v10}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;Landroid/view/View;Lcom/shopkick/app/logging/UserEventLogger;)V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->slEntryPickerController:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    .line 160
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 161
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->setupRecycler()V

    .line 163
    new-instance v0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->mainView:Landroid/widget/FrameLayout;

    const v2, 0x7f090693

    .line 164
    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    iget-object v4, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object v6, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v7, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iget-object v10, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v10}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;-><init>(Landroid/view/View;Lcom/shopkick/app/application/dialog/DialogsManager;ZLcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Landroid/view/View;Landroid/view/View;Lcom/shopkick/app/logging/UserEventLogger;)V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shoppingListSyncAlertController:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    return-void
.end method

.method private updateList()V
    .locals 3

    .line 224
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->isActiveScreen()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 225
    iput-boolean v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shouldRefresh:Z

    return-void

    .line 229
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shoppingListId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingList(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    move-result-object v0

    if-nez v0, :cond_1

    .line 233
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->popScreen()V

    return-void

    .line 238
    :cond_1
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->name:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->setAppScreenTitle(Ljava/lang/String;)V

    .line 241
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 244
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->adapter:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    invoke-virtual {v1}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->refresh()V

    .line 247
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->slEntryPickerController:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->setSelectedListInfo(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;)V

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0c01b3

    const/4 v0, 0x0

    .line 120
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->mainView:Landroid/widget/FrameLayout;

    .line 122
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->instantiateViews()V

    .line 123
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->setupViews()V

    .line 125
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->mainView:Landroid/widget/FrameLayout;

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
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

    .line 71
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->setupStandardScreenVars(Lcom/shopkick/app/application/ScreenGlobals;)V

    .line 72
    invoke-direct {p0, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->setupScreenParams(Ljava/util/Map;)V

    .line 73
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->setupScreenObservers()V

    const/4 p1, 0x1

    .line 75
    iput-boolean p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shouldRefresh:Z

    return-void
.end method

.method public onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;
    .locals 3

    .line 253
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->slEntryPickerController:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 254
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->slEntryPickerController:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->hidePicker(Z)V

    .line 257
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0xde

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 258
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->slEntryPickerController:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    invoke-virtual {v1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->getEnteredTextLength()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNumCharactersEntered(Ljava/lang/Integer;)V

    .line 259
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 261
    sget-object v0, Lcom/shopkick/app/screens/AppScreen$BackPressedState;->DONT_GO_BACK:Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    return-object v0

    .line 264
    :cond_0
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    move-result-object v0

    return-object v0
.end method

.method public onDestroy()V
    .locals 1

    .line 269
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->slSearchDummyController:Lcom/shopkick/app/shoppinglists/SLSearchDummyController;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->destroy()V

    .line 270
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 271
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->adapter:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->destroy()V

    .line 272
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shoppingListSyncAlertController:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->destroy()V

    .line 273
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 8
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

    .line 283
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "paramPreviousShoppingListId"

    .line 284
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "paramShoppingListEntryId"

    .line 285
    invoke-virtual {p2, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v1, v0

    move-object v2, v1

    :goto_0
    const/4 v3, -0x1

    .line 288
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

    const/16 v3, 0x10

    goto/16 :goto_1

    :sswitch_1
    const-string v4, "eventShoppingListCleared"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v3, 0x6

    goto/16 :goto_1

    :sswitch_2
    const-string v4, "eventShoppingListEntryCompletionToggled"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v3, 0x7

    goto/16 :goto_1

    :sswitch_3
    const-string v4, "eventShoppingListChanged"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    move v3, v7

    goto/16 :goto_1

    :sswitch_4
    const-string/jumbo v4, "shoppingItemsFailedEvent"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v3, 0x12

    goto/16 :goto_1

    :sswitch_5
    const-string v4, "offlineScanBarcodeEnqueued"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v3, 0xe

    goto/16 :goto_1

    :sswitch_6
    const-string v4, "eventShoppingListReady"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    move v3, v5

    goto/16 :goto_1

    :sswitch_7
    const-string v4, "scansBarcodeUpdatedEvent"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v3, 0x9

    goto/16 :goto_1

    :sswitch_8
    const-string v4, "ScanBCSucceeded"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v3, 0xb

    goto/16 :goto_1

    :sswitch_9
    const-string v4, "offlineScanBarcodeReady"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v3, 0xc

    goto/16 :goto_1

    :sswitch_a
    const-string v4, "offlineScanFailed"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v3, 0xd

    goto :goto_1

    :sswitch_b
    const-string v4, "productsUpdatedEvent"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v3, 0xa

    goto :goto_1

    :sswitch_c
    const-string v4, "eventTaxonomyLoaded"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v3, 0x8

    goto :goto_1

    :sswitch_d
    const-string v4, "eventShoppingListEntryDeleted"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v3, 0x5

    goto :goto_1

    :sswitch_e
    const-string v4, "EventUpdateUI2DIRAndVideoFeature"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v3, 0x13

    goto :goto_1

    :sswitch_f
    const-string v4, "productUpdateFailed"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v3, 0x11

    goto :goto_1

    :sswitch_10
    const-string/jumbo v4, "shoppingItemsUpdatedEvent"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v3, 0xf

    goto :goto_1

    :sswitch_11
    const-string v4, "eventShoppingListEntryAdded"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :sswitch_12
    const-string v4, "eventShoppingListDeleted"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    move v3, v6

    goto :goto_1

    :sswitch_13
    const-string v4, "eventShoppingListCreatedFinished"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v3, 0x3

    :cond_1
    :goto_1
    packed-switch v3, :pswitch_data_0

    goto/16 :goto_6

    .line 386
    :pswitch_0
    iput-boolean v7, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shouldRefresh:Z

    goto/16 :goto_6

    .line 382
    :pswitch_1
    iput-boolean v7, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shouldRefresh:Z

    goto/16 :goto_6

    .line 375
    :pswitch_2
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->updateList()V

    goto/16 :goto_6

    .line 356
    :pswitch_3
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shoppingListId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingList(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    move-result-object p1

    const-string v0, "paramTaxonomyNode"

    .line 357
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;

    if-eqz p1, :cond_14

    .line 358
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    if-eqz v0, :cond_14

    if-eqz p2, :cond_14

    .line 359
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 360
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    if-eqz v1, :cond_2

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;->taxonomyNodeId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 361
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->updateList()V

    goto/16 :goto_6

    :pswitch_4
    if-nez p2, :cond_3

    return-void

    :cond_3
    if-eqz v0, :cond_7

    .line 343
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shoppingListId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_2

    .line 345
    :cond_4
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-virtual {p1, v0, v2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingListEntry(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 347
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->isActiveScreen()Z

    move-result p2

    if-eqz p2, :cond_6

    .line 348
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->adapter:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v6, :cond_5

    move v5, v7

    :cond_5
    invoke-virtual {p2, v2, v5}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->toggleCompleted(Ljava/lang/String;Z)V

    .line 351
    :cond_6
    iput-boolean v7, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shouldRefresh:Z

    goto/16 :goto_6

    :cond_7
    :goto_2
    return-void

    :pswitch_5
    if-nez p2, :cond_8

    return-void

    :cond_8
    if-eqz v0, :cond_b

    .line 330
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shoppingListId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_3

    .line 332
    :cond_9
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->isActiveScreen()Z

    move-result p1

    if-eqz p1, :cond_a

    .line 333
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->adapter:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->clearCompletedEntries()V

    .line 334
    iput-boolean v7, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shouldRefresh:Z

    goto :goto_6

    .line 337
    :cond_a
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->updateList()V

    goto :goto_6

    :cond_b
    :goto_3
    return-void

    :pswitch_6
    if-nez p2, :cond_c

    return-void

    :cond_c
    if-eqz v0, :cond_f

    .line 317
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shoppingListId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    goto :goto_4

    .line 319
    :cond_d
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->isActiveScreen()Z

    move-result p1

    if-eqz p1, :cond_e

    .line 320
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->adapter:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    invoke-virtual {p1, v2}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->deleteEntry(Ljava/lang/String;)V

    .line 321
    iput-boolean v7, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shouldRefresh:Z

    goto :goto_6

    .line 324
    :cond_e
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->updateList()V

    goto :goto_6

    :cond_f
    :goto_4
    return-void

    :pswitch_7
    if-nez p2, :cond_10

    return-void

    :cond_10
    if-eqz v0, :cond_12

    .line 311
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shoppingListId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    goto :goto_5

    .line 312
    :cond_11
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->updateList()V

    goto :goto_6

    :cond_12
    :goto_5
    return-void

    .line 304
    :pswitch_8
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shoppingListId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_14

    .line 305
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->popScreen()V

    goto :goto_6

    .line 295
    :pswitch_9
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shoppingListId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_13

    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shoppingListId:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_14

    .line 296
    :cond_13
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->updateList()V

    goto :goto_6

    .line 290
    :pswitch_a
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->updateList()V

    :cond_14
    :goto_6
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7bdcda86 -> :sswitch_13
        -0x6090e5e7 -> :sswitch_12
        -0x5df7ca52 -> :sswitch_11
        -0x56e13a09 -> :sswitch_10
        -0x2def8f0b -> :sswitch_f
        -0x2ddd5220 -> :sswitch_e
        -0x1e55eeb9 -> :sswitch_d
        -0x1da98810 -> :sswitch_c
        -0x14a8f1dd -> :sswitch_b
        -0x106e20a3 -> :sswitch_a
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
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected onScreenDidShow()V
    .locals 1

    .line 211
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidShow()V

    .line 213
    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shouldRefresh:Z

    if-eqz v0, :cond_0

    .line 214
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->updateList()V

    const/4 v0, 0x0

    .line 215
    iput-boolean v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shouldRefresh:Z

    .line 218
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shoppingListSyncAlertController:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->checkListSyncingDone()Z

    .line 220
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListScreen;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->fetchPopularItems()V

    return-void
.end method
