.class public Lcom/ibotta/android/permissions/PermissionStrategyManagerImpl;
.super Ljava/lang/Object;
.source "PermissionStrategyManagerImpl.java"

# interfaces
.implements Lcom/ibotta/android/permissions/PermissionStrategyManager;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# instance fields
.field private final authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

.field private final permissionStrategyMultiton:Lcom/ibotta/android/permissions/PermissionStrategyMultiton;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/permissions/PermissionStrategyMultiton;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/permissions/PermissionStrategyManagerImpl;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 27
    iput-object p2, p0, Lcom/ibotta/android/permissions/PermissionStrategyManagerImpl;->permissionStrategyMultiton:Lcom/ibotta/android/permissions/PermissionStrategyMultiton;

    return-void
.end method


# virtual methods
.method public checkPermissionsForArea(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/permissions/Permission;Lcom/ibotta/android/state/app/permissions/Area;)Z
    .locals 2

    .line 42
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {p2}, Lcom/ibotta/android/permissions/Permission;->getPermissionProfile()Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/App;->hasPermission(Lcom/ibotta/android/state/app/permissions/PermissionProfile;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string p1, "User has already granted permission for: %1$s"

    const/4 p3, 0x1

    .line 43
    new-array v0, p3, [Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/ibotta/android/permissions/Permission;->getPermissionProfile()Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    move-result-object p2

    aput-object p2, v0, v1

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return p3

    .line 48
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionStrategyManagerImpl;->permissionStrategyMultiton:Lcom/ibotta/android/permissions/PermissionStrategyMultiton;

    invoke-virtual {v0, p2}, Lcom/ibotta/android/permissions/PermissionStrategyMultiton;->getInstance(Lcom/ibotta/android/permissions/Permission;)Lcom/ibotta/android/permissions/PermissionStrategy;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 50
    invoke-interface {p2, p1, p3}, Lcom/ibotta/android/permissions/PermissionStrategy;->checkPermissionsForArea(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/permissions/Area;)Z

    move-result v1

    :cond_1
    return v1
.end method

.method public deleteAll()V
    .locals 5

    .line 75
    invoke-static {}, Lcom/ibotta/android/permissions/Permission;->values()[Lcom/ibotta/android/permissions/Permission;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 76
    iget-object v4, p0, Lcom/ibotta/android/permissions/PermissionStrategyManagerImpl;->permissionStrategyMultiton:Lcom/ibotta/android/permissions/PermissionStrategyMultiton;

    invoke-virtual {v4, v3}, Lcom/ibotta/android/permissions/PermissionStrategyMultiton;->getInstance(Lcom/ibotta/android/permissions/Permission;)Lcom/ibotta/android/permissions/PermissionStrategy;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 78
    invoke-interface {v3}, Lcom/ibotta/android/permissions/PermissionStrategy;->delete()V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public onLogOut(Z)V
    .locals 0

    .line 85
    invoke-virtual {p0}, Lcom/ibotta/android/permissions/PermissionStrategyManagerImpl;->deleteAll()V

    return-void
.end method

.method public trackNewSession()V
    .locals 5

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionStrategyManagerImpl;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/auth/AuthManager;->isAuthenticated()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 65
    :cond_0
    invoke-static {}, Lcom/ibotta/android/permissions/Permission;->values()[Lcom/ibotta/android/permissions/Permission;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    .line 66
    iget-object v4, p0, Lcom/ibotta/android/permissions/PermissionStrategyManagerImpl;->permissionStrategyMultiton:Lcom/ibotta/android/permissions/PermissionStrategyMultiton;

    invoke-virtual {v4, v3}, Lcom/ibotta/android/permissions/PermissionStrategyMultiton;->getInstance(Lcom/ibotta/android/permissions/Permission;)Lcom/ibotta/android/permissions/PermissionStrategy;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 68
    invoke-interface {v3}, Lcom/ibotta/android/permissions/PermissionStrategy;->trackNewSession()V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method
