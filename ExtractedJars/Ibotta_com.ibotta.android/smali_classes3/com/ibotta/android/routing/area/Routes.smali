.class public interface abstract Lcom/ibotta/android/routing/area/Routes;
.super Ljava/lang/Object;
.source "Routes.java"


# static fields
.field public static final ANY_QUERY_PARAMS:Ljava/lang/String; = "(/)?(\\?.*)?$"

.field public static final QUERY_PARAM_QUERY:Ljava/lang/String; = "q"

.field public static final QUERY_PARAM_WEB_RETAILER:Ljava/lang/String; = "retailer"

.field public static final REGEX_ACCOUNT:Ljava/lang/String; = "^/account(/)?(\\?.*)?$"

.field public static final REGEX_ACCOUNT_SETTINGS:Ljava/lang/String; = "^/account/settings(/)?(\\?.*)?$"

.field public static final REGEX_ACCOUNT_SETTINGS_PROFILE:Ljava/lang/String; = "^/account/settings/profile(/)?(\\?.*)?$"

.field public static final REGEX_ACTIVITY:Ljava/lang/String; = "^/activity(/)?(\\?.*)?$"

.field public static final REGEX_ACTIVITY_TEAM:Ljava/lang/String; = "^/activity/team(/)?(\\?.*)?$"

.field public static final REGEX_AREA_ACCOUNT:Ljava/lang/String; = "^/account.*"

.field public static final REGEX_AREA_ACTIVITY:Ljava/lang/String; = "^/activity.*"

.field public static final REGEX_AREA_BONUSES:Ljava/lang/String; = "^/bonuses.*"

.field public static final REGEX_AREA_CACHE:Ljava/lang/String; = "^/cache.*"

.field public static final REGEX_AREA_CONNECT_LOYALTY:Ljava/lang/String; = "^/connect-loyalty.*"

.field public static final REGEX_AREA_CONTACT:Ljava/lang/String; = "^/contact/.*"

.field public static final REGEX_AREA_DEAL:Ljava/lang/String; = "^/deals/deal/.*"

.field public static final REGEX_AREA_EXTERNAL_BROWSER_1:Ljava/lang/String; = "^/url/.*$"

.field public static final REGEX_AREA_EXTERNAL_BROWSER_2:Ljava/lang/String; = "^/?http.*$"

.field public static final REGEX_AREA_FAVORITES:Ljava/lang/String; = "^/favorites.*"

.field public static final REGEX_AREA_FIND_REBATES:Ljava/lang/String; = "^/retailer(s)?/category.*"

.field public static final REGEX_AREA_GALLERY:Ljava/lang/String; = "^/retailer(s)?((?!os_search).)*$"

.field public static final REGEX_AREA_GAME:Ljava/lang/String; = "^/unlock.*"

.field public static final REGEX_AREA_HELP:Ljava/lang/String; = "^/help.*"

.field public static final REGEX_AREA_HOME_1:Ljava/lang/String; = "^/home.*"

.field public static final REGEX_AREA_HOME_2:Ljava/lang/String; = "^/seasonal/.*"

.field public static final REGEX_AREA_HOME_3:Ljava/lang/String; = "^/category/.*"

.field public static final REGEX_AREA_HOW:Ljava/lang/String; = "^/how.*"

.field public static final REGEX_AREA_HOW_TO_USE:Ljava/lang/String; = "^/howtouse.*"

.field public static final REGEX_AREA_IBOTTA_WEB:Ljava/lang/String; = "^/rebate(s)?((?!os_search).)*$"

.field public static final REGEX_AREA_INTERNAL_BROWSER:Ljava/lang/String; = "^/web/.*$"

.field public static final REGEX_AREA_INVITE:Ljava/lang/String; = "(^/invite.*)|(^/referral(/)?)"

.field public static final REGEX_AREA_MODULE:Ljava/lang/String; = "^/module/.*"

.field public static final REGEX_AREA_NONE:Ljava/lang/String; = "^/none.*"

.field public static final REGEX_AREA_OS_1:Ljava/lang/String; = "^/upgrade.*"

.field public static final REGEX_AREA_OS_2:Ljava/lang/String; = "^/feedback.*"

.field public static final REGEX_AREA_OS_SEARCH_1:Ljava/lang/String; = "^/retailer(s)?/(\\d+)/os_search.*"

