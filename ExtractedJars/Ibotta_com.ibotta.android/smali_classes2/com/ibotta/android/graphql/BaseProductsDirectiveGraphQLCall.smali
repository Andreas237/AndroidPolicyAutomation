.class public abstract Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiCall;
.source "BaseProductsDirectiveGraphQLCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Lcom/ibotta/android/graphql/GraphQLApiResponse;",
        "D::",
        "Lcom/apollographql/apollo/api/Operation$Data;",
        ">",
        "Lcom/ibotta/android/graphql/BaseGraphQLApiCall<",
        "TR;TD;>;"
    }
.end annotation


# instance fields
.field protected includeAvailableRetailers:Ljava/lang/Boolean;

.field protected products:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    .line 16
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p1, p0, Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;->products:Ljava/lang/Boolean;

    .line 17
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p1, p0, Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public getDirectives()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 49
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const-string v1, "products"

    .line 50
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-string v1, "includeAvailableRetailers"

    .line 51
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getProducts()Ljava/lang/Boolean;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;->products:Ljava/lang/Boolean;

    return-object v0
.end method

.method public includeAvailableRetailers()Ljava/lang/Boolean;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    return-object v0
.end method

.method public setIncludeAvailableRetailers(Ljava/lang/Boolean;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 41
    iput-object p1, p0, Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    goto :goto_0

    .line 43
    :cond_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p1, p0, Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    :goto_0
    return-void
.end method

.method public setProducts(Ljava/lang/Boolean;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;->products:Ljava/lang/Boolean;

    goto :goto_0

    .line 31
    :cond_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p1, p0, Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;->products:Ljava/lang/Boolean;

    :goto_0
    return-void
.end method
