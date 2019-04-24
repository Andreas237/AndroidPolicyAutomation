.class public interface abstract Lcom/ibotta/api/model/BonusModel;
.super Ljava/lang/Object;
.source "BonusModel.java"

# interfaces
.implements Lcom/ibotta/api/ContentEventTrackable;
.implements Lcom/ibotta/api/PixelTrackable;
.implements Lcom/ibotta/api/model/ContentModel;
.implements Lcom/ibotta/api/model/base/Routable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/BonusModel$Type;
    }
.end annotation


# virtual methods
.method public abstract getAmount()F
.end method

.method public abstract getBonusQualifications()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/QualificationModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getBonusType()Ljava/lang/String;
.end method

.method public abstract getBonusTypeEnum()Lcom/ibotta/api/model/BonusModel$Type;
.end method

.method public abstract getCacheKey()Ljava/lang/String;
.end method

.method public abstract getCompletedImageUrl()Ljava/lang/String;
.end method

.method public abstract getDescription()Ljava/lang/String;
.end method

.method public abstract getExpiration()Ljava/util/Date;
.end method

.method public abstract getLevel()I
.end method

.method public abstract getMaxRetailerDistance()Ljava/lang/Integer;
.end method

.method public abstract getOffers()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getOtherReward()Ljava/lang/String;
.end method

.method public abstract getPercentComplete()F
.end method

.method public abstract getProgressColor()Ljava/lang/String;
.end method

.method public abstract getProgressCount()F
.end method

.method public abstract getQuest()Lcom/ibotta/api/model/QuestModel;
.end method

.method public abstract getRetailerId()I
.end method

.method public abstract getScore()F
.end method

.method public abstract getSortResults()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/SortResultModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getStarted()Ljava/util/Date;
.end method

.method public abstract getTerms()Ljava/lang/String;
.end method

.method public abstract getUncompletedImageUrl()Ljava/lang/String;
.end method

.method public abstract getWeight()F
.end method

.method public abstract isActive()Z
.end method

.method public abstract isCompleted()Z
.end method

.method public abstract isEligible()Z
.end method

.method public abstract isLocked()Z
.end method
