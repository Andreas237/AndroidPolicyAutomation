.class public Lcom/ibotta/android/state/app/config/AppConfigImpl;
.super Ljava/lang/Object;
.source "AppConfigImpl.java"

# interfaces
.implements Lcom/ibotta/android/state/app/config/AppConfig;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field protected static final CONFIG_ALL_GALLERY_CATEGORY_TAB_MVT_ENABLED:Ljava/lang/String; = "all_gallery_category_tab_mvt_enabled"

.field protected static final CONFIG_APP_CACHE_LOW_SPACE_THRESHOLD_MB:Ljava/lang/String; = "appCacheLowSpaceThresholdMB"

.field protected static final CONFIG_APP_MIN_VERSION:Ljava/lang/String; = "app.minVersion"

.field protected static final CONFIG_APP_VERIFICATION_VALIDITY:Ljava/lang/String; = "app.verificationValidity"

.field protected static final CONFIG_APP_WHATS_HOT_LIMIT:Ljava/lang/String; = "app.whatsHotLimit"

.field protected static final CONFIG_BLACKLIST_PIC_SIZE:Ljava/lang/String; = "blacklist.pictureSize.[%1$s]"

.field protected static final CONFIG_BLACKLIST_RECEIPT_FOCUS:Ljava/lang/String; = "blacklist.receiptFocus.[%1$s]"

.field protected static final CONFIG_BUTTON_BROWSER_CARD_DELAY:Ljava/lang/String; = "button_browser_card_delay"

.field protected static final CONFIG_BUTTON_SDK_AUTOFILL_ENABLED:Ljava/lang/String; = "buttonsdk_autofill_enabled"

.field protected static final CONFIG_BUTTON_SDK_SPLASH_DELAY:Ljava/lang/String; = "buttonsdk_splash_delay"

.field protected static final CONFIG_BUTTON_SDK_WELCOME_BACK_THRESHOLD:Ljava/lang/String; = "buttonsdk_welcome_back_threshold"

.field protected static final CONFIG_BUTTON_SDK_WELCOME_BACK_TIMEOUT:Ljava/lang/String; = "buttonsdk_welcome_back_timeout"

.field protected static final CONFIG_CACHE_OVERRIDES_V2:Ljava/lang/String; = "cache_overrides_v2"

.field protected static final CONFIG_CANT_FIND_IT_ENABLED:Ljava/lang/String; = "cant_find_it_enabled"

.field protected static final CONFIG_CATEGORY_SETTINGS:Ljava/lang/String; = "category_settings"

.field protected static final CONFIG_DEVICE_AUTHENTICATION:Ljava/lang/String; = "device_authentication"

.field protected static final CONFIG_DISABLE_HOLD_FLAT:Ljava/lang/String; = "disableHoldFlat"

.field protected static final CONFIG_EXPIRATION_DATE_FORMAT:Ljava/lang/String; = "expiration_date_format"

.field protected static final CONFIG_EXPIRATION_DATE_TEXT_COLOR:Ljava/lang/String; = "expiration_date_text_color"

.field protected static final CONFIG_EXPIRING_BANNER_VARIANTS:Ljava/lang/String; = "expiring_banner_variants"

.field protected static final CONFIG_EXPIRING_THRESHOLD_HOURS:Ljava/lang/String; = "expiring_threshold_hours"

.field protected static final CONFIG_FAVORITE_RETAILER_SETTINGS:Ljava/lang/String; = "favorite_retailer_settings"

.field protected static final CONFIG_FEATURE_FLAGS:Ljava/lang/String; = "feature_flags"

.field protected static final CONFIG_FEATURE_OPS_KILL_SWITCH:Ljava/lang/String; = "feature_ops_kill_switch"

.field protected static final CONFIG_GALLERY_WHATS_HOT_V2:Ljava/lang/String; = "gallery_whats_hot_v2"

.field protected static final CONFIG_GALLERY_WHATS_NEW_V2:Ljava/lang/String; = "gallery_whats_new_v2"

.field protected static final CONFIG_GCS_ENABLED:Ljava/lang/String; = "gcs_enabled"

.field protected static final CONFIG_GREETING_SCHEDULE:Ljava/lang/String; = "greeting_schedule"

.field protected static final CONFIG_HIDE_REBATE_DISABLED:Ljava/lang/String; = "hide_rebate_disabled"

.field protected static final CONFIG_HOW_TO_USE_IBOTTA_URL:Ljava/lang/String; = "how_to_use_ibotta_url"

.field protected static final CONFIG_IM_ACCOUNT_CREATION_DISABLED_RETAILERS:Ljava/lang/String; = "im_account_creation_disabled_retailers"

.field protected static final CONFIG_IM_EMAIL_VALIDATION_RETAILERS:Ljava/lang/String; = "im_email_validation_retailers"

.field protected static final CONFIG_INVITE_COPY:Ljava/lang/String; = "invite_copy"

.field protected static final CONFIG_LOCATION:Ljava/lang/String; = "location"

.field protected static final CONFIG_LOW_SPACE_THRESHOLD_MB:Ljava/lang/String; = "appCacheLowSpaceThresholdMB"

.field protected static final CONFIG_LOYALTY_CARD_LINK:Ljava/lang/String; = "loyalty_card_link"

.field protected static final CONFIG_MAX_VIDEO_DURATION:Ljava/lang/String; = "max_video_duration"

.field protected static final CONFIG_MCOMM_LEARN_MORE_URL:Ljava/lang/String; = "mcomm_learn_more_url"

.field protected static final CONFIG_MOBILE_SHOPPING_CATEGORY_ID:Ljava/lang/String; = "mobile_shopping_category_id"

.field protected static final CONFIG_MVT_WINNERS:Ljava/lang/String; = "mvt_winners"

.field protected static final CONFIG_NEARBY_RETAILER_DISTANCE:Ljava/lang/String; = "nearbyRetailerDistance"

.field protected static final CONFIG_OCR_DEVICE_BLACKLIST:Ljava/lang/String; = "ocr.device_blacklist"

.field protected static final CONFIG_OCR_EDGE_DETECTION_ENABLED:Ljava/lang/String; = "ocr.edgeDetectionEnabled"

