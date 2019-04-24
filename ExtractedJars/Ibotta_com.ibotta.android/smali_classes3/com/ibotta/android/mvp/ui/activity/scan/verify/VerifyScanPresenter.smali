.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenter;
.super Ljava/lang/Object;
.source "VerifyScanPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract getRetailerId()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract setParams(Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;)V
.end method

.method public abstract setRetailerId(Ljava/lang/Integer;)V
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method
