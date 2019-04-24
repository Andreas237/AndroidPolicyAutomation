.class public Lcom/ibotta/android/graphql/fragment/BonusFragment;
.super Ljava/lang/Object;
.source "BonusFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/GraphqlFragment;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/fragment/BonusFragment$Sort_result;,
        Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest;,
        Lcom/ibotta/android/graphql/fragment/BonusFragment$Bonus_qualification;,
        Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;

.field public static final FRAGMENT_DEFINITION:Ljava/lang/String; = "fragment BonusFragment on Bonus {\n  __typename\n  active\n  amount\n  bonus_qualifications {\n    __typename\n    ...BonusQualificationFragment\n  }\n  bonus_type\n  cache_key\n  completed\n  completed_image_url\n  customer_started_time\n  description\n  elegible\n  expiration\n  id\n  level\n  link\n  locked\n  max_retailer_distance\n  name\n  offers\n  other_reward\n  percent_complete\n  progress_color\n  progress_count\n  quest {\n    __typename\n    ...QuestFragment\n  }\n  retailer_id\n  score\n  sort_order\n  sort_results {\n    __typename\n    ...SortResultFragment\n  }\n  terms\n  type\n  typed_id\n  uncompleted_image_url\n  weight\n}"

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

.field final amount:Ljava/lang/Double;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final bonus_qualifications:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/BonusFragment$Bonus_qualification;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final bonus_type:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final cache_key:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final completed:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final completed_image_url:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final customer_started_time:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final description:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final elegible:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final expiration:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final id:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field final level:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final link:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final locked:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final max_retailer_distance:Ljava/lang/Long;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final name:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field final offers:Ljava/util/List;
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

.field final other_reward:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final percent_complete:Ljava/lang/Double;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final progress_color:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final progress_count:Ljava/lang/Double;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final quest:Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final retailer_id:Ljava/lang/Long;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final score:Ljava/lang/Double;
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
            "Lcom/ibotta/android/graphql/fragment/BonusFragment$Sort_result;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final terms:Ljava/lang/String;
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

