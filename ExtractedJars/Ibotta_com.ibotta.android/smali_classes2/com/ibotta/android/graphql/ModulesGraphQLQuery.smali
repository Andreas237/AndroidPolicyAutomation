.class public final Lcom/ibotta/android/graphql/ModulesGraphQLQuery;
.super Ljava/lang/Object;
.source "ModulesGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/Query;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Module;,
        Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Data;,
        Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;,
        Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/Query<",
        "Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Data;",
        "Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Data;",
        "Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;",
        ">;"
    }
.end annotation


# static fields
.field public static final OPERATION_DEFINITION:Ljava/lang/String; = "query ModulesGraphQL($limit: Int, $contentMin: Int, $contentMax: Int, $heroBoost: Boolean, $products: Boolean!, $includeAvailableRetailers: Boolean!) {\n  modules(limit: $limit, contentMin: $contentMin, contentMax: $contentMax, heroBoost: $heroBoost) {\n    __typename\n    ...ModuleFragment\n  }\n}"

.field public static final OPERATION_ID:Ljava/lang/String; = "2290b46c61122cc3bf793c12e93f184f7b7b3bb609769d647b5f14de878f8b8e"

.field public static final OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

.field public static final QUERY_DOCUMENT:Ljava/lang/String; = "query ModulesGraphQL($limit: Int, $contentMin: Int, $contentMax: Int, $heroBoost: Boolean, $products: Boolean!, $includeAvailableRetailers: Boolean!) {\n  modules(limit: $limit, contentMin: $contentMin, contentMax: $contentMax, heroBoost: $heroBoost) {\n    __typename\n    ...ModuleFragment\n  }\n}\nfragment BonusFragment on Bonus {\n  __typename\n  active\n  amount\n  bonus_qualifications {\n    __typename\n    ...BonusQualificationFragment\n  }\n  bonus_type\n  cache_key\n  completed\n  completed_image_url\n  customer_started_time\n  description\n  elegible\n  expiration\n  id\n  level\n  link\n  locked\n  max_retailer_distance\n  name\n  offers\n  other_reward\n  percent_complete\n  progress_color\n  progress_count\n  quest {\n    __typename\n    ...QuestFragment\n  }\n  retailer_id\n  score\n  sort_order\n  sort_results {\n    __typename\n    ...SortResultFragment\n  }\n  terms\n  type\n  typed_id\n  uncompleted_image_url\n  weight\n}\nfragment BonusQualificationFragment on BonusQualification {\n  __typename\n  id\n  completed\n  progress_description\n}\nfragment ButtonInfoFragment on ButtonInfo {\n  __typename\n  android {\n    __typename\n    ...ButtonMetadataFragment\n  }\n  ios {\n    __typename\n    ...ButtonMetadataFragment\n  }\n}\nfragment ButtonMetadataFragment on ButtonMetadata {\n  __typename\n  id\n  url\n}\nfragment CategoryFragment on Category {\n  __typename\n  id\n  cache_key\n  category_type\n  type\n  collapsible\n  default_view_state\n  end_time\n  expiration\n  icon_url\n  image_url\n  launch\n  name\n  short_name\n  num_preview_items\n  raw_category_type\n  retailers\n  sort_order\n  start_time\n  content {\n    __typename\n    ...OfferFragment\n  }\n}\nfragment FeatureFragment on Feature {\n  __typename\n  id\n  bgcolor\n  big_img\n  cache_key\n  category_img\n  context\n  expiration\n  feature_type\n  link\n  name\n  sort_results {\n    __typename\n    ...SortResultFragment\n  }\n  sort_order\n  tracking_click_url\n  tracking_impression_url\n  type\n  typed_id\n}\nfragment FeaturedRetailerFragment on FeaturedRetailer {\n  __typename\n  cache_key\n  icon_url\n  id\n  large_icon_url\n  model_c_retailer_image\n  link\n  name\n  retailer {\n    __typename\n    ...RetailerFragment\n  }\n  sort_order\n  type\n}\nfragment ModuleFragment on ContentModule {\n  __typename\n  id\n  cache_key\n  display_type\n  dynamic_content_id\n  name\n  retailer_id\n  sponsored\n  type\n  url\n  more_action {\n    __typename\n    text\n    link\n  }\n  menu_actions {\n    __typename\n    text\n    link\n    destructive\n  }\n  content {\n    __typename\n    id\n    name\n    link\n    type\n    sort_order\n    ...FeatureFragment\n    ...FeaturedRetailerFragment\n    ...RetailerFragment\n    ...BonusFragment\n    ...OfferFragment\n    ...ProductFragment\n  }\n  categories {\n    __typename\n    id\n    name\n    icon_url\n    ...CategoryFragment\n  }\n}\nfragment OfferFragment on Offer {\n  __typename\n  about\n  about_title\n  activated\n  alternate_text\n  amount\n  any_brand\n  available_at(limit: 30) @include(if: $includeAvailableRetailers) {\n    __typename\n    id\n    model_c_retailer_image\n    name\n  }\n  block_customer_submitted_upcs\n  bonuses\n  button_info_map {\n    __typename\n    ...ButtonInfoFragment\n  }\n  cache_key\n  caption\n  categories\n  combo\n  combo_count\n  current_value\n  description\n  end_time\n  expiration\n  expiring_soon\n  hide_available_at\n  id\n  ignore_barcode\n  large_url\n  legal\n  liked\n  link\n  multiples\n  multiples_count\n  name\n  new_flag\n  non_item\n  non_item_total\n  offer_group_id\n  offer_segment_id\n  offer_type\n  old_value\n  pending\n  percent_back\n  percent_back_max\n  preselect\n  products @include(if: $products)\n  product_groups @include(if: $products) {\n    __typename\n    ...ProductGroupFragment\n  }\n  purchase_type\n  random_weight\n  random_weight_total\n  redemption_max\n  retailers\n  retailer_exclusive\n  rewards {\n    __typename\n    ...RewardFragment\n  }\n  score\n  segment_id\n  self_funded\n  share_url\n  sort_order\n  start_time\n  terms\n  thumb_url\n  total_likes\n  type\n  typed_id\n  url\n  variable_percent_back\n  verified\n}\nfragment OfferRewardPollOptFragment on OfferRewardPollOpt {\n  __typename\n  id\n  content\n  clear_options\n  next_survey_question\n  url\n}\nfragment OfferRewardQuestionFragment on OfferRewardQuestion {\n  __typename\n  id\n  answer\n  content\n  multiple_response\n  options {\n    __typename\n    ...OfferRewardPollOptFragment\n  }\n  url\n}\nfragment ProductFragment on Product {\n  __typename\n  action_button_text\n  action_button_type\n  cache_key\n  current_value\n  deeplink_url\n  description\n  id\n  image_url_large\n  image_url_small\n  image_url_thumbnail\n  link\n  name\n  price\n  retailer_id\n  sort_order\n  type\n  typed_id\n}\nfragment ProductGroupFragment on ProductGroup {\n  __typename\n  id\n  ignore_barcode\n  multiples_count\n  multiples\n  name\n  products\n  random_weight_total\n  random_weight\n}\nfragment QuestFragment on Quest {\n  __typename\n  image_url\n  name\n  description\n  cta\n  step\n  state\n  type\n}\nfragment RetailerBarcodeConfigurationFragment on RetailerBarcodeConfiguration {\n  __typename\n  id\n  barcode_name\n  capture_message\n  example_image_url\n  help_image_url\n  help_message\n  help_title\n  icon_image_url\n  scan_content_regex\n  scan_types {\n    __typename\n    ...RetailerBarcodeScanTypeFragment\n  }\n}\nfragment RetailerBarcodeScanTypeFragment on RetailerBarcodeScanType {\n  __typename\n  barcode_sizes\n  scan_type\n}\nfragment RetailerFragment on Retailer {\n  __typename\n  id\n  active\n  barcode\n  button_info {\n    __typename\n    ...ButtonInfoFragment\n  }\n  cache_key\n  card_signup_url\n  credit_pending_period\n  device_ocr_enabled\n  expiration\n  favorite\n  gallery_features {\n    __typename\n    ...FeatureFragment\n  }\n  home_sort_order\n  hotness\n  icon_url\n  large_icon_url\n  model_c_retailer_image\n  link\n  name\n  nearby\n  parent_retailer_id\n  primary_category_id\n  pwi_home_banner_image\n  purchase_location\n  offer_count\n  receipt_formats\n  redemption_meta {\n    __typename\n    ...RetailerRedemptionMetaFragment\n  }\n  retailer_barcode_configuration {\n    __typename\n    ...RetailerBarcodeConfigurationFragment\n  }\n  retailer_terms\n  score\n  short_description\n  sort_results {\n    __typename\n    ...SortResultFragment\n  }\n  sort_order\n  type\n  typed_id\n  verification_type\n}\nfragment RetailerRedemptionMetaFragment on RetailerRedemptionMeta {\n  __typename\n  additional_redemption_instructions\n  button_departing_user_message\n  button_pending_activity_message\n  button_returning_user_message\n  max_receipt_age_days\n  receipt_name\n}\nfragment RewardFragment on OfferReward {\n  __typename\n  amount\n  answer\n  content\n  engagement_id\n  id\n  legal\n  linked_offer_ids\n  options {\n    __typename\n    ...OfferRewardPollOptFragment\n  }\n  questions {\n    __typename\n    ...OfferRewardQuestionFragment\n  }\n  thumb\n  tracking_click_url\n  tracking_impression_url\n  type\n  url\n  weight\n}\nfragment SortResultFragment on SortResult {\n  __typename\n  name\n  value\n  rank\n}"


