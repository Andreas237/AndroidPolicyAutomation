.class public Lcom/huawei/hihealthservice/old/model/BloodPresure;
.super Lcom/huawei/hihealthservice/old/model/HealthData;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/model/BloodPresure$BloodPressureLevel;
    }
.end annotation


# static fields
.field private static final mBloodPressureLevelCount:I = 0x6

.field private static final mBloodPressureOneUnitRelativeValue:F = 10.0f

.field private static final mMaxBloodPressureRelativetValue:F = 60.0f

.field private static final mMinBloodPressureRelativetValue:F = 0.0f

.field private static final serialVersionUID:J = -0x36ed616d8f7ea4ceL


# instance fields
.field private diastolic:S

.field private state:S

.field private systolic:S


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/model/HealthData;-><init>()V

    return-void
.end method

.method private static getJudgeByDiastolicValue(S)F
    .locals 3

    .line 254
    const/4 v2, 0x0

    .line 255
    const/16 v0, -0x8000

    if-ne p0, v0, :cond_0

    .line 256
    const/4 v2, 0x1

    goto/16 :goto_0

    .line 257
    :cond_0
    const/16 v0, 0x3c

    if-le v0, p0, :cond_1

    .line 258
    int-to-float v0, p0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x42700000    # 60.0f

    div-float v2, v0, v1

    goto :goto_0

    .line 259
    :cond_1
    const/16 v0, 0x50

    if-le v0, p0, :cond_2

    .line 260
    add-int/lit8 v0, p0, -0x3c

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41a00000    # 20.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x41200000    # 10.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 262
    :cond_2
    const/16 v0, 0x5a

    if-le v0, p0, :cond_3

    .line 263
    add-int/lit8 v0, p0, -0x50

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x41a00000    # 20.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 266
    :cond_3
    const/16 v0, 0x64

    if-le v0, p0, :cond_4

    .line 267
    add-int/lit8 v0, p0, -0x5a

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x41f00000    # 30.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 270
    :cond_4
    const/16 v0, 0x6e

    if-le v0, p0, :cond_5

    .line 271
    add-int/lit8 v0, p0, -0x64

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x42200000    # 40.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 274
    :cond_5
    const/16 v0, 0x78

    if-le v0, p0, :cond_6

    .line 275
    add-int/lit8 v0, p0, -0x6e

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x42480000    # 50.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 280
    :cond_6
    const/high16 v2, 0x42700000    # 60.0f

    .line 282
    :goto_0
    return v2
.end method

.method private static getJudgeBySystolicValue(S)F
    .locals 3

    .line 220
    const/4 v2, 0x0

    .line 221
    const/16 v0, -0x8000

    if-ne p0, v0, :cond_0

    .line 222
    const/4 v2, 0x1

    goto/16 :goto_0

    .line 223
    :cond_0
    const/16 v0, 0x5a

    if-le v0, p0, :cond_1

    .line 224
    int-to-float v0, p0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x42b40000    # 90.0f

    div-float v2, v0, v1

    goto/16 :goto_0

    .line 225
    :cond_1
    const/16 v0, 0x82

    if-le v0, p0, :cond_2

    .line 226
    add-int/lit8 v0, p0, -0x5a

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x42200000    # 40.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x41200000    # 10.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 228
    :cond_2
    const/16 v0, 0x8c

    if-le v0, p0, :cond_3

    .line 229
    add-int/lit16 v0, p0, -0x82

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x41a00000    # 20.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 232
    :cond_3
    const/16 v0, 0xa0

    if-le v0, p0, :cond_4

    .line 233
    add-int/lit16 v0, p0, -0x8c

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41a00000    # 20.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x41f00000    # 30.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 236
    :cond_4
    const/16 v0, 0xb4

    if-le v0, p0, :cond_5

    .line 237
    add-int/lit16 v0, p0, -0xa0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41a00000    # 20.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x42200000    # 40.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 240
    :cond_5
    const/16 v0, 0xc8

    if-le v0, p0, :cond_6

    .line 241
    add-int/lit16 v0, p0, -0xb4

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41a00000    # 20.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x42480000    # 50.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 246
    :cond_6
    const/high16 v2, 0x42700000    # 60.0f

    .line 249
    :goto_0
    return v2
.end method

