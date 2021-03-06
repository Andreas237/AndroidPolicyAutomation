.class public final Lcom/ibotta/android/graphql/BuyableGiftCardsQuery;
.super Ljava/lang/Object;
.source "BuyableGiftCardsQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/Query;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/BuyableGiftCardsQuery$BuyableGiftCard;,
        Lcom/ibotta/android/graphql/BuyableGiftCardsQuery$Data;,
        Lcom/ibotta/android/graphql/BuyableGiftCardsQuery$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/Query<",
        "Lcom/ibotta/android/graphql/BuyableGiftCardsQuery$Data;",
        "Lcom/ibotta/android/graphql/BuyableGiftCardsQuery$Data;",
        "Lcom/apollographql/apollo/api/Operation$Variables;",
        ">;"
    }
.end annotation


# static fields
.field public static final OPERATION_DEFINITION:Ljava/lang/String; = "query BuyableGiftCards {\n  buyableGiftCards {\n    __typename\n    ...BuyableGiftCardFragment\n  }\n}"

.field public static final OPERATION_ID:Ljava/lang/String; = "14487b9c0016c39b828237778af5f7d873b472ff12b2a4aaa9d1ab456aa99af6"

.field public static final OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

.field public static final QUERY_DOCUMENT:Ljava/lang/String; = "query BuyableGiftCards {\n  buyableGiftCards {\n    __typename\n    ...BuyableGiftCardFragment\n  }\n}\nfragment ButtonInfoFragment on ButtonInfo {\n  __typename\n  android {\n    __typename\n    ...ButtonMetadataFragment\n  }\n  ios {\n    __typename\n    ...ButtonMetadataFragment\n  }\n}\nfragment ButtonMetadataFragment on ButtonMetadata {\n  __typename\n  id\n  url\n}\nfragment BuyableGiftCardFragment on BuyableGiftCard {\n  __typename\n  cache_key\n  description\n  end_time\n  id\n  image_url\n  launch\n  link\n  max_purchase_amount\n  min_purchase_amount\n  name\n  pre_configured_denominations\n  retailer {\n    __typename\n    ...RetailerFragment\n  }\n  retailer_id\n  retailer_sku\n  reward_percentage\n  sort_order\n  start_time\n  terms\n  type\n  typed_id\n}\nfragment FeatureFragment on Feature {\n  __typename\n  id\n  bgcolor\n  big_img\n  cache_key\n  category_img\n  context\n  expiration\n  feature_type\n  link\n  name\n  sort_results {\n    __typename\n    ...SortResultFragment\n  }\n  sort_order\n  tracking_click_url\n  tracking_impression_url\n  type\n  typed_id\n}\nfragment RetailerBarcodeConfigurationFragment on RetailerBarcodeConfiguration {\n  __typename\n  id\n  barcode_name\n  capture_message\n  example_image_url\n  help_image_url\n  help_message\n  help_title\n  icon_image_url\n  scan_content_regex\n  scan_types {\n    __typename\n    ...RetailerBarcodeScanTypeFragment\n  }\n}\nfragment RetailerBarcodeScanTypeFragment on RetailerBarcodeScanType {\n  __typename\n  barcode_sizes\n  scan_type\n}\nfragment RetailerFragment on Retailer {\n  __typename\n  id\n  active\n  barcode\n  button_info {\n    __typename\n    ...ButtonInfoFragment\n  }\n  cache_key\n  card_signup_url\n  credit_pending_period\n  device_ocr_enabled\n  expiration\n  favorite\n  gallery_features {\n    __typename\n    ...FeatureFragment\n  }\n  home_sort_order\n  hotness\n  icon_url\n  large_icon_url\n  model_c_retailer_image\n  link\n  name\n  nearby\n  parent_retailer_id\n  primary_category_id\n  pwi_home_banner_image\n  purchase_location\n  offer_count\n  receipt_formats\n  redemption_meta {\n    __typename\n    ...RetailerRedemptionMetaFragment\n  }\n  retailer_barcode_configuration {\n    __typename\n    ...RetailerBarcodeConfigurationFragment\n  }\n  retailer_terms\n  score\n  short_description\n  sort_results {\n    __typename\n    ...SortResultFragment\n  }\n  sort_order\n  type\n  typed_id\n  verification_type\n}\nfragment RetailerRedemptionMetaFragment on RetailerRedemptionMeta {\n  __typename\n  additional_redemption_instructions\n  button_departing_user_message\n  button_pending_activity_message\n  button_returning_user_message\n  max_receipt_age_days\n  receipt_name\n}\nfragment SortResultFragment on SortResult {\n  __typename\n  name\n  value\n  rank\n}"


# instance fields
.field private final variables:Lcom/apollographql/apollo/api/Operation$Variables;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 54
    new-instance v0, Lcom/ibotta/android/graphql/BuyableGiftCardsQuery$1;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/BuyableGiftCardsQuery$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/graphql/BuyableGiftCardsQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    sget-object v0, Lcom/apollographql/apollo/api/Operation;->EMPTY_VARIABLES:Lcom/apollographql/apollo/api/Operation$Variables;

    iput-object v0, p0, Lcom/ibotta/android/graphql/BuyableGiftCardsQuery;->variables:Lcom/apollographql/apollo/api/Operation$Variables;

    return-void
.end method

