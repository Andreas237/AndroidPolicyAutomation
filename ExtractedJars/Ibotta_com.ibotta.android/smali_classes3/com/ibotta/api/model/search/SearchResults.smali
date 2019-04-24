.class public abstract Lcom/ibotta/api/model/search/SearchResults;
.super Ljava/lang/Object;
.source "SearchResults.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/search/SearchResults$Builder;
    }
.end annotation


# static fields
.field public static EMPTY:Lcom/ibotta/api/model/search/SearchResults;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 16
    invoke-static {}, Lcom/ibotta/api/model/search/SearchResults;->builder()Lcom/ibotta/api/model/search/SearchResults$Builder;

    move-result-object v0

    const-string v1, ""

    .line 17
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/search/SearchResults$Builder;->searchedTerm(Ljava/lang/String;)Lcom/ibotta/api/model/search/SearchResults$Builder;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/search/Misspelling;->EMPTY:Lcom/ibotta/api/model/search/Misspelling;

    .line 18
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/search/SearchResults$Builder;->misspellingState(Lcom/ibotta/api/model/search/Misspelling;)Lcom/ibotta/api/model/search/SearchResults$Builder;

    move-result-object v0

    .line 19
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/search/SearchResults$Builder;->searchModules(Ljava/util/List;)Lcom/ibotta/api/model/search/SearchResults$Builder;

    move-result-object v0

    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/search/SearchResults$Builder;->hasExactResults(Z)Lcom/ibotta/api/model/search/SearchResults$Builder;

    move-result-object v0

    .line 21
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/search/SearchResults$Builder;->offerTagResults(Z)Lcom/ibotta/api/model/search/SearchResults$Builder;

    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lcom/ibotta/api/model/search/SearchResults$Builder;->build()Lcom/ibotta/api/model/search/SearchResults;

    move-result-object v0

    sput-object v0, Lcom/ibotta/api/model/search/SearchResults;->EMPTY:Lcom/ibotta/api/model/search/SearchResults;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/api/model/search/SearchResults$Builder;
    .locals 1

    .line 32
    new-instance v0, Lcom/ibotta/api/model/search/AutoValue_SearchResults$Builder;

    invoke-direct {v0}, Lcom/ibotta/api/model/search/AutoValue_SearchResults$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract getMisspellingState()Lcom/ibotta/api/model/search/Misspelling;
.end method

.method public abstract getRetailerId()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getSearchModules()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/Module;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getSearchedTerm()Ljava/lang/String;
.end method

.method public abstract isHasExactResults()Z
.end method

.method public abstract isOfferTagResults()Z
.end method
