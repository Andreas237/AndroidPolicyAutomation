.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateComponent;
.super Ljava/lang/Object;
.source "PermissionsGateComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/MvpComponent;


# annotations
.annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
.end annotation

.annotation runtime Ldagger/Component;
    dependencies = {
        Lcom/ibotta/android/di/MainComponent;
    }
    modules = {
        Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateView;",
        "Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGatePresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;)V
.end method
