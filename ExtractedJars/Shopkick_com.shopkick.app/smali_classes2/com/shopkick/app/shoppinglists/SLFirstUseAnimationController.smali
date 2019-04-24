.class public Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;
.super Ljava/lang/Object;
.source "SLFirstUseAnimationController.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;


# static fields
.field public static final FLAG_FTUE_STAGE_1:I = 0x1

.field public static final FLAG_FTUE_STAGE_2:I = 0x2

.field public static final FLAG_FTUE_STAGE_3:I = 0x4

.field private static final TOOLTIP_SIDE_MARGINS:I = 0x5

.field private static final TOOLTIP_TOP_MARGIN:I = 0x2


# instance fields
.field private CONTAINER_ANIMATION_MS:I

.field private DELAY_ON_SCREEN_MS:I

.field private PULSE_ANIMATION_MS:I

.field private TOGGLE_ANIMATION_MS:I

.field private TOOLTIP_HEIGHT:I

.field private TOOLTIP_INTERVAL_MS:I

.field private TOP_EXTRA_SPACING:I

.field private appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field private container:Landroid/view/ViewGroup;

.field private currentFTUEStage:I

.field private dismissButton:Landroid/view/View;

.field private displayTooltipRunnable:Ljava/lang/Runnable;

.field private firstUserView:Landroid/view/View;

.field private isScrollIdle:Z

.field private phoneImage:Landroid/view/View;

.field private recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

.field private shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

.field private syncAlertController:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

.field private toolTipView:Lcom/shopkick/app/widget/ToolTipView;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;Lcom/shopkick/app/application/AppPreferences;)V
    .locals 2

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x7d0

    .line 38
    iput v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->DELAY_ON_SCREEN_MS:I

    const/16 v0, 0x1f4

    .line 39
    iput v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->TOGGLE_ANIMATION_MS:I

    const/16 v1, 0x190

    .line 40
    iput v1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->PULSE_ANIMATION_MS:I

    const/16 v1, 0x12c

    .line 41
    iput v1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->CONTAINER_ANIMATION_MS:I

    .line 42
    iput v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->TOOLTIP_INTERVAL_MS:I

    const/16 v0, 0x32

    .line 45
    iput v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->TOP_EXTRA_SPACING:I

    const/16 v0, 0x46

    .line 46
    iput v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->TOOLTIP_HEIGHT:I

    const/4 v0, 0x0

    .line 61
    iput v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->currentFTUEStage:I

    const/4 v1, 0x1

    .line 62
    iput-boolean v1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->isScrollIdle:Z

    .line 69
    iput-object p5, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 70
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->container:Landroid/view/ViewGroup;

    .line 71
    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 72
    iput-object p3, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    .line 73
    iput-object p4, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->syncAlertController:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    .line 75
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object p1

    const-string p2, "FEATURE_FLAG_FTUE_TEST"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string/jumbo p1, "shoppinglist_first_use_view_state"

    .line 76
    invoke-virtual {p5, p1, v0}, Lcom/shopkick/app/application/AppPreferences;->putInt(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;)Landroid/view/View;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->dismissButton:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->clearFirstUseView()V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;)I
    .locals 0

    .line 29
    iget p0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->TOOLTIP_INTERVAL_MS:I

    return p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;I)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->scheduleTooltipDisplay(I)V

    return-void
.end method

.method static synthetic access$400(Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;I)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->setStageFinished(I)V

    return-void
.end method

