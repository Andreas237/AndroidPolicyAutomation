.class public Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "TileInfoV2.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public availabilityTimestampMs:Ljava/lang/Long;

.field public backgroundColor:Ljava/lang/String;

.field public bncKickText:Ljava/lang/String;

.field public bonusReceiptKicks:Ljava/lang/Integer;

.field public bonusWalkinKicksAvailable:Ljava/lang/Boolean;

.field public brandName:Ljava/lang/String;

.field public buttonSkLink:Ljava/lang/String;

.field public buttonTitle:Ljava/lang/String;

.field public chainId:Ljava/lang/String;

.field public chainImageUrl:Ljava/lang/String;

.field public chainImageUrls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public chainName:Ljava/lang/String;

.field public challengeType:Ljava/lang/Integer;

.field public cityName:Ljava/lang/String;

.field public completedText:Ljava/lang/String;

.field public currentPrice:Ljava/lang/String;

.field public dataPos:Ljava/lang/Integer;

.field public daysUntilExpiration:Ljava/lang/Integer;

.field public daysUntilNextWalkin:Ljava/lang/Integer;

.field public dealId:Ljava/lang/String;

.field public dealItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/DealItem;",
            ">;"
        }
    .end annotation
.end field

.field public dealTeaser:Ljava/lang/String;

.field public deptWalkinInfoText:Ljava/lang/String;

.field public descriptionHtml:Ljava/lang/String;

.field public descriptionText:Ljava/lang/String;

.field public displayBackgroundImage:Ljava/lang/Boolean;

.field public displayTaxonomyNodeId:Ljava/lang/String;

.field public districtId:Ljava/lang/String;

.field public districtName:Ljava/lang/String;

.field public districtStoreCount:Ljava/lang/Integer;

.field public enableNusbLockToTop:Ljava/lang/Boolean;

.field public expirationTimestampMs:Ljava/lang/Long;

.field public expiredKickbatesOnly:Ljava/lang/Boolean;

.field public expiredText:Ljava/lang/String;

.field public featuredContentType:Ljava/lang/Integer;

.field public flagBackgroundColor:Ljava/lang/String;

.field public flagText:Ljava/lang/String;

.field public flagTextColor:Ljava/lang/String;

.field public foldedImageUrl:Ljava/lang/String;

.field public foldedText:Ljava/lang/String;

.field public footerText:Ljava/lang/String;

.field public friendImageUrl:Ljava/lang/String;

.field public friendName:Ljava/lang/String;

.field public giftDollarValue:Ljava/lang/String;

.field public giftImageUrl:Ljava/lang/String;

.field public globalSaveCount:Ljava/lang/Long;

.field public gpsPermissionDenied:Ljava/lang/Boolean;

.field public hasCollectedInstantBonus:Ljava/lang/Boolean;

.field public hasWalkinBonus:Ljava/lang/Boolean;

.field public headerText:Ljava/lang/String;

.field public height:Ljava/lang/Integer;

.field public imageRecScanCompleted:Ljava/lang/Boolean;

.field public imageRecScanDescriptionText:Ljava/lang/String;

.field public imageRecScanKicks:Ljava/lang/Integer;

.field public imageRecScanLargeImageUrl:Ljava/lang/String;

.field public imageRecScanThumbnailImageUrl:Ljava/lang/String;

.field public imageRecScanTokenId:Ljava/lang/String;

.field public ingredientId:Ljava/lang/String;

.field public instantBonusId:Ljava/lang/String;

.field public isDisabled:Ljava/lang/Boolean;

.field public isExpired:Ljava/lang/Boolean;

.field public isFeatured:Ljava/lang/Boolean;

.field public isOfferBundle:Ljava/lang/Boolean;

.field public isRetailerReceipt:Ljava/lang/Boolean;

.field public isSaved:Ljava/lang/Boolean;

.field public isSpecial:Ljava/lang/Boolean;

.field public kickAmount:Ljava/lang/Integer;

.field public kickAmountText:Ljava/lang/String;

