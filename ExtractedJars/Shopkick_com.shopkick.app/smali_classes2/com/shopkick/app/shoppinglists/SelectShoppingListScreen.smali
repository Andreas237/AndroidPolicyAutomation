.class public Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "SelectShoppingListScreen.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Landroid/view/View$OnClickListener;


# static fields
.field public static final SELECTED_SHOPPING_LIST_ID:Ljava/lang/String; = "SELECTED_SHOPPING_LIST_ID"

.field public static final SHOPPING_LIST_SELECTED_EVENT:Ljava/lang/String; = "SHOPPING_LIST_SELECTED_EVENT"


# instance fields
.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private isAddScreen:Z

.field private listAddControllerId:J

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private selectedShoppingListId:Ljava/lang/String;

.field private shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

.field private shoppingListEntryId:Ljava/lang/String;

.field private slListController:Lcom/shopkick/app/shoppinglists/SLListController;

.field private targetShoppingListId:Ljava/lang/String;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method static synthetic access$002(Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->targetShoppingListId:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    const p3, 0x7f0c01ac

    const/4 v0, 0x0

    .line 78
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 81
    iget-boolean p2, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->isAddScreen:Z

    if-eqz p2, :cond_0

    const p2, 0x7f11068a

    .line 82
    invoke-virtual {p0, p2}, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->setAppScreenTitle(I)V

    goto :goto_0

    .line 83
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->selectedShoppingListId:Ljava/lang/String;

    if-eqz p2, :cond_1

    const p2, 0x7f1106ad

    .line 84
    invoke-virtual {p0, p2}, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->setAppScreenTitle(I)V

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 86
    invoke-virtual {p0, p2}, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->setAppScreenTitle(Ljava/lang/String;)V

    .line 89
    :goto_0
    new-instance p2, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen$1;

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v4, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iget-object v5, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    const p3, 0x7f0906ae

    .line 93
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    move-object v6, p3

    check-cast v6, Landroid/widget/ListView;

    move-object v0, p2

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen$1;-><init>(Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Lcom/shopkick/app/logging/UserEventLogger;Landroid/widget/ListView;)V

    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->slListController:Lcom/shopkick/app/shoppinglists/SLListController;

    .line 99
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->slListController:Lcom/shopkick/app/shoppinglists/SLListController;

    iget-object p3, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->selectedShoppingListId:Ljava/lang/String;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/shoppinglists/SLListController;->setShoppingListId(Ljava/lang/String;)V

    .line 100
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->slListController:Lcom/shopkick/app/shoppinglists/SLListController;

    invoke-virtual {p2}, Lcom/shopkick/app/shoppinglists/SLListController;->updateList()V

    .line 102
    iget-boolean p2, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->isAddScreen:Z

    const p3, 0x7f090192

    if-eqz p2, :cond_2

    .line 103
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    const v0, 0x7f11068f

    invoke-virtual {p2, v0}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    .line 105
    :cond_2
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

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

    .line 46
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 47
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 48
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    .line 49
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    const-string p1, "current_shopping_list_id"

    .line 51
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->selectedShoppingListId:Ljava/lang/String;

    .line 52
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->selectedShoppingListId:Ljava/lang/String;

    if-nez p1, :cond_0

    .line 53
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSelectedShoppingList()Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 55
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->selectedShoppingListId:Ljava/lang/String;

    :cond_0
    const-string/jumbo p1, "shopping_list_entry_id"

    .line 59
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->shoppingListEntryId:Ljava/lang/String;

    .line 60
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->selectedShoppingListId:Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->targetShoppingListId:Ljava/lang/String;

    const-string p1, "SELECT_SHOPPING_LIST_SCREEN_IS_ADD"

    .line 62
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->isAddScreen:Z

    const-string p1, "PARAM_LIST_ADD_CONTROLLER_ID"

    .line 63
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string p1, "PARAM_LIST_ADD_CONTROLLER_ID"

    .line 64
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->listAddControllerId:J

    goto :goto_0

    :cond_1
    const-wide/16 p1, -0x1

    .line 66
    iput-wide p1, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->listAddControllerId:J

    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 130
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 132
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7f090192

    if-ne p1, v0, :cond_2

    .line 133
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->targetShoppingListId:Ljava/lang/String;

    if-eqz p1, :cond_1

    .line 134
    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->isAddScreen:Z

    const/16 v1, 0xee

    if-eqz v0, :cond_0

    .line 136
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "SELECTED_SHOPPING_LIST_ID"

    .line 137
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->targetShoppingListId:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "PARAM_LIST_ADD_CONTROLLER_ID"

    .line 138
    iget-wide v2, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->listAddControllerId:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "SHOPPING_LIST_SELECTED_EVENT"

    invoke-virtual {v0, v2, p1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 142
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x46

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 143
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->targetShoppingListId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setShoppingListId(Ljava/lang/String;)V

    .line 144
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void

    .line 147
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->selectedShoppingListId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 149
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->selectedShoppingListId:Ljava/lang/String;

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->targetShoppingListId:Ljava/lang/String;

    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {p1, v0, v2, v3}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->moveShoppingListEntry(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x40

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 155
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->targetShoppingListId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setShoppingListId(Ljava/lang/String;)V

    .line 156
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 160
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->popScreen()V

    :cond_2
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 113
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 0
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

    return-void
.end method

.method public updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 1

    .line 72
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 73
    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;->isAddScreen:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setIsAddingItem(Ljava/lang/Boolean;)V

    return-void
.end method
