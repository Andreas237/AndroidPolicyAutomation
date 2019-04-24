.class public Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanActivity;
.super Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;
.source "LoyaltyScanActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanView;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanView;"
    }
.end annotation


# static fields
.field public static final RESULT_CODE_SUCCESS:I = 0x1


# instance fields
.field private scanType:Lcom/ibotta/android/barcode/ScanType;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;-><init>()V

    return-void
.end method

.method private iniTitle()V
    .locals 1

    const v0, 0x7f1103f4

    .line 86
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanActivity;->setTitle(I)V

    return-void
.end method

.method private initFooter()V
    .locals 5

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanActivity;->flBottomHalf:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 92
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 94
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070165

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 95
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 96
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 97
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    const/16 v1, 0x31

    .line 98
    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 100
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c0175

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 102
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanActivity;->flBottomHalf:Landroid/widget/FrameLayout;

    invoke-virtual {v2, v1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public static newIntent(Landroid/content/Context;Lcom/ibotta/android/barcode/ScanType;)Landroid/content/Intent;
    .locals 3

    .line 50
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    if-nez p1, :cond_0

    .line 53
    sget-object p1, Lcom/ibotta/android/barcode/ScanType;->UPCA:Lcom/ibotta/android/barcode/ScanType;

    :cond_0
    const-string v1, "scan_type"

    .line 56
    invoke-virtual {p1}, Lcom/ibotta/android/barcode/ScanType;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 58
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object p1

    const v1, 0x7f110249

    invoke-virtual {p1, v1}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 59
    new-instance v1, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;

    sget-object v2, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->CAMERA:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    invoke-direct {v1, p0, v2, p1, v0}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/state/app/permissions/PermissionProfile;Ljava/lang/String;Landroid/content/Intent;)V

    const/4 p0, 0x0

    .line 60
    invoke-virtual {v1, p0}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->requestCode(I)Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;

    move-result-object p0

    .line 61
    invoke-virtual {p0}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->create()Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static startForResult(Landroid/app/Activity;Lcom/ibotta/android/barcode/ScanType;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 45
    :cond_0
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanActivity;->newIntent(Landroid/content/Context;Lcom/ibotta/android/barcode/ScanType;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, 0x7

    .line 46
    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 33
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanComponent;
    .locals 1

    .line 66
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/DaggerLoyaltyScanComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/DaggerLoyaltyScanComponent$Builder;

    move-result-object v0

    .line 67
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/DaggerLoyaltyScanComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/DaggerLoyaltyScanComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanView;)V

    .line 68
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/DaggerLoyaltyScanComponent$Builder;->loyaltyScanModule(Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule;)Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/DaggerLoyaltyScanComponent$Builder;

    move-result-object p1

    .line 69
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/DaggerLoyaltyScanComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanComponent;

    move-result-object p1

    return-object p1
.end method

.method public finishWithBarcodes(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;",
            ">;)V"
        }
    .end annotation

    .line 129
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

    .line 130
    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 132
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const-string v1, "barcodes"

    .line 133
    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Landroid/os/Parcelable;)Landroid/content/Intent;

    const/4 v0, 0x1

    .line 134
    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanActivity;->setResult(ILandroid/content/Intent;)V

    .line 136
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanActivity;->finish()V

    return-void
.end method

.method public getInstructions()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 33
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanComponent;)V
    .locals 0

    .line 74
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanActivity;)V

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

    .line 113
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->loadState(Landroid/os/Bundle;)V

    if-eqz p1, :cond_0

    const-string v0, "scan_type"

    .line 116
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ibotta/android/barcode/ScanType;->fromString(Ljava/lang/String;)Lcom/ibotta/android/barcode/ScanType;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanActivity;->scanType:Lcom/ibotta/android/barcode/ScanType;

    goto :goto_0

    .line 117
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 118
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "scan_type"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ibotta/android/barcode/ScanType;->fromString(Ljava/lang/String;)Lcom/ibotta/android/barcode/ScanType;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanActivity;->scanType:Lcom/ibotta/android/barcode/ScanType;

    .line 120
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanActivity;->scanType:Lcom/ibotta/android/barcode/ScanType;

    if-nez p1, :cond_2

    .line 121
    sget-object p1, Lcom/ibotta/android/barcode/ScanType;->UPCA:Lcom/ibotta/android/barcode/ScanType;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanActivity;->scanType:Lcom/ibotta/android/barcode/ScanType;

    .line 124
    :cond_2
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanPresenter;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanActivity;->scanType:Lcom/ibotta/android/barcode/ScanType;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanPresenter;->setScanType(Lcom/ibotta/android/barcode/ScanType;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 79
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->onCreate(Landroid/os/Bundle;)V

    .line 81
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanActivity;->iniTitle()V

    .line 82
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanActivity;->initFooter()V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 107
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "scan_type"

    .line 108
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanActivity;->scanType:Lcom/ibotta/android/barcode/ScanType;

    invoke-virtual {v1}, Lcom/ibotta/android/barcode/ScanType;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
