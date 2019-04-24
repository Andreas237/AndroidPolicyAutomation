.class public Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;
.super Landroid/widget/LinearLayout;
.source "RetailerCardView.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView$RetailerCardListener;
    }
.end annotation


# instance fields
.field private favorited:Z

.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivFavorite:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902a6
    .end annotation
.end field

.field protected ivRetailerLogo:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902c2
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView$RetailerCardListener;

.field private rebateCount:I

.field private retailerModel:Lcom/ibotta/api/model/RetailerModel;

.field protected rsvRetailerSummary:Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerSummaryView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903d5
    .end annotation
.end field

.field protected tvName:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09054d
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 48
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 52
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 56
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 60
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 61
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->initLayout()V

    return-void
.end method

.method private initFavorite()V
    .locals 2

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->ivFavorite:Landroid/widget/ImageView;

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->favorited:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 77
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;)V

    const/4 v0, 0x1

    .line 79
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->setOrientation(I)V

    .line 80
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->setClickable(Z)V

    const/4 v1, 0x0

    .line 81
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->setFocusable(Z)V

    .line 83
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->isInEditMode()Z

    move-result v2

    if-nez v2, :cond_0

    .line 84
    invoke-static {p0, v1}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableForegroundRipple(Landroid/view/View;Z)V

    .line 87
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c01b4

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 88
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 90
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/-$$Lambda$RetailerCardView$1M3BgqFRkkGv94WjwehnsZOtIV8;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/-$$Lambda$RetailerCardView$1M3BgqFRkkGv94WjwehnsZOtIV8;-><init>(Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;)V

    instance-of v1, p0, Landroid/view/View;

    if-nez v1, :cond_1

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_1
    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-static {v1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method private initName()V
    .locals 2

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->tvName:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initRebatecount()V
    .locals 2

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->rsvRetailerSummary:Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerSummaryView;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->rebateCount:I

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerSummaryView;->setRebateCount(I)V

    return-void
.end method

.method private initRetailerLogo()V
    .locals 5

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v2}, Lcom/ibotta/api/model/RetailerModel;->getLargeIconUrl()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->ivRetailerLogo:Landroid/widget/ImageView;

    sget-object v4, Lcom/ibotta/android/views/images/Sizes;->RETAILER_CARD:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method

.method public static synthetic lambda$initLayout$0(Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;Landroid/view/View;)V
    .locals 1

    .line 91
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->listener:Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView$RetailerCardListener;

    if-eqz p1, :cond_0

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView$RetailerCardListener;->onRetailerCardClicked(Lcom/ibotta/api/model/RetailerModel;)V

    :cond_0
    return-void
.end method

.method private onSetup()V
    .locals 0

    .line 98
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->initRetailerLogo()V

    .line 99
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->initFavorite()V

    .line 100
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->initName()V

    .line 101
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->initRebatecount()V

    return-void
.end method


# virtual methods
.method public setListener(Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView$RetailerCardListener;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->listener:Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView$RetailerCardListener;

    return-void
.end method

.method public setup(Lcom/ibotta/api/model/RetailerModel;IZ)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    .line 70
    iput p2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->rebateCount:I

    .line 71
    iput-boolean p3, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->favorited:Z

    .line 73
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->onSetup()V

    return-void
.end method
