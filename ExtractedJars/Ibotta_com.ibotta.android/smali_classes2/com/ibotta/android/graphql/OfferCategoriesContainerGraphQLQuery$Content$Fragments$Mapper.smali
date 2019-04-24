.class public final Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments$Mapper;
.super Ljava/lang/Object;
.source "OfferCategoriesContainerGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/FragmentResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/FragmentResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;",
        ">;"
    }
.end annotation


# instance fields
.field final buyableGiftCardFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper;

.field final dealFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/DealFragment$Mapper;

.field final offerFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 886
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 887
    new-instance v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments$Mapper;->buyableGiftCardFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper;

    .line 889
    new-instance v0, Lcom/ibotta/android/graphql/fragment/DealFragment$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/DealFragment$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments$Mapper;->dealFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/DealFragment$Mapper;

    .line 891
    new-instance v0, Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments$Mapper;->offerFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;Ljava/lang/String;)Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;
    .locals 4
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 898
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->POSSIBLE_TYPES:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 899
    iget-object v0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments$Mapper;->buyableGiftCardFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 901
    :goto_0
    sget-object v2, Lcom/ibotta/android/graphql/fragment/DealFragment;->POSSIBLE_TYPES:Ljava/util/List;

    invoke-interface {v2, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 902
    iget-object v2, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments$Mapper;->dealFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/DealFragment$Mapper;

    invoke-virtual {v2, p1}, Lcom/ibotta/android/graphql/fragment/DealFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/DealFragment;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    .line 904
    :goto_1
    sget-object v3, Lcom/ibotta/android/graphql/fragment/OfferFragment;->POSSIBLE_TYPES:Ljava/util/List;

    invoke-interface {v3, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 905
    iget-object p2, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments$Mapper;->offerFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/OfferFragment;

    move-result-object v1

    .line 907
    :cond_2
    new-instance p1, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;

    invoke-direct {p1, v0, v2, v1}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;-><init>(Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;Lcom/ibotta/android/graphql/fragment/DealFragment;Lcom/ibotta/android/graphql/fragment/OfferFragment;)V

    return-object p1
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 886
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;Ljava/lang/String;)Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;

    move-result-object p1

    return-object p1
.end method
