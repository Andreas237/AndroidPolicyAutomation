.class public Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp;
.super Lo/edv;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp;>;"
        }
    .end annotation
.end field


# instance fields
.field public id:J

.field public imagePath:Ljava/lang/String;

.field public imageType:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 69
    new-instance v0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp$2;

    invoke-direct {v0}, Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp$2;-><init>()V

    sput-object v0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Lo/edv;-><init>()V

    .line 35
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 38
    invoke-direct {p0}, Lo/edv;-><init>()V

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp;->errorCode:I

    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp;->errorReason:Ljava/lang/String;

    .line 41
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp;->transaction:Ljava/lang/String;

    .line 43
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp;->imageType:I

    .line 44
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp;->id:J

    .line 45
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp;->imagePath:Ljava/lang/String;

    .line 46
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp$2;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 51
    const/4 v0, 0x0

    return v0
.end method

.method public getType()I
    .locals 1

    .line 29
    const/16 v0, 0x9

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 57
    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp;->errorCode:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 58
    iget-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp;->errorReason:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 59
    iget-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp;->transaction:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 61
    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp;->imageType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 62
    iget-wide v0, p0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp;->id:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 63
    iget-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp;->imagePath:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 64
    return-void
.end method
