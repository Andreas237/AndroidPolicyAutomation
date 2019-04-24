.class public Lcom/ibotta/android/aop/tracking/advice/PwiAddPaymentMethodAdvice;
.super Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;
.source "PwiAddPaymentMethodAdvice.java"


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    return-void
.end method

.method private setFailureProperties(Ljava/lang/Exception;Lcom/ibotta/android/tracking/AdviceProperties;)Lcom/ibotta/android/tracking/AdviceProperties;
    .locals 2

    const-string v0, ""

    .line 60
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 61
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    .line 64
    :cond_0
    invoke-virtual {p2}, Lcom/ibotta/android/tracking/AdviceProperties;->toBuilder()Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p1

    .line 65
    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->failureMessage(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p1

    const/4 p2, 0x0

    .line 66
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->isSuccessfulAuth(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p1

    .line 67
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->build()Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object p1

    return-object p1
.end method

.method private setPwiErrorProperties(Lcom/ibotta/api/model/pwi/PwiError;Lcom/ibotta/android/tracking/AdviceProperties;)Lcom/ibotta/android/tracking/AdviceProperties;
    .locals 0

    .line 71
    invoke-virtual {p2}, Lcom/ibotta/android/tracking/AdviceProperties;->toBuilder()Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p2

    .line 72
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiError;->getCode()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->failureMessage(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p1

    const/4 p2, 0x0

    .line 73
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->isSuccessfulAuth(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p1

    .line 74
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->build()Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object p1

    return-object p1
.end method

.method private setSuccessProperties(Lcom/stripe/android/model/Source;Lcom/ibotta/android/tracking/AdviceProperties;)Lcom/ibotta/android/tracking/AdviceProperties;
    .locals 0

    .line 50
    invoke-virtual {p1}, Lcom/stripe/android/model/Source;->getSourceTypeModel()Lcom/stripe/android/model/StripeSourceTypeModel;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/SourceCardData;

    .line 51
    invoke-virtual {p1}, Lcom/stripe/android/model/SourceCardData;->getFunding()Ljava/lang/String;

    move-result-object p1

    .line 52
    invoke-virtual {p2}, Lcom/ibotta/android/tracking/AdviceProperties;->toBuilder()Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p2

    .line 53
    invoke-virtual {p2, p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->paymentOptionType(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p1

    const/4 p2, 0x1

    .line 54
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->isSuccessfulAuth(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p1

    .line 55
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->build()Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method protected createProperties(Lcom/ibotta/android/aop/tracking/advice/PwiAddPaymentMethodAdviceFields;[Ljava/lang/Object;)Lcom/ibotta/android/tracking/AdviceProperties;
    .locals 3

    .line 30
    invoke-static {}, Lcom/ibotta/android/tracking/AdviceProperties;->builder()Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    .line 31
    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/advice/PwiAddPaymentMethodAdviceFields;->isFirstTimeCard()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->isFirstTimePaymentCard(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/advice/PwiAddPaymentMethodAdvice;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 32
    invoke-interface {v1}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->eventAt(Ljava/lang/Long;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    .line 33
    invoke-virtual {v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->build()Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object v0

    const/4 v1, 0x0

    .line 35
    aget-object p2, p2, v1

    .line 36
    instance-of v1, p2, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;

    if-eqz v1, :cond_0

    .line 37
    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/advice/PwiAddPaymentMethodAdviceFields;->getStripeSource()Lcom/stripe/android/model/Source;

    move-result-object p1

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/aop/tracking/advice/PwiAddPaymentMethodAdvice;->setSuccessProperties(Lcom/stripe/android/model/Source;Lcom/ibotta/android/tracking/AdviceProperties;)Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object p1

    goto :goto_0

    .line 38
    :cond_0
    instance-of p1, p2, Ljava/lang/Exception;

    if-eqz p1, :cond_1

    .line 39
    check-cast p2, Ljava/lang/Exception;

    invoke-direct {p0, p2, v0}, Lcom/ibotta/android/aop/tracking/advice/PwiAddPaymentMethodAdvice;->setFailureProperties(Ljava/lang/Exception;Lcom/ibotta/android/tracking/AdviceProperties;)Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object p1

    goto :goto_0

    .line 40
    :cond_1
    instance-of p1, p2, Lcom/ibotta/api/model/pwi/PwiError;

    if-eqz p1, :cond_2

    .line 41
    check-cast p2, Lcom/ibotta/api/model/pwi/PwiError;

    invoke-direct {p0, p2, v0}, Lcom/ibotta/android/aop/tracking/advice/PwiAddPaymentMethodAdvice;->setPwiErrorProperties(Lcom/ibotta/api/model/pwi/PwiError;Lcom/ibotta/android/tracking/AdviceProperties;)Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object p1

    :goto_0
    return-object p1

    .line 43
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Tracked methods do not have the expected arguments"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onExecute(Lorg/aspectj/lang/JoinPoint;)V
    .locals 1

    .line 24
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getTarget()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/aop/tracking/advice/PwiAddPaymentMethodAdviceFields;

    .line 25
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getArgs()[Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/aop/tracking/advice/PwiAddPaymentMethodAdvice;->createProperties(Lcom/ibotta/android/aop/tracking/advice/PwiAddPaymentMethodAdviceFields;[Ljava/lang/Object;)Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object p1

    const-string v0, "pwi_add_payment_method"

    .line 26
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getProperties()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/aop/tracking/advice/PwiAddPaymentMethodAdvice;->logEvent(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
