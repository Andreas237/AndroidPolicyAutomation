.class final Lcom/ibotta/android/graphql/search/offertag/AutoValue_OfferTagSearchGraphQLResponse;
.super Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLResponse;
.source "AutoValue_OfferTagSearchGraphQLResponse.java"


# instance fields
.field private final offerTagResults:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation
.end field

.field private final searchedTerm:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLResponse;-><init>()V

    if-eqz p1, :cond_1

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/graphql/search/offertag/AutoValue_OfferTagSearchGraphQLResponse;->searchedTerm:Ljava/lang/String;

    if-eqz p2, :cond_0

    .line 25
    iput-object p2, p0, Lcom/ibotta/android/graphql/search/offertag/AutoValue_OfferTagSearchGraphQLResponse;->offerTagResults:Ljava/util/List;

    return-void

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null offerTagResults"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 19
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null searchedTerm"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 51
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLResponse;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 52
    check-cast p1, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLResponse;

    .line 53
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/offertag/AutoValue_OfferTagSearchGraphQLResponse;->searchedTerm:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLResponse;->getSearchedTerm()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/graphql/search/offertag/AutoValue_OfferTagSearchGraphQLResponse;->offerTagResults:Ljava/util/List;

    .line 54
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLResponse;->getOfferTagResults()Ljava/util/List;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

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

.method public getOfferTagResults()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/graphql/search/offertag/AutoValue_OfferTagSearchGraphQLResponse;->offerTagResults:Ljava/util/List;

    return-object v0
.end method

.method public getSearchedTerm()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/graphql/search/offertag/AutoValue_OfferTagSearchGraphQLResponse;->searchedTerm:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/graphql/search/offertag/AutoValue_OfferTagSearchGraphQLResponse;->searchedTerm:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 65
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/offertag/AutoValue_OfferTagSearchGraphQLResponse;->offerTagResults:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OfferTagSearchGraphQLResponse{searchedTerm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/search/offertag/AutoValue_OfferTagSearchGraphQLResponse;->searchedTerm:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", offerTagResults="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/search/offertag/AutoValue_OfferTagSearchGraphQLResponse;->offerTagResults:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
