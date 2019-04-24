.class public Lcom/huawei/lcagent/client/LogMetricInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/lcagent/client/LogMetricInfo;>;"
        }
    .end annotation
.end field


# instance fields
.field public description:Ljava/lang/String;

.field public files:[Ljava/lang/String;

.field public id:J

.field public logDetailedInfo:Ljava/lang/String;

.field public path:Ljava/lang/String;

.field public zipTime:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 84
    new-instance v0, Lcom/huawei/lcagent/client/LogMetricInfo$1;

    invoke-direct {v0}, Lcom/huawei/lcagent/client/LogMetricInfo$1;-><init>()V

    sput-object v0, Lcom/huawei/lcagent/client/LogMetricInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 6
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->id:J

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->description:Ljava/lang/String;

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->files:[Ljava/lang/String;

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->path:Ljava/lang/String;

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->zipTime:Ljava/lang/String;

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->logDetailedInfo:Ljava/lang/String;

    .line 39
    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-wide p1, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->id:J

    .line 43
    iput-object p3, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->path:Ljava/lang/String;

    .line 44
    iput-object p4, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->description:Ljava/lang/String;

    .line 45
    iput-object p6, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->zipTime:Ljava/lang/String;

    .line 46
    iput-object p7, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->logDetailedInfo:Ljava/lang/String;

    .line 48
    if-eqz p5, :cond_0

    array-length v0, p5

    if-nez v0, :cond_1

    .line 49
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->files:[Ljava/lang/String;

    goto :goto_1

    .line 51
    :cond_1
    array-length v0, p5

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->files:[Ljava/lang/String;

    .line 52
    array-length v2, p5

    .line 54
    const/4 v3, 0x0

    goto :goto_0

    .line 55
    :cond_2
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->files:[Ljava/lang/String;

    aget-object v1, p5, v3

    aput-object v1, v0, v3

    .line 54
    add-int/lit8 v3, v3, 0x1

    :goto_0
    if-lt v3, v2, :cond_2

    .line 58
    :goto_1
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->id:J

    .line 62
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->path:Ljava/lang/String;

    .line 63
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->description:Ljava/lang/String;

    .line 64
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->files:[Ljava/lang/String;

    .line 65
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->zipTime:Ljava/lang/String;

    .line 66
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->logDetailedInfo:Ljava/lang/String;

    .line 67
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/lcagent/client/LogMetricInfo;)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Lcom/huawei/lcagent/client/LogMetricInfo;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 71
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 98
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "id = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->id:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "path = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->path:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "description = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->description:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->files:[Ljava/lang/String;

    if-nez v0, :cond_0

    .line 103
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 105
    :cond_0
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->files:[Ljava/lang/String;

    array-length v4, v0

    .line 107
    const/4 v5, 0x0

    goto :goto_0

    .line 108
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "files["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->files:[Ljava/lang/String;

    aget-object v1, v1, v5

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    add-int/lit8 v5, v5, 0x1

    :goto_0
    if-lt v5, v4, :cond_1

    .line 110
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "zipTime = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->zipTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "logDetailedInfo = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->logDetailedInfo:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 76
    iget-wide v0, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->id:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 77
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->path:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 78
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->description:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 79
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->files:[Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 80
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->zipTime:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 81
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogMetricInfo;->logDetailedInfo:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 82
    return-void
.end method
