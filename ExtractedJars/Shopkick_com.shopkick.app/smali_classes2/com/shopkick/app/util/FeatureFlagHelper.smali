.class public Lcom/shopkick/app/util/FeatureFlagHelper;
.super Ljava/lang/Object;
.source "FeatureFlagHelper.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static areImageRecognitionScansEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 2

    .line 317
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "FEATURE_FLAG_ENABLE_IR"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableImageRecognitionScans:Ljava/lang/Boolean;

    .line 318
    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static areMarketingPromoCodesEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 2

    .line 341
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "FEATURE_FLAG_ENABLE_MARKETING_PROMO_CODES"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableMarketingPromoCodes:Ljava/lang/Boolean;

    .line 342
    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static areProgrammaticSurveysEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 2

    .line 333
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "FEATURE_FLAG_ENABLE_PROGRAMMATIC_SURVEY"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableProgrammaticSurvey:Ljava/lang/Boolean;

    .line 334
    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static enableDayNotifications()Z
    .locals 2

    .line 151
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "DAY_NOTIFICATIONS_ONLY"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static forceReceiptInstructionsDebug()Z
    .locals 2

    .line 219
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "FEATURE_FLAG_FORCE_RECEIPT_INSTRUCTIONS"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static getEarnDefaultTab(Lcom/shopkick/app/application/ClientFlagsManager;)I
    .locals 1

    .line 258
    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->defaultEarnTabToggleOption:Ljava/lang/Integer;

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/shopkick/app/util/TypeUtils;->toInteger(Ljava/lang/Object;I)I

    move-result p0

    return p0
.end method