.field protected static final CONFIG_OCR_ENABLED:Ljava/lang/String; = "ocr.enabled"

.field protected static final CONFIG_OS_DEPRECATION:Ljava/lang/String; = "osDeprecationDialog"

.field protected static final CONFIG_PARTNER_APP_TRACKING:Ljava/lang/String; = "partner_app_tracking"

.field protected static final CONFIG_PAYPAL:Ljava/lang/String; = "paypal"

.field protected static final CONFIG_PIXEL_TRACKING_MAX_ATTEMPTS:Ljava/lang/String; = "pixelTrackingMaxAttempts"

.field protected static final CONFIG_PUSH_FRAMEWORK_REQUIRED:Ljava/lang/String; = "pushFrameworkRequired"

.field protected static final CONFIG_QR_CODE_RETAILERS:Ljava/lang/String; = "loyalty_qr_code_retailers"

.field protected static final CONFIG_QUESTS_HEADER_INFO:Ljava/lang/String; = "quest_header_info"

.field protected static final CONFIG_RECENTLY_VIEWED_MODULE_ID:Ljava/lang/String; = "recently_viewed_module_id"

.field protected static final CONFIG_RECOMMENDED_STORES_COUNT:Ljava/lang/String; = "recommended_stores_count"

.field protected static final CONFIG_RETAILERS_TO_SHOW_IM_DATA_DISCLAIMER:Ljava/lang/String; = "retailers_to_show_IM_data_disclaimer"

.field protected static final CONFIG_REWARD_CODES_DISABLED:Ljava/lang/String; = "reward_codes_disabled"

.field protected static final CONFIG_RICH_PUSH_DISABLED:Ljava/lang/String; = "rich_push_disabled"

.field protected static final CONFIG_SHOW_QUANTITY_BADGE:Ljava/lang/String; = "show_quantity_badge"

.field protected static final CONFIG_SPECIAL_CONDITIONS_MESSAGE:Ljava/lang/String; = "special_conditions_message"

.field protected static final CONFIG_STORE_MODULE_APP_ROW_LIMIT:Ljava/lang/String; = "store_module_app_row_limit"

.field protected static final CONFIG_STORE_MODULE_HOTNESS:Ljava/lang/String; = "store_module_hotness"

.field protected static final CONFIG_STORE_SELECTOR_REQS:Ljava/lang/String; = "store_selector_requirements"

.field protected static final CONFIG_STORE_SELECTOR_V5_REQS:Ljava/lang/String; = "store_selector_requirements_v5"

.field protected static final CONFIG_TEAMWORK_DISABLED:Ljava/lang/String; = "teamwork_disabled"

.field protected static final CONFIG_TRACKING:Ljava/lang/String; = "tracking"

.field protected static final CONFIG_TRACKING_CLIENTS:Ljava/lang/String; = "tracking_clients"

.field protected static final CONFIG_UNLOCK_RETAILER_LIST:Ljava/lang/String; = "unlock_retailer_list"

.field protected static final CONFIG_USER_PROGRESS_COPY:Ljava/lang/String; = "user_progress_copy"

.field protected static final CONFIG_VENMO:Ljava/lang/String; = "venmo"

.field protected static final CONFIG_VERIFY_MAX_SCAN_ATTEMPTS:Ljava/lang/String; = "verifyMaxScanAttempts"

.field protected static final CONFIG_VERSIONS_BLACKLIST:Ljava/lang/String; = "blacklisted_versions"

.field protected static final CONFIG_YOU_MIGHT_LIKE_V2:Ljava/lang/String; = "you_might_like_v2"

.field protected static final DEFAULT_ALL_GALLERY_CATEGORY_TAB_MVT_ENABLED:Z = false

.field protected static final DEFAULT_BUTTON_BROWSER_CARD_DELAY:I = 0x1388

.field protected static final DEFAULT_EXPIRATION_DATE_FORMAT:Ljava/lang/String; = "\'Exp \'MM/dd/yy"

.field protected static final DEFAULT_EXPIRATION_DATE_TEXT_COLOR:Ljava/lang/String; = "#E25461"

.field protected static final DEFAULT_EXPIRATION_THRESHOLD_HOURS:I = 0x78

.field protected static final DEFAULT_IBOTTA_LOYALTY_LINK:Ljava/lang/String; = "https://help.ibotta.com/hc/en-us/articles/115006644827-How-do-I-link-my-loyalty-card-"

.field protected static final DEFAULT_LOW_SPACE_THRESHOLD_MB:J = 0x64L

.field protected static final DEFAULT_MOBILE_SHOPPING_CATEGORY_ID:I = 0x1e5

.field protected static final DEFAULT_PIXEL_TRACKING_MAX_RETRIES:Ljava/lang/Integer;

.field protected static final DEFAULT_RECOMMENDED_STORES_COUNT:I = 0x3

.field protected static final DEFAULT_UNLOCK_RETAILER_LIST:Z = false

.field protected static final DEFAULT_VERIFY_MAX_SCAN_ATTEMPTS:I = 0x2

.field protected static final DEFAULT_WHATS_HOT_LIMIT:I = 0x33

.field protected static final KEY_ALL_GALLERY_CATEGORY_TAB_MVT_ENABLED:Ljava/lang/String; = "all_gallery_category_tab_mvt_enabled"

.field protected static final KEY_APP_CACHE_LOW_SPACE_THRESHOLD_MB:Ljava/lang/String; = "appCacheLowSpaceThresholdMB"

.field protected static final KEY_APP_MIN_VERSION:Ljava/lang/String; = "app.minVersion"

.field protected static final KEY_APP_VERIFICATION_VALIDITY:Ljava/lang/String; = "app_verification_validity"

.field protected static final KEY_APP_WHATS_HOT_LIMIT:Ljava/lang/String; = "app.minVersion"

.field protected static final KEY_BLACKLIST_PIC_SIZE:Ljava/lang/String; = "blacklist_pic_size"

.field protected static final KEY_BLACKLIST_RECEIPT_FOCUS:Ljava/lang/String; = "blacklist_receipt_focus"

.field protected static final KEY_BUTTON_BROWSER_CARD_DELAY:Ljava/lang/String; = "button_browser_card_delay"

