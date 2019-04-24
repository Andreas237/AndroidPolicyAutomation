.class public Lcom/stripe/android/view/PaymentFlowActivity;
.super Lcom/stripe/android/view/StripeActivity;
.source "PaymentFlowActivity.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private mDefaultShippingMethod:Lcom/stripe/android/model/ShippingMethod;

.field private mPaymentFlowPagerAdapter:Lcom/stripe/android/view/PaymentFlowPagerAdapter;

.field private mPaymentSessionData:Lcom/stripe/android/PaymentSessionData;

.field private mShippingInfoSavedBroadcastReceiver:Landroid/content/BroadcastReceiver;

.field private mShippingInfoSubmittedBroadcastReceiver:Landroid/content/BroadcastReceiver;

.field private mShippingInformationSubmitted:Lcom/stripe/android/model/ShippingInformation;

.field private mValidShippingMethods:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/model/ShippingMethod;",
            ">;"
        }
    .end annotation
.end field

.field private mViewPager:Landroid/support/v4/view/ViewPager;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/stripe/android/view/StripeActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/stripe/android/view/PaymentFlowActivity;)Landroid/support/v4/view/ViewPager;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mViewPager:Landroid/support/v4/view/ViewPager;

    return-object p0
.end method

.method static synthetic access$100(Lcom/stripe/android/view/PaymentFlowActivity;)Lcom/stripe/android/view/PaymentFlowPagerAdapter;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mPaymentFlowPagerAdapter:Lcom/stripe/android/view/PaymentFlowPagerAdapter;

    return-object p0
.end method

