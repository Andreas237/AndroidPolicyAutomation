.class public Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;
.super Ljava/lang/Object;
.source "ScreenNameMap.java"


# static fields
.field private static final SCREEN_NAME_ACCOUNT:Ljava/lang/String; = "account"

.field private static final SCREEN_NAME_ACCOUNT_SETTINGS:Ljava/lang/String; = "account_settings"

.field private static final SCREEN_NAME_ACCOUNT_UPDATE_PROFILE:Ljava/lang/String; = "account_update_profile"

.field private static final SCREEN_NAME_BONUS:Ljava/lang/String; = "bonus"

.field private static final SCREEN_NAME_BONUSES:Ljava/lang/String; = "bonuses"

.field private static final SCREEN_NAME_CASH_OUT:Ljava/lang/String; = "cash_out"

.field private static final SCREEN_NAME_CATEGORY:Ljava/lang/String; = "category"

.field private static final SCREEN_NAME_DEVICE_PROMPT:Ljava/lang/String; = "verify_device_prompt"

.field private static final SCREEN_NAME_EARNINGS_DETAIL:Ljava/lang/String; = "earnings_detail"

.field private static final SCREEN_NAME_EARNINGS_HISTORY:Ljava/lang/String; = "earnings_history"

.field private static final SCREEN_NAME_ENGAGEMENT:Ljava/lang/String; = "engagement"

.field private static final SCREEN_NAME_FIND_OFFERS:Ljava/lang/String; = "find_offers"

.field private static final SCREEN_NAME_FRIENDS:Ljava/lang/String; = "friends"

.field private static final SCREEN_NAME_HOME:Ljava/lang/String; = "home"

.field private static final SCREEN_NAME_INTRODUCTION:Ljava/lang/String; = "introduction"

.field private static final SCREEN_NAME_INVITE_FRIENDS:Ljava/lang/String; = "invite_friends"

.field private static final SCREEN_NAME_LOGIN:Ljava/lang/String; = "login"

.field private static final SCREEN_NAME_LOGIN_FORGOT_PASSWORD:Ljava/lang/String; = "login_forgot_password"

.field private static final SCREEN_NAME_MCOMM_INTERSTITIAL:Ljava/lang/String; = "mcomm_insterstitial"

.field private static final SCREEN_NAME_MY_EARNINGS:Ljava/lang/String; = "my_earnings"

.field private static final SCREEN_NAME_MY_FAVORITES:Ljava/lang/String; = "my_favorites"

.field private static final SCREEN_NAME_MY_OFFERS:Ljava/lang/String; = "my_offers"

.field private static final SCREEN_NAME_NOTIFICATIONS:Ljava/lang/String; = "notifications"

.field private static final SCREEN_NAME_NOTIFICATION_SETTINGS:Ljava/lang/String; = "notification_settings"

.field private static final SCREEN_NAME_OFFER:Ljava/lang/String; = "offer"

.field private static final SCREEN_NAME_PWI_ADD_CARD:Ljava/lang/String; = "pwi_add_card"

.field private static final SCREEN_NAME_PWI_BARCODE:Ljava/lang/String; = "pwi_barcode"

.field private static final SCREEN_NAME_PWI_HOME:Ljava/lang/String; = "pwi_home"

.field private static final SCREEN_NAME_PWI_ONBOARDING:Ljava/lang/String; = "pwi_onboarding"

.field private static final SCREEN_NAME_PWI_RETAILERS_LIST:Ljava/lang/String; = "pwi_retailers_list"

.field private static final SCREEN_NAME_PWI_WALLET:Ljava/lang/String; = "pwi_wallet"

.field private static final SCREEN_NAME_REALTIME_RECEIPT_CAPTURE:Ljava/lang/String; = "realtime_receipt_capture"

.field private static final SCREEN_NAME_RECEIPT_CAPTURE_INSTRUCTIONS:Ljava/lang/String; = "receipt_capture_instructions"

.field private static final SCREEN_NAME_REGISTRATION:Ljava/lang/String; = "registration"

.field private static final SCREEN_NAME_RETAIL_GALLERY:Ljava/lang/String; = "retail_gallery"

.field private static final SCREEN_NAME_SETTINGS_CONNECTED_ACCOUNTS:Ljava/lang/String; = "settings_connected_accounts"

.field private static final SCREEN_NAME_STORE_SELECTOR:Ljava/lang/String; = "store_selector"

.field private static final SCREEN_NAME_TEAMWORK:Ljava/lang/String; = "teamwork"

.field private static final SCREEN_NAME_VERIFY_PHONE_NUMBER:Ljava/lang/String; = "verify_phone_number"


# instance fields
.field private final nameMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/account/AccountActivity;

    const-string v2, "account"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/bonus/BonusDetailActivity;

    const-string v2, "bonus"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/bonus/BonusesPickerActivity;

    const-string v2, "bonuses"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;

    const-string v2, "settings_connected_accounts"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;

    const-string v2, "earnings_history"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;

    const-string v2, "earnings_detail"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;

    const-string v2, "engagement"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;

    const-string v2, "home"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;

    const-string v2, "find_offers"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;

    const-string v2, "login_forgot_password"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;

    const-string v2, "retail_gallery"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;

    const-string v2, "invite_friends"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;

    const-string v2, "introduction"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;

    const-string v2, "login"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;

    const-string v2, "mcomm_insterstitial"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;

    const-string v2, "my_earnings"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;

    const-string v2, "my_favorites"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;

    const-string v2, "my_offers"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;

    const-string v2, "notifications"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;

    const-string v2, "store_selector"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;

    const-string v2, "notification_settings"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;

    const-string v2, "pwi_barcode"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputActivity;

    const-string v2, "pwi_add_card"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;

    const-string v2, "pwi_home"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;

    const-string v2, "pwi_onboarding"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListActivity;

    const-string v2, "pwi_retailers_list"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;

    const-string v2, "receipt_capture_instructions"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    const-string v2, "registration"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;

    const-string v2, "category"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;

    const-string v2, "account_settings"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;

    const-string v2, "offer"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesActivity;

    const-string v2, "friends"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;

    const-string v2, "teamwork"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;

    const-string v2, "account_update_profile"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;

    const-string v2, "verify_device_prompt"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;

    const-string v2, "verify_phone_number"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;

    const-string v2, "pwi_wallet"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;

    const-string v2, "realtime_receipt_capture"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/account/withdraw/WithdrawActivity;

    const-string v2, "cash_out"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getScreenName(Ljava/lang/Class;)Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->nameMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method