.field protected static final KEY_BUTTON_SDK_AUTOFILL_ENABLED:Ljava/lang/String; = "buttonsdk_autofill_enabled"

.field protected static final KEY_BUTTON_SDK_SPLASH_DELAY:Ljava/lang/String; = "buttonsdk_splash_delay"

.field protected static final KEY_BUTTON_SDK_WELCOME_BACK_THRESHOLD:Ljava/lang/String; = "buttonsdk_welcome_back_threshold"

.field protected static final KEY_BUTTON_SDK_WELCOME_BACK_TIMEOUT:Ljava/lang/String; = "buttonsdk_welcome_back_timeout"

.field protected static final KEY_CACHE_OVERRIDES_V2:Ljava/lang/String; = "cache_overrides_v2"

.field protected static final KEY_CANT_FIND_IT_ENABLED:Ljava/lang/String; = "cant_find_it_enabled"

.field protected static final KEY_CATEGORY_SETTINGS:Ljava/lang/String; = "category_settings"

.field protected static final KEY_DEVICE_AUTHENTICATION:Ljava/lang/String; = "device_authentication"

.field protected static final KEY_DISABLE_HOLD_FLAT:Ljava/lang/String; = "disableHoldFlat"

.field protected static final KEY_EXPIRATION_DATE_FORMAT:Ljava/lang/String; = "expiration_date_format"

.field protected static final KEY_EXPIRATION_DATE_TEXT_COLOR:Ljava/lang/String; = "expiration_date_text_color"

.field protected static final KEY_EXPIRING_BANNER_VARIANTS:Ljava/lang/String; = "expiring_banner_variants"

.field protected static final KEY_EXPIRING_THRESHOLD_HOURS:Ljava/lang/String; = "expiring_threshold_hours"

.field protected static final KEY_FAVORITE_RETAILER_SETTINGS:Ljava/lang/String; = "favorite_retailer_settings"

.field protected static final KEY_FEATURE_FLAGS:Ljava/lang/String; = "feature_flags"

.field protected static final KEY_FEATURE_OPS_KILL_SWITCH:Ljava/lang/String; = "feature_ops_kill_switch"

.field protected static final KEY_GALLERY_WHATS_HOT_V2:Ljava/lang/String; = "gallery_whats_hot_v2"

.field protected static final KEY_GALLERY_WHATS_NEW_V2:Ljava/lang/String; = "gallery_whats_new_v2"

.field protected static final KEY_GCS_ENABLED:Ljava/lang/String; = "gcs_enabled"

.field protected static final KEY_GREETING_SCHEDULE:Ljava/lang/String; = "greeting_schedule"

.field protected static final KEY_HIDE_REBATE_DISABLED:Ljava/lang/String; = "hide_rebate_disabled"

.field protected static final KEY_HOW_TO_USE_IBOTTA_URL:Ljava/lang/String; = "how_to_use_ibotta_url"

.field protected static final KEY_IM_ACCOUNT_CREATION_DISABLED_RETAILERS:Ljava/lang/String; = "im_account_creation_disabled_retailers"

.field protected static final KEY_IM_EMAIL_VALIDATION_RETAILERS:Ljava/lang/String; = "im_email_validation_retailers"

.field protected static final KEY_INVITE_COPY:Ljava/lang/String; = "invite_copy"

.field protected static final KEY_LOYALTY_CARD_LINK:Ljava/lang/String; = "loyalty_card_link"

.field protected static final KEY_MAX_VIDEO_DURATION:Ljava/lang/String; = "max_video_duration"

.field protected static final KEY_MCOMM_LEARN_MORE_URL:Ljava/lang/String; = "mcomm_learn_more_url"

.field protected static final KEY_MOBILE_SHOPPING_CATEGORY_ID:Ljava/lang/String; = "mobile_shopping_category_id"

.field protected static final KEY_MVT_WINNERS:Ljava/lang/String; = "mvt_winners"

.field protected static final KEY_NEARBY_RETAILER_DISTANCE:Ljava/lang/String; = "nearbyRetailerDistance"

.field protected static final KEY_OCR_DEVICE_BLACKLIST:Ljava/lang/String; = "ocr.device_blacklist"

.field protected static final KEY_OCR_EDGE_DETECTION_ENABLED:Ljava/lang/String; = "ocr.edgeDetectionEnabled"

.field protected static final KEY_OCR_ENABLED:Ljava/lang/String; = "ocr.enabled"

.field protected static final KEY_OS_DEPRECATION:Ljava/lang/String; = "osDeprecation"

.field protected static final KEY_PARTNER_APP_TRACKING:Ljava/lang/String; = "partner_app_tracking"

.field protected static final KEY_PAYPAL:Ljava/lang/String; = "paypal"

.field protected static final KEY_PIXEL_TRACKING_MAX_ATTEMPTS:Ljava/lang/String; = "pixelTrackingMaxAttempts"

.field protected static final KEY_PUSH_FRAMEWORK_REQUIRED:Ljava/lang/String; = "pushFrameworkRequired"

.field protected static final KEY_QR_CODE_RETAILERS:Ljava/lang/String; = "loyalty_qr_code_retailers"

.field protected static final KEY_QUESTS_HEADER_INFO:Ljava/lang/String; = "quest_header_info"

.field protected static final KEY_RECENTLY_VIEWED_MODULE_ID:Ljava/lang/String; = "recently_viewed_module_id"

.field protected static final KEY_RECOMMENDED_STORES_COUNT:Ljava/lang/String; = "recommended_stores_count"

.field protected static final KEY_RETAILERS_TO_SHOW_IM_DATA_DISCLAIMER:Ljava/lang/String; = "retailers_to_show_IM_data_disclaimer"

.field protected static final KEY_REWARD_CODES_DISABLED:Ljava/lang/String; = "reward_codes_disabled"

.field protected static final KEY_RICH_PUSH_DISABLED:Ljava/lang/String; = "rich_push_disabled"

.field protected static final KEY_SHOW_QUANTITY_BADGE:Ljava/lang/String; = "show_quantity_badge"

.field protected static final KEY_SPECIAL_CONDITIONS_MESSAGE:Ljava/lang/String; = "special_conditions_message"

.field protected static final KEY_STORE_MODULE_APP_ROW_LIMIT:Ljava/lang/String; = "store_module_app_row_limit"

