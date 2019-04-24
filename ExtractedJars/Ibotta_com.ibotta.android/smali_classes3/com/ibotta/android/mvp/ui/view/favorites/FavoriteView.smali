.class public Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;
.super Landroid/widget/RelativeLayout;
.source "FavoriteView.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView$FavoriteViewListener;
    }
.end annotation


# instance fields
.field private category:Lcom/ibotta/api/model/retailer/Category;

.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivDrag:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902a1
    .end annotation
.end field

.field protected ivLogo:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902b4
    .end annotation
.end field

.field protected ivRemove:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902c1
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView$FavoriteViewListener;

.field private retailerModel:Lcom/ibotta/api/model/RetailerModel;

.field protected tvCategory:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090507
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

    .line 46
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 50
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x0

    .line 54
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 58
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 59
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->initLayout()V

    return-void
.end method

.method private initCategory()V
    .locals 2

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->category:Lcom/ibotta/api/model/retailer/Category;

    if-eqz v0, :cond_0

    .line 110
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->tvCategory:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/ibotta/api/model/retailer/Category;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 63
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;)V

    const/4 v0, 0x1

    .line 65
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->setClickable(Z)V

    const/4 v1, 0x0

    .line 66
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->setFocusable(Z)V

    .line 68
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c0157

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 69
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private initLogo()V
    .locals 5

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v2}, Lcom/ibotta/api/model/RetailerModel;->getIconUrl()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->ivLogo:Landroid/widget/ImageView;

    sget-object v4, Lcom/ibotta/android/views/images/Sizes;->RETAILER_LOGO:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method

.method private initName()V
    .locals 2

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->tvName:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initRemove()V
    .locals 3

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->ivRemove:Landroid/widget/ImageView;

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/favorites/-$$Lambda$FavoriteView$_HI40WjIbxJy5qb7jLfmLxj0wJ8;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/view/favorites/-$$Lambda$FavoriteView$_HI40WjIbxJy5qb7jLfmLxj0wJ8;-><init>(Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method public static synthetic lambda$initRemove$0(Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;Landroid/view/View;)V
    .locals 1

    .line 116
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->listener:Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView$FavoriteViewListener;

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v0

    invoke-static {p1, v0}, Lcom/ibotta/android/apiandroid/content/ContentId;->create(II)Lcom/ibotta/android/apiandroid/content/ContentId;

    move-result-object p1

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->listener:Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView$FavoriteViewListener;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView$FavoriteViewListener;->onRemoveClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V

    :cond_0
    return-void
.end method

.method private onCategorySet()V
    .locals 0

    .line 97
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->initCategory()V

    return-void
.end method

.method private onRetailerModelSet()V
    .locals 0

    .line 91
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->initLogo()V

    .line 92
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->initName()V

    .line 93
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->initRemove()V

    return-void
.end method


# virtual methods
.method public getDragImageView()Landroid/widget/ImageView;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->ivDrag:Landroid/widget/ImageView;

    return-object v0
.end method

.method public setCategory(Lcom/ibotta/api/model/retailer/Category;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->category:Lcom/ibotta/api/model/retailer/Category;

    .line 87
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->onCategorySet()V

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView$FavoriteViewListener;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->listener:Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView$FavoriteViewListener;

    return-void
.end method

.method public setRetailerModel(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    .line 82
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/favorites/FavoriteView;->onRetailerModelSet()V

    return-void
.end method