.field public kicksActivityType:Ljava/lang/Integer;

.field public largeImageUrl:Ljava/lang/String;

.field public largeImageUrls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public latitude:Ljava/lang/Double;

.field public layoutVersion:Ljava/lang/Integer;

.field public likeItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/LikeItem;",
            ">;"
        }
    .end annotation
.end field

.field public locationId:Ljava/lang/String;

.field public locationIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public longitude:Ljava/lang/Double;

.field public lookbookTileImageSize:Ljava/lang/Integer;

.field public mainImageUrl:Ljava/lang/String;

.field public mcommerceAffiliateDisplayConfiguration:Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;

.field public minimumAgeForKicks:Ljava/lang/Integer;

.field public minimumPurchaseRequirement:Ljava/lang/Integer;

.field public missionBonusKicks:Ljava/lang/Integer;

.field public numDeals:Ljava/lang/Integer;

.field public numInvitesRequired:Ljava/lang/Long;

.field public numLikes:Ljava/lang/Integer;

.field public numScans:Ljava/lang/Integer;

.field public occurrenceTimestampMs:Ljava/lang/Long;

.field public offerBundleIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public onlineOfferClickKickAmount:Ljava/lang/Integer;

.field public onlineOfferClickKickCompleted:Ljava/lang/Boolean;

.field public onlineOfferClickKickDaysUntilNext:Ljava/lang/Integer;

.field public onlineOfferClickKickTodayCompleted:Ljava/lang/Boolean;

.field public onlineOfferMerchantUrl:Ljava/lang/String;

.field public onlineOfferPurchaseKickAmountText:Ljava/lang/String;

.field public onlineOfferType:Ljava/lang/Integer;

.field public onlineStoreAwardBackgroundColorRgb:Ljava/lang/String;

.field public onlineStoreClickKickAmount:Ljava/lang/Integer;

.field public onlineStoreClickKickCompleted:Ljava/lang/Boolean;

.field public onlineStoreClickKickDaysUntilNext:Ljava/lang/Integer;

.field public onlineStoreClickKickTodayCompleted:Ljava/lang/Boolean;

.field public onlineStoreDescription:Ljava/lang/String;

.field public onlineStoreEnablePriceHighlight:Ljava/lang/Boolean;

.field public onlineStoreMerchantId:Ljava/lang/String;

.field public onlineStoreMerchantUrl:Ljava/lang/String;

.field public onlineStorePurchaseKickAmountText:Ljava/lang/String;

.field public onlineStoreStrikePrice:Ljava/lang/String;

.field public onlineStoreTotalAvailableOnlineOfferKicks:Ljava/lang/Integer;

.field public onlineStoreWebUrl:Ljava/lang/String;

.field public originalPrice:Ljava/lang/String;

.field public postScanImageUrl:Ljava/lang/String;

.field public postScanTrackingUrl:Ljava/lang/String;

.field public postScanViewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

.field public primaryBackgroundColor:Ljava/lang/String;

.field public primaryTextColor:Ljava/lang/String;

.field public productFamilyId:Ljava/lang/String;

.field public productFamilyIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public productHierarchyId:Ljava/lang/String;

.field public productId:Ljava/lang/String;

.field public profileImageUrl:Ljava/lang/String;

.field public programmaticVideoCompleted:Ljava/lang/Boolean;

.field public programmaticVideoRequestId:Ljava/lang/String;

.field public promoUnitId:Ljava/lang/String;

.field public purchaseKickAmountText:Ljava/lang/String;

.field public quantity:Ljava/lang/Integer;

.field public receiptKickAmountText:Ljava/lang/String;

.field public receiptScanCompleted:Ljava/lang/Boolean;

.field public receiptScanKicks:Ljava/lang/Integer;

.field public recipeId:Ljava/lang/String;

.field public recipeSourceType:Ljava/lang/Integer;

.field public refreshTimestamp:Ljava/lang/Long;

.field public retailerCategoryId:Ljava/lang/String;

.field public scanCompleted:Ljava/lang/Boolean;

.field public scanDetailViewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

