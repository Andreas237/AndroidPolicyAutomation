.class public Lcom/ibotta/android/fragment/game/question/SurveyGameQuestionDriver;
.super Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;
.source "SurveyGameQuestionDriver.java"


# direct methods
.method public constructor <init>(Lcom/ibotta/api/model/TaskModel;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;-><init>(Lcom/ibotta/api/model/TaskModel;)V

    return-void
.end method


# virtual methods
.method protected buildGameQuestionList()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/fragment/game/question/GameQuestion;",
            ">;"
        }
    .end annotation

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 34
    iget-object v1, p0, Lcom/ibotta/android/fragment/game/question/SurveyGameQuestionDriver;->taskModel:Lcom/ibotta/api/model/TaskModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/TaskModel;->getQuestions()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/QuestionModel;

    .line 35
    new-instance v3, Lcom/ibotta/android/fragment/game/question/GameQuestion;

    invoke-direct {v3}, Lcom/ibotta/android/fragment/game/question/GameQuestion;-><init>()V

    .line 36
    invoke-interface {v2}, Lcom/ibotta/api/model/QuestionModel;->getId()I

    move-result v4

    int-to-long v4, v4

    invoke-virtual {v3, v4, v5}, Lcom/ibotta/android/fragment/game/question/GameQuestion;->setId(J)V

    .line 37
    invoke-interface {v2}, Lcom/ibotta/api/model/QuestionModel;->getContent()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/ibotta/android/fragment/game/question/GameQuestion;->setContent(Ljava/lang/String;)V

    .line 38
    invoke-interface {v2}, Lcom/ibotta/api/model/QuestionModel;->isMultipleResponse()Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v4, Lcom/ibotta/android/fragment/game/question/Mode;->ANSWER_MULTI:Lcom/ibotta/android/fragment/game/question/Mode;

    goto :goto_1

    :cond_0
    sget-object v4, Lcom/ibotta/android/fragment/game/question/Mode;->ANSWER_SINGLE:Lcom/ibotta/android/fragment/game/question/Mode;

    :goto_1
    invoke-virtual {v3, v4}, Lcom/ibotta/android/fragment/game/question/GameQuestion;->setMode(Lcom/ibotta/android/fragment/game/question/Mode;)V

    .line 39
    invoke-interface {v2}, Lcom/ibotta/api/model/QuestionModel;->getOptions()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/ibotta/android/fragment/game/question/GameQuestion;->setOptions(Ljava/util/List;)V

    .line 40
    invoke-interface {v2}, Lcom/ibotta/api/model/QuestionModel;->getAnswer()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/ibotta/android/fragment/game/question/GameQuestion;->setAnswer(I)V

    .line 41
    invoke-interface {v2}, Lcom/ibotta/api/model/QuestionModel;->getWeight()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/ibotta/android/fragment/game/question/GameQuestion;->setWeight(Ljava/lang/Integer;)V

    .line 43
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 46
    :cond_1
    new-instance v1, Lcom/ibotta/android/fragment/game/question/GameQuestionWeightComparator;

    invoke-direct {v1}, Lcom/ibotta/android/fragment/game/question/GameQuestionWeightComparator;-><init>()V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    const v0, 0x7f110309

    .line 21
    invoke-virtual {p0, v0}, Lcom/ibotta/android/fragment/game/question/SurveyGameQuestionDriver;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTokenImage()I
    .locals 1

    const v0, 0x7f080026

    return v0
.end method
