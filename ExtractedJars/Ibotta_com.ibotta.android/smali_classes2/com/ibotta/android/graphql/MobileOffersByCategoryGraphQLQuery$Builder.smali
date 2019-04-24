.class public final Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;
.super Ljava/lang/Object;
.source "MobileOffersByCategoryGraphQLQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private categoryLimit:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private contentMax:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private includeAvailableRetailers:Z

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

    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;->retailerId:Lcom/apollographql/apollo/api/Input;

    .line 116
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;->categoryLimit:Lcom/apollographql/apollo/api/Input;

    .line 118
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;->contentMax:Lcom/apollographql/apollo/api/Input;

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery;
    .locals 7

    .line 168
    new-instance v6, Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery;

    iget-object v1, p0, Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;->retailerId:Lcom/apollographql/apollo/api/Input;

    iget-object v2, p0, Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;->categoryLimit:Lcom/apollographql/apollo/api/Input;

    iget-object v3, p0, Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;->contentMax:Lcom/apollographql/apollo/api/Input;

    iget-boolean v4, p0, Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;->products:Z

    iget-boolean v5, p0, Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;->includeAvailableRetailers:Z

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery;-><init>(Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;ZZ)V

    return-object v6
.end method

.method public categoryLimit(Ljava/lang/Long;)Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 133
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;->categoryLimit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public categoryLimitInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;
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
            "Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;"
        }
    .end annotation

    const-string v0, "categoryLimit == null"

    .line 158
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;->categoryLimit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public contentMax(Ljava/lang/Long;)Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 138
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;->contentMax:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public contentMaxInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;
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
            "Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;"
        }
    .end annotation

    const-string v0, "contentMax == null"

    .line 163
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;->contentMax:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public includeAvailableRetailers(Z)Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;
    .locals 0

    .line 148
    iput-boolean p1, p0, Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;->includeAvailableRetailers:Z

    return-object p0
.end method

.method public products(Z)Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;
    .locals 0

    .line 143
    iput-boolean p1, p0, Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;->products:Z

    return-object p0
.end method

.method public retailerId(Ljava/lang/Long;)Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 128
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;->retailerId:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public retailerIdInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;
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
            "Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;"
        }
    .end annotation

    const-string v0, "retailerId == null"

    .line 153
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;->retailerId:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method
