.class public Lcom/ibotta/android/graphql/fragment/OfferFragment;
.super Ljava/lang/Object;
.source "OfferFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/GraphqlFragment;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/fragment/OfferFragment$Reward;,
        Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group;,
        Lcom/ibotta/android/graphql/fragment/OfferFragment$Button_info_map;,
        Lcom/ibotta/android/graphql/fragment/OfferFragment$Available_at;,
        Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;

.field public static final FRAGMENT_DEFINITION:Ljava/lang/String; = "fragment OfferFragment on Offer {\n  __typename\n  about\n  about_title\n  activated\n  alternate_text\n  amount\n  any_brand\n  available_at(limit: 30) @include(if: $includeAvailableRetailers) {\n    __typename\n    id\n    model_c_retailer_image\n    name\n  }\n  block_customer_submitted_upcs\n  bonuses\n  button_info_map {\n    __typename\n    ...ButtonInfoFragment\n  }\n  cache_key\n  caption\n  categories\n  combo\n  combo_count\n  current_value\n  description\n  end_time\n  expiration\n  expiring_soon\n  hide_available_at\n  id\n  ignore_barcode\n  large_url\n  legal\n  liked\n  link\n  multiples\n  multiples_count\n  name\n  new_flag\n  non_item\n  non_item_total\n  offer_group_id\n  offer_segment_id\n  offer_type\n  old_value\n  pending\n  percent_back\n  percent_back_max\n  preselect\n  products @include(if: $products)\n  product_groups @include(if: $products) {\n    __typename\n    ...ProductGroupFragment\n  }\n  purchase_type\n  random_weight\n  random_weight_total\n  redemption_max\n  retailers\n  retailer_exclusive\n  rewards {\n    __typename\n    ...RewardFragment\n  }\n  score\n  segment_id\n  self_funded\n  share_url\n  sort_order\n  start_time\n  terms\n  thumb_url\n  total_likes\n  type\n  typed_id\n  url\n  variable_percent_back\n  verified\n}"

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

.field final about:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final about_title:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final activated:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final alternate_text:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final amount:Ljava/lang/Double;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final any_brand:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final available_at:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/OfferFragment$Available_at;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final block_customer_submitted_upcs:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final bonuses:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final button_info_map:Lcom/ibotta/android/graphql/fragment/OfferFragment$Button_info_map;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final cache_key:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final caption:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final categories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final combo:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final combo_count:Ljava/lang/Long;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final current_value:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final description:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final end_time:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final expiration:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final expiring_soon:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final hide_available_at:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final id:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field final ignore_barcode:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final large_url:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final legal:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final liked:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final link:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final multiples:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final multiples_count:Ljava/lang/Long;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final name:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field final new_flag:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final non_item:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final non_item_total:Ljava/lang/Double;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final offer_group_id:Ljava/lang/Long;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final offer_segment_id:Ljava/lang/Long;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final offer_type:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final old_value:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final pending:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final percent_back:Ljava/lang/Double;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final percent_back_max:Ljava/lang/Double;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final preselect:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final product_groups:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final products:Ljava/util/List;
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

.field final purchase_type:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final random_weight:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final random_weight_total:Ljava/lang/Double;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final redemption_max:Ljava/lang/Long;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final retailer_exclusive:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final retailers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final rewards:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/OfferFragment$Reward;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final score:Ljava/lang/Double;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final segment_id:Ljava/lang/Long;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final self_funded:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final share_url:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final sort_order:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final start_time:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final terms:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final thumb_url:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final total_likes:Ljava/lang/Long;
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

