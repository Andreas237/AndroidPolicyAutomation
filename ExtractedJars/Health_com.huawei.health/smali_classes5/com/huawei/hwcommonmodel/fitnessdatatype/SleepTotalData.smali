.class public Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private breathQualityData:I

.field private deepSleepPart:I

.field private deepSleepRatenum:I

.field private deepSleepTime:I

.field private isCoreSleep:Z

.field private lightSleepRatenum:I

.field private mCoreSleepFallTime:J

.field private mCoreSleepWakeupTime:J

.field private mDailyBreathQuality:I

.field private mDailyDeepSleepTime:I

.field private mDailyFallScore:I

.field private mDailyFallTime:I

.field private mDailyNoonSleepTime:I

.field private mDailyScore:I

.field private mDailyShallowSleepTime:I

.field private mDailySleepPart:I

.field private mDailySlumberTime:I

.field private mDailyTotalSleepTime:I

.field private mDailyWakeUpScore:I

.field private mDailyWakeUpTime:I

.field private mDailyWakeupTimes:I

.field private mDeviceId:I

.field private mFallTime:I

.field private mNightTotalSleepTime:I

.field private mScore:I

.field private mSleepDayTime:J

.field private mValidData:D

.field private mWakeUpTime:I

.field private noonEndTime:Ljava/lang/String;

.field private noonSleepTime:I

.field private noonStartTime:Ljava/lang/String;

.field private recommendId:Ljava/lang/String;

.field private shallowSleepTime:I

.field private slumSleepRatenum:I

.field private slumberTime:I

.field private snoreFreq:I

.field private suggestContent:Ljava/lang/String;

.field private suggestTitle:Ljava/lang/String;

.field private totalSleepDuration:I

.field private type:I

.field private wakeupDuration:I

