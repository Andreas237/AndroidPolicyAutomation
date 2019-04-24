.class public Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanActivity;
.super Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;
.source "AnyProductScanActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanView;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanView;"
    }
.end annotation


# static fields
.field public static final RESULT_CODE_SUCCESS:I = 0x1


# instance fields
.field protected fcmState:Lcom/ibotta/android/state/app/fcm/FcmState;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;-><init>()V

    return-void
.end method

.method private iniTitle()V
    .locals 1

    const v0, 0x7f1100a5

    .line 70
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanActivity;->setTitle(I)V

    return-void
.end method

.method private static newIntent(Landroid/content/Context;)Landroid/content/Intent;
    .locals 4

    .line 42
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 43
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v1

    const v2, 0x7f110244

    invoke-virtual {v1, v2}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 44
    new-instance v2, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;

    sget-object v3, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->CAMERA:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    invoke-direct {v2, p0, v3, v1, v0}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/state/app/permissions/PermissionProfile;Ljava/lang/String;Landroid/content/Intent;)V

    const/4 p0, 0x0

    .line 45
    invoke-virtual {v2, p0}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->requestCode(I)Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;

    move-result-object p0

    .line 46
    invoke-virtual {p0}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->create()Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static startForResult(Landroid/app/Activity;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    .line 37
    :cond_0
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanActivity;->newIntent(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x4

    .line 38
    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 26
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanComponent;
    .locals 1

    .line 51
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/scan/any/DaggerAnyProductScanComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/scan/any/DaggerAnyProductScanComponent$Builder;

    move-result-object v0

    .line 52
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/any/DaggerAnyProductScanComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/scan/any/DaggerAnyProductScanComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanView;)V

    .line 53
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/any/DaggerAnyProductScanComponent$Builder;->anyProductScanModule(Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanModule;)Lcom/ibotta/android/mvp/ui/activity/scan/any/DaggerAnyProductScanComponent$Builder;

    move-result-object p1

    .line 54
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/scan/any/DaggerAnyProductScanComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanComponent;

    move-result-object p1

    return-object p1
.end method

.method public finishWithBarcode(Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;)V
    .locals 2

    .line 75
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "barcode"

    .line 76
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const/4 p1, 0x1

    .line 77
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanActivity;->setResult(ILandroid/content/Intent;)V

    .line 79
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanActivity;->finish()V

    return-void
.end method

.method public getInstructions()Ljava/lang/String;
    .locals 1

    const v0, 0x7f1100a4

    .line 84
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 26
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanComponent;)V
    .locals 0

    .line 59
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanActivity;)V

    return-void
.end method

.method public isAlertSound()Z
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanActivity;->fcmState:Lcom/ibotta/android/state/app/fcm/FcmState;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/fcm/FcmState;->isAlertSound()Z

    move-result v0

    return v0
.end method

.method public isAlertVibrate()Z
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanActivity;->fcmState:Lcom/ibotta/android/state/app/fcm/FcmState;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/fcm/FcmState;->isAlertVibrate()Z

    move-result v0

    return v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 64
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->onCreate(Landroid/os/Bundle;)V

    .line 66
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanActivity;->iniTitle()V

    return-void
.end method