.method public static builder()Lcom/ibotta/android/graphql/BuyableGiftCardsQuery$Builder;
    .locals 1

    .line 93
    new-instance v0, Lcom/ibotta/android/graphql/BuyableGiftCardsQuery$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/BuyableGiftCardsQuery$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public name()Lcom/apollographql/apollo/api/OperationName;
    .locals 1

    .line 98
    sget-object v0, Lcom/ibotta/android/graphql/BuyableGiftCardsQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-object v0
.end method

.method public operationId()Ljava/lang/String;
    .locals 1

    const-string v0, "14487b9c0016c39b828237778af5f7d873b472ff12b2a4aaa9d1ab456aa99af6"

    return-object v0
.end method

.method public queryDocument()Ljava/lang/String;
    .locals 1

    const-string v0, "query BuyableGiftCards {\n  buyableGiftCards {\n    __typename\n    ...BuyableGiftCardFragment\n  }\n}\nfragment ButtonInfoFragment on ButtonInfo {\n  __typename\n  android {\n    __typename\n    ...ButtonMetadataFragment\n  }\n  ios {\n    __typename\n    ...ButtonMetadataFragment\n  }\n}\nfragment ButtonMetadataFragment on ButtonMetadata {\n  __typename\n  id\n  url\n}\nfragment BuyableGiftCardFragment on BuyableGiftCard {\n  __typename\n  cache_key\n  description\n  end_time\n  id\n  image_url\n  launch\n  link\n  max_purchase_amount\n  min_purchase_amount\n  name\n  pre_configured_denominations\n  retailer {\n    __typename\n    ...RetailerFragment\n  }\n  retailer_id\n  retailer_sku\n  reward_percentage\n  sort_order\n  start_time\n  terms\n  type\n  typed_id\n}\nfragment FeatureFragment on Feature {\n  __typename\n  id\n  bgcolor\n  big_img\n  cache_key\n  category_img\n  context\n  expiration\n  feature_type\n  link\n  name\n  sort_results {\n    __typename\n    ...SortResultFragment\n  }\n  sort_order\n  tracking_click_url\n  tracking_impression_url\n  type\n  typed_id\n}\nfragment RetailerBarcodeConfigurationFragment on RetailerBarcodeConfiguration {\n  __typename\n  id\n  barcode_name\n  capture_message\n  example_image_url\n  help_image_url\n  help_message\n  help_title\n  icon_image_url\n  scan_content_regex\n  scan_types {\n    __typename\n    ...RetailerBarcodeScanTypeFragment\n  }\n}\nfragment RetailerBarcodeScanTypeFragment on RetailerBarcodeScanType {\n  __typename\n  barcode_sizes\n  scan_type\n}\nfragment RetailerFragment on Retailer {\n  __typename\n  id\n  active\n  barcode\n  button_info {\n    __typename\n    ...ButtonInfoFragment\n  }\n  cache_key\n  card_signup_url\n  credit_pending_period\n  device_ocr_enabled\n  expiration\n  favorite\n  gallery_features {\n    __typename\n    ...FeatureFragment\n  }\n  home_sort_order\n  hotness\n  icon_url\n  large_icon_url\n  model_c_retailer_image\n  link\n  name\n  nearby\n  parent_retailer_id\n  primary_category_id\n  pwi_home_banner_image\n  purchase_location\n  offer_count\n  receipt_formats\n  redemption_meta {\n    __typename\n    ...RetailerRedemptionMetaFragment\n  }\n  retailer_barcode_configuration {\n    __typename\n    ...RetailerBarcodeConfigurationFragment\n  }\n  retailer_terms\n  score\n  short_description\n  sort_results {\n    __typename\n    ...SortResultFragment\n  }\n  sort_order\n  type\n  typed_id\n  verification_type\n}\nfragment RetailerRedemptionMetaFragment on RetailerRedemptionMeta {\n  __typename\n  additional_redemption_instructions\n  button_departing_user_message\n  button_pending_activity_message\n  button_returning_user_message\n  max_receipt_age_days\n  receipt_name\n}\nfragment SortResultFragment on SortResult {\n  __typename\n  name\n  value\n  rank\n}"

    return-object v0
.end method

.method public responseFieldMapper()Lcom/apollographql/apollo/api/ResponseFieldMapper;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
            "Lcom/ibotta/android/graphql/BuyableGiftCardsQuery$Data;",
            ">;"
        }
    .end annotation

    .line 89
    new-instance v0, Lcom/ibotta/android/graphql/BuyableGiftCardsQuery$Data$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/BuyableGiftCardsQuery$Data$Mapper;-><init>()V

    return-object v0
.end method

.method public variables()Lcom/apollographql/apollo/api/Operation$Variables;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/graphql/BuyableGiftCardsQuery;->variables:Lcom/apollographql/apollo/api/Operation$Variables;

    return-object v0
.end method

.method public wrapData(Lcom/ibotta/android/graphql/BuyableGiftCardsQuery$Data;)Lcom/ibotta/android/graphql/BuyableGiftCardsQuery$Data;
    .locals 0

    return-object p1
.end method

.method public bridge synthetic wrapData(Lcom/apollographql/apollo/api/Operation$Data;)Ljava/lang/Object;
    .locals 0

    .line 32
    check-cast p1, Lcom/ibotta/android/graphql/BuyableGiftCardsQuery$Data;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/BuyableGiftCardsQuery;->wrapData(Lcom/ibotta/android/graphql/BuyableGiftCardsQuery$Data;)Lcom/ibotta/android/graphql/BuyableGiftCardsQuery$Data;

    move-result-object p1

    return-object p1
.end method
