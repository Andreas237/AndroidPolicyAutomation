.class Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity$2;
.super Ljava/lang/Object;
.source "RedeemRetailersActivity.java"

# interfaces
.implements Landroid/support/design/widget/TabLayout$OnTabSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->initTabTitles()V
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

    .line 141
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTabReselected(Landroid/support/design/widget/TabLayout$Tab;)V
    .locals 0

    return-void
.end method

.method public onTabSelected(Landroid/support/design/widget/TabLayout$Tab;)V
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;

    invoke-static {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;Landroid/support/design/widget/TabLayout$Tab;)V

    return-void
.end method

.method public onTabUnselected(Landroid/support/design/widget/TabLayout$Tab;)V
    .locals 0

    return-void
.end method
