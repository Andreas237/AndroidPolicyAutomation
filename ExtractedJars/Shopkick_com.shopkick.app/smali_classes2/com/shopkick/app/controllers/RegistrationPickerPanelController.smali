.class public Lcom/shopkick/app/controllers/RegistrationPickerPanelController;
.super Lcom/shopkick/app/controllers/BasePanelController;
.source "RegistrationPickerPanelController.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/controllers/RegistrationPickerPanelController$WebviewClickableSpan;
    }
.end annotation


# instance fields
.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private authenticator:Lcom/shopkick/app/account/Authenticator;

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

.field private emailButton:Lcom/shopkick/app/widget/SKButton;

.field private facebookButton:Lcom/shopkick/app/widget/SKButton;

.field private googleButton:Lcom/shopkick/app/widget/SKButton;

.field private legalStatementTextView:Lcom/shopkick/app/widget/SKTextView;

.field private loginButton:Lcom/shopkick/app/widget/SKButton;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/logging/UserEventLogger;Ljava/util/Map;Lcom/shopkick/app/activities/BaseActivity;Landroid/content/Context;Lcom/shopkick/app/controllers/IPanelControllerCallback;Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Lcom/shopkick/app/logging/UserEventLogger;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/shopkick/app/activities/BaseActivity;",
            "Landroid/content/Context;",
            "Lcom/shopkick/app/controllers/IPanelControllerCallback;",
            "Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;",
            ")V"
        }
    .end annotation

    .line 58
    invoke-direct/range {p0 .. p7}, Lcom/shopkick/app/controllers/BasePanelController;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/logging/UserEventLogger;Ljava/util/Map;Lcom/shopkick/app/activities/BaseActivity;Landroid/content/Context;Lcom/shopkick/app/controllers/IPanelControllerCallback;Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;)V

    .line 61
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->authenticator:Lcom/shopkick/app/account/Authenticator;

    iput-object p2, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->authenticator:Lcom/shopkick/app/account/Authenticator;

    .line 62
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p2, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 63
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p1, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    return-void
.end method

