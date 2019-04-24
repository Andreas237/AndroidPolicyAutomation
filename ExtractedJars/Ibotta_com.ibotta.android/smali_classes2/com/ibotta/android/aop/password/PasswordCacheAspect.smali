.class public Lcom/ibotta/android/aop/password/PasswordCacheAspect;
.super Lcom/ibotta/android/aop/AbstractAspect;
.source "PasswordCacheAspect.java"


# annotations
.annotation runtime Lorg/aspectj/lang/annotation/Aspect;
.end annotation


# static fields
.field private static synthetic ajc$initFailureCause:Ljava/lang/Throwable;

.field public static final synthetic ajc$perSingletonInstance:Lcom/ibotta/android/aop/password/PasswordCacheAspect;


# instance fields
.field protected passwordCache:Lcom/ibotta/android/security/PasswordCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/ibotta/android/aop/password/PasswordCacheAspect;->ajc$postClinit()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sput-object v0, Lcom/ibotta/android/aop/password/PasswordCacheAspect;->ajc$initFailureCause:Ljava/lang/Throwable;

    :goto_0
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/ibotta/android/aop/AbstractAspect;-><init>()V

    return-void
.end method

.method private static synthetic ajc$postClinit()V
    .locals 1

    .line 1
    new-instance v0, Lcom/ibotta/android/aop/password/PasswordCacheAspect;

    invoke-direct {v0}, Lcom/ibotta/android/aop/password/PasswordCacheAspect;-><init>()V

    sput-object v0, Lcom/ibotta/android/aop/password/PasswordCacheAspect;->ajc$perSingletonInstance:Lcom/ibotta/android/aop/password/PasswordCacheAspect;

    return-void
.end method

.method public static aspectOf()Lcom/ibotta/android/aop/password/PasswordCacheAspect;
    .locals 3

    .line 1
    sget-object v0, Lcom/ibotta/android/aop/password/PasswordCacheAspect;->ajc$perSingletonInstance:Lcom/ibotta/android/aop/password/PasswordCacheAspect;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lorg/aspectj/lang/NoAspectBoundException;

    sget-object v1, Lcom/ibotta/android/aop/password/PasswordCacheAspect;->ajc$initFailureCause:Ljava/lang/Throwable;

    const-string v2, "com.ibotta.android.aop.password.PasswordCacheAspect"

    invoke-direct {v0, v2, v1}, Lorg/aspectj/lang/NoAspectBoundException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static hasAspect()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/ibotta/android/aop/password/PasswordCacheAspect;->ajc$perSingletonInstance:Lcom/ibotta/android/aop/password/PasswordCacheAspect;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public before(Lorg/aspectj/lang/JoinPoint;)V
    .locals 0
    .annotation runtime Lorg/aspectj/lang/annotation/Before;
        value = "@annotation(UpdatePasswordCache) && execution(* *(..))"
    .end annotation

    .line 59
    invoke-super {p0, p1}, Lcom/ibotta/android/aop/AbstractAspect;->before(Lorg/aspectj/lang/JoinPoint;)V

    return-void
.end method

.method protected handleAfterHook(Ljava/lang/annotation/Annotation;Lorg/aspectj/lang/JoinPoint;)V
    .locals 0

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
    .locals 0

    .line 35
    invoke-interface {p2}, Lorg/aspectj/lang/JoinPoint;->getArgs()[Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x0

    aget-object p1, p1, p2

    check-cast p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 37
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object p2

    instance-of p2, p2, Lcom/ibotta/api/PasswordContainer;

    if-eqz p2, :cond_1

    .line 38
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->isSuccessfullyLoaded()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 39
    iget-object p1, p0, Lcom/ibotta/android/aop/password/PasswordCacheAspect;->passwordCache:Lcom/ibotta/android/security/PasswordCache;

    invoke-interface {p1}, Lcom/ibotta/android/security/PasswordCache;->confirm()V

    goto :goto_0

    .line 41
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/aop/password/PasswordCacheAspect;->passwordCache:Lcom/ibotta/android/security/PasswordCache;

    invoke-interface {p1}, Lcom/ibotta/android/security/PasswordCache;->clear()V

    :cond_1
    :goto_0
    return-void
.end method

.method protected init()V
    .locals 1

    .line 30
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/aop/password/PasswordCacheAspect;)V

    return-void
.end method
