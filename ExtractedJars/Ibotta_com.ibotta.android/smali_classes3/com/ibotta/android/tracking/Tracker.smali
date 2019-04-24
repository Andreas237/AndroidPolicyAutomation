.class public interface abstract Lcom/ibotta/android/tracking/Tracker;
.super Ljava/lang/Object;
.source "Tracker.java"


# static fields
.field public static final CATEGORY_EVENT:Ljava/lang/String; = "event"

.field public static final CATEGORY_REQUEST_PRE_AUTHORIZATION_LOCATION:Ljava/lang/String; = "request_pre_authorization_location"

.field public static final CATEGORY_REQUEST_REAL_AUTHORIZATION_LOCATION:Ljava/lang/String; = "request_real_authorization_location"

.field public static final EVENT_APP_CACHE_LOW:Ljava/lang/String; = "app_cache_low"

.field public static final EVENT_BUTTON_WELCOME_BACK_SHOWN:Ljava/lang/String; = "button_welcome_back_shown"

.field public static final EVENT_DO_YOU_LOVE_PRESENTED:Ljava/lang/String; = "do_you_love_presented"

.field public static final EVENT_EARNINGS_PROGRESS_BAR_CLICK:Ljava/lang/String; = "earnings_progress_bar_click"

.field public static final EVENT_FCM_REGISTRATION:Ljava/lang/String; = "fcm_registration"

.field public static final EVENT_FEEDBACK_PRESENTED:Ljava/lang/String; = "feedback_presented"

.field public static final EVENT_FRIEND_MESSAGE:Ljava/lang/String; = "friend_message"

.field public static final EVENT_INVITE:Ljava/lang/String; = "invite"

.field public static final EVENT_LABEL_ALL:Ljava/lang/String; = "all"

.field public static final EVENT_LABEL_ALL_EARNINGS_ROW_CLICK:Ljava/lang/String; = "all_earnings_row_click"

.field public static final EVENT_LABEL_AUTO_CONVERTED:Ljava/lang/String; = "auto_converted"

.field public static final EVENT_LABEL_AVAILABLE:Ljava/lang/String; = "available"

.field public static final EVENT_LABEL_BARCODE_MANUAL:Ljava/lang/String; = "barcode_manual"

.field public static final EVENT_LABEL_CANCEL:Ljava/lang/String; = "cancel"

.field public static final EVENT_LABEL_FAIL:Ljava/lang/String; = "fail"

.field public static final EVENT_LABEL_GALLERY:Ljava/lang/String; = "gallery"

.field public static final EVENT_LABEL_GCM_IBOTTA_ERROR:Ljava/lang/String; = "gcm_ibotta_error"

.field public static final EVENT_LABEL_GCM_SUCCESS:Ljava/lang/String; = "gcm_success"

.field public static final EVENT_LABEL_GCM_UNAVAILABLE:Ljava/lang/String; = "gcm_unavailable"

.field public static final EVENT_LABEL_HOME:Ljava/lang/String; = "home"

.field public static final EVENT_LABEL_INVITE_FRIENDS_AND_EARN_CLICK:Ljava/lang/String; = "invite_friends_and_earn_click"

.field public static final EVENT_LABEL_LATER:Ljava/lang/String; = "later"

.field public static final EVENT_LABEL_MANUALLY_CONVERTED:Ljava/lang/String; = "manually_converted"

.field public static final EVENT_LABEL_MESSAGE:Ljava/lang/String; = "message"

.field public static final EVENT_LABEL_MY_EARNINGS_CLICK:Ljava/lang/String; = "my_earnings_click"

.field public static final EVENT_LABEL_NEARBY:Ljava/lang/String; = "nearby"

.field public static final EVENT_LABEL_NEVER:Ljava/lang/String; = "never"

.field public static final EVENT_LABEL_NO:Ljava/lang/String; = "no"

.field public static final EVENT_LABEL_NUDGE:Ljava/lang/String; = "nudge"

.field public static final EVENT_LABEL_OFF:Ljava/lang/String; = "off"

.field public static final EVENT_LABEL_ON:Ljava/lang/String; = "on"

