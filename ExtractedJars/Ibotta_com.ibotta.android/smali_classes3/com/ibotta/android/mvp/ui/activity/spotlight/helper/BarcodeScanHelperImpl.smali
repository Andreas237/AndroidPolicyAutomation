.class public Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelperImpl;
.super Ljava/lang/Object;
.source "BarcodeScanHelperImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;


# instance fields
.field private failedVerificationBarcode:Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

.field private failedVerificationProductImagePath:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCustomerOffersUpcsPostCall(II)Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall;
    .locals 1

    .line 35
    new-instance v0, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;

    invoke-direct {v0}, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;-><init>()V

    .line 36
    invoke-virtual {v0, p1}, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;->setCustomerId(I)V

    .line 37
    invoke-virtual {v0, p2}, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;->setOfferId(I)V

    .line 38
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelperImpl;->getPaddedBarcode()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;->setUpc(Ljava/lang/String;)V

    .line 39
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelperImpl;->failedVerificationBarcode:Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;->getBarcodeTypeEnum()Lcom/ibotta/api/model/common/BarcodeType;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;->setBarcodeType(Lcom/ibotta/api/model/common/BarcodeType;)V

    .line 40
    new-instance p1, Ljava/io/File;

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelperImpl;->failedVerificationProductImagePath:Ljava/lang/String;

    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;->setProductImage(Ljava/io/File;)V

    .line 42
    new-instance p1, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall;

    invoke-direct {p1, v0}, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall;-><init>(Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;)V

    return-object p1
.end method

.method public getFailedVerificationBarcode()Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelperImpl;->failedVerificationBarcode:Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

    return-object v0
.end method

.method public getFailedVerificationProductImagePath()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelperImpl;->failedVerificationProductImagePath:Ljava/lang/String;

    return-object v0
.end method

.method public getPaddedBarcode()Ljava/lang/String;
    .locals 4

    const-string v0, "%14s"

    const/4 v1, 0x1

    .line 47
    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelperImpl;->failedVerificationBarcode:Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

    invoke-virtual {v2}, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;->getUpc()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x20

    const/16 v2, 0x30

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setFailedVerificationBarcode(Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelperImpl;->failedVerificationBarcode:Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

    return-void
.end method

.method public setFailedVerificationProductImagePath(Ljava/lang/String;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelperImpl;->failedVerificationProductImagePath:Ljava/lang/String;

    return-void
.end method
