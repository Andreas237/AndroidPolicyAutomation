.class public Lcom/shopkick/app/kickstarter/HowToWalkInScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "HowToWalkInScreen.java"

# interfaces
.implements Lcom/shopkick/app/store/ICountdownTimerFinished;


# instance fields
.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private countdownBonusDescriptionTextView:Landroid/widget/TextView;

.field private countdownExpandedTimerView:Landroid/view/View;

.field private countdownTimerController:Lcom/shopkick/app/store/CountdownTimerController;

.field private daysCounterView:Landroid/widget/TextView;

.field private hoursCounterView:Landroid/widget/TextView;

.field private minsCounterView:Landroid/widget/TextView;

.field private permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

.field private secsCounterView:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method private initCounterView(Landroid/view/View;)V
    .locals 7

    const v0, 0x7f0901b2

    .line 93
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->countdownExpandedTimerView:Landroid/view/View;

    const v0, 0x7f1101f0

    .line 94
    invoke-virtual {p0, v0}, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->setAppScreenTitle(I)V

    const v0, 0x7f0901cf

    .line 96
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->daysCounterView:Landroid/widget/TextView;

    const v0, 0x7f0902eb

    .line 97
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->hoursCounterView:Landroid/widget/TextView;

    const v0, 0x7f090481

    .line 98
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->minsCounterView:Landroid/widget/TextView;

    const v0, 0x7f090652

    .line 99
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->secsCounterView:Landroid/widget/TextView;

    const v0, 0x7f0901ab

    .line 100
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->countdownBonusDescriptionTextView:Landroid/widget/TextView;

    .line 102
    new-instance v0, Lcom/shopkick/app/store/CountdownTimerController;

    iget-object v3, p0, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->daysCounterView:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->hoursCounterView:Landroid/widget/TextView;

    iget-object v5, p0, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->minsCounterView:Landroid/widget/TextView;

    iget-object v6, p0, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->secsCounterView:Landroid/widget/TextView;

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/app/store/CountdownTimerController;-><init>(Lcom/shopkick/app/store/ICountdownTimerFinished;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    iput-object v0, p0, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->countdownTimerController:Lcom/shopkick/app/store/CountdownTimerController;

    const v0, 0x7f0902f1

    .line 105
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    .line 106
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const v4, 0x7f1101ef

    invoke-virtual {v1, v4, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    const v0, 0x7f0902f4

    .line 108
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    .line 109
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    new-array v3, v2, [Ljava/lang/Object;

    const/4 v6, 0x2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v3, v5

    invoke-virtual {v1, v4, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    const v0, 0x7f0902f7

    .line 111
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    .line 112
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    new-array v1, v2, [Ljava/lang/Object;

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v5

    invoke-virtual {p1, v4, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    return-void
.end method

.method private stopBonusCountdownTimer()V
    .locals 2

    .line 124
    iget-object v0, p0, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isWalkinBonusCountdownEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    invoke-virtual {p0}, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->stopTimer()V

    .line 126
    iget-object v0, p0, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->countdownExpandedTimerView:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method private updateBonusCountdownFooter()V
    .locals 5

    .line 116
    iget-object v0, p0, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isWalkinBonusCountdownEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x2ee0

    .line 117
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    add-long/2addr v2, v0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->startTimer(Ljava/lang/Long;)V

    .line 118
    iget-object v0, p0, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->countdownBonusDescriptionTextView:Landroid/widget/TextView;

    const v1, 0x7f1101f1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0xf

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 119
    iget-object v0, p0, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->countdownExpandedTimerView:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 44
    iget-object p3, p0, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {p3}, Lcom/shopkick/app/util/FeatureFlagHelper;->isWalkinBonusCountdownEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p3

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    const p3, 0x7f0c00e7

    .line 45
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 46
    invoke-direct {p0, p1}, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->initCounterView(Landroid/view/View;)V

    goto :goto_1

    :cond_0
    const p3, 0x7f11033f

    .line 49
    invoke-virtual {p0, p3}, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->setAppScreenTitle(I)V

    const p3, 0x7f0c00e6

    .line 50
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f0902f9

    .line 52
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKTextView;

    .line 53
    iget-object p3, p0, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {p3}, Lcom/shopkick/app/util/FeatureFlagHelper;->isWalkinButtonEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p3

    if-eqz p3, :cond_1

    const p3, 0x7f110343

    .line 54
    invoke-virtual {p0, p3}, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const p3, 0x7f110342

    .line 56
    invoke-virtual {p0, p3}, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    :goto_0
    const p2, 0x7f090061

    .line 59
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    const/16 p3, 0x140

    const/16 v0, 0x64

    .line 60
    invoke-static {p2, p3, v0}, Lcom/shopkick/app/util/FrameConfigurator;->setLayoutParamsWithEqualDimensionScaling(Landroid/view/View;II)V

    .line 62
    new-instance p2, Lcom/shopkick/app/permissions/PermissionsRequestController;

    iget-object p3, p0, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v0, p0, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-direct {p2, p0, p3, v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/application/ClientFlagsManager;)V

    iput-object p2, p0, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    .line 63
    iget-object p2, p0, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    const-string p3, "WALKIN_PERMISSIONS"

    const v0, 0x7f09081e

    .line 64
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 63
    invoke-virtual {p2, p3, v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->requestPermission(Ljava/lang/String;Landroid/view/View;)V

    :goto_1
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

    .line 38
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object p1, p0, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    return-void
.end method

.method public onCountdownTimerFinished()V
    .locals 2

    .line 140
    iget-object v0, p0, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->countdownExpandedTimerView:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method protected onScreenDidShow()V
    .locals 1

    .line 72
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidShow()V

    .line 73
    iget-object v0, p0, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isWalkinBonusCountdownEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 74
    invoke-direct {p0}, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->updateBonusCountdownFooter()V

    goto :goto_0

    .line 77
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    invoke-virtual {v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->showPermViewsIfDisabled()V

    :goto_0
    return-void
.end method

.method protected onScreenWillHide()V
    .locals 0

    .line 83
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenWillHide()V

    .line 86
    invoke-direct {p0}, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->stopBonusCountdownTimer()V

    return-void
.end method

.method public startTimer(Ljava/lang/Long;)V
    .locals 3

    .line 131
    iget-object v0, p0, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->countdownTimerController:Lcom/shopkick/app/store/CountdownTimerController;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/store/CountdownTimerController;->start(J)V

    return-void
.end method

.method public stopTimer()V
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;->countdownTimerController:Lcom/shopkick/app/store/CountdownTimerController;

    invoke-virtual {v0}, Lcom/shopkick/app/store/CountdownTimerController;->stop()V

    return-void
.end method
