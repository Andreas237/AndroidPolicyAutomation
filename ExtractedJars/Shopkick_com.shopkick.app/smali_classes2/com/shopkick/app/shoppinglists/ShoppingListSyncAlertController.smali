.class public Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;
.super Ljava/lang/Object;
.source "ShoppingListSyncAlertController.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# static fields
.field private static final PERMISSIONS_VIEW_DISPLAY_DURATION_MS:I = 0x2710

.field private static final PERMISSIONS_VIEW_HEIGHT_DP:I = 0x50


# instance fields
.field private backButtonViewWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

.field private height:F

.field private isCancelable:Z

.field private isShowing:Z

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private searchBarViewWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

.field private viewWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/shopkick/app/application/dialog/DialogsManager;ZLcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Landroid/view/View;Landroid/view/View;Lcom/shopkick/app/logging/UserEventLogger;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Landroid/view/View;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p7    # Landroid/view/View;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->viewWeakReference:Ljava/lang/ref/WeakReference;

    .line 48
    iput-boolean p3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->isCancelable:Z

    .line 49
    iput-object p4, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 50
    iput-object p5, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    .line 51
    new-instance p5, Ljava/lang/ref/WeakReference;

    invoke-direct {p5, p6}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p5, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->searchBarViewWeakReference:Ljava/lang/ref/WeakReference;

    .line 52
    new-instance p5, Ljava/lang/ref/WeakReference;

    invoke-direct {p5, p7}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p5, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->backButtonViewWeakReference:Ljava/lang/ref/WeakReference;

    const/4 p5, 0x0

    .line 53
    iput-boolean p5, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->isShowing:Z

    .line 54
    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 55
    iput-object p8, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    if-eqz p1, :cond_1

    const/4 p2, 0x1

    .line 58
    invoke-virtual {p1, p2}, Landroid/view/View;->setClickable(Z)V

    const p2, 0x7f090112

    .line 60
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    .line 62
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p6

    invoke-virtual {p6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p6

    iget p6, p6, Landroid/util/DisplayMetrics;->density:F

    const/high16 p7, 0x42a00000    # 80.0f

    mul-float/2addr p6, p7

    iput p6, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->height:F

    .line 63
    iget p6, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->height:F

    neg-float p6, p6

    invoke-virtual {p1, p6}, Landroid/view/View;->setTranslationY(F)V

    .line 64
    invoke-virtual {p1, p5}, Landroid/view/View;->setVisibility(I)V

    if-eqz p3, :cond_0

    .line 67
    invoke-virtual {p2, p5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 68
    new-instance p1, Lcom/shopkick/app/shoppinglists/-$$Lambda$ShoppingListSyncAlertController$PC0J1DxNXQa2PjfnUj_9rP0DQek;

    invoke-direct {p1, p0}, Lcom/shopkick/app/shoppinglists/-$$Lambda$ShoppingListSyncAlertController$PC0J1DxNXQa2PjfnUj_9rP0DQek;-><init>(Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;)V

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    .line 70
    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_1
    :goto_0
    const-string p1, "eventShoppingListReady"

    .line 74
    invoke-virtual {p4, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;)Z
    .locals 0

    .line 22
    iget-boolean p0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->isCancelable:Z

    return p0
.end method

.method static synthetic access$102(Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;Z)Z
    .locals 0

    .line 22
    iput-boolean p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->isShowing:Z

    return p1
.end method

.method static synthetic access$200(Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;)Lcom/shopkick/app/logging/UserEventLogger;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->searchBarViewWeakReference:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->backButtonViewWeakReference:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method public static synthetic lambda$new$64(Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;Landroid/view/View;)V
    .locals 0

    .line 68
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->hideAlert()V

    return-void
.end method


# virtual methods
.method public checkListSyncingDone()Z
    .locals 2

    .line 85
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSelectedShoppingList()Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    move-result-object v0

    if-nez v0, :cond_0

    .line 87
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->showAlert()V

    .line 88
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->maybeStartSync(Ljava/lang/Integer;)V

    const/4 v0, 0x0

    return v0

    .line 92
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->hideAlert()V

    const/4 v0, 0x1

    return v0
.end method

.method public destroy()V
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    const/4 v0, 0x0

    .line 79
    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->viewWeakReference:Ljava/lang/ref/WeakReference;

    .line 80
    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->searchBarViewWeakReference:Ljava/lang/ref/WeakReference;

    .line 81
    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->backButtonViewWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public hideAlert()V
    .locals 2

    .line 145
    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->isShowing:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 149
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->viewWeakReference:Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_1

    .line 150
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    :cond_1
    if-eqz v0, :cond_2

    .line 154
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    iget v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->height:F

    neg-float v1, v1

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController$2;

    invoke-direct {v1, p0}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController$2;-><init>(Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    :cond_2
    return-void
.end method

.method public isShowing()Z
    .locals 1

    .line 186
    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->isShowing:Z

    return v0
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

    .line 195
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const v0, 0x39ad43a3

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "eventShoppingListReady"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

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

    .line 197
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSelectedShoppingList()Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 199
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->hideAlert()V

    :cond_3
    :goto_2
    return-void
.end method

.method public showAlert()V
    .locals 3

    .line 97
    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->isShowing:Z

    if-eqz v0, :cond_0

    return-void

    .line 101
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->viewWeakReference:Ljava/lang/ref/WeakReference;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/ref/WeakReference;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 102
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->viewWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 104
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    new-instance v2, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController$1;

    invoke-direct {v2, p0, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController$1;-><init>(Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;Landroid/view/View;)V

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    goto :goto_0

    .line 140
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    const v1, 0x7f110155

    const v2, 0x7f110689

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showCustomAlert(II)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    :goto_0
    return-void
.end method