.field protected static final KEY_STORE_MODULE_HOTNESS:Ljava/lang/String; = "store_module_hotness"

.field protected static final KEY_STORE_SELECTOR_REQS:Ljava/lang/String; = "store_selector_requirements"

.field protected static final KEY_STORE_SELECTOR_V5_REQS:Ljava/lang/String; = "store_selector_requirements_v5"

.field protected static final KEY_TEAMWORK_DISABLED:Ljava/lang/String; = "teamwork_disabled"

.field protected static final KEY_TRACKING:Ljava/lang/String; = "tracking"

.field protected static final KEY_TRACKING_CLIENTS:Ljava/lang/String; = "tracking_clients"

.field protected static final KEY_UNLOCK_RETAILER_LIST:Ljava/lang/String; = "unlock_retailer_list"

.field protected static final KEY_USER_PROGRESS_COPY:Ljava/lang/String; = "user_progress_copy"

.field protected static final KEY_VENMO:Ljava/lang/String; = "venmo"

.field protected static final KEY_VERIFY_MAX_SCAN_ATTEMPTS:Ljava/lang/String; = "verifyMaxScanAttempts"

.field protected static final KEY_VERSIONS_BLACKLIST:Ljava/lang/String; = "blacklisted_versions"

.field protected static final KEY_YOU_MIGHT_LIKE_V2:Ljava/lang/String; = "you_might_like_v2"


# instance fields
.field private appConfigMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

.field private final listeners:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/ibotta/android/state/app/config/AppConfigListener;",
            ">;"
        }
    .end annotation
.end field

.field private final prefs:Landroid/content/SharedPreferences;

.field private final resources:Landroid/content/res/Resources;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    .line 215
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->DEFAULT_PIXEL_TRACKING_MAX_RETRIES:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Landroid/content/SharedPreferences;Landroid/content/res/Resources;Lcom/ibotta/android/state/app/config/ConfigParserHolder;)V
    .locals 0

    .line 237
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 238
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->prefs:Landroid/content/SharedPreferences;

    .line 239
    iput-object p2, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->resources:Landroid/content/res/Resources;

    .line 240
    iput-object p3, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    .line 241
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->appConfigMap:Ljava/util/Map;

    .line 242
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->listeners:Ljava/util/ArrayList;

    return-void
.end method

.method private getAppConfigValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 875
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->appConfigMap:Ljava/util/Map;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 879
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method private notifyListeners()V
    .locals 6

    .line 883
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->listeners:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/state/app/config/AppConfigListener;

    .line 885
    :try_start_0
    invoke-interface {v1}, Lcom/ibotta/android/state/app/config/AppConfigListener;->onAppConfigChanged()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v3, "Failed to notify listener: %1$s"

    const/4 v4, 0x1

    .line 887
    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v5

    invoke-static {v2, v3, v4}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public addAppConfigListener(Lcom/ibotta/android/state/app/config/AppConfigListener;)V
    .locals 1

    .line 267
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->listeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public allGalleryCategoryTabMvtEnabled()Z
    .locals 4

    .line 928
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->BOOLEAN:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "all_gallery_category_tab_mvt_enabled"

    const-string v2, "all_gallery_category_tab_mvt_enabled"

    const/4 v3, 0x0

    .line 932
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    .line 928
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 934
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/BooleanConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/BooleanConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method protected createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;
    .locals 1

    .line 863
    new-instance v0, Lcom/ibotta/android/state/app/config/ConfigId;

    invoke-direct {v0}, Lcom/ibotta/android/state/app/config/ConfigId;-><init>()V

    .line 865
    invoke-virtual {v0, p1}, Lcom/ibotta/android/state/app/config/ConfigId;->setConfigParserType(Lcom/ibotta/android/state/app/config/ConfigParserType;)V

    .line 866
    invoke-virtual {v0, p2}, Lcom/ibotta/android/state/app/config/ConfigId;->setAppConfigKey(Ljava/lang/String;)V

    .line 867
    invoke-direct {p0, p2}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->getAppConfigValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/state/app/config/ConfigId;->setAppConfigValue(Ljava/lang/String;)V

    .line 868
    invoke-virtual {v0, p3}, Lcom/ibotta/android/state/app/config/ConfigId;->setPrefsKey(Ljava/lang/String;)V

    .line 869
    invoke-virtual {v0, p4}, Lcom/ibotta/android/state/app/config/ConfigId;->setDefaultValue(Ljava/lang/Object;)V

    return-object v0
.end method

.method public getAccountCreationDisabledRetailers()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 985
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->INTEGER_LIST:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "im_account_creation_disabled_retailers"

    const-string v2, "im_account_creation_disabled_retailers"

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 991
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/common/IntegerListConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/common/IntegerListConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public getAppCacheLowSpaceThresholdMB()J
    .locals 5

    .line 497
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->LONG:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "appCacheLowSpaceThresholdMB"

    const-string v2, "appCacheLowSpaceThresholdMB"

    const-wide/16 v3, 0x64

    .line 501
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    .line 497
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 503
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/LongConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/LongConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public getAppConfig()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 282
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->appConfigMap:Ljava/util/Map;

    return-object v0
.end method

