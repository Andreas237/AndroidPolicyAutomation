.class public Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanPresenterImpl;
.super Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl;
.source "AnyProductScanPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl<",
        "Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanPresenter;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/tracking/Tracker;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/tracking/Tracker;)V

    return-void
.end method


# virtual methods
.method protected getFetchJobs()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getInstructions()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanView;->getInstructions()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getScanConfig()Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;
    .locals 2

    .line 27
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;-><init>()V

    .line 29
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->initWithDefaults()V

    .line 30
    sget-object v1, Lcom/ibotta/android/barcode/ScanType;->EAN13:Lcom/ibotta/android/barcode/ScanType;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->addScanType(Lcom/ibotta/android/barcode/ScanType;)V

    .line 31
    sget-object v1, Lcom/ibotta/android/barcode/ScanType;->EAN8:Lcom/ibotta/android/barcode/ScanType;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->addScanType(Lcom/ibotta/android/barcode/ScanType;)V

    .line 32
    sget-object v1, Lcom/ibotta/android/barcode/ScanType;->UPCA:Lcom/ibotta/android/barcode/ScanType;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->addScanType(Lcom/ibotta/android/barcode/ScanType;)V

    .line 33
    sget-object v1, Lcom/ibotta/android/barcode/ScanType;->UPCE:Lcom/ibotta/android/barcode/ScanType;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->addScanType(Lcom/ibotta/android/barcode/ScanType;)V

    return-object v0
.end method

.method public isBarcodeHelpNeeded()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected isReadyForScanResults()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 0

    return-void
.end method

.method protected onBarcodesParcelized(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;",
            ">;)V"
        }
    .end annotation

    .line 55
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 59
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanView;->playBeepVibrate()V

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanView;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/any/AnyProductScanView;->finishWithBarcode(Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;)V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 0

    return-void
.end method
