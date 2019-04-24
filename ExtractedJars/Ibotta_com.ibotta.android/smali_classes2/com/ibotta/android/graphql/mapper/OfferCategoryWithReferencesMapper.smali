.class public Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "OfferCategoryWithReferencesMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/CategoryWithReferencesFragment;",
        "Lcom/ibotta/api/model/content/OfferCategoryContent;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/BaseMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-void
.end method


# virtual methods
.method public map(Lcom/ibotta/android/graphql/fragment/CategoryWithReferencesFragment;)Lcom/ibotta/api/model/content/OfferCategoryContent;
    .locals 3
    .param p1    # Lcom/ibotta/android/graphql/fragment/CategoryWithReferencesFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 26
    :cond_0
    new-instance v0, Lcom/ibotta/api/model/content/OfferCategoryContent;

    invoke-direct {v0}, Lcom/ibotta/api/model/content/OfferCategoryContent;-><init>()V

    .line 28
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryWithReferencesFragment;->id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;->asInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setId(I)V

    .line 29
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryWithReferencesFragment;->category_type()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setCategoryType(Ljava/lang/String;)V

    .line 30
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryWithReferencesFragment;->collapsible()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;->asBoolean(Ljava/lang/Boolean;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setCollapsible(Z)V

    .line 31
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryWithReferencesFragment;->default_view_state()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setDefaultViewState(Ljava/lang/String;)V

    .line 32
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryWithReferencesFragment;->end_time()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setEndTime(Ljava/lang/String;)V

    .line 33
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryWithReferencesFragment;->expiration()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setExpiration(Ljava/lang/String;)V

    .line 34
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryWithReferencesFragment;->icon_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setIconUrl(Ljava/lang/String;)V

    .line 35
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryWithReferencesFragment;->image_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setImageUrl(Ljava/lang/String;)V

    .line 36
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryWithReferencesFragment;->launch()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;->asBoolean(Ljava/lang/Boolean;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setLaunch(Z)V

    .line 37
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryWithReferencesFragment;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setName(Ljava/lang/String;)V

    .line 38
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryWithReferencesFragment;->num_preview_items()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;->asInt(Ljava/lang/Number;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setNumPreviewItems(I)V

    .line 39
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryWithReferencesFragment;->raw_category_type()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setRawCategoryType(Ljava/lang/String;)V

    .line 40
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryWithReferencesFragment;->short_name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setShortName(Ljava/lang/String;)V

    .line 41
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryWithReferencesFragment;->sort_order()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;->asInt(Ljava/lang/Number;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setSortOrder(I)V

    .line 42
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryWithReferencesFragment;->start_time()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setStartTime(Ljava/lang/String;)V

    .line 43
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryWithReferencesFragment;->type()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setType(Ljava/lang/String;)V

    .line 45
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryWithReferencesFragment;->content_ids()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 46
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryWithReferencesFragment;->content_ids()Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setContentIds(Ljava/util/Set;)V

    .line 49
    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryWithReferencesFragment;->retailers()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 50
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryWithReferencesFragment;->retailers()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;->asIntegerSet(Ljava/util/Collection;)Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setRetailers(Ljava/util/Set;)V

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

    .line 15
    check-cast p1, Lcom/ibotta/android/graphql/fragment/CategoryWithReferencesFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;->map(Lcom/ibotta/android/graphql/fragment/CategoryWithReferencesFragment;)Lcom/ibotta/api/model/content/OfferCategoryContent;

    move-result-object p1

    return-object p1
.end method
