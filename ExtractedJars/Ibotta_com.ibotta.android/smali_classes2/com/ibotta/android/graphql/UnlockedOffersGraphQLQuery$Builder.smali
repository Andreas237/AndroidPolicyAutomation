.class public final Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Builder;
.super Ljava/lang/Object;
.source "UnlockedOffersGraphQLQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery;
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

.field private products:Z


# direct methods
.method constructor <init>()V
    .locals 1

    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 111
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Builder;->limit:Lcom/apollographql/apollo/api/Input;

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery;
    .locals 4

    .line 141
    new-instance v0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery;

    iget-object v1, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Builder;->limit:Lcom/apollographql/apollo/api/Input;

    iget-boolean v2, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Builder;->products:Z

    iget-boolean v3, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Builder;->includeAvailableRetailers:Z

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery;-><init>(Lcom/apollographql/apollo/api/Input;ZZ)V

    return-object v0
.end method

.method public includeAvailableRetailers(Z)Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Builder;
    .locals 0

    .line 131
    iput-boolean p1, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Builder;->includeAvailableRetailers:Z

    return-object p0
.end method

.method public limit(Ljava/lang/Long;)Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 121
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Builder;->limit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public limitInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Builder;
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
            "Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Builder;"
        }
    .end annotation

    const-string v0, "limit == null"

    .line 136
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Builder;->limit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public products(Z)Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Builder;
    .locals 0

    .line 126
    iput-boolean p1, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Builder;->products:Z

    return-object p0
.end method
