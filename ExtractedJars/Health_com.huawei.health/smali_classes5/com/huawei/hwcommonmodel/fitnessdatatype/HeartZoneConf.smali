.class public Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;
.super Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;
.source "SourceFile"


# static fields
.field private static final AEROBIC:I = 0x2

.field private static final ANAEROBIC:I = 0x4

.field private static final HEARTRATELIMIT:I = 0xdc

.field private static final MARATHON:I = 0x3

.field private static final MBURNING:I = 0x1

.field private static final MWORMUP:I = 0x0


# instance fields
.field classifyMethod:I

.field warningEnble:Z

.field warningEnbleHRR:Z

.field warningLimitHR:I

.field warningLimitHRHRR:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 37
    const/16 v0, 0x1e

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;-><init>(I)V

    .line 38
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 82
    invoke-direct {p0, p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;-><init>(I)V

    .line 83
    const/16 v0, 0x3c

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setRestHeartRate(I)V

    .line 84
    const/16 v0, 0x3c

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setRestHeartRateDefault(I)V

    .line 85
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningEnble:Z

    .line 86
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningEnbleHRR:Z

    .line 87
    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getMaxThreshold()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningLimitHR:I

    .line 88
    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getHRRMaxThreshold()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningLimitHRHRR:I

    .line 89
    return-void
.end method

.method private whichRateRegion(IIIIII)I
    .locals 1

    .line 211
    const/16 v0, 0xdc

    if-ge p1, v0, :cond_4

    .line 212
    if-lt p1, p2, :cond_0

    .line 213
    const/4 v0, 0x4

    return v0

    .line 214
    :cond_0
    if-lt p1, p3, :cond_1

    .line 215
    const/4 v0, 0x3

    return v0

    .line 216
    :cond_1
    if-lt p1, p4, :cond_2

    .line 217
    const/4 v0, 0x2

    return v0

    .line 218
    :cond_2
    if-lt p1, p5, :cond_3

    .line 219
    const/4 v0, 0x1

    return v0

    .line 220
    :cond_3
    if-lt p1, p6, :cond_4

    .line 221
    const/4 v0, 0x0

    return v0

    .line 224
    :cond_4
    const/4 v0, -0x1

    return v0
.end method


# virtual methods
.method public findRateRegion(I)I
    .locals 7

    .line 193
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->classifyMethod:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 194
    move-object v0, p0

    move v1, p1

    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAnaerobicThreshold()I

    move-result v2

    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAerobicThreshold()I

    move-result v3

    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getFatBurnThreshold()I

    move-result v4

    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getWarmUpThreshold()I

    move-result v5

    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getFitnessThreshold()I

    move-result v6

    invoke-direct/range {v0 .. v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->whichRateRegion(IIIIII)I

    move-result v0

    return v0

    .line 197
    :cond_0
    move-object v0, p0

    move v1, p1

    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAnaerobicAdvanceThreshold()I

    move-result v2

    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAnaerobicBaseThreshold()I

    move-result v3

    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getLacticAcidThreshold()I

    move-result v4

    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAerobicAdvanceThreshold()I

    move-result v5

    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAerobicBaseThreshold()I

    move-result v6

    invoke-direct/range {v0 .. v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->whichRateRegion(IIIIII)I

    move-result v0

    return v0
.end method

.method public findRateRegion(II)I
    .locals 7

    .line 202
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 203
    move-object v0, p0

    move v1, p1

    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAnaerobicThreshold()I

    move-result v2

    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAerobicThreshold()I

    move-result v3

    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getFatBurnThreshold()I

    move-result v4

    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getWarmUpThreshold()I

    move-result v5

    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getFitnessThreshold()I

    move-result v6

    invoke-direct/range {v0 .. v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->whichRateRegion(IIIIII)I

    move-result v0

    return v0

    .line 206
    :cond_0
    move-object v0, p0

    move v1, p1

    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAnaerobicAdvanceThreshold()I

    move-result v2

    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAnaerobicBaseThreshold()I

    move-result v3

    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getLacticAcidThreshold()I

    move-result v4

    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAerobicAdvanceThreshold()I

    move-result v5

    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAerobicBaseThreshold()I

    move-result v6

    invoke-direct/range {v0 .. v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->whichRateRegion(IIIIII)I

    move-result v0

    return v0
.end method

.method public getClassifyMethod()I
    .locals 1

    .line 138
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->classifyMethod:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getHRRHRZoneConfStr()Ljava/lang/String;
    .locals 2

    .line 133
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-boolean v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningEnbleHRR:Z

    if-eqz v1, :cond_0

    const-string v1, "1"

    goto :goto_0

    :cond_0
    const-string v1, "0"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningLimitHRHRR:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getHRZoneConfStr()Ljava/lang/String;
    .locals 2

    .line 120
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-boolean v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningEnble:Z

    if-eqz v1, :cond_0

    const-string v1, "1"

    goto :goto_0

    :cond_0
    const-string v1, "0"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningLimitHR:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getWarningLimitHR()I
    .locals 1

    .line 116
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningLimitHR:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getWarningLimitHRHRR()I
    .locals 1

    .line 129
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningLimitHRHRR:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public isWarningEnble()Z
    .locals 1

    .line 112
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningEnble:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isWarningEnbleHRR()Z
    .locals 1

    .line 125
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningEnbleHRR:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public resetHeartZoneConf(I)V
    .locals 0

    .line 75
    invoke-virtual {p0, p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->resetHRRHeartRateZoneThroshold(I)V

    .line 78
    invoke-virtual {p0, p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->resetHeartRateZoneThroshold(I)V

    .line 79
    return-void
.end method

.method public setClassifyMethod(I)V
    .locals 1

    .line 108
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->classifyMethod:I

    .line 109
    return-void
.end method

.method public setHRRHRZoneConf(Ljava/lang/String;)V
    .locals 6

    .line 165
    const-string v0, "HRRHeartRateConf"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setHRRHRZoneConf :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 168
    return-void

    .line 170
    :cond_0
    const-string v0, "\\|"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 172
    :try_start_0
    array-length v0, v4

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 173
    const/4 v0, 0x0

    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1

    .line 174
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningEnbleHRR:Z

    goto :goto_0

    .line 176
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningEnbleHRR:Z

    .line 178
    :goto_0
    const/4 v0, 0x1

    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningLimitHRHRR:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 182
    :cond_2
    goto :goto_1

    .line 180
    :catch_0
    move-exception v5

    .line 181
    const-string v0, "HRRHeartRateConf"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getThreshold "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " meet e:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    :goto_1
    return-void
.end method

.method public setHRRHeartZoneConf(Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;)V
    .locals 1

    .line 55
    iget-boolean v0, p1, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningEnble:Z

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningEnble:Z

    .line 56
    iget v0, p1, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningLimitHR:I

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningLimitHR:I

    .line 57
    iget-boolean v0, p1, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningEnbleHRR:Z

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningEnbleHRR:Z

    .line 58
    iget v0, p1, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningLimitHRHRR:I

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningLimitHRHRR:I

    .line 60
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAerobicBaseThreshold()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setAerobicBaseThreshold(I)V

    .line 61
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAerobicAdvanceThreshold()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setAerobicAdvanceThreshold(I)V

    .line 62
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getLacticAcidThreshold()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setLacticAcidThreshold(I)V

    .line 63
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAnaerobicBaseThreshold()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setAnaerobicBaseThreshold(I)V

    .line 64
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAnaerobicAdvanceThreshold()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setAnaerobicAdvanceThreshold(I)V

    .line 65
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getHRRMaxThreshold()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setHRRMaxThreshold(I)V

    .line 66
    return-void
.end method

.method public setHRZoneConf(Ljava/lang/String;)V
    .locals 6

    .line 143
    const-string v0, "HeartRateConf"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setThreshold :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 146
    return-void

    .line 148
    :cond_0
    const-string v0, "\\|"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 150
    :try_start_0
    array-length v0, v4

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 151
    const/4 v0, 0x0

    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1

    .line 152
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningEnble:Z

    goto :goto_0

    .line 154
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningEnble:Z

    .line 156
    :goto_0
    const/4 v0, 0x1

    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningLimitHR:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 160
    :cond_2
    goto :goto_1

    .line 158
    :catch_0
    move-exception v5

    .line 159
    const-string v0, "HeartRateConf"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getThreshold "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " meet e:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    :goto_1
    return-void
.end method

.method public setHeartZoneConf(Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;)V
    .locals 1

    .line 41
    iget-boolean v0, p1, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningEnble:Z

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningEnble:Z

    .line 42
    iget v0, p1, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningLimitHR:I

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningLimitHR:I

    .line 43
    iget-boolean v0, p1, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningEnbleHRR:Z

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningEnbleHRR:Z

    .line 44
    iget v0, p1, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningLimitHRHRR:I

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningLimitHRHRR:I

    .line 46
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getFitnessThreshold()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setFitnessThreshold(I)V

    .line 47
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getWarmUpThreshold()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setWarmUpThreshold(I)V

    .line 48
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getFatBurnThreshold()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setFatBurnThreshold(I)V

    .line 49
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAerobicThreshold()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setAerobicThreshold(I)V

    .line 50
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAnaerobicThreshold()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setAnaerobicThreshold(I)V

    .line 51
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getMaxThreshold()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setMaxThreshold(I)V

    .line 52
    return-void
.end method

.method public setWarningEnble(Z)V
    .locals 1

    .line 92
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningEnble:Z

    .line 93
    return-void
.end method

.method public setWarningEnbleHRR(Z)V
    .locals 1

    .line 100
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningEnbleHRR:Z

    .line 101
    return-void
.end method

.method public setWarningLimitHR(I)V
    .locals 1

    .line 96
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningLimitHR:I

    .line 97
    return-void
.end method

.method public setWarningLimitHRHRR(I)V
    .locals 1

    .line 104
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningLimitHRHRR:I

    .line 105
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 229
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HeartZoneConf{warningEnble="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningEnble:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", warningLimitHR="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningLimitHR:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",warningEnbleHRR="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningEnbleHRR:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", warningLimitHRHRR="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->warningLimitHRHRR:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", clssifyMethod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->classifyMethod:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", restHeartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->restHeartRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 236
    invoke-super {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 229
    return-object v0
.end method
