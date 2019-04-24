.class public interface abstract Lcom/ibotta/android/state/app/config/AppConfig;
.super Ljava/lang/Object;
.source "AppConfig.java"


# virtual methods
.method public abstract addAppConfigListener(Lcom/ibotta/android/state/app/config/AppConfigListener;)V
.end method

.method public abstract allGalleryCategoryTabMvtEnabled()Z
.end method

.method public abstract getAccountCreationDisabledRetailers()Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getAppCacheLowSpaceThresholdMB()J
.end method

.method public abstract getAppConfig()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getAppMinVersion()I
.end method

.method public abstract getButtonBrowserCardDelay()I
.end method

.method public abstract getButtonSdkSplashDelay()J
.end method

.method public abstract getButtonSdkWelcomeBackThreshold()J
.end method

.method public abstract getButtonSdkWelcomeBackTimeout()J
.end method

.method public abstract getCacheOverrides()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getCategorySettingsConfig()Lcom/ibotta/android/state/app/config/category/CategorySettingsConfig;
.end method

.method public abstract getDeviceAuthenticationAppConfig()Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;
.end method

.method public abstract getExpirationDateFormat()Ljava/lang/String;
.end method

.method public abstract getExpirationDateTextColor()Ljava/lang/String;
.end method

.method public abstract getExpiringBannerVariants()Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariantsConfig;
.end method

.method public abstract getExpiringThresholdHours()I
.end method

.method public abstract getFavoriteRetailerSettingsConfig()Lcom/ibotta/android/state/app/config/favorites/FavoriteRetailerSettingsConfig;
.end method

.method public abstract getFeatureFlags()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/state/app/featureflag/FeatureFlag;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getGalleryWhatsHotConfig()Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfig;
.end method

.method public abstract getGalleryWhatsNewConfig()Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfig;
.end method

.method public abstract getGcsEnabled()Z
.end method

.method public abstract getGeofenceConfig()Ljava/lang/String;
.end method

.method public abstract getGreetingsSchedule()Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;
.end method

.method public abstract getHowToUseIbottaUrl()Ljava/lang/String;
.end method

.method public abstract getImDataDisclaimerRetailers()Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getImEmailValidationRetailers()Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getInviteFriendsCopy()Lcom/ibotta/android/state/app/config/invitefriends/InviteFriendsCopyConfig;
.end method

.method public abstract getLoyaltyCardLink()Ljava/lang/String;
.end method

.method public abstract getLoyaltyQrCodeRetailers()Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getMaxVideoDuration()I
.end method

.method public abstract getMcommLearnMoreUrl()Ljava/lang/String;
.end method

.method public abstract getMobileShoppingCategoryId()I
.end method

.method public abstract getMvtWinnersConfig()Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig;
.end method

.method public abstract getNearbyRetailerDistance()F
.end method

.method public abstract getOSDeprecationConfig()Lcom/ibotta/android/state/app/config/osdeprecation/OSDeprecationConfig;
.end method

.method public abstract getOcrDeviceBlacklist()Lcom/ibotta/android/state/app/config/blacklist/BlacklistConfig;
.end method

.method public abstract getOpsKillSwitchConfig()Lcom/ibotta/android/state/app/config/ops/OpsKillSwitchConfig;
.end method

.method public abstract getPartnerAppTrackingConfig()Lcom/ibotta/android/state/app/config/pat/PartnerAppTrackingConfig;
.end method

.method public abstract getPaypalAppConfig()Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig;
.end method

.method public abstract getPictureSizeBlacklist()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract getPixelTrackingMaxAttempts()I
.end method

.method public abstract getQuestsConfig()Lcom/ibotta/android/state/app/config/quests/QuestsConfig;
.end method

.method public abstract getReceiptCaptureHoldFlatEnabled()Z
.end method

.method public abstract getReceiptFocusBlacklist()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getRecentlyViewedModuleId()I
.end method

.method public abstract getRecommendedStoresCount()I
.end method

.method public abstract getSpecialConditionsMessage()Ljava/lang/String;
.end method

.method public abstract getStoreModuleAppRowLimit()I
.end method

.method public abstract getStoreModuleHotnessThreshold()F
.end method

.method public abstract getStoreSelectorRequirements()Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;
.end method

.method public abstract getStoreSelectorV5Requirements()Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsV5Config;
.end method

.method public abstract getTrackingAppConfig()Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;
.end method

.method public abstract getTrackingClientsConfig()Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;
.end method

.method public abstract getUserProgressCopy()Lcom/ibotta/android/state/app/config/progress/UserProgressCopyAppConfig;
.end method

.method public abstract getVenmoAppConfig()Lcom/ibotta/android/state/app/config/venmo/VenmoAppConfig;
.end method

.method public abstract getVerificationValidity()Ljava/lang/Long;
.end method

.method public abstract getVerifyMaxScanAttempts()I
.end method

.method public abstract getVersionsBlacklist()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/vdurmont/semver4j/Semver;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getWhatsHotLimit()I
.end method

.method public abstract getYouMightLikeConfig()Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfig;
.end method

.method public abstract isButtonSdkAutofillEnabled()Z
.end method

.method public abstract isCantFindItEnabled()Z
.end method

.method public abstract isHideRebateDisabled()Z
.end method

.method public abstract isOcrEdgeDetectionEnabled()Z
.end method

.method public abstract isOcrEnabled()Z
.end method

.method public abstract isPushFrameworkRequired()Z
.end method

.method public abstract isRewardCodesDisabled()Z
.end method

.method public abstract isRichPushDisabled()Z
.end method

.method public abstract isTeamworkDisabled()Z
.end method

.method public abstract removeAppConfigListener(Lcom/ibotta/android/state/app/config/AppConfigListener;)V
.end method

.method public abstract reset()V
.end method

.method public abstract setAppConfig(Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract showQuantityBadge()Z
.end method

.method public abstract showUnlockRetailerList()Z
.end method
