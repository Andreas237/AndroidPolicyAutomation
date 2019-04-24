.class public Lcom/ibotta/android/graphql/mapper/OptionMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "OptionMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/OfferRewardPollOptFragment;",
        "Lcom/ibotta/api/model/content/OptionContent;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/BaseMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-void
.end method


# virtual methods
.method public map(Lcom/ibotta/android/graphql/fragment/OfferRewardPollOptFragment;)Lcom/ibotta/api/model/content/OptionContent;
    .locals 2
    .param p1    # Lcom/ibotta/android/graphql/fragment/OfferRewardPollOptFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 24
    :cond_0
    new-instance v0, Lcom/ibotta/api/model/content/OptionContent;

    invoke-direct {v0}, Lcom/ibotta/api/model/content/OptionContent;-><init>()V

    .line 26
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferRewardPollOptFragment;->id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OptionMapper;->asInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OptionContent;->setId(I)V

    .line 27
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferRewardPollOptFragment;->clear_options()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OptionMapper;->asBoolean(Ljava/lang/Boolean;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OptionContent;->setClearOptions(Z)V

    .line 28
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferRewardPollOptFragment;->content()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OptionContent;->setContent(Ljava/lang/String;)V

    .line 29
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferRewardPollOptFragment;->next_survey_question()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OptionMapper;->asInt(Ljava/lang/Number;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OptionContent;->setNextSurveyQuestion(Ljava/lang/Integer;)V

    .line 30
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferRewardPollOptFragment;->url()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/content/OptionContent;->setUrl(Ljava/lang/String;)V

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
    check-cast p1, Lcom/ibotta/android/graphql/fragment/OfferRewardPollOptFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/OptionMapper;->map(Lcom/ibotta/android/graphql/fragment/OfferRewardPollOptFragment;)Lcom/ibotta/api/model/content/OptionContent;

    move-result-object p1

    return-object p1
.end method
