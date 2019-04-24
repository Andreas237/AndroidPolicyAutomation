.class public Lcom/huawei/health/suggestion/model/PlanStat;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private bestRecordFor10KM:I

.field private bestRecordFor1KM:I

.field private bestRecordFor5KM:I

.field private bestRecordForAll10KM:I

.field private bestRecordForAll5KM:I

.field private bestRecordForAllHalfMarathon:I

.field private bestRecordForAllMarathon:I

.field private bestRecordForFirst1KM:I

.field private bestRecordForHalfMarathon:I

.field private bestRecordForMarathon:I

.field private farthestRunning:F

.field private highestCompleteRate:F

.field private longestRunning:I

.field private longestTimePerWeek:I

.field private mostCaloriePerWeek:F

.field private mostWorkoutName:Ljava/lang/String;

.field private mostWorkoutTimes:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private getBestRecord(I)Ljava/lang/Object;
    .locals 1

    .line 284
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 286
    :pswitch_0
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordFor1KM()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 288
    :pswitch_1
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordFor5KM()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 290
    :pswitch_2
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordFor10KM()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 292
    :pswitch_3
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordForHalfMarathon()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 294
    :pswitch_4
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordForMarathon()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 296
    :pswitch_5
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getFarthestRunning()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->d(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    .line 298
    :pswitch_6
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getLongestRunning()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 300
    :pswitch_7
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordForFirst1KM()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 302
    :pswitch_8
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getLongestTimePerWeek()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 304
    :pswitch_9
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getMostCaloriePerWeek()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->d(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    .line 306
    :pswitch_a
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getHighestCompleteRate()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->d(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    .line 308
    :pswitch_b
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getMostWorkoutTimes()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 310
    :pswitch_c
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getMostWorkoutName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 312
    :goto_0
    const/4 v0, 0x0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_0
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
    .end packed-switch
.end method

.method private getBestRecordForAll(I)Ljava/lang/Object;
    .locals 1

    .line 317
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 319
    :pswitch_0
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordForAll5KM()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 321
    :pswitch_1
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordForAll10KM()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 323
    :pswitch_2
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordForAllHalfMarathon()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 325
    :pswitch_3
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordForAllMarathon()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 327
    :goto_0
    const/4 v0, 0x0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private setBestRecord(ILjava/lang/String;)V
    .locals 1

    .line 203
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 205
    :pswitch_0
    invoke-static {p2}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->setBestRecordFor1KM(I)V

    .line 206
    goto/16 :goto_0

    .line 208
    :pswitch_1
    invoke-static {p2}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->setBestRecordFor5KM(I)V

    .line 209
    goto/16 :goto_0

    .line 211
    :pswitch_2
    invoke-static {p2}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->setBestRecordFor10KM(I)V

    .line 212
    goto :goto_0

    .line 214
    :pswitch_3
    invoke-static {p2}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->setBestRecordForHalfMarathon(I)V

    .line 215
    goto :goto_0

    .line 217
    :pswitch_4
    invoke-static {p2}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->setBestRecordForMarathon(I)V

    .line 218
    goto :goto_0

    .line 220
    :pswitch_5
    invoke-static {p2}, Lo/caj;->d(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->setFarthestRunning(F)V

    .line 221
    goto :goto_0

    .line 223
    :pswitch_6
    invoke-static {p2}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->setLongestRunning(I)V

    .line 224
    goto :goto_0

    .line 226
    :pswitch_7
    invoke-static {p2}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->setBestRecordForFirst1KM(I)V

    .line 227
    goto :goto_0

    .line 229
    :pswitch_8
    invoke-static {p2}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->saveLongestTimePerWeek(I)V

    .line 230
    goto :goto_0

    .line 232
    :pswitch_9
    invoke-static {p2}, Lo/caj;->d(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->saveMostCaloriePerWeek(F)V

    .line 233
    goto :goto_0

    .line 235
    :pswitch_a
    invoke-static {p2}, Lo/caj;->d(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-static {v0}, Lo/bzr;->i(F)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->saveHighestCompleteRate(F)V

    .line 236
    goto :goto_0

    .line 238
    :pswitch_b
    invoke-static {p2}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->saveMostWorkoutTimes(I)V

    .line 239
    goto :goto_0

    .line 241
    :pswitch_c
    invoke-static {p2}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->setMostWorkoutName(Ljava/lang/String;)V

    .line 242
    .line 246
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_0
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
    .end packed-switch
.end method

.method private setBestRecordForAll(ILjava/lang/String;)V
    .locals 1

    .line 249
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 251
    :pswitch_0
    invoke-static {p2}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->setBestRecordForAll5KM(I)V

    .line 252
    goto :goto_0

    .line 254
    :pswitch_1
    invoke-static {p2}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->setBestRecordForAll10KM(I)V

    .line 255
    goto :goto_0

    .line 257
    :pswitch_2
    invoke-static {p2}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->setBestRecordForAllHalfMarathon(I)V

    .line 258
    goto :goto_0

    .line 260
    :pswitch_3
    invoke-static {p2}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->setBestRecordForAllMarathon(I)V

    .line 261
    .line 265
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method


# virtual methods
.method public getBestRecordFor10KM()I
    .locals 1

    .line 124
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanStat;->bestRecordFor10KM:I

    return v0
.end method

.method public getBestRecordFor1KM()I
    .locals 1

    .line 108
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanStat;->bestRecordFor1KM:I

    return v0
.end method

.method public getBestRecordFor5KM()I
    .locals 1

    .line 116
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanStat;->bestRecordFor5KM:I

    return v0
.end method

.method public getBestRecordForAll10KM()I
    .locals 1

    .line 164
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanStat;->bestRecordForAll10KM:I

    return v0
.end method

.method public getBestRecordForAll5KM()I
    .locals 1

    .line 156
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanStat;->bestRecordForAll5KM:I

    return v0
.end method

.method public getBestRecordForAllHalfMarathon()I
    .locals 1

    .line 172
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanStat;->bestRecordForAllHalfMarathon:I

    return v0
.end method

.method public getBestRecordForAllMarathon()I
    .locals 1

    .line 180
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanStat;->bestRecordForAllMarathon:I

    return v0
.end method

.method public getBestRecordForFirst1KM()I
    .locals 1

    .line 148
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanStat;->bestRecordForFirst1KM:I

    return v0
.end method

.method public getBestRecordForHalfMarathon()I
    .locals 1

    .line 132
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanStat;->bestRecordForHalfMarathon:I

    return v0
.end method

.method public getBestRecordForMarathon()I
    .locals 1

    .line 140
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanStat;->bestRecordForMarathon:I

    return v0
.end method

.method public getFarthestRunning()F
    .locals 1

    .line 92
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanStat;->farthestRunning:F

    return v0
.end method

.method public getHighestCompleteRate()F
    .locals 1

    .line 68
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanStat;->highestCompleteRate:F

    return v0
.end method

.method public getLongestRunning()I
    .locals 1

    .line 100
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanStat;->longestRunning:I

    return v0
.end method

.method public getLongestTimePerWeek()I
    .locals 1

    .line 52
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanStat;->longestTimePerWeek:I

    return v0
.end method

.method public getMostCaloriePerWeek()F
    .locals 1

    .line 60
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanStat;->mostCaloriePerWeek:F

    return v0
.end method

.method public getMostWorkoutName()Ljava/lang/String;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/PlanStat;->mostWorkoutName:Ljava/lang/String;

    return-object v0
.end method

.method public getMostWorkoutTimes()I
    .locals 1

    .line 76
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanStat;->mostWorkoutTimes:I

    return v0
.end method

.method public getValue(Ljava/lang/String;I)Ljava/lang/Object;
    .locals 1

    .line 276
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 277
    invoke-direct {p0, p2}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordForAll(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 279
    :cond_0
    invoke-direct {p0, p2}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecord(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public saveHighestCompleteRate(F)V
    .locals 0

    .line 72
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanStat;->highestCompleteRate:F

    .line 73
    return-void
.end method

.method public saveLongestTimePerWeek(I)V
    .locals 0

    .line 56
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanStat;->longestTimePerWeek:I

    .line 57
    return-void
.end method

.method public saveMostCaloriePerWeek(F)V
    .locals 0

    .line 64
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanStat;->mostCaloriePerWeek:F

    .line 65
    return-void
.end method

.method public saveMostWorkoutTimes(I)V
    .locals 0

    .line 80
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanStat;->mostWorkoutTimes:I

    .line 81
    return-void
.end method

.method public setBestRecordFor10KM(I)V
    .locals 0

    .line 128
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanStat;->bestRecordFor10KM:I

    .line 129
    return-void
.end method

.method public setBestRecordFor1KM(I)V
    .locals 0

    .line 112
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanStat;->bestRecordFor1KM:I

    .line 113
    return-void
.end method

.method public setBestRecordFor5KM(I)V
    .locals 0

    .line 120
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanStat;->bestRecordFor5KM:I

    .line 121
    return-void
.end method

.method public setBestRecordForAll10KM(I)V
    .locals 0

    .line 168
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanStat;->bestRecordForAll10KM:I

    .line 169
    return-void
.end method

.method public setBestRecordForAll5KM(I)V
    .locals 0

    .line 160
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanStat;->bestRecordForAll5KM:I

    .line 161
    return-void
.end method

.method public setBestRecordForAllHalfMarathon(I)V
    .locals 0

    .line 176
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanStat;->bestRecordForAllHalfMarathon:I

    .line 177
    return-void
.end method

.method public setBestRecordForAllMarathon(I)V
    .locals 0

    .line 184
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanStat;->bestRecordForAllMarathon:I

    .line 185
    return-void
.end method

.method public setBestRecordForFirst1KM(I)V
    .locals 0

    .line 152
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanStat;->bestRecordForFirst1KM:I

    .line 153
    return-void
.end method

.method public setBestRecordForHalfMarathon(I)V
    .locals 0

    .line 136
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanStat;->bestRecordForHalfMarathon:I

    .line 137
    return-void
.end method

.method public setBestRecordForMarathon(I)V
    .locals 0

    .line 144
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanStat;->bestRecordForMarathon:I

    .line 145
    return-void
.end method

.method public setFarthestRunning(F)V
    .locals 0

    .line 96
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanStat;->farthestRunning:F

    .line 97
    return-void
.end method

.method public setLongestRunning(I)V
    .locals 0

    .line 104
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanStat;->longestRunning:I

    .line 105
    return-void
.end method

.method public setMostWorkoutName(Ljava/lang/String;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/PlanStat;->mostWorkoutName:Ljava/lang/String;

    .line 89
    return-void
.end method

.method public setValue(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    .line 195
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 196
    invoke-direct {p0, p2, p3}, Lcom/huawei/health/suggestion/model/PlanStat;->setBestRecordForAll(ILjava/lang/String;)V

    goto :goto_0

    .line 198
    :cond_0
    invoke-direct {p0, p2, p3}, Lcom/huawei/health/suggestion/model/PlanStat;->setBestRecord(ILjava/lang/String;)V

    .line 200
    :goto_0
    return-void
.end method
