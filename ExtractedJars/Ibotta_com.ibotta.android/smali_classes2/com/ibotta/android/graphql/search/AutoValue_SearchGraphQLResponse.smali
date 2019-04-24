.class final Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse;
.super Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;
.source "AutoValue_SearchGraphQLResponse.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse$Builder;
    }
.end annotation


# instance fields
.field private final misspelling:Lcom/ibotta/api/model/search/Misspelling;

.field private final modules:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/Module;",
            ">;"
        }
    .end annotation
.end field

.field private final relatedOffers:Ljava/util/List;
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
.method private constructor <init>(Ljava/lang/String;Lcom/ibotta/api/model/search/Misspelling;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/ibotta/api/model/search/Misspelling;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/Module;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)V"
        }
    .end annotation

    .line 23
    invoke-direct {p0}, Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse;->searchedTerm:Ljava/lang/String;

    .line 25
    iput-object p2, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse;->misspelling:Lcom/ibotta/api/model/search/Misspelling;

    .line 26
    iput-object p3, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse;->modules:Ljava/util/List;

    .line 27
    iput-object p4, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse;->relatedOffers:Ljava/util/List;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lcom/ibotta/api/model/search/Misspelling;Ljava/util/List;Ljava/util/List;Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse$1;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse;-><init>(Ljava/lang/String;Lcom/ibotta/api/model/search/Misspelling;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 65
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 66
    check-cast p1, Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;

    .line 67
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse;->searchedTerm:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;->getSearchedTerm()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse;->misspelling:Lcom/ibotta/api/model/search/Misspelling;

    .line 68
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;->getMisspelling()Lcom/ibotta/api/model/search/Misspelling;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse;->modules:Ljava/util/List;

    .line 69
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;->getModules()Ljava/util/List;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse;->relatedOffers:Ljava/util/List;

    .line 70
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;->getRelatedOffers()Ljava/util/List;

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

.method public getMisspelling()Lcom/ibotta/api/model/search/Misspelling;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse;->misspelling:Lcom/ibotta/api/model/search/Misspelling;

    return-object v0
.end method

.method public getModules()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/Module;",
            ">;"
        }
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse;->modules:Ljava/util/List;

    return-object v0
.end method

.method public getRelatedOffers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse;->relatedOffers:Ljava/util/List;

    return-object v0
.end method

.method public getSearchedTerm()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse;->searchedTerm:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse;->searchedTerm:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 81
    iget-object v2, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse;->misspelling:Lcom/ibotta/api/model/search/Misspelling;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 83
    iget-object v2, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse;->modules:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 85
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse;->relatedOffers:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SearchGraphQLResponse{searchedTerm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse;->searchedTerm:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", misspelling="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse;->misspelling:Lcom/ibotta/api/model/search/Misspelling;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", modules="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse;->modules:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", relatedOffers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse;->relatedOffers:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