.method static synthetic access$200(Lcom/stripe/android/view/PaymentFlowActivity;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentFlowActivity;->onShippingInfoValidated()V

    return-void
.end method

.method static synthetic access$300(Lcom/stripe/android/view/PaymentFlowActivity;)Ljava/util/List;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mValidShippingMethods:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$302(Lcom/stripe/android/view/PaymentFlowActivity;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mValidShippingMethods:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$400(Lcom/stripe/android/view/PaymentFlowActivity;)Lcom/stripe/android/model/ShippingMethod;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mDefaultShippingMethod:Lcom/stripe/android/model/ShippingMethod;

    return-object p0
.end method

.method static synthetic access$402(Lcom/stripe/android/view/PaymentFlowActivity;Lcom/stripe/android/model/ShippingMethod;)Lcom/stripe/android/model/ShippingMethod;
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mDefaultShippingMethod:Lcom/stripe/android/model/ShippingMethod;

    return-object p1
.end method

.method static synthetic access$500(Lcom/stripe/android/view/PaymentFlowActivity;)Lcom/stripe/android/model/ShippingInformation;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mShippingInformationSubmitted:Lcom/stripe/android/model/ShippingInformation;

    return-object p0
.end method

.method static synthetic access$502(Lcom/stripe/android/view/PaymentFlowActivity;Lcom/stripe/android/model/ShippingInformation;)Lcom/stripe/android/model/ShippingInformation;
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mShippingInformationSubmitted:Lcom/stripe/android/model/ShippingInformation;

    return-object p1
.end method

.method static synthetic access$600(Lcom/stripe/android/view/PaymentFlowActivity;Ljava/util/List;Lcom/stripe/android/model/ShippingMethod;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/view/PaymentFlowActivity;->onShippingMethodsReady(Ljava/util/List;Lcom/stripe/android/model/ShippingMethod;)V

    return-void
.end method

.method static synthetic access$700(Lcom/stripe/android/view/PaymentFlowActivity;)Lcom/stripe/android/PaymentSessionData;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mPaymentSessionData:Lcom/stripe/android/PaymentSessionData;

    return-object p0
.end method

.method private broadcastShippingInfoSubmitted(Lcom/stripe/android/model/ShippingInformation;)V
    .locals 2

    .line 188
    new-instance v0, Landroid/content/Intent;

    const-string v1, "shipping_info_submitted"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "shipping_info_data"

    .line 189
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 190
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    return-void
.end method

.method private hasNextPage()Z
    .locals 3

    .line 194
    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mViewPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget-object v2, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mPaymentFlowPagerAdapter:Lcom/stripe/android/view/PaymentFlowPagerAdapter;

    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->getCount()I

    move-result v2

    if-ge v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private hasPreviousPage()Z
    .locals 1

    .line 198
    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mViewPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private onShippingInfoSubmitted()V
    .locals 2

    .line 178
    sget v0, Lcom/stripe/android/R$id;->shipping_info_widget:I

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/PaymentFlowActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/ShippingInfoWidget;

    .line 179
    invoke-virtual {v0}, Lcom/stripe/android/view/ShippingInfoWidget;->getShippingInformation()Lcom/stripe/android/model/ShippingInformation;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 181
    iput-object v0, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mShippingInformationSubmitted:Lcom/stripe/android/model/ShippingInformation;

    const/4 v1, 0x1

    .line 182
    invoke-virtual {p0, v1}, Lcom/stripe/android/view/PaymentFlowActivity;->setCommunicatingProgress(Z)V

    .line 183
    invoke-direct {p0, v0}, Lcom/stripe/android/view/PaymentFlowActivity;->broadcastShippingInfoSubmitted(Lcom/stripe/android/model/ShippingInformation;)V

    :cond_0
    return-void
.end method

.method private onShippingInfoValidated()V
    .locals 2

    .line 155
    invoke-static {}, Lcom/stripe/android/CustomerSession;->getInstance()Lcom/stripe/android/CustomerSession;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mShippingInformationSubmitted:Lcom/stripe/android/model/ShippingInformation;

    invoke-virtual {v0, p0, v1}, Lcom/stripe/android/CustomerSession;->setCustomerShippingInformation(Landroid/content/Context;Lcom/stripe/android/model/ShippingInformation;)V

    return-void
.end method

.method private onShippingMethodSave()V
    .locals 3

    .line 203
    sget v0, Lcom/stripe/android/R$id;->select_shipping_method_widget:I

    .line 204
    invoke-virtual {p0, v0}, Lcom/stripe/android/view/PaymentFlowActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/SelectShippingMethodWidget;

    .line 205
    invoke-virtual {v0}, Lcom/stripe/android/view/SelectShippingMethodWidget;->getSelectedShippingMethod()Lcom/stripe/android/model/ShippingMethod;

    move-result-object v0

    .line 206
    iget-object v1, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mPaymentSessionData:Lcom/stripe/android/PaymentSessionData;

    invoke-virtual {v1, v0}, Lcom/stripe/android/PaymentSessionData;->setShippingMethod(Lcom/stripe/android/model/ShippingMethod;)V

    .line 207
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "payment_session_data"

    .line 208
    iget-object v2, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mPaymentSessionData:Lcom/stripe/android/PaymentSessionData;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const/4 v1, -0x1

    .line 209
    invoke-virtual {p0, v1, v0}, Lcom/stripe/android/view/PaymentFlowActivity;->setResult(ILandroid/content/Intent;)V

    .line 210
    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentFlowActivity;->finish()V

    return-void
.end method

.method private onShippingMethodsReady(Ljava/util/List;Lcom/stripe/android/model/ShippingMethod;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/stripe/android/model/ShippingMethod;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
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

    const/4 v0, 0x0

    .line 163
    invoke-virtual {p0, v0}, Lcom/stripe/android/view/PaymentFlowActivity;->setCommunicatingProgress(Z)V

    .line 164
    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mPaymentFlowPagerAdapter:Lcom/stripe/android/view/PaymentFlowPagerAdapter;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->setShippingMethods(Ljava/util/List;Lcom/stripe/android/model/ShippingMethod;)V

    .line 165
    iget-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mPaymentFlowPagerAdapter:Lcom/stripe/android/view/PaymentFlowPagerAdapter;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->setShippingInfoSaved(Z)V

    .line 166
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentFlowActivity;->hasNextPage()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 167
    iget-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mViewPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {p1}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v0

    add-int/2addr v0, p2

    invoke-virtual {p1, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    goto :goto_0

    .line 169
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mPaymentSessionData:Lcom/stripe/android/PaymentSessionData;

    iget-object p2, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mShippingInformationSubmitted:Lcom/stripe/android/model/ShippingInformation;

    invoke-virtual {p1, p2}, Lcom/stripe/android/PaymentSessionData;->setShippingInformation(Lcom/stripe/android/model/ShippingInformation;)V

    .line 170
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const-string p2, "payment_session_data"

    .line 171
    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mPaymentSessionData:Lcom/stripe/android/PaymentSessionData;

    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const/4 p2, -0x1

    .line 172
    invoke-virtual {p0, p2, p1}, Lcom/stripe/android/view/PaymentFlowActivity;->setResult(ILandroid/content/Intent;)V

    .line 173
    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentFlowActivity;->finish()V

    :goto_0
    return-void
.end method


# virtual methods
.method protected onActionSave()V
    .locals 2

    .line 126
    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mPaymentFlowPagerAdapter:Lcom/stripe/android/view/PaymentFlowPagerAdapter;

    iget-object v1, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mViewPager:Landroid/support/v4/view/ViewPager;

    .line 127
    invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v1

    .line 126
    invoke-virtual {v0, v1}, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->getPageAt(I)Lcom/stripe/android/view/PaymentFlowPagerEnum;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/view/PaymentFlowPagerEnum;->SHIPPING_INFO:Lcom/stripe/android/view/PaymentFlowPagerEnum;

    .line 127
    invoke-virtual {v0, v1}, Lcom/stripe/android/view/PaymentFlowPagerEnum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 128
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentFlowActivity;->onShippingInfoSubmitted()V

    goto :goto_0

    .line 130
    :cond_0
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentFlowActivity;->onShippingMethodSave()V

    :goto_0
    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .line 215
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentFlowActivity;->hasPreviousPage()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 216
    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mViewPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    return-void

    .line 219
    :cond_0
    invoke-super {p0}, Lcom/stripe/android/view/StripeActivity;->onBackPressed()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 54
    invoke-super {p0, p1}, Lcom/stripe/android/view/StripeActivity;->onCreate(Landroid/os/Bundle;)V

    .line 55
    invoke-static {}, Lcom/stripe/android/CustomerSession;->getInstance()Lcom/stripe/android/CustomerSession;

    move-result-object p1

    const-string v0, "PaymentSession"

    invoke-virtual {p1, v0}, Lcom/stripe/android/CustomerSession;->addProductUsageTokenIfValid(Ljava/lang/String;)V

    .line 56
    invoke-static {}, Lcom/stripe/android/CustomerSession;->getInstance()Lcom/stripe/android/CustomerSession;

    move-result-object p1

    const-string v0, "PaymentFlowActivity"

    invoke-virtual {p1, v0}, Lcom/stripe/android/CustomerSession;->addProductUsageTokenIfValid(Ljava/lang/String;)V

    .line 57
    iget-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mViewStub:Landroid/view/ViewStub;

    sget v0, Lcom/stripe/android/R$layout;->activity_shipping_flow:I

    invoke-virtual {p1, v0}, Landroid/view/ViewStub;->setLayoutResource(I)V

    .line 58
    iget-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mViewStub:Landroid/view/ViewStub;

    instance-of v0, p1, Landroid/view/ViewStub;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    goto :goto_0

    :cond_0
    check-cast p1, Landroid/view/ViewStub;

    invoke-static {p1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->inflate(Landroid/view/ViewStub;)Landroid/view/View;

    .line 59
    :goto_0
    sget p1, Lcom/stripe/android/R$id;->shipping_flow_viewpager:I

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/PaymentFlowActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/support/v4/view/ViewPager;

    iput-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mViewPager:Landroid/support/v4/view/ViewPager;

    .line 61
    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentFlowActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "payment_session_config"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/PaymentSessionConfig;

    .line 62
    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentFlowActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "payment_session_data"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/PaymentSessionData;

    iput-object v0, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mPaymentSessionData:Lcom/stripe/android/PaymentSessionData;

    .line 64
    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mPaymentSessionData:Lcom/stripe/android/PaymentSessionData;

    if-eqz v0, :cond_1

    .line 69
    new-instance v0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/view/PaymentFlowPagerAdapter;-><init>(Landroid/content/Context;Lcom/stripe/android/PaymentSessionConfig;)V

    iput-object v0, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mPaymentFlowPagerAdapter:Lcom/stripe/android/view/PaymentFlowPagerAdapter;

    .line 70
    iget-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mViewPager:Landroid/support/v4/view/ViewPager;

    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mPaymentFlowPagerAdapter:Lcom/stripe/android/view/PaymentFlowPagerAdapter;

    invoke-virtual {p1, v0}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 71
    iget-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mViewPager:Landroid/support/v4/view/ViewPager;

    new-instance v0, Lcom/stripe/android/view/PaymentFlowActivity$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/PaymentFlowActivity$1;-><init>(Lcom/stripe/android/view/PaymentFlowActivity;)V

    invoke-virtual {p1, v0}, Landroid/support/v4/view/ViewPager;->addOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 90
    new-instance p1, Lcom/stripe/android/view/PaymentFlowActivity$2;

    invoke-direct {p1, p0}, Lcom/stripe/android/view/PaymentFlowActivity$2;-><init>(Lcom/stripe/android/view/PaymentFlowActivity;)V

    iput-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mShippingInfoSubmittedBroadcastReceiver:Landroid/content/BroadcastReceiver;

    .line 114
    new-instance p1, Lcom/stripe/android/view/PaymentFlowActivity$3;

    invoke-direct {p1, p0}, Lcom/stripe/android/view/PaymentFlowActivity$3;-><init>(Lcom/stripe/android/view/PaymentFlowActivity;)V

    iput-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mShippingInfoSavedBroadcastReceiver:Landroid/content/BroadcastReceiver;

    .line 121
    iget-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mPaymentFlowPagerAdapter:Lcom/stripe/android/view/PaymentFlowPagerAdapter;

    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mViewPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/PaymentFlowActivity;->setTitle(Ljava/lang/CharSequence;)V

    return-void

    .line 65
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "PaymentFlowActivity launched without PaymentSessionData"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 0

    .line 31
    invoke-super {p0, p1}, Lcom/stripe/android/view/StripeActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 0

    .line 31
    invoke-super {p0, p1}, Lcom/stripe/android/view/StripeActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method protected onPause()V
    .locals 2

    .line 136
    invoke-super {p0}, Lcom/stripe/android/view/StripeActivity;->onPause()V

    .line 137
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mShippingInfoSubmittedBroadcastReceiver:Landroid/content/BroadcastReceiver;

    .line 138
    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 139
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mShippingInfoSavedBroadcastReceiver:Landroid/content/BroadcastReceiver;

    .line 140
    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method public bridge synthetic onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 0

    .line 31
    invoke-super {p0, p1}, Lcom/stripe/android/view/StripeActivity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method protected onResume()V
    .locals 4

    .line 145
    invoke-super {p0}, Lcom/stripe/android/view/StripeActivity;->onResume()V

    .line 146
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mShippingInfoSubmittedBroadcastReceiver:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "shipping_info_processed"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 149
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/view/PaymentFlowActivity;->mShippingInfoSavedBroadcastReceiver:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "shipping_info_saved"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    return-void
.end method
