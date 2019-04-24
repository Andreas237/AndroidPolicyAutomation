.class public abstract Lcom/ibotta/android/graphql/search/SearchGraphQLParams;
.super Ljava/lang/Object;
.source "SearchGraphQLParams.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;
    .locals 2

    .line 23
    new-instance v0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams$Builder;-><init>()V

    const/4 v1, 0x0

    .line 24
    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLParams$Builder;->correctSpelling(Z)Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract getCorrectSpelling()Z
.end method

.method public abstract getFetchRelatedOffers()Z
.end method

.method public abstract getRelatedOfferResultLimit()J
.end method

.method public abstract getRetailerId()Ljava/lang/Long;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getSearchContentType()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/graphql/search/SearchContentType;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getSearchResultLimit()J
.end method

.method public abstract getTerm()Ljava/lang/String;
.end method
