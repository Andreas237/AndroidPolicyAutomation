.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceComponent;
.super Ljava/lang/Object;
.source "VerifyDeviceComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceView;",
        "Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDevicePresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;)V
.end method
