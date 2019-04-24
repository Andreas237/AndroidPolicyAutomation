.class public Lcom/huawei/hihealth/data/model/HiTrackMetaData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/data/model/HiTrackMetaData;>;"
        }
    .end annotation
.end field


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

.field private coordinate:Ljava/lang/String;

.field private creepingWave:F

.field private hasTrackPoint:Z

.field private isFreeMotion:Z

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

.field private mSwimSegments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealth/data/model/TrackSwimSegment;>;"
        }
    .end annotation
.end field

.field private mSwolfBase:F

.field private mTotalDescent:F

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

.field private totalCalories:I

.field private totalDistance:I

.field private totalSteps:I

.field private totalTime:J

.field private trackType:I

.field private vendor:Ljava/lang/String;

.field private wearSportData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 294
    new-instance v0, Lcom/huawei/hihealth/data/model/HiTrackMetaData$1;

    invoke-direct {v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 244
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->avgPace:F

    .line 29
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->bestPace:F

    .line 34
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->avgHeartRate:I

    .line 39
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->maxHeartRate:I

    .line 44
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->minHeartRate:I

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->avgStepRate:I

    .line 54
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->bestStepRate:I

    .line 59
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->totalDistance:I

    .line 64
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->totalCalories:I

    .line 69
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->totalSteps:I

    .line 74
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->totalTime:J

    .line 95
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->partTimeMap:Ljava/util/Map;

    .line 105
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->britishPartTimeMap:Ljava/util/Map;

    .line 110
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->paceMap:Ljava/util/Map;

    .line 111
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->britishPaceMap:Ljava/util/Map;

    .line 121
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->creepingWave:F

    .line 133
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->wearSportData:Ljava/util/Map;

    .line 142
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->isFreeMotion:Z

    .line 147
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->sportDataSource:I

    .line 152
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->chiefSportDataType:I

    .line 157
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->hasTrackPoint:Z

    .line 163
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->abnormalTrack:I

    .line 169
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mDuplicated:I

    .line 175
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mHeartrateZoneType:I

    .line 179
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mSwolfBase:F

    .line 181
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mBritishSwolfBase:F

    .line 191
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mMaxAlti:F

    .line 192
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mMinAlti:F

    .line 198
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mSwimSegments:Ljava/util/List;

    .line 201
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mBritishSwimSegments:Ljava/util/List;

    .line 245
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 247
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->avgPace:F

    .line 29
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->bestPace:F

    .line 34
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->avgHeartRate:I

    .line 39
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->maxHeartRate:I

    .line 44
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->minHeartRate:I

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->avgStepRate:I

    .line 54
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->bestStepRate:I

    .line 59
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->totalDistance:I

    .line 64
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->totalCalories:I

    .line 69
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->totalSteps:I

    .line 74
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->totalTime:J

    .line 95
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->partTimeMap:Ljava/util/Map;

    .line 105
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->britishPartTimeMap:Ljava/util/Map;

    .line 110
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->paceMap:Ljava/util/Map;

    .line 111
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->britishPaceMap:Ljava/util/Map;

    .line 121
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->creepingWave:F

    .line 133
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->wearSportData:Ljava/util/Map;

    .line 142
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->isFreeMotion:Z

    .line 147
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->sportDataSource:I

    .line 152
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->chiefSportDataType:I

    .line 157
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->hasTrackPoint:Z

    .line 163
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->abnormalTrack:I

    .line 169
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mDuplicated:I

    .line 175
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mHeartrateZoneType:I

    .line 179
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mSwolfBase:F

    .line 181
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mBritishSwolfBase:F

    .line 191
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mMaxAlti:F

    .line 192
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mMinAlti:F

    .line 198
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mSwimSegments:Ljava/util/List;

    .line 201
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mBritishSwimSegments:Ljava/util/List;

    .line 248
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->avgPace:F

    .line 249
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->bestPace:F

    .line 250
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->avgHeartRate:I

    .line 251
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->maxHeartRate:I

    .line 252
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->avgStepRate:I

    .line 253
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->bestStepRate:I

    .line 254
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->totalDistance:I

    .line 255
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->totalCalories:I

    .line 256
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->totalSteps:I

    .line 257
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->totalTime:J

    .line 258
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->sportId:Ljava/lang/String;

    .line 259
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->sportType:I

    .line 260
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->trackType:I

    .line 261
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->partTimeMap:Ljava/util/Map;

    const-class v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readMap(Ljava/util/Map;Ljava/lang/ClassLoader;)V

    .line 262
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->paceMap:Ljava/util/Map;

    const-class v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readMap(Ljava/util/Map;Ljava/lang/ClassLoader;)V

    .line 263
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->wearSportData:Ljava/util/Map;

    const-class v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readMap(Ljava/util/Map;Ljava/lang/ClassLoader;)V

    .line 264
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->creepingWave:F

    .line 265
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->minHeartRate:I

    .line 266
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->vendor:Ljava/lang/String;

    .line 267
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->coordinate:Ljava/lang/String;

    .line 268
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->isFreeMotion:Z

    .line 269
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->sportDataSource:I

    .line 270
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->chiefSportDataType:I

    .line 271
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->hasTrackPoint:Z

    .line 272
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->britishPartTimeMap:Ljava/util/Map;

    const-class v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readMap(Ljava/util/Map;Ljava/lang/ClassLoader;)V

    .line 273
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->britishPaceMap:Ljava/util/Map;

    const-class v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readMap(Ljava/util/Map;Ljava/lang/ClassLoader;)V

    .line 274
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->abnormalTrack:I

    .line 275
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mDuplicated:I

    .line 276
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mSwolfBase:F

    .line 277
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mBritishSwolfBase:F

    .line 278
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mMaxAlti:F

    .line 279
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mMinAlti:F

    .line 280
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mTotalDescent:F

    .line 281
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mSwimSegments:Ljava/util/List;

    const-class v1, Lcom/huawei/hihealth/data/model/TrackSwimSegment;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 282
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mBritishSwimSegments:Ljava/util/List;

    const-class v1, Lcom/huawei/hihealth/data/model/TrackSwimSegment;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 283
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgGroundContactTime:I

    .line 284
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgGroundImpactAcceleration:I

    .line 285
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgEversionExcursion:I

    .line 286
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgSwingAngle:I

    .line 287
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgForeFootStrikePattern:I

    .line 288
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgWholeFootStrikePattern:I

    .line 289
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgHindFootStrikePattern:I

    .line 290
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mHeartrateZoneType:I

    .line 291
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mRuncourseId:Ljava/lang/String;

    .line 292
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 756
    const/4 v0, 0x0

    return v0
.end method

.method public getAbnormalTrack()I
    .locals 1

    .line 743
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->abnormalTrack:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getAvgEversionExcursion()I
    .locals 1

    .line 929
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgEversionExcursion:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getAvgForeFootStrikePattern()I
    .locals 1

    .line 945
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgForeFootStrikePattern:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getAvgGroundContactTime()I
    .locals 1

    .line 913
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgGroundContactTime:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getAvgGroundImpactAcceleration()I
    .locals 1

    .line 921
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgGroundImpactAcceleration:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getAvgHeartRate()I
    .locals 1

    .line 396
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->avgHeartRate:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getAvgHindFootStrikePattern()I
    .locals 1

    .line 961
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgHindFootStrikePattern:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getAvgPace()F
    .locals 1

    .line 382
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->avgPace:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method

.method public getAvgStepRate()I
    .locals 1

    .line 410
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->avgStepRate:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getAvgSwingAngle()I
    .locals 1

    .line 937
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgSwingAngle:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getAvgWholeFootStrikePattern()I
    .locals 1

    .line 953
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgWholeFootStrikePattern:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getBestPace()F
    .locals 1

    .line 529
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->bestPace:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method

.method public getBestStepRate()I
    .locals 1

    .line 505
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->bestStepRate:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getBritishPaceMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;"
        }
    .end annotation

    .line 555
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->britishPaceMap:Ljava/util/Map;

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public getBritishPartTimeMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Double;Ljava/lang/Double;>;"
        }
    .end annotation

    .line 715
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->britishPartTimeMap:Ljava/util/Map;

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public getBritishSwimSegments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealth/data/model/TrackSwimSegment;>;"
        }
    .end annotation

    .line 905
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mBritishSwimSegments:Ljava/util/List;

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getBritishSwolfBase()F
    .locals 1

    .line 865
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mBritishSwolfBase:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method

