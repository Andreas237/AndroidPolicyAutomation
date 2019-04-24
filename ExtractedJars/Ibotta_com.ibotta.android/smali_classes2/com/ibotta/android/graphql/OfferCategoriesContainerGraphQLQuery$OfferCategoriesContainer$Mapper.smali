.class public final Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer$Mapper;
.super Ljava/lang/Object;
.source "OfferCategoriesContainerGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer;",
        ">;"
    }
.end annotation


# instance fields
.field final containerFieldMapper:Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Container$Mapper;

.field final contentFieldMapper:Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Mapper;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 507
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 508
    new-instance v0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Container$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Container$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer$Mapper;->containerFieldMapper:Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Container$Mapper;

    .line 510
    new-instance v0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer$Mapper;->contentFieldMapper:Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Mapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer;
    .locals 4

    .line 514
    sget-object v0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v0

    .line 515
    sget-object v1, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    new-instance v2, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer$Mapper$1;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer$Mapper$1;-><init>(Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer$Mapper;)V

    invoke-interface {p1, v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object v1

    .line 526
    sget-object v2, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer$Mapper$2;

    invoke-direct {v3, p0}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer$Mapper$2;-><init>(Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer$Mapper;)V

    invoke-interface {p1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object p1

    .line 537
    new-instance v2, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer;

    invoke-direct {v2, v0, v1, p1}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    return-object v2
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 507
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer;

    move-result-object p1

    return-object p1
.end method
