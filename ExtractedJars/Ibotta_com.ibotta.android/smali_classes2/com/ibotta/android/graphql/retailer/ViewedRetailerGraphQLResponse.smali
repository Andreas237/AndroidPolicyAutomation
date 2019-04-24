.class public abstract Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLResponse;
.super Lcom/ibotta/android/graphql/GraphQLApiResponse;
.source "ViewedRetailerGraphQLResponse.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/ibotta/android/graphql/GraphQLApiResponse;-><init>()V

    return-void
.end method

.method public static create(Ljava/util/List;)Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)",
            "Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLResponse;"
        }
    .end annotation

    .line 17
    new-instance v0, Lcom/ibotta/android/graphql/retailer/AutoValue_ViewedRetailerGraphQLResponse;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/retailer/AutoValue_ViewedRetailerGraphQLResponse;-><init>(Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public abstract getRetailerModels()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end method
