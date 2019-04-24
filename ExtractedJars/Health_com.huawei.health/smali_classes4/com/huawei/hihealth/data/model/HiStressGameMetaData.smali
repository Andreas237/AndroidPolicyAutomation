.class public Lcom/huawei/hihealth/data/model/HiStressGameMetaData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/data/model/HiStressGameMetaData;>;"
        }
    .end annotation
.end field


# instance fields
.field private algorithmVer:Ljava/lang/Integer;

.field private bubbleR:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private bubbleX:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private bubbleY:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private deltaPressure:Ljava/lang/Integer;

.field private devNo:Ljava/lang/Integer;

.field private endTime:Ljava/lang/Long;

.field private frontPressure:Ljava/lang/Integer;

.field private maxHeartRate:Ljava/lang/Integer;

.field private meanHeartRate:Ljava/lang/Integer;

.field private minHeartRate:Ljava/lang/Integer;

.field private raderValue:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private raderValueAtts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private rearPressure:Ljava/lang/Integer;

.field private startTime:Ljava/lang/Long;

.field private statePercent:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private statePercentAtts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private totalTime:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 255
    new-instance v0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData$1;

    invoke-direct {v0}, Lcom/huawei/hihealth/data/model/HiStressGameMetaData$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 226
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 227
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 229
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 230
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->maxHeartRate:Ljava/lang/Integer;

    .line 231
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->minHeartRate:Ljava/lang/Integer;

    .line 232
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->meanHeartRate:Ljava/lang/Integer;

    .line 233
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->frontPressure:Ljava/lang/Integer;

    .line 234
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->rearPressure:Ljava/lang/Integer;

    .line 235
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->deltaPressure:Ljava/lang/Integer;

    .line 236
    const-class v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->startTime:Ljava/lang/Long;

    .line 237
    const-class v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->endTime:Ljava/lang/Long;

    .line 238
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->algorithmVer:Ljava/lang/Integer;

    .line 239
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->devNo:Ljava/lang/Integer;

    .line 240
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->totalTime:Ljava/lang/Integer;

    .line 241
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->statePercent:Ljava/util/List;

    .line 242
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->statePercent:Ljava/util/List;

    const-class v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 243
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->statePercentAtts:Ljava/util/List;

    .line 244
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->raderValue:Ljava/util/List;

    .line 245
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->raderValue:Ljava/util/List;

    const-class v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 246
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->raderValueAtts:Ljava/util/List;

    .line 247
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->bubbleX:Ljava/util/List;

    .line 248
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->bubbleX:Ljava/util/List;

    const-class v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 249
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->bubbleY:Ljava/util/List;

    .line 250
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->bubbleY:Ljava/util/List;

    const-class v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 251
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->bubbleR:Ljava/util/List;

    .line 252
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->bubbleR:Ljava/util/List;

    const-class v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 253
    return-void
.end method


# virtual methods
.method public configGame_algorithm_ver(I)V
    .locals 1

    .line 124
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->algorithmVer:Ljava/lang/Integer;

    .line 125
    return-void
.end method

.method public configGame_bubble_r(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Float;>;)V"
        }
    .end annotation

    .line 196
    iput-object p1, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->bubbleR:Ljava/util/List;

    .line 197
    return-void
.end method

.method public configGame_bubble_x(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 180
    iput-object p1, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->bubbleX:Ljava/util/List;

    .line 181
    return-void
.end method

.method public configGame_bubble_y(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Float;>;)V"
        }
    .end annotation

    .line 188
    iput-object p1, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->bubbleY:Ljava/util/List;

    .line 189
    return-void
.end method

.method public configGame_delta_pressure(I)V
    .locals 1

    .line 100
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->deltaPressure:Ljava/lang/Integer;

    .line 101
    return-void
.end method

.method public configGame_dev_no(I)V
    .locals 1

    .line 132
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->devNo:Ljava/lang/Integer;

    .line 133
    return-void
.end method

.method public configGame_end_time(J)V
    .locals 1

    .line 116
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->endTime:Ljava/lang/Long;

    .line 117
    return-void
.end method

.method public configGame_front_pressure(I)V
    .locals 1

    .line 84
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->frontPressure:Ljava/lang/Integer;

    .line 85
    return-void
.end method

