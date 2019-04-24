.class public Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanPresenterImpl;
.super Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl;
.source "LoyaltyScanPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl<",
        "Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanPresenter;"
    }
.end annotation


# instance fields
.field private scanType:Lcom/ibotta/android/barcode/ScanType;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/tracking/Tracker;)V
    .locals 0

    .line 24
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

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanView;->getInstructions()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getScanConfig()Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;
    .locals 3

    .line 29
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;-><init>()V

    .line 31
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->initWithDefaults()V

    .line 32
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanPresenterImpl;->scanType:Lcom/ibotta/android/barcode/ScanType;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->addScanType(Lcom/ibotta/android/barcode/ScanType;)V

    .line 35
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanPresenterImpl;->scanType:Lcom/ibotta/android/barcode/ScanType;

    sget-object v2, Lcom/ibotta/android/barcode/ScanType;->UPCA:Lcom/ibotta/android/barcode/ScanType;

    if-ne v1, v2, :cond_0

    .line 36
    sget-object v1, Lcom/ibotta/android/barcode/ScanType;->EAN13:Lcom/ibotta/android/barcode/ScanType;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->addScanType(Lcom/ibotta/android/barcode/ScanType;)V

    :cond_0
    return-object v0
.end method

.method public isBarcodeHelpNeeded()Z
    .locals 1

    const/4 v0, 0x0

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
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;",
            ">;)V"
        }
    .end annotation

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanView;->finishWithBarcodes(Ljava/util/List;)V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 0

    return-void
.end method

.method public setScanType(Lcom/ibotta/android/barcode/ScanType;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanPresenterImpl;->scanType:Lcom/ibotta/android/barcode/ScanType;

    return-void
.end method
