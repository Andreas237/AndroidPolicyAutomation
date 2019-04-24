.class Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$1;
.super Ljava/lang/Object;
.source "PwiHomePresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->handlePwiError(Lcom/ibotta/api/model/pwi/PwiError;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;

.field final synthetic val$action:Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;)V
    .locals 0

    .line 682
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$1;->val$action:Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onNegativeTapped()V
    .locals 0

    return-void
.end method

.method public onPositiveTapped()V
    .locals 2

    .line 685
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$4;->$SwitchMap$com$ibotta$android$mvp$ui$activity$pwi$PwiErrorDialogAction:[I

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$1;->val$action:Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 703
    :pswitch_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;)V

    .line 704
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->showPaymentMethodSelector()V

    goto :goto_0

    .line 695
    :pswitch_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;)V

    .line 698
    :pswitch_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->access$300(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;)V

    goto :goto_0

    .line 687
    :pswitch_3
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->access$000(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;)V

    .line 688
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;

    sget-object v1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->TRY_AGAIN:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->access$100(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;)V

    :goto_0
    :pswitch_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_4
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method
