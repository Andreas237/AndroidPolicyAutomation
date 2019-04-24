.class final Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;
.super Lcom/ibotta/android/graphql/search/SearchGraphQLParams;
.source "AutoValue_SearchGraphQLParams.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams$Builder;
    }
.end annotation


# instance fields
.field private final correctSpelling:Z

.field private final fetchRelatedOffers:Z

.field private final relatedOfferResultLimit:J

.field private final retailerId:Ljava/lang/Long;

.field private final searchContentType:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ibotta/android/graphql/search/SearchContentType;",
            ">;"
        }
    .end annotation
.end field

.field private final searchResultLimit:J

.field private final term:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;JJZZLjava/lang/Long;Ljava/util/Set;)V
    .locals 0
    .param p8    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JJZZ",
            "Ljava/lang/Long;",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/graphql/search/SearchContentType;",
            ">;)V"
        }
    .end annotation

    .line 27
    invoke-direct {p0}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->term:Ljava/lang/String;

    .line 29
    iput-wide p2, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->searchResultLimit:J

    .line 30
    iput-wide p4, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->relatedOfferResultLimit:J

    .line 31
    iput-boolean p6, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->fetchRelatedOffers:Z

    .line 32
    iput-boolean p7, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->correctSpelling:Z

    .line 33
    iput-object p8, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->retailerId:Ljava/lang/Long;

    .line 34
    iput-object p9, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->searchContentType:Ljava/util/Set;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;JJZZLjava/lang/Long;Ljava/util/Set;Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams$1;)V
    .locals 0

    .line 10
    invoke-direct/range {p0 .. p9}, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;-><init>(Ljava/lang/String;JJZZLjava/lang/Long;Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 91
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/search/SearchGraphQLParams;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 92
    check-cast p1, Lcom/ibotta/android/graphql/search/SearchGraphQLParams;

    .line 93
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->term:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams;->getTerm()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-wide v3, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->searchResultLimit:J

    .line 94
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams;->getSearchResultLimit()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-wide v3, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->relatedOfferResultLimit:J

    .line 95
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams;->getRelatedOfferResultLimit()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-boolean v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->fetchRelatedOffers:Z

    .line 96
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams;->getFetchRelatedOffers()Z

    move-result v3

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->correctSpelling:Z

    .line 97
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams;->getCorrectSpelling()Z

    move-result v3

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->retailerId:Ljava/lang/Long;

    if-nez v1, :cond_1

    .line 98
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams;->getRetailerId()Ljava/lang/Long;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams;->getRetailerId()Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->searchContentType:Ljava/util/Set;

    .line 99
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams;->getSearchContentType()Ljava/util/Set;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return v0

    :cond_3
    return v2
.end method

.method public getCorrectSpelling()Z
    .locals 1

    .line 59
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->correctSpelling:Z

    return v0
.end method

.method public getFetchRelatedOffers()Z
    .locals 1

    .line 54
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->fetchRelatedOffers:Z

    return v0
.end method

.method public getRelatedOfferResultLimit()J
    .locals 2

    .line 49
    iget-wide v0, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->relatedOfferResultLimit:J

    return-wide v0
.end method

.method public getRetailerId()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->retailerId:Ljava/lang/Long;

    return-object v0
.end method

.method public getSearchContentType()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/graphql/search/SearchContentType;",
            ">;"
        }
    .end annotation

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->searchContentType:Ljava/util/Set;

    return-object v0
.end method

.method public getSearchResultLimit()J
    .locals 2

    .line 44
    iget-wide v0, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->searchResultLimit:J

    return-wide v0
.end method

.method public getTerm()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->term:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 7

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->term:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 110
    iget-wide v2, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->searchResultLimit:J

    const/16 v4, 0x20

    ushr-long v5, v2, v4

    xor-long/2addr v2, v5

    long-to-int v3, v2

    xor-int/2addr v0, v3

    mul-int v0, v0, v1

    .line 112
    iget-wide v2, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->relatedOfferResultLimit:J

    ushr-long v4, v2, v4

    xor-long/2addr v2, v4

    long-to-int v3, v2

    xor-int/2addr v0, v3

    mul-int v0, v0, v1

    .line 114
    iget-boolean v2, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->fetchRelatedOffers:Z

    const/16 v3, 0x4cf

    const/16 v4, 0x4d5

    if-eqz v2, :cond_0

    const/16 v2, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v2, 0x4d5

    :goto_0
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 116
    iget-boolean v2, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->correctSpelling:Z

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    const/16 v3, 0x4d5

    :goto_1
    xor-int/2addr v0, v3

    mul-int v0, v0, v1

    .line 118
    iget-object v2, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->retailerId:Ljava/lang/Long;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_2
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 120
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->searchContentType:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SearchGraphQLParams{term="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->term:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", searchResultLimit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->searchResultLimit:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", relatedOfferResultLimit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->relatedOfferResultLimit:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", fetchRelatedOffers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->fetchRelatedOffers:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", correctSpelling="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->correctSpelling:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", retailerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->retailerId:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", searchContentType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams;->searchContentType:Ljava/util/Set;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