.field public static final REGEX_AREA_OS_SEARCH_2:Ljava/lang/String; = "^/rebate(s)?/(\\d+)/os_search.*"

.field public static final REGEX_AREA_PRODUCT:Ljava/lang/String; = "^/products/product/.*"

.field public static final REGEX_AREA_PWI:Ljava/lang/String; = "^/buyable-gift-card.*"

.field public static final REGEX_AREA_RANKING:Ljava/lang/String; = "^/ranking.*"

.field public static final REGEX_AREA_REDEEM:Ljava/lang/String; = "^/redeem.*"

.field public static final REGEX_AREA_REFERRAL:Ljava/lang/String; = "^/referral.*"

.field public static final REGEX_AREA_SETTINGS:Ljava/lang/String; = "^/setting(s)?.*"

.field public static final REGEX_AREA_SHAREABLE:Ljava/lang/String; = "^/share/message.*"

.field public static final REGEX_AREA_SPOTLIGHT_1:Ljava/lang/String; = "^/offer(s)?/.*"

.field public static final REGEX_AREA_SPOTLIGHT_2:Ljava/lang/String; = "^/retailer(s)?/any/offer/.*"

.field public static final REGEX_AREA_SPOTLIGHT_3:Ljava/lang/String; = "^/retailer(s)?/(?<retailer_id>\\d+)/offer/.*"

.field public static final REGEX_AREA_TEAMMATES_1:Ljava/lang/String; = "^/teamwork.*"

.field public static final REGEX_AREA_TEAMMATES_2:Ljava/lang/String; = "^/friends.*"

.field public static final REGEX_AREA_UNLOCKED:Ljava/lang/String; = "^/unlocked.*"

.field public static final REGEX_AREA_WITHDRAW_CASH:Ljava/lang/String; = "^/cashout.*"

.field public static final REGEX_BONUSES:Ljava/lang/String; = "^/bonuses(/)?(\\?.*)?$"

.field public static final REGEX_BONUSES_SPECIFIC_BONUS_1:Ljava/lang/String; = "^/bonuses/bonus/(?<bonus_ids>\\d+(,\\d+)*)(/)?(\\?.*)?$"

.field public static final REGEX_BONUSES_SPECIFIC_BONUS_2:Ljava/lang/String; = "^/bonuses/(?<bonus_ids>\\d+)/?.*"

.field public static final REGEX_BUTTON_SDK_RETURN:Ljava/lang/String; = "^/retailer(s)?/(\\d+)/transactions\\?date=(\\d+)$"

.field public static final REGEX_BUY_PWI:Ljava/lang/String; = "^/buyable-gift-card/(?<retailer_id>\\d+)"

.field public static final REGEX_CACHE:Ljava/lang/String; = "^/cache(/)?(\\?.*)?$"

.field public static final REGEX_CASHOUT:Ljava/lang/String; = "^/cashout(/)?(\\?.*)?$"

.field public static final REGEX_CATEGORY_SPECIFIC:Ljava/lang/String; = "^/category/(?<category_id>\\d+)(/)?(\\?.*)?$"

.field public static final REGEX_CONNECT_LOYALTY_FAILURE:Ljava/lang/String; = "^/connect-loyalty-issue/(?<retailer_id>\\d+)(/)?(\\?.*)?$"

.field public static final REGEX_CONNECT_LOYALTY_SUCCESS:Ljava/lang/String; = "^/connect-loyalty/(?<retailer_id>\\d+)(/)?(\\?.*)?$"

.field public static final REGEX_CONTACT_SUPPORT:Ljava/lang/String; = "^/contact/support(/?)"

.field public static final REGEX_DEAL:Ljava/lang/String; = "^/deals/deal/(?<deal_id>[a-z0-9:\\-]+)(/)?(\\?.*)?$"

.field public static final REGEX_EXTERNAL_BROWSER_EXPLICIT:Ljava/lang/String; = "^/url/(?<url>.*)$"

.field public static final REGEX_EXTERNAL_BROWSER_IMPLICIT:Ljava/lang/String; = "^/?(?<url>http.*)$"

.field public static final REGEX_FAVORITES:Ljava/lang/String; = "^/favorites(/)?(\\?.*)?$"

.field public static final REGEX_FEEDBACK:Ljava/lang/String; = "^/feedback(/)?(\\?.*)?$"

.field public static final REGEX_FIND_REBATES:Ljava/lang/String; = "^/retailer(s)?/category?(/)?(\\?.*)?$"

