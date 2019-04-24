.class public Lcom/shopkick/app/util/Affiliate;
.super Ljava/lang/Object;
.source "Affiliate.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static isAffiliateStore(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mcommerceAffiliateDisplayConfiguration:Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mcommerceAffiliateDisplayConfiguration:Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;->displayIntegrationType:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mcommerceAffiliateDisplayConfiguration:Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;->displayIntegrationType:Ljava/lang/Integer;

    .line 13
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isOnlineOffer(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    .line 28
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mcommerceAffiliateDisplayConfiguration:Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mcommerceAffiliateDisplayConfiguration:Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;->displayIntegrationType:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mcommerceAffiliateDisplayConfiguration:Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;->displayIntegrationType:Ljava/lang/Integer;

    .line 31
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gtz v0, :cond_1

    :cond_0
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineOfferMerchantUrl:Ljava/lang/String;

    .line 32
    invoke-static {p0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    :cond_1
    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isOnlineStore(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mcommerceAffiliateDisplayConfiguration:Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mcommerceAffiliateDisplayConfiguration:Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;->displayIntegrationType:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mcommerceAffiliateDisplayConfiguration:Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;->displayIntegrationType:Ljava/lang/Integer;

    .line 22
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gtz v0, :cond_1

    :cond_0
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreMerchantId:Ljava/lang/String;

    .line 23
    invoke-static {p0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    :cond_1
    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
