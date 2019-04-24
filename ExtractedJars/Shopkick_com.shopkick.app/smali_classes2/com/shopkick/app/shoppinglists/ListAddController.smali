.class public Lcom/shopkick/app/shoppinglists/ListAddController;
.super Ljava/lang/Object;
.source "ListAddController.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;,
        Lcom/shopkick/app/shoppinglists/ListAddController$ItemExistsDialogClickListener;
    }
.end annotation


# static fields
.field public static final EVENT_LIST_ADD_CONTROLLER_ITEM_ADDED:Ljava/lang/String; = "EVENT_LIST_ADD_CONTROLLER_ITEM_ADDED"

.field private static final NEXT_ID:Ljava/util/concurrent/atomic/AtomicLong;

.field public static final PARAM_LIST_ADD_CONTROLLER_ADDED_ITEM_ID:Ljava/lang/String; = "PARAM_LIST_ADD_CONTROLLER_ADDED_ITEM_ID"

.field public static final PARAM_LIST_ADD_CONTROLLER_ID:Ljava/lang/String; = "PARAM_LIST_ADD_CONTROLLER_ID"

.field public static final SELECT_SHOPPING_LIST_SCREEN_IS_ADD:Ljava/lang/String; = "SELECT_SHOPPING_LIST_SCREEN_IS_ADD"


# instance fields
.field private final OBJECT_ID:J

.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private appScreenWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field

.field private final clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private entriesToAdd:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;",
            ">;"
        }
    .end annotation
.end field

.field private entryToAdd:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

.field private eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private parentEntryId:Ljava/lang/String;

.field private productFamilyIdsToShoppingListEntryIds:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;",
            ">;"
        }
    .end annotation
.end field

.field private productIdsToShoppingListEntryIds:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;",
            ">;"
        }
    .end annotation
.end field

.field private shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

.field private shoppingListId:Ljava/lang/String;

.field private shoppingListSyncAlertController:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 41
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    sput-object v0, Lcom/shopkick/app/shoppinglists/ListAddController;->NEXT_ID:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/util/NotificationCenter;Ljava/lang/ref/WeakReference;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/logging/UserEventLogger;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;",
            "Lcom/shopkick/app/url/URLDispatcher;",
            "Lcom/shopkick/app/application/dialog/DialogsManager;",
            "Lcom/shopkick/app/application/AppActivityManager;",
            "Lcom/shopkick/app/util/NotificationCenter;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;",
            "Lcom/shopkick/app/application/ClientFlagsManager;",
            "Lcom/shopkick/app/logging/UserEventLogger;",
            ")V"
        }
    .end annotation

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    sget-object v0, Lcom/shopkick/app/shoppinglists/ListAddController;->NEXT_ID:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->OBJECT_ID:J

    .line 56
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->entriesToAdd:Ljava/util/ArrayList;

    .line 76
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    .line 77
    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 78
    iput-object p3, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 79
    iput-object p4, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 80
    iput-object p5, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 81
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->productIdsToShoppingListEntryIds:Ljava/util/HashMap;

    .line 82
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->productFamilyIdsToShoppingListEntryIds:Ljava/util/HashMap;

    .line 83
    iput-object p6, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    .line 84
    iput-object p7, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 85
    iput-object p8, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    const-string p1, "SHOPPING_LIST_SELECTED_EVENT"

    .line 87
    invoke-virtual {p5, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/shoppinglists/ListAddController;)Lcom/shopkick/app/application/AppActivityManager;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/shoppinglists/ListAddController;)Lcom/shopkick/app/logging/UserEventLogger;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/shoppinglists/ListAddController;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;Ljava/lang/String;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/shoppinglists/ListAddController;->addEntryToList(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;Ljava/lang/String;)V

    return-void
.end method