.field private wakeupTimes:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mNightTotalSleepTime:I

    .line 62
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyTotalSleepTime:I

    .line 63
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyDeepSleepTime:I

    .line 64
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyShallowSleepTime:I

    .line 65
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailySleepPart:I

    .line 66
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyWakeupTimes:I

    .line 67
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailySlumberTime:I

    .line 68
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyScore:I

    .line 69
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyFallTime:I

    .line 70
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyWakeUpTime:I

    .line 71
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyFallScore:I

    .line 72
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyWakeUpScore:I

    .line 73
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyBreathQuality:I

    .line 74
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyNoonSleepTime:I

    .line 75
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->deepSleepRatenum:I

    .line 76
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->lightSleepRatenum:I

    .line 77
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->slumSleepRatenum:I

    .line 78
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->suggestTitle:Ljava/lang/String;

    .line 79
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->suggestContent:Ljava/lang/String;

    .line 80
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->noonStartTime:Ljava/lang/String;

    .line 81
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->noonEndTime:Ljava/lang/String;

    .line 82
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->isCoreSleep:Z

    .line 83
    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->recommendId:Ljava/lang/String;

    .line 85
    const/16 v0, 0xff

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->type:I

    .line 87
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->deepSleepTime:I

    .line 89
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->shallowSleepTime:I

    .line 90
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->noonSleepTime:I

    .line 92
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->slumberTime:I

    .line 94
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->wakeupTimes:I

    .line 95
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->wakeupDuration:I

    .line 96
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->deepSleepPart:I

    .line 97
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->snoreFreq:I

    .line 98
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->breathQualityData:I

    .line 99
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->totalSleepDuration:I

    .line 100
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mScore:I

    .line 101
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mFallTime:I

    .line 102
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDeviceId:I

    .line 103
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mWakeUpTime:I

    .line 104
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mNightTotalSleepTime:I

    .line 105
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mValidData:D

    .line 106
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mSleepDayTime:J

    .line 107
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mCoreSleepFallTime:J

    .line 108
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mCoreSleepWakeupTime:J

    .line 109
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyTotalSleepTime:I

    .line 110
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyDeepSleepTime:I

    .line 111
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyShallowSleepTime:I

    .line 112
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailySleepPart:I

    .line 113
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyWakeupTimes:I

    .line 114
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailySlumberTime:I

    .line 115
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyScore:I

    .line 116
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyFallTime:I

    .line 117
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyWakeUpTime:I

    .line 118
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyFallScore:I

    .line 119
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyWakeUpScore:I

    .line 120
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyBreathQuality:I

    .line 121
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyNoonSleepTime:I

    .line 122
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->deepSleepRatenum:I

    .line 123
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->lightSleepRatenum:I

    .line 124
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->slumSleepRatenum:I

    .line 125
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->suggestTitle:Ljava/lang/String;

    .line 126
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->suggestContent:Ljava/lang/String;

    .line 127
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->recommendId:Ljava/lang/String;

    .line 128
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->noonStartTime:Ljava/lang/String;

    .line 129
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->noonEndTime:Ljava/lang/String;

    .line 130
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 472
    const/16 v0, 0xff

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->type:I

    .line 473
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mScore:I

    .line 474
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->totalSleepDuration:I

    .line 475
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->breathQualityData:I

    .line 476
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->snoreFreq:I

    .line 477
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->deepSleepPart:I

    .line 478
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->wakeupDuration:I

    .line 479
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->wakeupTimes:I

    .line 480
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->slumberTime:I

    .line 481
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->noonSleepTime:I

    .line 482
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->shallowSleepTime:I

    .line 483
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->deepSleepTime:I

    .line 484
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDeviceId:I

    .line 485
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyTotalSleepTime:I

    .line 486
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyDeepSleepTime:I

    .line 487
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyShallowSleepTime:I

    .line 488
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailySleepPart:I

    .line 489
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyWakeupTimes:I

    .line 490
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailySlumberTime:I

    .line 491
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyScore:I

    .line 492
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyFallTime:I

    .line 493
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyWakeUpTime:I

    .line 494
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyFallScore:I

    .line 495
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyWakeUpScore:I

    .line 496
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyBreathQuality:I

    .line 497
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyNoonSleepTime:I

    .line 499
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->deepSleepRatenum:I

    .line 500
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->lightSleepRatenum:I

    .line 501
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->slumSleepRatenum:I

    .line 502
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->suggestTitle:Ljava/lang/String;

    .line 503
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->suggestContent:Ljava/lang/String;

    .line 504
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->recommendId:Ljava/lang/String;

    .line 505
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->noonStartTime:Ljava/lang/String;

    .line 506
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->noonEndTime:Ljava/lang/String;

    .line 507
    return-void
.end method

.method public getBreathQualityData()I
    .locals 1

    .line 261
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->breathQualityData:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getCoreSleepFallTime()J
    .locals 2

    .line 285
    iget-wide v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mCoreSleepFallTime:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public getCoreSleepWakeupTime()J
    .locals 2

    .line 291
    iget-wide v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mCoreSleepWakeupTime:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public getDailyBreathQuality()I
    .locals 1

    .line 393
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyBreathQuality:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDailyDeepSleepTime()I
    .locals 1

    .line 304
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyDeepSleepTime:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDailyFallScore()I
    .locals 1

    .line 376
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyFallScore:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDailyFallTime()I
    .locals 1

    .line 360
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyFallTime:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDailyNoonSleepTime()I
    .locals 1

    .line 401
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyNoonSleepTime:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDailyScore()I
    .locals 1

    .line 344
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyScore:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDailyShallowSleepTime()I
    .locals 1

    .line 312
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyShallowSleepTime:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDailySleepPart()I
    .locals 1

    .line 320
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailySleepPart:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDailySlumberTime()I
    .locals 1

    .line 336
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailySlumberTime:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDailyTotalSleepTime()I
    .locals 1

    .line 296
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyTotalSleepTime:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDailyWakeUpScore()I
    .locals 1

    .line 385
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyWakeUpScore:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDailyWakeUpTime()I
    .locals 1

    .line 368
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyWakeUpTime:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDailyWakeupTimes()I
    .locals 1

    .line 328
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyWakeupTimes:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDeepSleepPart()I
    .locals 1

    .line 244
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->deepSleepPart:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDeepSleepRatenum()I
    .locals 1

    .line 412
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->deepSleepRatenum:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDeepSleepTime()I
    .locals 1

    .line 184
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->deepSleepTime:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getFallTime()I
    .locals 1

    .line 153
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mFallTime:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getLightSleepRatenum()I
    .locals 1

    .line 420
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->lightSleepRatenum:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getNoonEndTime()Ljava/lang/String;
    .locals 1

    .line 466
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->noonEndTime:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getNoonSleepTime()I
    .locals 1

    .line 204
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->noonSleepTime:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getNoonStartTime()Ljava/lang/String;
    .locals 1

    .line 460
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->noonStartTime:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getRecommendId()Ljava/lang/String;
    .locals 1

    .line 452
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->recommendId:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getScore()I
    .locals 1

    .line 141
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mScore:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getShallowSleepTime()I
    .locals 1

    .line 196
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->shallowSleepTime:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getSleepDayTime()J
    .locals 2

    .line 277
    iget-wide v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mSleepDayTime:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mSleepDayTime:J

    return-wide v0
