.class public Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "FirstUseV3RegistrationIntroScreen.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen$OnClickListener;
    }
.end annotation


# instance fields
.field private createAccountButton:Lcom/shopkick/app/widget/SKButton;

.field private firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

.field private loginButton:Lcom/shopkick/app/widget/SKTextView;

.field private shouldDisplaySkip:Z

.field private skipButton:Lcom/shopkick/app/widget/SKButton;

.field private userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;)Lcom/shopkick/app/widget/SKButton;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->skipButton:Lcom/shopkick/app/widget/SKButton;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->onClickSkipButton()V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;)Lcom/shopkick/app/widget/SKButton;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->createAccountButton:Lcom/shopkick/app/widget/SKButton;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->onClickCreateAccountButton()V

    return-void
.end method

.method static synthetic access$400(Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;)Lcom/shopkick/app/widget/SKTextView;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->loginButton:Lcom/shopkick/app/widget/SKTextView;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->onClickLoginButton()V

    return-void
.end method

.method private onClickCreateAccountButton()V
    .locals 3

    .line 127
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->userIsRegistered()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 128
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->skip()V

    goto :goto_0

    .line 130
    :cond_0
    const-class v0, Lcom/shopkick/app/activities/LoginRegistrationActivity;

    const-class v1, Lcom/shopkick/app/registration/RegistrationV3Screen;

    invoke-virtual {p0}, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->getParams()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->goToActivityWithScreen(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    :goto_0
    return-void
.end method

.method private onClickLoginButton()V
    .locals 3

    .line 135
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x2b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 136
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 137
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->userIsRegistered()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 138
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->skip()V

    goto :goto_0

    .line 140
    :cond_0
    const-class v0, Lcom/shopkick/app/activities/LoginRegistrationActivity;

    const-class v1, Lcom/shopkick/app/registration/LoginPickerV3Screen;

    invoke-virtual {p0}, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->getParams()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->goToActivityWithScreen(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    :goto_0
    return-void
.end method

.method private onClickSkipButton()V
    .locals 0

    .line 119
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->skip()V

    return-void
.end method

.method private skip()V
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->gotoNextScreen()Z

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    const p3, 0x7f0c00c3

    const/4 v0, 0x0

    .line 60
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f0906a4

    .line 62
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->skipButton:Lcom/shopkick/app/widget/SKButton;

    const p2, 0x7f0901ba

    .line 63
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->createAccountButton:Lcom/shopkick/app/widget/SKButton;

    const p2, 0x7f09044b

    .line 64
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKTextView;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->loginButton:Lcom/shopkick/app/widget/SKTextView;

    .line 65
    iget-boolean p2, p0, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->shouldDisplaySkip:Z

    const/4 p3, 0x0

    const/4 v0, 0x7

    if-nez p2, :cond_0

    .line 67
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->skipButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x4

    invoke-virtual {p2, v1}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    goto :goto_0

    .line 69
    :cond_0
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x20

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {p2, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 70
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->skipButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v2, p0, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, p2, v2, p3}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 73
    :goto_0
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x2a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p2, v1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 74
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->createAccountButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p2, v1, p3}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 76
    new-instance p2, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen$OnClickListener;

    invoke-direct {p2, p0}, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen$OnClickListener;-><init>(Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;)V

    .line 77
    iget-object p3, p0, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->skipButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p3, p2}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 78
    iget-object p3, p0, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->createAccountButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p3, p2}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 79
    iget-object p3, p0, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->loginButton:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {p3, p2}, Lcom/shopkick/app/widget/SKTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

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

    .line 39
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

    iput-object v0, p0, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    .line 40
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    const-string/jumbo p1, "should_show_skip_button"

    .line 42
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->shouldDisplaySkip:Z

    .line 43
    invoke-virtual {p0, p2}, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->setParams(Ljava/util/Map;)V

    return-void
.end method

.method public onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;
    .locals 1

    .line 88
    sget-object v0, Lcom/shopkick/app/screens/AppScreen$BackPressedState;->PERFORM_ACTIVITY_BACK:Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    return-object v0
.end method

.method public updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 2

    .line 48
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 49
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->params:Ljava/util/Map;

    const-string v1, "flow_id"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 50
    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 51
    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setFlowId(Ljava/lang/String;)V

    .line 54
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->params:Ljava/util/Map;

    const-string/jumbo v1, "should_show_skip_button"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setShowSkip(Ljava/lang/Boolean;)V

    return-void
.end method