.method public getChiefSportDataType()I
    .locals 1

    .line 683
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->chiefSportDataType:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getCoordinate()Ljava/lang/String;
    .locals 1

    .line 635
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->coordinate:Ljava/lang/String;

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getCreepingWave()F
    .locals 1

    .line 571
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->creepingWave:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method

.method public getHasTrackPoint()Z
    .locals 1

    .line 699
    iget-boolean v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->hasTrackPoint:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public getIsFreeMotion()Z
    .locals 1

    .line 651
    iget-boolean v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->isFreeMotion:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public getMaxAlti()F
    .locals 1

    .line 873
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mMaxAlti:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method

.method public getMaxHeartRate()I
    .locals 1

    .line 489
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->maxHeartRate:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getMinAlti()F
    .locals 1

    .line 881
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mMinAlti:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method

.method public getMinHeartRate()I
    .locals 1

    .line 603
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->minHeartRate:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getPaceMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;"
        }
    .end annotation

    .line 538
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->paceMap:Ljava/util/Map;

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public getPartTimeMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Double;Ljava/lang/Double;>;"
        }
    .end annotation

    .line 465
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->partTimeMap:Ljava/util/Map;

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public getRuncourseId()Ljava/lang/String;
    .locals 1

    .line 727
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mRuncourseId:Ljava/lang/String;

    return-object v0
