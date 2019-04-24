.class public Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;
.super Ljava/lang/Object;
.source "OfferCategoriesContainerGraphQLQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Fragments"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments$Mapper;
    }
.end annotation


# instance fields
.field private volatile $hashCode:I

.field private volatile $hashCodeMemoized:Z

.field private volatile $toString:Ljava/lang/String;

.field final buyableGiftCardFragment:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final dealFragment:Lcom/ibotta/android/graphql/fragment/DealFragment;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;Lcom/ibotta/android/graphql/fragment/DealFragment;Lcom/ibotta/android/graphql/fragment/OfferFragment;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/graphql/fragment/DealFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/graphql/fragment/OfferFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 806
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 807
    iput-object p1, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->buyableGiftCardFragment:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    .line 808
    iput-object p2, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->dealFragment:Lcom/ibotta/android/graphql/fragment/DealFragment;

    .line 809
    iput-object p3, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    return-void
.end method


# virtual methods
.method public buyableGiftCardFragment()Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 813
    iget-object v0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->buyableGiftCardFragment:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    return-object v0
.end method

.method public dealFragment()Lcom/ibotta/android/graphql/fragment/DealFragment;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 817
    iget-object v0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->dealFragment:Lcom/ibotta/android/graphql/fragment/DealFragment;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 861
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    .line 862
    check-cast p1, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;

    .line 863
    iget-object v1, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->buyableGiftCardFragment:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    if-nez v1, :cond_1

    iget-object v1, p1, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->buyableGiftCardFragment:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    if-nez v1, :cond_4

    goto :goto_0

    :cond_1
    iget-object v3, p1, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->buyableGiftCardFragment:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->dealFragment:Lcom/ibotta/android/graphql/fragment/DealFragment;

    if-nez v1, :cond_2

    iget-object v1, p1, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->dealFragment:Lcom/ibotta/android/graphql/fragment/DealFragment;

    if-nez v1, :cond_4

    goto :goto_1

    :cond_2
    iget-object v3, p1, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->dealFragment:Lcom/ibotta/android/graphql/fragment/DealFragment;

    .line 864
    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/fragment/DealFragment;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    if-nez v1, :cond_3

    iget-object p1, p1, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    if-nez p1, :cond_4

    goto :goto_2

    :cond_3
    iget-object p1, p1, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    .line 865
    invoke-virtual {v1, p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    :goto_2
    return v0

    :cond_5
    return v2
.end method

.method public hashCode()I
    .locals 4

    .line 872
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->$hashCodeMemoized:Z

    if-nez v0, :cond_3

    .line 875
    iget-object v0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->buyableGiftCardFragment:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->hashCode()I

    move-result v0

    :goto_0
    const v2, 0xf4243

    xor-int/2addr v0, v2

    mul-int v0, v0, v2

    .line 877
    iget-object v3, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->dealFragment:Lcom/ibotta/android/graphql/fragment/DealFragment;

    if-nez v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/DealFragment;->hashCode()I

    move-result v3

    :goto_1
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 879
    iget-object v2, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->hashCode()I

    move-result v1

    :goto_2
    xor-int/2addr v0, v1

    .line 880
    iput v0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->$hashCode:I

    const/4 v0, 0x1

    .line 881
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->$hashCodeMemoized:Z

    .line 883
    :cond_3
    iget v0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->$hashCode:I

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 825
    new-instance v0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments$1;-><init>(Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;)V

    return-object v0
.end method

.method public offerFragment()Lcom/ibotta/android/graphql/fragment/OfferFragment;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 821
    iget-object v0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 846
    iget-object v0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 847
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fragments{buyableGiftCardFragment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->buyableGiftCardFragment:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dealFragment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->dealFragment:Lcom/ibotta/android/graphql/fragment/DealFragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", offerFragment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->$toString:Ljava/lang/String;

    .line 853
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->$toString:Ljava/lang/String;

    return-object v0
.end method
