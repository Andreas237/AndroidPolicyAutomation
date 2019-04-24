.class public Lcom/stripe/android/view/SelectShippingMethodWidget;
.super Landroid/widget/FrameLayout;
.source "SelectShippingMethodWidget.java"


# instance fields
.field mShippingMethodAdapter:Lcom/stripe/android/view/ShippingMethodAdapter;

.field mShippingMethodRecyclerView:Landroid/support/v7/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 29
    invoke-direct {p0}, Lcom/stripe/android/view/SelectShippingMethodWidget;->initView()V

    return-void
.end method

.method private initView()V
    .locals 3

    .line 54
    invoke-virtual {p0}, Lcom/stripe/android/view/SelectShippingMethodWidget;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/stripe/android/R$layout;->select_shipping_method_widget:I

    invoke-static {v0, v1, p0}, Lcom/stripe/android/view/SelectShippingMethodWidget;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 55
    sget v0, Lcom/stripe/android/R$id;->rv_shipping_methods_ssmw:I

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/SelectShippingMethodWidget;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/stripe/android/view/SelectShippingMethodWidget;->mShippingMethodRecyclerView:Landroid/support/v7/widget/RecyclerView;

    .line 56
    new-instance v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/stripe/android/view/SelectShippingMethodWidget;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 57
    new-instance v1, Lcom/stripe/android/view/ShippingMethodAdapter;

    invoke-direct {v1}, Lcom/stripe/android/view/ShippingMethodAdapter;-><init>()V

    iput-object v1, p0, Lcom/stripe/android/view/SelectShippingMethodWidget;->mShippingMethodAdapter:Lcom/stripe/android/view/ShippingMethodAdapter;

    .line 58
    iget-object v1, p0, Lcom/stripe/android/view/SelectShippingMethodWidget;->mShippingMethodRecyclerView:Landroid/support/v7/widget/RecyclerView;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 59
    iget-object v1, p0, Lcom/stripe/android/view/SelectShippingMethodWidget;->mShippingMethodRecyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, p0, Lcom/stripe/android/view/SelectShippingMethodWidget;->mShippingMethodAdapter:Lcom/stripe/android/view/ShippingMethodAdapter;

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 60
    iget-object v1, p0, Lcom/stripe/android/view/SelectShippingMethodWidget;->mShippingMethodRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    return-void
.end method


# virtual methods
.method public getSelectedShippingMethod()Lcom/stripe/android/model/ShippingMethod;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/stripe/android/view/SelectShippingMethodWidget;->mShippingMethodAdapter:Lcom/stripe/android/view/ShippingMethodAdapter;

    invoke-virtual {v0}, Lcom/stripe/android/view/ShippingMethodAdapter;->getSelectedShippingMethod()Lcom/stripe/android/model/ShippingMethod;

    move-result-object v0

    return-object v0
.end method

.method public setShippingMethods(Ljava/util/List;Lcom/stripe/android/model/ShippingMethod;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/ShippingMethod;",
            ">;",
            "Lcom/stripe/android/model/ShippingMethod;",
            ")V"
        }
    .end annotation

    .line 50
    iget-object v0, p0, Lcom/stripe/android/view/SelectShippingMethodWidget;->mShippingMethodAdapter:Lcom/stripe/android/view/ShippingMethodAdapter;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/view/ShippingMethodAdapter;->setShippingMethods(Ljava/util/List;Lcom/stripe/android/model/ShippingMethod;)V

    return-void
.end method
