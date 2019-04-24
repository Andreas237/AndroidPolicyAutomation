.class public Lcom/ibotta/android/aop/tracking/newrelic/advice/CashOutOptionDisabledAdvice;
.super Ljava/lang/Object;
.source "CashOutOptionDisabledAdvice.java"

# interfaces
.implements Lcom/ibotta/android/aop/JoinPointAdvice;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onExecute(Lorg/aspectj/lang/JoinPoint;)V
    .locals 3

    const-string v0, "Looking for a disabled cash out option to track in NewRelic..."

    const/4 v1, 0x0

    .line 21
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getArgs()[Ljava/lang/Object;

    move-result-object p1

    aget-object p1, p1, v1

    check-cast p1, Lcom/ibotta/api/model/customer/CustomerAccount;

    if-eqz p1, :cond_0

    .line 25
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/CustomerAccount;->isServiceEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 26
    invoke-virtual {p0, p1}, Lcom/ibotta/android/aop/tracking/newrelic/advice/CashOutOptionDisabledAdvice;->trackDisabledCashOutOption(Lcom/ibotta/api/model/customer/CustomerAccount;)V

    :cond_0
    return-void
.end method

.method public onExecuteProceedingJoinPoint(Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/Object;
    .locals 0
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method protected trackDisabledCashOutOption(Lcom/ibotta/api/model/customer/CustomerAccount;)V
    .locals 4
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    const-string v0, "Tracking a disabled cash out option for: %1$s."

    const/4 v1, 0x1

    .line 38
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/CustomerAccount;->getType()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/aop/tracking/newrelic/advice/CashOutOptionDisabledException;

    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/CustomerAccount;->getType()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/ibotta/android/aop/tracking/newrelic/advice/CashOutOptionDisabledException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    return-void
.end method
