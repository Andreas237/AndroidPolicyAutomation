.class public abstract Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestion;
.super Ljava/lang/Object;
.source "TypeAheadSuggestion.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Ljava/lang/String;Ljava/util/List;)Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestion;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/search/Highlight;",
            ">;)",
            "Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestion;"
        }
    .end annotation

    .line 17
    new-instance v0, Lcom/ibotta/android/graphql/search/typeahead/AutoValue_TypeAheadSuggestion;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/graphql/search/typeahead/AutoValue_TypeAheadSuggestion;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public abstract getHighlights()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/search/Highlight;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getSuggestedTerm()Ljava/lang/String;
.end method
