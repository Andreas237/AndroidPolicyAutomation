.class public Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;
.super Ljava/lang/Object;
.source "BonusesGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/Operation$Data;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/BonusesGraphQLQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Data"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;


# instance fields
.field private volatile $hashCode:I

.field private volatile $hashCodeMemoized:Z

.field private volatile $toString:Ljava/lang/String;

.field final availableBonuses:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/BonusesGraphQLQuery$AvailableBonuse;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final completedBonuses:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/BonusesGraphQLQuery$CompletedBonuse;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final featuredBonusesModule:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 10

    const/4 v0, 0x3

    .line 247
    new-array v0, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v1, "availableBonuses"

    const-string v2, "availableBonuses"

    new-instance v3, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    const/4 v4, 0x2

    invoke-direct {v3, v4}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v5, "limit"

    new-instance v6, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v6, v4}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v7, "kind"

    const-string v8, "Variable"

    .line 250
    invoke-virtual {v6, v7, v8}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v6

    const-string v7, "variableName"

    const-string v8, "availableLimit"

    .line 251
    invoke-virtual {v6, v7, v8}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v6

    .line 252
    invoke-virtual {v6}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v6

    .line 249
    invoke-virtual {v3, v5, v6}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v3

    const-string v5, "retailerId"

    new-instance v6, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v6, v4}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v7, "kind"

    const-string v8, "Variable"

    .line 254
    invoke-virtual {v6, v7, v8}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v6

    const-string v7, "variableName"

    const-string v8, "retailerId"

    .line 255
    invoke-virtual {v6, v7, v8}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v6

    .line 256
    invoke-virtual {v6}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v6

    .line 253
    invoke-virtual {v3, v5, v6}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v3

    .line 257
    invoke-virtual {v3}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v3

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v5

    const/4 v6, 0x1

    .line 248
    invoke-static {v1, v2, v3, v6, v5}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "completedBonuses"

    const-string v2, "completedBonuses"

    new-instance v3, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v3, v6}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v5, "limit"

    new-instance v7, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v7, v4}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v8, "kind"

    const-string v9, "Variable"

    .line 260
    invoke-virtual {v7, v8, v9}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v7

    const-string v8, "variableName"

    const-string v9, "completedLimit"

    .line 261
    invoke-virtual {v7, v8, v9}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v7

    .line 262
    invoke-virtual {v7}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v7

    .line 259
    invoke-virtual {v3, v5, v7}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v3

    .line 263
    invoke-virtual {v3}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v3

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v5

    .line 258
    invoke-static {v1, v2, v3, v6, v5}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v6

    const-string v1, "featuredBonusesModule"

    const-string v2, "featuredBonusesModule"

    .line 264
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v5, 0x0

    invoke-static {v1, v2, v5, v6, v3}, Lcom/apollographql/apollo/api/ResponseField;->forObject(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v4

    sput-object v0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/BonusesGraphQLQuery$AvailableBonuse;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/BonusesGraphQLQuery$CompletedBonuse;",
            ">;",
            "Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;",
            ")V"
        }
    .end annotation

    .line 281
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 282
    iput-object p1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->availableBonuses:Ljava/util/List;

    .line 283
    iput-object p2, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->completedBonuses:Ljava/util/List;

    .line 284
    iput-object p3, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->featuredBonusesModule:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;

    return-void
.end method


# virtual methods
.method public availableBonuses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/BonusesGraphQLQuery$AvailableBonuse;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 291
    iget-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->availableBonuses:Ljava/util/List;

    return-object v0
.end method

.method public completedBonuses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/BonusesGraphQLQuery$CompletedBonuse;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 298
    iget-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->completedBonuses:Ljava/util/List;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 346
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    .line 347
    check-cast p1, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;

    .line 348
    iget-object v1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->availableBonuses:Ljava/util/List;

    if-nez v1, :cond_1

    iget-object v1, p1, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->availableBonuses:Ljava/util/List;

    if-nez v1, :cond_4

    goto :goto_0

    :cond_1
    iget-object v3, p1, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->availableBonuses:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->completedBonuses:Ljava/util/List;

    if-nez v1, :cond_2

    iget-object v1, p1, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->completedBonuses:Ljava/util/List;

    if-nez v1, :cond_4

    goto :goto_1

    :cond_2
    iget-object v3, p1, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->completedBonuses:Ljava/util/List;

    .line 349
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->featuredBonusesModule:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;

    if-nez v1, :cond_3

    iget-object p1, p1, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->featuredBonusesModule:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;

    if-nez p1, :cond_4

    goto :goto_2

    :cond_3
    iget-object p1, p1, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->featuredBonusesModule:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;

    .line 350
    invoke-virtual {v1, p1}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;->equals(Ljava/lang/Object;)Z

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

.method public featuredBonusesModule()Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 305
    iget-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->featuredBonusesModule:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 357
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->$hashCodeMemoized:Z

    if-nez v0, :cond_3

    .line 360
    iget-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->availableBonuses:Ljava/util/List;

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

    .line 362
    iget-object v3, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->completedBonuses:Ljava/util/List;

    if-nez v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    invoke-interface {v3}, Ljava/util/List;->hashCode()I

    move-result v3

    :goto_1
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 364
    iget-object v2, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->featuredBonusesModule:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;->hashCode()I

    move-result v1

    :goto_2
    xor-int/2addr v0, v1

    .line 365
    iput v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->$hashCode:I

    const/4 v0, 0x1

    .line 366
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->$hashCodeMemoized:Z

    .line 368
    :cond_3
    iget v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->$hashCode:I

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 309
    new-instance v0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$1;-><init>(Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 331
    iget-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 332
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Data{availableBonuses="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->availableBonuses:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", completedBonuses="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->completedBonuses:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", featuredBonusesModule="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->featuredBonusesModule:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->$toString:Ljava/lang/String;

    .line 338
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->$toString:Ljava/lang/String;

    return-object v0
.end method
