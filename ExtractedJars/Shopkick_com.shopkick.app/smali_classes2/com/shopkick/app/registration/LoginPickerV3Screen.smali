.class public Lcom/shopkick/app/registration/LoginPickerV3Screen;
.super Lcom/shopkick/app/registration/AuthV3Screen;
.source "LoginPickerV3Screen.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Landroid/content/DialogInterface$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/registration/LoginPickerV3Screen$OnClickListener;
    }
.end annotation


# instance fields
.field private appPreferences:Lcom/shopkick/app/application/AppPreferences;

.field private authActionClicked:Lcom/shopkick/app/account/Authenticator$AuthAction;

.field private authMediumClicked:Lcom/shopkick/app/account/Authenticator$AuthMedium;

.field private cachedCredentialRetrieveFailureReason:Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

.field private cachedSKCredential:Lcom/shopkick/app/account/SKCredential;

.field private credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

.field private dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private emailButton:Lcom/shopkick/app/widget/SKButton;

.field private facebookButton:Lcom/shopkick/app/widget/SKButton;

.field private googleButton:Lcom/shopkick/app/widget/SKButton;

.field private handleCredentialResultOnResume:Z

.field private registerButton:Lcom/shopkick/app/widget/SKTextView;

.field private retrieveCredentialOnButtonClick:Z

.field private selectCountryController:Lcom/shopkick/app/registration/SelectCountryController;

.field private skipButton:Lcom/shopkick/app/widget/SKButton;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Lcom/shopkick/app/registration/AuthV3Screen;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/registration/LoginPickerV3Screen;)Lcom/shopkick/app/widget/SKButton;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->emailButton:Lcom/shopkick/app/widget/SKButton;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/registration/LoginPickerV3Screen;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->onClickEmailButton()V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/registration/LoginPickerV3Screen;)Lcom/shopkick/app/widget/SKButton;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->facebookButton:Lcom/shopkick/app/widget/SKButton;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/registration/LoginPickerV3Screen;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->onClickFacebookButton()V

    return-void
.end method

.method static synthetic access$400(Lcom/shopkick/app/registration/LoginPickerV3Screen;)Lcom/shopkick/app/widget/SKButton;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->googleButton:Lcom/shopkick/app/widget/SKButton;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/registration/LoginPickerV3Screen;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->onClickGoogleButton()V

    return-void
.end method

.method static synthetic access$600(Lcom/shopkick/app/registration/LoginPickerV3Screen;)Lcom/shopkick/app/widget/SKTextView;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->registerButton:Lcom/shopkick/app/widget/SKTextView;

    return-object p0
.end method

