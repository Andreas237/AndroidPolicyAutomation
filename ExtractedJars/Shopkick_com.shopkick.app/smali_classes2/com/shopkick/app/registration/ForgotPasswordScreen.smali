.class public Lcom/shopkick/app/registration/ForgotPasswordScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "ForgotPasswordScreen.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/registration/ForgotPasswordScreen$OnClickListener;
    }
.end annotation


# static fields
.field public static final FORGOT_PASSWORD_SCREEN_PARAM_EMAIL:Ljava/lang/String; = "email"


# instance fields
.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private emailText:Ljava/lang/String;

.field private emailTextField:Lcom/shopkick/app/widget/AuthV3EditText;

.field private progressDialog:Landroid/app/ProgressDialog;

.field private resetButton:Lcom/shopkick/app/widget/SKButton;

.field private resetPasswordRequest:Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordRequest;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/registration/ForgotPasswordScreen;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/shopkick/app/registration/ForgotPasswordScreen;->onClickResetButton()V

    return-void
.end method

.method private enableResetButton(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 129
    iget-object p1, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->resetButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 130
    iget-object p1, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->resetButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1}, Lcom/shopkick/app/widget/SKButton;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/16 v0, 0xff

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    goto :goto_0

    .line 132
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->resetButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 133
    iget-object p1, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->resetButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1}, Lcom/shopkick/app/widget/SKButton;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/16 v0, 0x4d

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    :goto_0
    return-void
.end method

.method public static synthetic lambda$completedResponse$215(Lcom/shopkick/app/registration/ForgotPasswordScreen;Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordResponse;Ljava/lang/ref/WeakReference;)V
    .locals 2

    .line 199
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordResponse;->status:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-nez p1, :cond_0

    .line 200
    invoke-virtual {p0}, Lcom/shopkick/app/registration/ForgotPasswordScreen;->getParams()Ljava/util/Map;

    move-result-object p1

    const-string v0, "email"

    .line 201
    iget-object v1, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->emailTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v1}, Lcom/shopkick/app/widget/AuthV3EditText;->getTrimmedInput()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    const-class v0, Lcom/shopkick/app/registration/EmailLoginV3Screen;

    invoke-virtual {p0, v0, p1}, Lcom/shopkick/app/registration/ForgotPasswordScreen;->goToScreenInCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    .line 204
    :cond_0
    invoke-static {p2}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hideIfNotNull(Ljava/lang/ref/WeakReference;)V

    return-void
.end method

.method private onClickResetButton()V
    .locals 5

    const/4 v0, 0x0

    .line 163
    invoke-direct {p0, v0}, Lcom/shopkick/app/registration/ForgotPasswordScreen;->enableResetButton(Z)V

    .line 165
    iget-object v0, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->emailTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/AuthV3EditText;->getTrimmedInput()Ljava/lang/String;

    move-result-object v0

    .line 167
    iget-object v1, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->resetPasswordRequest:Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordRequest;

    if-eqz v1, :cond_0

    return-void

    .line 170
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/registration/ForgotPasswordScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, ""

    const v3, 0x7f1102fc

    .line 172
    invoke-virtual {p0, v3}, Lcom/shopkick/app/registration/ForgotPasswordScreen;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    .line 170
    invoke-static {v1, v2, v3, v4}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Landroid/app/ProgressDialog;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->progressDialog:Landroid/app/ProgressDialog;

    .line 174
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordRequest;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordRequest;-><init>()V

    iput-object v1, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->resetPasswordRequest:Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordRequest;

    .line 175
    iget-object v1, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->resetPasswordRequest:Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordRequest;

    iput-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordRequest;->email:Ljava/lang/String;

    .line 176
    iget-object v0, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method

.method private updateResetButton()V
    .locals 1

    .line 124
    invoke-direct {p0}, Lcom/shopkick/app/registration/ForgotPasswordScreen;->validateInputs()Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/shopkick/app/registration/ForgotPasswordScreen;->enableResetButton(Z)V

    return-void
.end method

