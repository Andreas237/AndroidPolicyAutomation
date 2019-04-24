.class public Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;
.super Lo/edv;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;>;"
        }
    .end annotation
.end field


# instance fields
.field public groupMemList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/sns/sdk/modelmsg/GroupMemInfo;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 65
    new-instance v0, Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp$5;

    invoke-direct {v0}, Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp$5;-><init>()V

    sput-object v0, Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Lo/edv;-><init>()V

    .line 34
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 38
    invoke-direct {p0}, Lo/edv;-><init>()V

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;->errorCode:I

    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;->errorReason:Ljava/lang/String;

    .line 41
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;->transaction:Ljava/lang/String;

    .line 43
    const-class v0, Lcom/huawei/sns/sdk/modelmsg/GroupMemInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;->groupMemList:Ljava/util/List;

    .line 44
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp$5;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 49
    const/4 v0, 0x0

    return v0
.end method

.method public getType()I
    .locals 1

    .line 25
    const/16 v0, 0x8

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 55
    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;->errorCode:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 56
    iget-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;->errorReason:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 57
    iget-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;->transaction:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 59
    iget-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;->groupMemList:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 60
    return-void
.end method