.method static synthetic access$700(Lcom/shopkick/app/registration/LoginPickerV3Screen;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->onClickRegisterButton()V

    return-void
.end method

.method private checkUserCountryStatus()V
    .locals 4

    .line 322
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->accountExists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 324
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->isCountryAvailableToCreateGuestAccount()Z

    move-result v0

    if-nez v0, :cond_0

    .line 325
    invoke-virtual {p0}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/activities/LoginRegistrationActivity;

    .line 326
    new-instance v1, Lcom/shopkick/app/registration/SelectCountryController;

    iget-object v2, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    iget-object v3, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-direct {v1, v0, v2, v3}, Lcom/shopkick/app/registration/SelectCountryController;-><init>(Lcom/shopkick/app/activities/BaseActivity;Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/util/NotificationCenter;)V

    iput-object v1, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->selectCountryController:Lcom/shopkick/app/registration/SelectCountryController;

    .line 329
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->selectCountryController:Lcom/shopkick/app/registration/SelectCountryController;

    invoke-virtual {v0}, Lcom/shopkick/app/registration/SelectCountryController;->showSelectCountryDialog()V

    .line 330
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->selectCountryController:Lcom/shopkick/app/registration/SelectCountryController;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/registration/SelectCountryController;->setDialogDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    goto :goto_0

    .line 332
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->setRegisterButtonVisibilityBasedOnUserCountry()V

    goto :goto_0

    .line 338
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->registerButton:Lcom/shopkick/app/widget/SKTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private doFacebookAuthentication()V
    .locals 3

    .line 390
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->authenticator:Lcom/shopkick/app/account/Authenticator;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthAction;->LOGIN:Lcom/shopkick/app/account/Authenticator$AuthAction;

    sget-object v2, Lcom/shopkick/app/account/Authenticator$AuthMedium;->FACEBOOK:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/account/Authenticator;->authenticate(Lcom/shopkick/app/account/Authenticator$AuthAction;Lcom/shopkick/app/account/Authenticator$AuthMedium;)V

    return-void
.end method

.method private doGoogleAuthentication()V
    .locals 3

    .line 401
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->authenticator:Lcom/shopkick/app/account/Authenticator;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthAction;->LOGIN:Lcom/shopkick/app/account/Authenticator$AuthAction;

    sget-object v2, Lcom/shopkick/app/account/Authenticator$AuthMedium;->GOOGLE:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/account/Authenticator;->authenticate(Lcom/shopkick/app/account/Authenticator$AuthAction;Lcom/shopkick/app/account/Authenticator$AuthMedium;)V

    return-void
.end method

.method private goToEmailLoginScreen()V
    .locals 2

    .line 379
    const-class v0, Lcom/shopkick/app/registration/EmailLoginV3Screen;

    invoke-virtual {p0}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->getParams()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->goToScreenInCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method private goToRegistrationScreen()V
    .locals 3

    .line 412
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x2a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 413
    iget-object v1, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->flowId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setFlowId(Ljava/lang/String;)V

    .line 414
    iget-object v1, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 416
    const-class v0, Lcom/shopkick/app/registration/RegistrationV3Screen;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->goToScreenInCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method private handleCredentialRetrieveFailure(Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;)V
    .locals 10

    .line 175
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->authActionClicked:Lcom/shopkick/app/account/Authenticator$AuthAction;

    .line 176
    iget-object v1, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->authMediumClicked:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    .line 177
    sget-object v2, Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;->NO_CREDENTIAL:Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    if-eq p1, v2, :cond_2

    sget-object v2, Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;->USER_DECLINED:Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    if-ne p1, v2, :cond_0

    goto :goto_0

    .line 180
    :cond_0
    sget-object v2, Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;->ERROR_RETRIEVING:Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    if-ne p1, v2, :cond_1

    .line 182
    iget-object v3, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v4, 0x1

    const/4 v5, 0x0

    const p1, 0x7f11021e

    .line 184
    invoke-virtual {p0, p1}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->getString(I)Ljava/lang/String;

    move-result-object v6

    const p1, 0x7f11014f

    .line 185
    invoke-virtual {p0, p1}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->getString(I)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lcom/shopkick/app/registration/-$$Lambda$LoginPickerV3Screen$y33lUh9R0SHYbUZBprokP5Sfms8;

    invoke-direct {v8, p0, v0, v1}, Lcom/shopkick/app/registration/-$$Lambda$LoginPickerV3Screen$y33lUh9R0SHYbUZBprokP5Sfms8;-><init>(Lcom/shopkick/app/registration/LoginPickerV3Screen;Lcom/shopkick/app/account/Authenticator$AuthAction;Lcom/shopkick/app/account/Authenticator$AuthMedium;)V

    const/4 v9, 0x0

    .line 182
    invoke-virtual/range {v3 .. v9}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogAcknowledge(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto :goto_1

    .line 191
    :cond_1
    sget-object p1, Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;->SYSTEM_CANCELLED:Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    goto :goto_1

    .line 179
    :cond_2
    :goto_0
    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->performAuthActionForAuthMediumTapped(Lcom/shopkick/app/account/Authenticator$AuthAction;Lcom/shopkick/app/account/Authenticator$AuthMedium;)V

    :goto_1
    const/4 p1, 0x0

    .line 197
    iput-object p1, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->authActionClicked:Lcom/shopkick/app/account/Authenticator$AuthAction;

    .line 198
    iput-object p1, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->authMediumClicked:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    return-void
.end method

.method private handleCredentialRetrieveSuccess(Lcom/shopkick/app/account/SKCredential;)V
    .locals 4

    .line 157
    iget-object v0, p1, Lcom/shopkick/app/account/SKCredential;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->EMAIL:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    if-ne v0, v1, :cond_0

    .line 158
    new-instance v0, Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-direct {v0}, Lcom/shopkick/app/account/Authenticator$AuthInfo;-><init>()V

    iget-object v1, p1, Lcom/shopkick/app/account/SKCredential;->email:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->setEmail(Ljava/lang/String;)Lcom/shopkick/app/account/Authenticator$AuthInfo;

    move-result-object v0

    iget-object p1, p1, Lcom/shopkick/app/account/SKCredential;->password:Ljava/lang/String;

    .line 159
    invoke-virtual {v0, p1}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->setPassword(Ljava/lang/String;)Lcom/shopkick/app/account/Authenticator$AuthInfo;

    move-result-object p1

    .line 160
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->authenticator:Lcom/shopkick/app/account/Authenticator;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthAction;->LOGIN:Lcom/shopkick/app/account/Authenticator$AuthAction;

    sget-object v2, Lcom/shopkick/app/account/Authenticator$AuthMedium;->EMAIL:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    invoke-virtual {v0, v1, v2, p1}, Lcom/shopkick/app/account/Authenticator;->authenticate(Lcom/shopkick/app/account/Authenticator$AuthAction;Lcom/shopkick/app/account/Authenticator$AuthMedium;Lcom/shopkick/app/account/Authenticator$AuthInfo;)V

    goto :goto_0

    .line 161
    :cond_0
    iget-object v0, p1, Lcom/shopkick/app/account/SKCredential;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->FACEBOOK:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    if-ne v0, v1, :cond_1

    .line 162
    iget-object p1, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->authenticator:Lcom/shopkick/app/account/Authenticator;

    sget-object v0, Lcom/shopkick/app/account/Authenticator$AuthAction;->LOGIN:Lcom/shopkick/app/account/Authenticator$AuthAction;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->FACEBOOK:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/account/Authenticator;->authenticate(Lcom/shopkick/app/account/Authenticator$AuthAction;Lcom/shopkick/app/account/Authenticator$AuthMedium;)V

    goto :goto_0

    .line 163
    :cond_1
    iget-object v0, p1, Lcom/shopkick/app/account/SKCredential;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->GOOGLE:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    if-ne v0, v1, :cond_2

    .line 164
    new-instance v0, Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-direct {v0}, Lcom/shopkick/app/account/Authenticator$AuthInfo;-><init>()V

    iget-object p1, p1, Lcom/shopkick/app/account/SKCredential;->email:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->setGoogleEmail(Ljava/lang/String;)Lcom/shopkick/app/account/Authenticator$AuthInfo;

    move-result-object p1

    .line 165
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->authenticator:Lcom/shopkick/app/account/Authenticator;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthAction;->LOGIN:Lcom/shopkick/app/account/Authenticator$AuthAction;

    sget-object v2, Lcom/shopkick/app/account/Authenticator$AuthMedium;->GOOGLE:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    invoke-virtual {v0, v1, v2, p1}, Lcom/shopkick/app/account/Authenticator;->authenticate(Lcom/shopkick/app/account/Authenticator$AuthAction;Lcom/shopkick/app/account/Authenticator$AuthMedium;Lcom/shopkick/app/account/Authenticator$AuthInfo;)V

    goto :goto_0

    .line 167
    :cond_2
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->USER_ACCOUNT:Lcom/shopkick/logging/Area;

    .line 168
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    sget-object v2, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    or-long/2addr v0, v2

    const-string v2, "Tried to use saved credential with null skCredential. Return early as no action to take here."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static synthetic lambda$handleCredentialRetrieveFailure$216(Lcom/shopkick/app/registration/LoginPickerV3Screen;Lcom/shopkick/app/account/Authenticator$AuthAction;Lcom/shopkick/app/account/Authenticator$AuthMedium;Ljava/lang/ref/WeakReference;)V
    .locals 0

    .line 187
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->performAuthActionForAuthMediumTapped(Lcom/shopkick/app/account/Authenticator$AuthAction;Lcom/shopkick/app/account/Authenticator$AuthMedium;)V

    .line 188
    invoke-static {p3}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hideIfNotNull(Ljava/lang/ref/WeakReference;)V

    return-void
.end method

.method public static synthetic lambda$xmexemGFM1iHMaF6dxUk5IYPBlE(Lcom/shopkick/app/registration/LoginPickerV3Screen;)V
    .locals 0

    invoke-direct {p0}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->goToEmailLoginScreen()V

    return-void
.end method

.method public static synthetic lambda$zax7TxGa_lUZexgkze0pN2VvEQQ(Lcom/shopkick/app/registration/LoginPickerV3Screen;)V
    .locals 0

    invoke-direct {p0}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->goToRegistrationScreen()V

    return-void
.end method

.method private onClickEmailButton()V
    .locals 2

    .line 372
    sget-object v0, Lcom/shopkick/app/account/Authenticator$AuthAction;->LOGIN:Lcom/shopkick/app/account/Authenticator$AuthAction;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->EMAIL:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->retrieveCredential(Lcom/shopkick/app/account/Authenticator$AuthAction;Lcom/shopkick/app/account/Authenticator$AuthMedium;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 374
    invoke-direct {p0}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->goToEmailLoginScreen()V

    :cond_0
    return-void
.end method

.method private onClickFacebookButton()V
    .locals 2

    .line 383
    sget-object v0, Lcom/shopkick/app/account/Authenticator$AuthAction;->LOGIN:Lcom/shopkick/app/account/Authenticator$AuthAction;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->FACEBOOK:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->retrieveCredential(Lcom/shopkick/app/account/Authenticator$AuthAction;Lcom/shopkick/app/account/Authenticator$AuthMedium;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 385
    invoke-direct {p0}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->doFacebookAuthentication()V

    :cond_0
    return-void
.end method

.method private onClickGoogleButton()V
    .locals 2

    .line 394
    sget-object v0, Lcom/shopkick/app/account/Authenticator$AuthAction;->LOGIN:Lcom/shopkick/app/account/Authenticator$AuthAction;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->GOOGLE:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->retrieveCredential(Lcom/shopkick/app/account/Authenticator$AuthAction;Lcom/shopkick/app/account/Authenticator$AuthMedium;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 396
    invoke-direct {p0}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->doGoogleAuthentication()V

    :cond_0
    return-void
.end method

.method private onClickRegisterButton()V
    .locals 2

    .line 405
    sget-object v0, Lcom/shopkick/app/account/Authenticator$AuthAction;->REGISTER:Lcom/shopkick/app/account/Authenticator$AuthAction;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->retrieveCredential(Lcom/shopkick/app/account/Authenticator$AuthAction;Lcom/shopkick/app/account/Authenticator$AuthMedium;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 407
    invoke-direct {p0}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->goToRegistrationScreen()V

    :cond_0
    return-void
.end method

.method private onClickSkipButton()V
    .locals 2

    .line 420
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->accountExists()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->isCountryAvailableToCreateGuestAccount()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 421
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->getUserCountry()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_0

    .line 422
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/account/UserAccountDataSource;->userSelectedCountry:Ljava/lang/Integer;

    .line 424
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "CreateGuestRequestSuccess"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 425
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "CreateGuestRequestFailure"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 426
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/shopkick/app/account/UserAccountDataSource;->makeUserCreateGuestRequestWithReason(I)V

    goto :goto_0

    .line 428
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/activities/LoginRegistrationActivity;

    invoke-virtual {v0}, Lcom/shopkick/app/activities/LoginRegistrationActivity;->finishActivityWithRegistrationSuccess()V

    :goto_0
    return-void
.end method

.method private performAuthActionForAuthMediumTapped(Lcom/shopkick/app/account/Authenticator$AuthAction;Lcom/shopkick/app/account/Authenticator$AuthMedium;)V
    .locals 1

    .line 202
    sget-object v0, Lcom/shopkick/app/account/Authenticator$AuthAction;->REGISTER:Lcom/shopkick/app/account/Authenticator$AuthAction;

    if-ne p1, v0, :cond_0

    .line 203
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 204
    new-instance p2, Lcom/shopkick/app/registration/-$$Lambda$LoginPickerV3Screen$zax7TxGa_lUZexgkze0pN2VvEQQ;

    invoke-direct {p2, p0}, Lcom/shopkick/app/registration/-$$Lambda$LoginPickerV3Screen$zax7TxGa_lUZexgkze0pN2VvEQQ;-><init>(Lcom/shopkick/app/registration/LoginPickerV3Screen;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 205
    :cond_0
    sget-object v0, Lcom/shopkick/app/account/Authenticator$AuthAction;->LOGIN:Lcom/shopkick/app/account/Authenticator$AuthAction;

    if-ne p1, v0, :cond_3

    .line 206
    sget-object p1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->EMAIL:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    if-ne p2, p1, :cond_1

    .line 207
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 208
    new-instance p2, Lcom/shopkick/app/registration/-$$Lambda$LoginPickerV3Screen$xmexemGFM1iHMaF6dxUk5IYPBlE;

    invoke-direct {p2, p0}, Lcom/shopkick/app/registration/-$$Lambda$LoginPickerV3Screen$xmexemGFM1iHMaF6dxUk5IYPBlE;-><init>(Lcom/shopkick/app/registration/LoginPickerV3Screen;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 209
    :cond_1
    sget-object p1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->FACEBOOK:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    if-ne p2, p1, :cond_2

    .line 210
    invoke-direct {p0}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->doFacebookAuthentication()V

    goto :goto_0

    .line 211
    :cond_2
    sget-object p1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->GOOGLE:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    if-ne p2, p1, :cond_3

    .line 212
    invoke-direct {p0}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->doGoogleAuthentication()V

    :cond_3
    :goto_0
    return-void
.end method

.method private retrieveCredential(Lcom/shopkick/app/account/Authenticator$AuthAction;Lcom/shopkick/app/account/Authenticator$AuthMedium;)Z
    .locals 2

    .line 343
    iget-boolean v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->retrieveCredentialOnButtonClick:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 354
    :cond_0
    sget-object v0, Lcom/shopkick/app/account/Authenticator$AuthAction;->LOGIN:Lcom/shopkick/app/account/Authenticator$AuthAction;

    if-ne p1, v0, :cond_1

    sget-object v0, Lcom/shopkick/app/account/Authenticator$AuthMedium;->FACEBOOK:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    if-ne p2, v0, :cond_1

    .line 355
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getPreviousAuthMedium()Lcom/shopkick/app/account/Authenticator$AuthMedium;

    move-result-object v0

    if-ne p2, v0, :cond_1

    return v1

    .line 361
    :cond_1
    iput-object p1, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->authActionClicked:Lcom/shopkick/app/account/Authenticator$AuthAction;

    .line 362
    iput-object p2, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->authMediumClicked:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    .line 363
    iput-boolean v1, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->retrieveCredentialOnButtonClick:Z

    .line 364
    iget-object p1, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "CREDENTIAL_RETRIEVE_SUCCESS"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 365
    iget-object p1, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "CREDENTIAL_RETRIEVE_FAILURE"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 366
    iget-object p1, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

    invoke-virtual {p0}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/account/CredentialStorageController;->retrieveCredential(Landroid/app/Activity;)V

    const/4 p1, 0x1

    return p1
.end method

.method private setRegisterButtonVisibilityBasedOnUserCountry()V
    .locals 2

    .line 282
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->getUserCountry()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x3a

    if-ne v0, v1, :cond_0

    .line 283
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->registerButton:Lcom/shopkick/app/widget/SKTextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    goto :goto_0

    .line 284
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->getUserCountry()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 285
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->registerButton:Lcom/shopkick/app/widget/SKTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .line 67
    invoke-super {p0, p1, p2, p3}, Lcom/shopkick/app/registration/AuthV3Screen;->createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    const/4 p3, 0x0

    const v0, 0x7f0c0113

    .line 69
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f090236

    .line 71
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->emailButton:Lcom/shopkick/app/widget/SKButton;

    const p2, 0x7f09026e

    .line 72
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->facebookButton:Lcom/shopkick/app/widget/SKButton;

    const p2, 0x7f0902c6

    .line 73
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->googleButton:Lcom/shopkick/app/widget/SKButton;

    const p2, 0x7f0905a4

    .line 74
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKTextView;

    iput-object p2, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->registerButton:Lcom/shopkick/app/widget/SKTextView;

    const p2, 0x7f090256

    .line 75
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/AuthV3ErrorBox;

    iput-object p2, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->errorBox:Lcom/shopkick/app/widget/AuthV3ErrorBox;

    .line 77
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0x1f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {p2, v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 78
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->flowId:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setFlowId(Ljava/lang/String;)V

    .line 79
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->emailButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v2, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    const/4 v3, 0x0

    invoke-virtual {v0, p2, v2, v3}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 80
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0x1e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {p2, v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 81
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->flowId:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setFlowId(Ljava/lang/String;)V

    .line 82
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->facebookButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v2, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p2, v2, v3}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 83
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0x46

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p2, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 84
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->flowId:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setFlowId(Ljava/lang/String;)V

    .line 85
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->googleButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v1, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p2, v1, v3}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 87
    new-instance p2, Lcom/shopkick/app/registration/LoginPickerV3Screen$OnClickListener;

    invoke-direct {p2, p0}, Lcom/shopkick/app/registration/LoginPickerV3Screen$OnClickListener;-><init>(Lcom/shopkick/app/registration/LoginPickerV3Screen;)V

    .line 88
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->emailButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 89
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->facebookButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 90
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->googleButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 91
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->registerButton:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/widget/SKTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 92
    iget-object p2, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->registerButton:Lcom/shopkick/app/widget/SKTextView;

    const/4 v0, 0x4

    invoke-virtual {p2, v0}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 100
    invoke-virtual {p0}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/activities/LoginRegistrationActivity;

    invoke-virtual {p2}, Lcom/shopkick/app/activities/LoginRegistrationActivity;->shouldAutomaticallyRetrieveCredentials()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    iput-boolean p2, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->retrieveCredentialOnButtonClick:Z

    .line 102
    iget-object p2, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {p2}, Lcom/shopkick/app/launch/FirstUseControllerV2;->isInFirstUse()Z

    move-result p2

    if-nez p2, :cond_1

    .line 103
    iget-boolean p2, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->retrieveCredentialOnButtonClick:Z

    if-nez p2, :cond_0

    .line 104
    iget-object p2, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "CREDENTIAL_RETRIEVE_SUCCESS"

    invoke-virtual {p2, p0, v0, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 105
    iget-object p2, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "CREDENTIAL_RETRIEVE_FAILURE"

    invoke-virtual {p2, p0, v0, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 106
    iget-object p2, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

    invoke-virtual {p0}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/shopkick/app/account/CredentialStorageController;->retrieveCredential(Landroid/app/Activity;)V

    .line 108
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->checkUserCountryStatus()V

    goto :goto_0

    .line 110
    :cond_1
    iget-object p2, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->registerButton:Lcom/shopkick/app/widget/SKTextView;

    const/16 p3, 0x8

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    :goto_0
    return-object p1
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

    .line 59
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/registration/AuthV3Screen;->init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V

    .line 60
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

    iput-object p2, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

    .line 61
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iput-object p2, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 62
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p1, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    return-void
.end method

.method public onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->accountExists()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->isInFirstUse()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 136
    :cond_0
    sget-object v0, Lcom/shopkick/app/screens/AppScreen$BackPressedState;->DONT_GO_BACK:Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    return-object v0

    .line 123
    :cond_1
    :goto_0
    invoke-super {p0}, Lcom/shopkick/app/registration/AuthV3Screen;->onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    move-result-object v0

    return-object v0
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    .line 267
    iget-object p1, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccountDataSource;->getUserCountry()Ljava/lang/Integer;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "select user country dialog dismissed but no country info available"

    .line 268
    invoke-static {p1}, Lcom/shopkick/app/util/SKAssertion;->throwAssertionError(Ljava/lang/String;)V

    goto :goto_0

    .line 270
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->setRegisterButtonVisibilityBasedOnUserCountry()V

    :goto_0
    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 2
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

    .line 219
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/registration/AuthV3Screen;->onEvent(Ljava/lang/String;Ljava/util/HashMap;)V

    .line 220
    invoke-virtual {p0}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->isTopScreen()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "CREDENTIAL_RETRIEVE_SUCCESS"

    .line 224
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    .line 225
    iget-object p1, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "CREDENTIAL_RETRIEVE_SUCCESS"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 226
    iget-object p1, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "CREDENTIAL_RETRIEVE_FAILURE"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "RETRIEVED_CREDENTIAL_KEY"

    .line 227
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/account/SKCredential;

    .line 228
    iget-object p2, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p2, p2, Lcom/shopkick/app/application/ScreenGlobals;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {p2}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 229
    invoke-direct {p0, p1}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->handleCredentialRetrieveSuccess(Lcom/shopkick/app/account/SKCredential;)V

    goto :goto_0

    .line 232
    :cond_1
    iput-object p1, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->cachedSKCredential:Lcom/shopkick/app/account/SKCredential;

    .line 233
    iput-boolean v1, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->handleCredentialResultOnResume:Z

    goto :goto_0

    :cond_2
    const-string v0, "CREDENTIAL_RETRIEVE_FAILURE"

    .line 235
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 236
    iget-object p1, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "CREDENTIAL_RETRIEVE_SUCCESS"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 237
    iget-object p1, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "CREDENTIAL_RETRIEVE_FAILURE"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "RETRIEVED_CREDENTIAL_KEY"

    .line 239
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    .line 240
    iget-object p2, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p2, p2, Lcom/shopkick/app/application/ScreenGlobals;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {p2}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 241
    invoke-direct {p0, p1}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->handleCredentialRetrieveFailure(Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;)V

    goto :goto_0

    .line 244
    :cond_3
    iput-object p1, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->cachedCredentialRetrieveFailureReason:Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    .line 245
    iput-boolean v1, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->handleCredentialResultOnResume:Z

    :cond_4
    :goto_0
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 141
    invoke-super {p0}, Lcom/shopkick/app/registration/AuthV3Screen;->onResume()V

    .line 142
    iget-boolean v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->handleCredentialResultOnResume:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 143
    iput-boolean v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->handleCredentialResultOnResume:Z

    .line 144
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->cachedSKCredential:Lcom/shopkick/app/account/SKCredential;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 146
    iput-object v1, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->cachedSKCredential:Lcom/shopkick/app/account/SKCredential;

    .line 147
    invoke-direct {p0, v0}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->handleCredentialRetrieveSuccess(Lcom/shopkick/app/account/SKCredential;)V

    goto :goto_0

    .line 149
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->cachedCredentialRetrieveFailureReason:Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    .line 150
    iput-object v1, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->cachedCredentialRetrieveFailureReason:Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    .line 151
    invoke-direct {p0, v0}, Lcom/shopkick/app/registration/LoginPickerV3Screen;->handleCredentialRetrieveFailure(Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public shouldHideBack()Z
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/shopkick/app/registration/LoginPickerV3Screen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->accountExists()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
