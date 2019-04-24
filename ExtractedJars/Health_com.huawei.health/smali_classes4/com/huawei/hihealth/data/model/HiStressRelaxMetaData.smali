.class public Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;>;"
        }
    .end annotation
.end field


# instance fields
.field private algorithmVer:Ljava/lang/Integer;

.field private deltaPressure:Ljava/lang/Integer;

.field private devNo:Ljava/lang/Integer;

.field private endTime:Ljava/lang/Long;

.field private feature:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private featureAtts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private frontPressure:Ljava/lang/Integer;

.field private maxHeartRate:Ljava/lang/Integer;

.field private meanHeartRate:Ljava/lang/Integer;

.field private minHeartRate:Ljava/lang/Integer;

.field private rearPressure:Ljava/lang/Integer;

.field private startTime:Ljava/lang/Long;

.field private subLevelCoded:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private totalLevel:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 204
    new-instance v0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData$1;

    invoke-direct {v0}, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 182
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 183
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 185
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 186
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->maxHeartRate:Ljava/lang/Integer;

    .line 187
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->minHeartRate:Ljava/lang/Integer;

    .line 188
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->meanHeartRate:Ljava/lang/Integer;

    .line 189
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->frontPressure:Ljava/lang/Integer;

    .line 190
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->rearPressure:Ljava/lang/Integer;

    .line 191
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->deltaPressure:Ljava/lang/Integer;

    .line 192
    const-class v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->startTime:Ljava/lang/Long;

    .line 193
    const-class v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->endTime:Ljava/lang/Long;

    .line 194
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->algorithmVer:Ljava/lang/Integer;

    .line 195
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->devNo:Ljava/lang/Integer;

    .line 196
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->totalLevel:Ljava/lang/Integer;

    .line 197
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->feature:Ljava/util/List;

    .line 198
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->feature:Ljava/util/List;

    const-class v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 199
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->featureAtts:Ljava/util/List;

    .line 200
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->subLevelCoded:Ljava/util/List;

    .line 201
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->subLevelCoded:Ljava/util/List;

    const-class v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 202
    return-void
.end method


# virtual methods
.method public configRelax_algorithm_ver(I)V
    .locals 1

    .line 116
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->algorithmVer:Ljava/lang/Integer;

    .line 117
    return-void
.end method

.method public configRelax_delta_pressure(I)V
    .locals 1

    .line 92
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->deltaPressure:Ljava/lang/Integer;

    .line 93
    return-void
.end method

.method public configRelax_dev_no(I)V
    .locals 1

    .line 124
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->devNo:Ljava/lang/Integer;

    .line 125
    return-void
.end method

.method public configRelax_end_time(J)V
    .locals 1

    .line 108
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->endTime:Ljava/lang/Long;

    .line 109
    return-void
.end method

.method public configRelax_feature(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Float;>;)V"
        }
    .end annotation

    .line 140
    iput-object p1, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->feature:Ljava/util/List;

    .line 141
    return-void
.end method

.method public configRelax_feature_atts(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 148
    iput-object p1, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->featureAtts:Ljava/util/List;

    .line 149
    return-void
.end method

.method public configRelax_front_pressure(I)V
    .locals 1

    .line 76
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->frontPressure:Ljava/lang/Integer;

    .line 77
    return-void
.end method

.method public configRelax_max_heartrate(I)V
    .locals 1

    .line 52
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->maxHeartRate:Ljava/lang/Integer;

    .line 53
    return-void
.end method

.method public configRelax_mean_heartrate(I)V
    .locals 1

    .line 68
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->meanHeartRate:Ljava/lang/Integer;

    .line 69
    return-void
.end method

.method public configRelax_min_heartrate(I)V
    .locals 1

    .line 60
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->minHeartRate:Ljava/lang/Integer;

    .line 61
    return-void
.end method

.method public configRelax_rear_pressure(I)V
    .locals 1

    .line 84
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->rearPressure:Ljava/lang/Integer;

    .line 85
    return-void
.end method

.method public configRelax_start_time(J)V
    .locals 1

    .line 100
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->startTime:Ljava/lang/Long;

    .line 101
    return-void
.end method

.method public configRelax_sub_level_coded(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 156
    iput-object p1, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->subLevelCoded:Ljava/util/List;

    .line 157
    return-void
.end method

.method public configRelax_total_level(I)V
    .locals 1

    .line 132
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->totalLevel:Ljava/lang/Integer;

    .line 133
    return-void
.end method

.method public describeContents()I
    .locals 1

    .line 161
    const/4 v0, 0x0

    return v0
.end method

.method public fetchRelax_algorithm_ver()I
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->algorithmVer:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchRelax_delta_pressure()I
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->deltaPressure:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchRelax_dev_no()I
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->devNo:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchRelax_end_time()J
    .locals 2

    .line 104
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->endTime:Ljava/lang/Long;

    invoke-static {v0}, Lo/clu;->b(Ljava/lang/Long;)J

    move-result-wide v0

    return-wide v0
.end method

.method public fetchRelax_feature()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation

    .line 136
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->feature:Ljava/util/List;

    return-object v0
.end method

.method public fetchRelax_feature_atts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 144
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->featureAtts:Ljava/util/List;

    return-object v0
.end method

.method public fetchRelax_front_pressure()I
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->frontPressure:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchRelax_max_heartrate()I
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->maxHeartRate:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchRelax_mean_heartrate()I
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->meanHeartRate:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchRelax_min_heartrate()I
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->minHeartRate:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchRelax_rear_pressure()I
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->rearPressure:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchRelax_start_time()J
    .locals 2

    .line 96
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->startTime:Ljava/lang/Long;

    invoke-static {v0}, Lo/clu;->b(Ljava/lang/Long;)J

    move-result-wide v0

    return-wide v0
.end method

.method public fetchRelax_sub_level_coded()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 152
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->subLevelCoded:Ljava/util/List;

    return-object v0
.end method

.method public fetchRelax_total_level()I
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->totalLevel:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 166
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->maxHeartRate:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 167
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->minHeartRate:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 168
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->meanHeartRate:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 169
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->frontPressure:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 170
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->rearPressure:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 171
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->deltaPressure:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 172
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->startTime:Ljava/lang/Long;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 173
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->endTime:Ljava/lang/Long;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 174
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->algorithmVer:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 175
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->devNo:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 176
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->totalLevel:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 177
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->feature:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 178
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->featureAtts:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 179
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressRelaxMetaData;->subLevelCoded:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 180
    return-void
.end method
