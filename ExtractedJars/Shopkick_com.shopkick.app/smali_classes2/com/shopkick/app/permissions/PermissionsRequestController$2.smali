.class Lcom/shopkick/app/permissions/PermissionsRequestController$2;
.super Ljava/lang/Object;
.source "PermissionsRequestController.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/permissions/PermissionsRequestController;->setupCoarseLocationPermissionView(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/permissions/PermissionsRequestController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/permissions/PermissionsRequestController;)V
    .locals 0

    .line 333
    iput-object p1, p0, Lcom/shopkick/app/permissions/PermissionsRequestController$2;->this$0:Lcom/shopkick/app/permissions/PermissionsRequestController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 336
    iget-object p1, p0, Lcom/shopkick/app/permissions/PermissionsRequestController$2;->this$0:Lcom/shopkick/app/permissions/PermissionsRequestController;

    invoke-static {p1}, Lcom/shopkick/app/permissions/PermissionsRequestController;->access$100(Lcom/shopkick/app/permissions/PermissionsRequestController;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/screens/AppScreen;

    if-nez p1, :cond_0

    return-void

    .line 341
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/permissions/PermissionsRequestController$2;->this$0:Lcom/shopkick/app/permissions/PermissionsRequestController;

    const/4 v1, 0x7

    const-string v2, "android.permission.ACCESS_COARSE_LOCATION"

    .line 343
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 341
    invoke-static {v0, v1, v2, v3}, Lcom/shopkick/app/permissions/PermissionsRequestController;->access$200(Lcom/shopkick/app/permissions/PermissionsRequestController;ILjava/lang/String;Landroid/content/Context;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object v0

    .line 344
    iget-object v1, p0, Lcom/shopkick/app/permissions/PermissionsRequestController$2;->this$0:Lcom/shopkick/app/permissions/PermissionsRequestController;

    invoke-static {v1}, Lcom/shopkick/app/permissions/PermissionsRequestController;->access$300(Lcom/shopkick/app/permissions/PermissionsRequestController;)Lcom/shopkick/app/logging/UserEventLogger;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 346
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isSystemLocationEnabled(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 348
    invoke-static {}, Lcom/google/android/gms/location/LocationRequest;->create()Lcom/google/android/gms/location/LocationRequest;

    move-result-object v0

    const/16 v1, 0x66

    .line 349
    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/LocationRequest;->setPriority(I)Lcom/google/android/gms/location/LocationRequest;

    .line 351
    new-instance v1, Lcom/google/android/gms/location/LocationSettingsRequest$Builder;

    invoke-direct {v1}, Lcom/google/android/gms/location/LocationSettingsRequest$Builder;-><init>()V

    invoke-virtual {v1, v0}, Lcom/google/android/gms/location/LocationSettingsRequest$Builder;->addLocationRequest(Lcom/google/android/gms/location/LocationRequest;)Lcom/google/android/gms/location/LocationSettingsRequest$Builder;

    move-result-object v0

    const/4 v1, 0x1

    .line 352
    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/LocationSettingsRequest$Builder;->setAlwaysShow(Z)Lcom/google/android/gms/location/LocationSettingsRequest$Builder;

    .line 354
    sget-object v1, Lcom/google/android/gms/location/LocationServices;->SettingsApi:Lcom/google/android/gms/location/SettingsApi;

    iget-object v2, p0, Lcom/shopkick/app/permissions/PermissionsRequestController$2;->this$0:Lcom/shopkick/app/permissions/PermissionsRequestController;

    .line 355
    invoke-static {v2}, Lcom/shopkick/app/permissions/PermissionsRequestController;->access$400(Lcom/shopkick/app/permissions/PermissionsRequestController;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/location/LocationSettingsRequest$Builder;->build()Lcom/google/android/gms/location/LocationSettingsRequest;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lcom/google/android/gms/location/SettingsApi;->checkLocationSettings(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/LocationSettingsRequest;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    .line 356
    new-instance v1, Lcom/shopkick/app/permissions/PermissionsRequestController$2$1;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/app/permissions/PermissionsRequestController$2$1;-><init>(Lcom/shopkick/app/permissions/PermissionsRequestController$2;Lcom/shopkick/app/screens/AppScreen;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V

    goto :goto_0

    :cond_1
    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    .line 382
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/shopkick/app/permissions/PermissionUtils;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 383
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/shopkick/app/permissions/PermissionUtils;->openSettingsApp(Landroid/content/Context;)V

    :cond_2
    :goto_0
    return-void
.end method