.end method

.method public getSportDataSource()I
    .locals 1

    .line 667
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->sportDataSource:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getSportId()Ljava/lang/String;
    .locals 1

    .line 433
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->sportId:Ljava/lang/String;

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getSportType()I
    .locals 1

    .line 449
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->sportType:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getSwimSegments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealth/data/model/TrackSwimSegment;>;"
        }
    .end annotation

    .line 897
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mSwimSegments:Ljava/util/List;

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getSwolfBase()F
    .locals 1

    .line 857
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mSwolfBase:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method

.method public getTotalCalories()I
    .locals 1

    .line 357
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->totalCalories:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getTotalDescent()F
    .locals 1

    .line 889
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mTotalDescent:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method

.method public getTotalDistance()I
    .locals 1

    .line 311
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->totalDistance:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getTotalSteps()I
    .locals 1

    .line 369
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->totalSteps:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getTotalTime()J
    .locals 2

    .line 343
    iget-wide v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->totalTime:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public getTrackType()I
    .locals 1

    .line 473
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->trackType:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getVendor()Ljava/lang/String;
    .locals 1

    .line 619
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->vendor:Ljava/lang/String;

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getWearSportData()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 587
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->wearSportData:Ljava/util/Map;

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public getmDuplicated()I
    .locals 1

    .line 315
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mDuplicated:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getmHeartrateZoneType()I
    .locals 1

    .line 323
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mHeartrateZoneType:I

    return v0
.end method

.method public setAbnormalTrack(I)V
    .locals 1

    .line 751
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->abnormalTrack:I

    .line 752
    return-void
.end method

.method public setAvgEversionExcursion(I)V
    .locals 1

    .line 933
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgEversionExcursion:I

    .line 934
    return-void
