.class public Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group$Fragments;
.super Ljava/lang/Object;
.source "OfferFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Fragments"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group$Fragments$Mapper;
    }
.end annotation


# instance fields
.field private volatile $hashCode:I

.field private volatile $hashCodeMemoized:Z

.field private volatile $toString:Ljava/lang/String;

.field final productGroupFragment:Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 1633
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "productGroupFragment == null"

    .line 1634
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group$Fragments;->productGroupFragment:Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 1668
    :cond_0
    instance-of v0, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group$Fragments;

    if-eqz v0, :cond_1

    .line 1669
    check-cast p1, Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group$Fragments;

    .line 1670
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group$Fragments;->productGroupFragment:Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;

    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group$Fragments;->productGroupFragment:Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 2

    .line 1677
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group$Fragments;->$hashCodeMemoized:Z

    if-nez v0, :cond_0

    const v0, 0xf4243

    .line 1680
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group$Fragments;->productGroupFragment:Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    .line 1681
    iput v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group$Fragments;->$hashCode:I

    const/4 v0, 0x1

    .line 1682
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group$Fragments;->$hashCodeMemoized:Z

    .line 1684
    :cond_0
    iget v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group$Fragments;->$hashCode:I

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 1642
    new-instance v0, Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group$Fragments$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group$Fragments$1;-><init>(Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group$Fragments;)V

    return-object v0
.end method

.method public productGroupFragment()Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 1638
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group$Fragments;->productGroupFragment:Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1655
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group$Fragments;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 1656
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fragments{productGroupFragment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group$Fragments;->productGroupFragment:Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group$Fragments;->$toString:Ljava/lang/String;

    .line 1660
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group$Fragments;->$toString:Ljava/lang/String;

    return-object v0
.end method
