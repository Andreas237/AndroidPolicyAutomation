.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;
.super Ljava/lang/Object;
.source "TeamworkLoadStrategy.java"


# virtual methods
.method public abstract getCurrentLevel()Lcom/ibotta/api/model/BonusModel;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getFetchJobs()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getFriends()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/friend/Friend;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getLevels()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract isShowEmptyBonuses()Z
.end method

.method public abstract onAbandonFetchJobs()V
.end method

.method public abstract onFetchFinishedSuccessfully()V
.end method
