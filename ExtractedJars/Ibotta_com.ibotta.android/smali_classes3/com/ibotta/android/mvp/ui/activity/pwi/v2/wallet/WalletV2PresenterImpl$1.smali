.class Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl$1;
.super Ljava/lang/Object;
.source "WalletV2PresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->onPaymentMethodActionClicked(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;

.field final synthetic val$viewState:Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V
    .locals 0

    .line 321
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl$1;->val$viewState:Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;

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

    .line 324
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl$1;->val$viewState:Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;

    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->access$000(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V

    return-void
.end method
