.class public Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;
.super Landroid/widget/LinearLayout;
.source "MoreStoresRetailerRowView.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView$MoreStoresRetailerRowListener;
    }
.end annotation


# instance fields
.field private addedCount:I

.field private category:Lcom/ibotta/api/model/retailer/Category;

.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivIcon:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902ac
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView$MoreStoresRetailerRowListener;

.field private retailerModel:Lcom/ibotta/api/model/RetailerModel;

.field protected tvAddedCount:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0904ea
    .end annotation
.end field

.field protected tvName:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09054d
    .end annotation
.end field

.field protected tvShortDescription:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090576
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 50
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 54
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 58
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 62
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 63
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->initLayout()V

    return-void
.end method

.method private initAddedCount()V
    .locals 5

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->tvAddedCount:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->addedCount:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const v3, 0x7f110415

    invoke-virtual {v1, v3, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initIconImage()V
    .locals 5

    .line 105
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 109
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v2}, Lcom/ibotta/api/model/RetailerModel;->getIconUrl()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->ivIcon:Landroid/widget/ImageView;

    sget-object v4, Lcom/ibotta/android/views/images/Sizes;->RETAILER_LOGO:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 79
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;)V

    const/4 v0, 0x0

    .line 81
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->setOrientation(I)V

    const/high16 v1, 0x42c80000    # 100.0f

    .line 82
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->setWeightSum(F)V

    const/4 v1, 0x1

    .line 83
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->setClickable(Z)V

    .line 84
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->setFocusable(Z)V

    .line 86
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->isInEditMode()Z

    move-result v2

    if-nez v2, :cond_0

    .line 87
    invoke-static {p0, v0}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    .line 90
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f0c017a

    invoke-virtual {v0, v2, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 91
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 93
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/-$$Lambda$MoreStoresRetailerRowView$5Vk2RvxseF9Abx5LKXivfvb90oM;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/-$$Lambda$MoreStoresRetailerRowView$5Vk2RvxseF9Abx5LKXivfvb90oM;-><init>(Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;)V

    instance-of v1, p0, Landroid/view/View;

    if-nez v1, :cond_1

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

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

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->tvName:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initShortDescription()V
    .locals 3

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->category:Lcom/ibotta/api/model/retailer/Category;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getShortDescription()Ljava/lang/String;

    move-result-object v0

    .line 119
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 120
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->tvShortDescription:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 121
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->tvShortDescription:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 123
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->tvShortDescription:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 126
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->tvShortDescription:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->tvShortDescription:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->category:Lcom/ibotta/api/model/retailer/Category;

    invoke-virtual {v1}, Lcom/ibotta/api/model/retailer/Category;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method public static synthetic lambda$initLayout$0(Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;Landroid/view/View;)V
    .locals 0

    .line 93
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->onRetailerRowClicked()V

    return-void
.end method

.method private onRetailerRowClicked()V
    .locals 2

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->listener:Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView$MoreStoresRetailerRowListener;

    if-eqz v0, :cond_0

    .line 137
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView$MoreStoresRetailerRowListener;->onRetailerRowClicked(Lcom/ibotta/api/model/RetailerModel;)V

    :cond_0
    return-void
.end method

.method private onSetup()V
    .locals 0

    .line 97
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->initIconImage()V

    .line 98
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->initName()V

    .line 99
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->initShortDescription()V

    .line 100
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->initAddedCount()V

    .line 101
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->initShortDescription()V

    return-void
.end method


# virtual methods
.method public setListener(Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView$MoreStoresRetailerRowListener;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->listener:Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView$MoreStoresRetailerRowListener;

    return-void
.end method

.method public setup(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/retailer/Category;I)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    .line 72
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->category:Lcom/ibotta/api/model/retailer/Category;

    .line 73
    iput p3, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->addedCount:I

    .line 75
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRowView;->onSetup()V

    return-void
.end method
