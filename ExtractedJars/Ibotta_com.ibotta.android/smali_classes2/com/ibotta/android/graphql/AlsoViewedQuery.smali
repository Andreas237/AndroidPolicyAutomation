.class public final Lcom/ibotta/android/graphql/AlsoViewedQuery;
.super Ljava/lang/Object;
.source "AlsoViewedQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/Query;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/AlsoViewedQuery$AlsoViewed;,
        Lcom/ibotta/android/graphql/AlsoViewedQuery$Data;,
        Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;,
        Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/Query<",
        "Lcom/ibotta/android/graphql/AlsoViewedQuery$Data;",
        "Lcom/ibotta/android/graphql/AlsoViewedQuery$Data;",
        "Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;",
        ">;"
    }
.end annotation


# static fields
.field public static final OPERATION_DEFINITION:Ljava/lang/String; = "query AlsoViewed($id: ID!, $retailerId: Int, $limit: Int, $limitStrategy: LimitStrategy, $products: Boolean!, $includeAvailableRetailers: Boolean!) {\n  alsoViewed(id: $id, retailerId: $retailerId, limit: $limit, limitStrategy: $limitStrategy) {\n    __typename\n    ...OfferFragment\n  }\n}"

.field public static final OPERATION_ID:Ljava/lang/String; = "314e7182c7970ad9b8c9bc7ded14eb2599452e42c8810a379d8d79ba45af54dc"

.field public static final OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

.field public static final QUERY_DOCUMENT:Ljava/lang/String; = "query AlsoViewed($id: ID!, $retailerId: Int, $limit: Int, $limitStrategy: LimitStrategy, $products: Boolean!, $includeAvailableRetailers: Boolean!) {\n  alsoViewed(id: $id, retailerId: $retailerId, limit: $limit, limitStrategy: $limitStrategy) {\n    __typename\n    ...OfferFragment\n  }\n}\nfragment ButtonInfoFragment on ButtonInfo {\n  __typename\n  android {\n    __typename\n    ...ButtonMetadataFragment\n  }\n  ios {\n    __typename\n    ...ButtonMetadataFragment\n  }\n}\nfragment ButtonMetadataFragment on ButtonMetadata {\n  __typename\n  id\n  url\n}\nfragment OfferFragment on Offer {\n  __typename\n  about\n  about_title\n  activated\n  alternate_text\n  amount\n  any_brand\n  available_at(limit: 30) @include(if: $includeAvailableRetailers) {\n    __typename\n    id\n    model_c_retailer_image\n    name\n  }\n  block_customer_submitted_upcs\n  bonuses\n  button_info_map {\n    __typename\n    ...ButtonInfoFragment\n  }\n  cache_key\n  caption\n  categories\n  combo\n  combo_count\n  current_value\n  description\n  end_time\n  expiration\n  expiring_soon\n  hide_available_at\n  id\n  ignore_barcode\n  large_url\n  legal\n  liked\n  link\n  multiples\n  multiples_count\n  name\n  new_flag\n  non_item\n  non_item_total\n  offer_group_id\n  offer_segment_id\n  offer_type\n  old_value\n  pending\n  percent_back\n  percent_back_max\n  preselect\n  products @include(if: $products)\n  product_groups @include(if: $products) {\n    __typename\n    ...ProductGroupFragment\n  }\n  purchase_type\n  random_weight\n  random_weight_total\n  redemption_max\n  retailers\n  retailer_exclusive\n  rewards {\n    __typename\n    ...RewardFragment\n  }\n  score\n  segment_id\n  self_funded\n  share_url\n  sort_order\n  start_time\n  terms\n  thumb_url\n  total_likes\n  type\n  typed_id\n  url\n  variable_percent_back\n  verified\n}\nfragment OfferRewardPollOptFragment on OfferRewardPollOpt {\n  __typename\n  id\n  content\n  clear_options\n  next_survey_question\n  url\n}\nfragment OfferRewardQuestionFragment on OfferRewardQuestion {\n  __typename\n  id\n  answer\n  content\n  multiple_response\n  options {\n    __typename\n    ...OfferRewardPollOptFragment\n  }\n  url\n}\nfragment ProductGroupFragment on ProductGroup {\n  __typename\n  id\n  ignore_barcode\n  multiples_count\n  multiples\n  name\n  products\n  random_weight_total\n  random_weight\n}\nfragment RewardFragment on OfferReward {\n  __typename\n  amount\n  answer\n  content\n  engagement_id\n  id\n  legal\n  linked_offer_ids\n  options {\n    __typename\n    ...OfferRewardPollOptFragment\n  }\n  questions {\n    __typename\n    ...OfferRewardQuestionFragment\n  }\n  thumb\n  tracking_click_url\n  tracking_impression_url\n  type\n  url\n  weight\n}"