.method public static getLevelOfBloodPressure(F)I
    .locals 5

    .line 157
    const/4 v0, 0x1

    sub-float v0, p0, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 158
    const/16 v4, -0x8000

    goto :goto_0

    .line 159
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/model/BloodPresure;->getRelativeValueOfBloodPressureUpperLimit(I)F

    move-result v0

    cmpg-float v0, p0, v0

    if-gez v0, :cond_1

    .line 160
    const/4 v4, 0x0

    goto :goto_0

    .line 161
    :cond_1
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/model/BloodPresure;->getRelativeValueOfBloodPressureUpperLimit(I)F

    move-result v0

    cmpg-float v0, p0, v0

    if-gez v0, :cond_2

    .line 162
    const/4 v4, 0x1

    goto :goto_0

    .line 163
    :cond_2
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/model/BloodPresure;->getRelativeValueOfBloodPressureUpperLimit(I)F

    move-result v0

    cmpg-float v0, p0, v0

    if-gez v0, :cond_3

    .line 164
    const/4 v4, 0x2

    goto :goto_0

    .line 165
    :cond_3
    const/4 v0, 0x3

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/model/BloodPresure;->getRelativeValueOfBloodPressureUpperLimit(I)F

    move-result v0

    cmpg-float v0, p0, v0

    if-gez v0, :cond_4

    .line 166
    const/4 v4, 0x3

    goto :goto_0

    .line 167
    :cond_4
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/model/BloodPresure;->getRelativeValueOfBloodPressureUpperLimit(I)F

    move-result v0

    cmpg-float v0, p0, v0

    if-gez v0, :cond_5

    .line 168
    const/4 v4, 0x4

    goto :goto_0

    .line 170
    :cond_5
    const/4 v4, 0x5

    .line 173
    :goto_0
    return v4
.end method

.method public static getLevelOfBloodPressure(SS)I
    .locals 1

    .line 144
    invoke-static {p0, p1}, Lcom/huawei/hihealthservice/old/model/BloodPresure;->getRelativeValueOfBloodPressure(SS)F

    move-result v0

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/model/BloodPresure;->getLevelOfBloodPressure(F)I

    move-result v0

    return v0
.end method

