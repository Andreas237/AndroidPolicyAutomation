.class public Lcom/huawei/health/suggestion/model/WorkoutRecord;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/suggestion/model/WorkoutRecord$Extend;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;"
        }
    .end annotation
.end field


# instance fields
.field private actionSummary:Ljava/lang/String;

.field private actualCalorie:F

.field private actualDistance:F

.field private bestPace:I

.field private calorie:F

.field private distance:F

.field private during:I

.field private exerciseTime:J

.field private extend:Ljava/lang/String;

.field private finishRate:F

.field private id:I

.field private lowerHeartRate:I

.field private oxygen:D

.field private planId:Ljava/lang/String;

.field private recordType:I

.field private trainingLoadPeak:I

.field private trajectoryId:Ljava/lang/String;

.field private upperHeartRate:I

.field private version:Ljava/lang/String;

.field private wearType:I

.field private weekNum:I

.field private workoutDate:Ljava/lang/String;

.field private workoutId:Ljava/lang/String;

.field private workoutName:Ljava/lang/String;

.field private workoutOrder:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 154
    new-instance v0, Lcom/huawei/health/suggestion/model/WorkoutRecord$1;

    invoke-direct {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord$1;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 470
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 471
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->id:I

    .line 93
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->planId:Ljava/lang/String;

    .line 94
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->workoutId:Ljava/lang/String;

    .line 95
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->workoutName:Ljava/lang/String;

    .line 96
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->workoutDate:Ljava/lang/String;

    .line 97
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->weekNum:I

    .line 98
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->exerciseTime:J

    .line 99
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->during:I

    .line 100
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->actualCalorie:F

    .line 101
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->actualDistance:F

    .line 102
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->calorie:F

    .line 103
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->distance:F

    .line 104
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->finishRate:F

    .line 105
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->workoutOrder:I

    .line 106
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->upperHeartRate:I

    .line 107
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->lowerHeartRate:I

    .line 108
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->bestPace:I

    .line 109
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->oxygen:D

    .line 110
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->trainingLoadPeak:I

    .line 111
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->trajectoryId:Ljava/lang/String;

    .line 112
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->recordType:I

    .line 113
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->version:Ljava/lang/String;

    .line 114
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->actionSummary:Ljava/lang/String;

    .line 115
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->wearType:I

    .line 116
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->extend:Ljava/lang/String;

    .line 118
    return-void
.end method

.method private acquireExtendFitSingle()Ljava/lang/String;
    .locals 3

    .line 424
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->extend:Ljava/lang/String;

    invoke-static {v0}, Lo/cae;->b(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 425
    const-string v0, "fit_single"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 426
    return-object v2
.end method

.method private acquireExtendRunWorkout()Ljava/lang/String;
    .locals 3

    .line 457
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->extend:Ljava/lang/String;

    invoke-static {v0}, Lo/cae;->b(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 458
    const-string v0, "run_workout"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 459
    return-object v2
.end method

.method public static getCREATOR()Landroid/os/Parcelable$Creator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Landroid/os/Parcelable$Creator<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;"
        }
    .end annotation

    .line 311
    sget-object v0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->CREATOR:Landroid/os/Parcelable$Creator;

    return-object v0
.end method


# virtual methods
.method public acquireActionSummary()Ljava/lang/String;
    .locals 1

    .line 347
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->actionSummary:Ljava/lang/String;

    return-object v0
.end method

.method public acquireActualCalorie()F
    .locals 1

    .line 223
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->actualCalorie:F

    return v0
.end method

.method public acquireActualDistance()F
    .locals 1

    .line 231
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->actualDistance:F

    return v0
.end method

.method public acquireBestPace()I
    .locals 1

    .line 271
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->bestPace:I

    return v0
.end method

.method public acquireBestTimes()I
    .locals 4

    .line 393
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->extend:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->extend:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 394
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 396
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExtendFitSingle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cae;->b(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    .line 397
    const-string v0, "oneMinBest"

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 398
    invoke-static {v3}, Lo/caj;->b(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public acquireCalorie()F
    .locals 1

    .line 303
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->calorie:F

    return v0
.end method

.method public acquireDistance()F
    .locals 1

    .line 315
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->distance:F

    return v0
.end method

.method public acquireDuring()I
    .locals 1

    .line 215
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->during:I

    return v0
.end method

.method public acquireExerciseTime()J
    .locals 2

    .line 207
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->exerciseTime:J

    return-wide v0
.end method

.method public acquireExtend()Ljava/lang/String;
    .locals 1

    .line 355
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->extend:Ljava/lang/String;

    return-object v0
.end method

.method public acquireFinishRate()F
    .locals 1

    .line 239
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->finishRate:F

    return v0
.end method

.method public acquireId()I
    .locals 1

    .line 167
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->id:I

    return v0
.end method

.method public acquireLowerHeartRate()I
    .locals 1

    .line 263
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->lowerHeartRate:I

    return v0
.end method

.method public acquireOxygen()D
    .locals 2

    .line 279
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->oxygen:D

    return-wide v0
.end method

.method public acquirePlanId()Ljava/lang/String;
    .locals 1

    .line 175
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->planId:Ljava/lang/String;

    return-object v0
.end method

.method public acquireRateInfo()Lcom/huawei/health/suggestion/model/RateInfo;
    .locals 5

    .line 411
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->extend:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->extend:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 412
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 414
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExtendFitSingle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cae;->b(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    .line 415
    const-string v0, "rateInfo"

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 416
    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    const-string v0, ""

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 417
    :cond_2
    const/4 v0, 0x0

    return-object v0

    .line 419
    :cond_3
    const-class v0, Lcom/huawei/health/suggestion/model/RateInfo;

    invoke-static {v3, v0}, Lo/cae;->d(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/model/RateInfo;

    .line 420
    return-object v4
.end method

.method public acquireRecordType()I
    .locals 1

    .line 331
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->recordType:I

    return v0
.end method

.method public acquireRunWorkoutTrajectoryId()Ljava/lang/String;
    .locals 4

    .line 439
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->extend:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->extend:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 440
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 442
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExtendRunWorkout()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cae;->b(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    .line 443
    const-string v0, "trajectoryId"

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 444
    return-object v3
.end method

.method public acquireTimes()I
    .locals 4

    .line 384
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->extend:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->extend:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 385
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 387
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExtendFitSingle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cae;->b(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    .line 388
    const-string v0, "times"

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 389
    invoke-static {v3}, Lo/caj;->b(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public acquireTrainingLoadPeak()I
    .locals 1

    .line 287
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->trainingLoadPeak:I

    return v0
.end method

.method public acquireTrajectoryId()Ljava/lang/String;
    .locals 1

    .line 323
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->trajectoryId:Ljava/lang/String;

    return-object v0
.end method

.method public acquireUpperHeartRate()I
    .locals 1

    .line 255
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->upperHeartRate:I

    return v0
.end method

.method public acquireVersion()Ljava/lang/String;
    .locals 1

    .line 339
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->version:Ljava/lang/String;

    return-object v0
.end method

.method public acquireWearType()I
    .locals 1

    .line 463
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->wearType:I

    return v0
.end method

.method public acquireWeekNum()I
    .locals 1

    .line 295
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->weekNum:I

    return v0
.end method

.method public acquireWorkoutDate()Ljava/lang/String;
    .locals 1

    .line 199
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->workoutDate:Ljava/lang/String;

    return-object v0
.end method

.method public acquireWorkoutId()Ljava/lang/String;
    .locals 1

    .line 183
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->workoutId:Ljava/lang/String;

    return-object v0
.end method

.method public acquireWorkoutName()Ljava/lang/String;
    .locals 1

    .line 191
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->workoutName:Ljava/lang/String;

    return-object v0
.end method

.method public acquireWorkoutOrder()I
    .locals 1

    .line 247
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->workoutOrder:I

    return v0
.end method

.method public describeContents()I
    .locals 1

    .line 151
    const/4 v0, 0x0

    return v0
.end method

.method public getBIJson(Lorg/json/JSONObject;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 474
    invoke-static {}, Lo/bzm;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 475
    const-string v0, "end_time"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/bzm;->e(J)J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 476
    const-string v0, "finish_rate"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireFinishRate()F

    move-result v1

    invoke-static {v1}, Lo/bzm;->e(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 479
    :cond_0
    const-string v0, "workout_name"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 480
    return-void
.end method

.method public isRunWorkout()Z
    .locals 2

    .line 448
    invoke-direct {p0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExtendRunWorkout()Ljava/lang/String;

    move-result-object v1

    .line 449
    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    .line 450
    const/4 v0, 0x0

    return v0

    .line 452
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public isSingle()Z
    .locals 4

    .line 402
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->extend:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->extend:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 403
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 405
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExtendFitSingle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cae;->b(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    .line 406
    const-string v0, "single"

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 407
    invoke-static {v3}, Lo/caj;->c(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public saveActionSummary(Ljava/lang/String;)V
    .locals 0

    .line 351
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->actionSummary:Ljava/lang/String;

    .line 352
    return-void
.end method

.method public saveActualCalorie(F)V
    .locals 0

    .line 227
    iput p1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->actualCalorie:F

    .line 228
    return-void
.end method

.method public saveActualDistance(F)V
    .locals 0

    .line 235
    iput p1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->actualDistance:F

    .line 236
    return-void
.end method

.method public saveBestPace(I)V
    .locals 0

    .line 275
    iput p1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->bestPace:I

    .line 276
    return-void
.end method

.method public saveCalorie(F)V
    .locals 0

    .line 307
    iput p1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->calorie:F

    .line 308
    return-void
.end method

.method public saveDistance(F)V
    .locals 0

    .line 319
    iput p1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->distance:F

    .line 320
    return-void
.end method

.method public saveDuring(I)V
    .locals 0

    .line 219
    iput p1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->during:I

    .line 220
    return-void
.end method

.method public saveExerciseTime(J)V
    .locals 0

    .line 211
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->exerciseTime:J

    .line 212
    return-void
.end method

.method public saveExtend(Ljava/lang/String;)V
    .locals 0

    .line 359
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->extend:Ljava/lang/String;

    .line 360
    return-void
.end method

.method public saveExtend(ZIILcom/huawei/health/suggestion/model/RateInfo;)V
    .locals 5

    .line 363
    new-instance v3, Ljava/util/HashMap;

    const/4 v0, 0x3

    invoke-direct {v3, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 364
    const-string v0, "single"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    const-string v0, "times"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 366
    const-string v0, "oneMinBest"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 367
    const-string v0, "rateInfo"

    invoke-static {p4}, Lo/cae;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    new-instance v4, Ljava/util/HashMap;

    const/4 v0, 0x1

    invoke-direct {v4, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 369
    const-string v0, "fit_single"

    invoke-static {v3}, Lo/cae;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 370
    invoke-static {v4}, Lo/cae;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->extend:Ljava/lang/String;

    .line 371
    return-void
.end method

.method public saveExtend(ZILcom/huawei/health/suggestion/model/RateInfo;)V
    .locals 5

    .line 374
    new-instance v3, Ljava/util/HashMap;

    const/4 v0, 0x3

    invoke-direct {v3, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 375
    const-string v0, "single"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    const-string v0, "times"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 377
    const-string v0, "rateInfo"

    invoke-static {p3}, Lo/cae;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 378
    new-instance v4, Ljava/util/HashMap;

    const/4 v0, 0x1

    invoke-direct {v4, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 379
    const-string v0, "fit_single"

    invoke-static {v3}, Lo/cae;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    invoke-static {v4}, Lo/cae;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->extend:Ljava/lang/String;

    .line 381
    return-void
.end method

.method public saveExtendRunWorkout(Ljava/lang/String;)V
    .locals 4

    .line 431
    new-instance v2, Ljava/util/HashMap;

    const/4 v0, 0x1

    invoke-direct {v2, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 432
    const-string v0, "trajectoryId"

    invoke-interface {v2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 433
    new-instance v3, Ljava/util/HashMap;

    const/4 v0, 0x1

    invoke-direct {v3, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 434
    const-string v0, "run_workout"

    invoke-static {v2}, Lo/cae;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 435
    invoke-static {v3}, Lo/cae;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->extend:Ljava/lang/String;

    .line 436
    return-void
.end method

.method public saveFinishRate(F)V
    .locals 0

    .line 243
    iput p1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->finishRate:F

    .line 244
    return-void
.end method

.method public saveId(I)V
    .locals 0

    .line 171
    iput p1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->id:I

    .line 172
    return-void
.end method

.method public saveLowerHeartRate(I)V
    .locals 0

    .line 267
    iput p1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->lowerHeartRate:I

    .line 268
    return-void
.end method

.method public saveOxygen(D)V
    .locals 0

    .line 283
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->oxygen:D

    .line 284
    return-void
.end method

.method public savePlanId(Ljava/lang/String;)V
    .locals 0

    .line 179
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->planId:Ljava/lang/String;

    .line 180
    return-void
.end method

.method public saveRecordType(I)V
    .locals 0

    .line 335
    iput p1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->recordType:I

    .line 336
    return-void
.end method

.method public saveTrainingLoadPeak(I)V
    .locals 0

    .line 291
    iput p1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->trainingLoadPeak:I

    .line 292
    return-void
.end method

.method public saveTrajectoryId(Ljava/lang/String;)V
    .locals 0

    .line 327
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->trajectoryId:Ljava/lang/String;

    .line 328
    return-void
.end method

.method public saveUpperHeartRate(I)V
    .locals 0

    .line 259
    iput p1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->upperHeartRate:I

    .line 260
    return-void
.end method

.method public saveVersion(Ljava/lang/String;)V
    .locals 0

    .line 343
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->version:Ljava/lang/String;

    .line 344
    return-void
.end method

.method public saveWearType(I)V
    .locals 0

    .line 467
    iput p1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->wearType:I

    .line 468
    return-void
.end method

.method public saveWeekNum(I)V
    .locals 0

    .line 299
    iput p1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->weekNum:I

    .line 300
    return-void
.end method

.method public saveWorkoutDate(Ljava/lang/String;)V
    .locals 0

    .line 203
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->workoutDate:Ljava/lang/String;

    .line 204
    return-void
.end method

.method public saveWorkoutId(Ljava/lang/String;)V
    .locals 0

    .line 187
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->workoutId:Ljava/lang/String;

    .line 188
    return-void
.end method

.method public saveWorkoutName(Ljava/lang/String;)V
    .locals 0

    .line 195
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->workoutName:Ljava/lang/String;

    .line 196
    return-void
.end method

.method public saveWorkoutOrder(I)V
    .locals 0

    .line 251
    iput p1, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->workoutOrder:I

    .line 252
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 122
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->id:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 123
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->planId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 124
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->workoutId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 125
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->workoutName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 126
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->workoutDate:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 127
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->weekNum:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 128
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->exerciseTime:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 129
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->during:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 130
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->actualCalorie:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 131
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->actualDistance:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 132
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->calorie:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 133
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->distance:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 134
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->finishRate:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 135
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->workoutOrder:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 136
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->upperHeartRate:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 137
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->lowerHeartRate:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 138
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->bestPace:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 139
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->oxygen:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 140
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->trainingLoadPeak:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 141
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->trajectoryId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 142
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->recordType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 143
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->version:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 144
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->actionSummary:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 145
    iget v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->wearType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 146
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/WorkoutRecord;->extend:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 147
    return-void
.end method
