.class public interface abstract Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;
.super Ljava/lang/Object;
.source "GameQuestionDriver.java"


# virtual methods
.method public abstract addResponse(J)V
.end method

.method public abstract getCurrentGameQuestion()Lcom/ibotta/android/fragment/game/question/GameQuestion;
.end method

.method public abstract getCurrentId()J
.end method

.method public abstract getPreviousId()J
.end method

.method public abstract getResponses()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getSubmitButtonText()Ljava/lang/String;
.end method

.method public abstract getSubtitle()Ljava/lang/String;
.end method

.method public abstract getTitle()Ljava/lang/String;
.end method

.method public abstract getTokenImage()I
.end method

.method public abstract hasResponse(J)Z
.end method

.method public abstract isMultiQuestion()Z
.end method

.method public abstract isQuestionNext()Z
.end method

.method public abstract isQuestionPrevious()Z
.end method

.method public abstract navigateBack()V
.end method

.method public abstract navigateForward()Z
.end method

.method public abstract removeResponse(J)V
.end method

.method public abstract setReward(Lcom/ibotta/api/model/RewardModel;)V
.end method
