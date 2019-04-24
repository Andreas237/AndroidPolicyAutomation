.class public Lcom/shopkick/app/registration/RegistrationV3Screen;
.super Lcom/shopkick/app/registration/AuthV3Screen;
.source "RegistrationV3Screen.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/registration/RegistrationV3Screen$WebviewClickableSpan;,
        Lcom/shopkick/app/registration/RegistrationV3Screen$OnEditorActionListener;,
        Lcom/shopkick/app/registration/RegistrationV3Screen$OnClickListener;
    }
.end annotation


# instance fields
.field private createAccountButton:Lcom/shopkick/app/widget/SKButton;

.field private deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

.field private emailTextField:Lcom/shopkick/app/widget/AuthV3EditText;

.field private facebookButton:Lcom/shopkick/app/widget/SKButton;

.field private keyboardUpAutoScrollListener:Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;

.field private legalStatementTextView:Lcom/shopkick/app/widget/SKTextView;

.field private mainView:Landroid/view/View;

.field private nameTextField:Lcom/shopkick/app/widget/AuthV3EditText;

.field private passwordTextField:Lcom/shopkick/app/widget/AuthV3EditText;

.field private shouldShowNameField:Z

.field private wrapper:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Lcom/shopkick/app/registration/AuthV3Screen;-><init>()V

    const/4 v0, 0x1

    .line 48
    iput-boolean v0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->shouldShowNameField:Z

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/registration/RegistrationV3Screen;)Lcom/shopkick/app/widget/SKButton;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->createAccountButton:Lcom/shopkick/app/widget/SKButton;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/registration/RegistrationV3Screen;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lcom/shopkick/app/registration/RegistrationV3Screen;->onClickCreateAccountButton()V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/registration/RegistrationV3Screen;)Lcom/shopkick/app/widget/SKButton;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->facebookButton:Lcom/shopkick/app/widget/SKButton;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/registration/RegistrationV3Screen;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lcom/shopkick/app/registration/RegistrationV3Screen;->onClickFacebookButton()V

    return-void
.end method

.method static synthetic access$400(Lcom/shopkick/app/registration/RegistrationV3Screen;)Landroid/view/View;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->wrapper:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/registration/RegistrationV3Screen;)Lcom/shopkick/app/application/ScreenGlobals;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    return-object p0
.end method

.method private onClickCreateAccountButton()V
    .locals 4

    .line 263
    invoke-direct {p0}, Lcom/shopkick/app/registration/RegistrationV3Screen;->validateInputs()Z

    move-result v0

    if-nez v0, :cond_1

    .line 264
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 265
    iget-object v1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->mainView:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 266
    iget-object v1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->errorBox:Lcom/shopkick/app/widget/AuthV3ErrorBox;

    invoke-virtual {v1}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->getY()F

    move-result v1

    .line 267
    iget v0, v0, Landroid/graphics/Rect;->top:I

    int-to-float v0, v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 268
    invoke-virtual {p0}, Lcom/shopkick/app/registration/RegistrationV3Screen;->hideKeyboard()V

    :cond_0
    return-void

    .line 273
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->emailTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/AuthV3EditText;->getTrimmedInput()Ljava/lang/String;

    move-result-object v0

    .line 274
    iget-object v1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->passwordTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v1}, Lcom/shopkick/app/widget/AuthV3EditText;->getInput()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 276
    iget-boolean v3, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->shouldShowNameField:Z

    if-eqz v3, :cond_2

    .line 277
    iget-object v2, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->nameTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v2}, Lcom/shopkick/app/widget/AuthV3EditText;->getTrimmedInput()Ljava/lang/String;

    move-result-object v2

    .line 280
    :cond_2
    new-instance v3, Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-direct {v3}, Lcom/shopkick/app/account/Authenticator$AuthInfo;-><init>()V

    invoke-virtual {v3, v0}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->setEmail(Ljava/lang/String;)Lcom/shopkick/app/account/Authenticator$AuthInfo;

    move-result-object v0

    .line 281
    invoke-virtual {v0, v1}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->setPassword(Ljava/lang/String;)Lcom/shopkick/app/account/Authenticator$AuthInfo;

    move-result-object v0

    .line 282
    invoke-virtual {v0, v2}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->setName(Ljava/lang/String;)Lcom/shopkick/app/account/Authenticator$AuthInfo;

    move-result-object v0

    .line 283
    iget-object v1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->authenticator:Lcom/shopkick/app/account/Authenticator;

    sget-object v2, Lcom/shopkick/app/account/Authenticator$AuthAction;->REGISTER:Lcom/shopkick/app/account/Authenticator$AuthAction;

    sget-object v3, Lcom/shopkick/app/account/Authenticator$AuthMedium;->EMAIL:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    invoke-virtual {v1, v2, v3, v0}, Lcom/shopkick/app/account/Authenticator;->authenticate(Lcom/shopkick/app/account/Authenticator$AuthAction;Lcom/shopkick/app/account/Authenticator$AuthMedium;Lcom/shopkick/app/account/Authenticator$AuthInfo;)V

    return-void
