.class public interface abstract Lcom/ibotta/android/aop/tracking/advice/EngagementAdviceFields;
.super Ljava/lang/Object;
.source "EngagementAdviceFields.java"


# virtual methods
.method public abstract getOfferId()Ljava/lang/Integer;
.end method

.method public abstract getRetailerId()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getRewardId()Ljava/lang/Long;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getRewardType()Lcom/ibotta/api/model/TaskModel$Type;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method
