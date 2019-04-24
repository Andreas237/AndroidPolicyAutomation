.class public abstract Lcom/shopkick/app/tabs/TabScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "TabScreen.java"

# interfaces
.implements Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;


# static fields
.field private static final DEFAULT_PROGRESS_VIEW_OFFSET:I = 0x32

.field public static final SCREEN_PARAM_BACK_TARGET_SCREEN:Ljava/lang/String; = "screenParamBackTargetScreen"


# instance fields
.field private originElement:Ljava/lang/Integer;

.field private originScreenEnum:Ljava/lang/Integer;

.field protected pullToRefresh:Lcom/shopkick/app/widget/SKSwipeRefreshLayout;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .line 37
    invoke-virtual {p0, p1, p2, p3}, Lcom/shopkick/app/tabs/TabScreen;->createTabScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    .line 39
    iget-object p2, p0, Lcom/shopkick/app/tabs/TabScreen;->pullToRefresh:Lcom/shopkick/app/widget/SKSwipeRefreshLayout;

    if-eqz p2, :cond_0

    const/4 p3, 0x1

    .line 40
    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;->setEnabled(Z)V

    .line 41
    iget-object p2, p0, Lcom/shopkick/app/tabs/TabScreen;->pullToRefresh:Lcom/shopkick/app/widget/SKSwipeRefreshLayout;

    invoke-virtual {p2, p0}, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;->setOnRefreshListener(Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;)V

    .line 42
    iget-object p2, p0, Lcom/shopkick/app/tabs/TabScreen;->pullToRefresh:Lcom/shopkick/app/widget/SKSwipeRefreshLayout;

    const/4 p3, 0x0

    .line 43
    invoke-virtual {p0}, Lcom/shopkick/app/tabs/TabScreen;->getPullToRefreshOffset()I

    move-result v0

    invoke-virtual {p0}, Lcom/shopkick/app/tabs/TabScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v0

    .line 42
    invoke-virtual {p2, p3, v0}, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;->setProgressViewEndTarget(ZI)V

    .line 48
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/tabs/TabScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object p3, p0, Lcom/shopkick/app/tabs/TabScreen;->screenSimpleUserEventCoordinator:Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/logging/UserEventLogger;->addUserEventCoordinator(Lcom/shopkick/app/logging/IUserEventCoordinator;)V

    return-object p1
.end method

.method public abstract createTabScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end method

.method protected getPullToRefreshOffset()I
    .locals 1

    const/16 v0, 0x32

    return v0
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

    .line 32
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/tabs/TabScreen;->initTabScreen(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V

    return-void
.end method

.method public abstract initTabScreen(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
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
.end method

.method public onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;
    .locals 3

    .line 103
    iget-object v0, p0, Lcom/shopkick/app/tabs/TabScreen;->params:Ljava/util/Map;

    const-string v1, "screenParamBackTargetScreen"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 104
    invoke-static {}, Lcom/shopkick/app/screens/ScreenInfo;->getInstance()Lcom/shopkick/app/screens/ScreenInfo;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/tabs/TabScreen;->params:Ljava/util/Map;

    const-string v2, "screenParamBackTargetScreen"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/screens/ScreenInfo;->classForKey(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 105
    invoke-virtual {p0}, Lcom/shopkick/app/tabs/TabScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v1

    if-eqz v0, :cond_0

    .line 108
    instance-of v1, v1, Lcom/shopkick/app/activities/HomeActivity;

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 109
    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/tabs/TabScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    .line 110
    sget-object v0, Lcom/shopkick/app/screens/AppScreen$BackPressedState;->DONT_GO_BACK:Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    return-object v0

    .line 113
    :cond_0
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    move-result-object v0

    return-object v0
.end method

.method public onRefresh()V
    .locals 0

    .line 54
    invoke-virtual {p0}, Lcom/shopkick/app/tabs/TabScreen;->startPullToRefresh()V

    .line 55
    invoke-virtual {p0}, Lcom/shopkick/app/tabs/TabScreen;->onRefreshSelected()V

    return-void
.end method

.method public abstract onRefreshSelected()V
.end method

.method public setOriginElement(Ljava/lang/Integer;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/shopkick/app/tabs/TabScreen;->originElement:Ljava/lang/Integer;

    return-void
.end method

.method public setOriginScreenEnum(Ljava/lang/Integer;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/shopkick/app/tabs/TabScreen;->originScreenEnum:Ljava/lang/Integer;

    return-void
.end method

.method protected startPullToRefresh()V
    .locals 2

    .line 69
    iget-object v0, p0, Lcom/shopkick/app/tabs/TabScreen;->pullToRefresh:Lcom/shopkick/app/widget/SKSwipeRefreshLayout;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;->isRefreshing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 70
    iget-object v0, p0, Lcom/shopkick/app/tabs/TabScreen;->pullToRefresh:Lcom/shopkick/app/widget/SKSwipeRefreshLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;->setRefreshing(Z)V

    :cond_0
    return-void
.end method

.method protected stopPullToRefresh()V
    .locals 2

    .line 75
    iget-object v0, p0, Lcom/shopkick/app/tabs/TabScreen;->pullToRefresh:Lcom/shopkick/app/widget/SKSwipeRefreshLayout;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;->isRefreshing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 76
    iget-object v0, p0, Lcom/shopkick/app/tabs/TabScreen;->pullToRefresh:Lcom/shopkick/app/widget/SKSwipeRefreshLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;->setRefreshing(Z)V

    :cond_0
    return-void
.end method

.method public updateOriginScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 1

    .line 86
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->updateOriginScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 87
    iget-object v0, p0, Lcom/shopkick/app/tabs/TabScreen;->originScreenEnum:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOriginScreen(Ljava/lang/Integer;)V

    .line 88
    iget-object v0, p0, Lcom/shopkick/app/tabs/TabScreen;->originElement:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOriginElement(Ljava/lang/Integer;)V

    return-void
.end method
