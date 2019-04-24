.class public Lcom/ibotta/android/mvp/ui/activity/scan/ScannedBarcode;
.super Ljava/lang/Object;
.source "ScannedBarcode.java"


# instance fields
.field private barcode:Ljava/lang/String;

.field private scanType:Lcom/ibotta/android/barcode/ScanType;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBarcode()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScannedBarcode;->barcode:Ljava/lang/String;

    return-object v0
.end method

.method public getScanType()Lcom/ibotta/android/barcode/ScanType;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScannedBarcode;->scanType:Lcom/ibotta/android/barcode/ScanType;

    return-object v0
.end method

.method public setBarcode(Ljava/lang/String;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScannedBarcode;->barcode:Ljava/lang/String;

    return-void
.end method

.method public setScanType(Lcom/ibotta/android/barcode/ScanType;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScannedBarcode;->scanType:Lcom/ibotta/android/barcode/ScanType;

    return-void
.end method
