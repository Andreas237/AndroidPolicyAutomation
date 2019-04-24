.class public Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "OnlineStoreLandingOverlay.java"


# instance fields
.field private final CHAIN_LOGO_DIMENSION_DIP:I

.field private final LOGO_ROUNDED_CORNER_RADIUS_DIP:I

.field private chainLogo:Landroid/widget/ImageView;

.field private contentView:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 25
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    const/16 v0, 0x28

    .line 27
    iput v0, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->CHAIN_LOGO_DIMENSION_DIP:I

    const/16 v0, 0x14

    .line 28
    iput v0, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->LOGO_ROUNDED_CORNER_RADIUS_DIP:I

    return-void
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 5

    .line 42
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->contentView:Landroid/view/ViewGroup;

    .line 45
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->contentView:Landroid/view/ViewGroup;

    const v0, 0x7f0900e5

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->chainLogo:Landroid/widget/ImageView;

    .line 46
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->chainLogo:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 47
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainLogoUrl:Ljava/lang/String;

    invoke-static {p1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    const/16 p1, 0x28

    .line 48
    iget-object v2, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->chainLogo:Landroid/widget/ImageView;

    invoke-static {p1, v2}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result p1

    const/16 v2, 0x14

    .line 49
    iget-object v3, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->chainLogo:Landroid/widget/ImageView;

    invoke-static {v2, v3}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v2

    .line 50
    iget-object v3, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->chainLogo:Landroid/widget/ImageView;

    invoke-static {v3}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v3

    iget-object v4, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainLogoUrl:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v3

    invoke-virtual {v3, p1, p1}, Lcom/shopkick/app/util/GlideRequest;->override(II)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/bumptech/glide/load/Transformation;

    new-instance v4, Lcom/bumptech/glide/load/resource/bitmap/CenterCrop;

    invoke-direct {v4}, Lcom/bumptech/glide/load/resource/bitmap/CenterCrop;-><init>()V

    aput-object v4, v3, v1

    new-instance v4, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;

    invoke-direct {v4, v2}, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;-><init>(I)V

    aput-object v4, v3, v0

    .line 51
    invoke-virtual {p1, v3}, Lcom/shopkick/app/util/GlideRequest;->transforms([Lcom/bumptech/glide/load/Transformation;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    iget-object v2, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->chainLogo:Landroid/widget/ImageView;

    invoke-virtual {p1, v2}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    .line 52
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->chainLogo:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 54
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->chainLogo:Landroid/widget/ImageView;

    const/16 v2, 0x8

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 58
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->contentView:Landroid/view/ViewGroup;

    const v2, 0x7f0901e7

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 59
    iget-object v2, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->message:Ljava/lang/String;

    invoke-static {v2}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productName:Ljava/lang/String;

    invoke-static {v2}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->message:Ljava/lang/String;

    iget-object v3, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productName:Ljava/lang/String;

    .line 60
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 61
    iget-object v2, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->message:Ljava/lang/String;

    iget-object v3, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    .line 62
    new-instance v3, Landroid/text/SpannableStringBuilder;

    iget-object v4, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->message:Ljava/lang/String;

    invoke-direct {v3, v4}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 63
    new-instance v4, Landroid/text/style/StyleSpan;

    invoke-direct {v4, v0}, Landroid/text/style/StyleSpan;-><init>(I)V

    iget-object v0, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productName:Ljava/lang/String;

    .line 65
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v2

    .line 63
    invoke-virtual {v3, v4, v2, v0, v1}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 67
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 69
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->message:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 72
    :goto_1
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->contentView:Landroid/view/ViewGroup;

    return-object p1
.end method

.method public destroy()V
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->chainLogo:Landroid/widget/ImageView;

    invoke-static {v0, v0}, Lcom/shopkick/app/util/MyAppGlideModule;->clear(Landroid/view/View;Landroid/view/View;)V

    .line 93
    invoke-super {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;->destroy()V

    return-void
.end method

.method protected getOverlayTheme()I
    .locals 1

    const v0, 0x7f120230

    return v0
.end method

.method protected getResId()I
    .locals 1

    const v0, 0x7f0c0147

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->contentView:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 36
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 37
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    const/4 p2, 0x2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->verticalAlignType:Ljava/lang/Integer;

    return-void
.end method

.method public isCancelableOnTouchOutside()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public updateOverlayParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 1

    .line 98
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->updateOverlayParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 99
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainId:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 100
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
