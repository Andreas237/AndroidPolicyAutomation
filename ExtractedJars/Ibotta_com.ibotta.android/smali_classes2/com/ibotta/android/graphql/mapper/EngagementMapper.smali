.class public Lcom/ibotta/android/graphql/mapper/EngagementMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseTaskMapper;
.source "EngagementMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseTaskMapper<",
        "Lcom/ibotta/android/graphql/fragment/EngagementFragment;",
        "Lcom/ibotta/api/model/content/EngagementContent;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;Lcom/ibotta/android/graphql/mapper/OptionMapper;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/graphql/mapper/BaseTaskMapper;-><init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;Lcom/ibotta/android/graphql/mapper/OptionMapper;)V

    return-void
.end method

.method static synthetic lambda$getOfferRewardPolOptFragments$0(Lcom/ibotta/android/graphql/fragment/EngagementFragment$Option;)Lcom/ibotta/android/graphql/fragment/OfferRewardPollOptFragment;
    .locals 0

    .line 75
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/fragment/EngagementFragment$Option;->fragments()Lcom/ibotta/android/graphql/fragment/EngagementFragment$Option$Fragments;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ibotta/android/graphql/fragment/EngagementFragment$Option$Fragments;->offerRewardPollOptFragment()Lcom/ibotta/android/graphql/fragment/OfferRewardPollOptFragment;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$getOfferRewardQuestionFragments$1(Lcom/ibotta/android/graphql/fragment/EngagementFragment$Question;)Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;
    .locals 0

    .line 82
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/fragment/EngagementFragment$Question;->fragments()Lcom/ibotta/android/graphql/fragment/EngagementFragment$Question$Fragments;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ibotta/android/graphql/fragment/EngagementFragment$Question$Fragments;->offerRewardQuestionFragment()Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected bridge synthetic getContent(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;
    .locals 0

    .line 21
    check-cast p1, Lcom/ibotta/android/graphql/fragment/EngagementFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/EngagementMapper;->getContent(Lcom/ibotta/android/graphql/fragment/EngagementFragment;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getContent(Lcom/ibotta/android/graphql/fragment/EngagementFragment;)Ljava/lang/String;
    .locals 0

    .line 34
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->content()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic getId(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;
    .locals 0

    .line 21
    check-cast p1, Lcom/ibotta/android/graphql/fragment/EngagementFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/EngagementMapper;->getId(Lcom/ibotta/android/graphql/fragment/EngagementFragment;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getId(Lcom/ibotta/android/graphql/fragment/EngagementFragment;)Ljava/lang/String;
    .locals 0

    .line 29
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->id()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic getLegal(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;
    .locals 0

    .line 21
    check-cast p1, Lcom/ibotta/android/graphql/fragment/EngagementFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/EngagementMapper;->getLegal(Lcom/ibotta/android/graphql/fragment/EngagementFragment;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getLegal(Lcom/ibotta/android/graphql/fragment/EngagementFragment;)Ljava/lang/String;
    .locals 0

    .line 39
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->legal()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic getLinkedOfferIds(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/util/List;
    .locals 0

    .line 21
    check-cast p1, Lcom/ibotta/android/graphql/fragment/EngagementFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/EngagementMapper;->getLinkedOfferIds(Lcom/ibotta/android/graphql/fragment/EngagementFragment;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method protected getLinkedOfferIds(Lcom/ibotta/android/graphql/fragment/EngagementFragment;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/graphql/fragment/EngagementFragment;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 69
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->linked_offer_ids()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic getOfferRewardPolOptFragments(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/util/List;
    .locals 0

    .line 21
    check-cast p1, Lcom/ibotta/android/graphql/fragment/EngagementFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/EngagementMapper;->getOfferRewardPolOptFragments(Lcom/ibotta/android/graphql/fragment/EngagementFragment;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method protected getOfferRewardPolOptFragments(Lcom/ibotta/android/graphql/fragment/EngagementFragment;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/graphql/fragment/EngagementFragment;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/OfferRewardPollOptFragment;",
            ">;"
        }
    .end annotation

    .line 74
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->options()Ljava/util/List;

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

    sget-object v0, Lcom/ibotta/android/graphql/mapper/-$$Lambda$EngagementMapper$SPPwyjt-P1v9JWLUvdxx_bl8mAE;->INSTANCE:Lcom/ibotta/android/graphql/mapper/-$$Lambda$EngagementMapper$SPPwyjt-P1v9JWLUvdxx_bl8mAE;

    .line 75
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 76
    invoke-static {}, Ljava9/util/stream/Collectors;->toList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method protected bridge synthetic getOfferRewardQuestionFragments(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/util/List;
    .locals 0

    .line 21
    check-cast p1, Lcom/ibotta/android/graphql/fragment/EngagementFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/EngagementMapper;->getOfferRewardQuestionFragments(Lcom/ibotta/android/graphql/fragment/EngagementFragment;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method protected getOfferRewardQuestionFragments(Lcom/ibotta/android/graphql/fragment/EngagementFragment;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/graphql/fragment/EngagementFragment;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;",
            ">;"
        }
    .end annotation

    .line 81
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->questions()Ljava/util/List;

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

    sget-object v0, Lcom/ibotta/android/graphql/mapper/-$$Lambda$EngagementMapper$I01YwrZQ-ex1Y63IPJJNmBT8SFs;->INSTANCE:Lcom/ibotta/android/graphql/mapper/-$$Lambda$EngagementMapper$I01YwrZQ-ex1Y63IPJJNmBT8SFs;

    .line 82
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 83
    invoke-static {}, Ljava9/util/stream/Collectors;->toList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method protected bridge synthetic getThumb(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;
    .locals 0

    .line 21
    check-cast p1, Lcom/ibotta/android/graphql/fragment/EngagementFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/EngagementMapper;->getThumb(Lcom/ibotta/android/graphql/fragment/EngagementFragment;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getThumb(Lcom/ibotta/android/graphql/fragment/EngagementFragment;)Ljava/lang/String;
    .locals 0

    .line 44
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->thumb()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic getTrackingClickUrl(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;
    .locals 0

    .line 21
    check-cast p1, Lcom/ibotta/android/graphql/fragment/EngagementFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/EngagementMapper;->getTrackingClickUrl(Lcom/ibotta/android/graphql/fragment/EngagementFragment;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getTrackingClickUrl(Lcom/ibotta/android/graphql/fragment/EngagementFragment;)Ljava/lang/String;
    .locals 0

    .line 59
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->tracking_click_url()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic getTrackingImpressionUrl(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;
    .locals 0

    .line 21
    check-cast p1, Lcom/ibotta/android/graphql/fragment/EngagementFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/EngagementMapper;->getTrackingImpressionUrl(Lcom/ibotta/android/graphql/fragment/EngagementFragment;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getTrackingImpressionUrl(Lcom/ibotta/android/graphql/fragment/EngagementFragment;)Ljava/lang/String;
    .locals 0

    .line 64
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->tracking_impression_url()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic getType(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;
    .locals 0

    .line 21
    check-cast p1, Lcom/ibotta/android/graphql/fragment/EngagementFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/EngagementMapper;->getType(Lcom/ibotta/android/graphql/fragment/EngagementFragment;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getType(Lcom/ibotta/android/graphql/fragment/EngagementFragment;)Ljava/lang/String;
    .locals 0

    .line 49
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->type()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic getUrl(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;
    .locals 0

    .line 21
    check-cast p1, Lcom/ibotta/android/graphql/fragment/EngagementFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/EngagementMapper;->getUrl(Lcom/ibotta/android/graphql/fragment/EngagementFragment;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getUrl(Lcom/ibotta/android/graphql/fragment/EngagementFragment;)Ljava/lang/String;
    .locals 0

    .line 54
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->url()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public map(Lcom/ibotta/android/graphql/fragment/EngagementFragment;)Lcom/ibotta/api/model/content/EngagementContent;
    .locals 3
    .param p1    # Lcom/ibotta/android/graphql/fragment/EngagementFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 92
    :cond_0
    new-instance v0, Lcom/ibotta/api/model/content/EngagementContent;

    invoke-direct {v0}, Lcom/ibotta/api/model/content/EngagementContent;-><init>()V

    .line 93
    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/graphql/mapper/EngagementMapper;->mapTask(Lcom/ibotta/api/model/content/TaskContent;Lcom/apollographql/apollo/api/GraphqlFragment;)Lcom/ibotta/api/model/content/TaskContent;

    .line 95
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->reward_id()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/EngagementMapper;->asLong(Ljava/lang/Number;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/api/model/content/EngagementContent;->setRewardId(J)V

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

    .line 21
    check-cast p1, Lcom/ibotta/android/graphql/fragment/EngagementFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/EngagementMapper;->map(Lcom/ibotta/android/graphql/fragment/EngagementFragment;)Lcom/ibotta/api/model/content/EngagementContent;

    move-result-object p1

    return-object p1
.end method
