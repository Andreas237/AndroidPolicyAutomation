.class public Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;
.super Ljava/lang/Object;
.source "RetailerBarcodeConfigurationParcel.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


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

.field private scanTypeParcels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 41
    new-instance v0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel$1;

    invoke-direct {v0}, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->barcodeSizes:Ljava/util/Set;

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->scanTypeParcels:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->barcodeSizes:Ljava/util/Set;

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->scanTypeParcels:Ljava/util/List;

    .line 37
    invoke-virtual {p0, p1}, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->readFromParcel(Landroid/os/Parcel;)V

    return-void
.end method

.method public static convert([Landroid/os/Parcelable;)[Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;
    .locals 5

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 269
    :goto_0
    array-length v3, p0

    if-ge v1, v3, :cond_2

    .line 270
    aget-object v3, p0, v1

    instance-of v3, v3, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;

    if-eqz v3, :cond_1

    add-int/lit8 v2, v2, 0x1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 275
    :cond_2
    new-array v1, v2, [Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;

    const/4 v2, 0x0

    .line 278
    :goto_1
    array-length v3, p0

    if-ge v0, v3, :cond_4

    .line 279
    aget-object v3, p0, v0

    instance-of v3, v3, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;

    if-eqz v3, :cond_3

    add-int/lit8 v3, v2, 0x1

    .line 280
    aget-object v4, p0, v0

    check-cast v4, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;

    aput-object v4, v1, v2

    move v2, v3

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    return-object v1
.end method

.method public static fromRetailerBarcodeConfiguration(Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;)Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 241
    :cond_0
    new-instance v0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;

    invoke-direct {v0}, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;-><init>()V

    .line 243
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->getBarcodeName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->setBarcodeName(Ljava/lang/String;)V

    .line 244
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->getScanType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->setScanType(Ljava/lang/String;)V

    .line 245
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->getScanContentRegex()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->setScanContentRegex(Ljava/lang/String;)V

    .line 246
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->getHelpTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->setHelpTitle(Ljava/lang/String;)V

    .line 247
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->getHelpMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->setHelpMessage(Ljava/lang/String;)V

    .line 248
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->getCaptureMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->setCaptureMessage(Ljava/lang/String;)V

    .line 249
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->getIconUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->setIconUrl(Ljava/lang/String;)V

    .line 250
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->getExampleUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->setExampleUrl(Ljava/lang/String;)V

    .line 251
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->getHelpUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->setHelpUrl(Ljava/lang/String;)V

    .line 252
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->getBarcodeSizes()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->setBarcodeSizes(Ljava/util/Set;)V

    .line 254
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 255
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;->getScanTypes()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/retailer/ScanType;

    .line 256
    invoke-static {v2}, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;->fromScanType(Lcom/ibotta/api/model/retailer/ScanType;)Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 258
    :cond_1
    invoke-virtual {v0, v1}, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->setScanTypeParcels(Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getBarcodeName()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->barcodeName:Ljava/lang/String;

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

    .line 154
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->barcodeSizes:Ljava/util/Set;

    return-object v0
.end method

.method public getCaptureMessage()Ljava/lang/String;
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->captureMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getExampleUrl()Ljava/lang/String;
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->exampleUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getHelpMessage()Ljava/lang/String;
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->helpMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getHelpTitle()Ljava/lang/String;
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->helpTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getHelpUrl()Ljava/lang/String;
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->helpUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getIconUrl()Ljava/lang/String;
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getScanContentRegex()Ljava/lang/String;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->scanContentRegex:Ljava/lang/String;

    return-object v0
.end method

.method public getScanType()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->scanType:Ljava/lang/String;

    return-object v0
.end method

.method public getScanTypeParcels()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;",
            ">;"
        }
    .end annotation

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->scanTypeParcels:Ljava/util/List;

    return-object v0
.end method

.method public isQrCode()Z
    .locals 3

    .line 52
    invoke-virtual {p0}, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->getScanTypeParcels()Ljava/util/List;

    move-result-object v0

    .line 55
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;

    .line 56
    invoke-virtual {v1}, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;->getScanTypeEnum()Lcom/ibotta/api/model/common/BarcodeType;

    move-result-object v1

    .line 57
    sget-object v2, Lcom/ibotta/api/model/common/BarcodeType;->QR:Lcom/ibotta/api/model/common/BarcodeType;

    if-ne v2, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public readFromParcel(Landroid/os/Parcel;)V
    .locals 5

    .line 210
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->barcodeName:Ljava/lang/String;

    .line 211
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->scanType:Ljava/lang/String;

    .line 212
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->scanContentRegex:Ljava/lang/String;

    .line 213
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->helpTitle:Ljava/lang/String;

    .line 214
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->helpMessage:Ljava/lang/String;

    .line 215
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->captureMessage:Ljava/lang/String;

    .line 216
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->iconUrl:Ljava/lang/String;

    .line 217
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->exampleUrl:Ljava/lang/String;

    .line 218
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->helpUrl:Ljava/lang/String;

    .line 220
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    .line 222
    iget-object v1, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->barcodeSizes:Ljava/util/Set;

    if-nez v1, :cond_0

    .line 223
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->barcodeSizes:Ljava/util/Set;

    .line 225
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->barcodeSizes:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 226
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget v3, v0, v2

    .line 227
    iget-object v4, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->barcodeSizes:Ljava/util/Set;

    int-to-short v3, v3

    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 230
    :cond_1
    const-class v0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;

    .line 231
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelableArray(Ljava/lang/ClassLoader;)[Landroid/os/Parcelable;

    move-result-object p1

    .line 230
    invoke-static {p1}, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;->convert([Landroid/os/Parcelable;)[Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;

    move-result-object p1

    .line 232
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->scanTypeParcels:Ljava/util/List;

    return-void
.end method

.method public setBarcodeName(Ljava/lang/String;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->barcodeName:Ljava/lang/String;

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

    .line 163
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->barcodeSizes:Ljava/util/Set;

    return-void
.end method

.method public setCaptureMessage(Ljava/lang/String;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->captureMessage:Ljava/lang/String;

    return-void
.end method

.method public setExampleUrl(Ljava/lang/String;)V
    .locals 0

    .line 137
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->exampleUrl:Ljava/lang/String;

    return-void
.end method

.method public setHelpMessage(Ljava/lang/String;)V
    .locals 0

    .line 113
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->helpMessage:Ljava/lang/String;

    return-void
.end method

.method public setHelpTitle(Ljava/lang/String;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->helpTitle:Ljava/lang/String;

    return-void
.end method

.method public setHelpUrl(Ljava/lang/String;)V
    .locals 0

    .line 145
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->helpUrl:Ljava/lang/String;

    return-void
.end method

.method public setIconUrl(Ljava/lang/String;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->iconUrl:Ljava/lang/String;

    return-void
.end method

.method public setScanContentRegex(Ljava/lang/String;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->scanContentRegex:Ljava/lang/String;

    return-void
.end method

.method public setScanType(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 89
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->scanType:Ljava/lang/String;

    return-void
.end method

.method public setScanTypeParcels(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;",
            ">;)V"
        }
    .end annotation

    .line 171
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->scanTypeParcels:Ljava/util/List;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 181
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->barcodeName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 182
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->scanType:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 183
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->scanContentRegex:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 184
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->helpTitle:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 185
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->helpMessage:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 186
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->captureMessage:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 187
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->iconUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 188
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->exampleUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 189
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->helpUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 191
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->barcodeSizes:Ljava/util/Set;

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 192
    :goto_0
    new-array p2, p2, [I

    .line 194
    iget-object v1, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->barcodeSizes:Ljava/util/Set;

    if-eqz v1, :cond_1

    .line 195
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 196
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 197
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Short;

    invoke-virtual {v2}, Ljava/lang/Short;->shortValue()S

    move-result v2

    aput v2, p2, v0

    goto :goto_1

    .line 202
    :cond_1
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 204
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->scanTypeParcels:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    new-array p2, p2, [Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;

    .line 205
    iget-object v1, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->scanTypeParcels:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 206
    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelableArray([Landroid/os/Parcelable;I)V

    return-void
.end method
