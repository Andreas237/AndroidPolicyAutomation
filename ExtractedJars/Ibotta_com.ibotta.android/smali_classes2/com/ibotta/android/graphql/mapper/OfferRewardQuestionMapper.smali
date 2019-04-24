.class public Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "OfferRewardQuestionMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;",
        "Lcom/ibotta/api/model/content/QuestionContent;",
        ">;"
    }
.end annotation


# instance fields
.field private final optionMapper:Lcom/ibotta/android/graphql/mapper/OptionMapper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/OptionMapper;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/BaseMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;->optionMapper:Lcom/ibotta/android/graphql/mapper/OptionMapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;)Lcom/ibotta/api/model/content/QuestionContent;
    .locals 4
    .param p1    # Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;
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
    new-instance v0, Lcom/ibotta/api/model/content/QuestionContent;

    invoke-direct {v0}, Lcom/ibotta/api/model/content/QuestionContent;-><init>()V

    .line 34
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;->id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;->asInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/QuestionContent;->setId(I)V

    .line 36
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;->answer()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;->asInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/QuestionContent;->setAnswer(I)V

    .line 37
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;->content()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/QuestionContent;->setContent(Ljava/lang/String;)V

    .line 38
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;->multiple_response()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;->asBoolean(Ljava/lang/Boolean;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/QuestionContent;->setMultipleResponse(Z)V

    .line 39
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;->url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/QuestionContent;->setUrl(Ljava/lang/String;)V

    .line 42
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;->options()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 43
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 45
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;->options()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment$Option;

    .line 46
    iget-object v3, p0, Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;->optionMapper:Lcom/ibotta/android/graphql/mapper/OptionMapper;

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment$Option;->fragments()Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment$Option$Fragments;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment$Option$Fragments;->offerRewardPollOptFragment()Lcom/ibotta/android/graphql/fragment/OfferRewardPollOptFragment;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/ibotta/android/graphql/mapper/OptionMapper;->map(Lcom/ibotta/android/graphql/fragment/OfferRewardPollOptFragment;)Lcom/ibotta/api/model/content/OptionContent;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/QuestionContent;->setOptions(Ljava/util/List;)V

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

    .line 18
    check-cast p1, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;->map(Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;)Lcom/ibotta/api/model/content/QuestionContent;

    move-result-object p1

    return-object p1
.end method