.method public static getReceiptInstructionScreenType(Lcom/shopkick/app/application/ClientFlagsManager;)I
    .locals 2

    .line 205
    iget-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->dontUseReceiptScanInstructionFlow:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "FEATURE_FLAG_USE_RECEIPT_INSTRUCTIONS"

    .line 206
    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 208
    :cond_0
    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enforceFullFlowForReceiptScanInstruction:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static isAffilateStoreEnabled()Z
    .locals 2

    .line 280
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "FEATURE_FLAG_ENABLE_AFFILIATE_STORE"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static isAutomaticWalkinsDisabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 1

    .line 248
    invoke-static {p0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isWalkinButtonEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->walkinButtonDisableAutomaticWalkins:Ljava/lang/Boolean;

    .line 249
    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isBBYBarcodeDigitsEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 1

    .line 141
    invoke-static {}, Lcom/shopkick/app/util/FeatureFlagHelper;->isBestBuyBNCEnhancementsEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->dontDisplayBarcodeDigitsForBestBuy:Ljava/lang/Boolean;

    .line 142
    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isBBYBrightnessEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 1

    .line 119
    invoke-static {}, Lcom/shopkick/app/util/FeatureFlagHelper;->isBestBuyBNCEnhancementsEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/shopkick/app/util/FeatureFlagHelper;->isBrightnessControlEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->dontIncreaseBrightnessForBestBuy:Ljava/lang/Boolean;

    .line 120
    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isBBYEmailEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 1

    .line 130
    invoke-static {}, Lcom/shopkick/app/util/FeatureFlagHelper;->isBestBuyBNCEnhancementsEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->dontDisplayEmailBarcodeForBestBuy:Ljava/lang/Boolean;

    .line 131
    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isBLEMessagingEnabled()Z
    .locals 2

    .line 19
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "FEATURE_FLAG_ENABLE_BLE_MESSAGING"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static isBestBuyBNCEnhancementsEnabled()Z
    .locals 2

    .line 108
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "BBY_ENHANCEMENTS_ENABLED"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static isBrightnessControlEnabled()Z
    .locals 2

    .line 85
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "BRIGHTNESS_CONTROL_ENABLED"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static isDevLoggingEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 1

    .line 41
    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableDevLogging:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object p0

    const-string v0, "FEATURE_FLAG_DEV_LOGGING"

    .line 42
    invoke-virtual {p0, v0}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isFirstTimeUserExperienceEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 2

    .line 357
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "FEATURE_FLAG_FIRST_TIME_USER_EXPERIENCE"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableFtueTutorial:Ljava/lang/Boolean;

    .line 358
    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isGPSFailbackForStoresEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 2

    .line 80
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "FEATURE_FLAG_GPS_FAILBACK_FOR_STORES"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useGpsFailback:Ljava/lang/Boolean;

    .line 81
    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isInlineProgrammaticVideoEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 2

    .line 309
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "FEATURE_FLAG_ENABLE_INLINE_PROGRAMMATIC_VIDEO"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableInlineProgrammaticVideo:Ljava/lang/Boolean;

    .line 310
    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isK4PEverywhereEnabled()Z
    .locals 2

    .line 14
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "FEATURE_FLAG_ENABLE_K4P_EVERYWHERE"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static isMCommerceEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 1

    .line 164
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object p0

    const-string v0, "FEATURE_FLAG_ENABLE_M_COMMERCE"

    invoke-virtual {p0, v0}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static isMOATEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 1

    .line 89
    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableMoatTracking:Ljava/lang/Boolean;

    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object p0

    const-string v0, "FEATURE_FLAG_ENABLE_MOAT"

    .line 90
    invoke-virtual {p0, v0}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isMOATLookbookEnabled()Z
    .locals 2

    .line 99
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "FEATURE_FLAG_ENABLE_MOAT_LOOKBOOK"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static isMOATScanEnabled()Z
    .locals 2

    .line 95
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "FEATURE_FLAG_ENABLE_MOAT_SCAN"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static isMultipleProductImagesEnabled()Z
    .locals 2

    .line 76
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "FEATURE_FLAG_MULTIPLE_PRODUCT_IMAGES"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static isNearOrInStoreNotificationEnabled(Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 1

    .line 29
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1a

    if-lt p1, v0, :cond_0

    const/4 p0, 0x1

    return p0

    .line 32
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/application/AppPreferences;->isGeofencingNotificationEnabled()Z

    move-result p0

    return p0
.end method

.method public static isOnlineKicksUnitEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 2

    .line 304
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "FEATURE_FLAG_ENABLE_NEW_ONLINE_KICKS_UNIT"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableNewOnlineKicksUnit:Ljava/lang/Boolean;

    .line 305
    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isOnlineOffersEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 1

    .line 168
    invoke-static {p0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isMCommerceEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object p0

    const-string v0, "FEATURE_FLAG_ENABLE_M_COMMERCE_ONLINE_OFFERS"

    .line 169
    invoke-virtual {p0, v0}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isPhysicalStoreDetailPageRedesigned(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 2

    .line 253
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "FEATURE_FLAG_PHYSICAL_STORE_DETAIL_REDESIGN"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->keepAllPromoUnitOnTop:Ljava/lang/Boolean;

    .line 254
    invoke-static {p0, v1}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;Z)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public static isPostScanReminderEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 2

    .line 284
    iget-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->postScanNotificationEnabled:Ljava/lang/Boolean;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->postScanNotificationInHours:Ljava/lang/Integer;

    .line 285
    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->postScanNotificationTonightHours:Ljava/lang/Integer;

    .line 286
    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public static isProductSelectorItemCheckHeaderEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 2

    .line 290
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "FEATURE_FLAG_ENABLE_PRODUCT_SELECTOR_FORCE_ITEM_CHECK_HEADER"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableProductSelectorForceItems:Ljava/lang/Boolean;

    .line 291
    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isQuickKicksWidgetEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 2

    .line 299
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "FEATURE_FLAG_ENABLE_QUICK_KICKS_WIDGET"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableQuickKicksWidget:Ljava/lang/Boolean;

    .line 300
    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isRadarSDKIntegrationEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 2

    .line 325
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "FEATURE_FLAG_ENABLE_RADAR_SDK_INTEGRATION"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableRadarSdkIntegration:Ljava/lang/Boolean;

    .line 326
    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isRemoveLookbookSavesEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 1

    .line 201
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object p0

    const-string v0, "FEATURE_FLAG_REMOVE_LOOKBOOK_SAVES"

    invoke-virtual {p0, v0}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static isRussellButtonOnStoreDetailsEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 2

    .line 243
    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableNewRussellButton:Ljava/lang/Boolean;

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;Z)Z

    move-result p0

    if-nez p0, :cond_0

    .line 244
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object p0

    const-string v1, "FEATURE_FLAG_RUSSELL_BUTTON_STORE_DETAILS"

    invoke-virtual {p0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static isScanOffersWidgetEnabled()Z
    .locals 2

    .line 173
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "FEATURE_FLAG_USE_WIDGET_ON_SCAN_OFFERS"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static isSendLocationHeaderEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 2

    .line 275
    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->sendLocationHeaderAndroid:Ljava/lang/Boolean;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;Z)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 276
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object p0

    const-string v1, "FEATURE_FLAG_ENABLE_SENDING_LOCATION_HEADER"

    invoke-virtual {p0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public static isShoppingListEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 2

    .line 155
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "FEATURE_FLAG_DISABLE_SHOPPING_LISTS"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->deprecateShoppingLists:Ljava/lang/Boolean;

    .line 156
    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static isStoreDetailCategoryKicksEnabled()Z
    .locals 2

    .line 295
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "FEATURE_FLAG_ENABLE_STORE_DETAIL_SCREEN_CATEGORY_KICKS_TILE"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static isStoreDetailsGroceryOffersWidgetEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 0

    .line 160
    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->storeDetailsGroceryOffersWidgetEnabled:Ljava/lang/Boolean;

    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static isStoreSearchEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 1

    .line 233
    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableSearchButton:Ljava/lang/Boolean;

    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 234
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object p0

    const-string v0, "FEATURE_FLAG_ENABLE_STORE_SEARCH"

    invoke-virtual {p0, v0}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isStrikethroughPricingEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 1

    .line 349
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object p0

    const-string v0, "FEATURE_FLAG_ENABLE_STRIKETHROUGH_PRICING"

    invoke-virtual {p0, v0}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static isUpdatedWalkinGreetingEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 0

    .line 72
    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useShortWalkinTextAnimation:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static isUseNewBatteryImplementationAndroid(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 2

    .line 266
    invoke-virtual {p0}, Lcom/shopkick/app/application/ClientFlagsManager;->getClientAppUIFlags()Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    move-result-object p0

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->useNewBatteryImplementationAndroid:Ljava/lang/Boolean;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;Z)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 267
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object p0

    const-string v1, "FEATURE_FLAG_NEW_BATTERY_IMPLEMENTATION"

    invoke-virtual {p0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public static isWalkinBonusCountdownEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 1

    .line 365
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object p0

    const-string v0, "FEATURE_FLAG_WALKIN_BONUS_COUNTDOWN"

    invoke-virtual {p0, v0}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static isWalkinButtonEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 2

    .line 238
    invoke-virtual {p0}, Lcom/shopkick/app/application/ClientFlagsManager;->getClientAppUIFlags()Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    move-result-object p0

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->dontUseWalkinButton:Ljava/lang/Boolean;

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;Z)Z

    move-result p0

    if-nez p0, :cond_0

    .line 239
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object p0

    const-string v1, "FEATURE_FLAG_WALKIN_BUTTON"

    invoke-virtual {p0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static isWifiScanningEnabledInBackground(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 1

    .line 56
    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableWifiScanningInBackground:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object p0

    const-string v0, "FEATURE_FLAG_ENABLE_WIFI_SCANNING"

    .line 57
    invoke-virtual {p0, v0}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isWifiScanningEnabledInForeground(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 1

    .line 50
    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableWifiScanningInForeground:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object p0

    const-string v0, "FEATURE_FLAG_ENABLE_WIFI_SCANNING"

    .line 51
    invoke-virtual {p0, v0}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isWifiScanningEnabledWithoutGeofencing(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 1

    .line 66
    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableWifiScanningWithoutGeofencing:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object p0

    const-string v0, "FEATURE_FLAG_ENABLE_WIFI_SCANNING"

    .line 67
    invoke-virtual {p0, v0}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static shouldShowNotificationCenter(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 1

    .line 228
    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableNotificationCenter:Ljava/lang/Boolean;

    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 229
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object p0

    const-string v0, "FEATURE_FLAG_ENABLE_NOTIFICATION_CENTER"

    invoke-virtual {p0, v0}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static shouldShowReceiptScanScreenInstructions(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 1

    .line 214
    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->dontUseReceiptScanInstructionFlow:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-nez p0, :cond_0

    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object p0

    const-string v0, "FEATURE_FLAG_USE_RECEIPT_INSTRUCTIONS_ON_RECEIPT_SCREEN"

    .line 215
    invoke-virtual {p0, v0}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static useFotoapparat(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 1

    .line 223
    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableCameraControllerV3:Ljava/lang/Boolean;

    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 224
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object p0

    const-string v0, "FEATURE_FLAG_USE_FOTOAPPARAT"

    invoke-virtual {p0, v0}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static useKicksActivityV2(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 1

    .line 182
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object p0

    const-string v0, "FEATURE_FLAG_USE_KICKS_ACTIVITY_V2"

    invoke-virtual {p0, v0}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static useOnlineOfferTileV2(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 1

    .line 195
    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableOnlineOffersV2TileCells:Ljava/lang/Boolean;

    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    .line 196
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object p0

    const-string v0, "FEATURE_FLAG_USE_ONLINE_OFFER_TILE_CELL_V2"

    invoke-virtual {p0, v0}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static useScanControllerV2(Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 1

    .line 186
    iget-object p0, p0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useAndroidGoogleBarcodeSdk:Ljava/lang/Boolean;

    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object p0

    const-string v0, "FEATURE_FLAG_USE_GOOGLE_BARCODE_API"

    .line 187
    invoke-virtual {p0, v0}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
