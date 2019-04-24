.class public Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenterImpl;
.super Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl;
.source "ReceiptScanPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl<",
        "Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenter;"
    }
.end annotation


# instance fields
.field private barcodes:[Ljava/lang/String;

.field private final receiptScanReducer:Lcom/ibotta/android/redeem/scan/ReceiptScanReducer;

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/redeem/scan/ReceiptScanReducer;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/tracking/Tracker;)V

    .line 37
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenterImpl;->receiptScanReducer:Lcom/ibotta/android/redeem/scan/ReceiptScanReducer;

    return-void
.end method

.method private findValidBarcode([Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_6

    .line 141
    array-length v1, p1

    if-gtz v1, :cond_0

    goto :goto_3

    .line 146
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getRetailerBarcodeConfigurationParcel()Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->getScanContentRegex()Ljava/lang/String;

    move-result-object v1

    .line 148
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 149
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v0

    .line 152
    :goto_0
    array-length v2, p1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_5

    aget-object v4, p1, v3

    if-eqz v1, :cond_2

    .line 153
    invoke-virtual {v1, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    move-result v5

    if-eqz v5, :cond_3

    :cond_2
    move-object v0, v4

    :cond_3
    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    :goto_2
    return-object v0

    :cond_6
    :goto_3
    return-object v0
.end method

.method private getActiveSymbolCounts(Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;)[S
    .locals 3

    .line 82
    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;->getBarcodeSizes()Ljava/util/Set;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 84
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 88
    :cond_0
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v0

    new-array v0, v0, [S

    .line 90
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    .line 92
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 93
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Short;

    invoke-virtual {v2}, Ljava/lang/Short;->shortValue()S

    move-result v2

    aput-short v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private getScanTypeParcels()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;",
            ">;"
        }
    .end annotation

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 64
    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getRetailerBarcodeConfigurationParcel()Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->getScanTypeParcels()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 66
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 68
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 70
    new-instance v1, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;

    invoke-direct {v1}, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;-><init>()V

    .line 71
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getRetailerBarcodeConfigurationParcel()Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->getScanType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;->setScanType(Ljava/lang/String;)V

    .line 72
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getRetailerBarcodeConfigurationParcel()Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->getBarcodeSizes()Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;->setBarcodeSizes(Ljava/util/Set;)V

    .line 74
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    return-object v0
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

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanView;->getInstructions()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .locals 1

    .line 190
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-object v0
.end method

.method public getScanConfig()Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;
    .locals 4

    .line 42
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;-><init>()V

    .line 44
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->initWithDefaults()V

    .line 46
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenterImpl;->getScanTypeParcels()Ljava/util/List;

    move-result-object v1

    .line 48
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;

    .line 49
    invoke-virtual {v2}, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;->getScanTypeEnum()Lcom/ibotta/api/model/common/BarcodeType;

    move-result-object v3

    invoke-static {v3}, Lcom/ibotta/android/barcode/ScanType;->fromBarcodeType(Lcom/ibotta/api/model/common/BarcodeType;)Lcom/ibotta/android/barcode/ScanType;

    move-result-object v3

    .line 50
    invoke-virtual {v0, v3}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->addScanType(Lcom/ibotta/android/barcode/ScanType;)V

    .line 51
    invoke-direct {p0, v2}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenterImpl;->getActiveSymbolCounts(Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;)[S

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->setActiveSymbolCounts(Lcom/ibotta/android/barcode/ScanType;[S)V

    .line 54
    sget-object v2, Lcom/ibotta/android/barcode/ScanType;->UPCA:Lcom/ibotta/android/barcode/ScanType;

    if-ne v3, v2, :cond_0

    .line 55
    sget-object v2, Lcom/ibotta/android/barcode/ScanType;->EAN13:Lcom/ibotta/android/barcode/ScanType;

    invoke-virtual {v0, v2}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->addScanType(Lcom/ibotta/android/barcode/ScanType;)V

    goto :goto_0

    :cond_1
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
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 117
    new-array v1, v0, [Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 119
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    .line 120
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 121
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

    invoke-virtual {v3}, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;->getUpc()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 128
    :cond_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenterImpl;->barcodes:[Ljava/lang/String;

    .line 130
    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenterImpl;->findValidBarcode([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    .line 133
    new-array v1, v1, [Ljava/lang/String;

    aput-object p1, v1, v0

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenterImpl;->barcodes:[Ljava/lang/String;

    .line 134
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenterImpl;->barcodes:[Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanView;->finishWithSuccess([Ljava/lang/String;)V

    goto :goto_1

    .line 136
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanView;->showInvalidBarcode()V

    :goto_1
    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 0

    return-void
.end method

.method public onTakePhotoInsteadClicked()V
    .locals 2

    .line 195
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenterImpl;->barcodes:[Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanView;->finishWithTakePhotoInstead([Ljava/lang/String;)V

    return-void
.end method

.method public setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 3

    .line 183
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 184
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenterImpl;->receiptScanReducer:Lcom/ibotta/android/redeem/scan/ReceiptScanReducer;

    .line 186
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getRetailerBarcodeConfigurationParcel()Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->getBarcodeName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/redeem/scan/ReceiptScanReducer;->createTitle(Ljava/lang/String;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v1

    .line 184
    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanView;->setFooter(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void
.end method
