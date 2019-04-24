.class public Lcom/ibotta/android/graphql/fragment/FeatureFragment;
.super Ljava/lang/Object;
.source "FeatureFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/GraphqlFragment;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/fragment/FeatureFragment$Sort_result;,
        Lcom/ibotta/android/graphql/fragment/FeatureFragment$Mapper;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;

.field public static final FRAGMENT_DEFINITION:Ljava/lang/String; = "fragment FeatureFragment on Feature {\n  __typename\n  id\n  bgcolor\n  big_img\n  cache_key\n  category_img\n  context\n  expiration\n  feature_type\n  link\n  name\n  sort_results {\n    __typename\n    ...SortResultFragment\n  }\n  sort_order\n  tracking_click_url\n  tracking_impression_url\n  type\n  typed_id\n}"

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

.field final bgcolor:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final big_img:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final cache_key:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final category_img:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final context:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final expiration:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final feature_type:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final id:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field final link:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final name:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
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
            "Lcom/ibotta/android/graphql/fragment/FeatureFragment$Sort_result;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final tracking_click_url:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final tracking_impression_url:Ljava/lang/String;
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
    .locals 12

    const/16 v0, 0x11

    .line 24
    new-array v0, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v1, "__typename"

    const-string v2, "__typename"

    .line 25
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

    .line 26
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v11

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/apollographql/apollo/api/ResponseField;->forCustomType(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLcom/apollographql/apollo/api/ScalarType;Ljava/util/List;)Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "bgcolor"

    const-string v3, "bgcolor"

    .line 27
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x2

    aput-object v1, v0, v3

    const-string v1, "big_img"

    const-string v3, "big_img"

    .line 28
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x3

    aput-object v1, v0, v3

    const-string v1, "cache_key"

    const-string v3, "cache_key"

    .line 29
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x4

    aput-object v1, v0, v3

    const-string v1, "category_img"

    const-string v3, "category_img"

    .line 30
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x5

    aput-object v1, v0, v3

    const-string v1, "context"

    const-string v3, "context"

    .line 31
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x6

    aput-object v1, v0, v3

    const-string v1, "expiration"

    const-string v3, "expiration"

    .line 32
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x7

    aput-object v1, v0, v3

    const-string v1, "feature_type"

    const-string v3, "feature_type"

    .line 33
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x8

    aput-object v1, v0, v3

    const-string v1, "link"

    const-string v3, "link"

    .line 34
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x9

    aput-object v1, v0, v3

    const-string v1, "name"

    const-string v3, "name"

    .line 35
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v4, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0xa

    aput-object v1, v0, v3

    const-string v1, "sort_results"

    const-string v3, "sort_results"

    .line 36
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0xb

    aput-object v1, v0, v3

    const-string v1, "sort_order"

    const-string v3, "sort_order"

    .line 37
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0xc

    aput-object v1, v0, v3

    const-string v1, "tracking_click_url"

    const-string v3, "tracking_click_url"

    .line 38
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0xd

    aput-object v1, v0, v3

    const-string v1, "tracking_impression_url"

    const-string v3, "tracking_impression_url"

    .line 39
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v5, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "type"

    const-string v2, "type"

    .line 40
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const-string v1, "typed_id"

    const-string v2, "typed_id"

    .line 41
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const-string v0, "Feature"

    .line 67
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->POSSIBLE_TYPES:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
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
    .param p9    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
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
    .param p13    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
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
    .param p16    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p17    # Ljava/lang/String;
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
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/FeatureFragment$Sort_result;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "__typename == null"

    move-object v2, p1

    .line 115
    invoke-static {p1, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->__typename:Ljava/lang/String;

    const-string v1, "id == null"

    move-object v2, p2

    .line 116
    invoke-static {p2, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->id:Ljava/lang/String;

    move-object v1, p3

    .line 117
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->bgcolor:Ljava/lang/String;

    move-object v1, p4

    .line 118
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->big_img:Ljava/lang/String;

    move-object v1, p5

    .line 119
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->cache_key:Ljava/lang/String;

    move-object v1, p6

    .line 120
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->category_img:Ljava/lang/String;

    move-object v1, p7

    .line 121
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->context:Ljava/lang/String;

    move-object v1, p8

    .line 122
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->expiration:Ljava/lang/String;

    move-object v1, p9

    .line 123
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->feature_type:Ljava/lang/String;

    move-object v1, p10

    .line 124
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->link:Ljava/lang/String;

    const-string v1, "name == null"

    move-object v2, p11

    .line 125
    invoke-static {p11, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->name:Ljava/lang/String;

    move-object v1, p12

    .line 126
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->sort_results:Ljava/util/List;

    move-object/from16 v1, p13

    .line 127
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->sort_order:Ljava/lang/String;

    move-object/from16 v1, p14

    .line 128
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->tracking_click_url:Ljava/lang/String;

    move-object/from16 v1, p15

    .line 129
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->tracking_impression_url:Ljava/lang/String;

    const-string v1, "type == null"

    move-object/from16 v2, p16

    .line 130
    invoke-static {v2, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->type:Ljava/lang/String;

    const-string v1, "typed_id == null"

    move-object/from16 v2, p17

    .line 131
    invoke-static {v2, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->typed_id:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public __typename()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 135
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->__typename:Ljava/lang/String;

    return-object v0
.end method

.method public bgcolor()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->bgcolor:Ljava/lang/String;

    return-object v0
.end method

.method public big_img()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->big_img:Ljava/lang/String;

    return-object v0
.end method

.method public cache_key()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->cache_key:Ljava/lang/String;

    return-object v0
.end method

.method public category_img()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->category_img:Ljava/lang/String;

    return-object v0
.end method

.method public context()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 159
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->context:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 269
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    const/4 v2, 0x0

    if-eqz v1, :cond_e

    .line 270
    check-cast p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    .line 271
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->__typename:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->id:Ljava/lang/String;

    .line 272
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->bgcolor:Ljava/lang/String;

    if-nez v1, :cond_1

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->bgcolor:Ljava/lang/String;

    if-nez v1, :cond_d

    goto :goto_0

    :cond_1
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->bgcolor:Ljava/lang/String;

    .line 273
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->big_img:Ljava/lang/String;

    if-nez v1, :cond_2

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->big_img:Ljava/lang/String;

    if-nez v1, :cond_d

    goto :goto_1

    :cond_2
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->big_img:Ljava/lang/String;

    .line 274
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->cache_key:Ljava/lang/String;

    if-nez v1, :cond_3

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->cache_key:Ljava/lang/String;

    if-nez v1, :cond_d

    goto :goto_2

    :cond_3
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->cache_key:Ljava/lang/String;

    .line 275
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    :goto_2
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->category_img:Ljava/lang/String;

    if-nez v1, :cond_4

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->category_img:Ljava/lang/String;

    if-nez v1, :cond_d

    goto :goto_3

    :cond_4
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->category_img:Ljava/lang/String;

    .line 276
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    :goto_3
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->context:Ljava/lang/String;

    if-nez v1, :cond_5

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->context:Ljava/lang/String;

    if-nez v1, :cond_d

    goto :goto_4

    :cond_5
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->context:Ljava/lang/String;

    .line 277
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    :goto_4
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->expiration:Ljava/lang/String;

    if-nez v1, :cond_6

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->expiration:Ljava/lang/String;

    if-nez v1, :cond_d

    goto :goto_5

    :cond_6
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->expiration:Ljava/lang/String;

    .line 278
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    :goto_5
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->feature_type:Ljava/lang/String;

    if-nez v1, :cond_7

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->feature_type:Ljava/lang/String;

    if-nez v1, :cond_d

    goto :goto_6

    :cond_7
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->feature_type:Ljava/lang/String;

    .line 279
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    :goto_6
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->link:Ljava/lang/String;

    if-nez v1, :cond_8

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->link:Ljava/lang/String;

    if-nez v1, :cond_d

    goto :goto_7

    :cond_8
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->link:Ljava/lang/String;

    .line 280
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    :goto_7
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->name:Ljava/lang/String;

    .line 281
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->sort_results:Ljava/util/List;

    if-nez v1, :cond_9

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->sort_results:Ljava/util/List;

    if-nez v1, :cond_d

    goto :goto_8

    :cond_9
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->sort_results:Ljava/util/List;

    .line 282
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    :goto_8
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->sort_order:Ljava/lang/String;

    if-nez v1, :cond_a

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->sort_order:Ljava/lang/String;

    if-nez v1, :cond_d

    goto :goto_9

    :cond_a
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->sort_order:Ljava/lang/String;

    .line 283
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    :goto_9
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->tracking_click_url:Ljava/lang/String;

    if-nez v1, :cond_b

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->tracking_click_url:Ljava/lang/String;

    if-nez v1, :cond_d

    goto :goto_a

    :cond_b
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->tracking_click_url:Ljava/lang/String;

    .line 284
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    :goto_a
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->tracking_impression_url:Ljava/lang/String;

    if-nez v1, :cond_c

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->tracking_impression_url:Ljava/lang/String;

    if-nez v1, :cond_d

    goto :goto_b

    :cond_c
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->tracking_impression_url:Ljava/lang/String;

    .line 285
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    :goto_b
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->type:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->type:Ljava/lang/String;

    .line 286
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->typed_id:Ljava/lang/String;

    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->typed_id:Ljava/lang/String;

    .line 287
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    goto :goto_c

    :cond_d
    const/4 v0, 0x0

    :goto_c
    return v0

    :cond_e
    return v2
.end method

.method public expiration()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 163
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->expiration:Ljava/lang/String;

    return-object v0
.end method

.method public feature_type()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->feature_type:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 294
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$hashCodeMemoized:Z

    if-nez v0, :cond_c

    .line 297
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 299
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->id:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 301
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->bgcolor:Ljava/lang/String;

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

    .line 303
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->big_img:Ljava/lang/String;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 305
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->cache_key:Ljava/lang/String;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 307
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->category_img:Ljava/lang/String;

    if-nez v2, :cond_3

    const/4 v2, 0x0

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 309
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->context:Ljava/lang/String;

    if-nez v2, :cond_4

    const/4 v2, 0x0

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 311
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->expiration:Ljava/lang/String;

    if-nez v2, :cond_5

    const/4 v2, 0x0

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 313
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->feature_type:Ljava/lang/String;

    if-nez v2, :cond_6

    const/4 v2, 0x0

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 315
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->link:Ljava/lang/String;

    if-nez v2, :cond_7

    const/4 v2, 0x0

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 317
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->name:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 319
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->sort_results:Ljava/util/List;

    if-nez v2, :cond_8

    const/4 v2, 0x0

    goto :goto_8

    :cond_8
    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    :goto_8
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 321
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->sort_order:Ljava/lang/String;

    if-nez v2, :cond_9

    const/4 v2, 0x0

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_9
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 323
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->tracking_click_url:Ljava/lang/String;

    if-nez v2, :cond_a

    const/4 v2, 0x0

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_a
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 325
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->tracking_impression_url:Ljava/lang/String;

    if-nez v2, :cond_b

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_b
    xor-int/2addr v0, v3

    mul-int v0, v0, v1

    .line 327
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->type:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 329
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->typed_id:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    .line 330
    iput v0, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$hashCode:I

    const/4 v0, 0x1

    .line 331
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$hashCodeMemoized:Z

    .line 333
    :cond_c
    iget v0, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$hashCode:I

    return v0
.end method

.method public id()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 139
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->id:Ljava/lang/String;

    return-object v0
.end method

.method public link()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->link:Ljava/lang/String;

    return-object v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 209
    new-instance v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/fragment/FeatureFragment$1;-><init>(Lcom/ibotta/android/graphql/fragment/FeatureFragment;)V

    return-object v0
.end method

.method public name()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 175
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->name:Ljava/lang/String;

    return-object v0
.end method

.method public sort_order()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 186
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->sort_order:Ljava/lang/String;

    return-object v0
.end method

.method public sort_results()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/FeatureFragment$Sort_result;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 182
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->sort_results:Ljava/util/List;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 240
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 241
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FeatureFragment{__typename="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", bgcolor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->bgcolor:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", big_img="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->big_img:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", cache_key="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->cache_key:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", category_img="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->category_img:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", context="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->context:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", expiration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->expiration:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", feature_type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->feature_type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", link="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->link:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sort_results="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->sort_results:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sort_order="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->sort_order:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", tracking_click_url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->tracking_click_url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", tracking_impression_url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->tracking_impression_url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", typed_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->typed_id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$toString:Ljava/lang/String;

    .line 261
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$toString:Ljava/lang/String;

    return-object v0
.end method

.method public tracking_click_url()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 193
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->tracking_click_url:Ljava/lang/String;

    return-object v0
.end method

.method public tracking_impression_url()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 197
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->tracking_impression_url:Ljava/lang/String;

    return-object v0
.end method

.method public type()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->type:Ljava/lang/String;

    return-object v0
.end method

.method public typed_id()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 205
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->typed_id:Ljava/lang/String;

    return-object v0
.end method
