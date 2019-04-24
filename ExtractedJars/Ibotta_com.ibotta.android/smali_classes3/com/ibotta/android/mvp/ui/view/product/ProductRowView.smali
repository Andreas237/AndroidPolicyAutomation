.class public Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;
.super Landroid/widget/LinearLayout;
.source "ProductRowView.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/product/ProductRowView$ProductRowListener;
    }
.end annotation


# instance fields
.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivProduct:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902bc
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/product/ProductRowView$ProductRowListener;

.field private productModel:Lcom/ibotta/api/model/ProductModel;

.field protected tvName:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09054d
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 47
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 51
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 55
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 59
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 60
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->initLayout()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;)Lcom/ibotta/android/mvp/ui/view/product/ProductRowView$ProductRowListener;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->listener:Lcom/ibotta/android/mvp/ui/view/product/ProductRowView$ProductRowListener;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;)Lcom/ibotta/api/model/ProductModel;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->productModel:Lcom/ibotta/api/model/ProductModel;

    return-object p0
.end method

.method private initLayout()V
    .locals 3

    .line 68
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;)V

    const/4 v0, 0x0

    .line 70
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->setOrientation(I)V

    const/high16 v1, 0x42c80000    # 100.0f

    .line 71
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->setWeightSum(F)V

    const/4 v1, 0x1

    .line 72
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->setClickable(Z)V

    .line 73
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->setFocusable(Z)V

    .line 75
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->isInEditMode()Z

    move-result v2

    if-nez v2, :cond_0

    .line 76
    invoke-static {p0, v0}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    .line 79
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f0c0196

    invoke-virtual {v0, v2, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 80
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 82
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->initRowClickHandler()V

    return-void
.end method

.method private initName()V
    .locals 2

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->tvName:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->productModel:Lcom/ibotta/api/model/ProductModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/ProductModel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initProductImage()V
    .locals 5

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->productModel:Lcom/ibotta/api/model/ProductModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/ProductModel;->getImageUrlThumbnail()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->productModel:Lcom/ibotta/api/model/ProductModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/ProductModel;->getImageUrlThumbnail()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 112
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->productModel:Lcom/ibotta/api/model/ProductModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/ProductModel;->getImageUrlLarge()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->productModel:Lcom/ibotta/api/model/ProductModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/ProductModel;->getImageUrlLarge()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 115
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->productModel:Lcom/ibotta/api/model/ProductModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/ProductModel;->getImageUrlSmall()Ljava/lang/String;

    move-result-object v0

    .line 118
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->ivProduct:Landroid/widget/ImageView;

    sget-object v4, Lcom/ibotta/android/views/images/Sizes;->OFFER_HALF_WIDTH:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v1, v2, v0, v3, v4}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method

.method private initRowClickHandler()V
    .locals 2

    .line 97
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView$1;-><init>(Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;)V

    instance-of v1, p0, Landroid/view/View;

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-static {v1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method private onSetup()V
    .locals 0

    .line 92
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->initProductImage()V

    .line 93
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->initName()V

    return-void
.end method


# virtual methods
.method public onShopClicked()V
    .locals 2
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0900a7
        }
    .end annotation

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->listener:Lcom/ibotta/android/mvp/ui/view/product/ProductRowView$ProductRowListener;

    if-eqz v0, :cond_0

    .line 128
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->productModel:Lcom/ibotta/api/model/ProductModel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView$ProductRowListener;->onProductShopClicked(Lcom/ibotta/api/model/ProductModel;)V

    :cond_0
    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/product/ProductRowView$ProductRowListener;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->listener:Lcom/ibotta/android/mvp/ui/view/product/ProductRowView$ProductRowListener;

    return-void
.end method

.method public setup(Lcom/ibotta/api/model/ProductModel;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->productModel:Lcom/ibotta/api/model/ProductModel;

    .line 88
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->onSetup()V

    return-void
.end method
