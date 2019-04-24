.class public Lcom/shopkick/app/launch/FirstUseV2InviteScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "FirstUseV2InviteScreen.java"


# instance fields
.field private contactPickerSkUrl:Ljava/lang/String;

.field private firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

.field private inviteButtonClickListener:Landroid/view/View$OnClickListener;

.field private inviteButtonText:Ljava/lang/String;

.field private notNowButtonText:Ljava/lang/String;

.field private skipButtonClickListener:Landroid/view/View$OnClickListener;

.field private subtitleText:Ljava/lang/String;

.field private titleText:Ljava/lang/String;

.field private urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 25
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    .line 118
    new-instance v0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/launch/FirstUseV2InviteScreen$1;-><init>(Lcom/shopkick/app/launch/FirstUseV2InviteScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen;->inviteButtonClickListener:Landroid/view/View$OnClickListener;

    .line 125
    new-instance v0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen$2;

    invoke-direct {v0, p0}, Lcom/shopkick/app/launch/FirstUseV2InviteScreen$2;-><init>(Lcom/shopkick/app/launch/FirstUseV2InviteScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen;->skipButtonClickListener:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/launch/FirstUseV2InviteScreen;)Ljava/lang/String;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen;->contactPickerSkUrl:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/launch/FirstUseV2InviteScreen;)Lcom/shopkick/app/url/URLDispatcherFactory;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/launch/FirstUseV2InviteScreen;)Lcom/shopkick/app/launch/FirstUseControllerV2;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    return-object p0
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    const/4 p3, 0x0

    const v0, 0x7f0c00c2

    .line 72
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f09076e

    .line 74
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    const v0, 0x7f090709

    .line 75
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f090337

    .line 76
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/widget/SKButton;

    const v2, 0x7f0906a5

    .line 77
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/widget/SKButton;

    .line 79
    iget-object v3, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen;->titleText:Ljava/lang/String;

    if-eqz v3, :cond_0

    .line 80
    invoke-virtual {p2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 82
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen;->subtitleText:Ljava/lang/String;

    if-eqz p2, :cond_1

    .line 83
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    :cond_1
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen;->inviteButtonText:Ljava/lang/String;

    if-eqz p2, :cond_2

    .line 86
    invoke-virtual {v1, p2}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 88
    :cond_2
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen;->notNowButtonText:Ljava/lang/String;

    if-eqz p2, :cond_3

    .line 89
    new-instance v0, Landroid/text/SpannableString;

    invoke-direct {v0, p2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 90
    new-instance p2, Landroid/text/style/UnderlineSpan;

    invoke-direct {p2}, Landroid/text/style/UnderlineSpan;-><init>()V

    iget-object v3, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen;->notNowButtonText:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v0, p2, p3, v3, p3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 91
    invoke-virtual {v2, v0}, Lcom/shopkick/app/widget/SKButton;->setSpannableButtonText(Landroid/text/SpannableString;)V

    .line 94
    :cond_3
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 p3, 0x3e

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v0, 0x7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {p2, p3, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 95
    iget-object p3, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    const/4 v3, 0x0

    invoke-virtual {v1, p2, p3, v3}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 96
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen;->inviteButtonClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, p2}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 98
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 p3, 0x20

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p2, p3, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 99
    iget-object p3, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v2, p2, p3, v3}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 100
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen;->skipButtonClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v2, p2}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 2
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

    .line 37
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    .line 38
    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->userIsRegistered()Z

    move-result v0

    const-string v1, "This screen should never be displayed to a non-registered user."

    invoke-static {v0, v1}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    .line 41
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

    iput-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    .line 42
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    const-string/jumbo p1, "title_text"

    .line 44
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen;->titleText:Ljava/lang/String;

    const-string/jumbo p1, "subtitle_text"

    .line 45
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen;->subtitleText:Ljava/lang/String;

    const-string p1, "invite_button_text"

    .line 46
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen;->inviteButtonText:Ljava/lang/String;

    const-string p1, "not_now_button_text"

    .line 47
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen;->notNowButtonText:Ljava/lang/String;

    const-string p1, "contact_picker_sk_url"

    .line 50
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen;->contactPickerSkUrl:Ljava/lang/String;

    return-void
.end method

.method public onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->isInFirstUse()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 113
    sget-object v0, Lcom/shopkick/app/screens/AppScreen$BackPressedState;->PERFORM_ACTIVITY_BACK:Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    return-object v0

    .line 115
    :cond_0
    sget-object v0, Lcom/shopkick/app/screens/AppScreen$BackPressedState;->PERFORM_SCREEN_BACK:Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    return-object v0
.end method

.method public onDestroy()V
    .locals 0

    .line 107
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onResume()V
    .locals 1

    .line 55
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onResume()V

    .line 56
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->hasUserTriedToInvite()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 57
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->gotoNextScreen()Z

    :cond_0
    return-void
.end method

.method public updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 2

    .line 63
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 64
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2InviteScreen;->params:Ljava/util/Map;

    const-string v1, "flow_id"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 65
    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 66
    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setFlowId(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
