.class public Lcom/ibotta/android/aop/tracking/advice/PwiHelpAdvice;
.super Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;
.source "PwiHelpAdvice.java"


# instance fields
.field private final screenNameMap:Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    .line 18
    iput-object p4, p0, Lcom/ibotta/android/aop/tracking/advice/PwiHelpAdvice;->screenNameMap:Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;

    return-void
.end method


# virtual methods
.method public onExecute(Lorg/aspectj/lang/JoinPoint;)V
    .locals 3

    .line 23
    invoke-super {p0, p1}, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;->onExecute(Lorg/aspectj/lang/JoinPoint;)V

    .line 25
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getTarget()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/aop/tracking/advice/PwiHomeAdviceFields;

    .line 27
    invoke-static {}, Lcom/ibotta/android/tracking/AdviceProperties;->builder()Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/advice/PwiHelpAdvice;->screenNameMap:Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;

    .line 28
    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/advice/PwiHomeAdviceFields;->getActivityClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->getScreenName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->screenName(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    .line 29
    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/advice/PwiHomeAdviceFields;->getActivityClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->nativeScreenName(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p1

    .line 30
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->build()Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object p1

    const-string v0, "pwi_help"

    .line 32
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getProperties()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/aop/tracking/advice/PwiHelpAdvice;->logEvent(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
