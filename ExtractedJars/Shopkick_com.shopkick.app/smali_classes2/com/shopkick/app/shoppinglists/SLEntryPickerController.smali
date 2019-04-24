.class public Lcom/shopkick/app/shoppinglists/SLEntryPickerController;
.super Ljava/lang/Object;
.source "SLEntryPickerController.java"

# interfaces
.implements Landroid/text/TextWatcher;
.implements Landroid/view/View$OnKeyListener;
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private CLEAR_TEXT_BUTTON_ANIMATION_DURATION:I

.field private adapter:Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;

.field private appScreenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field

.field private clearTextButton:Landroid/view/View;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private containerView:Landroid/view/View;

.field private context:Landroid/content/Context;

.field private eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

.field private isAddingFromDoneButton:Z

.field private isClearTextButtonShown:Z

.field private isShown:Z

.field private keyword:Ljava/lang/String;

.field private listTitle:Landroid/widget/TextView;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private popularItemsLayout:Landroid/view/View;

.field private previousKeyword:Ljava/lang/String;

.field private selectedListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

.field private shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

.field private slPopularItemsController:Lcom/shopkick/app/shoppinglists/SLPopularItemsController;

.field private suggestions:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;",
            ">;"
        }
    .end annotation
.end field

.field private taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

.field private textListView:Landroid/widget/ListView;

.field private textSearchBar:Landroid/widget/EditText;

