.class public Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice;
.super Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;
.source "ScannedBarcodeAdvice.java"


# instance fields
.field private matchOutcome:Lcom/ibotta/android/verification/MatchOutcome;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    const/4 p1, 0x0

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice;->matchOutcome:Lcom/ibotta/android/verification/MatchOutcome;

    return-void
.end method

.method private addGeneralProperties(Lorg/aspectj/lang/ProceedingJoinPoint;Lcom/ibotta/android/tracking/AdviceProperties$Builder;)V
    .locals 2

    .line 80
    invoke-direct {p0, p1}, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice;->getBarcodeType(Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->type(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p2

    .line 81
    invoke-direct {p0, p1}, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice;->getContext(Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->context(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p2

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice;->matchOutcome:Lcom/ibotta/android/verification/MatchOutcome;

    if-eqz v0, :cond_0

    .line 82
    invoke-virtual {v0}, Lcom/ibotta/android/verification/MatchOutcome;->isMatch()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->matched(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p2

    .line 83
    invoke-direct {p0, p1}, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice;->getDuration(Lorg/aspectj/lang/ProceedingJoinPoint;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->duration(Ljava/lang/Long;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p2

    .line 84
    invoke-direct {p0, p1}, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice;->getScannedUpc(Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->upc(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p2

    .line 85
    invoke-direct {p0, p1}, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice;->getOfferId(Lorg/aspectj/lang/ProceedingJoinPoint;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->offerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p2

    .line 86
    invoke-direct {p0, p1}, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice;->getOfferAmountType(Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->offerAmountType(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    return-void
.end method

.method private addRedeemProperties(Lorg/aspectj/lang/ProceedingJoinPoint;Lcom/ibotta/android/tracking/AdviceProperties$Builder;)V
    .locals 2

    .line 91
    invoke-direct {p0, p1}, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice;->getContext(Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "redeem"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice;->getRetailerId(Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 92
    invoke-direct {p0, p1}, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice;->getRetailerId(Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->retailerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    :cond_0
    return-void
.end method

.method private canTrackMethod(Lorg/aspectj/lang/ProceedingJoinPoint;)Z
    .locals 2

    .line 50
    invoke-interface {p1}, Lorg/aspectj/lang/ProceedingJoinPoint;->getTarget()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdviceFields;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 51
    invoke-interface {p1}, Lorg/aspectj/lang/ProceedingJoinPoint;->getArgs()[Ljava/lang/Object;

    move-result-object p1

    aget-object p1, p1, v1

    instance-of p1, p1, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private createProperties(Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/aspectj/lang/ProceedingJoinPoint;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 70
    invoke-static {}, Lcom/ibotta/android/tracking/AdviceProperties;->builder()Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    .line 71
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice;->addGeneralProperties(Lorg/aspectj/lang/ProceedingJoinPoint;Lcom/ibotta/android/tracking/AdviceProperties$Builder;)V

    .line 72
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice;->addRedeemProperties(Lorg/aspectj/lang/ProceedingJoinPoint;Lcom/ibotta/android/tracking/AdviceProperties$Builder;)V

    .line 73
    invoke-virtual {v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->build()Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getProperties()Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method private getBarcodeMode(Lorg/aspectj/lang/ProceedingJoinPoint;)Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;
    .locals 0

    .line 118
    invoke-interface {p1}, Lorg/aspectj/lang/ProceedingJoinPoint;->getTarget()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdviceFields;

    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdviceFields;->getMode()Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    move-result-object p1

    return-object p1
.end method

.method private getBarcodeType(Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/String;
    .locals 1

    .line 97
    invoke-interface {p1}, Lorg/aspectj/lang/ProceedingJoinPoint;->getArgs()[Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x1

    aget-object p1, p1, v0

    check-cast p1, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

    .line 98
    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;->getBarcodeType()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private getContext(Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/String;
    .locals 1

    .line 104
    sget-object v0, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice$1;->$SwitchMap$com$ibotta$android$apiandroid$barcode$VerifyBarcodeMode:[I

    invoke-direct {p0, p1}, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice;->getBarcodeMode(Lorg/aspectj/lang/ProceedingJoinPoint;)Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const-string p1, "redeem"

    goto :goto_0

    :cond_0
    const-string p1, "pre_verification"

    :goto_0
    return-object p1
.end method

.method private getDuration(Lorg/aspectj/lang/ProceedingJoinPoint;)J
    .locals 4

    .line 122
    invoke-interface {p1}, Lorg/aspectj/lang/ProceedingJoinPoint;->getTarget()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/aop/tracking/advice/LoadTimeAdviceFields;

    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/advice/LoadTimeAdviceFields;->getLoadStartTime()J

    move-result-wide v0

    .line 123
    iget-object p1, p0, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {p1}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v2

    sub-long/2addr v2, v0

    return-wide v2
.end method

.method private getMatchedOutcome(Lorg/aspectj/lang/ProceedingJoinPoint;)Lcom/ibotta/android/verification/MatchOutcome;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 59
    :try_start_0
    invoke-interface {p1}, Lorg/aspectj/lang/ProceedingJoinPoint;->getArgs()[Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lorg/aspectj/lang/ProceedingJoinPoint;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/verification/MatchOutcome;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to proceed with method execution."

    const/4 v1, 0x0

    .line 61
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private getOfferAmountType(Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/String;
    .locals 0

    .line 136
    invoke-interface {p1}, Lorg/aspectj/lang/ProceedingJoinPoint;->getTarget()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdviceFields;

    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdviceFields;->getOfferAmountType()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private getOfferId(Lorg/aspectj/lang/ProceedingJoinPoint;)I
    .locals 0

    .line 127
    invoke-interface {p1}, Lorg/aspectj/lang/ProceedingJoinPoint;->getTarget()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdviceFields;

    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdviceFields;->getOfferId()I

    move-result p1

    return p1
.end method

.method private getRetailerId(Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/Integer;
    .locals 0
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 141
    invoke-interface {p1}, Lorg/aspectj/lang/ProceedingJoinPoint;->getTarget()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdviceFields;

    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdviceFields;->getRetailerId()Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method private getScannedUpc(Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/String;
    .locals 1

    .line 131
    invoke-interface {p1}, Lorg/aspectj/lang/ProceedingJoinPoint;->getArgs()[Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x1

    aget-object p1, p1, v0

    check-cast p1, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

    .line 132
    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;->getUpc()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public onExecuteProceedingJoinPoint(Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/Object;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 37
    invoke-direct {p0, p1}, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice;->canTrackMethod(Lorg/aspectj/lang/ProceedingJoinPoint;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 41
    invoke-direct {p0, p1}, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice;->getMatchedOutcome(Lorg/aspectj/lang/ProceedingJoinPoint;)Lcom/ibotta/android/verification/MatchOutcome;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice;->matchOutcome:Lcom/ibotta/android/verification/MatchOutcome;

    .line 43
    invoke-direct {p0, p1}, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice;->createProperties(Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/util/Map;

    move-result-object p1

    const-string v0, "scanned_barcode"

    .line 44
    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice;->logEvent(Ljava/lang/String;Ljava/util/Map;)V

    .line 46
    iget-object p1, p0, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice;->matchOutcome:Lcom/ibotta/android/verification/MatchOutcome;

    return-object p1

    .line 38
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Can not track Scanned Barcode events"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
