.class public Lcom/shopkick/app/launch/FirstUseV5DefaultScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "FirstUseV5DefaultScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private flowId:Ljava/lang/String;

.field private loginButton:Lcom/shopkick/app/widget/SKButton;

.field private mainImageView:Landroid/widget/ImageView;

.field private mainTextView:Lcom/shopkick/app/widget/SKTextView;

.field private signUpButton:Lcom/shopkick/app/widget/SKButton;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method private setupEventLogForButton(Lcom/shopkick/app/widget/SKButton;I)V
    .locals 2

    .line 81
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, p2, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 82
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseV5DefaultScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0c00c6

    const/4 v0, 0x0

    .line 48
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f0900be

    .line 51
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseV5DefaultScreen;->loginButton:Lcom/shopkick/app/widget/SKButton;

    .line 52
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseV5DefaultScreen;->loginButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p2, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 53
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseV5DefaultScreen;->loginButton:Lcom/shopkick/app/widget/SKButton;

    const p3, 0x7f1102f8

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    .line 54
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseV5DefaultScreen;->loginButton:Lcom/shopkick/app/widget/SKButton;

    const/16 p3, 0x2b

    invoke-direct {p0, p2, p3}, Lcom/shopkick/app/launch/FirstUseV5DefaultScreen;->setupEventLogForButton(Lcom/shopkick/app/widget/SKButton;I)V

    const p2, 0x7f0900c1

    .line 56
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseV5DefaultScreen;->signUpButton:Lcom/shopkick/app/widget/SKButton;

    .line 57
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseV5DefaultScreen;->signUpButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p2, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 58
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseV5DefaultScreen;->signUpButton:Lcom/shopkick/app/widget/SKButton;

    const p3, 0x7f1102f9

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    .line 59
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseV5DefaultScreen;->signUpButton:Lcom/shopkick/app/widget/SKButton;

    const/16 p3, 0x2a

    invoke-direct {p0, p2, p3}, Lcom/shopkick/app/launch/FirstUseV5DefaultScreen;->setupEventLogForButton(Lcom/shopkick/app/widget/SKButton;I)V

    const p2, 0x7f090461

    .line 62
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKTextView;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseV5DefaultScreen;->mainTextView:Lcom/shopkick/app/widget/SKTextView;

    .line 63
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseV5DefaultScreen;->mainTextView:Lcom/shopkick/app/widget/SKTextView;

    const p3, 0x7f1102fa

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    const p2, 0x7f09045d

    .line 66
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseV5DefaultScreen;->mainImageView:Landroid/widget/ImageView;

    .line 67
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseV5DefaultScreen;->mainImageView:Landroid/widget/ImageView;

    const p3, 0x7f080164

    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setImageResource(I)V

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

    .line 34
    invoke-virtual {p0, p2}, Lcom/shopkick/app/launch/FirstUseV5DefaultScreen;->setParams(Ljava/util/Map;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 73
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV5DefaultScreen;->loginButton:Lcom/shopkick/app/widget/SKButton;

    if-ne p1, v0, :cond_0

    .line 74
    const-class p1, Lcom/shopkick/app/activities/LoginRegistrationActivity;

    const-class v0, Lcom/shopkick/app/registration/LoginPickerV3Screen;

    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseV5DefaultScreen;->params:Ljava/util/Map;

    invoke-virtual {p0, p1, v0, v1}, Lcom/shopkick/app/launch/FirstUseV5DefaultScreen;->goToActivityWithScreen(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    goto :goto_0

    .line 75
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV5DefaultScreen;->signUpButton:Lcom/shopkick/app/widget/SKButton;

    if-ne p1, v0, :cond_1

    .line 76
    const-class p1, Lcom/shopkick/app/activities/LoginRegistrationActivity;

    const-class v0, Lcom/shopkick/app/registration/RegistrationV3Screen;

    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseV5DefaultScreen;->params:Ljava/util/Map;

    invoke-virtual {p0, p1, v0, v1}, Lcom/shopkick/app/launch/FirstUseV5DefaultScreen;->goToActivityWithScreen(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 2

    .line 39
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 40
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV5DefaultScreen;->params:Ljava/util/Map;

    const-string v1, "flow_id"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 41
    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 42
    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setFlowId(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
