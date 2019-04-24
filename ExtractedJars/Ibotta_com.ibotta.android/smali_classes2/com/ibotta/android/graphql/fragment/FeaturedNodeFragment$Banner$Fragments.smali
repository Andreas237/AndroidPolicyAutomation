.class public Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Banner$Fragments;
.super Ljava/lang/Object;
.source "FeaturedNodeFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Banner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Fragments"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Banner$Fragments$Mapper;
    }
.end annotation


# instance fields
.field private volatile $hashCode:I

.field private volatile $hashCodeMemoized:Z

.field private volatile $toString:Ljava/lang/String;

.field final featuredBannerNodeFragment:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 434
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "featuredBannerNodeFragment == null"

    .line 435
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Banner$Fragments;->featuredBannerNodeFragment:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 469
    :cond_0
    instance-of v0, p1, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Banner$Fragments;

    if-eqz v0, :cond_1

    .line 470
    check-cast p1, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Banner$Fragments;

    .line 471
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Banner$Fragments;->featuredBannerNodeFragment:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;

    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Banner$Fragments;->featuredBannerNodeFragment:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public featuredBannerNodeFragment()Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 439
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Banner$Fragments;->featuredBannerNodeFragment:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 478
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Banner$Fragments;->$hashCodeMemoized:Z

    if-nez v0, :cond_0

    const v0, 0xf4243

    .line 481
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Banner$Fragments;->featuredBannerNodeFragment:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    .line 482
    iput v0, p0, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Banner$Fragments;->$hashCode:I

    const/4 v0, 0x1

    .line 483
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Banner$Fragments;->$hashCodeMemoized:Z

    .line 485
    :cond_0
    iget v0, p0, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Banner$Fragments;->$hashCode:I

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 443
    new-instance v0, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Banner$Fragments$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Banner$Fragments$1;-><init>(Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Banner$Fragments;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 456
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Banner$Fragments;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 457
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fragments{featuredBannerNodeFragment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Banner$Fragments;->featuredBannerNodeFragment:Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Banner$Fragments;->$toString:Ljava/lang/String;

    .line 461
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Banner$Fragments;->$toString:Ljava/lang/String;

    return-object v0
.end method
