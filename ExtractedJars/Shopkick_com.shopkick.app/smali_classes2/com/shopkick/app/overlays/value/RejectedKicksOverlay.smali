.class public Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "RejectedKicksOverlay.java"


# static fields
.field private static final DIALOG_CONTENT_FADE_IN_DURATION:I = 0x3e8


# instance fields
.field private buttonListener:Landroid/view/View$OnClickListener;

.field private cancelLisener:Landroid/view/View$OnClickListener;

.field private dispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field private mainView:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    .line 55
    new-instance v0, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay$1;-><init>(Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;)V

    iput-object v0, p0, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;->buttonListener:Landroid/view/View$OnClickListener;

    .line 71
    new-instance v0, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay$2;

    invoke-direct {v0, p0}, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay$2;-><init>(Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;)V

    iput-object v0, p0, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;->cancelLisener:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;)Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;
    .locals 0

    .line 16
    iget-object p0, p0, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;)Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;
    .locals 0

    .line 16
    iget-object p0, p0, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;)Lcom/shopkick/app/url/URLDispatcher;
    .locals 0

    .line 16
    iget-object p0, p0, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;->dispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-object p0
.end method

.method private fadeInAnimation()V
    .locals 3

    .line 66
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v1, 0x3e8

    .line 67
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 68
    new-instance v1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    return-void
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 2

    .line 31
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;->mainView:Landroid/view/View;

    .line 34
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;->mainView:Landroid/view/View;

    const v0, 0x7f0901bd

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKButton;

    .line 37
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;->mainView:Landroid/view/View;

    const v1, 0x7f09047a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;->mainView:Landroid/view/View;

    const v1, 0x7f090477

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->message:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 39
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->buttonTitle:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 42
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;->buttonListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 43
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;->mainView:Landroid/view/View;

    const v0, 0x7f0900c6

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;->cancelLisener:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 45
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;->mainView:Landroid/view/View;

    return-object p1
.end method

.method protected getResId()I
    .locals 1

    const v0, 0x7f0c017f

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;->mainView:Landroid/view/View;

    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 25
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 26
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p1}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;->dispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-void
.end method

.method public onOverlayShown(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 50
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->onOverlayShown(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 51
    invoke-direct {p0}, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;->fadeInAnimation()V

    return-void
.end method
