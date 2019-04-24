.class Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Data$Mapper$1;
.super Ljava/lang/Object;
.source "OfferCategoriesContainerGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseReader$ObjectReader;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Data$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Data;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseReader$ObjectReader<",
        "Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Data$Mapper;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Data$Mapper;)V
    .locals 0

    .line 395
    iput-object p1, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Data$Mapper$1;->this$0:Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Data$Mapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public read(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer;
    .locals 1

    .line 398
    iget-object v0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Data$Mapper$1;->this$0:Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Data$Mapper;

    iget-object v0, v0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Data$Mapper;->offerCategoriesContainerFieldMapper:Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer$Mapper;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic read(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 395
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Data$Mapper$1;->read(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer;

    move-result-object p1

    return-object p1
.end method
