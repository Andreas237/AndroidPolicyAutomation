.class public Lcom/huawei/hihealthservice/old/model/BloodSugar;
.super Lcom/huawei/hihealthservice/old/model/HealthData;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/model/BloodSugar$BloodGlucoseTimeType;,
        Lcom/huawei/hihealthservice/old/model/BloodSugar$BloodGlucoseLevel;
    }
.end annotation


# static fields
.field private static final BreakfastTimeLine:I = 0x9

.field private static final DinnerTimeLine:I = 0x11

.field private static final LunchTimeBeginLine:I = 0xc

.field private static final LunchTimeEndLine:I = 0xe

.field private static final mMaxBloodGlucoseValue:F = 100.0f

.field private static final mMinBloodGlucoseValue:F = 0.0f

.field private static final serialVersionUID:J = -0x2d40529cfcf46b6L


# instance fields
.field private bloodSugar:F

.field private state:S


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/model/HealthData;-><init>()V

    return-void
.end method

.method public static getGlucoseSubType(I)I
    .locals 4

    .line 144
    const/4 v2, 0x0

    .line 146
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 147
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 150
    :sswitch_0
    const/16 v0, 0x9

    if-ge v3, v0, :cond_0

    .line 152
    const/16 v2, 0x501

    goto :goto_1

    .line 154
    :cond_0
    const/16 v0, 0xe

    if-ge v3, v0, :cond_1

    .line 156
    const/16 v2, 0x503

    goto :goto_1

    .line 160
    :cond_1
    const/16 v2, 0x505

    .line 162
    goto :goto_1

    .line 165
    :sswitch_1
    const/16 v0, 0xc

    if-ge v3, v0, :cond_2

    .line 167
    const/16 v2, 0x502

    goto :goto_1

    .line 169
    :cond_2
    const/16 v0, 0x11

    if-ge v3, v0, :cond_3

    .line 171
    const/16 v2, 0x504

    goto :goto_1

    .line 175
    :cond_3
    const/16 v2, 0x506

    .line 177
    goto :goto_1

    .line 179
    :goto_0
    move v2, p0

    .line 182
    :goto_1
    return v2

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

.method public static getGlucoseSubType(J)I
    .locals 3

    .line 187
    const/16 v1, 0x508

    .line 188
    invoke-static {p0, p1}, Lcom/huawei/hihealthservice/old/model/BloodSugar;->getHourOfDay(J)I

    move-result v2

    .line 189
    const/4 v0, 0x0

    if-ge v0, v2, :cond_0

    const/4 v0, 0x6

    if-lt v0, v2, :cond_0

    .line 191
    const/16 v1, 0x508

    goto :goto_0

    .line 192
    :cond_0
    const/4 v0, 0x6

    if-ge v0, v2, :cond_1

    const/16 v0, 0x8

    if-lt v0, v2, :cond_1

    .line 193
    const/16 v1, 0x501

    goto :goto_0

    .line 194
    :cond_1
    const/16 v0, 0x8

    if-ge v0, v2, :cond_2

    const/16 v0, 0xa

    if-lt v0, v2, :cond_2

    .line 195
    const/16 v1, 0x502

    goto :goto_0

    .line 196
    :cond_2
    const/16 v0, 0xa

    if-ge v0, v2, :cond_3

    const/16 v0, 0xc

    if-lt v0, v2, :cond_3

    .line 197
    const/16 v1, 0x503

    goto :goto_0

    .line 199
    :cond_3
    invoke-static {v2, v1}, Lcom/huawei/hihealthservice/old/model/BloodSugar;->getGlucoseSubType2Part(II)I

    move-result v1

    .line 201
    :goto_0
    return v1
.end method

.method private static getGlucoseSubType2Part(II)I
    .locals 1

    .line 205
    const/16 v0, 0xc

    if-ge v0, p0, :cond_0

    const/16 v0, 0xf

    if-lt v0, p0, :cond_0

    .line 206
    const/16 p1, 0x504

    goto :goto_0

    .line 207
    :cond_0
    const/16 v0, 0xf

    if-ge v0, p0, :cond_1

    const/16 v0, 0x13

    if-lt v0, p0, :cond_1

    .line 208
    const/16 p1, 0x505

    goto :goto_0

    .line 209
    :cond_1
    const/16 v0, 0x13

    if-ge v0, p0, :cond_2

    const/16 v0, 0x15

    if-lt v0, p0, :cond_2

    .line 210
    const/16 p1, 0x506

    goto :goto_0

    .line 211
    :cond_2
    const/16 v0, 0x15

    if-ge v0, p0, :cond_3

    const/16 v0, 0x18

    if-lt v0, p0, :cond_3

    .line 212
    const/16 p1, 0x507

    .line 214
    :cond_3
    :goto_0
    return p1
.end method

.method private static getHourOfDay(J)I
    .locals 3

    .line 219
    const/4 v1, 0x0

    .line 220
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object v2

    .line 221
    invoke-virtual {v2, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 222
    const/16 v0, 0xb

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v1

    .line 223
    return v1
.end method

.method public static getLevelOfBloodGlucose(IF)S
    .locals 5

    .line 94
    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_0

    const/high16 v0, 0x42c80000    # 100.0f

    cmpl-float v0, p1, v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    sub-float v0, p1, v0

    .line 95
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    .line 96
    :cond_0
    const/16 v4, -0x8000

    goto :goto_1

    .line 97
    :cond_1
    const v0, 0x408ccccd    # 4.4f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_2

    .line 98
    const/4 v4, 0x0

    goto :goto_1

    .line 100
    :cond_2
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 104
    :pswitch_0
    const v0, 0x40c33333    # 6.1f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_3

    .line 105
    const/4 v4, 0x1

    goto :goto_1

    .line 107
    :cond_3
    const/4 v4, 0x2

    .line 109
    goto :goto_1

    .line 113
    :pswitch_1
    const v0, 0x410ccccd    # 8.8f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_4

    .line 114
    const/4 v4, 0x1

    goto :goto_1

    .line 116
    :cond_4
    const/4 v4, 0x2

    .line 118
    goto :goto_1

    .line 122
    :goto_0
    :pswitch_2
    const/high16 v0, 0x41000000    # 8.0f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_5

    .line 123
    const/4 v4, 0x1

    goto :goto_1

    .line 125
    :cond_5
    const/4 v4, 0x2

    .line 131
    :goto_1
    return v4

    :pswitch_data_0
    .packed-switch 0x501
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static getMmaxbloodglucosevalue()F
    .locals 1

    .line 135
    const/high16 v0, 0x42c80000    # 100.0f

    return v0
.end method

.method public static getMminbloodglucosevalue()F
    .locals 1

    .line 139
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public getBloodSugar()F
    .locals 1

    .line 60
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/BloodSugar;->bloodSugar:F

    return v0
.end method

.method public getState()S
    .locals 1

    .line 71
    iget-short v0, p0, Lcom/huawei/hihealthservice/old/model/BloodSugar;->state:S

    return v0
.end method

.method public setBloodSugar(F)V
    .locals 0

    .line 67
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/BloodSugar;->bloodSugar:F

    .line 68
    return-void
.end method

.method public setState(S)V
    .locals 0

    .line 75
    iput-short p1, p0, Lcom/huawei/hihealthservice/old/model/BloodSugar;->state:S

    .line 76
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BloodSugar [state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lcom/huawei/hihealthservice/old/model/BloodSugar;->state:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", bloodSugar="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/model/BloodSugar;->bloodSugar:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 81
    invoke-super {p0}, Lcom/huawei/hihealthservice/old/model/HealthData;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 80
    return-object v0
.end method
