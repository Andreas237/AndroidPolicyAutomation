.class final Lcom/ibotta/android/graphql/search/typeahead/AutoValue_TypeAheadSuggestionResponse;
.super Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionResponse;
.source "AutoValue_TypeAheadSuggestionResponse.java"


# instance fields
.field private final suggestions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestion;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestion;",
            ">;)V"
        }
    .end annotation

    .line 14
    invoke-direct {p0}, Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionResponse;-><init>()V

    if-eqz p1, :cond_0

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/graphql/search/typeahead/AutoValue_TypeAheadSuggestionResponse;->suggestions:Ljava/util/List;

    return-void

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null suggestions"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 38
    :cond_0
    instance-of v0, p1, Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionResponse;

    if-eqz v0, :cond_1

    .line 39
    check-cast p1, Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionResponse;

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/graphql/search/typeahead/AutoValue_TypeAheadSuggestionResponse;->suggestions:Ljava/util/List;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionResponse;->getSuggestions()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public getSuggestions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestion;",
            ">;"
        }
    .end annotation

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/graphql/search/typeahead/AutoValue_TypeAheadSuggestionResponse;->suggestions:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/graphql/search/typeahead/AutoValue_TypeAheadSuggestionResponse;->suggestions:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TypeAheadSuggestionResponse{suggestions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/search/typeahead/AutoValue_TypeAheadSuggestionResponse;->suggestions:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
