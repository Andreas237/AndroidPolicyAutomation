.class public Lcom/shopkick/app/activities/SplashActivity;
.super Lcom/shopkick/app/activities/BaseActivity;
.source "SplashActivity.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;,
        Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;,
        Lcom/shopkick/app/activities/SplashActivity$BailOutRunnable;
    }
.end annotation


# static fields
.field private static final ANIMATION_BAIL_OUT_TIME_SEC:I = 0xa

.field private static bailOutHandler:Landroid/os/Handler;

.field private static bailOutRunnable:Lcom/shopkick/app/activities/SplashActivity$BailOutRunnable;


# instance fields
.field private alert:Landroid/app/AlertDialog;

.field private appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field private credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

.field isHandleOnResumeCalled:Z

.field isRequestingPermission:Z

.field private mainView:Landroid/view/View;

.field private permissionInstructionAdapter:Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;

.field private permissionInstructionPager:Lcom/shopkick/app/widget/SKViewPager;

.field private selectCountryController:Lcom/shopkick/app/registration/SelectCountryController;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 77
    invoke-direct {p0}, Lcom/shopkick/app/activities/BaseActivity;-><init>()V

    const/4 v0, 0x0

    .line 93
    iput-boolean v0, p0, Lcom/shopkick/app/activities/SplashActivity;->isRequestingPermission:Z

    .line 94
    iput-boolean v0, p0, Lcom/shopkick/app/activities/SplashActivity;->isHandleOnResumeCalled:Z

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/activities/SplashActivity;)Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;
    .locals 0

    .line 77
    iget-object p0, p0, Lcom/shopkick/app/activities/SplashActivity;->permissionInstructionAdapter:Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;

    return-object p0
.end method

.method static synthetic access$1300(Lcom/shopkick/app/activities/SplashActivity;)Lcom/shopkick/app/widget/SKViewPager;
    .locals 0

    .line 77
    iget-object p0, p0, Lcom/shopkick/app/activities/SplashActivity;->permissionInstructionPager:Lcom/shopkick/app/widget/SKViewPager;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/activities/SplashActivity;)Lcom/shopkick/app/application/AppPreferences;
    .locals 0

    .line 77
    iget-object p0, p0, Lcom/shopkick/app/activities/SplashActivity;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/activities/SplashActivity;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Lcom/shopkick/app/activities/SplashActivity;->retryCreateGuestRequest()V

    return-void
.end method

.method static synthetic access$500(Lcom/shopkick/app/activities/SplashActivity;Ljava/lang/Integer;)V
    .locals 0

    .line 77
    invoke-direct {p0, p1}, Lcom/shopkick/app/activities/SplashActivity;->logEventWithAction(Ljava/lang/Integer;)V

    return-void
.end method

.method static synthetic access$600(Lcom/shopkick/app/activities/SplashActivity;Ljava/util/Map;)V
    .locals 0

    .line 77
    invoke-direct {p0, p1}, Lcom/shopkick/app/activities/SplashActivity;->launchFirstUse(Ljava/util/Map;)V

    return-void
.end method

.method private handleCredentialCheckFailure()V
    .locals 0

    .line 379
    invoke-direct {p0}, Lcom/shopkick/app/activities/SplashActivity;->setUpFirstUse()V

    return-void
.end method

.method private handleCredentialCheckSuccess()V
    .locals 1

    .line 374
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->setFirstUseCompletedIfNotTrue()V

    .line 375
    invoke-direct {p0}, Lcom/shopkick/app/activities/SplashActivity;->launchLoginRegistrationActivity()V

    return-void
.end method

