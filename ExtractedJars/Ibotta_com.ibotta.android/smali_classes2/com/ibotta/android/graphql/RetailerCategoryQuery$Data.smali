.class public Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;
.super Ljava/lang/Object;
.source "RetailerCategoryQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/Operation$Data;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/RetailerCategoryQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Data"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data$Mapper;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;


# instance fields
.field private volatile $hashCode:I

.field private volatile $hashCodeMemoized:Z

.field private volatile $toString:Ljava/lang/String;

.field final customerNode:Lcom/ibotta/android/graphql/RetailerCategoryQuery$CustomerNode;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final retailerCategoryNodes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/RetailerCategoryQuery$RetailerCategoryNode;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 14

    const/4 v0, 0x2

    .line 237
    new-array v1, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v2, "retailerCategoryNodes"

    const-string v3, "retailerCategoryNodes"

    new-instance v4, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v6, "filters"

    new-instance v7, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v7, v5}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v8, "ids"

    new-instance v9, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v9, v5}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v10, "ids"

    new-instance v11, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v11, v0}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v12, "kind"

    const-string v13, "Variable"

    .line 242
    invoke-virtual {v11, v12, v13}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v11

    const-string v12, "variableName"

    const-string v13, "categoryIds"

    .line 243
    invoke-virtual {v11, v12, v13}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v11

    .line 244
    invoke-virtual {v11}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v11

    .line 241
    invoke-virtual {v9, v10, v11}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v9

    .line 245
    invoke-virtual {v9}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v9

    .line 240
    invoke-virtual {v7, v8, v9}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v7

    .line 246
    invoke-virtual {v7}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v7

    .line 239
    invoke-virtual {v4, v6, v7}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v4

    .line 247
    invoke-virtual {v4}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v4

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    .line 238
    invoke-static {v2, v3, v4, v5, v6}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "customerNode"

    const-string v3, "customerNode"

    new-instance v4, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v4, v5}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v6, "filters"

    new-instance v7, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v7, v5}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v8, "id"

    new-instance v9, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v9, v0}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v0, "kind"

    const-string v10, "Variable"

    .line 251
    invoke-virtual {v9, v0, v10}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v0

    const-string v9, "variableName"

    const-string v10, "customerId"

    .line 252
    invoke-virtual {v0, v9, v10}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v0

    .line 253
    invoke-virtual {v0}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v0

    .line 250
    invoke-virtual {v7, v8, v0}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v0

    .line 254
    invoke-virtual {v0}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v0

    .line 249
    invoke-virtual {v4, v6, v0}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v0

    .line 255
    invoke-virtual {v0}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    .line 248
    invoke-static {v2, v3, v0, v5, v4}, Lcom/apollographql/apollo/api/ResponseField;->forObject(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v0

    aput-object v0, v1, v5

    sput-object v1, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lcom/ibotta/android/graphql/RetailerCategoryQuery$CustomerNode;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/graphql/RetailerCategoryQuery$CustomerNode;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/RetailerCategoryQuery$RetailerCategoryNode;",
            ">;",
            "Lcom/ibotta/android/graphql/RetailerCategoryQuery$CustomerNode;",
            ")V"
        }
    .end annotation

    .line 269
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 270
    iput-object p1, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;->retailerCategoryNodes:Ljava/util/List;

    .line 271
    iput-object p2, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;->customerNode:Lcom/ibotta/android/graphql/RetailerCategoryQuery$CustomerNode;

    return-void
.end method


# virtual methods
.method public customerNode()Lcom/ibotta/android/graphql/RetailerCategoryQuery$CustomerNode;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 285
    iget-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;->customerNode:Lcom/ibotta/android/graphql/RetailerCategoryQuery$CustomerNode;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 319
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 320
    check-cast p1, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;

    .line 321
    iget-object v1, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;->retailerCategoryNodes:Ljava/util/List;

    if-nez v1, :cond_1

    iget-object v1, p1, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;->retailerCategoryNodes:Ljava/util/List;

    if-nez v1, :cond_3

    goto :goto_0

    :cond_1
    iget-object v3, p1, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;->retailerCategoryNodes:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;->customerNode:Lcom/ibotta/android/graphql/RetailerCategoryQuery$CustomerNode;

    if-nez v1, :cond_2

    iget-object p1, p1, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;->customerNode:Lcom/ibotta/android/graphql/RetailerCategoryQuery$CustomerNode;

    if-nez p1, :cond_3

    goto :goto_1

    :cond_2
    iget-object p1, p1, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;->customerNode:Lcom/ibotta/android/graphql/RetailerCategoryQuery$CustomerNode;

    .line 322
    invoke-virtual {v1, p1}, Lcom/ibotta/android/graphql/RetailerCategoryQuery$CustomerNode;->equals(Ljava/lang/Object;)Z

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

    .line 329
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;->$hashCodeMemoized:Z

    if-nez v0, :cond_2

    .line 332
    iget-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;->retailerCategoryNodes:Ljava/util/List;

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

    .line 334
    iget-object v2, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;->customerNode:Lcom/ibotta/android/graphql/RetailerCategoryQuery$CustomerNode;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/ibotta/android/graphql/RetailerCategoryQuery$CustomerNode;->hashCode()I

    move-result v1

    :goto_1
    xor-int/2addr v0, v1

    .line 335
    iput v0, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;->$hashCode:I

    const/4 v0, 0x1

    .line 336
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;->$hashCodeMemoized:Z

    .line 338
    :cond_2
    iget v0, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;->$hashCode:I

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 289
    new-instance v0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data$1;-><init>(Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;)V

    return-object v0
.end method

.method public retailerCategoryNodes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/RetailerCategoryQuery$RetailerCategoryNode;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 278
    iget-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;->retailerCategoryNodes:Ljava/util/List;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 305
    iget-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 306
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Data{retailerCategoryNodes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;->retailerCategoryNodes:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", customerNode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;->customerNode:Lcom/ibotta/android/graphql/RetailerCategoryQuery$CustomerNode;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;->$toString:Ljava/lang/String;

    .line 311
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;->$toString:Ljava/lang/String;

    return-object v0
.end method
