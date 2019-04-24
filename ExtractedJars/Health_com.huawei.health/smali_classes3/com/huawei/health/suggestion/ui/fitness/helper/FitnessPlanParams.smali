.class public Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;>;"
        }
    .end annotation
.end field


# instance fields
.field private beginDate:J

.field private difficulty:I

.field private excludedDate:Ljava/util/TreeSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeSet<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private gender:I

.field private times:I

.field private type:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 123
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams$4;

    invoke-direct {v0}, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams$4;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->beginDate:J

    .line 116
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->type:I

    .line 117
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->gender:I

    .line 118
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->difficulty:I

    .line 119
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->times:I

    .line 120
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/TreeSet;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->excludedDate:Ljava/util/TreeSet;

    .line 121
    return-void
.end method


# virtual methods
.method public acquireBeginDate()J
    .locals 2

    .line 48
    iget-wide v0, p0, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->beginDate:J

    return-wide v0
.end method

.method public acquireDifficulty()I
    .locals 1

    .line 72
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->difficulty:I

    return v0
.end method

.method public acquireExcludedDate()Ljava/util/TreeSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/TreeSet<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 88
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->excludedDate:Ljava/util/TreeSet;

    return-object v0
.end method

.method public acquireTimes()I
    .locals 1

    .line 80
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->times:I

    return v0
.end method

.method public acquireType()I
    .locals 1

    .line 56
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->type:I

    return v0
.end method

.method public describeContents()I
    .locals 1

    .line 98
    const/4 v0, 0x0

    return v0
.end method

.method public getGender()I
    .locals 1

    .line 64
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->gender:I

    return v0
.end method

.method public setBeginDate(J)V
    .locals 0

    .line 52
    iput-wide p1, p0, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->beginDate:J

    .line 53
    return-void
.end method

.method public setDifficulty(I)V
    .locals 0

    .line 76
    iput p1, p0, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->difficulty:I

    .line 77
    return-void
.end method

.method public setExcludedDate(Ljava/util/TreeSet;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/TreeSet<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 92
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->excludedDate:Ljava/util/TreeSet;

    .line 93
    return-void
.end method

.method public setGender(I)V
    .locals 0

    .line 68
    iput p1, p0, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->gender:I

    .line 69
    return-void
.end method

.method public setTimes(I)V
    .locals 0

    .line 84
    iput p1, p0, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->times:I

    .line 85
    return-void
.end method

.method public setType(I)V
    .locals 0

    .line 60
    iput p1, p0, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->type:I

    .line 61
    return-void
.end method

.method public uadpDC1()V
    .locals 0

    .line 137
    return-void
.end method

.method public uadpDC2()V
    .locals 0

    .line 141
    return-void
.end method

.method public uadpDC3()V
    .locals 0

    .line 145
    return-void
.end method

.method public uadpDC4()V
    .locals 0

    .line 149
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 103
    iget-wide v0, p0, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->beginDate:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 104
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->type:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 105
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->gender:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 106
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->difficulty:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 107
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->times:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 108
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->excludedDate:Ljava/util/TreeSet;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 109
    return-void
.end method
