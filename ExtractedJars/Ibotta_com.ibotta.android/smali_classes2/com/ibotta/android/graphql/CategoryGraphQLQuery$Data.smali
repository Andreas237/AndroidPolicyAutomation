.class public Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data;
.super Ljava/lang/Object;
.source "CategoryGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/Operation$Data;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/CategoryGraphQLQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Data"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data$Mapper;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;


# instance fields
.field private volatile $hashCode:I

.field private volatile $hashCodeMemoized:Z

.field private volatile $toString:Ljava/lang/String;

.field final category:Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 10

    const/4 v0, 0x1

    .line 215
    new-array v1, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v2, "category"

    const-string v3, "category"

    new-instance v4, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    const/4 v5, 0x2

    invoke-direct {v4, v5}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v6, "id"

    new-instance v7, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v7, v5}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v8, "kind"

    const-string v9, "Variable"

    .line 218
    invoke-virtual {v7, v8, v9}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v7

    const-string v8, "variableName"

    const-string v9, "categoryId"

    .line 219
    invoke-virtual {v7, v8, v9}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v7

    .line 220
    invoke-virtual {v7}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v7

    .line 217
    invoke-virtual {v4, v6, v7}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v4

    const-string v6, "contentMax"

    new-instance v7, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v7, v5}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v5, "kind"

    const-string v8, "Variable"

    .line 222
    invoke-virtual {v7, v5, v8}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v5

    const-string v7, "variableName"

    const-string v8, "contentMax"

    .line 223
    invoke-virtual {v5, v7, v8}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v5

    .line 224
    invoke-virtual {v5}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v5

    .line 221
    invoke-virtual {v4, v6, v5}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v4

    .line 225
    invoke-virtual {v4}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v4

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v5

    .line 216
    invoke-static {v2, v3, v4, v0, v5}, Lcom/apollographql/apollo/api/ResponseField;->forObject(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v0

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 236
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 237
    iput-object p1, p0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data;->category:Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;

    return-void
.end method


# virtual methods
.method public category()Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 244
    iget-object v0, p0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data;->category:Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 271
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 272
    check-cast p1, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data;

    .line 273
    iget-object v1, p0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data;->category:Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;

    if-nez v1, :cond_2

    iget-object p1, p1, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data;->category:Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    iget-object p1, p1, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data;->category:Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;->equals(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    return v0

    :cond_3
    return v2
.end method

.method public hashCode()I
    .locals 2

    .line 280
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data;->$hashCodeMemoized:Z

    if-nez v0, :cond_1

    const v0, 0xf4243

    .line 283
    iget-object v1, p0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data;->category:Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;->hashCode()I

    move-result v1

    :goto_0
    xor-int/2addr v0, v1

    .line 284
    iput v0, p0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data;->$hashCode:I

    const/4 v0, 0x1

    .line 285
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data;->$hashCodeMemoized:Z

    .line 287
    :cond_1
    iget v0, p0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data;->$hashCode:I

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 248
    new-instance v0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data$1;-><init>(Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 258
    iget-object v0, p0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 259
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Data{category="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data;->category:Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data;->$toString:Ljava/lang/String;

    .line 263
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data;->$toString:Ljava/lang/String;

    return-object v0
.end method
