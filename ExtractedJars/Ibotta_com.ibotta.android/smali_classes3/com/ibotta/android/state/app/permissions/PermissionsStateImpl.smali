.class public Lcom/ibotta/android/state/app/permissions/PermissionsStateImpl;
.super Ljava/lang/Object;
.source "PermissionsStateImpl.java"

# interfaces
.implements Lcom/ibotta/android/state/app/permissions/PermissionsState;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field protected static final KEY_PERMISSION_PREVIOUSLY_ASKED:Ljava/lang/String; = "permission_previously_asked_%1$s"


# instance fields
.field private final prefs:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/SharedPreferences;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/state/app/permissions/PermissionsStateImpl;->prefs:Landroid/content/SharedPreferences;

    return-void
.end method


# virtual methods
.method public getSharedPreferences()Landroid/content/SharedPreferences;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/state/app/permissions/PermissionsStateImpl;->prefs:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public isPermissionGranted(Landroid/content/Context;Lcom/ibotta/android/state/app/permissions/PermissionProfile;)Z
    .locals 4

    .line 43
    invoke-virtual {p2}, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->getPermissions()[Ljava/lang/String;

    move-result-object p2

    array-length v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p2, v2

    .line 44
    invoke-static {p1, v3}, Landroid/support/v4/content/PermissionChecker;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    if-eqz v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public isPermissionPreviouslyAsked(Lcom/ibotta/android/state/app/permissions/PermissionProfile;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 28
    iget-object v1, p0, Lcom/ibotta/android/state/app/permissions/PermissionsStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/state/app/permissions/PermissionsStateImpl;->makeKey(Lcom/ibotta/android/state/app/permissions/PermissionProfile;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method protected makeKey(Lcom/ibotta/android/state/app/permissions/PermissionProfile;)Ljava/lang/String;
    .locals 3

    const-string v0, "permission_previously_asked_%1$s"

    const/4 v1, 0x1

    .line 54
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public setPermissionPreviouslyAsked(Lcom/ibotta/android/state/app/permissions/PermissionProfile;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 36
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/state/app/permissions/PermissionsStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 37
    invoke-virtual {p0, p1}, Lcom/ibotta/android/state/app/permissions/PermissionsStateImpl;->makeKey(Lcom/ibotta/android/state/app/permissions/PermissionProfile;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x1

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 38
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
