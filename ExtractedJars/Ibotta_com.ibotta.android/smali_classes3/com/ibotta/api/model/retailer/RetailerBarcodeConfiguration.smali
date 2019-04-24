.class public Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;
.super Ljava/lang/Object;
.source "RetailerBarcodeConfiguration.java"


# instance fields
.field private barcodeName:Ljava/lang/String;

.field private barcodeSizes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Short;",
            ">;"
        }
    .end annotation
.end field

.field private captureMessage:Ljava/lang/String;

.field private exampleUrl:Ljava/lang/String;

.field private helpMessage:Ljava/lang/String;

.field private helpTitle:Ljava/lang/String;

.field private helpUrl:Ljava/lang/String;

.field private iconUrl:Ljava/lang/String;

.field private scanContentRegex:Ljava/lang/String;

.field private scanType:Ljava/lang/String;

.field private scanTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/ScanType;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->barcodeSizes:Ljava/util/Set;

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->scanTypes:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getBarcodeName()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->barcodeName:Ljava/lang/String;

    return-object v0
.end method

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

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 118
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->barcodeSizes:Ljava/util/Set;

    return-object v0
.end method

.method public getCaptureMessage()Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->captureMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getExampleUrl()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->exampleUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getHelpMessage()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->helpMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getHelpTitle()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->helpTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getHelpUrl()Ljava/lang/String;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->helpUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getIconUrl()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getScanContentRegex()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->scanContentRegex:Ljava/lang/String;

    return-object v0
.end method

.method public getScanType()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 40
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->scanType:Ljava/lang/String;

    return-object v0
.end method

.method public getScanTypeEnum()Lcom/ibotta/api/model/common/BarcodeType;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->scanType:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/common/BarcodeType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/common/BarcodeType;

    move-result-object v0

    return-object v0
.end method

.method public getScanTypes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/ScanType;",
            ">;"
        }
    .end annotation

    .line 131
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->scanTypes:Ljava/util/List;

    return-object v0
.end method

.method public setBarcodeName(Ljava/lang/String;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->barcodeName:Ljava/lang/String;

    return-void
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

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 127
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->barcodeSizes:Ljava/util/Set;

    return-void
.end method

.method public setCaptureMessage(Ljava/lang/String;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->captureMessage:Ljava/lang/String;

    return-void
.end method

.method public setExampleUrl(Ljava/lang/String;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->exampleUrl:Ljava/lang/String;

    return-void
.end method

.method public setHelpMessage(Ljava/lang/String;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->helpMessage:Ljava/lang/String;

    return-void
.end method

.method public setHelpTitle(Ljava/lang/String;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->helpTitle:Ljava/lang/String;

    return-void
.end method

.method public setHelpUrl(Ljava/lang/String;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->helpUrl:Ljava/lang/String;

    return-void
.end method

.method public setIconUrl(Ljava/lang/String;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->iconUrl:Ljava/lang/String;

    return-void
.end method

.method public setScanContentRegex(Ljava/lang/String;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->scanContentRegex:Ljava/lang/String;

    return-void
.end method

.method public setScanType(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 49
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->scanType:Ljava/lang/String;

    return-void
.end method

.method public setScanTypes(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/ScanType;",
            ">;)V"
        }
    .end annotation

    .line 135
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->scanTypes:Ljava/util/List;

    return-void
.end method
