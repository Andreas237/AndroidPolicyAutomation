.class public abstract Lcom/shopkick/app/shoppinglists/SLListController;
.super Ljava/lang/Object;
.source "SLListController.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final ANIMATION_DURATION_MS:I = 0x3c

.field public static final LIST_BUTTON_ROW_HEIGHT:I = 0x40

.field public static final LIST_ENTRY_ROW_HEIGHT:I = 0x46


# instance fields
.field private adapter:Lcom/shopkick/app/shoppinglists/SLListAdapter;

.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private dialog:Lcom/shopkick/app/shoppinglists/SLNamingDialog;

.field private eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

.field private listView:Landroid/widget/ListView;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Lcom/shopkick/app/logging/UserEventLogger;Landroid/widget/ListView;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListController;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 52
    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/SLListController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 53
    iput-object p3, p0, Lcom/shopkick/app/shoppinglists/SLListController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    .line 54
    iput-object p4, p0, Lcom/shopkick/app/shoppinglists/SLListController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 56
    iput-object p5, p0, Lcom/shopkick/app/shoppinglists/SLListController;->listView:Landroid/widget/ListView;

    .line 57
    new-instance p1, Lcom/shopkick/app/shoppinglists/SLListAdapter;

    invoke-virtual {p5}, Landroid/widget/ListView;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p1, p3}, Lcom/shopkick/app/shoppinglists/SLListAdapter;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListController;->adapter:Lcom/shopkick/app/shoppinglists/SLListAdapter;

    .line 59
    invoke-virtual {p5, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 60
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListController;->adapter:Lcom/shopkick/app/shoppinglists/SLListAdapter;

    invoke-virtual {p5, p1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    const-string p1, "eventDismissHandleDialog"

    .line 62
    invoke-virtual {p2, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "eventShoppingListReady"

    .line 63
    invoke-virtual {p2, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "eventShoppingListCreated"

    .line 64
    invoke-virtual {p2, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "eventShoppingListCreatedFinished"

    .line 65
    invoke-virtual {p2, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "eventShoppingListChanged"

    .line 66
    invoke-virtual {p2, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "eventShoppingListRenamed"

    .line 67
    invoke-virtual {p2, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "eventShoppingListDeleted"

    .line 68
    invoke-virtual {p2, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "eventShoppingListEntryAdded"

    .line 69
    invoke-virtual {p2, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "eventShoppingListEntryDeleted"

    .line 70
    invoke-virtual {p2, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "eventShoppingListCleared"

    .line 71
    invoke-virtual {p2, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/shoppinglists/SLListController;)Lcom/shopkick/app/shoppinglists/SLListAdapter;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/SLListController;->adapter:Lcom/shopkick/app/shoppinglists/SLListAdapter;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/shoppinglists/SLListController;)Landroid/widget/ListView;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/SLListController;->listView:Landroid/widget/ListView;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/shoppinglists/SLListController;)Lcom/shopkick/app/shoppinglists/SLNamingDialog;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/SLListController;->dialog:Lcom/shopkick/app/shoppinglists/SLNamingDialog;

    return-object p0
.end method

.method static synthetic access$202(Lcom/shopkick/app/shoppinglists/SLListController;Lcom/shopkick/app/shoppinglists/SLNamingDialog;)Lcom/shopkick/app/shoppinglists/SLNamingDialog;
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListController;->dialog:Lcom/shopkick/app/shoppinglists/SLNamingDialog;

    return-object p1
.end method

.method static synthetic access$300(Lcom/shopkick/app/shoppinglists/SLListController;)Lcom/shopkick/app/util/NotificationCenter;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/SLListController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/shoppinglists/SLListController;)Lcom/shopkick/app/logging/UserEventLogger;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/SLListController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/shoppinglists/SLListController;)Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/SLListController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    return-object p0
.end method

.method private afterDismissCreateDialog()V
    .locals 5

    .line 173
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListController;->listView:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLListController;->adapter:Lcom/shopkick/app/shoppinglists/SLListAdapter;

    invoke-virtual {v1}, Lcom/shopkick/app/shoppinglists/SLListAdapter;->getButtonRowPosition()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0901bb

    .line 174
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x2

    .line 176
    new-array v2, v2, [I

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v3

    const/4 v4, 0x0

    aput v3, v2, v4

    const/16 v3, 0x40

    .line 177
    invoke-static {v3, v1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v3

    const/4 v4, 0x1

    aput v3, v2, v4

    .line 176
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v2

    const-wide/16 v3, 0x3c

    .line 178
    invoke-virtual {v2, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 179
    new-instance v3, Lcom/shopkick/app/shoppinglists/SLListController$3;

    invoke-direct {v3, p0, v0, v1}, Lcom/shopkick/app/shoppinglists/SLListController$3;-><init>(Lcom/shopkick/app/shoppinglists/SLListController;Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 187
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method private beforeShowCreateDialog()V
    .locals 6

    .line 108
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListController;->listView:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLListController;->adapter:Lcom/shopkick/app/shoppinglists/SLListAdapter;

    invoke-virtual {v1}, Lcom/shopkick/app/shoppinglists/SLListAdapter;->getButtonRowPosition()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0901bb

    .line 109
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 110
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v2

    const/4 v3, 0x2

    .line 112
    new-array v3, v3, [I

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v4

    const/4 v5, 0x0

    aput v4, v3, v5

    const/16 v4, 0x46

    .line 113
    invoke-static {v4, v1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v4

    const/4 v5, 0x1

    aput v4, v3, v5

    .line 112
    invoke-static {v3}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v3

    const-wide/16 v4, 0x3c

    .line 114
    invoke-virtual {v3, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 115
    new-instance v4, Lcom/shopkick/app/shoppinglists/SLListController$1;

    invoke-direct {v4, p0, v2, v0, v1}, Lcom/shopkick/app/shoppinglists/SLListController$1;-><init>(Lcom/shopkick/app/shoppinglists/SLListController;ILandroid/view/View;Landroid/view/View;)V

    invoke-virtual {v3, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 132
    new-instance v2, Lcom/shopkick/app/shoppinglists/SLListController$2;

    invoke-direct {v2, p0, v1, v0}, Lcom/shopkick/app/shoppinglists/SLListController$2;-><init>(Lcom/shopkick/app/shoppinglists/SLListController;Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {v3, v2}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 168
    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    return-void
.end method

.method public dismissDialog()V
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListController;->dialog:Lcom/shopkick/app/shoppinglists/SLNamingDialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 80
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListController;->dialog:Lcom/shopkick/app/shoppinglists/SLNamingDialog;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->dismiss()V

    :cond_0
    return-void
.end method

.method public getSumRowHeight()I
    .locals 3

    .line 85
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListController;->listView:Landroid/widget/ListView;

    const/16 v1, 0x46

    invoke-static {v1, v0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v0

    .line 86
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLListController;->listView:Landroid/widget/ListView;

    const/16 v2, 0x40

    invoke-static {v2, v1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v1

    .line 88
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLListController;->adapter:Lcom/shopkick/app/shoppinglists/SLListAdapter;

    invoke-virtual {v2}, Lcom/shopkick/app/shoppinglists/SLListAdapter;->getCount()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    mul-int/2addr v0, v2

    add-int/2addr v0, v1

    return v0
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

    const-string p2, "eventDismissHandleDialog"

    .line 196
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/SLListController;->dialog:Lcom/shopkick/app/shoppinglists/SLNamingDialog;

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 197
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListController;->dialog:Lcom/shopkick/app/shoppinglists/SLNamingDialog;

    .line 198
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLListController;->afterDismissCreateDialog()V

    goto :goto_0

    :cond_0
    const-string p2, "eventShoppingListReady"

    .line 199
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "eventShoppingListCreated"

    .line 200
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "eventShoppingListCreatedFinished"

    .line 201
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "eventShoppingListChanged"

    .line 202
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "eventShoppingListRenamed"

    .line 203
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "eventShoppingListDeleted"

    .line 204
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "eventShoppingListEntryAdded"

    .line 205
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "eventShoppingListEntryDeleted"

    .line 206
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "eventShoppingListCleared"

    .line 207
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 208
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/SLListController;->updateList()V

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

    .line 218
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListController;->adapter:Lcom/shopkick/app/shoppinglists/SLListAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/SLListAdapter;->getButtonRowPosition()I

    move-result p1

    const/16 p2, 0xe0

    if-ne p3, p1, :cond_2

    .line 219
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListController;->dialog:Lcom/shopkick/app/shoppinglists/SLNamingDialog;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 220
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListController;->dialog:Lcom/shopkick/app/shoppinglists/SLNamingDialog;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->dismiss()V

    const/4 p1, 0x0

    .line 221
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListController;->dialog:Lcom/shopkick/app/shoppinglists/SLNamingDialog;

    .line 225
    :cond_0
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/16 p3, 0x3a

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 226
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/SLListController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 228
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListController;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/SLListController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-static {p1, p2}, Lcom/shopkick/app/shoppinglists/SLUtils;->isNewModificationCreatable(Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;)Z

    move-result p1

    if-nez p1, :cond_1

    return-void

    .line 230
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLListController;->beforeShowCreateDialog()V

    goto :goto_0

    .line 232
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListController;->adapter:Lcom/shopkick/app/shoppinglists/SLListAdapter;

    invoke-virtual {p1, p3}, Lcom/shopkick/app/shoppinglists/SLListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;

    .line 233
    iget-object p3, p1, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;->shoppingListId:Ljava/lang/String;

    invoke-virtual {p0, p3}, Lcom/shopkick/app/shoppinglists/SLListController;->setShoppingListId(Ljava/lang/String;)V

    .line 236
    new-instance p3, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 p4, 0x4

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-direct {p3, p2, p4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 237
    iget-object p2, p1, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;->shoppingListId:Ljava/lang/String;

    invoke-virtual {p3, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setShoppingListId(Ljava/lang/String;)V

    .line 238
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/SLListController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 240
    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/SLListController;->onSelect(Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;)V

    :goto_0
    return-void
.end method

.method public abstract onSelect(Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;)V
.end method

.method public setShoppingListId(Ljava/lang/String;)V
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListController;->adapter:Lcom/shopkick/app/shoppinglists/SLListAdapter;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/shoppinglists/SLListAdapter;->setSelectedListId(Ljava/lang/String;)V

    .line 98
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListController;->adapter:Lcom/shopkick/app/shoppinglists/SLListAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/SLListAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public updateList()V
    .locals 2

    .line 92
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListController;->adapter:Lcom/shopkick/app/shoppinglists/SLListAdapter;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLListController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-virtual {v1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingListSummaries()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/shoppinglists/SLListAdapter;->setListSummaries(Ljava/util/ArrayList;)V

    .line 93
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListController;->adapter:Lcom/shopkick/app/shoppinglists/SLListAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/SLListAdapter;->notifyDataSetChanged()V

    return-void
.end method