.field public static final EVENT_LABEL_PENDING_EARNINGS_BANNER_CLICK:Ljava/lang/String; = "pending_earnings_banner_click"

.field public static final EVENT_LABEL_PENDING_EARNINGS_ROW_CLICK:Ljava/lang/String; = "pending_earnings_row_click"

.field public static final EVENT_LABEL_RATE:Ljava/lang/String; = "rate"

.field public static final EVENT_LABEL_SENT:Ljava/lang/String; = "sent"

.field public static final EVENT_LABEL_SUCCESS:Ljava/lang/String; = "success"

.field public static final EVENT_LABEL_UNAVAILABLE:Ljava/lang/String; = "unavailable"

.field public static final EVENT_LABEL_VIEW_ALL_TEAMMATES_CLICK:Ljava/lang/String; = "view_all_teammates_click"

.field public static final EVENT_LABEL_VIEW_FULL_EARNINGS_HISTORY_CLICK:Ljava/lang/String; = "view_full_earnings_history_click"

.field public static final EVENT_LABEL_WELCOME_BACK_GOT_IT_CLICK:Ljava/lang/String; = "welcome_back_got_it_click"

.field public static final EVENT_LABEL_YES:Ljava/lang/String; = "yes"

.field public static final EVENT_LINKED_OFFER_VIEW:Ljava/lang/String; = "linked_offer_view"

.field public static final EVENT_LOCATION_STATUS:Ljava/lang/String; = "location_status"

.field public static final EVENT_NOTIFICATION_DETAIL_VIEW:Ljava/lang/String; = "notification_detail_view"

.field public static final EVENT_OS_SEARCH_OFFER_VIEW:Ljava/lang/String; = "os_search_offer_view"

.field public static final EVENT_OS_SEARCH_RETAILER_VIEW:Ljava/lang/String; = "os_search_retailer_view"

.field public static final EVENT_PIXEL_TRACKING_FIRST_ATTEMPT:Ljava/lang/String; = "pixel_tracking_first_attempt"

.field public static final EVENT_PIXEL_TRACKING_GIVE_UP:Ljava/lang/String; = "pixel_tracking_give_up"

.field public static final EVENT_PIXEL_TRACKING_RETRY:Ljava/lang/String; = "pixel_tracking_retry"

.field public static final EVENT_RATE_APP:Ljava/lang/String; = "rate_app"

.field public static final EVENT_ROUTE:Ljava/lang/String; = "route"

.field public static final EVENT_SCANNED_UPCE:Ljava/lang/String; = "scanned_upce"

.field public static final EVENT_WELCOME_BACK_BUTTON_DATA:Ljava/lang/String; = "welcome_back_button_data"

.field public static final EVENT_WELCOME_BONUS_DIALOG_GOT_IT_CLICK:Ljava/lang/String; = "welcome_bonus_dialog_got_it_click"

.field public static final NETWORK_FACEBOOK:Ljava/lang/String; = "facebook"

.field public static final NETWORK_NATIVE:Ljava/lang/String; = "native"

.field public static final NETWORK_TWITTER:Ljava/lang/String; = "twitter"

.field public static final SCREEN_NAME_ALL_EARNINGS:Ljava/lang/String; = "all_earnings"

.field public static final SCREEN_NAME_BARCODE_MANUAL:Ljava/lang/String; = "barcode_manual"

.field public static final SCREEN_NAME_CAPTURE_RECEIPT:Ljava/lang/String; = "capture_receipt"

.field public static final SCREEN_NAME_INVITE_FRIENDS:Ljava/lang/String; = "invite_friends"

.field public static final SCREEN_NAME_PENDING_EARNINGS:Ljava/lang/String; = "pending_earnings"


# virtual methods
.method public abstract event(Ljava/lang/String;)V
.end method

.method public abstract event(Ljava/lang/String;I)V
.end method

.method public abstract event(Ljava/lang/String;J)V
.end method

.method public abstract event(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract init()V
.end method

.method public abstract locationPreAuth(Ljava/lang/String;Z)V
.end method

.method public abstract locationRealAuth(Ljava/lang/String;Z)V
.end method

.method public abstract setUserId(Ljava/lang/String;)V
.end method

.method public abstract view(Ljava/lang/String;)V
.end method
