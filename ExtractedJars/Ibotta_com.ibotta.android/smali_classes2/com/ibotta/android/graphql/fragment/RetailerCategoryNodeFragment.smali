.class public Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;
.super Ljava/lang/Object;
.source "RetailerCategoryNodeFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/GraphqlFragment;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Features;,
        Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Retailer;,
        Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;,
        Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Mapper;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;

.field public static final FRAGMENT_DEFINITION:Ljava/lang/String; = "fragment RetailerCategoryNodeFragment on RetailerCategoryNode {\n  __typename\n  id\n  name\n  iconUrl: image(type: ICON) {\n    __typename\n    url\n  }\n  retailers(limit: {limit: $categoryRetailersLimit}, filters: {primaryOrSecondaryMatch: {enabled: true}}) {\n    __typename\n    ...RetailerNodeFragment\n  }\n  features @include(if: $includeFullResponse) {\n    __typename\n    ...FeaturedNodeFragment\n  }\n}"

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

.field final features:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Features;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final iconUrl:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final id:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field final name:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final retailers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Retailer;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 13

    const/4 v0, 0x6

    .line 25
    new-array v0, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v1, "__typename"

    const-string v2, "__typename"

    .line 26
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v2, v4, v5, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v5

    const-string v6, "id"

    const-string v7, "id"

    sget-object v10, Lcom/ibotta/android/graphql/type/CustomType;->ID:Lcom/ibotta/android/graphql/type/CustomType;

    .line 27
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v11

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/apollographql/apollo/api/ResponseField;->forCustomType(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLcom/apollographql/apollo/api/ScalarType;Ljava/util/List;)Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "name"

    const-string v3, "name"

    .line 28
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v3, v4, v2, v6}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x2

    aput-object v1, v0, v3

    const-string v1, "iconUrl"

    const-string v6, "image"

    new-instance v7, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v7, v2}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v8, "type"

    const-string v9, "ICON"

    .line 30
    invoke-virtual {v7, v8, v9}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v7

    .line 31
    invoke-virtual {v7}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v7

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v8

    .line 29
    invoke-static {v1, v6, v7, v2, v8}, Lcom/apollographql/apollo/api/ResponseField;->forObject(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v6, 0x3

    aput-object v1, v0, v6

    const-string v1, "retailers"

    const-string v6, "retailers"

    new-instance v7, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v7, v3}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v8, "limit"

    new-instance v9, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v9, v2}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v10, "limit"

    new-instance v11, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v11, v3}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v3, "kind"

    const-string v12, "Variable"

    .line 35
    invoke-virtual {v11, v3, v12}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v3

    const-string v11, "variableName"

    const-string v12, "categoryRetailersLimit"

    .line 36
    invoke-virtual {v3, v11, v12}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v3

    .line 37
    invoke-virtual {v3}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v3

    .line 34
    invoke-virtual {v9, v10, v3}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v3

    .line 38
    invoke-virtual {v3}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v3

    .line 33
    invoke-virtual {v7, v8, v3}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v3

    const-string v7, "filters"

    new-instance v8, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v8, v2}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v9, "primaryOrSecondaryMatch"

    new-instance v10, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v10, v2}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v11, "enabled"

    const-string v12, "true"

    .line 41
    invoke-virtual {v10, v11, v12}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v10

    .line 42
    invoke-virtual {v10}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v10

    .line 40
    invoke-virtual {v8, v9, v10}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v8

    .line 43
    invoke-virtual {v8}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v8

    .line 39
    invoke-virtual {v3, v7, v8}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v3

    .line 44
    invoke-virtual {v3}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v3

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v7

    .line 32
    invoke-static {v1, v6, v3, v2, v7}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x4

    aput-object v1, v0, v3

    const-string v1, "features"

    const-string v3, "features"

    new-array v6, v2, [Lcom/apollographql/apollo/api/ResponseField$Condition;

    const-string v7, "includeFullResponse"

    .line 45
    invoke-static {v7, v5}, Lcom/apollographql/apollo/api/ResponseField$Condition;->booleanCondition(Ljava/lang/String;Z)Lcom/apollographql/apollo/api/ResponseField$BooleanCondition;

    move-result-object v7

    aput-object v7, v6, v5

    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v1, v3, v4, v2, v5}, Lcom/apollographql/apollo/api/ResponseField;->forObject(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const-string v0, "RetailerCategoryNode"

    .line 66
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->POSSIBLE_TYPES:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;Ljava/util/List;Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Features;)V
    .locals 1
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
    .param p4    # Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Features;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Retailer;",
            ">;",
            "Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Features;",
            ")V"
        }
    .end annotation

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "__typename == null"

    .line 89
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->__typename:Ljava/lang/String;

    const-string p1, "id == null"

    .line 90
    invoke-static {p2, p1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->id:Ljava/lang/String;

    .line 91
    iput-object p3, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->name:Ljava/lang/String;

    .line 92
    iput-object p4, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->iconUrl:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;

    .line 93
    iput-object p5, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->retailers:Ljava/util/List;

    .line 94
    iput-object p6, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->features:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Features;

    return-void
.end method


# virtual methods
.method public __typename()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->__typename:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 175
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;

    const/4 v2, 0x0

    if-eqz v1, :cond_6

    .line 176
    check-cast p1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;

    .line 177
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->__typename:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->id:Ljava/lang/String;

    .line 178
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->name:Ljava/lang/String;

    if-nez v1, :cond_1

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->name:Ljava/lang/String;

    if-nez v1, :cond_5

    goto :goto_0

    :cond_1
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->name:Ljava/lang/String;

    .line 179
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->iconUrl:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;

    if-nez v1, :cond_2

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->iconUrl:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;

    if-nez v1, :cond_5

    goto :goto_1

    :cond_2
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->iconUrl:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;

    .line 180
    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->retailers:Ljava/util/List;

    if-nez v1, :cond_3

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->retailers:Ljava/util/List;

    if-nez v1, :cond_5

    goto :goto_2

    :cond_3
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->retailers:Ljava/util/List;

    .line 181
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    :goto_2
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->features:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Features;

    if-nez v1, :cond_4

    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->features:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Features;

    if-nez p1, :cond_5

    goto :goto_3

    :cond_4
    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->features:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Features;

    .line 182
    invoke-virtual {v1, p1}, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Features;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    :goto_3
    return v0

    :cond_6
    return v2
.end method

.method public features()Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Features;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 133
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->features:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Features;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 189
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->$hashCodeMemoized:Z

    if-nez v0, :cond_4

    .line 192
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 194
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->id:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 196
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->name:Ljava/lang/String;

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

    .line 198
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->iconUrl:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;->hashCode()I

    move-result v2

    :goto_1
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 200
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->retailers:Ljava/util/List;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    :goto_2
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 202
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->features:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Features;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Features;->hashCode()I

    move-result v3

    :goto_3
    xor-int/2addr v0, v3

    .line 203
    iput v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->$hashCode:I

    const/4 v0, 0x1

    .line 204
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->$hashCodeMemoized:Z

    .line 206
    :cond_4
    iget v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->$hashCode:I

    return v0
.end method

.method public iconUrl()Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->iconUrl:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;

    return-object v0
.end method

.method public id()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->id:Ljava/lang/String;

    return-object v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 137
    new-instance v0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$1;-><init>(Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;)V

    return-object v0
.end method

.method public name()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->name:Ljava/lang/String;

    return-object v0
.end method

.method public retailers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Retailer;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->retailers:Ljava/util/List;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 158
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RetailerCategoryNodeFragment{__typename="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", iconUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->iconUrl:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retailers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->retailers:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", features="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->features:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Features;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->$toString:Ljava/lang/String;

    .line 167
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->$toString:Ljava/lang/String;

    return-object v0
.end method
