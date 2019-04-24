.class public abstract Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;
.super Ljava/lang/Object;
.source "AbstractTrackingAdvice.java"

# interfaces
.implements Lcom/ibotta/android/aop/JoinPointAdvice;


# instance fields
.field protected final appHelper:Lcom/ibotta/android/util/AppHelper;

.field protected final client:Lcom/ibotta/android/tracking/TrackingClient;

.field protected final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;->client:Lcom/ibotta/android/tracking/TrackingClient;

    .line 22
    iput-object p2, p0, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 23
    iput-object p3, p0, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;->userState:Lcom/ibotta/android/state/user/UserState;

    return-void
.end method


# virtual methods
.method protected final logEvent(Ljava/lang/String;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v1}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v2

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v4

    move-object v1, p1

    move-object v5, p2

    invoke-interface/range {v0 .. v5}, Lcom/ibotta/android/tracking/TrackingClient;->logEvent(Ljava/lang/String;JILjava/util/Map;)V

    return-void
.end method

.method public onExecute(Lorg/aspectj/lang/JoinPoint;)V
    .locals 0

    return-void
.end method

.method public onExecuteProceedingJoinPoint(Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/Object;
    .locals 0
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method
