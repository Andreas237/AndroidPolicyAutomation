.class public Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "TaxonomyKeywordRelatedOffersScreen.java"

# interfaces
.implements Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;
.implements Lcom/shopkick/app/util/INotificationObserver;


# instance fields
.field private adapter:Lcom/shopkick/app/products/ScansListAdapter;

.field private entryName:Ljava/lang/String;

.field itemsForKeywords:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingItem;",
            ">;"
        }
    .end annotation
.end field

.field private keywordId:Ljava/lang/String;

.field private keywordIds:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

.field private scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

.field private screenLoadingSpinner:Landroid/widget/ProgressBar;

.field private shoppingListEntryId:Ljava/lang/String;

.field private shoppingListId:Ljava/lang/String;

.field private taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    const/4 p3, 0x0

    const v0, 0x7f0c01d7

    .line 85
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f090628

    .line 87
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ProgressBar;

    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const p2, 0x7f09059a

    .line 88
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 89
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v0, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;

    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    const/4 p2, 0x5

    .line 90
    new-array p2, p2, [Ljava/lang/Integer;

    const/16 v0, 0x17

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, p3

    const/16 v0, 0x3ed

    .line 91
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, p2, v1

    const/4 v0, -0x1

    .line 92
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x2

    aput-object v0, p2, v2

    const/4 v0, -0x2

    .line 93
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x3

    aput-object v0, p2, v2

    const/16 v0, -0xd

    .line 94
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x4

    aput-object v0, p2, v2

    .line 90
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    .line 95
    new-instance p2, Lcom/shopkick/app/products/ScansListAdapter;

    iget-object v4, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v7, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    sget-object v9, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->Simple:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    move-object v3, p2

    move-object v5, p0

    move-object v6, p0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/app/products/ScansListAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;)V

    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->adapter:Lcom/shopkick/app/products/ScansListAdapter;

    .line 101
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->adapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 103
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->adapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {p2}, Lcom/shopkick/app/products/ScansListAdapter;->getListAddController()Lcom/shopkick/app/shoppinglists/ListAddController;

    move-result-object p2

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->shoppingListId:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/shoppinglists/ListAddController;->setShoppingListId(Ljava/lang/String;)V

    .line 104
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->adapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {p2}, Lcom/shopkick/app/products/ScansListAdapter;->getListAddController()Lcom/shopkick/app/shoppinglists/ListAddController;

    move-result-object p2

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/shoppinglists/ListAddController;->setShoppingListParentEntryId(Ljava/lang/String;)V

    .line 106
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "scansBarcodeUpdatedEvent"

    invoke-virtual {p2, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 107
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "scansBarcodeUpdateFailedEvent"

    invoke-virtual {p2, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 108
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo v0, "shoppingItemsUpdatedEvent"

    invoke-virtual {p2, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 109
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "ScanBCSucceeded"

    invoke-virtual {p2, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 110
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "EventReceiptScanUploaded"

    invoke-virtual {p2, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 111
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "offlineScanBarcodeEnqueued"

    invoke-virtual {p2, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 112
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "offlineScanBarcodeReady"

    invoke-virtual {p2, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 113
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "offlineScanFailed"

    invoke-virtual {p2, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 114
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "eventShoppingListEntryAddedFinished"

    invoke-virtual {p2, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 116
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->entryName:Ljava/lang/String;

    if-nez p2, :cond_0

    const-string p2, ""

    .line 117
    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->entryName:Ljava/lang/String;

    :cond_0
    const p2, 0x7f1106f7

    .line 119
    new-array v0, v1, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->entryName:Ljava/lang/String;

    aput-object v1, v0, p3

    invoke-virtual {p0, p2, v0}, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->setAppScreenTitle(Ljava/lang/String;)V

    return-object p1
.end method

.method public getPageRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    const/4 p1, 0x0

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

    const-string/jumbo v0, "taxonomy_keyword_id"

    .line 63
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->keywordId:Ljava/lang/String;

    const-string v0, "entry_name"

    .line 64
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->entryName:Ljava/lang/String;

    const-string/jumbo v0, "shopping_list_id"

    .line 65
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->shoppingListId:Ljava/lang/String;

    const-string/jumbo v0, "shopping_list_entry_id"

    .line 66
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->shoppingListEntryId:Ljava/lang/String;

    .line 67
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->scanBCDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    .line 68
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    .line 69
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo p1, "taxonomy_keyword_ids"

    .line 71
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 73
    new-instance p2, Ljava/util/ArrayList;

    const-string v0, ","

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->keywordIds:Ljava/util/ArrayList;

    .line 76
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->keywordIds:Ljava/util/ArrayList;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 79
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->keywordIds:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->getShoppingItemsForKeywordIds(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->itemsForKeywords:Ljava/util/List;

    goto :goto_1

    .line 77
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->keywordId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->getShoppingItemsForKeywordId(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->itemsForKeywords:Ljava/util/List;

    :goto_1
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 132
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->adapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/products/ScansListAdapter;->destroy()V

    .line 133
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 2
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

    .line 200
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x8

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "scansBarcodeUpdateFailedEvent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x6

    goto :goto_1

    :sswitch_1
    const-string v0, "offlineScanBarcodeEnqueued"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    goto :goto_1

    :sswitch_2
    const-string v0, "scansBarcodeUpdatedEvent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    :sswitch_3
    const-string v0, "ScanBCSucceeded"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_1

    :sswitch_4
    const-string v0, "offlineScanBarcodeReady"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_1

    :sswitch_5
    const-string v0, "offlineScanFailed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x5

    goto :goto_1

    :sswitch_6
    const-string v0, "eventShoppingListEntryAddedFinished"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v1

    goto :goto_1

    :sswitch_7
    const-string/jumbo v0, "shoppingItemsUpdatedEvent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x7

    goto :goto_1

    :sswitch_8
    const-string v0, "EventReceiptScanUploaded"

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

    :pswitch_0
    if-nez p2, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string p1, "paramShoppingListId"

    .line 225
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string v0, "paramShoppingListEntryId"

    .line 226
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "paramPreviousShoppingListEntryId"

    .line 227
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-eqz p1, :cond_7

    .line 229
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->shoppingListId:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_4

    :cond_2
    if-eqz p2, :cond_7

    .line 230
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_4

    :cond_3
    if-nez v0, :cond_4

    goto :goto_4

    .line 233
    :cond_4
    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->shoppingListEntryId:Ljava/lang/String;

    .line 234
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->adapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/products/ScansListAdapter;->getListAddController()Lcom/shopkick/app/shoppinglists/ListAddController;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/shoppinglists/ListAddController;->setShoppingListParentEntryId(Ljava/lang/String;)V

    goto :goto_4

    .line 214
    :pswitch_1
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->keywordIds:Ljava/util/ArrayList;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_2

    .line 217
    :cond_5
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->keywordIds:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->getShoppingItemsForKeywordIds(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->itemsForKeywords:Ljava/util/List;

    goto :goto_3

    .line 215
    :cond_6
    :goto_2
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->keywordId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->getShoppingItemsForKeywordId(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->itemsForKeywords:Ljava/util/List;

    .line 219
    :goto_3
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->refresh()V

    goto :goto_4

    .line 210
    :pswitch_2
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 211
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->adapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/products/ScansListAdapter;->addOfflineEducationTile()V

    goto :goto_4

    .line 207
    :pswitch_3
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->refresh()V

    :cond_7
    :goto_4
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x57c9a285 -> :sswitch_8
        -0x56e13a09 -> :sswitch_7
        -0x18c633c0 -> :sswitch_6
        -0x106e20a3 -> :sswitch_5
        0x550c423 -> :sswitch_4
        0x2ae28463 -> :sswitch_3
        0x34e115c9 -> :sswitch_2
        0x43b738dc -> :sswitch_1
        0x7e0a06ea -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onPreFetch(Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;Lcom/shopkick/app/fetchers/api/IAPIObject;)V
    .locals 0

    return-void
.end method

.method public onScreenDidShow()V
    .locals 0

    .line 126
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->refresh()V

    return-void
.end method

.method public processResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public refresh()V
    .locals 7

    .line 137
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 138
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->adapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/products/ScansListAdapter;->clear()V

    .line 140
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 141
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->itemsForKeywords:Ljava/util/List;

    if-nez v1, :cond_0

    .line 143
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 144
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->keywordId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->fetchShoppingItems(Ljava/util/List;)V

    return-void

    .line 147
    :cond_0
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/16 v2, 0x8

    if-eqz v1, :cond_1

    const v1, 0x7f110633

    .line 148
    invoke-virtual {p0, v1}, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator;->getNoContentTile(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 150
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->adapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/products/ScansListAdapter;->addTiles(Ljava/util/List;)V

    return-void

    .line 154
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 155
    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->itemsForKeywords:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/fetchers/api/skapi/ShoppingItem;

    .line 156
    iget-object v5, v4, Lcom/shopkick/app/fetchers/api/skapi/ShoppingItem;->itemType:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-nez v5, :cond_2

    .line 157
    iget-object v5, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v6, v4, Lcom/shopkick/app/fetchers/api/skapi/ShoppingItem;->itemId:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->getScanInfoForProductFamilyId(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    move-result-object v5

    if-eqz v5, :cond_3

    const/4 v4, 0x0

    .line 159
    invoke-static {v5, v4}, Lcom/shopkick/app/util/TileUtils;->createTileInfoFromScanInfo(Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;Ljava/lang/String;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 161
    :cond_3
    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/ShoppingItem;->itemId:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 167
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_5

    .line 168
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->fetchScanInfos(Ljava/util/List;)V

    goto :goto_1

    .line 170
    :cond_5
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 171
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;->adapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/products/ScansListAdapter;->addTiles(Ljava/util/List;)V

    :goto_1
    return-void
.end method
