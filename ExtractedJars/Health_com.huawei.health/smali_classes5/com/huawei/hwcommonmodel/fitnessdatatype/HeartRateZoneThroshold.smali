.class public Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private aerobicAdvanceThreshold:I

.field private aerobicBaseThreshold:I

.field private aerobicThreshold:I

.field private anaerobicAdvanceThreshold:I

.field private anaerobicBaseThreshold:I

.field private anaerobicThreshold:I

.field private fatBurnThreshold:I

.field private fitnessThreshold:I

.field private lacticAcidThreshold:I

.field private maxHRRThreshold:I

.field private maxThreshold:I

.field restHeartRate:I

.field restHeartRateDefault:I

.field private warmUpThreshold:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 82
    const/16 v0, 0x1e

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;-><init>(I)V

    .line 83
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    invoke-virtual {p0, p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->resetHeartRateZoneThroshold(I)V

    .line 109
    invoke-virtual {p0, p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->resetHRRHeartRateZoneThroshold(I)V

    .line 110
    return-void
.end method


# virtual methods
.method public getAerobicAdvanceThreshold()I
    .locals 1

    .line 223
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->aerobicAdvanceThreshold:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getAerobicBaseThreshold()I
    .locals 1

    .line 219
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->aerobicBaseThreshold:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getAerobicThreshold()I
    .locals 1

    .line 152
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->aerobicThreshold:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getAnaerobicAdvanceThreshold()I
    .locals 1

    .line 235
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->anaerobicAdvanceThreshold:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getAnaerobicBaseThreshold()I
    .locals 1

    .line 231
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->anaerobicBaseThreshold:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getAnaerobicThreshold()I
    .locals 1

    .line 156
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->anaerobicThreshold:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getFatBurnThreshold()I
    .locals 1

    .line 148
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->fatBurnThreshold:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getFitnessThreshold()I
    .locals 1

    .line 140
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->fitnessThreshold:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getHRRMaxThreshold()I
    .locals 1

    .line 239
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->maxHRRThreshold:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getHRRThresholdString()Ljava/lang/String;
    .locals 2

    .line 243
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->aerobicBaseThreshold:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->aerobicAdvanceThreshold:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->lacticAcidThreshold:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->anaerobicBaseThreshold:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->anaerobicAdvanceThreshold:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->maxHRRThreshold:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLacticAcidThreshold()I
    .locals 1

    .line 227
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->lacticAcidThreshold:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getMaxThreshold()I
    .locals 1

    .line 160
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->maxThreshold:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRestHeartRate()I
    .locals 1

    .line 280
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->restHeartRate:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRestHeartRateDefault()I
    .locals 1

    .line 284
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->restHeartRateDefault:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getThresholdString()Ljava/lang/String;
    .locals 2

    .line 164
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->fitnessThreshold:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->warmUpThreshold:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->fatBurnThreshold:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->aerobicThreshold:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->anaerobicThreshold:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->maxThreshold:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getWarmUpThreshold()I
    .locals 1

    .line 144
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->warmUpThreshold:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public final resetHRRHeartRateZoneThroshold(I)V
    .locals 3

    .line 98
    rsub-int v0, p1, 0xdc

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->maxHRRThreshold:I

    .line 99
    rsub-int v0, p1, 0xdc

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->restHeartRate:I

    sub-int v2, v0, v1

    .line 100
    mul-int/lit8 v0, v2, 0x5f

    div-int/lit8 v0, v0, 0x64

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->restHeartRate:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->anaerobicAdvanceThreshold:I

    .line 101
    mul-int/lit8 v0, v2, 0x58

    div-int/lit8 v0, v0, 0x64

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->restHeartRate:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->anaerobicBaseThreshold:I

    .line 102
    mul-int/lit8 v0, v2, 0x54

    div-int/lit8 v0, v0, 0x64

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->restHeartRate:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->lacticAcidThreshold:I

    .line 103
    mul-int/lit8 v0, v2, 0x4a

    div-int/lit8 v0, v0, 0x64

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->restHeartRate:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->aerobicAdvanceThreshold:I

    .line 104
    mul-int/lit8 v0, v2, 0x3b

    div-int/lit8 v0, v0, 0x64

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->restHeartRate:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->aerobicBaseThreshold:I

    .line 105
    return-void
.end method

.method public final resetHeartRateZoneThroshold(I)V
    .locals 2

    .line 89
    rsub-int v0, p1, 0xdc

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->maxThreshold:I

    .line 90
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->maxThreshold:I

    mul-int/lit8 v0, v0, 0x32

    div-int/lit8 v0, v0, 0x64

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->fitnessThreshold:I

    .line 91
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->maxThreshold:I

    mul-int/lit8 v0, v0, 0x3c

    div-int/lit8 v0, v0, 0x64

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->warmUpThreshold:I

    .line 92
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->maxThreshold:I

    mul-int/lit8 v0, v0, 0x46

    div-int/lit8 v0, v0, 0x64

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->fatBurnThreshold:I

    .line 93
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->maxThreshold:I

    mul-int/lit8 v0, v0, 0x50

    div-int/lit8 v0, v0, 0x64

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->aerobicThreshold:I

    .line 94
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->maxThreshold:I

    mul-int/lit8 v0, v0, 0x5a

    div-int/lit8 v0, v0, 0x64

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->anaerobicThreshold:I

    .line 95
    return-void
.end method

.method public setAerobicAdvanceThreshold(I)V
    .locals 1

    .line 199
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->aerobicAdvanceThreshold:I

    .line 200
    return-void
.end method

.method public setAerobicBaseThreshold(I)V
    .locals 1

    .line 195
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->aerobicBaseThreshold:I

    .line 196
    return-void
.end method

.method public setAerobicThreshold(I)V
    .locals 1

    .line 128
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->aerobicThreshold:I

    .line 129
    return-void
.end method

.method public setAnaerobicAdvanceThreshold(I)V
    .locals 1

    .line 211
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->anaerobicAdvanceThreshold:I

    .line 212
    return-void
.end method

.method public setAnaerobicBaseThreshold(I)V
    .locals 1

    .line 207
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->anaerobicBaseThreshold:I

    .line 208
    return-void
.end method

.method public setAnaerobicThreshold(I)V
    .locals 1

    .line 132
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->anaerobicThreshold:I

    .line 133
    return-void
.end method

.method public setFatBurnThreshold(I)V
    .locals 1

    .line 124
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->fatBurnThreshold:I

    .line 125
    return-void
.end method

.method public setFitnessThreshold(I)V
    .locals 1

    .line 116
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->fitnessThreshold:I

    .line 117
    return-void
.end method

.method public setHRRMaxThreshold(I)V
    .locals 1

    .line 215
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->maxHRRThreshold:I

    .line 216
    return-void
.end method

.method public setHRRThreshold(Ljava/lang/String;)V
    .locals 6

    .line 249
    const-string v0, "HeartRateZoneThrosholdHRR"

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

    .line 251
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 252
    return-void

    .line 254
    :cond_0
    const-string v0, "\\|"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 256
    const/4 v0, 0x0

    :try_start_0
    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->aerobicBaseThreshold:I

    .line 257
    const/4 v0, 0x1

    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->aerobicAdvanceThreshold:I

    .line 258
    const/4 v0, 0x2

    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->lacticAcidThreshold:I

    .line 259
    const/4 v0, 0x3

    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->anaerobicBaseThreshold:I

    .line 260
    const/4 v0, 0x4

    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->anaerobicAdvanceThreshold:I

    .line 261
    const/4 v0, 0x5

    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->maxHRRThreshold:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 264
    goto :goto_0

    .line 262
    :catch_0
    move-exception v5

    .line 263
    const-string v0, "HeartRateZoneThrosholdHRR"

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

    .line 265
    :goto_0
    return-void
.end method

.method public setLacticAcidThreshold(I)V
    .locals 1

    .line 203
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->lacticAcidThreshold:I

    .line 204
    return-void
.end method

.method public setMaxThreshold(I)V
    .locals 1

    .line 136
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->maxThreshold:I

    .line 137
    return-void
.end method

.method public setRestHeartRate(I)V
    .locals 1

    .line 272
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->restHeartRate:I

    .line 273
    return-void
.end method

.method public setRestHeartRateDefault(I)V
    .locals 1

    .line 276
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->restHeartRateDefault:I

    .line 277
    return-void
.end method

.method public setThreshold(Ljava/lang/String;)V
    .locals 6

    .line 170
    const-string v0, "HeartRateZoneThroshold"

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

    .line 172
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 173
    return-void

    .line 175
    :cond_0
    const-string v0, "\\|"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 177
    const/4 v0, 0x0

    :try_start_0
    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->fitnessThreshold:I

    .line 178
    const/4 v0, 0x1

    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->warmUpThreshold:I

    .line 179
    const/4 v0, 0x2

    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->fatBurnThreshold:I

    .line 180
    const/4 v0, 0x3

    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->aerobicThreshold:I

    .line 181
    const/4 v0, 0x4

    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->anaerobicThreshold:I

    .line 182
    const/4 v0, 0x5

    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->maxThreshold:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 185
    goto :goto_0

    .line 183
    :catch_0
    move-exception v5

    .line 184
    const-string v0, "HeartRateZoneThroshold"

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

    .line 186
    :goto_0
    return-void
.end method

.method public setWarmUpThreshold(I)V
    .locals 1

    .line 120
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->warmUpThreshold:I

    .line 121
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 289
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HeartRateZoneThroshold{fitnessThreshold="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->fitnessThreshold:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", warmUpThreshold="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->warmUpThreshold:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", fatBurnThreshold="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->fatBurnThreshold:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", aerobicThreshold="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->aerobicThreshold:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", anaerobicThreshold="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->anaerobicThreshold:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", maxThreshold="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->maxThreshold:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", aerobicBaseThreshold="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->aerobicBaseThreshold:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", aerobicAdvanceThreshold="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->aerobicAdvanceThreshold:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lacticAcidThreshold="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->lacticAcidThreshold:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", anaerobicBaseThreshold="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->anaerobicBaseThreshold:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", anaerobicAdvanceThreshold="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->anaerobicAdvanceThreshold:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", maxHRRThreshold="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThroshold;->maxHRRThreshold:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
