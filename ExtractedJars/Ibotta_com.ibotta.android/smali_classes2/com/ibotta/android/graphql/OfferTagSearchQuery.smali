.class public final Lcom/ibotta/android/graphql/OfferTagSearchQuery;
.super Ljava/lang/Object;
.source "OfferTagSearchQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/Query;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/OfferTagSearchQuery$Offer;,
        Lcom/ibotta/android/graphql/OfferTagSearchQuery$OfferTag;,
        Lcom/ibotta/android/graphql/OfferTagSearchQuery$Data;,
        Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;,
        Lcom/ibotta/android/graphql/OfferTagSearchQuery$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/Query<",
        "Lcom/ibotta/android/graphql/OfferTagSearchQuery$Data;",
        "Lcom/ibotta/android/graphql/OfferTagSearchQuery$Data;",
        "Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;",
        ">;"
    }
.end annotation


# static fields
.field public static final OPERATION_DEFINITION:Ljava/lang/String; = "query OfferTagSearch($name: String!, $products: Boolean!, $includeAvailableRetailers: Boolean!) {\n  offerTag(name: $name) {\n    __typename\n    offers {\n      __typename\n      ...OfferFragment\n    }\n  }\n}"

.field public static final OPERATION_ID:Ljava/lang/String; = "e2bdbfc62e2d6c76a22f94033737496e94c9c792b5d26ff8b11857050be58cfd"

.field public static final OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

.field public static final QUERY_DOCUMENT:Ljava/lang/String; = "query OfferTagSearch($name: String!, $products: Boolean!, $includeAvailableRetailers: Boolean!) {\n  offerTag(name: $name) {\n    __typename\n    offers {\n      __typename\n      ...OfferFragment\n    }\n  }\n}\nfragment ButtonInfoFragment on ButtonInfo {\n  __typename\n  android {\n    __typename\n    ...ButtonMetadataFragment\n  }\n  ios {\n    __typename\n    ...ButtonMetadataFragment\n  }\n}\nfragment ButtonMetadataFragment on ButtonMetadata {\n  __typename\n  id\n  url\n}\nfragment OfferFragment on Offer {\n  __typename\n  about\n  about_title\n  activated\n  alternate_text\n  amount\n  any_brand\n  available_at(limit: 30) @include(if: $includeAvailableRetailers) {\n    __typename\n    id\n    model_c_retailer_image\n    name\n  }\n  block_customer_submitted_upcs\n  bonuses\n  button_info_map {\n    __typename\n    ...ButtonInfoFragment\n  }\n  cache_key\n  caption\n  categories\n  combo\n  combo_count\n  current_value\n  description\n  end_time\n  expiration\n  expiring_soon\n  hide_available_at\n  id\n  ignore_barcode\n  large_url\n  legal\n  liked\n  link\n  multiples\n  multiples_count\n  name\n  new_flag\n  non_item\n  non_item_total\n  offer_group_id\n  offer_segment_id\n  offer_type\n  old_value\n  pending\n  percent_back\n  percent_back_max\n  preselect\n  products @include(if: $products)\n  product_groups @include(if: $products) {\n    __typename\n    ...ProductGroupFragment\n  }\n  purchase_type\n  random_weight\n  random_weight_total\n  redemption_max\n  retailers\n  retailer_exclusive\n  rewards {\n    __typename\n    ...RewardFragment\n  }\n  score\n  segment_id\n  self_funded\n  share_url\n  sort_order\n  start_time\n  terms\n  thumb_url\n  total_likes\n  type\n  typed_id\n  url\n  variable_percent_back\n  verified\n}\nfragment OfferRewardPollOptFragment on OfferRewardPollOpt {\n  __typename\n  id\n  content\n  clear_options\n  next_survey_question\n  url\n}\nfragment OfferRewardQuestionFragment on OfferRewardQuestion {\n  __typename\n  id\n  answer\n  content\n  multiple_response\n  options {\n    __typename\n    ...OfferRewardPollOptFragment\n  }\n  url\n}\nfragment ProductGroupFragment on ProductGroup {\n  __typename\n  id\n  ignore_barcode\n  multiples_count\n  multiples\n  name\n  products\n  random_weight_total\n  random_weight\n}\nfragment RewardFragment on OfferReward {\n  __typename\n  amount\n  answer\n  content\n  engagement_id\n  id\n  legal\n  linked_offer_ids\n  options {\n    __typename\n    ...OfferRewardPollOptFragment\n  }\n  questions {\n    __typename\n    ...OfferRewardQuestionFragment\n  }\n  thumb\n  tracking_click_url\n  tracking_impression_url\n  type\n  url\n  weight\n}"


# instance fields
.field private final variables:Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 59
    new-instance v0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$1;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/OfferTagSearchQuery$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/graphql/OfferTagSearchQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZZ)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "name == null"

    .line 70
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    new-instance v0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;

    invoke-direct {v0, p1, p2, p3}, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;-><init>(Ljava/lang/String;ZZ)V

    iput-object v0, p0, Lcom/ibotta/android/graphql/OfferTagSearchQuery;->variables:Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;

    return-void
.end method

