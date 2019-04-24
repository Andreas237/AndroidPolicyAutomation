.class Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$2;
.super Ljava/lang/Object;
.source "PwiHomePresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->onAfterPendingTransactionCheck()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;)V
    .locals 0

    .line 729
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onNegativeTapped()V
    .locals 2

    .line 737
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->access$402(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;Z)Z

    .line 738
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;

    sget-object v1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->EMPTY:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->access$100(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;)V

    return-void
.end method

.method public onPositiveTapped()V
    .locals 1

    .line 732
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->onPendingStatusBarClicked()V

    return-void
.end method
