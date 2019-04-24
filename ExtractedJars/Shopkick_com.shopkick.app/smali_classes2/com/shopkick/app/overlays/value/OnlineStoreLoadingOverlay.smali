.class public Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "OnlineStoreLoadingOverlay.java"


# instance fields
.field private final CHAIN_LOGO_DIMENSION_DIP:I

.field private final LOGO_ROUNDED_CORNER_RADIUS:I

.field chainLogo:Landroid/widget/ImageView;

.field private contentView:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    const/16 v0, 0x90

    .line 31
    iput v0, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->CHAIN_LOGO_DIMENSION_DIP:I

    const/16 v0, 0x48

    .line 32
    iput v0, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->LOGO_ROUNDED_CORNER_RADIUS:I

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;)Landroid/view/ViewGroup;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->contentView:Landroid/view/ViewGroup;

    return-object p0
.end method

.method private trySetChainLogo(Ljava/lang/String;)V
    .locals 5

    .line 136
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->chainLogo:Landroid/widget/ImageView;

    const/16 v1, 0x48

    invoke-static {v1, v0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v0

    .line 137
    iget-object v1, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->chainLogo:Landroid/widget/ImageView;

    const/16 v2, 0x90

    invoke-static {v2, v1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v1

    .line 138
    new-instance v2, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay$1;

    invoke-direct {v2, p0}, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay$1;-><init>(Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;)V

    .line 149
    iget-object v3, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->contextRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    invoke-static {v3}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/content/Context;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v3

    .line 150
    invoke-virtual {v3, p1}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    .line 151
    invoke-virtual {p1, v1, v1}, Lcom/shopkick/app/util/GlideRequest;->override(II)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/bumptech/glide/load/Transformation;

    new-instance v3, Lcom/bumptech/glide/load/resource/bitmap/CenterCrop;

    invoke-direct {v3}, Lcom/bumptech/glide/load/resource/bitmap/CenterCrop;-><init>()V

    const/4 v4, 0x0

    aput-object v3, v1, v4

    new-instance v3, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;

    invoke-direct {v3, v0}, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;-><init>(I)V

    const/4 v0, 0x1

    aput-object v3, v1, v0

    .line 152
    invoke-virtual {p1, v1}, Lcom/shopkick/app/util/GlideRequest;->transforms([Lcom/bumptech/glide/load/Transformation;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    .line 153
    invoke-virtual {p1, v2}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->chainLogo:Landroid/widget/ImageView;

    .line 154
    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 3

    .line 45
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->contentView:Landroid/view/ViewGroup;

    .line 46
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->contentView:Landroid/view/ViewGroup;

    const v0, 0x7f0900e5

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->chainLogo:Landroid/widget/ImageView;

    .line 49
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->backgroundColor:Ljava/lang/String;

    invoke-static {p1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 50
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->contentView:Landroid/view/ViewGroup;

    iget-object v0, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->backgroundColor:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/SKColor;->parseString(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    .line 54
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->mainImageUrl:Ljava/lang/String;

    invoke-static {p1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p1

    const/16 v0, 0x8

    const/4 v1, 0x0

    if-nez p1, :cond_1

    .line 55
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->mainImageUrl:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->trySetChainLogo(Ljava/lang/String;)V

    .line 56
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->chainLogo:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 57
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainLogoUrl:Ljava/lang/String;

    invoke-static {p1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 58
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainLogoUrl:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->trySetChainLogo(Ljava/lang/String;)V

    .line 59
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->chainLogo:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 61
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->chainLogo:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 62
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->contentView:Landroid/view/ViewGroup;

    const v2, 0x7f090306

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 66
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->contentView:Landroid/view/ViewGroup;

    const v2, 0x7f0901e6

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 67
    iget-object v2, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->message:Ljava/lang/String;

    invoke-static {v2}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 68
    iget-object v2, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->message:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 70
    :cond_3
    iget-object v2, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->subtitle:Ljava/lang/String;

    invoke-static {v2}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 71
    iget-object v2, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->subtitle:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 72
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 74
    :cond_4
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 78
    :goto_1
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->contentView:Landroid/view/ViewGroup;

    const v2, 0x7f0906fc

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 79
    iget-object v2, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardExtraMessage:Ljava/lang/String;

    invoke-static {v2}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_5

    .line 80
    iget-object v2, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardExtraMessage:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 83
    :cond_5
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 87
    :goto_2
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->contentView:Landroid/view/ViewGroup;

    const v2, 0x7f0901ed

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 88
    iget-object v2, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->title:Ljava/lang/String;

    invoke-static {v2}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 89
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->title:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_3

    .line 92
    :cond_6
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 95
    :goto_3
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->contentView:Landroid/view/ViewGroup;

    return-object p1
.end method

.method public destroy()V
    .locals 2

    .line 115
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->contextRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 117
    iget-object v1, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->chainLogo:Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lcom/shopkick/app/util/MyAppGlideModule;->clear(Landroid/content/Context;Landroid/view/View;)V

    .line 119
    :cond_0
    invoke-super {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;->destroy()V

    return-void
.end method

.method protected getOverlayTheme()I
    .locals 1

    const v0, 0x7f12022e

    return v0
.end method

.method protected getResId()I
    .locals 1

    const v0, 0x7f0c0148

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->contentView:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 40
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    return-void
.end method

.method public updateOverlayParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 1

    .line 124
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->updateOverlayParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 125
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    if-eqz v0, :cond_1

    .line 126
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainId:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 127
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 129
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyId:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 130
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    :cond_1
    return-void
.end method
