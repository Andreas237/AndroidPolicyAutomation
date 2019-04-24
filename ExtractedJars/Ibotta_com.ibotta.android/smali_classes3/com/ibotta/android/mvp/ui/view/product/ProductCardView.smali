.class public Lcom/ibotta/android/mvp/ui/view/product/ProductCardView;
.super Landroid/widget/LinearLayout;
.source "ProductCardView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardListener;
.implements Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView$ProductSummaryListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/product/ProductCardView$ProductCardListener;
    }
.end annotation


# instance fields
.field private listener:Lcom/ibotta/android/mvp/ui/view/product/ProductCardView$ProductCardListener;

.field protected picvProductImageCard:Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09039e
    .end annotation
.end field

.field protected psvProductSummary:Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903bb
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 39
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductCardView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 43
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 44
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductCardView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 48
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 49
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductCardView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 54
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 55
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductCardView;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 63
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductCardView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0701a6

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    const/4 v1, 0x1

    .line 65
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/product/ProductCardView;->setOrientation(I)V

    .line 66
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/product/ProductCardView;->setClickable(Z)V

    const/4 v2, 0x0

    .line 67
    invoke-virtual {p0, v2}, Lcom/ibotta/android/mvp/ui/view/product/ProductCardView;->setFocusable(Z)V

    .line 68
    invoke-virtual {p0, v0, v2, v2, v2}, Lcom/ibotta/android/mvp/ui/view/product/ProductCardView;->setPadding(IIII)V

    .line 69
    invoke-virtual {p0, v2}, Lcom/ibotta/android/mvp/ui/view/product/ProductCardView;->setClipToPadding(Z)V

    .line 71
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductCardView;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    .line 72
    invoke-static {p0, v2}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    .line 75
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductCardView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f0c0193

    invoke-virtual {v0, v2, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 76
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method


# virtual methods
.method public onProductImageClicked(Lcom/ibotta/api/model/ProductModel;)V
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductCardView;->listener:Lcom/ibotta/android/mvp/ui/view/product/ProductCardView$ProductCardListener;

    if-eqz v0, :cond_0

    .line 94
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductCardView$ProductCardListener;->onProductCardClicked(Lcom/ibotta/api/model/ProductModel;)V

    :cond_0
    return-void
.end method

.method public onProductShopClicked(Lcom/ibotta/api/model/ProductModel;)V
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductCardView;->listener:Lcom/ibotta/android/mvp/ui/view/product/ProductCardView$ProductCardListener;

    if-eqz v0, :cond_0

    .line 108
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductCardView$ProductCardListener;->onProductShopClicked(Lcom/ibotta/api/model/ProductModel;)V

    :cond_0
    return-void
.end method

.method public onProductSummaryClicked(Lcom/ibotta/api/model/ProductModel;)V
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductCardView;->listener:Lcom/ibotta/android/mvp/ui/view/product/ProductCardView$ProductCardListener;

    if-eqz v0, :cond_0

    .line 101
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductCardView$ProductCardListener;->onProductCardClicked(Lcom/ibotta/api/model/ProductModel;)V

    :cond_0
    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/product/ProductCardView$ProductCardListener;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductCardView;->listener:Lcom/ibotta/android/mvp/ui/view/product/ProductCardView$ProductCardListener;

    return-void
.end method

.method public setup(Lcom/ibotta/api/model/ProductModel;)V
    .locals 2

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductCardView;->picvProductImageCard:Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;->setVisibility(I)V

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductCardView;->psvProductSummary:Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;->setVisibility(I)V

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductCardView;->picvProductImageCard:Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;->setProduct(Lcom/ibotta/api/model/ProductModel;)V

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductCardView;->psvProductSummary:Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;->setup(Lcom/ibotta/api/model/ProductModel;)V

    .line 86
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductCardView;->picvProductImageCard:Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardView;->setListener(Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardListener;)V

    .line 87
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductCardView;->psvProductSummary:Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;->setListener(Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView$ProductSummaryListener;)V

    return-void
.end method
