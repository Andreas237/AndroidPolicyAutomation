.class public interface abstract Lcom/ibotta/android/permissions/PermissionStrategyManager;
.super Ljava/lang/Object;
.source "PermissionStrategyManager.java"

# interfaces
.implements Lcom/ibotta/android/state/user/LogOutListener;


# virtual methods
.method public abstract checkPermissionsForArea(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/permissions/Permission;Lcom/ibotta/android/state/app/permissions/Area;)Z
.end method

.method public abstract deleteAll()V
.end method

.method public abstract trackNewSession()V
.end method
