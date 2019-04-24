.class public Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;
.super Ljava/lang/Object;
.source "FeaturedBannerNodeFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/GraphqlFragment;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;,
        Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$Mapper;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;

.field public static final FRAGMENT_DEFINITION:Ljava/lang/String; = "fragment FeaturedBannerNodeFragment on FeaturedBannerNode {\n  __typename\n  id\n  name\n  link\n  categoryImg: image(type: CATEGORY) {\n    __typename\n    url\n  }\n}"

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

.field final categoryImg:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;
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
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/4 v0, 0x5

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

    const-string v1, "name"

    const-string v3, "name"

    .line 27
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x2

    aput-object v1, v0, v3

    const-string v1, "link"

    const-string v3, "link"

    .line 28
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x3

    aput-object v1, v0, v3

    const-string v1, "categoryImg"

    const-string v3, "image"

    new-instance v4, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v4, v2}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v5, "type"

    const-string v6, "CATEGORY"

    .line 30
    invoke-virtual {v4, v5, v6}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v4

    .line 31
    invoke-virtual {v4}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v4

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v5

    .line 29
    invoke-static {v1, v3, v4, v2, v5}, Lcom/apollographql/apollo/api/ResponseField;->forObject(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const-string v0, "FeaturedBannerNode"

    .line 45
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->POSSIBLE_TYPES:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;)V
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
    .param p4    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "__typename == null"

    .line 65
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->__typename:Ljava/lang/String;

    const-string p1, "id == null"

    .line 66
    invoke-static {p2, p1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->id:Ljava/lang/String;

    .line 67
    iput-object p3, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->name:Ljava/lang/String;

    .line 68
    iput-object p4, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->link:Ljava/lang/String;

    .line 69
    iput-object p5, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->categoryImg:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;

    return-void
.end method


# virtual methods
.method public __typename()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->__typename:Ljava/lang/String;

    return-object v0
.end method

.method public categoryImg()Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->categoryImg:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 136
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    .line 137
    check-cast p1, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;

    .line 138
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->__typename:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->id:Ljava/lang/String;

    .line 139
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->name:Ljava/lang/String;

    if-nez v1, :cond_1

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->name:Ljava/lang/String;

    if-nez v1, :cond_4

    goto :goto_0

    :cond_1
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->name:Ljava/lang/String;

    .line 140
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->link:Ljava/lang/String;

    if-nez v1, :cond_2

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->link:Ljava/lang/String;

    if-nez v1, :cond_4

    goto :goto_1

    :cond_2
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->link:Ljava/lang/String;

    .line 141
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->categoryImg:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;

    if-nez v1, :cond_3

    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->categoryImg:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;

    if-nez p1, :cond_4

    goto :goto_2

    :cond_3
    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->categoryImg:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;

    .line 142
    invoke-virtual {v1, p1}, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    :goto_2
    return v0

    :cond_5
    return v2
.end method

.method public hashCode()I
    .locals 4

    .line 149
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->$hashCodeMemoized:Z

    if-nez v0, :cond_3

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 154
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->id:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 156
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->name:Ljava/lang/String;

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

    .line 158
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->link:Ljava/lang/String;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 160
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->categoryImg:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;->hashCode()I

    move-result v3

    :goto_2
    xor-int/2addr v0, v3

    .line 161
    iput v0, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->$hashCode:I

    const/4 v0, 0x1

    .line 162
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->$hashCodeMemoized:Z

    .line 164
    :cond_3
    iget v0, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->$hashCode:I

    return v0
.end method

.method public id()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->id:Ljava/lang/String;

    return-object v0
.end method

.method public link()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->link:Ljava/lang/String;

    return-object v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 105
    new-instance v0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$1;-><init>(Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;)V

    return-object v0
.end method

.method public name()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->name:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 120
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FeaturedBannerNodeFragment{__typename="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", link="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->link:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", categoryImg="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->categoryImg:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->$toString:Ljava/lang/String;

    .line 128
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->$toString:Ljava/lang/String;

    return-object v0
.end method
