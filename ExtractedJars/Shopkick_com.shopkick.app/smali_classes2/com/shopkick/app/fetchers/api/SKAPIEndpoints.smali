.class public Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;
.super Ljava/lang/Object;
.source "SKAPIEndpoints.java"


# static fields
.field public static final SKAPIEndpointsMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/shopkick/comm/IAPIEndpoint;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 21
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    .line 25
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v2, "/shopkick/v1/user/auth_code_login"

    const-string v7, "com.shopkick.app.fetchers.api.skapi.UserLoginResponse"

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 32
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "UserAuthCodeLoginRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v2/locations/get_store_list"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetStoreListResponse"

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 41
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetStoreListRequestV2"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/promo_code/redeem_promo_code"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.RedeemPromoCodeResponse"

    const/4 v6, 0x1

    const/4 v7, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 50
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "RedeemPromoCodeRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/user/logout"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.UserLogoutResponse"

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 59
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "UserLogoutRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/products/save_product"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.SaveProductResponse"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 68
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "SaveProductRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/surveys/get_survey_url"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetSurveyUrlResponse"

    const/4 v7, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 77
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetSurveyUrlRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/user/send_phone_verification"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.UserSendPhoneVerificationResponse"

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 86
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "UserSendPhoneVerificationRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/offers/get_stories_config_data"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetStoriesConfigDataResponse"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 95
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetStoriesConfigDataRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/user/reset_password"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.UserResetPasswordResponse"

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 104
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "UserResetPasswordRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/reward/redeem"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.RewardRedeemResponse"

    const/4 v5, 0x1

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 113
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "RewardRedeemRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/whatever/call"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.WhateverCallResponse"

    const/4 v7, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 122
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "WhateverCallRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v2/products/get_products"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetProductsResponse"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 131
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetProductsRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/loyalty_programs/buy_and_collect_success_callback"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.BuyAndCollectSuccessCallbackResponse"

    const/4 v6, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 140
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "BuyAndCollectSuccessCallbackRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/reward/community_reward_info"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.CommunityRewardInfoResponse"

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 149
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "CommunityRewardInfoRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/locations/get_cpg_category_feed"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetCPGCategoryFeedResponse"

    const/4 v7, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 158
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetCPGCategoryFeedRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/user/login"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.UserLoginResponse"

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v8, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 167
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "UserLoginRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/scans/submit_receipt_scan"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.SubmitReceiptScanResponse"

    const/4 v5, 0x1

    const/4 v8, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 176
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "SubmitReceiptScanRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/locations/online_store_visit"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.OnlineStoreVisitResponse"

    const/4 v6, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 185
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "OnlineStoreVisitRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/campaigns/nearby_campaigns"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.NearbyCampaignsResponse"

    const/4 v5, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 194
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "NearbyCampaignsRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/reward/get_rewards"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetRewardsResponse"

    const/4 v5, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 203
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetRewardsRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/locations/get_cpg_location_feed"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetCPGLocationFeedResponse"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 212
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetCPGLocationFeedRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/utils/batch"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.BatchResponse"

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 221
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "BatchRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/user/reset_password_from_client"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.UserResetPasswordFromClientResponse"

    const/4 v5, 0x2

    const/4 v7, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 230
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "UserResetPasswordFromClientRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/offers/get_branded_story_tiles"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetBrandedStoryTilesResponse"

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 239
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetBrandedStoryTilesRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/user/get_kicks_activity_receipt_details"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetKicksActivityReceiptDetailsResponse"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 248
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetKicksActivityReceiptDetailsRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/client_flags/list"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.ClientFlagsListResponse"

    const/4 v5, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 257
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "ClientFlagsListRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/offers/unsave_story"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.UnsaveStoryResponse"

    const/4 v5, 0x1

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 266
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "UnsaveStoryRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/offers/get_stories_for_location"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetStoriesForLocationResponse"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 275
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetStoriesForLocationRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/offers/get_story_card"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetStoryCardResponse"

    const/4 v7, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 284
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetStoryCardRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/offers/get_offer_webview_deeplink"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetOfferWebviewDeeplinkResponse"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 293
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetOfferWebviewDeeplinkRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/certificates/get_certificate"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetCertificateResponse"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 302
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetCertificateRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopping_lists/v1/shopping_lists/create_shopping_list"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.CreateShoppingListResponse"

    const/4 v6, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 311
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "CreateShoppingListRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/offers/save_story_card"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.SaveStoryCardResponse"

    const/4 v6, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 320
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "SaveStoryCardRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/profiles/upload_photo"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.ProfilesUploadPhotoResponse"

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 329
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "ProfilesUploadPhotoRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/locations/get_nearby_cpg_feed"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetNearbyCPGFeedResponse"

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 338
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetNearbyCPGFeedRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/scans/get_product_scan_infos"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetProductScanInfosResponse"

    const/4 v6, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 347
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetProductScanInfosRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v2/profiles/points"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.ProfilesPointsV2Response"

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 356
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "ProfilesPointsRequestV2"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/reward/update_used_status"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.RewardUpdateUsedStatusResponse"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 365
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "RewardUpdateUsedStatusRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 367
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/locations/get_nearby_locations_for_chain"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetNearbyLocationsForChainResponse"

    const/4 v7, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 374
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetNearbyLocationsForChainRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/offers/get_all_collection_tiles"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetAllCollectionTilesResponse"

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 383
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetAllCollectionTilesRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 385
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/offers/save_story"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.SaveStoryResponse"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 392
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "SaveStoryRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/user/get_kicks_activities"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetKicksActivitiesResponse"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 401
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetKicksActivitiesRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopping_lists/v1/shopping_lists/get_item_identifiers_for_keywords"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetItemIdentifiersForKeywordsResponse"

    const/4 v6, 0x1

    const/4 v7, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 410
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetItemIdentifiersForKeywordsRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/reward/get_redeemed_reward_share_link"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetRedeemedRewardShareLinkResponse"

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 419
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetRedeemedRewardShareLinkRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 421
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v2/reward/update_used_status"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.RewardUpdateUsedStatusResponse"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 428
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "RewardUpdateUsedStatusRequestV2"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 430
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/user/email_verify_send"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.EmailVerifySendResponse"

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 437
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "EmailVerifySendRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 439
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/profiles/set_privacy"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.ProfilesSetPrivacyResponse"

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 446
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "ProfilesSetPrivacyRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 448
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/friends/invite_promo_code_info"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.InvitePromoCodeInfoResponse"

    const/4 v6, 0x1

    const/4 v7, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 455
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "InvitePromoCodeInfoRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 457
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/whatever/get_overlay_samples"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetOverlaySamplesResponse"

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 464
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetOverlaySamplesRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 466
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/locations/online_store_kicks_by_category"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.OnlineStoreKicksByCategoryResponse"

    const/4 v7, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 473
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "OnlineStoreKicksByCategoryRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 475
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/user/update_user_account_info"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.UpdateUserAccountInfoResponse"

    const/4 v5, 0x2

    const/4 v6, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 482
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "UpdateUserAccountInfoRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 484
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/loyalty_programs/buy_and_collect_delete_card"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.BuyAndCollectDeleteCardResponse"

    const/4 v5, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 491
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "BuyAndCollectDeleteCardRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 493
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/offers/get_discover_screen_feed"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetDiscoverScreenFeedResponse"

    const/4 v6, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 500
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetDiscoverScreenFeedRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 502
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/scans/get_selectable_receipt_scan_items"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetSelectableReceiptScanItemsResponse"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 509
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetSelectableReceiptScanItemsRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 511
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/ads/video_completed"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.VideoCompletedResponse"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 518
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "VideoCompletedRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 520
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/loyalty_programs/send_bby_qr_code_email"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.SendBestBuyQRCodeEmailResponse"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 527
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "SendBestBuyQRCodeEmailRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 529
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/offers/get_story_tiles"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetStoryTilesResponse"

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 536
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetStoryTilesRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 538
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/locations/get_map_location"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetMapLocationResponse"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 545
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetMapLocationRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 547
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v3/reward/list_mall"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.RewardListMallV2Response"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 554
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "RewardListMallV2Request"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 556
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/friends/get_friends_activity"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetFriendsActivityResponse"

    const/4 v6, 0x1

    const/4 v7, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 563
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetFriendsActivityRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 565
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/offers/get_online_offers"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetOnlineOffersResponse"

    const/4 v6, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 572
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetOnlineOffersRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 574
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/locations/get_action_education_information"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetActionEducationInformationResponse"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 581
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetActionEducationInformationRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 583
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/offers/get_stories_user_data"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetStoriesUserDataResponse"

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 590
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetStoriesUserDataRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 592
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v2/campaigns/nearby_campaigns"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.NearbyCampaignsResponse"

    const/4 v5, 0x0

    const/4 v7, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 599
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "NearbyCampaignsRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 601
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v2/offers/get_scans_for_location"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetScansForLocationV2Response"

    const/4 v5, 0x1

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 608
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetScansForLocationRequestV2"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 610
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/user/validate_phone_verification"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.UserValidatePhoneVerificationResponse"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 617
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "UserValidatePhoneVerificationRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 619
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/products/record_scan_errors"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.ProductsRecordScanErrorsResponse"

    const/4 v6, 0x1

    const/4 v7, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 626
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "ProductsRecordScanErrorsRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 628
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v4/loyalty_programs/buy_and_collect_list"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.BuyAndCollectProgramsListV4Response"

    const/4 v6, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 635
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "BuyAndCollectProgramsListRequestV4"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 637
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v2/products/get_similar_products"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetSimilarProductsResponse"

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 644
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetSimilarProductsRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 646
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/user/change_password"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.UserChangePasswordResponse"

    const/4 v6, 0x1

    const/4 v7, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 653
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "UserChangePasswordRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 655
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v2/user/update_user_account_info"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.UpdateUserAccountInfoResponse"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 662
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "UpdateUserAccountInfoRequestV2"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 664
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/user/get_pull_notifications"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.PullNotificationsResponse"

    const/4 v6, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 671
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "PullNotificationsRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 673
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/phone_call/resubscribe_phone"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.ResubscribePhoneCallsResponse"

    const/4 v6, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 680
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "ResubscribePhoneCallsRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 682
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v2/products/scan"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.ProductsScanV2Response"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 689
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "ProductsScanRequestV2"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 691
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/user/update_data_opt_out_state"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.UpdateDataOptOutStateResponse"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 698
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "UpdateDataOptOutStateRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 700
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/user/log_acquisition_event"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.UserLogAcquisitionEventResponse"

    const/4 v5, 0x2

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 707
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "UserLogAcquisitionEventRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 709
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/reward/get_fulfilled_reward"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetFulfilledRewardResponse"

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 716
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetFulfilledRewardRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 718
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/taxonomy/get_taxonomy_node"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetTaxonomyNodeResponse"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 725
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetTaxonomyNodeRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 727
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/locations/get_store_details"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetStoreDetailsResponse"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 734
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetStoreDetailsRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 736
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/user/create_guest"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.UserCreateGuestResponse"

    const/4 v5, 0x2

    const/4 v8, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 743
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "UserCreateGuestRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 745
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopping_lists/v1/shopping_lists/get_popular_items_list"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetPopularItemsListResponse"

    const/4 v5, 0x1

    const/4 v8, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 752
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetPopularItemsListRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 754
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v2/products/get_product"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetProductResponse"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 761
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetProductRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 763
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/locations/checkin"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.LocationsCheckinResponse"

    const/4 v6, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 770
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "LocationsCheckinRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 772
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/scans/get_list_for_store_selector"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetListForStoreSelectorResponse"

    const/4 v6, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 779
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetListForStoreSelectorRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 781
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/offers/get_stories_member_data"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetStoriesMemberDataResponse"

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 788
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetStoriesMemberDataRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 790
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/user/register"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.UserRegisterResponse"

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 797
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "UserRegisterRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 799
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/locations/get_nearby_checkin_locations"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetNearbyCheckinLocationsResponse"

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 806
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetNearbyCheckinLocationsRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 808
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v2/offers/award_instant_bonus"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.AwardInstantBonusV2Response"

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 815
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "AwardInstantBonusRequestV2"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 817
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v2/user/get_kicks_activities"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetKicksActivitiesResponse"

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 824
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetKicksActivitiesRequestV2"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 826
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v3/products/scan"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.ProductsScanV2Response"

    const/4 v6, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 833
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "ProductsScanRequestV3"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 835
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/user/delete_account"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.UserDeleteAccountResponse"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 842
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "UserDeleteAccountRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 844
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/user/validate_signup_email"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.ValidateSignupEmailResponse"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 851
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "ValidateSignupEmailRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 853
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/user/getinfo"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.UserGetInfoResponse"

    const/4 v6, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 860
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "UserGetInfoRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 862
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopping_lists/v1/shopping_lists/get_shopping_list_suggestions"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetShoppingListSuggestionsResponse"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 869
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetShoppingListSuggestionsRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 871
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/user/web_registration"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.UserRegisterResponse"

    const/4 v8, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 878
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "UserWebRegistrationRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 880
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/offline_data/get_offline_data_versions"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetOfflineDataVersionsResponse"

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 887
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetOfflineDataVersionsRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 889
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/locations/geofencing_dynamic_message"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GeofencingDynamicResponse"

    const/4 v5, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 896
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GeofencingDynamicRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 898
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/loyalty_programs/get_buy_and_collect_rules_for_location"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetBuyAndCollectRulesForLocationResponse"

    const/4 v5, 0x1

    const/4 v7, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 905
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetBuyAndCollectRulesForLocationRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 907
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v2/reward/redeem"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.RewardRedeemResponseV2"

    const/4 v6, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 914
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "RewardRedeemRequestV2"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 916
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/user/place_phone_verification_call"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.UserPlacePhoneVerificationCallResponse"

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 923
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "UserPlacePhoneVerificationCallRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 925
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/offers/unsave_story_card"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.UnsaveStoryCardResponse"

    const/4 v7, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 932
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "UnsaveStoryCardRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 934
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/user/select_reward"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.UserSelectRewardResponse"

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 941
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "UserSelectRewardRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 943
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/user/validate_email_address"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.ValidateEmailAddressResponse"

    const/4 v6, 0x1

    const/4 v7, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 950
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "ValidateEmailAddressRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 952
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/locations/get_store_list"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetStoreListResponse"

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 959
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetStoreListRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 961
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/user/app_launched"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.UserAppLaunchedResponse"

    const/4 v7, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 968
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "UserAppLaunchedRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 970
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/scans/get_offer_bundle_infos"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetOfferBundleInfosResponse"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 977
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetOfferBundleInfosRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 979
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/products/unsave_product"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.UnsaveProductResponse"

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 986
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "UnsaveProductRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 988
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/user/email_verify"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.EmailVerifyValidationResponse"

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 995
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "EmailVerifyValidationRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 997
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v5/first_use/config"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.FirstUseConfigResponseV5"

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 1004
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "FirstUseConfigRequestV5"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1006
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/loyalty_programs/buy_and_collect_native_enroll"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.BuyAndCollectNativeEnrollResponse"

    const/4 v6, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 1013
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "BuyAndCollectNativeEnrollRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1015
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/user/fb_connect"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.UserFacebookConnectResponse"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 1022
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "UserFacebookConnectRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1024
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/offers/get_stories_social_data"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetStoriesSocialDataResponse"

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 1031
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetStoriesSocialDataRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1033
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/promo_code/redeem_marketing_promo_code"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.RedeemMarketingPromoCodeResponse"

    const/4 v6, 0x1

    const/4 v7, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 1040
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "RedeemMarketingPromoCodeRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1042
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/locations/get_nearby_chain_locations"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetNearbyChainLocationsResponse"

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 1049
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetNearbyChainLocationsRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1051
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/locations/get_action_education_store_info"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetActionEducationStoreInfoResponse"

    const/4 v7, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 1058
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetActionEducationStoreInfoRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1060
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/products/image_recognition_scan"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.ImageRecognitionProductScanResponse"

    const/4 v6, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 1067
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "ImageRecognitionProductScanRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1069
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/locations/get_locations"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetLocationsResponse"

    const/4 v6, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 1076
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetLocationsRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1078
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v3/profiles/info"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.ProfilesInfoV3Response"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 1085
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "ProfilesInfoRequestV3"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1087
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopping_lists/v1/shopping_lists/modify_shopping_list"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.ModifyShoppingListResponse"

    const/4 v6, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 1094
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "ModifyShoppingListRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1096
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/locations/full_list_update"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.FullLocationsListUpdateResponse"

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 1103
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "FullLocationsListUpdateRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1105
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/user/update"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.UserUpdateResponse"

    const/4 v6, 0x1

    const/4 v7, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 1112
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "UserUpdateRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1114
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/offline_data/get_offline_data"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetOfflineDataResponse"

    const/4 v6, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 1121
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetOfflineDataRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1123
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/user/set_push_service_token"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.UserSetPushServiceTokenResponse"

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 1130
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "UserSetPushServiceTokenRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1132
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/user/unset_push_service_token"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.UserUnsetPushServiceTokenResponse"

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 1139
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "UserUnsetPushServiceTokenRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1141
    new-instance v0, Lcom/shopkick/comm/DefaultAPIEndpoint;

    const-string v4, "/shopkick/v1/logging_config/get_logging_configs"

    const-string v9, "com.shopkick.app.fetchers.api.skapi.GetLoggingConfigsResponse"

    const/4 v7, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 1148
    sget-object v1, Lcom/shopkick/app/fetchers/api/SKAPIEndpoints;->SKAPIEndpointsMap:Ljava/util/Map;

    const-string v2, "GetLoggingConfigsRequest"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
