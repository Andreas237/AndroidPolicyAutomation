.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanComponent;
.super Ljava/lang/Object;
.source "AnyProductScanComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanView;",
        "Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanActivity;)V
.end method
