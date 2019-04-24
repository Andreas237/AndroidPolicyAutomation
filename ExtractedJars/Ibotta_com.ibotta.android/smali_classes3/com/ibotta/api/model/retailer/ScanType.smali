.class public Lcom/ibotta/api/model/retailer/ScanType;
.super Ljava/lang/Object;
.source "ScanType.java"


# instance fields
.field private barcodeSizes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Short;",
            ">;"
        }
    .end annotation
.end field

.field private scanType:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/retailer/ScanType;->barcodeSizes:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public getBarcodeSizes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Short;",
            ">;"
        }
    .end annotation

    .line 28
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/ScanType;->barcodeSizes:Ljava/util/Set;

    return-object v0
.end method

.method public getScanType()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/ScanType;->scanType:Ljava/lang/String;

    return-object v0
.end method

.method public getScanTypeEnum()Lcom/ibotta/api/model/common/BarcodeType;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/ScanType;->scanType:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/common/BarcodeType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/common/BarcodeType;

    move-result-object v0

    return-object v0
.end method

.method public setBarcodeSizes(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Short;",
            ">;)V"
        }
    .end annotation

    .line 32
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/ScanType;->barcodeSizes:Ljava/util/Set;

    return-void
.end method

.method public setScanType(Ljava/lang/String;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/ScanType;->scanType:Ljava/lang/String;

    return-void
.end method
