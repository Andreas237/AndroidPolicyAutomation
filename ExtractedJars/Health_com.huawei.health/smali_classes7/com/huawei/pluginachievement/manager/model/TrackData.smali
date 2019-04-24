.class public Lcom/huawei/pluginachievement/manager/model/TrackData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/pluginachievement/manager/model/TrackData;>;"
        }
    .end annotation
.end field


# instance fields
.field private bestPace:F

.field private distance:F

.field private endTime:J

.field private paceMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private partTimeMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Double;Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private sportDataSource:I

.field private trackTime:J

.field private type:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 84
    new-instance v0, Lcom/huawei/pluginachievement/manager/model/TrackData$2;

    invoke-direct {v0}, Lcom/huawei/pluginachievement/manager/model/TrackData$2;-><init>()V

    sput-object v0, Lcom/huawei/pluginachievement/manager/model/TrackData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->partTimeMap:Ljava/util/Map;

    .line 48
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->sportDataSource:I

    .line 53
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->paceMap:Ljava/util/Map;

    .line 56
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->partTimeMap:Ljava/util/Map;

    .line 48
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->sportDataSource:I

    .line 53
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->paceMap:Ljava/util/Map;

    .line 59
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->distance:F

    .line 60
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->type:I

    .line 61
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->trackTime:J

    .line 62
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->endTime:J

    .line 63
    iget-object v0, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->partTimeMap:Ljava/util/Map;

    const-class v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readMap(Ljava/util/Map;Ljava/lang/ClassLoader;)V

    .line 64
    iget-object v0, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->paceMap:Ljava/util/Map;

    const-class v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readMap(Ljava/util/Map;Ljava/lang/ClassLoader;)V

    .line 65
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->sportDataSource:I

    .line 66
    return-void
.end method


# virtual methods
.method public acquireBestPace()F
    .locals 1

    .line 153
    iget v0, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->bestPace:F

    return v0
.end method

.method public acquireDistance()F
    .locals 1

    .line 97
    iget v0, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->distance:F

    return v0
.end method

.method public acquireEndTime()J
    .locals 2

    .line 121
    iget-wide v0, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->endTime:J

    return-wide v0
.end method

.method public acquirePaceMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;"
        }
    .end annotation

    .line 145
    iget-object v0, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->paceMap:Ljava/util/Map;

    return-object v0
.end method

.method public acquirePartTimeMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Double;Ljava/lang/Double;>;"
        }
    .end annotation

    .line 129
    iget-object v0, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->partTimeMap:Ljava/util/Map;

    return-object v0
.end method

.method public acquireSportDataSource()I
    .locals 1

    .line 137
    iget v0, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->sportDataSource:I

    return v0
.end method

.method public acquireTrackTime()J
    .locals 2

    .line 113
    iget-wide v0, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->trackTime:J

    return-wide v0
.end method

.method public acquireType()I
    .locals 1

    .line 105
    iget v0, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->type:I

    return v0
.end method

.method public describeContents()I
    .locals 1

    .line 81
    const/4 v0, 0x0

    return v0
.end method

.method public saveBestPace(F)V
    .locals 0

    .line 157
    iput p1, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->bestPace:F

    .line 158
    return-void
.end method

.method public saveDistance(F)V
    .locals 0

    .line 101
    iput p1, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->distance:F

    .line 102
    return-void
.end method

.method public saveEndTime(J)V
    .locals 0

    .line 125
    iput-wide p1, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->endTime:J

    .line 126
    return-void
.end method

.method public savePaceMap(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;)V"
        }
    .end annotation

    .line 149
    iput-object p1, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->paceMap:Ljava/util/Map;

    .line 150
    return-void
.end method

.method public savePartTimeMap(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Double;Ljava/lang/Double;>;)V"
        }
    .end annotation

    .line 133
    iput-object p1, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->partTimeMap:Ljava/util/Map;

    .line 134
    return-void
.end method

.method public saveSportDataSource(I)V
    .locals 0

    .line 141
    iput p1, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->sportDataSource:I

    .line 142
    return-void
.end method

.method public saveTrackTime(J)V
    .locals 0

    .line 117
    iput-wide p1, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->trackTime:J

    .line 118
    return-void
.end method

.method public saveType(I)V
    .locals 0

    .line 109
    iput p1, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->type:I

    .line 110
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 70
    iget v0, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->distance:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 71
    iget v0, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->type:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 72
    iget-wide v0, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->trackTime:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 73
    iget-wide v0, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->endTime:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 74
    iget-object v0, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->partTimeMap:Ljava/util/Map;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    .line 75
    iget-object v0, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->paceMap:Ljava/util/Map;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    .line 76
    iget v0, p0, Lcom/huawei/pluginachievement/manager/model/TrackData;->sportDataSource:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 77
    return-void
.end method
