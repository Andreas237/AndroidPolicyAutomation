.class public final Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery;
.super Ljava/lang/Object;
.source "RecentlyViewedRetailersQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/Query;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Retailer;,
        Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Views;,
        Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Data;,
        Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Variables;,
        Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/Query<",
        "Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Data;",
        "Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Data;",
        "Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Variables;",
        ">;"
    }
.end annotation


# static fields
.field public static final OPERATION_DEFINITION:Ljava/lang/String; = "query RecentlyViewedRetailers($limit: Int!, $limitStrategy: LimitStrategy!) {\n  views {\n    __typename\n    retailers(limit: {limit: $limit, limitStrategy: $limitStrategy}) {\n      __typename\n      ...RetailerFragment\n    }\n  }\n}"

.field public static final OPERATION_ID:Ljava/lang/String; = "e3d66efa21599150dec4a8636096d51e27fde62b708de6235bea86c313877bcc"

.field public static final OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

.field public static final QUERY_DOCUMENT:Ljava/lang/String; = "query RecentlyViewedRetailers($limit: Int!, $limitStrategy: LimitStrategy!) {\n  views {\n    __typename\n    retailers(limit: {limit: $limit, limitStrategy: $limitStrategy}) {\n      __typename\n      ...RetailerFragment\n    }\n  }\n}\nfragment ButtonInfoFragment on ButtonInfo {\n  __typename\n  android {\n    __typename\n    ...ButtonMetadataFragment\n  }\n  ios {\n    __typename\n    ...ButtonMetadataFragment\n  }\n}\nfragment ButtonMetadataFragment on ButtonMetadata {\n  __typename\n  id\n  url\n}\nfragment FeatureFragment on Feature {\n  __typename\n  id\n  bgcolor\n  big_img\n  cache_key\n  category_img\n  context\n  expiration\n  feature_type\n  link\n  name\n  sort_results {\n    __typename\n    ...SortResultFragment\n  }\n  sort_order\n  tracking_click_url\n  tracking_impression_url\n  type\n  typed_id\n}\nfragment RetailerBarcodeConfigurationFragment on RetailerBarcodeConfiguration {\n  __typename\n  id\n  barcode_name\n  capture_message\n  example_image_url\n  help_image_url\n  help_message\n  help_title\n  icon_image_url\n  scan_content_regex\n  scan_types {\n    __typename\n    ...RetailerBarcodeScanTypeFragment\n  }\n}\nfragment RetailerBarcodeScanTypeFragment on RetailerBarcodeScanType {\n  __typename\n  barcode_sizes\n  scan_type\n}\nfragment RetailerFragment on Retailer {\n  __typename\n  id\n  active\n  barcode\n  button_info {\n    __typename\n    ...ButtonInfoFragment\n  }\n  cache_key\n  card_signup_url\n  credit_pending_period\n  device_ocr_enabled\n  expiration\n  favorite\n  gallery_features {\n    __typename\n    ...FeatureFragment\n  }\n  home_sort_order\n  hotness\n  icon_url\n  large_icon_url\n  model_c_retailer_image\n  link\n  name\n  nearby\n  parent_retailer_id\n  primary_category_id\n  pwi_home_banner_image\n  purchase_location\n  offer_count\n  receipt_formats\n  redemption_meta {\n    __typename\n    ...RetailerRedemptionMetaFragment\n  }\n  retailer_barcode_configuration {\n    __typename\n    ...RetailerBarcodeConfigurationFragment\n  }\n  retailer_terms\n  score\n  short_description\n  sort_results {\n    __typename\n    ...SortResultFragment\n  }\n  sort_order\n  type\n  typed_id\n  verification_type\n}\nfragment RetailerRedemptionMetaFragment on RetailerRedemptionMeta {\n  __typename\n  additional_redemption_instructions\n  button_departing_user_message\n  button_pending_activity_message\n  button_returning_user_message\n  max_receipt_age_days\n  receipt_name\n}\nfragment SortResultFragment on SortResult {\n  __typename\n  name\n  value\n  rank\n}"


# instance fields
.field private final variables:Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Variables;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 62
    new-instance v0, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$1;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-void
.end method