.field public static final REGEX_FRIENDS:Ljava/lang/String; = "^/friends(/)?(\\?.*)?$"

.field public static final REGEX_HELP:Ljava/lang/String; = "^/help(/)?(\\?.*)?$"

.field public static final REGEX_HELPDESK:Ljava/lang/String; = "^/helpdesk(/)?(\\?.*)?$"

.field public static final REGEX_HOME:Ljava/lang/String; = "^/home(/)?(\\?.*)?$"

.field public static final REGEX_HOME_HOT:Ljava/lang/String; = "^/home/hot(/)?(\\?.*)?$"

.field public static final REGEX_HOME_SEARCH:Ljava/lang/String; = "^/home/search/(?<search>.*)$"

.field public static final REGEX_HOME_SEARCH_WEB:Ljava/lang/String; = "^/rebate(s)?(/)?\\?.*(&)?q=.*"

.field public static final REGEX_HOME_SEASONAL:Ljava/lang/String; = "^/seasonal/(?<category_id>\\d+)(/)?(\\?.*)?$"

.field public static final REGEX_HOME_TUTORIAL_UPGRADE:Ljava/lang/String; = "^/home/tutorial/upgrade(/)?(\\?.*)?$"

.field public static final REGEX_HOW_TO_USE:Ljava/lang/String; = "^/howtouse(/)?(\\?.*)?$"

.field public static final REGEX_INTERNAL_BROWSER:Ljava/lang/String; = "^/web/(?<url>.*)$"

.field public static final REGEX_INVITE:Ljava/lang/String; = "(^/invite(/)?(\\?.*)?$)|(^/referral(/)?)"

.field public static final REGEX_MODULE:Ljava/lang/String; = "^/module/(?<module_id>\\d+)"

.field public static final REGEX_MY_EARNINGS:Ljava/lang/String; = "^/account/my-earnings(/)?(\\?.*)?$"

.field public static final REGEX_OFFER_AND_BONUS_COMBO:Ljava/lang/String; = "^/rebates/(?<offer_id>\\d+)/.*/bonuses/(?<bonus_id>\\d+)/.*/?.*$"

.field public static final REGEX_OFFER_TAG_SEARCH:Ljava/lang/String; = "^/home/offer-tag/(?<offer_tag>.*)$"

.field public static final REGEX_PAYMENT_METHODS:Ljava/lang/String; = "^/account/wallet/payment-methods(/)?(\\?.*)?$"

.field public static final REGEX_PERMISSION_LOCATION:Ljava/lang/String; = "^/permission/location$"

.field public static final REGEX_PERMISSION_PUSH_LOCATION:Ljava/lang/String; = "^/permission/pushlocation$"

.field public static final REGEX_PRODUCT:Ljava/lang/String; = "^/products/product/(?<product_id>[a-z0-9:\\-]+)(/)?(\\?.*)?$"

.field public static final REGEX_PURCHASED_GIFT_CARD:Ljava/lang/String; = "^/account/wallet/gift-cards/(?<gift_card_txn_uuid>txn_\\d*)(/)?(\\?.*)?$"

.field public static final REGEX_PWI_RETAILERS:Ljava/lang/String; = "^/buyable-gift-card/retailers(/)?(\\?.*)?$"

.field public static final REGEX_RANKING:Ljava/lang/String; = "^/ranking(/)?(\\?.*)?$"

.field public static final REGEX_REDEEM:Ljava/lang/String; = "^/redeem(/)?(\\?.*)?$"

.field public static final REGEX_REFERRAL:Ljava/lang/String; = "^/referral/.*"

.field public static final REGEX_RETAILER_ANY_OFFER_SPECIFIC:Ljava/lang/String; = "^/retailer(s)?/any/offer/(?<offer_ids>\\d+(,\\d+)*)(/)?(\\?.*)?$"

.field public static final REGEX_RETAILER_ANY_OFFER_SPECIFIC_OS_SEARCH:Ljava/lang/String; = "^/rebate(s)?/(?<offer_ids>\\d+)/os_search(/)?(\\?.*)?$"

.field public static final REGEX_RETAILER_ANY_OFFER_SPECIFIC_WEB:Ljava/lang/String; = "^/rebate(s)?/(?<offer_ids>\\d+).*"

