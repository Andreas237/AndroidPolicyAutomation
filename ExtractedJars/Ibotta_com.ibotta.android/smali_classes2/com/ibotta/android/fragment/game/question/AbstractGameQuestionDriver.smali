.class public abstract Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;
.super Ljava/lang/Object;
.source "AbstractGameQuestionDriver.java"

# interfaces
.implements Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;


# instance fields
.field protected currentId:J

.field protected gameQuestions:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Long;",
            "Lcom/ibotta/android/fragment/game/question/GameQuestion;",
            ">;"
        }
    .end annotation
.end field

.field protected previousId:J

.field protected responses:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field protected taskModel:Lcom/ibotta/api/model/TaskModel;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/model/TaskModel;)V
    .locals 7

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->gameQuestions:Ljava/util/LinkedHashMap;

    const-wide/16 v0, -0x1

    .line 21
    iput-wide v0, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->currentId:J

    .line 22
    iput-wide v0, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->previousId:J

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->responses:Ljava/util/List;

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->taskModel:Lcom/ibotta/api/model/TaskModel;

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->gameQuestions:Ljava/util/LinkedHashMap;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->initGameQuestionsMap(Ljava/util/LinkedHashMap;)V

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->gameQuestions:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->currentId:J

    .line 31
    iget-wide v0, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->currentId:J

    iput-wide v0, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->previousId:J

    .line 33
    invoke-interface {p1}, Lcom/ibotta/api/model/TaskModel;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/ibotta/api/model/TaskModel;->getResponse()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 34
    invoke-interface {p1}, Lcom/ibotta/api/model/TaskModel;->getResponse()Ljava/lang/String;

    move-result-object p1

    const-string v0, ","

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 35
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    aget-object v3, p1, v2

    .line 37
    :try_start_0
    iget-object v4, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->responses:Ljava/util/List;

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v4

    const-string v5, "One of the response values could not be parsed into an long. val=%1$s"

    const/4 v6, 0x1

    .line 39
    new-array v6, v6, [Ljava/lang/Object;

    aput-object v3, v6, v1

    invoke-static {v4, v5, v6}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public addResponse(J)V
    .locals 2

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->responses:Ljava/util/List;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->responses:Ljava/util/List;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method protected buildGameQuestionList()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/fragment/game/question/GameQuestion;",
            ">;"
        }
    .end annotation

    .line 158
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 160
    new-instance v1, Lcom/ibotta/android/fragment/game/question/GameQuestion;

    invoke-direct {v1}, Lcom/ibotta/android/fragment/game/question/GameQuestion;-><init>()V

    .line 161
    iget-object v2, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->taskModel:Lcom/ibotta/api/model/TaskModel;

    invoke-interface {v2}, Lcom/ibotta/api/model/TaskModel;->getRewardId()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/ibotta/android/fragment/game/question/GameQuestion;->setId(J)V

    .line 162
    iget-object v2, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->taskModel:Lcom/ibotta/api/model/TaskModel;

    invoke-interface {v2}, Lcom/ibotta/api/model/TaskModel;->getContent()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/fragment/game/question/GameQuestion;->setContent(Ljava/lang/String;)V

    .line 163
    iget-object v2, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->taskModel:Lcom/ibotta/api/model/TaskModel;

    invoke-interface {v2}, Lcom/ibotta/api/model/TaskModel;->getTypeEnum()Lcom/ibotta/api/model/TaskModel$Type;

    move-result-object v2

    sget-object v3, Lcom/ibotta/api/model/TaskModel$Type;->POLL_MULTI:Lcom/ibotta/api/model/TaskModel$Type;

    if-ne v2, v3, :cond_0

    .line 164
    sget-object v2, Lcom/ibotta/android/fragment/game/question/Mode;->ANSWER_MULTI:Lcom/ibotta/android/fragment/game/question/Mode;

    goto :goto_0

    :cond_0
    sget-object v2, Lcom/ibotta/android/fragment/game/question/Mode;->ANSWER_SINGLE:Lcom/ibotta/android/fragment/game/question/Mode;

    .line 163
    :goto_0
    invoke-virtual {v1, v2}, Lcom/ibotta/android/fragment/game/question/GameQuestion;->setMode(Lcom/ibotta/android/fragment/game/question/Mode;)V

    .line 165
    iget-object v2, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->taskModel:Lcom/ibotta/api/model/TaskModel;

    invoke-interface {v2}, Lcom/ibotta/api/model/TaskModel;->getOptions()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/fragment/game/question/GameQuestion;->setOptions(Ljava/util/List;)V

    .line 166
    iget-object v2, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->taskModel:Lcom/ibotta/api/model/TaskModel;

    invoke-interface {v2}, Lcom/ibotta/api/model/TaskModel;->getAnswer()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/fragment/game/question/GameQuestion;->setAnswer(I)V

    .line 168
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getCurrentGameQuestion()Lcom/ibotta/android/fragment/game/question/GameQuestion;
    .locals 3

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->gameQuestions:Ljava/util/LinkedHashMap;

    iget-wide v1, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->currentId:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/game/question/GameQuestion;

    return-object v0
