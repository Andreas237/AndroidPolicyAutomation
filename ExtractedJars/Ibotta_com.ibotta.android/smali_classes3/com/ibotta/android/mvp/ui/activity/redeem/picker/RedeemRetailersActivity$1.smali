.class Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity$1;
.super Ljava/lang/Object;
.source "RedeemRetailersActivity.java"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->setupViewPagerListener()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;

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
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;

    invoke-static {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->access$000(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;I)V

    return-void
.end method
