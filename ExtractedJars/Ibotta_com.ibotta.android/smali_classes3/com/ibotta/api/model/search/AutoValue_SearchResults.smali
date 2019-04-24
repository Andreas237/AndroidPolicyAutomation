.class final Lcom/ibotta/api/model/search/AutoValue_SearchResults;
.super Lcom/ibotta/api/model/search/SearchResults;
.source "AutoValue_SearchResults.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/search/AutoValue_SearchResults$Builder;
    }
.end annotation


# instance fields
.field private final hasExactResults:Z

.field private final misspellingState:Lcom/ibotta/api/model/search/Misspelling;

.field private final offerTagResults:Z

.field private final retailerId:Ljava/lang/Integer;

.field private final searchModules:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/Module;",
            ">;"
        }
    .end annotation
.end field

.field private final searchedTerm:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/Integer;Lcom/ibotta/api/model/search/Misspelling;Ljava/util/List;ZZ)V
    .locals 0
    .param p2    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/api/model/search/Misspelling;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/Module;",
            ">;ZZ)V"
        }
    .end annotation

    .line 26
    invoke-direct {p0}, Lcom/ibotta/api/model/search/SearchResults;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->searchedTerm:Ljava/lang/String;

    .line 28
    iput-object p2, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->retailerId:Ljava/lang/Integer;

    .line 29
    iput-object p3, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->misspellingState:Lcom/ibotta/api/model/search/Misspelling;

    .line 30
    iput-object p4, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->searchModules:Ljava/util/List;

    .line 31
    iput-boolean p5, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->offerTagResults:Z

    .line 32
    iput-boolean p6, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->hasExactResults:Z

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Integer;Lcom/ibotta/api/model/search/Misspelling;Ljava/util/List;ZZLcom/ibotta/api/model/search/AutoValue_SearchResults$1;)V
    .locals 0

    .line 11
    invoke-direct/range {p0 .. p6}, Lcom/ibotta/api/model/search/AutoValue_SearchResults;-><init>(Ljava/lang/String;Ljava/lang/Integer;Lcom/ibotta/api/model/search/Misspelling;Ljava/util/List;ZZ)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 83
    :cond_0
    instance-of v1, p1, Lcom/ibotta/api/model/search/SearchResults;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 84
    check-cast p1, Lcom/ibotta/api/model/search/SearchResults;

    .line 85
    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->searchedTerm:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SearchResults;->getSearchedTerm()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->retailerId:Ljava/lang/Integer;

    if-nez v1, :cond_1

    .line 86
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SearchResults;->getRetailerId()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SearchResults;->getRetailerId()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :goto_0
    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->misspellingState:Lcom/ibotta/api/model/search/Misspelling;

    .line 87
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SearchResults;->getMisspellingState()Lcom/ibotta/api/model/search/Misspelling;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->searchModules:Ljava/util/List;

    .line 88
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SearchResults;->getSearchModules()Ljava/util/List;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->offerTagResults:Z

    .line 89
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SearchResults;->isOfferTagResults()Z

    move-result v3

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->hasExactResults:Z

    .line 90
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SearchResults;->isHasExactResults()Z

    move-result p1

    if-ne v1, p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return v0

    :cond_3
    return v2
.end method

.method public getMisspellingState()Lcom/ibotta/api/model/search/Misspelling;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->misspellingState:Lcom/ibotta/api/model/search/Misspelling;

    return-object v0
.end method

.method public getRetailerId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 43
    iget-object v0, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->retailerId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getSearchModules()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/Module;",
            ">;"
        }
    .end annotation

    .line 53
    iget-object v0, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->searchModules:Ljava/util/List;

    return-object v0
.end method

.method public getSearchedTerm()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->searchedTerm:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    .line 99
    iget-object v0, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->searchedTerm:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 101
    iget-object v2, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->retailerId:Ljava/lang/Integer;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    :goto_0
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 103
    iget-object v2, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->misspellingState:Lcom/ibotta/api/model/search/Misspelling;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 105
    iget-object v2, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->searchModules:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 107
    iget-boolean v2, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->offerTagResults:Z

    const/16 v3, 0x4cf

    const/16 v4, 0x4d5

    if-eqz v2, :cond_1

    const/16 v2, 0x4cf

    goto :goto_1

    :cond_1
    const/16 v2, 0x4d5

    :goto_1
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 109
    iget-boolean v1, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->hasExactResults:Z

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    const/16 v3, 0x4d5

    :goto_2
    xor-int/2addr v0, v3

    return v0
.end method

.method public isHasExactResults()Z
    .locals 1

    .line 63
    iget-boolean v0, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->hasExactResults:Z

    return v0
.end method

.method public isOfferTagResults()Z
    .locals 1

    .line 58
    iget-boolean v0, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->offerTagResults:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SearchResults{searchedTerm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->searchedTerm:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", retailerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->retailerId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", misspellingState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->misspellingState:Lcom/ibotta/api/model/search/Misspelling;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", searchModules="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->searchModules:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", offerTagResults="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->offerTagResults:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", hasExactResults="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/api/model/search/AutoValue_SearchResults;->hasExactResults:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
