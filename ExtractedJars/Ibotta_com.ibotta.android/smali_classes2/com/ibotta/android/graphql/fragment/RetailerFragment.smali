.class public Lcom/ibotta/android/graphql/fragment/RetailerFragment;
.super Ljava/lang/Object;
.source "RetailerFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/GraphqlFragment;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result;,
        Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;,
        Lcom/ibotta/android/graphql/fragment/RetailerFragment$Redemption_meta;,
        Lcom/ibotta/android/graphql/fragment/RetailerFragment$Gallery_feature;,
        Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;,
        Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;

.field public static final FRAGMENT_DEFINITION:Ljava/lang/String; = "fragment RetailerFragment on Retailer {\n  __typename\n  id\n  active\n  barcode\n  button_info {\n    __typename\n    ...ButtonInfoFragment\n  }\n  cache_key\n  card_signup_url\n  credit_pending_period\n  device_ocr_enabled\n  expiration\n  favorite\n  gallery_features {\n    __typename\n    ...FeatureFragment\n  }\n  home_sort_order\n  hotness\n  icon_url\n  large_icon_url\n  model_c_retailer_image\n  link\n  name\n  nearby\n  parent_retailer_id\n  primary_category_id\n  pwi_home_banner_image\n  purchase_location\n  offer_count\n  receipt_formats\n  redemption_meta {\n    __typename\n    ...RetailerRedemptionMetaFragment\n  }\n  retailer_barcode_configuration {\n    __typename\n    ...RetailerBarcodeConfigurationFragment\n  }\n  retailer_terms\n  score\n  short_description\n  sort_results {\n    __typename\n    ...SortResultFragment\n  }\n  sort_order\n  type\n  typed_id\n  verification_type\n}"

.field public static final POSSIBLE_TYPES:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private volatile $hashCode:I

.field private volatile $hashCodeMemoized:Z

.field private volatile $toString:Ljava/lang/String;

