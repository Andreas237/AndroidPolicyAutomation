.class public interface abstract Lcom/ibotta/api/model/TaskModel;
.super Ljava/lang/Object;
.source "TaskModel.java"

# interfaces
.implements Lcom/ibotta/api/PixelTrackable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/TaskModel$Type;
    }
.end annotation


# virtual methods
.method public abstract getAnswer()I
.end method

.method public abstract getContent()Ljava/lang/String;
.end method

.method public abstract getEngagementId()J
.end method

.method public abstract getId()I
.end method

.method public abstract getLegal()Ljava/lang/String;
.end method

.method public abstract getLinkedOfferIds()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getOptions()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OptionModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getQuestions()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/QuestionModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getResponse()Ljava/lang/String;
.end method

.method public abstract getRewardId()J
.end method

.method public abstract getThumb()Ljava/lang/String;
.end method

.method public abstract getType()Ljava/lang/String;
.end method

.method public abstract getTypeEnum()Lcom/ibotta/api/model/TaskModel$Type;
.end method

.method public abstract getUrl()Ljava/lang/String;
.end method

.method public abstract isFinished()Z
.end method
