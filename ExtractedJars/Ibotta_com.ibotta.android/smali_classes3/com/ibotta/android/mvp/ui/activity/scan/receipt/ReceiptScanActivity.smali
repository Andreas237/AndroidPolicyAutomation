.class public Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanActivity;
.super Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;
.source "ReceiptScanActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanView;
.implements Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView$ReceiptScanFooterListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanView;",
        "Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView$ReceiptScanFooterListener;"
    }
.end annotation


# static fields
.field public static final RESULT_CODE_SUCCESS:I = 0x1

.field public static final RESULT_CODE_TAKE_PHOTO_INSTEAD:I = 0x2

.field private static final TAG_FLY_UP_RECEIPT_BARCODE_HELP:Ljava/lang/String; = "fly_up_receipt_barcode_help"


# instance fields
.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;-><init>()V

    return-void
.end method

.method private initTitle()V
    .locals 1

    const v0, 0x7f110579

    .line 109
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanActivity;->setTitle(I)V

    return-void
.end method

.method public static newIntent(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Landroid/content/Intent;
    .locals 3

    .line 59
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "retailer"

    .line 61
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const p1, 0x7f11024a

    .line 63
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 64
    new-instance v1, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;

    sget-object v2, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->CAMERA:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    invoke-direct {v1, p0, v2, p1, v0}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/state/app/permissions/PermissionProfile;Ljava/lang/String;Landroid/content/Intent;)V

    const/4 p0, 0x0

    .line 65
    invoke-virtual {v1, p0}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->requestCode(I)Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;

    move-result-object p0

    .line 66
    invoke-virtual {p0}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->create()Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static startForResult(Landroid/app/Activity;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 54
    :cond_0
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanActivity;->newIntent(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, 0x7

    .line 55
    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 39
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanComponent;
    .locals 1

    .line 71
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/DaggerReceiptScanComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/scan/receipt/DaggerReceiptScanComponent$Builder;

    move-result-object v0

    .line 72
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/DaggerReceiptScanComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/scan/receipt/DaggerReceiptScanComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanView;)V

    .line 73
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/DaggerReceiptScanComponent$Builder;->receiptScanModule(Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanModule;)Lcom/ibotta/android/mvp/ui/activity/scan/receipt/DaggerReceiptScanComponent$Builder;

    move-result-object p1

    .line 74
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/DaggerReceiptScanComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanComponent;

    move-result-object p1

    return-object p1
.end method

.method public finishWithSuccess([Ljava/lang/String;)V
    .locals 2

    .line 143
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "barcodes"

    .line 144
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    const/4 p1, 0x1

    .line 145
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanActivity;->setResult(ILandroid/content/Intent;)V

    .line 147
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanActivity;->finish()V

    return-void
.end method

.method public finishWithTakePhotoInstead([Ljava/lang/String;)V
    .locals 2

    .line 152
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanActivity;->stopCamera()V

    .line 155
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "barcodes"

    .line 156
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    const/4 p1, 0x2

    .line 157
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanActivity;->setResult(ILandroid/content/Intent;)V

    .line 159
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanActivity;->finish()V

    return-void
.end method

.method public getFlyUpPageCreator(Ljava/lang/String;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;
    .locals 2

    const-string v0, "fly_up_receipt_barcode_help"

    .line 193
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 194
    new-instance p1, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenter;

    .line 196
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenter;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getRetailerBarcodeConfigurationParcel()Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanActivity;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-direct {p1, p2, v0, v1}, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;-><init>(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;Lcom/ibotta/android/images/ImageCache;)V

    goto :goto_0

    .line 199
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->getFlyUpPageCreator(Ljava/lang/String;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public getInstructions()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public hideHelp()V
    .locals 2

    .line 186
    sget-object v0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v1, "fly_up_receipt_barcode_help"

    invoke-virtual {v0, p0, v1}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->hide(Lcom/ibotta/android/activity/CompatSupplier;Ljava/lang/String;)V

    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 39
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanComponent;)V
    .locals 0

    .line 79
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanActivity;)V

    return-void
.end method

.method public isAlertSound()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isAlertVibrate()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected loadState(Landroid/os/Bundle;)V
    .locals 1

    .line 97
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->loadState(Landroid/os/Bundle;)V

    if-eqz p1, :cond_0

    const-string v0, "retailer"

    .line 100
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    goto :goto_0

    .line 101
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 102
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "retailer"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 105
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenter;->setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 84
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->onCreate(Landroid/os/Bundle;)V

    .line 86
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanActivity;->initTitle()V

    return-void
.end method

.method public onFlyUpCancel(Ljava/lang/String;I)Z
    .locals 1

    const-string v0, "fly_up_receipt_barcode_help"

    .line 209
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    .line 212
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->onFlyUpCancel(Ljava/lang/String;I)Z

    move-result p1

    :goto_0
    return p1
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 91
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "retailer"

    .line 92
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenter;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method

.method public onTakePhotoInsteadClicked()V
    .locals 1

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenter;->onTakePhotoInsteadClicked()V

    return-void
.end method

.method public setFooter(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 3

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanActivity;->flBottomHalf:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 116
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 118
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070165

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 119
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 120
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 121
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    const/16 v1, 0x31

    .line 122
    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 124
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;-><init>(Landroid/content/Context;)V

    .line 125
    invoke-virtual {v1, p0}, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->setListener(Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView$ReceiptScanFooterListener;)V

    .line 126
    invoke-virtual {v1, p1, p2}, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 128
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanActivity;->flBottomHalf:Landroid/widget/FrameLayout;

    invoke-virtual {p1, v1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public showHelp(Ljava/lang/String;)V
    .locals 2

    const/4 p1, 0x0

    const/4 v0, 0x1

    .line 179
    invoke-static {p1, v0, p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->newInstance(IZZ)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;

    move-result-object p1

    .line 180
    invoke-virtual {p1, p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 181
    sget-object v0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v1, "fly_up_receipt_barcode_help"

    invoke-virtual {v0, p0, p1, v1}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void
.end method

.method public showInvalidBarcode()V
    .locals 3

    const v0, 0x7f110578

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 138
    invoke-virtual {p0, v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanActivity;->showQuickMessage(IZZ)V

    return-void
.end method