.end method

.method private onClickFacebookButton()V
    .locals 3

    .line 287
    iget-object v0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->authenticator:Lcom/shopkick/app/account/Authenticator;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthAction;->REGISTER:Lcom/shopkick/app/account/Authenticator$AuthAction;

    sget-object v2, Lcom/shopkick/app/account/Authenticator$AuthMedium;->FACEBOOK:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/account/Authenticator;->authenticate(Lcom/shopkick/app/account/Authenticator$AuthAction;Lcom/shopkick/app/account/Authenticator$AuthMedium;)V

    return-void
.end method

.method private validateInputs()Z
    .locals 3

    .line 171
    iget-object v0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->errorBox:Lcom/shopkick/app/widget/AuthV3ErrorBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->setError(Ljava/lang/String;)V

    .line 172
    iget-object v0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->nameTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/AuthV3EditText;->markNoError()V

    .line 173
    iget-object v0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->emailTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/AuthV3EditText;->markNoError()V

    .line 174
    iget-object v0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->passwordTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/AuthV3EditText;->markNoError()V

    .line 176
    iget-boolean v0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->shouldShowNameField:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 177
    iget-object v0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->nameTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/AuthV3EditText;->getTrimmedInput()Ljava/lang/String;

    move-result-object v0

    .line 178
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 179
    iget-object v0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->errorBox:Lcom/shopkick/app/widget/AuthV3ErrorBox;

    const v2, 0x7f110594

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->setError(I)V

    .line 180
    iget-object v0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->nameTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/AuthV3EditText;->markError()V

    return v1

    .line 185
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->emailTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/AuthV3EditText;->getTrimmedInput()Ljava/lang/String;

    move-result-object v0

    .line 186
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 187
    iget-object v0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->errorBox:Lcom/shopkick/app/widget/AuthV3ErrorBox;

    const v2, 0x7f110593

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->setError(I)V

    .line 188
    iget-object v0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->emailTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/AuthV3EditText;->markError()V

    return v1

    .line 190
    :cond_1
    invoke-static {v0}, Lcom/shopkick/app/validators/EmailValidator;->isValid(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 191
    iget-object v0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->errorBox:Lcom/shopkick/app/widget/AuthV3ErrorBox;

    const v2, 0x7f110592

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->setError(I)V

    .line 192
    iget-object v0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->emailTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/AuthV3EditText;->markError()V

    return v1

    .line 196
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->passwordTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/AuthV3EditText;->getInput()Ljava/lang/String;

    move-result-object v0

    .line 197
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 198
    iget-object v0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->errorBox:Lcom/shopkick/app/widget/AuthV3ErrorBox;

    const v2, 0x7f110595

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->setError(I)V

    .line 199
    iget-object v0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->passwordTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/AuthV3EditText;->markError()V

    return v1

    .line 201
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v2, 0x6

    if-ge v0, v2, :cond_4

    .line 202
    iget-object v0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->errorBox:Lcom/shopkick/app/widget/AuthV3ErrorBox;

    const v2, 0x7f110596

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->setError(I)V

    .line 203
    iget-object v0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->passwordTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/AuthV3EditText;->markError()V

    return v1

    :cond_4
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    .line 63
    invoke-super {p0, p1, p2, p3}, Lcom/shopkick/app/registration/AuthV3Screen;->createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 64
    iget-object p3, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p3, p3, Lcom/shopkick/app/application/ScreenGlobals;->displayMetrics:Landroid/util/DisplayMetrics;

    const/4 v0, 0x0

    const v1, 0x7f0c017e

    .line 66
    invoke-virtual {p1, v1, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->mainView:Landroid/view/View;

    .line 67
    iget-object p1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->mainView:Landroid/view/View;

    const p2, 0x7f0904a0

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/AuthV3EditText;

    iput-object p1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->nameTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    .line 68
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    .line 69
    iget-boolean p2, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->shouldShowNameField:Z

    const/16 v1, 0x8

    if-nez p2, :cond_0

    .line 70
    iget-object p2, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->nameTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {p2, v1}, Lcom/shopkick/app/widget/AuthV3EditText;->setVisibility(I)V

    const/16 p2, 0x233c

    .line 71
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    goto :goto_0

    :cond_0
    const/16 p2, 0x233b

    .line 73
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    .line 75
    :goto_0
    iget-object p2, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 77
    iget-object p1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->mainView:Landroid/view/View;

    const p2, 0x7f090236

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/AuthV3EditText;

    iput-object p1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->emailTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    .line 78
    iget-object p1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->mainView:Landroid/view/View;

    const p2, 0x7f090507

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/AuthV3EditText;

    iput-object p1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->passwordTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    .line 79
    iget-object p1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->mainView:Landroid/view/View;

    const p2, 0x7f0901ba

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKButton;

    iput-object p1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->createAccountButton:Lcom/shopkick/app/widget/SKButton;

    .line 80
    iget-object p1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->mainView:Landroid/view/View;

    const p2, 0x7f09026e

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKButton;

    iput-object p1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->facebookButton:Lcom/shopkick/app/widget/SKButton;

    .line 81
    iget-object p1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->mainView:Landroid/view/View;

    const p2, 0x7f090256

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/AuthV3ErrorBox;

    iput-object p1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->errorBox:Lcom/shopkick/app/widget/AuthV3ErrorBox;

    .line 82
    iget-object p1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->mainView:Landroid/view/View;

    const p2, 0x7f090853

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->wrapper:Landroid/view/View;

    .line 83
    iget-object p1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->mainView:Landroid/view/View;

    const p2, 0x7f090412

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKTextView;

    iput-object p1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->legalStatementTextView:Lcom/shopkick/app/widget/SKTextView;

    .line 85
    iget-object p1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->emailTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    iget-object p2, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {p2}, Lcom/shopkick/app/application/DeviceInfo;->getDeviceEmail()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/AuthV3EditText;->setText(Ljava/lang/CharSequence;)V

    .line 87
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 p2, 0x1e

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v2, 0x7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {p1, p2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 88
    iget-object p2, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->flowId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setFlowId(Ljava/lang/String;)V

    .line 89
    iget-object p2, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->facebookButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v3, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    const/4 v4, 0x0

    invoke-virtual {p2, p1, v3, v4}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 90
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 p2, 0x2a

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {p1, p2, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 91
    iget-object p2, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->flowId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setFlowId(Ljava/lang/String;)V

    .line 92
    iget-object p2, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->createAccountButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v2, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p2, p1, v2, v4}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 94
    new-instance p1, Lcom/shopkick/app/registration/RegistrationV3Screen$OnClickListener;

    invoke-direct {p1, p0}, Lcom/shopkick/app/registration/RegistrationV3Screen$OnClickListener;-><init>(Lcom/shopkick/app/registration/RegistrationV3Screen;)V

    .line 95
    iget-object p2, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->createAccountButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 96
    iget-object p2, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->facebookButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 102
    iget-object p2, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p2, p2, Lcom/shopkick/app/application/ScreenGlobals;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {p2}, Lcom/shopkick/app/account/UserAccountDataSource;->getUserCountry()Ljava/lang/Integer;

    move-result-object p2

    const/4 v2, 0x1

    .line 103
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 104
    iget-object p2, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->legalStatementTextView:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {p2, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    goto :goto_1

    .line 110
    :cond_1
    new-instance p2, Landroid/text/SpannableString;

    const v1, 0x7f110598

    invoke-virtual {p0, v1}, Lcom/shopkick/app/registration/RegistrationV3Screen;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p2, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 112
    new-instance v2, Lcom/shopkick/app/registration/RegistrationV3Screen$WebviewClickableSpan;

    invoke-virtual {p0}, Lcom/shopkick/app/registration/RegistrationV3Screen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v3

    const v4, 0x7f060120

    invoke-virtual {p0, v4}, Lcom/shopkick/app/registration/RegistrationV3Screen;->getResourceColor(I)I

    move-result v5

    const/4 v6, 0x3

    invoke-direct {v2, p0, v3, v5, v6}, Lcom/shopkick/app/registration/RegistrationV3Screen$WebviewClickableSpan;-><init>(Lcom/shopkick/app/registration/RegistrationV3Screen;Lcom/shopkick/app/activities/BaseActivity;II)V

    .line 113
    new-instance v3, Lcom/shopkick/app/registration/RegistrationV3Screen$WebviewClickableSpan;

    invoke-virtual {p0}, Lcom/shopkick/app/registration/RegistrationV3Screen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v5

    invoke-virtual {p0, v4}, Lcom/shopkick/app/registration/RegistrationV3Screen;->getResourceColor(I)I

    move-result v4

    const/4 v6, 0x2

    invoke-direct {v3, p0, v5, v4, v6}, Lcom/shopkick/app/registration/RegistrationV3Screen$WebviewClickableSpan;-><init>(Lcom/shopkick/app/registration/RegistrationV3Screen;Lcom/shopkick/app/activities/BaseActivity;II)V

    const v4, 0x7f11059a

    .line 114
    invoke-virtual {p0, v4}, Lcom/shopkick/app/registration/RegistrationV3Screen;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f110599

    .line 115
    invoke-virtual {p0, v5}, Lcom/shopkick/app/registration/RegistrationV3Screen;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 116
    invoke-virtual {p0, v1}, Lcom/shopkick/app/registration/RegistrationV3Screen;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 117
    invoke-virtual {v6, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    .line 118
    invoke-virtual {p0, v1}, Lcom/shopkick/app/registration/RegistrationV3Screen;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 119
    invoke-virtual {v1, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    .line 120
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v4, v6

    invoke-virtual {p2, v2, v6, v4, v0}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 121
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v2, v1

    invoke-virtual {p2, v3, v1, v2, v0}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 124
    iget-object v0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->legalStatementTextView:Lcom/shopkick/app/widget/SKTextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 126
    iget-object v0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->legalStatementTextView:Lcom/shopkick/app/widget/SKTextView;

    sget-object v1, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {v0, p2, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    .line 134
    :goto_1
    iget-object p2, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->wrapper:Landroid/view/View;

    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 140
    new-instance p1, Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;

    iget-object p2, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->mainView:Landroid/view/View;

    iget-object v0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->createAccountButton:Lcom/shopkick/app/widget/SKButton;

    iget p3, p3, Landroid/util/DisplayMetrics;->density:F

    invoke-direct {p1, p2, v0, p3}, Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;-><init>(Landroid/view/View;Landroid/view/View;F)V

    iput-object p1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->keyboardUpAutoScrollListener:Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;

    .line 143
    iget-object p1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->mainView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->keyboardUpAutoScrollListener:Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;

    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 152
    iget-object p1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->passwordTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    new-instance p2, Lcom/shopkick/app/registration/RegistrationV3Screen$OnEditorActionListener;

    invoke-direct {p2, p0}, Lcom/shopkick/app/registration/RegistrationV3Screen$OnEditorActionListener;-><init>(Lcom/shopkick/app/registration/RegistrationV3Screen;)V

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/AuthV3EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 153
    iget-object p1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->mainView:Landroid/view/View;

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

    .line 52
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/registration/AuthV3Screen;->init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V

    .line 53
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    iput-object p2, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    .line 54
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    iput-object p1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    .line 56
    iget-object p1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    iget-object p1, p1, Lcom/shopkick/app/launch/FirstUseControllerV2;->firstUseExperimentData:Lcom/shopkick/app/fetchers/api/skapi/FirstUseExperimentData;

    if-eqz p1, :cond_0

    .line 57
    iget-object p1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    iget-object p1, p1, Lcom/shopkick/app/launch/FirstUseControllerV2;->firstUseExperimentData:Lcom/shopkick/app/fetchers/api/skapi/FirstUseExperimentData;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/FirstUseExperimentData;->shouldAskForName:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->shouldShowNameField:Z

    :cond_0
    return-void
.end method

.method public onStop()V
    .locals 2

    .line 158
    invoke-super {p0}, Lcom/shopkick/app/registration/AuthV3Screen;->onStop()V

    .line 162
    iget-object v0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->mainView:Landroid/view/View;

    iget-object v1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen;->keyboardUpAutoScrollListener:Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;

    invoke-static {v0, v1}, Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;->removeKeyboardUpAutoScrollListenerFromView(Landroid/view/View;Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;)V

    return-void
.end method

.method public shouldHideBack()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
