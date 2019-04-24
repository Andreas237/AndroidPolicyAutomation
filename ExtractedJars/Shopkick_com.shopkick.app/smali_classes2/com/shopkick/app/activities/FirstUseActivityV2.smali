.class public Lcom/shopkick/app/activities/FirstUseActivityV2;
.super Lcom/shopkick/app/activities/MultiScreenActivity;
.source "FirstUseActivityV2.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected getDefaultInitialScreen()Ljava/lang/Class;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation

    .line 21
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v0, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    .line 22
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    new-instance v4, Ljava/lang/IllegalStateException;

    const-string v0, "New first use controller should not reach here."

    invoke-direct {v4, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    const-string v5, "Template first use flow reached getDefaultInitialScreen"

    const/4 v0, 0x0

    new-array v6, v0, [Ljava/lang/Object;

    invoke-virtual/range {v1 .. v6}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    const-class v0, Lcom/shopkick/app/launch/FirstUseV5DefaultScreen;

    return-object v0
.end method

.method protected handleOnCreate()V
    .locals 3

    .line 30
    invoke-super {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->handleOnCreate()V

    .line 31
    iget-object v0, p0, Lcom/shopkick/app/activities/FirstUseActivityV2;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "firstUseScreensFinished"

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    return-void
.end method

.method public handleOnDestroy()V
    .locals 1

    .line 50
    invoke-super {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->handleOnDestroy()V

    .line 51
    iget-object v0, p0, Lcom/shopkick/app/activities/FirstUseActivityV2;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 52
    iget-object v0, p0, Lcom/shopkick/app/activities/FirstUseActivityV2;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->destroy()V

    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .line 36
    iget-object v0, p0, Lcom/shopkick/app/activities/FirstUseActivityV2;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/shopkick/app/activities/FirstUseActivityV2;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 37
    invoke-virtual {p0}, Lcom/shopkick/app/activities/FirstUseActivityV2;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/shopkick/app/webview/WebViewScreen;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 38
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/activities/FirstUseActivityV2;->appScreens:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/shopkick/app/activities/FirstUseActivityV2;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    .line 39
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getPageIdentifierV2()Lcom/shopkick/app/activities/PageIdentifierV2;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/FirstUseActivityV2;->goToScreenInCurrentActivity(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/activities/FirstUseActivityV2;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    move-result-object v0

    .line 42
    sget-object v1, Lcom/shopkick/app/screens/AppScreen$BackPressedState;->DONT_GO_BACK:Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    if-eq v0, v1, :cond_2

    .line 43
    invoke-virtual {p0}, Lcom/shopkick/app/activities/FirstUseActivityV2;->finish()V

    :cond_2
    :goto_0
    return-void
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

    const-string p2, "firstUseScreensFinished"

    .line 57
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 58
    iget-object p1, p0, Lcom/shopkick/app/activities/FirstUseActivityV2;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 59
    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/shopkick/app/activities/FirstUseActivityV2;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    const-class v0, Lcom/shopkick/app/activities/HomeActivity;

    invoke-direct {p1, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 p2, 0x4000000

    .line 60
    invoke-virtual {p1, p2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 61
    invoke-virtual {p0, p1}, Lcom/shopkick/app/activities/FirstUseActivityV2;->startActivity(Landroid/content/Intent;)V

    .line 62
    invoke-virtual {p0}, Lcom/shopkick/app/activities/FirstUseActivityV2;->finish()V

    :cond_0
    return-void
.end method
