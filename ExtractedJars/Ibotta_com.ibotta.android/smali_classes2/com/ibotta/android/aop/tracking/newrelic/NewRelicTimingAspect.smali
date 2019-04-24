.class public Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;
.super Lcom/ibotta/android/aop/AbstractAspect;
.source "NewRelicTimingAspect.java"


# annotations
.annotation runtime Lorg/aspectj/lang/annotation/Aspect;
.end annotation


# static fields
.field private static synthetic ajc$initFailureCause:Ljava/lang/Throwable;

.field public static final synthetic ajc$perSingletonInstance:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;


# instance fields
.field protected factory:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;->ajc$postClinit()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sput-object v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;->ajc$initFailureCause:Ljava/lang/Throwable;

    :goto_0
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/ibotta/android/aop/AbstractAspect;-><init>()V

    return-void
.end method

.method private static synthetic ajc$postClinit()V
    .locals 1

    .line 1
    new-instance v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;

    invoke-direct {v0}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;-><init>()V

    sput-object v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;->ajc$perSingletonInstance:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;

    return-void
.end method

.method public static aspectOf()Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;
    .locals 3

    .line 1
    sget-object v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;->ajc$perSingletonInstance:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lorg/aspectj/lang/NoAspectBoundException;

    sget-object v1, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;->ajc$initFailureCause:Ljava/lang/Throwable;

    const-string v2, "com.ibotta.android.aop.tracking.newrelic.NewRelicTimingAspect"

    invoke-direct {v0, v2, v1}, Lorg/aspectj/lang/NoAspectBoundException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static hasAspect()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;->ajc$perSingletonInstance:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public after(Lorg/aspectj/lang/JoinPoint;)V
    .locals 0
    .annotation runtime Lorg/aspectj/lang/annotation/After;
        value = "@annotation(NewRelicTimingStop) && execution(* *(..))"
    .end annotation

    .line 54
    invoke-super {p0, p1}, Lcom/ibotta/android/aop/AbstractAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    return-void
.end method

.method public before(Lorg/aspectj/lang/JoinPoint;)V
    .locals 0
    .annotation runtime Lorg/aspectj/lang/annotation/Before;
        value = "@annotation(NewRelicTimingStart) && execution(* *(..))"
    .end annotation

    .line 49
    invoke-super {p0, p1}, Lcom/ibotta/android/aop/AbstractAspect;->before(Lorg/aspectj/lang/JoinPoint;)V

    return-void
.end method

.method protected handleAfterHook(Ljava/lang/annotation/Annotation;Lorg/aspectj/lang/JoinPoint;)V
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;->factory:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;

    check-cast p1, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingStop;

    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingStop;->value()Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;->createAdvice(Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;)Lcom/ibotta/android/aop/tracking/newrelic/timing/NewRelicTimingAdvice;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/ibotta/android/aop/tracking/newrelic/timing/NewRelicTimingAdvice;->stopClock(Lorg/aspectj/lang/JoinPoint;)V

    return-void
.end method

.method protected handleAroundHook(Ljava/lang/annotation/Annotation;Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/Object;
    .locals 0
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method protected handleBeforeHook(Ljava/lang/annotation/Annotation;Lorg/aspectj/lang/JoinPoint;)V
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;->factory:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;

    check-cast p1, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingStart;

    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingStart;->value()Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;->createAdvice(Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;)Lcom/ibotta/android/aop/tracking/newrelic/timing/NewRelicTimingAdvice;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/ibotta/android/aop/tracking/newrelic/timing/NewRelicTimingAdvice;->startClock(Lorg/aspectj/lang/JoinPoint;)V

    return-void
.end method

.method protected init()V
    .locals 1

    .line 28
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;)V

    return-void
.end method
