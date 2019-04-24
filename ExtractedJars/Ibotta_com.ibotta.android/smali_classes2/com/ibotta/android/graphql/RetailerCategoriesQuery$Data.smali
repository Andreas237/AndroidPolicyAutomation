.class public Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;
.super Ljava/lang/Object;
.source "RetailerCategoriesQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/Operation$Data;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/RetailerCategoriesQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Data"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data$Mapper;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;


# instance fields
.field private volatile $hashCode:I

.field private volatile $hashCodeMemoized:Z

.field private volatile $toString:Ljava/lang/String;

.field final customerNode:Lcom/ibotta/android/graphql/RetailerCategoriesQuery$CustomerNode;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final retailerCategoryNodes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/RetailerCategoriesQuery$RetailerCategoryNode;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/4 v0, 0x2

    .line 211
    new-array v1, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v2, "retailerCategoryNodes"

    const-string v3, "retailerCategoryNodes"

    new-instance v4, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v4, v0}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v5, "limit"

    new-instance v6, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    const/4 v7, 0x1

    invoke-direct {v6, v7}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v8, "limit"

    const-string v9, "1000.0"

    .line 214
    invoke-virtual {v6, v8, v9}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v6

    .line 215
    invoke-virtual {v6}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v6

    .line 213
    invoke-virtual {v4, v5, v6}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v4

    const-string v5, "filters"

    new-instance v6, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v6, v7}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v8, "categoryType"

    new-instance v9, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v9, v7}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v10, "type"

    const-string v11, "NORMAL"

    .line 218
    invoke-virtual {v9, v10, v11}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v9

    .line 219
    invoke-virtual {v9}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v9

    .line 217
    invoke-virtual {v6, v8, v9}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v6

    .line 220
    invoke-virtual {v6}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v6

    .line 216
    invoke-virtual {v4, v5, v6}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v4

    .line 221
    invoke-virtual {v4}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v4

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v5

    .line 212
    invoke-static {v2, v3, v4, v7, v5}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "customerNode"

    const-string v3, "customerNode"

    new-instance v4, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v4, v7}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v5, "filters"

    new-instance v6, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v6, v7}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v8, "id"

    new-instance v9, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v9, v0}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v0, "kind"

    const-string v10, "Variable"

    .line 225
    invoke-virtual {v9, v0, v10}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v0

    const-string v9, "variableName"

    const-string v10, "customerId"

    .line 226
    invoke-virtual {v0, v9, v10}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v0

    .line 227
    invoke-virtual {v0}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v0

    .line 224
    invoke-virtual {v6, v8, v0}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v0

    .line 228
    invoke-virtual {v0}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v0

    .line 223
    invoke-virtual {v4, v5, v0}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v0

    .line 229
    invoke-virtual {v0}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    .line 222
    invoke-static {v2, v3, v0, v7, v4}, Lcom/apollographql/apollo/api/ResponseField;->forObject(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v0

    aput-object v0, v1, v7

    sput-object v1, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lcom/ibotta/android/graphql/RetailerCategoriesQuery$CustomerNode;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/graphql/RetailerCategoriesQuery$CustomerNode;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/RetailerCategoriesQuery$RetailerCategoryNode;",
            ">;",
            "Lcom/ibotta/android/graphql/RetailerCategoriesQuery$CustomerNode;",
            ")V"
        }
    .end annotation

    .line 243
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 244
    iput-object p1, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;->retailerCategoryNodes:Ljava/util/List;

    .line 245
    iput-object p2, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;->customerNode:Lcom/ibotta/android/graphql/RetailerCategoriesQuery$CustomerNode;

    return-void
.end method


# virtual methods
.method public customerNode()Lcom/ibotta/android/graphql/RetailerCategoriesQuery$CustomerNode;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 259
    iget-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;->customerNode:Lcom/ibotta/android/graphql/RetailerCategoriesQuery$CustomerNode;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 293
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 294
    check-cast p1, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;

    .line 295
    iget-object v1, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;->retailerCategoryNodes:Ljava/util/List;

    if-nez v1, :cond_1

    iget-object v1, p1, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;->retailerCategoryNodes:Ljava/util/List;

    if-nez v1, :cond_3

    goto :goto_0

    :cond_1
    iget-object v3, p1, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;->retailerCategoryNodes:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;->customerNode:Lcom/ibotta/android/graphql/RetailerCategoriesQuery$CustomerNode;

    if-nez v1, :cond_2

    iget-object p1, p1, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;->customerNode:Lcom/ibotta/android/graphql/RetailerCategoriesQuery$CustomerNode;

    if-nez p1, :cond_3

    goto :goto_1

    :cond_2
    iget-object p1, p1, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;->customerNode:Lcom/ibotta/android/graphql/RetailerCategoriesQuery$CustomerNode;

    .line 296
    invoke-virtual {v1, p1}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$CustomerNode;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    return v0

    :cond_4
    return v2
.end method

.method public hashCode()I
    .locals 3

    .line 303
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;->$hashCodeMemoized:Z

    if-nez v0, :cond_2

    .line 306
    iget-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;->retailerCategoryNodes:Ljava/util/List;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    move-result v0

    :goto_0
    const v2, 0xf4243

    xor-int/2addr v0, v2

    mul-int v0, v0, v2

    .line 308
    iget-object v2, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;->customerNode:Lcom/ibotta/android/graphql/RetailerCategoriesQuery$CustomerNode;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$CustomerNode;->hashCode()I

    move-result v1

    :goto_1
    xor-int/2addr v0, v1

    .line 309
    iput v0, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;->$hashCode:I

    const/4 v0, 0x1

    .line 310
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;->$hashCodeMemoized:Z

    .line 312
    :cond_2
    iget v0, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;->$hashCode:I

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 263
    new-instance v0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data$1;-><init>(Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;)V

    return-object v0
.end method

.method public retailerCategoryNodes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/RetailerCategoriesQuery$RetailerCategoryNode;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 252
    iget-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;->retailerCategoryNodes:Ljava/util/List;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 279
    iget-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 280
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Data{retailerCategoryNodes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;->retailerCategoryNodes:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", customerNode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;->customerNode:Lcom/ibotta/android/graphql/RetailerCategoriesQuery$CustomerNode;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;->$toString:Ljava/lang/String;

    .line 285
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;->$toString:Ljava/lang/String;

    return-object v0
.end method
