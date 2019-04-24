.class public Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "FTUEEarnTabOverlay1.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# static fields
.field private static final DIALOG_POPUP_DELAY:I = 0x3e8

.field private static final SECOND_OVERLAY_START_DELAY:I = 0x12c0


# instance fields
.field private chainId:Ljava/lang/String;

.field private chainIsOnlineStore:Ljava/lang/String;

.field private chainName:Ljava/lang/String;

.field private ftueOverlay2:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

.field private jeanDialogLayout:Landroid/support/constraint/ConstraintLayout;

.field private locationId:Ljava/lang/String;

.field private mainView:Landroid/view/ViewGroup;

.field private popInAnimation:Landroid/view/animation/Animation;

.field private userDisplayName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->goToTheNextStep()V

    return-void
.end method

.method private goToTheNextStep()V
    .locals 3

    .line 108
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->ftueOverlay2:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-static {}, Lcom/shopkick/app/overlays/OverlayInfo;->getInstance()Lcom/shopkick/app/overlays/OverlayInfo;

    move-result-object v1

    const-class v2, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/overlays/OverlayInfo;->keyForClass(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->overlayType:Ljava/lang/String;

    .line 109
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->ftueOverlay2:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->locationId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->locationId:Ljava/lang/String;

    .line 110
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->chainName:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainName:Ljava/lang/String;

    .line 111
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->chainId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainId:Ljava/lang/String;

    .line 112
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->chainIsOnlineStore:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainIsOnlineStore:Ljava/lang/String;

    .line 113
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->ftueOverlay2:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/overlays/base/OverlaysManager;->addOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 114
    invoke-virtual {p0}, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->dismiss()V

    return-void
.end method

.method public static synthetic lambda$createView$92(Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;Landroid/view/View;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->goToTheNextStep()V

    return-void
.end method

.method public static synthetic lambda$onOverlayShown$93(Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;)V
    .locals 2

    .line 71
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->jeanDialogLayout:Landroid/support/constraint/ConstraintLayout;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->popInAnimation:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/support/constraint/ConstraintLayout;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private setupDescriptionTV(Landroid/content/Context;)Landroid/text/SpannableString;
    .locals 2

    const v0, 0x7f110307

    .line 118
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 119
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->applyTextCustomization(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Boolean;)Landroid/text/SpannableString;

    move-result-object p1

    return-object p1
.end method

.method private setupStartFTUEEarnTabOverlay2Timer()V
    .locals 5

    .line 96
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    .line 97
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 98
    new-instance v2, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1$1;

    invoke-direct {v2, p0, v1}, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1$1;-><init>(Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;Landroid/os/Handler;)V

    const-wide/16 v3, 0x12c0

    .line 104
    invoke-virtual {v0, v2, v3, v4}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    return-void
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 6

    .line 52
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/ConstraintLayout;

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->mainView:Landroid/view/ViewGroup;

    .line 54
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f090359

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/ConstraintLayout;

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->jeanDialogLayout:Landroid/support/constraint/ConstraintLayout;

    .line 56
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->jeanDialogLayout:Landroid/support/constraint/ConstraintLayout;

    const v1, 0x7f0902dc

    invoke-virtual {v0, v1}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    .line 57
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->jeanDialogLayout:Landroid/support/constraint/ConstraintLayout;

    const v2, 0x7f090358

    invoke-virtual {v1, v2}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/widget/SKTextView;

    const v2, 0x7f110308

    .line 59
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->userDisplayName:Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 60
    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 61
    invoke-direct {p0, p1}, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->setupDescriptionTV(Landroid/content/Context;)Landroid/text/SpannableString;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/CharSequence;)V

    .line 63
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->jeanDialogLayout:Landroid/support/constraint/ConstraintLayout;

    new-instance v1, Lcom/shopkick/app/ftue/-$$Lambda$FTUEEarnTabOverlay1$d-Utr2Kef3SjDdBnb2BUwzIJECg;

    invoke-direct {v1, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEEarnTabOverlay1$d-Utr2Kef3SjDdBnb2BUwzIJECg;-><init>(Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;)V

    invoke-virtual {v0, v1}, Landroid/support/constraint/ConstraintLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f010025

    .line 64
    invoke-static {p1, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->popInAnimation:Landroid/view/animation/Animation;

    .line 65
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->popInAnimation:Landroid/view/animation/Animation;

    invoke-virtual {p1, p0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 66
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->mainView:Landroid/view/ViewGroup;

    return-object p1
.end method

.method protected getOverlayTheme()I
    .locals 1

    const v0, 0x7f12022e

    return v0
.end method

.method protected getResId()I
    .locals 1

    const v0, 0x7f0c00cc

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->mainView:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 41
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 42
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccount;->getDisplayName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->userDisplayName:Ljava/lang/String;

    .line 43
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->locationId:Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->locationId:Ljava/lang/String;

    .line 44
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainName:Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->chainName:Ljava/lang/String;

    .line 45
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainId:Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->chainId:Ljava/lang/String;

    .line 46
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainIsOnlineStore:Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->chainIsOnlineStore:Ljava/lang/String;

    .line 47
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->ftueOverlay2:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    return-void
.end method

.method public isCancelable()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 129
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->jeanDialogLayout:Landroid/support/constraint/ConstraintLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/support/constraint/ConstraintLayout;->setVisibility(I)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onOverlayShown(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 2

    .line 71
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    new-instance p2, Lcom/shopkick/app/ftue/-$$Lambda$FTUEEarnTabOverlay1$6jyu1u_RoT6u3fwwRQgB2rFL4pU;

    invoke-direct {p2, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEEarnTabOverlay1$6jyu1u_RoT6u3fwwRQgB2rFL4pU;-><init>(Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;)V

    const-wide/16 v0, 0x3e8

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 72
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->setupStartFTUEEarnTabOverlay2Timer()V

    return-void
.end method