# instance fields
.field private final variables:Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 85
    new-instance v0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$1;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-void
.end method

.method public constructor <init>(Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;ZZ)V
    .locals 8
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
    .param p4    # Lcom/apollographql/apollo/api/Input;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Boolean;",
            ">;ZZ)V"
        }
    .end annotation

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "limit == null"

    .line 97
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "contentMin == null"

    .line 98
    invoke-static {p2, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "contentMax == null"

    .line 99
    invoke-static {p3, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "heroBoost == null"

    .line 100
    invoke-static {p4, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    new-instance v0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;-><init>(Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;ZZ)V

    iput-object v0, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery;->variables:Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;

    return-void
.end method

.method public static builder()Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Builder;
    .locals 1

    .line 130
    new-instance v0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public name()Lcom/apollographql/apollo/api/OperationName;
    .locals 1

    .line 135
    sget-object v0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-object v0
.end method

.method public operationId()Ljava/lang/String;
    .locals 1

    const-string v0, "2290b46c61122cc3bf793c12e93f184f7b7b3bb609769d647b5f14de878f8b8e"

    return-object v0
.end method

.method public queryDocument()Ljava/lang/String;
    .locals 1

    const-string v0, "query ModulesGraphQL($limit: Int, $contentMin: Int, $contentMax: Int, $heroBoost: Boolean, $products: Boolean!, $includeAvailableRetailers: Boolean!) {\n  modules(limit: $limit, contentMin: $contentMin, contentMax: $contentMax, heroBoost: $heroBoost) {\n    __typename\n    ...ModuleFragment\n  }\n}\nfragment BonusFragment on Bonus {\n  __typename\n  active\n  amount\n  bonus_qualifications {\n    __typename\n    ...BonusQualificationFragment\n  }\n  bonus_type\n  cache_key\n  completed\n  completed_image_url\n  customer_started_time\n  description\n  elegible\n  expiration\n  id\n  level\n  link\n  locked\n  max_retailer_distance\n  name\n  offers\n  other_reward\n  percent_complete\n  progress_color\n  progress_count\n  quest {\n    __typename\n    ...QuestFragment\n  }\n  retailer_id\n  score\n  sort_order\n  sort_results {\n    __typename\n    ...SortResultFragment\n  }\n  terms\n  type\n  typed_id\n  uncompleted_image_url\n  weight\n}\nfragment BonusQualificationFragment on BonusQualification {\n  __typename\n  id\n  completed\n  progress_description\n}\nfragment ButtonInfoFragment on ButtonInfo {\n  __typename\n  android {\n    __typename\n    ...ButtonMetadataFragment\n  }\n  ios {\n    __typename\n    ...ButtonMetadataFragment\n  }\n}\nfragment ButtonMetadataFragment on ButtonMetadata {\n  __typename\n  id\n  url\n}\nfragment CategoryFragment on Category {\n  __typename\n  id\n  cache_key\n  category_type\n  type\n  collapsible\n  default_view_state\n  end_time\n  expiration\n  icon_url\n  image_url\n  launch\n  name\n  short_name\n  num_preview_items\n  raw_category_type\n  retailers\n  sort_order\n  start_time\n  content {\n    __typename\n    ...OfferFragment\n  }\n}\nfragment FeatureFragment on Feature {\n  __typename\n  id\n  bgcolor\n  big_img\n  cache_key\n  category_img\n  context\n  expiration\n  feature_type\n  link\n  name\n  sort_results {\n    __typename\n    ...SortResultFragment\n  }\n  sort_order\n  tracking_click_url\n  tracking_impression_url\n  type\n  typed_id\n}\nfragment FeaturedRetailerFragment on FeaturedRetailer {\n  __typename\n  cache_key\n  icon_url\n  id\n  large_icon_url\n  model_c_retailer_image\n  link\n  name\n  retailer {\n    __typename\n    ...RetailerFragment\n  }\n  sort_order\n  type\n}\nfragment ModuleFragment on ContentModule {\n  __typename\n  id\n  cache_key\n  display_type\n  dynamic_content_id\n  name\n  retailer_id\n  sponsored\n  type\n  url\n  more_action {\n    __typename\n    text\n    link\n  }\n  menu_actions {\n    __typename\n    text\n    link\n    destructive\n  }\n  content {\n    __typename\n    id\n    name\n    link\n    type\n    sort_order\n    ...FeatureFragment\n    ...FeaturedRetailerFragment\n    ...RetailerFragment\n    ...BonusFragment\n    ...OfferFragment\n    ...ProductFragment\n  }\n  categories {\n    __typename\n    id\n    name\n    icon_url\n    ...CategoryFragment\n  }\n}\nfragment OfferFragment on Offer {\n  __typename\n  about\n  about_title\n  activated\n  alternate_text\n  amount\n  any_brand\n  available_at(limit: 30) @include(if: $includeAvailableRetailers) {\n    __typename\n    id\n    model_c_retailer_image\n    name\n  }\n  block_customer_submitted_upcs\n  bonuses\n  button_info_map {\n    __typename\n    ...ButtonInfoFragment\n  }\n  cache_key\n  caption\n  categories\n  combo\n  combo_count\n  current_value\n  description\n  end_time\n  expiration\n  expiring_soon\n  hide_available_at\n  id\n  ignore_barcode\n  large_url\n  legal\n  liked\n  link\n  multiples\n  multiples_count\n  name\n  new_flag\n  non_item\n  non_item_total\n  offer_group_id\n  offer_segment_id\n  offer_type\n  old_value\n  pending\n  percent_back\n  percent_back_max\n  preselect\n  products @include(if: $products)\n  product_groups @include(if: $products) {\n    __typename\n    ...ProductGroupFragment\n  }\n  purchase_type\n  random_weight\n  random_weight_total\n  redemption_max\n  retailers\n  retailer_exclusive\n  rewards {\n    __typename\n    ...RewardFragment\n  }\n  score\n  segment_id\n  self_funded\n  share_url\n  sort_order\n  start_time\n  terms\n  thumb_url\n  total_likes\n  type\n  typed_id\n  url\n  variable_percent_back\n  verified\n}\nfragment OfferRewardPollOptFragment on OfferRewardPollOpt {\n  __typename\n  id\n  content\n  clear_options\n  next_survey_question\n  url\n}\nfragment OfferRewardQuestionFragment on OfferRewardQuestion {\n  __typename\n  id\n  answer\n  content\n  multiple_response\n  options {\n    __typename\n    ...OfferRewardPollOptFragment\n  }\n  url\n}\nfragment ProductFragment on Product {\n  __typename\n  action_button_text\n  action_button_type\n  cache_key\n  current_value\n  deeplink_url\n  description\n  id\n  image_url_large\n  image_url_small\n  image_url_thumbnail\n  link\n  name\n  price\n  retailer_id\n  sort_order\n  type\n  typed_id\n}\nfragment ProductGroupFragment on ProductGroup {\n  __typename\n  id\n  ignore_barcode\n  multiples_count\n  multiples\n  name\n  products\n  random_weight_total\n  random_weight\n}\nfragment QuestFragment on Quest {\n  __typename\n  image_url\n  name\n  description\n  cta\n  step\n  state\n  type\n}\nfragment RetailerBarcodeConfigurationFragment on RetailerBarcodeConfiguration {\n  __typename\n  id\n  barcode_name\n  capture_message\n  example_image_url\n  help_image_url\n  help_message\n  help_title\n  icon_image_url\n  scan_content_regex\n  scan_types {\n    __typename\n    ...RetailerBarcodeScanTypeFragment\n  }\n}\nfragment RetailerBarcodeScanTypeFragment on RetailerBarcodeScanType {\n  __typename\n  barcode_sizes\n  scan_type\n}\nfragment RetailerFragment on Retailer {\n  __typename\n  id\n  active\n  barcode\n  button_info {\n    __typename\n    ...ButtonInfoFragment\n  }\n  cache_key\n  card_signup_url\n  credit_pending_period\n  device_ocr_enabled\n  expiration\n  favorite\n  gallery_features {\n    __typename\n    ...FeatureFragment\n  }\n  home_sort_order\n  hotness\n  icon_url\n  large_icon_url\n  model_c_retailer_image\n  link\n  name\n  nearby\n  parent_retailer_id\n  primary_category_id\n  pwi_home_banner_image\n  purchase_location\n  offer_count\n  receipt_formats\n  redemption_meta {\n    __typename\n    ...RetailerRedemptionMetaFragment\n  }\n  retailer_barcode_configuration {\n    __typename\n    ...RetailerBarcodeConfigurationFragment\n  }\n  retailer_terms\n  score\n  short_description\n  sort_results {\n    __typename\n    ...SortResultFragment\n  }\n  sort_order\n  type\n  typed_id\n  verification_type\n}\nfragment RetailerRedemptionMetaFragment on RetailerRedemptionMeta {\n  __typename\n  additional_redemption_instructions\n  button_departing_user_message\n  button_pending_activity_message\n  button_returning_user_message\n  max_receipt_age_days\n  receipt_name\n}\nfragment RewardFragment on OfferReward {\n  __typename\n  amount\n  answer\n  content\n  engagement_id\n  id\n  legal\n  linked_offer_ids\n  options {\n    __typename\n    ...OfferRewardPollOptFragment\n  }\n  questions {\n    __typename\n    ...OfferRewardQuestionFragment\n  }\n  thumb\n  tracking_click_url\n  tracking_impression_url\n  type\n  url\n  weight\n}\nfragment SortResultFragment on SortResult {\n  __typename\n  name\n  value\n  rank\n}"

    return-object v0
.end method

.method public responseFieldMapper()Lcom/apollographql/apollo/api/ResponseFieldMapper;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
            "Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Data;",
            ">;"
        }
    .end annotation

    .line 126
    new-instance v0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Data$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Data$Mapper;-><init>()V

    return-object v0
.end method

.method public bridge synthetic variables()Lcom/apollographql/apollo/api/Operation$Variables;
    .locals 1

    .line 52
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/ModulesGraphQLQuery;->variables()Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;

    move-result-object v0

    return-object v0
.end method

.method public variables()Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery;->variables:Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;

    return-object v0
.end method

.method public wrapData(Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Data;)Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Data;
    .locals 0

    return-object p1
.end method

.method public bridge synthetic wrapData(Lcom/apollographql/apollo/api/Operation$Data;)Ljava/lang/Object;
    .locals 0

    .line 52
    check-cast p1, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Data;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/ModulesGraphQLQuery;->wrapData(Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Data;)Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Data;

    move-result-object p1

    return-object p1
.end method
