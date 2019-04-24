.class public Lcom/shopkick/app/controllers/PasswordPanelController;
.super Lcom/shopkick/app/controllers/InputPanelController;
.source "PasswordPanelController.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Landroid/text/TextWatcher;


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

.field private didLogPasswordTextFieldChanged:Z

.field private editText:Lcom/shopkick/app/widget/SKEditText;

.field private inputLayout:Landroid/support/design/widget/TextInputLayout;

.field private nextButton:Lcom/shopkick/app/widget/SKButton;

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

    .line 51
    invoke-direct/range {p0 .. p7}, Lcom/shopkick/app/controllers/InputPanelController;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/logging/UserEventLogger;Ljava/util/Map;Lcom/shopkick/app/activities/BaseActivity;Landroid/content/Context;Lcom/shopkick/app/controllers/IPanelControllerCallback;Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;)V

    .line 54
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->authenticator:Lcom/shopkick/app/account/Authenticator;

    iput-object p2, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->authenticator:Lcom/shopkick/app/account/Authenticator;

    .line 55
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p2, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 56
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p1, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    return-void
.end method

.method private addAuthenticationNotificationObservers()V
    .locals 3

    .line 106
    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "AUTHENTICATOR_SUCCESS"

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 107
    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "AUTHENTICATOR_FAILURE"

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 108
    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

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
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "AUTHENTICATOR_ERROR_STATUS_KEY"

    .line 225
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    const-string v1, "AUTHENTICATOR_ERROR_MESSAGE_KEY"

    .line 226
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    .line 228
    iget-object p1, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->context:Landroid/content/Context;

    const v1, 0x7f110142

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    :cond_0
    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 232
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    .line 234
    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->inputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0, v0, v2, p1}, Lcom/shopkick/app/controllers/PasswordPanelController;->setErrorMessage(Landroid/support/design/widget/TextInputLayout;ZLjava/lang/String;)V

    .line 237
    iget-object p1, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->inputLayout:Landroid/support/design/widget/TextInputLayout;

    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->nextButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/controllers/PasswordPanelController;->updateNextButton(Landroid/support/design/widget/TextInputLayout;Lcom/shopkick/app/widget/SKButton;)V

    goto :goto_0

    .line 240
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->inputLayout:Landroid/support/design/widget/TextInputLayout;

    iget-object v2, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->nextButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p0, v0, v2}, Lcom/shopkick/app/controllers/PasswordPanelController;->updateNextButton(Landroid/support/design/widget/TextInputLayout;Lcom/shopkick/app/widget/SKButton;)V

    .line 241
    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showCustomAlert(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto :goto_0

    .line 245
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->inputLayout:Landroid/support/design/widget/TextInputLayout;

    iget-object v2, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->nextButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p0, v0, v2}, Lcom/shopkick/app/controllers/PasswordPanelController;->updateNextButton(Landroid/support/design/widget/TextInputLayout;Lcom/shopkick/app/widget/SKButton;)V

    .line 246
    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showCustomAlert(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    :goto_0
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

    .line 215
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 216
    new-instance v0, Lcom/shopkick/app/controllers/PasswordPanelController$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/controllers/PasswordPanelController$1;-><init>(Lcom/shopkick/app/controllers/PasswordPanelController;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private onClickNextButton()V
    .locals 4

    .line 125
    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->nextButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/controllers/PasswordPanelController;->enableNextButton(Lcom/shopkick/app/widget/SKButton;Z)V

    .line 127
    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->panelStorageProviderCallback:Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;

    const-string v1, "first_name"

    invoke-interface {v0, v1}, Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;->getValueForKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 129
    iget-object v1, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->panelStorageProviderCallback:Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;

    const-string v2, "email_address"

    invoke-interface {v1, v2}, Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;->getValueForKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 131
    iget-object v2, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->editText:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v2}, Lcom/shopkick/app/widget/SKEditText;->getInput()Ljava/lang/String;

    move-result-object v2

    .line 133
    invoke-direct {p0}, Lcom/shopkick/app/controllers/PasswordPanelController;->addAuthenticationNotificationObservers()V

    .line 134
    new-instance v3, Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-direct {v3}, Lcom/shopkick/app/account/Authenticator$AuthInfo;-><init>()V

    invoke-virtual {v3, v0}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->setFirstName(Ljava/lang/String;)Lcom/shopkick/app/account/Authenticator$AuthInfo;

    move-result-object v0

    .line 135
    invoke-virtual {v0, v1}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->setEmail(Ljava/lang/String;)Lcom/shopkick/app/account/Authenticator$AuthInfo;

    move-result-object v0

    .line 136
    invoke-virtual {v0, v2}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->setPassword(Ljava/lang/String;)Lcom/shopkick/app/account/Authenticator$AuthInfo;

    move-result-object v0

    .line 137
    iget-object v1, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->authenticator:Lcom/shopkick/app/account/Authenticator;

    sget-object v2, Lcom/shopkick/app/account/Authenticator$AuthAction;->REGISTER:Lcom/shopkick/app/account/Authenticator$AuthAction;

    sget-object v3, Lcom/shopkick/app/account/Authenticator$AuthMedium;->EMAIL:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    invoke-virtual {v1, v2, v3, v0}, Lcom/shopkick/app/account/Authenticator;->authenticate(Lcom/shopkick/app/account/Authenticator$AuthAction;Lcom/shopkick/app/account/Authenticator$AuthMedium;Lcom/shopkick/app/account/Authenticator$AuthInfo;)V

    return-void
.end method

.method private removeAuthenticationNotificationObservers()V
    .locals 2

    .line 112
    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "AUTHENTICATOR_SUCCESS"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 113
    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "AUTHENTICATOR_FAILURE"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 114
    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "AUTHENTICATOR_CANCEL"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method private validateInputAndMaybeSetErrorMessage()Z
    .locals 4

    .line 177
    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->editText:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKEditText;->getInput()Ljava/lang/String;

    move-result-object v0

    .line 178
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return v2

    .line 179
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->inputLayout:Landroid/support/design/widget/TextInputLayout;

    iget-object v1, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->context:Landroid/content/Context;

    const v3, 0x7f110596

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v2, v1}, Lcom/shopkick/app/controllers/PasswordPanelController;->setErrorMessage(Landroid/support/design/widget/TextInputLayout;ZLjava/lang/String;)V

    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 3

    .line 153
    iget-boolean v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->didLogPasswordTextFieldChanged:Z

    if-nez v0, :cond_0

    .line 154
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x13f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x55

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 155
    invoke-virtual {p0, v0}, Lcom/shopkick/app/controllers/PasswordPanelController;->logEventRecordWithScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    const/4 v0, 0x1

    .line 157
    iput-boolean v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->didLogPasswordTextFieldChanged:Z

    .line 161
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->editText:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-ne p1, v0, :cond_1

    .line 162
    iget-object p1, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->inputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p1}, Landroid/support/design/widget/TextInputLayout;->getError()Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 163
    iget-object p1, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->inputLayout:Landroid/support/design/widget/TextInputLayout;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/shopkick/app/controllers/PasswordPanelController;->setErrorMessage(Landroid/support/design/widget/TextInputLayout;ZLjava/lang/String;)V

    .line 168
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->inputLayout:Landroid/support/design/widget/TextInputLayout;

    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->nextButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/controllers/PasswordPanelController;->updateNextButton(Landroid/support/design/widget/TextInputLayout;Lcom/shopkick/app/widget/SKButton;)V

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public handleOnResume()V
    .locals 3

    .line 82
    iget-boolean v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->authenticatorSuccess:Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->authenticatorArgs:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    .line 84
    iput-object v2, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->authenticatorArgs:Ljava/util/HashMap;

    .line 85
    iput-boolean v1, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->authenticatorSuccess:Z

    .line 86
    invoke-direct {p0, v0}, Lcom/shopkick/app/controllers/PasswordPanelController;->handleAuthenticatorSuccess(Ljava/util/HashMap;)V

    goto :goto_0

    .line 87
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->authenticatorFailure:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->authenticatorArgs:Ljava/util/HashMap;

    if-eqz v0, :cond_1

    .line 89
    iput-object v2, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->authenticatorArgs:Ljava/util/HashMap;

    .line 90
    iput-boolean v1, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->authenticatorFailure:Z

    .line 91
    invoke-direct {p0, v0}, Lcom/shopkick/app/controllers/PasswordPanelController;->handleAuthenticatorFailure(Ljava/util/HashMap;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->nextButton:Lcom/shopkick/app/widget/SKButton;

    if-ne p1, v0, :cond_0

    .line 120
    invoke-direct {p0}, Lcom/shopkick/app/controllers/PasswordPanelController;->onClickNextButton()V

    :cond_0
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

    .line 188
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

    .line 208
    :pswitch_0
    invoke-direct {p0}, Lcom/shopkick/app/controllers/PasswordPanelController;->removeAuthenticationNotificationObservers()V

    .line 209
    invoke-direct {p0, p2}, Lcom/shopkick/app/controllers/PasswordPanelController;->handleAuthenticatorCanceled(Ljava/util/HashMap;)V

    goto :goto_2

    .line 199
    :pswitch_1
    invoke-direct {p0}, Lcom/shopkick/app/controllers/PasswordPanelController;->removeAuthenticationNotificationObservers()V

    .line 200
    iget-object p1, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 201
    invoke-direct {p0, p2}, Lcom/shopkick/app/controllers/PasswordPanelController;->handleAuthenticatorFailure(Ljava/util/HashMap;)V

    goto :goto_2

    .line 203
    :cond_4
    iput-object p2, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->authenticatorArgs:Ljava/util/HashMap;

    .line 204
    iput-boolean v2, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->authenticatorFailure:Z

    goto :goto_2

    .line 190
    :pswitch_2
    invoke-direct {p0}, Lcom/shopkick/app/controllers/PasswordPanelController;->removeAuthenticationNotificationObservers()V

    .line 191
    iget-object p1, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 192
    invoke-direct {p0, p2}, Lcom/shopkick/app/controllers/PasswordPanelController;->handleAuthenticatorSuccess(Ljava/util/HashMap;)V

    goto :goto_2

    .line 194
    :cond_5
    iput-object p2, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->authenticatorArgs:Ljava/util/HashMap;

    .line 195
    iput-boolean v2, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->authenticatorSuccess:Z

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
    .locals 2

    .line 97
    invoke-super {p0}, Lcom/shopkick/app/controllers/InputPanelController;->onPanelDidShow()V

    .line 98
    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->inputLayout:Landroid/support/design/widget/TextInputLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    .line 99
    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->inputLayout:Landroid/support/design/widget/TextInputLayout;

    iget-object v1, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->nextButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/controllers/PasswordPanelController;->updateNextButton(Landroid/support/design/widget/TextInputLayout;Lcom/shopkick/app/widget/SKButton;)V

    .line 100
    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->editText:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKEditText;->requestFocus()Z

    .line 101
    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->editText:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/controllers/PasswordPanelController;->showKeyboard(Landroid/view/View;)V

    const/4 v0, 0x0

    .line 102
    iput-boolean v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->didLogPasswordTextFieldChanged:Z

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public setUpPanel(Landroid/view/ViewGroup;)V
    .locals 3

    .line 61
    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c014e

    invoke-virtual {v0, v1, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    const v0, 0x7f09050a

    .line 62
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const v0, 0x7f090509

    .line 64
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    iput-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->inputLayout:Landroid/support/design/widget/TextInputLayout;

    .line 65
    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->inputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v0}, Landroid/support/design/widget/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKEditText;

    iput-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->editText:Lcom/shopkick/app/widget/SKEditText;

    .line 67
    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->editText:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/widget/SKEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    const v0, 0x7f090508

    .line 69
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    iput-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->nextButton:Lcom/shopkick/app/widget/SKButton;

    .line 70
    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->nextButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v1, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->params:Ljava/util/Map;

    const-string v2, "button_text"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 71
    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->nextButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 72
    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->nextButton:Lcom/shopkick/app/widget/SKButton;

    const/16 v1, 0x1d

    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/controllers/PasswordPanelController;->setupEventLogForButton(Lcom/shopkick/app/widget/SKButton;I)V

    .line 74
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 76
    iput-object p1, p0, Lcom/shopkick/app/controllers/PasswordPanelController;->panelView:Landroid/view/View;

    .line 77
    invoke-virtual {p0}, Lcom/shopkick/app/controllers/PasswordPanelController;->onPanelDidShow()V

    return-void
.end method

.method protected validateInput()Z
    .locals 1

    .line 173
    invoke-direct {p0}, Lcom/shopkick/app/controllers/PasswordPanelController;->validateInputAndMaybeSetErrorMessage()Z

    move-result v0

    return v0
.end method