.end method

.method public setAvgForeFootStrikePattern(I)V
    .locals 1

    .line 949
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgForeFootStrikePattern:I

    .line 950
    return-void
.end method

.method public setAvgGroundContactTime(I)V
    .locals 1

    .line 917
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgGroundContactTime:I

    .line 918
    return-void
.end method

.method public setAvgGroundImpactAcceleration(I)V
    .locals 1

    .line 925
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgGroundImpactAcceleration:I

    .line 926
    return-void
.end method

.method public setAvgHeartRate(I)V
    .locals 1

    .line 403
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->avgHeartRate:I

    .line 404
    return-void
.end method

.method public setAvgHindFootStrikePattern(I)V
    .locals 1

    .line 965
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgHindFootStrikePattern:I

    .line 966
    return-void
.end method

.method public setAvgPace(F)V
    .locals 1

    .line 389
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->avgPace:F

    .line 390
    return-void
.end method

.method public setAvgStepRate(I)V
    .locals 1

    .line 417
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->avgStepRate:I

    .line 418
    return-void
.end method

.method public setAvgSwingAngle(I)V
    .locals 1

    .line 941
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgSwingAngle:I

    .line 942
    return-void
.end method

.method public setAvgWholeFootStrikePattern(I)V
    .locals 1

    .line 957
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgWholeFootStrikePattern:I

    .line 958
    return-void
.end method

.method public setBestPace(F)V
    .locals 1

    .line 521
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->bestPace:F

    .line 522
    return-void
.end method

.method public setBestStepRate(I)V
    .locals 1

    .line 513
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->bestStepRate:I

    .line 514
    return-void
.end method

.method public setBritishPaceMap(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;)V"
        }
    .end annotation

    .line 563
    invoke-static {p1}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->britishPaceMap:Ljava/util/Map;

    .line 564
    return-void
.end method

.method public setBritishPartTimeMap(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Double;Ljava/lang/Double;>;)V"
        }
    .end annotation

    .line 719
    invoke-static {p1}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->britishPartTimeMap:Ljava/util/Map;

    .line 720
    return-void
.end method

.method public setBritishSwimSegments(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/data/model/TrackSwimSegment;>;)V"
        }
    .end annotation

    .line 909
    invoke-static {p1}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mBritishSwimSegments:Ljava/util/List;

    .line 910
    return-void
.end method

.method public setBritishSwolfBase(F)V
    .locals 1

    .line 869
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mBritishSwolfBase:F

    .line 870
    return-void
.end method

.method public setChiefSportDataType(I)V
    .locals 1

    .line 691
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->chiefSportDataType:I

    .line 692
    return-void
.end method

.method public setCoordinate(Ljava/lang/String;)V
    .locals 1

    .line 643
    invoke-static {p1}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->coordinate:Ljava/lang/String;

    .line 644
    return-void
.end method

.method public setCreepingWave(F)V
    .locals 1

    .line 579
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->creepingWave:F

    .line 580
    return-void
.end method

.method public setHasTrackPoint(Z)V
    .locals 1

    .line 707
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->hasTrackPoint:Z

    .line 708
    return-void
.end method

.method public setHeartrateZoneType(I)V
    .locals 0

    .line 327
    iput p1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mHeartrateZoneType:I

    .line 328
    return-void
.end method

.method public setIsFreeMotion(Z)V
    .locals 1

    .line 659
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->isFreeMotion:Z

    .line 660
    return-void
.end method

.method public setMaxAlti(F)V
    .locals 1

    .line 877
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mMaxAlti:F

    .line 878
    return-void
.end method

.method public setMaxHeartRate(I)V
    .locals 1

    .line 497
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->maxHeartRate:I

    .line 498
    return-void
.end method

.method public setMinAlti(F)V
    .locals 1

    .line 885
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mMinAlti:F

    .line 886
    return-void
.end method

