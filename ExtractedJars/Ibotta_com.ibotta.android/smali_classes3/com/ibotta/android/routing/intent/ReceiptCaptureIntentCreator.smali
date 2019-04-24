.class public Lcom/ibotta/android/routing/intent/ReceiptCaptureIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "ReceiptCaptureIntentCreator.java"


# instance fields
.field private final retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    .line 24
    iput-object p2, p0, Lcom/ibotta/android/routing/intent/ReceiptCaptureIntentCreator;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 5

    .line 29
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/ReceiptCaptureIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "retailer"

    .line 30
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/ReceiptCaptureIntentCreator;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 32
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/ReceiptCaptureIntentCreator;->context:Landroid/content/Context;

    const v2, 0x7f11024b

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 33
    new-instance v2, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;

    iget-object v3, p0, Lcom/ibotta/android/routing/intent/ReceiptCaptureIntentCreator;->context:Landroid/content/Context;

    sget-object v4, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->CAMERA:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    invoke-direct {v2, v3, v4, v1, v0}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/state/app/permissions/PermissionProfile;Ljava/lang/String;Landroid/content/Intent;)V

    const/4 v0, 0x0

    .line 34
    invoke-virtual {v2, v0}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->requestCode(I)Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;

    move-result-object v0

    .line 35
    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method