.field final uncompleted_image_url:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final weight:Ljava/lang/Double;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 13

    const/16 v0, 0x21

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

    const-string v1, "active"

    const-string v2, "active"

    .line 29
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v6, 0x1

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v6

    const-string v1, "amount"

    const-string v2, "amount"

    .line 30
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forDouble(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "bonus_qualifications"

    const-string v2, "bonus_qualifications"

    .line 31
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "bonus_type"

    const-string v2, "bonus_type"

    .line 32
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "cache_key"

    const-string v2, "cache_key"

    .line 33
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "completed"

    const-string v2, "completed"

    .line 34
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "completed_image_url"

    const-string v2, "completed_image_url"

    .line 35
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "customer_started_time"

    const-string v2, "customer_started_time"

    .line 36
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "description"

    const-string v2, "description"

    .line 37
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "elegible"

    const-string v2, "elegible"

    .line 38
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "expiration"

    const-string v2, "expiration"

    .line 39
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v7, "id"

    const-string v8, "id"

    sget-object v11, Lcom/ibotta/android/graphql/type/CustomType;->ID:Lcom/ibotta/android/graphql/type/CustomType;

    .line 40
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v12

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lcom/apollographql/apollo/api/ResponseField;->forCustomType(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLcom/apollographql/apollo/api/ScalarType;Ljava/util/List;)Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    move-result-object v1

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "level"

    const-string v2, "level"

    .line 41
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "link"

    const-string v2, "link"

    .line 42
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "locked"

    const-string v2, "locked"

    .line 43
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const-string v1, "max_retailer_distance"

    const-string v2, "max_retailer_distance"

    .line 44
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forLong(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x10

    aput-object v1, v0, v2

    const-string v1, "name"

    const-string v2, "name"

    .line 45
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x11

    aput-object v1, v0, v2

    const-string v1, "offers"

    const-string v2, "offers"

    .line 46
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x12

    aput-object v1, v0, v2

    const-string v1, "other_reward"

    const-string v2, "other_reward"

    .line 47
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x13

    aput-object v1, v0, v2

    const-string v1, "percent_complete"

    const-string v2, "percent_complete"

    .line 48
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forDouble(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x14

    aput-object v1, v0, v2

    const-string v1, "progress_color"

    const-string v2, "progress_color"

    .line 49
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x15

    aput-object v1, v0, v2

    const-string v1, "progress_count"

    const-string v2, "progress_count"

    .line 50
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forDouble(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x16

    aput-object v1, v0, v2

    const-string v1, "quest"

    const-string v2, "quest"

    .line 51
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forObject(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x17

    aput-object v1, v0, v2

    const-string v1, "retailer_id"

    const-string v2, "retailer_id"

    .line 52
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forLong(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x18

    aput-object v1, v0, v2

    const-string v1, "score"

    const-string v2, "score"

    .line 53
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forDouble(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x19

    aput-object v1, v0, v2

    const-string v1, "sort_order"

    const-string v2, "sort_order"

    .line 54
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    const-string v1, "sort_results"

    const-string v2, "sort_results"

    .line 55
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    const-string v1, "terms"

    const-string v2, "terms"

    .line 56
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    const-string v1, "type"

    const-string v2, "type"

    .line 57
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    const-string v1, "typed_id"

    const-string v2, "typed_id"

    .line 58
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x1e

    aput-object v1, v0, v2

    const-string v1, "uncompleted_image_url"

    const-string v2, "uncompleted_image_url"

    .line 59
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x1f

    aput-object v1, v0, v2

    const-string v1, "weight"

    const-string v2, "weight"

    .line 60
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forDouble(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x20

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const-string v0, "Bonus"

    .line 108
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->POSSIBLE_TYPES:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Double;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p11    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p13    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p14    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p15    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p16    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p17    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p18    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p19    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p20    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p21    # Ljava/lang/Double;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p22    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p23    # Ljava/lang/Double;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p24    # Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p25    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p26    # Ljava/lang/Double;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p27    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p28    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p29    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p30    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p31    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p32    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p33    # Ljava/lang/Double;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Double;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/BonusFragment$Bonus_qualification;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            "Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest;",
            "Ljava/lang/Long;",
            "Ljava/lang/Double;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/BonusFragment$Sort_result;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    .line 193
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "__typename == null"

    move-object v2, p1

    .line 194
    invoke-static {p1, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->__typename:Ljava/lang/String;

    move-object v1, p2

    .line 195
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->active:Ljava/lang/Boolean;

    move-object v1, p3

    .line 196
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->amount:Ljava/lang/Double;

    move-object v1, p4

    .line 197
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->bonus_qualifications:Ljava/util/List;

    move-object v1, p5

    .line 198
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->bonus_type:Ljava/lang/String;

    move-object v1, p6

    .line 199
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->cache_key:Ljava/lang/String;

    move-object v1, p7

    .line 200
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->completed:Ljava/lang/Boolean;

    move-object v1, p8

    .line 201
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->completed_image_url:Ljava/lang/String;

    move-object v1, p9

    .line 202
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->customer_started_time:Ljava/lang/String;

    move-object v1, p10

    .line 203
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->description:Ljava/lang/String;

    move-object v1, p11

    .line 204
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->elegible:Ljava/lang/Boolean;

    move-object v1, p12

    .line 205
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->expiration:Ljava/lang/String;

    const-string v1, "id == null"

    move-object/from16 v2, p13

    .line 206
    invoke-static {v2, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->id:Ljava/lang/String;

    move-object/from16 v1, p14

    .line 207
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->level:Ljava/lang/String;

    move-object/from16 v1, p15

    .line 208
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->link:Ljava/lang/String;

    move-object/from16 v1, p16

    .line 209
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->locked:Ljava/lang/Boolean;

    move-object/from16 v1, p17

    .line 210
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->max_retailer_distance:Ljava/lang/Long;

    const-string v1, "name == null"

    move-object/from16 v2, p18

    .line 211
    invoke-static {v2, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->name:Ljava/lang/String;

    move-object/from16 v1, p19

    .line 212
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->offers:Ljava/util/List;

    move-object/from16 v1, p20

    .line 213
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->other_reward:Ljava/lang/String;

    move-object/from16 v1, p21

    .line 214
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->percent_complete:Ljava/lang/Double;

    move-object/from16 v1, p22

    .line 215
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->progress_color:Ljava/lang/String;

    move-object/from16 v1, p23

    .line 216
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->progress_count:Ljava/lang/Double;

    move-object/from16 v1, p24

    .line 217
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->quest:Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest;

    move-object/from16 v1, p25

    .line 218
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->retailer_id:Ljava/lang/Long;

    move-object/from16 v1, p26

    .line 219
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->score:Ljava/lang/Double;

    move-object/from16 v1, p27

    .line 220
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->sort_order:Ljava/lang/String;

    move-object/from16 v1, p28

    .line 221
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->sort_results:Ljava/util/List;

    move-object/from16 v1, p29

    .line 222
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->terms:Ljava/lang/String;

    const-string v1, "type == null"

    move-object/from16 v2, p30

    .line 223
    invoke-static {v2, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->type:Ljava/lang/String;

    const-string v1, "typed_id == null"

    move-object/from16 v2, p31

    .line 224
    invoke-static {v2, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->typed_id:Ljava/lang/String;

    move-object/from16 v1, p32

    .line 225
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->uncompleted_image_url:Ljava/lang/String;

    move-object/from16 v1, p33

    .line 226
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->weight:Ljava/lang/Double;

    return-void
.end method


# virtual methods
.method public __typename()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 230
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->__typename:Ljava/lang/String;

    return-object v0
.end method

.method public active()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 234
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->active:Ljava/lang/Boolean;

    return-object v0
.end method

.method public amount()Ljava/lang/Double;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 242
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->amount:Ljava/lang/Double;

    return-object v0
.end method

.method public bonus_qualifications()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/BonusFragment$Bonus_qualification;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 246
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->bonus_qualifications:Ljava/util/List;

    return-object v0
.end method

.method public bonus_type()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 250
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->bonus_type:Ljava/lang/String;

    return-object v0
.end method

.method public cache_key()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 254
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->cache_key:Ljava/lang/String;

    return-object v0
.end method

.method public completed()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 261
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->completed:Ljava/lang/Boolean;

    return-object v0
.end method

.method public completed_image_url()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 268
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->completed_image_url:Ljava/lang/String;

    return-object v0
.end method

.method public customer_started_time()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 275
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->customer_started_time:Ljava/lang/String;

    return-object v0
.end method

.method public description()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 283
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->description:Ljava/lang/String;

    return-object v0
.end method

.method public elegible()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 287
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->elegible:Ljava/lang/Boolean;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 511
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;

    const/4 v2, 0x0

    if-eqz v1, :cond_1e

    .line 512
    check-cast p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;

    .line 513
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->__typename:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->active:Ljava/lang/Boolean;

    if-nez v1, :cond_1

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->active:Ljava/lang/Boolean;

    if-nez v1, :cond_1d

    goto :goto_0

    :cond_1
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->active:Ljava/lang/Boolean;

    .line 514
    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->amount:Ljava/lang/Double;

    if-nez v1, :cond_2

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->amount:Ljava/lang/Double;

    if-nez v1, :cond_1d

    goto :goto_1

    :cond_2
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->amount:Ljava/lang/Double;

    .line 515
    invoke-virtual {v1, v3}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->bonus_qualifications:Ljava/util/List;

    if-nez v1, :cond_3

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->bonus_qualifications:Ljava/util/List;

    if-nez v1, :cond_1d

    goto :goto_2

    :cond_3
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->bonus_qualifications:Ljava/util/List;

    .line 516
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    :goto_2
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->bonus_type:Ljava/lang/String;

    if-nez v1, :cond_4

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->bonus_type:Ljava/lang/String;

    if-nez v1, :cond_1d

    goto :goto_3

    :cond_4
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->bonus_type:Ljava/lang/String;

    .line 517
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    :goto_3
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->cache_key:Ljava/lang/String;

    if-nez v1, :cond_5

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->cache_key:Ljava/lang/String;

    if-nez v1, :cond_1d

    goto :goto_4

    :cond_5
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->cache_key:Ljava/lang/String;

    .line 518
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    :goto_4
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->completed:Ljava/lang/Boolean;

    if-nez v1, :cond_6

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->completed:Ljava/lang/Boolean;

    if-nez v1, :cond_1d

    goto :goto_5

    :cond_6
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->completed:Ljava/lang/Boolean;

    .line 519
    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    :goto_5
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->completed_image_url:Ljava/lang/String;

    if-nez v1, :cond_7

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->completed_image_url:Ljava/lang/String;

    if-nez v1, :cond_1d

    goto :goto_6

    :cond_7
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->completed_image_url:Ljava/lang/String;

    .line 520
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    :goto_6
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->customer_started_time:Ljava/lang/String;

    if-nez v1, :cond_8

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->customer_started_time:Ljava/lang/String;

    if-nez v1, :cond_1d

    goto :goto_7

    :cond_8
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->customer_started_time:Ljava/lang/String;

    .line 521
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    :goto_7
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->description:Ljava/lang/String;

    if-nez v1, :cond_9

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->description:Ljava/lang/String;

    if-nez v1, :cond_1d

    goto :goto_8

    :cond_9
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->description:Ljava/lang/String;

    .line 522
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    :goto_8
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->elegible:Ljava/lang/Boolean;

    if-nez v1, :cond_a

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->elegible:Ljava/lang/Boolean;

    if-nez v1, :cond_1d

    goto :goto_9

    :cond_a
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->elegible:Ljava/lang/Boolean;

    .line 523
    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    :goto_9
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->expiration:Ljava/lang/String;

    if-nez v1, :cond_b

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->expiration:Ljava/lang/String;

    if-nez v1, :cond_1d

    goto :goto_a

    :cond_b
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->expiration:Ljava/lang/String;

    .line 524
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    :goto_a
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->id:Ljava/lang/String;

    .line 525
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->level:Ljava/lang/String;

    if-nez v1, :cond_c

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->level:Ljava/lang/String;

    if-nez v1, :cond_1d

    goto :goto_b

    :cond_c
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->level:Ljava/lang/String;

    .line 526
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    :goto_b
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->link:Ljava/lang/String;

    if-nez v1, :cond_d

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->link:Ljava/lang/String;

    if-nez v1, :cond_1d

    goto :goto_c

    :cond_d
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->link:Ljava/lang/String;

    .line 527
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    :goto_c
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->locked:Ljava/lang/Boolean;

    if-nez v1, :cond_e

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->locked:Ljava/lang/Boolean;

    if-nez v1, :cond_1d

    goto :goto_d

    :cond_e
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->locked:Ljava/lang/Boolean;

    .line 528
    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    :goto_d
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->max_retailer_distance:Ljava/lang/Long;

    if-nez v1, :cond_f

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->max_retailer_distance:Ljava/lang/Long;

    if-nez v1, :cond_1d

    goto :goto_e

    :cond_f
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->max_retailer_distance:Ljava/lang/Long;

    .line 529
    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    :goto_e
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->name:Ljava/lang/String;

    .line 530
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->offers:Ljava/util/List;

    if-nez v1, :cond_10

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->offers:Ljava/util/List;

    if-nez v1, :cond_1d

    goto :goto_f

    :cond_10
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->offers:Ljava/util/List;

    .line 531
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    :goto_f
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->other_reward:Ljava/lang/String;

    if-nez v1, :cond_11

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->other_reward:Ljava/lang/String;

    if-nez v1, :cond_1d

    goto :goto_10

    :cond_11
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->other_reward:Ljava/lang/String;

    .line 532
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    :goto_10
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->percent_complete:Ljava/lang/Double;

    if-nez v1, :cond_12

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->percent_complete:Ljava/lang/Double;

    if-nez v1, :cond_1d

    goto :goto_11

    :cond_12
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->percent_complete:Ljava/lang/Double;

    .line 533
    invoke-virtual {v1, v3}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    :goto_11
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->progress_color:Ljava/lang/String;

    if-nez v1, :cond_13

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->progress_color:Ljava/lang/String;

    if-nez v1, :cond_1d

    goto :goto_12

    :cond_13
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->progress_color:Ljava/lang/String;

    .line 534
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    :goto_12
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->progress_count:Ljava/lang/Double;

    if-nez v1, :cond_14

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->progress_count:Ljava/lang/Double;

    if-nez v1, :cond_1d

    goto :goto_13

    :cond_14
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->progress_count:Ljava/lang/Double;

    .line 535
    invoke-virtual {v1, v3}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    :goto_13
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->quest:Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest;

    if-nez v1, :cond_15

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->quest:Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest;

    if-nez v1, :cond_1d

    goto :goto_14

    :cond_15
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->quest:Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest;

    .line 536
    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    :goto_14
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->retailer_id:Ljava/lang/Long;

    if-nez v1, :cond_16

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->retailer_id:Ljava/lang/Long;

    if-nez v1, :cond_1d

    goto :goto_15

    :cond_16
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->retailer_id:Ljava/lang/Long;

    .line 537
    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    :goto_15
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->score:Ljava/lang/Double;

    if-nez v1, :cond_17

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->score:Ljava/lang/Double;

    if-nez v1, :cond_1d

    goto :goto_16

    :cond_17
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->score:Ljava/lang/Double;

    .line 538
    invoke-virtual {v1, v3}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    :goto_16
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->sort_order:Ljava/lang/String;

    if-nez v1, :cond_18

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->sort_order:Ljava/lang/String;

    if-nez v1, :cond_1d

    goto :goto_17

    :cond_18
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->sort_order:Ljava/lang/String;

    .line 539
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    :goto_17
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->sort_results:Ljava/util/List;

    if-nez v1, :cond_19

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->sort_results:Ljava/util/List;

    if-nez v1, :cond_1d

    goto :goto_18

    :cond_19
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->sort_results:Ljava/util/List;

    .line 540
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    :goto_18
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->terms:Ljava/lang/String;

    if-nez v1, :cond_1a

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->terms:Ljava/lang/String;

    if-nez v1, :cond_1d

    goto :goto_19

    :cond_1a
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->terms:Ljava/lang/String;

    .line 541
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    :goto_19
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->type:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->type:Ljava/lang/String;

    .line 542
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->typed_id:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->typed_id:Ljava/lang/String;

    .line 543
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->uncompleted_image_url:Ljava/lang/String;

    if-nez v1, :cond_1b

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->uncompleted_image_url:Ljava/lang/String;

    if-nez v1, :cond_1d

    goto :goto_1a

    :cond_1b
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->uncompleted_image_url:Ljava/lang/String;

    .line 544
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    :goto_1a
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->weight:Ljava/lang/Double;

    if-nez v1, :cond_1c

    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->weight:Ljava/lang/Double;

    if-nez p1, :cond_1d

    goto :goto_1b

    :cond_1c
    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->weight:Ljava/lang/Double;

    .line 545
    invoke-virtual {v1, p1}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1d

    goto :goto_1b

    :cond_1d
    const/4 v0, 0x0

    :goto_1b
    return v0

    :cond_1e
    return v2
.end method

.method public expiration()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 294
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->expiration:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 552
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$hashCodeMemoized:Z

    if-nez v0, :cond_1c

    .line 555
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 557
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->active:Ljava/lang/Boolean;

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

    .line 559
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->amount:Ljava/lang/Double;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Double;->hashCode()I

    move-result v2

    :goto_1
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 561
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->bonus_qualifications:Ljava/util/List;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    :goto_2
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 563
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->bonus_type:Ljava/lang/String;

    if-nez v2, :cond_3

    const/4 v2, 0x0

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 565
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->cache_key:Ljava/lang/String;

    if-nez v2, :cond_4

    const/4 v2, 0x0

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 567
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->completed:Ljava/lang/Boolean;

    if-nez v2, :cond_5

    const/4 v2, 0x0

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_5
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 569
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->completed_image_url:Ljava/lang/String;

    if-nez v2, :cond_6

    const/4 v2, 0x0

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 571
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->customer_started_time:Ljava/lang/String;

    if-nez v2, :cond_7

    const/4 v2, 0x0

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 573
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->description:Ljava/lang/String;

    if-nez v2, :cond_8

    const/4 v2, 0x0

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_8
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 575
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->elegible:Ljava/lang/Boolean;

    if-nez v2, :cond_9

    const/4 v2, 0x0

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_9
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 577
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->expiration:Ljava/lang/String;

    if-nez v2, :cond_a

    const/4 v2, 0x0

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_a
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 579
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->id:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 581
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->level:Ljava/lang/String;

    if-nez v2, :cond_b

    const/4 v2, 0x0

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_b
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 583
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->link:Ljava/lang/String;

    if-nez v2, :cond_c

    const/4 v2, 0x0

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_c
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 585
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->locked:Ljava/lang/Boolean;

    if-nez v2, :cond_d

    const/4 v2, 0x0

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_d
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 587
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->max_retailer_distance:Ljava/lang/Long;

    if-nez v2, :cond_e

    const/4 v2, 0x0

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_e
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 589
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->name:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 591
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->offers:Ljava/util/List;

    if-nez v2, :cond_f

    const/4 v2, 0x0

    goto :goto_f

    :cond_f
    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    :goto_f
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 593
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->other_reward:Ljava/lang/String;

    if-nez v2, :cond_10

    const/4 v2, 0x0

    goto :goto_10

    :cond_10
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_10
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 595
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->percent_complete:Ljava/lang/Double;

    if-nez v2, :cond_11

    const/4 v2, 0x0

    goto :goto_11

    :cond_11
    invoke-virtual {v2}, Ljava/lang/Double;->hashCode()I

    move-result v2

    :goto_11
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 597
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->progress_color:Ljava/lang/String;

    if-nez v2, :cond_12

    const/4 v2, 0x0

    goto :goto_12

    :cond_12
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_12
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 599
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->progress_count:Ljava/lang/Double;

    if-nez v2, :cond_13

    const/4 v2, 0x0

    goto :goto_13

    :cond_13
    invoke-virtual {v2}, Ljava/lang/Double;->hashCode()I

    move-result v2

    :goto_13
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 601
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->quest:Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest;

    if-nez v2, :cond_14

    const/4 v2, 0x0

    goto :goto_14

    :cond_14
    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest;->hashCode()I

    move-result v2

    :goto_14
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 603
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->retailer_id:Ljava/lang/Long;

    if-nez v2, :cond_15

    const/4 v2, 0x0

    goto :goto_15

    :cond_15
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_15
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 605
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->score:Ljava/lang/Double;

    if-nez v2, :cond_16

    const/4 v2, 0x0

    goto :goto_16

    :cond_16
    invoke-virtual {v2}, Ljava/lang/Double;->hashCode()I

    move-result v2

    :goto_16
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 607
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->sort_order:Ljava/lang/String;

    if-nez v2, :cond_17

    const/4 v2, 0x0

    goto :goto_17

    :cond_17
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_17
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 609
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->sort_results:Ljava/util/List;

    if-nez v2, :cond_18

    const/4 v2, 0x0

    goto :goto_18

    :cond_18
    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    :goto_18
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 611
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->terms:Ljava/lang/String;

    if-nez v2, :cond_19

    const/4 v2, 0x0

    goto :goto_19

    :cond_19
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_19
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 613
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->type:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 615
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->typed_id:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 617
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->uncompleted_image_url:Ljava/lang/String;

    if-nez v2, :cond_1a

    const/4 v2, 0x0

    goto :goto_1a

    :cond_1a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1a
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 619
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->weight:Ljava/lang/Double;

    if-nez v1, :cond_1b

    goto :goto_1b

    :cond_1b
    invoke-virtual {v1}, Ljava/lang/Double;->hashCode()I

    move-result v3

    :goto_1b
    xor-int/2addr v0, v3

    .line 620
    iput v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$hashCode:I

    const/4 v0, 0x1

    .line 621
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$hashCodeMemoized:Z

    .line 623
    :cond_1c
    iget v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$hashCode:I

    return v0
.end method

.method public id()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 301
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->id:Ljava/lang/String;

    return-object v0
.end method

.method public level()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 308
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->level:Ljava/lang/String;

    return-object v0
.end method

.method public link()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 312
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->link:Ljava/lang/String;

    return-object v0
.end method

.method public locked()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 319
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->locked:Ljava/lang/Boolean;

    return-object v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 409
    new-instance v0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;-><init>(Lcom/ibotta/android/graphql/fragment/BonusFragment;)V

    return-object v0
.end method

.method public max_retailer_distance()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 323
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->max_retailer_distance:Ljava/lang/Long;

    return-object v0
.end method

.method public name()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 330
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->name:Ljava/lang/String;

    return-object v0
.end method

.method public offers()Ljava/util/List;
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

    .line 334
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->offers:Ljava/util/List;

    return-object v0
.end method

.method public other_reward()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 341
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->other_reward:Ljava/lang/String;

    return-object v0
.end method

.method public percent_complete()Ljava/lang/Double;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 348
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->percent_complete:Ljava/lang/Double;

    return-object v0
.end method

.method public progress_color()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 352
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->progress_color:Ljava/lang/String;

    return-object v0
.end method

.method public progress_count()Ljava/lang/Double;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 356
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->progress_count:Ljava/lang/Double;

    return-object v0
.end method

.method public quest()Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 360
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->quest:Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest;

    return-object v0
.end method

.method public retailer_id()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 364
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->retailer_id:Ljava/lang/Long;

    return-object v0
.end method

.method public score()Ljava/lang/Double;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 368
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->score:Ljava/lang/Double;

    return-object v0
.end method

.method public sort_order()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 372
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->sort_order:Ljava/lang/String;

    return-object v0
.end method

.method public sort_results()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/BonusFragment$Sort_result;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 379
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->sort_results:Ljava/util/List;

    return-object v0
.end method

.method public terms()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 383
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->terms:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 466
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 467
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BonusFragment{__typename="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", active="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->active:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", amount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->amount:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bonus_qualifications="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->bonus_qualifications:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bonus_type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->bonus_type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", cache_key="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->cache_key:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", completed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->completed:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", completed_image_url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->completed_image_url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", customer_started_time="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->customer_started_time:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->description:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", elegible="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->elegible:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", expiration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->expiration:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", level="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->level:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", link="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->link:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", locked="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->locked:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", max_retailer_distance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->max_retailer_distance:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", offers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->offers:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", other_reward="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->other_reward:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", percent_complete="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->percent_complete:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", progress_color="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->progress_color:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", progress_count="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->progress_count:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", quest="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->quest:Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retailer_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->retailer_id:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", score="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->score:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sort_order="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->sort_order:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sort_results="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->sort_results:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", terms="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->terms:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", typed_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->typed_id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", uncompleted_image_url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->uncompleted_image_url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", weight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->weight:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$toString:Ljava/lang/String;

    .line 503
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$toString:Ljava/lang/String;

    return-object v0
.end method

.method public type()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 390
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->type:Ljava/lang/String;

    return-object v0
.end method

.method public typed_id()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 394
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->typed_id:Ljava/lang/String;

    return-object v0
.end method

.method public uncompleted_image_url()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 401
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->uncompleted_image_url:Ljava/lang/String;

    return-object v0
.end method

.method public weight()Ljava/lang/Double;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 405
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->weight:Ljava/lang/Double;

    return-object v0
.end method