.method public constructor <init>(JLcom/ibotta/android/graphql/type/LimitStrategy;)V
    .locals 1
    .param p3    # Lcom/ibotta/android/graphql/type/LimitStrategy;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "limitStrategy == null"

    .line 72
    invoke-static {p3, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    new-instance v0, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Variables;

    invoke-direct {v0, p1, p2, p3}, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Variables;-><init>(JLcom/ibotta/android/graphql/type/LimitStrategy;)V

    iput-object v0, p0, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery;->variables:Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Variables;

    return-void
.end method

.method public static builder()Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Builder;
    .locals 1

    .line 102
    new-instance v0, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public name()Lcom/apollographql/apollo/api/OperationName;
    .locals 1

    .line 107
    sget-object v0, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-object v0
.end method

.method public operationId()Ljava/lang/String;
    .locals 1

    const-string v0, "e3d66efa21599150dec4a8636096d51e27fde62b708de6235bea86c313877bcc"

    return-object v0
.end method

.method public queryDocument()Ljava/lang/String;
    .locals 1

    const-string v0, "query RecentlyViewedRetailers($limit: Int!, $limitStrategy: LimitStrategy!) {\n  views {\n    __typename\n    retailers(limit: {limit: $limit, limitStrategy: $limitStrategy}) {\n      __typename\n      ...RetailerFragment\n    }\n  }\n}\nfragment ButtonInfoFragment on ButtonInfo {\n  __typename\n  android {\n    __typename\n    ...ButtonMetadataFragment\n  }\n  ios {\n    __typename\n    ...ButtonMetadataFragment\n  }\n}\nfragment ButtonMetadataFragment on ButtonMetadata {\n  __typename\n  id\n  url\n}\nfragment FeatureFragment on Feature {\n  __typename\n  id\n  bgcolor\n  big_img\n  cache_key\n  category_img\n  context\n  expiration\n  feature_type\n  link\n  name\n  sort_results {\n    __typename\n    ...SortResultFragment\n  }\n  sort_order\n  tracking_click_url\n  tracking_impression_url\n  type\n  typed_id\n}\nfragment RetailerBarcodeConfigurationFragment on RetailerBarcodeConfiguration {\n  __typename\n  id\n  barcode_name\n  capture_message\n  example_image_url\n  help_image_url\n  help_message\n  help_title\n  icon_image_url\n  scan_content_regex\n  scan_types {\n    __typename\n    ...RetailerBarcodeScanTypeFragment\n  }\n}\nfragment RetailerBarcodeScanTypeFragment on RetailerBarcodeScanType {\n  __typename\n  barcode_sizes\n  scan_type\n}\nfragment RetailerFragment on Retailer {\n  __typename\n  id\n  active\n  barcode\n  button_info {\n    __typename\n    ...ButtonInfoFragment\n  }\n  cache_key\n  card_signup_url\n  credit_pending_period\n  device_ocr_enabled\n  expiration\n  favorite\n  gallery_features {\n    __typename\n    ...FeatureFragment\n  }\n  home_sort_order\n  hotness\n  icon_url\n  large_icon_url\n  model_c_retailer_image\n  link\n  name\n  nearby\n  parent_retailer_id\n  primary_category_id\n  pwi_home_banner_image\n  purchase_location\n  offer_count\n  receipt_formats\n  redemption_meta {\n    __typename\n    ...RetailerRedemptionMetaFragment\n  }\n  retailer_barcode_configuration {\n    __typename\n    ...RetailerBarcodeConfigurationFragment\n  }\n  retailer_terms\n  score\n  short_description\n  sort_results {\n    __typename\n    ...SortResultFragment\n  }\n  sort_order\n  type\n  typed_id\n  verification_type\n}\nfragment RetailerRedemptionMetaFragment on RetailerRedemptionMeta {\n  __typename\n  additional_redemption_instructions\n  button_departing_user_message\n  button_pending_activity_message\n  button_returning_user_message\n  max_receipt_age_days\n  receipt_name\n}\nfragment SortResultFragment on SortResult {\n  __typename\n  name\n  value\n  rank\n}"

    return-object v0
.end method

.method public responseFieldMapper()Lcom/apollographql/apollo/api/ResponseFieldMapper;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
            "Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Data;",
            ">;"
        }
    .end annotation

    .line 98
    new-instance v0, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Data$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Data$Mapper;-><init>()V

    return-object v0
.end method

.method public bridge synthetic variables()Lcom/apollographql/apollo/api/Operation$Variables;
    .locals 1

    .line 38
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery;->variables()Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Variables;

    move-result-object v0

    return-object v0
.end method

.method public variables()Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Variables;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery;->variables:Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Variables;

    return-object v0
.end method

.method public wrapData(Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Data;)Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Data;
    .locals 0

    return-object p1
.end method

.method public bridge synthetic wrapData(Lcom/apollographql/apollo/api/Operation$Data;)Ljava/lang/Object;
    .locals 0

    .line 38
    check-cast p1, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Data;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery;->wrapData(Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Data;)Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Data;

    move-result-object p1

    return-object p1
.end method
