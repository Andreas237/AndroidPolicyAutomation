.class public abstract Lcom/shopkick/app/activities/BaseActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "BaseActivity.java"


# static fields
.field private static final GENERAL_DIALOG_TAG:Ljava/lang/String; = "general_dialog"

.field protected static final PAGE_IDENTIFIER:Ljava/lang/String; = "page_identifier"


# instance fields
.field private instantiated:Z

.field private final permissionResultListeners:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/shopkick/app/permissions/IRequestPermissionsResultListener;",
            ">;"
        }
    .end annotation
.end field

.field private final resultListeners:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/shopkick/app/activities/IActivityResultListener;",
            ">;"
        }
    .end annotation
.end field

.field protected screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 40
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    .line 46
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/activities/BaseActivity;->resultListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 47
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/activities/BaseActivity;->permissionResultListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 v0, 0x0

    .line 49
    iput-boolean v0, p0, Lcom/shopkick/app/activities/BaseActivity;->instantiated:Z

    return-void
.end method

.method private addOriginScreenParam(Lcom/shopkick/app/activities/PageIdentifierV2;)V
    .locals 2

    .line 509
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 511
    invoke-static {}, Lcom/shopkick/app/screens/ScreenInfo;->getInstance()Lcom/shopkick/app/screens/ScreenInfo;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/shopkick/app/screens/ScreenInfo;->getScreenEnum(Ljava/lang/Class;)Ljava/lang/Integer;

    move-result-object v0

    .line 512
    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->getParams()Ljava/util/Map;

    move-result-object p1

    if-eqz v0, :cond_0

    const-string v1, "origin_screen"

    .line 513
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "origin_screen"

    .line 514
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method static synthetic lambda$setOnApplyWindowInsetListener$5(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 4

    .line 585
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v1, 0x0

    const v2, 0x7f09003e

    if-ne v0, v2, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result v2

    if-eq v0, v2, :cond_0

    .line 586
    invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result v0

    invoke-virtual {p0, v1, v1, v1, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 587
    invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I

    move-result v0

    .line 588
    invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    move-result v2

    .line 589
    invoke-virtual {p1}, Landroid/view/WindowInsets;->getStableInsetRight()I

    move-result v3

    .line 587
    invoke-virtual {p1, v0, v2, v3, v1}, Landroid/view/WindowInsets;->replaceSystemWindowInsets(IIII)Landroid/view/WindowInsets;

    move-result-object p1

    .line 593
    :cond_0
    check-cast p0, Landroid/view/ViewGroup;

    move v0, v1

    .line 596
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 597
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 598
    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v0

    .line 599
    invoke-virtual {v0}, Landroid/view/WindowInsets;->isConsumed()Z

    move-result v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    .line 602
    invoke-virtual {p1}, Landroid/view/WindowInsets;->consumeSystemWindowInsets()Landroid/view/WindowInsets;

    move-result-object p1

    :cond_2
    return-object p1
.end method

.method public static setOnApplyWindowInsetListener(Landroid/view/View;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 581
    :cond_0
    sget-object v0, Lcom/shopkick/app/activities/-$$Lambda$BaseActivity$9H_adwQ4nND4S92XEURVFQQ-36g;->INSTANCE:Lcom/shopkick/app/activities/-$$Lambda$BaseActivity$9H_adwQ4nND4S92XEURVFQQ-36g;

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    return-void
.end method

.method private setupScreen(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/activities/PageIdentifierV2;)V
    .locals 10

    .line 520
    invoke-static {}, Lcom/shopkick/app/screens/ScreenInfo;->getInstance()Lcom/shopkick/app/screens/ScreenInfo;

    move-result-object v0

    invoke-virtual {p2}, Lcom/shopkick/app/activities/PageIdentifierV2;->getScreenKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/screens/ScreenInfo;->classForKey(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 521
    invoke-static {}, Lcom/shopkick/app/screens/ScreenInfo;->getInstance()Lcom/shopkick/app/screens/ScreenInfo;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/shopkick/app/screens/ScreenInfo;->getScreenEnum(Ljava/lang/Class;)Ljava/lang/Integer;

    move-result-object v9

    if-eqz v9, :cond_0

    .line 524
    new-instance v0, Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v1, p0, Lcom/shopkick/app/activities/BaseActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v3, v1, Lcom/shopkick/app/application/ScreenGlobals;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v1, p0, Lcom/shopkick/app/activities/BaseActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v4, v1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, p0, Lcom/shopkick/app/activities/BaseActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v5, v1, Lcom/shopkick/app/application/ScreenGlobals;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    iget-object v1, p0, Lcom/shopkick/app/activities/BaseActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v6, v1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v1, p0, Lcom/shopkick/app/activities/BaseActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v7, v1, Lcom/shopkick/app/application/ScreenGlobals;->screenTransitionPerformanceLogger:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;

    iget-object v1, p0, Lcom/shopkick/app/activities/BaseActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v8, v1, Lcom/shopkick/app/application/ScreenGlobals;->screenUIPerformanceLogger:Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;

    move-object v2, v0

    invoke-direct/range {v2 .. v9}, Lcom/shopkick/app/logging/UserEventLogger;-><init>(Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;Ljava/lang/Integer;)V

    .line 531
    iget-object v1, p0, Lcom/shopkick/app/activities/BaseActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->trackingUrlManager:Lcom/shopkick/app/tracking/TrackingUrlManager;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/logging/UserEventLogger;->setTrackingUrlManager(Lcom/shopkick/app/tracking/TrackingUrlManager;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 533
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/activities/BaseActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    invoke-virtual {p1, p2, v1, v0}, Lcom/shopkick/app/screens/AppScreen;->attach(Lcom/shopkick/app/activities/PageIdentifierV2;Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/logging/UserEventLogger;)V

    return-void
.end method


# virtual methods
.method public acceptAppboyIAM()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public addActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 324
    iget-object v0, p0, Lcom/shopkick/app/activities/BaseActivity;->resultListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 325
    iget-object v0, p0, Lcom/shopkick/app/activities/BaseActivity;->resultListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public addPermissionResultListener(Lcom/shopkick/app/permissions/IRequestPermissionsResultListener;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 350
    iget-object v0, p0, Lcom/shopkick/app/activities/BaseActivity;->permissionResultListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 351
    iget-object v0, p0, Lcom/shopkick/app/activities/BaseActivity;->permissionResultListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method protected createScreen(Lcom/shopkick/app/activities/PageIdentifierV2;)Lcom/shopkick/app/screens/AppScreen;
    .locals 3

    const/4 v0, 0x0

    .line 487
    :try_start_0
    invoke-static {}, Lcom/shopkick/app/screens/ScreenInfo;->getInstance()Lcom/shopkick/app/screens/ScreenInfo;

    move-result-object v1

    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->getScreenKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/screens/ScreenInfo;->classForKey(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    if-nez v1, :cond_0

    .line 492
    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->getScreenKey()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 494
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/screens/AppScreen;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3

    .line 495
    :try_start_1
    invoke-direct {p0, p1}, Lcom/shopkick/app/activities/BaseActivity;->addOriginScreenParam(Lcom/shopkick/app/activities/PageIdentifierV2;)V

    .line 496
    invoke-direct {p0, v1, p1}, Lcom/shopkick/app/activities/BaseActivity;->setupScreen(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/activities/PageIdentifierV2;)V
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_2

    :catch_3
    move-exception p1

    move-object v1, v0

    .line 502
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/InstantiationException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :catch_4
    move-exception p1

    move-object v1, v0

    .line 500
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/IllegalAccessException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :catch_5
    move-exception p1

    move-object v1, v0

    .line 498
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/ClassNotFoundException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_3
    return-object v1
.end method

.method public getContextStackLog()Ljava/lang/String;
    .locals 2

    .line 537
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Activity [name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getToolbarTextSize()F
    .locals 1

    .line 84
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->supportsToolbar()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f090771

    .line 85
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/BaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getTextSize()F

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getToolbarTitleView()Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f090771

    .line 64
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/BaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public abstract getTopScreen()Lcom/shopkick/app/screens/AppScreen;
.end method

.method public goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z
    .locals 9

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 408
    :cond_0
    invoke-static {}, Lcom/shopkick/app/activities/ActivityInfo;->getInstance()Lcom/shopkick/app/activities/ActivityInfo;

    move-result-object v1

    .line 409
    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->getActivityKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/activities/ActivityInfo;->classForKey(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 410
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v1, v2, :cond_1

    .line 411
    invoke-virtual {p0, p1}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenInCurrentActivity(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    move-result p1

    return p1

    .line 416
    :cond_1
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    .line 417
    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v3, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    .line 418
    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    const-string v5, "BaseActivity transition to pageId : %s"

    const/4 v6, 0x1

    new-array v7, v6, [Ljava/lang/Object;

    .line 420
    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->toString()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v0

    .line 418
    invoke-virtual {v2, v3, v4, v5, v7}, Lcom/shopkick/logging/DiagnosticLogger;->v(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 421
    invoke-direct {p0, p1}, Lcom/shopkick/app/activities/BaseActivity;->addOriginScreenParam(Lcom/shopkick/app/activities/PageIdentifierV2;)V

    .line 422
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "page_identifier"

    .line 423
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const/high16 p1, 0x4000000

    .line 427
    invoke-virtual {v0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/high16 p1, 0x20000000

    .line 428
    invoke-virtual {v0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 429
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/BaseActivity;->startActivity(Landroid/content/Intent;)V

    return v6
.end method

.method protected abstract goToScreenInCurrentActivity(Lcom/shopkick/app/activities/PageIdentifierV2;)Z
.end method

.method protected handleOnCreate()V
    .locals 4
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 189
    iget-boolean v0, p0, Lcom/shopkick/app/activities/BaseActivity;->instantiated:Z

    if-nez v0, :cond_0

    return-void

    .line 193
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/application/SKApp;

    iget-object v0, v0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iput-object v0, p0, Lcom/shopkick/app/activities/BaseActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    const/4 v0, 0x3

    .line 195
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/BaseActivity;->setVolumeControlStream(I)V

    .line 196
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x500

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 198
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v0

    const-string v1, "Activity Lifecycle"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 199
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " onCreate"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method protected handleOnDestroy()V
    .locals 4
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 307
    iget-object v0, p0, Lcom/shopkick/app/activities/BaseActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    if-eqz v0, :cond_0

    .line 308
    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/video/VideoController;->notifyActivityDestroyed(Lcom/shopkick/app/activities/BaseActivity;)V

    .line 310
    :cond_0
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v0

    const-string v1, "Activity Lifecycle"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 311
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " onDestroy"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method protected handleOnPause()V
    .locals 4
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 265
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 266
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->hideKeyboard()V

    .line 269
    :cond_0
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/overlays/base/OverlaysManager;->setIsAppboyOverlayPresent(Z)V

    .line 270
    iget-object v0, p0, Lcom/shopkick/app/activities/BaseActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/application/AppActivityManager;->notifyAppActivityPaused(Lcom/shopkick/app/activities/BaseActivity;)V

    .line 271
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v0

    const-string v1, "Activity Lifecycle"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 272
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " onPause"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method protected handleOnResume()V
    .locals 4
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 239
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v0

    const-string v1, "Activity Lifecycle"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 240
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " onResume"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    iget-object v0, p0, Lcom/shopkick/app/activities/BaseActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/application/AppActivityManager;->notifyAppActivityResumed(Lcom/shopkick/app/activities/BaseActivity;)V

    .line 243
    iget-object v0, p0, Lcom/shopkick/app/activities/BaseActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isMCommerceEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 244
    iget-object v0, p0, Lcom/shopkick/app/activities/BaseActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    invoke-virtual {v0}, Lcom/shopkick/app/store/MCommerceManager;->dismissOverlay()V

    .line 245
    iget-object v0, p0, Lcom/shopkick/app/activities/BaseActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    invoke-virtual {v0}, Lcom/shopkick/app/store/MCommerceManager;->maybeShowLandingOverlay()V

    .line 247
    :cond_0
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->showNextOverlay()V

    .line 250
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->acceptAppboyIAM()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 251
    invoke-static {}, Lcom/appboy/ui/inappmessage/AppboyInAppMessageManager;->getInstance()Lcom/appboy/ui/inappmessage/AppboyInAppMessageManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appboy/ui/inappmessage/AppboyInAppMessageManager;->requestDisplayInAppMessage()Z

    :cond_1
    return-void
.end method

.method protected handleOnStart()V
    .locals 4
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 219
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v0

    const-string v1, "Activity Lifecycle"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 220
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " onStart"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    sget-object v0, Lcom/shopkick/app/permissions/PermissionUtils;->BOOT_UP_PERMISSIONS:[Ljava/lang/String;

    invoke-static {v0, p0}, Lcom/shopkick/app/permissions/PermissionUtils;->arePermissionsEnabled([Ljava/lang/String;Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 222
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/application/SKApp;

    invoke-virtual {v0}, Lcom/shopkick/app/application/SKApp;->initializeSDKClientAccessor()V

    .line 224
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/activities/BaseActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/application/AppActivityManager;->notifyAppActivityStarted(Lcom/shopkick/app/activities/BaseActivity;)V

    return-void
.end method

.method protected handleOnStop()V
    .locals 4
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 285
    iget-object v0, p0, Lcom/shopkick/app/activities/BaseActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isMCommerceEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 286
    iget-object v0, p0, Lcom/shopkick/app/activities/BaseActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    invoke-virtual {v0}, Lcom/shopkick/app/store/MCommerceManager;->dismissOverlay()V

    .line 288
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/activities/BaseActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/application/AppActivityManager;->notifyAppActivityStopped(Lcom/shopkick/app/activities/BaseActivity;)V

    .line 289
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v0

    const-string v1, "Activity Lifecycle"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 290
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " onStop"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public hideBack()V
    .locals 2

    .line 131
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->supportsToolbar()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 132
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    :cond_0
    return-void
.end method

.method public hideToolbar()V
    .locals 1

    .line 113
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->supportsToolbar()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 114
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/app/ActionBar;->hide()V

    :cond_0
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 338
    iget-object v0, p0, Lcom/shopkick/app/activities/BaseActivity;->resultListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/activities/IActivityResultListener;

    .line 339
    invoke-interface {v1, p0, p1, p2, p3}, Lcom/shopkick/app/activities/IActivityResultListener;->onActivityResult(Lcom/shopkick/app/activities/BaseActivity;IILandroid/content/Intent;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .line 317
    :try_start_0
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onBackPressed()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 319
    :catch_0
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->supportFinishAfterTransition()V

    :goto_0
    return-void
.end method

.method protected final onCreate(Landroid/os/Bundle;)V
    .locals 2

    const/4 v0, 0x0

    .line 149
    invoke-super {p0, v0}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    if-eqz p1, :cond_0

    .line 154
    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/shopkick/app/activities/SplashActivity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v0, 0x4000000

    .line 157
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/high16 v0, 0x20000000

    .line 158
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/high16 v0, 0x10000000

    .line 159
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const v0, 0x8000

    .line 160
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 161
    invoke-virtual {p0, p1}, Lcom/shopkick/app/activities/BaseActivity;->startActivity(Landroid/content/Intent;)V

    .line 162
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->finish()V

    return-void

    :cond_0
    const/4 p1, 0x1

    .line 166
    iput-boolean p1, p0, Lcom/shopkick/app/activities/BaseActivity;->instantiated:Z

    .line 168
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->showDefaultActivityView()Z

    move-result v0

    if-eqz v0, :cond_2

    const v0, 0x7f0c0020

    .line 169
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/BaseActivity;->setContentView(I)V

    const v0, 0x7f090770

    .line 170
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/BaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    .line 171
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->supportsToolbar()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    .line 172
    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->setVisibility(I)V

    .line 173
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/BaseActivity;->setSupportActionBar(Landroid/support/v7/widget/Toolbar;)V

    .line 174
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 175
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setDisplayShowTitleEnabled(Z)V

    .line 176
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    goto :goto_0

    :cond_1
    const/16 p1, 0x8

    .line 179
    invoke-virtual {v0, p1}, Landroid/support/v7/widget/Toolbar;->setVisibility(I)V

    .line 184
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->handleOnCreate()V

    return-void
.end method

.method protected final onDestroy()V
    .locals 1

    .line 295
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->clearTopOverlay(Lcom/shopkick/app/activities/BaseActivity;)V

    .line 296
    iget-boolean v0, p0, Lcom/shopkick/app/activities/BaseActivity;->instantiated:Z

    if-eqz v0, :cond_0

    .line 297
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->handleOnDestroy()V

    .line 299
    :cond_0
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onDestroy()V

    return-void
.end method

.method protected final onPause()V
    .locals 1

    .line 257
    iget-boolean v0, p0, Lcom/shopkick/app/activities/BaseActivity;->instantiated:Z

    if-eqz v0, :cond_0

    .line 258
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->handleOnPause()V

    .line 260
    :cond_0
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onPause()V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 2

    .line 387
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/app/AppCompatActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 390
    invoke-static {p0, p2, p3}, Lcom/shopkick/app/permissions/PermissionUtils;->logOnRequestPermissionsResult(Landroid/app/Activity;[Ljava/lang/String;[I)V

    .line 393
    iget-object v0, p0, Lcom/shopkick/app/activities/BaseActivity;->permissionResultListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/permissions/IRequestPermissionsResultListener;

    .line 394
    invoke-interface {v1, p1, p2, p3}, Lcom/shopkick/app/permissions/IRequestPermissionsResultListener;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected final onResume()V
    .locals 1

    .line 229
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onResume()V

    .line 230
    iget-boolean v0, p0, Lcom/shopkick/app/activities/BaseActivity;->instantiated:Z

    if-nez v0, :cond_0

    return-void

    .line 234
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->handleOnResume()V

    return-void
.end method

.method protected final onStart()V
    .locals 1

    .line 205
    :try_start_0
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onStart()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 210
    :catch_0
    iget-boolean v0, p0, Lcom/shopkick/app/activities/BaseActivity;->instantiated:Z

    if-nez v0, :cond_0

    return-void

    .line 214
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->handleOnStart()V

    return-void
.end method

.method protected final onStop()V
    .locals 1

    .line 277
    iget-boolean v0, p0, Lcom/shopkick/app/activities/BaseActivity;->instantiated:Z

    if-eqz v0, :cond_0

    .line 278
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->handleOnStop()V

    .line 280
    :cond_0
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onStop()V

    return-void
.end method

.method public removeActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 331
    iget-object v0, p0, Lcom/shopkick/app/activities/BaseActivity;->resultListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public removePermissionResultListener(Lcom/shopkick/app/permissions/IRequestPermissionsResultListener;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 363
    iget-object v0, p0, Lcom/shopkick/app/activities/BaseActivity;->permissionResultListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public abstract setRootScreenForCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public setToolbarTextSize(IF)V
    .locals 1

    .line 75
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->supportsToolbar()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f090771

    .line 76
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/BaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_0
    return-void
.end method

.method public setToolbarTitle(Ljava/lang/String;)V
    .locals 1

    .line 58
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->supportsToolbar()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f090771

    .line 59
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/BaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public showBack()V
    .locals 2

    .line 122
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->supportsToolbar()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 123
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    :cond_0
    return-void
.end method

.method protected showDefaultActivityView()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public showDialog(Landroid/support/v4/app/DialogFragment;)V
    .locals 1

    const-string v0, "general_dialog"

    .line 550
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/activities/BaseActivity;->showDialog(Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void
.end method

.method public showDialog(Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V
    .locals 2

    .line 561
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 564
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 565
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->isStateSaved()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 567
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 568
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1, p2}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 570
    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    :cond_2
    const/4 v1, 0x0

    .line 572
    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->addToBackStack(Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 574
    invoke-virtual {p1, v0, p2}, Landroid/support/v4/app/DialogFragment;->show(Landroid/support/v4/app/FragmentTransaction;Ljava/lang/String;)I

    return-void

    :cond_3
    :goto_0
    return-void
.end method

.method public showToolbar()V
    .locals 1

    .line 104
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->supportsToolbar()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 105
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BaseActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/app/ActionBar;->show()V

    :cond_0
    return-void
.end method

.method public supportsToolbar()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected validatePageIdentifier(Lcom/shopkick/app/activities/PageIdentifierV2;)Z
    .locals 7

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 457
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    .line 458
    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v1, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    .line 459
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v1, v3

    const-string v3, "Null pageId passed in."

    new-array v4, v0, [Ljava/lang/Object;

    invoke-virtual {p1, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    return v0

    .line 463
    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->getActivityKey()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->getScreenKey()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    return v2

    .line 464
    :cond_2
    :goto_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    .line 465
    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v3, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    .line 466
    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    sget-object v5, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    or-long/2addr v3, v5

    const-string v5, "Invalid pageId used : %s"

    new-array v2, v2, [Ljava/lang/Object;

    .line 468
    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v0

    .line 466
    invoke-virtual {v1, v3, v4, v5, v2}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    return v0
.end method