.method public getAppMinVersion()I
    .locals 4

    .line 552
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->INTEGER:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "app.minVersion"

    const-string v2, "app.minVersion"

    const/4 v3, -0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 554
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/IntegerConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/IntegerConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getButtonBrowserCardDelay()I
    .locals 4

    .line 906
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->INTEGER:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "button_browser_card_delay"

    const-string v2, "button_browser_card_delay"

    const/16 v3, 0x1388

    .line 910
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 906
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 912
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/IntegerConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/IntegerConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getButtonSdkSplashDelay()J
    .locals 5

    .line 508
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->LONG:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "buttonsdk_splash_delay"

    const-string v2, "buttonsdk_splash_delay"

    const-wide/16 v3, 0x1770

    .line 512
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    .line 508
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 514
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/LongConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/LongConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public getButtonSdkWelcomeBackThreshold()J
    .locals 5

    .line 530
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->LONG:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "buttonsdk_welcome_back_threshold"

    const-string v2, "buttonsdk_welcome_back_threshold"

    const-wide/16 v3, 0x0

    .line 534
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    .line 530
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 536
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/LongConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/LongConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public getButtonSdkWelcomeBackTimeout()J
    .locals 5

    .line 519
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->LONG:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "buttonsdk_welcome_back_timeout"

    const-string v2, "buttonsdk_welcome_back_timeout"

    const-wide/16 v3, 0x7d0

    .line 523
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    .line 519
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 525
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/LongConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/LongConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public getCacheOverrides()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;",
            ">;"
        }
    .end annotation

    .line 657
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->CACHE_OVERRIDES:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "cache_overrides_v2"

    const-string v2, "cache_overrides_v2"

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 663
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/cache/CacheOverridesConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/cache/CacheOverridesConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public getCategorySettingsConfig()Lcom/ibotta/android/state/app/config/category/CategorySettingsConfig;
    .locals 4

    .line 339
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->CATEGORY_SETTINGS:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "category_settings"

    const-string v2, "category_settings"

    new-instance v3, Lcom/ibotta/android/state/app/config/category/CategorySettingsConfig;

    invoke-direct {v3}, Lcom/ibotta/android/state/app/config/category/CategorySettingsConfig;-><init>()V

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 345
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/category/CategorySettingsConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/category/CategorySettingsConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/category/CategorySettingsConfig;

    return-object v0
.end method

.method public getConfigParserHolder()Lcom/ibotta/android/state/app/config/ConfigParserHolder;
    .locals 1

    .line 254
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    return-object v0
.end method

.method protected getCurrentTime()J
    .locals 2

    .line 262
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public getDeviceAuthenticationAppConfig()Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;
    .locals 4

    .line 361
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->DEVICE_AUTHENTICATION:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "device_authentication"

    const-string v2, "device_authentication"

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 367
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;

    return-object v0
.end method

.method public getExpirationDateFormat()Ljava/lang/String;
    .locals 4

    .line 567
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->STRING:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "expiration_date_format"

    const-string v2, "expiration_date_format"

    const-string v3, "\'Exp \'MM/dd/yy"

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 573
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/StringConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/StringConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getExpirationDateTextColor()Ljava/lang/String;
    .locals 4

    .line 797
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->STRING:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "expiration_date_text_color"

    const-string v2, "expiration_date_text_color"

    const-string v3, "#E25461"

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 803
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/StringConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/StringConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getExpiringBannerVariants()Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariantsConfig;
    .locals 4

    .line 775
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->EXPIRING_BANNER_VARIANTS:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "expiring_banner_variants"

    const-string v2, "expiring_banner_variants"

    new-instance v3, Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariantsConfig;

    invoke-direct {v3}, Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariantsConfig;-><init>()V

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 781
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariantsConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariantsConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariantsConfig;

    return-object v0
.end method

.method public getExpiringThresholdHours()I
    .locals 4

    .line 786
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->INTEGER:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "expiring_threshold_hours"

    const-string v2, "expiring_threshold_hours"

    const/16 v3, 0x78

    .line 790
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 786
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 792
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/IntegerConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/IntegerConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getFavoriteRetailerSettingsConfig()Lcom/ibotta/android/state/app/config/favorites/FavoriteRetailerSettingsConfig;
    .locals 4

    .line 350
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->FAVORITE_RETAILER_SETTINGS:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "favorite_retailer_settings"

    const-string v2, "favorite_retailer_settings"

    new-instance v3, Lcom/ibotta/android/state/app/config/favorites/FavoriteRetailerSettingsConfig;

    invoke-direct {v3}, Lcom/ibotta/android/state/app/config/favorites/FavoriteRetailerSettingsConfig;-><init>()V

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 356
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/favorites/FavoriteRetailerSettingsConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/favorites/FavoriteRetailerSettingsConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/favorites/FavoriteRetailerSettingsConfig;

    return-object v0
.end method

.method public getFeatureFlags()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/state/app/featureflag/FeatureFlag;",
            ">;"
        }
    .end annotation

    .line 963
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->FEATURE_FLAGS:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "feature_flags"

    const-string v2, "feature_flags"

    .line 967
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v3

    .line 963
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 969
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/featureflag/FeatureFlagConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/featureflag/FeatureFlagConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public getGalleryWhatsHotConfig()Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfig;
    .locals 4

    .line 372
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->GALLERY_WHATS_HOT:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "gallery_whats_hot_v2"

    const-string v2, "gallery_whats_hot_v2"

    new-instance v3, Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfig;

    invoke-direct {v3}, Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfig;-><init>()V

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 378
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfig;

    return-object v0
.end method

.method public getGalleryWhatsNewConfig()Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfig;
    .locals 4

    .line 695
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->GALLERY_WHATS_NEW:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "gallery_whats_new_v2"

    const-string v2, "gallery_whats_new_v2"

    new-instance v3, Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfig;

    invoke-direct {v3}, Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfig;-><init>()V

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 701
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfig;

    return-object v0
.end method

.method public getGcsEnabled()Z
    .locals 4

    .line 996
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->BOOLEAN:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "gcs_enabled"

    const-string v2, "gcs_enabled"

    const/4 v3, 0x1

    .line 1000
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    .line 996
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 1002
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/BooleanConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/BooleanConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public getGeofenceConfig()Ljava/lang/String;
    .locals 2

    .line 383
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->appConfigMap:Ljava/util/Map;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const-string v1, "location"

    .line 387
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getGreetingsSchedule()Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;
    .locals 4

    .line 605
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->GREETING_SCHEDULE:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "greeting_schedule"

    const-string v2, "greeting_schedule"

    iget-object v3, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->resources:Landroid/content/res/Resources;

    .line 609
    invoke-static {v3}, Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;->getDefault(Landroid/content/res/Resources;)Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;

    move-result-object v3

    .line 605
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 611
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/greetings/GreetingScheduleParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/greetings/GreetingScheduleParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;

    return-object v0
.end method

