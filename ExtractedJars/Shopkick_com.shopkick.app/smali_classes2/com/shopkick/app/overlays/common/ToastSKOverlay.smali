.class public Lcom/shopkick/app/overlays/common/ToastSKOverlay;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "ToastSKOverlay.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private mainView:Landroid/widget/RelativeLayout;

.field private overlayActionConfigurator:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;

.field private toastSpec:Lcom/shopkick/app/overlays/common/ToastOverlaySpec;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/ToastSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    return-void
.end method

.method private adaptView(Lcom/shopkick/app/overlays/common/ToastOverlaySpec;Landroid/widget/RelativeLayout;)V
    .locals 2

    .line 75
    iget v0, p1, Lcom/shopkick/app/overlays/common/ToastOverlaySpec;->width:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p1, Lcom/shopkick/app/overlays/common/ToastOverlaySpec;->height:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0, p2, v0, v1}, Lcom/shopkick/app/overlays/common/ToastSKOverlay;->setToastSize(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 76
    iget-object v0, p1, Lcom/shopkick/app/overlays/common/ToastOverlaySpec;->toastIconResource:Ljava/lang/String;

    invoke-direct {p0, p2, v0}, Lcom/shopkick/app/overlays/common/ToastSKOverlay;->setToastIcon(Landroid/view/View;Ljava/lang/String;)V

    .line 77
    iget-object v0, p1, Lcom/shopkick/app/overlays/common/ToastOverlaySpec;->toastTitle:Ljava/lang/String;

    invoke-direct {p0, p2, v0}, Lcom/shopkick/app/overlays/common/ToastSKOverlay;->setToastTitle(Landroid/view/View;Ljava/lang/String;)V

    .line 78
    iget-object v0, p1, Lcom/shopkick/app/overlays/common/ToastOverlaySpec;->toastMessage:Ljava/lang/String;

    invoke-direct {p0, p2, v0}, Lcom/shopkick/app/overlays/common/ToastSKOverlay;->setToastMessage(Landroid/view/View;Ljava/lang/String;)V

    .line 79
    iget-object v0, p1, Lcom/shopkick/app/overlays/common/ToastOverlaySpec;->toastButtonLabel:Ljava/lang/String;

    iget-object p1, p1, Lcom/shopkick/app/overlays/common/ToastOverlaySpec;->toastButtonAction:Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;

    invoke-direct {p0, p2, v0, p1}, Lcom/shopkick/app/overlays/common/ToastSKOverlay;->setToastButtonLabel(Landroid/view/View;Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;)V

    return-void
.end method

.method private setToastButtonLabel(Landroid/view/View;Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;)V
    .locals 1

    if-nez p2, :cond_0

    return-void

    :cond_0
    const v0, 0x7f0904f7

    .line 122
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKButton;

    .line 123
    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 124
    iget-object p2, p0, Lcom/shopkick/app/overlays/common/ToastSKOverlay;->overlayActionConfigurator:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;

    invoke-virtual {p2, p0, p3, p1}, Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;->setActionForButton(Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;Landroid/view/View;)V

    const/4 p2, 0x0

    .line 125
    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    return-void
.end method

.method private setToastIcon(Landroid/view/View;Ljava/lang/String;)V
    .locals 1

    if-nez p2, :cond_0

    return-void

    :cond_0
    const v0, 0x7f0904f8

    .line 95
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    .line 96
    invoke-virtual {p0, p2}, Lcom/shopkick/app/overlays/common/ToastSKOverlay;->getImageResource(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    const/4 p2, 0x0

    .line 97
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method private setToastMessage(Landroid/view/View;Ljava/lang/String;)V
    .locals 1

    if-nez p2, :cond_0

    return-void

    :cond_0
    const v0, 0x7f0904f9

    .line 113
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 114
    invoke-static {p2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p2, 0x0

    .line 115
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method private setToastSize(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0

    if-eqz p2, :cond_0

    .line 84
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lcom/shopkick/app/util/FrameConfigurator;->setWidth(Landroid/view/View;I)V

    :cond_0
    if-eqz p3, :cond_1

    .line 87
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lcom/shopkick/app/util/FrameConfigurator;->setHeight(Landroid/view/View;I)V

    :cond_1
    return-void
.end method

.method private setToastTitle(Landroid/view/View;Ljava/lang/String;)V
    .locals 1

    if-nez p2, :cond_0

    return-void

    :cond_0
    const v0, 0x7f0904fa

    .line 104
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 105
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p2, 0x0

    .line 106
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 1

    .line 42
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/shopkick/app/overlays/common/ToastSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    .line 44
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/ToastSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    check-cast p1, Lcom/shopkick/app/overlays/common/ToastOverlaySpec;

    iput-object p1, p0, Lcom/shopkick/app/overlays/common/ToastSKOverlay;->toastSpec:Lcom/shopkick/app/overlays/common/ToastOverlaySpec;

    .line 46
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/ToastSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 47
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/ToastSKOverlay;->toastSpec:Lcom/shopkick/app/overlays/common/ToastOverlaySpec;

    iget-object v0, p0, Lcom/shopkick/app/overlays/common/ToastSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/overlays/common/ToastSKOverlay;->adaptView(Lcom/shopkick/app/overlays/common/ToastOverlaySpec;Landroid/widget/RelativeLayout;)V

    .line 49
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/ToastSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    return-object p1
.end method

.method public destroy()V
    .locals 1

    const/4 v0, 0x0

    .line 28
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/ToastSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    .line 29
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/ToastSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    .line 31
    invoke-super {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;->destroy()V

    return-void
.end method

.method protected getResId()I
    .locals 1

    const v0, 0x7f0c014b

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/ToastSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 36
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 37
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->overlayActionConfigurator:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;

    iput-object p1, p0, Lcom/shopkick/app/overlays/common/ToastSKOverlay;->overlayActionConfigurator:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;

    return-void
.end method

.method public isCancelableOnTouchOutside()Z
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/ToastSKOverlay;->toastSpec:Lcom/shopkick/app/overlays/common/ToastOverlaySpec;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Lcom/shopkick/app/overlays/common/ToastOverlaySpec;->isCancelableOnTouchOutside:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 130
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/common/ToastSKOverlay;->dismiss()V

    return-void
.end method

.method public onOverlayUpdated(Landroid/content/Context;)V
    .locals 1

    .line 64
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->onOverlayUpdated(Landroid/content/Context;)V

    .line 65
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/ToastSKOverlay;->toastSpec:Lcom/shopkick/app/overlays/common/ToastOverlaySpec;

    iget-object v0, p0, Lcom/shopkick/app/overlays/common/ToastSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/overlays/common/ToastSKOverlay;->adaptView(Lcom/shopkick/app/overlays/common/ToastOverlaySpec;Landroid/widget/RelativeLayout;)V

    return-void
.end method
