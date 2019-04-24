.class public final Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments$Mapper;
.super Ljava/lang/Object;
.source "ModuleFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/FragmentResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/FragmentResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;",
        ">;"
    }
.end annotation


# instance fields
.field final bonusFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;

.field final featureFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/FeatureFragment$Mapper;

.field final featuredRetailerFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$Mapper;

.field final offerFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper;

.field final productFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/ProductFragment$Mapper;

.field final retailerFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 911
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 912
    new-instance v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/FeatureFragment$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments$Mapper;->featureFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/FeatureFragment$Mapper;

    .line 914
    new-instance v0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments$Mapper;->featuredRetailerFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$Mapper;

    .line 916
    new-instance v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments$Mapper;->retailerFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper;

    .line 918
    new-instance v0, Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments$Mapper;->bonusFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;

    .line 920
    new-instance v0, Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments$Mapper;->offerFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper;

    .line 922
    new-instance v0, Lcom/ibotta/android/graphql/fragment/ProductFragment$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/ProductFragment$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments$Mapper;->productFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/ProductFragment$Mapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;Ljava/lang/String;)Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;
    .locals 9
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 932
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->POSSIBLE_TYPES:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 933
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments$Mapper;->featureFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/FeatureFragment$Mapper;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/fragment/FeatureFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    move-result-object v0

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, v1

    .line 935
    :goto_0
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->POSSIBLE_TYPES:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 936
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments$Mapper;->featuredRetailerFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$Mapper;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;

    move-result-object v0

    move-object v4, v0

    goto :goto_1

    :cond_1
    move-object v4, v1

    .line 938
    :goto_1
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->POSSIBLE_TYPES:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 939
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments$Mapper;->retailerFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    move-result-object v0

    move-object v5, v0

    goto :goto_2

    :cond_2
    move-object v5, v1

    .line 941
    :goto_2
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->POSSIBLE_TYPES:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 942
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments$Mapper;->bonusFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/BonusFragment;

    move-result-object v0

    move-object v6, v0

    goto :goto_3

    :cond_3
    move-object v6, v1

    .line 944
    :goto_3
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->POSSIBLE_TYPES:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 945
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments$Mapper;->offerFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/OfferFragment;

    move-result-object v0

    move-object v7, v0

    goto :goto_4

    :cond_4
    move-object v7, v1

    .line 947
    :goto_4
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ProductFragment;->POSSIBLE_TYPES:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 948
    iget-object p2, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments$Mapper;->productFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/ProductFragment$Mapper;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/graphql/fragment/ProductFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/ProductFragment;

    move-result-object v1

    move-object v8, v1

    goto :goto_5

    :cond_5
    move-object v8, v1

    .line 950
    :goto_5
    new-instance p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;

    move-object v2, p1

    invoke-direct/range {v2 .. v8}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;-><init>(Lcom/ibotta/android/graphql/fragment/FeatureFragment;Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;Lcom/ibotta/android/graphql/fragment/RetailerFragment;Lcom/ibotta/android/graphql/fragment/BonusFragment;Lcom/ibotta/android/graphql/fragment/OfferFragment;Lcom/ibotta/android/graphql/fragment/ProductFragment;)V

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

    .line 911
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;Ljava/lang/String;)Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;

    move-result-object p1

    return-object p1
.end method
