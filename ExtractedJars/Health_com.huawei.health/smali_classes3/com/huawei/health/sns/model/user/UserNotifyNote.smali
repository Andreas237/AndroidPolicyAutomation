.class public Lcom/huawei/health/sns/model/user/UserNotifyNote;
.super Lo/bfh;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/model/user/UserNotifyNote;>;"
        }
    .end annotation
.end field

.field public static final RECIEVED_MSG:I = 0x1

.field public static final SELF_SEND_MSG:I = 0x0


# instance fields
.field private id:I

.field private note:Ljava/lang/String;

.field private pkg:Ljava/lang/String;

.field private sendTime:Ljava/lang/String;

.field private sender:I

.field private type:I

.field private userId:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 90
    new-instance v0, Lcom/huawei/health/sns/model/user/UserNotifyNote$5;

    invoke-direct {v0}, Lcom/huawei/health/sns/model/user/UserNotifyNote$5;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/model/user/UserNotifyNote;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 54
    invoke-direct {p0}, Lo/bfh;-><init>()V

    .line 56
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 59
    invoke-direct {p0}, Lo/bfh;-><init>()V

    .line 60
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/user/UserNotifyNote;->id:I

    .line 61
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/user/UserNotifyNote;->userId:J

    .line 62
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotifyNote;->sendTime:Ljava/lang/String;

    .line 63
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotifyNote;->note:Ljava/lang/String;

    .line 64
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/user/UserNotifyNote;->sender:I

    .line 65
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/user/UserNotifyNote;->type:I

    .line 66
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotifyNote;->pkg:Ljava/lang/String;

    .line 67
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/health/sns/model/user/UserNotifyNote$5;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/model/user/UserNotifyNote;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 72
    const/4 v0, 0x0

    return v0
.end method

.method public getAppPackage()Ljava/lang/String;
    .locals 1

    .line 160
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotifyNote;->pkg:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 105
    iget v0, p0, Lcom/huawei/health/sns/model/user/UserNotifyNote;->id:I

    .line 106
    return v0
.end method

.method public getNote()Ljava/lang/String;
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotifyNote;->note:Ljava/lang/String;

    .line 139
    return-object v0
.end method

.method public getSendTime()Ljava/lang/String;
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotifyNote;->sendTime:Ljava/lang/String;

    .line 128
    return-object v0
.end method

.method public getSender()I
    .locals 1

    .line 149
    iget v0, p0, Lcom/huawei/health/sns/model/user/UserNotifyNote;->sender:I

    .line 150
    return v0
.end method

.method public getType()I
    .locals 1

    .line 170
    iget v0, p0, Lcom/huawei/health/sns/model/user/UserNotifyNote;->type:I

    .line 171
    return v0
.end method

.method public getUserId()J
    .locals 2

    .line 116
    iget-wide v0, p0, Lcom/huawei/health/sns/model/user/UserNotifyNote;->userId:J

    .line 117
    return-wide v0
.end method

.method public setAppPackage(Ljava/lang/String;)V
    .locals 0

    .line 165
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/UserNotifyNote;->pkg:Ljava/lang/String;

    .line 166
    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 111
    iput p1, p0, Lcom/huawei/health/sns/model/user/UserNotifyNote;->id:I

    .line 112
    return-void
.end method

.method public setNote(Ljava/lang/String;)V
    .locals 0

    .line 144
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/UserNotifyNote;->note:Ljava/lang/String;

    .line 145
    return-void
.end method

.method public setSendTime(Ljava/lang/String;)V
    .locals 0

    .line 133
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/UserNotifyNote;->sendTime:Ljava/lang/String;

    .line 134
    return-void
.end method

.method public setSender(I)V
    .locals 0

    .line 155
    iput p1, p0, Lcom/huawei/health/sns/model/user/UserNotifyNote;->sender:I

    .line 156
    return-void
.end method

.method public setType(I)V
    .locals 0

    .line 176
    iput p1, p0, Lcom/huawei/health/sns/model/user/UserNotifyNote;->type:I

    .line 177
    return-void
.end method

.method public setUserId(J)V
    .locals 0

    .line 122
    iput-wide p1, p0, Lcom/huawei/health/sns/model/user/UserNotifyNote;->userId:J

    .line 123
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 78
    iget v0, p0, Lcom/huawei/health/sns/model/user/UserNotifyNote;->id:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 79
    iget-wide v0, p0, Lcom/huawei/health/sns/model/user/UserNotifyNote;->userId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 80
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotifyNote;->sendTime:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 81
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotifyNote;->note:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 82
    iget v0, p0, Lcom/huawei/health/sns/model/user/UserNotifyNote;->sender:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 83
    iget v0, p0, Lcom/huawei/health/sns/model/user/UserNotifyNote;->type:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 84
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotifyNote;->pkg:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 85
    return-void
.end method
