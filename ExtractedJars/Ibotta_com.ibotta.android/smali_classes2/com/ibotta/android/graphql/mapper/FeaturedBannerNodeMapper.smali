.class public Lcom/ibotta/android/graphql/mapper/FeaturedBannerNodeMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "FeaturedBannerNodeMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;",
        "Lcom/ibotta/api/model/content/FeatureContent;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/BaseMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-void
.end method

.method static synthetic lambda$map$0(Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;)Ljava/lang/String;
    .locals 1

    .line 29
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;->url()Ljava/lang/String;

    move-result-object p0

    const-string v0, ""

    invoke-static {p0, v0}, Lcom/ibotta/android/util/AppHelper$-CC;->sanitizeNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public map(Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;)Lcom/ibotta/api/model/content/FeatureContent;
    .locals 2
    .param p1    # Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 24
    :cond_0
    new-instance v0, Lcom/ibotta/api/model/content/FeatureContent;

    invoke-direct {v0}, Lcom/ibotta/api/model/content/FeatureContent;-><init>()V

    .line 25
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/FeaturedBannerNodeMapper;->asInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/FeatureContent;->setId(I)V

    .line 26
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/FeatureContent;->setName(Ljava/lang/String;)V

    .line 27
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->link()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/FeatureContent;->setLink(Ljava/lang/String;)V

    .line 28
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;->categoryImg()Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment$CategoryImg;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p1

    sget-object v1, Lcom/ibotta/android/graphql/mapper/-$$Lambda$FeaturedBannerNodeMapper$xOlrFdjUpojjYsScCxffoSNE2fc;->INSTANCE:Lcom/ibotta/android/graphql/mapper/-$$Lambda$FeaturedBannerNodeMapper$xOlrFdjUpojjYsScCxffoSNE2fc;

    .line 29
    invoke-virtual {p1, v1}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    const-string v1, ""

    .line 30
    invoke-virtual {p1, v1}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 28
    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/content/FeatureContent;->setCategoryImg(Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic map(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 12
    check-cast p1, Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/FeaturedBannerNodeMapper;->map(Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;)Lcom/ibotta/api/model/content/FeatureContent;

    move-result-object p1

    return-object p1
.end method
