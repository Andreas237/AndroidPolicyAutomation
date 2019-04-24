.class public Lcom/huawei/sns/sdk/modelmsg/CommonReq;
.super Lo/edw;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/sns/sdk/modelmsg/CommonReq;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 73
    new-instance v0, Lcom/huawei/sns/sdk/modelmsg/CommonReq$3;

    invoke-direct {v0}, Lcom/huawei/sns/sdk/modelmsg/CommonReq$3;-><init>()V

    sput-object v0, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Lo/edw;-><init>()V

    .line 23
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 63
    invoke-direct {p0}, Lo/edw;-><init>()V

    .line 64
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->sdkversion:I

    .line 65
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->channel:I

    .line 66
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->transaction:Ljava/lang/String;

    .line 68
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/sns/sdk/modelmsg/CommonReq$3;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/huawei/sns/sdk/modelmsg/CommonReq;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public checkArgs()Z
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->transaction:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->isStrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 33
    const/4 v0, 0x0

    return v0

    .line 35
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public describeContents()I
    .locals 1

    .line 50
    const/4 v0, 0x0

    return v0
.end method

.method public getType()I
    .locals 1

    .line 44
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 56
    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->sdkversion:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 57
    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->channel:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 58
    iget-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->transaction:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 60
    return-void
.end method
