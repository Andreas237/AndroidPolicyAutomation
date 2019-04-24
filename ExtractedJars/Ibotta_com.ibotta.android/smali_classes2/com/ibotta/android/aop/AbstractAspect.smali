.class public abstract Lcom/ibotta/android/aop/AbstractAspect;
.super Ljava/lang/Object;
.source "AbstractAspect.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/aop/AbstractAspect$ProceedingJoinPointHandler;,
        Lcom/ibotta/android/aop/AbstractAspect$JoinPointHandler;
    }
.end annotation


# instance fields
.field protected buildProfile:Lcom/ibotta/android/profile/BuildProfile;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private processJoinPoint(Lorg/aspectj/lang/JoinPoint;Lcom/ibotta/android/aop/AbstractAspect$JoinPointHandler;)V
    .locals 2

    .line 49
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/aop/AbstractAspect;->init()V

    .line 51
    invoke-virtual {p0, p1}, Lcom/ibotta/android/aop/AbstractAspect;->getAnnotations(Lorg/aspectj/lang/JoinPoint;)[Ljava/lang/annotation/Annotation;

    move-result-object v0

    const/4 v1, 0x0

    .line 52
    aget-object v0, v0, v1

    invoke-interface {p2, v0, p1}, Lcom/ibotta/android/aop/AbstractAspect$JoinPointHandler;->handle(Ljava/lang/annotation/Annotation;Lorg/aspectj/lang/JoinPoint;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "Failed to execute AOP advice."

    .line 54
    invoke-virtual {p0, p2, p1}, Lcom/ibotta/android/aop/AbstractAspect;->handleException(Ljava/lang/String;Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private processProceedingJoinPoint(Lorg/aspectj/lang/ProceedingJoinPoint;Lcom/ibotta/android/aop/AbstractAspect$ProceedingJoinPointHandler;)Ljava/lang/Object;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 65
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/aop/AbstractAspect;->init()V

    .line 67
    invoke-virtual {p0, p1}, Lcom/ibotta/android/aop/AbstractAspect;->getAnnotations(Lorg/aspectj/lang/JoinPoint;)[Ljava/lang/annotation/Annotation;

    move-result-object v0

    const/4 v1, 0x0

    .line 68
    aget-object v0, v0, v1

    invoke-interface {p2, v0, p1}, Lcom/ibotta/android/aop/AbstractAspect$ProceedingJoinPointHandler;->handle(Ljava/lang/annotation/Annotation;Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "Failed to execute AOP advice."

    .line 70
    invoke-virtual {p0, p2, p1}, Lcom/ibotta/android/aop/AbstractAspect;->handleException(Ljava/lang/String;Ljava/lang/Exception;)V

    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method


# virtual methods
.method public after(Lorg/aspectj/lang/JoinPoint;)V
    .locals 2

    const-string v0, "after hook"

    const/4 v1, 0x0

    .line 37
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    new-instance v0, Lcom/ibotta/android/aop/-$$Lambda$WPzRdhBbt_3GzcB6d03gkrB5-r8;

    invoke-direct {v0, p0}, Lcom/ibotta/android/aop/-$$Lambda$WPzRdhBbt_3GzcB6d03gkrB5-r8;-><init>(Lcom/ibotta/android/aop/AbstractAspect;)V

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/aop/AbstractAspect;->processJoinPoint(Lorg/aspectj/lang/JoinPoint;Lcom/ibotta/android/aop/AbstractAspect$JoinPointHandler;)V

    return-void
.end method

.method public around(Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/Object;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const-string v0, "around hook"

    const/4 v1, 0x0

    .line 43
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    new-instance v0, Lcom/ibotta/android/aop/-$$Lambda$ZTXWjBygtahkwEteYvUVuvHjoyo;

    invoke-direct {v0, p0}, Lcom/ibotta/android/aop/-$$Lambda$ZTXWjBygtahkwEteYvUVuvHjoyo;-><init>(Lcom/ibotta/android/aop/AbstractAspect;)V

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/aop/AbstractAspect;->processProceedingJoinPoint(Lorg/aspectj/lang/ProceedingJoinPoint;Lcom/ibotta/android/aop/AbstractAspect$ProceedingJoinPointHandler;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public before(Lorg/aspectj/lang/JoinPoint;)V
    .locals 2

    const-string v0, "before hook"

    const/4 v1, 0x0

    .line 32
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    new-instance v0, Lcom/ibotta/android/aop/-$$Lambda$cW-vuDMHLg9c_Xesl27QHFYC_T4;

    invoke-direct {v0, p0}, Lcom/ibotta/android/aop/-$$Lambda$cW-vuDMHLg9c_Xesl27QHFYC_T4;-><init>(Lcom/ibotta/android/aop/AbstractAspect;)V

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/aop/AbstractAspect;->processJoinPoint(Lorg/aspectj/lang/JoinPoint;Lcom/ibotta/android/aop/AbstractAspect$JoinPointHandler;)V

    return-void
.end method

.method protected getAnnotations(Lorg/aspectj/lang/JoinPoint;)[Ljava/lang/annotation/Annotation;
    .locals 0

    .line 28
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getSignature()Lorg/aspectj/lang/Signature;

    move-result-object p1

    check-cast p1, Lorg/aspectj/lang/reflect/MethodSignature;

    invoke-interface {p1}, Lorg/aspectj/lang/reflect/MethodSignature;->getMethod()Ljava/lang/reflect/Method;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object p1

    return-object p1
.end method

.method protected abstract handleAfterHook(Ljava/lang/annotation/Annotation;Lorg/aspectj/lang/JoinPoint;)V
.end method

.method protected abstract handleAroundHook(Ljava/lang/annotation/Annotation;Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/Object;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method protected abstract handleBeforeHook(Ljava/lang/annotation/Annotation;Lorg/aspectj/lang/JoinPoint;)V
.end method

.method protected handleException(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    .line 78
    new-instance v0, Lcom/ibotta/android/aop/AopException;

    invoke-direct {v0, p1, p2}, Lcom/ibotta/android/aop/AopException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 80
    sget-object p1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 82
    iget-object p1, p0, Lcom/ibotta/android/aop/AbstractAspect;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {p1}, Lcom/ibotta/android/profile/BuildProfile;->isAopFailHard()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 83
    :cond_0
    throw v0
.end method

.method protected abstract init()V
.end method