.method static synthetic access$500(Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->clearTooltips()V

    return-void
.end method

.method static synthetic access$602(Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;Lcom/shopkick/app/widget/ToolTipView;)Lcom/shopkick/app/widget/ToolTipView;
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    return-object p1
.end method

.method static synthetic access$700(Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;)Landroid/view/View;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->phoneImage:Landroid/view/View;

    return-object p0
.end method

.method private clearFirstUseView()V
    .locals 2

    .line 125
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->container:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->firstUserView:Landroid/view/View;

    if-eqz v1, :cond_0

    .line 126
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    const/4 v0, 0x0

    .line 128
    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->firstUserView:Landroid/view/View;

    return-void
.end method

.method private clearTooltips()V
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    if-eqz v0, :cond_0

    .line 133
    invoke-virtual {v0}, Lcom/shopkick/app/widget/ToolTipView;->dismiss()V

    :cond_0
    const/4 v0, 0x0

    .line 135
    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    .line 136
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->removeModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    return-void
.end method

.method private getViewIndexToAttach()I
    .locals 2

    .line 328
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->container:Landroid/view/ViewGroup;

    const v1, 0x7f090443

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 330
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->container:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v0

    return v0

    .line 332
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->container:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    return v0
.end method

.method private hideFirstUseView()V
    .locals 3

    const/4 v0, 0x1

    .line 193
    invoke-direct {p0, v0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->setStageFinished(I)V

    .line 195
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->firstUserView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    .line 196
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    iget v1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->CONTAINER_ANIMATION_MS:I

    int-to-long v1, v1

    .line 197
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController$4;

    invoke-direct {v1, p0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController$4;-><init>(Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;)V

    .line 198
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    .line 206
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void
.end method

.method private isCurrentShoppingListEmpty()Z
    .locals 2

    .line 306
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSelectedShoppingList()Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 307
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    if-eqz v1, :cond_1

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->entries:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private isFTUEAvailable()Z
    .locals 2

    const/4 v0, 0x1

    .line 311
    invoke-direct {p0, v0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->isStageAvailable(I)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->isStageAvailable(I)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x4

    invoke-direct {p0, v1}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->isStageAvailable(I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    return v0
.end method

.method private isStageAvailable(I)Z
    .locals 1

    .line 317
    iget v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->currentFTUEStage:I

    and-int/2addr p1, v0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public static synthetic lambda$scheduleTooltipDisplay$228(Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;)V
    .locals 1

    const/4 v0, 0x2

    .line 212
    invoke-direct {p0, v0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->isStageAvailable(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->isCurrentShoppingListEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 213
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->showTooltipOnSearchBar()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    .line 214
    invoke-direct {p0, v0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->isStageAvailable(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 215
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->showTooltipOnShowDealButton()V

    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic lambda$startAnimation$227(Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;)V
    .locals 3

    .line 170
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 171
    iget v1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->PULSE_ANIMATION_MS:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    const/4 v1, 0x2

    .line 172
    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setRepeatMode(I)V

    const/4 v1, 0x5

    .line 173
    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setRepeatCount(I)V

    .line 174
    new-instance v1, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController$3;

    invoke-direct {v1, p0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController$3;-><init>(Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 187
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->phoneImage:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 188
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->phoneImage:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private scheduleTooltipDisplay(I)V
    .locals 4

    .line 210
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->displayTooltipRunnable:Ljava/lang/Runnable;

    if-nez v0, :cond_0

    .line 211
    new-instance v0, Lcom/shopkick/app/shoppinglists/-$$Lambda$SLFirstUseAnimationController$5QazRE6cDsHz1vT3iyM5NaLOCQc;

    invoke-direct {v0, p0}, Lcom/shopkick/app/shoppinglists/-$$Lambda$SLFirstUseAnimationController$5QazRE6cDsHz1vT3iyM5NaLOCQc;-><init>(Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;)V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->displayTooltipRunnable:Ljava/lang/Runnable;

    .line 219
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->container:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->displayTooltipRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 220
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->container:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->displayTooltipRunnable:Ljava/lang/Runnable;

    int-to-long v2, p1

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/ViewGroup;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private setStageFinished(I)V
    .locals 2

    .line 323
    iget v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->currentFTUEStage:I

    or-int/2addr p1, v0

    iput p1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->currentFTUEStage:I

    .line 324
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const-string/jumbo v0, "shoppinglist_first_use_view_state"

    iget v1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->currentFTUEStage:I

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/application/AppPreferences;->putInt(Ljava/lang/String;I)V

    return-void
.end method

.method private setup()V
    .locals 2

    .line 141
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->firstUserView:Landroid/view/View;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 142
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->dismissButton:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 143
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->phoneImage:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 146
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->dismissButton:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 147
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->phoneImage:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 148
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->dismissButton:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 151
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->firstUserView:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 152
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->startAnimation()V

    return-void
.end method

.method private showTooltipOnSearchBar()V
    .locals 5

    .line 224
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->syncAlertController:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x2

    .line 225
    invoke-direct {p0, v0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->isStageAvailable(I)Z

    move-result v1

    if-nez v1, :cond_1

    return-void

    .line 228
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    if-nez v1, :cond_2

    .line 229
    new-instance v1, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController$5;

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->container:Landroid/view/ViewGroup;

    const v3, 0x7f09078d

    .line 230
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 231
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->getViewIndexToAttach()I

    move-result v4

    invoke-direct {v1, p0, v2, v3, v4}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController$5;-><init>(Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;Landroid/view/ViewGroup;Landroid/view/View;I)V

    iput-object v1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    .line 239
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->container:Landroid/view/ViewGroup;

    const v3, 0x7f09063e

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/ToolTipView;->addExtCloseButton(Landroid/view/View;)V

    .line 240
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    const v2, 0x7f1106b5

    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/ToolTipView;->setText(I)V

    .line 241
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    const/4 v2, 0x0

    const/4 v3, 0x5

    invoke-virtual {v1, v3, v0, v3, v2}, Lcom/shopkick/app/widget/ToolTipView;->setMargin(IIII)V

    .line 243
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/ToolTipView;->show()V

    return-void
.end method

.method private showTooltipOnShowDealButton()V
    .locals 11

    .line 247
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->syncAlertController:Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListSyncAlertController;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 248
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->firstUserView:Landroid/view/View;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 249
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/shopkick/app/widget/ToolTipView;->isShown()Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    .line 250
    :cond_2
    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->isScrollIdle:Z

    if-nez v0, :cond_3

    return-void

    :cond_3
    const/4 v0, 0x4

    .line 251
    invoke-direct {p0, v0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->isStageAvailable(I)Z

    move-result v0

    if-nez v0, :cond_4

    return-void

    .line 254
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    .line 257
    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_8

    .line 259
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 260
    invoke-virtual {v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;

    .line 261
    iget-object v4, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v4}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findFirstVisibleItemPosition()I

    move-result v4

    .line 262
    invoke-virtual {v1}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;->findFirstCompletelyVisibleItemPosition()I

    move-result v5

    .line 263
    invoke-virtual {v1}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;->findLastCompletelyVisibleItemPosition()I

    move-result v1

    if-ltz v5, :cond_8

    if-ltz v1, :cond_8

    .line 266
    iget v6, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->TOP_EXTRA_SPACING:I

    iget-object v7, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->container:Landroid/view/ViewGroup;

    invoke-virtual {v7}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v6

    .line 267
    iget v7, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->TOOLTIP_HEIGHT:I

    iget-object v8, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->container:Landroid/view/ViewGroup;

    invoke-virtual {v8}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v7

    :goto_0
    if-gt v5, v1, :cond_8

    const/16 v8, 0x3f7

    .line 272
    invoke-virtual {v0, v5}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getItemViewType(I)I

    move-result v9

    if-ne v8, v9, :cond_7

    .line 273
    iget-object v8, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    sub-int v9, v5, v4

    invoke-virtual {v8, v9}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/view/ViewGroup;

    const v9, 0x7f09069b

    .line 274
    invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v9

    if-eqz v9, :cond_7

    .line 277
    invoke-virtual {v9}, Landroid/view/View;->isShown()Z

    move-result v10

    if-eqz v10, :cond_7

    .line 278
    invoke-virtual {v8}, Landroid/view/ViewGroup;->getTop()I

    move-result v10

    if-le v10, v6, :cond_7

    .line 280
    new-instance v0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController$6;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->container:Landroid/view/ViewGroup;

    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->getViewIndexToAttach()I

    move-result v4

    invoke-direct {v0, p0, v1, v9, v4}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController$6;-><init>(Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;Landroid/view/ViewGroup;Landroid/view/View;I)V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    .line 287
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    invoke-virtual {v0, v9}, Lcom/shopkick/app/widget/ToolTipView;->addExtCloseButton(Landroid/view/View;)V

    .line 288
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    const v1, 0x7f1106b6

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/ToolTipView;->setText(I)V

    .line 290
    invoke-virtual {v8}, Landroid/view/ViewGroup;->getTop()I

    move-result v0

    add-int/2addr v6, v7

    if-le v0, v6, :cond_5

    move v0, v2

    goto :goto_1

    :cond_5
    move v0, v3

    .line 291
    :goto_1
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/ToolTipView;->setTooltipPosition(Z)V

    .line 292
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    if-eqz v0, :cond_6

    const/16 v0, 0xa

    goto :goto_2

    :cond_6
    const/16 v0, -0xa

    :goto_2
    const/4 v4, 0x5

    invoke-virtual {v1, v4, v0, v4, v3}, Lcom/shopkick/app/widget/ToolTipView;->setMargin(IIII)V

    goto :goto_3

    :cond_7
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_8
    move v2, v3

    :goto_3
    if-eqz v2, :cond_9

    .line 301
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->toolTipView:Lcom/shopkick/app/widget/ToolTipView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/ToolTipView;->show()V

    :cond_9
    return-void
.end method

.method private startAnimation()V
    .locals 4

    .line 156
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->dismissButton:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 157
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->dismissButton:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setAlpha(F)V

    .line 158
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->dismissButton:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 159
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->dismissButton:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    iget v1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->TOGGLE_ANIMATION_MS:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController$2;

    invoke-direct {v1, p0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController$2;-><init>(Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;)V

    .line 160
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    .line 166
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 169
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->phoneImage:Landroid/view/View;

    new-instance v1, Lcom/shopkick/app/shoppinglists/-$$Lambda$SLFirstUseAnimationController$-WHVtUZKWellxrG8LgG64odOfFA;

    invoke-direct {v1, p0}, Lcom/shopkick/app/shoppinglists/-$$Lambda$SLFirstUseAnimationController$-WHVtUZKWellxrG8LgG64odOfFA;-><init>(Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;)V

    iget v2, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->DELAY_ON_SCREEN_MS:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 0

    .line 120
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->clearFirstUseView()V

    .line 121
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->clearTooltips()V

    return-void
.end method

.method public maybeDisplayFirstUseView()V
    .locals 4

    .line 82
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const-string/jumbo v1, "shoppinglist_first_use_view_state"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->currentFTUEStage:I

    .line 83
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->container:Landroid/view/ViewGroup;

    if-eqz v0, :cond_4

    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->isFTUEAvailable()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 85
    invoke-direct {p0, v0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->isStageAvailable(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 88
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->firstUserView:Landroid/view/View;

    if-nez v0, :cond_1

    .line 90
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->container:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c01bc

    .line 91
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->container:Landroid/view/ViewGroup;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->firstUserView:Landroid/view/View;

    .line 92
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->firstUserView:Landroid/view/View;

    new-instance v1, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController$1;

    invoke-direct {v1, p0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController$1;-><init>(Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 98
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->container:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->firstUserView:Landroid/view/View;

    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->getViewIndexToAttach()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 101
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->firstUserView:Landroid/view/View;

    const v1, 0x7f0906a7

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->dismissButton:Landroid/view/View;

    .line 102
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->firstUserView:Landroid/view/View;

    const v1, 0x7f0906aa

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->phoneImage:Landroid/view/View;

    .line 104
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->dismissButton:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 105
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->setup()V

    .line 108
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    goto :goto_1

    :cond_2
    const/4 v0, 0x2

    .line 109
    invoke-direct {p0, v0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->isStageAvailable(I)Z

    move-result v0

    const/4 v1, 0x4

    if-nez v0, :cond_3

    invoke-direct {p0, v1}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->isStageAvailable(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 110
    :cond_3
    iget v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->TOOLTIP_INTERVAL_MS:I

    invoke-direct {p0, v0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->scheduleTooltipDisplay(I)V

    .line 113
    invoke-direct {p0, v1}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->isStageAvailable(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 114
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    goto :goto_1

    .line 84
    :cond_4
    :goto_0
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->clear()V

    :cond_5
    :goto_1
    return-void
.end method

.method public onAttach(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V
    .locals 0

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 342
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->dismissButton:Landroid/view/View;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 343
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->hideFirstUseView()V

    :cond_0
    return-void
.end method

.method public onItemActive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public onItemInactive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public onScrollStateChanged(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;I)V
    .locals 0

    if-nez p2, :cond_0

    const/4 p1, 0x1

    .line 363
    iput-boolean p1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->isScrollIdle:Z

    .line 364
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->showTooltipOnShowDealButton()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 366
    iput-boolean p1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->isScrollIdle:Z

    :goto_0
    return-void
.end method

.method public onScrolled(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;II)V
    .locals 0

    return-void
.end method

.method public onViewRecycled(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 0

    return-void
.end method
