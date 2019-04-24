.class public Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;
.super Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;
.source "ConfigurableCachePoliciesImpl.java"

# interfaces
.implements Lcom/ibotta/android/state/app/config/AppConfigListener;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field protected static final BGC_PAYMENT_ACCOUNT:Ljava/lang/String; = "bgc_payment_account"

.field protected static final BGC_TRANSACTIONS:Ljava/lang/String; = "bgc_transactions"

.field protected static final BONUSES:Ljava/lang/String; = "bonuses"

.field protected static final BONUS_BY_ID:Ljava/lang/String; = "bonus_by_id"

.field protected static final CATEGORY_TERMS:Ljava/lang/String; = "category_terms"

.field protected static final COMBINED_OFFERS:Ljava/lang/String; = "combined_offers"

.field protected static final CONFIG:Ljava/lang/String; = "config"

.field protected static final CONFIG_VERSION:Ljava/lang/String; = "config_version"

.field protected static final CUSTOMER_ACCOUNTS:Ljava/lang/String; = "customer_accounts"

.field protected static final CUSTOMER_BUTTON_TXS:Ljava/lang/String; = "customer_button_txs"

.field protected static final CUSTOMER_BY_ID:Ljava/lang/String; = "customer_by_id"

.field protected static final CUSTOMER_FRIENDS:Ljava/lang/String; = "customer_friends"

.field protected static final CUSTOMER_GIFT_CARDS:Ljava/lang/String; = "customer_gift_cards"

.field protected static final CUSTOMER_GIFT_CARD_BY_ID:Ljava/lang/String; = "customer_gift_card_by_id"

.field protected static final CUSTOMER_INVITES_POST:Ljava/lang/String; = "customer_invites_post"

.field protected static final CUSTOMER_LOYALTIES:Ljava/lang/String; = "customer_loyalties"

.field protected static final CUSTOMER_LOYALTY_BY_ID:Ljava/lang/String; = "customer_loyalty_by_id"

.field protected static final CUSTOMER_OFFERS_FRIEND_LIKES:Ljava/lang/String; = "customer_offers_friend_likes"

.field protected static final CUSTOMER_OFFER_CATEGORIES:Ljava/lang/String; = "customer_offer_categories"

.field protected static final CUSTOMER_RETAILER_FAVORITES:Ljava/lang/String; = "customer_retailer_favorites"

.field protected static final CUSTOMER_SETTINGS:Ljava/lang/String; = "customer_settings"

.field protected static final FAVORITE_RETAILERS_CHANGE:Ljava/lang/String; = "favorite_retailers_change"

.field protected static final FILTERED_OFFER_PRODUCTS:Ljava/lang/String; = "filtered_offer_products"

.field protected static final GIFT_CARDS:Ljava/lang/String; = "gift_cards"

.field protected static final GIFT_CARD_BY_ID:Ljava/lang/String; = "gift_card_by_id"

.field protected static final HOME:Ljava/lang/String; = "home"

.field protected static final MY_REBATES:Ljava/lang/String; = "my_rebates"

.field protected static final NOTIFICATIONS:Ljava/lang/String; = "notifications"

.field protected static final OFFER_FEEDBACK:Ljava/lang/String; = "offer_feedback"

.field protected static final PENDING_NOTIFICATIONS:Ljava/lang/String; = "pending_notifications"

.field protected static final RETAILERS_PENDING:Ljava/lang/String; = "retailers_pending"

.field protected static final RETAILER_BY_ID:Ljava/lang/String; = "retailer_by_id"

.field protected static final SOCIAL_OFFERS:Ljava/lang/String; = "social_offers"

.field protected static final SOCIAL_OFFER_BY_ID:Ljava/lang/String; = "social_offer_by_id"

.field protected static final STORES:Ljava/lang/String; = "stores"

.field protected static final TEST_VARIANTS:Ljava/lang/String; = "test_variants"


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private classToNameMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/api/CacheableApiCall;",
            ">;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private nameToPolicyMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/app/config/AppConfig;)V
    .locals 1

    .line 105
    invoke-direct {p0}, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;-><init>()V

    .line 101
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    .line 102
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->nameToPolicyMap:Ljava/util/Map;

    .line 106
    iput-object p1, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    return-void
.end method


# virtual methods
.method protected getAppConfig()Lcom/ibotta/android/state/app/config/AppConfig;
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    return-object v0
.end method

