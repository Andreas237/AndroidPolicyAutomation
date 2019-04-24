.class public Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "FirstUseV2RewardsEducationScreen.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen$ClickListeners;
    }
.end annotation


# instance fields
.field private buttonUrl:Ljava/lang/String;

.field private firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private progressDialog:Landroid/app/ProgressDialog;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->handleNextButtonTap()V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->startOnlineFirstUseIfReady()V

    return-void
.end method

.method private handleNextButtonTap()V
    .locals 3

    .line 89
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x1d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 90
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 91
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->startOnlineFirstUseIfReady()V

    return-void
.end method

.method private showErrorAlert(Ljava/lang/String;)V
    .locals 3

    .line 137
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f1102ea

    .line 138
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 139
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const/4 v1, 0x0

    .line 140
    invoke-virtual {p1, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    new-instance v1, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen$2;

    invoke-direct {v1, p0}, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen$2;-><init>(Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;)V

    const v2, 0x1040013

    .line 141
    invoke-virtual {p1, v2, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    new-instance v1, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen$1;

    invoke-direct {v1, p0}, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen$1;-><init>(Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;)V

    const v2, 0x1040009

    .line 147
    invoke-virtual {p1, v2, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 152
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    .line 153
    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method private startOnlineFirstUseIfReady()V
    .locals 5

    .line 99
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    iget-boolean v0, v0, Lcom/shopkick/app/launch/FirstUseControllerV2;->isReady:Z

    if-eqz v0, :cond_1

    .line 100
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->buttonUrl:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 101
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->gotoNextScreen()Z

    goto :goto_0

    .line 103
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {v0}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object v0

    .line 104
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->buttonUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    goto :goto_0

    .line 108
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->progressDialog:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_3

    .line 109
    :cond_2
    invoke-virtual {p0}, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, ""

    const v2, 0x7f11019e

    .line 111
    invoke-virtual {p0, v2}, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 109
    invoke-static {v0, v1, v2, v3, v4}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->progressDialog:Landroid/app/ProgressDialog;

    .line 115
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "CreateGuestRequestFailure"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 116
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "firstUseControllerFetchFailed"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 117
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "firstUseControllerReady"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 118
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->prepareForOnlineFlow()V

    :goto_0
    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0c00c4

    const/4 v0, 0x0

    .line 61
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f0904a8

    .line 62
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    .line 63
    new-instance p3, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen$ClickListeners;

    invoke-direct {p3, p0}, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen$ClickListeners;-><init>(Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;)V

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

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

    iput-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    .line 40
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p1, "button_url"

    .line 41
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->buttonUrl:Ljava/lang/String;

    return-void
.end method

.method public onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;
    .locals 1

    .line 162
    sget-object v0, Lcom/shopkick/app/screens/AppScreen$BackPressedState;->PERFORM_ACTIVITY_BACK:Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    return-object v0
.end method

.method public onDestroy()V
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 56
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 1
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

    .line 124
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    const-string v0, "CreateGuestRequestFailure"

    .line 125
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "firstUseControllerFetchFailed"

    .line 126
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "firstUseControllerReady"

    .line 130
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 131
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->progressDialog:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V

    .line 132
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {p1}, Lcom/shopkick/app/launch/FirstUseControllerV2;->gotoNextScreen()Z

    goto :goto_1

    .line 128
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->progressDialog:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V

    const-string p1, "ErrorMsg"

    .line 129
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->showErrorAlert(Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 2

    .line 46
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 47
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2RewardsEducationScreen;->params:Ljava/util/Map;

    const-string v1, "flow_id"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 48
    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 49
    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setFlowId(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
