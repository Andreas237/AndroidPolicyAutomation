.class public Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;
.super Landroid/widget/LinearLayout;
.source "PersonalStoreCardView.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView$PersonalStoreCardListener;
    }
.end annotation


# instance fields
.field protected flItemSelectedOverlay:Landroid/widget/FrameLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901f2
    .end annotation
.end field

.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivRetailerLogo:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902c2
    .end annotation
.end field

.field protected ivStarSelectedOverlay:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902ca
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView$PersonalStoreCardListener;

.field private personalStoresItem:Lcom/ibotta/android/view/model/PersonalStoresItem;

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
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 60
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 61
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->initLayout()V

    return-void
.end method

.method private getBestImageUrl()Ljava/lang/String;
    .locals 2

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->personalStoresItem:Lcom/ibotta/android/view/model/PersonalStoresItem;

    invoke-virtual {v0}, Lcom/ibotta/android/view/model/PersonalStoresItem;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getLargeIconUrl()Ljava/lang/String;

    move-result-object v0

    .line 138
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 139
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->personalStoresItem:Lcom/ibotta/android/view/model/PersonalStoresItem;

    invoke-virtual {v0}, Lcom/ibotta/android/view/model/PersonalStoresItem;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getIconUrl()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private initLayout()V
    .locals 3

    .line 75
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;)V

    const/4 v0, 0x1

    .line 77
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->setOrientation(I)V

    .line 78
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->setClickable(Z)V

    const/4 v1, 0x0

    .line 79
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->setFocusable(Z)V

    .line 81
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->isInEditMode()Z

    move-result v2

    if-nez v2, :cond_0

    .line 82
    invoke-static {p0, v1}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableForegroundRipple(Landroid/view/View;Z)V

    .line 85
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c018e

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 86
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 88
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/personalize/-$$Lambda$PersonalStoreCardView$tY-Biv24FMjfNjEEuUiDLa08R2g;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/view/personalize/-$$Lambda$PersonalStoreCardView$tY-Biv24FMjfNjEEuUiDLa08R2g;-><init>(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;)V

    instance-of v1, p0, Landroid/view/View;

    if-nez v1, :cond_1

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

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

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->tvName:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->personalStoresItem:Lcom/ibotta/android/view/model/PersonalStoresItem;

    invoke-virtual {v1}, Lcom/ibotta/android/view/model/PersonalStoresItem;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v1

    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initOverlay()V
    .locals 7

    .line 107
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->getBestImageUrl()Ljava/lang/String;

    move-result-object v0

    .line 109
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->personalStoresItem:Lcom/ibotta/android/view/model/PersonalStoresItem;

    invoke-virtual {v1}, Lcom/ibotta/android/view/model/PersonalStoresItem;->isSelected()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    .line 110
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->flItemSelectedOverlay:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v3}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 111
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->ivStarSelectedOverlay:Landroid/widget/ImageView;

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 113
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->getContext()Landroid/content/Context;

    move-result-object v4

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->ivRetailerLogo:Landroid/widget/ImageView;

    sget-object v6, Lcom/ibotta/android/views/images/Sizes;->PERSONAL_STORES_BLUR:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v1, v4, v0, v5, v6}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    .line 115
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f1104b8

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->personalStoresItem:Lcom/ibotta/android/view/model/PersonalStoresItem;

    .line 116
    invoke-virtual {v4}, Lcom/ibotta/android/view/model/PersonalStoresItem;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v4

    invoke-interface {v4}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    .line 115
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 118
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->tvName:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 120
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->flItemSelectedOverlay:Landroid/widget/FrameLayout;

    const/16 v4, 0x8

    invoke-virtual {v1, v4}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 121
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->ivStarSelectedOverlay:Landroid/widget/ImageView;

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 123
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->getContext()Landroid/content/Context;

    move-result-object v4

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->ivRetailerLogo:Landroid/widget/ImageView;

    sget-object v6, Lcom/ibotta/android/views/images/Sizes;->PERSONAL_STORES:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v1, v4, v0, v5, v6}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    .line 125
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f1104b7

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->personalStoresItem:Lcom/ibotta/android/view/model/PersonalStoresItem;

    .line 126
    invoke-virtual {v4}, Lcom/ibotta/android/view/model/PersonalStoresItem;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v4

    invoke-interface {v4}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    .line 125
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 127
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->tvName:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setContentDescription(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method private initRetailerLogo()V
    .locals 5

    .line 102
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->getBestImageUrl()Ljava/lang/String;

    move-result-object v0

    .line 103
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->ivRetailerLogo:Landroid/widget/ImageView;

    sget-object v4, Lcom/ibotta/android/views/images/Sizes;->RETAILER_LOGO:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v1, v2, v0, v3, v4}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method

.method public static synthetic lambda$initLayout$0(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;Landroid/view/View;)V
    .locals 1

    .line 89
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->listener:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView$PersonalStoreCardListener;

    if-eqz p1, :cond_0

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->personalStoresItem:Lcom/ibotta/android/view/model/PersonalStoresItem;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView$PersonalStoreCardListener;->onPersonalRetailerCardClicked(Lcom/ibotta/android/view/model/PersonalStoresItem;)V

    :cond_0
    return-void
.end method

.method private onPersonalStoresItemSet()V
    .locals 0

    .line 96
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->initRetailerLogo()V

    .line 97
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->initOverlay()V

    .line 98
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->initName()V

    return-void
.end method


# virtual methods
.method public setListener(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView$PersonalStoreCardListener;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->listener:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView$PersonalStoreCardListener;

    return-void
.end method

.method public setPersonalStoresItem(Lcom/ibotta/android/view/model/PersonalStoresItem;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->personalStoresItem:Lcom/ibotta/android/view/model/PersonalStoresItem;

    .line 71
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->onPersonalStoresItemSet()V

    return-void
.end method
