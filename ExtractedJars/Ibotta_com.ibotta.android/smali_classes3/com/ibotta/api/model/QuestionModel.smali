.class public interface abstract Lcom/ibotta/api/model/QuestionModel;
.super Ljava/lang/Object;
.source "QuestionModel.java"


# virtual methods
.method public abstract getAnswer()I
.end method

.method public abstract getContent()Ljava/lang/String;
.end method

.method public abstract getId()I
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

.method public abstract getWeight()Ljava/lang/Integer;
.end method

.method public abstract isMultipleResponse()Z
.end method

.method public abstract setAnswer(I)V
.end method
