.class public Lcom/ibotta/android/graphql/OfferGraphQLQuery$Data;
.super Ljava/lang/Object;
.source "OfferGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/Operation$Data;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/OfferGraphQLQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Data"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/OfferGraphQLQuery$Data$Mapper;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;


# instance fields
.field private volatile $hashCode:I

.field private volatile $hashCodeMemoized:Z

.field private volatile $toString:Ljava/lang/String;

.field final offer:Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 10

    const/4 v0, 0x1

    .line 213
    new-array v1, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v2, "offer"

    const-string v3, "offer"

    new-instance v4, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    const/4 v5, 0x2

    invoke-direct {v4, v5}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v6, "id"

    new-instance v7, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v7, v5}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v8, "kind"

    const-string v9, "Variable"

    .line 216
    invoke-virtual {v7, v8, v9}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v7

    const-string v8, "variableName"

    const-string v9, "offerId"

    .line 217
    invoke-virtual {v7, v8, v9}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v7

    .line 218
    invoke-virtual {v7}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v7

    .line 215
    invoke-virtual {v4, v6, v7}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v4

    const-string v6, "ignoreTargeting"

    new-instance v7, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v7, v5}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v5, "kind"

    const-string v8, "Variable"

    .line 220
    invoke-virtual {v7, v5, v8}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v5

    const-string v7, "variableName"

    const-string v8, "ignoreTargeting"

    .line 221
    invoke-virtual {v5, v7, v8}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v5

    .line 222
    invoke-virtual {v5}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v5

    .line 219
    invoke-virtual {v4, v6, v5}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v4

    .line 223
    invoke-virtual {v4}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v4

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v5

    .line 214
    invoke-static {v2, v3, v4, v0, v5}, Lcom/apollographql/apollo/api/ResponseField;->forObject(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v0

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Data;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 234
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 235
    iput-object p1, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Data;->offer:Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 269
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Data;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 270
    check-cast p1, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Data;

    .line 271
    iget-object v1, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Data;->offer:Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer;

    if-nez v1, :cond_2

    iget-object p1, p1, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Data;->offer:Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer;

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    iget-object p1, p1, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Data;->offer:Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer;->equals(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    return v0

    :cond_3
    return v2
.end method

.method public hashCode()I
    .locals 2

    .line 278
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Data;->$hashCodeMemoized:Z

    if-nez v0, :cond_1

    const v0, 0xf4243

    .line 281
    iget-object v1, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Data;->offer:Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer;->hashCode()I

    move-result v1

    :goto_0
    xor-int/2addr v0, v1

    .line 282
    iput v0, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Data;->$hashCode:I

    const/4 v0, 0x1

    .line 283
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Data;->$hashCodeMemoized:Z

    .line 285
    :cond_1
    iget v0, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Data;->$hashCode:I

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 246
    new-instance v0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Data$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Data$1;-><init>(Lcom/ibotta/android/graphql/OfferGraphQLQuery$Data;)V

    return-object v0
.end method

.method public offer()Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 242
    iget-object v0, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Data;->offer:Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 256
    iget-object v0, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Data;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 257
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Data{offer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Data;->offer:Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Data;->$toString:Ljava/lang/String;

    .line 261
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Data;->$toString:Ljava/lang/String;

    return-object v0
.end method
