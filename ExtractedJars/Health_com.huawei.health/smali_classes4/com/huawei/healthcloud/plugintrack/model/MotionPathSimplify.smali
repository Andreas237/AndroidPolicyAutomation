.class public Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x4007a1d7dcdc9288L


# instance fields
.field private abnormalTrack:I

.field private avgHeartRate:I

.field private avgPace:F

.field private avgStepRate:I

.field private bestPace:F

.field private bestStepRate:I

.field private britishPaceMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private britishPartTimeMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Double;Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private chiefSportDataType:I

.field private creepingWave:F

.field private deviceType:I

.field private endTime:J

.field private hasTrackPoint:Z

.field private isFreeMotion:Z

.field private jsonString:Ljava/lang/String;

.field private mAvgEversionExcursion:I

.field private mAvgForeFootStrikePattern:I

.field private mAvgGroundContactTime:I

.field private mAvgGroundImpactAcceleration:I

.field private mAvgHindFootStrikePattern:I

.field private mAvgSwingAngle:I

.field private mAvgWholeFootStrikePattern:I

.field private mBritishSwimSegments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealth/data/model/TrackSwimSegment;>;"
        }
    .end annotation
.end field

.field private mBritishSwolfBase:F

.field private mDuplicated:I

.field private mHeartrateZoneType:I

.field private mMaxAlti:F

.field private mMinAlti:F

.field private mRuncourseId:Ljava/lang/String;

.field private mRuncourseType:I

.field private mSwimSegments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealth/data/model/TrackSwimSegment;>;"
        }
    .end annotation
.end field

.field private mSwolfBase:F

.field private mTotalDescent:F

.field private mapType:I

.field private maxHeartRate:I

.field private minHeartRate:I

.field private paceMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private partTimeMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Double;Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private sportDataSource:I

.field private sportId:Ljava/lang/String;

.field private sportType:I

.field private startTime:J

.field private totalCalories:I

.field private totalDistance:I

.field private totalSteps:I

.field private totalTime:J

.field private trackType:I

.field private wearSportData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->avgPace:F

    .line 58
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->bestPace:F

    .line 63
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->avgHeartRate:I

    .line 68
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->maxHeartRate:I

    .line 73
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->minHeartRate:I

    .line 78
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->avgStepRate:I

    .line 83
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->bestStepRate:I

    .line 88
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->totalDistance:I

    .line 93
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->totalCalories:I

    .line 98
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->totalSteps:I

    .line 103
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->totalTime:J

    .line 152
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->creepingWave:F

    .line 169
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mapType:I

    .line 174
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->isFreeMotion:Z

    .line 179
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->sportDataSource:I

    .line 184
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->chiefSportDataType:I

    .line 189
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->hasTrackPoint:Z

    .line 206
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->abnormalTrack:I

    .line 211
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mSwolfBase:F

    .line 212
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mBritishSwolfBase:F

    .line 225
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mMaxAlti:F

    .line 226
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mMinAlti:F

    .line 273
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mDuplicated:I

    .line 279
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mHeartrateZoneType:I

    .line 289
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mRuncourseType:I

    return-void
.end method


# virtual methods
.method public localePaceMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;"
        }
    .end annotation

    .line 622
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 623
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->britishPaceMap:Ljava/util/Map;

    return-object v0

    .line 625
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->paceMap:Ljava/util/Map;

    return-object v0
.end method

.method public requestAbnormalTrack()I
    .locals 1

    .line 349
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->abnormalTrack:I

    return v0
.end method

.method public requestAvgEversionExcursion()I
    .locals 1

    .line 310
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mAvgEversionExcursion:I

    return v0
.end method

.method public requestAvgForeFootStrikePattern()I
    .locals 1

    .line 326
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mAvgForeFootStrikePattern:I

    return v0
.end method

.method public requestAvgGroundContactTime()I
    .locals 1

    .line 294
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mAvgGroundContactTime:I

    return v0
.end method

.method public requestAvgGroundImpactAcceleration()I
    .locals 1

    .line 302
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mAvgGroundImpactAcceleration:I

    return v0
.end method

.method public requestAvgHeartRate()I
    .locals 1

    .line 449
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->avgHeartRate:I

    return v0
