.class public Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "RedeemReqsActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;"
    }
.end annotation


# instance fields
.field protected bContinue:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090084
    .end annotation
.end field

.field protected ivRedeemType:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902c0
    .end annotation
.end field

.field protected receiptSubmissionHelper:Lcom/ibotta/android/submission/ReceiptSubmissionHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected rivInstructions:Lcom/ibotta/android/view/redeem/RedeemInstructionsView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903cb
    .end annotation
.end field

.field protected tbvGeneralInstructionsTitle:Lcom/ibotta/android/views/base/title/TitleBarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090446
    .end annotation
.end field

.field protected tvGenInstructions:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09052b
    .end annotation
.end field

.field protected windfallGatekeeper:Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method private initDetailedInstructions(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->rivInstructions:Lcom/ibotta/android/view/redeem/RedeemInstructionsView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/redeem/RedeemInstructionsView;->setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method

.method private initTitle()V
    .locals 1

    const v0, 0x7f110589

    .line 123
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->setTitle(I)V

    return-void
.end method

.method public static synthetic lambda$showRebatesFound$0(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;Landroid/content/DialogInterface;)V
    .locals 0

    .line 190
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;->onRebatesFoundDisplayed()V

    return-void
.end method

.method public static synthetic lambda$showRebatesFound$1(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;Landroid/content/DialogInterface;)V
    .locals 0

    .line 191
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;->onRebatesFoundDisplayed()V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;

    const-string v1, "retailer_parcel"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;->setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    goto :goto_0

    .line 116
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 117
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;->onNoSavedState()V

    .line 118
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "retailer_parcel"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;->setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private static newIntent(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Landroid/content/Intent;
    .locals 2

    .line 68
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "retailer_parcel"

    .line 69
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-object v0
.end method

.method private onActivityResultOcrReceiptCapture(II)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 248
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;

    invoke-interface {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;->onOcrReceiptCaptureSuccess(I)V

    goto :goto_0

    .line 250
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;->onOcrReceiptCaptureCancelled()V

    :goto_0
    return-void
.end method

.method private onActivityResultReceiptBarcode(ILandroid/content/Intent;)V
    .locals 1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const-string p1, "barcodes"

    .line 236
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 237
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;

    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;->onTakePhotoInstead([Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    const-string p1, "barcodes"

    .line 239
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 240
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;

    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;->onReceiptBarcodeCapturedSuccess([Ljava/lang/String;)V

    goto :goto_0

    .line 242
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;->onReceiptBarcodeCaptureCancelled()V

    :goto_0
    return-void
.end method

.method private onActivityResultStandardReceiptCapture(I)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 256
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;->onStandardReceiptCaptureSuccess()V

    goto :goto_0

    .line 258
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;->onStandardReceiptCaptureCancelled()V

    :goto_0
    return-void
.end method

.method public static start(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    if-nez p0, :cond_0

    return-void

    .line 64
    :cond_0
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->newIntent(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 47
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsComponent;
    .locals 1

    .line 76
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;

    move-result-object v0

    .line 77
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;)V

    .line 78
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;->redeemReqsModule(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;

    move-result-object p1

    .line 79
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsComponent;

    move-result-object p1

    return-object p1
.end method

.method public disableContinueButton()V
    .locals 2

    .line 208
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->bContinue:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public hideProcessingWalmartQrCode()V
    .locals 0

    .line 203
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->hideSubmittedJobLoading()V

    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 47
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsComponent;)V
    .locals 0

    .line 84
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;)V

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 218
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/16 v0, 0x19

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    if-eqz p3, :cond_0

    const-string v0, "verified_count"

    .line 223
    invoke-virtual {p3, v0, p1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    .line 226
    :cond_0
    invoke-direct {p0, p2, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->onActivityResultOcrReceiptCapture(II)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 228
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->onActivityResultStandardReceiptCapture(I)V

    goto :goto_0

    :cond_2
    const/16 v0, 0x8

    if-ne p1, v0, :cond_3

    .line 230
    invoke-direct {p0, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->onActivityResultReceiptBarcode(ILandroid/content/Intent;)V

    :cond_3
    :goto_0
    return-void
.end method

.method protected onContinueClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090084
        }
    .end annotation

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;->onContinueClicked()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 89
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    if-nez p1, :cond_0

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->receiptSubmissionHelper:Lcom/ibotta/android/submission/ReceiptSubmissionHelper;

    invoke-interface {v0}, Lcom/ibotta/android/submission/ReceiptSubmissionHelper;->startSubmission()Ljava/lang/String;

    :cond_0
    const v0, 0x7f0c0063

    .line 95
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->setContentView(I)V

    .line 96
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 98
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->loadState(Landroid/os/Bundle;)V

    .line 100
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 101
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->initDetailedInstructions(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    .line 102
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->windfallGatekeeper:Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;

    invoke-interface {p1}, Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;->prepareForRedemption()V

    .line 104
    :cond_1
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->initTitle()V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 109
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "retailer_parcel"

    .line 110
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method

.method public recognizeWalmartQR(Lcom/microblink/Recognizer;Landroid/net/Uri;Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;)V
    .locals 0

    .line 213
    invoke-virtual {p1, p0, p2, p3}, Lcom/microblink/Recognizer;->recognizeWalmartQR(Landroid/content/Context;Landroid/net/Uri;Lcom/microblink/RecognizerCallback;)V

    return-void
.end method

.method public setGeneralInstructions(I)V
    .locals 3

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 143
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;

    invoke-interface {v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 144
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->tvGenInstructions:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public setGeneralInstructionsTitle(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->tbvGeneralInstructionsTitle:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void
.end method

.method public setImage(I)V
    .locals 1

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->ivRedeemType:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method public showOcrReceiptCaptureForResult(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 1

    .line 162
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->newIntent(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Landroid/content/Intent;

    move-result-object p1

    const/16 v0, 0x19

    .line 163
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public showProcessingWalmartQrCode()V
    .locals 2

    .line 198
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f110588

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->showSubmittedJobLoading(Ljava/lang/String;)V

    return-void
.end method

.method public showRebatesFound(I)V
    .locals 1

    .line 184
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 188
    :cond_0
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;-><init>(Landroid/content/Context;)V

    .line 189
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;->setRebatesFound(I)V

    .line 190
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/-$$Lambda$RedeemReqsActivity$d1mnFUmWLj2uUdmI93nNHPUowfs;

    invoke-direct {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/-$$Lambda$RedeemReqsActivity$d1mnFUmWLj2uUdmI93nNHPUowfs;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;)V

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 191
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/-$$Lambda$RedeemReqsActivity$cQO0y86yu_xFh8612CoNz81iunw;

    invoke-direct {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/-$$Lambda$RedeemReqsActivity$cQO0y86yu_xFh8612CoNz81iunw;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;)V

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 193
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;->show()V

    return-void
.end method

.method public showReceiptScannerForResult(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 1

    .line 155
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanActivity;->newIntent(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Landroid/content/Intent;

    move-result-object p1

    const/16 v0, 0x8

    .line 157
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public showStandardReceiptCaptureForResult(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 1

    .line 168
    new-instance v0, Lcom/ibotta/android/routing/intent/ReceiptCaptureIntentCreator;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/routing/intent/ReceiptCaptureIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/ReceiptCaptureIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    const/4 v0, 0x1

    .line 169
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public showVerifiedRebates(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    .line 179
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->start(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method

.method public showVerifyRebates(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 2

    .line 174
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const/4 v1, 0x1

    invoke-static {p0, p1, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->start(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/Set;Z)V

    return-void
.end method
