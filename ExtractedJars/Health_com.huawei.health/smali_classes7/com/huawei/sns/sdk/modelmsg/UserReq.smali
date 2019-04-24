.class public Lcom/huawei/sns/sdk/modelmsg/UserReq;
.super Lo/edw;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/sns/sdk/modelmsg/UserReq;>;"
        }
    .end annotation
.end field


# instance fields
.field public userid:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 72
    new-instance v0, Lcom/huawei/sns/sdk/modelmsg/UserReq$4;

    invoke-direct {v0}, Lcom/huawei/sns/sdk/modelmsg/UserReq$4;-><init>()V

    sput-object v0, Lcom/huawei/sns/sdk/modelmsg/UserReq;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Lo/edw;-><init>()V

    .line 41
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 49
    invoke-direct {p0}, Lo/edw;-><init>()V

    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/sns/sdk/modelmsg/UserReq;->sdkversion:I

    .line 51
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/sns/sdk/modelmsg/UserReq;->channel:I

    .line 53
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/UserReq;->transaction:Ljava/lang/String;

    .line 54
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/sns/sdk/modelmsg/UserReq;->userid:J

    .line 56
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/sns/sdk/modelmsg/UserReq$4;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/huawei/sns/sdk/modelmsg/UserReq;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public checkArgs()Z
    .locals 4

    .line 22
    iget-wide v0, p0, Lcom/huawei/sns/sdk/modelmsg/UserReq;->userid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/UserReq;->transaction:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/sns/sdk/modelmsg/UserReq;->isStrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/UserReq;->handler:Lo/eeh;

    if-nez v0, :cond_1

    .line 24
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 26
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public describeContents()I
    .locals 1

    .line 88
    const/4 v0, 0x0

    return v0
.end method

.method public getType()I
    .locals 1

    .line 32
    const/4 v0, 0x1

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 61
    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/UserReq;->sdkversion:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 62
    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/UserReq;->channel:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 64
    iget-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/UserReq;->transaction:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 65
    iget-wide v0, p0, Lcom/huawei/sns/sdk/modelmsg/UserReq;->userid:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 67
    return-void
.end method
