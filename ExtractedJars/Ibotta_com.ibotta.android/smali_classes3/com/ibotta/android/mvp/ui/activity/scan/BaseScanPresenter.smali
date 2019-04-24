.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanPresenter;
.super Ljava/lang/Object;
.source "BaseScanPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V::",
        "Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanView;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "TV;>;"
    }
.end annotation


# virtual methods
.method public abstract getInstructions()Ljava/lang/String;
.end method

.method public abstract getScanConfig()Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;
.end method

.method public abstract isBarcodeHelpNeeded()Z
.end method

.method public abstract onBarcodesScanned(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/scan/ScannedBarcode;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onHelpClicked()V
.end method

.method public abstract onManualBarcodeEntered(Ljava/lang/String;)V
.end method

.method public abstract onTurnLightOff()V
.end method

.method public abstract onTurnLightOn()V
.end method
