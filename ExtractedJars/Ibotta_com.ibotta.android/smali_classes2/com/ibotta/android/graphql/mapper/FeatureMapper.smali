.class public Lcom/ibotta/android/graphql/mapper/FeatureMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "FeatureMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/FeatureFragment;",
        "Lcom/ibotta/api/model/content/FeatureContent;",
        ">;"
    }
.end annotation


# instance fields
.field private final sortResultMapper:Lcom/ibotta/android/graphql/mapper/SortResultMapper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/SortResultMapper;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/BaseMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    .line 22
    iput-object p2, p0, Lcom/ibotta/android/graphql/mapper/FeatureMapper;->sortResultMapper:Lcom/ibotta/android/graphql/mapper/SortResultMapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/ibotta/android/graphql/fragment/FeatureFragment;)Lcom/ibotta/api/model/content/FeatureContent;
    .locals 4
    .param p1    # Lcom/ibotta/android/graphql/fragment/FeatureFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 31
    :cond_0
    new-instance v0, Lcom/ibotta/api/model/content/FeatureContent;

    invoke-direct {v0}, Lcom/ibotta/api/model/content/FeatureContent;-><init>()V

    .line 33
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->big_img()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/FeatureContent;->setBigImg(Ljava/lang/String;)V

    .line 34
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->bgcolor()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/FeatureContent;->setBgcolor(Ljava/lang/String;)V

    .line 35
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->cache_key()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/FeatureContent;->setCacheKey(Ljava/lang/String;)V

    .line 36
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->category_img()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/FeatureContent;->setCategoryImg(Ljava/lang/String;)V

    .line 37
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->context()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/FeatureContent;->setContext(Ljava/lang/String;)V

    .line 38
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->expiration()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/FeatureMapper;->asDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/FeatureContent;->setExpiration(Ljava/util/Date;)V

    .line 39
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->feature_type()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/FeatureContent;->setFeatureType(Ljava/lang/String;)V

    .line 40
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/FeatureMapper;->asInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/FeatureContent;->setId(I)V

    .line 41
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/FeatureContent;->setIdString(Ljava/lang/String;)V

    .line 42
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->link()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/FeatureContent;->setLink(Ljava/lang/String;)V

    .line 43
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/FeatureContent;->setName(Ljava/lang/String;)V

    .line 44
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->sort_order()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/FeatureContent;->setSortOrder(Ljava/lang/String;)V

    .line 45
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->type()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/FeatureContent;->setType(Ljava/lang/String;)V

    .line 46
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->typed_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/FeatureContent;->setTypedId(Ljava/lang/String;)V

    .line 47
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->tracking_click_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/FeatureContent;->setTrackingClickUrl(Ljava/lang/String;)V

    .line 48
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->tracking_impression_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/FeatureContent;->setTrackingImpressionUrl(Ljava/lang/String;)V

    .line 50
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->sort_results()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 52
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 54
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/graphql/fragment/FeatureFragment$Sort_result;

    .line 55
    iget-object v3, p0, Lcom/ibotta/android/graphql/mapper/FeatureMapper;->sortResultMapper:Lcom/ibotta/android/graphql/mapper/SortResultMapper;

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/FeatureFragment$Sort_result;->fragments()Lcom/ibotta/android/graphql/fragment/FeatureFragment$Sort_result$Fragments;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/FeatureFragment$Sort_result$Fragments;->sortResultFragment()Lcom/ibotta/android/graphql/fragment/SortResultFragment;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/ibotta/android/graphql/mapper/SortResultMapper;->map(Lcom/ibotta/android/graphql/fragment/SortResultFragment;)Lcom/ibotta/api/model/content/SortResultContent;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 58
    :cond_1
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/FeatureContent;->setSortResults(Ljava/util/List;)V

    :cond_2
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

    .line 17
    check-cast p1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/FeatureMapper;->map(Lcom/ibotta/android/graphql/fragment/FeatureFragment;)Lcom/ibotta/api/model/content/FeatureContent;

    move-result-object p1

    return-object p1
.end method
