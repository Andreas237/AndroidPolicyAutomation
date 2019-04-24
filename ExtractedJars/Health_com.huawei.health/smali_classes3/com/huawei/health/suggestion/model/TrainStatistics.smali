.class public Lcom/huawei/health/suggestion/model/TrainStatistics;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/suggestion/model/TrainStatistics;>;"
        }
    .end annotation
.end field


# instance fields
.field private calorie:J

.field private duration:J

.field private totalTimes:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 39
    new-instance v0, Lcom/huawei/health/suggestion/model/TrainStatistics$1;

    invoke-direct {v0}, Lcom/huawei/health/suggestion/model/TrainStatistics$1;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/model/TrainStatistics;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/model/TrainStatistics;->calorie:J

    .line 17
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/model/TrainStatistics;->duration:J

    .line 18
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/model/TrainStatistics;->totalTimes:J

    .line 19
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/model/TrainStatistics;->calorie:J

    .line 23
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/model/TrainStatistics;->duration:J

    .line 24
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/model/TrainStatistics;->totalTimes:J

    .line 25
    return-void
.end method


# virtual methods
.method public acquireCalorie()J
    .locals 2

    .line 52
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/TrainStatistics;->calorie:J

    return-wide v0
.end method

.method public acquireDuration()J
    .locals 2

    .line 60
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/TrainStatistics;->duration:J

    return-wide v0
.end method

.method public acquireTotalTimes()J
    .locals 2

    .line 68
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/TrainStatistics;->totalTimes:J

    return-wide v0
.end method

.method public describeContents()I
    .locals 1

    .line 36
    const/4 v0, 0x0

    return v0
.end method

.method public saveCalorie(J)V
    .locals 0

    .line 56
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/TrainStatistics;->calorie:J

    .line 57
    return-void
.end method

.method public saveDuration(J)V
    .locals 0

    .line 64
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/TrainStatistics;->duration:J

    .line 65
    return-void
.end method

.method public saveTotalTimes(J)V
    .locals 0

    .line 72
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/TrainStatistics;->totalTimes:J

    .line 73
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 29
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/TrainStatistics;->calorie:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 30
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/TrainStatistics;->duration:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 31
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/TrainStatistics;->totalTimes:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 32
    return-void
.end method
