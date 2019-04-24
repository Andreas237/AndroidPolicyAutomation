.class public Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;
.super Landroid/widget/FrameLayout;
.source "ImageCardView.java"


# instance fields
.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private imageUrl:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field pfivImage:Lcom/ibotta/android/commons/view/PerfectFitImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09039b
    .end annotation
.end field

.field private size:Lcom/ibotta/android/images/ImageCache$Size;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 35
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 39
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 43
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 44
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 55
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;)V

    .line 57
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    .line 58
    sget-object v0, Lcom/ibotta/android/views/images/Sizes;->OFFER_HALF_WIDTH:Lcom/ibotta/android/views/images/Sizes;

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;->size:Lcom/ibotta/android/images/ImageCache$Size;

    .line 61
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    const v1, 0x7f0c0168

    const/4 v2, 0x1

    .line 62
    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 64
    invoke-static {p0, p0}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    .line 66
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0701bb

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 67
    invoke-virtual {p0, v0, v0, v0, v0}, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;->setPadding(IIII)V

    const v0, 0x7f0801ea

    .line 69
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;->setBackgroundResource(I)V

    return-void
.end method

.method private initUI()V
    .locals 5

    .line 73
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;->pfivImage:Lcom/ibotta/android/commons/view/PerfectFitImageView;

    const v1, 0x7f0800aa

    invoke-virtual {v0, v1}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->setImageResource(I)V

    return-void

    .line 78
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;->imageUrl:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;->size:Lcom/ibotta/android/images/ImageCache$Size;

    if-nez v0, :cond_1

    goto :goto_0

    .line 82
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;->imageUrl:Ljava/lang/String;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;->pfivImage:Lcom/ibotta/android/commons/view/PerfectFitImageView;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;->size:Lcom/ibotta/android/images/ImageCache$Size;

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public setup(Ljava/lang/String;Lcom/ibotta/android/images/ImageCache$Size;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;->imageUrl:Ljava/lang/String;

    .line 49
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;->size:Lcom/ibotta/android/images/ImageCache$Size;

    .line 51
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;->initUI()V

    return-void
.end method