# instance fields
.field private final variables:Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 59
    new-instance v0, Lcom/ibotta/android/graphql/AlsoViewedQuery$1;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/AlsoViewedQuery$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/graphql/AlsoViewedQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;ZZ)V
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Lcom/apollographql/apollo/api/Input;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p3    # Lcom/apollographql/apollo/api/Input;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p4    # Lcom/apollographql/apollo/api/Input;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;",
            "Lcom/apollographql/apollo/api/Input<",
            "Lcom/ibotta/android/graphql/type/LimitStrategy;",
            ">;ZZ)V"
        }
    .end annotation

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "id == null"

    .line 71
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "retailerId == null"

    .line 72
    invoke-static {p2, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "limit == null"

    .line 73
    invoke-static {p3, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "limitStrategy == null"

    .line 74
    invoke-static {p4, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    new-instance v0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;-><init>(Ljava/lang/String;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;ZZ)V

    iput-object v0, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery;->variables:Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;

    return-void
.end method

.method public static builder()Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;
    .locals 1

    .line 104
    new-instance v0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public name()Lcom/apollographql/apollo/api/OperationName;
    .locals 1

    .line 109
    sget-object v0, Lcom/ibotta/android/graphql/AlsoViewedQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-object v0
.end method

.method public operationId()Ljava/lang/String;
    .locals 1

    const-string v0, "314e7182c7970ad9b8c9bc7ded14eb2599452e42c8810a379d8d79ba45af54dc"

    return-object v0
.end method

.method public queryDocument()Ljava/lang/String;
    .locals 1

    const-string v0, "query AlsoViewed($id: ID!, $retailerId: Int, $limit: Int, $limitStrategy: LimitStrategy, $products: Boolean!, $includeAvailableRetailers: Boolean!) {\n  alsoViewed(id: $id, retailerId: $retailerId, limit: $limit, limitStrategy: $limitStrategy) {\n    __typename\n    ...OfferFragment\n  }\n}\nfragment ButtonInfoFragment on ButtonInfo {\n  __typename\n  android {\n    __typename\n    ...ButtonMetadataFragment\n  }\n  ios {\n    __typename\n    ...ButtonMetadataFragment\n  }\n}\nfragment ButtonMetadataFragment on ButtonMetadata {\n  __typename\n  id\n  url\n}\nfragment OfferFragment on Offer {\n  __typename\n  about\n  about_title\n  activated\n  alternate_text\n  amount\n  any_brand\n  available_at(limit: 30) @include(if: $includeAvailableRetailers) {\n    __typename\n    id\n    model_c_retailer_image\n    name\n  }\n  block_customer_submitted_upcs\n  bonuses\n  button_info_map {\n    __typename\n    ...ButtonInfoFragment\n  }\n  cache_key\n  caption\n  categories\n  combo\n  combo_count\n  current_value\n  description\n  end_time\n  expiration\n  expiring_soon\n  hide_available_at\n  id\n  ignore_barcode\n  large_url\n  legal\n  liked\n  link\n  multiples\n  multiples_count\n  name\n  new_flag\n  non_item\n  non_item_total\n  offer_group_id\n  offer_segment_id\n  offer_type\n  old_value\n  pending\n  percent_back\n  percent_back_max\n  preselect\n  products @include(if: $products)\n  product_groups @include(if: $products) {\n    __typename\n    ...ProductGroupFragment\n  }\n  purchase_type\n  random_weight\n  random_weight_total\n  redemption_max\n  retailers\n  retailer_exclusive\n  rewards {\n    __typename\n    ...RewardFragment\n  }\n  score\n  segment_id\n  self_funded\n  share_url\n  sort_order\n  start_time\n  terms\n  thumb_url\n  total_likes\n  type\n  typed_id\n  url\n  variable_percent_back\n  verified\n}\nfragment OfferRewardPollOptFragment on OfferRewardPollOpt {\n  __typename\n  id\n  content\n  clear_options\n  next_survey_question\n  url\n}\nfragment OfferRewardQuestionFragment on OfferRewardQuestion {\n  __typename\n  id\n  answer\n  content\n  multiple_response\n  options {\n    __typename\n    ...OfferRewardPollOptFragment\n  }\n  url\n}\nfragment ProductGroupFragment on ProductGroup {\n  __typename\n  id\n  ignore_barcode\n  multiples_count\n  multiples\n  name\n  products\n  random_weight_total\n  random_weight\n}\nfragment RewardFragment on OfferReward {\n  __typename\n  amount\n  answer\n  content\n  engagement_id\n  id\n  legal\n  linked_offer_ids\n  options {\n    __typename\n    ...OfferRewardPollOptFragment\n  }\n  questions {\n    __typename\n    ...OfferRewardQuestionFragment\n  }\n  thumb\n  tracking_click_url\n  tracking_impression_url\n  type\n  url\n  weight\n}"

    return-object v0
.end method

.method public responseFieldMapper()Lcom/apollographql/apollo/api/ResponseFieldMapper;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
            "Lcom/ibotta/android/graphql/AlsoViewedQuery$Data;",
            ">;"
        }
    .end annotation

    .line 100
    new-instance v0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Data$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/AlsoViewedQuery$Data$Mapper;-><init>()V

    return-object v0
.end method

.method public bridge synthetic variables()Lcom/apollographql/apollo/api/Operation$Variables;
    .locals 1

    .line 39
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/AlsoViewedQuery;->variables()Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;

    move-result-object v0

    return-object v0
.end method

.method public variables()Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery;->variables:Lcom/ibotta/android/graphql/AlsoViewedQuery$Variables;

    return-object v0
.end method

.method public wrapData(Lcom/ibotta/android/graphql/AlsoViewedQuery$Data;)Lcom/ibotta/android/graphql/AlsoViewedQuery$Data;
    .locals 0

    return-object p1
.end method

.method public bridge synthetic wrapData(Lcom/apollographql/apollo/api/Operation$Data;)Ljava/lang/Object;
    .locals 0

    .line 39
    check-cast p1, Lcom/ibotta/android/graphql/AlsoViewedQuery$Data;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/AlsoViewedQuery;->wrapData(Lcom/ibotta/android/graphql/AlsoViewedQuery$Data;)Lcom/ibotta/android/graphql/AlsoViewedQuery$Data;

    move-result-object p1

    return-object p1
.end method