.end method

.method public getSlumSleepRatenum()I
    .locals 1

    .line 428
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->slumSleepRatenum:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getSlumberSleepTime()I
    .locals 1

    .line 212
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->slumberTime:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getSnoreFreq()I
    .locals 1

    .line 253
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->snoreFreq:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getSuggestContent()Ljava/lang/String;
    .locals 1

    .line 444
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->suggestContent:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getSuggestTitle()Ljava/lang/String;
    .locals 1

    .line 436
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->suggestTitle:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getTotalSleepDuration()I
    .locals 1

    .line 269
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->totalSleepDuration:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getTotalSleepTime()I
    .locals 1

    .line 173
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mNightTotalSleepTime:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getType()I
    .locals 1

    .line 169
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->type:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getValidData()D
    .locals 2

    .line 145
    iget-wide v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mValidData:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public getWakeUpTime()I
    .locals 1

    .line 161
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mWakeUpTime:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getWakeupDuration()I
    .locals 1

    .line 236
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->wakeupDuration:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getWakeupTimes()I
    .locals 1

    .line 224
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->wakeupTimes:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getmDeviceId()I
    .locals 1

    .line 348
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDeviceId:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public incDeepSleepTime(I)V
    .locals 2

    .line 188
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->deepSleepTime:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->deepSleepTime:I

    .line 189
    return-void
.end method

.method public incShallowSleepTime(I)V
    .locals 2

    .line 216
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->shallowSleepTime:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->shallowSleepTime:I

    .line 217
    return-void
.end method

.method public incWakeupDuration(I)V
    .locals 2

    .line 273
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->wakeupDuration:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->wakeupDuration:I

    .line 274
    return-void
.end method

.method public incWakeupTimes(I)V
    .locals 2

    .line 228
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->wakeupTimes:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->wakeupTimes:I

    .line 229
    return-void
.end method

.method public initSleepTotalData1()V
    .locals 0

    .line 553
    return-void
.end method

.method public initSleepTotalData10()V
    .locals 0

    .line 562
    return-void
.end method

.method public initSleepTotalData11()V
    .locals 0

    .line 563
    return-void
.end method

.method public initSleepTotalData12()V
    .locals 0

    .line 564
    return-void
.end method

.method public initSleepTotalData13()V
    .locals 0

    .line 565
    return-void
.end method

.method public initSleepTotalData14()V
    .locals 0

    .line 566
    return-void
.end method

.method public initSleepTotalData15()V
    .locals 0

    .line 567
    return-void
.end method

.method public initSleepTotalData16()V
    .locals 0

    .line 568
    return-void
.end method

.method public initSleepTotalData17()V
    .locals 0

    .line 569
    return-void
.end method

.method public initSleepTotalData18()V
    .locals 0

    .line 570
    return-void
.end method

.method public initSleepTotalData19()V
    .locals 0

    .line 571
    return-void
.end method

.method public initSleepTotalData2()V
    .locals 0

    .line 554
    return-void
.end method

.method public initSleepTotalData3()V
    .locals 0

    .line 555
    return-void
.end method

