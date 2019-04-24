.class public Lcom/ibotta/android/fragment/retailer/RetailerParcel;
.super Ljava/lang/Object;
.source "RetailerParcel.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field private allowedViewports:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private anyBrand:Z

.field private anyBrandFullUrl:Ljava/lang/String;

.field private anyBrandIconUrl:Ljava/lang/String;

.field private auxiliaryLoyaltyEnabled:Z

.field private barcode:Z

.field private buttonSdkId:Ljava/lang/String;

.field private cardIdType:Lcom/ibotta/api/model/RetailerModel$CardIdType;

.field private cardInputType:Lcom/ibotta/api/model/RetailerModel$CardInputType;

.field private cardLinkButtonText:Ljava/lang/String;

.field private cardLinkText:Ljava/lang/String;

.field private cardLinkTitle:Ljava/lang/String;

.field private cardLinked:Z

.field private cardName:Ljava/lang/String;

.field private cardSignupCompletionUrl:Ljava/lang/String;

.field private cardSignupUrl:Ljava/lang/String;

.field private credentialIntegration:Z

.field private creditPendingPeriod:Ljava/lang/String;

.field private dasherizedName:Ljava/lang/String;

.field private deviceOcrEnabled:Z

.field private deviceOcrPreverify:Z

.field private featureParcels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/apiandroid/home/FeatureParcel;",
            ">;"
        }
    .end annotation
.end field

.field private hotness:D

.field private iconUrl:Ljava/lang/String;

.field private id:I

.field private largeCardLogoUrl:Ljava/lang/String;

.field private largeIconUrl:Ljava/lang/String;

.field private modelCImageUrl:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private nearby:Z

.field private receiptFallbackEnabled:Z

.field private receiptFormats:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ibotta/api/model/receipt/ReceiptFormat;",
            ">;"
        }
    .end annotation
.end field

.field private redemptionMeta:Lcom/ibotta/api/model/retailer/RedemptionMeta;

.field private retailerBarcodeConfigurationParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;

.field private retailerTerms:Ljava/lang/String;

.field private shortDescription:Ljava/lang/String;

