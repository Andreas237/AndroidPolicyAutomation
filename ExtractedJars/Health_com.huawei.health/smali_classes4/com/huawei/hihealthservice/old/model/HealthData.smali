.class public Lcom/huawei/hihealthservice/old/model/HealthData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final ALTITUDE:I = 0xa00

.field public static final BLOODPRESURE:I = 0x600

.field public static final BLOODSUGAR:I = 0x500

.field public static final BLOODSUGAR_BEFORE_DAWN:I = 0x508

.field public static final BLOODSUGAR_BREAKFAST_AFTER:I = 0x502

.field public static final BLOODSUGAR_BREAKFAST_BEFORE:I = 0x501

.field public static final BLOODSUGAR_DINNER_AFTER:I = 0x506

.field public static final BLOODSUGAR_DINNER_BEFORE:I = 0x505

.field public static final BLOODSUGAR_LUNCH_AFTER:I = 0x504

.field public static final BLOODSUGAR_LUNCH_BEFORE:I = 0x503

.field public static final BLOODSUGAR_MAXSUBTYPE:I = 0x508

.field public static final BLOODSUGAR_SLEEP_BEFORE:I = 0x507

.field public static final BODYFAT:I = 0x900

.field public static final DEVICE_SETTING:I = 0x1100

.field public static final ECG:I = 0xc00

.field public static final EVERY_DEVICE:I = 0x1201

.field public static final HEARTRATE:I = 0x800

.field public static final INVALID_VALUES_DOUBLE:D = 4.9E-324

.field public static final INVALID_VALUES_FLOAT:F = 1.4E-45f

.field public static final INVALID_VALUES_INT:I = -0x80000000

.field public static final INVALID_VALUES_LONG:J = -0x8000000000000000L

.field public static final INVALID_VALUES_SHORT:S = -0x8000s

.field public static final MEASUREMENT_BLOODSUGAR:I = 0x8

.field public static final MEASUREMENT_CALORIES:I = 0x3

.field public static final MEASUREMENT_DIASTOLIC:I = 0x7

.field public static final MEASUREMENT_DISTANCES:I = 0x2

.field public static final MEASUREMENT_DURATION:I = 0x4

.field public static final MEASUREMENT_FATRATE:I = 0xa

.field public static final MEASUREMENT_HEARTRATE:I = 0xb

.field public static final MEASUREMENT_RECORD:I = 0x5

.field public static final MEASUREMENT_RECORD_STATUS:I = 0xc

.field public static final MEASUREMENT_STEPS:I = 0x1

.field public static final MEASUREMENT_SYSTOLIC:I = 0x6

.field public static final MEASUREMENT_WEIGHT:I = 0x9

.field public static final MOTION_PATH:I = 0x400

.field public static final MY_DEVICE:I = 0x1200

.field public static final SLEEP:I = 0x200

.field public static final SLEEP_DEEP:I = 0x201

.field public static final SLEEP_MAXSUBTYPE:I = 0x203

.field public static final SLEEP_SHALLOW:I = 0x202

.field public static final SLEEP_WAKE:I = 0x203

.field public static final SPORT:I = 0x100

.field public static final SPORT_CLIMB:I = 0x104

.field public static final SPORT_CYCLE:I = 0x103

.field public static final SPORT_MAXSUBTYPE:I = 0x105

.field public static final SPORT_RUN:I = 0x102

.field public static final SPORT_STAIRS:I = 0x105

.field public static final SPORT_WALK:I = 0x101

.field public static final STAND:I = 0xb00

.field public static final TIMELINE:I = 0x300

.field public static final TIMELINE_MAXSUBTYPE:I = 0x303

.field public static final TIMELINE_MOTION:I = 0x303

.field public static final TIMELINE_SLEEP:I = 0x302

.field public static final TIMELINE_SPORT:I = 0x301

.field public static final USER_PREFERENCE:I = 0x1000

.field public static final WEIGHT:I = 0x700

.field private static durationTypeSet:Ljava/util/Set; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private static healthDataTypeSet:Ljava/util/Set; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private static measurementMap:Ljava/util/Map; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;[I>;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = -0x5f5df64555b5eddaL


# instance fields
.field private app:Lcom/huawei/hihealthservice/old/model/AppInfo;

.field private attributes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
        }
    .end annotation