.method public initSleepTotalData4()V
    .locals 0

    .line 556
    return-void
.end method

.method public initSleepTotalData5()V
    .locals 0

    .line 557
    return-void
.end method

.method public initSleepTotalData6()V
    .locals 0

    .line 558
    return-void
.end method

.method public initSleepTotalData7()V
    .locals 0

    .line 559
    return-void
.end method

.method public initSleepTotalData8()V
    .locals 0

    .line 560
    return-void
.end method

.method public initSleepTotalData9()V
    .locals 0

    .line 561
    return-void
.end method

.method public setBreathQualityData(I)V
    .locals 1

    .line 257
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->breathQualityData:I

    .line 258
    return-void
.end method

.method public setCoreSleepFallTime(J)V
    .locals 2

    .line 408
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mCoreSleepFallTime:J

    .line 409
    return-void
.end method

.method public setCoreSleepWakeupTime(J)V
    .locals 2

    .line 288
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mCoreSleepWakeupTime:J

    .line 289
    return-void
.end method

.method public setDailyBreathQuality(I)V
    .locals 1

    .line 397
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyBreathQuality:I

    .line 398
    return-void
.end method

.method public setDailyDeepSleepTime(I)V
    .locals 1

    .line 308
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyDeepSleepTime:I

    .line 309
    return-void
.end method

.method public setDailyFallScore(I)V
    .locals 1

    .line 380
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyFallScore:I

    .line 382
    return-void
.end method

.method public setDailyFallTime(I)V
    .locals 1

    .line 364
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyFallTime:I

    .line 365
    return-void
.end method

.method public setDailyNoonSleepTime(I)V
    .locals 1

    .line 405
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyNoonSleepTime:I

    .line 406
    return-void
.end method

.method public setDailyScore(I)V
    .locals 1

    .line 356
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyScore:I

    .line 357
    return-void
.end method

.method public setDailyShallowSleepTime(I)V
    .locals 1

    .line 316
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyShallowSleepTime:I

    .line 317
    return-void
.end method

.method public setDailySleepPart(I)V
    .locals 1

    .line 324
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailySleepPart:I

    .line 325
    return-void
.end method

.method public setDailySlumberTime(I)V
    .locals 1

    .line 340
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailySlumberTime:I

    .line 341
    return-void
.end method

.method public setDailyTotalSleepTime(I)V
    .locals 1

    .line 300
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyTotalSleepTime:I

    .line 301
    return-void
.end method

.method public setDailyWakeUpScore(I)V
    .locals 1

    .line 389
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyWakeUpScore:I

    .line 390
    return-void
.end method

.method public setDailyWakeUpTime(I)V
    .locals 1

    .line 372
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyWakeUpTime:I

    .line 373
    return-void
.end method

.method public setDailyWakeupTimes(I)V
    .locals 1

    .line 332
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyWakeupTimes:I

    .line 333
    return-void
.end method

.method public setDeepSleepPart(I)V
    .locals 1

    .line 240
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->deepSleepPart:I

    .line 241
    return-void
.end method

.method public setDeepSleepRatenum(I)V
    .locals 1

    .line 416
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->deepSleepRatenum:I

    .line 417
    return-void
.end method

.method public setDeepSleepTime(I)V
    .locals 1

    .line 180
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->deepSleepTime:I

    .line 181
    return-void
.end method

.method public setFallTime(I)V
    .locals 1

    .line 149
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mFallTime:I

    .line 150
    return-void
.end method

.method public setLightSleepRatenum(I)V
    .locals 1

    .line 424
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->lightSleepRatenum:I

    .line 425
    return-void
.end method

.method public setNoonEndTime(Ljava/lang/String;)V
    .locals 1

    .line 469
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->noonEndTime:Ljava/lang/String;

    .line 470
    return-void
.end method

.method public setNoonSleepTime(I)V
    .locals 1

    .line 200
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->noonSleepTime:I

    .line 201
    return-void
.end method

.method public setNoonStartTime(Ljava/lang/String;)V
    .locals 1

    .line 463
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->noonStartTime:Ljava/lang/String;

    .line 464
    return-void
.end method