.method private launchFirstUse(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 423
    sget-object v0, Lcom/shopkick/app/activities/SplashActivity;->bailOutHandler:Landroid/os/Handler;

    sget-object v1, Lcom/shopkick/app/activities/SplashActivity;->bailOutRunnable:Lcom/shopkick/app/activities/SplashActivity$BailOutRunnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 424
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 426
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->checkUserAlreadyRegisteredAndShouldSkipFirstUse()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 427
    invoke-direct {p0}, Lcom/shopkick/app/activities/SplashActivity;->launchHomeActivity()V

    goto :goto_0

    .line 429
    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/shopkick/app/activities/SplashActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/shopkick/app/activities/FirstUseActivityV2;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x4000000

    .line 430
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const-string v1, "page_identifier"

    .line 432
    iget-object v2, p0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v2, v2, Lcom/shopkick/app/application/ScreenGlobals;->firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

    .line 433
    invoke-virtual {v2, p1}, Lcom/shopkick/app/launch/FirstUseControllerV2;->getInitialScreenPageIdentifier(Ljava/util/Map;)Lcom/shopkick/app/activities/PageIdentifierV2;

    move-result-object p1

    .line 432
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 434
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/SplashActivity;->startActivity(Landroid/content/Intent;)V

    .line 435
    invoke-virtual {p0}, Lcom/shopkick/app/activities/SplashActivity;->finish()V

    :goto_0
    return-void
.end method

.method private launchHomeActivity()V
    .locals 3

    .line 440
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/shopkick/app/activities/SplashActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/shopkick/app/activities/HomeActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x4000000

    .line 441
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 442
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/SplashActivity;->startActivity(Landroid/content/Intent;)V

    .line 443
    invoke-virtual {p0}, Lcom/shopkick/app/activities/SplashActivity;->finish()V

    return-void
.end method

.method private launchLoginRegistrationActivity()V
    .locals 3

    .line 408
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/shopkick/app/activities/SplashActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/shopkick/app/activities/LoginRegistrationActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x4000000

    .line 409
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const-string v1, "IS_FROM_SPLASH_ACTIVITY"

    const/4 v2, 0x1

    .line 410
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 411
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/SplashActivity;->startActivity(Landroid/content/Intent;)V

    .line 412
    invoke-virtual {p0}, Lcom/shopkick/app/activities/SplashActivity;->finish()V

    return-void
.end method

.method private logEventWithAction(Ljava/lang/Integer;)V
    .locals 1

    .line 470
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    .line 471
    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 472
    iget-object p1, p0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method private retryCreateGuestRequest()V
    .locals 1

    .line 466
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->launch()V

    return-void
.end method

.method private setUpFirstUse()V
    .locals 5

    .line 388
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "firstUseControllerReady"

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 389
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "CreateGuestRequestFailure"

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 390
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "firstUseControllerFetchFailed"

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 393
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "CreateGuestRequestFailureNoCountry"

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 397
    sget-object v0, Lcom/shopkick/app/activities/SplashActivity;->bailOutHandler:Landroid/os/Handler;

    sget-object v1, Lcom/shopkick/app/activities/SplashActivity;->bailOutRunnable:Lcom/shopkick/app/activities/SplashActivity$BailOutRunnable;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0xa

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 398
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->launch()V

    return-void
.end method

.method private setupAnimations()V
    .locals 10

    .line 526
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->mainView:Landroid/view/View;

    const v1, 0x7f0901a0

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 527
    new-instance v8, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;

    const/16 v3, 0xc8

    const/4 v4, 0x5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p0

    invoke-direct/range {v0 .. v7}, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;-><init>(Lcom/shopkick/app/activities/SplashActivity;Landroid/view/View;IIIZLcom/shopkick/app/activities/SplashActivity$AnimatedDot;)V

    .line 529
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->mainView:Landroid/view/View;

    const v1, 0x7f09059b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 530
    new-instance v9, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;

    const/4 v4, 0x4

    const/4 v6, 0x1

    move-object v0, v9

    move-object v1, p0

    move-object v7, v8

    invoke-direct/range {v0 .. v7}, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;-><init>(Lcom/shopkick/app/activities/SplashActivity;Landroid/view/View;IIIZLcom/shopkick/app/activities/SplashActivity$AnimatedDot;)V

    .line 532
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->mainView:Landroid/view/View;

    const v1, 0x7f09057e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 533
    new-instance v8, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;

    const/4 v4, 0x3

    move-object v0, v8

    move-object v1, p0

    move-object v7, v9

    invoke-direct/range {v0 .. v7}, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;-><init>(Lcom/shopkick/app/activities/SplashActivity;Landroid/view/View;IIIZLcom/shopkick/app/activities/SplashActivity$AnimatedDot;)V

    .line 540
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->mainView:Landroid/view/View;

    const v1, 0x7f0902c4

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 541
    new-instance v9, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;

    const/4 v4, 0x2

    move-object v0, v9

    move-object v1, p0

    move-object v7, v8

    invoke-direct/range {v0 .. v7}, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;-><init>(Lcom/shopkick/app/activities/SplashActivity;Landroid/view/View;IIIZLcom/shopkick/app/activities/SplashActivity$AnimatedDot;)V

    .line 548
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->mainView:Landroid/view/View;

    const v1, 0x7f0901c4

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 549
    new-instance v8, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;

    const/4 v4, 0x1

    move-object v0, v8

    move-object v1, p0

    move-object v7, v9

    invoke-direct/range {v0 .. v7}, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;-><init>(Lcom/shopkick/app/activities/SplashActivity;Landroid/view/View;IIIZLcom/shopkick/app/activities/SplashActivity$AnimatedDot;)V

    .line 556
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->mainView:Landroid/view/View;

    const v1, 0x7f09052b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 557
    new-instance v9, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;

    const/4 v4, 0x0

    const/16 v5, 0x3e8

    move-object v0, v9

    move-object v1, p0

    move-object v7, v8

    invoke-direct/range {v0 .. v7}, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;-><init>(Lcom/shopkick/app/activities/SplashActivity;Landroid/view/View;IIIZLcom/shopkick/app/activities/SplashActivity$AnimatedDot;)V

    .line 563
    invoke-virtual {v9}, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->startZoomInAnimation()V

    return-void
.end method

.method private shouldHandleLaunchScreenSkLink()Z
    .locals 1

    .line 402
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->appLaunchController:Lcom/shopkick/app/application/AppLaunchController;

    .line 403
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppLaunchController;->getAppLaunchState()Lcom/shopkick/app/application/AppLaunchState;

    move-result-object v0

    .line 404
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppLaunchState;->shouldHandleShopkickLaunchLinkWithoutLogin()Z

    move-result v0

    return v0
.end method

.method private showErrorAlert(Ljava/lang/String;)V
    .locals 3

    .line 448
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f1102ea

    .line 449
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 450
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const/4 v1, 0x0

    .line 451
    invoke-virtual {p1, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    new-instance v1, Lcom/shopkick/app/activities/SplashActivity$3;

    invoke-direct {v1, p0}, Lcom/shopkick/app/activities/SplashActivity$3;-><init>(Lcom/shopkick/app/activities/SplashActivity;)V

    const v2, 0x1040013

    .line 452
    invoke-virtual {p1, v2, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 459
    iget-object p1, p0, Lcom/shopkick/app/activities/SplashActivity;->alert:Landroid/app/AlertDialog;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/AlertDialog;->isShowing()Z

    move-result p1

    if-nez p1, :cond_1

    .line 460
    :cond_0
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/activities/SplashActivity;->alert:Landroid/app/AlertDialog;

    .line 461
    iget-object p1, p0, Lcom/shopkick/app/activities/SplashActivity;->alert:Landroid/app/AlertDialog;

    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    :cond_1
    return-void
.end method


# virtual methods
.method public getTopScreen()Lcom/shopkick/app/screens/AppScreen;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected goToScreenInCurrentActivity(Lcom/shopkick/app/activities/PageIdentifierV2;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method protected handleOnCreate()V
    .locals 2

    .line 103
    invoke-super {p0}, Lcom/shopkick/app/activities/BaseActivity;->handleOnCreate()V

    const v0, 0x7f0c01c4

    .line 105
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/SplashActivity;->setContentView(I)V

    const v0, 0x7f0906c1

    .line 106
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/SplashActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->mainView:Landroid/view/View;

    const v0, 0x7f09051e

    .line 107
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/SplashActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKViewPager;

    iput-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->permissionInstructionPager:Lcom/shopkick/app/widget/SKViewPager;

    .line 109
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    sput-object v0, Lcom/shopkick/app/activities/SplashActivity;->bailOutHandler:Landroid/os/Handler;

    .line 110
    new-instance v0, Lcom/shopkick/app/activities/SplashActivity$BailOutRunnable;

    invoke-direct {v0, p0}, Lcom/shopkick/app/activities/SplashActivity$BailOutRunnable;-><init>(Lcom/shopkick/app/activities/SplashActivity;)V

    sput-object v0, Lcom/shopkick/app/activities/SplashActivity;->bailOutRunnable:Lcom/shopkick/app/activities/SplashActivity$BailOutRunnable;

    .line 113
    sget-object v0, Lcom/shopkick/app/permissions/PermissionUtils;->BOOT_UP_PERMISSIONS:[Ljava/lang/String;

    invoke-static {v0, p0}, Lcom/shopkick/app/permissions/PermissionUtils;->arePermissionsEnabled([Ljava/lang/String;Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 114
    invoke-direct {p0}, Lcom/shopkick/app/activities/SplashActivity;->setupAnimations()V

    .line 117
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iput-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 119
    invoke-virtual {p0}, Lcom/shopkick/app/activities/SplashActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 120
    iget-object v1, p0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->appLaunchController:Lcom/shopkick/app/application/AppLaunchController;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/AppLaunchController;->parseIntent(Landroid/content/Intent;)V

    .line 121
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->appLaunchController:Lcom/shopkick/app/application/AppLaunchController;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppLaunchController;->getAlarmId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 123
    iget-object v1, p0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/util/AlarmScheduler;->cancel(Ljava/lang/String;)V

    .line 125
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

    iput-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

    return-void
.end method

.method protected handleOnDestroy()V
    .locals 2

    .line 218
    sget-object v0, Lcom/shopkick/app/activities/SplashActivity;->bailOutHandler:Landroid/os/Handler;

    sget-object v1, Lcom/shopkick/app/activities/SplashActivity;->bailOutRunnable:Lcom/shopkick/app/activities/SplashActivity$BailOutRunnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 219
    invoke-super {p0}, Lcom/shopkick/app/activities/BaseActivity;->handleOnDestroy()V

    return-void
.end method

.method protected handleOnResume()V
    .locals 3

    .line 224
    iget-boolean v0, p0, Lcom/shopkick/app/activities/SplashActivity;->isRequestingPermission:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 225
    iput-boolean v0, p0, Lcom/shopkick/app/activities/SplashActivity;->isHandleOnResumeCalled:Z

    return-void

    .line 229
    :cond_0
    invoke-super {p0}, Lcom/shopkick/app/activities/BaseActivity;->handleOnResume()V

    .line 231
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->isRegistered()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 237
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->setFirstUseCompletedIfNotTrue()V

    .line 238
    invoke-direct {p0}, Lcom/shopkick/app/activities/SplashActivity;->launchHomeActivity()V

    goto :goto_0

    .line 240
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getFirstUseCompleted()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 246
    invoke-direct {p0}, Lcom/shopkick/app/activities/SplashActivity;->launchLoginRegistrationActivity()V

    goto :goto_0

    .line 248
    :cond_2
    invoke-direct {p0}, Lcom/shopkick/app/activities/SplashActivity;->shouldHandleLaunchScreenSkLink()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 256
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->setFirstUseCompletedIfNotTrue()V

    .line 257
    invoke-direct {p0}, Lcom/shopkick/app/activities/SplashActivity;->launchLoginRegistrationActivity()V

    goto :goto_0

    .line 272
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "CREDENTIAL_CHECK_SUCCESS"

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 273
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "CREDENTIAL_CHECK_FAILURE"

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 274
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/account/CredentialStorageController;->checkCredential(Landroid/app/Activity;)V

    :goto_0
    return-void
.end method

.method protected handleOnStart()V
    .locals 3

    const/4 v0, 0x0

    .line 130
    iput-boolean v0, p0, Lcom/shopkick/app/activities/SplashActivity;->isRequestingPermission:Z

    .line 131
    iput-boolean v0, p0, Lcom/shopkick/app/activities/SplashActivity;->isHandleOnResumeCalled:Z

    .line 134
    sget-object v1, Lcom/shopkick/app/permissions/PermissionUtils;->BOOT_UP_PERMISSIONS:[Ljava/lang/String;

    invoke-static {v1, p0}, Lcom/shopkick/app/permissions/PermissionUtils;->arePermissionsEnabled([Ljava/lang/String;Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 135
    iput-boolean v1, p0, Lcom/shopkick/app/activities/SplashActivity;->isRequestingPermission:Z

    .line 137
    new-instance v1, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;

    invoke-direct {v1, p0}, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;-><init>(Lcom/shopkick/app/activities/SplashActivity;)V

    iput-object v1, p0, Lcom/shopkick/app/activities/SplashActivity;->permissionInstructionAdapter:Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;

    .line 138
    iget-object v1, p0, Lcom/shopkick/app/activities/SplashActivity;->permissionInstructionPager:Lcom/shopkick/app/widget/SKViewPager;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKViewPager;->setPagingEnabled(Z)V

    .line 139
    iget-object v1, p0, Lcom/shopkick/app/activities/SplashActivity;->permissionInstructionPager:Lcom/shopkick/app/widget/SKViewPager;

    iget-object v2, p0, Lcom/shopkick/app/activities/SplashActivity;->permissionInstructionAdapter:Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/SKViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 140
    iget-object v1, p0, Lcom/shopkick/app/activities/SplashActivity;->permissionInstructionPager:Lcom/shopkick/app/widget/SKViewPager;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKViewPager;->setVisibility(I)V

    .line 141
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->permissionInstructionPager:Lcom/shopkick/app/widget/SKViewPager;

    new-instance v1, Lcom/shopkick/app/activities/SplashActivity$1;

    invoke-direct {v1, p0}, Lcom/shopkick/app/activities/SplashActivity$1;-><init>(Lcom/shopkick/app/activities/SplashActivity;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKViewPager;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 151
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/activities/SplashActivity;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppPreferences;->clearAskPermissionGroupDisabled()V

    .line 152
    iput-boolean v0, p0, Lcom/shopkick/app/activities/SplashActivity;->isRequestingPermission:Z

    .line 153
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->permissionInstructionPager:Lcom/shopkick/app/widget/SKViewPager;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKViewPager;->setVisibility(I)V

    .line 156
    invoke-super {p0}, Lcom/shopkick/app/activities/BaseActivity;->handleOnStart()V

    .line 159
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object v0

    .line 161
    new-instance v1, Lcom/shopkick/app/activities/SplashActivity$2;

    invoke-direct {v1, p0}, Lcom/shopkick/app/activities/SplashActivity$2;-><init>(Lcom/shopkick/app/activities/SplashActivity;)V

    .line 206
    invoke-virtual {p0}, Lcom/shopkick/app/activities/SplashActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v2

    .line 161
    invoke-virtual {v0, v1, v2, p0}, Lio/branch/referral/Branch;->initSession(Lio/branch/referral/Branch$BranchReferralInitListener;Landroid/net/Uri;Landroid/app/Activity;)Z

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 6
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

    .line 298
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, -0x1

    const/4 v3, 0x0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "CREDENTIAL_CHECK_FAILURE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_1

    :sswitch_1
    const-string v0, "CREDENTIAL_CHECK_SUCCESS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v3

    goto :goto_1

    :sswitch_2
    const-string v0, "CreateGuestRequestFailure"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    goto :goto_1

    :sswitch_3
    const-string v0, "CreateGuestRequestFailureNoCountry"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x5

    goto :goto_1

    :sswitch_4
    const-string v0, "firstUseControllerReady"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    goto :goto_1

    :sswitch_5
    const-string v0, "USER_SELECTED_COUNTRY_EVENT"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x6

    goto :goto_1

    :sswitch_6
    const-string v0, "firstUseControllerFetchFailed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_1

    :cond_0
    :goto_0
    move v0, v2

    :goto_1
    packed-switch v0, :pswitch_data_0

    goto/16 :goto_5

    .line 366
    :pswitch_0
    invoke-direct {p0}, Lcom/shopkick/app/activities/SplashActivity;->retryCreateGuestRequest()V

    .line 368
    sget-object p1, Lcom/shopkick/app/activities/SplashActivity;->bailOutHandler:Landroid/os/Handler;

    sget-object p2, Lcom/shopkick/app/activities/SplashActivity;->bailOutRunnable:Lcom/shopkick/app/activities/SplashActivity$BailOutRunnable;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xa

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_5

    .line 355
    :pswitch_1
    sget-object p1, Lcom/shopkick/app/activities/SplashActivity;->bailOutHandler:Landroid/os/Handler;

    sget-object p2, Lcom/shopkick/app/activities/SplashActivity;->bailOutRunnable:Lcom/shopkick/app/activities/SplashActivity$BailOutRunnable;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 357
    new-instance p1, Lcom/shopkick/app/registration/SelectCountryController;

    iget-object p2, p0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p2, p2, Lcom/shopkick/app/application/ScreenGlobals;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-direct {p1, p0, p2, v0}, Lcom/shopkick/app/registration/SelectCountryController;-><init>(Lcom/shopkick/app/activities/BaseActivity;Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/util/NotificationCenter;)V

    iput-object p1, p0, Lcom/shopkick/app/activities/SplashActivity;->selectCountryController:Lcom/shopkick/app/registration/SelectCountryController;

    .line 360
    iget-object p1, p0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "USER_SELECTED_COUNTRY_EVENT"

    invoke-virtual {p1, p0, p2, v3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 363
    iget-object p1, p0, Lcom/shopkick/app/activities/SplashActivity;->selectCountryController:Lcom/shopkick/app/registration/SelectCountryController;

    invoke-virtual {p1}, Lcom/shopkick/app/registration/SelectCountryController;->showSelectCountryDialog()V

    goto/16 :goto_5

    .line 324
    :pswitch_2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v4, "CreateGuestRequestFailure"

    .line 325
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "FailedEventParam"

    .line 326
    sget-object v5, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->GUEST_ACCOUNT_CREATE:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    .line 327
    invoke-virtual {v5}, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->getValue()I

    move-result v5

    .line 326
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_1
    const-string v4, "FailedEventParam"

    .line 329
    sget-object v5, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->FIRST_USE_CONFIG_FETCH:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    .line 330
    invoke-virtual {v5}, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->getValue()I

    move-result v5

    .line 329
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    const-string v4, "ErrorMsg"

    const-string v5, "ErrorMsg"

    .line 332
    invoke-virtual {p2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "HttpStatusCode"

    const-string v5, "HttpStatusCode"

    .line 333
    invoke-virtual {p2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "ClientErrorCode"

    const-string v5, "ClientErrorCode"

    .line 335
    invoke-virtual {p2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, v4, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    invoke-direct {p0, v0}, Lcom/shopkick/app/activities/SplashActivity;->launchFirstUse(Ljava/util/Map;)V

    .line 341
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const v0, -0x63cec61c

    if-eq p2, v0, :cond_3

    const v0, -0x37eeac9

    if-eq p2, v0, :cond_2

    goto :goto_3

    :cond_2
    const-string p2, "CreateGuestRequestFailure"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    move v1, v3

    goto :goto_4

    :cond_3
    const-string p2, "firstUseControllerFetchFailed"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_4

    :cond_4
    :goto_3
    move v1, v2

    :goto_4
    packed-switch v1, :pswitch_data_1

    goto :goto_5

    :pswitch_3
    const/16 p1, 0x49

    .line 346
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/activities/SplashActivity;->logEventWithAction(Ljava/lang/Integer;)V

    goto :goto_5

    :pswitch_4
    const/16 p1, 0x48

    .line 343
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/activities/SplashActivity;->logEventWithAction(Ljava/lang/Integer;)V

    goto :goto_5

    :pswitch_5
    const p1, 0x77a17

    .line 310
    invoke-static {p1}, Lcom/shopkick/app/application/SIP;->onEndEvent(I)V

    const/4 p1, 0x0

    .line 315
    invoke-direct {p0, p1}, Lcom/shopkick/app/activities/SplashActivity;->launchFirstUse(Ljava/util/Map;)V

    goto :goto_5

    .line 305
    :pswitch_6
    iget-object p1, p0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "CREDENTIAL_CHECK_SUCCESS"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 306
    iget-object p1, p0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "CREDENTIAL_CHECK_FAILURE"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 307
    invoke-direct {p0}, Lcom/shopkick/app/activities/SplashActivity;->handleCredentialCheckFailure()V

    goto :goto_5

    .line 300
    :pswitch_7
    iget-object p1, p0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "CREDENTIAL_CHECK_SUCCESS"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 301
    iget-object p1, p0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "CREDENTIAL_CHECK_FAILURE"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 302
    invoke-direct {p0}, Lcom/shopkick/app/activities/SplashActivity;->handleCredentialCheckSuccess()V

    :goto_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x63cec61c -> :sswitch_6
        -0x4036bf3f -> :sswitch_5
        -0x3d120250 -> :sswitch_4
        -0x2585f0e2 -> :sswitch_3
        -0x37eeac9 -> :sswitch_2
        0xf84b9a4 -> :sswitch_1
        0x3e0bab2b -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 0

    .line 211
    invoke-super {p0, p1}, Lcom/shopkick/app/activities/BaseActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 212
    invoke-virtual {p0, p1}, Lcom/shopkick/app/activities/SplashActivity;->setIntent(Landroid/content/Intent;)V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 2
    .param p2    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # [I
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 478
    invoke-super {p0, p1, p2, p3}, Lcom/shopkick/app/activities/BaseActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    const/16 v0, 0x1c

    if-ne p1, v0, :cond_5

    .line 479
    array-length p1, p3

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    .line 481
    aget-object v0, p2, p1

    invoke-static {p0, v0}, Lcom/shopkick/app/permissions/PermissionUtils;->getPermissionGroupFromPermission(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 482
    aget p3, p3, p1

    const/4 v1, 0x1

    if-nez p3, :cond_3

    .line 485
    sget-object p2, Lcom/shopkick/app/permissions/PermissionUtils;->BOOT_UP_PERMISSIONS:[Ljava/lang/String;

    invoke-static {p2, p0}, Lcom/shopkick/app/permissions/PermissionUtils;->arePermissionsEnabled([Ljava/lang/String;Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 486
    invoke-virtual {p0}, Lcom/shopkick/app/activities/SplashActivity;->handleOnStart()V

    .line 487
    iget-boolean p2, p0, Lcom/shopkick/app/activities/SplashActivity;->isHandleOnResumeCalled:Z

    if-eqz p2, :cond_1

    .line 488
    invoke-virtual {p0}, Lcom/shopkick/app/activities/SplashActivity;->handleOnResume()V

    .line 492
    :cond_1
    iget-object p2, p0, Lcom/shopkick/app/activities/SplashActivity;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p2, v1}, Lcom/shopkick/app/application/AppPreferences;->setAllPermissionsGrantedBefore(Z)V

    .line 493
    iget-object p2, p0, Lcom/shopkick/app/activities/SplashActivity;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p2}, Lcom/shopkick/app/application/AppPreferences;->clearAskPermissionGroupDisabled()V

    .line 494
    iput-boolean p1, p0, Lcom/shopkick/app/activities/SplashActivity;->isRequestingPermission:Z

    .line 495
    iput-boolean p1, p0, Lcom/shopkick/app/activities/SplashActivity;->isHandleOnResumeCalled:Z

    goto :goto_0

    .line 498
    :cond_2
    iget-object p2, p0, Lcom/shopkick/app/activities/SplashActivity;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p2, v0, p1}, Lcom/shopkick/app/application/AppPreferences;->setAskPermissionGroupDisabled(Ljava/lang/String;Z)V

    .line 499
    iget-object p1, p0, Lcom/shopkick/app/activities/SplashActivity;->permissionInstructionPager:Lcom/shopkick/app/widget/SKViewPager;

    invoke-virtual {p1}, Lcom/shopkick/app/widget/SKViewPager;->gotoNextPage()V

    goto :goto_0

    .line 502
    :cond_3
    aget-object p3, p2, p1

    invoke-static {p0, p3}, Landroid/support/v4/app/ActivityCompat;->shouldShowRequestPermissionRationale(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_4

    goto :goto_0

    .line 507
    :cond_4
    iget-object p3, p0, Lcom/shopkick/app/activities/SplashActivity;->permissionInstructionAdapter:Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;

    aget-object p1, p2, p1

    invoke-static {p3, p1}, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->access$400(Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;Ljava/lang/String;)V

    .line 510
    iget-object p1, p0, Lcom/shopkick/app/activities/SplashActivity;->permissionInstructionAdapter:Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;

    invoke-static {p1}, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->access$100(Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;)V

    .line 513
    iget-object p1, p0, Lcom/shopkick/app/activities/SplashActivity;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setAskPermissionGroupDisabled(Ljava/lang/String;Z)V

    :goto_0
    return-void

    :cond_5
    :goto_1
    return-void
.end method

.method public setRootScreenForCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V
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

    return-void
.end method

.method protected showDefaultActivityView()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
