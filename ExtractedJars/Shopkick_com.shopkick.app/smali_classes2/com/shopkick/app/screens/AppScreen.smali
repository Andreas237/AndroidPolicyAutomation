.class public abstract Lcom/shopkick/app/screens/AppScreen;
.super Landroid/support/v4/app/Fragment;
.source "AppScreen.java"

# interfaces
.implements Lcom/shopkick/app/screens/UIEventLogUpdateCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/screens/AppScreen$ScreenTransitionListener;,
        Lcom/shopkick/app/screens/AppScreen$BackButtonClickListener;,
        Lcom/shopkick/app/screens/AppScreen$BackPressedState;
    }
.end annotation


# instance fields
.field private appScreenTitle:Ljava/lang/String;

.field protected disableScreenResponsivenessLogging:Z

.field public eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private originalPageIdentifierV2:Lcom/shopkick/app/activities/PageIdentifierV2;

.field private pageIdentifierV2:Lcom/shopkick/app/activities/PageIdentifierV2;

.field public params:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private responsiveScreenConstraints:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;",
            ">;"
        }
    .end annotation
.end field

.field protected screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

.field protected screenSimpleUserEventCoordinator:Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

.field private shouldTriggerLifeCycleOnResume:Z

.field private shouldTriggerLifeCycleOnStart:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 51
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method

.method private attach(Ljava/util/Map;Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/logging/UserEventLogger;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Lcom/shopkick/app/logging/UserEventLogger;",
            ")V"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 120
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    :cond_0
    iput-object p1, p0, Lcom/shopkick/app/screens/AppScreen;->params:Ljava/util/Map;

    .line 121
    iput-object p3, p0, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 122
    iput-object p2, p0, Lcom/shopkick/app/screens/AppScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    if-eqz p3, :cond_1

    .line 124
    iget-object p1, p0, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/logging/UserEventLogger;->setUiEventLogUpdateCallback(Lcom/shopkick/app/screens/UIEventLogUpdateCallback;)V

    .line 125
    new-instance p1, Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

    invoke-direct {p1}, Lcom/shopkick/app/logging/SimpleUserEventCoordinator;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/screens/AppScreen;->screenSimpleUserEventCoordinator:Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

    .line 126
    iget-object p1, p0, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object p3, p0, Lcom/shopkick/app/screens/AppScreen;->screenSimpleUserEventCoordinator:Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

    invoke-virtual {p1, p3}, Lcom/shopkick/app/logging/UserEventLogger;->setSingleUserEventCoordinator(Lcom/shopkick/app/logging/IUserEventCoordinator;)V

    .line 129
    :cond_1
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/screens/AppScreen;->responsiveScreenConstraints:Ljava/util/HashSet;

    .line 130
    sget-object p1, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->STATIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->addResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    .line 133
    iget-object p1, p2, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p1, p0, Lcom/shopkick/app/screens/AppScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 135
    iget-object p1, p0, Lcom/shopkick/app/screens/AppScreen;->params:Ljava/util/Map;

    invoke-virtual {p0, p2, p1}, Lcom/shopkick/app/screens/AppScreen;->init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V

    return-void
.end method

.method private shouldHideBack(Lcom/shopkick/app/activities/BaseActivity;)Z
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 253
    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/app/activities/BaseActivity;->supportsToolbar()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method


# virtual methods
.method public addResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V
    .locals 1

    .line 289
    iget-object v0, p0, Lcom/shopkick/app/screens/AppScreen;->responsiveScreenConstraints:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public attach(Lcom/shopkick/app/activities/PageIdentifierV2;Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/logging/UserEventLogger;)V
    .locals 1

    .line 114
    iput-object p1, p0, Lcom/shopkick/app/screens/AppScreen;->pageIdentifierV2:Lcom/shopkick/app/activities/PageIdentifierV2;

    .line 115
    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->clone()Lcom/shopkick/app/activities/PageIdentifierV2;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/screens/AppScreen;->originalPageIdentifierV2:Lcom/shopkick/app/activities/PageIdentifierV2;

    .line 116
    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->getParams()Ljava/util/Map;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/screens/AppScreen;->attach(Ljava/util/Map;Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/logging/UserEventLogger;)V

    return-void
.end method

.method public clearActionEducationScreen()V
    .locals 1

    .line 346
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    instance-of v0, v0, Lcom/shopkick/app/activities/MultiScreenActivity;

    if-eqz v0, :cond_0

    .line 347
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/activities/MultiScreenActivity;

    invoke-virtual {v0}, Lcom/shopkick/app/activities/MultiScreenActivity;->clearActionEducationScreen()V

    :cond_0
    return-void
.end method

.method public clearAllPayPalScreens()V
    .locals 2

    .line 339
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    .line 340
    instance-of v1, v0, Lcom/shopkick/app/activities/MultiScreenActivity;

    if-eqz v1, :cond_0

    .line 341
    check-cast v0, Lcom/shopkick/app/activities/MultiScreenActivity;

    invoke-virtual {v0}, Lcom/shopkick/app/activities/MultiScreenActivity;->clearAllPayPalScreens()V

    :cond_0
    return-void
.end method

.method public abstract createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end method

.method public disableScreenResponsivenessLogging()V
    .locals 1

    const/4 v0, 0x1

    .line 303
    iput-boolean v0, p0, Lcom/shopkick/app/screens/AppScreen;->disableScreenResponsivenessLogging:Z

    return-void
.end method

.method public getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;
    .locals 1

    .line 88
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/activities/BaseActivity;

    return-object v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    .line 92
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    return-object v0
.end method

.method public getOriginalPageIdentifierV2()Lcom/shopkick/app/activities/PageIdentifierV2;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/shopkick/app/screens/AppScreen;->originalPageIdentifierV2:Lcom/shopkick/app/activities/PageIdentifierV2;

    return-object v0
.end method

.method public getPageIdentifierV2()Lcom/shopkick/app/activities/PageIdentifierV2;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/shopkick/app/screens/AppScreen;->pageIdentifierV2:Lcom/shopkick/app/activities/PageIdentifierV2;

    return-object v0
.end method

.method public getParams()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 96
    iget-object v0, p0, Lcom/shopkick/app/screens/AppScreen;->params:Ljava/util/Map;

    return-object v0
.end method

.method public getPopEnterAnimationRes(Ljava/lang/Class;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;)I"
        }
    .end annotation

    const p1, 0x7f010028

    return p1
