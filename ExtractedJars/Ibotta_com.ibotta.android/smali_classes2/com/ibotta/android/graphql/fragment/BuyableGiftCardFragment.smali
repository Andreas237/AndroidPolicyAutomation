.class public Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;
.super Ljava/lang/Object;
.source "BuyableGiftCardFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/GraphqlFragment;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer;,
        Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;

.field public static final FRAGMENT_DEFINITION:Ljava/lang/String; = "fragment BuyableGiftCardFragment on BuyableGiftCard {\n  __typename\n  cache_key\n  description\n  end_time\n  id\n  image_url\n  launch\n  link\n  max_purchase_amount\n  min_purchase_amount\n  name\n  pre_configured_denominations\n  retailer {\n    __typename\n    ...RetailerFragment\n  }\n  retailer_id\n  retailer_sku\n  reward_percentage\n  sort_order\n  start_time\n  terms\n  type\n  typed_id\n}"

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

.field final cache_key:Ljava/lang/String;
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

.field final id:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field final image_url:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final launch:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final link:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final max_purchase_amount:Ljava/lang/Double;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final min_purchase_amount:Ljava/lang/Double;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final name:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field final pre_configured_denominations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final retailer:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final retailer_id:Ljava/lang/Long;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final retailer_sku:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final reward_percentage:Ljava/lang/Double;
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

