.class public Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;
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
    name = "DaysBean"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;>;"
        }
    .end annotation
.end field


# instance fields
.field private early_wake_up:I

.field private easy_awake:I

.field private irregular_fall_sleep:I

.field private irregular_wake_up:I

.field private lack_sleep:I

.field private late_fall_sleep:I

.field private low_REM_sleep:I

.field private low_all_sleep_late_fall_sleep:I

.field private low_breath_quality:I

.field private low_deep_sleep:I

.field private low_deep_sleep_late_fall_sleep:I

.field private over_REM_late_fall_sleep:I

.field private over_REM_sleep:I

.field private over_sleep:I

.field private upper_score:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 330
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean$3;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean$3;-><init>()V

    sput-object v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 309
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 310
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 312
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 313
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->upper_score:I

    .line 314
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->over_sleep:I

    .line 315
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->lack_sleep:I

    .line 316
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->irregular_wake_up:I

    .line 317
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->irregular_fall_sleep:I

    .line 318
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->late_fall_sleep:I

    .line 319
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->low_deep_sleep:I

    .line 320
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->low_breath_quality:I

    .line 321
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->over_REM_sleep:I

    .line 322
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->low_REM_sleep:I

    .line 323
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->early_wake_up:I

    .line 324
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->easy_awake:I

    .line 325
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->low_deep_sleep_late_fall_sleep:I

    .line 326
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->low_all_sleep_late_fall_sleep:I

    .line 327
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->over_REM_late_fall_sleep:I

    .line 328
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 285
    const/4 v0, 0x0

    return v0
.end method

.method public getEarly_wake_up()I
    .locals 4

    .line 239
    const-string v0, "CoreSleepTotalData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DaysBean early_wake_up:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->early_wake_up:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->early_wake_up:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getEasy_awake()I
    .locals 4

    .line 248
    const-string v0, "CoreSleepTotalData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DaysBean easy_awake:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->easy_awake:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->easy_awake:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getIrregular_fall_sleep()I
    .locals 1

    .line 187
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->irregular_fall_sleep:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getIrregular_wake_up()I
    .locals 1

    .line 179
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->irregular_wake_up:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getLack_sleep()I
    .locals 1

    .line 171
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->lack_sleep:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getLate_fall_sleep()I
    .locals 1

    .line 195
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->late_fall_sleep:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getLow_REM_sleep()I
    .locals 4

    .line 230
    const-string v0, "CoreSleepTotalData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DaysBean low_REM_sleep:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->low_REM_sleep:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->low_REM_sleep:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getLow_all_sleep_late_fall_sleep()I
    .locals 4

    .line 266
    const-string v0, "CoreSleepTotalData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DaysBean low_all_sleep_late_fall_sleep:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->low_all_sleep_late_fall_sleep:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->low_all_sleep_late_fall_sleep:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getLow_breath_quality()I
    .locals 4

    .line 212
    const-string v0, "CoreSleepTotalData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DaysBean low_breath_quality:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->low_breath_quality:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->low_breath_quality:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getLow_deep_sleep()I
    .locals 4

    .line 203
    const-string v0, "CoreSleepTotalData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DaysBean low_deep_sleep:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->low_deep_sleep:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->low_deep_sleep:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getLow_deep_sleep_late_fall_sleep()I
    .locals 4

    .line 257
    const-string v0, "CoreSleepTotalData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DaysBean low_deep_sleep_late_fall_sleep:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->low_deep_sleep_late_fall_sleep:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->low_deep_sleep_late_fall_sleep:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getOver_REM_late_fall_sleep()I
    .locals 4

    .line 275
    const-string v0, "CoreSleepTotalData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DaysBean over_REM_late_fall_sleep:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->over_REM_late_fall_sleep:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->over_REM_late_fall_sleep:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getOver_REM_sleep()I
    .locals 4

    .line 221
    const-string v0, "CoreSleepTotalData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " DaysBean over_REM_sleep:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->over_REM_sleep:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->over_REM_sleep:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getOver_sleep()I
    .locals 1

    .line 163
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->over_sleep:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getUpper_score()I
    .locals 1

    .line 155
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->upper_score:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public setEarly_wake_up(I)V
    .locals 0

    .line 244
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->early_wake_up:I

    .line 245
    return-void
.end method

.method public setEasy_awake(I)V
    .locals 0

    .line 253
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->easy_awake:I

    .line 254
    return-void
.end method

.method public setIrregular_fall_sleep(I)V
    .locals 0

    .line 191
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->irregular_fall_sleep:I

    .line 192
    return-void
.end method

.method public setIrregular_wake_up(I)V
    .locals 0

    .line 183
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->irregular_wake_up:I

    .line 184
    return-void
.end method

.method public setLack_sleep(I)V
    .locals 0

    .line 175
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->lack_sleep:I

    .line 176
    return-void
.end method

.method public setLate_fall_sleep(I)V
    .locals 0

    .line 199
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->late_fall_sleep:I

    .line 200
    return-void
.end method

.method public setLow_REM_sleep(I)V
    .locals 0

    .line 235
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->low_REM_sleep:I

    .line 236
    return-void
.end method

.method public setLow_all_sleep_late_fall_sleep(I)V
    .locals 0

    .line 271
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->low_all_sleep_late_fall_sleep:I

    .line 272
    return-void
.end method

.method public setLow_breath_quality(I)V
    .locals 0

    .line 217
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->low_breath_quality:I

    .line 218
    return-void
.end method

.method public setLow_deep_sleep(I)V
    .locals 0

    .line 208
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->low_deep_sleep:I

    .line 209
    return-void
.end method

.method public setLow_deep_sleep_late_fall_sleep(I)V
    .locals 0

    .line 262
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->low_deep_sleep_late_fall_sleep:I

    .line 263
    return-void
.end method

.method public setOver_REM_late_fall_sleep(I)V
    .locals 0

    .line 280
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->over_REM_late_fall_sleep:I

    .line 281
    return-void
.end method

.method public setOver_REM_sleep(I)V
    .locals 0

    .line 226
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->over_REM_sleep:I

    .line 227
    return-void
.end method

.method public setOver_sleep(I)V
    .locals 0

    .line 167
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->over_sleep:I

    .line 168
    return-void
.end method

.method public setUpper_score(I)V
    .locals 0

    .line 159
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->upper_score:I

    .line 160
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 290
    const-string v0, "CoreSleepTotalData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DaysBean writeToParcel"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 291
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->upper_score:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 292
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->over_sleep:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 293
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->lack_sleep:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 294
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->irregular_wake_up:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 295
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->irregular_fall_sleep:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 296
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->late_fall_sleep:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 297
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->low_deep_sleep:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 298
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->low_breath_quality:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 299
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->over_REM_sleep:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 300
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->low_REM_sleep:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 301
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->early_wake_up:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 302
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->easy_awake:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 303
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->low_deep_sleep_late_fall_sleep:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 304
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->low_all_sleep_late_fall_sleep:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 305
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;->over_REM_late_fall_sleep:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 306
    const-string v0, "CoreSleepTotalData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DaysBean writeToParcel"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    return-void
.end method
