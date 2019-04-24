.class public abstract Lcom/ibotta/android/graphql/mapper/BaseTaskMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "BaseTaskMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<F::",
        "Lcom/apollographql/apollo/api/GraphqlFragment;",
        "C:",
        "Lcom/ibotta/api/model/content/TaskContent;",
        ">",
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "TF;TC;>;"
    }
.end annotation


# instance fields
.field private final offerRewardQuestionMapper:Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;

.field private final optionMapper:Lcom/ibotta/android/graphql/mapper/OptionMapper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;Lcom/ibotta/android/graphql/mapper/OptionMapper;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/BaseMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    .line 38
    iput-object p2, p0, Lcom/ibotta/android/graphql/mapper/BaseTaskMapper;->offerRewardQuestionMapper:Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;

    .line 39
    iput-object p3, p0, Lcom/ibotta/android/graphql/mapper/BaseTaskMapper;->optionMapper:Lcom/ibotta/android/graphql/mapper/OptionMapper;

    return-void
.end method


# virtual methods
.method protected abstract getContent(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TF;)",
            "Ljava/lang/String;"
        }
    .end annotation
.end method

.method protected abstract getId(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TF;)",
            "Ljava/lang/String;"
        }
    .end annotation
.end method

.method protected abstract getLegal(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TF;)",
            "Ljava/lang/String;"
        }
    .end annotation
.end method

.method protected abstract getLinkedOfferIds(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TF;)",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end method

.method protected abstract getOfferRewardPolOptFragments(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TF;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/OfferRewardPollOptFragment;",
            ">;"
        }
    .end annotation
.end method

.method protected abstract getOfferRewardQuestionFragments(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TF;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;",
            ">;"
        }
    .end annotation
.end method

.method protected abstract getThumb(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TF;)",
            "Ljava/lang/String;"
        }
    .end annotation
.end method

.method protected abstract getTrackingClickUrl(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TF;)",
            "Ljava/lang/String;"
        }
    .end annotation
.end method

.method protected abstract getTrackingImpressionUrl(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TF;)",
            "Ljava/lang/String;"
        }
    .end annotation
.end method

.method protected abstract getType(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TF;)",
            "Ljava/lang/String;"
        }
    .end annotation
.end method

.method protected abstract getUrl(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TF;)",
            "Ljava/lang/String;"
        }
    .end annotation
.end method

.method public mapTask(Lcom/ibotta/api/model/content/TaskContent;Lcom/apollographql/apollo/api/GraphqlFragment;)Lcom/ibotta/api/model/content/TaskContent;
    .locals 4
    .param p2    # Lcom/apollographql/apollo/api/GraphqlFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;TF;)TC;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 48
    :cond_0
    invoke-virtual {p0, p2}, Lcom/ibotta/android/graphql/mapper/BaseTaskMapper;->getId(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/graphql/mapper/BaseTaskMapper;->asInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/ibotta/api/model/content/TaskContent;->setId(I)V

    .line 49
    invoke-virtual {p0, p2}, Lcom/ibotta/android/graphql/mapper/BaseTaskMapper;->getContent(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/api/model/content/TaskContent;->setContent(Ljava/lang/String;)V

    .line 50
    invoke-virtual {p0, p2}, Lcom/ibotta/android/graphql/mapper/BaseTaskMapper;->getLegal(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/api/model/content/TaskContent;->setLegal(Ljava/lang/String;)V

    .line 51
    invoke-virtual {p0, p2}, Lcom/ibotta/android/graphql/mapper/BaseTaskMapper;->getThumb(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/api/model/content/TaskContent;->setThumb(Ljava/lang/String;)V

    .line 52
    invoke-virtual {p0, p2}, Lcom/ibotta/android/graphql/mapper/BaseTaskMapper;->getType(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/api/model/content/TaskContent;->setType(Ljava/lang/String;)V

    .line 53
    invoke-virtual {p0, p2}, Lcom/ibotta/android/graphql/mapper/BaseTaskMapper;->getUrl(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/api/model/content/TaskContent;->setUrl(Ljava/lang/String;)V

    .line 54
    invoke-virtual {p0, p2}, Lcom/ibotta/android/graphql/mapper/BaseTaskMapper;->getTrackingClickUrl(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/api/model/content/TaskContent;->setTrackingClickUrl(Ljava/lang/String;)V

    .line 55
    invoke-virtual {p0, p2}, Lcom/ibotta/android/graphql/mapper/BaseTaskMapper;->getTrackingImpressionUrl(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/api/model/content/TaskContent;->setTrackingImpressionUrl(Ljava/lang/String;)V

    .line 57
    invoke-virtual {p0, p2}, Lcom/ibotta/android/graphql/mapper/BaseTaskMapper;->getLinkedOfferIds(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 58
    invoke-virtual {p0, p2}, Lcom/ibotta/android/graphql/mapper/BaseTaskMapper;->getLinkedOfferIds(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/graphql/mapper/BaseTaskMapper;->asIntegerSet(Ljava/util/Collection;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/api/model/content/TaskContent;->setLinkedOfferIds(Ljava/util/Set;)V

    .line 61
    :cond_1
    invoke-virtual {p0, p2}, Lcom/ibotta/android/graphql/mapper/BaseTaskMapper;->getOfferRewardPolOptFragments(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 63
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 65
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/graphql/fragment/OfferRewardPollOptFragment;

    .line 66
    iget-object v3, p0, Lcom/ibotta/android/graphql/mapper/BaseTaskMapper;->optionMapper:Lcom/ibotta/android/graphql/mapper/OptionMapper;

    invoke-virtual {v3, v2}, Lcom/ibotta/android/graphql/mapper/OptionMapper;->map(Lcom/ibotta/android/graphql/fragment/OfferRewardPollOptFragment;)Lcom/ibotta/api/model/content/OptionContent;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 69
    :cond_2
    invoke-virtual {p1, v1}, Lcom/ibotta/api/model/content/TaskContent;->setOptions(Ljava/util/List;)V

    .line 72
    :cond_3
    invoke-virtual {p0, p2}, Lcom/ibotta/android/graphql/mapper/BaseTaskMapper;->getOfferRewardQuestionFragments(Lcom/apollographql/apollo/api/GraphqlFragment;)Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_5

    .line 74
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 76
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;

    .line 77
    iget-object v2, p0, Lcom/ibotta/android/graphql/mapper/BaseTaskMapper;->offerRewardQuestionMapper:Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;

    invoke-virtual {v2, v1}, Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;->map(Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;)Lcom/ibotta/api/model/content/QuestionContent;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 80
    :cond_4
    invoke-virtual {p1, v0}, Lcom/ibotta/api/model/content/TaskContent;->setQuestions(Ljava/util/List;)V

    :cond_5
    return-object p1
.end method
