.class public Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;>;"
        }
    .end annotation
.end field


# instance fields
.field private algorithmVer:Ljava/lang/Integer;

.field private deltaPressure:Ljava/lang/Integer;

.field private devNo:Ljava/lang/Integer;

.field private endTime:Ljava/lang/Long;

.field private frontPressure:Ljava/lang/Integer;

.field private maxHeartRate:Ljava/lang/Integer;

.field private meanHeartRate:Ljava/lang/Integer;

.field private minHeartRate:Ljava/lang/Integer;

.field private rearPressure:Ljava/lang/Integer;

.field private startTime:Ljava/lang/Long;

.field private subBalance:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private subGrade:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private subScore:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private totalBalance:Ljava/lang/Float;

.field private totalGrade:Ljava/lang/Integer;

.field private totalScore:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 230
    new-instance v0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData$1;

    invoke-direct {v0}, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 205
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 206
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 208
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 209
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->maxHeartRate:Ljava/lang/Integer;

    .line 210
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->minHeartRate:Ljava/lang/Integer;

    .line 211
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->meanHeartRate:Ljava/lang/Integer;

    .line 212
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->frontPressure:Ljava/lang/Integer;

    .line 213
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->rearPressure:Ljava/lang/Integer;

    .line 214
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->deltaPressure:Ljava/lang/Integer;

    .line 215
    const-class v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->startTime:Ljava/lang/Long;

    .line 216
    const-class v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->endTime:Ljava/lang/Long;

    .line 217
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->algorithmVer:Ljava/lang/Integer;

    .line 218
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->devNo:Ljava/lang/Integer;

    .line 219
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->totalScore:Ljava/lang/Integer;

    .line 220
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->totalGrade:Ljava/lang/Integer;

    .line 221
    const-class v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->totalBalance:Ljava/lang/Float;

    .line 222
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->subScore:Ljava/util/List;

    .line 223
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->subScore:Ljava/util/List;

    const-class v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 224
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->subGrade:Ljava/util/List;

    .line 225
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->subGrade:Ljava/util/List;

    const-class v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 226
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->subBalance:Ljava/util/List;

    .line 227
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->subBalance:Ljava/util/List;

    const-class v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 228
    return-void
.end method


# virtual methods
.method public configBreathe_algorithm_ver(I)V
    .locals 1

    .line 121
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->algorithmVer:Ljava/lang/Integer;

    .line 122
    return-void
.end method

.method public configBreathe_delta_pressure(I)V
    .locals 1

    .line 97
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->deltaPressure:Ljava/lang/Integer;

    .line 98
    return-void
.end method

.method public configBreathe_dev_no(I)V
    .locals 1

    .line 129
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->devNo:Ljava/lang/Integer;

    .line 130
    return-void
.end method

.method public configBreathe_end_time(J)V
    .locals 1

    .line 113
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->endTime:Ljava/lang/Long;

    .line 114
    return-void
.end method

.method public configBreathe_front_pressure(I)V
    .locals 1

    .line 81
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->frontPressure:Ljava/lang/Integer;

    .line 82
    return-void
.end method

.method public configBreathe_max_heartrate(I)V
    .locals 1

    .line 57
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->maxHeartRate:Ljava/lang/Integer;

    .line 58
    return-void
.end method

.method public configBreathe_mean_heartrate(I)V
    .locals 1

    .line 73
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->meanHeartRate:Ljava/lang/Integer;

    .line 74
    return-void
.end method

.method public configBreathe_min_heartrate(I)V
    .locals 1

    .line 65
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->minHeartRate:Ljava/lang/Integer;

    .line 66
    return-void
.end method

.method public configBreathe_rear_pressure(I)V
    .locals 1

    .line 89
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->rearPressure:Ljava/lang/Integer;

    .line 90
    return-void
.end method

.method public configBreathe_start_time(J)V
    .locals 1

    .line 105
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->startTime:Ljava/lang/Long;

    .line 106
    return-void
.end method

.method public configBreathe_sub_balance(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Float;>;)V"
        }
    .end annotation

    .line 177
    iput-object p1, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->subBalance:Ljava/util/List;

    .line 178
    return-void
.end method

.method public configBreathe_sub_grade(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 169
    iput-object p1, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->subGrade:Ljava/util/List;

    .line 170
    return-void
.end method

.method public configBreathe_sub_score(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 161
    iput-object p1, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->subScore:Ljava/util/List;

    .line 162
    return-void
.end method

.method public configBreathe_total_balance(F)V
    .locals 1

    .line 153
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->totalBalance:Ljava/lang/Float;

    .line 154
    return-void
.end method

.method public configBreathe_total_grade(I)V
    .locals 1

    .line 145
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->totalGrade:Ljava/lang/Integer;

    .line 146
    return-void
.end method

.method public configBreathe_total_score(I)V
    .locals 1

    .line 137
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->totalScore:Ljava/lang/Integer;

    .line 138
    return-void
.end method

.method public describeContents()I
    .locals 1

    .line 182
    const/4 v0, 0x0

    return v0
.end method

.method public fetchBreathe_algorithm_ver()I
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->algorithmVer:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchBreathe_delta_pressure()I
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->deltaPressure:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchBreathe_dev_no()I
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->devNo:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchBreathe_end_time()J
    .locals 2

    .line 109
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->endTime:Ljava/lang/Long;

    invoke-static {v0}, Lo/clu;->b(Ljava/lang/Long;)J

    move-result-wide v0

    return-wide v0
.end method

.method public fetchBreathe_front_pressure()I
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->frontPressure:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchBreathe_max_heartrate()I
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->maxHeartRate:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchBreathe_mean_heartrate()I
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->meanHeartRate:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchBreathe_min_heartrate()I
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->minHeartRate:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchBreathe_rear_pressure()I
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->rearPressure:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchBreathe_start_time()J
    .locals 2

    .line 101
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->startTime:Ljava/lang/Long;

    invoke-static {v0}, Lo/clu;->b(Ljava/lang/Long;)J

    move-result-wide v0

    return-wide v0
.end method

.method public fetchBreathe_sub_balance()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation

    .line 173
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->subBalance:Ljava/util/List;

    return-object v0
.end method

.method public fetchBreathe_sub_grade()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 165
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->subGrade:Ljava/util/List;

    return-object v0
.end method

.method public fetchBreathe_sub_score()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 157
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->subScore:Ljava/util/List;

    return-object v0
.end method

.method public fetchBreathe_total_balance()F
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->totalBalance:Ljava/lang/Float;

    invoke-static {v0}, Lo/clu;->a(Ljava/lang/Float;)F

    move-result v0

    return v0
.end method

.method public fetchBreathe_total_grade()I
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->totalGrade:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchBreathe_total_score()I
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->totalScore:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 187
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->maxHeartRate:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 188
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->minHeartRate:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 189
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->meanHeartRate:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 190
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->frontPressure:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 191
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->rearPressure:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 192
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->deltaPressure:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 193
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->startTime:Ljava/lang/Long;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 194
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->endTime:Ljava/lang/Long;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 195
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->algorithmVer:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 196
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->devNo:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 197
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->totalScore:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 198
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->totalGrade:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 199
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->totalBalance:Ljava/lang/Float;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 200
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->subScore:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 201
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->subGrade:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 202
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressBreatheMetaData;->subBalance:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 203
    return-void
.end method
