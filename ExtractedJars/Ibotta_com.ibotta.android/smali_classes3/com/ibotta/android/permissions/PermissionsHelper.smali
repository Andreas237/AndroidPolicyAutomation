.class public interface abstract Lcom/ibotta/android/permissions/PermissionsHelper;
.super Ljava/lang/Object;
.source "PermissionsHelper.java"


# virtual methods
.method public abstract hasLocationPermissions(Landroid/content/Context;)Z
.end method

.method public abstract hasPermission(Landroid/content/Context;Ljava/lang/String;)Z
.end method

.method public abstract isPermanentlyDenied(Lcom/ibotta/android/state/app/permissions/PermissionProfile;)Z
.end method

.method public abstract onRequestPermissionsResult(I[Ljava/lang/String;[I)V
.end method

.method public abstract requestLocationPermissionDirectly()V
.end method

.method public abstract requestPermissions()V
.end method
