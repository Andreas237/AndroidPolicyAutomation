.class public interface abstract Lcom/ibotta/api/model/QuestModel;
.super Ljava/lang/Object;
.source "QuestModel.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/QuestModel$State;,
        Lcom/ibotta/api/model/QuestModel$Type;
    }
.end annotation


# virtual methods
.method public abstract getCta()Ljava/lang/String;
.end method

.method public abstract getDescription()Ljava/lang/String;
.end method

.method public abstract getImageUrl()Ljava/lang/String;
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract getQuestStateEnum()Lcom/ibotta/api/model/QuestModel$State;
.end method

.method public abstract getQuestTypeEnum()Lcom/ibotta/api/model/QuestModel$Type;
.end method

.method public abstract getState()Ljava/lang/String;
.end method

.method public abstract getStep()I
.end method

.method public abstract getType()Ljava/lang/String;
.end method
