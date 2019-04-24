.class Lcom/ibotta/android/permissions/EnforcerImpl;
.super Ljava/lang/Object;
.source "EnforcerImpl.java"

# interfaces
.implements Lcom/ibotta/android/permissions/Enforcer;


# instance fields
.field private final criteriaStore:Lcom/ibotta/android/permissions/CriteriaStore;

.field private final rule:Lcom/ibotta/android/permissions/Rule;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/permissions/Rule;Lcom/ibotta/android/permissions/CriteriaStore;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/permissions/EnforcerImpl;->rule:Lcom/ibotta/android/permissions/Rule;

    .line 17
    iput-object p2, p0, Lcom/ibotta/android/permissions/EnforcerImpl;->criteriaStore:Lcom/ibotta/android/permissions/CriteriaStore;

    return-void
.end method

.method private isAreaSatisfied(Lcom/ibotta/android/state/app/permissions/Area;)Z
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/permissions/EnforcerImpl;->rule:Lcom/ibotta/android/permissions/Rule;

    invoke-virtual {v0}, Lcom/ibotta/android/permissions/Rule;->getAreaEnum()Lcom/ibotta/android/state/app/permissions/Area;

    move-result-object v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private isSessionsSatisfied()Z
    .locals 3

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/permissions/EnforcerImpl;->rule:Lcom/ibotta/android/permissions/Rule;

    invoke-virtual {v0}, Lcom/ibotta/android/permissions/Rule;->getSessions()Ljava/lang/Short;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/ibotta/android/permissions/EnforcerImpl;->rule:Lcom/ibotta/android/permissions/Rule;

    invoke-virtual {v0}, Lcom/ibotta/android/permissions/Rule;->getSessions()Ljava/lang/Short;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Short;->shortValue()S

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 63
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/permissions/EnforcerImpl;->criteriaStore:Lcom/ibotta/android/permissions/CriteriaStore;

    invoke-interface {v0}, Lcom/ibotta/android/permissions/CriteriaStore;->getSessions()S

    move-result v0

    iget-object v2, p0, Lcom/ibotta/android/permissions/EnforcerImpl;->rule:Lcom/ibotta/android/permissions/Rule;

    invoke-virtual {v2}, Lcom/ibotta/android/permissions/Rule;->getSessions()Ljava/lang/Short;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Short;->shortValue()S

    move-result v2

    if-lt v0, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1

    :cond_2
    :goto_1
    return v1
.end method

.method private isTimeSatisfied()Z
    .locals 7

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/permissions/EnforcerImpl;->rule:Lcom/ibotta/android/permissions/Rule;

    invoke-virtual {v0}, Lcom/ibotta/android/permissions/Rule;->getTime()Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/ibotta/android/permissions/EnforcerImpl;->rule:Lcom/ibotta/android/permissions/Rule;

    invoke-virtual {v0}, Lcom/ibotta/android/permissions/Rule;->getTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    goto :goto_0

    .line 75
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/permissions/EnforcerImpl;->criteriaStore:Lcom/ibotta/android/permissions/CriteriaStore;

    invoke-interface {v0}, Lcom/ibotta/android/permissions/CriteriaStore;->getLastPhaseTime()J

    move-result-wide v2

    const/4 v0, 0x0

    cmp-long v6, v2, v4

    if-nez v6, :cond_1

    return v0

    .line 79
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v4, p0, Lcom/ibotta/android/permissions/EnforcerImpl;->criteriaStore:Lcom/ibotta/android/permissions/CriteriaStore;

    invoke-interface {v4}, Lcom/ibotta/android/permissions/CriteriaStore;->getLastPhaseTime()J

    move-result-wide v4

    sub-long/2addr v2, v4

    .line 80
    iget-object v4, p0, Lcom/ibotta/android/permissions/EnforcerImpl;->rule:Lcom/ibotta/android/permissions/Rule;

    invoke-virtual {v4}, Lcom/ibotta/android/permissions/Rule;->getTime()Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    cmp-long v6, v2, v4

    if-ltz v6, :cond_2

    const/4 v0, 0x1

    :cond_2
    return v0

    :cond_3
    :goto_0
    return v1
.end method


# virtual methods
.method public getCriteriaStore()Lcom/ibotta/android/permissions/CriteriaStore;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/permissions/EnforcerImpl;->criteriaStore:Lcom/ibotta/android/permissions/CriteriaStore;

    return-object v0
.end method

.method public getRule()Lcom/ibotta/android/permissions/Rule;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/permissions/EnforcerImpl;->rule:Lcom/ibotta/android/permissions/Rule;

    return-object v0
.end method

.method public isRuleSatisfied(Lcom/ibotta/android/state/app/permissions/Area;)Z
    .locals 0

    .line 38
    invoke-direct {p0, p1}, Lcom/ibotta/android/permissions/EnforcerImpl;->isAreaSatisfied(Lcom/ibotta/android/state/app/permissions/Area;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 39
    invoke-direct {p0}, Lcom/ibotta/android/permissions/EnforcerImpl;->isSessionsSatisfied()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 40
    invoke-direct {p0}, Lcom/ibotta/android/permissions/EnforcerImpl;->isTimeSatisfied()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