.end method

.method public requestAvgHindFootStrikePattern()I
    .locals 1

    .line 342
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mAvgHindFootStrikePattern:I

    return v0
.end method

.method public requestAvgPace()F
    .locals 1

    .line 435
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->avgPace:F

    return v0
.end method

.method public requestAvgStepRate()I
    .locals 1

    .line 463
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->avgStepRate:I

    return v0
.end method

.method public requestAvgSwingAngle()I
    .locals 1

    .line 318
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mAvgSwingAngle:I

    return v0
.end method

.method public requestAvgWholeFootStrikePattern()I
    .locals 1

    .line 334
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mAvgWholeFootStrikePattern:I

    return v0
.end method

.method public requestBestPace()F
    .locals 1

    .line 590
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->bestPace:F

    return v0
.end method

.method public requestBestStepRate()I
    .locals 1

    .line 566
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->bestStepRate:I

    return v0
.end method

.method public requestBritishPaceMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;"
        }
    .end annotation

    .line 617
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->britishPaceMap:Ljava/util/Map;

    return-object v0
.end method

.method public requestBritishPartTimeMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Double;Ljava/lang/Double;>;"
        }
    .end annotation

    .line 522
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->britishPartTimeMap:Ljava/util/Map;

    return-object v0
.end method

.method public requestBritishSwimSegments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealth/data/model/TrackSwimSegment;>;"
        }
    .end annotation

    .line 850
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mBritishSwimSegments:Ljava/util/List;

    return-object v0
.end method

.method public requestBritishSwolfBase()F
    .locals 1

    .line 834
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mBritishSwolfBase:F

    return v0
.end method

.method public requestChiefSportDataType()I
    .locals 1

    .line 774
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->chiefSportDataType:I

    return v0
.end method

.method public requestCreepingWave()F
    .locals 1

    .line 659
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->creepingWave:F

    return v0
.end method

.method public requestDeviceType()I
    .locals 1

    .line 818
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->deviceType:I

    return v0
.end method

.method public requestEndTime()J
    .locals 2

    .line 370
    iget-wide v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->endTime:J

    return-wide v0
.end method

.method public requestHasTrackPoint()Z
    .locals 1

    .line 790
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->hasTrackPoint:Z

    return v0
.end method

.method public requestIsFreeMotion()Z
    .locals 1

    .line 710
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->isFreeMotion:Z

    return v0
.end method

.method public requestJsonString()Ljava/lang/String;
    .locals 1

    .line 806
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->jsonString:Ljava/lang/String;

    return-object v0
.end method

.method public requestMapType()I
    .locals 1

    .line 694
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mapType:I

    return v0
.end method

.method public requestMaxAlti()F
    .locals 1

    .line 858
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mMaxAlti:F

    return v0
.end method

.method public requestMaxHeartRate()I
    .locals 1

    .line 550
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->maxHeartRate:I

    return v0
.end method

.method public requestMinAlti()F
    .locals 1

    .line 866
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mMinAlti:F

    return v0
.end method

.method public requestMinHeartRate()I
    .locals 1

    .line 675
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->minHeartRate:I

    return v0
.end method

.method public requestPaceMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;"
        }
    .end annotation

    .line 599
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->paceMap:Ljava/util/Map;

    return-object v0
.end method

.method public requestPartTimeMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Double;Ljava/lang/Double;>;"
        }
    .end annotation

    .line 518
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->partTimeMap:Ljava/util/Map;

    return-object v0
.end method

.method public requestRuncourseId()Ljava/lang/String;
    .locals 1

    .line 742
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mRuncourseId:Ljava/lang/String;

    return-object v0
.end method

.method public requestRuncourseType()I
    .locals 1

    .line 758
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mRuncourseType:I

    return v0
.end method

.method public requestSportData()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 643
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->wearSportData:Ljava/util/Map;

    return-object v0
.end method

.method public requestSportDataSource()I
    .locals 1

    .line 726
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->sportDataSource:I

    return v0
.end method

.method public requestSportId()Ljava/lang/String;
    .locals 1

    .line 486
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->sportId:Ljava/lang/String;

    return-object v0
.end method

