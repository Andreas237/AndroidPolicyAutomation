.class public final Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;
.super Ljava/lang/Object;
.source "UnlockedOfferCategoriesGraphQLQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private contentMax:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private contentMin:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

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

.field private retailerId:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;->retailerId:Lcom/apollographql/apollo/api/Input;

    .line 117
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;->limit:Lcom/apollographql/apollo/api/Input;

    .line 119
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;->contentMin:Lcom/apollographql/apollo/api/Input;

    .line 121
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;->contentMax:Lcom/apollographql/apollo/api/Input;

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery;
    .locals 8

    .line 181
    new-instance v7, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery;

    iget-object v1, p0, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;->retailerId:Lcom/apollographql/apollo/api/Input;

    iget-object v2, p0, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;->limit:Lcom/apollographql/apollo/api/Input;

    iget-object v3, p0, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;->contentMin:Lcom/apollographql/apollo/api/Input;

    iget-object v4, p0, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;->contentMax:Lcom/apollographql/apollo/api/Input;

    iget-boolean v5, p0, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;->products:Z

    iget-boolean v6, p0, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;->includeAvailableRetailers:Z

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery;-><init>(Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;ZZ)V

    return-object v7
.end method

.method public contentMax(Ljava/lang/Long;)Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 146
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;->contentMax:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public contentMaxInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;
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
            "Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;"
        }
    .end annotation

    const-string v0, "contentMax == null"

    .line 176
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;->contentMax:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public contentMin(Ljava/lang/Long;)Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 141
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;->contentMin:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public contentMinInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;
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
            "Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;"
        }
    .end annotation

    const-string v0, "contentMin == null"

    .line 171
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;->contentMin:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public includeAvailableRetailers(Z)Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;
    .locals 0

    .line 156
    iput-boolean p1, p0, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;->includeAvailableRetailers:Z

    return-object p0
.end method

.method public limit(Ljava/lang/Long;)Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 136
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;->limit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public limitInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;
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
            "Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;"
        }
    .end annotation

    const-string v0, "limit == null"

    .line 166
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;->limit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public products(Z)Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;
    .locals 0

    .line 151
    iput-boolean p1, p0, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;->products:Z

    return-object p0
.end method

.method public retailerId(Ljava/lang/Long;)Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 131
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;->retailerId:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public retailerIdInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;
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
            "Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;"
        }
    .end annotation

    const-string v0, "retailerId == null"

    .line 161
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;->retailerId:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method
