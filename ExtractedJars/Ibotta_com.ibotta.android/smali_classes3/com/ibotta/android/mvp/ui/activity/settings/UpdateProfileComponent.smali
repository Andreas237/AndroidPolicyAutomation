.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileComponent;
.super Ljava/lang/Object;
.source "UpdateProfileComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;",
        "Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;)V
.end method
