.class public Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;
.super Lo/edw;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;>;"
        }
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "GroupMemReq"


# instance fields
.field public groupId:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 82
    new-instance v0, Lcom/huawei/sns/sdk/modelmsg/GroupMemReq$4;

    invoke-direct {v0}, Lcom/huawei/sns/sdk/modelmsg/GroupMemReq$4;-><init>()V

    sput-object v0, Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Lo/edw;-><init>()V

    .line 31
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 72
    invoke-direct {p0}, Lo/edw;-><init>()V

    .line 73
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;->sdkversion:I

    .line 74
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;->channel:I

    .line 75
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;->transaction:Ljava/lang/String;

    .line 76
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;->groupId:J

    .line 77
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/sns/sdk/modelmsg/GroupMemReq$4;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public checkArgs()Z
    .locals 4

    .line 39
    iget-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;->transaction:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;->isStrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;->groupId:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_1

    .line 41
    :cond_0
    const-string v0, "GroupMemReq"

    const-string v1, "GroupMemReq.checkArgs() invalid"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    const/4 v0, 0x0

    return v0

    .line 44
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public describeContents()I
    .locals 1

    .line 59
    const/4 v0, 0x0

    return v0
.end method

.method public getType()I
    .locals 1

    .line 53
    const/4 v0, 0x3

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 65
    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;->sdkversion:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 66
    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;->channel:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 67
    iget-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;->transaction:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 68
    iget-wide v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;->groupId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 69
    return-void
.end method
