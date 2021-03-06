.class public Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;
.super Lcom/ibotta/android/aop/AbstractAspect;
.source "NewRelicTrackingAspect.java"


# annotations
.annotation runtime Lorg/aspectj/lang/annotation/Aspect;
.end annotation


# static fields
.field private static synthetic ajc$initFailureCause:Ljava/lang/Throwable;

.field public static final synthetic ajc$perSingletonInstance:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;


# instance fields
.field protected factory:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAdviceFactory;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;->ajc$postClinit()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sput-object v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;->ajc$initFailureCause:Ljava/lang/Throwable;

    :goto_0
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/ibotta/android/aop/AbstractAspect;-><init>()V

    return-void
.end method

.method private static synthetic ajc$postClinit()V
    .locals 1

    .line 1
    new-instance v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;

    invoke-direct {v0}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;-><init>()V

    sput-object v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;->ajc$perSingletonInstance:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;

    return-void
.end method

.method public static aspectOf()Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;
    .locals 3

    .line 1
    sget-object v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;->ajc$perSingletonInstance:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lorg/aspectj/lang/NoAspectBoundException;

    sget-object v1, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;->ajc$initFailureCause:Ljava/lang/Throwable;

    const-string v2, "com.ibotta.android.aop.tracking.newrelic.NewRelicTrackingAspect"

    invoke-direct {v0, v2, v1}, Lorg/aspectj/lang/NoAspectBoundException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static hasAspect()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;->ajc$perSingletonInstance:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;

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
        value = "@annotation(NewRelicTrackingAfter) && execution(* *(..))"
    .end annotation

    .line 51
    invoke-super {p0, p1}, Lcom/ibotta/android/aop/AbstractAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    return-void
.end method

.method public around(Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/Object;
    .locals 0
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .annotation runtime Lorg/aspectj/lang/annotation/Around;
        value = "@annotation(NewRelicTrackingAround) && execution(* *(..))"
    .end annotation

    .line 56
    invoke-super {p0, p1}, Lcom/ibotta/android/aop/AbstractAspect;->around(Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public before(Lorg/aspectj/lang/JoinPoint;)V
    .locals 0
    .annotation runtime Lorg/aspectj/lang/annotation/Before;
        value = "@annotation(NewRelicTrackingBefore) && execution(* *(..))"
    .end annotation

    .line 46
    invoke-super {p0, p1}, Lcom/ibotta/android/aop/AbstractAspect;->before(Lorg/aspectj/lang/JoinPoint;)V

    return-void
.end method

.method protected handleAfterHook(Ljava/lang/annotation/Annotation;Lorg/aspectj/lang/JoinPoint;)V
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;->factory:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAdviceFactory;

    check-cast p1, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAfter;

    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAfter;->value()Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAdviceFactory;->createAdvice(Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;)Lcom/ibotta/android/aop/JoinPointAdvice;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/ibotta/android/aop/JoinPointAdvice;->onExecute(Lorg/aspectj/lang/JoinPoint;)V

    return-void
.end method

.method protected handleAroundHook(Ljava/lang/annotation/Annotation;Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/Object;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;->factory:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAdviceFactory;

    check-cast p1, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAround;

    .line 40
    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAround;->value()Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAdviceFactory;->createAdvice(Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;)Lcom/ibotta/android/aop/JoinPointAdvice;

    move-result-object p1

    .line 41
    invoke-interface {p1, p2}, Lcom/ibotta/android/aop/JoinPointAdvice;->onExecuteProceedingJoinPoint(Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected handleBeforeHook(Ljava/lang/annotation/Annotation;Lorg/aspectj/lang/JoinPoint;)V
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;->factory:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAdviceFactory;

    check-cast p1, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingBefore;

    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingBefore;->value()Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAdviceFactory;->createAdvice(Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;)Lcom/ibotta/android/aop/JoinPointAdvice;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/ibotta/android/aop/JoinPointAdvice;->onExecute(Lorg/aspectj/lang/JoinPoint;)V

    return-void
.end method

.method protected init()V
    .locals 1

    .line 24
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;)V

    return-void
.end method