.method public static getRelativeValueOfBloodPressure(SS)F
    .locals 4

    .line 109
    const/4 v2, 0x1

    .line 110
    const/16 v0, -0x8000

    if-eq p0, v0, :cond_0

    const/16 v0, -0x8000

    if-ne p1, v0, :cond_1

    .line 112
    :cond_0
    return v2

    .line 114
    :cond_1
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/model/BloodPresure;->isDiastoliclicNormal(S)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 115
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/model/BloodPresure;->getJudgeBySystolicValue(S)F

    move-result v2

    goto :goto_2

    .line 116
    :cond_2
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/model/BloodPresure;->isSystolicNormal(S)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 117
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/model/BloodPresure;->getJudgeByDiastolicValue(S)F

    move-result v2

    goto :goto_2

    .line 118
    :cond_3
    const/16 v0, 0x50

    if-gt v0, p1, :cond_5

    const/16 v0, 0x82

    if-gt v0, p0, :cond_5

    .line 119
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/model/BloodPresure;->getJudgeBySystolicValue(S)F

    move-result v0

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/model/BloodPresure;->getJudgeByDiastolicValue(S)F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_4

    invoke-static {p0}, Lcom/huawei/hihealthservice/old/model/BloodPresure;->getJudgeBySystolicValue(S)F

    move-result v2

    goto :goto_0

    .line 120
    :cond_4
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/model/BloodPresure;->getJudgeByDiastolicValue(S)F

    move-result v2

    :goto_0
    goto :goto_2

    .line 121
    :cond_5
    const/16 v0, 0x3c

    if-le v0, p1, :cond_7

    const/16 v0, 0x5a

    if-le v0, p0, :cond_7

    .line 122
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/model/BloodPresure;->getJudgeBySystolicValue(S)F

    move-result v0

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/model/BloodPresure;->getJudgeByDiastolicValue(S)F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_6

    invoke-static {p0}, Lcom/huawei/hihealthservice/old/model/BloodPresure;->getJudgeBySystolicValue(S)F

    move-result v2

    goto :goto_1

    .line 123
    :cond_6
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/model/BloodPresure;->getJudgeByDiastolicValue(S)F

    move-result v2

    :goto_1
    goto :goto_2

    .line 124
    :cond_7
    const/16 v0, 0x3c

    if-le v0, p1, :cond_8

    const/16 v0, 0x82

    if-gt v0, p0, :cond_8

    .line 125
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/model/BloodPresure;->getJudgeByDiastolicValue(S)F

    move-result v2

    goto :goto_2

    .line 128
    :cond_8
    const/high16 v2, 0x42700000    # 60.0f

    .line 130
    :goto_2
    new-instance v3, Ljava/math/BigDecimal;

    float-to-double v0, v2

    invoke-direct {v3, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 131
    const/4 v0, 0x2

    const/4 v1, 0x4

    invoke-virtual {v3, v0, v1}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->floatValue()F

    move-result v2

    .line 132
    return v2
.end method

.method public static getRelativeValueOfBloodPressureLowerLimit(I)F
    .locals 4

    .line 199
    int-to-float v0, p0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float v2, v1, v0

    .line 200
    new-instance v3, Ljava/math/BigDecimal;

    float-to-double v0, v2

    invoke-direct {v3, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 201
    const/4 v0, 0x2

    const/4 v1, 0x4

    invoke-virtual {v3, v0, v1}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->floatValue()F

    move-result v2

    .line 202
    const/16 v0, -0x8000

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    return v0
.end method

.method public static getRelativeValueOfBloodPressureUpperLimit(I)F
    .locals 4

    .line 184
    add-int/lit8 v0, p0, 0x1

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float v2, v1, v0

    .line 185
    new-instance v3, Ljava/math/BigDecimal;

    float-to-double v0, v2

    invoke-direct {v3, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 186
    const/4 v0, 0x2

    const/4 v1, 0x4

    invoke-virtual {v3, v0, v1}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->floatValue()F

    move-result v2

    .line 187
    const/16 v0, -0x8000

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    return v0
.end method

.method public static getmBloodPressureLevelCount()I
    .locals 1

    .line 215
    const/4 v0, 0x6

    return v0
.end method

.method public static getmMaxBloodpressurerelativetvalue()F
    .locals 1

    .line 207
    const/high16 v0, 0x42700000    # 60.0f

    return v0
.end method

.method public static getmMinBloodpressurerelativetvalue()F
    .locals 1

    .line 211
    const/4 v0, 0x0

    return v0
.end method

.method private static isDiastoliclicNormal(S)Z
    .locals 1

    .line 293
    const/16 v0, 0x3c

    if-gt v0, p0, :cond_0

    const/16 v0, 0x50

    if-le v0, p0, :cond_0

    .line 294
    const/4 v0, 0x1

    return v0

    .line 296
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private static isSystolicNormal(S)Z
    .locals 1

    .line 286
    const/16 v0, 0x5a

    if-gt v0, p0, :cond_0

    const/16 v0, 0x82

    if-le v0, p0, :cond_0

    .line 287
    const/4 v0, 0x1

    return v0

    .line 289
    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public getDiastolic()S
    .locals 1

    .line 76
    iget-short v0, p0, Lcom/huawei/hihealthservice/old/model/BloodPresure;->diastolic:S

    return v0
.end method

.method public getState()S
    .locals 1

    .line 87
    iget-short v0, p0, Lcom/huawei/hihealthservice/old/model/BloodPresure;->state:S

    return v0
.end method

.method public getSystolic()S
    .locals 1

    .line 62
    iget-short v0, p0, Lcom/huawei/hihealthservice/old/model/BloodPresure;->systolic:S

    return v0
.end method

.method public setDiastolic(S)V
    .locals 0

    .line 83
    iput-short p1, p0, Lcom/huawei/hihealthservice/old/model/BloodPresure;->diastolic:S

    .line 84
    return-void
.end method

.method public setState(S)V
    .locals 0

    .line 91
    iput-short p1, p0, Lcom/huawei/hihealthservice/old/model/BloodPresure;->state:S

    .line 92
    return-void
.end method

.method public setSystolic(S)V
    .locals 0

    .line 69
    iput-short p1, p0, Lcom/huawei/hihealthservice/old/model/BloodPresure;->systolic:S

    .line 70
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BloodPresure [state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lcom/huawei/hihealthservice/old/model/BloodPresure;->state:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", systolic="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lcom/huawei/hihealthservice/old/model/BloodPresure;->systolic:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", diastolic="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lcom/huawei/hihealthservice/old/model/BloodPresure;->diastolic:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 97
    invoke-super {p0}, Lcom/huawei/hihealthservice/old/model/HealthData;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 96
    return-object v0
.end method
