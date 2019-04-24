.class public Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MeanBean"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;>;"
        }
    .end annotation
.end field


# instance fields
.field private REM_scale:I

.field private all_sleep_time:I

.field private awake_cnt:I

.field private awake_time:I

.field private breath_quality:I

.field private deep_sleep_part_cnt:I

.field private deep_sleep_scale:I

.field private deep_sleep_time:I

.field private efficency:I

.field private fall_sleep_time:I

.field private latency:I

.field private score:I

.field private snore_cnt:I

.field private wake_up_time:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 533
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean$3;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean$3;-><init>()V

    sput-object v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 513
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 514
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 516
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 517
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->score:I

    .line 518
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->wake_up_time:I

    .line 519
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->all_sleep_time:I

    .line 520
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->awake_time:I

    .line 521
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->deep_sleep_time:I

    .line 522
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->deep_sleep_part_cnt:I

    .line 523
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->deep_sleep_scale:I

    .line 524
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->REM_scale:I

    .line 525
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->breath_quality:I

    .line 526
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->fall_sleep_time:I

    .line 527
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->awake_cnt:I

    .line 528
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->snore_cnt:I

    .line 529
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->efficency:I

    .line 530
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->latency:I

    .line 531
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 492
    const/4 v0, 0x0

    return v0
.end method

.method public getAll_sleep_time()I
    .locals 1

    .line 395
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->all_sleep_time:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getAwake_cnt()I
    .locals 1

    .line 459
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->awake_cnt:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getAwake_time()I
    .locals 1

    .line 403
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->awake_time:I

    return v0
.end method

.method public getBreath_quality()I
    .locals 1

    .line 443
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->breath_quality:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDeep_sleep_part_cnt()I
    .locals 1

    .line 419
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->deep_sleep_part_cnt:I

    return v0
.end method

.method public getDeep_sleep_scale()I
    .locals 1

    .line 427
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->deep_sleep_scale:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDeep_sleep_time()I
    .locals 1

    .line 411
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->deep_sleep_time:I

    return v0
.end method

.method public getEfficency()I
    .locals 1

    .line 475
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->efficency:I

    return v0
.end method

.method public getFall_sleep_time()I
    .locals 1

    .line 451
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->fall_sleep_time:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getLatency()I
    .locals 1

    .line 483
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->latency:I

    return v0
.end method

.method public getREM_scale()I
    .locals 1

    .line 435
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->REM_scale:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getScore()I
    .locals 1

    .line 377
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->score:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getSnore_cnt()I
    .locals 1

    .line 467
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->snore_cnt:I

    return v0
.end method

.method public getWake_up_time()I
    .locals 1

    .line 386
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->wake_up_time:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public setAll_sleep_time(I)V
    .locals 0

    .line 399
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->all_sleep_time:I

    .line 400
    return-void
.end method

.method public setAwake_cnt(I)V
    .locals 0

    .line 463
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->awake_cnt:I

    .line 464
    return-void
.end method

.method public setAwake_time(I)V
    .locals 0

    .line 407
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->awake_time:I

    .line 408
    return-void
.end method

.method public setBreath_quality(I)V
    .locals 0

    .line 447
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->breath_quality:I

    .line 448
    return-void
.end method

.method public setDeep_sleep_part_cnt(I)V
    .locals 0

    .line 423
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->deep_sleep_part_cnt:I

    .line 424
    return-void
.end method

.method public setDeep_sleep_scale(I)V
    .locals 0

    .line 431
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->deep_sleep_scale:I

    .line 432
    return-void
.end method

.method public setDeep_sleep_time(I)V
    .locals 0

    .line 415
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->deep_sleep_time:I

    .line 416
    return-void
.end method

.method public setEfficency(I)V
    .locals 0

    .line 479
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->efficency:I

    .line 480
    return-void
.end method

.method public setFall_sleep_time(I)V
    .locals 0

    .line 455
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->fall_sleep_time:I

    .line 456
    return-void
.end method

.method public setLatency(I)V
    .locals 0

    .line 487
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->latency:I

    .line 488
    return-void
.end method

.method public setREM_scale(I)V
    .locals 0

    .line 439
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->REM_scale:I

    .line 440
    return-void
.end method

.method public setScore(I)V
    .locals 0

    .line 381
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->score:I

    .line 382
    return-void
.end method

.method public setSnore_cnt(I)V
    .locals 0

    .line 471
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->snore_cnt:I

    .line 472
    return-void
.end method

.method public setWake_up_time(I)V
    .locals 4

    .line 390
    const-string v0, "CoreSleepTotalData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MeanBean wake_up_time:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 391
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->wake_up_time:I

    .line 392
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 497
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->score:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 498
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->wake_up_time:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 499
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->all_sleep_time:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 500
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->awake_time:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 501
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->deep_sleep_time:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 502
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->deep_sleep_part_cnt:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 503
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->deep_sleep_scale:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 504
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->REM_scale:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 505
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->breath_quality:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 506
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->fall_sleep_time:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 507
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->awake_cnt:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 508
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->snore_cnt:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 509
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->efficency:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 510
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;->latency:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 511
    return-void
.end method