.method public getHowToUseIbottaUrl()Ljava/lang/String;
    .locals 4

    .line 735
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->STRING:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "how_to_use_ibotta_url"

    const-string v2, "how_to_use_ibotta_url"

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 741
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/StringConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/StringConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getImDataDisclaimerRetailers()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1029
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->INTEGER_LIST:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "retailers_to_show_IM_data_disclaimer"

    const-string v2, "retailers_to_show_IM_data_disclaimer"

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 1035
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/common/IntegerListConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/common/IntegerListConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public getImEmailValidationRetailers()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 974
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->INTEGER_LIST:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "im_email_validation_retailers"

    const-string v2, "im_email_validation_retailers"

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 980
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/common/IntegerListConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/common/IntegerListConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public getInviteFriendsCopy()Lcom/ibotta/android/state/app/config/invitefriends/InviteFriendsCopyConfig;
    .locals 4

    .line 764
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->INVITE_FRIENDS_COPY:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "invite_copy"

    const-string v2, "invite_copy"

    new-instance v3, Lcom/ibotta/android/state/app/config/invitefriends/InviteFriendsCopyConfig;

    invoke-direct {v3}, Lcom/ibotta/android/state/app/config/invitefriends/InviteFriendsCopyConfig;-><init>()V

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 770
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/invitefriends/InviteFriendsCopyConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/invitefriends/InviteFriendsCopyConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/invitefriends/InviteFriendsCopyConfig;

    return-object v0
.end method

.method public getListeners()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/config/AppConfigListener;",
            ">;"
        }
    .end annotation

    .line 258
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->listeners:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getLoyaltyCardLink()Ljava/lang/String;
    .locals 4

    .line 952
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->STRING:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "loyalty_card_link"

    const-string v2, "loyalty_card_link"

    const-string v3, "https://help.ibotta.com/hc/en-us/articles/115006644827-How-do-I-link-my-loyalty-card-"

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 958
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/StringConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/StringConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getLoyaltyQrCodeRetailers()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 917
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->INTEGER_LIST:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "loyalty_qr_code_retailers"

    const-string v2, "loyalty_qr_code_retailers"

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 923
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/common/IntegerListConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/common/IntegerListConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public getMaxVideoDuration()I
    .locals 4

    .line 419
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->INTEGER:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "max_video_duration"

    const-string v2, "max_video_duration"

    const/4 v3, 0x0

    .line 420
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 419
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 422
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/IntegerConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/IntegerConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getMcommLearnMoreUrl()Ljava/lang/String;
    .locals 4

    .line 717
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->STRING:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "mcomm_learn_more_url"

    const-string v2, "mcomm_learn_more_url"

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 723
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/StringConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/StringConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getMobileShoppingCategoryId()I
    .locals 4

    .line 841
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->INTEGER:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "mobile_shopping_category_id"

    const-string v2, "mobile_shopping_category_id"

    const/16 v3, 0x1e5

    .line 845
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 841
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 847
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/IntegerConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/IntegerConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getMvtWinnersConfig()Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig;
    .locals 4

    .line 939
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->MVT_WINNERS:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "mvt_winners"

    const-string v2, "mvt_winners"

    sget-object v3, Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig;->DEFAULT:Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 945
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    .line 946
    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/ObjectConfigParser;

    .line 947
    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/ObjectConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig;

    return-object v0
.end method

.method public getNearbyRetailerDistance()F
    .locals 4

    .line 400
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->FLOAT:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "nearbyRetailerDistance"

    const-string v2, "nearbyRetailerDistance"

    const/4 v3, 0x0

    .line 401
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    .line 400
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 403
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/FloatConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/FloatConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method

.method public getOSDeprecationConfig()Lcom/ibotta/android/state/app/config/osdeprecation/OSDeprecationConfig;
    .locals 4

    .line 323
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->OS_DEPRECATION:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "osDeprecationDialog"

    const-string v2, "osDeprecation"

    new-instance v3, Lcom/ibotta/android/state/app/config/osdeprecation/OSDeprecationConfig;

    invoke-direct {v3}, Lcom/ibotta/android/state/app/config/osdeprecation/OSDeprecationConfig;-><init>()V

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 326
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/osdeprecation/OSDeprecationConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/osdeprecation/OSDeprecationConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/osdeprecation/OSDeprecationConfig;

    return-object v0
.end method

.method public getOcrDeviceBlacklist()Lcom/ibotta/android/state/app/config/blacklist/BlacklistConfig;
    .locals 4

    .line 819
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->OCR_DEVICE_BLACKLIST:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "ocr.device_blacklist"

    const-string v2, "ocr.device_blacklist"

    sget-object v3, Lcom/ibotta/android/state/app/config/blacklist/BlacklistConfig;->DEFAULT:Lcom/ibotta/android/state/app/config/blacklist/BlacklistConfig;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 825
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/blacklist/OcrDeviceBlacklistAppConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/blacklist/OcrDeviceBlacklistAppConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/blacklist/BlacklistConfig;

    return-object v0
.end method

.method public getOpsKillSwitchConfig()Lcom/ibotta/android/state/app/config/ops/OpsKillSwitchConfig;
    .locals 4

    .line 852
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->FEATURE_OPS_KILL_SWITCH:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "feature_ops_kill_switch"

    const-string v2, "feature_ops_kill_switch"

    sget-object v3, Lcom/ibotta/android/state/app/config/ops/OpsKillSwitchConfig;->DEFAULT:Lcom/ibotta/android/state/app/config/ops/OpsKillSwitchConfig;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 858
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/ops/OpsKillSwitchConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/ops/OpsKillSwitchConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/ops/OpsKillSwitchConfig;

    return-object v0
.end method

.method public getPartnerAppTrackingConfig()Lcom/ibotta/android/state/app/config/pat/PartnerAppTrackingConfig;
    .locals 4

    .line 830
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->PARTNER_APP_TRACKING:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "partner_app_tracking"

    const-string v2, "partner_app_tracking"

    sget-object v3, Lcom/ibotta/android/state/app/config/pat/PartnerAppTrackingConfig;->DEFAULT:Lcom/ibotta/android/state/app/config/pat/PartnerAppTrackingConfig;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 836
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/pat/PartnerAppTrackingConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/pat/PartnerAppTrackingConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/pat/PartnerAppTrackingConfig;

    return-object v0
.end method

