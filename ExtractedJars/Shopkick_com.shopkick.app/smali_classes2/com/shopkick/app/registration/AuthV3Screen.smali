.class public abstract Lcom/shopkick/app/registration/AuthV3Screen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "AuthV3Screen.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# instance fields
.field protected authenticator:Lcom/shopkick/app/account/Authenticator;

.field private authenticatorArgs:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private authenticatorFailure:Z

.field private authenticatorSuccess:Z

.field protected errorBox:Lcom/shopkick/app/widget/AuthV3ErrorBox;

.field protected firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

.field protected flowId:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field protected notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field protected userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method private handleAuthenticatorCanceled(Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method private handleAuthenticatorFailure(Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "AUTHENTICATOR_ERROR_MESSAGE_KEY"

    .line 141
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 142
    iget-object v0, p0, Lcom/shopkick/app/registration/AuthV3Screen;->errorBox:Lcom/shopkick/app/widget/AuthV3ErrorBox;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->setError(Ljava/lang/String;)V

    return-void
.end method

.method private handleAuthenticatorSuccess(Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "AUTHENTICATOR_ACTION_KEY"

    .line 126
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/account/Authenticator$AuthAction;

    .line 127
    invoke-virtual {p0}, Lcom/shopkick/app/registration/AuthV3Screen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/activities/LoginRegistrationActivity;

    if-nez p1, :cond_0

    const-string v1, "Authentication info missing"

    .line 129
    invoke-static {v1}, Lcom/shopkick/app/util/SKAssertion;->throwAssertionError(Ljava/lang/String;)V

    .line 130
    invoke-virtual {v0}, Lcom/shopkick/app/activities/LoginRegistrationActivity;->finish()V

    .line 133
    :cond_0
    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthAction;->LOGIN:Lcom/shopkick/app/account/Authenticator$AuthAction;

    if-ne p1, v1, :cond_1

    .line 134
    invoke-virtual {v0}, Lcom/shopkick/app/activities/LoginRegistrationActivity;->finishActivityWithLoginSuccess()V

    goto :goto_0

    .line 136
    :cond_1
    invoke-virtual {v0}, Lcom/shopkick/app/activities/LoginRegistrationActivity;->finishActivityWithRegistrationSuccess()V

    :goto_0
    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 67
    iget-object p1, p0, Lcom/shopkick/app/registration/AuthV3Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "AUTHENTICATOR_SUCCESS"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 68
    iget-object p1, p0, Lcom/shopkick/app/registration/AuthV3Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "AUTHENTICATOR_FAILURE"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 69
    iget-object p1, p0, Lcom/shopkick/app/registration/AuthV3Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "AUTHENTICATOR_CANCEL"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 1
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

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

    .line 42
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->authenticator:Lcom/shopkick/app/account/Authenticator;

    iput-object v0, p0, Lcom/shopkick/app/registration/AuthV3Screen;->authenticator:Lcom/shopkick/app/account/Authenticator;

    .line 43
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object v0, p0, Lcom/shopkick/app/registration/AuthV3Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 44
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

    iput-object v0, p0, Lcom/shopkick/app/registration/AuthV3Screen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    .line 46
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    iput-object p1, p0, Lcom/shopkick/app/registration/AuthV3Screen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    .line 47
    iget-object p1, p0, Lcom/shopkick/app/registration/AuthV3Screen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccountDataSource;->userIsRegistered()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    const-string v0, "This screen should never be displayed to a registered user."

    invoke-static {p1, v0}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    .line 49
    iget-object p1, p0, Lcom/shopkick/app/registration/AuthV3Screen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {p1}, Lcom/shopkick/app/launch/FirstUseControllerV2;->isInFirstUse()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 50
    invoke-virtual {p0, p2}, Lcom/shopkick/app/registration/AuthV3Screen;->setParams(Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public onDestroy()V
    .locals 1
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 76
    iget-object v0, p0, Lcom/shopkick/app/registration/AuthV3Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 77
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 4
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

    .line 98
    invoke-virtual {p0}, Lcom/shopkick/app/registration/AuthV3Screen;->isTopScreen()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, -0x1

    .line 101
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0x5eefc309

    const/4 v3, 0x1

    if-eq v1, v2, :cond_3

    const v2, -0x50fec11a

    if-eq v1, v2, :cond_2

    const v2, -0x3068d182

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    const-string v1, "AUTHENTICATOR_FAILURE"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    move v0, v3

    goto :goto_0

    :cond_2
    const-string v1, "AUTHENTICATOR_CANCEL"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 v0, 0x2

    goto :goto_0

    :cond_3
    const-string v1, "AUTHENTICATOR_SUCCESS"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 v0, 0x0

    :cond_4
    :goto_0
    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 119
    :pswitch_0
    invoke-direct {p0, p2}, Lcom/shopkick/app/registration/AuthV3Screen;->handleAuthenticatorCanceled(Ljava/util/HashMap;)V

    goto :goto_1

    .line 111
    :pswitch_1
    iget-object p1, p0, Lcom/shopkick/app/registration/AuthV3Screen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 112
    invoke-direct {p0, p2}, Lcom/shopkick/app/registration/AuthV3Screen;->handleAuthenticatorFailure(Ljava/util/HashMap;)V

    goto :goto_1

    .line 114
    :cond_5
    iput-object p2, p0, Lcom/shopkick/app/registration/AuthV3Screen;->authenticatorArgs:Ljava/util/HashMap;

    .line 115
    iput-boolean v3, p0, Lcom/shopkick/app/registration/AuthV3Screen;->authenticatorFailure:Z

    goto :goto_1

    .line 103
    :pswitch_2
    iget-object p1, p0, Lcom/shopkick/app/registration/AuthV3Screen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 104
    invoke-direct {p0, p2}, Lcom/shopkick/app/registration/AuthV3Screen;->handleAuthenticatorSuccess(Ljava/util/HashMap;)V

    goto :goto_1

    .line 106
    :cond_6
    iput-object p2, p0, Lcom/shopkick/app/registration/AuthV3Screen;->authenticatorArgs:Ljava/util/HashMap;

    .line 107
    iput-boolean v3, p0, Lcom/shopkick/app/registration/AuthV3Screen;->authenticatorSuccess:Z

    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onResume()V
    .locals 3

    .line 82
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onResume()V

    .line 83
    iget-boolean v0, p0, Lcom/shopkick/app/registration/AuthV3Screen;->authenticatorSuccess:Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/registration/AuthV3Screen;->authenticatorArgs:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    .line 85
    iput-object v2, p0, Lcom/shopkick/app/registration/AuthV3Screen;->authenticatorArgs:Ljava/util/HashMap;

    .line 86
    iput-boolean v1, p0, Lcom/shopkick/app/registration/AuthV3Screen;->authenticatorSuccess:Z

    .line 87
    invoke-direct {p0, v0}, Lcom/shopkick/app/registration/AuthV3Screen;->handleAuthenticatorSuccess(Ljava/util/HashMap;)V

    goto :goto_0

    .line 88
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/registration/AuthV3Screen;->authenticatorFailure:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/registration/AuthV3Screen;->authenticatorArgs:Ljava/util/HashMap;

    if-eqz v0, :cond_1

    .line 90
    iput-object v2, p0, Lcom/shopkick/app/registration/AuthV3Screen;->authenticatorArgs:Ljava/util/HashMap;

    .line 91
    iput-boolean v1, p0, Lcom/shopkick/app/registration/AuthV3Screen;->authenticatorFailure:Z

    .line 92
    invoke-direct {p0, v0}, Lcom/shopkick/app/registration/AuthV3Screen;->handleAuthenticatorFailure(Ljava/util/HashMap;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public updateScreenImpressionParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 2

    .line 56
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->updateScreenImpressionParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 58
    iget-object v0, p0, Lcom/shopkick/app/registration/AuthV3Screen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->isInFirstUse()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 59
    iget-object v0, p0, Lcom/shopkick/app/registration/AuthV3Screen;->params:Ljava/util/Map;

    const-string v1, "flow_id"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/registration/AuthV3Screen;->flowId:Ljava/lang/String;

    .line 60
    iget-object v0, p0, Lcom/shopkick/app/registration/AuthV3Screen;->flowId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setFlowId(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