.field public scanItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/ScanItem;",
            ">;"
        }
    .end annotation
.end field

.field public scanKickAmount:Ljava/lang/Integer;

.field public scanMissionId:Ljava/lang/String;

.field public scanPostRewardOverlayViewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

.field public secondaryBackgroundColor:Ljava/lang/String;

.field public secondaryTextColor:Ljava/lang/String;

.field public section:Ljava/lang/Integer;

.field public sharingSkLink:Ljava/lang/String;

.field public shopkickAffiliateBarcode:Ljava/lang/String;

.field public shopkickAffiliateBarcodeImageUrl:Ljava/lang/String;

.field public shopperIdBarcode:Ljava/lang/String;

.field public shopperIdBarcodeImageUrl:Ljava/lang/String;

.field public skLink:Ljava/lang/String;

.field public socialProofText:Ljava/lang/String;

.field public specialRank:Ljava/lang/Integer;

.field public storyCardId:Ljava/lang/String;

.field public subtitle:Ljava/lang/String;

.field public surveyId:Ljava/lang/String;

.field public surveyTileStatus:Ljava/lang/Integer;

.field public taxonomyNodeId:Ljava/lang/String;

.field public teaserText:Ljava/lang/String;

.field public tileGroupType:Ljava/lang/Integer;

.field public title:Ljava/lang/String;

.field public token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

.field public totalNumMissionItems:Ljava/lang/Integer;

.field public trackingUrl:Ljava/lang/String;

.field public transactionId:Ljava/lang/Long;

.field public type:Ljava/lang/Integer;

.field public userId:Ljava/lang/String;

.field public userListId:Ljava/lang/String;

.field public userName:Ljava/lang/String;

.field public verticalPadding:Ljava/lang/Integer;

.field public videoDescriptionText:Ljava/lang/String;

.field public videoId:Ljava/lang/String;

.field public videoKicks:Ljava/lang/Integer;

.field public videoThumbnailImageUrl:Ljava/lang/String;

.field public videoUrl:Ljava/lang/String;

.field public videoUrlType:Ljava/lang/Integer;

.field public videoViewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

.field public viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

.field public walkers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/Walker;",
            ">;"
        }
    .end annotation
.end field

.field public walkinExplanationText:Ljava/lang/String;

.field public walkinExplanationUrl:Ljava/lang/String;

.field public walkinKickAmount:Ljava/lang/Integer;

.field public widgetId:Ljava/lang/String;