.end field

.field private device:Lcom/huawei/hihealthservice/old/model/DeviceInfo;

.field private endTime:J

.field private huid:J

.field private location:Lcom/huawei/hihealthservice/old/model/Location;

.field private recordId:Ljava/lang/String;

.field private referData:Ljava/lang/Object;

.field private startTime:J

.field private subType:I

.field private timeZone:Ljava/lang/String;

.field private type:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 351
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    sput-object v0, Lcom/huawei/hihealthservice/old/model/HealthData;->durationTypeSet:Ljava/util/Set;

    .line 355
    sget-object v0, Lcom/huawei/hihealthservice/old/model/HealthData;->durationTypeSet:Ljava/util/Set;

    const/16 v1, 0x100

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 356
    sget-object v0, Lcom/huawei/hihealthservice/old/model/HealthData;->durationTypeSet:Ljava/util/Set;

    const/16 v1, 0x200

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 359
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    sput-object v0, Lcom/huawei/hihealthservice/old/model/HealthData;->measurementMap:Ljava/util/Map;

    .line 362
    sget-object v0, Lcom/huawei/hihealthservice/old/model/HealthData;->measurementMap:Ljava/util/Map;

    const/16 v1, 0x100

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x5

    new-array v2, v2, [I

    fill-array-data v2, :array_0

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    sget-object v0, Lcom/huawei/hihealthservice/old/model/HealthData;->measurementMap:Ljava/util/Map;

    const/16 v1, 0x200

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [I

    fill-array-data v2, :array_1

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    sget-object v0, Lcom/huawei/hihealthservice/old/model/HealthData;->measurementMap:Ljava/util/Map;

    const/16 v1, 0x600

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [I

    fill-array-data v2, :array_2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 367
    sget-object v0, Lcom/huawei/hihealthservice/old/model/HealthData;->measurementMap:Ljava/util/Map;

    const/16 v1, 0x500

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [I

    fill-array-data v2, :array_3

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    sget-object v0, Lcom/huawei/hihealthservice/old/model/HealthData;->measurementMap:Ljava/util/Map;

    const/16 v1, 0x700

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [I

    fill-array-data v2, :array_4

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    new-instance v0, Ljava/util/HashSet;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    sput-object v0, Lcom/huawei/hihealthservice/old/model/HealthData;->healthDataTypeSet:Ljava/util/Set;

    .line 376
    sget-object v0, Lcom/huawei/hihealthservice/old/model/HealthData;->healthDataTypeSet:Ljava/util/Set;

    const/16 v1, 0x100

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 377
    sget-object v0, Lcom/huawei/hihealthservice/old/model/HealthData;->healthDataTypeSet:Ljava/util/Set;

    const/16 v1, 0x200

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 378
    sget-object v0, Lcom/huawei/hihealthservice/old/model/HealthData;->healthDataTypeSet:Ljava/util/Set;

    const/16 v1, 0x400

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 379
    sget-object v0, Lcom/huawei/hihealthservice/old/model/HealthData;->healthDataTypeSet:Ljava/util/Set;

    const/16 v1, 0x500

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 380
    sget-object v0, Lcom/huawei/hihealthservice/old/model/HealthData;->healthDataTypeSet:Ljava/util/Set;

    const/16 v1, 0x600

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 381
    sget-object v0, Lcom/huawei/hihealthservice/old/model/HealthData;->healthDataTypeSet:Ljava/util/Set;

    const/16 v1, 0x700

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 382
    sget-object v0, Lcom/huawei/hihealthservice/old/model/HealthData;->healthDataTypeSet:Ljava/util/Set;

    const/16 v1, 0x300

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 383
    sget-object v0, Lcom/huawei/hihealthservice/old/model/HealthData;->healthDataTypeSet:Ljava/util/Set;

    const/16 v1, 0x800

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 384
    sget-object v0, Lcom/huawei/hihealthservice/old/model/HealthData;->healthDataTypeSet:Ljava/util/Set;

    const/16 v1, 0xb00

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 385
    sget-object v0, Lcom/huawei/hihealthservice/old/model/HealthData;->healthDataTypeSet:Ljava/util/Set;

    const/16 v1, 0xa00

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 386
    sget-object v0, Lcom/huawei/hihealthservice/old/model/HealthData;->healthDataTypeSet:Ljava/util/Set;

    const/16 v1, 0xc00

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 387
    return-void

    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0x4
        0x5
    .end array-data

    :array_1
    .array-data 4
        0x4
    .end array-data

    :array_2
    .array-data 4
        0x6
        0x7
        0x5
    .end array-data

    :array_3
    .array-data 4
        0x8
        0x5
    .end array-data

    :array_4
    .array-data 4
        0x9
        0x5
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getDataTypeBySubType(I)I
    .locals 1

    .line 396
    const v0, 0xff00

    and-int/2addr v0, p0

    return v0
.end method

.method public static getMeasurementType(I)[I
    .locals 2

    .line 406
    sget-object v0, Lcom/huawei/hihealthservice/old/model/HealthData;->measurementMap:Ljava/util/Map;

    invoke-static {p0}, Lcom/huawei/hihealthservice/old/model/HealthData;->getDataTypeBySubType(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method

.method public static isDurationType(I)Z
    .locals 2

    .line 416
    sget-object v0, Lcom/huawei/hihealthservice/old/model/HealthData;->durationTypeSet:Ljava/util/Set;

    invoke-static {p0}, Lcom/huawei/hihealthservice/old/model/HealthData;->getDataTypeBySubType(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static isValidType(I)Z
    .locals 2

    .line 426
    sget-object v0, Lcom/huawei/hihealthservice/old/model/HealthData;->healthDataTypeSet:Ljava/util/Set;

    invoke-static {p0}, Lcom/huawei/hihealthservice/old/model/HealthData;->getDataTypeBySubType(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static validDouble(D)Z
    .locals 4

    .line 663
    const-wide/16 v0, 0x1

    sub-double v0, p0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 665
    const/4 v0, 0x0

    return v0

    .line 669
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public static validFloat(F)Z
    .locals 4

    .line 652
    const/4 v0, 0x1

    sub-float v0, p0, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 654
    const/4 v0, 0x0

    return v0

    .line 658
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public static validInt(I)Z
    .locals 1

    .line 674
    const/high16 v0, -0x80000000

    if-ne p0, v0, :cond_0

    .line 676
    const/4 v0, 0x0

    return v0

    .line 680
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public static validLong(J)Z
    .locals 2

    .line 686
    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, p0, v0

    if-nez v0, :cond_0

    .line 688
    const/4 v0, 0x0

    return v0

    .line 692
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public static validShort(S)Z
    .locals 1

    .line 698
    const/16 v0, -0x8000

    if-ne p0, v0, :cond_0

    .line 700
    const/4 v0, 0x0

    return v0

    .line 704
    :cond_0
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public clone()Lcom/huawei/hihealthservice/old/model/HealthData;
    .locals 2

    .line 625
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/model/HealthData;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 627
    :catch_0
    move-exception v1

    .line 629
    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 27
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/model/HealthData;->clone()Lcom/huawei/hihealthservice/old/model/HealthData;

    move-result-object v0

    return-object v0
.end method

.method public getApp()Lcom/huawei/hihealthservice/old/model/AppInfo;
    .locals 1

    .line 638
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->app:Lcom/huawei/hihealthservice/old/model/AppInfo;

    return-object v0
.end method

.method public getAttribute(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 557
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->attributes:Ljava/util/Map;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 559
    const/4 v0, 0x0

    return-object v0

    .line 563
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->attributes:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getAttributes()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
        }
    .end annotation

    .line 552
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->attributes:Ljava/util/Map;

    return-object v0
.end method

.method public getDevice()Lcom/huawei/hihealthservice/old/model/DeviceInfo;
    .locals 1

    .line 485
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->device:Lcom/huawei/hihealthservice/old/model/DeviceInfo;

    return-object v0
.end method

.method public getEndTime()J
    .locals 2

    .line 515
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->endTime:J

    return-wide v0
.end method

.method public getHuid()J
    .locals 2

    .line 434
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->huid:J

    return-wide v0
.end method

.method public getLocation()Lcom/huawei/hihealthservice/old/model/Location;
    .locals 1

    .line 525
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->location:Lcom/huawei/hihealthservice/old/model/Location;

    return-object v0
.end method

.method public getRecordId()Ljava/lang/String;
    .locals 1

    .line 451
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->recordId:Ljava/lang/String;

    return-object v0
.end method

.method public getReferData()Ljava/lang/Object;
    .locals 1

    .line 582
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->referData:Ljava/lang/Object;

    return-object v0
.end method

.method public getStartTime()J
    .locals 2

    .line 505
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->startTime:J

    return-wide v0
.end method

.method public getSubType()I
    .locals 1

    .line 475
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->subType:I

    return v0
.end method

.method public getTimeZone()Ljava/lang/String;
    .locals 1

    .line 495
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->timeZone:Ljava/lang/String;

    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 465
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->type:I

    return v0
.end method

.method public isDuration()Z
    .locals 2

    .line 539
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->subType:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 541
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->subType:I

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/model/HealthData;->isDurationType(I)Z

    move-result v0

    return v0

    .line 545
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->type:I

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/model/HealthData;->isDurationType(I)Z

    move-result v0

    return v0
.end method

.method public setApp(Lcom/huawei/hihealthservice/old/model/AppInfo;)V
    .locals 0

    .line 646
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->app:Lcom/huawei/hihealthservice/old/model/AppInfo;

    .line 647
    return-void
.end method

.method public setAttribute(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 569
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->attributes:Ljava/util/Map;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 571
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->attributes:Ljava/util/Map;

    .line 573
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->attributes:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 575
    return-void
.end method

.method public setDevice(Lcom/huawei/hihealthservice/old/model/DeviceInfo;)V
    .locals 0

    .line 490
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->device:Lcom/huawei/hihealthservice/old/model/DeviceInfo;

    .line 491
    return-void
.end method

.method public setEndTime(J)V
    .locals 0

    .line 520
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->endTime:J

    .line 521
    return-void
.end method

.method public setHuid(J)V
    .locals 0

    .line 443
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->huid:J

    .line 444
    return-void
.end method

.method public setLocation(Lcom/huawei/hihealthservice/old/model/Location;)V
    .locals 0

    .line 530
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->location:Lcom/huawei/hihealthservice/old/model/Location;

    .line 531
    return-void
.end method

.method public setRecordId(Ljava/lang/String;)V
    .locals 0

    .line 460
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->recordId:Ljava/lang/String;

    .line 461
    return-void
.end method

.method public setReferData(Ljava/lang/Object;)V
    .locals 0

    .line 590
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->referData:Ljava/lang/Object;

    .line 591
    return-void
.end method

.method public setStartTime(J)V
    .locals 0

    .line 510
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->startTime:J

    .line 511
    return-void
.end method

.method public setSubType(I)V
    .locals 0

    .line 480
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->subType:I

    .line 481
    return-void
.end method

.method public setTimeZone(Ljava/lang/String;)V
    .locals 0

    .line 500
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->timeZone:Ljava/lang/String;

    .line 501
    return-void
.end method

.method public setType(I)V
    .locals 0

    .line 470
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->type:I

    .line 471
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 596
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 597
    const-string v0, ", type="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 598
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->type:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 599
    const-string v0, ", subType="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 600
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->subType:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 601
    const-string v0, ", device="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 602
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->device:Lcom/huawei/hihealthservice/old/model/DeviceInfo;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 603
    const-string v0, ", recordId="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 604
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->recordId:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 605
    const-string v0, ", timeZone="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 606
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->timeZone:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 607
    const-string v0, ", startTime="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 608
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->startTime:J

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 609
    const-string v0, ", endTime="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 610
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->endTime:J

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 611
    const-string v0, ", location="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 612
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->location:Lcom/huawei/hihealthservice/old/model/Location;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 613
    const-string v0, ", referData="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 614
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->referData:Ljava/lang/Object;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 615
    const-string v0, ", attributes="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 616
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/HealthData;->attributes:Ljava/util/Map;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 617
    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 618
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