.method public static builder()Lcom/ibotta/android/graphql/OfferTagSearchQuery$Builder;
    .locals 1

    .line 100
    new-instance v0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public name()Lcom/apollographql/apollo/api/OperationName;
    .locals 1

    .line 105
    sget-object v0, Lcom/ibotta/android/graphql/OfferTagSearchQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-object v0
.end method

.method public operationId()Ljava/lang/String;
    .locals 1

    const-string v0, "e2bdbfc62e2d6c76a22f94033737496e94c9c792b5d26ff8b11857050be58cfd"

    return-object v0
.end method

.method public queryDocument()Ljava/lang/String;
    .locals 1

    const-string v0, "query OfferTagSearch($name: String!, $products: Boolean!, $includeAvailableRetailers: Boolean!) {\n  offerTag(name: $name) {\n    __typename\n    offers {\n      __typename\n      ...OfferFragment\n    }\n  }\n}\nfragment ButtonInfoFragment on ButtonInfo {\n  __typename\n  android {\n    __typename\n    ...ButtonMetadataFragment\n  }\n  ios {\n    __typename\n    ...ButtonMetadataFragment\n  }\n}\nfragment ButtonMetadataFragment on ButtonMetadata {\n  __typename\n  id\n  url\n}\nfragment OfferFragment on Offer {\n  __typename\n  about\n  about_title\n  activated\n  alternate_text\n  amount\n  any_brand\n  available_at(limit: 30) @include(if: $includeAvailableRetailers) {\n    __typename\n    id\n    model_c_retailer_image\n    name\n  }\n  block_customer_submitted_upcs\n  bonuses\n  button_info_map {\n    __typename\n    ...ButtonInfoFragment\n  }\n  cache_key\n  caption\n  categories\n  combo\n  combo_count\n  current_value\n  description\n  end_time\n  expiration\n  expiring_soon\n  hide_available_at\n  id\n  ignore_barcode\n  large_url\n  legal\n  liked\n  link\n  multiples\n  multiples_count\n  name\n  new_flag\n  non_item\n  non_item_total\n  offer_group_id\n  offer_segment_id\n  offer_type\n  old_value\n  pending\n  percent_back\n  percent_back_max\n  preselect\n  products @include(if: $products)\n  product_groups @include(if: $products) {\n    __typename\n    ...ProductGroupFragment\n  }\n  purchase_type\n  random_weight\n  random_weight_total\n  redemption_max\n  retailers\n  retailer_exclusive\n  rewards {\n    __typename\n    ...RewardFragment\n  }\n  score\n  segment_id\n  self_funded\n  share_url\n  sort_order\n  start_time\n  terms\n  thumb_url\n  total_likes\n  type\n  typed_id\n  url\n  variable_percent_back\n  verified\n}\nfragment OfferRewardPollOptFragment on OfferRewardPollOpt {\n  __typename\n  id\n  content\n  clear_options\n  next_survey_question\n  url\n}\nfragment OfferRewardQuestionFragment on OfferRewardQuestion {\n  __typename\n  id\n  answer\n  content\n  multiple_response\n  options {\n    __typename\n    ...OfferRewardPollOptFragment\n  }\n  url\n}\nfragment ProductGroupFragment on ProductGroup {\n  __typename\n  id\n  ignore_barcode\n  multiples_count\n  multiples\n  name\n  products\n  random_weight_total\n  random_weight\n}\nfragment RewardFragment on OfferReward {\n  __typename\n  amount\n  answer\n  content\n  engagement_id\n  id\n  legal\n  linked_offer_ids\n  options {\n    __typename\n    ...OfferRewardPollOptFragment\n  }\n  questions {\n    __typename\n    ...OfferRewardQuestionFragment\n  }\n  thumb\n  tracking_click_url\n  tracking_impression_url\n  type\n  url\n  weight\n}"

    return-object v0
.end method

.method public responseFieldMapper()Lcom/apollographql/apollo/api/ResponseFieldMapper;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
            "Lcom/ibotta/android/graphql/OfferTagSearchQuery$Data;",
            ">;"
        }
    .end annotation

    .line 96
    new-instance v0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Data$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Data$Mapper;-><init>()V

    return-object v0
.end method

.method public bridge synthetic variables()Lcom/apollographql/apollo/api/Operation$Variables;
    .locals 1

    .line 36
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/OfferTagSearchQuery;->variables()Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;

    move-result-object v0

    return-object v0
.end method

.method public variables()Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/graphql/OfferTagSearchQuery;->variables:Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;

    return-object v0
.end method

.method public wrapData(Lcom/ibotta/android/graphql/OfferTagSearchQuery$Data;)Lcom/ibotta/android/graphql/OfferTagSearchQuery$Data;
    .locals 0

    return-object p1
.end method

.method public bridge synthetic wrapData(Lcom/apollographql/apollo/api/Operation$Data;)Ljava/lang/Object;
    .locals 0

    .line 36
    check-cast p1, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Data;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/OfferTagSearchQuery;->wrapData(Lcom/ibotta/android/graphql/OfferTagSearchQuery$Data;)Lcom/ibotta/android/graphql/OfferTagSearchQuery$Data;

    move-result-object p1

    return-object p1
.end method
