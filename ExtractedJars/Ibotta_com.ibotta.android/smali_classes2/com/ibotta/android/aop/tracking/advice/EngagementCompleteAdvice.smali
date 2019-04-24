.class public Lcom/ibotta/android/aop/tracking/advice/EngagementCompleteAdvice;
.super Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;
.source "EngagementCompleteAdvice.java"


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    return-void
.end method


# virtual methods
.method public onExecute(Lorg/aspectj/lang/JoinPoint;)V
    .locals 2

    .line 23
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getTarget()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/aop/tracking/advice/EngagementAdviceFields;

    .line 25
    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/advice/EngagementAdviceFields;->getRewardType()Lcom/ibotta/api/model/TaskModel$Type;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 26
    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/advice/EngagementAdviceFields;->getRewardType()Lcom/ibotta/api/model/TaskModel$Type;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/model/TaskModel$Type;->getTrackingName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 28
    :goto_0
    invoke-static {}, Lcom/ibotta/android/tracking/AdviceProperties;->builder()Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v1

    .line 29
    invoke-virtual {v1, v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->type(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    .line 30
    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/advice/EngagementAdviceFields;->getOfferId()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->offerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    .line 31
    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/advice/EngagementAdviceFields;->getRewardId()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->engagementId(Ljava/lang/Long;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p1

    .line 32
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->build()Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object p1

    const-string v0, "engagement_complete"

    .line 34
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getProperties()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/aop/tracking/advice/EngagementCompleteAdvice;->logEvent(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
