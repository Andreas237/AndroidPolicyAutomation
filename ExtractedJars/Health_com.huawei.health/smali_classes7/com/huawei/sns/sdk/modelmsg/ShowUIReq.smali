.class public Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;
.super Lo/edw;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;>;"
        }
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "ShowUIReq"

.field public static final UI_CHAT_ASSIST:I = 0x7

.field public static final UI_CHAT_FRIEND:I = 0x5

.field public static final UI_CHAT_GROUP:I = 0x6

.field public static final UI_COMMON_GROUP:I = 0x3

.field public static final UI_FAMILY_GROUP:I = 0x2

.field public static final UI_FRIEND:I = 0x1

.field public static final UI_MSG:I = 0x0

.field public static final UI_USER_DETAIL:I = 0x4


# instance fields
.field public param:J

.field public ui:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 104
    new-instance v0, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq$4;

    invoke-direct {v0}, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq$4;-><init>()V

    sput-object v0, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 76
    invoke-direct {p0}, Lo/edw;-><init>()V

    .line 78
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 81
    invoke-direct {p0}, Lo/edw;-><init>()V

    .line 82
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->sdkversion:I

    .line 83
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->channel:I

    .line 84
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->transaction:Ljava/lang/String;

    .line 86
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->ui:I

    .line 87
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->param:J

    .line 88
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/sns/sdk/modelmsg/ShowUIReq$4;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public checkArgs()Z
    .locals 2

    .line 52
    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->ui:I

    if-ltz v0, :cond_0

    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->ui:I

    const/4 v1, 0x7

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->transaction:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->isStrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 54
    :cond_0
    const-string v0, "ShowUIReq"

    const-string v1, "ShowUIReq.checkArgs() invalid."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 55
    const/4 v0, 0x0

    return v0

    .line 57
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public describeContents()I
    .locals 1

    .line 69
    const/4 v0, 0x0

    return v0
.end method

.method public getType()I
    .locals 1

    .line 63
    const/4 v0, 0x5

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 93
    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->sdkversion:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 94
    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->channel:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 95
    iget-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->transaction:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 97
    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->ui:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 98
    iget-wide v0, p0, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->param:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 99
    return-void
.end method
