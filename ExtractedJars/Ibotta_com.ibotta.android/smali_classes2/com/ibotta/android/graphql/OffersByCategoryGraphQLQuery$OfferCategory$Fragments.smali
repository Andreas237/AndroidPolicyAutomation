.class public Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory$Fragments;
.super Ljava/lang/Object;
.source "OffersByCategoryGraphQLQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Fragments"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory$Fragments$Mapper;
    }
.end annotation


# instance fields
.field private volatile $hashCode:I

.field private volatile $hashCodeMemoized:Z

.field private volatile $toString:Ljava/lang/String;

.field final categoryFragment:Lcom/ibotta/android/graphql/fragment/CategoryFragment;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/fragment/CategoryFragment;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/graphql/fragment/CategoryFragment;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 443
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "categoryFragment == null"

    .line 444
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    iput-object p1, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory$Fragments;->categoryFragment:Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    return-void
.end method


# virtual methods
.method public categoryFragment()Lcom/ibotta/android/graphql/fragment/CategoryFragment;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 448
    iget-object v0, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory$Fragments;->categoryFragment:Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 478
    :cond_0
    instance-of v0, p1, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory$Fragments;

    if-eqz v0, :cond_1

    .line 479
    check-cast p1, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory$Fragments;

    .line 480
    iget-object v0, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory$Fragments;->categoryFragment:Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    iget-object p1, p1, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory$Fragments;->categoryFragment:Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 2

    .line 487
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory$Fragments;->$hashCodeMemoized:Z

    if-nez v0, :cond_0

    const v0, 0xf4243

    .line 490
    iget-object v1, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory$Fragments;->categoryFragment:Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    .line 491
    iput v0, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory$Fragments;->$hashCode:I

    const/4 v0, 0x1

    .line 492
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory$Fragments;->$hashCodeMemoized:Z

    .line 494
    :cond_0
    iget v0, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory$Fragments;->$hashCode:I

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 452
    new-instance v0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory$Fragments$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory$Fragments$1;-><init>(Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory$Fragments;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 465
    iget-object v0, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory$Fragments;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 466
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fragments{categoryFragment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory$Fragments;->categoryFragment:Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory$Fragments;->$toString:Ljava/lang/String;

    .line 470
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory$Fragments;->$toString:Ljava/lang/String;

    return-object v0
.end method
