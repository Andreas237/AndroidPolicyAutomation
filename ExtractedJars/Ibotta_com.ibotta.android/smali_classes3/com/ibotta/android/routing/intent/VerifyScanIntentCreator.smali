.class public Lcom/ibotta/android/routing/intent/VerifyScanIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "VerifyScanIntentCreator.java"


# instance fields
.field private final params:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;

.field private final retailerId:Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/Integer;Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;)V
    .locals 0
    .param p2    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 21
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    .line 22
    iput-object p2, p0, Lcom/ibotta/android/routing/intent/VerifyScanIntentCreator;->retailerId:Ljava/lang/Integer;

    .line 23
    iput-object p3, p0, Lcom/ibotta/android/routing/intent/VerifyScanIntentCreator;->params:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 5

    .line 28
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/VerifyScanIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "params"

    iget-object v2, p0, Lcom/ibotta/android/routing/intent/VerifyScanIntentCreator;->params:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;

    .line 29
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object v0

    .line 31
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/VerifyScanIntentCreator;->retailerId:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    const-string v2, "retailer_id"

    .line 32
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 35
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/VerifyScanIntentCreator;->context:Landroid/content/Context;

    const v2, 0x7f110244

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 36
    new-instance v2, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;

    iget-object v3, p0, Lcom/ibotta/android/routing/intent/VerifyScanIntentCreator;->context:Landroid/content/Context;

    sget-object v4, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->CAMERA:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    invoke-direct {v2, v3, v4, v1, v0}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/state/app/permissions/PermissionProfile;Ljava/lang/String;Landroid/content/Intent;)V

    const/4 v0, 0x0

    .line 37
    invoke-virtual {v2, v0}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->requestCode(I)Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;

    move-result-object v0

    .line 38
    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method
