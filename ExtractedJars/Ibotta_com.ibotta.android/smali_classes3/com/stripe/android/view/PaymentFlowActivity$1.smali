.class Lcom/stripe/android/view/PaymentFlowActivity$1;
.super Ljava/lang/Object;
.source "PaymentFlowActivity.java"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/PaymentFlowActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/view/PaymentFlowActivity;


# direct methods
.method constructor <init>(Lcom/stripe/android/view/PaymentFlowActivity;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivity$1;->this$0:Lcom/stripe/android/view/PaymentFlowActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 2

    .line 79
    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowActivity$1;->this$0:Lcom/stripe/android/view/PaymentFlowActivity;

    invoke-static {v0}, Lcom/stripe/android/view/PaymentFlowActivity;->access$000(Lcom/stripe/android/view/PaymentFlowActivity;)Landroid/support/v4/view/ViewPager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/support/v4/view/PagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/PaymentFlowActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 80
    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowActivity$1;->this$0:Lcom/stripe/android/view/PaymentFlowActivity;

    invoke-static {v0}, Lcom/stripe/android/view/PaymentFlowActivity;->access$100(Lcom/stripe/android/view/PaymentFlowActivity;)Lcom/stripe/android/view/PaymentFlowPagerAdapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->getPageAt(I)Lcom/stripe/android/view/PaymentFlowPagerEnum;

    move-result-object p1

    sget-object v0, Lcom/stripe/android/view/PaymentFlowPagerEnum;->SHIPPING_INFO:Lcom/stripe/android/view/PaymentFlowPagerEnum;

    if-ne p1, v0, :cond_0

    .line 81
    iget-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivity$1;->this$0:Lcom/stripe/android/view/PaymentFlowActivity;

    invoke-static {p1}, Lcom/stripe/android/view/PaymentFlowActivity;->access$100(Lcom/stripe/android/view/PaymentFlowActivity;)Lcom/stripe/android/view/PaymentFlowPagerAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/view/PaymentFlowPagerAdapter;->hideShippingPage()V

    :cond_0
    return-void
.end method
