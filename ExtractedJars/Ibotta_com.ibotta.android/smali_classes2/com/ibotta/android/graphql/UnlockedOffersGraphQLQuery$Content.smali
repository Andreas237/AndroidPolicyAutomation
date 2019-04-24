.class public Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content;
.super Ljava/lang/Object;
.source "UnlockedOffersGraphQLQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Content"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content$Mapper;,
        Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content$Fragments;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;


# instance fields
.field private volatile $hashCode:I

.field private volatile $hashCodeMemoized:Z

.field private volatile $toString:Ljava/lang/String;

.field final __typename:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field private final fragments:Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content$Fragments;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x2

    .line 390
    new-array v0, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v1, "__typename"

    const-string v2, "__typename"

    .line 391
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v4

    const-string v1, "__typename"

    const-string v2, "__typename"

    const-string v3, "Offer"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    .line 392
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/apollographql/apollo/api/ResponseField;->forFragment(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content$Fragments;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content$Fragments;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 405
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "__typename == null"

    .line 406
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content;->__typename:Ljava/lang/String;

    const-string p1, "fragments == null"

    .line 407
    invoke-static {p2, p1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content$Fragments;

    iput-object p1, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content;->fragments:Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content$Fragments;

    return-void
.end method

.method static synthetic access$300(Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content;)Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content$Fragments;
    .locals 0

    .line 389
    iget-object p0, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content;->fragments:Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content$Fragments;

    return-object p0
.end method


# virtual methods
.method public __typename()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 411
    iget-object v0, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content;->__typename:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 444
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 445
    check-cast p1, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content;

    .line 446
    iget-object v1, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content;->__typename:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content;->__typename:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content;->fragments:Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content$Fragments;

    iget-object p1, p1, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content;->fragments:Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content$Fragments;

    .line 447
    invoke-virtual {v1, p1}, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content$Fragments;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public fragments()Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content$Fragments;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 415
    iget-object v0, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content;->fragments:Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content$Fragments;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 454
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content;->$hashCodeMemoized:Z

    if-nez v0, :cond_0

    .line 457
    iget-object v0, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content;->__typename:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 459
    iget-object v1, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content;->fragments:Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content$Fragments;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content$Fragments;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    .line 460
    iput v0, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content;->$hashCode:I

    const/4 v0, 0x1

    .line 461
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content;->$hashCodeMemoized:Z

    .line 463
    :cond_0
    iget v0, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content;->$hashCode:I

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 419
    new-instance v0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content$1;-><init>(Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 430
    iget-object v0, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 431
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Content{__typename="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content;->__typename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", fragments="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content;->fragments:Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content$Fragments;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content;->$toString:Ljava/lang/String;

    .line 436
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content;->$toString:Ljava/lang/String;

    return-object v0
.end method
