.class public final Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;
.super Ljava/lang/Object;
.source "OffersGraphQLQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/OffersGraphQLQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private includeAvailableRetailers:Z

.field private limit:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private offerIds:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;"
        }
    .end annotation
.end field

.field private products:Z

.field private retailerIds:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 111
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;->retailerIds:Lcom/apollographql/apollo/api/Input;

    .line 113
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;->offerIds:Lcom/apollographql/apollo/api/Input;

    .line 115
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;->limit:Lcom/apollographql/apollo/api/Input;

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/graphql/OffersGraphQLQuery;
    .locals 7

    .line 165
    new-instance v6, Lcom/ibotta/android/graphql/OffersGraphQLQuery;

    iget-object v1, p0, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;->retailerIds:Lcom/apollographql/apollo/api/Input;

    iget-object v2, p0, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;->offerIds:Lcom/apollographql/apollo/api/Input;

    iget-object v3, p0, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;->limit:Lcom/apollographql/apollo/api/Input;

    iget-boolean v4, p0, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;->products:Z

    iget-boolean v5, p0, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;->includeAvailableRetailers:Z

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/graphql/OffersGraphQLQuery;-><init>(Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;ZZ)V

    return-object v6
.end method

.method public includeAvailableRetailers(Z)Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;
    .locals 0

    .line 145
    iput-boolean p1, p0, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;->includeAvailableRetailers:Z

    return-object p0
.end method

.method public limit(Ljava/lang/Long;)Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 135
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;->limit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public limitInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;
    .locals 1
    .param p1    # Lcom/apollographql/apollo/api/Input;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;"
        }
    .end annotation

    const-string v0, "limit == null"

    .line 160
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;->limit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public offerIds(Ljava/util/List;)Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;"
        }
    .end annotation

    .line 130
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;->offerIds:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public offerIdsInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;
    .locals 1
    .param p1    # Lcom/apollographql/apollo/api/Input;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;)",
            "Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;"
        }
    .end annotation

    const-string v0, "offerIds == null"

    .line 155
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;->offerIds:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public products(Z)Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;
    .locals 0

    .line 140
    iput-boolean p1, p0, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;->products:Z

    return-object p0
.end method

.method public retailerIds(Ljava/util/List;)Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;"
        }
    .end annotation

    .line 125
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;->retailerIds:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public retailerIdsInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;
    .locals 1
    .param p1    # Lcom/apollographql/apollo/api/Input;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;)",
            "Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;"
        }
    .end annotation

    const-string v0, "retailerIds == null"

    .line 150
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;->retailerIds:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method
