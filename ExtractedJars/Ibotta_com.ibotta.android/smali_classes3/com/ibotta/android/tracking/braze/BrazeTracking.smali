.class public interface abstract Lcom/ibotta/android/tracking/braze/BrazeTracking;
.super Ljava/lang/Object;
.source "BrazeTracking.java"


# static fields
.field public static final EVENT_ACCOUNT_VIEW:Ljava/lang/String; = "view_account"

.field public static final EVENT_ACTIVITY_FEED_VIEW:Ljava/lang/String; = "view_activity_feed"

.field public static final EVENT_BONUSES_VIEW:Ljava/lang/String; = "view_bonuses"

.field public static final EVENT_FIND_REBATES_VIEW:Ljava/lang/String; = "view_find_rebates"

.field public static final EVENT_GALLERY_RETAILER_CATEGORY_VIEW:Ljava/lang/String; = "gallery-view-retailercategory-%1$d"

.field public static final EVENT_GALLERY_RETAILER_VIEW:Ljava/lang/String; = "gallery-view-retailer-%1$d"

.field public static final EVENT_GALLERY_RETAILER_VIEW_NON_CARD_LINKED:Ljava/lang/String; = "gallery-view-non-card-linked-retailer"

.field public static final EVENT_GALLERY_RETAILER_VIEW_NON_CARD_LINKED_BY_ID:Ljava/lang/String; = "gallery-view-non-card-linked-retailer-%1$d"

.field public static final EVENT_GALLERY_VIEW:Ljava/lang/String; = "gallery-view"

.field public static final EVENT_HOME_SCREEN_LOADED:Ljava/lang/String; = "home_screen_loaded"

.field public static final EVENT_HOME_VIEW:Ljava/lang/String; = "view_home"

.field public static final EVENT_IAM_TRIGGER:Ljava/lang/String; = "IAM Trigger"

.field public static final EVENT_INVITE_FRIENDS_VIEW:Ljava/lang/String; = "view_invite_friends"

.field public static final EVENT_MCOMM_OFFER_BONUS:Ljava/lang/String; = "mcomm_offer_bonus"

.field public static final EVENT_MCOMM_RETURN:Ljava/lang/String; = "mcomm_return"

.field public static final EVENT_MOBILE_CASHOUT:Ljava/lang/String; = "mobile_cashout"

.field public static final EVENT_MY_RANK_VIEW:Ljava/lang/String; = "view_my_rank"

.field public static final EVENT_MY_REBATES_VIEW:Ljava/lang/String; = "view_my_rebates"

.field public static final EVENT_OFFER_UNLOCK:Ljava/lang/String; = "offer_unlock"

.field public static final EVENT_PERMISSION_PUSH_LOCATION_VIEW_HOME:Ljava/lang/String; = "permission_pushlocation_view_home"

.field public static final EVENT_RECEIPT_10_PLUS:Ljava/lang/String; = "receipt_10_plus"

.field public static final EVENT_RECEIPT_UPLOADED:Ljava/lang/String; = "receipt_uploaded"

.field public static final EVENT_RECEIPT_UPLOAD_AMOUNT:Ljava/lang/String; = "amount"

.field public static final EVENT_RETAILER_CATEGORY_VIEW:Ljava/lang/String; = "view_retailer_category_%1$d"

.field public static final EVENT_REWARD_CODES_VIEW:Ljava/lang/String; = "view_reward_codes"

.field public static final EVENT_SPOTLIGHT_RETAILER_CATEGORY_VIEW:Ljava/lang/String; = "offer-view-retailercategory-%1$d"

.field public static final EVENT_SPOTLIGHT_RETAILER_VIEW:Ljava/lang/String; = "offer-view-retailer-%1$d"

.field public static final EVENT_SPOTLIGHT_UNLOCK_ITEM_BONUS:Ljava/lang/String; = "unlock_item_bonus"

.field public static final EVENT_TEAMWORK_VIEW:Ljava/lang/String; = "view_teamwork"

.field public static final EVENT_WITHDRAW_CASH_VIEW:Ljava/lang/String; = "view_withdraw_cash"

.field public static final PROPERTY_AMOUNT:Ljava/lang/String; = "amount"

.field public static final PROPERTY_AUXILIARY_CONNECTION:Ljava/lang/String; = "auxiliary_connection"

.field public static final PROPERTY_BONUS_AMOUNT:Ljava/lang/String; = "bonus_amount"

