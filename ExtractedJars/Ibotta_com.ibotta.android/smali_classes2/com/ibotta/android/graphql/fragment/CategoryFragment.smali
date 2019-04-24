.class public Lcom/ibotta/android/graphql/fragment/CategoryFragment;
.super Ljava/lang/Object;
.source "CategoryFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/GraphqlFragment;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/fragment/CategoryFragment$Content;,
        Lcom/ibotta/android/graphql/fragment/CategoryFragment$Mapper;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;

.field public static final FRAGMENT_DEFINITION:Ljava/lang/String; = "fragment CategoryFragment on Category {\n  __typename\n  id\n  cache_key\n  category_type\n  type\n  collapsible\n  default_view_state\n  end_time\n  expiration\n  icon_url\n  image_url\n  launch\n  name\n  short_name\n  num_preview_items\n  raw_category_type\n  retailers\n  sort_order\n  start_time\n  content {\n    __typename\n    ...OfferFragment\n  }\n}"

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

.field final category_type:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final collapsible:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final content:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/CategoryFragment$Content;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final default_view_state:Ljava/lang/String;
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

.field final icon_url:Ljava/lang/String;
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

.field final name:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final num_preview_items:Ljava/lang/Long;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final raw_category_type:Ljava/lang/String;
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

.field final short_name:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final sort_order:Ljava/lang/Long;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final start_time:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final type:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v0, 0x14

    .line 26
    new-array v0, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v1, "__typename"

    const-string v2, "__typename"

    .line 27
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

    .line 28
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v11

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/apollographql/apollo/api/ResponseField;->forCustomType(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLcom/apollographql/apollo/api/ScalarType;Ljava/util/List;)Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "cache_key"

    const-string v3, "cache_key"

    .line 29
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x2

    aput-object v1, v0, v3

    const-string v1, "category_type"

    const-string v3, "category_type"

    .line 30
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x3

    aput-object v1, v0, v3

    const-string v1, "type"

    const-string v3, "type"

    .line 31
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v4, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x4

    aput-object v1, v0, v3

    const-string v1, "collapsible"

    const-string v3, "collapsible"

    .line 32
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x5

    aput-object v1, v0, v3

    const-string v1, "default_view_state"

    const-string v3, "default_view_state"

    .line 33
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x6

    aput-object v1, v0, v3

    const-string v1, "end_time"

    const-string v3, "end_time"

    .line 34
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x7

    aput-object v1, v0, v3

    const-string v1, "expiration"

    const-string v3, "expiration"

    .line 35
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x8

    aput-object v1, v0, v3

    const-string v1, "icon_url"

    const-string v3, "icon_url"

    .line 36
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x9

    aput-object v1, v0, v3

    const-string v1, "image_url"

    const-string v3, "image_url"

    .line 37
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0xa

    aput-object v1, v0, v3

    const-string v1, "launch"

    const-string v3, "launch"

    .line 38
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0xb

    aput-object v1, v0, v3

    const-string v1, "name"

    const-string v3, "name"

    .line 39
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0xc

    aput-object v1, v0, v3

    const-string v1, "short_name"

    const-string v3, "short_name"

    .line 40
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0xd

    aput-object v1, v0, v3

    const-string v1, "num_preview_items"

    const-string v3, "num_preview_items"

    .line 41
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forLong(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0xe

    aput-object v1, v0, v3

    const-string v1, "raw_category_type"

    const-string v3, "raw_category_type"

    .line 42
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0xf

    aput-object v1, v0, v3

    const-string v1, "retailers"

    const-string v3, "retailers"

    .line 43
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x10

    aput-object v1, v0, v3

    const-string v1, "sort_order"

    const-string v3, "sort_order"

    .line 44
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forLong(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x11

    aput-object v1, v0, v3

    const-string v1, "start_time"

    const-string v3, "start_time"

    .line 45
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x12

    aput-object v1, v0, v3

    const-string v1, "content"

    const-string v3, "content"

    .line 46
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const-string v0, "Category"

    .line 75
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->POSSIBLE_TYPES:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
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
    .param p6    # Ljava/lang/Boolean;
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
    .param p9    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p11    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p12    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p13    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p14    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p15    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p16    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p17    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p18    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p19    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p20    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
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
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/CategoryFragment$Content;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "__typename == null"

    move-object v2, p1

    .line 131
    invoke-static {p1, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->__typename:Ljava/lang/String;

    const-string v1, "id == null"

    move-object v2, p2

    .line 132
    invoke-static {p2, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->id:Ljava/lang/String;

    move-object v1, p3

    .line 133
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->cache_key:Ljava/lang/String;

    move-object v1, p4

    .line 134
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->category_type:Ljava/lang/String;

    const-string v1, "type == null"

    move-object v2, p5

    .line 135
    invoke-static {p5, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->type:Ljava/lang/String;

    move-object v1, p6

    .line 136
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->collapsible:Ljava/lang/Boolean;

    move-object v1, p7

    .line 137
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->default_view_state:Ljava/lang/String;

    move-object v1, p8

    .line 138
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->end_time:Ljava/lang/String;

    move-object v1, p9

    .line 139
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->expiration:Ljava/lang/String;

    move-object v1, p10

    .line 140
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->icon_url:Ljava/lang/String;

    move-object v1, p11

    .line 141
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->image_url:Ljava/lang/String;

    move-object v1, p12

    .line 142
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->launch:Ljava/lang/Boolean;

    move-object/from16 v1, p13

    .line 143
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->name:Ljava/lang/String;

    move-object/from16 v1, p14

    .line 144
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->short_name:Ljava/lang/String;

    move-object/from16 v1, p15

    .line 145
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->num_preview_items:Ljava/lang/Long;

    move-object/from16 v1, p16

    .line 146
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->raw_category_type:Ljava/lang/String;

    move-object/from16 v1, p17

    .line 147
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->retailers:Ljava/util/List;

    move-object/from16 v1, p18

    .line 148
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->sort_order:Ljava/lang/Long;

    move-object/from16 v1, p19

    .line 149
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->start_time:Ljava/lang/String;

    move-object/from16 v1, p20

    .line 150
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->content:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public __typename()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 154
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->__typename:Ljava/lang/String;

    return-object v0
.end method

.method public cache_key()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->cache_key:Ljava/lang/String;

    return-object v0
.end method

.method public category_type()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->category_type:Ljava/lang/String;

    return-object v0
.end method

.method public collapsible()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->collapsible:Ljava/lang/Boolean;

    return-object v0
.end method

.method public content()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/CategoryFragment$Content;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 230
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->content:Ljava/util/List;

    return-object v0
.end method

.method public default_view_state()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->default_view_state:Ljava/lang/String;

    return-object v0
.end method

.method public end_time()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 182
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->end_time:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 305
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    const/4 v2, 0x0

    if-eqz v1, :cond_13

    .line 306
    check-cast p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    .line 307
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->__typename:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->id:Ljava/lang/String;

    .line 308
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->cache_key:Ljava/lang/String;

    if-nez v1, :cond_1

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->cache_key:Ljava/lang/String;

    if-nez v1, :cond_12

    goto :goto_0

    :cond_1
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->cache_key:Ljava/lang/String;

    .line 309
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->category_type:Ljava/lang/String;

    if-nez v1, :cond_2

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->category_type:Ljava/lang/String;

    if-nez v1, :cond_12

    goto :goto_1

    :cond_2
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->category_type:Ljava/lang/String;

    .line 310
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->type:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->type:Ljava/lang/String;

    .line 311
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->collapsible:Ljava/lang/Boolean;

    if-nez v1, :cond_3

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->collapsible:Ljava/lang/Boolean;

    if-nez v1, :cond_12

    goto :goto_2

    :cond_3
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->collapsible:Ljava/lang/Boolean;

    .line 312
    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    :goto_2
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->default_view_state:Ljava/lang/String;

    if-nez v1, :cond_4

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->default_view_state:Ljava/lang/String;

    if-nez v1, :cond_12

    goto :goto_3

    :cond_4
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->default_view_state:Ljava/lang/String;

    .line 313
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    :goto_3
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->end_time:Ljava/lang/String;

    if-nez v1, :cond_5

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->end_time:Ljava/lang/String;

    if-nez v1, :cond_12

    goto :goto_4

    :cond_5
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->end_time:Ljava/lang/String;

    .line 314
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    :goto_4
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->expiration:Ljava/lang/String;

    if-nez v1, :cond_6

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->expiration:Ljava/lang/String;

    if-nez v1, :cond_12

    goto :goto_5

    :cond_6
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->expiration:Ljava/lang/String;

    .line 315
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    :goto_5
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->icon_url:Ljava/lang/String;

    if-nez v1, :cond_7

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->icon_url:Ljava/lang/String;

    if-nez v1, :cond_12

    goto :goto_6

    :cond_7
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->icon_url:Ljava/lang/String;

    .line 316
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    :goto_6
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->image_url:Ljava/lang/String;

    if-nez v1, :cond_8

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->image_url:Ljava/lang/String;

    if-nez v1, :cond_12

    goto :goto_7

    :cond_8
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->image_url:Ljava/lang/String;

    .line 317
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    :goto_7
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->launch:Ljava/lang/Boolean;

    if-nez v1, :cond_9

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->launch:Ljava/lang/Boolean;

    if-nez v1, :cond_12

    goto :goto_8

    :cond_9
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->launch:Ljava/lang/Boolean;

    .line 318
    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    :goto_8
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->name:Ljava/lang/String;

    if-nez v1, :cond_a

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->name:Ljava/lang/String;

    if-nez v1, :cond_12

    goto :goto_9

    :cond_a
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->name:Ljava/lang/String;

    .line 319
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    :goto_9
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->short_name:Ljava/lang/String;

    if-nez v1, :cond_b

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->short_name:Ljava/lang/String;

    if-nez v1, :cond_12

    goto :goto_a

    :cond_b
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->short_name:Ljava/lang/String;

    .line 320
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    :goto_a
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->num_preview_items:Ljava/lang/Long;

    if-nez v1, :cond_c

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->num_preview_items:Ljava/lang/Long;

    if-nez v1, :cond_12

    goto :goto_b

    :cond_c
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->num_preview_items:Ljava/lang/Long;

    .line 321
    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    :goto_b
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->raw_category_type:Ljava/lang/String;

    if-nez v1, :cond_d

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->raw_category_type:Ljava/lang/String;

    if-nez v1, :cond_12

    goto :goto_c

    :cond_d
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->raw_category_type:Ljava/lang/String;

    .line 322
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    :goto_c
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->retailers:Ljava/util/List;

    if-nez v1, :cond_e

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->retailers:Ljava/util/List;

    if-nez v1, :cond_12

    goto :goto_d

    :cond_e
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->retailers:Ljava/util/List;

    .line 323
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    :goto_d
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->sort_order:Ljava/lang/Long;

    if-nez v1, :cond_f

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->sort_order:Ljava/lang/Long;

    if-nez v1, :cond_12

    goto :goto_e

    :cond_f
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->sort_order:Ljava/lang/Long;

    .line 324
    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    :goto_e
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->start_time:Ljava/lang/String;

    if-nez v1, :cond_10

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->start_time:Ljava/lang/String;

    if-nez v1, :cond_12

    goto :goto_f

    :cond_10
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->start_time:Ljava/lang/String;

    .line 325
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    :goto_f
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->content:Ljava/util/List;

    if-nez v1, :cond_11

    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->content:Ljava/util/List;

    if-nez p1, :cond_12

    goto :goto_10

    :cond_11
    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->content:Ljava/util/List;

    .line 326
    invoke-interface {v1, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_12

    goto :goto_10

    :cond_12
    const/4 v0, 0x0

    :goto_10
    return v0

    :cond_13
    return v2
.end method

.method public expiration()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 186
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->expiration:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 333
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->$hashCodeMemoized:Z

    if-nez v0, :cond_11

    .line 336
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 338
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->id:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 340
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->cache_key:Ljava/lang/String;

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

    .line 342
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->category_type:Ljava/lang/String;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 344
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->type:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 346
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->collapsible:Ljava/lang/Boolean;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_2
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 348
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->default_view_state:Ljava/lang/String;

    if-nez v2, :cond_3

    const/4 v2, 0x0

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 350
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->end_time:Ljava/lang/String;

    if-nez v2, :cond_4

    const/4 v2, 0x0

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 352
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->expiration:Ljava/lang/String;

    if-nez v2, :cond_5

    const/4 v2, 0x0

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 354
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->icon_url:Ljava/lang/String;

    if-nez v2, :cond_6

    const/4 v2, 0x0

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 356
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->image_url:Ljava/lang/String;

    if-nez v2, :cond_7

    const/4 v2, 0x0

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 358
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->launch:Ljava/lang/Boolean;

    if-nez v2, :cond_8

    const/4 v2, 0x0

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_8
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 360
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->name:Ljava/lang/String;

    if-nez v2, :cond_9

    const/4 v2, 0x0

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_9
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 362
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->short_name:Ljava/lang/String;

    if-nez v2, :cond_a

    const/4 v2, 0x0

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_a
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 364
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->num_preview_items:Ljava/lang/Long;

    if-nez v2, :cond_b

    const/4 v2, 0x0

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_b
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 366
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->raw_category_type:Ljava/lang/String;

    if-nez v2, :cond_c

    const/4 v2, 0x0

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_c
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 368
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->retailers:Ljava/util/List;

    if-nez v2, :cond_d

    const/4 v2, 0x0

    goto :goto_d

    :cond_d
    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    :goto_d
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 370
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->sort_order:Ljava/lang/Long;

    if-nez v2, :cond_e

    const/4 v2, 0x0

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_e
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 372
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->start_time:Ljava/lang/String;

    if-nez v2, :cond_f

    const/4 v2, 0x0

    goto :goto_f

    :cond_f
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_f
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 374
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->content:Ljava/util/List;

    if-nez v1, :cond_10

    goto :goto_10

    :cond_10
    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v3

    :goto_10
    xor-int/2addr v0, v3

    .line 375
    iput v0, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->$hashCode:I

    const/4 v0, 0x1

    .line 376
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->$hashCodeMemoized:Z

    .line 378
    :cond_11
    iget v0, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->$hashCode:I

    return v0
.end method

.method public icon_url()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 190
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->icon_url:Ljava/lang/String;

    return-object v0
.end method

.method public id()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->id:Ljava/lang/String;

    return-object v0
.end method

.method public image_url()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 194
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->image_url:Ljava/lang/String;

    return-object v0
.end method

.method public launch()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 198
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->launch:Ljava/lang/Boolean;

    return-object v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 234
    new-instance v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/fragment/CategoryFragment$1;-><init>(Lcom/ibotta/android/graphql/fragment/CategoryFragment;)V

    return-object v0
.end method

.method public name()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 202
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->name:Ljava/lang/String;

    return-object v0
.end method

.method public num_preview_items()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 210
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->num_preview_items:Ljava/lang/Long;

    return-object v0
.end method

.method public raw_category_type()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 214
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->raw_category_type:Ljava/lang/String;

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

    .line 218
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->retailers:Ljava/util/List;

    return-object v0
.end method

.method public short_name()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 206
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->short_name:Ljava/lang/String;

    return-object v0
.end method

.method public sort_order()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 222
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->sort_order:Ljava/lang/Long;

    return-object v0
.end method

.method public start_time()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 226
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->start_time:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 273
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 274
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CategoryFragment{__typename="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", cache_key="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->cache_key:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", category_type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->category_type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", collapsible="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->collapsible:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", default_view_state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->default_view_state:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", end_time="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->end_time:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", expiration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->expiration:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", icon_url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->icon_url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", image_url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->image_url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", launch="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->launch:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", short_name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->short_name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", num_preview_items="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->num_preview_items:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", raw_category_type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->raw_category_type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", retailers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->retailers:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sort_order="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->sort_order:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", start_time="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->start_time:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", content="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->content:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->$toString:Ljava/lang/String;

    .line 297
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->$toString:Ljava/lang/String;

    return-object v0
.end method

.method public type()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 170
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->type:Ljava/lang/String;

    return-object v0
.end method
