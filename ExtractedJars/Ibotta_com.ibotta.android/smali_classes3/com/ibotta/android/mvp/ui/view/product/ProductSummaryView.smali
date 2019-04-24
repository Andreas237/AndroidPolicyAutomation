.class public Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;
.super Landroid/widget/LinearLayout;
.source "ProductSummaryView.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView$ProductSummaryListener;
    }
.end annotation


# static fields
.field private static final DEFAULT_MAX_LINES:I = 0x3

.field private static final HERO_MAX_LINES:I = 0x1


# instance fields
.field protected bShop:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900a7
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView$ProductSummaryListener;

.field private productModel:Lcom/ibotta/api/model/ProductModel;

.field protected tvName:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09054d
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 42
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;->initLayout(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 46
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 47
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;->initLayout(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 51
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 52
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;->initLayout(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 57
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 58
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;->initLayout(Landroid/util/AttributeSet;)V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;)Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView$ProductSummaryListener;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;->listener:Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView$ProductSummaryListener;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;)Lcom/ibotta/api/model/ProductModel;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;->productModel:Lcom/ibotta/api/model/ProductModel;

    return-object p0
.end method

.method private initLayout(Landroid/util/AttributeSet;)V
    .locals 3

    const/4 p1, 0x1

    .line 66
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;->setClickable(Z)V

    const/4 v0, 0x0

    .line 67
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;->setFocusable(Z)V

    .line 69
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView$1;-><init>(Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;)V

    instance-of v2, p0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    move-object v2, p0

    check-cast v2, Landroid/view/View;

    invoke-static {v2, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 78
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;->removeAllViews()V

    const/high16 v1, 0x42c80000    # 100.0f

    .line 80
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;->setWeightSum(F)V

    .line 81
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;->setOrientation(I)V

    .line 82
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0197

    invoke-virtual {v0, v1, p0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 84
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private initName()V
    .locals 2

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;->tvName:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;->productModel:Lcom/ibotta/api/model/ProductModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/ProductModel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method protected initShopButton()V
    .locals 2

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;->bShop:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    return-void
.end method

.method public onShopClicked()V
    .locals 2
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0900a7
        }
    .end annotation

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;->listener:Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView$ProductSummaryListener;

    if-eqz v0, :cond_0

    .line 105
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;->productModel:Lcom/ibotta/api/model/ProductModel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView$ProductSummaryListener;->onProductShopClicked(Lcom/ibotta/api/model/ProductModel;)V

    :cond_0
    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView$ProductSummaryListener;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;->listener:Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView$ProductSummaryListener;

    return-void
.end method

.method public setup(Lcom/ibotta/api/model/ProductModel;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;->productModel:Lcom/ibotta/api/model/ProductModel;

    .line 90
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;->initName()V

    .line 91
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;->initShopButton()V

    return-void
.end method