.method public setMinHeartRate(I)V
    .locals 1

    .line 611
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->minHeartRate:I

    .line 612
    return-void
.end method

.method public setPaceMap(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;)V"
        }
    .end annotation

    .line 546
    invoke-static {p1}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->paceMap:Ljava/util/Map;

    .line 547
    return-void
.end method

.method public setPartTimeMap(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Double;Ljava/lang/Double;>;)V"
        }
    .end annotation

    .line 457
    invoke-static {p1}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->partTimeMap:Ljava/util/Map;

    .line 458
    return-void
.end method

.method public setRuncourseId(Ljava/lang/String;)V
    .locals 0

    .line 735
    iput-object p1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mRuncourseId:Ljava/lang/String;

    .line 736
    return-void
.end method

.method public setSportDataSource(I)V
    .locals 1

    .line 675
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->sportDataSource:I

    .line 676
    return-void
.end method

.method public setSportId(Ljava/lang/String;)V
    .locals 1

    .line 425
    invoke-static {p1}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->sportId:Ljava/lang/String;

    .line 426
    return-void
.end method

.method public setSportType(I)V
    .locals 1

    .line 441
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->sportType:I

    .line 442
    return-void
.end method

.method public setSwimSegments(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/data/model/TrackSwimSegment;>;)V"
        }
    .end annotation

    .line 901
    invoke-static {p1}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mSwimSegments:Ljava/util/List;

    .line 902
    return-void
.end method

.method public setSwolfBase(F)V
    .locals 1

    .line 861
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mSwolfBase:F

    .line 862
    return-void
.end method

.method public setTotalCalories(I)V
    .locals 1

    .line 363
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->totalCalories:I

    .line 364
    return-void
.end method

.method public setTotalDescent(F)V
    .locals 1

    .line 893
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mTotalDescent:F

    .line 894
    return-void
.end method

.method public setTotalDistance(I)V
    .locals 1

    .line 335
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->totalDistance:I

    .line 336
    return-void
.end method

.method public setTotalSteps(I)V
    .locals 1

    .line 375
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->totalSteps:I

    .line 376
    return-void
.end method

.method public setTotalTime(J)V
    .locals 2

    .line 351
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->totalTime:J

    .line 352
    return-void
.end method

.method public setTrackType(I)V
    .locals 1

    .line 481
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->trackType:I

    .line 482
    return-void
.end method

.method public setVendor(Ljava/lang/String;)V
    .locals 1

    .line 627
    invoke-static {p1}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->vendor:Ljava/lang/String;

    .line 628
    return-void
.end method

