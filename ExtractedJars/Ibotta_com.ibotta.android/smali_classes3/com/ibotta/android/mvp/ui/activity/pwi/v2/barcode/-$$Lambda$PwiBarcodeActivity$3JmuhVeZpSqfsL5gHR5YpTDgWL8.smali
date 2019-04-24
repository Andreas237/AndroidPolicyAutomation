.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/-$$Lambda$PwiBarcodeActivity$3JmuhVeZpSqfsL5gHR5YpTDgWL8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$ActionSheetDialogListener;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;

.field private final synthetic f$1:Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/-$$Lambda$PwiBarcodeActivity$3JmuhVeZpSqfsL5gHR5YpTDgWL8;->f$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/-$$Lambda$PwiBarcodeActivity$3JmuhVeZpSqfsL5gHR5YpTDgWL8;->f$1:Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;

    return-void
.end method


# virtual methods
.method public final onActionSheetOptionClicked(Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;)V
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/-$$Lambda$PwiBarcodeActivity$3JmuhVeZpSqfsL5gHR5YpTDgWL8;->f$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/-$$Lambda$PwiBarcodeActivity$3JmuhVeZpSqfsL5gHR5YpTDgWL8;->f$1:Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;

    invoke-static {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->lambda$onUpdateBalanceClick$0(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;)V

    return-void
.end method
