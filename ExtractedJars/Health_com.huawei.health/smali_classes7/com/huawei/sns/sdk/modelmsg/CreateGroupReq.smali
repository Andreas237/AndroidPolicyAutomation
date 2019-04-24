.class public Lcom/huawei/sns/sdk/modelmsg/CreateGroupReq;
.super Lo/edw;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/sns/sdk/modelmsg/CreateGroupReq;>;"
        }
    .end annotation
.end field

.field public static final GROUP_COMMON:I = 0x1

.field public static final GROUP_FAMILY:I = 0x0

.field private static final TAG:Ljava/lang/String; = "CreateGroupReq"


# instance fields
.field public groupType:I

.field public needCallback:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 92
    new-instance v0, Lcom/huawei/sns/sdk/modelmsg/CreateGroupReq$3;

    invoke-direct {v0}, Lcom/huawei/sns/sdk/modelmsg/CreateGroupReq$3;-><init>()V

    sput-object v0, Lcom/huawei/sns/sdk/modelmsg/CreateGroupReq;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 54
    invoke-direct {p0}, Lo/edw;-><init>()V

    .line 56
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 71
    invoke-direct {p0}, Lo/edw;-><init>()V

    .line 72
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/sns/sdk/modelmsg/CreateGroupReq;->sdkversion:I

    .line 73
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/sns/sdk/modelmsg/CreateGroupReq;->channel:I

    .line 74
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/CreateGroupReq;->transaction:Ljava/lang/String;

    .line 76
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/sns/sdk/modelmsg/CreateGroupReq;->groupType:I

    .line 78
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 79
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    .line 81
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/sns/sdk/modelmsg/CreateGroupReq;->needCallback:Z

    goto :goto_0

    .line 85
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/sns/sdk/modelmsg/CreateGroupReq;->needCallback:Z

    .line 87
    :goto_0
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/sns/sdk/modelmsg/CreateGroupReq$3;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lcom/huawei/sns/sdk/modelmsg/CreateGroupReq;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public checkArgs()Z
    .locals 3

    .line 36
    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/CreateGroupReq;->groupType:I

    if-ltz v0, :cond_0

    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/CreateGroupReq;->groupType:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/CreateGroupReq;->transaction:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/sns/sdk/modelmsg/CreateGroupReq;->isStrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 38
    :cond_0
    const-string v0, "CreateGroupReq"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CreateGroupReq.checkArgs() invalid. groupType:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/sns/sdk/modelmsg/CreateGroupReq;->groupType:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    const/4 v0, 0x0

    return v0

    .line 41
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public describeContents()I
    .locals 1

    .line 108
    const/4 v0, 0x0

    return v0
.end method

.method public getAction()Ljava/lang/String;
    .locals 2

    .line 60
    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/CreateGroupReq;->groupType:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 62
    const-string v0, "com.huawei.sns.sdk.CREATE_NORMAL_GROUP_VIEW"

    return-object v0

    .line 64
    :cond_0
    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/CreateGroupReq;->groupType:I

    if-nez v0, :cond_1

    .line 66
    const-string v0, "com.huawei.sns.sdk.CREATE_GROUP_VIEW"

    return-object v0

    .line 68
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 47
    const/4 v0, 0x6

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 114
    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/CreateGroupReq;->sdkversion:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 115
    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/CreateGroupReq;->channel:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 116
    iget-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/CreateGroupReq;->transaction:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 118
    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/CreateGroupReq;->groupType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 120
    iget-boolean v0, p0, Lcom/huawei/sns/sdk/modelmsg/CreateGroupReq;->needCallback:Z

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 121
    :goto_0
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 122
    return-void
.end method