.method public requestSportType()I
    .locals 1

    .line 502
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->sportType:I

    return v0
.end method

.method public requestStartTime()J
    .locals 2

    .line 360
    iget-wide v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->startTime:J

    return-wide v0
.end method

.method public requestSwimSegments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealth/data/model/TrackSwimSegment;>;"
        }
    .end annotation

    .line 842
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mSwimSegments:Ljava/util/List;

    return-object v0
.end method

.method public requestSwolfBase()F
    .locals 1

    .line 826
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mSwolfBase:F

    return v0
.end method

.method public requestTotalCalories()I
    .locals 1

    .line 410
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->totalCalories:I

    return v0
.end method

.method public requestTotalDescent()F
    .locals 1

    .line 874
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mTotalDescent:F

    return v0
.end method

.method public requestTotalDistance()I
    .locals 1

    .line 390
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->totalDistance:I

    return v0
.end method

.method public requestTotalSteps()I
    .locals 1

    .line 422
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->totalSteps:I

    return v0
.end method

.method public requestTotalTime()J
    .locals 2

    .line 404
    iget-wide v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->totalTime:J

    return-wide v0
.end method

.method public requestTrackType()I
    .locals 1

    .line 534
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->trackType:I

    return v0
.end method

.method public requestmDuplicated()I
    .locals 1

    .line 882
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mDuplicated:I

    return v0
.end method

.method public requestmHeartrateZoneType()I
    .locals 1

    .line 890
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mHeartrateZoneType:I

    return v0
.end method

.method public saveAbnormalTrack(I)V
    .locals 0

    .line 353
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->abnormalTrack:I

    .line 354
    return-void
.end method

.method public saveAvgEversionExcursion(I)V
    .locals 0

    .line 314
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mAvgEversionExcursion:I

    .line 315
    return-void
.end method

.method public saveAvgForeFootStrikePattern(I)V
    .locals 0

    .line 330
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mAvgForeFootStrikePattern:I

    .line 331
    return-void
.end method

.method public saveAvgGroundContactTime(I)V
    .locals 0

    .line 298
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mAvgGroundContactTime:I

    .line 299
    return-void
.end method

.method public saveAvgGroundImpactAcceleration(I)V
    .locals 0

    .line 306
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mAvgGroundImpactAcceleration:I

    .line 307
    return-void
.end method

.method public saveAvgHeartRate(I)V
    .locals 0

    .line 456
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->avgHeartRate:I

    .line 457
    return-void
.end method

.method public saveAvgHindFootStrikePattern(I)V
    .locals 0

    .line 346
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mAvgHindFootStrikePattern:I

    .line 347
    return-void
.end method

.method public saveAvgPace(F)V
    .locals 0

    .line 442
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->avgPace:F

    .line 443
    return-void
.end method

.method public saveAvgStepRate(I)V
    .locals 0

    .line 470
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->avgStepRate:I

    .line 471
    return-void
.end method

.method public saveAvgSwingAngle(I)V
    .locals 0

    .line 322
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mAvgSwingAngle:I

    .line 323
    return-void
.end method

.method public saveAvgWholeFootStrikePattern(I)V
    .locals 0

    .line 338
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mAvgWholeFootStrikePattern:I

    .line 339
    return-void
.end method

.method public saveBestPace(F)V
    .locals 0

    .line 582
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->bestPace:F

    .line 583
    return-void
.end method

.method public saveBestStepRate(I)V
    .locals 0

    .line 574
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->bestStepRate:I

    .line 575
    return-void
.end method

.method public saveBritishPaceMap(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;)V"
        }
    .end annotation

    .line 635
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->britishPaceMap:Ljava/util/Map;

    .line 636
    return-void
.end method

.method public saveBritishPartTimeMap(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Double;Ljava/lang/Double;>;)V"
        }
    .end annotation

    .line 526
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->britishPartTimeMap:Ljava/util/Map;

    .line 527
    return-void
.end method

.method public saveBritishSwimSegments(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/data/model/TrackSwimSegment;>;)V"
        }
    .end annotation

    .line 854
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mBritishSwimSegments:Ljava/util/List;

    .line 855
    return-void
.end method