.field private timer:Ljava/util/Timer;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;Landroid/view/View;Lcom/shopkick/app/logging/UserEventLogger;)V
    .locals 2

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 77
    iput-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->isShown:Z

    const/16 v1, 0xc8

    .line 79
    iput v1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->CLEAR_TEXT_BUTTON_ANIMATION_DURATION:I

    .line 80
    iput-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->isClearTextButtonShown:Z

    .line 86
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->suggestions:Ljava/util/ArrayList;

    .line 96
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->appScreenRef:Ljava/lang/ref/WeakReference;

    .line 97
    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 98
    iput-object p3, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 99
    iput-object p4, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    .line 100
    iput-object p5, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    .line 101
    iput-object p6, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->containerView:Landroid/view/View;

    .line 102
    invoke-virtual {p6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->context:Landroid/content/Context;

    .line 103
    iput-object p7, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 106
    new-instance p2, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$1;

    invoke-direct {p2, p0, p4, p6, p7}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$1;-><init>(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Landroid/view/View;Lcom/shopkick/app/logging/UserEventLogger;)V

    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->slPopularItemsController:Lcom/shopkick/app/shoppinglists/SLPopularItemsController;

    const p2, 0x7f09042a

    .line 114
    invoke-virtual {p6, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->listTitle:Landroid/widget/TextView;

    const p2, 0x7f09063d

    .line 115
    invoke-virtual {p6, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/EditText;

    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->textSearchBar:Landroid/widget/EditText;

    const p2, 0x7f090533

    .line 116
    invoke-virtual {p6, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->popularItemsLayout:Landroid/view/View;

    const p2, 0x7f09004f

    .line 117
    invoke-virtual {p6, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ListView;

    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->textListView:Landroid/widget/ListView;

    const p2, 0x7f09010d

    .line 118
    invoke-virtual {p6, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->clearTextButton:Landroid/view/View;

    .line 121
    new-instance p2, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;

    invoke-direct {p2, p5, p7, p0}, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;-><init>(Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)V

    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->adapter:Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;

    .line 122
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->textListView:Landroid/widget/ListView;

    iget-object p4, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->adapter:Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;

    invoke-virtual {p2, p4}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 123
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->textListView:Landroid/widget/ListView;

    invoke-virtual {p2, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 126
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->textSearchBar:Landroid/widget/EditText;

    invoke-virtual {p2, p0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 127
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->textSearchBar:Landroid/widget/EditText;

    new-instance p4, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$2;

    invoke-direct {p4, p0}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$2;-><init>(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)V

    invoke-virtual {p2, p4}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 138
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->textSearchBar:Landroid/widget/EditText;

    invoke-virtual {p2, p0}, Landroid/widget/EditText;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 139
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->clearTextButton:Landroid/view/View;

    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f090055

    .line 140
    invoke-virtual {p6, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p4

    invoke-virtual {p4, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 143
    invoke-virtual {p6, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 146
    iget-object p4, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->popularItemsLayout:Landroid/view/View;

    new-instance p5, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$3;

    invoke-direct {p5, p0}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$3;-><init>(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)V

    invoke-virtual {p4, p5}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    const/16 p4, 0x8

    .line 155
    invoke-virtual {p6, p4}, Landroid/view/View;->setVisibility(I)V

    .line 158
    instance-of p1, p1, Lcom/shopkick/app/tabs/TabScreen;

    if-nez p1, :cond_0

    .line 159
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->listTitle:Landroid/widget/TextView;

    invoke-virtual {p1, p4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 160
    invoke-virtual {p6, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p4}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    const-string p1, "eventReceiveSuggestion"

    .line 164
    invoke-virtual {p3, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "eventTaxonomyLoaded"

    .line 165
    invoke-virtual {p3, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 53
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->appScreenRef:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->clearTextView()V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)Landroid/widget/EditText;
    .locals 0

    .line 53
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->textSearchBar:Landroid/widget/EditText;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)Landroid/view/View;
    .locals 0

    .line 53
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->containerView:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)Ljava/lang/String;
    .locals 0

    .line 53
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->keyword:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)Ljava/lang/String;
    .locals 0

    .line 53
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->previousKeyword:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$502(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->previousKeyword:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$600(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;
    .locals 0

    .line 53
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->selectedListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    return-object p0
.end method

.method static synthetic access$700(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;
    .locals 0

    .line 53
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    return-object p0
.end method

.method private addEntryToCurrentList(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 328
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;->taxonomyNodeId:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->getTaxonomyNode(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;

    .line 331
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->selectedListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    new-instance v2, Ljava/util/ArrayList;

    .line 332
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 331
    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->addShoppingListSuggestions(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-void
.end method

.method private clearTextView()V
    .locals 2

    .line 302
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->textSearchBar:Landroid/widget/EditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 303
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->textSearchBar:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->clearFocus()V

    return-void
.end method

.method private getLogRecordForAddingSuggestions(I)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;
    .locals 5

    .line 380
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    .line 381
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->getEnteredTextLength()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNumCharactersEntered(Ljava/lang/Integer;)V

    .line 382
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->keyword:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->adapter:Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;

    invoke-virtual {v1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 383
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->adapter:Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;

    .line 384
    invoke-virtual {v1, p1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;->keywordId:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 383
    :goto_0
    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSuggestionRankingPosition(Ljava/lang/Integer;)V

    .line 386
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->getSelectedItems()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getSuggestionRankingPosition()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 387
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 388
    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setTaxonomyKeywordIds(Ljava/util/ArrayList;)V

    .line 391
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->getSelectedItems()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;

    .line 392
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;->keywordId:Ljava/lang/String;

    if-eqz v4, :cond_3

    .line 393
    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;->keywordId:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 398
    :cond_4
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->adapter:Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;

    invoke-virtual {v2}, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->adapter:Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;

    invoke-virtual {v2, p1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;->keywordId:Ljava/lang/String;

    if-eqz v2, :cond_5

    .line 399
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->adapter:Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;

    invoke-virtual {v2, p1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;->keywordId:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    return-object v0
.end method

.method private hideClearTextButton()V
    .locals 3

    .line 316
    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->isClearTextButtonShown:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 317
    iput-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->isClearTextButtonShown:Z

    .line 319
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->clearTextButton:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setClickable(Z)V

    .line 320
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->clearTextButton:Landroid/view/View;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 321
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->clearTextButton:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    iget v1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->CLEAR_TEXT_BUTTON_ANIMATION_DURATION:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void
.end method

.method public static synthetic lambda$setSuggestionList$223(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)V
    .locals 1

    .line 371
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->adapter:Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method private setSuggestionList(Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    .line 337
    :goto_0
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->suggestions:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    const-string v2, "TaxonomyNodeIdOther"

    .line 338
    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->suggestions:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;->taxonomyNodeId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/high16 v1, -0x80000000

    .line 344
    :goto_1
    invoke-static {p1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_6

    if-ltz v1, :cond_3

    .line 347
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->suggestions:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;->title:Ljava/lang/String;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->suggestions:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;->title:Ljava/lang/String;

    .line 348
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string p1, "TaxonomyNodeIdOther"

    .line 349
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->suggestions:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;->taxonomyNodeId:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 350
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->suggestions:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 352
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->adapter:Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->suggestions:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->setEntryList(Ljava/util/ArrayList;)V

    .line 353
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->adapter:Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->notifyDataSetChanged()V

    return-void

    .line 357
    :cond_3
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;-><init>()V

    const-string v2, "TaxonomyNodeIdOther"

    .line 358
    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;->taxonomyNodeId:Ljava/lang/String;

    .line 359
    iput-object p1, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;->title:Ljava/lang/String;

    .line 361
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->suggestions:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, "TaxonomyNodeIdOther"

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->suggestions:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;->taxonomyNodeId:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_2

    .line 364
    :cond_4
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->suggestions:Ljava/util/ArrayList;

    invoke-virtual {p1, v0, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 362
    :cond_5
    :goto_2
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->suggestions:Ljava/util/ArrayList;

    invoke-virtual {p1, v0, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 368
    :cond_6
    :goto_3
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->adapter:Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->suggestions:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->setEntryList(Ljava/util/ArrayList;)V

    .line 369
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->containerView:Landroid/view/View;

    new-instance v0, Lcom/shopkick/app/shoppinglists/-$$Lambda$SLEntryPickerController$LGbZWjxJzj0DHHVhozRJyMlPZ_c;

    invoke-direct {v0, p0}, Lcom/shopkick/app/shoppinglists/-$$Lambda$SLEntryPickerController$LGbZWjxJzj0DHHVhozRJyMlPZ_c;-><init>(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private showClearTextButton()V
    .locals 3

    .line 307
    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->isClearTextButtonShown:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 308
    iput-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->isClearTextButtonShown:Z

    .line 310
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->clearTextButton:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setClickable(Z)V

    .line 311
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->clearTextButton:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 312
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->clearTextButton:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    iget v1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->CLEAR_TEXT_BUTTON_ANIMATION_DURATION:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 6

    .line 474
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->keyword:Ljava/lang/String;

    .line 475
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->keyword:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/16 v0, 0x8

    if-lez p1, :cond_0

    .line 477
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->showClearTextButton()V

    .line 478
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->popularItemsLayout:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 479
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->textListView:Landroid/widget/ListView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setVisibility(I)V

    .line 480
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->keyword:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->setSuggestionList(Ljava/lang/String;)V

    .line 483
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->timer:Ljava/util/Timer;

    if-nez p1, :cond_2

    .line 484
    new-instance p1, Ljava/util/Timer;

    invoke-direct {p1}, Ljava/util/Timer;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->timer:Ljava/util/Timer;

    .line 485
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->timer:Ljava/util/Timer;

    new-instance v1, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$6;

    invoke-direct {v1, p0}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$6;-><init>(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)V

    const-wide/16 v2, 0x0

    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->shoppingListSuggestionsRequestDelayMs:Ljava/lang/Long;

    .line 493
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    .line 485
    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->scheduleAtFixedRate(Ljava/util/TimerTask;JJ)V

    goto :goto_0

    .line 497
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->hideClearTextButton()V

    .line 500
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->slPopularItemsController:Lcom/shopkick/app/shoppinglists/SLPopularItemsController;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->showPopularItems()V

    .line 502
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->textListView:Landroid/widget/ListView;

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setVisibility(I)V

    .line 503
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->suggestions:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 504
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->adapter:Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->notifyDataSetChanged()V

    .line 507
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->timer:Ljava/util/Timer;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 509
    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->timer:Ljava/util/Timer;

    .line 510
    invoke-virtual {p1}, Ljava/util/Timer;->cancel()V

    .line 511
    invoke-virtual {p1}, Ljava/util/Timer;->purge()I

    .line 514
    :cond_1
    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->previousKeyword:Ljava/lang/String;

    :cond_2
    :goto_0
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public destroy()V
    .locals 1

    .line 169
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->slPopularItemsController:Lcom/shopkick/app/shoppinglists/SLPopularItemsController;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->destroy()V

    .line 170
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 171
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->timer:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 172
    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 173
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->timer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->purge()I

    const/4 v0, 0x0

    .line 174
    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->timer:Ljava/util/Timer;

    :cond_0
    return-void
.end method

.method public getEnteredTextLength()I
    .locals 1

    .line 193
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->textSearchBar:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    return v0
.end method

.method public getSelectedItems()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;",
            ">;"
        }
    .end annotation

    .line 376
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->slPopularItemsController:Lcom/shopkick/app/shoppinglists/SLPopularItemsController;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->getSelectedItems()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public hidePicker(Z)V
    .locals 3

    .line 257
    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->isShown:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 258
    iput-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->isShown:Z

    .line 262
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->appScreenRef:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 263
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    goto :goto_0

    :cond_1
    move-object v0, v1

    .line 267
    :goto_0
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->timer:Ljava/util/Timer;

    if-eqz v2, :cond_2

    .line 268
    invoke-virtual {v2}, Ljava/util/Timer;->cancel()V

    .line 269
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->timer:Ljava/util/Timer;

    invoke-virtual {v2}, Ljava/util/Timer;->purge()I

    .line 270
    iput-object v1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->timer:Ljava/util/Timer;

    .line 273
    :cond_2
    iput-object v1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->previousKeyword:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 276
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->hideKeyboard()V

    .line 278
    instance-of v1, v0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;

    if-eqz v1, :cond_3

    .line 279
    check-cast v0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->showHeader(Z)V

    :cond_3
    if-eqz p1, :cond_4

    .line 284
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->context:Landroid/content/Context;

    const v0, 0x7f010021

    invoke-static {p1, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p1

    .line 285
    new-instance v0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$5;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->containerView:Landroid/view/View;

    invoke-direct {v0, p0, v1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$5;-><init>(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;Landroid/view/View;)V

    invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 291
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->containerView:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_1

    .line 293
    :cond_4
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->containerView:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method public isShown()Z
    .locals 1

    .line 189
    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->isShown:Z

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 437
    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->isShown:Z

    if-nez v0, :cond_0

    return-void

    .line 439
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const/4 v0, 0x1

    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 447
    :sswitch_0
    invoke-virtual {p0, v0}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->hidePicker(Z)V

    goto :goto_0

    .line 443
    :sswitch_1
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->clearTextView()V

    goto :goto_0

    .line 451
    :sswitch_2
    invoke-virtual {p0, v0}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->hidePicker(Z)V

    .line 454
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0xde

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 455
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->getEnteredTextLength()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNumCharactersEntered(Ljava/lang/Integer;)V

    .line 456
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x7f090055 -> :sswitch_2
        0x7f09010d -> :sswitch_1
        0x7f090192 -> :sswitch_0
        0x7f090533 -> :sswitch_1
        0x7f090722 -> :sswitch_1
    .end sparse-switch
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 1
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

    const-string v0, "eventReceiveSuggestion"

    .line 556
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "paramSuggestionKeyword"

    .line 557
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string p1, "paramSuggestionList"

    .line 559
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->suggestions:Ljava/util/ArrayList;

    .line 561
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->suggestions:Ljava/util/ArrayList;

    if-nez p1, :cond_0

    .line 562
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->suggestions:Ljava/util/ArrayList;

    .line 566
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->keyword:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->setSuggestionList(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string p2, "eventTaxonomyLoaded"

    .line 568
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 570
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->adapter:Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->notifyDataSetInvalidated()V

    :cond_2
    :goto_0
    return-void
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 412
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->adapter:Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;

    invoke-virtual {p1, p3}, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;

    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->addEntryToCurrentList(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;)V

    .line 413
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->slPopularItemsController:Lcom/shopkick/app/shoppinglists/SLPopularItemsController;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->addSelectedItem()V

    const/4 p1, 0x1

    .line 414
    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->hidePicker(Z)V

    .line 417
    iget-boolean p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->isAddingFromDoneButton:Z

    const/4 p2, 0x0

    if-nez p1, :cond_0

    .line 418
    invoke-direct {p0, p3}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->getLogRecordForAddingSuggestions(I)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object p1

    const/16 p3, 0xdc

    .line 419
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    const/4 p3, 0x4

    .line 420
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 421
    iget-object p3, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p3, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    goto :goto_0

    .line 423
    :cond_0
    iput-boolean p2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->isAddingFromDoneButton:Z

    .line 427
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->textListView:Landroid/widget/ListView;

    invoke-virtual {p1, p2}, Landroid/widget/ListView;->setChoiceMode(I)V

    .line 428
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->textListView:Landroid/widget/ListView;

    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->adapter:Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;

    invoke-virtual {p1, p2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 6

    .line 525
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 p3, 0x0

    if-nez p1, :cond_1

    const/16 p1, 0x42

    if-ne p2, p1, :cond_1

    .line 527
    invoke-direct {p0, p3}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->getLogRecordForAddingSuggestions(I)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object p1

    const/16 p2, 0xdd

    .line 528
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    const/4 p2, 0x4

    .line 529
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 530
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 532
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->keyword:Ljava/lang/String;

    const/4 p2, 0x1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->adapter:Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    .line 534
    iput-boolean p2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->isAddingFromDoneButton:Z

    .line 535
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->textListView:Landroid/widget/ListView;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    goto :goto_0

    .line 539
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->slPopularItemsController:Lcom/shopkick/app/shoppinglists/SLPopularItemsController;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->addSelectedItem()V

    .line 543
    :goto_0
    invoke-virtual {p0, p2}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->hidePicker(Z)V

    return p2

    :cond_1
    return p3
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public setSelectedListInfo(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;)V
    .locals 1

    .line 179
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->selectedListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    .line 180
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->slPopularItemsController:Lcom/shopkick/app/shoppinglists/SLPopularItemsController;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->setSelectedListInfo(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;)V

    if-eqz p1, :cond_0

    .line 184
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->listTitle:Landroid/widget/TextView;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public showPicker(Z)V
    .locals 6

    .line 197
    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->isShown:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 198
    iput-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->isShown:Z

    .line 202
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->appScreenRef:Ljava/lang/ref/WeakReference;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 203
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/screens/AppScreen;

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    const/4 v3, 0x0

    if-eqz v1, :cond_2

    .line 206
    invoke-virtual {v1}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v4

    .line 207
    instance-of v5, v4, Lcom/shopkick/app/activities/HomeActivity;

    if-eqz v5, :cond_2

    .line 208
    check-cast v4, Lcom/shopkick/app/activities/HomeActivity;

    invoke-virtual {v4, v3}, Lcom/shopkick/app/activities/HomeActivity;->setTabSwipeable(Z)V

    .line 213
    :cond_2
    iget-object v4, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->slPopularItemsController:Lcom/shopkick/app/shoppinglists/SLPopularItemsController;

    invoke-virtual {v4}, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->initPopularItems()V

    .line 214
    iget-object v4, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->slPopularItemsController:Lcom/shopkick/app/shoppinglists/SLPopularItemsController;

    invoke-virtual {v4}, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->showPopularItems()V

    .line 215
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->clearTextView()V

    .line 216
    iget-object v4, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->adapter:Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;

    invoke-virtual {v4, v2}, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->setEntryList(Ljava/util/ArrayList;)V

    .line 217
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->adapter:Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;

    invoke-virtual {v2}, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->notifyDataSetChanged()V

    .line 219
    instance-of v2, v1, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 220
    invoke-virtual {v2}, Lcom/shopkick/app/application/ClientFlagsManager;->getClientAppUIFlags()Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 221
    invoke-virtual {v2}, Lcom/shopkick/app/application/ClientFlagsManager;->getClientAppUIFlags()Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    move-result-object v2

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->tabContextOrderOverride:Ljava/util/List;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 222
    invoke-virtual {v2}, Lcom/shopkick/app/application/ClientFlagsManager;->getClientAppUIFlags()Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    move-result-object v2

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->tabContextOrderOverride:Ljava/util/List;

    const-string v4, "lists"

    invoke-interface {v2, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 223
    move-object v2, v1

    check-cast v2, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;

    invoke-virtual {v2, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->hideHeader(Z)V

    :cond_3
    if-eqz p1, :cond_4

    .line 227
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->containerView:Landroid/view/View;

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 228
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->context:Landroid/content/Context;

    const v0, 0x7f01001e

    invoke-static {p1, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p1

    .line 230
    new-instance v0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$4;

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->containerView:Landroid/view/View;

    invoke-direct {v0, p0, v2, v1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$4;-><init>(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;Landroid/view/View;Lcom/shopkick/app/screens/AppScreen;)V

    invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 245
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->containerView:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_1

    .line 247
    :cond_4
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->containerView:Landroid/view/View;

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 248
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->textSearchBar:Landroid/widget/EditText;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setEnabled(Z)V

    if-eqz v1, :cond_5

    .line 250
    invoke-virtual {v1}, Lcom/shopkick/app/screens/AppScreen;->showKeyboard()V

    .line 251
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->textSearchBar:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->requestFocus()Z

    :cond_5
    :goto_1
    return-void
.end method
