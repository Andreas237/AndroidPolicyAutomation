.class public Lcom/huawei/health/suggestion/model/PlanStatistics;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/suggestion/model/PlanStatistics;>;"
        }
    .end annotation
.end field


# instance fields
.field private totalCalorie:J

.field private totalDuration:J

.field private totalPlan:I

.field private type:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 39
    new-instance v0, Lcom/huawei/health/suggestion/model/PlanStatistics$1;

    invoke-direct {v0}, Lcom/huawei/health/suggestion/model/PlanStatistics$1;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/model/PlanStatistics;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/model/PlanStatistics;->totalCalorie:J

    .line 12
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/model/PlanStatistics;->totalDuration:J

    .line 13
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/model/PlanStatistics;->totalPlan:I

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/model/PlanStatistics;->type:I

    .line 17
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/model/PlanStatistics;->totalCalorie:J

    .line 12
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/model/PlanStatistics;->totalDuration:J

    .line 13
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/model/PlanStatistics;->totalPlan:I

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/model/PlanStatistics;->type:I

    .line 20
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/model/PlanStatistics;->totalCalorie:J

    .line 21
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/model/PlanStatistics;->totalDuration:J

    .line 22
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/PlanStatistics;->totalPlan:I

    .line 23
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/PlanStatistics;->type:I

    .line 24
    return-void
.end method


# virtual methods
.method public acquireCalorie()J
    .locals 2

    .line 52
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/PlanStatistics;->totalCalorie:J

    return-wide v0
.end method

.method public acquireDuration()J
    .locals 2

    .line 60
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/PlanStatistics;->totalDuration:J

    return-wide v0
.end method

.method public acquireTotalPlan()I
    .locals 1

    .line 68
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanStatistics;->totalPlan:I

    return v0
.end method

.method public acquireType()J
    .locals 2

    .line 76
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanStatistics;->type:I

    int-to-long v0, v0

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
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/PlanStatistics;->totalCalorie:J

    .line 57
    return-void
.end method

.method public saveDuration(J)V
    .locals 0

    .line 64
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/PlanStatistics;->totalDuration:J

    .line 65
    return-void
.end method

.method public saveTotalPlan(I)V
    .locals 0

    .line 72
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanStatistics;->totalPlan:I

    .line 73
    return-void
.end method

.method public saveType(I)V
    .locals 0

    .line 80
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanStatistics;->type:I

    .line 81
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 28
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/PlanStatistics;->totalCalorie:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 29
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/PlanStatistics;->totalDuration:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 30
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanStatistics;->totalPlan:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 31
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanStatistics;->type:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 32
    return-void
.end method
