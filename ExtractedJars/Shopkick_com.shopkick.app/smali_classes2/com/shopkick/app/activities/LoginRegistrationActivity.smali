.class public Lcom/shopkick/app/activities/LoginRegistrationActivity;
.super Lcom/shopkick/app/activities/MultiScreenActivity;
.source "LoginRegistrationActivity.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# static fields
.field public static final AUTH_FROM_SPLASH_COMPLETED_SUCCESS:Ljava/lang/String; = "AUTH_FROM_SPLASH_COMPLETED_SUCCESS"

.field public static final IS_FROM_SPLASH_ACTIVITY:Ljava/lang/String; = "IS_FROM_SPLASH_ACTIVITY"

.field public static final LAUNCH_PHONE_VERIFICATION_POST_REGISTRATION:Ljava/lang/String; = "LaunchPhoneVerificationPostRegistration"

.field public static final LOGIN_SUCCESS:I = 0x1

.field public static final REGISTRATION_SUCCESS:I = 0x0

.field public static final RESULT_KEY:Ljava/lang/String; = "RESULT_KEY"


# instance fields
.field private isFromSplashActivity:Z

.field private isHandlingLaunchScreenSkLink:Z

.field public shouldLaunchPhoneVerificationPostRegistration:Z

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;-><init>()V

    return-void
.end method

.method private maybeHandleLaunchScreenSkLink()V
    .locals 3

    .line 72
    invoke-direct {p0}, Lcom/shopkick/app/activities/LoginRegistrationActivity;->shouldHandleLaunchScreenSkLink()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 73
    iget-object v0, p0, Lcom/shopkick/app/activities/LoginRegistrationActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->appLaunchController:Lcom/shopkick/app/application/AppLaunchController;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppLaunchController;->getAppLaunchState()Lcom/shopkick/app/application/AppLaunchState;

    move-result-object v0

    const/4 v1, 0x1

    .line 74
    iput-boolean v1, p0, Lcom/shopkick/app/activities/LoginRegistrationActivity;->isHandlingLaunchScreenSkLink:Z

    .line 75
    iget-object v1, p0, Lcom/shopkick/app/activities/LoginRegistrationActivity;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v2, v0, Lcom/shopkick/app/application/AppLaunchState;->shopkickLaunchLink:Landroid/net/Uri;

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    .line 76
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppLaunchState;->reset()V

    :cond_0
    return-void
.end method

.method private shouldHandleLaunchScreenSkLink()Z
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/shopkick/app/activities/LoginRegistrationActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->appLaunchController:Lcom/shopkick/app/application/AppLaunchController;

    if-eqz v0, :cond_0

    .line 83
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppLaunchController;->getAppLaunchState()Lcom/shopkick/app/application/AppLaunchState;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 85
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppLaunchState;->shouldHandleShopkickLaunchLinkWithoutLogin()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public finishActivityWithLoginSuccess()V
    .locals 3

    .line 105
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "RESULT_KEY"

    const/4 v2, 0x1

    .line 106
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/4 v1, -0x1

    .line 107
    invoke-virtual {p0, v1, v0}, Lcom/shopkick/app/activities/LoginRegistrationActivity;->setResult(ILandroid/content/Intent;)V

    .line 108
    iget-object v0, p0, Lcom/shopkick/app/activities/LoginRegistrationActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->isInFirstUse()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 111
    iget-object v0, p0, Lcom/shopkick/app/activities/LoginRegistrationActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/launch/FirstUseControllerV2;->gotoNextScreen(Z)Z

    goto :goto_0

    .line 112
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/activities/LoginRegistrationActivity;->isFromSplashActivity:Z

    if-eqz v0, :cond_1

    .line 113
    iget-object v0, p0, Lcom/shopkick/app/activities/LoginRegistrationActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "AUTH_FROM_SPLASH_COMPLETED_SUCCESS"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 114
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/shopkick/app/activities/LoginRegistrationActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/shopkick/app/activities/HomeActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 115
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/LoginRegistrationActivity;->startActivity(Landroid/content/Intent;)V

    .line 116
    invoke-virtual {p0}, Lcom/shopkick/app/activities/LoginRegistrationActivity;->finish()V

    goto :goto_0

    .line 118
    :cond_1
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/shopkick/app/activities/LoginRegistrationActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/shopkick/app/activities/HomeActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x4000000

    .line 119
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 120
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/LoginRegistrationActivity;->startActivity(Landroid/content/Intent;)V

    .line 121
    invoke-virtual {p0}, Lcom/shopkick/app/activities/LoginRegistrationActivity;->finish()V

    :goto_0
    return-void
.end method

