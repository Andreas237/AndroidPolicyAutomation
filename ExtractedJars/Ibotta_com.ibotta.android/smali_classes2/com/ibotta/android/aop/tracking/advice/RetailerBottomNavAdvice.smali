.class public Lcom/ibotta/android/aop/tracking/advice/RetailerBottomNavAdvice;
.super Lcom/ibotta/android/aop/tracking/advice/BottomNavAdvice;
.source "RetailerBottomNavAdvice.java"


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/aop/tracking/advice/BottomNavAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    return-void
.end method


# virtual methods
.method public onExecute(Lorg/aspectj/lang/JoinPoint;)V
    .locals 1

    .line 23
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getTarget()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/aop/tracking/advice/RetailerAdviceField;

    .line 24
    invoke-interface {v0}, Lcom/ibotta/android/aop/tracking/advice/RetailerAdviceField;->getRetailerIdForTracking()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/RetailerBottomNavAdvice;->retailerId:Ljava/lang/Integer;

    .line 26
    invoke-super {p0, p1}, Lcom/ibotta/android/aop/tracking/advice/BottomNavAdvice;->onExecute(Lorg/aspectj/lang/JoinPoint;)V

    return-void
.end method