.method public setRecommendId(Ljava/lang/String;)V
    .locals 1

    .line 456
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->recommendId:Ljava/lang/String;

    .line 457
    return-void
.end method

.method public setScore(I)V
    .locals 1

    .line 133
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mScore:I

    .line 134
    return-void
.end method

.method public setShallowSleepTime(I)V
    .locals 1

    .line 192
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->shallowSleepTime:I

    .line 193
    return-void
.end method

.method public setSleepDayTime(J)V
    .locals 2

    .line 281
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mSleepDayTime:J

    .line 282
    return-void
.end method

.method public setSlumSleepRatenum(I)V
    .locals 1

    .line 432
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->slumSleepRatenum:I

    .line 433
    return-void
.end method

.method public setSlumberSleepTime(I)V
    .locals 1

    .line 208
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->slumberTime:I

    .line 209
    return-void
.end method

.method public setSnoreFreq(I)V
    .locals 1

    .line 249
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->snoreFreq:I

    .line 250
    return-void
.end method

.method public setSuggestContent(Ljava/lang/String;)V
    .locals 1

    .line 448
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->suggestContent:Ljava/lang/String;

    .line 449
    return-void
.end method

.method public setSuggestTitle(Ljava/lang/String;)V
    .locals 1

    .line 440
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->suggestTitle:Ljava/lang/String;

    .line 441
    return-void
.end method

.method public setTotalSleepDuration(I)V
    .locals 1

    .line 265
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->totalSleepDuration:I

    .line 266
    return-void
.end method

.method public setTotalSleepTime(I)V
    .locals 1

    .line 176
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mNightTotalSleepTime:I

    .line 177
    return-void
.end method

.method public setType(I)V
    .locals 1

    .line 165
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->type:I

    .line 166
    return-void
.end method

.method public setValidData(D)V
    .locals 2

    .line 137
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mValidData:D

    .line 138
    return-void
.end method

.method public setWakeUpTime(I)V
    .locals 1

    .line 157
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mWakeUpTime:I

    .line 158
    return-void
.end method

.method public setWakeupDuration(I)V
    .locals 1

    .line 232
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->wakeupDuration:I

    .line 233
    return-void
.end method

.method public setWakeupTimes(I)V
    .locals 1

    .line 220
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->wakeupTimes:I

    .line 221
    return-void
.end method

.method public setmDeviceId(I)V
    .locals 1

    .line 352
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDeviceId:I

    .line 353
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 510
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SleepTotalData{type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deepSleepTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->deepSleepTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", noonSleepTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->noonSleepTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shallowSleepTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->shallowSleepTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", slumberTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->slumberTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", wakeupTimes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->wakeupTimes:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", wakeupDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->wakeupDuration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deepSleepPart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->deepSleepPart:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", snoreFreq="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->snoreFreq:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", breathQualityData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->breathQualityData:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", totalSleepDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->totalSleepDuration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mScore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mScore:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mFallTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mFallTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mWakeUpTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mWakeUpTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mValidData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mValidData:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mSleepDayTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mSleepDayTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mCoreSleepFallTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mCoreSleepFallTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mCoreSleepWakeupTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mCoreSleepWakeupTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mDailyTotalSleepTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyTotalSleepTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mDailyDeepSleepTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyDeepSleepTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mDailyShallowSleepTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyShallowSleepTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mDailySleepPart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailySleepPart:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mDailyWakeupTimes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyWakeupTimes:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mDailySlumberTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailySlumberTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mDailyScore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyScore:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mDailyFallTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyFallTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mDailyWakeUpTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyWakeUpTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mDailyFallScore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyFallScore:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mDailyWakeUpScore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyWakeUpScore:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mDailyBreathQuality="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyBreathQuality:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mDailyNoonSleepTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->mDailyNoonSleepTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deepSleepRatenum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->deepSleepRatenum:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lightSleepRatenum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->lightSleepRatenum:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", slumSleepRatenum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->slumSleepRatenum:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", noonStartTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->noonStartTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", noonEndTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->noonEndTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", suggestTitle=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->suggestTitle:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", suggestContent=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->suggestContent:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
