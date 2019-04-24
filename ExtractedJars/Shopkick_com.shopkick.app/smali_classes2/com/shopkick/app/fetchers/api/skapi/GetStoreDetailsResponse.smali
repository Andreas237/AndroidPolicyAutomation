.class public Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;
.super Lcom/shopkick/app/fetchers/api/IAPIResponseObject;
.source "GetStoreDetailsResponse.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public address:Ljava/lang/String;

.field public affiliateDisplayConfiguration:Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;

.field public bncBubbleSkLink:Ljava/lang/String;

.field public bonusWalkinKicksAvailable:Ljava/lang/Boolean;

.field public chainId:Ljava/lang/String;

.field public chainLogoImageUrl:Ljava/lang/String;

.field public coinsGrantedToday:Ljava/lang/Integer;

.field public common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

.field public daysUntilNextWalkin:Ljava/lang/Integer;

.field public expiredKickbatesOnly:Ljava/lang/Boolean;

.field public hasBnc:Ljava/lang/Boolean;

.field public hasCpgOffers:Ljava/lang/Boolean;

.field public hasReceiptKicks:Ljava/lang/Boolean;

.field public isPromoUnitUnpaid:Ljava/lang/Boolean;

.field public isVisaOnly:Ljava/lang/Boolean;

.field public largePromoTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field public latitude:Ljava/lang/Double;

.field public locationId:Ljava/lang/String;

.field public locationName:Ljava/lang/String;

.field public longitude:Ljava/lang/Double;

.field public mcommerceAffiliateDisplayConfiguration:Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;

.field public onlineStoreAwardBackgroundColorRgb:Ljava/lang/String;

.field public onlineStoreCategoryKicksTitle:Ljava/lang/String;

.field public onlineStoreClickKickAmount:Ljava/lang/Integer;

.field public onlineStoreClickKickCompleted:Ljava/lang/Boolean;

.field public onlineStoreClickKickDaysUntilNext:Ljava/lang/Integer;

.field public onlineStoreClickKickTodayCompleted:Ljava/lang/Boolean;

.field public onlineStoreClickedOnlineOfferToday:Ljava/lang/Boolean;

.field public onlineStoreEnablePriceHighlight:Ljava/lang/Boolean;

.field public onlineStoreMerchantId:Ljava/lang/String;

.field public onlineStorePurchaseKickAmountText:Ljava/lang/String;

.field public onlineStoreStrikePrice:Ljava/lang/String;

.field public onlineStoreTotalAvailableOnlineOfferKicks:Ljava/lang/Integer;

.field public onlineStoreWebUrl:Ljava/lang/String;

.field public promoTiles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation
.end field

.field public purchasesKicksAvailable:Ljava/lang/String;

.field public receiptBubbleSkLink:Ljava/lang/String;

.field public receiptKicksAvailable:Ljava/lang/String;

.field public receiptsTooltip:Ljava/lang/String;

.field public scanBubbleSkLink:Ljava/lang/String;

.field public scanCoinsAvailable:Ljava/lang/Integer;

.field public scannedToday:Ljava/lang/Boolean;

.field public tiles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation
.end field

.field public totalScanCoins:Ljava/lang/Integer;

.field public totalWalkinCoins:Ljava/lang/Integer;

.field public userReachedReceiptScanLimit:Ljava/lang/Boolean;

.field public userScanCount:Ljava/lang/Integer;

.field public userWalkinCount:Ljava/lang/Integer;

.field public walkedInToday:Ljava/lang/Boolean;

.field public walkinBubbleSkLink:Ljava/lang/String;

.field public walkinCoinsAvailable:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIResponseObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;
    .locals 2

    .line 84
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    if-eqz p1, :cond_0

    .line 85
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 88
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 24
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;
    .locals 1

    .line 79
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;

    move-result-object p1

    return-object p1
.end method

.method public commonResponseData()Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    return-object v0
.end method

.method public postProcess()V
    .locals 2

    .line 95
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->postProcess()V

    .line 97
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->promoTiles:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->postProcess()V

    goto :goto_0

    .line 98
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->scannedToday:Ljava/lang/Boolean;

    if-nez v0, :cond_2

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->scannedToday:Ljava/lang/Boolean;

    .line 99
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->walkedInToday:Ljava/lang/Boolean;

    if-nez v0, :cond_3

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->walkedInToday:Ljava/lang/Boolean;

    .line 101
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->tiles:Ljava/util/List;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->postProcess()V

    goto :goto_1

    .line 102
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->hasBnc:Ljava/lang/Boolean;

    if-nez v0, :cond_5

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->hasBnc:Ljava/lang/Boolean;

    .line 103
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->largePromoTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->postProcess()V

    .line 104
    :cond_6
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->isVisaOnly:Ljava/lang/Boolean;

    if-nez v0, :cond_7

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->isVisaOnly:Ljava/lang/Boolean;

    .line 105
    :cond_7
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->hasReceiptKicks:Ljava/lang/Boolean;

    if-nez v0, :cond_8

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->hasReceiptKicks:Ljava/lang/Boolean;

    .line 106
    :cond_8
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->userReachedReceiptScanLimit:Ljava/lang/Boolean;

    if-nez v0, :cond_9

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->userReachedReceiptScanLimit:Ljava/lang/Boolean;

    .line 107
    :cond_9
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->expiredKickbatesOnly:Ljava/lang/Boolean;

    if-nez v0, :cond_a

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->expiredKickbatesOnly:Ljava/lang/Boolean;

    .line 108
    :cond_a
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStoreClickKickCompleted:Ljava/lang/Boolean;

    if-nez v0, :cond_b

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStoreClickKickCompleted:Ljava/lang/Boolean;

    .line 109
    :cond_b
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStoreClickKickTodayCompleted:Ljava/lang/Boolean;

    if-nez v0, :cond_c

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStoreClickKickTodayCompleted:Ljava/lang/Boolean;

    .line 110
    :cond_c
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStoreClickedOnlineOfferToday:Ljava/lang/Boolean;

    if-nez v0, :cond_d

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStoreClickedOnlineOfferToday:Ljava/lang/Boolean;

    .line 111
    :cond_d
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->isPromoUnitUnpaid:Ljava/lang/Boolean;

    if-nez v0, :cond_e

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->isPromoUnitUnpaid:Ljava/lang/Boolean;

    .line 112
    :cond_e
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->hasCpgOffers:Ljava/lang/Boolean;

    if-nez v0, :cond_f

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->hasCpgOffers:Ljava/lang/Boolean;

    .line 113
    :cond_f
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->affiliateDisplayConfiguration:Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;->postProcess()V

    .line 114
    :cond_10
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->mcommerceAffiliateDisplayConfiguration:Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;->postProcess()V

    .line 115
    :cond_11
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->bonusWalkinKicksAvailable:Ljava/lang/Boolean;

    if-nez v0, :cond_12

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->bonusWalkinKicksAvailable:Ljava/lang/Boolean;

    .line 116
    :cond_12
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStoreEnablePriceHighlight:Ljava/lang/Boolean;

    if-nez v0, :cond_13

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetStoreDetailsResponse;->onlineStoreEnablePriceHighlight:Ljava/lang/Boolean;

    :cond_13
    return-void
.end method
