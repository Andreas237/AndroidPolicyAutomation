.class public final Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data$Mapper;
.super Ljava/lang/Object;
.source "RetailerCategoriesQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;",
        ">;"
    }
.end annotation


# instance fields
.field final customerNodeFieldMapper:Lcom/ibotta/android/graphql/RetailerCategoriesQuery$CustomerNode$Mapper;

.field final retailerCategoryNodeFieldMapper:Lcom/ibotta/android/graphql/RetailerCategoriesQuery$RetailerCategoryNode$Mapper;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 315
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 316
    new-instance v0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$RetailerCategoryNode$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$RetailerCategoryNode$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data$Mapper;->retailerCategoryNodeFieldMapper:Lcom/ibotta/android/graphql/RetailerCategoriesQuery$RetailerCategoryNode$Mapper;

    .line 318
    new-instance v0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$CustomerNode$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$CustomerNode$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data$Mapper;->customerNodeFieldMapper:Lcom/ibotta/android/graphql/RetailerCategoriesQuery$CustomerNode$Mapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;
    .locals 3

    .line 322
    sget-object v0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    new-instance v1, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data$Mapper$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data$Mapper$1;-><init>(Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data$Mapper;)V

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object v0

    .line 333
    sget-object v1, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    new-instance v2, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data$Mapper$2;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data$Mapper$2;-><init>(Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data$Mapper;)V

    invoke-interface {p1, v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ObjectReader;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$CustomerNode;

    .line 339
    new-instance v1, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;

    invoke-direct {v1, v0, p1}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;-><init>(Ljava/util/List;Lcom/ibotta/android/graphql/RetailerCategoriesQuery$CustomerNode;)V

    return-object v1
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 315
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;

    move-result-object p1

    return-object p1
.end method
