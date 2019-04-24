.class public final Lcom/ibotta/android/graphql/OffersGraphQLQuery;
.super Ljava/lang/Object;
.source "OffersGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/Query;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/OffersGraphQLQuery$Offer;,
        Lcom/ibotta/android/graphql/OffersGraphQLQuery$Data;,
        Lcom/ibotta/android/graphql/OffersGraphQLQuery$Variables;,
        Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/Query<",
        "Lcom/ibotta/android/graphql/OffersGraphQLQuery$Data;",
        "Lcom/ibotta/android/graphql/OffersGraphQLQuery$Data;",
        "Lcom/ibotta/android/graphql/OffersGraphQLQuery$Variables;",
        ">;"
    }
.end annotation


# static fields
.field public static final OPERATION_DEFINITION:Ljava/lang/String; = "query OffersGraphQL($retailerIds: [Int], $offerIds: [Int], $limit: Int, $products: Boolean!, $includeAvailableRetailers: Boolean!) {\n  offers(retailerIds: $retailerIds, ids: $offerIds, limit: $limit) {\n    __typename\n    ...OfferFragment\n  }\n}"

.field public static final OPERATION_ID:Ljava/lang/String; = "240f48c0356cd802260582a61fac35d68ec84ec7762171b2592d4526358de0c5"

.field public static final OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

.field public static final QUERY_DOCUMENT:Ljava/lang/String; = "query OffersGraphQL($retailerIds: [Int], $offerIds: [Int], $limit: Int, $products: Boolean!, $includeAvailableRetailers: Boolean!) {\n  offers(retailerIds: $retailerIds, ids: $offerIds, limit: $limit) {\n    __typename\n    ...OfferFragment\n  }\n}\nfragment ButtonInfoFragment on ButtonInfo {\n  __typename\n  android {\n    __typename\n    ...ButtonMetadataFragment\n  }\n  ios {\n    __typename\n    ...ButtonMetadataFragment\n  }\n}\nfragment ButtonMetadataFragment on ButtonMetadata {\n  __typename\n  id\n  url\n}\nfragment OfferFragment on Offer {\n  __typename\n  about\n  about_title\n  activated\n  alternate_text\n  amount\n  any_brand\n  available_at(limit: 30) @include(if: $includeAvailableRetailers) {\n    __typename\n    id\n    model_c_retailer_image\n    name\n  }\n  block_customer_submitted_upcs\n  bonuses\n  button_info_map {\n    __typename\n    ...ButtonInfoFragment\n  }\n  cache_key\n  caption\n  categories\n  combo\n  combo_count\n  current_value\n  description\n  end_time\n  expiration\n  expiring_soon\n  hide_available_at\n  id\n  ignore_barcode\n  large_url\n  legal\n  liked\n  link\n  multiples\n  multiples_count\n  name\n  new_flag\n  non_item\n  non_item_total\n  offer_group_id\n  offer_segment_id\n  offer_type\n  old_value\n  pending\n  percent_back\n  percent_back_max\n  preselect\n  products @include(if: $products)\n  product_groups @include(if: $products) {\n    __typename\n    ...ProductGroupFragment\n  }\n  purchase_type\n  random_weight\n  random_weight_total\n  redemption_max\n  retailers\n  retailer_exclusive\n  rewards {\n    __typename\n    ...RewardFragment\n  }\n  score\n  segment_id\n  self_funded\n  share_url\n  sort_order\n  start_time\n  terms\n  thumb_url\n  total_likes\n  type\n  typed_id\n  url\n  variable_percent_back\n  verified\n}\nfragment OfferRewardPollOptFragment on OfferRewardPollOpt {\n  __typename\n  id\n  content\n  clear_options\n  next_survey_question\n  url\n}\nfragment OfferRewardQuestionFragment on OfferRewardQuestion {\n  __typename\n  id\n  answer\n  content\n  multiple_response\n  options {\n    __typename\n    ...OfferRewardPollOptFragment\n  }\n  url\n}\nfragment ProductGroupFragment on ProductGroup {\n  __typename\n  id\n  ignore_barcode\n  multiples_count\n  multiples\n  name\n  products\n  random_weight_total\n  random_weight\n}\nfragment RewardFragment on OfferReward {\n  __typename\n  amount\n  answer\n  content\n  engagement_id\n  id\n  legal\n  linked_offer_ids\n  options {\n    __typename\n    ...OfferRewardPollOptFragment\n  }\n  questions {\n    __typename\n    ...OfferRewardQuestionFragment\n  }\n  thumb\n  tracking_click_url\n  tracking_impression_url\n  type\n  url\n  weight\n}"


# instance fields
.field private final variables:Lcom/ibotta/android/graphql/OffersGraphQLQuery$Variables;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 58
    new-instance v0, Lcom/ibotta/android/graphql/OffersGraphQLQuery$1;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/OffersGraphQLQuery$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/graphql/OffersGraphQLQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-void
.end method

