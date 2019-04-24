.class public Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;
.super Ljava/lang/Object;
.source "BrazeTrackingImpl.java"

# interfaces
.implements Lcom/ibotta/android/tracking/braze/BrazeTracking;


# instance fields
.field private final appboy:Lcom/appboy/Appboy;

.field private hasPreviouslyTrackedPermissionVariant:Z


# direct methods
.method public constructor <init>(Lcom/appboy/Appboy;)V
    .locals 1

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->hasPreviouslyTrackedPermissionVariant:Z

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->appboy:Lcom/appboy/Appboy;

    return-void
.end method


# virtual methods
.method protected addOfferUnlockProperties(Lcom/appboy/models/outgoing/AppboyProperties;Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 283
    :cond_0
    sget-object v0, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;->EMPTY:Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "retailer_id"

    .line 284
    invoke-virtual {p2}, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;->getId()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/appboy/models/outgoing/AppboyProperties;->addProperty(Ljava/lang/String;I)Lcom/appboy/models/outgoing/AppboyProperties;

    const-string v0, "retailer_verification_type"

    .line 285
    invoke-virtual {p2}, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;->getVerificationTypeApiName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/appboy/models/outgoing/AppboyProperties;->addProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/appboy/models/outgoing/AppboyProperties;

    const-string v0, "retailer_short_description"

    .line 286
    invoke-virtual {p2}, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;->getShortDescription()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lcom/appboy/models/outgoing/AppboyProperties;->addProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/appboy/models/outgoing/AppboyProperties;

    .line 289
    :cond_1
    sget-object p2, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;->EMPTY:Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;

    invoke-virtual {p3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    const-string p2, "offer_id"

    .line 290
    invoke-virtual {p3}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;->getId()I

    move-result v0

    invoke-virtual {p1, p2, v0}, Lcom/appboy/models/outgoing/AppboyProperties;->addProperty(Ljava/lang/String;I)Lcom/appboy/models/outgoing/AppboyProperties;

    const-string p2, "offer_amount"

    .line 291
    invoke-virtual {p3}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;->getAmount()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {p1, p2, v0, v1}, Lcom/appboy/models/outgoing/AppboyProperties;->addProperty(Ljava/lang/String;D)Lcom/appboy/models/outgoing/AppboyProperties;

    const-string p2, "offer_name"

    .line 292
    invoke-virtual {p3}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/appboy/models/outgoing/AppboyProperties;->addProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/appboy/models/outgoing/AppboyProperties;

    const-string p2, "offer_description"

    .line 293
    invoke-virtual {p3}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/appboy/models/outgoing/AppboyProperties;->addProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/appboy/models/outgoing/AppboyProperties;

    const-string p2, "offer_expiration"

    .line 294
    invoke-virtual {p3}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;->getExpiration()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/appboy/models/outgoing/AppboyProperties;->addProperty(Ljava/lang/String;Ljava/util/Date;)Lcom/appboy/models/outgoing/AppboyProperties;

    const-string p2, "offer_url"

    .line 295
    invoke-virtual {p3}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;->getShareUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/appboy/models/outgoing/AppboyProperties;->addProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/appboy/models/outgoing/AppboyProperties;

    const-string p2, "offer_image"

    .line 296
    invoke-virtual {p3}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;->getOfferImage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/appboy/models/outgoing/AppboyProperties;->addProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/appboy/models/outgoing/AppboyProperties;

    const-string p2, "offer_redemption_max"

    .line 297
    invoke-virtual {p3}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;->getRedemptionMax()S

    move-result p3

    invoke-virtual {p1, p2, p3}, Lcom/appboy/models/outgoing/AppboyProperties;->addProperty(Ljava/lang/String;I)Lcom/appboy/models/outgoing/AppboyProperties;

    :cond_2
    return-void
.end method

.method protected createBonusProperties(Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;)Lcom/appboy/models/outgoing/AppboyProperties;
    .locals 4

    .line 254
    sget-object v0, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->EMPTY:Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 255
    new-instance p1, Lcom/appboy/models/outgoing/AppboyProperties;

    invoke-direct {p1}, Lcom/appboy/models/outgoing/AppboyProperties;-><init>()V

    return-object p1

    .line 258
    :cond_0
    new-instance v0, Lcom/appboy/models/outgoing/AppboyProperties;

    invoke-direct {v0}, Lcom/appboy/models/outgoing/AppboyProperties;-><init>()V

    const-string v1, "bonus_id"

    .line 259
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->getId()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/outgoing/AppboyProperties;->addProperty(Ljava/lang/String;I)Lcom/appboy/models/outgoing/AppboyProperties;

    move-result-object v0

    const-string v1, "bonus_name"

    .line 260
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/outgoing/AppboyProperties;->addProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/appboy/models/outgoing/AppboyProperties;

    move-result-object v0

    const-string v1, "bonus_token_url"

    .line 261
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->getTokenUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/outgoing/AppboyProperties;->addProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/appboy/models/outgoing/AppboyProperties;

    move-result-object v0

    const-string v1, "bonus_amount"

    .line 262
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->getAmount()F

    move-result v2

    float-to-double v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/appboy/models/outgoing/AppboyProperties;->addProperty(Ljava/lang/String;D)Lcom/appboy/models/outgoing/AppboyProperties;

    move-result-object v0

    const-string v1, "bonus_description"

    .line 263
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/outgoing/AppboyProperties;->addProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/appboy/models/outgoing/AppboyProperties;

    move-result-object v0

    const-string v1, "bonus_expiration"

    .line 264
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->getExpiration()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/outgoing/AppboyProperties;->addProperty(Ljava/lang/String;Ljava/util/Date;)Lcom/appboy/models/outgoing/AppboyProperties;

    move-result-object v0

    const-string v1, "bonus_details"

    .line 265
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->getDetails()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/outgoing/AppboyProperties;->addProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/appboy/models/outgoing/AppboyProperties;

    move-result-object v0

    const-string v1, "bonus_featured"

    .line 266
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->isFeatured()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/outgoing/AppboyProperties;->addProperty(Ljava/lang/String;Z)Lcom/appboy/models/outgoing/AppboyProperties;

    move-result-object v0

    .line 268
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->getOtherReward()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "bonus_other_reward"

    .line 269
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->getOtherReward()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/appboy/models/outgoing/AppboyProperties;->addProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/appboy/models/outgoing/AppboyProperties;

    :cond_1
    return-object v0
.end method

.method protected createRetailerProperties(Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;)Lcom/appboy/models/outgoing/AppboyProperties;
    .locals 3

    .line 243
    sget-object v0, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;->EMPTY:Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 244
    new-instance p1, Lcom/appboy/models/outgoing/AppboyProperties;

    invoke-direct {p1}, Lcom/appboy/models/outgoing/AppboyProperties;-><init>()V

    return-object p1

    .line 247
    :cond_0
    new-instance v0, Lcom/appboy/models/outgoing/AppboyProperties;

    invoke-direct {v0}, Lcom/appboy/models/outgoing/AppboyProperties;-><init>()V

    const-string v1, "retailer_id"

    .line 248
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;->getId()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/outgoing/AppboyProperties;->addProperty(Ljava/lang/String;I)Lcom/appboy/models/outgoing/AppboyProperties;

    move-result-object v0

    const-string v1, "retailer_name"

    .line 249
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/outgoing/AppboyProperties;->addProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/appboy/models/outgoing/AppboyProperties;

    move-result-object v0

    const-string v1, "auxiliary_connection"

    .line 250
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;->isAuxiliaryLoyaltyEnabled()Z

    move-result p1

    invoke-virtual {v0, v1, p1}, Lcom/appboy/models/outgoing/AppboyProperties;->addProperty(Ljava/lang/String;Z)Lcom/appboy/models/outgoing/AppboyProperties;

    move-result-object p1

    return-object p1
.end method

.method protected logCustomEvent(Ljava/lang/String;)V
    .locals 3

    .line 233
    iget-object v0, p0, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->appboy:Lcom/appboy/Appboy;

    invoke-virtual {v0, p1}, Lcom/appboy/Appboy;->logCustomEvent(Ljava/lang/String;)V

    const-string v0, "Braze Event: %1$s"

    const/4 v1, 0x1

    .line 234
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method protected logCustomEvent(Ljava/lang/String;Lcom/appboy/models/outgoing/AppboyProperties;)V
    .locals 2

    .line 238
    iget-object v0, p0, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->appboy:Lcom/appboy/Appboy;

    invoke-virtual {v0, p1, p2}, Lcom/appboy/Appboy;->logCustomEvent(Ljava/lang/String;Lcom/appboy/models/outgoing/AppboyProperties;)V

    const-string p2, "Braze Event: %1$s"

    const/4 v0, 0x1

    .line 239
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {p2, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public trackAccountView()V
    .locals 1

    const-string v0, "view_account"

    .line 181
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->logCustomEvent(Ljava/lang/String;)V

    return-void
.end method

.method public trackActivityFeedView()V
    .locals 1

    const-string v0, "view_activity_feed"

    .line 144
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->logCustomEvent(Ljava/lang/String;)V

    return-void
.end method

.method public trackBonusesView()V
    .locals 1

    const-string v0, "view_bonuses"

    .line 119
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->logCustomEvent(Ljava/lang/String;)V

    return-void
.end method

.method public trackCashout(FLjava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 206
    new-instance v0, Lcom/appboy/models/outgoing/AppboyProperties;

    invoke-direct {v0}, Lcom/appboy/models/outgoing/AppboyProperties;-><init>()V

    const-string v1, "amount"

    float-to-double v2, p1

    .line 207
    invoke-virtual {v0, v1, v2, v3}, Lcom/appboy/models/outgoing/AppboyProperties;->addProperty(Ljava/lang/String;D)Lcom/appboy/models/outgoing/AppboyProperties;

    move-result-object p1

    const-string v0, "method"

    .line 208
    invoke-virtual {p1, v0, p2}, Lcom/appboy/models/outgoing/AppboyProperties;->addProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/appboy/models/outgoing/AppboyProperties;

    move-result-object p1

    const-string p2, "method_image"

    .line 209
    invoke-virtual {p1, p2, p3}, Lcom/appboy/models/outgoing/AppboyProperties;->addProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/appboy/models/outgoing/AppboyProperties;

    move-result-object p1

    const-string p2, "mobile_cashout"

    .line 211
    invoke-virtual {p0, p2, p1}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->logCustomEvent(Ljava/lang/String;Lcom/appboy/models/outgoing/AppboyProperties;)V

    return-void
.end method

.method public trackFindRebatesView()V
    .locals 1

    const-string v0, "view_find_rebates"

    .line 186
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->logCustomEvent(Ljava/lang/String;)V

    return-void
.end method

.method public trackGalleryRetailerCategoryView(Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;Ljava/lang/Integer;)V
    .locals 3

    if-nez p2, :cond_0

    return-void

    .line 46
    :cond_0
    invoke-virtual {p0, p1}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->createRetailerProperties(Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;)Lcom/appboy/models/outgoing/AppboyProperties;

    move-result-object p1

    const-string v0, "gallery-view-retailercategory-%1$d"

    const/4 v1, 0x1

    .line 47
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 48
    invoke-virtual {p0, p2, p1}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->logCustomEvent(Ljava/lang/String;Lcom/appboy/models/outgoing/AppboyProperties;)V

    return-void
.end method

.method public trackGalleryRetailerView(Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;)V
    .locals 4

    .line 30
    sget-object v0, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;->EMPTY:Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 34
    :cond_0
    invoke-virtual {p0, p1}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->createRetailerProperties(Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;)Lcom/appboy/models/outgoing/AppboyProperties;

    move-result-object v0

    const-string v1, "gallery-view-retailer-%1$d"

    const/4 v2, 0x1

    .line 35
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 36
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->logCustomEvent(Ljava/lang/String;Lcom/appboy/models/outgoing/AppboyProperties;)V

    return-void
.end method

.method public trackGalleryRetailerViewNonLinkedCard(Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;)V
    .locals 1

    .line 53
    sget-object v0, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;->EMPTY:Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 57
    :cond_0
    invoke-virtual {p0, p1}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->createRetailerProperties(Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;)Lcom/appboy/models/outgoing/AppboyProperties;

    move-result-object p1

    const-string v0, "gallery-view-non-card-linked-retailer"

    .line 58
    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->logCustomEvent(Ljava/lang/String;Lcom/appboy/models/outgoing/AppboyProperties;)V

    return-void
.end method

.method public trackGalleryRetailerViewNonLinkedCardById(Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;)V
    .locals 4

    .line 63
    sget-object v0, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;->EMPTY:Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 67
    :cond_0
    invoke-virtual {p0, p1}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->createRetailerProperties(Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;)Lcom/appboy/models/outgoing/AppboyProperties;

    move-result-object v0

    const-string v1, "gallery-view-non-card-linked-retailer-%1$d"

    const/4 v2, 0x1

    .line 68
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 69
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->logCustomEvent(Ljava/lang/String;Lcom/appboy/models/outgoing/AppboyProperties;)V

    return-void
.end method

.method public trackGalleryView(Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;)V
    .locals 1

    .line 24
    invoke-virtual {p0, p1}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->createRetailerProperties(Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;)Lcom/appboy/models/outgoing/AppboyProperties;

    move-result-object p1

    const-string v0, "gallery-view"

    .line 25
    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->logCustomEvent(Ljava/lang/String;Lcom/appboy/models/outgoing/AppboyProperties;)V

    return-void
.end method

.method public trackHomeScreenLoaded()V
    .locals 1

    const-string v0, "home_screen_loaded"

    .line 168
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->logCustomEvent(Ljava/lang/String;)V

    return-void
.end method

.method public trackHomeView()V
    .locals 1

    const-string v0, "view_home"

    .line 155
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->logCustomEvent(Ljava/lang/String;)V

    return-void
.end method

.method public trackInviteFriendsView()V
    .locals 1

    const-string v0, "view_invite_friends"

    .line 129
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->logCustomEvent(Ljava/lang/String;)V

    return-void
.end method

.method public trackMcommOfferBonus(Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;)V
    .locals 1

    .line 216
    invoke-virtual {p0, p1}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->createBonusProperties(Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;)Lcom/appboy/models/outgoing/AppboyProperties;

    move-result-object p1

    const-string v0, "mcomm_offer_bonus"

    .line 217
    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->logCustomEvent(Ljava/lang/String;Lcom/appboy/models/outgoing/AppboyProperties;)V

    return-void
.end method

.method public trackMcommReturn()V
    .locals 1

    const-string v0, "mcomm_return"

    .line 222
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->logCustomEvent(Ljava/lang/String;)V

    return-void
.end method

.method public trackMyRankView()V
    .locals 1

    const-string v0, "view_my_rank"

    .line 139
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->logCustomEvent(Ljava/lang/String;)V

    return-void
.end method

.method public trackMyRebatesView()V
    .locals 1

    const-string v0, "view_my_rebates"

    .line 191
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->logCustomEvent(Ljava/lang/String;)V

    return-void
.end method

.method public trackOfferUnlocked(Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;)V
    .locals 1

    .line 106
    new-instance v0, Lcom/appboy/models/outgoing/AppboyProperties;

    invoke-direct {v0}, Lcom/appboy/models/outgoing/AppboyProperties;-><init>()V

    .line 107
    invoke-virtual {p0, v0, p1, p2}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->addOfferUnlockProperties(Lcom/appboy/models/outgoing/AppboyProperties;Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;)V

    const-string p1, "offer_unlock"

    .line 109
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->logCustomEvent(Ljava/lang/String;Lcom/appboy/models/outgoing/AppboyProperties;)V

    return-void
.end method

.method public trackPermissionPushLocationViewHome()V
    .locals 1

    .line 160
    iget-boolean v0, p0, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->hasPreviouslyTrackedPermissionVariant:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 161
    iput-boolean v0, p0, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->hasPreviouslyTrackedPermissionVariant:Z

    const-string v0, "permission_pushlocation_view_home"

    .line 162
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->logCustomEvent(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public trackReceiptEarningsTenPlus(F)V
    .locals 4

    const/high16 v0, 0x41200000    # 10.0f

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    .line 197
    new-instance v0, Lcom/appboy/models/outgoing/AppboyProperties;

    invoke-direct {v0}, Lcom/appboy/models/outgoing/AppboyProperties;-><init>()V

    const-string v1, "amount"

    float-to-double v2, p1

    .line 198
    invoke-virtual {v0, v1, v2, v3}, Lcom/appboy/models/outgoing/AppboyProperties;->addProperty(Ljava/lang/String;D)Lcom/appboy/models/outgoing/AppboyProperties;

    .line 200
    iget-object p1, p0, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->appboy:Lcom/appboy/Appboy;

    const-string v1, "receipt_10_plus"

    invoke-virtual {p1, v1, v0}, Lcom/appboy/Appboy;->logCustomEvent(Ljava/lang/String;Lcom/appboy/models/outgoing/AppboyProperties;)V

    :cond_0
    return-void
.end method

.method public trackReceiptUploaded(F)V
    .locals 4

    .line 173
    new-instance v0, Lcom/appboy/models/outgoing/AppboyProperties;

    invoke-direct {v0}, Lcom/appboy/models/outgoing/AppboyProperties;-><init>()V

    const-string v1, "amount"

    float-to-double v2, p1

    .line 174
    invoke-virtual {v0, v1, v2, v3}, Lcom/appboy/models/outgoing/AppboyProperties;->addProperty(Ljava/lang/String;D)Lcom/appboy/models/outgoing/AppboyProperties;

    const-string p1, "receipt_uploaded"

    .line 176
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->logCustomEvent(Ljava/lang/String;Lcom/appboy/models/outgoing/AppboyProperties;)V

    return-void
.end method

.method public trackRetailerCategoryViewed(I)V
    .locals 3

    const-string v0, "view_retailer_category_%1$d"

    const/4 v1, 0x1

    .line 149
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 150
    invoke-virtual {p0, p1}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->logCustomEvent(Ljava/lang/String;)V

    return-void
.end method

.method public trackRewardCodesView()V
    .locals 1

    const-string v0, "view_reward_codes"

    .line 134
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->logCustomEvent(Ljava/lang/String;)V

    return-void
.end method

.method public trackSilentPush(Ljava/lang/String;)V
    .locals 2

    .line 227
    new-instance v0, Lcom/appboy/models/outgoing/AppboyProperties;

    invoke-direct {v0}, Lcom/appboy/models/outgoing/AppboyProperties;-><init>()V

    const-string v1, "campaign_name"

    invoke-virtual {v0, v1, p1}, Lcom/appboy/models/outgoing/AppboyProperties;->addProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/appboy/models/outgoing/AppboyProperties;

    move-result-object p1

    .line 229
    iget-object v0, p0, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->appboy:Lcom/appboy/Appboy;

    const-string v1, "IAM Trigger"

    invoke-virtual {v0, v1, p1}, Lcom/appboy/Appboy;->logCustomEvent(Ljava/lang/String;Lcom/appboy/models/outgoing/AppboyProperties;)V

    return-void
.end method

.method public trackSpotlightRetailerCategoryView(Ljava/lang/Integer;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, "offer-view-retailercategory-%1$d"

    const/4 v1, 0x1

    .line 88
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 89
    invoke-virtual {p0, p1}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->logCustomEvent(Ljava/lang/String;)V

    return-void
.end method

.method public trackSpotlightUnlockItemBonus(Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;)V
    .locals 1

    .line 94
    sget-object v0, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->EMPTY:Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 98
    :cond_0
    invoke-virtual {p0, p1}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->createBonusProperties(Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;)Lcom/appboy/models/outgoing/AppboyProperties;

    move-result-object p1

    const-string v0, "unlock_item_bonus"

    .line 100
    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->logCustomEvent(Ljava/lang/String;Lcom/appboy/models/outgoing/AppboyProperties;)V

    return-void
.end method

.method public trackSpotlightView(Ljava/lang/Integer;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, "offer-view-retailer-%1$d"

    const/4 v1, 0x1

    .line 78
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 79
    invoke-virtual {p0, p1}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->logCustomEvent(Ljava/lang/String;)V

    return-void
.end method

.method public trackTeamworkView()V
    .locals 1

    const-string v0, "view_teamwork"

    .line 124
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->logCustomEvent(Ljava/lang/String;)V

    return-void
.end method

.method public trackWithdrawCashView()V
    .locals 1

    const-string v0, "view_withdraw_cash"

    .line 114
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/braze/BrazeTrackingImpl;->logCustomEvent(Ljava/lang/String;)V

    return-void
.end method