.method public configGame_max_heartrate(I)V
    .locals 1

    .line 60
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->maxHeartRate:Ljava/lang/Integer;

    .line 61
    return-void
.end method

.method public configGame_mean_heartrate(I)V
    .locals 1

    .line 76
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->meanHeartRate:Ljava/lang/Integer;

    .line 77
    return-void
.end method

.method public configGame_min_heartrate(I)V
    .locals 1

    .line 68
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->minHeartRate:Ljava/lang/Integer;

    .line 69
    return-void
.end method

.method public configGame_rader_value(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Float;>;)V"
        }
    .end annotation

    .line 164
    iput-object p1, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->raderValue:Ljava/util/List;

    .line 165
    return-void
.end method

.method public configGame_rader_value_atts(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 172
    iput-object p1, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->raderValueAtts:Ljava/util/List;

    .line 173
    return-void
.end method

.method public configGame_rear_pressure(I)V
    .locals 1

    .line 92
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->rearPressure:Ljava/lang/Integer;

    .line 93
    return-void
.end method

.method public configGame_start_time(J)V
    .locals 1

    .line 108
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->startTime:Ljava/lang/Long;

    .line 109
    return-void
.end method

.method public configGame_state_percent(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 148
    iput-object p1, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->statePercent:Ljava/util/List;

    .line 149
    return-void
.end method

.method public configGame_state_percent_atts(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 156
    iput-object p1, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->statePercentAtts:Ljava/util/List;

    .line 157
    return-void
.end method

.method public configGame_total_time(I)V
    .locals 1

    .line 140
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->totalTime:Ljava/lang/Integer;

    .line 141
    return-void
.end method

.method public describeContents()I
    .locals 1

    .line 201
    const/4 v0, 0x0

    return v0
.end method

.method public fetchGame_algorithm_ver()I
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->algorithmVer:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchGame_bubble_r()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation

    .line 192
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->bubbleR:Ljava/util/List;

    return-object v0
.end method

.method public fetchGame_bubble_x()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 176
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->bubbleX:Ljava/util/List;

    return-object v0
.end method

.method public fetchGame_bubble_y()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation

    .line 184
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->bubbleY:Ljava/util/List;

    return-object v0
.end method

.method public fetchGame_delta_pressure()I
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->deltaPressure:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchGame_dev_no()I
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->devNo:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchGame_end_time()J
    .locals 2

    .line 112
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->endTime:Ljava/lang/Long;

    invoke-static {v0}, Lo/clu;->b(Ljava/lang/Long;)J

    move-result-wide v0

    return-wide v0
.end method

.method public fetchGame_front_pressure()I
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->frontPressure:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchGame_max_heartrate()I
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->maxHeartRate:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchGame_mean_heartrate()I
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->meanHeartRate:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchGame_min_heartrate()I
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->minHeartRate:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchGame_rader_value()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation

    .line 160
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->raderValue:Ljava/util/List;

    return-object v0
.end method

.method public fetchGame_rader_value_atts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 168
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->raderValueAtts:Ljava/util/List;

    return-object v0
.end method

.method public fetchGame_rear_pressure()I
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->rearPressure:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchGame_start_time()J
    .locals 2

    .line 104
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->startTime:Ljava/lang/Long;

    invoke-static {v0}, Lo/clu;->b(Ljava/lang/Long;)J

    move-result-wide v0

    return-wide v0
.end method

.method public fetchGame_state_percent()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 144
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->statePercent:Ljava/util/List;

    return-object v0
.end method

.method public fetchGame_state_percent_atts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 152
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->statePercentAtts:Ljava/util/List;

    return-object v0
.end method

.method public fetchGame_total_time()I
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->totalTime:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 206
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->maxHeartRate:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 207
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->minHeartRate:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 208
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->meanHeartRate:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 209
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->frontPressure:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 210
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->rearPressure:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 211
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->deltaPressure:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 212
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->startTime:Ljava/lang/Long;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 213
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->endTime:Ljava/lang/Long;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 214
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->algorithmVer:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 215
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->devNo:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 216
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->totalTime:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 217
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->statePercent:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 218
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->statePercentAtts:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 219
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->raderValue:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 220
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->raderValueAtts:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 221
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->bubbleX:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 222
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->bubbleY:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 223
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;->bubbleR:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 224
    return-void
.end method
