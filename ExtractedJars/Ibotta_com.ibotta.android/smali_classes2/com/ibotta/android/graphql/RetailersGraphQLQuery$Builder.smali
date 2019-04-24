.class public final Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Builder;
.super Ljava/lang/Object;
.source "RetailersGraphQLQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/RetailersGraphQLQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private nearbyOnly:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private retailerIds:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Builder;->retailerIds:Lcom/apollographql/apollo/api/Input;

    .line 114
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Builder;->nearbyOnly:Lcom/apollographql/apollo/api/Input;

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/graphql/RetailersGraphQLQuery;
    .locals 3

    .line 140
    new-instance v0, Lcom/ibotta/android/graphql/RetailersGraphQLQuery;

    iget-object v1, p0, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Builder;->retailerIds:Lcom/apollographql/apollo/api/Input;

    iget-object v2, p0, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Builder;->nearbyOnly:Lcom/apollographql/apollo/api/Input;

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/graphql/RetailersGraphQLQuery;-><init>(Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;)V

    return-object v0
.end method

.method public nearbyOnly(Ljava/lang/Boolean;)Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 125
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Builder;->nearbyOnly:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public nearbyOnlyInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Builder;
    .locals 1
    .param p1    # Lcom/apollographql/apollo/api/Input;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Builder;"
        }
    .end annotation

    const-string v0, "nearbyOnly == null"

    .line 135
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Builder;->nearbyOnly:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public retailerIds(Ljava/util/List;)Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Builder;
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Builder;"
        }
    .end annotation

    .line 120
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Builder;->retailerIds:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public retailerIdsInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Builder;
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
            "Ljava/lang/String;",
            ">;>;)",
            "Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Builder;"
        }
    .end annotation

    const-string v0, "retailerIds == null"

    .line 130
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Builder;->retailerIds:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method
