.class public Lcom/shopkick/app/registration/EmailLoginV3Screen;
.super Lcom/shopkick/app/registration/AuthV3Screen;
.source "EmailLoginV3Screen.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/registration/EmailLoginV3Screen$OnEditorActionListener;,
        Lcom/shopkick/app/registration/EmailLoginV3Screen$OnClickListener;
    }
.end annotation


# instance fields
.field private emailLoginV3ScreenBinding:Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;

.field emailLoginViewModel:Lcom/shopkick/app/viewmodel/EmailLoginViewModel;

.field private emailTextField:Lcom/shopkick/app/widget/AuthV3EditText;

.field private forgotPasswordButton:Lcom/shopkick/app/widget/SKButton;

.field private keyboardUpAutoScrollListener:Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;

.field private loginButton:Lcom/shopkick/app/widget/SKButton;

.field private passwordTextField:Lcom/shopkick/app/widget/AuthV3EditText;

.field private wrapper:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/shopkick/app/registration/AuthV3Screen;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/registration/EmailLoginV3Screen;)Lcom/shopkick/app/widget/SKButton;
    .locals 0

    .line 36
    iget-object p0, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->loginButton:Lcom/shopkick/app/widget/SKButton;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/registration/EmailLoginV3Screen;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/shopkick/app/registration/EmailLoginV3Screen;->onClickLoginButton()V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/registration/EmailLoginV3Screen;)Lcom/shopkick/app/widget/SKButton;
    .locals 0

    .line 36
    iget-object p0, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->forgotPasswordButton:Lcom/shopkick/app/widget/SKButton;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/registration/EmailLoginV3Screen;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/shopkick/app/registration/EmailLoginV3Screen;->onClickForgotPasswordButton()V

    return-void
.end method

.method static synthetic access$400(Lcom/shopkick/app/registration/EmailLoginV3Screen;)Landroid/view/View;
    .locals 0

    .line 36
    iget-object p0, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->wrapper:Landroid/view/View;

    return-object p0
.end method

.method public static synthetic lambda$onScreenDidShow$214(Lcom/shopkick/app/registration/EmailLoginV3Screen;Ljava/lang/String;)V
    .locals 0

    .line 123
    invoke-direct {p0, p1}, Lcom/shopkick/app/registration/EmailLoginV3Screen;->onTriggerAuthCodeLogin(Ljava/lang/String;)V

    return-void
.end method

.method private onClickForgotPasswordButton()V
    .locals 3

    .line 262
    iget-object v0, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->emailTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/AuthV3EditText;->getTrimmedInput()Ljava/lang/String;

    move-result-object v0

    .line 264
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 265
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "email"

    .line 266
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 268
    :goto_0
    const-class v0, Lcom/shopkick/app/registration/ForgotPasswordScreen;

    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/registration/EmailLoginV3Screen;->goToScreenInCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method private onClickLoginButton()V
    .locals 4

    .line 242
    invoke-direct {p0}, Lcom/shopkick/app/registration/EmailLoginV3Screen;->validateInputs()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 246
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->emailTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/AuthV3EditText;->getTrimmedInput()Ljava/lang/String;

    move-result-object v0

    .line 247
    iget-object v1, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->passwordTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v1}, Lcom/shopkick/app/widget/AuthV3EditText;->getInput()Ljava/lang/String;

    move-result-object v1

    .line 249
    new-instance v2, Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-direct {v2}, Lcom/shopkick/app/account/Authenticator$AuthInfo;-><init>()V

    invoke-virtual {v2, v0}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->setEmail(Ljava/lang/String;)Lcom/shopkick/app/account/Authenticator$AuthInfo;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->setPassword(Ljava/lang/String;)Lcom/shopkick/app/account/Authenticator$AuthInfo;

    move-result-object v0

    .line 250
    iget-object v1, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->authenticator:Lcom/shopkick/app/account/Authenticator;

    sget-object v2, Lcom/shopkick/app/account/Authenticator$AuthAction;->LOGIN:Lcom/shopkick/app/account/Authenticator$AuthAction;

    sget-object v3, Lcom/shopkick/app/account/Authenticator$AuthMedium;->EMAIL:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    invoke-virtual {v1, v2, v3, v0}, Lcom/shopkick/app/account/Authenticator;->authenticate(Lcom/shopkick/app/account/Authenticator$AuthAction;Lcom/shopkick/app/account/Authenticator$AuthMedium;Lcom/shopkick/app/account/Authenticator$AuthInfo;)V

    return-void
