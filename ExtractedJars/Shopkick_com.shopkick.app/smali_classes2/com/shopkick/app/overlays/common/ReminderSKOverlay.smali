.class public Lcom/shopkick/app/overlays/common/ReminderSKOverlay;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "ReminderSKOverlay.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/overlays/common/ReminderSKOverlay$BlackBallOnClickListener;
    }
.end annotation


# instance fields
.field private blackBall:Landroid/widget/RelativeLayout;

.field private blackBallMessage:Landroid/widget/TextView;

.field private mainView:Landroid/widget/RelativeLayout;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/ReminderSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    .line 18
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/ReminderSKOverlay;->blackBall:Landroid/widget/RelativeLayout;

    .line 19
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/ReminderSKOverlay;->blackBallMessage:Landroid/widget/TextView;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/overlays/common/ReminderSKOverlay;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/ReminderSKOverlay;->onBlackBallClicked()V

    return-void
.end method

.method private onBlackBallClicked()V
    .locals 0

    .line 82
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/common/ReminderSKOverlay;->dismiss()V

    return-void
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 1

    .line 39
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/shopkick/app/overlays/common/ReminderSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    .line 40
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/ReminderSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->backgroundColor:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 41
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/ReminderSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    iget-object v0, p0, Lcom/shopkick/app/overlays/common/ReminderSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->backgroundColor:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/SKColor;->parseString(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 43
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/ReminderSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    const v0, 0x7f090460

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    const v0, 0x7f090273

    .line 44
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/ReminderSKOverlay;->blackBall:Landroid/widget/RelativeLayout;

    const v0, 0x7f090274

    .line 45
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/shopkick/app/overlays/common/ReminderSKOverlay;->blackBallMessage:Landroid/widget/TextView;

    .line 46
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/ReminderSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    return-object p1
.end method

.method public destroy()V
    .locals 2

    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/ReminderSKOverlay;->blackBallMessage:Landroid/widget/TextView;

    .line 24
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/ReminderSKOverlay;->blackBall:Landroid/widget/RelativeLayout;

    if-eqz v1, :cond_0

    .line 25
    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 26
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/ReminderSKOverlay;->blackBall:Landroid/widget/RelativeLayout;

    .line 29
    :cond_0
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/ReminderSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    .line 31
    invoke-super {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;->destroy()V

    return-void
.end method

.method protected getResId()I
    .locals 1

    const v0, 0x7f0c0026

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/ReminderSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public onOverlayDismissed(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 2

    .line 77
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/ReminderSKOverlay;->blackBall:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 78
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->onOverlayDismissed(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    return-void
.end method

.method public onOverlayShown(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 1

    .line 67
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->onOverlayShown(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 68
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/ReminderSKOverlay;->blackBall:Landroid/widget/RelativeLayout;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 69
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/ReminderSKOverlay;->blackBall:Landroid/widget/RelativeLayout;

    new-instance v0, Lcom/shopkick/app/overlays/common/ReminderSKOverlay$BlackBallOnClickListener;

    invoke-direct {v0, p0}, Lcom/shopkick/app/overlays/common/ReminderSKOverlay$BlackBallOnClickListener;-><init>(Lcom/shopkick/app/overlays/common/ReminderSKOverlay;)V

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 71
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/ReminderSKOverlay;->blackBallMessage:Landroid/widget/TextView;

    const v0, 0x7f11075b

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 72
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/ReminderSKOverlay;->blackBallMessage:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method
