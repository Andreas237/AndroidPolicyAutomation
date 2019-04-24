.class public Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;
.super Landroid/widget/LinearLayout;
.source "ScanProductView.java"


# instance fields
.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivCheck:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09029d
    .end annotation
.end field

.field protected ivProductImage:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902bd
    .end annotation
.end field

.field private productImageUrl:Ljava/lang/String;

.field private productName:Ljava/lang/String;

.field protected tvProductName:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09055e
    .end annotation
.end field

.field private verified:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 38
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 42
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 46
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 50
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 51
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 63
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;)V

    const/4 v0, 0x1

    .line 65
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;->setOrientation(I)V

    .line 67
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c01bf

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 68
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private onSetup()V
    .locals 5

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;->ivCheck:Landroid/widget/ImageView;

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;->verified:Z

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 74
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;->ivProductImage:Landroid/widget/ImageView;

    const v1, 0x7f0800ab

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 77
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;->productImageUrl:Ljava/lang/String;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;->ivProductImage:Landroid/widget/ImageView;

    sget-object v4, Lcom/ibotta/android/views/images/Sizes;->PRODUCT_SMALL:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    .line 80
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;->tvProductName:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;->productName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public setup(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;->productName:Ljava/lang/String;

    .line 56
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;->productImageUrl:Ljava/lang/String;

    .line 57
    iput-boolean p3, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;->verified:Z

    .line 59
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;->onSetup()V

    return-void
.end method
