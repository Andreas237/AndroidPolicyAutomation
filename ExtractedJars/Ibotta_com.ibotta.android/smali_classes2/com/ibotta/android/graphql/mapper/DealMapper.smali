.class public Lcom/ibotta/android/graphql/mapper/DealMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "DealMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/DealFragment;",
        "Lcom/ibotta/api/model/content/DealContent;",
        ">;"
    }
.end annotation


# instance fields
.field private final sortResultMapper:Lcom/ibotta/android/graphql/mapper/SortResultMapper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/SortResultMapper;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/BaseMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    .line 19
    iput-object p2, p0, Lcom/ibotta/android/graphql/mapper/DealMapper;->sortResultMapper:Lcom/ibotta/android/graphql/mapper/SortResultMapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/ibotta/android/graphql/fragment/DealFragment;)Lcom/ibotta/api/model/content/DealContent;
    .locals 4
    .param p1    # Lcom/ibotta/android/graphql/fragment/DealFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 28
    :cond_0
    new-instance v0, Lcom/ibotta/api/model/content/DealContent;

    invoke-direct {v0}, Lcom/ibotta/api/model/content/DealContent;-><init>()V

    .line 30
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/DealFragment;->id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/DealContent;->setIdString(Ljava/lang/String;)V

    .line 31
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/DealFragment;->action_button_text()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/DealContent;->setActionButtonText(Ljava/lang/String;)V

    .line 32
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/DealFragment;->action_button_type()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/DealContent;->setActionButtonType(Ljava/lang/String;)V

    .line 33
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/DealFragment;->button_info()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/DealContent;->setButtonInfo(Ljava/lang/String;)V

    .line 34
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/DealFragment;->cache_key()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/DealContent;->setCacheKey(Ljava/lang/String;)V

    .line 35
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/DealFragment;->callback_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/DealContent;->setCallbackUrl(Ljava/lang/String;)V

    .line 36
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/DealFragment;->deeplink_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/DealContent;->setDeeplinkUrl(Ljava/lang/String;)V

    .line 37
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/DealFragment;->description()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/DealContent;->setDescription(Ljava/lang/String;)V

    .line 38
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/DealFragment;->end_time()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/DealContent;->setEndTime(Ljava/lang/String;)V

    .line 39
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/DealFragment;->image_url_large()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/DealContent;->setImageUrlLarge(Ljava/lang/String;)V

    .line 40
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/DealFragment;->image_url_small()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/DealContent;->setImageUrlSmall(Ljava/lang/String;)V

    .line 41
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/DealFragment;->image_url_thumbnail()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/DealContent;->setImageUrlThumbnail(Ljava/lang/String;)V

    .line 42
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/DealFragment;->link()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/DealContent;->setLink(Ljava/lang/String;)V

    .line 43
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/DealFragment;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/DealContent;->setName(Ljava/lang/String;)V

    .line 44
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/DealFragment;->percent_back_text()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/DealContent;->setPercentBackText(Ljava/lang/String;)V

    .line 45
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/DealFragment;->price()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/DealMapper;->asFloat(Ljava/lang/Number;)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/DealContent;->setPrice(F)V

    .line 46
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/DealFragment;->retailer_id()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/DealMapper;->asInt(Ljava/lang/Number;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/DealContent;->setRetailerId(I)V

    .line 47
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/DealFragment;->sort_order()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/DealContent;->setSortOrder(Ljava/lang/String;)V

    .line 48
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/DealFragment;->start_time()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/DealContent;->setStartTime(Ljava/lang/String;)V

    .line 49
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/DealFragment;->type()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/DealContent;->setType(Ljava/lang/String;)V

    .line 50
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/DealFragment;->typed_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/DealContent;->setTypedId(Ljava/lang/String;)V

    .line 52
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/DealFragment;->sort_results()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 54
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 55
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/graphql/fragment/DealFragment$Sort_result;

    .line 56
    iget-object v3, p0, Lcom/ibotta/android/graphql/mapper/DealMapper;->sortResultMapper:Lcom/ibotta/android/graphql/mapper/SortResultMapper;

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/DealFragment$Sort_result;->fragments()Lcom/ibotta/android/graphql/fragment/DealFragment$Sort_result$Fragments;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/DealFragment$Sort_result$Fragments;->sortResultFragment()Lcom/ibotta/android/graphql/fragment/SortResultFragment;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/ibotta/android/graphql/mapper/SortResultMapper;->map(Lcom/ibotta/android/graphql/fragment/SortResultFragment;)Lcom/ibotta/api/model/content/SortResultContent;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 59
    :cond_1
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/DealContent;->setSortResults(Ljava/util/List;)V

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

    .line 13
    check-cast p1, Lcom/ibotta/android/graphql/fragment/DealFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/DealMapper;->map(Lcom/ibotta/android/graphql/fragment/DealFragment;)Lcom/ibotta/api/model/content/DealContent;

    move-result-object p1

    return-object p1
.end method
