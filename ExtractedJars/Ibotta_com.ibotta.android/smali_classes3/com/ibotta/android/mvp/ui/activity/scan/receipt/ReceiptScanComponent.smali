.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanComponent;
.super Ljava/lang/Object;
.source "ReceiptScanComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanView;",
        "Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanActivity;)V
.end method