.method public setWearSportData(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 595
    invoke-static {p1}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->wearSportData:Ljava/util/Map;

    .line 596
    return-void
.end method

.method public setmDuplicated(I)V
    .locals 1

    .line 319
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mDuplicated:I

    .line 320
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 761
    new-instance v3, Ljava/lang/StringBuffer;

    const-string v0, "HiTrackMetaData{"

    invoke-direct {v3, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 762
    const-string v0, "totalDistance="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->totalDistance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 763
    const-string v0, ", totalCalories="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->totalCalories:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 764
    const-string v0, ", totalSteps="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->totalSteps:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 765
    const-string v0, ", totalTime="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->totalTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 766
    const-string v0, ", trackType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->trackType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 767
    const-string v0, ", sportType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->sportType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 771
    const-string v0, ", bestStepRate="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->bestStepRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 772
    const-string v0, ", avgStepRate="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->avgStepRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 773
    const-string v0, ", avgPace="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->avgPace:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(F)Ljava/lang/StringBuffer;

    .line 774
    const-string v0, ", bestPace="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->bestPace:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(F)Ljava/lang/StringBuffer;

    .line 775
    const-string v0, ", creepingWave="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->creepingWave:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(F)Ljava/lang/StringBuffer;

    .line 776
    const-string v0, ", wearSportData="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->wearSportData:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 777
    const-string v0, ", vendor="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->vendor:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 778
    const-string v0, ", coordinate="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->coordinate:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 779
    const-string v0, ", isFreeMotion="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->isFreeMotion:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;

    .line 780
    const-string v0, ", sportDataSource="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->sportDataSource:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 781
    const-string v0, ", chiefSportDataType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->chiefSportDataType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 782
    const-string v0, ", hasTrackPoint="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->hasTrackPoint:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;

    .line 783
    const-string v0, ", abnormalTrack="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->abnormalTrack:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 784
    const-string v0, ", mDuplicated="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mDuplicated:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 785
    const-string v0, ", mSwolfBase="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mSwolfBase:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(F)Ljava/lang/StringBuffer;

    .line 786
    const-string v0, ", mBritishSwolfBase="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mBritishSwolfBase:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(F)Ljava/lang/StringBuffer;

    .line 787
    const-string v0, ", mMaxAlti="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mMaxAlti:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(F)Ljava/lang/StringBuffer;

    .line 788
    const-string v0, ", mMinAlti="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mMinAlti:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(F)Ljava/lang/StringBuffer;

    .line 789
    const-string v0, ", mTotalDescent="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mTotalDescent:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(F)Ljava/lang/StringBuffer;

    .line 790
    const-string v0, ", mAvgGroundContactTime="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgGroundContactTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 791
    const-string v0, ", mAvgGroundImpactAcceleration="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgGroundImpactAcceleration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 792
    const-string v0, ", mAvgEversionExcursion="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgEversionExcursion:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 793
    const-string v0, ", mAvgSwingAngle="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgSwingAngle:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 794
    const-string v0, ", mAvgForeFootStrikePattern="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgForeFootStrikePattern:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 795
    const-string v0, ", mAvgWholeFootStrikePattern="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgWholeFootStrikePattern:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 796
    const-string v0, ", mAvgHindFootStrikePattern="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgHindFootStrikePattern:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 797
    const-string v0, ", mHeartrateZoneType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mHeartrateZoneType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 798
    const-string v0, ", mRuncourseId="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mRuncourseId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 799
    const/16 v0, 0x7d

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 800
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 806
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->avgPace:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 807
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->bestPace:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 808
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->avgHeartRate:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 809
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->minHeartRate:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 810
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->maxHeartRate:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 811
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->avgStepRate:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 812
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->bestStepRate:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 813
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->totalDistance:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 814
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->totalCalories:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 815
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->totalSteps:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 816
    iget-wide v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->totalTime:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 817
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->sportId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 818
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->sportType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 819
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->trackType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 820
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->partTimeMap:Ljava/util/Map;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    .line 821
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->paceMap:Ljava/util/Map;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    .line 822
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->creepingWave:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 823
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->wearSportData:Ljava/util/Map;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    .line 824
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->vendor:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 825
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->coordinate:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 826
    iget-boolean v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->isFreeMotion:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 827
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->sportDataSource:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 828
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->chiefSportDataType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 829
    iget-boolean v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->hasTrackPoint:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 830
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->britishPartTimeMap:Ljava/util/Map;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    .line 831
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->britishPaceMap:Ljava/util/Map;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    .line 832
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->abnormalTrack:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 833
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mDuplicated:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 835
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mSwolfBase:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 836
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mBritishSwolfBase:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 837
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mMaxAlti:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 838
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mMinAlti:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 839
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mTotalDescent:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 841
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mSwimSegments:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 842
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mBritishSwimSegments:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 845
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgGroundContactTime:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 846
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgGroundImpactAcceleration:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 847
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgEversionExcursion:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 848
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgSwingAngle:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 849
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgForeFootStrikePattern:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 850
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgWholeFootStrikePattern:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 851
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mAvgHindFootStrikePattern:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 852
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mHeartrateZoneType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 853
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->mRuncourseId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 854
    return-void
.end method
