.class public Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;>;"
        }
    .end annotation
.end field


# instance fields
.field private sportData:Ljava/lang/String;

.field private sportEndTime:J

.field private sportKeepTime:Ljava/lang/String;

.field private sportSpeed:Ljava/lang/String;

.field private sportSpeedUnit:Ljava/lang/String;

.field private sportStartTime:J

.field private sportTime:Ljava/lang/String;

.field private sportType:I

.field private sportTypeName:Ljava/lang/String;

.field private sportUnit:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 181
    new-instance v0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean$5;

    invoke-direct {v0}, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean$5;-><init>()V

    sput-object v0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 165
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportType:I

    .line 18
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportTime:Ljava/lang/String;

    .line 22
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportUnit:Ljava/lang/String;

    .line 26
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportTypeName:Ljava/lang/String;

    .line 31
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportSpeedUnit:Ljava/lang/String;

    .line 37
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportKeepTime:Ljava/lang/String;

    .line 41
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportData:Ljava/lang/String;

    .line 45
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportSpeed:Ljava/lang/String;

    .line 47
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportStartTime:J

    .line 49
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportEndTime:J

    .line 166
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 168
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportType:I

    .line 18
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportTime:Ljava/lang/String;

    .line 22
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportUnit:Ljava/lang/String;

    .line 26
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportTypeName:Ljava/lang/String;

    .line 31
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportSpeedUnit:Ljava/lang/String;

    .line 37
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportKeepTime:Ljava/lang/String;

    .line 41
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportData:Ljava/lang/String;

    .line 45
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportSpeed:Ljava/lang/String;

    .line 47
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportStartTime:J

    .line 49
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportEndTime:J

    .line 169
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportType:I

    .line 170
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportTime:Ljava/lang/String;

    .line 171
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportUnit:Ljava/lang/String;

    .line 172
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportTypeName:Ljava/lang/String;

    .line 173
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportSpeedUnit:Ljava/lang/String;

    .line 174
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportKeepTime:Ljava/lang/String;

    .line 175
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportData:Ljava/lang/String;

    .line 176
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportSpeed:Ljava/lang/String;

    .line 177
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportStartTime:J

    .line 178
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportEndTime:J

    .line 179
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 148
    const/4 v0, 0x0

    return v0
.end method

.method public getSportData()Ljava/lang/String;
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportData:Ljava/lang/String;

    return-object v0
.end method

.method public getSportEndTime()J
    .locals 2

    .line 76
    iget-wide v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportEndTime:J

    return-wide v0
.end method

.method public getSportKeepTime()Ljava/lang/String;
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportKeepTime:Ljava/lang/String;

    return-object v0
.end method

.method public getSportSpeed()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportSpeed:Ljava/lang/String;

    return-object v0
.end method

.method public getSportSpeedUnit()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportSpeedUnit:Ljava/lang/String;

    return-object v0
.end method

.method public getSportStartTime()J
    .locals 2

    .line 68
    iget-wide v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportStartTime:J

    return-wide v0
.end method

.method public getSportTime()Ljava/lang/String;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportTime:Ljava/lang/String;

    return-object v0
.end method

.method public getSportType()I
    .locals 1

    .line 84
    iget v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportType:I

    return v0
.end method

.method public getSportTypeName()Ljava/lang/String;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportTypeName:Ljava/lang/String;

    return-object v0
.end method

.method public getSportUnit()Ljava/lang/String;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportUnit:Ljava/lang/String;

    return-object v0
.end method

.method public setSportData(Ljava/lang/String;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportData:Ljava/lang/String;

    .line 129
    return-void
.end method

.method public setSportEndTime(J)V
    .locals 0

    .line 80
    iput-wide p1, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportEndTime:J

    .line 81
    return-void
.end method

.method public setSportKeepTime(Ljava/lang/String;)V
    .locals 0

    .line 120
    iput-object p1, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportKeepTime:Ljava/lang/String;

    .line 121
    return-void
.end method

.method public setSportSpeed(Ljava/lang/String;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportSpeed:Ljava/lang/String;

    .line 65
    return-void
.end method

.method public setSportSpeedUnit(Ljava/lang/String;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportSpeedUnit:Ljava/lang/String;

    .line 57
    return-void
.end method

.method public setSportStartTime(J)V
    .locals 0

    .line 72
    iput-wide p1, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportStartTime:J

    .line 73
    return-void
.end method

.method public setSportTime(Ljava/lang/String;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportTime:Ljava/lang/String;

    .line 97
    return-void
.end method

.method public setSportType(I)V
    .locals 0

    .line 88
    iput p1, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportType:I

    .line 89
    return-void
.end method

.method public setSportTypeName(Ljava/lang/String;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportTypeName:Ljava/lang/String;

    .line 113
    return-void
.end method

.method public setSportUnit(Ljava/lang/String;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportUnit:Ljava/lang/String;

    .line 105
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 153
    iget v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 154
    iget-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportTime:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 155
    iget-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportUnit:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportTypeName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 157
    iget-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportSpeedUnit:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 158
    iget-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportKeepTime:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 159
    iget-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportData:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 160
    iget-object v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportSpeed:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 161
    iget-wide v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportStartTime:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 162
    iget-wide v0, p0, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;->sportEndTime:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 163
    return-void
.end method
