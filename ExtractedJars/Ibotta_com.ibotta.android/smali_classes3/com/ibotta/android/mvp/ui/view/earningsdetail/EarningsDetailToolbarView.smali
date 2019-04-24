.class public Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarView;
.super Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailToolbarView;
.source "EarningsDetailToolbarView.java"


# instance fields
.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivLogo:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902b4
    .end annotation
.end field

.field protected tvRetailerName:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09056a
    .end annotation
.end field

.field protected tvShoppingTripId:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090575
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 31
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 35
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 39
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 44
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailToolbarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 45
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarView;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 49
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarView;)V

    .line 51
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c01e2

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 52
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private initLogo(Ljava/lang/String;)V
    .locals 4

    .line 63
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 64
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarView;->ivLogo:Landroid/widget/ImageView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void

    .line 68
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarView;->ivLogo:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarView;->ivLogo:Landroid/widget/ImageView;

    sget-object v3, Lcom/ibotta/android/views/images/Sizes;->RETAILER_LOGO:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, v1, p1, v2, v3}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method

.method private initRetailerName(Ljava/lang/String;)V
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarView;->tvRetailerName:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initShoppingTripId(Ljava/lang/String;)V
    .locals 4

    .line 77
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 79
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarView;->tvShoppingTripId:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 81
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1105d6

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarView;->tvShoppingTripId:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarView;->tvShoppingTripId:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public setup(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;)V
    .locals 1

    .line 57
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;->getRetailerLogoUrl()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarView;->initLogo(Ljava/lang/String;)V

    .line 58
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;->getRetailerName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarView;->initRetailerName(Ljava/lang/String;)V

    .line 59
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;->getShoppingTripId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarView;->initShoppingTripId(Ljava/lang/String;)V

    return-void
.end method
