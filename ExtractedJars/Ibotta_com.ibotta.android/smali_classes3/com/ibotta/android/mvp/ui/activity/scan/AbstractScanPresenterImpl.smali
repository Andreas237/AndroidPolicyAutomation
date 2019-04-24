.class public abstract Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "AbstractScanPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V::",
        "Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanView;",
        ">",
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "TV;>;",
        "Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanPresenter<",
        "TV;>;"
    }
.end annotation


# instance fields
.field private cameraStarted:Z

.field private lastManualBarcode:Ljava/lang/String;

.field protected final tracker:Lcom/ibotta/android/tracking/Tracker;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/tracking/Tracker;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 32
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl;->tracker:Lcom/ibotta/android/tracking/Tracker;

    return-void
.end method

.method private captureScannedBarcode(Lcom/ibotta/android/mvp/ui/activity/scan/ScannedBarcode;Lcom/ibotta/android/barcode/ScanType;)Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;
    .locals 3

    .line 89
    invoke-virtual {p2}, Lcom/ibotta/android/barcode/ScanType;->getBarcodeType()Lcom/ibotta/api/model/common/BarcodeType;

    move-result-object p2

    .line 90
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/scan/ScannedBarcode;->getBarcode()Ljava/lang/String;

    move-result-object p1

    .line 92
    sget-object v0, Lcom/ibotta/api/model/common/BarcodeType;->UPCE:Lcom/ibotta/api/model/common/BarcodeType;

    if-ne p2, v0, :cond_1

    .line 95
    sget-object p2, Lcom/ibotta/api/model/common/BarcodeType;->UPCA:Lcom/ibotta/api/model/common/BarcodeType;

    .line 97
    invoke-static {p1}, Lcom/ibotta/android/util/UPCEUtils;->isUPCE(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 98
    invoke-static {p1}, Lcom/ibotta/android/util/UPCEUtils;->convertUPCEtoUPCA(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string v1, "scanned_upce"

    const-string v2, "manually_converted"

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 101
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string v1, "scanned_upce"

    const-string v2, "auto_converted"

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    :cond_1
    :goto_0
    new-instance v0, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

    invoke-direct {v0}, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;-><init>()V

    .line 106
    invoke-virtual {v0, p1}, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;->setUpc(Ljava/lang/String;)V

    .line 107
    invoke-static {p2}, Lcom/ibotta/api/model/common/BarcodeType;->toApiName(Lcom/ibotta/api/model/common/BarcodeType;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;->setBarcodeType(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method protected abstract isReadyForScanResults()Z
.end method

.method protected abstract onBarcodesParcelized(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;",
            ">;)V"
        }
    .end annotation
.end method

.method public onBarcodesScanned(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/scan/ScannedBarcode;",
            ">;)V"
        }
    .end annotation

    .line 67
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl;->isLoading()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl;->isReadyForScanResults()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 72
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 74
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/scan/ScannedBarcode;

    .line 75
    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/scan/ScannedBarcode;->getScanType()Lcom/ibotta/android/barcode/ScanType;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 81
    :cond_1
    invoke-direct {p0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl;->captureScannedBarcode(Lcom/ibotta/android/mvp/ui/activity/scan/ScannedBarcode;Lcom/ibotta/android/barcode/ScanType;)Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

    move-result-object v1

    .line 82
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 85
    :cond_2
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl;->onBarcodesParcelized(Ljava/util/List;)V

    return-void

    :cond_3
    :goto_1
    return-void
.end method

.method public onHelpClicked()V
    .locals 2

    .line 124
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl;->lastManualBarcode:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanView;->showHelp(Ljava/lang/String;)V

    return-void
.end method

.method public onManualBarcodeEntered(Ljava/lang/String;)V
    .locals 4

    .line 129
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl;->lastManualBarcode:Ljava/lang/String;

    .line 131
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 134
    invoke-static {p1}, Lcom/ibotta/android/util/UPCEUtils;->isUPCE(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 135
    invoke-static {p1}, Lcom/ibotta/android/util/UPCEUtils;->convertUPCEtoUPCA(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "Detected UPCE. Converted to UPCA: %1$s"

    .line 137
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v1, v3

    invoke-static {v2, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    :cond_0
    new-instance v1, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

    invoke-direct {v1}, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;-><init>()V

    .line 141
    invoke-virtual {v1, p1}, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;->setUpc(Ljava/lang/String;)V

    .line 143
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 145
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl;->onBarcodesParcelized(Ljava/util/List;)V

    return-void
.end method

.method public onPause()V
    .locals 0

    .line 43
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl;->stopCamera()V

    .line 44
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 0

    .line 37
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onResume()V

    .line 38
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl;->startCamera()V

    return-void
.end method

.method public onTurnLightOff()V
    .locals 2

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanView;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanView;->setLightOn(Z)V

    return-void
.end method

.method public onTurnLightOn()V
    .locals 2

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanView;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanView;->setLightOn(Z)V

    return-void
.end method

.method protected startCamera()V
    .locals 1

    .line 48
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl;->cameraStarted:Z

    if-eqz v0, :cond_0

    return-void

    .line 52
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanView;->startCamera()V

    const/4 v0, 0x1

    .line 53
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl;->cameraStarted:Z

    return-void
.end method

.method protected stopCamera()V
    .locals 1

    .line 57
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl;->cameraStarted:Z

    if-nez v0, :cond_0

    return-void

    .line 61
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanView;->stopCamera()V

    const/4 v0, 0x0

    .line 62
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl;->cameraStarted:Z

    return-void
.end method
