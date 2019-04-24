.class public Lcom/ibotta/android/graphql/mapper/RewardMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseTaskMapper;
.source "RewardMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseTaskMapper<",
        "Lcom/ibotta/android/graphql/fragment/RewardFragment;",
        "Lcom/ibotta/api/model/content/RewardContent;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;Lcom/ibotta/android/graphql/mapper/OptionMapper;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/graphql/mapper/BaseTaskMapper;-><init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;Lcom/ibotta/android/graphql/mapper/OptionMapper;)V

    return-void
.end method

.method static synthetic lambda$getOfferRewardPolOptFragments$0(Lcom/ibotta/android/graphql/fragment/RewardFragment$Option;)Lcom/ibotta/android/graphql/fragment/OfferRewardPollOptFragment;
    .locals 0

    .line 76
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/fragment/RewardFragment$Option;->fragments()Lcom/ibotta/android/graphql/fragment/RewardFragment$Option$Fragments;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ibotta/android/graphql/fragment/RewardFragment$Option$Fragments;->offerRewardPollOptFragment()Lcom/ibotta/android/graphql/fragment/OfferRewardPollOptFragment;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$getOfferRewardQuestionFragments$1(Lcom/ibotta/android/graphql/fragment/RewardFragment$Question;)Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;
    .locals 0

    .line 83
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/fragment/RewardFragment$Question;->fragments()Lcom/ibotta/android/graphql/fragment/RewardFragment$Question$Fragments;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ibotta/android/graphql/fragment/RewardFragment$Question$Fragments;->offerRewardQuestionFragment()Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected bridge synthetic getContent(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;
    .locals 0

    .line 22
    check-cast p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/RewardMapper;->getContent(Lcom/ibotta/android/graphql/fragment/RewardFragment;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getContent(Lcom/ibotta/android/graphql/fragment/RewardFragment;)Ljava/lang/String;
    .locals 0

    .line 35
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RewardFragment;->content()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic getId(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;
    .locals 0

    .line 22
    check-cast p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/RewardMapper;->getId(Lcom/ibotta/android/graphql/fragment/RewardFragment;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getId(Lcom/ibotta/android/graphql/fragment/RewardFragment;)Ljava/lang/String;
    .locals 0

    .line 30
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RewardFragment;->id()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic getLegal(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;
    .locals 0

    .line 22
    check-cast p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/RewardMapper;->getLegal(Lcom/ibotta/android/graphql/fragment/RewardFragment;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getLegal(Lcom/ibotta/android/graphql/fragment/RewardFragment;)Ljava/lang/String;
    .locals 0

    .line 40
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RewardFragment;->legal()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic getLinkedOfferIds(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/util/List;
    .locals 0

    .line 22
    check-cast p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/RewardMapper;->getLinkedOfferIds(Lcom/ibotta/android/graphql/fragment/RewardFragment;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method protected getLinkedOfferIds(Lcom/ibotta/android/graphql/fragment/RewardFragment;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/graphql/fragment/RewardFragment;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 70
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RewardFragment;->linked_offer_ids()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic getOfferRewardPolOptFragments(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/util/List;
    .locals 0

    .line 22
    check-cast p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/RewardMapper;->getOfferRewardPolOptFragments(Lcom/ibotta/android/graphql/fragment/RewardFragment;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method protected getOfferRewardPolOptFragments(Lcom/ibotta/android/graphql/fragment/RewardFragment;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/graphql/fragment/RewardFragment;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/OfferRewardPollOptFragment;",
            ">;"
        }
    .end annotation

    .line 75
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RewardFragment;->options()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/mapper/-$$Lambda$RewardMapper$0DaY8DKjubTioRZ334t4M-zjMqw;->INSTANCE:Lcom/ibotta/android/graphql/mapper/-$$Lambda$RewardMapper$0DaY8DKjubTioRZ334t4M-zjMqw;

    .line 76
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 77
    invoke-static {}, Ljava9/util/stream/Collectors;->toList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method protected bridge synthetic getOfferRewardQuestionFragments(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/util/List;
    .locals 0

    .line 22
    check-cast p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/RewardMapper;->getOfferRewardQuestionFragments(Lcom/ibotta/android/graphql/fragment/RewardFragment;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method protected getOfferRewardQuestionFragments(Lcom/ibotta/android/graphql/fragment/RewardFragment;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/graphql/fragment/RewardFragment;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;",
            ">;"
        }
    .end annotation

    .line 82
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RewardFragment;->questions()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/mapper/-$$Lambda$RewardMapper$oEHTe5rMuNeKvh5oC4Libl0sND0;->INSTANCE:Lcom/ibotta/android/graphql/mapper/-$$Lambda$RewardMapper$oEHTe5rMuNeKvh5oC4Libl0sND0;

    .line 83
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 84
    invoke-static {}, Ljava9/util/stream/Collectors;->toList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method protected bridge synthetic getThumb(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;
    .locals 0

    .line 22
    check-cast p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/RewardMapper;->getThumb(Lcom/ibotta/android/graphql/fragment/RewardFragment;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getThumb(Lcom/ibotta/android/graphql/fragment/RewardFragment;)Ljava/lang/String;
    .locals 0

    .line 45
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RewardFragment;->thumb()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic getTrackingClickUrl(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;
    .locals 0

    .line 22
    check-cast p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/RewardMapper;->getTrackingClickUrl(Lcom/ibotta/android/graphql/fragment/RewardFragment;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getTrackingClickUrl(Lcom/ibotta/android/graphql/fragment/RewardFragment;)Ljava/lang/String;
    .locals 0

    .line 60
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RewardFragment;->tracking_click_url()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic getTrackingImpressionUrl(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;
    .locals 0

    .line 22
    check-cast p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/RewardMapper;->getTrackingImpressionUrl(Lcom/ibotta/android/graphql/fragment/RewardFragment;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getTrackingImpressionUrl(Lcom/ibotta/android/graphql/fragment/RewardFragment;)Ljava/lang/String;
    .locals 0

    .line 65
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RewardFragment;->tracking_impression_url()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic getType(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;
    .locals 0

    .line 22
    check-cast p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/RewardMapper;->getType(Lcom/ibotta/android/graphql/fragment/RewardFragment;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getType(Lcom/ibotta/android/graphql/fragment/RewardFragment;)Ljava/lang/String;
    .locals 0

    .line 50
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RewardFragment;->type()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic getUrl(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;
    .locals 0

    .line 22
    check-cast p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/RewardMapper;->getUrl(Lcom/ibotta/android/graphql/fragment/RewardFragment;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getUrl(Lcom/ibotta/android/graphql/fragment/RewardFragment;)Ljava/lang/String;
    .locals 0

    .line 55
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RewardFragment;->url()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public map(Lcom/ibotta/android/graphql/fragment/RewardFragment;)Lcom/ibotta/api/model/content/RewardContent;
    .locals 3
    .param p1    # Lcom/ibotta/android/graphql/fragment/RewardFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 93
    :cond_0
    new-instance v0, Lcom/ibotta/api/model/content/RewardContent;

    invoke-direct {v0}, Lcom/ibotta/api/model/content/RewardContent;-><init>()V

    .line 94
    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/graphql/mapper/RewardMapper;->mapTask(Lcom/ibotta/api/model/content/TaskContent;Lcom/apollographql/apollo/api/GraphqlFragment;)Lcom/ibotta/api/model/content/TaskContent;

    .line 96
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RewardFragment;->amount()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/RewardMapper;->asFloat(Ljava/lang/Number;)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RewardContent;->setAmount(F)V

    .line 97
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RewardFragment;->engagement_id()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/RewardMapper;->asLong(Ljava/lang/Number;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/api/model/content/RewardContent;->setEngagementId(J)V

    .line 98
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RewardFragment;->weight()Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/RewardMapper;->asInt(Ljava/lang/Number;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/content/RewardContent;->setWeight(Ljava/lang/Integer;)V

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

    .line 22
    check-cast p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/RewardMapper;->map(Lcom/ibotta/android/graphql/fragment/RewardFragment;)Lcom/ibotta/api/model/content/RewardContent;

    move-result-object p1

    return-object p1
.end method
