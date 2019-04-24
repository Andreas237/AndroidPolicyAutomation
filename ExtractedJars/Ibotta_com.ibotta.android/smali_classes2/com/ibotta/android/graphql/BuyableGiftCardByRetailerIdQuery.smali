.class public final Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery;
.super Ljava/lang/Object;
.source "BuyableGiftCardByRetailerIdQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/Query;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$BuyableGiftCard;,
        Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Data;,
        Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables;,
        Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/Query<",
        "Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Data;",
        "Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Data;",
        "Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables;",
        ">;"
    }
.end annotation


# static fields
.field public static final OPERATION_DEFINITION:Ljava/lang/String; = "query BuyableGiftCardByRetailerId($retailerId: Int!) {\n  buyableGiftCards(retailerId: $retailerId) {\n    __typename\n    ...BuyableGiftCardFragment\n  }\n}"

.field public static final OPERATION_ID:Ljava/lang/String; = "ba14b6f106c99d7e008420bf540dffb525116b1147684a1ba2f41eceb25c99cc"

.field public static final OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

.field public static final QUERY_DOCUMENT:Ljava/lang/String; = "query BuyableGiftCardByRetailerId($retailerId: Int!) {\n  buyableGiftCards(retailerId: $retailerId) {\n    __typename\n    ...BuyableGiftCardFragment\n  }\n}\nfragment ButtonInfoFragment on ButtonInfo {\n  __typename\n  android {\n    __typename\n    ...ButtonMetadataFragment\n  }\n  ios {\n    __typename\n    ...ButtonMetadataFragment\n  }\n}\nfragment ButtonMetadataFragment on ButtonMetadata {\n  __typename\n  id\n  url\n}\nfragment BuyableGiftCardFragment on BuyableGiftCard {\n  __typename\n  cache_key\n  description\n  end_time\n  id\n  image_url\n  launch\n  link\n  max_purchase_amount\n  min_purchase_amount\n  name\n  pre_configured_denominations\n  retailer {\n    __typename\n    ...RetailerFragment\n  }\n  retailer_id\n  retailer_sku\n  reward_percentage\n  sort_order\n  start_time\n  terms\n  type\n  typed_id\n}\nfragment FeatureFragment on Feature {\n  __typename\n  id\n  bgcolor\n  big_img\n  cache_key\n  category_img\n  context\n  expiration\n  feature_type\n  link\n  name\n  sort_results {\n    __typename\n    ...SortResultFragment\n  }\n  sort_order\n  tracking_click_url\n  tracking_impression_url\n  type\n  typed_id\n}\nfragment RetailerBarcodeConfigurationFragment on RetailerBarcodeConfiguration {\n  __typename\n  id\n  barcode_name\n  capture_message\n  example_image_url\n  help_image_url\n  help_message\n  help_title\n  icon_image_url\n  scan_content_regex\n  scan_types {\n    __typename\n    ...RetailerBarcodeScanTypeFragment\n  }\n}\nfragment RetailerBarcodeScanTypeFragment on RetailerBarcodeScanType {\n  __typename\n  barcode_sizes\n  scan_type\n}\nfragment RetailerFragment on Retailer {\n  __typename\n  id\n  active\n  barcode\n  button_info {\n    __typename\n    ...ButtonInfoFragment\n  }\n  cache_key\n  card_signup_url\n  credit_pending_period\n  device_ocr_enabled\n  expiration\n  favorite\n  gallery_features {\n    __typename\n    ...FeatureFragment\n  }\n  home_sort_order\n  hotness\n  icon_url\n  large_icon_url\n  model_c_retailer_image\n  link\n  name\n  nearby\n  parent_retailer_id\n  primary_category_id\n  pwi_home_banner_image\n  purchase_location\n  offer_count\n  receipt_formats\n  redemption_meta {\n    __typename\n    ...RetailerRedemptionMetaFragment\n  }\n  retailer_barcode_configuration {\n    __typename\n    ...RetailerBarcodeConfigurationFragment\n  }\n  retailer_terms\n  score\n  short_description\n  sort_results {\n    __typename\n    ...SortResultFragment\n  }\n  sort_order\n  type\n  typed_id\n  verification_type\n}\nfragment RetailerRedemptionMetaFragment on RetailerRedemptionMeta {\n  __typename\n  additional_redemption_instructions\n  button_departing_user_message\n  button_pending_activity_message\n  button_returning_user_message\n  max_receipt_age_days\n  receipt_name\n}\nfragment SortResultFragment on SortResult {\n  __typename\n  name\n  value\n  rank\n}"


# instance fields
.field private final variables:Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 60
    new-instance v0, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$1;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-void
.end method

.method public constructor <init>(J)V
    .locals 1

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    new-instance v0, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables;

    invoke-direct {v0, p1, p2}, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables;-><init>(J)V

    iput-object v0, p0, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery;->variables:Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables;

    return-void
.end method

