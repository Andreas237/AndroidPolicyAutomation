.class public Lcom/ibotta/android/aop/tracking/advice/GenericAdvice;
.super Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;
.source "GenericAdvice.java"


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    return-void
.end method


# virtual methods
.method public onExecute(Lorg/aspectj/lang/JoinPoint;)V
    .locals 2

    .line 18
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getArgs()[Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x0

    aget-object p1, p1, v0

    check-cast p1, Lcom/ibotta/android/tracking/AdviceProperties;

    .line 20
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->toBuilder()Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/GenericAdvice;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 21
    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->eventAt(Ljava/lang/Long;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p1

    .line 22
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->build()Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object p1

    .line 24
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getEvent()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getProperties()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/aop/tracking/advice/GenericAdvice;->logEvent(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