.field public widgetType:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 2

    .line 212
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz p1, :cond_0

    .line 213
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 216
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 1

    .line 207
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 2

    .line 223
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isSaved:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isSaved:Ljava/lang/Boolean;

    .line 224
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isExpired:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isExpired:Ljava/lang/Boolean;

    .line 225
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;->postProcess()V

    .line 226
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isDisabled:Ljava/lang/Boolean;

    if-nez v0, :cond_3

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isDisabled:Ljava/lang/Boolean;

    .line 227
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->postProcess()V

    .line 228
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanCompleted:Ljava/lang/Boolean;

    if-nez v0, :cond_5

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanCompleted:Ljava/lang/Boolean;

    .line 229
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isFeatured:Ljava/lang/Boolean;

    if-nez v0, :cond_6

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isFeatured:Ljava/lang/Boolean;

    .line 230
    :cond_6
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    if-nez v0, :cond_7

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    .line 231
    :cond_7
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->postScanViewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;->postProcess()V

    .line 233
    :cond_8
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanCompleted:Ljava/lang/Boolean;

    if-nez v0, :cond_9

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanCompleted:Ljava/lang/Boolean;

    .line 234
    :cond_9
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isSpecial:Ljava/lang/Boolean;

    if-nez v0, :cond_a

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isSpecial:Ljava/lang/Boolean;

    .line 236
    :cond_a
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->walkers:Ljava/util/List;

    if-eqz v0, :cond_b

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/Walker;

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/Walker;->postProcess()V

    goto :goto_0

    .line 237
    :cond_b
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->displayBackgroundImage:Ljava/lang/Boolean;

    if-nez v0, :cond_c

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->displayBackgroundImage:Ljava/lang/Boolean;

    .line 238
    :cond_c
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->hasWalkinBonus:Ljava/lang/Boolean;

    if-nez v0, :cond_d

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->hasWalkinBonus:Ljava/lang/Boolean;

    .line 239
    :cond_d
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->expiredKickbatesOnly:Ljava/lang/Boolean;

    if-nez v0, :cond_e

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->expiredKickbatesOnly:Ljava/lang/Boolean;

    .line 240
    :cond_e
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mcommerceAffiliateDisplayConfiguration:Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;->postProcess()V

    .line 241
    :cond_f
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->bonusWalkinKicksAvailable:Ljava/lang/Boolean;

    if-nez v0, :cond_10

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->bonusWalkinKicksAvailable:Ljava/lang/Boolean;

    .line 242
    :cond_10
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreClickKickCompleted:Ljava/lang/Boolean;

    if-nez v0, :cond_11

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreClickKickCompleted:Ljava/lang/Boolean;

    .line 243
    :cond_11
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreClickKickTodayCompleted:Ljava/lang/Boolean;

    if-nez v0, :cond_12

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreClickKickTodayCompleted:Ljava/lang/Boolean;

    .line 244
    :cond_12
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreEnablePriceHighlight:Ljava/lang/Boolean;

    if-nez v0, :cond_13

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreEnablePriceHighlight:Ljava/lang/Boolean;

    .line 245
    :cond_13
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineOfferClickKickCompleted:Ljava/lang/Boolean;

    if-nez v0, :cond_14

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineOfferClickKickCompleted:Ljava/lang/Boolean;

    .line 246
    :cond_14
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineOfferClickKickTodayCompleted:Ljava/lang/Boolean;

    if-nez v0, :cond_15

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineOfferClickKickTodayCompleted:Ljava/lang/Boolean;

    .line 248
    :cond_15
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanItems:Ljava/util/List;

    if-eqz v0, :cond_16

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/ScanItem;

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/ScanItem;->postProcess()V

    goto :goto_1

    .line 250
    :cond_16
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dealItems:Ljava/util/List;

    if-eqz v0, :cond_17

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/DealItem;

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/DealItem;->postProcess()V

    goto :goto_2

    .line 252
    :cond_17
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->likeItems:Ljava/util/List;

    if-eqz v0, :cond_18

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_18

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/LikeItem;

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/LikeItem;->postProcess()V

    goto :goto_3

    .line 253
    :cond_18
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->gpsPermissionDenied:Ljava/lang/Boolean;

    if-nez v0, :cond_19

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->gpsPermissionDenied:Ljava/lang/Boolean;

    .line 254
    :cond_19
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->hasCollectedInstantBonus:Ljava/lang/Boolean;

    if-nez v0, :cond_1a

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->hasCollectedInstantBonus:Ljava/lang/Boolean;

    .line 255
    :cond_1a
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->enableNusbLockToTop:Ljava/lang/Boolean;

    if-nez v0, :cond_1b

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->enableNusbLockToTop:Ljava/lang/Boolean;

    .line 257
    :cond_1b
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoCompleted:Ljava/lang/Boolean;

    if-nez v0, :cond_1c

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoCompleted:Ljava/lang/Boolean;

    .line 261
    :cond_1c
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    if-nez v0, :cond_1d

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    .line 262
    :cond_1d
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isRetailerReceipt:Ljava/lang/Boolean;

    if-nez v0, :cond_1e

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isRetailerReceipt:Ljava/lang/Boolean;

    .line 263
    :cond_1e
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoViewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    if-eqz v0, :cond_1f

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;->postProcess()V

    .line 264
    :cond_1f
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanDetailViewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    if-eqz v0, :cond_20

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;->postProcess()V

    .line 265
    :cond_20
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanPostRewardOverlayViewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    if-eqz v0, :cond_21

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;->postProcess()V

    :cond_21
    return-void
.end method
