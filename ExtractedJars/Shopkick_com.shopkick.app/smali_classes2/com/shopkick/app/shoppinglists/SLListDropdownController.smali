.class public abstract Lcom/shopkick/app/shoppinglists/SLListDropdownController;
.super Ljava/lang/Object;
.source "SLListDropdownController.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private ANIMATION_DURATION_MS:I

.field private containerView:Landroid/view/View;

.field private currentListId:Ljava/lang/String;

.field private currentListTitle:Ljava/lang/String;

.field private dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private doneButton:Landroid/view/View;

.field private dropdownView:Landroid/view/View;

.field private eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

.field private headerView:Landroid/view/View;

.field private isShown:Z

.field private listInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

.field private listView:Landroid/widget/ListView;

.field private moreButton:Landroid/view/View;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private optionsList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;",
            ">;"
        }
    .end annotation
.end field

.field private shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

.field private slListController:Lcom/shopkick/app/shoppinglists/SLListController;

.field private slNamingDialog:Lcom/shopkick/app/shoppinglists/SLNamingDialog;

.field private slOptionsDialog:Lcom/shopkick/app/shoppinglists/SLOptionsDialog;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Lcom/shopkick/app/logging/UserEventLogger;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V
    .locals 7

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x12c

    .line 42
    iput v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->ANIMATION_DURATION_MS:I

    .line 73
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 74
    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 75
    iput-object p3, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    .line 76
    iput-object p4, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 78
    iput-object p5, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->containerView:Landroid/view/View;

    .line 79
    iput-object p6, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->headerView:Landroid/view/View;

    .line 80
    iput-object p7, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->dropdownView:Landroid/view/View;

    const p5, 0x7f0906ae

    .line 81
    invoke-virtual {p7, p5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p5

    check-cast p5, Landroid/widget/ListView;

    iput-object p5, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->listView:Landroid/widget/ListView;

    const p5, 0x7f090224

    .line 82
    invoke-virtual {p6, p5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p5

    iput-object p5, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->doneButton:Landroid/view/View;

    const p5, 0x7f090486

    .line 83
    invoke-virtual {p6, p5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p5

    iput-object p5, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->moreButton:Landroid/view/View;

    .line 85
    new-instance p5, Lcom/shopkick/app/shoppinglists/SLListDropdownController$1;

    iget-object v6, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->listView:Landroid/widget/ListView;

    move-object v0, p5

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/shoppinglists/SLListDropdownController$1;-><init>(Lcom/shopkick/app/shoppinglists/SLListDropdownController;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Lcom/shopkick/app/logging/UserEventLogger;Landroid/widget/ListView;)V

    iput-object p5, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->slListController:Lcom/shopkick/app/shoppinglists/SLListController;

    .line 97
    invoke-virtual {p6, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 98
    invoke-virtual {p7, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 99
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->moreButton:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 100
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->doneButton:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 103
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->optionsList:Ljava/util/ArrayList;

    .line 104
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->optionsList:Ljava/util/ArrayList;

    new-instance p3, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;

    sget-object p4, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;->TEXT:Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;

    const p5, 0x7f1106ac

    invoke-direct {p3, p5, p4}, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;-><init>(ILcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;)V

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->optionsList:Ljava/util/ArrayList;

    new-instance p3, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;

    sget-object p4, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;->TEXT:Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;

    const p5, 0x7f1106b2

    invoke-direct {p3, p5, p4}, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;-><init>(ILcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;)V

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->optionsList:Ljava/util/ArrayList;

    new-instance p3, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;

    sget-object p4, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;->TEXT:Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;

    const p5, 0x7f110699

    invoke-direct {p3, p5, p4}, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;-><init>(ILcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;)V

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->doneButton:Landroid/view/View;

    const/16 p3, 0x8

    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    .line 110
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->moreButton:Landroid/view/View;

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    const-string p1, "eventShoppingListRenamed"

    .line 113
    invoke-virtual {p2, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "eventShoppingListCreatedFinished"

    .line 114
    invoke-virtual {p2, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/shoppinglists/SLListDropdownController;)Landroid/widget/ListView;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->listView:Landroid/widget/ListView;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/shoppinglists/SLListDropdownController;)Landroid/view/View;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->doneButton:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/shoppinglists/SLListDropdownController;)Landroid/view/View;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->dropdownView:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/shoppinglists/SLListDropdownController;)Lcom/shopkick/app/application/dialog/DialogsManager;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/shoppinglists/SLListDropdownController;)Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/shoppinglists/SLListDropdownController;Landroid/view/View;Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;Ljava/util/HashMap;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->onDialogItemClick(Landroid/view/View;Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;Ljava/util/HashMap;)V

    return-void
.end method

.method static synthetic access$600(Lcom/shopkick/app/shoppinglists/SLListDropdownController;)Lcom/shopkick/app/logging/UserEventLogger;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    return-object p0
.end method

.method static synthetic access$700(Lcom/shopkick/app/shoppinglists/SLListDropdownController;)Lcom/shopkick/app/shoppinglists/SLNamingDialog;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->slNamingDialog:Lcom/shopkick/app/shoppinglists/SLNamingDialog;

    return-object p0
.end method

.method static synthetic access$800(Lcom/shopkick/app/shoppinglists/SLListDropdownController;)Ljava/lang/String;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->currentListTitle:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$900(Lcom/shopkick/app/shoppinglists/SLListDropdownController;)Ljava/lang/String;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->currentListId:Ljava/lang/String;

    return-object p0
.end method

.method private animateArrow()V
    .locals 9

    .line 230
    new-instance v7, Landroid/view/animation/RotateAnimation;

    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->isShown:Z

    const/high16 v1, 0x43b40000    # 360.0f

    const/high16 v2, 0x43340000    # 180.0f

    if-eqz v0, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->isShown:Z

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    const/4 v4, 0x1

    const/high16 v5, 0x3f000000    # 0.5f

    const/4 v6, 0x1

    const/high16 v8, 0x3f000000    # 0.5f

    move-object v0, v7

    move v1, v3

    move v3, v4

    move v4, v5

    move v5, v6

    move v6, v8

    invoke-direct/range {v0 .. v6}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    .line 236
    iget v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->ANIMATION_DURATION_MS:I

    int-to-long v0, v0

    invoke-virtual {v7, v0, v1}, Landroid/view/animation/RotateAnimation;->setDuration(J)V

    const/4 v0, 0x1

    .line 237
    invoke-virtual {v7, v0}, Landroid/view/animation/RotateAnimation;->setFillAfter(Z)V

    .line 238
    invoke-virtual {v7, v0}, Landroid/view/animation/RotateAnimation;->setFillEnabled(Z)V

    .line 240
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->headerView:Landroid/view/View;

    const v1, 0x7f090227

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public static synthetic lambda$onDialogItemClick$224(Lcom/shopkick/app/shoppinglists/SLListDropdownController;Ljava/lang/ref/WeakReference;)V
    .locals 2

    .line 360
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->currentListId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->deleteShoppingList(Ljava/lang/String;)V

    .line 362
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    const/16 v1, 0xe3

    .line 363
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    const/4 v1, 0x4

    .line 364
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 365
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->currentListId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setShoppingListId(Ljava/lang/String;)V

    .line 366
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 367
    invoke-static {p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hideIfNotNull(Ljava/lang/ref/WeakReference;)V

    return-void
.end method

.method private logDropdownClick(Z)V
    .locals 3

    .line 321
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0xdf

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 322
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setIsExpanded(Ljava/lang/Boolean;)V

    .line 323
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->currentListId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setShoppingListId(Ljava/lang/String;)V

    .line 324
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method private onDialogItemClick(Landroid/view/View;Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;Ljava/util/HashMap;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 328
    iget p1, p2, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;->resId:I

    const p2, 0x7f110699

    const/16 p3, 0xe2

    if-eq p1, p2, :cond_2

    const p2, 0x7f1106ac

    if-eq p1, p2, :cond_1

    const p2, 0x7f1106b2

    if-eq p1, p2, :cond_0

    goto/16 :goto_0

    .line 381
    :cond_0
    new-instance p1, Lcom/shopkick/app/shoppinglists/SLListDropdownController$6;

    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->headerView:Landroid/view/View;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->currentListTitle:Ljava/lang/String;

    invoke-direct {p1, p0, p2, v0, v1}, Lcom/shopkick/app/shoppinglists/SLListDropdownController$6;-><init>(Lcom/shopkick/app/shoppinglists/SLListDropdownController;Lcom/shopkick/app/util/NotificationCenter;Landroid/view/View;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->slNamingDialog:Lcom/shopkick/app/shoppinglists/SLNamingDialog;

    .line 392
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->slNamingDialog:Lcom/shopkick/app/shoppinglists/SLNamingDialog;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->show()V

    .line 395
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/16 p3, 0x3b

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 396
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->currentListId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setShoppingListId(Ljava/lang/String;)V

    .line 397
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    goto :goto_0

    .line 330
    :cond_1
    new-instance p1, Lcom/shopkick/app/shoppinglists/SLListDropdownController$5;

    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->headerView:Landroid/view/View;

    invoke-direct {p1, p0, p2, v0}, Lcom/shopkick/app/shoppinglists/SLListDropdownController$5;-><init>(Lcom/shopkick/app/shoppinglists/SLListDropdownController;Lcom/shopkick/app/util/NotificationCenter;Landroid/view/View;)V

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->slNamingDialog:Lcom/shopkick/app/shoppinglists/SLNamingDialog;

    .line 345
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->slNamingDialog:Lcom/shopkick/app/shoppinglists/SLNamingDialog;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->show()V

    .line 348
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/16 p3, 0x3a

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 349
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    goto :goto_0

    .line 355
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    const p2, 0x7f110698

    .line 357
    invoke-virtual {p1, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getString(I)Ljava/lang/String;

    move-result-object v3

    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    const p2, 0x7f110693

    .line 358
    invoke-virtual {p1, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/shopkick/app/shoppinglists/-$$Lambda$SLListDropdownController$X4iygqiEfjI84yxvLD2PnrqqrSE;

    invoke-direct {v5, p0}, Lcom/shopkick/app/shoppinglists/-$$Lambda$SLListDropdownController$X4iygqiEfjI84yxvLD2PnrqqrSE;-><init>(Lcom/shopkick/app/shoppinglists/SLListDropdownController;)V

    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    const p2, 0x7f110692

    .line 369
    invoke-virtual {p1, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getString(I)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lcom/shopkick/app/shoppinglists/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;->INSTANCE:Lcom/shopkick/app/shoppinglists/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;

    const/4 v8, 0x0

    .line 355
    invoke-virtual/range {v0 .. v8}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogConfirmOrDeny(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    .line 374
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/16 p3, 0x3c

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 375
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->currentListId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setShoppingListId(Ljava/lang/String;)V

    .line 376
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 402
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->slOptionsDialog:Lcom/shopkick/app/shoppinglists/SLOptionsDialog;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/SLOptionsDialog;->dismiss()V

    return-void
.end method

.method private updateHeader()V
    .locals 2

    .line 263
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->listInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->currentListId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->listInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->name:Ljava/lang/String;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->currentListTitle:Ljava/lang/String;

    .line 264
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 266
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->listInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->currentListId:Ljava/lang/String;

    .line 267
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->listInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->name:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->currentListTitle:Ljava/lang/String;

    .line 269
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->headerView:Landroid/view/View;

    const v1, 0x7f09076e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->currentListTitle:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method private updateListHeight()V
    .locals 3

    const/4 v0, 0x2

    .line 245
    new-array v0, v0, [I

    .line 246
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->headerView:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 249
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->slListController:Lcom/shopkick/app/shoppinglists/SLListController;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/SLListController;->getSumRowHeight()I

    move-result v0

    .line 250
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->containerView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->headerView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->dropdownView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->dropdownView:Landroid/view/View;

    .line 251
    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    .line 253
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->listView:Landroid/widget/ListView;

    invoke-virtual {v2}, Landroid/widget/ListView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/FrameLayout$LayoutParams;

    if-gt v0, v1, :cond_0

    .line 255
    iput v0, v2, Landroid/widget/FrameLayout$LayoutParams;->height:I

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    .line 257
    iput v0, v2, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 259
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->listView:Landroid/widget/ListView;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 0

    .line 118
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->dismissDialogs()V

    return-void
.end method

.method public dismissDialogs()V
    .locals 2

    .line 126
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->slOptionsDialog:Lcom/shopkick/app/shoppinglists/SLOptionsDialog;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/SLOptionsDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 127
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->slOptionsDialog:Lcom/shopkick/app/shoppinglists/SLOptionsDialog;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/SLOptionsDialog;->dismiss()V

    .line 128
    iput-object v1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->slOptionsDialog:Lcom/shopkick/app/shoppinglists/SLOptionsDialog;

    .line 130
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->slNamingDialog:Lcom/shopkick/app/shoppinglists/SLNamingDialog;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 131
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->slNamingDialog:Lcom/shopkick/app/shoppinglists/SLNamingDialog;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->dismiss()V

    .line 132
    iput-object v1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->slNamingDialog:Lcom/shopkick/app/shoppinglists/SLNamingDialog;

    :cond_1
    return-void
.end method

.method public hideDropdown()V
    .locals 6

    .line 194
    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->isShown:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 195
    iput-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->isShown:Z

    .line 198
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->listView:Landroid/widget/ListView;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setEnabled(Z)V

    .line 200
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->dropdownView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f01002e

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 201
    new-instance v1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 202
    iget v1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->ANIMATION_DURATION_MS:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 204
    new-instance v1, Landroid/view/animation/AlphaAnimation;

    const/high16 v2, 0x3f800000    # 1.0f

    const v3, 0x3dcccccd    # 0.1f

    invoke-direct {v1, v2, v3}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 205
    iget v2, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->ANIMATION_DURATION_MS:I

    int-to-long v4, v2

    invoke-virtual {v1, v4, v5}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 206
    new-instance v2, Lcom/shopkick/app/shoppinglists/SLListDropdownController$3;

    invoke-direct {v2, p0}, Lcom/shopkick/app/shoppinglists/SLListDropdownController$3;-><init>(Lcom/shopkick/app/shoppinglists/SLListDropdownController;)V

    invoke-virtual {v1, v2}, Landroid/view/animation/AlphaAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 223
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->animateArrow()V

    .line 224
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->dropdownView:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 225
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->listView:Landroid/widget/ListView;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 226
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->doneButton:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    iget v1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->ANIMATION_DURATION_MS:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void
.end method

.method public isShown()Z
    .locals 1

    .line 122
    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->isShown:Z

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 278
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f090224

    const/4 v2, 0x0

    if-eq v0, v1, :cond_4

    const v1, 0x7f090423

    const/4 v3, 0x1

    if-eq v0, v1, :cond_2

    const v1, 0x7f090486

    if-eq v0, v1, :cond_0

    const p1, 0x7f0906af

    if-eq v0, p1, :cond_4

    goto :goto_1

    .line 297
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->optionsList:Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-virtual {v1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingListCount()I

    move-result v1

    if-gt v1, v3, :cond_1

    const-wide/16 v1, 0x0

    goto :goto_0

    :cond_1
    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;->rowStatus:Ljava/lang/Double;

    .line 300
    new-instance v0, Lcom/shopkick/app/shoppinglists/SLListDropdownController$4;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->optionsList:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v1, v2}, Lcom/shopkick/app/shoppinglists/SLListDropdownController$4;-><init>(Lcom/shopkick/app/shoppinglists/SLListDropdownController;Landroid/view/View;Ljava/util/ArrayList;Ljava/util/HashMap;)V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->slOptionsDialog:Lcom/shopkick/app/shoppinglists/SLOptionsDialog;

    .line 310
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->slOptionsDialog:Lcom/shopkick/app/shoppinglists/SLOptionsDialog;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/SLOptionsDialog;->show()V

    .line 313
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0xe1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 314
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->currentListId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setShoppingListId(Ljava/lang/String;)V

    .line 315
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    goto :goto_1

    .line 287
    :cond_2
    iget-boolean p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->isShown:Z

    if-eqz p1, :cond_3

    .line 288
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->hideDropdown()V

    .line 289
    invoke-direct {p0, v2}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->logDropdownClick(Z)V

    goto :goto_1

    .line 291
    :cond_3
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->showDropdown()V

    .line 292
    invoke-direct {p0, v3}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->logDropdownClick(Z)V

    goto :goto_1

    .line 283
    :cond_4
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->hideDropdown()V

    .line 284
    invoke-direct {p0, v2}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->logDropdownClick(Z)V

    :goto_1
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

    .line 407
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x7bdf651a

    if-eq v0, v1, :cond_1

    const v1, -0x7bdcda86

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "eventShoppingListCreatedFinished"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const-string v0, "eventShoppingListRenamed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    const-string p1, "paramPreviousShoppingListId"

    .line 416
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string v0, "paramShoppingListId"

    .line 417
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-eqz p1, :cond_3

    .line 418
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->currentListId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 419
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->updateHeader()V

    goto :goto_2

    :pswitch_1
    const-string p1, "paramShoppingListId"

    .line 409
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_3

    .line 410
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->currentListId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 411
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->updateHeader()V

    :cond_3
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public abstract onListSelected(Ljava/lang/String;)V
.end method

.method public setSelectedListInfo(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;)V
    .locals 1

    .line 137
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->listInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    .line 138
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->slListController:Lcom/shopkick/app/shoppinglists/SLListController;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/shoppinglists/SLListController;->setShoppingListId(Ljava/lang/String;)V

    .line 139
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->slListController:Lcom/shopkick/app/shoppinglists/SLListController;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/SLListController;->updateList()V

    .line 140
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->updateHeader()V

    return-void
.end method

.method public showDropdown()V
    .locals 7

    .line 150
    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->isShown:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 151
    iput-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->isShown:Z

    .line 153
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->updateListHeight()V

    .line 156
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->listView:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    .line 159
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->listView:Landroid/widget/ListView;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setEnabled(Z)V

    .line 160
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->dropdownView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 162
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->dropdownView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v2, 0x7f01002a

    invoke-static {v0, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 163
    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v2}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 164
    iget v2, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->ANIMATION_DURATION_MS:I

    int-to-long v2, v2

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 165
    new-instance v2, Lcom/shopkick/app/shoppinglists/SLListDropdownController$2;

    invoke-direct {v2, p0}, Lcom/shopkick/app/shoppinglists/SLListDropdownController$2;-><init>(Lcom/shopkick/app/shoppinglists/SLListDropdownController;)V

    invoke-virtual {v0, v2}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 181
    new-instance v2, Landroid/view/animation/AlphaAnimation;

    const v3, 0x3e99999a    # 0.3f

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {v2, v3, v4}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 182
    iget v3, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->ANIMATION_DURATION_MS:I

    int-to-long v5, v3

    invoke-virtual {v2, v5, v6}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 184
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->animateArrow()V

    .line 185
    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->dropdownView:Landroid/view/View;

    invoke-virtual {v3, v2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 186
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->listView:Landroid/widget/ListView;

    invoke-virtual {v2, v0}, Landroid/widget/ListView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 188
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->doneButton:Landroid/view/View;

    const v2, 0x3dcccccd    # 0.1f

    invoke-virtual {v0, v2}, Landroid/view/View;->setAlpha(F)V

    .line 189
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->doneButton:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 190
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->doneButton:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    iget v1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->ANIMATION_DURATION_MS:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void
.end method
