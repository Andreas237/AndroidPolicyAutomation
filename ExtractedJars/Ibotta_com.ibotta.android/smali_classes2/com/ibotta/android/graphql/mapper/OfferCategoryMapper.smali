.class public Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "OfferCategoryMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/CategoryFragment;",
        "Lcom/ibotta/api/model/content/OfferCategoryContent;",
        ">;"
    }
.end annotation


# instance fields
.field private final offerMapper:Lcom/ibotta/android/graphql/mapper/OfferMapper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/OfferMapper;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/BaseMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;->offerMapper:Lcom/ibotta/android/graphql/mapper/OfferMapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/ibotta/android/graphql/fragment/CategoryFragment;)Lcom/ibotta/api/model/content/OfferCategoryContent;
    .locals 5
    .param p1    # Lcom/ibotta/android/graphql/fragment/CategoryFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 32
    :cond_0
    new-instance v0, Lcom/ibotta/api/model/content/OfferCategoryContent;

    invoke-direct {v0}, Lcom/ibotta/api/model/content/OfferCategoryContent;-><init>()V

    .line 34
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;->asInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setId(I)V

    .line 35
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->category_type()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setCategoryType(Ljava/lang/String;)V

    .line 36
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->collapsible()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;->asBoolean(Ljava/lang/Boolean;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setCollapsible(Z)V

    .line 37
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->default_view_state()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setDefaultViewState(Ljava/lang/String;)V

    .line 38
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->end_time()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setEndTime(Ljava/lang/String;)V

    .line 39
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->expiration()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setExpiration(Ljava/lang/String;)V

    .line 40
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->icon_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setIconUrl(Ljava/lang/String;)V

    .line 41
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->image_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setImageUrl(Ljava/lang/String;)V

    .line 42
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->launch()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;->asBoolean(Ljava/lang/Boolean;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setLaunch(Z)V

    .line 43
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setName(Ljava/lang/String;)V

    .line 44
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->num_preview_items()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;->asInt(Ljava/lang/Number;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setNumPreviewItems(I)V

    .line 45
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->raw_category_type()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setRawCategoryType(Ljava/lang/String;)V

    .line 46
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->short_name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setShortName(Ljava/lang/String;)V

    .line 47
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->sort_order()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;->asInt(Ljava/lang/Number;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setSortOrder(I)V

    .line 48
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->start_time()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setStartTime(Ljava/lang/String;)V

    .line 49
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->type()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setType(Ljava/lang/String;)V

    .line 51
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->content()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 52
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 53
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->content()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/graphql/fragment/CategoryFragment$Content;

    .line 54
    iget-object v4, p0, Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;->offerMapper:Lcom/ibotta/android/graphql/mapper/OfferMapper;

    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/CategoryFragment$Content;->fragments()Lcom/ibotta/android/graphql/fragment/CategoryFragment$Content$Fragments;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/CategoryFragment$Content$Fragments;->offerFragment()Lcom/ibotta/android/graphql/fragment/OfferFragment;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->map(Lcom/ibotta/android/graphql/fragment/OfferFragment;)Lcom/ibotta/api/model/content/OfferContent;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 57
    :cond_1
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setOffers(Ljava/util/List;)V

    .line 60
    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->retailers()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 61
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->retailers()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;->asIntegerSet(Ljava/util/Collection;)Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setRetailers(Ljava/util/Set;)V

    :cond_3
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

    .line 18
    check-cast p1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;->map(Lcom/ibotta/android/graphql/fragment/CategoryFragment;)Lcom/ibotta/api/model/content/OfferCategoryContent;

    move-result-object p1

    return-object p1
.end method
