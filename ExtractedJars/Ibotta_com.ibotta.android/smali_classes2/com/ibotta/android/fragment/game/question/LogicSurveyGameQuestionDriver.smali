.class public Lcom/ibotta/android/fragment/game/question/LogicSurveyGameQuestionDriver;
.super Lcom/ibotta/android/fragment/game/question/SurveyGameQuestionDriver;
.source "LogicSurveyGameQuestionDriver.java"


# instance fields
.field private final optionHelper:Lcom/ibotta/api/helper/offer/OptionHelper;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/helper/offer/OptionHelper;Lcom/ibotta/api/model/TaskModel;)V
    .locals 0

    .line 15
    invoke-direct {p0, p2}, Lcom/ibotta/android/fragment/game/question/SurveyGameQuestionDriver;-><init>(Lcom/ibotta/api/model/TaskModel;)V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/fragment/game/question/LogicSurveyGameQuestionDriver;->optionHelper:Lcom/ibotta/api/helper/offer/OptionHelper;

    return-void
.end method


# virtual methods
.method public getSubmitButtonText()Ljava/lang/String;
    .locals 1

    const v0, 0x7f110306

    .line 56
    invoke-virtual {p0, v0}, Lcom/ibotta/android/fragment/game/question/LogicSurveyGameQuestionDriver;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSubtitle()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public isQuestionNext()Z
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/fragment/game/question/LogicSurveyGameQuestionDriver;->taskModel:Lcom/ibotta/api/model/TaskModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/TaskModel;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-super {p0}, Lcom/ibotta/android/fragment/game/question/SurveyGameQuestionDriver;->isQuestionNext()Z

    move-result v0

    :goto_0
    return v0
.end method

.method public navigateForward()Z
    .locals 6

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/fragment/game/question/LogicSurveyGameQuestionDriver;->responses:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/fragment/game/question/LogicSurveyGameQuestionDriver;->responses:Ljava/util/List;

    iget-object v2, p0, Lcom/ibotta/android/fragment/game/question/LogicSurveyGameQuestionDriver;->responses:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    .line 28
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/game/question/LogicSurveyGameQuestionDriver;->getCurrentGameQuestion()Lcom/ibotta/android/fragment/game/question/GameQuestion;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 32
    iget-object v2, p0, Lcom/ibotta/android/fragment/game/question/LogicSurveyGameQuestionDriver;->optionHelper:Lcom/ibotta/api/helper/offer/OptionHelper;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/game/question/GameQuestion;->getOptions()Ljava/util/List;

    move-result-object v0

    invoke-interface {v2, v0, v4, v5}, Lcom/ibotta/api/helper/offer/OptionHelper;->findById(Ljava/util/List;J)Lcom/ibotta/api/model/OptionModel;

    move-result-object v2

    :cond_0
    if-eqz v2, :cond_1

    .line 35
    invoke-interface {v2}, Lcom/ibotta/api/model/OptionModel;->getNextSurveyQuestion()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 36
    iget-wide v0, p0, Lcom/ibotta/android/fragment/game/question/LogicSurveyGameQuestionDriver;->currentId:J

    iput-wide v0, p0, Lcom/ibotta/android/fragment/game/question/LogicSurveyGameQuestionDriver;->previousId:J

    .line 37
    invoke-interface {v2}, Lcom/ibotta/api/model/OptionModel;->getNextSurveyQuestion()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/ibotta/android/fragment/game/question/LogicSurveyGameQuestionDriver;->currentId:J

    return v3

    :cond_1
    return v1

    :cond_2
    return v1
.end method
