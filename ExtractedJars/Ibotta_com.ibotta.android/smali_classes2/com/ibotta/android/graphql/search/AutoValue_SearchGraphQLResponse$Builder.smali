.class final Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse$Builder;
.super Lcom/ibotta/android/graphql/search/SearchGraphQLResponse$Builder;
.source "AutoValue_SearchGraphQLResponse.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private misspelling:Lcom/ibotta/api/model/search/Misspelling;

.field private modules:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/Module;",
            ">;"
        }
    .end annotation
.end field

.field private relatedOffers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation
.end field

.field private searchedTerm:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 94
    invoke-direct {p0}, Lcom/ibotta/android/graphql/search/SearchGraphQLResponse$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;
    .locals 8

    const-string v0, ""

    .line 131
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse$Builder;->searchedTerm:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 132
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " searchedTerm"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 134
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse$Builder;->misspelling:Lcom/ibotta/api/model/search/Misspelling;

    if-nez v1, :cond_1

    .line 135
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " misspelling"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 137
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse$Builder;->modules:Ljava/util/List;

    if-nez v1, :cond_2

    .line 138
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " modules"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 140
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse$Builder;->relatedOffers:Ljava/util/List;

    if-nez v1, :cond_3

    .line 141
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " relatedOffers"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 143
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 146
    new-instance v0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse;

    iget-object v3, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse$Builder;->searchedTerm:Ljava/lang/String;

    iget-object v4, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse$Builder;->misspelling:Lcom/ibotta/api/model/search/Misspelling;

    iget-object v5, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse$Builder;->modules:Ljava/util/List;

    iget-object v6, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse$Builder;->relatedOffers:Ljava/util/List;

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse;-><init>(Ljava/lang/String;Lcom/ibotta/api/model/search/Misspelling;Ljava/util/List;Ljava/util/List;Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse$1;)V

    return-object v0

    .line 144
    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public misspelling(Lcom/ibotta/api/model/search/Misspelling;)Lcom/ibotta/android/graphql/search/SearchGraphQLResponse$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 109
    iput-object p1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse$Builder;->misspelling:Lcom/ibotta/api/model/search/Misspelling;

    return-object p0

    .line 107
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null misspelling"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public modules(Ljava/util/List;)Lcom/ibotta/android/graphql/search/SearchGraphQLResponse$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/Module;",
            ">;)",
            "Lcom/ibotta/android/graphql/search/SearchGraphQLResponse$Builder;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 117
    iput-object p1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse$Builder;->modules:Ljava/util/List;

    return-object p0

    .line 115
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null modules"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public relatedOffers(Ljava/util/List;)Lcom/ibotta/android/graphql/search/SearchGraphQLResponse$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)",
            "Lcom/ibotta/android/graphql/search/SearchGraphQLResponse$Builder;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 125
    iput-object p1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse$Builder;->relatedOffers:Ljava/util/List;

    return-object p0

    .line 123
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null relatedOffers"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public searchedTerm(Ljava/lang/String;)Lcom/ibotta/android/graphql/search/SearchGraphQLResponse$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 101
    iput-object p1, p0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse$Builder;->searchedTerm:Ljava/lang/String;

    return-object p0

    .line 99
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null searchedTerm"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
