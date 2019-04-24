.class public Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;
.super Ljava/lang/Object;
.source "ModuleFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Fragments"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments$Mapper;
    }
.end annotation


# instance fields
.field private volatile $hashCode:I

.field private volatile $hashCodeMemoized:Z

.field private volatile $toString:Ljava/lang/String;

.field final bonusFragment:Lcom/ibotta/android/graphql/fragment/BonusFragment;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final featureFragment:Lcom/ibotta/android/graphql/fragment/FeatureFragment;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final featuredRetailerFragment:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final productFragment:Lcom/ibotta/android/graphql/fragment/ProductFragment;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final retailerFragment:Lcom/ibotta/android/graphql/fragment/RetailerFragment;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/fragment/FeatureFragment;Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;Lcom/ibotta/android/graphql/fragment/RetailerFragment;Lcom/ibotta/android/graphql/fragment/BonusFragment;Lcom/ibotta/android/graphql/fragment/OfferFragment;Lcom/ibotta/android/graphql/fragment/ProductFragment;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/graphql/fragment/FeatureFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/graphql/fragment/RetailerFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/graphql/fragment/BonusFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/ibotta/android/graphql/fragment/OfferFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Lcom/ibotta/android/graphql/fragment/ProductFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 792
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 793
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->featureFragment:Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    .line 794
    iput-object p2, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->featuredRetailerFragment:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;

    .line 795
    iput-object p3, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->retailerFragment:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    .line 796
    iput-object p4, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->bonusFragment:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    .line 797
    iput-object p5, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    .line 798
    iput-object p6, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->productFragment:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    return-void
.end method


# virtual methods
.method public bonusFragment()Lcom/ibotta/android/graphql/fragment/BonusFragment;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 814
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->bonusFragment:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 877
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;

    const/4 v2, 0x0

    if-eqz v1, :cond_8

    .line 878
    check-cast p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;

    .line 879
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->featureFragment:Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    if-nez v1, :cond_1

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->featureFragment:Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    if-nez v1, :cond_7

    goto :goto_0

    :cond_1
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->featureFragment:Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->featuredRetailerFragment:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;

    if-nez v1, :cond_2

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->featuredRetailerFragment:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;

    if-nez v1, :cond_7

    goto :goto_1

    :cond_2
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->featuredRetailerFragment:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;

    .line 880
    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->retailerFragment:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    if-nez v1, :cond_3

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->retailerFragment:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    if-nez v1, :cond_7

    goto :goto_2

    :cond_3
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->retailerFragment:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    .line 881
    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    :goto_2
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->bonusFragment:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    if-nez v1, :cond_4

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->bonusFragment:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    if-nez v1, :cond_7

    goto :goto_3

    :cond_4
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->bonusFragment:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    .line 882
    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    :goto_3
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    if-nez v1, :cond_5

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    if-nez v1, :cond_7

    goto :goto_4

    :cond_5
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    .line 883
    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    :goto_4
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->productFragment:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    if-nez v1, :cond_6

    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->productFragment:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    if-nez p1, :cond_7

    goto :goto_5

    :cond_6
    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->productFragment:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    .line 884
    invoke-virtual {v1, p1}, Lcom/ibotta/android/graphql/fragment/ProductFragment;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_5

    :cond_7
    const/4 v0, 0x0

    :goto_5
    return v0

    :cond_8
    return v2
.end method

.method public featureFragment()Lcom/ibotta/android/graphql/fragment/FeatureFragment;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 802
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->featureFragment:Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    return-object v0
.end method

.method public featuredRetailerFragment()Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 806
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->featuredRetailerFragment:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 891
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->$hashCodeMemoized:Z

    if-nez v0, :cond_6

    .line 894
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->featureFragment:Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->hashCode()I

    move-result v0

    :goto_0
    const v2, 0xf4243

    xor-int/2addr v0, v2

    mul-int v0, v0, v2

    .line 896
    iget-object v3, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->featuredRetailerFragment:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;

    if-nez v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->hashCode()I

    move-result v3

    :goto_1
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 898
    iget-object v3, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->retailerFragment:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    if-nez v3, :cond_2

    const/4 v3, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->hashCode()I

    move-result v3

    :goto_2
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 900
    iget-object v3, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->bonusFragment:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    if-nez v3, :cond_3

    const/4 v3, 0x0

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->hashCode()I

    move-result v3

    :goto_3
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 902
    iget-object v3, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    if-nez v3, :cond_4

    const/4 v3, 0x0

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->hashCode()I

    move-result v3

    :goto_4
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 904
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->productFragment:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/ProductFragment;->hashCode()I

    move-result v1

    :goto_5
    xor-int/2addr v0, v1

    .line 905
    iput v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->$hashCode:I

    const/4 v0, 0x1

    .line 906
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->$hashCodeMemoized:Z

    .line 908
    :cond_6
    iget v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->$hashCode:I

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 826
    new-instance v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments$1;-><init>(Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;)V

    return-object v0
.end method

.method public offerFragment()Lcom/ibotta/android/graphql/fragment/OfferFragment;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 818
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    return-object v0
.end method

.method public productFragment()Lcom/ibotta/android/graphql/fragment/ProductFragment;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 822
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->productFragment:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    return-object v0
.end method

.method public retailerFragment()Lcom/ibotta/android/graphql/fragment/RetailerFragment;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 810
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->retailerFragment:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 859
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 860
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fragments{featureFragment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->featureFragment:Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", featuredRetailerFragment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->featuredRetailerFragment:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retailerFragment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->retailerFragment:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bonusFragment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->bonusFragment:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", offerFragment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", productFragment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->productFragment:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->$toString:Ljava/lang/String;

    .line 869
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Content$Fragments;->$toString:Ljava/lang/String;

    return-object v0
.end method
