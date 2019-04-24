.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureComponent;
.super Ljava/lang/Object;
.source "ReceiptCaptureComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;)V
.end method