.field final __typename:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field final active:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final barcode:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final button_info:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final cache_key:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final card_signup_url:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final credit_pending_period:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final device_ocr_enabled:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final expiration:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final favorite:Ljava/lang/Long;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final gallery_features:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/RetailerFragment$Gallery_feature;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final home_sort_order:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final hotness:Ljava/lang/Double;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final icon_url:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final id:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field final large_icon_url:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final link:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final model_c_retailer_image:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final name:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field final nearby:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final offer_count:Ljava/lang/Long;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final parent_retailer_id:Ljava/lang/Long;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final primary_category_id:Ljava/lang/Long;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final purchase_location:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final pwi_home_banner_image:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final receipt_formats:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final redemption_meta:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Redemption_meta;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final retailer_barcode_configuration:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final retailer_terms:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final score:Ljava/lang/Double;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final short_description:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final sort_order:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final sort_results:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final type:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field final typed_id:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field final verification_type:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v0, 0x24

    .line 27
    new-array v0, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v1, "__typename"

    const-string v2, "__typename"

    .line 28
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v4

    const-string v6, "id"

    const-string v7, "id"

    sget-object v10, Lcom/ibotta/android/graphql/type/CustomType;->ID:Lcom/ibotta/android/graphql/type/CustomType;

    .line 29
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v11

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/apollographql/apollo/api/ResponseField;->forCustomType(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLcom/apollographql/apollo/api/ScalarType;Ljava/util/List;)Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "active"

    const-string v3, "active"

    .line 30
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x2

    aput-object v1, v0, v3

    const-string v1, "barcode"

    const-string v3, "barcode"

    .line 31
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x3

    aput-object v1, v0, v3

    const-string v1, "button_info"

    const-string v3, "button_info"

    .line 32
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forObject(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x4

    aput-object v1, v0, v3

    const-string v1, "cache_key"

    const-string v3, "cache_key"

    .line 33
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x5

    aput-object v1, v0, v3

    const-string v1, "card_signup_url"

    const-string v3, "card_signup_url"

    .line 34
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x6

    aput-object v1, v0, v3

    const-string v1, "credit_pending_period"

    const-string v3, "credit_pending_period"

    .line 35
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x7

    aput-object v1, v0, v3

    const-string v1, "device_ocr_enabled"

    const-string v3, "device_ocr_enabled"

    .line 36
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x8

    aput-object v1, v0, v3

    const-string v1, "expiration"

    const-string v3, "expiration"

    .line 37
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x9

    aput-object v1, v0, v3

    const-string v1, "favorite"

    const-string v3, "favorite"

    .line 38
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forLong(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0xa

    aput-object v1, v0, v3

    const-string v1, "gallery_features"

    const-string v3, "gallery_features"

    .line 39
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0xb

    aput-object v1, v0, v3

    const-string v1, "home_sort_order"

    const-string v3, "home_sort_order"

    .line 40
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0xc

    aput-object v1, v0, v3

    const-string v1, "hotness"

    const-string v3, "hotness"

    .line 41
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forDouble(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0xd

    aput-object v1, v0, v3

    const-string v1, "icon_url"

    const-string v3, "icon_url"

    .line 42
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0xe

    aput-object v1, v0, v3

    const-string v1, "large_icon_url"

    const-string v3, "large_icon_url"

    .line 43
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0xf

    aput-object v1, v0, v3

    const-string v1, "model_c_retailer_image"

    const-string v3, "model_c_retailer_image"

    .line 44
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x10

    aput-object v1, v0, v3

    const-string v1, "link"

    const-string v3, "link"

    .line 45
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x11

    aput-object v1, v0, v3

    const-string v1, "name"

    const-string v3, "name"

    .line 46
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v4, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x12

    aput-object v1, v0, v3

    const-string v1, "nearby"

    const-string v3, "nearby"

    .line 47
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x13

    aput-object v1, v0, v3

    const-string v1, "parent_retailer_id"

    const-string v3, "parent_retailer_id"

    .line 48
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forLong(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x14

    aput-object v1, v0, v3

    const-string v1, "primary_category_id"

    const-string v3, "primary_category_id"

    .line 49
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forLong(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x15

    aput-object v1, v0, v3

    const-string v1, "pwi_home_banner_image"

    const-string v3, "pwi_home_banner_image"

    .line 50
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x16

    aput-object v1, v0, v3

    const-string v1, "purchase_location"

    const-string v3, "purchase_location"

    .line 51
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x17

    aput-object v1, v0, v3

    const-string v1, "offer_count"

    const-string v3, "offer_count"

    .line 52
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forLong(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x18

    aput-object v1, v0, v3

    const-string v1, "receipt_formats"

    const-string v3, "receipt_formats"

    .line 53
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x19

    aput-object v1, v0, v3

    const-string v1, "redemption_meta"

    const-string v3, "redemption_meta"

    .line 54
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forObject(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x1a

    aput-object v1, v0, v3

    const-string v1, "retailer_barcode_configuration"

    const-string v3, "retailer_barcode_configuration"

    .line 55
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forObject(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x1b

    aput-object v1, v0, v3

    const-string v1, "retailer_terms"

    const-string v3, "retailer_terms"

    .line 56
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x1c

    aput-object v1, v0, v3

    const-string v1, "score"

    const-string v3, "score"

    .line 57
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forDouble(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x1d

    aput-object v1, v0, v3

    const-string v1, "short_description"

    const-string v3, "short_description"

    .line 58
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x1e

    aput-object v1, v0, v3

    const-string v1, "sort_results"

    const-string v3, "sort_results"

    .line 59
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x1f

    aput-object v1, v0, v3

    const-string v1, "sort_order"

    const-string v3, "sort_order"

    .line 60
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x20

    aput-object v1, v0, v3

    const-string v1, "type"

    const-string v3, "type"

    .line 61
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v4, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x21

    aput-object v1, v0, v3

    const-string v1, "typed_id"

    const-string v3, "typed_id"

    .line 62
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v4, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x22

    aput-object v1, v0, v3

    const-string v1, "verification_type"

    const-string v3, "verification_type"

    .line 63
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x23

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const-string v0, "Retailer"

    .line 120
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->POSSIBLE_TYPES:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Lcom/ibotta/android/graphql/fragment/RetailerFragment$Redemption_meta;Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p9    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p11    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p12    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p13    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p14    # Ljava/lang/Double;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p15    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p16    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p17    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p18    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p19    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p20    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p21    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p22    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p23    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p24    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p25    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p26    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p27    # Lcom/ibotta/android/graphql/fragment/RetailerFragment$Redemption_meta;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p28    # Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p29    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p30    # Ljava/lang/Double;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p31    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p32    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p33    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p34    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p35    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p36    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/RetailerFragment$Gallery_feature;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/ibotta/android/graphql/fragment/RetailerFragment$Redemption_meta;",
            "Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    .line 214
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "__typename == null"

    move-object v2, p1

    .line 215
    invoke-static {p1, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->__typename:Ljava/lang/String;

    const-string v1, "id == null"

    move-object v2, p2

    .line 216
    invoke-static {p2, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->id:Ljava/lang/String;

    move-object v1, p3

    .line 217
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->active:Ljava/lang/Boolean;

    move-object v1, p4

    .line 218
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->barcode:Ljava/lang/Boolean;

    move-object v1, p5

    .line 219
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->button_info:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;

    move-object v1, p6

    .line 220
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->cache_key:Ljava/lang/String;

    move-object v1, p7

    .line 221
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->card_signup_url:Ljava/lang/String;

    move-object v1, p8

    .line 222
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->credit_pending_period:Ljava/lang/String;

    move-object v1, p9

    .line 223
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->device_ocr_enabled:Ljava/lang/Boolean;

    move-object v1, p10

    .line 224
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->expiration:Ljava/lang/String;

    move-object v1, p11

    .line 225
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->favorite:Ljava/lang/Long;

    move-object v1, p12

    .line 226
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->gallery_features:Ljava/util/List;

    move-object/from16 v1, p13

    .line 227
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->home_sort_order:Ljava/lang/String;

    move-object/from16 v1, p14

    .line 228
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->hotness:Ljava/lang/Double;

    move-object/from16 v1, p15

    .line 229
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->icon_url:Ljava/lang/String;

    move-object/from16 v1, p16

    .line 230
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->large_icon_url:Ljava/lang/String;

    move-object/from16 v1, p17

    .line 231
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->model_c_retailer_image:Ljava/lang/String;

    move-object/from16 v1, p18

    .line 232
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->link:Ljava/lang/String;

    const-string v1, "name == null"

    move-object/from16 v2, p19

    .line 233
    invoke-static {v2, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->name:Ljava/lang/String;

    move-object/from16 v1, p20

    .line 234
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->nearby:Ljava/lang/Boolean;

    move-object/from16 v1, p21

    .line 235
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->parent_retailer_id:Ljava/lang/Long;

    move-object/from16 v1, p22

    .line 236
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->primary_category_id:Ljava/lang/Long;

    move-object/from16 v1, p23

    .line 237
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->pwi_home_banner_image:Ljava/lang/String;

    move-object/from16 v1, p24

    .line 238
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->purchase_location:Ljava/lang/String;

    move-object/from16 v1, p25

    .line 239
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->offer_count:Ljava/lang/Long;

    move-object/from16 v1, p26

    .line 240
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->receipt_formats:Ljava/util/List;

    move-object/from16 v1, p27

    .line 241
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->redemption_meta:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Redemption_meta;

    move-object/from16 v1, p28

    .line 242
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->retailer_barcode_configuration:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;

    move-object/from16 v1, p29

    .line 243
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->retailer_terms:Ljava/lang/String;

    move-object/from16 v1, p30

    .line 244
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->score:Ljava/lang/Double;

    move-object/from16 v1, p31

    .line 245
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->short_description:Ljava/lang/String;

    move-object/from16 v1, p32

    .line 246
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->sort_results:Ljava/util/List;

    move-object/from16 v1, p33

    .line 247
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->sort_order:Ljava/lang/String;

    const-string v1, "type == null"

    move-object/from16 v2, p34

    .line 248
    invoke-static {v2, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->type:Ljava/lang/String;

    const-string v1, "typed_id == null"

    move-object/from16 v2, p35

    .line 249
    invoke-static {v2, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->typed_id:Ljava/lang/String;

    move-object/from16 v1, p36

    .line 250
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->verification_type:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public __typename()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 254
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->__typename:Ljava/lang/String;

    return-object v0
.end method

.method public active()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 265
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->active:Ljava/lang/Boolean;

    return-object v0
.end method

.method public barcode()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 272
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->barcode:Ljava/lang/Boolean;

    return-object v0
.end method

.method public button_info()Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 279
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->button_info:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;

    return-object v0
.end method

.method public cache_key()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 286
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->cache_key:Ljava/lang/String;

    return-object v0
.end method

.method public card_signup_url()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 293
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->card_signup_url:Ljava/lang/String;

    return-object v0
.end method

.method public credit_pending_period()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 300
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->credit_pending_period:Ljava/lang/String;

    return-object v0
.end method

.method public device_ocr_enabled()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 307
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->device_ocr_enabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 605
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    const/4 v2, 0x0

    if-eqz v1, :cond_21

    .line 606
    check-cast p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    .line 607
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->__typename:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->id:Ljava/lang/String;

    .line 608
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->active:Ljava/lang/Boolean;

    if-nez v1, :cond_1

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->active:Ljava/lang/Boolean;

    if-nez v1, :cond_20

    goto :goto_0

    :cond_1
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->active:Ljava/lang/Boolean;

    .line 609
    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->barcode:Ljava/lang/Boolean;

    if-nez v1, :cond_2

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->barcode:Ljava/lang/Boolean;

    if-nez v1, :cond_20

    goto :goto_1

    :cond_2
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->barcode:Ljava/lang/Boolean;

    .line 610
    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->button_info:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;

    if-nez v1, :cond_3

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->button_info:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;

    if-nez v1, :cond_20

    goto :goto_2

    :cond_3
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->button_info:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;

    .line 611
    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_2
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->cache_key:Ljava/lang/String;

    if-nez v1, :cond_4

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->cache_key:Ljava/lang/String;

    if-nez v1, :cond_20

    goto :goto_3

    :cond_4
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->cache_key:Ljava/lang/String;

    .line 612
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_3
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->card_signup_url:Ljava/lang/String;

    if-nez v1, :cond_5

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->card_signup_url:Ljava/lang/String;

    if-nez v1, :cond_20

    goto :goto_4

    :cond_5
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->card_signup_url:Ljava/lang/String;

    .line 613
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_4
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->credit_pending_period:Ljava/lang/String;

    if-nez v1, :cond_6

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->credit_pending_period:Ljava/lang/String;

    if-nez v1, :cond_20

    goto :goto_5

    :cond_6
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->credit_pending_period:Ljava/lang/String;

    .line 614
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_5
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->device_ocr_enabled:Ljava/lang/Boolean;

    if-nez v1, :cond_7

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->device_ocr_enabled:Ljava/lang/Boolean;

    if-nez v1, :cond_20

    goto :goto_6

    :cond_7
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->device_ocr_enabled:Ljava/lang/Boolean;

    .line 615
    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_6
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->expiration:Ljava/lang/String;

    if-nez v1, :cond_8

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->expiration:Ljava/lang/String;

    if-nez v1, :cond_20

    goto :goto_7

    :cond_8
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->expiration:Ljava/lang/String;

    .line 616
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_7
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->favorite:Ljava/lang/Long;

    if-nez v1, :cond_9

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->favorite:Ljava/lang/Long;

    if-nez v1, :cond_20

    goto :goto_8

    :cond_9
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->favorite:Ljava/lang/Long;

    .line 617
    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_8
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->gallery_features:Ljava/util/List;

    if-nez v1, :cond_a

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->gallery_features:Ljava/util/List;

    if-nez v1, :cond_20

    goto :goto_9

    :cond_a
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->gallery_features:Ljava/util/List;

    .line 618
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_9
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->home_sort_order:Ljava/lang/String;

    if-nez v1, :cond_b

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->home_sort_order:Ljava/lang/String;

    if-nez v1, :cond_20

    goto :goto_a

    :cond_b
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->home_sort_order:Ljava/lang/String;

    .line 619
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_a
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->hotness:Ljava/lang/Double;

    if-nez v1, :cond_c

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->hotness:Ljava/lang/Double;

    if-nez v1, :cond_20

    goto :goto_b

    :cond_c
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->hotness:Ljava/lang/Double;

    .line 620
    invoke-virtual {v1, v3}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_b
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->icon_url:Ljava/lang/String;

    if-nez v1, :cond_d

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->icon_url:Ljava/lang/String;

    if-nez v1, :cond_20

    goto :goto_c

    :cond_d
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->icon_url:Ljava/lang/String;

    .line 621
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_c
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->large_icon_url:Ljava/lang/String;

    if-nez v1, :cond_e

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->large_icon_url:Ljava/lang/String;

    if-nez v1, :cond_20

    goto :goto_d

    :cond_e
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->large_icon_url:Ljava/lang/String;

    .line 622
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_d
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->model_c_retailer_image:Ljava/lang/String;

    if-nez v1, :cond_f

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->model_c_retailer_image:Ljava/lang/String;

    if-nez v1, :cond_20

    goto :goto_e

    :cond_f
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->model_c_retailer_image:Ljava/lang/String;

    .line 623
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_e
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->link:Ljava/lang/String;

    if-nez v1, :cond_10

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->link:Ljava/lang/String;

    if-nez v1, :cond_20

    goto :goto_f

    :cond_10
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->link:Ljava/lang/String;

    .line 624
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_f
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->name:Ljava/lang/String;

    .line 625
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->nearby:Ljava/lang/Boolean;

    if-nez v1, :cond_11

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->nearby:Ljava/lang/Boolean;

    if-nez v1, :cond_20

    goto :goto_10

    :cond_11
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->nearby:Ljava/lang/Boolean;

    .line 626
    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_10
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->parent_retailer_id:Ljava/lang/Long;

    if-nez v1, :cond_12

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->parent_retailer_id:Ljava/lang/Long;

    if-nez v1, :cond_20

    goto :goto_11

    :cond_12
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->parent_retailer_id:Ljava/lang/Long;

    .line 627
    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_11
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->primary_category_id:Ljava/lang/Long;

    if-nez v1, :cond_13

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->primary_category_id:Ljava/lang/Long;

    if-nez v1, :cond_20

    goto :goto_12

    :cond_13
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->primary_category_id:Ljava/lang/Long;

    .line 628
    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_12
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->pwi_home_banner_image:Ljava/lang/String;

    if-nez v1, :cond_14

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->pwi_home_banner_image:Ljava/lang/String;

    if-nez v1, :cond_20

    goto :goto_13

    :cond_14
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->pwi_home_banner_image:Ljava/lang/String;

    .line 629
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_13
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->purchase_location:Ljava/lang/String;

    if-nez v1, :cond_15

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->purchase_location:Ljava/lang/String;

    if-nez v1, :cond_20

    goto :goto_14

    :cond_15
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->purchase_location:Ljava/lang/String;

    .line 630
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_14
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->offer_count:Ljava/lang/Long;

    if-nez v1, :cond_16

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->offer_count:Ljava/lang/Long;

    if-nez v1, :cond_20

    goto :goto_15

    :cond_16
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->offer_count:Ljava/lang/Long;

    .line 631
    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_15
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->receipt_formats:Ljava/util/List;

    if-nez v1, :cond_17

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->receipt_formats:Ljava/util/List;

    if-nez v1, :cond_20

    goto :goto_16

    :cond_17
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->receipt_formats:Ljava/util/List;

    .line 632
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_16
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->redemption_meta:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Redemption_meta;

    if-nez v1, :cond_18

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->redemption_meta:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Redemption_meta;

    if-nez v1, :cond_20

    goto :goto_17

    :cond_18
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->redemption_meta:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Redemption_meta;

    .line 633
    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Redemption_meta;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_17
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->retailer_barcode_configuration:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;

    if-nez v1, :cond_19

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->retailer_barcode_configuration:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;

    if-nez v1, :cond_20

    goto :goto_18

    :cond_19
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->retailer_barcode_configuration:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;

    .line 634
    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_18
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->retailer_terms:Ljava/lang/String;

    if-nez v1, :cond_1a

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->retailer_terms:Ljava/lang/String;

    if-nez v1, :cond_20

    goto :goto_19

    :cond_1a
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->retailer_terms:Ljava/lang/String;

    .line 635
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_19
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->score:Ljava/lang/Double;

    if-nez v1, :cond_1b

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->score:Ljava/lang/Double;

    if-nez v1, :cond_20

    goto :goto_1a

    :cond_1b
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->score:Ljava/lang/Double;

    .line 636
    invoke-virtual {v1, v3}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_1a
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->short_description:Ljava/lang/String;

    if-nez v1, :cond_1c

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->short_description:Ljava/lang/String;

    if-nez v1, :cond_20

    goto :goto_1b

    :cond_1c
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->short_description:Ljava/lang/String;

    .line 637
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_1b
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->sort_results:Ljava/util/List;

    if-nez v1, :cond_1d

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->sort_results:Ljava/util/List;

    if-nez v1, :cond_20

    goto :goto_1c

    :cond_1d
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->sort_results:Ljava/util/List;

    .line 638
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_1c
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->sort_order:Ljava/lang/String;

    if-nez v1, :cond_1e

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->sort_order:Ljava/lang/String;

    if-nez v1, :cond_20

    goto :goto_1d

    :cond_1e
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->sort_order:Ljava/lang/String;

    .line 639
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :goto_1d
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->type:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->type:Ljava/lang/String;

    .line 640
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->typed_id:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->typed_id:Ljava/lang/String;

    .line 641
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->verification_type:Ljava/lang/String;

    if-nez v1, :cond_1f

    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->verification_type:Ljava/lang/String;

    if-nez p1, :cond_20

    goto :goto_1e

    :cond_1f
    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->verification_type:Ljava/lang/String;

    .line 642
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_20

    goto :goto_1e

    :cond_20
    const/4 v0, 0x0

    :goto_1e
    return v0

    :cond_21
    return v2
.end method

.method public expiration()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 311
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->expiration:Ljava/lang/String;

    return-object v0
.end method

.method public favorite()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 318
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->favorite:Ljava/lang/Long;

    return-object v0
.end method

.method public gallery_features()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/RetailerFragment$Gallery_feature;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 325
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->gallery_features:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 649
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$hashCodeMemoized:Z

    if-nez v0, :cond_1f

    .line 652
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 654
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->id:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 656
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->active:Ljava/lang/Boolean;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_0
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 658
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->barcode:Ljava/lang/Boolean;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_1
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 660
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->button_info:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;->hashCode()I

    move-result v2

    :goto_2
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 662
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->cache_key:Ljava/lang/String;

    if-nez v2, :cond_3

    const/4 v2, 0x0

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 664
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->card_signup_url:Ljava/lang/String;

    if-nez v2, :cond_4

    const/4 v2, 0x0

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 666
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->credit_pending_period:Ljava/lang/String;

    if-nez v2, :cond_5

    const/4 v2, 0x0

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 668
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->device_ocr_enabled:Ljava/lang/Boolean;

    if-nez v2, :cond_6

    const/4 v2, 0x0

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_6
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 670
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->expiration:Ljava/lang/String;

    if-nez v2, :cond_7

    const/4 v2, 0x0

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 672
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->favorite:Ljava/lang/Long;

    if-nez v2, :cond_8

    const/4 v2, 0x0

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_8
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 674
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->gallery_features:Ljava/util/List;

    if-nez v2, :cond_9

    const/4 v2, 0x0

    goto :goto_9

    :cond_9
    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    :goto_9
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 676
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->home_sort_order:Ljava/lang/String;

    if-nez v2, :cond_a

    const/4 v2, 0x0

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_a
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 678
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->hotness:Ljava/lang/Double;

    if-nez v2, :cond_b

    const/4 v2, 0x0

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/Double;->hashCode()I

    move-result v2

    :goto_b
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 680
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->icon_url:Ljava/lang/String;

    if-nez v2, :cond_c

    const/4 v2, 0x0

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_c
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 682
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->large_icon_url:Ljava/lang/String;

    if-nez v2, :cond_d

    const/4 v2, 0x0

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_d
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 684
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->model_c_retailer_image:Ljava/lang/String;

    if-nez v2, :cond_e

    const/4 v2, 0x0

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_e
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 686
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->link:Ljava/lang/String;

    if-nez v2, :cond_f

    const/4 v2, 0x0

    goto :goto_f

    :cond_f
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_f
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 688
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->name:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 690
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->nearby:Ljava/lang/Boolean;

    if-nez v2, :cond_10

    const/4 v2, 0x0

    goto :goto_10

    :cond_10
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_10
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 692
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->parent_retailer_id:Ljava/lang/Long;

    if-nez v2, :cond_11

    const/4 v2, 0x0

    goto :goto_11

    :cond_11
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_11
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 694
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->primary_category_id:Ljava/lang/Long;

    if-nez v2, :cond_12

    const/4 v2, 0x0

    goto :goto_12

    :cond_12
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_12
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 696
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->pwi_home_banner_image:Ljava/lang/String;

    if-nez v2, :cond_13

    const/4 v2, 0x0

    goto :goto_13

    :cond_13
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_13
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 698
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->purchase_location:Ljava/lang/String;

    if-nez v2, :cond_14

    const/4 v2, 0x0

    goto :goto_14

    :cond_14
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_14
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 700
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->offer_count:Ljava/lang/Long;

    if-nez v2, :cond_15

    const/4 v2, 0x0

    goto :goto_15

    :cond_15
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_15
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 702
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->receipt_formats:Ljava/util/List;

    if-nez v2, :cond_16

    const/4 v2, 0x0

    goto :goto_16

    :cond_16
    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    :goto_16
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 704
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->redemption_meta:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Redemption_meta;

    if-nez v2, :cond_17

    const/4 v2, 0x0

    goto :goto_17

    :cond_17
    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Redemption_meta;->hashCode()I

    move-result v2

    :goto_17
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 706
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->retailer_barcode_configuration:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;

    if-nez v2, :cond_18

    const/4 v2, 0x0

    goto :goto_18

    :cond_18
    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;->hashCode()I

    move-result v2

    :goto_18
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 708
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->retailer_terms:Ljava/lang/String;

    if-nez v2, :cond_19

    const/4 v2, 0x0

    goto :goto_19

    :cond_19
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_19
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 710
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->score:Ljava/lang/Double;

    if-nez v2, :cond_1a

    const/4 v2, 0x0

    goto :goto_1a

    :cond_1a
    invoke-virtual {v2}, Ljava/lang/Double;->hashCode()I

    move-result v2

    :goto_1a
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 712
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->short_description:Ljava/lang/String;

    if-nez v2, :cond_1b

    const/4 v2, 0x0

    goto :goto_1b

    :cond_1b
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1b
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 714
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->sort_results:Ljava/util/List;

    if-nez v2, :cond_1c

    const/4 v2, 0x0

    goto :goto_1c

    :cond_1c
    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    :goto_1c
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 716
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->sort_order:Ljava/lang/String;

    if-nez v2, :cond_1d

    const/4 v2, 0x0

    goto :goto_1d

    :cond_1d
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1d
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 718
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->type:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 720
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->typed_id:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 722
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->verification_type:Ljava/lang/String;

    if-nez v1, :cond_1e

    goto :goto_1e

    :cond_1e
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1e
    xor-int/2addr v0, v3

    .line 723
    iput v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$hashCode:I

    const/4 v0, 0x1

    .line 724
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$hashCodeMemoized:Z

    .line 726
    :cond_1f
    iget v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$hashCode:I

    return v0
.end method

.method public home_sort_order()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 332
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->home_sort_order:Ljava/lang/String;

    return-object v0
.end method

.method public hotness()Ljava/lang/Double;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 339
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->hotness:Ljava/lang/Double;

    return-object v0
.end method

.method public icon_url()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 346
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->icon_url:Ljava/lang/String;

    return-object v0
.end method

.method public id()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 258
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->id:Ljava/lang/String;

    return-object v0
.end method

.method public large_icon_url()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 353
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->large_icon_url:Ljava/lang/String;

    return-object v0
.end method

.method public link()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 367
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->link:Ljava/lang/String;

    return-object v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 497
    new-instance v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;-><init>(Lcom/ibotta/android/graphql/fragment/RetailerFragment;)V

    return-object v0
.end method

.method public model_c_retailer_image()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 360
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->model_c_retailer_image:Ljava/lang/String;

    return-object v0
.end method

.method public name()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 374
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->name:Ljava/lang/String;

    return-object v0
.end method

.method public nearby()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 381
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->nearby:Ljava/lang/Boolean;

    return-object v0
.end method

.method public offer_count()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 416
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->offer_count:Ljava/lang/Long;

    return-object v0
.end method

.method public parent_retailer_id()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 388
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->parent_retailer_id:Ljava/lang/Long;

    return-object v0
.end method

.method public primary_category_id()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 395
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->primary_category_id:Ljava/lang/Long;

    return-object v0
.end method

.method public purchase_location()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 409
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->purchase_location:Ljava/lang/String;

    return-object v0
.end method

.method public pwi_home_banner_image()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 402
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->pwi_home_banner_image:Ljava/lang/String;

    return-object v0
.end method

.method public receipt_formats()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 423
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->receipt_formats:Ljava/util/List;

    return-object v0
.end method

.method public redemption_meta()Lcom/ibotta/android/graphql/fragment/RetailerFragment$Redemption_meta;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 430
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->redemption_meta:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Redemption_meta;

    return-object v0
.end method

.method public retailer_barcode_configuration()Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 437
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->retailer_barcode_configuration:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;

    return-object v0
.end method

.method public retailer_terms()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 444
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->retailer_terms:Ljava/lang/String;

    return-object v0
.end method

.method public score()Ljava/lang/Double;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 451
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->score:Ljava/lang/Double;

    return-object v0
.end method

.method public short_description()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 458
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->short_description:Ljava/lang/String;

    return-object v0
.end method

.method public sort_order()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 472
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->sort_order:Ljava/lang/String;

    return-object v0
.end method

.method public sort_results()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 465
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->sort_results:Ljava/util/List;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 557
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 558
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RetailerFragment{__typename="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", active="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->active:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", barcode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->barcode:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", button_info="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->button_info:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cache_key="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->cache_key:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", card_signup_url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->card_signup_url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", credit_pending_period="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->credit_pending_period:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", device_ocr_enabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->device_ocr_enabled:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", expiration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->expiration:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", favorite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->favorite:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", gallery_features="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->gallery_features:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", home_sort_order="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->home_sort_order:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", hotness="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->hotness:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", icon_url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->icon_url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", large_icon_url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->large_icon_url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", model_c_retailer_image="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->model_c_retailer_image:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", link="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->link:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", nearby="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->nearby:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", parent_retailer_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->parent_retailer_id:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", primary_category_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->primary_category_id:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pwi_home_banner_image="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->pwi_home_banner_image:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", purchase_location="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->purchase_location:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", offer_count="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->offer_count:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", receipt_formats="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->receipt_formats:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", redemption_meta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->redemption_meta:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Redemption_meta;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retailer_barcode_configuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->retailer_barcode_configuration:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retailer_terms="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->retailer_terms:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", score="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->score:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", short_description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->short_description:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sort_results="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->sort_results:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sort_order="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->sort_order:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", typed_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->typed_id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", verification_type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->verification_type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$toString:Ljava/lang/String;

    .line 597
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$toString:Ljava/lang/String;

    return-object v0
.end method

.method public type()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 479
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->type:Ljava/lang/String;

    return-object v0
.end method

.method public typed_id()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 486
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->typed_id:Ljava/lang/String;

    return-object v0
.end method

.method public verification_type()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 493
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->verification_type:Ljava/lang/String;

    return-object v0
.end method
