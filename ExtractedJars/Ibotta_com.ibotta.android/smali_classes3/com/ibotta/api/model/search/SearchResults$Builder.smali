.class public abstract Lcom/ibotta/api/model/search/SearchResults$Builder;
.super Ljava/lang/Object;
.source "SearchResults.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/search/SearchResults;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract build()Lcom/ibotta/api/model/search/SearchResults;
.end method

.method public abstract hasExactResults(Z)Lcom/ibotta/api/model/search/SearchResults$Builder;
.end method

.method public abstract misspellingState(Lcom/ibotta/api/model/search/Misspelling;)Lcom/ibotta/api/model/search/SearchResults$Builder;
.end method

.method public abstract offerTagResults(Z)Lcom/ibotta/api/model/search/SearchResults$Builder;
.end method

.method public abstract retailerId(Ljava/lang/Integer;)Lcom/ibotta/api/model/search/SearchResults$Builder;
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract searchModules(Ljava/util/List;)Lcom/ibotta/api/model/search/SearchResults$Builder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/Module;",
            ">;)",
            "Lcom/ibotta/api/model/search/SearchResults$Builder;"
        }
    .end annotation
.end method

.method public abstract searchedTerm(Ljava/lang/String;)Lcom/ibotta/api/model/search/SearchResults$Builder;
.end method
