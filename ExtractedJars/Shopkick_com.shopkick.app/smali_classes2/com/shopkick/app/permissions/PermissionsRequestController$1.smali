.class Lcom/shopkick/app/permissions/PermissionsRequestController$1;
.super Ljava/lang/Object;
.source "PermissionsRequestController.java"

# interfaces
.implements Lcom/google/android/gms/common/api/ResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/permissions/PermissionsRequestController;->maybeShowNextPermissionRequestDialog(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/common/api/ResultCallback<",
        "Lcom/google/android/gms/location/LocationSettingsResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/permissions/PermissionsRequestController;

.field final synthetic val$appScreen:Lcom/shopkick/app/screens/AppScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/permissions/PermissionsRequestController;Lcom/shopkick/app/screens/AppScreen;)V
    .locals 0

    .line 286
    iput-object p1, p0, Lcom/shopkick/app/permissions/PermissionsRequestController$1;->this$0:Lcom/shopkick/app/permissions/PermissionsRequestController;

    iput-object p2, p0, Lcom/shopkick/app/permissions/PermissionsRequestController$1;->val$appScreen:Lcom/shopkick/app/screens/AppScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic lambda$onResult$50(Lcom/google/android/gms/location/LocationSettingsResult;Lcom/shopkick/app/screens/AppScreen;)V
    .locals 6
    .param p0    # Lcom/google/android/gms/location/LocationSettingsResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 291
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/location/LocationSettingsResult;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object p0

    .line 292
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x6

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 296
    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/common/api/Status;->startResolutionForResult(Landroid/app/Activity;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    move-object v3, p0

    .line 303
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p0

    .line 304
    invoke-virtual {p0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object p0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 305
    invoke-virtual {p0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v4, "PermissionsRequestController: checkHighAccuracyLocationSettings callback failed"

    const/4 p0, 0x0

    new-array v5, p0, [Ljava/lang/Object;

    invoke-virtual/range {v0 .. v5}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public bridge synthetic onResult(Lcom/google/android/gms/common/api/Result;)V
    .locals 0
    .param p1    # Lcom/google/android/gms/common/api/Result;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 286
    check-cast p1, Lcom/google/android/gms/location/LocationSettingsResult;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/permissions/PermissionsRequestController$1;->onResult(Lcom/google/android/gms/location/LocationSettingsResult;)V

    return-void
.end method

.method public onResult(Lcom/google/android/gms/location/LocationSettingsResult;)V
    .locals 3
    .param p1    # Lcom/google/android/gms/location/LocationSettingsResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 289
    iget-object v0, p0, Lcom/shopkick/app/permissions/PermissionsRequestController$1;->this$0:Lcom/shopkick/app/permissions/PermissionsRequestController;

    invoke-static {v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->access$000(Lcom/shopkick/app/permissions/PermissionsRequestController;)Ljava/util/concurrent/Executor;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/permissions/PermissionsRequestController$1;->val$appScreen:Lcom/shopkick/app/screens/AppScreen;

    new-instance v2, Lcom/shopkick/app/permissions/-$$Lambda$PermissionsRequestController$1$LLgVr4sniOAXhnAv1sM8YGoJ-O4;

    invoke-direct {v2, p1, v1}, Lcom/shopkick/app/permissions/-$$Lambda$PermissionsRequestController$1$LLgVr4sniOAXhnAv1sM8YGoJ-O4;-><init>(Lcom/google/android/gms/location/LocationSettingsResult;Lcom/shopkick/app/screens/AppScreen;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