.method public saveBritishSwolfBase(F)V
    .locals 0

    .line 838
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mBritishSwolfBase:F

    .line 839
    return-void
.end method

.method public saveChiefSportDataType(I)V
    .locals 0

    .line 782
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->chiefSportDataType:I

    .line 783
    return-void
.end method

.method public saveCreepingWave(F)V
    .locals 0

    .line 667
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->creepingWave:F

    .line 668
    return-void
.end method

.method public saveDeviceType(I)V
    .locals 0

    .line 822
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->deviceType:I

    .line 823
    return-void
.end method

.method public saveEndTime(J)V
    .locals 0

    .line 375
    iput-wide p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->endTime:J

    .line 376
    return-void
.end method

.method public saveHasTrackPoint(Z)V
    .locals 0

    .line 798
    iput-boolean p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->hasTrackPoint:Z

    .line 799
    return-void
.end method

.method public saveIsFreeMotion(Z)V
    .locals 0

    .line 718
    iput-boolean p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->isFreeMotion:Z

    .line 719
    return-void
.end method

.method public saveJsonString(Ljava/lang/String;)V
    .locals 0

    .line 814
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->jsonString:Ljava/lang/String;

    .line 815
    return-void
.end method

.method public saveMapType(I)V
    .locals 0

    .line 702
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mapType:I

    .line 703
    return-void
.end method

.method public saveMaxAlti(F)V
    .locals 0

    .line 862
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mMaxAlti:F

    .line 863
    return-void
.end method

.method public saveMaxHeartRate(I)V
    .locals 0

    .line 558
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->maxHeartRate:I

    .line 559
    return-void
.end method

.method public saveMinAlti(F)V
    .locals 0

    .line 870
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mMinAlti:F

    .line 871
    return-void
.end method

.method public saveMinHeartRate(I)V
    .locals 0

    .line 683
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->minHeartRate:I

    .line 684
    return-void
.end method

.method public savePaceMap(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;)V"
        }
    .end annotation

    .line 608
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->paceMap:Ljava/util/Map;

    .line 609
    return-void
.end method

.method public savePartTimeMap(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Double;Ljava/lang/Double;>;)V"
        }
    .end annotation

    .line 510
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->partTimeMap:Ljava/util/Map;

    .line 511
    return-void
.end method

.method public saveRuncourseId(Ljava/lang/String;)V
    .locals 0

    .line 750
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mRuncourseId:Ljava/lang/String;

    .line 751
    return-void
.end method

.method public saveRuncourseType(I)V
    .locals 0

    .line 766
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mRuncourseType:I

    .line 767
    return-void
.end method

.method public saveSportData(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 651
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->wearSportData:Ljava/util/Map;

    .line 652
    return-void
.end method

.method public saveSportDataSource(I)V
    .locals 0

    .line 734
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->sportDataSource:I

    .line 735
    return-void
.end method

.method public saveSportId(Ljava/lang/String;)V
    .locals 0

    .line 478
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->sportId:Ljava/lang/String;

    .line 479
    return-void
.end method

.method public saveSportType(I)V
    .locals 0

    .line 494
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->sportType:I

    .line 495
    return-void
.end method

.method public saveStartTime(J)V
    .locals 0

    .line 365
    iput-wide p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->startTime:J

    .line 366
    return-void
.end method

.method public saveSwimSegments(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/data/model/TrackSwimSegment;>;)V"
        }
    .end annotation

    .line 846
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mSwimSegments:Ljava/util/List;

    .line 847
    return-void
.end method

.method public saveSwolfBase(F)V
    .locals 0

    .line 830
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mSwolfBase:F

    .line 831
    return-void
.end method

.method public saveTotalCalories(I)V
    .locals 0

    .line 416
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->totalCalories:I

    .line 417
    return-void
.end method

.method public saveTotalDescent(F)V
    .locals 0

    .line 878
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mTotalDescent:F

    .line 879
    return-void
.end method

.method public saveTotalDistance(I)V
    .locals 0

    .line 383
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->totalDistance:I

    .line 384
    return-void
.end method

.method public saveTotalSteps(I)V
    .locals 0

    .line 428
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->totalSteps:I

    .line 429
    return-void
