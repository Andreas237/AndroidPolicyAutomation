.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/-$$Lambda$WalletV2Activity$TtZTPy2zcFEDWiipjsT5L92H5QE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$ActionSheetDialogListener;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;

.field private final synthetic f$1:Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/-$$Lambda$WalletV2Activity$TtZTPy2zcFEDWiipjsT5L92H5QE;->f$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/-$$Lambda$WalletV2Activity$TtZTPy2zcFEDWiipjsT5L92H5QE;->f$1:Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;

    return-void
.end method


# virtual methods
.method public final onActionSheetOptionClicked(Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;)V
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/-$$Lambda$WalletV2Activity$TtZTPy2zcFEDWiipjsT5L92H5QE;->f$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/-$$Lambda$WalletV2Activity$TtZTPy2zcFEDWiipjsT5L92H5QE;->f$1:Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;

    invoke-static {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->lambda$showPaymentMethodDialog$3(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;)V

    return-void
.end method
