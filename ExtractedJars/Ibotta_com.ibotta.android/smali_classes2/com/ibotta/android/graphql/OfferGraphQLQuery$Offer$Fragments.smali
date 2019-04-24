.class public Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer$Fragments;
.super Ljava/lang/Object;
.source "OfferGraphQLQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Fragments"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer$Fragments$Mapper;
    }
.end annotation


# instance fields
.field private volatile $hashCode:I

.field private volatile $hashCodeMemoized:Z

.field private volatile $toString:Ljava/lang/String;

.field final offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/fragment/OfferFragment;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/graphql/fragment/OfferFragment;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 390
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "offerFragment == null"

    .line 391
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iput-object p1, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer$Fragments;->offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 425
    :cond_0
    instance-of v0, p1, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer$Fragments;

    if-eqz v0, :cond_1

    .line 426
    check-cast p1, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer$Fragments;

    .line 427
    iget-object v0, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer$Fragments;->offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object p1, p1, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer$Fragments;->offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 2

    .line 434
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer$Fragments;->$hashCodeMemoized:Z

    if-nez v0, :cond_0

    const v0, 0xf4243

    .line 437
    iget-object v1, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer$Fragments;->offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    .line 438
    iput v0, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer$Fragments;->$hashCode:I

    const/4 v0, 0x1

    .line 439
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer$Fragments;->$hashCodeMemoized:Z

    .line 441
    :cond_0
    iget v0, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer$Fragments;->$hashCode:I

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 399
    new-instance v0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer$Fragments$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer$Fragments$1;-><init>(Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer$Fragments;)V

    return-object v0
.end method

.method public offerFragment()Lcom/ibotta/android/graphql/fragment/OfferFragment;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 395
    iget-object v0, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer$Fragments;->offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 412
    iget-object v0, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer$Fragments;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 413
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fragments{offerFragment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer$Fragments;->offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer$Fragments;->$toString:Ljava/lang/String;

    .line 417
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer$Fragments;->$toString:Ljava/lang/String;

    return-object v0
.end method