.method public getCachePolicy(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CachePolicy;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C::",
            "Lcom/ibotta/api/CacheableApiCall;",
            ">(TC;)",
            "Lcom/ibotta/api/CachePolicy;"
        }
    .end annotation

    .line 163
    invoke-super {p0, p1}, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->getCachePolicy(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CachePolicy;

    move-result-object v0

    .line 164
    iget-object v1, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 165
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_0

    const-string v1, "No cache name found for %1$s. Did you forget to map one?"

    .line 168
    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v2

    invoke-static {v1, v3}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0

    .line 172
    :cond_0
    iget-object v4, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->nameToPolicyMap:Ljava/util/Map;

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;

    if-eqz v4, :cond_2

    .line 174
    invoke-virtual {v4}, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->getDefaultPolicy()Lcom/ibotta/api/CachePolicy;

    move-result-object v5

    if-nez v5, :cond_1

    .line 176
    invoke-virtual {v4, v0}, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->setDefaultPolicy(Lcom/ibotta/api/CachePolicy;)V

    const-string v0, "Using cache override: %1$s (%2$s) -> %3$s"

    const/4 v5, 0x3

    .line 177
    new-array v5, v5, [Ljava/lang/Object;

    aput-object v1, v5, v2

    aput-object p1, v5, v3

    const/4 p1, 0x2

    invoke-virtual {v4}, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->toString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v5, p1

    invoke-static {v0, v5}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    move-object v0, v4

    :cond_2
    return-object v0
.end method

.method protected getClassToNameMap()Ljava/util/Map;
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/api/CacheableApiCall;",
            ">;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    return-object v0
.end method

.method public init()V
    .locals 3

    .line 121
    invoke-super {p0}, Lcom/ibotta/android/appcache/policy/CachePoliciesImpl;->init()V

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/bonuses/BonusByIdCall;

    const-string v2, "bonus_by_id"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/bonuses/BonusesCall;

    const-string v2, "bonuses"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/category/CategoryTermsCall;

    const-string v2, "category_terms"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/offer/CombinedOffersCall;

    const-string v2, "combined_offers"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/config/ConfigCall;

    const-string v2, "config"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/config/ConfigVersionCall;

    const-string v2, "config_version"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCall;

    const-string v2, "customer_accounts"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;

    const-string v2, "customer_button_txs"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/customer/CustomerByIdCall;

    const-string v2, "customer_by_id"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/customer/friends/CustomerFriendsCall;

    const-string v2, "customer_friends"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardByIdCall;

    const-string v2, "customer_gift_card_by_id"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardsCall;

    const-string v2, "customer_gift_cards"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/customer/CustomerInvitesPostCall;

    const-string v2, "customer_invites_post"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesCall;

    const-string v2, "customer_loyalties"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltyByIdCall;

    const-string v2, "customer_loyalty_by_id"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesCall;

    const-string v2, "customer_offer_categories"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/offer/CustomerOffersFriendLikesCall;

    const-string v2, "customer_offers_friend_likes"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesCall;

    const-string v2, "customer_retailer_favorites"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/customer/CustomerSettingsCall;

    const-string v2, "customer_settings"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeCall;

    const-string v2, "favorite_retailers_change"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/api/offer/FilteredOfferProductsCall;

    const-string v2, "filtered_offer_products"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/card/GiftCardByIdCall;

    const-string v2, "gift_card_by_id"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/card/GiftCardsCall;

    const-string v2, "gift_cards"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/home/HomeCall;

    const-string v2, "home"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsCall;

    const-string v2, "bgc_payment_account"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;

    const-string v2, "bgc_transactions"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/offer/MyRebatesCall;

    const-string v2, "my_rebates"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/notification/call/NotificationsCall;

    const-string v2, "notifications"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/problem/OfferFeedbackCall;

    const-string v2, "offer_feedback"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/android/notification/call/PendingNotificationsCall;

    const-string v2, "pending_notifications"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/retailer/RetailerByIdCall;

    const-string v2, "retailer_by_id"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/retailer/RetailersPendingCall;

    const-string v2, "retailers_pending"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/offer/SocialOfferByIdCall;

    const-string v2, "social_offer_by_id"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/offer/SocialOffersCall;

    const-string v2, "social_offers"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/store/StoresCall;

    const-string v2, "stores"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->classToNameMap:Ljava/util/Map;

    const-class v1, Lcom/ibotta/api/call/mvt/TestVariantsCall;

    const-string v2, "test_variants"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onAppConfigChanged()V
    .locals 6

    const-string v0, "onAppConfigChanged"

    const/4 v1, 0x0

    .line 188
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->nameToPolicyMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getCacheOverrides()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 193
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 194
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "Discovered cache override for: %1$s"

    const/4 v5, 0x1

    .line 195
    new-array v5, v5, [Ljava/lang/Object;

    aput-object v3, v5, v1

    invoke-static {v4, v5}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;

    .line 200
    invoke-virtual {v2}, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->copy()Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;

    move-result-object v2

    .line 202
    iget-object v4, p0, Lcom/ibotta/android/appcache/policy/ConfigurableCachePoliciesImpl;->nameToPolicyMap:Ljava/util/Map;

    invoke-interface {v4, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method
