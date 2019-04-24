.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerComponent;
.super Ljava/lang/Object;
.source "ReceiptViewerComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;",
        "Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;)V
.end method
