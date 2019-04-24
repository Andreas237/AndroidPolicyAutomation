.class public Lcom/ibotta/android/fragment/retailer/RetailerParcelHelperImpl;
.super Ljava/lang/Object;
.source "RetailerParcelHelperImpl.java"

# interfaces
.implements Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;


# instance fields
.field private final platform:Ljava/lang/String;

.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/helper/retailer/RetailerHelper;Ljava/lang/String;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelperImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 21
    iput-object p2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelperImpl;->platform:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toRetailerParcel(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .locals 3
    .param p1    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 30
    :cond_0
    new-instance v0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;-><init>()V

    .line 32
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setId(I)V

    .line 33
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setName(Ljava/lang/String;)V

    .line 34
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getCardName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setCardName(Ljava/lang/String;)V

    .line 35
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getCardLinkTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setCardLinkTitle(Ljava/lang/String;)V

    .line 36
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getCardLinkText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setCardLinkText(Ljava/lang/String;)V

    .line 37
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getCardLinkButtonText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setCardLinkButtonText(Ljava/lang/String;)V

    .line 38
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getCardSignupUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setCardSignupUrl(Ljava/lang/String;)V

    .line 39
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getCardSignupCompletionUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setCardSignupCompletionUrl(Ljava/lang/String;)V

    .line 40
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->isCredentialIntegration()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setCredentialIntegration(Z)V

    .line 41
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->isAuxiliaryLoyaltyEnabled()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setAuxiliaryLoyaltyEnabled(Z)V

    .line 42
    iget-object v1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelperImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-interface {v1, p1}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->isLinked(Lcom/ibotta/api/model/RetailerModel;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setCardLinked(Z)V

    .line 43
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getCardIdTypeEnum()Lcom/ibotta/api/model/RetailerModel$CardIdType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setCardIdType(Lcom/ibotta/api/model/RetailerModel$CardIdType;)V

    .line 44
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getCardInputTypeEnum()Lcom/ibotta/api/model/RetailerModel$CardInputType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setCardInputType(Lcom/ibotta/api/model/RetailerModel$CardInputType;)V

    .line 45
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->isBarcode()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setBarcode(Z)V

    .line 46
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getVerificationTypeEnum()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setVerificationType(Lcom/ibotta/api/model/common/VerificationType;)V

    .line 47
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->isAnyBrand()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setAnyBrand(Z)V

    .line 48
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getAnyBrandIconUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setAnyBrandIconUrl(Ljava/lang/String;)V

    .line 49
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getAnyBrandFullUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setAnyBrandFullUrl(Ljava/lang/String;)V

    .line 50
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getIconUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setIconUrl(Ljava/lang/String;)V

    .line 51
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getDasherizedName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setDasherizedName(Ljava/lang/String;)V

    .line 52
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getShortDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setShortDescription(Ljava/lang/String;)V

    .line 53
    iget-object v1, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelperImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    iget-object v2, p0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelperImpl;->platform:Ljava/lang/String;

    invoke-interface {v1, p1, v2}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->getButtonId(Lcom/ibotta/api/model/RetailerModel;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setButtonSdkId(Ljava/lang/String;)V

    .line 54
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getLargeIconUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setLargeIconUrl(Ljava/lang/String;)V

    .line 55
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getModelCImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setModelCImageUrl(Ljava/lang/String;)V

    .line 56
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getLargeCardLogoUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setLargeCardLogoUrl(Ljava/lang/String;)V

    .line 57
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getCreditPendingPeriod()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setCreditPendingPeriod(Ljava/lang/String;)V

    .line 58
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->isDeviceOcrEnabled()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setDeviceOcrEnabled(Z)V

    .line 59
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->isDeviceOcrPreverify()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setDeviceOcrPreverify(Z)V

    .line 60
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getHotness()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setHotness(D)V

    .line 61
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->isNearby()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setNearby(Z)V

    .line 62
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getRetailerTerms()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setRetailerTerms(Ljava/lang/String;)V

    .line 63
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getAllowedViewports()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setAllowedViewports(Ljava/util/Set;)V

    .line 64
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getRedemptionMeta()Lcom/ibotta/api/model/retailer/RedemptionMeta;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setRedemptionMeta(Lcom/ibotta/api/model/retailer/RedemptionMeta;)V

    .line 68
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getRetailerBarcodeConfiguration()Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;

    move-result-object v1

    .line 67
    invoke-static {v1}, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->fromRetailerBarcodeConfiguration(Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;)Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;

    move-result-object v1

    .line 66
    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setRetailerBarcodeConfigurationParcel(Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;)V

    .line 70
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getGalleryFeatures()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v1

    sget-object v2, Lcom/ibotta/android/fragment/retailer/-$$Lambda$_wvmanFUEp1LEaLVtgH1cXAj0wg;->INSTANCE:Lcom/ibotta/android/fragment/retailer/-$$Lambda$_wvmanFUEp1LEaLVtgH1cXAj0wg;

    .line 71
    invoke-interface {v1, v2}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v1

    .line 72
    invoke-static {}, Ljava9/util/stream/Collectors;->toList()Ljava9/util/stream/Collector;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 74
    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setFeatureParcels(Ljava/util/List;)V

    .line 75
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getReceiptFormatEnums()Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setReceiptFormats(Ljava/util/Set;)V

    return-object v0
.end method
