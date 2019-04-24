.class public abstract Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;
.super Ljava/lang/Object;
.source "SearchGraphQLParams.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/search/SearchGraphQLParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract build()Lcom/ibotta/android/graphql/search/SearchGraphQLParams;
.end method

.method public abstract correctSpelling(Z)Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;
.end method

.method public abstract fetchRelatedOffers(Z)Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;
.end method

.method public abstract relatedOfferResultLimit(J)Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;
.end method

.method public abstract retailerId(Ljava/lang/Long;)Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;
.end method

.method public abstract searchContentType(Ljava/util/Set;)Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/graphql/search/SearchContentType;",
            ">;)",
            "Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;"
        }
    .end annotation
.end method

.method public abstract searchResultLimit(J)Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;
.end method

.method public abstract term(Ljava/lang/String;)Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;
.end method
