.class public Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;
.super Landroid/widget/LinearLayout;
.source "RetailerRowView.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView$RetailerRowViewEvents;
    }
.end annotation


# instance fields
.field private category:Lcom/ibotta/api/model/retailer/Category;

.field private favorite:Z

.field protected iibFavorite:Lcom/ibotta/android/views/base/button/IbottaImageButton;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090245
    .end annotation
.end field

.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private isContentModule:Z

.field protected ivIcon:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902ac
    .end annotation
.end field

.field protected ivMcommBadge:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902b5
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView$RetailerRowViewEvents;

.field private retailerModel:Lcom/ibotta/api/model/RetailerModel;

.field private showFavorite:Z

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

    .line 57
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 61
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 65
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 69
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/4 p1, 0x0

    .line 47
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->showFavorite:Z

    .line 49
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->isContentModule:Z

    .line 70
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->initLayout()V

    return-void
.end method

.method private initFavorite()V
    .locals 3

    .line 186
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->showFavorite:Z

    if-eqz v0, :cond_1

    .line 187
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->iibFavorite:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->setVisibility(I)V

    .line 188
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->iibFavorite:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    new-instance v1, Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;

    invoke-direct {v1}, Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;-><init>()V

    .line 189
    iget-boolean v2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->favorite:Z

    if-eqz v2, :cond_0

    const v2, 0x7f11064b

    goto :goto_0

    :cond_0
    const v2, 0x7f1102b3

    :goto_0
    invoke-virtual {v1, v2}, Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;->contentDescription(I)Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;

    move-result-object v1

    iget-boolean v2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->favorite:Z

    .line 190
    invoke-virtual {v1, v2}, Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;->selected(Z)Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;

    move-result-object v1

    const v2, 0x7f0800f1

    .line 191
    invoke-virtual {v1, v2}, Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;->drawableResource(I)Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;

    move-result-object v1

    const/4 v2, 0x1

    .line 192
    invoke-virtual {v1, v2}, Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;->isCircleRipple(Z)Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;

    move-result-object v1

    .line 193
    invoke-virtual {v1}, Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;->build()Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    move-result-object v1

    .line 188
    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->updateViewState(Lcom/ibotta/android/views/base/button/IbottaButtonViewState;)V

    goto :goto_1

    .line 195
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->iibFavorite:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method private initIconImage()V
    .locals 5

    .line 153
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 157
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v2}, Lcom/ibotta/api/model/RetailerModel;->getIconUrl()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->ivIcon:Landroid/widget/ImageView;

    sget-object v4, Lcom/ibotta/android/views/images/Sizes;->RETAILER_LOGO:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    .line 159
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getVerificationTypeEnum()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/common/VerificationType;->APP:Lcom/ibotta/api/model/common/VerificationType;

    if-ne v0, v1, :cond_1

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->ivMcommBadge:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 162
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->ivMcommBadge:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 109
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;)V

    const/4 v0, 0x0

    .line 111
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->setOrientation(I)V

    const/high16 v1, 0x42c80000    # 100.0f

    .line 112
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->setWeightSum(F)V

    const/4 v1, 0x1

    .line 113
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->setClickable(Z)V

    .line 114
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->setFocusable(Z)V

    .line 116
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->isInEditMode()Z

    move-result v2

    if-nez v2, :cond_0

    .line 117
    invoke-static {p0, v0}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    .line 120
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f0c01bb

    invoke-virtual {v0, v2, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 121
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 123
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/-$$Lambda$RetailerRowView$NdeZUDCcJP0I7s7872ZSmDJ_x_o;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/-$$Lambda$RetailerRowView$NdeZUDCcJP0I7s7872ZSmDJ_x_o;-><init>(Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;)V

    instance-of v1, p0, Landroid/view/View;

    if-nez v1, :cond_1

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_1
    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-static {v1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 131
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->iibFavorite:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/retailer/picker/-$$Lambda$RetailerRowView$D8J_nmpZuYkXP2hNGnHGbd-fo7g;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/-$$Lambda$RetailerRowView$D8J_nmpZuYkXP2hNGnHGbd-fo7g;-><init>(Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->bindViewEvents(Lcom/ibotta/android/views/components/ClickableViewEvent;)V

    return-void
.end method

.method private initName()V
    .locals 2

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->tvName:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initShortDescription()V
    .locals 3

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->category:Lcom/ibotta/api/model/retailer/Category;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getShortDescription()Ljava/lang/String;

    move-result-object v0

    .line 173
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 174
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->tvShortDescription:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 175
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->tvShortDescription:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 177
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->tvShortDescription:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 180
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->tvShortDescription:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 181
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->tvShortDescription:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->category:Lcom/ibotta/api/model/retailer/Category;

    invoke-virtual {v1}, Lcom/ibotta/api/model/retailer/Category;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method public static synthetic lambda$D8J_nmpZuYkXP2hNGnHGbd-fo7g(Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;)V
    .locals 0

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->onFavoriteClicked()V

    return-void
.end method

.method public static synthetic lambda$initLayout$0(Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;Landroid/view/View;)V
    .locals 0

    .line 124
    iget-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->showFavorite:Z

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->isContentModule:Z

    if-nez p1, :cond_0

    .line 125
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->onFavoriteClicked()V

    goto :goto_0

    .line 127
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->onRetailerRowClicked()V

    :goto_0
    return-void
.end method

.method private onCategorySet()V
    .locals 0

    .line 141
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->initShortDescription()V

    return-void
.end method

.method private onFavoriteClicked()V
    .locals 3

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->listener:Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView$RetailerRowViewEvents;

    if-eqz v0, :cond_0

    .line 208
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    iget-boolean v2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->favorite:Z

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView$RetailerRowViewEvents;->onFavoriteClicked(Lcom/ibotta/api/model/RetailerModel;Z)V

    .line 210
    :cond_0
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->favorite:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->favorite:Z

    .line 211
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->initFavorite()V

    return-void
.end method

.method private onFavoriteSet()V
    .locals 0

    .line 145
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->initFavorite()V

    return-void
.end method

.method private onRetailerModelSet()V
    .locals 0

    .line 135
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->initIconImage()V

    .line 136
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->initName()V

    .line 137
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->initShortDescription()V

    return-void
.end method

.method private onRetailerRowClicked()V
    .locals 2

    .line 200
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v0

    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/ibotta/android/apiandroid/content/ContentId;->create(II)Lcom/ibotta/android/apiandroid/content/ContentId;

    move-result-object v0

    .line 201
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->listener:Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView$RetailerRowViewEvents;

    if-eqz v1, :cond_0

    .line 202
    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView$RetailerRowViewEvents;->onRetailerRowClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V

    :cond_0
    return-void
.end method

.method private onShowFavoriteSet()V
    .locals 0

    .line 149
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->initFavorite()V

    return-void
.end method


# virtual methods
.method public getRetailerModel()Lcom/ibotta/api/model/RetailerModel;
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    return-object v0
.end method

.method public initWithContentViewModel(Lcom/ibotta/api/model/RetailerModel;Z)V
    .locals 0

    .line 82
    iput-boolean p2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->isContentModule:Z

    .line 84
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    .line 85
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->onRetailerModelSet()V

    return-void
.end method

.method public setCategory(Lcom/ibotta/api/model/retailer/Category;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->category:Lcom/ibotta/api/model/retailer/Category;

    .line 95
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->onCategorySet()V

    return-void
.end method

.method public setFavorite(Z)V
    .locals 0

    .line 99
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->favorite:Z

    .line 100
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->onFavoriteSet()V

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView$RetailerRowViewEvents;)V
    .locals 0

    .line 74
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->listener:Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView$RetailerRowViewEvents;

    return-void
.end method

.method public setRetailerModel(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    .line 90
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->onRetailerModelSet()V

    return-void
.end method

.method public setShowFavorite(Z)V
    .locals 0

    .line 104
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->showFavorite:Z

    .line 105
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->onShowFavoriteSet()V

    return-void
.end method
