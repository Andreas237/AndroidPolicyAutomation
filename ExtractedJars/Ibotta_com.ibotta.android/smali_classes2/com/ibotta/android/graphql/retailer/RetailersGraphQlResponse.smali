.class public Lcom/ibotta/android/graphql/retailer/RetailersGraphQlResponse;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;
.source "RetailersGraphQlResponse.java"


# instance fields
.field private final retailerContentList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;-><init>()V

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlResponse;->retailerContentList:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public addRetailers(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)V"
        }
    .end annotation

    .line 18
    iget-object v0, p0, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlResponse;->retailerContentList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public getAllRetailers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation

    .line 14
    iget-object v0, p0, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlResponse;->retailerContentList:Ljava/util/List;

    return-object v0
.end method