.method public getPaypalAppConfig()Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig;
    .locals 4

    .line 316
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->PAYPAL:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "paypal"

    const-string v2, "paypal"

    sget-object v3, Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig;->DEFAULT:Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 318
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/paypal/PayPalConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/paypal/PayPalConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig;

    return-object v0
.end method

.method public getPictureSizeBlacklist()Ljava/util/List;
    .locals 4
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

    .line 443
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "blacklist.pictureSize.[%1$s]"

    const/4 v2, 0x1

    .line 444
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 445
    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->PICTURE_SIZE_BLACKLIST:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v2, "blacklist_pic_size"

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, v1, v0, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 451
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/picsizeblacklist/PictureSizeBlacklistConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/picsizeblacklist/PictureSizeBlacklistConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getPixelTrackingMaxAttempts()I
    .locals 4

    .line 408
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->INTEGER:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "pixelTrackingMaxAttempts"

    const-string v2, "pixelTrackingMaxAttempts"

    sget-object v3, Lcom/ibotta/android/state/app/config/AppConfigImpl;->DEFAULT_PIXEL_TRACKING_MAX_RETRIES:Ljava/lang/Integer;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 414
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/IntegerConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/IntegerConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getQuestsConfig()Lcom/ibotta/android/state/app/config/quests/QuestsConfig;
    .locals 4

    .line 895
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->QUESTS_HEADER_INFO:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "quest_header_info"

    const-string v2, "quest_header_info"

    new-instance v3, Lcom/ibotta/android/state/app/config/quests/QuestsConfig;

    invoke-direct {v3}, Lcom/ibotta/android/state/app/config/quests/QuestsConfig;-><init>()V

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 901
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/quests/QuestsParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/quests/QuestsParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/quests/QuestsConfig;

    return-object v0
.end method

.method public getReceiptCaptureHoldFlatEnabled()Z
    .locals 4

    .line 427
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->BOOLEAN:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "disableHoldFlat"

    const-string v2, "disableHoldFlat"

    const/4 v3, 0x0

    .line 428
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    .line 427
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 430
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/BooleanConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/BooleanConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public getReceiptFocusBlacklist()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 456
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "blacklist.receiptFocus.[%1$s]"

    const/4 v2, 0x1

    .line 457
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 459
    sget-object v1, Lcom/ibotta/android/state/app/config/ConfigParserType;->RECEIPT_FOCUS_BLACKLIST:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v2, "blacklist_receipt_focus"

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, v1, v0, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 462
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/receiptfocusblacklist/ReceiptFocusBlacklistConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/receiptfocusblacklist/ReceiptFocusBlacklistConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getRecentlyViewedModuleId()I
    .locals 4

    .line 1007
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->INTEGER:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "recently_viewed_module_id"

    const-string v2, "recently_viewed_module_id"

    const/4 v3, 0x0

    .line 1011
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 1007
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 1013
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/IntegerConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/IntegerConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRecommendedStoresCount()I
    .locals 4

    .line 624
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->INTEGER:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "recommended_stores_count"

    const-string v2, "recommended_stores_count"

    const/4 v3, 0x3

    .line 628
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 624
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 630
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/IntegerConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/IntegerConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getResources()Landroid/content/res/Resources;
    .locals 1

    .line 250
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->resources:Landroid/content/res/Resources;

    return-object v0
.end method

.method public getSharedPreferences()Landroid/content/SharedPreferences;
    .locals 1

    .line 246
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->prefs:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public getSpecialConditionsMessage()Ljava/lang/String;
    .locals 4

    .line 706
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->STRING:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "special_conditions_message"

    const-string v2, "special_conditions_message"

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 712
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/StringConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/StringConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getStoreModuleAppRowLimit()I
    .locals 4

    .line 676
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->INTEGER:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "store_module_app_row_limit"

    const-string v2, "store_module_app_row_limit"

    const/4 v3, 0x3

    .line 677
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 676
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 679
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/IntegerConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/IntegerConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getStoreModuleHotnessThreshold()F
    .locals 4

    .line 668
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->FLOAT:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "store_module_hotness"

    const-string v2, "store_module_hotness"

    const v3, -0x800001

    .line 669
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    .line 668
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 671
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/FloatConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/FloatConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method

.method public getStoreSelectorRequirements()Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;
    .locals 4

    .line 635
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->STORE_SELECTOR_REQS:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "store_selector_requirements"

    const-string v2, "store_selector_requirements"

    new-instance v3, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;

    invoke-direct {v3}, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;-><init>()V

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 641
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;

    return-object v0
.end method

.method public getStoreSelectorV5Requirements()Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsV5Config;
    .locals 4

    .line 646
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->STORE_SELECTOR_V5_REQS:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "store_selector_requirements_v5"

    const-string v2, "store_selector_requirements_v5"

    new-instance v3, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsV5Config;

    invoke-direct {v3}, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsV5Config;-><init>()V

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 652
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsV5ConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsV5ConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsV5Config;

    return-object v0
.end method

.method public getTrackingAppConfig()Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;
    .locals 4

    .line 331
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->TRACKING:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "tracking"

    const-string v2, "tracking"

    new-instance v3, Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;

    invoke-direct {v3}, Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;-><init>()V

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 334
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;

    return-object v0
.end method

.method public getTrackingClientsConfig()Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;
    .locals 4

    .line 1018
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->TRACKING_CLIENTS:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "tracking_clients"

    const-string v2, "tracking_clients"

    sget-object v3, Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;->DEFAULT:Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 1024
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;

    return-object v0
.end method

.method public getUserProgressCopy()Lcom/ibotta/android/state/app/config/progress/UserProgressCopyAppConfig;
    .locals 4

    .line 594
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->USER_PROGRESS_COPY:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "user_progress_copy"

    const-string v2, "user_progress_copy"

    new-instance v3, Lcom/ibotta/android/state/app/config/progress/UserProgressCopyAppConfig;

    invoke-direct {v3}, Lcom/ibotta/android/state/app/config/progress/UserProgressCopyAppConfig;-><init>()V

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 600
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/progress/UserProgressCopyAppConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/progress/UserProgressCopyAppConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/progress/UserProgressCopyAppConfig;

    return-object v0
.end method

