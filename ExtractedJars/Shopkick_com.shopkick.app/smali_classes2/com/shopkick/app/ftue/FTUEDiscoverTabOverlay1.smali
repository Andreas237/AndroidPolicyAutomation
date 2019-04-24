.class public Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay1;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "FTUEDiscoverTabOverlay1.java"


# static fields
.field private static final ANIMATION_DELAY:I = 0x320

.field public static final START_DELAY:I = 0x64


# instance fields
.field private appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field private clickListener:Landroid/view/View$OnClickListener;

.field private jeanContainer:Landroid/support/constraint/ConstraintLayout;

.field private mainView:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    return-void
.end method

.method public static synthetic lambda$init$83(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay1;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Landroid/view/View;)V
    .locals 1

    .line 33
    iget-object p2, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay1;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lcom/shopkick/app/application/AppPreferences;->setFtueDiscoveryLessonStarted(Z)V

    .line 34
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->tapToDismiss:Ljava/lang/Boolean;

    .line 35
    invoke-virtual {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay1;->dismiss()V

    return-void
.end method

.method public static synthetic lambda$onOverlayShown$84(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay1;)V
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay1;->jeanContainer:Landroid/support/constraint/ConstraintLayout;

    invoke-static {v0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->slideInViewEnterAnimation(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 1

    .line 41
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay1;->mainView:Landroid/view/ViewGroup;

    .line 42
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay1;->mainView:Landroid/view/ViewGroup;

    const v0, 0x7f090357

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/support/constraint/ConstraintLayout;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay1;->jeanContainer:Landroid/support/constraint/ConstraintLayout;

    .line 43
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay1;->mainView:Landroid/view/ViewGroup;

    const v0, 0x7f09035d

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/RoundImageView;

    .line 44
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay1;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/RoundImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 45
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay1;->mainView:Landroid/view/ViewGroup;

    const v0, 0x7f09021c

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 46
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay1;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 47
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay1;->mainView:Landroid/view/ViewGroup;

    return-object p1
.end method

.method protected getResId()I
    .locals 1

    const v0, 0x7f0c00ca

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay1;->mainView:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 30
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 31
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay1;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 32
    new-instance p1, Lcom/shopkick/app/ftue/-$$Lambda$FTUEDiscoverTabOverlay1$9zrTG4ohMWy4Hk0PdFHfeuE504E;

    invoke-direct {p1, p0, p2}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEDiscoverTabOverlay1$9zrTG4ohMWy4Hk0PdFHfeuE504E;-><init>(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay1;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay1;->clickListener:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public onOverlayShown(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 4

    .line 52
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 53
    new-instance v1, Lcom/shopkick/app/ftue/-$$Lambda$FTUEDiscoverTabOverlay1$zsfjDcSTPd-d5vjJk3P9mtrQMgI;

    invoke-direct {v1, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEDiscoverTabOverlay1$zsfjDcSTPd-d5vjJk3P9mtrQMgI;-><init>(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay1;)V

    const-wide/16 v2, 0x320

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 54
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->onOverlayShown(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    return-void
.end method
