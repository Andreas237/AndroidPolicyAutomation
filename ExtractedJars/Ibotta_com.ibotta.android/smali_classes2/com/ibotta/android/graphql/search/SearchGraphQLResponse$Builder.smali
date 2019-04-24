.class public abstract Lcom/ibotta/android/graphql/search/SearchGraphQLResponse$Builder;
.super Ljava/lang/Object;
.source "SearchGraphQLResponse.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract build()Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;
.end method

.method public abstract misspelling(Lcom/ibotta/api/model/search/Misspelling;)Lcom/ibotta/android/graphql/search/SearchGraphQLResponse$Builder;
.end method

.method public abstract modules(Ljava/util/List;)Lcom/ibotta/android/graphql/search/SearchGraphQLResponse$Builder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/Module;",
            ">;)",
            "Lcom/ibotta/android/graphql/search/SearchGraphQLResponse$Builder;"
        }
    .end annotation
.end method

.method public abstract relatedOffers(Ljava/util/List;)Lcom/ibotta/android/graphql/search/SearchGraphQLResponse$Builder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)",
            "Lcom/ibotta/android/graphql/search/SearchGraphQLResponse$Builder;"
        }
    .end annotation
.end method

.method public abstract searchedTerm(Ljava/lang/String;)Lcom/ibotta/android/graphql/search/SearchGraphQLResponse$Builder;
.end method