.field private verificationType:Lcom/ibotta/api/model/common/VerificationType;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 371
    new-instance v0, Lcom/ibotta/android/fragment/retailer/RetailerParcel$1;

    invoke-direct {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->allowedViewports:Ljava/util/Set;

    .line 63
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->featureParcels:Ljava/util/List;

    .line 64
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->receiptFormats:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->allowedViewports:Ljava/util/Set;

    .line 63
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->featureParcels:Ljava/util/List;

    .line 64
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->receiptFormats:Ljava/util/Set;

    .line 70
    invoke-virtual {p0, p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->readFromParcel(Landroid/os/Parcel;)V

    return-void
.end method

.method public static convert([Landroid/os/Parcelable;)[Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .locals 5

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 535
    :goto_0
    array-length v3, p0

    if-ge v1, v3, :cond_2

    .line 536
    aget-object v3, p0, v1

    instance-of v3, v3, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    if-eqz v3, :cond_1

    add-int/lit8 v2, v2, 0x1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 541
    :cond_2
    new-array v1, v2, [Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    const/4 v2, 0x0

    .line 543
    :goto_1
    array-length v3, p0

    if-ge v0, v3, :cond_4

    .line 544
    aget-object v3, p0, v0

    instance-of v3, v3, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    if-eqz v3, :cond_3

    add-int/lit8 v3, v2, 0x1

    .line 545
    aget-object v4, p0, v0

    check-cast v4, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    aput-object v4, v1, v2

    move v2, v3

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    return-object v1
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getAllowedViewports()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 330
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->allowedViewports:Ljava/util/Set;

    return-object v0
.end method

.method public getAnyBrandFullUrl()Ljava/lang/String;
    .locals 1

    .line 218
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->anyBrandFullUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getAnyBrandIconUrl()Ljava/lang/String;
    .locals 1

    .line 210
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->anyBrandIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getButtonSdkId()Ljava/lang/String;
    .locals 1

    .line 250
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->buttonSdkId:Ljava/lang/String;

    return-object v0
.end method

.method public getCardIdType()Lcom/ibotta/api/model/RetailerModel$CardIdType;
    .locals 1

    .line 170
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardIdType:Lcom/ibotta/api/model/RetailerModel$CardIdType;

    return-object v0
.end method

.method public getCardInputType()Lcom/ibotta/api/model/RetailerModel$CardInputType;
    .locals 1

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardInputType:Lcom/ibotta/api/model/RetailerModel$CardInputType;

    return-object v0
.end method

.method public getCardLinkButtonText()Ljava/lang/String;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardLinkButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public getCardLinkText()Ljava/lang/String;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardLinkText:Ljava/lang/String;

    return-object v0
.end method

.method public getCardLinkTitle()Ljava/lang/String;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardLinkTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getCardName()Ljava/lang/String;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardName:Ljava/lang/String;

    return-object v0
.end method

.method public getCardSignupCompletionUrl()Ljava/lang/String;
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardSignupCompletionUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getCardSignupUrl()Ljava/lang/String;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardSignupUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getCreditPendingPeriod()Ljava/lang/String;
    .locals 1

    .line 282
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->creditPendingPeriod:Ljava/lang/String;

    return-object v0
.end method

.method public getDasherizedName()Ljava/lang/String;
    .locals 1

    .line 234
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->dasherizedName:Ljava/lang/String;

    return-object v0
.end method

.method public getFeatureParcels()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/apiandroid/home/FeatureParcel;",
            ">;"
        }
    .end annotation

    .line 355
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->featureParcels:Ljava/util/List;

    return-object v0
.end method

.method public getHotness()D
    .locals 2

    .line 314
    iget-wide v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->hotness:D

    return-wide v0
.end method

.method public getIconUrl()Ljava/lang/String;
    .locals 1

    .line 226
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 74
    iget v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->id:I

    return v0
.end method

.method public getLargeCardLogoUrl()Ljava/lang/String;
    .locals 1

    .line 274
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->largeCardLogoUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getLargeIconUrl()Ljava/lang/String;
    .locals 1

    .line 258
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->largeIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getModelCImageUrl()Ljava/lang/String;
    .locals 1

    .line 266
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->modelCImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getReceiptFormats()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/api/model/receipt/ReceiptFormat;",
            ">;"
        }
    .end annotation

    .line 363
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->receiptFormats:Ljava/util/Set;

    return-object v0
.end method

.method public getRedemptionMeta()Lcom/ibotta/api/model/retailer/RedemptionMeta;
    .locals 1

    .line 338
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->redemptionMeta:Lcom/ibotta/api/model/retailer/RedemptionMeta;

    return-object v0
.end method

.method public getRetailerBarcodeConfigurationParcel()Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;
    .locals 1

    .line 346
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->retailerBarcodeConfigurationParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;

    return-object v0
.end method

.method public getRetailerTerms()Ljava/lang/String;
    .locals 1

    .line 290
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->retailerTerms:Ljava/lang/String;

    return-object v0
.end method

.method public getShortDescription()Ljava/lang/String;
    .locals 1

    .line 242
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->shortDescription:Ljava/lang/String;

    return-object v0
.end method

.method public getVerificationType()Lcom/ibotta/api/model/common/VerificationType;
    .locals 1

    .line 194
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->verificationType:Lcom/ibotta/api/model/common/VerificationType;

    return-object v0
.end method

.method public isAnyBrand()Z
    .locals 1

    .line 202
    iget-boolean v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->anyBrand:Z

    return v0
.end method

.method public isAuxiliaryLoyaltyEnabled()Z
    .locals 1

    .line 146
    iget-boolean v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->auxiliaryLoyaltyEnabled:Z

    return v0
.end method

.method public isBarcode()Z
    .locals 1

    .line 186
    iget-boolean v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->barcode:Z

    return v0
.end method

.method public isCardLinked()Z
    .locals 1

    .line 162
    iget-boolean v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardLinked:Z

    return v0
.end method

.method public isCredentialIntegration()Z
    .locals 1

    .line 138
    iget-boolean v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->credentialIntegration:Z

    return v0
.end method

.method public isDeviceOcrEnabled()Z
    .locals 1

    .line 298
    iget-boolean v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->deviceOcrEnabled:Z

    return v0
.end method

.method public isDeviceOcrPreverify()Z
    .locals 1

    .line 306
    iget-boolean v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->deviceOcrPreverify:Z

    return v0
.end method

.method public isNearby()Z
    .locals 1

    .line 322
    iget-boolean v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->nearby:Z

    return v0
.end method

.method public isReceiptFallbackEnabled()Z
    .locals 1

    .line 154
    iget-boolean v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->receiptFallbackEnabled:Z

    return v0
.end method

.method public readFromParcel(Landroid/os/Parcel;)V
    .locals 5

    .line 462
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->id:I

    .line 463
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->name:Ljava/lang/String;

    .line 464
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardName:Ljava/lang/String;

    .line 465
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardLinkTitle:Ljava/lang/String;

    .line 466
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardLinkText:Ljava/lang/String;

    .line 467
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardLinkButtonText:Ljava/lang/String;

    .line 468
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardSignupUrl:Ljava/lang/String;

    .line 469
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardSignupCompletionUrl:Ljava/lang/String;

    .line 470
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->credentialIntegration:Z

    .line 471
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->auxiliaryLoyaltyEnabled:Z

    .line 472
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    iput-boolean v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->receiptFallbackEnabled:Z

    .line 473
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_3

    const/4 v0, 0x1

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    iput-boolean v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardLinked:Z

    .line 474
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/api/model/RetailerModel$CardIdType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/RetailerModel$CardIdType;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardIdType:Lcom/ibotta/api/model/RetailerModel$CardIdType;

    .line 475
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/api/model/RetailerModel$CardInputType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/RetailerModel$CardInputType;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardInputType:Lcom/ibotta/api/model/RetailerModel$CardInputType;

    .line 476
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_4

    const/4 v0, 0x1

    goto :goto_4

    :cond_4
    const/4 v0, 0x0

    :goto_4
    iput-boolean v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->barcode:Z

    .line 477
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/api/model/common/VerificationType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->verificationType:Lcom/ibotta/api/model/common/VerificationType;

    .line 478
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_5

    const/4 v0, 0x1

    goto :goto_5

    :cond_5
    const/4 v0, 0x0

    :goto_5
    iput-boolean v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->anyBrand:Z

    .line 479
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->anyBrandIconUrl:Ljava/lang/String;

    .line 480
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->anyBrandFullUrl:Ljava/lang/String;

    .line 481
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->iconUrl:Ljava/lang/String;

    .line 482
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->dasherizedName:Ljava/lang/String;

    .line 483
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->shortDescription:Ljava/lang/String;

    .line 484
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->buttonSdkId:Ljava/lang/String;

    .line 485
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->largeIconUrl:Ljava/lang/String;

    .line 486
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->modelCImageUrl:Ljava/lang/String;

    .line 487
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->largeCardLogoUrl:Ljava/lang/String;

    .line 488
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->creditPendingPeriod:Ljava/lang/String;

    .line 489
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_6

    const/4 v0, 0x1

    goto :goto_6

    :cond_6
    const/4 v0, 0x0

    :goto_6
    iput-boolean v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->deviceOcrEnabled:Z

    .line 490
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_7

    const/4 v0, 0x1

    goto :goto_7

    :cond_7
    const/4 v0, 0x0

    :goto_7
    iput-boolean v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->deviceOcrPreverify:Z

    .line 491
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v3

    iput-wide v3, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->hotness:D

    .line 492
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_8

    goto :goto_8

    :cond_8
    const/4 v2, 0x0

    :goto_8
    iput-boolean v2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->nearby:Z

    .line 493
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->retailerTerms:Ljava/lang/String;

    .line 495
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 497
    new-instance v2, Ljava/util/HashSet;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->allowedViewports:Ljava/util/Set;

    .line 500
    :cond_9
    new-instance v0, Lcom/ibotta/api/model/retailer/RedemptionMeta;

    invoke-direct {v0}, Lcom/ibotta/api/model/retailer/RedemptionMeta;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->redemptionMeta:Lcom/ibotta/api/model/retailer/RedemptionMeta;

    .line 501
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->redemptionMeta:Lcom/ibotta/api/model/retailer/RedemptionMeta;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ibotta/api/model/retailer/RedemptionMeta;->setRedeemString(Ljava/lang/String;)V

    .line 502
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->redemptionMeta:Lcom/ibotta/api/model/retailer/RedemptionMeta;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ibotta/api/model/retailer/RedemptionMeta;->setReceiptName(Ljava/lang/String;)V

    .line 503
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->redemptionMeta:Lcom/ibotta/api/model/retailer/RedemptionMeta;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/ibotta/api/model/retailer/RedemptionMeta;->setMaxReceiptAgeDays(I)V

    .line 504
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->redemptionMeta:Lcom/ibotta/api/model/retailer/RedemptionMeta;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ibotta/api/model/retailer/RedemptionMeta;->setOnlinePostTitle(Ljava/lang/String;)V

    .line 505
    iget-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->redemptionMeta:Lcom/ibotta/api/model/retailer/RedemptionMeta;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ibotta/api/model/retailer/RedemptionMeta;->setOnlinePostDesc(Ljava/lang/String;)V

    .line 507
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 509
    iget-object v2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->redemptionMeta:Lcom/ibotta/api/model/retailer/RedemptionMeta;

    new-instance v3, Ljava/util/ArrayList;

    .line 510
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 509
    invoke-virtual {v2, v3}, Lcom/ibotta/api/model/retailer/RedemptionMeta;->setAdditionalRedemptionInstructions(Ljava/util/List;)V

    .line 513
    :cond_a
    const-class v0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->retailerBarcodeConfigurationParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;

    .line 515
    const-class v0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 516
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelableArray(Ljava/lang/ClassLoader;)[Landroid/os/Parcelable;

    move-result-object v0

    .line 515
    invoke-static {v0}, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->convert([Landroid/os/Parcelable;)[Lcom/ibotta/android/apiandroid/home/FeatureParcel;

    move-result-object v0

    .line 517
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->featureParcels:Ljava/util/List;

    .line 519
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_b

    .line 521
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->receiptFormats:Ljava/util/Set;

    .line 523
    array-length v0, p1

    :goto_9
    if-ge v1, v0, :cond_b

    aget-object v2, p1, v1

    .line 524
    iget-object v3, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->receiptFormats:Ljava/util/Set;

    invoke-static {v2}, Lcom/ibotta/api/model/receipt/ReceiptFormat;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/receipt/ReceiptFormat;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_b
    return-void
.end method

.method public setAllowedViewports(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 334
    iput-object p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->allowedViewports:Ljava/util/Set;

    return-void
.end method

.method public setAnyBrand(Z)V
    .locals 0

    .line 206
    iput-boolean p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->anyBrand:Z

    return-void
.end method

.method public setAnyBrandFullUrl(Ljava/lang/String;)V
    .locals 0

    .line 222
    iput-object p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->anyBrandFullUrl:Ljava/lang/String;

    return-void
.end method

.method public setAnyBrandIconUrl(Ljava/lang/String;)V
    .locals 0

    .line 214
    iput-object p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->anyBrandIconUrl:Ljava/lang/String;

    return-void
.end method

.method public setAuxiliaryLoyaltyEnabled(Z)V
    .locals 0

    .line 150
    iput-boolean p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->auxiliaryLoyaltyEnabled:Z

    return-void
.end method

.method public setBarcode(Z)V
    .locals 0

    .line 190
    iput-boolean p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->barcode:Z

    return-void
.end method

.method public setButtonSdkId(Ljava/lang/String;)V
    .locals 0

    .line 254
    iput-object p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->buttonSdkId:Ljava/lang/String;

    return-void
.end method

.method public setCardIdType(Lcom/ibotta/api/model/RetailerModel$CardIdType;)V
    .locals 0

    .line 174
    iput-object p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardIdType:Lcom/ibotta/api/model/RetailerModel$CardIdType;

    return-void
.end method

.method public setCardInputType(Lcom/ibotta/api/model/RetailerModel$CardInputType;)V
    .locals 0

    .line 182
    iput-object p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardInputType:Lcom/ibotta/api/model/RetailerModel$CardInputType;

    return-void
.end method

.method public setCardLinkButtonText(Ljava/lang/String;)V
    .locals 0

    .line 118
    iput-object p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardLinkButtonText:Ljava/lang/String;

    return-void
.end method

.method public setCardLinkText(Ljava/lang/String;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardLinkText:Ljava/lang/String;

    return-void
.end method

.method public setCardLinkTitle(Ljava/lang/String;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardLinkTitle:Ljava/lang/String;

    return-void
.end method

.method public setCardLinked(Z)V
    .locals 0

    .line 166
    iput-boolean p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardLinked:Z

    return-void
.end method

.method public setCardName(Ljava/lang/String;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardName:Ljava/lang/String;

    return-void
.end method

.method public setCardSignupCompletionUrl(Ljava/lang/String;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardSignupCompletionUrl:Ljava/lang/String;

    return-void
.end method

.method public setCardSignupUrl(Ljava/lang/String;)V
    .locals 0

    .line 126
    iput-object p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardSignupUrl:Ljava/lang/String;

    return-void
.end method

.method public setCredentialIntegration(Z)V
    .locals 0

    .line 142
    iput-boolean p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->credentialIntegration:Z

    return-void
.end method

.method public setCreditPendingPeriod(Ljava/lang/String;)V
    .locals 0

    .line 286
    iput-object p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->creditPendingPeriod:Ljava/lang/String;

    return-void
.end method

.method public setDasherizedName(Ljava/lang/String;)V
    .locals 0

    .line 238
    iput-object p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->dasherizedName:Ljava/lang/String;

    return-void
.end method

.method public setDeviceOcrEnabled(Z)V
    .locals 0

    .line 302
    iput-boolean p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->deviceOcrEnabled:Z

    return-void
.end method

.method public setDeviceOcrPreverify(Z)V
    .locals 0

    .line 310
    iput-boolean p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->deviceOcrPreverify:Z

    return-void
.end method

.method public setFeatureParcels(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/apiandroid/home/FeatureParcel;",
            ">;)V"
        }
    .end annotation

    .line 359
    iput-object p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->featureParcels:Ljava/util/List;

    return-void
.end method

.method public setHotness(D)V
    .locals 0

    .line 318
    iput-wide p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->hotness:D

    return-void
.end method

.method public setIconUrl(Ljava/lang/String;)V
    .locals 0

    .line 230
    iput-object p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->iconUrl:Ljava/lang/String;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 78
    iput p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->id:I

    return-void
.end method

.method public setLargeCardLogoUrl(Ljava/lang/String;)V
    .locals 0

    .line 278
    iput-object p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->largeCardLogoUrl:Ljava/lang/String;

    return-void
.end method

.method public setLargeIconUrl(Ljava/lang/String;)V
    .locals 0

    .line 262
    iput-object p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->largeIconUrl:Ljava/lang/String;

    return-void
.end method

.method public setModelCImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 270
    iput-object p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->modelCImageUrl:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->name:Ljava/lang/String;

    return-void
.end method

.method public setNearby(Z)V
    .locals 0

    .line 326
    iput-boolean p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->nearby:Z

    return-void
.end method

.method public setReceiptFallbackEnabled(Z)V
    .locals 0

    .line 158
    iput-boolean p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->receiptFallbackEnabled:Z

    return-void
.end method

.method public setReceiptFormats(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/ibotta/api/model/receipt/ReceiptFormat;",
            ">;)V"
        }
    .end annotation

    .line 367
    iput-object p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->receiptFormats:Ljava/util/Set;

    return-void
.end method

.method public setRedemptionMeta(Lcom/ibotta/api/model/retailer/RedemptionMeta;)V
    .locals 0

    .line 342
    iput-object p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->redemptionMeta:Lcom/ibotta/api/model/retailer/RedemptionMeta;

    return-void
.end method

.method public setRetailerBarcodeConfigurationParcel(Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;)V
    .locals 0

    .line 351
    iput-object p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->retailerBarcodeConfigurationParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;

    return-void
.end method

.method public setRetailerTerms(Ljava/lang/String;)V
    .locals 0

    .line 294
    iput-object p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->retailerTerms:Ljava/lang/String;

    return-void
.end method

.method public setShortDescription(Ljava/lang/String;)V
    .locals 0

    .line 246
    iput-object p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->shortDescription:Ljava/lang/String;

    return-void
.end method

.method public setVerificationType(Lcom/ibotta/api/model/common/VerificationType;)V
    .locals 0

    .line 198
    iput-object p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->verificationType:Lcom/ibotta/api/model/common/VerificationType;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 388
    iget p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->id:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 389
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->name:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 390
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 391
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardLinkTitle:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 392
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardLinkText:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 393
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardLinkButtonText:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 394
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardSignupUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 395
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardSignupCompletionUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 396
    iget-boolean p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->credentialIntegration:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 397
    iget-boolean p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->auxiliaryLoyaltyEnabled:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 398
    iget-boolean p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->receiptFallbackEnabled:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 399
    iget-boolean p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardLinked:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 400
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardIdType:Lcom/ibotta/api/model/RetailerModel$CardIdType;

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/ibotta/api/model/RetailerModel$CardIdType;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p2, v0

    .line 401
    :goto_0
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 402
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->cardInputType:Lcom/ibotta/api/model/RetailerModel$CardInputType;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/ibotta/api/model/RetailerModel$CardInputType;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_1
    move-object p2, v0

    .line 403
    :goto_1
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 404
    iget-boolean p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->barcode:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 405
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->verificationType:Lcom/ibotta/api/model/common/VerificationType;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/ibotta/api/model/common/VerificationType;->toString()Ljava/lang/String;

    move-result-object v0

    .line 406
    :cond_2
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 407
    iget-boolean p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->anyBrand:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 408
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->anyBrandIconUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 409
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->anyBrandFullUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 410
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->iconUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 411
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->dasherizedName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 412
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->shortDescription:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 413
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->buttonSdkId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 414
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->largeIconUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 415
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->modelCImageUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 416
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->largeCardLogoUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 417
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->creditPendingPeriod:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 418
    iget-boolean p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->deviceOcrEnabled:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 419
    iget-boolean p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->deviceOcrPreverify:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 420
    iget-wide v0, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->hotness:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 421
    iget-boolean p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->nearby:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 422
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->retailerTerms:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 423
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->allowedViewports:Ljava/util/Set;

    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 425
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->redemptionMeta:Lcom/ibotta/api/model/retailer/RedemptionMeta;

    if-nez p2, :cond_3

    .line 426
    new-instance p2, Lcom/ibotta/api/model/retailer/RedemptionMeta;

    invoke-direct {p2}, Lcom/ibotta/api/model/retailer/RedemptionMeta;-><init>()V

    iput-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->redemptionMeta:Lcom/ibotta/api/model/retailer/RedemptionMeta;

    .line 428
    :cond_3
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->redemptionMeta:Lcom/ibotta/api/model/retailer/RedemptionMeta;

    invoke-virtual {p2}, Lcom/ibotta/api/model/retailer/RedemptionMeta;->getRedeemString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 429
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->redemptionMeta:Lcom/ibotta/api/model/retailer/RedemptionMeta;

    invoke-virtual {p2}, Lcom/ibotta/api/model/retailer/RedemptionMeta;->getReceiptName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 430
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->redemptionMeta:Lcom/ibotta/api/model/retailer/RedemptionMeta;

    invoke-virtual {p2}, Lcom/ibotta/api/model/retailer/RedemptionMeta;->getMaxReceiptAgeDays()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 431
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->redemptionMeta:Lcom/ibotta/api/model/retailer/RedemptionMeta;

    invoke-virtual {p2}, Lcom/ibotta/api/model/retailer/RedemptionMeta;->getOnlinePostTitle()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 432
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->redemptionMeta:Lcom/ibotta/api/model/retailer/RedemptionMeta;

    invoke-virtual {p2}, Lcom/ibotta/api/model/retailer/RedemptionMeta;->getOnlinePostDesc()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 435
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->redemptionMeta:Lcom/ibotta/api/model/retailer/RedemptionMeta;

    invoke-virtual {p2}, Lcom/ibotta/api/model/retailer/RedemptionMeta;->getAdditionalRedemptionInstructions()Ljava/util/List;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    .line 436
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->redemptionMeta:Lcom/ibotta/api/model/retailer/RedemptionMeta;

    .line 437
    invoke-virtual {p2}, Lcom/ibotta/api/model/retailer/RedemptionMeta;->getAdditionalRedemptionInstructions()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    new-array p2, p2, [Ljava/lang/String;

    .line 438
    iget-object v1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->redemptionMeta:Lcom/ibotta/api/model/retailer/RedemptionMeta;

    invoke-virtual {v1}, Lcom/ibotta/api/model/retailer/RedemptionMeta;->getAdditionalRedemptionInstructions()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    goto :goto_2

    .line 441
    :cond_4
    new-array p2, v0, [Ljava/lang/String;

    .line 444
    :goto_2
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 446
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->retailerBarcodeConfigurationParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 448
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->featureParcels:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    new-array p2, p2, [Lcom/ibotta/android/apiandroid/home/FeatureParcel;

    .line 449
    iget-object v1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->featureParcels:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 450
    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelableArray([Landroid/os/Parcelable;I)V

    .line 452
    iget-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->receiptFormats:Ljava/util/Set;

    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result p2

    new-array p2, p2, [Ljava/lang/String;

    .line 454
    iget-object v1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->receiptFormats:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/receipt/ReceiptFormat;

    .line 455
    invoke-virtual {v2}, Lcom/ibotta/api/model/receipt/ReceiptFormat;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, p2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 458
    :cond_5
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    return-void
.end method
