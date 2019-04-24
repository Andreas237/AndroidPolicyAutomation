.class public Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "RetailerCategoryNodeMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;",
        "Lcom/ibotta/api/model/content/RetailerCategoryNode;",
        ">;"
    }
.end annotation


# instance fields
.field private final featuredNodeMapper:Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;

.field private final retailerNodeMapper:Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/BaseMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    .line 28
    iput-object p2, p0, Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;->retailerNodeMapper:Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;

    .line 29
    iput-object p3, p0, Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;->featuredNodeMapper:Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;

    return-void
.end method

.method static synthetic lambda$map$0(Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;)Ljava/lang/String;
    .locals 1

    .line 44
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;->url()Ljava/lang/String;

    move-result-object p0

    const-string v0, ""

    invoke-static {p0, v0}, Lcom/ibotta/android/util/AppHelper$-CC;->sanitizeNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic lambda$map$1(Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Retailer;)Lcom/ibotta/api/model/content/RetailerContent;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;->retailerNodeMapper:Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Retailer;->fragments()Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Retailer$Fragments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Retailer$Fragments;->retailerNodeFragment()Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;->map(Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;)Lcom/ibotta/api/model/content/RetailerContent;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic lambda$map$2(Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Features;)Lcom/ibotta/api/model/content/FeaturedNode;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;->featuredNodeMapper:Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Features;->fragments()Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Features$Fragments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Features$Fragments;->featuredNodeFragment()Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;->map(Lcom/ibotta/android/graphql/fragment/FeaturedNodeFragment;)Lcom/ibotta/api/model/content/FeaturedNode;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public map(Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;)Lcom/ibotta/api/model/content/RetailerCategoryNode;
    .locals 4
    .param p1    # Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;
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
    invoke-static {}, Lcom/ibotta/api/model/content/RetailerCategoryNode;->builder()Lcom/ibotta/api/model/content/RetailerCategoryNode$Builder;

    move-result-object v0

    .line 40
    new-instance v1, Lcom/ibotta/api/model/retailer/Category;

    invoke-direct {v1}, Lcom/ibotta/api/model/retailer/Category;-><init>()V

    .line 41
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;->asInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/ibotta/api/model/retailer/Category;->setId(I)V

    .line 42
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/api/model/retailer/Category;->setName(Ljava/lang/String;)V

    .line 43
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->iconUrl()Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;

    move-result-object v2

    invoke-static {v2}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object v2

    sget-object v3, Lcom/ibotta/android/graphql/mapper/-$$Lambda$RetailerCategoryNodeMapper$2cVUWmB0m71Wqfk2qWlmUrinjQ0;->INSTANCE:Lcom/ibotta/android/graphql/mapper/-$$Lambda$RetailerCategoryNodeMapper$2cVUWmB0m71Wqfk2qWlmUrinjQ0;

    .line 44
    invoke-virtual {v2, v3}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 43
    invoke-virtual {v1, v2}, Lcom/ibotta/api/model/retailer/Category;->setIconUrl(Ljava/lang/String;)V

    .line 46
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerCategoryNode$Builder;->category(Lcom/ibotta/api/model/retailer/Category;)Lcom/ibotta/api/model/content/RetailerCategoryNode$Builder;

    .line 48
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->retailers()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object v1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 50
    invoke-static {v1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v1

    new-instance v2, Lcom/ibotta/android/graphql/mapper/-$$Lambda$RetailerCategoryNodeMapper$V1sZYgore-A4ObyUkXBOYYGgeGo;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/mapper/-$$Lambda$RetailerCategoryNodeMapper$V1sZYgore-A4ObyUkXBOYYGgeGo;-><init>(Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;)V

    .line 51
    invoke-interface {v1, v2}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v1

    .line 52
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 50
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerCategoryNode$Builder;->retailers(Ljava/util/List;)Lcom/ibotta/api/model/content/RetailerCategoryNode$Builder;

    .line 54
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->features()Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Features;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p1

    new-instance v1, Lcom/ibotta/android/graphql/mapper/-$$Lambda$RetailerCategoryNodeMapper$6QNqOshGcPmQi5Jv1yS3d-1mB8A;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/mapper/-$$Lambda$RetailerCategoryNodeMapper$6QNqOshGcPmQi5Jv1yS3d-1mB8A;-><init>(Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;)V

    .line 55
    invoke-virtual {p1, v1}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    .line 56
    invoke-static {}, Lcom/ibotta/api/model/content/FeaturedNode;->builder()Lcom/ibotta/api/model/content/FeaturedNode$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/content/FeaturedNode$Builder;->build()Lcom/ibotta/api/model/content/FeaturedNode;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/content/FeaturedNode;

    .line 54
    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/content/RetailerCategoryNode$Builder;->featuredNode(Lcom/ibotta/api/model/content/FeaturedNode;)Lcom/ibotta/api/model/content/RetailerCategoryNode$Builder;

    .line 58
    invoke-virtual {v0}, Lcom/ibotta/api/model/content/RetailerCategoryNode$Builder;->build()Lcom/ibotta/api/model/content/RetailerCategoryNode;

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

    .line 20
    check-cast p1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;->map(Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;)Lcom/ibotta/api/model/content/RetailerCategoryNode;

    move-result-object p1

    return-object p1
.end method