.field final type:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field final typed_id:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 13

    const/16 v0, 0x15

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

    const-string v1, "cache_key"

    const-string v2, "cache_key"

    .line 29
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v6, 0x1

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v6

    const-string v1, "description"

    const-string v2, "description"

    .line 30
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "end_time"

    const-string v2, "end_time"

    .line 31
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v7, "id"

    const-string v8, "id"

    sget-object v11, Lcom/ibotta/android/graphql/type/CustomType;->ID:Lcom/ibotta/android/graphql/type/CustomType;

    .line 32
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v12

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lcom/apollographql/apollo/api/ResponseField;->forCustomType(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLcom/apollographql/apollo/api/ScalarType;Ljava/util/List;)Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "image_url"

    const-string v2, "image_url"

    .line 33
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "launch"

    const-string v2, "launch"

    .line 34
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "link"

    const-string v2, "link"

    .line 35
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "max_purchase_amount"

    const-string v2, "max_purchase_amount"

    .line 36
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forDouble(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "min_purchase_amount"

    const-string v2, "min_purchase_amount"

    .line 37
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forDouble(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "name"

    const-string v2, "name"

    .line 38
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "pre_configured_denominations"

    const-string v2, "pre_configured_denominations"

    .line 39
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "retailer"

    const-string v2, "retailer"

    .line 40
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forObject(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "retailer_id"

    const-string v2, "retailer_id"

    .line 41
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forLong(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "retailer_sku"

    const-string v2, "retailer_sku"

    .line 42
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "reward_percentage"

    const-string v2, "reward_percentage"

    .line 43
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forDouble(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const-string v1, "sort_order"

    const-string v2, "sort_order"

    .line 44
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x10

    aput-object v1, v0, v2

    const-string v1, "start_time"

    const-string v2, "start_time"

    .line 45
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x11

    aput-object v1, v0, v2

    const-string v1, "terms"

    const-string v2, "terms"

    .line 46
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x12

    aput-object v1, v0, v2

    const-string v1, "type"

    const-string v2, "type"

    .line 47
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x13

    aput-object v1, v0, v2

    const-string v1, "typed_id"

    const-string v2, "typed_id"

    .line 48
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x14

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const-string v0, "BuyableGiftCard"

    .line 78
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->POSSIBLE_TYPES:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
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
    .param p4    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
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
    .param p9    # Ljava/lang/Double;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p10    # Ljava/lang/Double;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p11    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p12    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p13    # Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p14    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p15    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p16    # Ljava/lang/Double;
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
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p21    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;",
            "Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "__typename == null"

    move-object v2, p1

    .line 136
    invoke-static {p1, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->__typename:Ljava/lang/String;

    move-object v1, p2

    .line 137
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->cache_key:Ljava/lang/String;

    move-object v1, p3

    .line 138
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->description:Ljava/lang/String;

    move-object v1, p4

    .line 139
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->end_time:Ljava/lang/String;

    const-string v1, "id == null"

    move-object v2, p5

    .line 140
    invoke-static {p5, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->id:Ljava/lang/String;

    move-object v1, p6

    .line 141
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->image_url:Ljava/lang/String;

    move-object v1, p7

    .line 142
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->launch:Ljava/lang/Boolean;

    move-object v1, p8

    .line 143
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->link:Ljava/lang/String;

    move-object v1, p9

    .line 144
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->max_purchase_amount:Ljava/lang/Double;

    move-object v1, p10

    .line 145
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->min_purchase_amount:Ljava/lang/Double;

    const-string v1, "name == null"

    move-object v2, p11

    .line 146
    invoke-static {p11, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->name:Ljava/lang/String;

    move-object v1, p12

    .line 147
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->pre_configured_denominations:Ljava/util/List;

    move-object/from16 v1, p13

    .line 148
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->retailer:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer;

    move-object/from16 v1, p14

    .line 149
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->retailer_id:Ljava/lang/Long;

    move-object/from16 v1, p15

    .line 150
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->retailer_sku:Ljava/lang/String;

    move-object/from16 v1, p16

    .line 151
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->reward_percentage:Ljava/lang/Double;

    move-object/from16 v1, p17

    .line 152
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->sort_order:Ljava/lang/String;

    move-object/from16 v1, p18

    .line 153
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->start_time:Ljava/lang/String;

    move-object/from16 v1, p19

    .line 154
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->terms:Ljava/lang/String;

    const-string v1, "type == null"

    move-object/from16 v2, p20

    .line 155
    invoke-static {v2, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->type:Ljava/lang/String;

    const-string v1, "typed_id == null"

    move-object/from16 v2, p21

    .line 156
    invoke-static {v2, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->typed_id:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public __typename()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->__typename:Ljava/lang/String;

    return-object v0
.end method

.method public cache_key()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 164
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->cache_key:Ljava/lang/String;

    return-object v0
.end method

.method public description()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 168
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->description:Ljava/lang/String;

    return-object v0
.end method

.method public end_time()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->end_time:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 324
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    const/4 v2, 0x0

    if-eqz v1, :cond_12

    .line 325
    check-cast p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    .line 326
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->__typename:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->cache_key:Ljava/lang/String;

    if-nez v1, :cond_1

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->cache_key:Ljava/lang/String;

    if-nez v1, :cond_11

    goto :goto_0

    :cond_1
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->cache_key:Ljava/lang/String;

    .line 327
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->description:Ljava/lang/String;

    if-nez v1, :cond_2

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->description:Ljava/lang/String;

    if-nez v1, :cond_11

    goto :goto_1

    :cond_2
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->description:Ljava/lang/String;

    .line 328
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->end_time:Ljava/lang/String;

    if-nez v1, :cond_3

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->end_time:Ljava/lang/String;

    if-nez v1, :cond_11

    goto :goto_2

    :cond_3
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->end_time:Ljava/lang/String;

    .line 329
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    :goto_2
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->id:Ljava/lang/String;

    .line 330
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->image_url:Ljava/lang/String;

    if-nez v1, :cond_4

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->image_url:Ljava/lang/String;

    if-nez v1, :cond_11

    goto :goto_3

    :cond_4
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->image_url:Ljava/lang/String;

    .line 331
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    :goto_3
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->launch:Ljava/lang/Boolean;

    if-nez v1, :cond_5

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->launch:Ljava/lang/Boolean;

    if-nez v1, :cond_11

    goto :goto_4

    :cond_5
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->launch:Ljava/lang/Boolean;

    .line 332
    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    :goto_4
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->link:Ljava/lang/String;

    if-nez v1, :cond_6

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->link:Ljava/lang/String;

    if-nez v1, :cond_11

    goto :goto_5

    :cond_6
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->link:Ljava/lang/String;

    .line 333
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    :goto_5
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->max_purchase_amount:Ljava/lang/Double;

    if-nez v1, :cond_7

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->max_purchase_amount:Ljava/lang/Double;

    if-nez v1, :cond_11

    goto :goto_6

    :cond_7
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->max_purchase_amount:Ljava/lang/Double;

    .line 334
    invoke-virtual {v1, v3}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    :goto_6
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->min_purchase_amount:Ljava/lang/Double;

    if-nez v1, :cond_8

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->min_purchase_amount:Ljava/lang/Double;

    if-nez v1, :cond_11

    goto :goto_7

    :cond_8
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->min_purchase_amount:Ljava/lang/Double;

    .line 335
    invoke-virtual {v1, v3}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    :goto_7
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->name:Ljava/lang/String;

    .line 336
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->pre_configured_denominations:Ljava/util/List;

    if-nez v1, :cond_9

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->pre_configured_denominations:Ljava/util/List;

    if-nez v1, :cond_11

    goto :goto_8

    :cond_9
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->pre_configured_denominations:Ljava/util/List;

    .line 337
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    :goto_8
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->retailer:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer;

    if-nez v1, :cond_a

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->retailer:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer;

    if-nez v1, :cond_11

    goto :goto_9

    :cond_a
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->retailer:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer;

    .line 338
    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    :goto_9
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->retailer_id:Ljava/lang/Long;

    if-nez v1, :cond_b

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->retailer_id:Ljava/lang/Long;

    if-nez v1, :cond_11

    goto :goto_a

    :cond_b
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->retailer_id:Ljava/lang/Long;

    .line 339
    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    :goto_a
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->retailer_sku:Ljava/lang/String;

    if-nez v1, :cond_c

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->retailer_sku:Ljava/lang/String;

    if-nez v1, :cond_11

    goto :goto_b

    :cond_c
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->retailer_sku:Ljava/lang/String;

    .line 340
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    :goto_b
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->reward_percentage:Ljava/lang/Double;

    if-nez v1, :cond_d

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->reward_percentage:Ljava/lang/Double;

    if-nez v1, :cond_11

    goto :goto_c

    :cond_d
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->reward_percentage:Ljava/lang/Double;

    .line 341
    invoke-virtual {v1, v3}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    :goto_c
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->sort_order:Ljava/lang/String;

    if-nez v1, :cond_e

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->sort_order:Ljava/lang/String;

    if-nez v1, :cond_11

    goto :goto_d

    :cond_e
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->sort_order:Ljava/lang/String;

    .line 342
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    :goto_d
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->start_time:Ljava/lang/String;

    if-nez v1, :cond_f

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->start_time:Ljava/lang/String;

    if-nez v1, :cond_11

    goto :goto_e

    :cond_f
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->start_time:Ljava/lang/String;

    .line 343
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    :goto_e
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->terms:Ljava/lang/String;

    if-nez v1, :cond_10

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->terms:Ljava/lang/String;

    if-nez v1, :cond_11

    goto :goto_f

    :cond_10
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->terms:Ljava/lang/String;

    .line 344
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    :goto_f
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->type:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->type:Ljava/lang/String;

    .line 345
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->typed_id:Ljava/lang/String;

    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->typed_id:Ljava/lang/String;

    .line 346
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_11

    goto :goto_10

    :cond_11
    const/4 v0, 0x0

    :goto_10
    return v0

    :cond_12
    return v2
.end method

.method public hashCode()I
    .locals 4

    .line 353
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$hashCodeMemoized:Z

    if-nez v0, :cond_10

    .line 356
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 358
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->cache_key:Ljava/lang/String;

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

    .line 360
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->description:Ljava/lang/String;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 362
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->end_time:Ljava/lang/String;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 364
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->id:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 366
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->image_url:Ljava/lang/String;

    if-nez v2, :cond_3

    const/4 v2, 0x0

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 368
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->launch:Ljava/lang/Boolean;

    if-nez v2, :cond_4

    const/4 v2, 0x0

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_4
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 370
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->link:Ljava/lang/String;

    if-nez v2, :cond_5

    const/4 v2, 0x0

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 372
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->max_purchase_amount:Ljava/lang/Double;

    if-nez v2, :cond_6

    const/4 v2, 0x0

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Double;->hashCode()I

    move-result v2

    :goto_6
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 374
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->min_purchase_amount:Ljava/lang/Double;

    if-nez v2, :cond_7

    const/4 v2, 0x0

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Double;->hashCode()I

    move-result v2

    :goto_7
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 376
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->name:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 378
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->pre_configured_denominations:Ljava/util/List;

    if-nez v2, :cond_8

    const/4 v2, 0x0

    goto :goto_8

    :cond_8
    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    :goto_8
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 380
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->retailer:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer;

    if-nez v2, :cond_9

    const/4 v2, 0x0

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer;->hashCode()I

    move-result v2

    :goto_9
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 382
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->retailer_id:Ljava/lang/Long;

    if-nez v2, :cond_a

    const/4 v2, 0x0

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_a
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 384
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->retailer_sku:Ljava/lang/String;

    if-nez v2, :cond_b

    const/4 v2, 0x0

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_b
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 386
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->reward_percentage:Ljava/lang/Double;

    if-nez v2, :cond_c

    const/4 v2, 0x0

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Ljava/lang/Double;->hashCode()I

    move-result v2

    :goto_c
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 388
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->sort_order:Ljava/lang/String;

    if-nez v2, :cond_d

    const/4 v2, 0x0

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_d
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 390
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->start_time:Ljava/lang/String;

    if-nez v2, :cond_e

    const/4 v2, 0x0

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_e
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 392
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->terms:Ljava/lang/String;

    if-nez v2, :cond_f

    goto :goto_f

    :cond_f
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_f
    xor-int/2addr v0, v3

    mul-int v0, v0, v1

    .line 394
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->type:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 396
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->typed_id:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    .line 397
    iput v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$hashCode:I

    const/4 v0, 0x1

    .line 398
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$hashCodeMemoized:Z

    .line 400
    :cond_10
    iget v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$hashCode:I

    return v0
.end method

.method public id()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 176
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->id:Ljava/lang/String;

    return-object v0
.end method

.method public image_url()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 180
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->image_url:Ljava/lang/String;

    return-object v0
.end method

.method public launch()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 187
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->launch:Ljava/lang/Boolean;

    return-object v0
.end method

.method public link()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->link:Ljava/lang/String;

    return-object v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 256
    new-instance v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$1;-><init>(Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;)V

    return-object v0
.end method

.method public max_purchase_amount()Ljava/lang/Double;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 198
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->max_purchase_amount:Ljava/lang/Double;

    return-object v0
.end method

.method public min_purchase_amount()Ljava/lang/Double;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 205
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->min_purchase_amount:Ljava/lang/Double;

    return-object v0
.end method

.method public name()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 209
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->name:Ljava/lang/String;

    return-object v0
.end method

.method public pre_configured_denominations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 213
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->pre_configured_denominations:Ljava/util/List;

    return-object v0
.end method

.method public retailer()Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 217
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->retailer:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer;

    return-object v0
.end method

.method public retailer_id()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 221
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->retailer_id:Ljava/lang/Long;

    return-object v0
.end method

.method public retailer_sku()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 225
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->retailer_sku:Ljava/lang/String;

    return-object v0
.end method

.method public reward_percentage()Ljava/lang/Double;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 232
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->reward_percentage:Ljava/lang/Double;

    return-object v0
.end method

.method public sort_order()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 236
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->sort_order:Ljava/lang/String;

    return-object v0
.end method

.method public start_time()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 240
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->start_time:Ljava/lang/String;

    return-object v0
.end method

.method public terms()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 244
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->terms:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 291
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 292
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BuyableGiftCardFragment{__typename="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", cache_key="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->cache_key:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->description:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", end_time="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->end_time:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", image_url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->image_url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", launch="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->launch:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", link="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->link:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", max_purchase_amount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->max_purchase_amount:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", min_purchase_amount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->min_purchase_amount:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", pre_configured_denominations="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->pre_configured_denominations:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retailer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->retailer:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retailer_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->retailer_id:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retailer_sku="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->retailer_sku:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", reward_percentage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->reward_percentage:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sort_order="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->sort_order:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", start_time="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->start_time:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", terms="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->terms:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", typed_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->typed_id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$toString:Ljava/lang/String;

    .line 316
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$toString:Ljava/lang/String;

    return-object v0
.end method

.method public type()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 248
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->type:Ljava/lang/String;

    return-object v0
.end method

.method public typed_id()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 252
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->typed_id:Ljava/lang/String;

    return-object v0
.end method
