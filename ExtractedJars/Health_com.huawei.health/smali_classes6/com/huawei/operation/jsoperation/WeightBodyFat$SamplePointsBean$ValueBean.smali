.class public Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ValueBean"
.end annotation


# instance fields
.field private basalMetabolism:D

.field private bmi:D

.field private bodyAge:I

.field private bodyFat:D

.field private bodyFatRate:D

.field private bodyScore:D

.field private bodyWeight:D

.field private boneSalt:D

.field private extendAttribute:Ljava/lang/String;

.field private impedance:D

.field private moisture:D

.field private moistureRate:D

.field private muscleMass:D

.field private proteinRate:D

.field private visceralFatLevel:D


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public config_setBasalMetabolism(I)V
    .locals 2

    .line 248
    int-to-double v0, p1

    iput-wide v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->basalMetabolism:D

    .line 249
    return-void
.end method

.method public config_setBmi(D)V
    .locals 0

    .line 200
    iput-wide p1, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->bmi:D

    .line 201
    return-void
.end method

.method public config_setBodyAge(I)V
    .locals 0

    .line 232
    iput p1, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->bodyAge:I

    .line 233
    return-void
.end method

.method public config_setBodyFat(I)V
    .locals 2

    .line 184
    int-to-double v0, p1

    iput-wide v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->bodyFat:D

    .line 185
    return-void
.end method

.method public config_setBodyFatRate(I)V
    .locals 2

    .line 168
    int-to-double v0, p1

    iput-wide v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->bodyFatRate:D

    .line 169
    return-void
.end method

.method public config_setBodyScore(I)V
    .locals 2

    .line 240
    int-to-double v0, p1

    iput-wide v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->bodyScore:D

    .line 241
    return-void
.end method

.method public config_setBodyWeight(I)V
    .locals 2

    .line 176
    int-to-double v0, p1

    iput-wide v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->bodyWeight:D

    .line 177
    return-void
.end method

.method public config_setBoneSalt(D)V
    .locals 0

    .line 224
    iput-wide p1, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->boneSalt:D

    .line 225
    return-void
.end method

.method public config_setExtendAttribute(Ljava/lang/String;)V
    .locals 0

    .line 160
    iput-object p1, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->extendAttribute:Ljava/lang/String;

    .line 161
    return-void
.end method

.method public config_setImpedance(I)V
    .locals 2

    .line 192
    int-to-double v0, p1

    iput-wide v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->impedance:D

    .line 193
    return-void
.end method

.method public config_setMoisture(I)V
    .locals 2

    .line 216
    int-to-double v0, p1

    iput-wide v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->moisture:D

    .line 217
    return-void
.end method

.method public config_setMoistureRate(I)V
    .locals 2

    .line 256
    int-to-double v0, p1

    iput-wide v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->moistureRate:D

    .line 257
    return-void
.end method

.method public config_setMuscleMass(I)V
    .locals 2

    .line 208
    int-to-double v0, p1

    iput-wide v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->muscleMass:D

    .line 209
    return-void
.end method

.method public config_setProteinRate(I)V
    .locals 2

    .line 272
    int-to-double v0, p1

    iput-wide v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->proteinRate:D

    .line 273
    return-void
.end method

.method public config_setVisceralFatLevel(D)V
    .locals 0

    .line 264
    iput-wide p1, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->visceralFatLevel:D

    .line 265
    return-void
.end method

.method public fetch_getBasalMetabolism()D
    .locals 2

    .line 244
    iget-wide v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->basalMetabolism:D

    return-wide v0
.end method

.method public fetch_getBmi()D
    .locals 2

    .line 196
    iget-wide v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->bmi:D

    return-wide v0
.end method

.method public fetch_getBodyAge()I
    .locals 1

    .line 228
    iget v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->bodyAge:I

    return v0
.end method

.method public fetch_getBodyFat()D
    .locals 2

    .line 180
    iget-wide v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->bodyFat:D

    return-wide v0
.end method

.method public fetch_getBodyFatRate()D
    .locals 2

    .line 164
    iget-wide v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->bodyFatRate:D

    return-wide v0
.end method

.method public fetch_getBodyScore()D
    .locals 2

    .line 236
    iget-wide v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->bodyScore:D

    return-wide v0
.end method

.method public fetch_getBodyWeight()D
    .locals 2

    .line 172
    iget-wide v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->bodyWeight:D

    return-wide v0
.end method

.method public fetch_getBoneSalt()D
    .locals 2

    .line 220
    iget-wide v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->boneSalt:D

    return-wide v0
.end method

.method public fetch_getExtendAttribute()Ljava/lang/String;
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->extendAttribute:Ljava/lang/String;

    return-object v0
.end method

.method public fetch_getImpedance()D
    .locals 2

    .line 188
    iget-wide v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->impedance:D

    return-wide v0
.end method

.method public fetch_getMoisture()D
    .locals 2

    .line 212
    iget-wide v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->moisture:D

    return-wide v0
.end method

.method public fetch_getMoistureRate()D
    .locals 2

    .line 252
    iget-wide v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->moistureRate:D

    return-wide v0
.end method

.method public fetch_getMuscleMass()D
    .locals 2

    .line 204
    iget-wide v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->muscleMass:D

    return-wide v0
.end method

.method public fetch_getProteinRate()D
    .locals 2

    .line 268
    iget-wide v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->proteinRate:D

    return-wide v0
.end method

.method public fetch_getVisceralFatLevel()D
    .locals 2

    .line 260
    iget-wide v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->visceralFatLevel:D

    return-wide v0
.end method