.method private addAuthenticationNotificationObservers()V
    .locals 3

    .line 139
    iget-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "AUTHENTICATOR_SUCCESS"

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 140
    iget-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "AUTHENTICATOR_FAILURE"

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 141
    iget-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "AUTHENTICATOR_CANCEL"

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

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

    const-string v0, "AUTHENTICATOR_ERROR_MESSAGE_KEY"

    .line 222
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 223
    iget-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showCustomAlert(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    return-void
.end method

.method private handleAuthenticatorSuccess(Ljava/util/HashMap;)V
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

    .line 212
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 213
    new-instance v0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/controllers/RegistrationPickerPanelController$1;-><init>(Lcom/shopkick/app/controllers/RegistrationPickerPanelController;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private onClickEmailButton()V
    .locals 1

    .line 169
    iget-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->panelControllerCallback:Lcom/shopkick/app/controllers/IPanelControllerCallback;

    invoke-interface {v0}, Lcom/shopkick/app/controllers/IPanelControllerCallback;->triggerNextPanel()V

    return-void
.end method

.method private onClickFacebookButton()V
    .locals 3

    .line 173
    invoke-direct {p0}, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->addAuthenticationNotificationObservers()V

    .line 174
    iget-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->authenticator:Lcom/shopkick/app/account/Authenticator;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthAction;->REGISTER:Lcom/shopkick/app/account/Authenticator$AuthAction;

    sget-object v2, Lcom/shopkick/app/account/Authenticator$AuthMedium;->FACEBOOK:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/account/Authenticator;->authenticate(Lcom/shopkick/app/account/Authenticator$AuthAction;Lcom/shopkick/app/account/Authenticator$AuthMedium;)V

    return-void
.end method

.method private onClickGoogleButton()V
    .locals 3

    .line 164
    invoke-direct {p0}, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->addAuthenticationNotificationObservers()V

    .line 165
    iget-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->authenticator:Lcom/shopkick/app/account/Authenticator;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthAction;->REGISTER:Lcom/shopkick/app/account/Authenticator$AuthAction;

    sget-object v2, Lcom/shopkick/app/account/Authenticator$AuthMedium;->GOOGLE:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/account/Authenticator;->authenticate(Lcom/shopkick/app/account/Authenticator$AuthAction;Lcom/shopkick/app/account/Authenticator$AuthMedium;)V

    return-void
.end method

.method private onClickLoginButton()V
    .locals 4

    .line 178
    new-instance v0, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v1, Lcom/shopkick/app/activities/LoginRegistrationActivity;

    const-class v2, Lcom/shopkick/app/registration/LoginPickerV3Screen;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 180
    iget-object v1, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->activity:Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    return-void
.end method

.method private removeAuthenticationNotificationObservers()V
    .locals 2

    .line 145
    iget-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "AUTHENTICATOR_SUCCESS"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 146
    iget-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "AUTHENTICATOR_FAILURE"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 147
    iget-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "AUTHENTICATOR_CANCEL"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public handleOnResume()V
    .locals 3

    .line 119
    iget-boolean v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->authenticatorSuccess:Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->authenticatorArgs:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    .line 121
    iput-object v2, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->authenticatorArgs:Ljava/util/HashMap;

    .line 122
    iput-boolean v1, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->authenticatorSuccess:Z

    .line 123
    invoke-direct {p0, v0}, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->handleAuthenticatorSuccess(Ljava/util/HashMap;)V

    goto :goto_0

    .line 124
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->authenticatorFailure:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->authenticatorArgs:Ljava/util/HashMap;

    if-eqz v0, :cond_1

    .line 126
    iput-object v2, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->authenticatorArgs:Ljava/util/HashMap;

    .line 127
    iput-boolean v1, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->authenticatorFailure:Z

    .line 128
    invoke-direct {p0, v0}, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->handleAuthenticatorFailure(Ljava/util/HashMap;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->googleButton:Lcom/shopkick/app/widget/SKButton;

    if-ne p1, v0, :cond_0

    .line 153
    invoke-direct {p0}, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->onClickGoogleButton()V

    goto :goto_0

    .line 154
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->emailButton:Lcom/shopkick/app/widget/SKButton;

    if-ne p1, v0, :cond_1

    .line 155
    invoke-direct {p0}, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->onClickEmailButton()V

    goto :goto_0

    .line 156
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->facebookButton:Lcom/shopkick/app/widget/SKButton;

    if-ne p1, v0, :cond_2

    .line 157
    invoke-direct {p0}, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->onClickFacebookButton()V

    goto :goto_0

    .line 158
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->loginButton:Lcom/shopkick/app/widget/SKButton;

    if-ne p1, v0, :cond_3

    .line 159
    invoke-direct {p0}, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->onClickLoginButton()V

    :cond_3
    :goto_0
    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 3
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

    .line 185
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x5eefc309

    const/4 v2, 0x1

    if-eq v0, v1, :cond_2

    const v1, -0x50fec11a

    if-eq v0, v1, :cond_1

    const v1, -0x3068d182

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "AUTHENTICATOR_FAILURE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    move p1, v2

    goto :goto_1

    :cond_1
    const-string v0, "AUTHENTICATOR_CANCEL"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x2

    goto :goto_1

    :cond_2
    const-string v0, "AUTHENTICATOR_SUCCESS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto :goto_2

    .line 205
    :pswitch_0
    invoke-direct {p0}, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->removeAuthenticationNotificationObservers()V

    .line 206
    invoke-direct {p0, p2}, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->handleAuthenticatorCanceled(Ljava/util/HashMap;)V

    goto :goto_2

    .line 196
    :pswitch_1
    invoke-direct {p0}, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->removeAuthenticationNotificationObservers()V

    .line 197
    iget-object p1, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 198
    invoke-direct {p0, p2}, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->handleAuthenticatorFailure(Ljava/util/HashMap;)V

    goto :goto_2

    .line 200
    :cond_4
    iput-object p2, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->authenticatorArgs:Ljava/util/HashMap;

    .line 201
    iput-boolean v2, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->authenticatorFailure:Z

    goto :goto_2

    .line 187
    :pswitch_2
    invoke-direct {p0}, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->removeAuthenticationNotificationObservers()V

    .line 188
    iget-object p1, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 189
    invoke-direct {p0, p2}, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->handleAuthenticatorSuccess(Ljava/util/HashMap;)V

    goto :goto_2

    .line 191
    :cond_5
    iput-object p2, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->authenticatorArgs:Ljava/util/HashMap;

    .line 192
    iput-boolean v2, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->authenticatorSuccess:Z

    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onPanelDidShow()V
    .locals 0

    .line 134
    invoke-super {p0}, Lcom/shopkick/app/controllers/BasePanelController;->onPanelDidShow()V

    .line 135
    invoke-virtual {p0}, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->hideKeyboard()V

    return-void
.end method

.method public setUpPanel(Landroid/view/ViewGroup;)V
    .locals 8

    .line 68
    iget-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c017d

    invoke-virtual {v0, v1, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    const v0, 0x7f0905a6

    .line 69
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const v0, 0x7f0902c7

    .line 71
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    iput-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->googleButton:Lcom/shopkick/app/widget/SKButton;

    .line 72
    iget-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->googleButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 73
    iget-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->googleButton:Lcom/shopkick/app/widget/SKButton;

    const/16 v1, 0x46

    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->setupEventLogForButton(Lcom/shopkick/app/widget/SKButton;I)V

    const v0, 0x7f090238

    .line 75
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    iput-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->emailButton:Lcom/shopkick/app/widget/SKButton;

    .line 76
    iget-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->emailButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 77
    iget-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->emailButton:Lcom/shopkick/app/widget/SKButton;

    const/16 v1, 0x1f

    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->setupEventLogForButton(Lcom/shopkick/app/widget/SKButton;I)V

    const v0, 0x7f09026f

    .line 79
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    iput-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->facebookButton:Lcom/shopkick/app/widget/SKButton;

    .line 80
    iget-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->facebookButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 81
    iget-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->facebookButton:Lcom/shopkick/app/widget/SKButton;

    const/16 v1, 0x1e

    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->setupEventLogForButton(Lcom/shopkick/app/widget/SKButton;I)V

    const v0, 0x7f09044c

    .line 83
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    iput-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->loginButton:Lcom/shopkick/app/widget/SKButton;

    .line 84
    iget-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->loginButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 85
    iget-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->loginButton:Lcom/shopkick/app/widget/SKButton;

    const/16 v1, 0x13a

    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->setupEventLogForButton(Lcom/shopkick/app/widget/SKButton;I)V

    const v0, 0x7f090412

    .line 90
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    iput-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->legalStatementTextView:Lcom/shopkick/app/widget/SKTextView;

    .line 92
    new-instance v0, Landroid/text/SpannableString;

    iget-object v1, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->context:Landroid/content/Context;

    const v2, 0x7f110588

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 94
    new-instance v1, Lcom/shopkick/app/controllers/RegistrationPickerPanelController$WebviewClickableSpan;

    iget-object v3, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->activity:Lcom/shopkick/app/activities/BaseActivity;

    iget-object v4, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->context:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f060157

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    const/4 v6, 0x3

    invoke-direct {v1, p0, v3, v4, v6}, Lcom/shopkick/app/controllers/RegistrationPickerPanelController$WebviewClickableSpan;-><init>(Lcom/shopkick/app/controllers/RegistrationPickerPanelController;Lcom/shopkick/app/activities/BaseActivity;II)V

    .line 97
    new-instance v3, Lcom/shopkick/app/controllers/RegistrationPickerPanelController$WebviewClickableSpan;

    iget-object v4, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->activity:Lcom/shopkick/app/activities/BaseActivity;

    iget-object v6, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->context:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    const/4 v6, 0x2

    invoke-direct {v3, p0, v4, v5, v6}, Lcom/shopkick/app/controllers/RegistrationPickerPanelController$WebviewClickableSpan;-><init>(Lcom/shopkick/app/controllers/RegistrationPickerPanelController;Lcom/shopkick/app/activities/BaseActivity;II)V

    .line 99
    iget-object v4, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->context:Landroid/content/Context;

    const v5, 0x7f11058a

    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 100
    iget-object v5, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->context:Landroid/content/Context;

    const v6, 0x7f110589

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 101
    iget-object v6, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->context:Landroid/content/Context;

    invoke-virtual {v6, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    .line 102
    iget-object v7, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->context:Landroid/content/Context;

    invoke-virtual {v7, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    .line 103
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v4, v6

    const/4 v7, 0x0

    invoke-virtual {v0, v1, v6, v4, v7}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 104
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v2

    invoke-virtual {v0, v3, v2, v1, v7}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 107
    iget-object v1, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->legalStatementTextView:Lcom/shopkick/app/widget/SKTextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/SKTextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 109
    iget-object v1, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->legalStatementTextView:Lcom/shopkick/app/widget/SKTextView;

    sget-object v2, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {v1, v0, v2}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    .line 111
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 113
    iput-object p1, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->panelView:Landroid/view/View;

    .line 114
    invoke-virtual {p0}, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->onPanelDidShow()V

    return-void
.end method
