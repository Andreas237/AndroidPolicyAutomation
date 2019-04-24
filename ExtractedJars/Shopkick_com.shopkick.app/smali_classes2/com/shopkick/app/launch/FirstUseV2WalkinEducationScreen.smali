.class public Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "FirstUseV2WalkinEducationScreen.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen$ClickListeners;
    }
.end annotation


# instance fields
.field private final PAUSE_DURATION:I

.field private buttonUrl:Ljava/lang/String;

.field private handler:Landroid/os/Handler;

.field private learnHowButton:Lcom/shopkick/app/widget/SKButton;

.field private nextButton:Lcom/shopkick/app/widget/SKButton;

.field poppedScreenClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    const/16 v0, 0x1f4

    .line 25
    iput v0, p0, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;->PAUSE_DURATION:I

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;->handleNextButtonTap()V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;->handleLearnHowButtonTap()V

    return-void
.end method

.method private handleLearnHowButtonTap()V
    .locals 3

    .line 121
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x5f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 122
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 124
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "origin_screen"

    const/16 v2, 0x64

    .line 126
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    .line 125
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    const-class v1, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-virtual {p0, v1, v0}, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;->goToScreenInCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method private handleNextButtonTap()V
    .locals 3

    .line 109
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x1d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 110
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 112
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;->buttonUrl:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 113
    const-class v0, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;->goToScreenInCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    goto :goto_0

    .line 115
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {v0}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object v0

    .line 116
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;->buttonUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    :goto_0
    return-void
.end method

.method public static synthetic lambda$isWT4A6x9nNN1Wyt_g5t5AwZZT0(Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;)V
    .locals 0

    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;->handleNextButtonTap()V

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0c00c5

    const/4 v0, 0x0

    .line 51
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 52
    new-instance p2, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen$ClickListeners;

    invoke-direct {p2, p0}, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen$ClickListeners;-><init>(Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;)V

    const p3, 0x7f0904a8

    .line 53
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/shopkick/app/widget/SKButton;

    iput-object p3, p0, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    .line 54
    iget-object p3, p0, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p3, p2}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p3, 0x7f09040a

    .line 55
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/shopkick/app/widget/SKButton;

    iput-object p3, p0, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;->learnHowButton:Lcom/shopkick/app/widget/SKButton;

    .line 56
    iget-object p3, p0, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;->learnHowButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p3, p2}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p1
.end method

.method public getPopEnterAnimationRes(Ljava/lang/Class;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;)I"
        }
    .end annotation

    .line 136
    const-class v0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const p1, 0x7f010024

    return p1

    .line 139
    :cond_0
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->getPopEnterAnimationRes(Ljava/lang/Class;)I

    move-result p1

    return p1
.end method

.method public getPushExitAnimationRes(Ljava/lang/Class;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;)I"
        }
    .end annotation

    .line 145
    const-class v0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const p1, 0x7f010024

    return p1

    .line 148
    :cond_0
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->getPushExitAnimationRes(Ljava/lang/Class;)I

    move-result p1

    return p1
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

    .line 36
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;->handler:Landroid/os/Handler;

    const-string p1, "button_url"

    .line 37
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;->buttonUrl:Ljava/lang/String;

    return-void
.end method

.method public onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;
    .locals 1

    .line 154
    sget-object v0, Lcom/shopkick/app/screens/AppScreen$BackPressedState;->PERFORM_ACTIVITY_BACK:Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    return-object v0
.end method

.method protected onScreenDidHide()V
    .locals 1

    .line 78
    invoke-virtual {p0}, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;->isTopScreen()Z

    move-result v0

    if-nez v0, :cond_0

    .line 79
    invoke-virtual {p0}, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;->poppedScreenClass:Ljava/lang/Class;

    :cond_0
    return-void
.end method

.method public onScreenDidShow()V
    .locals 4

    .line 62
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;->poppedScreenClass:Ljava/lang/Class;

    if-eqz v0, :cond_0

    const-class v1, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    if-ne v0, v1, :cond_0

    .line 63
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/app/launch/-$$Lambda$FirstUseV2WalkinEducationScreen$isWT4A6x9nNN1Wyt_g5t5AwZZT0;

    invoke-direct {v1, p0}, Lcom/shopkick/app/launch/-$$Lambda$FirstUseV2WalkinEducationScreen$isWT4A6x9nNN1Wyt_g5t5AwZZT0;-><init>(Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    const/4 v0, 0x0

    .line 64
    iput-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;->poppedScreenClass:Ljava/lang/Class;

    :cond_0
    return-void
.end method

.method public onScreenWillShow()V
    .locals 2

    .line 70
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;->poppedScreenClass:Ljava/lang/Class;

    if-eqz v0, :cond_0

    const-class v1, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;

    if-ne v0, v1, :cond_0

    .line 71
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 72
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;->learnHowButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 2

    .line 42
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 43
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;->params:Ljava/util/Map;

    const-string v1, "flow_id"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 44
    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 45
    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setFlowId(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
