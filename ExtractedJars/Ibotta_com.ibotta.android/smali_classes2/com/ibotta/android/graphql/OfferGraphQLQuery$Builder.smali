.class public final Lcom/ibotta/android/graphql/OfferGraphQLQuery$Builder;
.super Ljava/lang/Object;
.source "OfferGraphQLQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/OfferGraphQLQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private ignoreTargeting:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private includeAvailableRetailers:Z

.field private offerId:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field private products:Z


# direct methods
.method constructor <init>()V
    .locals 1

    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Builder;->ignoreTargeting:Lcom/apollographql/apollo/api/Input;

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/graphql/OfferGraphQLQuery;
    .locals 5

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Builder;->offerId:Ljava/lang/String;

    const-string v1, "offerId == null"

    invoke-static {v0, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    new-instance v0, Lcom/ibotta/android/graphql/OfferGraphQLQuery;

    iget-object v1, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Builder;->offerId:Ljava/lang/String;

    iget-object v2, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Builder;->ignoreTargeting:Lcom/apollographql/apollo/api/Input;

    iget-boolean v3, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Builder;->products:Z

    iget-boolean v4, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Builder;->includeAvailableRetailers:Z

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/ibotta/android/graphql/OfferGraphQLQuery;-><init>(Ljava/lang/String;Lcom/apollographql/apollo/api/Input;ZZ)V

    return-object v0
.end method

.method public ignoreTargeting(Ljava/lang/Boolean;)Lcom/ibotta/android/graphql/OfferGraphQLQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 125
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Builder;->ignoreTargeting:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public ignoreTargetingInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/OfferGraphQLQuery$Builder;
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
            "Lcom/ibotta/android/graphql/OfferGraphQLQuery$Builder;"
        }
    .end annotation

    const-string v0, "ignoreTargeting == null"

    .line 140
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Builder;->ignoreTargeting:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public includeAvailableRetailers(Z)Lcom/ibotta/android/graphql/OfferGraphQLQuery$Builder;
    .locals 0

    .line 135
    iput-boolean p1, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Builder;->includeAvailableRetailers:Z

    return-object p0
.end method

.method public offerId(Ljava/lang/String;)Lcom/ibotta/android/graphql/OfferGraphQLQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 120
    iput-object p1, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Builder;->offerId:Ljava/lang/String;

    return-object p0
.end method

.method public products(Z)Lcom/ibotta/android/graphql/OfferGraphQLQuery$Builder;
    .locals 0

    .line 130
    iput-boolean p1, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Builder;->products:Z

    return-object p0
.end method
