.class public abstract Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionResponse;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;
.source "TypeAheadSuggestionResponse.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;-><init>()V

    return-void
.end method

.method public static create(Ljava/util/List;)Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestion;",
            ">;)",
            "Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionResponse;"
        }
    .end annotation

    .line 17
    new-instance v0, Lcom/ibotta/android/graphql/search/typeahead/AutoValue_TypeAheadSuggestionResponse;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/search/typeahead/AutoValue_TypeAheadSuggestionResponse;-><init>(Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public abstract getSuggestions()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestion;",
            ">;"
        }
    .end annotation
.end method
