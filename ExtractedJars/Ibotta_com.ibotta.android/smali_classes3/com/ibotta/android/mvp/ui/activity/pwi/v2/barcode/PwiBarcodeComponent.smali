.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeComponent;
.super Ljava/lang/Object;
.source "PwiBarcodeComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;)V
.end method
