.class public Lcom/huawei/sns/sdk/modelmsg/GroupReq;
.super Lo/edw;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/sns/sdk/modelmsg/GroupReq;>;"
        }
    .end annotation
.end field

.field public static final GROUP_ALL:I = 0x2

.field public static final GROUP_COMMON:I = 0x1

.field public static final GROUP_FAMILY:I = 0x0

.field private static final TAG:Ljava/lang/String; = "GroupReq"


# instance fields
.field public groupType:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 96
    new-instance v0, Lcom/huawei/sns/sdk/modelmsg/GroupReq$4;

    invoke-direct {v0}, Lcom/huawei/sns/sdk/modelmsg/GroupReq$4;-><init>()V

    sput-object v0, Lcom/huawei/sns/sdk/modelmsg/GroupReq;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Lo/edw;-><init>()V

    .line 45
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 86
    invoke-direct {p0}, Lo/edw;-><init>()V

    .line 87
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupReq;->sdkversion:I

    .line 88
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupReq;->channel:I

    .line 89
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupReq;->transaction:Ljava/lang/String;

    .line 90
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupReq;->groupType:I

    .line 91
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/sns/sdk/modelmsg/GroupReq$4;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/huawei/sns/sdk/modelmsg/GroupReq;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public checkArgs()Z
    .locals 3

    .line 53
    iget-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupReq;->transaction:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/sns/sdk/modelmsg/GroupReq;->isStrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupReq;->groupType:I

    if-ltz v0, :cond_0

    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupReq;->groupType:I

    const/4 v1, 0x2

    if-le v0, v1, :cond_1

    .line 55
    :cond_0
    const-string v0, "GroupReq"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "GroupReq.checkArgs() invalid. groupType:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/sns/sdk/modelmsg/GroupReq;->groupType:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    const/4 v0, 0x0

    return v0

    .line 58
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public describeContents()I
    .locals 1

    .line 73
    const/4 v0, 0x0

    return v0
.end method

.method public getType()I
    .locals 1

    .line 67
    const/4 v0, 0x2

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 79
    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupReq;->sdkversion:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 80
    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupReq;->channel:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 81
    iget-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupReq;->transaction:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 82
    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupReq;->groupType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 83
    return-void
.end method
