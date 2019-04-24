.class public Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "PermissionsGateIntentCreator.java"


# instance fields
.field private final afterIntent:Landroid/content/Intent;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final permissionProfile:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

.field private final reason:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private requestCode:Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private skipGatedDialog:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/state/app/permissions/PermissionProfile;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 32
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->skipGatedDialog:Z

    .line 53
    iput-object p2, p0, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->permissionProfile:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    const/4 p1, 0x0

    .line 54
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->reason:Ljava/lang/String;

    .line 55
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->afterIntent:Landroid/content/Intent;

    const/4 p1, 0x1

    .line 56
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->skipGatedDialog:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/state/app/permissions/PermissionProfile;Ljava/lang/String;Landroid/content/Intent;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 32
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->skipGatedDialog:Z

    .line 40
    iput-object p2, p0, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->permissionProfile:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    .line 41
    iput-object p3, p0, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->reason:Ljava/lang/String;

    .line 42
    iput-object p4, p0, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->afterIntent:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 3

    .line 66
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->permissionProfile:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/App;->hasPermission(Lcom/ibotta/android/state/app/permissions/PermissionProfile;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->afterIntent:Landroid/content/Intent;

    if-eqz v0, :cond_0

    return-object v0

    .line 70
    :cond_0
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "permission_profile"

    .line 71
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->permissionProfile:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    invoke-virtual {v2}, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "reason"

    .line 72
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->reason:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "after_intent"

    .line 73
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->afterIntent:Landroid/content/Intent;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string v1, "allow_skip"

    .line 74
    iget-boolean v2, p0, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->skipGatedDialog:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 75
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->requestCode:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    const-string v2, "request_code"

    .line 76
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    :cond_1
    return-object v0
.end method

.method public requestCode(I)Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;
    .locals 0

    .line 60
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->requestCode:Ljava/lang/Integer;

    return-object p0
.end method