.method private validateInputs()Z
    .locals 2

    .line 138
    iget-object v0, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->emailTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/AuthV3EditText;->getTrimmedInput()Ljava/lang/String;

    move-result-object v0

    .line 139
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/shopkick/app/validators/EmailValidator;->isValid(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    .line 112
    invoke-direct {p0}, Lcom/shopkick/app/registration/ForgotPasswordScreen;->updateResetButton()V

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 7

    .line 189
    iget-object p1, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->progressDialog:Landroid/app/ProgressDialog;

    invoke-static {p1}, Lcom/shopkick/app/util/DialogUtils;->dismissProgressDialog(Landroid/app/ProgressDialog;)V

    .line 191
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_0

    .line 192
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordResponse;

    .line 194
    iget-object v0, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v1, 0x0

    const/4 v2, 0x0

    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordResponse;->message:Ljava/lang/String;

    iget-object v4, p1, Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordResponse;->dismissButtonLabel:Ljava/lang/String;

    new-instance v5, Lcom/shopkick/app/registration/-$$Lambda$ForgotPasswordScreen$0XsaizLFxtGPrGePtLO5azXMVwY;

    invoke-direct {v5, p0, p1}, Lcom/shopkick/app/registration/-$$Lambda$ForgotPasswordScreen$0XsaizLFxtGPrGePtLO5azXMVwY;-><init>(Lcom/shopkick/app/registration/ForgotPasswordScreen;Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordResponse;)V

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogAcknowledge(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto :goto_0

    .line 208
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)V

    .line 209
    invoke-direct {p0}, Lcom/shopkick/app/registration/ForgotPasswordScreen;->updateResetButton()V

    :goto_0
    const/4 p1, 0x0

    .line 212
    iput-object p1, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->resetPasswordRequest:Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordRequest;

    return-void
.end method

.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const p3, 0x7f0c00c9

    const/4 v0, 0x0

    .line 67
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f090236

    .line 69
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/AuthV3EditText;

    iput-object p2, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->emailTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    .line 70
    iget-object p2, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->emailText:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 71
    iget-object p2, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->emailTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    iget-object p3, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->emailText:Ljava/lang/String;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/AuthV3EditText;->setText(Ljava/lang/CharSequence;)V

    .line 73
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->emailTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {p2, p0}, Lcom/shopkick/app/widget/AuthV3EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    const p2, 0x7f0905b0

    .line 75
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->resetButton:Lcom/shopkick/app/widget/SKButton;

    .line 76
    iget-object p2, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->resetButton:Lcom/shopkick/app/widget/SKButton;

    new-instance p3, Lcom/shopkick/app/registration/ForgotPasswordScreen$OnClickListener;

    invoke-direct {p3, p0}, Lcom/shopkick/app/registration/ForgotPasswordScreen$OnClickListener;-><init>(Lcom/shopkick/app/registration/ForgotPasswordScreen;)V

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 78
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 p3, 0xab

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v0, 0x7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p2, p3, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 79
    iget-object p3, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->resetButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v0, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    const/4 v1, 0x0

    invoke-virtual {p3, p2, v0, v1}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 81
    invoke-direct {p0}, Lcom/shopkick/app/registration/ForgotPasswordScreen;->updateResetButton()V

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 1
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

    .line 53
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iput-object v0, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 54
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object v0, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    if-eqz p2, :cond_0

    const-string v0, "email"

    .line 57
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iput-object p2, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->emailText:Ljava/lang/String;

    .line 60
    :cond_0
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    .line 61
    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccountDataSource;->userIsRegistered()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    const-string p2, "This screen should never be displayed to a registered user."

    invoke-static {p1, p2}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 88
    iget-object v0, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->resetPasswordRequest:Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordRequest;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 89
    iget-object v0, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->progressDialog:Landroid/app/ProgressDialog;

    invoke-static {v0}, Lcom/shopkick/app/util/DialogUtils;->dismissProgressDialog(Landroid/app/ProgressDialog;)V

    .line 90
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onScreenDidShow()V
    .locals 1

    .line 100
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidShow()V

    .line 101
    iget-object v0, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->emailText:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 102
    iget-object v0, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen;->emailTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/AuthV3EditText;->requestFocus()Z

    .line 103
    invoke-virtual {p0}, Lcom/shopkick/app/registration/ForgotPasswordScreen;->showKeyboard()V

    :cond_0
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public shouldHideBack()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
