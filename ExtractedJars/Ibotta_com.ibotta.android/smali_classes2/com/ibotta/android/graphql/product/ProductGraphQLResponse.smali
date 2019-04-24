.class public Lcom/ibotta/android/graphql/product/ProductGraphQLResponse;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;
.source "ProductGraphQLResponse.java"


# instance fields
.field private product:Lcom/ibotta/api/model/content/ProductContent;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getProduct()Lcom/ibotta/api/model/content/ProductContent;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/graphql/product/ProductGraphQLResponse;->product:Lcom/ibotta/api/model/content/ProductContent;

    return-object v0
.end method

.method public getProductAsModel()Lcom/ibotta/api/model/ProductModel;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/ibotta/android/graphql/product/ProductGraphQLResponse;->product:Lcom/ibotta/api/model/content/ProductContent;

    return-object v0
.end method

.method public setProduct(Lcom/ibotta/api/model/content/ProductContent;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/graphql/product/ProductGraphQLResponse;->product:Lcom/ibotta/api/model/content/ProductContent;

    return-void
.end method
