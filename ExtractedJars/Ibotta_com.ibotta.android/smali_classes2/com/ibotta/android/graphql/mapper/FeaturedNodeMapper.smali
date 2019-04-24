.class public Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "FeaturedNodeMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment;",
        "Lcom/ibotta/api/model/content/FeaturedNode;",
        ">;"
    }
.end annotation


# instance fields
.field private final featuredBannerNodeMapper:Lcom/ibotta/android/graphql/mapper/FeaturedBannerNodeMapper;

.field private final retailerNodeMapper:Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;Lcom/ibotta/android/graphql/mapper/FeaturedBannerNodeMapper;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/BaseMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    .line 28
    iput-object p2, p0, Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;->retailerNodeMapper:Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;

    .line 29
    iput-object p3, p0, Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;->featuredBannerNodeMapper:Lcom/ibotta/android/graphql/mapper/FeaturedBannerNodeMapper;

    return-void
.end method

.method static synthetic lambda$map$0(Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Banner;)Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;
    .locals 0

    .line 44
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Banner;->fragments()Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Banner$Fragments;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Banner$Fragments;->featuredBannerNodeFragment()Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$map$1(Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Retailer;)Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;
    .locals 0

    .line 48
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Retailer;->fragments()Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Retailer$Fragments;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment$Retailer$Fragments;->retailerNodeFragment()Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$map$2(Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;)Lcom/ibotta/api/model/content/FeatureContent;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;->featuredBannerNodeMapper:Lcom/ibotta/android/graphql/mapper/FeaturedBannerNodeMapper;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/mapper/FeaturedBannerNodeMapper;->map(Lcom/ibotta/android/graphql/fragment/FeaturedBannerNodeFragment;)Lcom/ibotta/api/model/content/FeatureContent;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic lambda$map$3(Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;)Lcom/ibotta/api/model/content/RetailerContent;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;->retailerNodeMapper:Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;->map(Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;)Lcom/ibotta/api/model/content/RetailerContent;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public map(Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment;)Lcom/ibotta/api/model/content/FeaturedNode;
    .locals 3
    .param p1    # Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 38
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment;->banners()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object v0

    .line 39
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 40
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment;->retailers()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p1

    .line 41
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 43
    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/graphql/mapper/-$$Lambda$FeaturedNodeMapper$WpEKPoumj-svrJAV7AK4VEYfBuc;->INSTANCE:Lcom/ibotta/android/graphql/mapper/-$$Lambda$FeaturedNodeMapper$WpEKPoumj-svrJAV7AK4VEYfBuc;

    .line 44
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    .line 45
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 47
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v1, Lcom/ibotta/android/graphql/mapper/-$$Lambda$FeaturedNodeMapper$kiC0KbVn5kTK21jLfhnZGE0EpZ4;->INSTANCE:Lcom/ibotta/android/graphql/mapper/-$$Lambda$FeaturedNodeMapper$kiC0KbVn5kTK21jLfhnZGE0EpZ4;

    .line 48
    invoke-interface {p1, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 49
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 51
    invoke-static {}, Lcom/ibotta/api/model/content/FeaturedNode;->builder()Lcom/ibotta/api/model/content/FeaturedNode$Builder;

    move-result-object v1

    .line 53
    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    new-instance v2, Lcom/ibotta/android/graphql/mapper/-$$Lambda$FeaturedNodeMapper$eK3268W5k5R5O3Gsd-Rv_TBR7i0;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/mapper/-$$Lambda$FeaturedNodeMapper$eK3268W5k5R5O3Gsd-Rv_TBR7i0;-><init>(Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;)V

    .line 54
    invoke-interface {v0, v2}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    .line 55
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 52
    invoke-virtual {v1, v0}, Lcom/ibotta/api/model/content/FeaturedNode$Builder;->banners(Ljava/util/List;)Lcom/ibotta/api/model/content/FeaturedNode$Builder;

    move-result-object v0

    .line 57
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v1, Lcom/ibotta/android/graphql/mapper/-$$Lambda$FeaturedNodeMapper$WViEPDQ52nJTrLChvMRz5_FeE6Y;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/mapper/-$$Lambda$FeaturedNodeMapper$WViEPDQ52nJTrLChvMRz5_FeE6Y;-><init>(Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;)V

    .line 58
    invoke-interface {p1, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 59
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 56
    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/content/FeaturedNode$Builder;->retailers(Ljava/util/List;)Lcom/ibotta/api/model/content/FeaturedNode$Builder;

    move-result-object p1

    .line 60
    invoke-virtual {p1}, Lcom/ibotta/api/model/content/FeaturedNode$Builder;->build()Lcom/ibotta/api/model/content/FeaturedNode;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic map(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 18
    check-cast p1, Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;->map(Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment;)Lcom/ibotta/api/model/content/FeaturedNode;

    move-result-object p1

    return-object p1
.end method
