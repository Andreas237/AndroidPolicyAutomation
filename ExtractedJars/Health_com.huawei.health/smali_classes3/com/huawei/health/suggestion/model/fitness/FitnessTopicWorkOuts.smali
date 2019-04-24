.class public Lcom/huawei/health/suggestion/model/fitness/FitnessTopicWorkOuts;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/suggestion/model/fitness/FitnessTopicWorkOuts;>;"
        }
    .end annotation
.end field


# instance fields
.field private hasMore:Z

.field private pageSize:I

.field private resultCode:I

.field private resultDesc:I

.field private total:I

.field private workoutList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 94
    new-instance v0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopicWorkOuts$1;

    invoke-direct {v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessTopicWorkOuts$1;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopicWorkOuts;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopicWorkOuts;->resultCode:I

    .line 72
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopicWorkOuts;->resultDesc:I

    .line 73
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopicWorkOuts;->total:I

    .line 74
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopicWorkOuts;->pageSize:I

    .line 75
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopicWorkOuts;->hasMore:Z

    .line 76
    sget-object v0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopicWorkOuts;->workoutList:Ljava/util/List;

    .line 77
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 91
    const/4 v0, 0x0

    return v0
.end method

.method public getPageSize()I
    .locals 1

    .line 47
    iget v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopicWorkOuts;->pageSize:I

    return v0
.end method

.method public getResultCode()I
    .locals 1

    .line 23
    iget v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopicWorkOuts;->resultCode:I

    return v0
.end method

.method public getResultDesc()I
    .locals 1

    .line 31
    iget v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopicWorkOuts;->resultDesc:I

    return v0
.end method

.method public getTotal()I
    .locals 1

    .line 39
    iget v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopicWorkOuts;->total:I

    return v0
.end method

.method public getWorkoutList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;"
        }
    .end annotation

    .line 63
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopicWorkOuts;->workoutList:Ljava/util/List;

    return-object v0
.end method

.method public isHasMore()Z
    .locals 1

    .line 55
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopicWorkOuts;->hasMore:Z

    return v0
.end method

.method public setHasMore(Z)V
    .locals 0

    .line 59
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopicWorkOuts;->hasMore:Z

    .line 60
    return-void
.end method

.method public setPageSize(I)V
    .locals 0

    .line 51
    iput p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopicWorkOuts;->pageSize:I

    .line 52
    return-void
.end method

.method public setResultCode(I)V
    .locals 0

    .line 27
    iput p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopicWorkOuts;->resultCode:I

    .line 28
    return-void
.end method

.method public setResultDesc(I)V
    .locals 0

    .line 35
    iput p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopicWorkOuts;->resultDesc:I

    .line 36
    return-void
.end method

.method public setTotal(I)V
    .locals 0

    .line 43
    iput p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopicWorkOuts;->total:I

    .line 44
    return-void
.end method

.method public setWorkoutList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 67
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopicWorkOuts;->workoutList:Ljava/util/List;

    .line 68
    return-void
.end method

.method public uadpFitnessTopicWorkOutsStruct1()V
    .locals 0

    .line 109
    return-void
.end method

.method public uadpFitnessTopicWorkOutsStruct2()V
    .locals 0

    .line 111
    return-void
.end method

.method public uadpFitnessTopicWorkOutsStruct3()V
    .locals 0

    .line 113
    return-void
.end method

.method public uadpFitnessTopicWorkOutsStruct4()V
    .locals 0

    .line 115
    return-void
.end method

.method public uadpFitnessTopicWorkOutsStruct5()V
    .locals 0

    .line 117
    return-void
.end method

.method public uadpFitnessTopicWorkOutsStruct6()V
    .locals 0

    .line 119
    return-void
.end method

.method public uadpFitnessTopicWorkOutsStruct7()V
    .locals 0

    .line 121
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 81
    iget v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopicWorkOuts;->resultCode:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 82
    iget v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopicWorkOuts;->resultDesc:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 83
    iget v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopicWorkOuts;->total:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 84
    iget v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopicWorkOuts;->pageSize:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 85
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopicWorkOuts;->hasMore:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 86
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopicWorkOuts;->workoutList:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 87
    return-void
.end method
