.class public Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;
.super Landroid/widget/FrameLayout;
.source "ProductImageCardView.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field protected icvImageCard:Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090241
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardListener;

.field private productModel:Lcom/ibotta/api/model/ProductModel;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 30
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 35
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 40
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;->initLayout()V

    return-void
.end method

.method private initClickListener()V
    .locals 2

    .line 68
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/product/-$$Lambda$ProductImageCardView$2f5T0OMbkFpPpeQmUVu1f4S6Nws;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/view/product/-$$Lambda$ProductImageCardView$2f5T0OMbkFpPpeQmUVu1f4S6Nws;-><init>(Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;)V

    instance-of v1, p0, Landroid/view/View;

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-static {v1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method private initProductImage()V
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;->productModel:Lcom/ibotta/api/model/ProductModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/ProductModel;->getImageUrlLarge()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;->productModel:Lcom/ibotta/api/model/ProductModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/ProductModel;->getImageUrlLarge()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 94
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;->productModel:Lcom/ibotta/api/model/ProductModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/ProductModel;->getImageUrlSmall()Ljava/lang/String;

    move-result-object v0

    .line 97
    :goto_0
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;->initProductImage(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic lambda$initClickListener$0(Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;Landroid/view/View;)V
    .locals 1

    .line 69
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;->listener:Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardListener;

    if-eqz p1, :cond_0

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;->productModel:Lcom/ibotta/api/model/ProductModel;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardListener;->onProductImageClicked(Lcom/ibotta/api/model/ProductModel;)V

    :cond_0
    return-void
.end method

.method private onDataSet()V
    .locals 0

    .line 53
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;->initProductImagePadding()V

    .line 54
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;->initProductImage()V

    .line 55
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;->initClickListener()V

    return-void
.end method


# virtual methods
.method protected initLayout()V
    .locals 3

    const/4 v0, 0x1

    .line 59
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;->setClickable(Z)V

    const/4 v1, 0x0

    .line 60
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;->setFocusable(Z)V

    .line 62
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c0194

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 63
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method protected initProductImage(Ljava/lang/String;)V
    .locals 2

    .line 82
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 85
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;->icvImageCard:Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;

    sget-object v1, Lcom/ibotta/android/views/images/Sizes;->OFFER_HALF_WIDTH:Lcom/ibotta/android/views/images/Sizes;

    invoke-virtual {v0, p1, v1}, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;->setup(Ljava/lang/String;Lcom/ibotta/android/images/ImageCache$Size;)V

    return-void
.end method

.method protected initProductImagePadding()V
    .locals 3

    .line 76
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f070170

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 77
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07019c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 78
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;->icvImageCard:Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;

    invoke-virtual {v2, v1, v0, v1, v0}, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;->setPadding(IIII)V

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardListener;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;->listener:Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardListener;

    return-void
.end method

.method public setProduct(Lcom/ibotta/api/model/ProductModel;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;->productModel:Lcom/ibotta/api/model/ProductModel;

    .line 49
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;->onDataSet()V

    return-void
.end method
