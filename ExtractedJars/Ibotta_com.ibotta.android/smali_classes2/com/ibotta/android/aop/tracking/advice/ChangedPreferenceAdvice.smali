.class public Lcom/ibotta/android/aop/tracking/advice/ChangedPreferenceAdvice;
.super Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;
.source "ChangedPreferenceAdvice.java"


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    return-void
.end method


# virtual methods
.method public onExecute(Lorg/aspectj/lang/JoinPoint;)V
    .locals 3

    .line 24
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getArgs()[Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;

    .line 25
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getArgs()[Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x1

    aget-object p1, p1, v1

    check-cast p1, Ljava/lang/Boolean;

    .line 27
    invoke-static {}, Lcom/ibotta/android/tracking/AdviceProperties;->builder()Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v1

    .line 28
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->preferenceName(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v1

    .line 29
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->isChecked()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->oldValue(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    .line 30
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->newValue(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p1

    .line 31
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->build()Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object p1

    const-string v0, "changed_preference"

    .line 33
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getProperties()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/aop/tracking/advice/ChangedPreferenceAdvice;->logEvent(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