.method public constructor <init>(Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;ZZ)V
    .locals 7
    .param p1    # Lcom/apollographql/apollo/api/Input;
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
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;ZZ)V"
        }
    .end annotation

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "retailerIds == null"

    .line 70
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "offerIds == null"

    .line 71
    invoke-static {p2, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "limit == null"

    .line 72
    invoke-static {p3, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    new-instance v0, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Variables;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Variables;-><init>(Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;ZZ)V

    iput-object v0, p0, Lcom/ibotta/android/graphql/OffersGraphQLQuery;->variables:Lcom/ibotta/android/graphql/OffersGraphQLQuery$Variables;

    return-void
.end method

.method public static builder()Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;
    .locals 1

    .line 102
    new-instance v0, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public name()Lcom/apollographql/apollo/api/OperationName;
    .locals 1

    .line 107
    sget-object v0, Lcom/ibotta/android/graphql/OffersGraphQLQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-object v0
.end method

.method public operationId()Ljava/lang/String;
    .locals 1

    const-string v0, "240f48c0356cd802260582a61fac35d68ec84ec7762171b2592d4526358de0c5"

    return-object v0
.end method

.method public queryDocument()Ljava/lang/String;
    .locals 1

    const-string v0, "query OffersGraphQL($retailerIds: [Int], $offerIds: [Int], $limit: Int, $products: Boolean!, $includeAvailableRetailers: Boolean!) {\n  offers(retailerIds: $retailerIds, ids: $offerIds, limit: $limit) {\n    __typename\n    ...OfferFragment\n  }\n}\nfragment ButtonInfoFragment on ButtonInfo {\n  __typename\n  android {\n    __typename\n    ...ButtonMetadataFragment\n  }\n  ios {\n    __typename\n    ...ButtonMetadataFragment\n  }\n}\nfragment ButtonMetadataFragment on ButtonMetadata {\n  __typename\n  id\n  url\n}\nfragment OfferFragment on Offer {\n  __typename\n  about\n  about_title\n  activated\n  alternate_text\n  amount\n  any_brand\n  available_at(limit: 30) @include(if: $includeAvailableRetailers) {\n    __typename\n    id\n    model_c_retailer_image\n    name\n  }\n  block_customer_submitted_upcs\n  bonuses\n  button_info_map {\n    __typename\n    ...ButtonInfoFragment\n  }\n  cache_key\n  caption\n  categories\n  combo\n  combo_count\n  current_value\n  description\n  end_time\n  expiration\n  expiring_soon\n  hide_available_at\n  id\n  ignore_barcode\n  large_url\n  legal\n  liked\n  link\n  multiples\n  multiples_count\n  name\n  new_flag\n  non_item\n  non_item_total\n  offer_group_id\n  offer_segment_id\n  offer_type\n  old_value\n  pending\n  percent_back\n  percent_back_max\n  preselect\n  products @include(if: $products)\n  product_groups @include(if: $products) {\n    __typename\n    ...ProductGroupFragment\n  }\n  purchase_type\n  random_weight\n  random_weight_total\n  redemption_max\n  retailers\n  retailer_exclusive\n  rewards {\n    __typename\n    ...RewardFragment\n  }\n  score\n  segment_id\n  self_funded\n  share_url\n  sort_order\n  start_time\n  terms\n  thumb_url\n  total_likes\n  type\n  typed_id\n  url\n  variable_percent_back\n  verified\n}\nfragment OfferRewardPollOptFragment on OfferRewardPollOpt {\n  __typename\n  id\n  content\n  clear_options\n  next_survey_question\n  url\n}\nfragment OfferRewardQuestionFragment on OfferRewardQuestion {\n  __typename\n  id\n  answer\n  content\n  multiple_response\n  options {\n    __typename\n    ...OfferRewardPollOptFragment\n  }\n  url\n}\nfragment ProductGroupFragment on ProductGroup {\n  __typename\n  id\n  ignore_barcode\n  multiples_count\n  multiples\n  name\n  products\n  random_weight_total\n  random_weight\n}\nfragment RewardFragment on OfferReward {\n  __typename\n  amount\n  answer\n  content\n  engagement_id\n  id\n  legal\n  linked_offer_ids\n  options {\n    __typename\n    ...OfferRewardPollOptFragment\n  }\n  questions {\n    __typename\n    ...OfferRewardQuestionFragment\n  }\n  thumb\n  tracking_click_url\n  tracking_impression_url\n  type\n  url\n  weight\n}"

    return-object v0
.end method

.method public responseFieldMapper()Lcom/apollographql/apollo/api/ResponseFieldMapper;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
            "Lcom/ibotta/android/graphql/OffersGraphQLQuery$Data;",
            ">;"
        }
    .end annotation

    .line 98
    new-instance v0, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Data$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Data$Mapper;-><init>()V

    return-object v0
.end method

.method public bridge synthetic variables()Lcom/apollographql/apollo/api/Operation$Variables;
    .locals 1

    .line 38
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/OffersGraphQLQuery;->variables()Lcom/ibotta/android/graphql/OffersGraphQLQuery$Variables;

    move-result-object v0

    return-object v0
.end method

.method public variables()Lcom/ibotta/android/graphql/OffersGraphQLQuery$Variables;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/graphql/OffersGraphQLQuery;->variables:Lcom/ibotta/android/graphql/OffersGraphQLQuery$Variables;

    return-object v0
.end method

.method public wrapData(Lcom/ibotta/android/graphql/OffersGraphQLQuery$Data;)Lcom/ibotta/android/graphql/OffersGraphQLQuery$Data;
    .locals 0

    return-object p1
.end method

.method public bridge synthetic wrapData(Lcom/apollographql/apollo/api/Operation$Data;)Ljava/lang/Object;
    .locals 0

    .line 38
    check-cast p1, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Data;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/OffersGraphQLQuery;->wrapData(Lcom/ibotta/android/graphql/OffersGraphQLQuery$Data;)Lcom/ibotta/android/graphql/OffersGraphQLQuery$Data;

    move-result-object p1

    return-object p1
.end method