.end method

.method private onTriggerAuthCodeLogin(Ljava/lang/String;)V
    .locals 3

    .line 254
    invoke-direct {p0, p1}, Lcom/shopkick/app/registration/EmailLoginV3Screen;->validateAuthCode(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 257
    :cond_0
    new-instance v0, Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-direct {v0}, Lcom/shopkick/app/account/Authenticator$AuthInfo;-><init>()V

    invoke-virtual {v0, p1}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->setAuthCode(Ljava/lang/String;)Lcom/shopkick/app/account/Authenticator$AuthInfo;

    move-result-object p1

    .line 258
    iget-object v0, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->authenticator:Lcom/shopkick/app/account/Authenticator;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthAction;->LOGIN:Lcom/shopkick/app/account/Authenticator$AuthAction;

    sget-object v2, Lcom/shopkick/app/account/Authenticator$AuthMedium;->AUTH_CODE:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    invoke-virtual {v0, v1, v2, p1}, Lcom/shopkick/app/account/Authenticator;->authenticate(Lcom/shopkick/app/account/Authenticator$AuthAction;Lcom/shopkick/app/account/Authenticator$AuthMedium;Lcom/shopkick/app/account/Authenticator$AuthInfo;)V

    return-void
.end method

.method private validateAuthCode(Ljava/lang/String;)Z
    .locals 2

    .line 175
    iget-object v0, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->errorBox:Lcom/shopkick/app/widget/AuthV3ErrorBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->setError(Ljava/lang/String;)V

    .line 176
    iget-object v0, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->emailTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/AuthV3EditText;->markNoError()V

    .line 177
    iget-object v0, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->passwordTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/AuthV3EditText;->markNoError()V

    .line 179
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 180
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 181
    iget-object p1, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->errorBox:Lcom/shopkick/app/widget/AuthV3ErrorBox;

    const v0, 0x7f110291

    invoke-virtual {p0, v0}, Lcom/shopkick/app/registration/EmailLoginV3Screen;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->setError(Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private validateInputs()Z
    .locals 3

    .line 149
    iget-object v0, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->errorBox:Lcom/shopkick/app/widget/AuthV3ErrorBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->setError(Ljava/lang/String;)V

    .line 150
    iget-object v0, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->emailTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/AuthV3EditText;->markNoError()V

    .line 151
    iget-object v0, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->passwordTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/AuthV3EditText;->markNoError()V

    .line 153
    iget-object v0, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->emailTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/AuthV3EditText;->getTrimmedInput()Ljava/lang/String;

    move-result-object v0

    .line 154
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 155
    iget-object v0, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->errorBox:Lcom/shopkick/app/widget/AuthV3ErrorBox;

    const v1, 0x7f110292

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->setError(I)V

    .line 156
    iget-object v0, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->emailTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/AuthV3EditText;->markError()V

    return v2

    .line 158
    :cond_0
    sget-object v1, Landroid/util/Patterns;->EMAIL_ADDRESS:Ljava/util/regex/Pattern;

    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_1

    .line 159
    iget-object v0, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->errorBox:Lcom/shopkick/app/widget/AuthV3ErrorBox;

    const v1, 0x7f11013f

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->setError(I)V

    .line 160
    iget-object v0, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->emailTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/AuthV3EditText;->markError()V

    return v2

    .line 164
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->passwordTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/AuthV3EditText;->getInput()Ljava/lang/String;

    move-result-object v0

    .line 165
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 166
    iget-object v0, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->errorBox:Lcom/shopkick/app/widget/AuthV3ErrorBox;

    const v1, 0x7f110293

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->setError(I)V

    .line 167
    iget-object v0, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->passwordTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/AuthV3EditText;->markError()V

    return v2

    :cond_2
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 55
    invoke-super {p0, p1, p2, p3}, Lcom/shopkick/app/registration/AuthV3Screen;->createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    const/4 p3, 0x0

    const v0, 0x7f0c00aa

    .line 56
    invoke-static {p1, v0, p2, p3}, Landroid/databinding/DataBindingUtil;->inflate(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;

    iput-object p1, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->emailLoginV3ScreenBinding:Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;

    .line 57
    new-instance p1, Lcom/shopkick/app/viewmodel/EmailLoginViewModel;

    invoke-direct {p1}, Lcom/shopkick/app/viewmodel/EmailLoginViewModel;-><init>()V

    .line 58
    iget-object p2, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->emailLoginV3ScreenBinding:Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;

    const/4 v0, 0x5

    invoke-virtual {p2, v0, p1}, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;->setVariable(ILjava/lang/Object;)Z

    .line 59
    iget-object p1, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->emailLoginV3ScreenBinding:Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;

    invoke-virtual {p1}, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;->executePendingBindings()V

    .line 60
    iget-object p1, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->displayMetrics:Landroid/util/DisplayMetrics;

    .line 63
    iget-object p2, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->emailLoginV3ScreenBinding:Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;

    iget-object p2, p2, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;->email:Lcom/shopkick/app/widget/AuthV3EditText;

    iput-object p2, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->emailTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    .line 64
    iget-object p2, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->emailLoginV3ScreenBinding:Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;

    iget-object p2, p2, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;->password:Lcom/shopkick/app/widget/AuthV3EditText;

    iput-object p2, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->passwordTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    .line 65
    iget-object p2, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->emailLoginV3ScreenBinding:Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;

    iget-object p2, p2, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;->login:Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->loginButton:Lcom/shopkick/app/widget/SKButton;

    .line 66
    iget-object p2, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->emailLoginV3ScreenBinding:Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;

    iget-object p2, p2, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;->forgotPassword:Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->forgotPasswordButton:Lcom/shopkick/app/widget/SKButton;

    .line 67
    iget-object p2, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->emailLoginV3ScreenBinding:Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;

    invoke-virtual {p2}, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;->getRoot()Landroid/view/View;

    move-result-object p2

    const v0, 0x7f090853

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->wrapper:Landroid/view/View;

    .line 69
    invoke-virtual {p0}, Lcom/shopkick/app/registration/EmailLoginV3Screen;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f110294

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 70
    new-instance v0, Landroid/text/SpannableString;

    invoke-direct {v0, p2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 71
    new-instance v1, Landroid/text/style/UnderlineSpan;

    invoke-direct {v1}, Landroid/text/style/UnderlineSpan;-><init>()V

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    invoke-virtual {v0, v1, p3, p2, p3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 72
    iget-object p2, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->forgotPasswordButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/widget/SKButton;->setSpannableButtonText(Landroid/text/SpannableString;)V

    .line 73
    iget-object p2, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->emailLoginV3ScreenBinding:Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;

    iget-object p2, p2, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;->errorBox:Lcom/shopkick/app/widget/AuthV3ErrorBox;

    iput-object p2, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->errorBox:Lcom/shopkick/app/widget/AuthV3ErrorBox;

    .line 75
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 p3, 0x2b

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v0, 0x7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p2, p3, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 76
    iget-object p3, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->loginButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v1, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    const/4 v2, 0x0

    invoke-virtual {p3, p2, v1, v2}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 77
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 p3, 0x122

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p2, p3, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 78
    iget-object p3, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->forgotPasswordButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v0, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p3, p2, v0, v2}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 80
    new-instance p2, Lcom/shopkick/app/registration/EmailLoginV3Screen$OnClickListener;

    invoke-direct {p2, p0}, Lcom/shopkick/app/registration/EmailLoginV3Screen$OnClickListener;-><init>(Lcom/shopkick/app/registration/EmailLoginV3Screen;)V

    .line 81
    iget-object p3, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->loginButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p3, p2}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 82
    iget-object p3, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->forgotPasswordButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p3, p2}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 83
    iget-object p3, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->wrapper:Landroid/view/View;

    invoke-virtual {p3, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 90
    iget-object p2, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->passwordTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    new-instance p3, Lcom/shopkick/app/registration/EmailLoginV3Screen$OnEditorActionListener;

    invoke-direct {p3, p0}, Lcom/shopkick/app/registration/EmailLoginV3Screen$OnEditorActionListener;-><init>(Lcom/shopkick/app/registration/EmailLoginV3Screen;)V

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/AuthV3EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 92
    new-instance p2, Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;

    iget-object p3, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->emailLoginV3ScreenBinding:Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;

    invoke-virtual {p3}, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;->getRoot()Landroid/view/View;

    move-result-object p3

    iget-object v0, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->loginButton:Lcom/shopkick/app/widget/SKButton;

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    invoke-direct {p2, p3, v0, p1}, Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;-><init>(Landroid/view/View;Landroid/view/View;F)V

    iput-object p2, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->keyboardUpAutoScrollListener:Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;

    .line 93
    iget-object p1, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->emailLoginV3ScreenBinding:Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;

    invoke-virtual {p1}, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;->getRoot()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->keyboardUpAutoScrollListener:Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;

    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 95
    iget-object p1, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->emailLoginV3ScreenBinding:Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;

    invoke-virtual {p1}, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;->getRoot()Landroid/view/View;

    move-result-object p1

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

    .line 50
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/registration/AuthV3Screen;->init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V

    return-void
.end method

.method public onScreenDidShow()V
    .locals 4

    .line 105
    invoke-super {p0}, Lcom/shopkick/app/registration/AuthV3Screen;->onScreenDidShow()V

    .line 110
    invoke-virtual {p0}, Lcom/shopkick/app/registration/EmailLoginV3Screen;->getParams()Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v1, "email"

    .line 112
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "password"

    .line 113
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "auth_code"

    .line 114
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v0, v1

    move-object v2, v0

    .line 121
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 122
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 123
    new-instance v2, Lcom/shopkick/app/registration/-$$Lambda$EmailLoginV3Screen$-ZZOfRc1Cu1IHjcvP0B9bnm0KVE;

    invoke-direct {v2, p0, v0}, Lcom/shopkick/app/registration/-$$Lambda$EmailLoginV3Screen$-ZZOfRc1Cu1IHjcvP0B9bnm0KVE;-><init>(Lcom/shopkick/app/registration/EmailLoginV3Screen;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    .line 124
    :cond_1
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 125
    iget-object v0, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->emailTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/AuthV3EditText;->setText(Ljava/lang/CharSequence;)V

    .line 127
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 128
    iget-object v0, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->passwordTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/AuthV3EditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 132
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->passwordTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/AuthV3EditText;->requestFocus()Z

    goto :goto_1

    .line 135
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->emailTextField:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/AuthV3EditText;->requestFocus()Z

    :goto_1
    return-void
.end method

.method public onStop()V
    .locals 2

    .line 141
    invoke-super {p0}, Lcom/shopkick/app/registration/AuthV3Screen;->onStop()V

    .line 145
    iget-object v0, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->emailLoginV3ScreenBinding:Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;

    invoke-virtual {v0}, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;->getRoot()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen;->keyboardUpAutoScrollListener:Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;

    invoke-static {v0, v1}, Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;->removeKeyboardUpAutoScrollListenerFromView(Landroid/view/View;Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;)V

    return-void
.end method

.method public shouldHideBack()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
