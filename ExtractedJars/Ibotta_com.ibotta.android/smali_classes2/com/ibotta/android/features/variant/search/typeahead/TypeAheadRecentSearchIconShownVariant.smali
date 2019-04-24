.class public Lcom/ibotta/android/features/variant/search/typeahead/TypeAheadRecentSearchIconShownVariant;
.super Ljava/lang/Object;
.source "TypeAheadRecentSearchIconShownVariant.java"

# interfaces
.implements Lcom/ibotta/android/features/ExperimentalVariant;
.implements Lcom/ibotta/android/features/variant/search/typeahead/TypeAheadRecentSearchIconVariant;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isRecentIconShown(Lcom/ibotta/api/model/search/SuggestedSearchItem;)Z
    .locals 1

    .line 14
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SuggestedSearchItem;->getSearchType()Lcom/ibotta/api/model/search/SearchType;

    move-result-object p1

    sget-object v0, Lcom/ibotta/api/model/search/SearchType;->RECENT:Lcom/ibotta/api/model/search/SearchType;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