.method public getVenmoAppConfig()Lcom/ibotta/android/state/app/config/venmo/VenmoAppConfig;
    .locals 4

    .line 309
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->VENMO:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "venmo"

    const-string v2, "venmo"

    new-instance v3, Lcom/ibotta/android/state/app/config/venmo/VenmoAppConfig;

    invoke-direct {v3}, Lcom/ibotta/android/state/app/config/venmo/VenmoAppConfig;-><init>()V

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 311
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/venmo/VenmoConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/venmo/VenmoConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/venmo/VenmoAppConfig;

    return-object v0
.end method

.method public getVerificationValidity()Ljava/lang/Long;
    .locals 4

    .line 392
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->LONG:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "app.verificationValidity"

    const-string v2, "app_verification_validity"

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 395
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/LongConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/LongConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    return-object v0
.end method

.method public getVerifyMaxScanAttempts()I
    .locals 4

    .line 486
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->INTEGER:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "verifyMaxScanAttempts"

    const-string v2, "verifyMaxScanAttempts"

    const/4 v3, 0x2

    .line 490
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 486
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 492
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/IntegerConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/IntegerConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getVersionsBlacklist()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/vdurmont/semver4j/Semver;",
            ">;"
        }
    .end annotation

    .line 467
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->SEMVER_BLACKLIST:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "blacklisted_versions"

    const-string v2, "blacklisted_versions"

    .line 471
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    .line 467
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 473
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/versionsblacklist/VersionsBlacklistConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/versionsblacklist/VersionsBlacklistConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getWhatsHotLimit()I
    .locals 4

    .line 478
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->INTEGER:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "app.whatsHotLimit"

    const-string v2, "app.minVersion"

    const/16 v3, 0x33

    .line 479
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 478
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 481
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/IntegerConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/IntegerConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getYouMightLikeConfig()Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfig;
    .locals 4

    .line 684
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->YOU_MIGHT_LIKE:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "you_might_like_v2"

    const-string v2, "you_might_like_v2"

    new-instance v3, Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfig;

    invoke-direct {v3}, Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfig;-><init>()V

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 690
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/common/SynthesizedCategoryConfig;

    return-object v0
.end method

.method public isButtonSdkAutofillEnabled()Z
    .locals 4

    .line 541
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->BOOLEAN:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "buttonsdk_autofill_enabled"

    const-string v2, "buttonsdk_autofill_enabled"

    const/4 v3, 0x0

    .line 545
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    .line 541
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 547
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/BooleanConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/BooleanConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isCantFindItEnabled()Z
    .locals 4

    .line 586
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->BOOLEAN:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "cant_find_it_enabled"

    const-string v2, "cant_find_it_enabled"

    const/4 v3, 0x0

    .line 587
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    .line 586
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 589
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/BooleanConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/BooleanConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isHideRebateDisabled()Z
    .locals 4

    .line 559
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->BOOLEAN:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "hide_rebate_disabled"

    const-string v2, "hide_rebate_disabled"

    const/4 v3, 0x0

    .line 560
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    .line 559
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 562
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/BooleanConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/BooleanConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isOcrEdgeDetectionEnabled()Z
    .locals 4

    .line 746
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->BOOLEAN:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "ocr.edgeDetectionEnabled"

    const-string v2, "ocr.edgeDetectionEnabled"

    const/4 v3, 0x0

    .line 750
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    .line 746
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 752
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/BooleanConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/BooleanConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isOcrEnabled()Z
    .locals 4

    .line 757
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->BOOLEAN:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "ocr.enabled"

    const-string v2, "ocr.enabled"

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 759
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/BooleanConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/BooleanConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isPushFrameworkRequired()Z
    .locals 4

    .line 298
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->BOOLEAN:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "pushFrameworkRequired"

    const-string v2, "pushFrameworkRequired"

    const/4 v3, 0x0

    .line 302
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    .line 298
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 304
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/BooleanConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/BooleanConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isRewardCodesDisabled()Z
    .locals 4

    .line 578
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->BOOLEAN:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "reward_codes_disabled"

    const-string v2, "reward_codes_disabled"

    const/4 v3, 0x0

    .line 579
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    .line 578
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 581
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/BooleanConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/BooleanConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isRichPushDisabled()Z
    .locals 4

    .line 616
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->BOOLEAN:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "rich_push_disabled"

    const-string v2, "rich_push_disabled"

    const/4 v3, 0x0

    .line 617
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    .line 616
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 619
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/BooleanConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/BooleanConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isTeamworkDisabled()Z
    .locals 4

    .line 435
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->BOOLEAN:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "teamwork_disabled"

    const-string v2, "teamwork_disabled"

    const/4 v3, 0x0

    .line 436
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    .line 435
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 438
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/BooleanConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/BooleanConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public removeAppConfigListener(Lcom/ibotta/android/state/app/config/AppConfigListener;)V
    .locals 1

    .line 272
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->listeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public reset()V
    .locals 1

    .line 277
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->reset()V

    return-void
.end method

.method public setAppConfig(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 288
    iget-object p1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->appConfigMap:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    return-void

    .line 291
    :cond_0
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->appConfigMap:Ljava/util/Map;

    .line 292
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->reset()V

    .line 293
    invoke-direct {p0}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->notifyListeners()V

    return-void
.end method

.method public showQuantityBadge()Z
    .locals 4

    .line 727
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->BOOLEAN:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "show_quantity_badge"

    const-string v2, "show_quantity_badge"

    const/4 v3, 0x0

    .line 728
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    .line 727
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 730
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/BooleanConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/BooleanConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public showUnlockRetailerList()Z
    .locals 4

    .line 808
    sget-object v0, Lcom/ibotta/android/state/app/config/ConfigParserType;->BOOLEAN:Lcom/ibotta/android/state/app/config/ConfigParserType;

    const-string v1, "unlock_retailer_list"

    const-string v2, "unlock_retailer_list"

    const/4 v3, 0x0

    .line 812
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    .line 808
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/AppConfigImpl;->createConfigId(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/android/state/app/config/ConfigId;

    move-result-object v0

    .line 814
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AppConfigImpl;->configParserHolder:Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/BooleanConfigParser;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/BooleanConfigParser;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