.field public static final PROPERTY_BONUS_DESCRIPTION:Ljava/lang/String; = "bonus_description"

.field public static final PROPERTY_BONUS_DETAILS:Ljava/lang/String; = "bonus_details"

.field public static final PROPERTY_BONUS_EXPIRATION:Ljava/lang/String; = "bonus_expiration"

.field public static final PROPERTY_BONUS_FEATURED:Ljava/lang/String; = "bonus_featured"

.field public static final PROPERTY_BONUS_ID:Ljava/lang/String; = "bonus_id"

.field public static final PROPERTY_BONUS_NAME:Ljava/lang/String; = "bonus_name"

.field public static final PROPERTY_BONUS_OTHER_REWARD:Ljava/lang/String; = "bonus_other_reward"

.field public static final PROPERTY_BONUS_TOKEN_URL:Ljava/lang/String; = "bonus_token_url"

.field public static final PROPERTY_CAMPAIGN_NAME:Ljava/lang/String; = "campaign_name"

.field public static final PROPERTY_METHOD:Ljava/lang/String; = "method"

.field public static final PROPERTY_METHOD_IMAGE:Ljava/lang/String; = "method_image"

.field public static final PROPERTY_OFFER_AMOUNT:Ljava/lang/String; = "offer_amount"

.field public static final PROPERTY_OFFER_DESCRIPTION:Ljava/lang/String; = "offer_description"

.field public static final PROPERTY_OFFER_EXPIRATION:Ljava/lang/String; = "offer_expiration"

.field public static final PROPERTY_OFFER_ID:Ljava/lang/String; = "offer_id"

.field public static final PROPERTY_OFFER_IMAGE:Ljava/lang/String; = "offer_image"

.field public static final PROPERTY_OFFER_NAME:Ljava/lang/String; = "offer_name"

.field public static final PROPERTY_OFFER_REDEMPTION_MAX:Ljava/lang/String; = "offer_redemption_max"

.field public static final PROPERTY_OFFER_URL:Ljava/lang/String; = "offer_url"

.field public static final PROPERTY_RETAILER_ID:Ljava/lang/String; = "retailer_id"

.field public static final PROPERTY_RETAILER_NAME:Ljava/lang/String; = "retailer_name"

.field public static final PROPERTY_RETAILER_SHORT_DESCRIPTION:Ljava/lang/String; = "retailer_short_description"

.field public static final PROPERTY_RETAILER_VERIFICATION_TYPE:Ljava/lang/String; = "retailer_verification_type"


# virtual methods
.method public abstract trackAccountView()V
.end method

.method public abstract trackActivityFeedView()V
.end method

.method public abstract trackBonusesView()V
.end method

.method public abstract trackCashout(FLjava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract trackFindRebatesView()V
.end method

.method public abstract trackGalleryRetailerCategoryView(Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;Ljava/lang/Integer;)V
.end method

.method public abstract trackGalleryRetailerView(Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;)V
.end method

.method public abstract trackGalleryRetailerViewNonLinkedCard(Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;)V
.end method

.method public abstract trackGalleryRetailerViewNonLinkedCardById(Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;)V
.end method

.method public abstract trackGalleryView(Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;)V
.end method

.method public abstract trackHomeScreenLoaded()V
.end method

.method public abstract trackHomeView()V
.end method

.method public abstract trackInviteFriendsView()V
.end method

.method public abstract trackMcommOfferBonus(Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;)V
.end method

.method public abstract trackMcommReturn()V
.end method

.method public abstract trackMyRankView()V
.end method

.method public abstract trackMyRebatesView()V
.end method

.method public abstract trackOfferUnlocked(Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;)V
.end method

.method public abstract trackPermissionPushLocationViewHome()V
.end method

.method public abstract trackReceiptEarningsTenPlus(F)V
.end method

.method public abstract trackReceiptUploaded(F)V
.end method

.method public abstract trackRetailerCategoryViewed(I)V
.end method

.method public abstract trackRewardCodesView()V
.end method

.method public abstract trackSilentPush(Ljava/lang/String;)V
.end method

.method public abstract trackSpotlightRetailerCategoryView(Ljava/lang/Integer;)V
.end method

.method public abstract trackSpotlightUnlockItemBonus(Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;)V
.end method

.method public abstract trackSpotlightView(Ljava/lang/Integer;)V
.end method

.method public abstract trackTeamworkView()V
.end method

.method public abstract trackWithdrawCashView()V
.end method