.end method

.method public getPopExitAnimationRes(Ljava/lang/Class;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;)I"
        }
    .end annotation

    const p1, 0x7f01002d

    return p1
.end method

.method public getPushEnterAnimationRes(Ljava/lang/Class;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;)I"
        }
    .end annotation

    const p1, 0x7f010029

    return p1
.end method

.method public getPushExitAnimationRes(Ljava/lang/Class;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;)I"
        }
    .end annotation

    const p1, 0x7f01002c

    return p1
.end method

.method public varargs getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 516
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 517
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method protected getResourceColor(I)I
    .locals 1

    .line 509
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 510
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getView()Landroid/view/View;
    .locals 1

    .line 157
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->getView()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public goToActivityWithScreen(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/activities/BaseActivity;",
            ">;",
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

    .line 635
    new-instance v0, Lcom/shopkick/app/activities/PageIdentifierV2;

    invoke-direct {v0, p1, p2, p3}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 636
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    return-void
.end method

.method public goToScreen(Ljava/lang/Class;Ljava/util/Map;)V
    .locals 0
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

    .line 356
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/screens/AppScreen;->goToScreenInCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method public goToScreen(Ljava/lang/Class;Ljava/util/Map;Ljava/lang/String;)V
    .locals 0
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
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 352
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/screens/AppScreen;->goToScreenInCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method public goToScreenInCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V
    .locals 2
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

    .line 617
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 618
    :cond_0
    new-instance v0, Lcom/shopkick/app/activities/PageIdentifierV2;

    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, v1, p1, p2}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 619
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    return-void
.end method

