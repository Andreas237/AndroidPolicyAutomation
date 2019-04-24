.class public Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq;
.super Lo/edw;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq;>;"
        }
    .end annotation
.end field

.field public static final GROUP_IMAGE:I = 0x1

.field private static final TAG:Ljava/lang/String; = "DownloadImageReq"

.field public static final USER_IMAGE:I = 0x0


# instance fields
.field public id:J

.field public imageType:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 99
    new-instance v0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq$4;

    invoke-direct {v0}, Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq$4;-><init>()V

    sput-object v0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Lo/edw;-><init>()V

    .line 46
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 88
    invoke-direct {p0}, Lo/edw;-><init>()V

    .line 89
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq;->sdkversion:I

    .line 90
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq;->channel:I

    .line 91
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq;->transaction:Ljava/lang/String;

    .line 92
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq;->imageType:I

    .line 93
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq;->id:J

    .line 94
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq$4;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public checkArgs()Z
    .locals 4

    .line 54
    iget-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq;->transaction:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq;->isStrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq;->imageType:I

    if-ltz v0, :cond_0

    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq;->imageType:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    iget-wide v0, p0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq;->id:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq;->handler:Lo/eeh;

    if-nez v0, :cond_1

    .line 56
    :cond_0
    const-string v0, "DownloadImageReq"

    const-string v1, "DownloadImageReq.checkArgs() invalid."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    const/4 v0, 0x0

    return v0

    .line 59
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public describeContents()I
    .locals 1

    .line 74
    const/4 v0, 0x0

    return v0
.end method

.method public getType()I
    .locals 1

    .line 68
    const/4 v0, 0x7

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 80
    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq;->sdkversion:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 81
    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq;->channel:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 82
    iget-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq;->transaction:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 83
    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq;->imageType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 84
    iget-wide v0, p0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq;->id:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 85
    return-void
.end method