.method private addEntryToList(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;Ljava/lang/String;)V
    .locals 9

    .line 370
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-virtual {v0, p2, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getExistingEntry(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 374
    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->number:Ljava/lang/Double;

    .line 375
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    move-object v7, v0

    move-object v8, v2

    goto :goto_0

    :cond_0
    move-object v7, v1

    move-object v8, v7

    .line 382
    :goto_0
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productFamilyId:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 383
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productFamilyId:Ljava/lang/String;

    .line 384
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->productFamilyIdsToShoppingListEntryIds:Ljava/util/HashMap;

    goto :goto_1

    .line 386
    :cond_1
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productId:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 387
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productId:Ljava/lang/String;

    .line 388
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->productIdsToShoppingListEntryIds:Ljava/util/HashMap;

    goto :goto_1

    :cond_2
    move-object v0, v1

    .line 393
    :goto_1
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-virtual {v2, p2, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->addShoppingListEntry(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object p1

    if-eqz v1, :cond_3

    .line 396
    new-instance v2, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;

    iget-object v5, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    move-object v3, v2

    move-object v4, p0

    move-object v6, p2

    invoke-direct/range {v3 .. v8}, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;-><init>(Lcom/shopkick/app/shoppinglists/ListAddController;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string p2, "PARAM_LIST_ADD_CONTROLLER_ADDED_ITEM_ID"

    .line 404
    invoke-virtual {p1, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "EVENT_LIST_ADD_CONTROLLER_ITEM_ADDED"

    invoke-virtual {p2, v0, p1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    :cond_3
    return-void
.end method

.method private checkListSyncDone()Z
    .locals 11

    .line 410
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSelectedShoppingList()Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    move-result-object v0

    if-nez v0, :cond_3

    .line 411
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->shoppingListSyncAlertController:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    if-nez v0, :cond_2

    .line 415
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 416
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    .line 420
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c01af

    .line 422
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getView()Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    const/4 v4, 0x0

    .line 421
    invoke-virtual {v1, v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 424
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getView()Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 426
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getView()Landroid/view/View;

    move-result-object v0

    const v2, 0x7f090055

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    move-object v3, v1

    goto :goto_1

    :cond_1
    move-object v3, v1

    move-object v9, v3

    .line 429
    :goto_1
    new-instance v0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    iget-object v4, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v5, 0x1

    iget-object v6, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v7, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    const/4 v8, 0x0

    iget-object v10, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    move-object v2, v0

    invoke-direct/range {v2 .. v10}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;-><init>(Landroid/view/View;Lcom/shopkick/app/application/dialog/DialogsManager;ZLcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Landroid/view/View;Landroid/view/View;Lcom/shopkick/app/logging/UserEventLogger;)V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->shoppingListSyncAlertController:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    .line 438
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->shoppingListSyncAlertController:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->checkListSyncingDone()Z

    move-result v0

    return v0

    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method private maybeAddEntriesToList(Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 268
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 269
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 271
    invoke-direct {p0, v3, p2, v1}, Lcom/shopkick/app/shoppinglists/ListAddController;->maybeAddEntryToList(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;Ljava/lang/String;Z)Z

    move-result v4

    if-nez v4, :cond_1

    .line 274
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    if-nez v2, :cond_3

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    move v2, v1

    goto :goto_0

    :cond_3
    :goto_1
    const/4 v2, 0x1

    goto :goto_0

    :cond_4
    if-nez v2, :cond_5

    .line 280
    new-instance p1, Landroid/app/AlertDialog$Builder;

    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {p2}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const p2, 0x7f1106ab

    .line 281
    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    const p2, 0x7f1106aa

    .line 282
    new-instance v0, Lcom/shopkick/app/shoppinglists/ListAddController$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/shoppinglists/ListAddController$1;-><init>(Lcom/shopkick/app/shoppinglists/ListAddController;)V

    invoke-virtual {p1, p2, v0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 288
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    goto :goto_4

    .line 292
    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 294
    invoke-virtual {p0, v0, p2}, Lcom/shopkick/app/shoppinglists/ListAddController;->getDuplicatedEntryFromList(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 300
    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productFamilyId:Ljava/lang/String;

    invoke-static {v2}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_7

    .line 301
    iget-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productFamilyId:Ljava/lang/String;

    .line 302
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->productFamilyIdsToShoppingListEntryIds:Ljava/util/HashMap;

    goto :goto_3

    .line 304
    :cond_7
    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productId:Ljava/lang/String;

    invoke-static {v2}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_8

    .line 305
    iget-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productId:Ljava/lang/String;

    .line 306
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->productIdsToShoppingListEntryIds:Ljava/util/HashMap;

    goto :goto_3

    :cond_8
    move-object v0, v3

    :goto_3
    if-eqz v3, :cond_6

    .line 312
    new-instance v2, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;

    iget-object v6, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v4, v2

    move-object v5, p0

    move-object v7, p2

    invoke-direct/range {v4 .. v9}, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;-><init>(Lcom/shopkick/app/shoppinglists/ListAddController;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;)V

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "PARAM_LIST_ADD_CONTROLLER_ADDED_ITEM_ID"

    .line 320
    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "EVENT_LIST_ADD_CONTROLLER_ITEM_ADDED"

    invoke-virtual {v1, v2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    goto :goto_2

    .line 326
    :cond_9
    :goto_4
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->entriesToAdd:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method private maybeAddEntryToList(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;Ljava/lang/String;Z)Z
    .locals 3

    const/4 v0, 0x0

    .line 330
    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->entryToAdd:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 335
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v1

    if-nez v1, :cond_1

    return v0

    .line 339
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/shoppinglists/ListAddController;->getDuplicatedEntryFromList(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object v1

    if-eqz v1, :cond_4

    if-eqz p3, :cond_3

    .line 342
    new-instance p3, Lcom/shopkick/app/shoppinglists/ListAddController$ItemExistsDialogClickListener;

    invoke-direct {p3, p0, p1, p2}, Lcom/shopkick/app/shoppinglists/ListAddController$ItemExistsDialogClickListener;-><init>(Lcom/shopkick/app/shoppinglists/ListAddController;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;Ljava/lang/String;)V

    .line 343
    new-instance p2, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v1

    invoke-direct {p2, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 346
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->unit:Ljava/lang/Integer;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result p1

    const v1, 0x7f1106aa

    const v2, 0x7f1106ab

    if-eqz p1, :cond_2

    .line 347
    invoke-virtual {p2, v2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 348
    invoke-virtual {p2, v1, p3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    goto :goto_0

    .line 350
    :cond_2
    invoke-virtual {p2, v2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    const p1, 0x7f1106a9

    .line 351
    invoke-virtual {p2, p1, p3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 352
    invoke-virtual {p2, v1, p3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 355
    :goto_0
    invoke-virtual {p2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    :cond_3
    return v0

    .line 360
    :cond_4
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/shoppinglists/ListAddController;->addEntryToList(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;Ljava/lang/String;)V

    .line 361
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object p1

    instance-of p1, p1, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;

    if-eqz p1, :cond_5

    .line 362
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->popScreen()V

    :cond_5
    const/4 p1, 0x1

    return p1
.end method

.method private showListSelectorScreen()V
    .locals 4

    .line 207
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "SELECT_SHOPPING_LIST_SCREEN_IS_ADD"

    const/4 v2, 0x1

    .line 208
    invoke-static {v2}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "PARAM_LIST_ADD_CONTROLLER_ID"

    .line 210
    iget-wide v2, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->OBJECT_ID:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    new-instance v1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v2, Lcom/shopkick/app/activities/DetailsActivity;

    const-class v3, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;

    invoke-direct {v1, v2, v3, v0}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 212
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {v1}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;Ljava/util/Map;)Z

    return-void
.end method


# virtual methods
.method public addEntry(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)V
    .locals 4

    .line 172
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-static {v0, v1}, Lcom/shopkick/app/shoppinglists/SLUtils;->isNewModificationCreatable(Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 174
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ListAddController;->checkListSyncDone()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 177
    :cond_1
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productId:Ljava/lang/String;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/shoppinglists/ListAddController;->hasBeenAdded(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 178
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productId:Ljava/lang/String;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p0, v0, p1}, Lcom/shopkick/app/shoppinglists/ListAddController;->undoEntryAddition(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 182
    :cond_2
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->entryToAdd:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 184
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSelectedShoppingList()Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    move-result-object v0

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    .line 187
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->parentEntryId:Ljava/lang/String;

    if-eqz v1, :cond_3

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->shoppingListId:Ljava/lang/String;

    if-eqz v2, :cond_3

    .line 188
    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-virtual {v3, v2, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingListEntry(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 191
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->shoppingListId:Ljava/lang/String;

    .line 192
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->parentEntryId:Ljava/lang/String;

    iput-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    .line 193
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    iput-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    .line 197
    :cond_3
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-virtual {v1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingListCount()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_4

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    if-nez v1, :cond_4

    .line 198
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ListAddController;->showListSelectorScreen()V

    goto :goto_0

    .line 201
    :cond_4
    invoke-direct {p0, p1, v0, v2}, Lcom/shopkick/app/shoppinglists/ListAddController;->maybeAddEntryToList(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;Ljava/lang/String;Z)Z

    :goto_0
    return-void
.end method

.method public addProductOrScanListEntry(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 156
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;-><init>()V

    .line 157
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productId:Ljava/lang/String;

    .line 158
    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productFamilyId:Ljava/lang/String;

    .line 159
    iput-object p3, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->title:Ljava/lang/String;

    const/4 p1, 0x1

    .line 160
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    .line 161
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object p3, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->ENTRY_ID_PREFIX:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    .line 162
    invoke-virtual {p3}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getUniqueNumericString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    .line 163
    iput-object p4, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    .line 164
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    invoke-direct {p2}, Lcom/shopkick/app/fetchers/api/skapi/Quantity;-><init>()V

    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    .line 165
    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->unit:Ljava/lang/Integer;

    .line 166
    iget-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    const-wide/high16 p2, 0x3ff0000000000000L    # 1.0

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->number:Ljava/lang/Double;

    .line 168
    invoke-virtual {p0, v0}, Lcom/shopkick/app/shoppinglists/ListAddController;->addEntry(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)V

    return-void
.end method

.method public clear()V
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->productIdsToShoppingListEntryIds:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 100
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->productFamilyIdsToShoppingListEntryIds:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 101
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->entriesToAdd:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    .line 102
    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->entryToAdd:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    return-void
.end method

.method public destroy()V
    .locals 1

    .line 91
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ListAddController;->clear()V

    .line 92
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 93
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->shoppingListSyncAlertController:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    if-eqz v0, :cond_0

    .line 94
    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->destroy()V

    :cond_0
    return-void
.end method

.method public getDuplicatedEntryFromList(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;
    .locals 2

    .line 112
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productFamilyId:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 113
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productFamilyId:Ljava/lang/String;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v0, p2, v1, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingListEntryWithProductFamilyId(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object p1

    return-object p1

    .line 116
    :cond_0
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productId:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 117
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productId:Ljava/lang/String;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v0, p2, v1, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingListEntryWithProductId(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public getShoppingListEntryInfoForProductId(Ljava/lang/String;)Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->productIdsToShoppingListEntryIds:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 126
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->productIdsToShoppingListEntryIds:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public hasBeenAdded(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    if-eqz p1, :cond_0

    .line 106
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->productIdsToShoppingListEntryIds:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->productFamilyIdsToShoppingListEntryIds:Ljava/util/HashMap;

    .line 107
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    return p1
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

    .line 479
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0x43518040

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "SHOPPING_LIST_SELECTED_EVENT"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, -0x1

    :goto_1
    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    const-string p1, "PARAM_LIST_ADD_CONTROLLER_ID"

    .line 481
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    .line 482
    iget-wide v2, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->OBJECT_ID:J

    cmp-long p1, v2, v0

    if-nez p1, :cond_4

    const-string p1, "SELECTED_SHOPPING_LIST_ID"

    .line 484
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 485
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->entryToAdd:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    if-eqz p2, :cond_3

    const/4 v0, 0x1

    .line 486
    invoke-direct {p0, p2, p1, v0}, Lcom/shopkick/app/shoppinglists/ListAddController;->maybeAddEntryToList(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;Ljava/lang/String;Z)Z

    goto :goto_2

    .line 488
    :cond_3
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->entriesToAdd:Ljava/util/ArrayList;

    invoke-direct {p0, p2, p1}, Lcom/shopkick/app/shoppinglists/ListAddController;->maybeAddEntriesToList(Ljava/util/ArrayList;Ljava/lang/String;)V

    :cond_4
    :goto_2
    return-void
.end method

.method public setProductAdded(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 140
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->productIdsToShoppingListEntryIds:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 141
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->productIdsToShoppingListEntryIds:Ljava/util/HashMap;

    new-instance v1, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;

    invoke-direct {v1, p0, p2, p3}, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;-><init>(Lcom/shopkick/app/shoppinglists/ListAddController;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public setProductFamilyAdded(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 146
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->productFamilyIdsToShoppingListEntryIds:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 147
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->productFamilyIdsToShoppingListEntryIds:Ljava/util/HashMap;

    new-instance v1, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;

    invoke-direct {v1, p0, p2, p3}, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;-><init>(Lcom/shopkick/app/shoppinglists/ListAddController;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public setShoppingListId(Ljava/lang/String;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->shoppingListId:Ljava/lang/String;

    return-void
.end method

.method public setShoppingListParentEntryId(Ljava/lang/String;)V
    .locals 0

    .line 136
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->parentEntryId:Ljava/lang/String;

    return-void
.end method

.method public undoEntryAddition(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 217
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 218
    invoke-static {p2}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 219
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->productFamilyIdsToShoppingListEntryIds:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;

    const-string v1, "PARAM_LIST_ADD_CONTROLLER_ADDED_ITEM_ID"

    .line 220
    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 221
    :cond_0
    invoke-static {p1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 222
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->productIdsToShoppingListEntryIds:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;

    const-string v1, "PARAM_LIST_ADD_CONTROLLER_ADDED_ITEM_ID"

    .line 223
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object p1, p2

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_5

    .line 228
    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;->getPreviousQuantityNumber()Ljava/lang/Double;

    move-result-object p2

    .line 229
    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;->getPreviousState()Ljava/lang/Integer;

    move-result-object v1

    .line 232
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;->access$000(Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;)Ljava/lang/String;

    move-result-object v3

    .line 233
    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;->access$100(Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;)Ljava/lang/String;

    move-result-object v4

    .line 232
    invoke-virtual {v2, v3, v4}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingListEntry(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object v2

    if-nez v2, :cond_2

    return-void

    :cond_2
    if-nez p2, :cond_3

    if-nez v1, :cond_3

    .line 237
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;->access$000(Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;)Ljava/lang/String;

    move-result-object v1

    .line 238
    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;->access$100(Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;)Ljava/lang/String;

    move-result-object p1

    .line 237
    invoke-virtual {p2, v1, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->deleteShoppingListEntry(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    if-eqz v1, :cond_4

    .line 242
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;->access$000(Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;)Ljava/lang/String;

    move-result-object v3

    .line 243
    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;->access$100(Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x2

    .line 244
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    .line 242
    invoke-virtual {v2, v3, v4, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->toggleShoppingListEntryCompletion(Ljava/lang/String;Ljava/lang/String;Z)V

    :cond_4
    if-eqz p2, :cond_5

    .line 249
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;->access$000(Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;)Ljava/lang/String;

    move-result-object v2

    .line 250
    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;->access$100(Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;)Ljava/lang/String;

    move-result-object p1

    .line 251
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    .line 249
    invoke-virtual {v1, v2, p1, v3, v4}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->updateShoppingListEntryQuantity(Ljava/lang/String;Ljava/lang/String;D)V

    .line 256
    :cond_5
    :goto_1
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "EVENT_LIST_ADD_CONTROLLER_ITEM_ADDED"

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 259
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string p2, "paramBadgeContextName"

    const-string v0, "lists"

    .line 260
    invoke-virtual {p1, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/ListAddController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "EventBadgeHide"

    invoke-virtual {p2, v0, p1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    return-void
.end method
