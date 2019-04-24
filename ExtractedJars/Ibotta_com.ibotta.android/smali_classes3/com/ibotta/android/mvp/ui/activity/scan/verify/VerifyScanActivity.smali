.class public Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;
.super Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;
.source "VerifyScanActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;"
    }
.end annotation


# static fields
.field public static final RESULT_CODE_GAVE_UP:I = 0x2

.field public static final RESULT_CODE_SUCCESS:I = 0x1


# instance fields
.field protected fcmState:Lcom/ibotta/android/state/app/fcm/FcmState;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private params:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;

.field private spvScanProducts:Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;-><init>()V

    return-void
.end method

.method private initScanProducts()V
    .locals 3

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->flBottomHalf:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 129
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 131
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070165

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 133
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->spvScanProducts:Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;

    .line 134
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->flBottomHalf:Landroid/widget/FrameLayout;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->spvScanProducts:Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;

    invoke-virtual {v1, v2, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private initTitle(I)V
    .locals 3

    if-lez p1, :cond_0

    const v0, 0x7f11066b

    const/4 v1, 0x1

    .line 120
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->setTitle(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    const p1, 0x7f11066a

    .line 122
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->setTitle(I)V

    :goto_0
    return-void
.end method

.method private static newIntent(Landroid/content/Context;Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;)Landroid/content/Intent;
    .locals 3

    .line 54
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "params"

    .line 55
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const p1, 0x7f110244

    .line 57
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 58
    new-instance v1, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;

    sget-object v2, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->CAMERA:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    invoke-direct {v1, p0, v2, p1, v0}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/state/app/permissions/PermissionProfile;Ljava/lang/String;Landroid/content/Intent;)V

    const/4 p0, 0x0

    .line 59
    invoke-virtual {v1, p0}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->requestCode(I)Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;

    move-result-object p0

    .line 60
    invoke-virtual {p0}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->create()Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static startForResult(Landroid/app/Activity;Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 49
    :cond_0
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->newIntent(Landroid/content/Context;Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;)Landroid/content/Intent;

    move-result-object p1

    const/16 v0, 0xc

    .line 50
    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 33
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanComponent;
    .locals 1

    .line 65
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;

    move-result-object v0

    .line 66
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;)V

    .line 67
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;->verifyScanModule(Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule;)Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;

    move-result-object p1

    .line 68
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanComponent;

    move-result-object p1

    return-object p1
.end method

.method public finishWithGaveUp(Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;I)V
    .locals 2

    .line 177
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "last_barcode"

    .line 178
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p1, "offer_id"

    .line 179
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/4 p1, 0x2

    .line 181
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->setResult(ILandroid/content/Intent;)V

    .line 182
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->finish()V

    return-void
.end method

.method public finishWithSuccess(I)V
    .locals 2

    .line 168
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "offer_id"

    .line 169
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/4 p1, 0x1

    .line 171
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->setResult(ILandroid/content/Intent;)V

    .line 172
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->finish()V

    return-void
.end method

.method public getBarcodeScanInstructions()Ljava/lang/String;
    .locals 1

    const v0, 0x7f110667

    .line 139
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 33
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanComponent;)V
    .locals 0

    .line 73
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;)V

    return-void
.end method

.method public isAlertSound()Z
    .locals 1

    .line 192
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->fcmState:Lcom/ibotta/android/state/app/fcm/FcmState;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/fcm/FcmState;->isAlertSound()Z

    move-result v0

    return v0
.end method

.method public isAlertVibrate()Z
    .locals 1

    .line 187
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->fcmState:Lcom/ibotta/android/state/app/fcm/FcmState;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/fcm/FcmState;->isAlertVibrate()Z

    move-result v0

    return v0
.end method

.method protected loadState(Landroid/os/Bundle;)V
    .locals 2

    .line 97
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->loadState(Landroid/os/Bundle;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string v1, "params"

    .line 102
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->params:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;

    const-string v1, "retailer_id"

    .line 104
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "retailer_id"

    .line 105
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    .line 107
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 108
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "params"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->params:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;

    .line 110
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "retailer_id"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 111
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "retailer_id"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 115
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenter;->setRetailerId(Ljava/lang/Integer;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 78
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->onCreate(Landroid/os/Bundle;)V

    const/4 p1, 0x0

    .line 80
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->initTitle(I)V

    .line 81
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->initScanProducts()V

    .line 83
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenter;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->params:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenter;->setParams(Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;)V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 88
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "params"

    .line 89
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->params:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenter;->getRetailerId()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v0, "retailer_id"

    .line 91
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenter;->getRetailerId()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method public setup(Ljava/lang/String;Ljava/lang/String;II)V
    .locals 1

    .line 144
    invoke-direct {p0, p3}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->initTitle(I)V

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->spvScanProducts:Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->setup(Ljava/lang/String;Ljava/lang/String;II)V

    return-void
.end method

.method public showAlreadyMatched()V
    .locals 2

    .line 162
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->hideHelp()V

    const v0, 0x7f110666

    const/4 v1, 0x0

    .line 163
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->showQuickMessage(IZ)V

    return-void
.end method

.method public showMatch()V
    .locals 2

    .line 150
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->hideHelp()V

    const v0, 0x7f110668

    const/4 v1, 0x0

    .line 151
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->showQuickMessage(IZ)V

    return-void
.end method

.method public showMismatch()V
    .locals 3

    .line 156
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->hideHelp()V

    const v0, 0x7f110669

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 157
    invoke-virtual {p0, v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;->showQuickMessage(IZZ)V

    return-void
.end method