.field public static final REGEX_RETAILER_SPECIFIC:Ljava/lang/String; = "^/retailer(s)?/(?<retailer_id>\\d+)(/(?<gallery_tab>rebates|discounts))?(/)?(\\?.*)?$"

.field public static final REGEX_RETAILER_SPECIFIC_CATEGORY_SPECIFIC:Ljava/lang/String; = "^/retailer(s)?/(?<retailer_id>\\d+)/category/(?<category_id>\\d+)(/)?(\\?.*)?$"

.field public static final REGEX_RETAILER_SPECIFIC_ID_WEB:Ljava/lang/String; = "^/rebates/translate/retailer/(?<retailer_id>\\d+).*"

.field public static final REGEX_RETAILER_SPECIFIC_LINK:Ljava/lang/String; = "^/retailer(s)?/(?<retailer_id>\\d+)/link(/)?(\\?.*)?$"

.field public static final REGEX_RETAILER_SPECIFIC_LOCATE:Ljava/lang/String; = "^/retailer(s)?/(?<retailer_id>\\d+)/locate(/)?(\\?.*)?$"

.field public static final REGEX_RETAILER_SPECIFIC_OFFER_SPECIFIC:Ljava/lang/String; = "^/retailer(s)?/(?<retailer_id>\\d+)/offer/(?<offer_ids>\\d+(,\\d+)*)(/)?(\\?.*)?$"

.field public static final REGEX_RETAILER_SPECIFIC_OFFER_SPECIFIC_WEB:Ljava/lang/String; = "^/rebate(s)?/(?<offer_ids>\\d+)/.*\\?.*retailer=.*$"

.field public static final REGEX_RETAILER_SPECIFIC_OS_SEARCH:Ljava/lang/String; = "^/retailer(s)?/(?<retailer_id>\\d+)/os_search(/)?(\\?.*)?$"

.field public static final REGEX_RETAILER_SPECIFIC_SEARCH:Ljava/lang/String; = "^/retailer(s)?/(?<retailer_id>\\d+)/search/(?<search_jump>.*)$"

.field public static final REGEX_RETAILER_SPECIFIC_WEB:Ljava/lang/String; = "^/rebate(s)?\\?.*retailer=.*"

.field public static final REGEX_SEASONAL_CATEGORY_SPECIFIC_ID_WEB:Ljava/lang/String; = "^/rebates/translate/category/(?<category_id>\\d+).*"

.field public static final REGEX_SETTINGS:Ljava/lang/String; = "^/setting(s)?(/)?(\\?.*)?$"

.field public static final REGEX_SETTINGS_ALERTS:Ljava/lang/String; = "^/account/settings/(app|email)-alerts(/)?(\\?.*)?$"

.field public static final REGEX_SETTINGS_PROFILE:Ljava/lang/String; = "^/setting(s)?/profile(/)?(\\?.*)?$"

.field public static final REGEX_SETTINGS_SOCIAL:Ljava/lang/String; = "^/setting(s)?/social(/(?<social_network>facebook))?(/)?(\\?.*)?$"

.field public static final REGEX_SHAREABLE:Ljava/lang/String; = "^/share/message/.*"

.field public static final REGEX_SPOTLIGHT_WITHOUT_RETAILER:Ljava/lang/String; = "^/offer(s)?/(?<offer_ids>\\d+(,\\d+)*)(/)?(\\?.*)?$"

.field public static final REGEX_TEAMWORK:Ljava/lang/String; = "^/teamwork(/)?(\\?.*)?$"

.field public static final REGEX_UNFAVORITE:Ljava/lang/String; = "unfavorite/retailer/\\d+"

.field public static final REGEX_UNLOCKED:Ljava/lang/String; = "^/unlocked(/any(/(?<unlocked_tab>rebates|discounts))?)?(/)?(\\?.*)?$"

.field public static final REGEX_UNLOCKED_RETAILER:Ljava/lang/String; = "^/unlocked/(?<retailer_id>\\d+)(/(?<unlocked_tab>rebates|discounts))?(/)?(\\?.*)?$"

.field public static final REGEX_UNLOCK_OFFER:Ljava/lang/String; = "^/unlock/(?<offer_id>\\d+)"

.field public static final REGEX_UPGRADE:Ljava/lang/String; = "^/upgrade(/)?(\\?.*)?$"

.field public static final REGEX_WALLET:Ljava/lang/String; = "^/account/wallet/gift-cards(/)?(\\?.*)?$"