.end method

.method public saveTotalTime(J)V
    .locals 0

    .line 397
    iput-wide p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->totalTime:J

    .line 398
    return-void
.end method

.method public saveTrackType(I)V
    .locals 0

    .line 542
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->trackType:I

    .line 543
    return-void
.end method

.method public savemDuplicated(I)V
    .locals 0

    .line 886
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mDuplicated:I

    .line 887
    return-void
.end method

.method public savemHeartrateZoneType(I)V
    .locals 0

    .line 894
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mHeartrateZoneType:I

    .line 895
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 903
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 905
    const-string v0, "sportType "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->sportType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " trackType "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->trackType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 908
    const-string v0, "sportTime "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->startTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->endTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 912
    const-string v0, "duration "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->totalTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " distance "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->totalDistance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " calories "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->totalCalories:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " creepingWave "

    .line 913
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->creepingWave:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(F)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 916
    const-string v0, "avgPace "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->avgPace:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(F)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " bestPace "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->bestPace:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(F)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 922
    invoke-static {}, Lo/dho;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 923
    const-string v0, "avgHeartRate "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "***"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " max "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "***"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " min "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "***"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 925
    :cond_0
    const-string v0, "avgHeartRate "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->avgHeartRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " max "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->maxHeartRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " min "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->minHeartRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 928
    :goto_0
    const-string v0, "totalSteps "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->totalSteps:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " avgStepRate "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->avgStepRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " bestStepRate "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->bestStepRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 931
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->partTimeMap:Ljava/util/Map;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->partTimeMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 933
    const-string v0, "partTimeMap "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->partTimeMap:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 936
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->britishPartTimeMap:Ljava/util/Map;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->britishPartTimeMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 938
    const-string v0, "britishPartTimeMap "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->britishPartTimeMap:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 941
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->paceMap:Ljava/util/Map;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->paceMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 942
    const-string v0, "paceMap "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->paceMap:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 944
    :cond_3
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->britishPaceMap:Ljava/util/Map;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->britishPaceMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 945
    const-string v0, "britishPaceMap "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->britishPaceMap:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 949
    :cond_4
    const-string v0, "isFreeMotion "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->isFreeMotion:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 951
    const-string v0, "sportDataSource "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->sportDataSource:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 953
    const-string v0, "chiefSportDataType "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->chiefSportDataType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 955
    const-string v0, "hasTrackPoint "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->hasTrackPoint:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 957
    const-string v0, "mapType "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mapType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 959
    const-string v0, "deviceType "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->deviceType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 961
    const-string v0, "abnormalTrack "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->abnormalTrack:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 963
    const-string v0, "SwolfBase "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mSwolfBase:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(F)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 964
    const-string v0, "BritishSwolfBase "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mBritishSwolfBase:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(F)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 966
    const-string v0, "Descent "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mTotalDescent:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(F)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "MaxAlti "

    .line 967
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mMaxAlti:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(F)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "MinAlti "

    .line 968
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mMinAlti:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(F)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 970
    const-string v0, "Segments "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mSwimSegments:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 972
    const-string v0, ", mAvgGroundContactTime="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mAvgGroundContactTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 973
    const-string v0, ", mAvgGroundImpactAcceleration="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mAvgGroundImpactAcceleration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 974
    const-string v0, ", mAvgEversionExcursion="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mAvgEversionExcursion:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 975
    const-string v0, ", mAvgSwingAngle="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mAvgSwingAngle:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 976
    const-string v0, ", mAvgForeFootStrikePattern="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mAvgForeFootStrikePattern:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 977
    const-string v0, ", mAvgWholeFootStrikePattern="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mAvgWholeFootStrikePattern:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 978
    const-string v0, ", mAvgHindFootStrikePattern="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mAvgHindFootStrikePattern:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 979
    const-string v0, "BritishSegments "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mBritishSwimSegments:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 980
    const-string v0, ", mDuplicated="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mDuplicated:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 981
    const-string v0, ", mHeartrateZoneType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mHeartrateZoneType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 982
    const-string v0, ", mRuncourseId="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mRuncourseId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 983
    const-string v0, ", mRuncourseType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->mRuncourseType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 984
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