.field final url:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final variable_percent_back:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final verified:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 13

    const/16 v0, 0x41

    .line 28
    new-array v0, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v1, "__typename"

    const-string v2, "__typename"

    .line 29
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v4

    const-string v1, "about"

    const-string v2, "about"

    .line 30
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v6, 0x1

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v6

    const-string v1, "about_title"

    const-string v2, "about_title"

    .line 31
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "activated"

    const-string v2, "activated"

    .line 32
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "alternate_text"

    const-string v2, "alternate_text"

    .line 33
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "amount"

    const-string v2, "amount"

    .line 34
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forDouble(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "any_brand"

    const-string v2, "any_brand"

    .line 35
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "available_at"

    const-string v2, "available_at"

    new-instance v3, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v3, v6}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v7, "limit"

    const-string v8, "30.0"

    .line 37
    invoke-virtual {v3, v7, v8}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v3

    .line 38
    invoke-virtual {v3}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v3

    new-array v7, v6, [Lcom/apollographql/apollo/api/ResponseField$Condition;

    const-string v8, "includeAvailableRetailers"

    invoke-static {v8, v4}, Lcom/apollographql/apollo/api/ResponseField$Condition;->booleanCondition(Ljava/lang/String;Z)Lcom/apollographql/apollo/api/ResponseField$BooleanCondition;

    move-result-object v8

    aput-object v8, v7, v4

    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    .line 36
    invoke-static {v1, v2, v3, v6, v7}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "block_customer_submitted_upcs"

    const-string v2, "block_customer_submitted_upcs"

    .line 39
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "bonuses"

    const-string v2, "bonuses"

    .line 40
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "button_info_map"

    const-string v2, "button_info_map"

    .line 41
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forObject(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "cache_key"

    const-string v2, "cache_key"

    .line 42
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "caption"

    const-string v2, "caption"

    .line 43
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "categories"

    const-string v2, "categories"

    .line 44
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "combo"

    const-string v2, "combo"

    .line 45
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "combo_count"

    const-string v2, "combo_count"

    .line 46
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forLong(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const-string v1, "current_value"

    const-string v2, "current_value"

    .line 47
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x10

    aput-object v1, v0, v2

    const-string v1, "description"

    const-string v2, "description"

    .line 48
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x11

    aput-object v1, v0, v2

    const-string v1, "end_time"

    const-string v2, "end_time"

    .line 49
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x12

    aput-object v1, v0, v2

    const-string v1, "expiration"

    const-string v2, "expiration"

    .line 50
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x13

    aput-object v1, v0, v2

    const-string v1, "expiring_soon"

    const-string v2, "expiring_soon"

    .line 51
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x14

    aput-object v1, v0, v2

    const-string v1, "hide_available_at"

    const-string v2, "hide_available_at"

    .line 52
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x15

    aput-object v1, v0, v2

    const-string v7, "id"

    const-string v8, "id"

    sget-object v11, Lcom/ibotta/android/graphql/type/CustomType;->ID:Lcom/ibotta/android/graphql/type/CustomType;

    .line 53
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v12

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lcom/apollographql/apollo/api/ResponseField;->forCustomType(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLcom/apollographql/apollo/api/ScalarType;Ljava/util/List;)Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    move-result-object v1

    const/16 v2, 0x16

    aput-object v1, v0, v2

    const-string v1, "ignore_barcode"

    const-string v2, "ignore_barcode"

    .line 54
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x17

    aput-object v1, v0, v2

    const-string v1, "large_url"

    const-string v2, "large_url"

    .line 55
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x18

    aput-object v1, v0, v2

    const-string v1, "legal"

    const-string v2, "legal"

    .line 56
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x19

    aput-object v1, v0, v2

    const-string v1, "liked"

    const-string v2, "liked"

    .line 57
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    const-string v1, "link"

    const-string v2, "link"

    .line 58
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    const-string v1, "multiples"

    const-string v2, "multiples"

    .line 59
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    const-string v1, "multiples_count"

    const-string v2, "multiples_count"

    .line 60
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forLong(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    const-string v1, "name"

    const-string v2, "name"

    .line 61
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x1e

    aput-object v1, v0, v2

    const-string v1, "new_flag"

    const-string v2, "new_flag"

    .line 62
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x1f

    aput-object v1, v0, v2

    const-string v1, "non_item"

    const-string v2, "non_item"

    .line 63
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x20

    aput-object v1, v0, v2

    const-string v1, "non_item_total"

    const-string v2, "non_item_total"

    .line 64
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forDouble(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x21

    aput-object v1, v0, v2

    const-string v1, "offer_group_id"

    const-string v2, "offer_group_id"

    .line 65
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forLong(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x22

    aput-object v1, v0, v2

    const-string v1, "offer_segment_id"

    const-string v2, "offer_segment_id"

    .line 66
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forLong(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x23

    aput-object v1, v0, v2

    const-string v1, "offer_type"

    const-string v2, "offer_type"

    .line 67
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x24

    aput-object v1, v0, v2

    const-string v1, "old_value"

    const-string v2, "old_value"

    .line 68
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x25

    aput-object v1, v0, v2

    const-string v1, "pending"

    const-string v2, "pending"

    .line 69
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x26

    aput-object v1, v0, v2

    const-string v1, "percent_back"

    const-string v2, "percent_back"

    .line 70
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forDouble(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x27

    aput-object v1, v0, v2

    const-string v1, "percent_back_max"

    const-string v2, "percent_back_max"

    .line 71
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forDouble(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x28

    aput-object v1, v0, v2

    const-string v1, "preselect"

    const-string v2, "preselect"

    .line 72
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x29

    aput-object v1, v0, v2

    const-string v1, "products"

    const-string v2, "products"

    new-array v3, v6, [Lcom/apollographql/apollo/api/ResponseField$Condition;

    const-string v7, "products"

    .line 73
    invoke-static {v7, v4}, Lcom/apollographql/apollo/api/ResponseField$Condition;->booleanCondition(Ljava/lang/String;Z)Lcom/apollographql/apollo/api/ResponseField$BooleanCondition;

    move-result-object v7

    aput-object v7, v3, v4

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x2a

    aput-object v1, v0, v2

    const-string v1, "product_groups"

    const-string v2, "product_groups"

    new-array v3, v6, [Lcom/apollographql/apollo/api/ResponseField$Condition;

    const-string v7, "products"

    .line 74
    invoke-static {v7, v4}, Lcom/apollographql/apollo/api/ResponseField$Condition;->booleanCondition(Ljava/lang/String;Z)Lcom/apollographql/apollo/api/ResponseField$BooleanCondition;

    move-result-object v7

    aput-object v7, v3, v4

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x2b

    aput-object v1, v0, v2

    const-string v1, "purchase_type"

    const-string v2, "purchase_type"

    .line 75
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x2c

    aput-object v1, v0, v2

    const-string v1, "random_weight"

    const-string v2, "random_weight"

    .line 76
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x2d

    aput-object v1, v0, v2

    const-string v1, "random_weight_total"

    const-string v2, "random_weight_total"

    .line 77
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forDouble(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x2e

    aput-object v1, v0, v2

    const-string v1, "redemption_max"

    const-string v2, "redemption_max"

    .line 78
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forLong(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x2f

    aput-object v1, v0, v2

    const-string v1, "retailers"

    const-string v2, "retailers"

    .line 79
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x30

    aput-object v1, v0, v2

    const-string v1, "retailer_exclusive"

    const-string v2, "retailer_exclusive"

    .line 80
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x31

    aput-object v1, v0, v2

    const-string v1, "rewards"

    const-string v2, "rewards"

    .line 81
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x32

    aput-object v1, v0, v2

    const-string v1, "score"

    const-string v2, "score"

    .line 82
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forDouble(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x33

    aput-object v1, v0, v2

    const-string v1, "segment_id"

    const-string v2, "segment_id"

    .line 83
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forLong(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x34

    aput-object v1, v0, v2

    const-string v1, "self_funded"

    const-string v2, "self_funded"

    .line 84
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x35

    aput-object v1, v0, v2

    const-string v1, "share_url"

    const-string v2, "share_url"

    .line 85
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x36

    aput-object v1, v0, v2

    const-string v1, "sort_order"

    const-string v2, "sort_order"

    .line 86
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x37

    aput-object v1, v0, v2

    const-string v1, "start_time"

    const-string v2, "start_time"

    .line 87
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x38

    aput-object v1, v0, v2

    const-string v1, "terms"

    const-string v2, "terms"

    .line 88
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x39

    aput-object v1, v0, v2

    const-string v1, "thumb_url"

    const-string v2, "thumb_url"

    .line 89
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x3a

    aput-object v1, v0, v2

    const-string v1, "total_likes"

    const-string v2, "total_likes"

    .line 90
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forLong(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x3b

    aput-object v1, v0, v2

    const-string v1, "type"

    const-string v2, "type"

    .line 91
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x3c

    aput-object v1, v0, v2

    const-string v1, "typed_id"

    const-string v2, "typed_id"

    .line 92
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x3d

    aput-object v1, v0, v2

    const-string v1, "url"

    const-string v2, "url"

    .line 93
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x3e

    aput-object v1, v0, v2

    const-string v1, "variable_percent_back"

    const-string v2, "variable_percent_back"

    .line 94
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x3f

    aput-object v1, v0, v2

    const-string v1, "verified"

    const-string v2, "verified"

    .line 95
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x40

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const-string v0, "Offer"

    .line 180
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->POSSIBLE_TYPES:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Lcom/ibotta/android/graphql/fragment/OfferFragment$Button_info_map;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/Double;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p9    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p10    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p11    # Lcom/ibotta/android/graphql/fragment/OfferFragment$Button_info_map;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p13    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p14    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p15    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p16    # Ljava/lang/Long;
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
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p20    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p21    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p22    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p23    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p24    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p25    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p26    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p27    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p28    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p29    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p30    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p31    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p32    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p33    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p34    # Ljava/lang/Double;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p35    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p36    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p37    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p38    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p39    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p40    # Ljava/lang/Double;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p41    # Ljava/lang/Double;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p42    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p43    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p44    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p45    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p46    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p47    # Ljava/lang/Double;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p48    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p49    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p50    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p51    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p52    # Ljava/lang/Double;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p53    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p54    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p55    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p56    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p57    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p58    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p59    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p60    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p61    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p62    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p63    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p64    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p65    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/OfferFragment$Available_at;",
            ">;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;",
            "Lcom/ibotta/android/graphql/fragment/OfferFragment$Button_info_map;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Double;",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Double;",
            "Ljava/lang/Long;",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/OfferFragment$Reward;",
            ">;",
            "Ljava/lang/Double;",
            "Ljava/lang/Long;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    .line 342
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "__typename == null"

    move-object v2, p1

    .line 343
    invoke-static {p1, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->__typename:Ljava/lang/String;

    move-object v1, p2

    .line 344
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->about:Ljava/lang/String;

    move-object v1, p3

    .line 345
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->about_title:Ljava/lang/String;

    move-object v1, p4

    .line 346
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->activated:Ljava/lang/Boolean;

    move-object v1, p5

    .line 347
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->alternate_text:Ljava/lang/String;

    move-object v1, p6

    .line 348
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->amount:Ljava/lang/Double;

    move-object v1, p7

    .line 349
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->any_brand:Ljava/lang/Boolean;

    move-object v1, p8

    .line 350
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->available_at:Ljava/util/List;

    move-object v1, p9

    .line 351
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->block_customer_submitted_upcs:Ljava/lang/Boolean;

    move-object v1, p10

    .line 352
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->bonuses:Ljava/util/List;

    move-object v1, p11

    .line 353
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->button_info_map:Lcom/ibotta/android/graphql/fragment/OfferFragment$Button_info_map;

    move-object v1, p12

    .line 354
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->cache_key:Ljava/lang/String;

    move-object/from16 v1, p13

    .line 355
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->caption:Ljava/lang/String;

    move-object/from16 v1, p14

    .line 356
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->categories:Ljava/util/List;

    move-object/from16 v1, p15

    .line 357
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->combo:Ljava/lang/Boolean;

    move-object/from16 v1, p16

    .line 358
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->combo_count:Ljava/lang/Long;

    move-object/from16 v1, p17

    .line 359
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->current_value:Ljava/lang/String;

    move-object/from16 v1, p18

    .line 360
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->description:Ljava/lang/String;

    move-object/from16 v1, p19

    .line 361
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->end_time:Ljava/lang/String;

    move-object/from16 v1, p20

    .line 362
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->expiration:Ljava/lang/String;

    move-object/from16 v1, p21

    .line 363
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->expiring_soon:Ljava/lang/Boolean;

    move-object/from16 v1, p22

    .line 364
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->hide_available_at:Ljava/lang/Boolean;

    const-string v1, "id == null"

    move-object/from16 v2, p23

    .line 365
    invoke-static {v2, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->id:Ljava/lang/String;

    move-object/from16 v1, p24

    .line 366
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->ignore_barcode:Ljava/lang/Boolean;

    move-object/from16 v1, p25

    .line 367
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->large_url:Ljava/lang/String;

    move-object/from16 v1, p26

    .line 368
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->legal:Ljava/lang/String;

    move-object/from16 v1, p27

    .line 369
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->liked:Ljava/lang/Boolean;

    move-object/from16 v1, p28

    .line 370
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->link:Ljava/lang/String;

    move-object/from16 v1, p29

    .line 371
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->multiples:Ljava/lang/String;

    move-object/from16 v1, p30

    .line 372
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->multiples_count:Ljava/lang/Long;

    const-string v1, "name == null"

    move-object/from16 v2, p31

    .line 373
    invoke-static {v2, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->name:Ljava/lang/String;

    move-object/from16 v1, p32

    .line 374
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->new_flag:Ljava/lang/Boolean;

    move-object/from16 v1, p33

    .line 375
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->non_item:Ljava/lang/Boolean;

    move-object/from16 v1, p34

    .line 376
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->non_item_total:Ljava/lang/Double;

    move-object/from16 v1, p35

    .line 377
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->offer_group_id:Ljava/lang/Long;

    move-object/from16 v1, p36

    .line 378
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->offer_segment_id:Ljava/lang/Long;

    move-object/from16 v1, p37

    .line 379
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->offer_type:Ljava/lang/String;

    move-object/from16 v1, p38

    .line 380
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->old_value:Ljava/lang/String;

    move-object/from16 v1, p39

    .line 381
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->pending:Ljava/lang/Boolean;

    move-object/from16 v1, p40

    .line 382
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->percent_back:Ljava/lang/Double;

    move-object/from16 v1, p41

    .line 383
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->percent_back_max:Ljava/lang/Double;

    move-object/from16 v1, p42

    .line 384
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->preselect:Ljava/lang/Boolean;

    move-object/from16 v1, p43

    .line 385
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->products:Ljava/util/List;

    move-object/from16 v1, p44

    .line 386
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->product_groups:Ljava/util/List;

    move-object/from16 v1, p45

    .line 387
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->purchase_type:Ljava/lang/String;

    move-object/from16 v1, p46

    .line 388
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->random_weight:Ljava/lang/Boolean;

    move-object/from16 v1, p47

    .line 389
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->random_weight_total:Ljava/lang/Double;

    move-object/from16 v1, p48

    .line 390
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->redemption_max:Ljava/lang/Long;

    move-object/from16 v1, p49

    .line 391
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->retailers:Ljava/util/List;

    move-object/from16 v1, p50

    .line 392
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->retailer_exclusive:Ljava/lang/Boolean;

    move-object/from16 v1, p51

    .line 393
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->rewards:Ljava/util/List;

    move-object/from16 v1, p52

    .line 394
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->score:Ljava/lang/Double;

    move-object/from16 v1, p53

    .line 395
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->segment_id:Ljava/lang/Long;

    move-object/from16 v1, p54

    .line 396
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->self_funded:Ljava/lang/Boolean;

    move-object/from16 v1, p55

    .line 397
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->share_url:Ljava/lang/String;

    move-object/from16 v1, p56

    .line 398
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->sort_order:Ljava/lang/String;

    move-object/from16 v1, p57

    .line 399
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->start_time:Ljava/lang/String;

    move-object/from16 v1, p58

    .line 400
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->terms:Ljava/lang/String;

    move-object/from16 v1, p59

    .line 401
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->thumb_url:Ljava/lang/String;

    move-object/from16 v1, p60

    .line 402
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->total_likes:Ljava/lang/Long;

    const-string v1, "type == null"

    move-object/from16 v2, p61

    .line 403
    invoke-static {v2, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->type:Ljava/lang/String;

    const-string v1, "typed_id == null"

    move-object/from16 v2, p62

    .line 404
    invoke-static {v2, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->typed_id:Ljava/lang/String;

    move-object/from16 v1, p63

    .line 405
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->url:Ljava/lang/String;

    move-object/from16 v1, p64

    .line 406
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->variable_percent_back:Ljava/lang/String;

    move-object/from16 v1, p65

    .line 407
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->verified:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public __typename()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 411
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->__typename:Ljava/lang/String;

    return-object v0
.end method

.method public about()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 415
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->about:Ljava/lang/String;

    return-object v0
.end method

.method public about_title()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 419
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->about_title:Ljava/lang/String;

    return-object v0
.end method

.method public activated()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 423
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->activated:Ljava/lang/Boolean;

    return-object v0
.end method

.method public alternate_text()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 427
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->alternate_text:Ljava/lang/String;

    return-object v0
.end method

.method public amount()Ljava/lang/Double;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 434
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->amount:Ljava/lang/Double;

    return-object v0
.end method

.method public any_brand()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 438
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->any_brand:Ljava/lang/Boolean;

    return-object v0
.end method

.method public available_at()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/OfferFragment$Available_at;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 442
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->available_at:Ljava/util/List;

    return-object v0
.end method

.method public block_customer_submitted_upcs()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 446
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->block_customer_submitted_upcs:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bonuses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 450
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->bonuses:Ljava/util/List;

    return-object v0
.end method

.method public button_info_map()Lcom/ibotta/android/graphql/fragment/OfferFragment$Button_info_map;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 454
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->button_info_map:Lcom/ibotta/android/graphql/fragment/OfferFragment$Button_info_map;

    return-object v0
.end method

.method public cache_key()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 458
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->cache_key:Ljava/lang/String;

    return-object v0
.end method

.method public caption()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 462
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->caption:Ljava/lang/String;

    return-object v0
.end method

.method public categories()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 466
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->categories:Ljava/util/List;

    return-object v0
.end method

.method public combo()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 470
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->combo:Ljava/lang/Boolean;

    return-object v0
.end method

.method public combo_count()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 474
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->combo_count:Ljava/lang/Long;

    return-object v0
.end method

.method public current_value()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 481
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->current_value:Ljava/lang/String;

    return-object v0
.end method

.method public description()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 488
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->description:Ljava/lang/String;

    return-object v0
.end method

.method public end_time()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 495
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->end_time:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 908
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;

    const/4 v2, 0x0

    if-eqz v1, :cond_3e

    .line 909
    check-cast p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;

    .line 910
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->__typename:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->about:Ljava/lang/String;

    if-nez v1, :cond_1

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->about:Ljava/lang/String;

    if-nez v1, :cond_3d

    goto :goto_0

    :cond_1
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->about:Ljava/lang/String;

    .line 911
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->about_title:Ljava/lang/String;

    if-nez v1, :cond_2

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->about_title:Ljava/lang/String;

    if-nez v1, :cond_3d

    goto :goto_1

    :cond_2
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->about_title:Ljava/lang/String;

    .line 912
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->activated:Ljava/lang/Boolean;

    if-nez v1, :cond_3

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->activated:Ljava/lang/Boolean;

    if-nez v1, :cond_3d

    goto :goto_2

    :cond_3
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->activated:Ljava/lang/Boolean;

    .line 913
    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_2
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->alternate_text:Ljava/lang/String;

    if-nez v1, :cond_4

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->alternate_text:Ljava/lang/String;

    if-nez v1, :cond_3d

    goto :goto_3

    :cond_4
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->alternate_text:Ljava/lang/String;

    .line 914
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_3
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->amount:Ljava/lang/Double;

    if-nez v1, :cond_5

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->amount:Ljava/lang/Double;

    if-nez v1, :cond_3d

    goto :goto_4

    :cond_5
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->amount:Ljava/lang/Double;

    .line 915
    invoke-virtual {v1, v3}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_4
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->any_brand:Ljava/lang/Boolean;

    if-nez v1, :cond_6

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->any_brand:Ljava/lang/Boolean;

    if-nez v1, :cond_3d

    goto :goto_5

    :cond_6
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->any_brand:Ljava/lang/Boolean;

    .line 916
    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_5
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->available_at:Ljava/util/List;

    if-nez v1, :cond_7

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->available_at:Ljava/util/List;

    if-nez v1, :cond_3d

    goto :goto_6

    :cond_7
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->available_at:Ljava/util/List;

    .line 917
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_6
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->block_customer_submitted_upcs:Ljava/lang/Boolean;

    if-nez v1, :cond_8

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->block_customer_submitted_upcs:Ljava/lang/Boolean;

    if-nez v1, :cond_3d

    goto :goto_7

    :cond_8
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->block_customer_submitted_upcs:Ljava/lang/Boolean;

    .line 918
    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_7
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->bonuses:Ljava/util/List;

    if-nez v1, :cond_9

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->bonuses:Ljava/util/List;

    if-nez v1, :cond_3d

    goto :goto_8

    :cond_9
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->bonuses:Ljava/util/List;

    .line 919
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_8
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->button_info_map:Lcom/ibotta/android/graphql/fragment/OfferFragment$Button_info_map;

    if-nez v1, :cond_a

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->button_info_map:Lcom/ibotta/android/graphql/fragment/OfferFragment$Button_info_map;

    if-nez v1, :cond_3d

    goto :goto_9

    :cond_a
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->button_info_map:Lcom/ibotta/android/graphql/fragment/OfferFragment$Button_info_map;

    .line 920
    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Button_info_map;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_9
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->cache_key:Ljava/lang/String;

    if-nez v1, :cond_b

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->cache_key:Ljava/lang/String;

    if-nez v1, :cond_3d

    goto :goto_a

    :cond_b
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->cache_key:Ljava/lang/String;

    .line 921
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_a
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->caption:Ljava/lang/String;

    if-nez v1, :cond_c

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->caption:Ljava/lang/String;

    if-nez v1, :cond_3d

    goto :goto_b

    :cond_c
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->caption:Ljava/lang/String;

    .line 922
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_b
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->categories:Ljava/util/List;

    if-nez v1, :cond_d

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->categories:Ljava/util/List;

    if-nez v1, :cond_3d

    goto :goto_c

    :cond_d
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->categories:Ljava/util/List;

    .line 923
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_c
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->combo:Ljava/lang/Boolean;

    if-nez v1, :cond_e

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->combo:Ljava/lang/Boolean;

    if-nez v1, :cond_3d

    goto :goto_d

    :cond_e
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->combo:Ljava/lang/Boolean;

    .line 924
    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_d
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->combo_count:Ljava/lang/Long;

    if-nez v1, :cond_f

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->combo_count:Ljava/lang/Long;

    if-nez v1, :cond_3d

    goto :goto_e

    :cond_f
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->combo_count:Ljava/lang/Long;

    .line 925
    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_e
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->current_value:Ljava/lang/String;

    if-nez v1, :cond_10

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->current_value:Ljava/lang/String;

    if-nez v1, :cond_3d

    goto :goto_f

    :cond_10
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->current_value:Ljava/lang/String;

    .line 926
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_f
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->description:Ljava/lang/String;

    if-nez v1, :cond_11

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->description:Ljava/lang/String;

    if-nez v1, :cond_3d

    goto :goto_10

    :cond_11
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->description:Ljava/lang/String;

    .line 927
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_10
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->end_time:Ljava/lang/String;

    if-nez v1, :cond_12

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->end_time:Ljava/lang/String;

    if-nez v1, :cond_3d

    goto :goto_11

    :cond_12
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->end_time:Ljava/lang/String;

    .line 928
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_11
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->expiration:Ljava/lang/String;

    if-nez v1, :cond_13

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->expiration:Ljava/lang/String;

    if-nez v1, :cond_3d

    goto :goto_12

    :cond_13
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->expiration:Ljava/lang/String;

    .line 929
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_12
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->expiring_soon:Ljava/lang/Boolean;

    if-nez v1, :cond_14

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->expiring_soon:Ljava/lang/Boolean;

    if-nez v1, :cond_3d

    goto :goto_13

    :cond_14
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->expiring_soon:Ljava/lang/Boolean;

    .line 930
    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_13
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->hide_available_at:Ljava/lang/Boolean;

    if-nez v1, :cond_15

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->hide_available_at:Ljava/lang/Boolean;

    if-nez v1, :cond_3d

    goto :goto_14

    :cond_15
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->hide_available_at:Ljava/lang/Boolean;

    .line 931
    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_14
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->id:Ljava/lang/String;

    .line 932
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->ignore_barcode:Ljava/lang/Boolean;

    if-nez v1, :cond_16

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->ignore_barcode:Ljava/lang/Boolean;

    if-nez v1, :cond_3d

    goto :goto_15

    :cond_16
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->ignore_barcode:Ljava/lang/Boolean;

    .line 933
    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_15
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->large_url:Ljava/lang/String;

    if-nez v1, :cond_17

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->large_url:Ljava/lang/String;

    if-nez v1, :cond_3d

    goto :goto_16

    :cond_17
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->large_url:Ljava/lang/String;

    .line 934
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_16
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->legal:Ljava/lang/String;

    if-nez v1, :cond_18

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->legal:Ljava/lang/String;

    if-nez v1, :cond_3d

    goto :goto_17

    :cond_18
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->legal:Ljava/lang/String;

    .line 935
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_17
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->liked:Ljava/lang/Boolean;

    if-nez v1, :cond_19

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->liked:Ljava/lang/Boolean;

    if-nez v1, :cond_3d

    goto :goto_18

    :cond_19
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->liked:Ljava/lang/Boolean;

    .line 936
    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_18
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->link:Ljava/lang/String;

    if-nez v1, :cond_1a

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->link:Ljava/lang/String;

    if-nez v1, :cond_3d

    goto :goto_19

    :cond_1a
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->link:Ljava/lang/String;

    .line 937
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_19
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->multiples:Ljava/lang/String;

    if-nez v1, :cond_1b

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->multiples:Ljava/lang/String;

    if-nez v1, :cond_3d

    goto :goto_1a

    :cond_1b
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->multiples:Ljava/lang/String;

    .line 938
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_1a
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->multiples_count:Ljava/lang/Long;

    if-nez v1, :cond_1c

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->multiples_count:Ljava/lang/Long;

    if-nez v1, :cond_3d

    goto :goto_1b

    :cond_1c
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->multiples_count:Ljava/lang/Long;

    .line 939
    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_1b
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->name:Ljava/lang/String;

    .line 940
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->new_flag:Ljava/lang/Boolean;

    if-nez v1, :cond_1d

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->new_flag:Ljava/lang/Boolean;

    if-nez v1, :cond_3d

    goto :goto_1c

    :cond_1d
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->new_flag:Ljava/lang/Boolean;

    .line 941
    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_1c
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->non_item:Ljava/lang/Boolean;

    if-nez v1, :cond_1e

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->non_item:Ljava/lang/Boolean;

    if-nez v1, :cond_3d

    goto :goto_1d

    :cond_1e
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->non_item:Ljava/lang/Boolean;

    .line 942
    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_1d
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->non_item_total:Ljava/lang/Double;

    if-nez v1, :cond_1f

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->non_item_total:Ljava/lang/Double;

    if-nez v1, :cond_3d

    goto :goto_1e

    :cond_1f
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->non_item_total:Ljava/lang/Double;

    .line 943
    invoke-virtual {v1, v3}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_1e
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->offer_group_id:Ljava/lang/Long;

    if-nez v1, :cond_20

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->offer_group_id:Ljava/lang/Long;

    if-nez v1, :cond_3d

    goto :goto_1f

    :cond_20
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->offer_group_id:Ljava/lang/Long;

    .line 944
    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_1f
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->offer_segment_id:Ljava/lang/Long;

    if-nez v1, :cond_21

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->offer_segment_id:Ljava/lang/Long;

    if-nez v1, :cond_3d

    goto :goto_20

    :cond_21
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->offer_segment_id:Ljava/lang/Long;

    .line 945
    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_20
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->offer_type:Ljava/lang/String;

    if-nez v1, :cond_22

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->offer_type:Ljava/lang/String;

    if-nez v1, :cond_3d

    goto :goto_21

    :cond_22
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->offer_type:Ljava/lang/String;

    .line 946
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_21
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->old_value:Ljava/lang/String;

    if-nez v1, :cond_23

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->old_value:Ljava/lang/String;

    if-nez v1, :cond_3d

    goto :goto_22

    :cond_23
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->old_value:Ljava/lang/String;

    .line 947
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_22
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->pending:Ljava/lang/Boolean;

    if-nez v1, :cond_24

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->pending:Ljava/lang/Boolean;

    if-nez v1, :cond_3d

    goto :goto_23

    :cond_24
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->pending:Ljava/lang/Boolean;

    .line 948
    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_23
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->percent_back:Ljava/lang/Double;

    if-nez v1, :cond_25

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->percent_back:Ljava/lang/Double;

    if-nez v1, :cond_3d

    goto :goto_24

    :cond_25
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->percent_back:Ljava/lang/Double;

    .line 949
    invoke-virtual {v1, v3}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_24
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->percent_back_max:Ljava/lang/Double;

    if-nez v1, :cond_26

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->percent_back_max:Ljava/lang/Double;

    if-nez v1, :cond_3d

    goto :goto_25

    :cond_26
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->percent_back_max:Ljava/lang/Double;

    .line 950
    invoke-virtual {v1, v3}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_25
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->preselect:Ljava/lang/Boolean;

    if-nez v1, :cond_27

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->preselect:Ljava/lang/Boolean;

    if-nez v1, :cond_3d

    goto :goto_26

    :cond_27
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->preselect:Ljava/lang/Boolean;

    .line 951
    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_26
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->products:Ljava/util/List;

    if-nez v1, :cond_28

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->products:Ljava/util/List;

    if-nez v1, :cond_3d

    goto :goto_27

    :cond_28
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->products:Ljava/util/List;

    .line 952
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_27
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->product_groups:Ljava/util/List;

    if-nez v1, :cond_29

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->product_groups:Ljava/util/List;

    if-nez v1, :cond_3d

    goto :goto_28

    :cond_29
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->product_groups:Ljava/util/List;

    .line 953
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_28
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->purchase_type:Ljava/lang/String;

    if-nez v1, :cond_2a

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->purchase_type:Ljava/lang/String;

    if-nez v1, :cond_3d

    goto :goto_29

    :cond_2a
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->purchase_type:Ljava/lang/String;

    .line 954
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_29
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->random_weight:Ljava/lang/Boolean;

    if-nez v1, :cond_2b

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->random_weight:Ljava/lang/Boolean;

    if-nez v1, :cond_3d

    goto :goto_2a

    :cond_2b
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->random_weight:Ljava/lang/Boolean;

    .line 955
    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_2a
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->random_weight_total:Ljava/lang/Double;

    if-nez v1, :cond_2c

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->random_weight_total:Ljava/lang/Double;

    if-nez v1, :cond_3d

    goto :goto_2b

    :cond_2c
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->random_weight_total:Ljava/lang/Double;

    .line 956
    invoke-virtual {v1, v3}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_2b
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->redemption_max:Ljava/lang/Long;

    if-nez v1, :cond_2d

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->redemption_max:Ljava/lang/Long;

    if-nez v1, :cond_3d

    goto :goto_2c

    :cond_2d
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->redemption_max:Ljava/lang/Long;

    .line 957
    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_2c
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->retailers:Ljava/util/List;

    if-nez v1, :cond_2e

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->retailers:Ljava/util/List;

    if-nez v1, :cond_3d

    goto :goto_2d

    :cond_2e
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->retailers:Ljava/util/List;

    .line 958
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_2d
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->retailer_exclusive:Ljava/lang/Boolean;

    if-nez v1, :cond_2f

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->retailer_exclusive:Ljava/lang/Boolean;

    if-nez v1, :cond_3d

    goto :goto_2e

    :cond_2f
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->retailer_exclusive:Ljava/lang/Boolean;

    .line 959
    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_2e
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->rewards:Ljava/util/List;

    if-nez v1, :cond_30

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->rewards:Ljava/util/List;

    if-nez v1, :cond_3d

    goto :goto_2f

    :cond_30
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->rewards:Ljava/util/List;

    .line 960
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_2f
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->score:Ljava/lang/Double;

    if-nez v1, :cond_31

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->score:Ljava/lang/Double;

    if-nez v1, :cond_3d

    goto :goto_30

    :cond_31
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->score:Ljava/lang/Double;

    .line 961
    invoke-virtual {v1, v3}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_30
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->segment_id:Ljava/lang/Long;

    if-nez v1, :cond_32

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->segment_id:Ljava/lang/Long;

    if-nez v1, :cond_3d

    goto :goto_31

    :cond_32
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->segment_id:Ljava/lang/Long;

    .line 962
    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_31
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->self_funded:Ljava/lang/Boolean;

    if-nez v1, :cond_33

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->self_funded:Ljava/lang/Boolean;

    if-nez v1, :cond_3d

    goto :goto_32

    :cond_33
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->self_funded:Ljava/lang/Boolean;

    .line 963
    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_32
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->share_url:Ljava/lang/String;

    if-nez v1, :cond_34

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->share_url:Ljava/lang/String;

    if-nez v1, :cond_3d

    goto :goto_33

    :cond_34
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->share_url:Ljava/lang/String;

    .line 964
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_33
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->sort_order:Ljava/lang/String;

    if-nez v1, :cond_35

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->sort_order:Ljava/lang/String;

    if-nez v1, :cond_3d

    goto :goto_34

    :cond_35
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->sort_order:Ljava/lang/String;

    .line 965
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_34
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->start_time:Ljava/lang/String;

    if-nez v1, :cond_36

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->start_time:Ljava/lang/String;

    if-nez v1, :cond_3d

    goto :goto_35

    :cond_36
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->start_time:Ljava/lang/String;

    .line 966
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_35
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->terms:Ljava/lang/String;

    if-nez v1, :cond_37

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->terms:Ljava/lang/String;

    if-nez v1, :cond_3d

    goto :goto_36

    :cond_37
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->terms:Ljava/lang/String;

    .line 967
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_36
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->thumb_url:Ljava/lang/String;

    if-nez v1, :cond_38

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->thumb_url:Ljava/lang/String;

    if-nez v1, :cond_3d

    goto :goto_37

    :cond_38
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->thumb_url:Ljava/lang/String;

    .line 968
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_37
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->total_likes:Ljava/lang/Long;

    if-nez v1, :cond_39

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->total_likes:Ljava/lang/Long;

    if-nez v1, :cond_3d

    goto :goto_38

    :cond_39
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->total_likes:Ljava/lang/Long;

    .line 969
    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_38
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->type:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->type:Ljava/lang/String;

    .line 970
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->typed_id:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->typed_id:Ljava/lang/String;

    .line 971
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->url:Ljava/lang/String;

    if-nez v1, :cond_3a

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->url:Ljava/lang/String;

    if-nez v1, :cond_3d

    goto :goto_39

    :cond_3a
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->url:Ljava/lang/String;

    .line 972
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_39
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->variable_percent_back:Ljava/lang/String;

    if-nez v1, :cond_3b

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->variable_percent_back:Ljava/lang/String;

    if-nez v1, :cond_3d

    goto :goto_3a

    :cond_3b
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->variable_percent_back:Ljava/lang/String;

    .line 973
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    :goto_3a
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->verified:Ljava/lang/Boolean;

    if-nez v1, :cond_3c

    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->verified:Ljava/lang/Boolean;

    if-nez p1, :cond_3d

    goto :goto_3b

    :cond_3c
    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->verified:Ljava/lang/Boolean;

    .line 974
    invoke-virtual {v1, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3d

    goto :goto_3b

    :cond_3d
    const/4 v0, 0x0

    :goto_3b
    return v0

    :cond_3e
    return v2
.end method

.method public expiration()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 502
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->expiration:Ljava/lang/String;

    return-object v0
.end method

.method public expiring_soon()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 509
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->expiring_soon:Ljava/lang/Boolean;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 981
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$hashCodeMemoized:Z

    if-nez v0, :cond_3c

    .line 984
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 986
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->about:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 988
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->about_title:Ljava/lang/String;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 990
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->activated:Ljava/lang/Boolean;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_2
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 992
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->alternate_text:Ljava/lang/String;

    if-nez v2, :cond_3

    const/4 v2, 0x0

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 994
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->amount:Ljava/lang/Double;

    if-nez v2, :cond_4

    const/4 v2, 0x0

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Double;->hashCode()I

    move-result v2

    :goto_4
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 996
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->any_brand:Ljava/lang/Boolean;

    if-nez v2, :cond_5

    const/4 v2, 0x0

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_5
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 998
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->available_at:Ljava/util/List;

    if-nez v2, :cond_6

    const/4 v2, 0x0

    goto :goto_6

    :cond_6
    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    :goto_6
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1000
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->block_customer_submitted_upcs:Ljava/lang/Boolean;

    if-nez v2, :cond_7

    const/4 v2, 0x0

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_7
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1002
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->bonuses:Ljava/util/List;

    if-nez v2, :cond_8

    const/4 v2, 0x0

    goto :goto_8

    :cond_8
    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    :goto_8
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1004
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->button_info_map:Lcom/ibotta/android/graphql/fragment/OfferFragment$Button_info_map;

    if-nez v2, :cond_9

    const/4 v2, 0x0

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Button_info_map;->hashCode()I

    move-result v2

    :goto_9
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1006
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->cache_key:Ljava/lang/String;

    if-nez v2, :cond_a

    const/4 v2, 0x0

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_a
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1008
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->caption:Ljava/lang/String;

    if-nez v2, :cond_b

    const/4 v2, 0x0

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_b
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1010
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->categories:Ljava/util/List;

    if-nez v2, :cond_c

    const/4 v2, 0x0

    goto :goto_c

    :cond_c
    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    :goto_c
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1012
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->combo:Ljava/lang/Boolean;

    if-nez v2, :cond_d

    const/4 v2, 0x0

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_d
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1014
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->combo_count:Ljava/lang/Long;

    if-nez v2, :cond_e

    const/4 v2, 0x0

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_e
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1016
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->current_value:Ljava/lang/String;

    if-nez v2, :cond_f

    const/4 v2, 0x0

    goto :goto_f

    :cond_f
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_f
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1018
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->description:Ljava/lang/String;

    if-nez v2, :cond_10

    const/4 v2, 0x0

    goto :goto_10

    :cond_10
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_10
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1020
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->end_time:Ljava/lang/String;

    if-nez v2, :cond_11

    const/4 v2, 0x0

    goto :goto_11

    :cond_11
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_11
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1022
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->expiration:Ljava/lang/String;

    if-nez v2, :cond_12

    const/4 v2, 0x0

    goto :goto_12

    :cond_12
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_12
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1024
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->expiring_soon:Ljava/lang/Boolean;

    if-nez v2, :cond_13

    const/4 v2, 0x0

    goto :goto_13

    :cond_13
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_13
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1026
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->hide_available_at:Ljava/lang/Boolean;

    if-nez v2, :cond_14

    const/4 v2, 0x0

    goto :goto_14

    :cond_14
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_14
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1028
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->id:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1030
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->ignore_barcode:Ljava/lang/Boolean;

    if-nez v2, :cond_15

    const/4 v2, 0x0

    goto :goto_15

    :cond_15
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_15
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1032
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->large_url:Ljava/lang/String;

    if-nez v2, :cond_16

    const/4 v2, 0x0

    goto :goto_16

    :cond_16
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_16
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1034
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->legal:Ljava/lang/String;

    if-nez v2, :cond_17

    const/4 v2, 0x0

    goto :goto_17

    :cond_17
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_17
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1036
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->liked:Ljava/lang/Boolean;

    if-nez v2, :cond_18

    const/4 v2, 0x0

    goto :goto_18

    :cond_18
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_18
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1038
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->link:Ljava/lang/String;

    if-nez v2, :cond_19

    const/4 v2, 0x0

    goto :goto_19

    :cond_19
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_19
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1040
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->multiples:Ljava/lang/String;

    if-nez v2, :cond_1a

    const/4 v2, 0x0

    goto :goto_1a

    :cond_1a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1a
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1042
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->multiples_count:Ljava/lang/Long;

    if-nez v2, :cond_1b

    const/4 v2, 0x0

    goto :goto_1b

    :cond_1b
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_1b
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1044
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->name:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1046
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->new_flag:Ljava/lang/Boolean;

    if-nez v2, :cond_1c

    const/4 v2, 0x0

    goto :goto_1c

    :cond_1c
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_1c
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1048
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->non_item:Ljava/lang/Boolean;

    if-nez v2, :cond_1d

    const/4 v2, 0x0

    goto :goto_1d

    :cond_1d
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_1d
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1050
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->non_item_total:Ljava/lang/Double;

    if-nez v2, :cond_1e

    const/4 v2, 0x0

    goto :goto_1e

    :cond_1e
    invoke-virtual {v2}, Ljava/lang/Double;->hashCode()I

    move-result v2

    :goto_1e
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1052
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->offer_group_id:Ljava/lang/Long;

    if-nez v2, :cond_1f

    const/4 v2, 0x0

    goto :goto_1f

    :cond_1f
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_1f
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1054
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->offer_segment_id:Ljava/lang/Long;

    if-nez v2, :cond_20

    const/4 v2, 0x0

    goto :goto_20

    :cond_20
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_20
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1056
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->offer_type:Ljava/lang/String;

    if-nez v2, :cond_21

    const/4 v2, 0x0

    goto :goto_21

    :cond_21
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_21
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1058
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->old_value:Ljava/lang/String;

    if-nez v2, :cond_22

    const/4 v2, 0x0

    goto :goto_22

    :cond_22
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_22
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1060
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->pending:Ljava/lang/Boolean;

    if-nez v2, :cond_23

    const/4 v2, 0x0

    goto :goto_23

    :cond_23
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_23
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1062
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->percent_back:Ljava/lang/Double;

    if-nez v2, :cond_24

    const/4 v2, 0x0

    goto :goto_24

    :cond_24
    invoke-virtual {v2}, Ljava/lang/Double;->hashCode()I

    move-result v2

    :goto_24
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1064
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->percent_back_max:Ljava/lang/Double;

    if-nez v2, :cond_25

    const/4 v2, 0x0

    goto :goto_25

    :cond_25
    invoke-virtual {v2}, Ljava/lang/Double;->hashCode()I

    move-result v2

    :goto_25
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1066
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->preselect:Ljava/lang/Boolean;

    if-nez v2, :cond_26

    const/4 v2, 0x0

    goto :goto_26

    :cond_26
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_26
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1068
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->products:Ljava/util/List;

    if-nez v2, :cond_27

    const/4 v2, 0x0

    goto :goto_27

    :cond_27
    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    :goto_27
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1070
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->product_groups:Ljava/util/List;

    if-nez v2, :cond_28

    const/4 v2, 0x0

    goto :goto_28

    :cond_28
    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    :goto_28
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1072
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->purchase_type:Ljava/lang/String;

    if-nez v2, :cond_29

    const/4 v2, 0x0

    goto :goto_29

    :cond_29
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_29
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1074
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->random_weight:Ljava/lang/Boolean;

    if-nez v2, :cond_2a

    const/4 v2, 0x0

    goto :goto_2a

    :cond_2a
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_2a
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1076
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->random_weight_total:Ljava/lang/Double;

    if-nez v2, :cond_2b

    const/4 v2, 0x0

    goto :goto_2b

    :cond_2b
    invoke-virtual {v2}, Ljava/lang/Double;->hashCode()I

    move-result v2

    :goto_2b
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1078
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->redemption_max:Ljava/lang/Long;

    if-nez v2, :cond_2c

    const/4 v2, 0x0

    goto :goto_2c

    :cond_2c
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_2c
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1080
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->retailers:Ljava/util/List;

    if-nez v2, :cond_2d

    const/4 v2, 0x0

    goto :goto_2d

    :cond_2d
    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    :goto_2d
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1082
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->retailer_exclusive:Ljava/lang/Boolean;

    if-nez v2, :cond_2e

    const/4 v2, 0x0

    goto :goto_2e

    :cond_2e
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_2e
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1084
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->rewards:Ljava/util/List;

    if-nez v2, :cond_2f

    const/4 v2, 0x0

    goto :goto_2f

    :cond_2f
    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    :goto_2f
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1086
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->score:Ljava/lang/Double;

    if-nez v2, :cond_30

    const/4 v2, 0x0

    goto :goto_30

    :cond_30
    invoke-virtual {v2}, Ljava/lang/Double;->hashCode()I

    move-result v2

    :goto_30
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1088
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->segment_id:Ljava/lang/Long;

    if-nez v2, :cond_31

    const/4 v2, 0x0

    goto :goto_31

    :cond_31
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_31
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1090
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->self_funded:Ljava/lang/Boolean;

    if-nez v2, :cond_32

    const/4 v2, 0x0

    goto :goto_32

    :cond_32
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_32
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1092
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->share_url:Ljava/lang/String;

    if-nez v2, :cond_33

    const/4 v2, 0x0

    goto :goto_33

    :cond_33
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_33
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1094
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->sort_order:Ljava/lang/String;

    if-nez v2, :cond_34

    const/4 v2, 0x0

    goto :goto_34

    :cond_34
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_34
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1096
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->start_time:Ljava/lang/String;

    if-nez v2, :cond_35

    const/4 v2, 0x0

    goto :goto_35

    :cond_35
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_35
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1098
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->terms:Ljava/lang/String;

    if-nez v2, :cond_36

    const/4 v2, 0x0

    goto :goto_36

    :cond_36
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_36
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1100
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->thumb_url:Ljava/lang/String;

    if-nez v2, :cond_37

    const/4 v2, 0x0

    goto :goto_37

    :cond_37
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_37
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1102
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->total_likes:Ljava/lang/Long;

    if-nez v2, :cond_38

    const/4 v2, 0x0

    goto :goto_38

    :cond_38
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_38
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1104
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->type:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1106
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->typed_id:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1108
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->url:Ljava/lang/String;

    if-nez v2, :cond_39

    const/4 v2, 0x0

    goto :goto_39

    :cond_39
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_39
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1110
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->variable_percent_back:Ljava/lang/String;

    if-nez v2, :cond_3a

    const/4 v2, 0x0

    goto :goto_3a

    :cond_3a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3a
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 1112
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->verified:Ljava/lang/Boolean;

    if-nez v1, :cond_3b

    goto :goto_3b

    :cond_3b
    invoke-virtual {v1}, Ljava/lang/Boolean;->hashCode()I

    move-result v3

    :goto_3b
    xor-int/2addr v0, v3

    .line 1113
    iput v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$hashCode:I

    const/4 v0, 0x1

    .line 1114
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$hashCodeMemoized:Z

    .line 1116
    :cond_3c
    iget v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$hashCode:I

    return v0
.end method

.method public hide_available_at()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 513
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->hide_available_at:Ljava/lang/Boolean;

    return-object v0
.end method

.method public id()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 520
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->id:Ljava/lang/String;

    return-object v0
.end method

.method public ignore_barcode()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 524
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->ignore_barcode:Ljava/lang/Boolean;

    return-object v0
.end method

.method public large_url()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 528
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->large_url:Ljava/lang/String;

    return-object v0
.end method

.method public legal()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 532
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->legal:Ljava/lang/String;

    return-object v0
.end method

.method public liked()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 536
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->liked:Ljava/lang/Boolean;

    return-object v0
.end method

.method public link()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 540
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->link:Ljava/lang/String;

    return-object v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 722
    new-instance v0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;-><init>(Lcom/ibotta/android/graphql/fragment/OfferFragment;)V

    return-object v0
.end method

.method public multiples()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 544
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->multiples:Ljava/lang/String;

    return-object v0
.end method

.method public multiples_count()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 548
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->multiples_count:Ljava/lang/Long;

    return-object v0
.end method

.method public name()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 555
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->name:Ljava/lang/String;

    return-object v0
.end method

.method public new_flag()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 559
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->new_flag:Ljava/lang/Boolean;

    return-object v0
.end method

.method public non_item()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 563
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->non_item:Ljava/lang/Boolean;

    return-object v0
.end method

.method public non_item_total()Ljava/lang/Double;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 567
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->non_item_total:Ljava/lang/Double;

    return-object v0
.end method

.method public offer_group_id()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 571
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->offer_group_id:Ljava/lang/Long;

    return-object v0
.end method

.method public offer_segment_id()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 578
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->offer_segment_id:Ljava/lang/Long;

    return-object v0
.end method

.method public offer_type()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 582
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->offer_type:Ljava/lang/String;

    return-object v0
.end method

.method public old_value()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 590
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->old_value:Ljava/lang/String;

    return-object v0
.end method

.method public pending()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 594
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->pending:Ljava/lang/Boolean;

    return-object v0
.end method

.method public percent_back()Ljava/lang/Double;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 601
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->percent_back:Ljava/lang/Double;

    return-object v0
.end method

.method public percent_back_max()Ljava/lang/Double;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 610
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->percent_back_max:Ljava/lang/Double;

    return-object v0
.end method

.method public preselect()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 617
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->preselect:Ljava/lang/Boolean;

    return-object v0
.end method

.method public product_groups()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 625
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->product_groups:Ljava/util/List;

    return-object v0
.end method

.method public products()Ljava/util/List;
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

    .line 621
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->products:Ljava/util/List;

    return-object v0
.end method

.method public purchase_type()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 629
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->purchase_type:Ljava/lang/String;

    return-object v0
.end method

.method public random_weight()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 633
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->random_weight:Ljava/lang/Boolean;

    return-object v0
.end method

.method public random_weight_total()Ljava/lang/Double;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 637
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->random_weight_total:Ljava/lang/Double;

    return-object v0
.end method

.method public redemption_max()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 641
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->redemption_max:Ljava/lang/Long;

    return-object v0
.end method

.method public retailer_exclusive()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 652
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->retailer_exclusive:Ljava/lang/Boolean;

    return-object v0
.end method

.method public retailers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 648
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->retailers:Ljava/util/List;

    return-object v0
.end method

.method public rewards()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/OfferFragment$Reward;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 656
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->rewards:Ljava/util/List;

    return-object v0
.end method

.method public score()Ljava/lang/Double;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 660
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->score:Ljava/lang/Double;

    return-object v0
.end method

.method public segment_id()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 667
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->segment_id:Ljava/lang/Long;

    return-object v0
.end method

.method public self_funded()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 671
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->self_funded:Ljava/lang/Boolean;

    return-object v0
.end method

.method public share_url()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 675
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->share_url:Ljava/lang/String;

    return-object v0
.end method

.method public sort_order()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 679
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->sort_order:Ljava/lang/String;

    return-object v0
.end method

.method public start_time()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 683
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->start_time:Ljava/lang/String;

    return-object v0
.end method

.method public terms()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 687
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->terms:Ljava/lang/String;

    return-object v0
.end method

.method public thumb_url()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 691
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->thumb_url:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 831
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 832
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OfferFragment{__typename="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", about="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->about:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", about_title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->about_title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", activated="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->activated:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", alternate_text="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->alternate_text:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", amount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->amount:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", any_brand="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->any_brand:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", available_at="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->available_at:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", block_customer_submitted_upcs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->block_customer_submitted_upcs:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bonuses="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->bonuses:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", button_info_map="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->button_info_map:Lcom/ibotta/android/graphql/fragment/OfferFragment$Button_info_map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cache_key="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->cache_key:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", caption="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->caption:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", categories="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->categories:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", combo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->combo:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", combo_count="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->combo_count:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", current_value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->current_value:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->description:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", end_time="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->end_time:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", expiration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->expiration:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", expiring_soon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->expiring_soon:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hide_available_at="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->hide_available_at:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", ignore_barcode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->ignore_barcode:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", large_url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->large_url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", legal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->legal:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", liked="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->liked:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", link="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->link:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", multiples="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->multiples:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", multiples_count="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->multiples_count:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", new_flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->new_flag:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", non_item="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->non_item:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", non_item_total="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->non_item_total:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", offer_group_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->offer_group_id:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", offer_segment_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->offer_segment_id:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", offer_type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->offer_type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", old_value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->old_value:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", pending="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->pending:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", percent_back="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->percent_back:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", percent_back_max="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->percent_back_max:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", preselect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->preselect:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", products="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->products:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", product_groups="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->product_groups:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", purchase_type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->purchase_type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", random_weight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->random_weight:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", random_weight_total="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->random_weight_total:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", redemption_max="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->redemption_max:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retailers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->retailers:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retailer_exclusive="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->retailer_exclusive:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rewards="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->rewards:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", score="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->score:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", segment_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->segment_id:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", self_funded="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->self_funded:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", share_url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->share_url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sort_order="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->sort_order:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", start_time="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->start_time:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", terms="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->terms:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", thumb_url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->thumb_url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", total_likes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->total_likes:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", typed_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->typed_id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", variable_percent_back="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->variable_percent_back:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", verified="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->verified:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$toString:Ljava/lang/String;

    .line 900
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$toString:Ljava/lang/String;

    return-object v0
.end method

.method public total_likes()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 695
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->total_likes:Ljava/lang/Long;

    return-object v0
.end method

.method public type()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 702
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->type:Ljava/lang/String;

    return-object v0
.end method

.method public typed_id()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 706
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->typed_id:Ljava/lang/String;

    return-object v0
.end method

.method public url()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 710
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->url:Ljava/lang/String;

    return-object v0
.end method

.method public variable_percent_back()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 714
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->variable_percent_back:Ljava/lang/String;

    return-object v0
.end method

.method public verified()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 718
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->verified:Ljava/lang/Boolean;

    return-object v0
.end method
