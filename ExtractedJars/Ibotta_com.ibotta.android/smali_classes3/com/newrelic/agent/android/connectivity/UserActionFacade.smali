.class public Lcom/newrelic/agent/android/connectivity/UserActionFacade;
.super Ljava/lang/Object;
.source "UserActionFacade.java"


# static fields
.field private static catFacade:Lcom/newrelic/agent/android/connectivity/CatFacade;

.field private static instance:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/newrelic/agent/android/connectivity/UserActionFacade;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 17
    invoke-static {}, Lcom/newrelic/agent/android/connectivity/CatFacade;->getInstance()Lcom/newrelic/agent/android/connectivity/CatFacade;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/connectivity/UserActionFacade;->catFacade:Lcom/newrelic/agent/android/connectivity/CatFacade;

    .line 18
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/newrelic/agent/android/connectivity/UserActionFacade;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getInstance()Lcom/newrelic/agent/android/connectivity/UserActionFacade;
    .locals 3

    .line 21
    sget-object v0, Lcom/newrelic/agent/android/connectivity/UserActionFacade;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lcom/newrelic/agent/android/connectivity/UserActionFacade;

    invoke-direct {v1}, Lcom/newrelic/agent/android/connectivity/UserActionFacade;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    sget-object v0, Lcom/newrelic/agent/android/connectivity/UserActionFacade;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/newrelic/agent/android/connectivity/UserActionFacade;

    return-object v0
.end method

.method static setCatFacade(Lcom/newrelic/agent/android/connectivity/CatFacade;)V
    .locals 0

    .line 26
    sput-object p0, Lcom/newrelic/agent/android/connectivity/UserActionFacade;->catFacade:Lcom/newrelic/agent/android/connectivity/CatFacade;

    return-void
.end method


# virtual methods
.method public recordUserAction(Lcom/newrelic/agent/android/connectivity/UserActionType;)V
    .locals 1

    const/4 v0, 0x0

    .line 30
    invoke-virtual {p0, p1, v0}, Lcom/newrelic/agent/android/connectivity/UserActionFacade;->recordUserAction(Lcom/newrelic/agent/android/connectivity/UserActionType;Ljava/util/Map;)V

    return-void
.end method

.method public recordUserAction(Lcom/newrelic/agent/android/connectivity/UserActionType;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/newrelic/agent/android/connectivity/UserActionType;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 34
    sget-object v0, Lcom/newrelic/agent/android/FeatureFlag;->DistributedTracing:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {v0}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 35
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    const-string v1, "actionType"

    .line 37
    invoke-virtual {p1}, Lcom/newrelic/agent/android/connectivity/UserActionType;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_0

    .line 40
    invoke-interface {v0, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 43
    :cond_0
    invoke-static {}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getInstance()Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;

    move-result-object p1

    const/4 p2, 0x0

    sget-object v1, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->UserAction:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    const-string v2, "MobileUserAction"

    invoke-virtual {p1, p2, v1, v2, v0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->internalRecordEvent(Ljava/lang/String;Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;Ljava/lang/String;Ljava/util/Map;)Z

    :cond_1
    return-void
.end method