.end method

.method public getCurrentId()J
    .locals 2

    .line 131
    iget-wide v0, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->currentId:J

    return-wide v0
.end method

.method protected getCurrentIndex()I
    .locals 3

    .line 140
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->getIdsAsList()Ljava/util/List;

    move-result-object v0

    .line 141
    iget-wide v1, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->currentId:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method protected getIdsAsList()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 145
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->gameQuestions:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getPreviousId()J
    .locals 2

    .line 136
    iget-wide v0, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->previousId:J

    return-wide v0
.end method

.method public getResponses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->responses:Ljava/util/List;

    return-object v0
.end method

.method protected getString(I)Ljava/lang/String;
    .locals 1

    .line 174
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected varargs getString(I[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 178
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/App;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getSubmitButtonText()Ljava/lang/String;
    .locals 1

    .line 58
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->isQuestionNext()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f110306

    .line 59
    invoke-virtual {p0, v0}, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSubtitle()Ljava/lang/String;
    .locals 4

    const/4 v0, 0x2

    .line 52
    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->getCurrentIndex()I

    move-result v1

    const/4 v2, 0x1

    add-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    iget-object v1, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->gameQuestions:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v2

    const v1, 0x7f110308

    invoke-virtual {p0, v1, v0}, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hasResponse(J)Z
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->responses:Ljava/util/List;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method protected initGameQuestionsMap(Ljava/util/LinkedHashMap;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Long;",
            "Lcom/ibotta/android/fragment/game/question/GameQuestion;",
            ">;)V"
        }
    .end annotation

    .line 149
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->clear()V

    .line 151
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->buildGameQuestionList()Ljava/util/List;

    move-result-object v0

    .line 152
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/fragment/game/question/GameQuestion;

    .line 153
    invoke-virtual {v1}, Lcom/ibotta/android/fragment/game/question/GameQuestion;->getId()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {p1, v2, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public isMultiQuestion()Z
    .locals 2

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->gameQuestions:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public isQuestionNext()Z
    .locals 3

    .line 71
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->getCurrentIndex()I

    move-result v0

    invoke-virtual {p0}, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->getIdsAsList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public isQuestionPrevious()Z
    .locals 1

    .line 76
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->getCurrentIndex()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public navigateBack()V
    .locals 4

    .line 94
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->getIdsAsList()Ljava/util/List;

    move-result-object v0

    .line 95
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->isQuestionPrevious()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 96
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->getCurrentIndex()I

    move-result v1

    .line 97
    iget-wide v2, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->currentId:J

    iput-wide v2, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->previousId:J

    add-int/lit8 v1, v1, -0x1

    .line 98
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->currentId:J

    :cond_0
    return-void
.end method

.method public navigateForward()Z
    .locals 4

    .line 81
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->isQuestionNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 82
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->getCurrentIndex()I

    move-result v0

    .line 83
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->getIdsAsList()Ljava/util/List;

    move-result-object v1

    .line 84
    iget-wide v2, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->currentId:J

    iput-wide v2, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->previousId:J

    const/4 v2, 0x1

    add-int/2addr v0, v2

    .line 85
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->currentId:J

    return v2

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public removeResponse(J)V
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->responses:Ljava/util/List;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public setReward(Lcom/ibotta/api/model/RewardModel;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;->taskModel:Lcom/ibotta/api/model/TaskModel;

    return-void
.end method
