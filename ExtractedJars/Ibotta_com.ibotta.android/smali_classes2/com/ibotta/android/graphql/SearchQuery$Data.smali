.class public Lcom/ibotta/android/graphql/SearchQuery$Data;
.super Ljava/lang/Object;
.source "SearchQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/Operation$Data;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/SearchQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Data"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/SearchQuery$Data$Mapper;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;


# instance fields
.field private volatile $hashCode:I

.field private volatile $hashCodeMemoized:Z

.field private volatile $toString:Ljava/lang/String;

.field final relatedOffers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/SearchQuery$RelatedOffer;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final search:Lcom/ibotta/android/graphql/SearchQuery$Search;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 10

    const/4 v0, 0x2

    .line 360
    new-array v1, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v2, "relatedOffers"

    const-string v3, "relatedOffers"

    new-instance v4, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    const/4 v5, 0x3

    invoke-direct {v4, v5}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v5, "limit"

    new-instance v6, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v6, v0}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v7, "kind"

    const-string v8, "Variable"

    .line 363
    invoke-virtual {v6, v7, v8}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v6

    const-string v7, "variableName"

    const-string v8, "relatedLimit"

    .line 364
    invoke-virtual {v6, v7, v8}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v6

    .line 365
    invoke-virtual {v6}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v6

    .line 362
    invoke-virtual {v4, v5, v6}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v4

    const-string v5, "upc"

    new-instance v6, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v6, v0}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v7, "kind"

    const-string v8, "Variable"

    .line 367
    invoke-virtual {v6, v7, v8}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v6

    const-string v7, "variableName"

    const-string v8, "term"

    .line 368
    invoke-virtual {v6, v7, v8}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v6

    .line 369
    invoke-virtual {v6}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v6

    .line 366
    invoke-virtual {v4, v5, v6}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v4

    const-string v5, "retailerId"

    new-instance v6, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v6, v0}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v7, "kind"

    const-string v8, "Variable"

    .line 371
    invoke-virtual {v6, v7, v8}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v6

    const-string v7, "variableName"

    const-string v8, "retailerId"

    .line 372
    invoke-virtual {v6, v7, v8}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v6

    .line 373
    invoke-virtual {v6}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v6

    .line 370
    invoke-virtual {v4, v5, v6}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v4

    .line 374
    invoke-virtual {v4}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v4

    const/4 v5, 0x1

    new-array v6, v5, [Lcom/apollographql/apollo/api/ResponseField$Condition;

    const-string v7, "fetchRelatedOffers"

    const/4 v8, 0x0

    invoke-static {v7, v8}, Lcom/apollographql/apollo/api/ResponseField$Condition;->booleanCondition(Ljava/lang/String;Z)Lcom/apollographql/apollo/api/ResponseField$BooleanCondition;

    move-result-object v7

    aput-object v7, v6, v8

    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    .line 361
    invoke-static {v2, v3, v4, v5, v6}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v2

    aput-object v2, v1, v8

    const-string v2, "search"

    const-string v3, "search"

    new-instance v4, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    const/4 v6, 0x5

    invoke-direct {v4, v6}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v6, "correctSpelling"

    new-instance v7, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v7, v0}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v8, "kind"

    const-string v9, "Variable"

    .line 377
    invoke-virtual {v7, v8, v9}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v7

    const-string v8, "variableName"

    const-string v9, "correctSpelling"

    .line 378
    invoke-virtual {v7, v8, v9}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v7

    .line 379
    invoke-virtual {v7}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v7

    .line 376
    invoke-virtual {v4, v6, v7}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v4

    const-string v6, "limit"

    new-instance v7, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v7, v0}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v8, "kind"

    const-string v9, "Variable"

    .line 381
    invoke-virtual {v7, v8, v9}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v7

    const-string v8, "variableName"

    const-string v9, "searchLimit"

    .line 382
    invoke-virtual {v7, v8, v9}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v7

    .line 383
    invoke-virtual {v7}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v7

    .line 380
    invoke-virtual {v4, v6, v7}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v4

    const-string v6, "term"

    new-instance v7, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v7, v0}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v8, "kind"

    const-string v9, "Variable"

    .line 385
    invoke-virtual {v7, v8, v9}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v7

    const-string v8, "variableName"

    const-string v9, "term"

    .line 386
    invoke-virtual {v7, v8, v9}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v7

    .line 387
    invoke-virtual {v7}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v7

    .line 384
    invoke-virtual {v4, v6, v7}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v4

    const-string v6, "retailerId"

    new-instance v7, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v7, v0}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v8, "kind"

    const-string v9, "Variable"

    .line 389
    invoke-virtual {v7, v8, v9}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v7

    const-string v8, "variableName"

    const-string v9, "retailerId"

    .line 390
    invoke-virtual {v7, v8, v9}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v7

    .line 391
    invoke-virtual {v7}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v7

    .line 388
    invoke-virtual {v4, v6, v7}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v4

    const-string v6, "contentTypes"

    new-instance v7, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    invoke-direct {v7, v0}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;-><init>(I)V

    const-string v0, "kind"

    const-string v8, "Variable"

    .line 393
    invoke-virtual {v7, v0, v8}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v0

    const-string v7, "variableName"

    const-string v8, "contentTypes"

    .line 394
    invoke-virtual {v0, v7, v8}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v0

    .line 395
    invoke-virtual {v0}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v0

    .line 392
    invoke-virtual {v4, v6, v0}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;

    move-result-object v0

    .line 396
    invoke-virtual {v0}, Lcom/apollographql/apollo/api/internal/UnmodifiableMapBuilder;->build()Ljava/util/Map;

    move-result-object v0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    .line 375
    invoke-static {v2, v3, v0, v5, v4}, Lcom/apollographql/apollo/api/ResponseField;->forObject(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v0

    aput-object v0, v1, v5

    sput-object v1, Lcom/ibotta/android/graphql/SearchQuery$Data;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lcom/ibotta/android/graphql/SearchQuery$Search;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/graphql/SearchQuery$Search;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/SearchQuery$RelatedOffer;",
            ">;",
            "Lcom/ibotta/android/graphql/SearchQuery$Search;",
            ")V"
        }
    .end annotation

    .line 409
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 410
    iput-object p1, p0, Lcom/ibotta/android/graphql/SearchQuery$Data;->relatedOffers:Ljava/util/List;

    .line 411
    iput-object p2, p0, Lcom/ibotta/android/graphql/SearchQuery$Data;->search:Lcom/ibotta/android/graphql/SearchQuery$Search;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 459
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/SearchQuery$Data;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 460
    check-cast p1, Lcom/ibotta/android/graphql/SearchQuery$Data;

    .line 461
    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Data;->relatedOffers:Ljava/util/List;

    if-nez v1, :cond_1

    iget-object v1, p1, Lcom/ibotta/android/graphql/SearchQuery$Data;->relatedOffers:Ljava/util/List;

    if-nez v1, :cond_3

    goto :goto_0

    :cond_1
    iget-object v3, p1, Lcom/ibotta/android/graphql/SearchQuery$Data;->relatedOffers:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Data;->search:Lcom/ibotta/android/graphql/SearchQuery$Search;

    if-nez v1, :cond_2

    iget-object p1, p1, Lcom/ibotta/android/graphql/SearchQuery$Data;->search:Lcom/ibotta/android/graphql/SearchQuery$Search;

    if-nez p1, :cond_3

    goto :goto_1

    :cond_2
    iget-object p1, p1, Lcom/ibotta/android/graphql/SearchQuery$Data;->search:Lcom/ibotta/android/graphql/SearchQuery$Search;

    .line 462
    invoke-virtual {v1, p1}, Lcom/ibotta/android/graphql/SearchQuery$Search;->equals(Ljava/lang/Object;)Z

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

    .line 469
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Data;->$hashCodeMemoized:Z

    if-nez v0, :cond_2

    .line 472
    iget-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Data;->relatedOffers:Ljava/util/List;

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

    .line 474
    iget-object v2, p0, Lcom/ibotta/android/graphql/SearchQuery$Data;->search:Lcom/ibotta/android/graphql/SearchQuery$Search;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/ibotta/android/graphql/SearchQuery$Search;->hashCode()I

    move-result v1

    :goto_1
    xor-int/2addr v0, v1

    .line 475
    iput v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Data;->$hashCode:I

    const/4 v0, 0x1

    .line 476
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Data;->$hashCodeMemoized:Z

    .line 478
    :cond_2
    iget v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Data;->$hashCode:I

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 429
    new-instance v0, Lcom/ibotta/android/graphql/SearchQuery$Data$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/SearchQuery$Data$1;-><init>(Lcom/ibotta/android/graphql/SearchQuery$Data;)V

    return-object v0
.end method

.method public relatedOffers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/SearchQuery$RelatedOffer;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 418
    iget-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Data;->relatedOffers:Ljava/util/List;

    return-object v0
.end method

.method public search()Lcom/ibotta/android/graphql/SearchQuery$Search;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 425
    iget-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Data;->search:Lcom/ibotta/android/graphql/SearchQuery$Search;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 445
    iget-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Data;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 446
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Data{relatedOffers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Data;->relatedOffers:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", search="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/SearchQuery$Data;->search:Lcom/ibotta/android/graphql/SearchQuery$Search;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Data;->$toString:Ljava/lang/String;

    .line 451
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Data;->$toString:Ljava/lang/String;

    return-object v0
.end method