.method public static builder()Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Builder;
    .locals 1

    .line 100
    new-instance v0, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public name()Lcom/apollographql/apollo/api/OperationName;
    .locals 1

    .line 105
    sget-object v0, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-object v0
.end method

.method public operationId()Ljava/lang/String;
    .locals 1

    const-string v0, "ba14b6f106c99d7e008420bf540dffb525116b1147684a1ba2f41eceb25c99cc"

    return-object v0
.end method

.method public queryDocument()Ljava/lang/String;
    .locals 1

    const-string v0, "query BuyableGiftCardByRetailerId($retailerId: Int!) {\n  buyableGiftCards(retailerId: $retailerId) {\n    __typename\n    ...BuyableGiftCardFragment\n  }\n}\nfragment ButtonInfoFragment on ButtonInfo {\n  __typename\n  android {\n    __typename\n    ...ButtonMetadataFragment\n  }\n  ios {\n    __typename\n    ...ButtonMetadataFragment\n  }\n}\nfragment ButtonMetadataFragment on ButtonMetadata {\n  __typename\n  id\n  url\n}\nfragment BuyableGiftCardFragment on BuyableGiftCard {\n  __typename\n  cache_key\n  description\n  end_time\n  id\n  image_url\n  launch\n  link\n  max_purchase_amount\n  min_purchase_amount\n  name\n  pre_configured_denominations\n  retailer {\n    __typename\n    ...RetailerFragment\n  }\n  retailer_id\n  retailer_sku\n  reward_percentage\n  sort_order\n  start_time\n  terms\n  type\n  typed_id\n}\nfragment FeatureFragment on Feature {\n  __typename\n  id\n  bgcolor\n  big_img\n  cache_key\n  category_img\n  context\n  expiration\n  feature_type\n  link\n  name\n  sort_results {\n    __typename\n    ...SortResultFragment\n  }\n  sort_order\n  tracking_click_url\n  tracking_impression_url\n  type\n  typed_id\n}\nfragment RetailerBarcodeConfigurationFragment on RetailerBarcodeConfiguration {\n  __typename\n  id\n  barcode_name\n  capture_message\n  example_image_url\n  help_image_url\n  help_message\n  help_title\n  icon_image_url\n  scan_content_regex\n  scan_types {\n    __typename\n    ...RetailerBarcodeScanTypeFragment\n  }\n}\nfragment RetailerBarcodeScanTypeFragment on RetailerBarcodeScanType {\n  __typename\n  barcode_sizes\n  scan_type\n}\nfragment RetailerFragment on Retailer {\n  __typename\n  id\n  active\n  barcode\n  button_info {\n    __typename\n    ...ButtonInfoFragment\n  }\n  cache_key\n  card_signup_url\n  credit_pending_period\n  device_ocr_enabled\n  expiration\n  favorite\n  gallery_features {\n    __typename\n    ...FeatureFragment\n  }\n  home_sort_order\n  hotness\n  icon_url\n  large_icon_url\n  model_c_retailer_image\n  link\n  name\n  nearby\n  parent_retailer_id\n  primary_category_id\n  pwi_home_banner_image\n  purchase_location\n  offer_count\n  receipt_formats\n  redemption_meta {\n    __typename\n    ...RetailerRedemptionMetaFragment\n  }\n  retailer_barcode_configuration {\n    __typename\n    ...RetailerBarcodeConfigurationFragment\n  }\n  retailer_terms\n  score\n  short_description\n  sort_results {\n    __typename\n    ...SortResultFragment\n  }\n  sort_order\n  type\n  typed_id\n  verification_type\n}\nfragment RetailerRedemptionMetaFragment on RetailerRedemptionMeta {\n  __typename\n  additional_redemption_instructions\n  button_departing_user_message\n  button_pending_activity_message\n  button_returning_user_message\n  max_receipt_age_days\n  receipt_name\n}\nfragment SortResultFragment on SortResult {\n  __typename\n  name\n  value\n  rank\n}"

    return-object v0
.end method

.method public responseFieldMapper()Lcom/apollographql/apollo/api/ResponseFieldMapper;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
            "Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Data;",
            ">;"
        }
    .end annotation

    .line 96
    new-instance v0, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Data$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Data$Mapper;-><init>()V

    return-object v0
.end method

.method public bridge synthetic variables()Lcom/apollographql/apollo/api/Operation$Variables;
    .locals 1

    .line 38
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery;->variables()Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables;

    move-result-object v0

    return-object v0
.end method

.method public variables()Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery;->variables:Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables;

    return-object v0
.end method

.method public wrapData(Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Data;)Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Data;
    .locals 0

    return-object p1
.end method

.method public bridge synthetic wrapData(Lcom/apollographql/apollo/api/Operation$Data;)Ljava/lang/Object;
    .locals 0

    .line 38
    check-cast p1, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Data;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery;->wrapData(Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Data;)Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Data;

    move-result-object p1

    return-object p1
.end method
