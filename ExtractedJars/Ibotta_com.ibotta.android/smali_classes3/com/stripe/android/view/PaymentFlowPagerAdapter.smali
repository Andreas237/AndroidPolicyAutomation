.class Lcom/stripe/android/view/PaymentFlowPagerAdapter;
.super Landroid/support/v4/view/PagerAdapter;
.source "PaymentFlowPagerAdapter.java"


# instance fields
.field private mContext:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mDefaultShippingMethod:Lcom/stripe/android/model/ShippingMethod;

.field private mPages:Ljava/util/List;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/view/PaymentFlowPagerEnum;",
            ">;"
        }
    .end annotation
.end field

.field private mPaymentSessionConfig:Lcom/stripe/android/PaymentSessionConfig;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mShippingInfoSaved:Z

.field private mValidShippingMethods:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/model/ShippingMethod;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/stripe/android/PaymentSessionConfig;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/stripe/android/PaymentSessionConfig;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 33
    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    .line 26
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->mValidShippingMethods:Ljava/util/List;

    .line 34
    iput-object p1, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->mContext:Landroid/content/Context;

    .line 35
    iput-object p2, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->mPaymentSessionConfig:Lcom/stripe/android/PaymentSessionConfig;

    .line 36
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->mPages:Ljava/util/List;

    .line 37
    iget-object p1, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->mPaymentSessionConfig:Lcom/stripe/android/PaymentSessionConfig;

    invoke-virtual {p1}, Lcom/stripe/android/PaymentSessionConfig;->isShippingInfoRequired()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 38
    iget-object p1, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->mPages:Ljava/util/List;

    sget-object p2, Lcom/stripe/android/view/PaymentFlowPagerEnum;->SHIPPING_INFO:Lcom/stripe/android/view/PaymentFlowPagerEnum;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    :cond_0
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->shouldAddShippingScreen()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 41
    iget-object p1, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->mPages:Ljava/util/List;

    sget-object p2, Lcom/stripe/android/view/PaymentFlowPagerEnum;->SHIPPING_METHOD:Lcom/stripe/android/view/PaymentFlowPagerEnum;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method private shouldAddShippingScreen()Z
    .locals 2

    .line 46
    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->mPaymentSessionConfig:Lcom/stripe/android/PaymentSessionConfig;

    invoke-virtual {v0}, Lcom/stripe/android/PaymentSessionConfig;->isShippingMethodRequired()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->mPaymentSessionConfig:Lcom/stripe/android/PaymentSessionConfig;

    .line 47
    invoke-virtual {v0}, Lcom/stripe/android/PaymentSessionConfig;->isShippingInfoRequired()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->mShippingInfoSaved:Z

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->mPages:Ljava/util/List;

    sget-object v1, Lcom/stripe/android/view/PaymentFlowPagerEnum;->SHIPPING_METHOD:Lcom/stripe/android/view/PaymentFlowPagerEnum;

    .line 48
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    .line 99
    check-cast p3, Landroid/view/View;

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public getCount()I
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->mPages:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method getPageAt(I)Lcom/stripe/android/view/PaymentFlowPagerEnum;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 109
    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->mPages:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 110
    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->mPages:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/view/PaymentFlowPagerEnum;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 2

    .line 122
    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->mPages:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/view/PaymentFlowPagerEnum;

    invoke-virtual {p1}, Lcom/stripe/android/view/PaymentFlowPagerEnum;->getTitleResId()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method hideShippingPage()V
    .locals 2

    .line 67
    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->mPages:Ljava/util/List;

    sget-object v1, Lcom/stripe/android/view/PaymentFlowPagerEnum;->SHIPPING_METHOD:Lcom/stripe/android/view/PaymentFlowPagerEnum;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 68
    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 4

    .line 73
    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->mPages:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/view/PaymentFlowPagerEnum;

    .line 74
    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->mContext:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 75
    invoke-virtual {p2}, Lcom/stripe/android/view/PaymentFlowPagerEnum;->getLayoutResId()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 77
    sget-object v1, Lcom/stripe/android/view/PaymentFlowPagerEnum;->SHIPPING_METHOD:Lcom/stripe/android/view/PaymentFlowPagerEnum;

    invoke-virtual {p2, v1}, Lcom/stripe/android/view/PaymentFlowPagerEnum;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 78
    invoke-static {}, Lcom/stripe/android/CustomerSession;->getInstance()Lcom/stripe/android/CustomerSession;

    move-result-object v1

    const-string v2, "ShippingMethodScreen"

    invoke-virtual {v1, v2}, Lcom/stripe/android/CustomerSession;->addProductUsageTokenIfValid(Ljava/lang/String;)V

    .line 79
    sget v1, Lcom/stripe/android/R$id;->select_shipping_method_widget:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/view/SelectShippingMethodWidget;

    .line 81
    iget-object v2, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->mValidShippingMethods:Ljava/util/List;

    iget-object v3, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->mDefaultShippingMethod:Lcom/stripe/android/model/ShippingMethod;

    invoke-virtual {v1, v2, v3}, Lcom/stripe/android/view/SelectShippingMethodWidget;->setShippingMethods(Ljava/util/List;Lcom/stripe/android/model/ShippingMethod;)V

    .line 84
    :cond_0
    sget-object v1, Lcom/stripe/android/view/PaymentFlowPagerEnum;->SHIPPING_INFO:Lcom/stripe/android/view/PaymentFlowPagerEnum;

    invoke-virtual {p2, v1}, Lcom/stripe/android/view/PaymentFlowPagerEnum;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 85
    invoke-static {}, Lcom/stripe/android/CustomerSession;->getInstance()Lcom/stripe/android/CustomerSession;

    move-result-object p2

    const-string v1, "ShippingInfoScreen"

    invoke-virtual {p2, v1}, Lcom/stripe/android/CustomerSession;->addProductUsageTokenIfValid(Ljava/lang/String;)V

    .line 86
    sget p2, Lcom/stripe/android/R$id;->shipping_info_widget:I

    invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/view/ShippingInfoWidget;

    .line 87
    iget-object v1, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->mPaymentSessionConfig:Lcom/stripe/android/PaymentSessionConfig;

    invoke-virtual {v1}, Lcom/stripe/android/PaymentSessionConfig;->getHiddenShippingInfoFields()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/stripe/android/view/ShippingInfoWidget;->setHiddenFields(Ljava/util/List;)V

    .line 88
    iget-object v1, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->mPaymentSessionConfig:Lcom/stripe/android/PaymentSessionConfig;

    .line 89
    invoke-virtual {v1}, Lcom/stripe/android/PaymentSessionConfig;->getOptionalShippingInfoFields()Ljava/util/List;

    move-result-object v1

    .line 88
    invoke-virtual {p2, v1}, Lcom/stripe/android/view/ShippingInfoWidget;->setOptionalFields(Ljava/util/List;)V

    .line 90
    iget-object v1, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->mPaymentSessionConfig:Lcom/stripe/android/PaymentSessionConfig;

    .line 91
    invoke-virtual {v1}, Lcom/stripe/android/PaymentSessionConfig;->getPrepopulatedShippingInfo()Lcom/stripe/android/model/ShippingInformation;

    move-result-object v1

    .line 90
    invoke-virtual {p2, v1}, Lcom/stripe/android/view/ShippingInfoWidget;->populateShippingInfo(Lcom/stripe/android/model/ShippingInformation;)V

    .line 93
    :cond_1
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object v0
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method setShippingInfoSaved(Z)V
    .locals 1

    .line 53
    iput-boolean p1, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->mShippingInfoSaved:Z

    .line 54
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->shouldAddShippingScreen()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 55
    iget-object p1, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->mPages:Ljava/util/List;

    sget-object v0, Lcom/stripe/android/view/PaymentFlowPagerEnum;->SHIPPING_METHOD:Lcom/stripe/android/view/PaymentFlowPagerEnum;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 57
    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method setShippingMethods(Ljava/util/List;Lcom/stripe/android/model/ShippingMethod;)V
    .locals 0
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

    .line 62
    iput-object p1, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->mValidShippingMethods:Ljava/util/List;

    .line 63
    iput-object p2, p0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->mDefaultShippingMethod:Lcom/stripe/android/model/ShippingMethod;

    return-void
.end method