.method public finishActivityWithRegistrationSuccess()V
    .locals 3

    .line 126
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "RESULT_KEY"

    const/4 v2, 0x0

    .line 127
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/4 v1, -0x1

    .line 128
    invoke-virtual {p0, v1, v0}, Lcom/shopkick/app/activities/LoginRegistrationActivity;->setResult(ILandroid/content/Intent;)V

    .line 129
    iget-object v0, p0, Lcom/shopkick/app/activities/LoginRegistrationActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->isInFirstUse()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Lcom/shopkick/app/activities/LoginRegistrationActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->gotoNextScreen()Z

    goto :goto_0

    .line 133
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/activities/LoginRegistrationActivity;->isFromSplashActivity:Z

    if-eqz v0, :cond_1

    .line 134
    iget-object v0, p0, Lcom/shopkick/app/activities/LoginRegistrationActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "AUTH_FROM_SPLASH_COMPLETED_SUCCESS"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 135
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/shopkick/app/activities/LoginRegistrationActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/shopkick/app/activities/HomeActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 136
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/LoginRegistrationActivity;->startActivity(Landroid/content/Intent;)V

    .line 137
    invoke-virtual {p0}, Lcom/shopkick/app/activities/LoginRegistrationActivity;->finish()V

    goto :goto_0

    .line 139
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/activities/LoginRegistrationActivity;->finish()V

    :goto_0
    return-void
.end method

.method protected getDefaultInitialScreen()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation

    .line 42
    const-class v0, Lcom/shopkick/app/registration/LoginPickerV3Screen;

    return-object v0
.end method

.method protected handleOnCreate()V
    .locals 3

    .line 47
    invoke-super {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->handleOnCreate()V

    .line 48
    invoke-virtual {p0}, Lcom/shopkick/app/activities/LoginRegistrationActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "IS_FROM_SPLASH_ACTIVITY"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/shopkick/app/activities/LoginRegistrationActivity;->isFromSplashActivity:Z

    .line 49
    invoke-virtual {p0}, Lcom/shopkick/app/activities/LoginRegistrationActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    iget-object v0, v0, Lcom/shopkick/app/screens/AppScreen;->params:Ljava/util/Map;

    const-string v1, "LaunchPhoneVerificationPostRegistration"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 50
    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/shopkick/app/activities/LoginRegistrationActivity;->shouldLaunchPhoneVerificationPostRegistration:Z

    .line 51
    iget-object v0, p0, Lcom/shopkick/app/activities/LoginRegistrationActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "firstUseScreensFinished"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 52
    iget-object v0, p0, Lcom/shopkick/app/activities/LoginRegistrationActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {v0}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/activities/LoginRegistrationActivity;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-void
.end method

.method protected handleOnDestroy()V
    .locals 2

    .line 57
    invoke-super {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->handleOnDestroy()V

    .line 58
    iget-object v0, p0, Lcom/shopkick/app/activities/LoginRegistrationActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 59
    iget-boolean v0, p0, Lcom/shopkick/app/activities/LoginRegistrationActivity;->shouldLaunchPhoneVerificationPostRegistration:Z

    if-eqz v0, :cond_0

    .line 60
    iget-object v0, p0, Lcom/shopkick/app/activities/LoginRegistrationActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/controllers/PhoneVerificationController;->launchVerifyPhoneFlow(Ljava/lang/String;)V

    .line 62
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/activities/LoginRegistrationActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->authenticator:Lcom/shopkick/app/account/Authenticator;

    invoke-virtual {v0}, Lcom/shopkick/app/account/Authenticator;->reset()V

    return-void
.end method

.method protected handleOnResume()V
    .locals 0

    .line 67
    invoke-super {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->handleOnResume()V

    .line 68
    invoke-direct {p0}, Lcom/shopkick/app/activities/LoginRegistrationActivity;->maybeHandleLaunchScreenSkLink()V

    return-void
.end method

.method public isHandlingLaunchScreenSkLink()Z
    .locals 1

    .line 93
    iget-boolean v0, p0, Lcom/shopkick/app/activities/LoginRegistrationActivity;->isHandlingLaunchScreenSkLink:Z

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

    const-string p2, "firstUseScreensFinished"

    .line 145
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 146
    iget-object p1, p0, Lcom/shopkick/app/activities/LoginRegistrationActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 147
    invoke-virtual {p0}, Lcom/shopkick/app/activities/LoginRegistrationActivity;->finish()V

    :cond_0
    return-void
.end method

.method public shouldAutomaticallyRetrieveCredentials()Z
    .locals 1

    .line 97
    iget-boolean v0, p0, Lcom/shopkick/app/activities/LoginRegistrationActivity;->isFromSplashActivity:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 101
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/activities/LoginRegistrationActivity;->shouldHandleLaunchScreenSkLink()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