.method public hideKeyboard()V
    .locals 3

    .line 447
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "input_method"

    .line 449
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 450
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    :cond_0
    return-void
.end method

.method public abstract init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
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

.method public isActiveScreen()Z
    .locals 2

    .line 312
    iget-object v0, p0, Lcom/shopkick/app/screens/AppScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 313
    iget-object v0, p0, Lcom/shopkick/app/screens/AppScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 314
    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/screens/AppScreen;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1

    :cond_1
    return v1
.end method

.method public isShowing()Z
    .locals 1

    .line 501
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isTopScreen()Z
    .locals 1

    .line 307
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/activities/BaseActivity;

    if-eqz v0, :cond_0

    .line 308
    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/screens/AppScreen;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected logDetectHidePage()V
    .locals 1

    .line 441
    iget-object v0, p0, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    if-eqz v0, :cond_0

    .line 442
    invoke-virtual {v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedHidePage()V

    :cond_0
    return-void
.end method

.method protected logDetectShowPage()V
    .locals 1

    .line 424
    iget-object v0, p0, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    if-eqz v0, :cond_0

    .line 425
    invoke-virtual {v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedShowPage()V

    :cond_0
    return-void
.end method

.method public onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;
    .locals 1

    .line 505
    sget-object v0, Lcom/shopkick/app/screens/AppScreen$BackPressedState;->PERFORM_SCREEN_BACK:Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    return-object v0
.end method

.method public onCreateAnimation(IZI)Landroid/view/animation/Animation;
    .locals 0

    if-eqz p3, :cond_2

    if-eqz p2, :cond_0

    .line 551
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->screenWillShow()V

    goto :goto_0

    .line 553
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->screenWillHide()V

    .line 555
    :goto_0
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p1

    .line 556
    new-instance p3, Lcom/shopkick/app/screens/AppScreen$ScreenTransitionListener;

    invoke-direct {p3, p2, p0}, Lcom/shopkick/app/screens/AppScreen$ScreenTransitionListener;-><init>(ZLcom/shopkick/app/screens/AppScreen;)V

    .line 557
    invoke-virtual {p1, p3}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    if-eqz p2, :cond_1

    return-object p1

    .line 565
    :cond_1
    new-instance p2, Landroid/view/animation/AnimationSet;

    const/4 p3, 0x1

    invoke-direct {p2, p3}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 566
    invoke-virtual {p2, p1}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    return-object p2

    .line 570
    :cond_2
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/Fragment;->onCreateAnimation(IZI)Landroid/view/animation/Animation;

    move-result-object p1

    return-object p1
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 162
    invoke-virtual {p0, p1, p2, p3}, Lcom/shopkick/app/screens/AppScreen;->createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/view/ViewGroup;

    .line 164
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object p3

    const-string v0, "Screen Transition"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 165
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " onCreate"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v0, v1}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->shouldDisplayAppScreenHeader()Z

    move-result p3

    if-nez p3, :cond_1

    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->shouldHideBack()Z

    move-result p3

    if-nez p3, :cond_1

    .line 170
    instance-of p3, p2, Landroid/widget/ScrollView;

    if-eqz p3, :cond_0

    .line 173
    new-instance p3, Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 174
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 175
    invoke-virtual {p3, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 176
    invoke-virtual {p3, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    move-object p2, p3

    :cond_0
    const p3, 0x7f0c0064

    const/4 v0, 0x0

    .line 181
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 182
    new-instance p3, Lcom/shopkick/app/screens/AppScreen$BackButtonClickListener;

    invoke-direct {p3, p0}, Lcom/shopkick/app/screens/AppScreen$BackButtonClickListener;-><init>(Lcom/shopkick/app/screens/AppScreen;)V

    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 183
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_1
    return-object p2
.end method

.method public onDestroy()V
    .locals 4

    .line 142
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v0

    const-string v1, "Screen Transition"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
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

    .line 148
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    return-void
.end method

.method public onResume()V
    .locals 4

    .line 222
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 224
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v0

    const-string v1, "Screen Transition"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 225
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

    .line 226
    iget-boolean v0, p0, Lcom/shopkick/app/screens/AppScreen;->shouldTriggerLifeCycleOnResume:Z

    if-eqz v0, :cond_0

    .line 227
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/activities/MultiScreenActivity;

    invoke-virtual {v0}, Lcom/shopkick/app/activities/MultiScreenActivity;->onScreenTransitionEnd()V

    .line 228
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->screenDidShow()V

    const/4 v0, 0x0

    .line 229
    iput-boolean v0, p0, Lcom/shopkick/app/screens/AppScreen;->shouldTriggerLifeCycleOnResume:Z

    :cond_0
    return-void
.end method

.method protected onScreenDidHide()V
    .locals 0

    return-void
.end method

.method protected onScreenDidShow()V
    .locals 0

    return-void
.end method

.method protected onScreenWillHide()V
    .locals 0

    return-void
.end method

.method protected onScreenWillShow()V
    .locals 0

    return-void
.end method

.method public onStart()V
    .locals 1

    .line 213
    iget-boolean v0, p0, Lcom/shopkick/app/screens/AppScreen;->shouldTriggerLifeCycleOnStart:Z

    if-eqz v0, :cond_0

    .line 214
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->screenWillShow()V

    const/4 v0, 0x0

    .line 215
    iput-boolean v0, p0, Lcom/shopkick/app/screens/AppScreen;->shouldTriggerLifeCycleOnStart:Z

    .line 217
    :cond_0
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V

    return-void
.end method

.method public popScreen()V
    .locals 1

    .line 321
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 323
    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->onBackPressed()V

    :cond_0
    return-void
.end method

.method public removeResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V
    .locals 1

    .line 293
    iget-object v0, p0, Lcom/shopkick/app/screens/AppScreen;->responsiveScreenConstraints:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 296
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/screens/AppScreen;->responsiveScreenConstraints:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 297
    iget-object p1, p0, Lcom/shopkick/app/screens/AppScreen;->responsiveScreenConstraints:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->isTopScreen()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lcom/shopkick/app/screens/AppScreen;->disableScreenResponsivenessLogging:Z

    if-nez p1, :cond_1

    .line 298
    iget-object p1, p0, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedScreenResponsive()V

    :cond_1
    return-void
.end method

.method public removeScreen()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 332
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    .line 333
    instance-of v1, v0, Lcom/shopkick/app/activities/MultiScreenActivity;

    if-eqz v1, :cond_0

    .line 334
    check-cast v0, Lcom/shopkick/app/activities/MultiScreenActivity;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->removeScreen(Lcom/shopkick/app/screens/AppScreen;)V

    :cond_0
    return-void
.end method

.method public requestResult()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final screenDidHide()V
    .locals 3

    .line 466
    iget-object v0, p0, Lcom/shopkick/app/screens/AppScreen;->params:Ljava/util/Map;

    const-string v1, "request_code"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, -0x1

    .line 467
    invoke-static {v0, v1}, Lcom/shopkick/app/util/TypeUtils;->toInteger(Ljava/lang/Object;I)I

    move-result v2

    if-eq v2, v1, :cond_0

    .line 468
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "request_code"

    .line 469
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "result_result"

    .line 470
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->requestResult()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    iget-object v0, p0, Lcom/shopkick/app/screens/AppScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "request_notification"

    invoke-virtual {v0, v2, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 473
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidHide()V

    return-void
.end method

.method public final screenDidShow()V
    .locals 3

    .line 371
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 376
    :cond_0
    invoke-direct {p0, v0}, Lcom/shopkick/app/screens/AppScreen;->shouldHideBack(Lcom/shopkick/app/activities/BaseActivity;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 377
    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->hideBack()V

    goto :goto_0

    .line 379
    :cond_1
    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->showBack()V

    .line 383
    :goto_0
    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->supportsToolbar()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 384
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->shouldDisplayAppScreenHeader()Z

    move-result v1

    if-nez v1, :cond_2

    .line 385
    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->hideToolbar()V

    goto :goto_1

    .line 387
    :cond_2
    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->showToolbar()V

    .line 391
    :cond_3
    :goto_1
    iget-object v1, p0, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    if-eqz v1, :cond_4

    instance-of v2, v0, Lcom/shopkick/app/activities/SplashActivity;

    if-nez v2, :cond_4

    .line 392
    invoke-virtual {v1}, Lcom/shopkick/app/logging/UserEventLogger;->maybeDetectedAppLaunchSIP()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 397
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 398
    const-class v2, Lcom/shopkick/app/browse/BrowseScreen;

    if-eq v1, v2, :cond_4

    const-class v2, Lcom/shopkick/app/store/EarnScreen;

    if-eq v1, v2, :cond_4

    const-class v2, Lcom/shopkick/app/registration/LoginPickerV3Screen;

    if-eq v1, v2, :cond_4

    const-class v2, Lcom/shopkick/app/launch/FirstUseV2DealsEducationScreen;

    if-eq v1, v2, :cond_4

    const-class v2, Lcom/shopkick/app/launch/TemplateOneButtonScreen;

    if-eq v1, v2, :cond_4

    const-class v2, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;

    if-eq v1, v2, :cond_4

    const-class v2, Lcom/shopkick/app/invite/InvitePromoCodeScreen;

    if-eq v1, v2, :cond_4

    .line 402
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v2, 0x6b6c4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 403
    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getContextStackLog()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setDebug(Ljava/lang/String;)V

    .line 404
    iget-object v2, p0, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v2, v1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 408
    :cond_4
    sget-object v1, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->STATIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {p0, v1}, Lcom/shopkick/app/screens/AppScreen;->removeResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    .line 409
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidShow()V

    .line 412
    new-instance v1, Lcom/shopkick/app/screens/-$$Lambda$iR9PgaGnPE0iezFi6AFYbeCnJwA;

    invoke-direct {v1, p0}, Lcom/shopkick/app/screens/-$$Lambda$iR9PgaGnPE0iezFi6AFYbeCnJwA;-><init>(Lcom/shopkick/app/screens/AppScreen;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/activities/BaseActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final screenWillHide()V
    .locals 0

    .line 430
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->hideKeyboard()V

    .line 431
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenWillHide()V

    .line 432
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->logDetectHidePage()V

    return-void
.end method

.method public final screenWillShow()V
    .locals 2

    .line 360
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->supportsToolbar()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->shouldDisplayAppScreenHeader()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 361
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 362
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/screens/AppScreen;->appScreenTitle:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/activities/BaseActivity;->setToolbarTitle(Ljava/lang/String;)V

    .line 364
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenWillShow()V

    return-void
.end method

.method protected setAppScreenTitle(I)V
    .locals 0

    .line 285
    invoke-virtual {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->setAppScreenTitle(Ljava/lang/String;)V

    return-void
.end method

.method protected setAppScreenTitle(Ljava/lang/String;)V
    .locals 1

    .line 263
    iput-object p1, p0, Lcom/shopkick/app/screens/AppScreen;->appScreenTitle:Ljava/lang/String;

    .line 264
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/screens/AppScreen;->appScreenTitle:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/activities/BaseActivity;->setToolbarTitle(Ljava/lang/String;)V

    return-void
.end method

.method protected setHomeAsUpIndicator(I)V
    .locals 1

    .line 274
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBar;->setHomeAsUpIndicator(I)V

    return-void
.end method

.method public setParams(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 108
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/screens/AppScreen;->params:Ljava/util/Map;

    .line 109
    iget-object v0, p0, Lcom/shopkick/app/screens/AppScreen;->params:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 110
    iget-object v0, p0, Lcom/shopkick/app/screens/AppScreen;->pageIdentifierV2:Lcom/shopkick/app/activities/PageIdentifierV2;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->setParams(Ljava/util/Map;)V

    return-void
.end method

.method public setRootScreenForCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V
    .locals 1
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

    .line 648
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/shopkick/app/activities/BaseActivity;->setRootScreenForCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method public shouldDisplayAppScreenHeader()Z
    .locals 1

    .line 240
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->supportsToolbar()Z

    move-result v0

    return v0
.end method

.method public shouldHideBack()Z
    .locals 1

    .line 244
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    .line 245
    invoke-direct {p0, v0}, Lcom/shopkick/app/screens/AppScreen;->shouldHideBack(Lcom/shopkick/app/activities/BaseActivity;)Z

    move-result v0

    return v0
.end method

.method public shouldTriggerLifeCycleOnResume()V
    .locals 1

    const/4 v0, 0x1

    .line 207
    iput-boolean v0, p0, Lcom/shopkick/app/screens/AppScreen;->shouldTriggerLifeCycleOnResume:Z

    return-void
.end method

.method public shouldTriggerLifeCycleOnStart()V
    .locals 1

    const/4 v0, 0x1

    .line 197
    iput-boolean v0, p0, Lcom/shopkick/app/screens/AppScreen;->shouldTriggerLifeCycleOnStart:Z

    return-void
.end method

.method public showKeyboard()V
    .locals 3

    .line 455
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "input_method"

    .line 457
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    const/4 v1, 0x2

    const/4 v2, 0x0

    .line 458
    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 524
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AppScreen [params="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/screens/AppScreen;->params:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pageIdentifier="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/screens/AppScreen;->pageIdentifierV2:Lcom/shopkick/app/activities/PageIdentifierV2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public updateOriginScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 2

    .line 669
    iget-object v0, p0, Lcom/shopkick/app/screens/AppScreen;->params:Ljava/util/Map;

    const-string v1, "origin_screen"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 670
    iget-object v0, p0, Lcom/shopkick/app/screens/AppScreen;->params:Ljava/util/Map;

    const-string v1, "origin_screen"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOriginScreen(Ljava/lang/Integer;)V

    .line 672
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/screens/AppScreen;->params:Ljava/util/Map;

    const-string v1, "origin_overlay"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 673
    iget-object v0, p0, Lcom/shopkick/app/screens/AppScreen;->params:Ljava/util/Map;

    const-string v1, "origin_overlay"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOriginOverlay(Ljava/lang/Integer;)V

    .line 675
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/screens/AppScreen;->params:Ljava/util/Map;

    const-string v1, "origin_element"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 676
    iget-object v0, p0, Lcom/shopkick/app/screens/AppScreen;->params:Ljava/util/Map;

    const-string v1, "origin_element"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOriginElement(Ljava/lang/Integer;)V

    .line 678
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/screens/AppScreen;->params:Ljava/util/Map;

    const-string v1, "origin_element_id"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 679
    iget-object v0, p0, Lcom/shopkick/app/screens/AppScreen;->params:Ljava/util/Map;

    const-string v1, "origin_element_id"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOriginElementId(Ljava/lang/String;)V

    .line 681
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/screens/AppScreen;->params:Ljava/util/Map;

    const-string v1, "origin_screen_id"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 682
    iget-object v0, p0, Lcom/shopkick/app/screens/AppScreen;->params:Ljava/util/Map;

    const-string v1, "origin_screen_id"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOriginScreenId(Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method public updateOverlayParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 0

    return-void
.end method

.method public updateScreenImpressionParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 0

    return-void
.end method

.method public updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 0

    return-void
.end method
