.class public Lcom/ibotta/android/graphql/mapper/BonusMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "BonusMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/BonusFragment;",
        "Lcom/ibotta/api/model/content/BonusContent;",
        ">;"
    }
.end annotation


# instance fields
.field private final bonusQualificationMapper:Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;

.field private final questMapper:Lcom/ibotta/android/graphql/mapper/QuestMapper;

.field private final sortResultMapper:Lcom/ibotta/android/graphql/mapper/SortResultMapper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/QuestMapper;Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;Lcom/ibotta/android/graphql/mapper/SortResultMapper;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/BaseMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/graphql/mapper/BonusMapper;->questMapper:Lcom/ibotta/android/graphql/mapper/QuestMapper;

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/graphql/mapper/BonusMapper;->bonusQualificationMapper:Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;

    .line 31
    iput-object p4, p0, Lcom/ibotta/android/graphql/mapper/BonusMapper;->sortResultMapper:Lcom/ibotta/android/graphql/mapper/SortResultMapper;

    return-void
.end method


# virtual methods
.method protected createBonusContent()Lcom/ibotta/api/model/content/BonusContent;
    .locals 1

    .line 110
    new-instance v0, Lcom/ibotta/api/model/content/BonusContent;

    invoke-direct {v0}, Lcom/ibotta/api/model/content/BonusContent;-><init>()V

    return-object v0
.end method

.method public map(Lcom/ibotta/android/graphql/fragment/BonusFragment;)Lcom/ibotta/api/model/content/BonusContent;
    .locals 5
    .param p1    # Lcom/ibotta/android/graphql/fragment/BonusFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 40
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/mapper/BonusMapper;->createBonusContent()Lcom/ibotta/api/model/content/BonusContent;

    move-result-object v0

    .line 42
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->active()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/BonusMapper;->asBoolean(Ljava/lang/Boolean;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setActive(Z)V

    .line 43
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->amount()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/BonusMapper;->asFloat(Ljava/lang/Number;)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setAmount(F)V

    .line 45
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->bonus_qualifications()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 47
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 48
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/graphql/fragment/BonusFragment$Bonus_qualification;

    .line 49
    iget-object v4, p0, Lcom/ibotta/android/graphql/mapper/BonusMapper;->bonusQualificationMapper:Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;

    .line 50
    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/BonusFragment$Bonus_qualification;->fragments()Lcom/ibotta/android/graphql/fragment/BonusFragment$Bonus_qualification$Fragments;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/BonusFragment$Bonus_qualification$Fragments;->bonusQualificationFragment()Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;

    move-result-object v3

    .line 49
    invoke-virtual {v4, v3}, Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;->map(Lcom/ibotta/android/graphql/fragment/BonusQualificationFragment;)Lcom/ibotta/api/model/content/QualificationContent;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {v0, v2}, Lcom/ibotta/api/model/content/BonusContent;->setBonusQualifications(Ljava/util/List;)V

    .line 56
    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->bonus_type()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setBonusType(Ljava/lang/String;)V

    .line 57
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->cache_key()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setCacheKey(Ljava/lang/String;)V

    .line 58
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->completed()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/BonusMapper;->asBoolean(Ljava/lang/Boolean;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setCompleted(Z)V

    .line 59
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->completed_image_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setCompletedImageUrl(Ljava/lang/String;)V

    .line 60
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->description()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setDescription(Ljava/lang/String;)V

    .line 61
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->elegible()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/BonusMapper;->asBoolean(Ljava/lang/Boolean;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setEligible(Z)V

    .line 62
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->expiration()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/BonusMapper;->asDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setExpiration(Ljava/util/Date;)V

    .line 63
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/BonusMapper;->asInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setId(I)V

    .line 64
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setIdString(Ljava/lang/String;)V

    .line 65
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->level()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/BonusMapper;->asInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setLevel(I)V

    .line 66
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->link()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setLink(Ljava/lang/String;)V

    .line 67
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->locked()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/BonusMapper;->asBoolean(Ljava/lang/Boolean;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setLocked(Z)V

    .line 68
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->max_retailer_distance()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/BonusMapper;->asInt(Ljava/lang/Number;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setMaxRetailerDistance(Ljava/lang/Integer;)V

    .line 69
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setName(Ljava/lang/String;)V

    .line 71
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->offers()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 72
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->offers()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/BonusMapper;->asIntegerSet(Ljava/util/Collection;)Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setOffers(Ljava/util/Set;)V

    .line 75
    :cond_3
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->other_reward()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setOtherReward(Ljava/lang/String;)V

    .line 76
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->percent_complete()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/BonusMapper;->asFloat(Ljava/lang/Number;)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setPercentComplete(F)V

    .line 77
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->progress_color()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setProgressColor(Ljava/lang/String;)V

    .line 78
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->progress_count()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/BonusMapper;->asFloat(Ljava/lang/Number;)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setProgressCount(F)V

    .line 80
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->quest()Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 82
    iget-object v2, p0, Lcom/ibotta/android/graphql/mapper/BonusMapper;->questMapper:Lcom/ibotta/android/graphql/mapper/QuestMapper;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest;->fragments()Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest$Fragments;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest$Fragments;->questFragment()Lcom/ibotta/android/graphql/fragment/QuestFragment;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/ibotta/android/graphql/mapper/QuestMapper;->map(Lcom/ibotta/android/graphql/fragment/QuestFragment;)Lcom/ibotta/api/model/content/QuestContent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setQuest(Lcom/ibotta/api/model/QuestModel;)V

    .line 85
    :cond_4
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->retailer_id()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/BonusMapper;->asInt(Ljava/lang/Number;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setRetailerId(I)V

    .line 86
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->customer_started_time()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/BonusMapper;->asDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setStarted(Ljava/util/Date;)V

    .line 87
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->score()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/BonusMapper;->asFloat(Ljava/lang/Number;)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setScore(F)V

    .line 88
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->sort_order()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setSortOrder(Ljava/lang/String;)V

    .line 90
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->sort_results()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 92
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 93
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/graphql/fragment/BonusFragment$Sort_result;

    .line 94
    iget-object v4, p0, Lcom/ibotta/android/graphql/mapper/BonusMapper;->sortResultMapper:Lcom/ibotta/android/graphql/mapper/SortResultMapper;

    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/BonusFragment$Sort_result;->fragments()Lcom/ibotta/android/graphql/fragment/BonusFragment$Sort_result$Fragments;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/BonusFragment$Sort_result$Fragments;->sortResultFragment()Lcom/ibotta/android/graphql/fragment/SortResultFragment;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/ibotta/android/graphql/mapper/SortResultMapper;->map(Lcom/ibotta/android/graphql/fragment/SortResultFragment;)Lcom/ibotta/api/model/content/SortResultContent;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 97
    :cond_5
    invoke-virtual {v0, v2}, Lcom/ibotta/api/model/content/BonusContent;->setSortResults(Ljava/util/List;)V

    .line 100
    :cond_6
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->terms()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setTerms(Ljava/lang/String;)V

    .line 101
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->type()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setType(Ljava/lang/String;)V

    .line 102
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->typed_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setTypedId(Ljava/lang/String;)V

    .line 103
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->uncompleted_image_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BonusContent;->setUncompletedImageUrl(Ljava/lang/String;)V

    .line 104
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->weight()Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/BonusMapper;->asFloat(Ljava/lang/Number;)F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/content/BonusContent;->setWeight(F)V

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
    check-cast p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/BonusMapper;->map(Lcom/ibotta/android/graphql/fragment/BonusFragment;)Lcom/ibotta/api/model/content/BonusContent;

    move-result-object p1

    return-object p1
.end method
