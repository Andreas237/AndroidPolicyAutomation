.class public Lcom/huawei/sns/sdk/modelmsg/GroupInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/sns/sdk/modelmsg/GroupInfo;>;"
        }
    .end annotation
.end field

.field public static final GROUP_COMMON:I = 0x1

.field public static final GROUP_FAMILY:I = 0x0


# instance fields
.field public groupId:J

.field public groupType:I

.field public imagePath:Ljava/lang/String;

.field public managerUid:J

.field public name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 62
    new-instance v0, Lcom/huawei/sns/sdk/modelmsg/GroupInfo$2;

    invoke-direct {v0}, Lcom/huawei/sns/sdk/modelmsg/GroupInfo$2;-><init>()V

    sput-object v0, Lcom/huawei/sns/sdk/modelmsg/GroupInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupInfo;->groupId:J

    .line 43
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupInfo;->name:Ljava/lang/String;

    .line 44
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupInfo;->groupType:I

    .line 45
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupInfo;->imagePath:Ljava/lang/String;

    .line 46
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupInfo;->managerUid:J

    .line 47
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/sns/sdk/modelmsg/GroupInfo$2;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Lcom/huawei/sns/sdk/modelmsg/GroupInfo;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 78
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 52
    iget-wide v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupInfo;->groupId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 53
    iget-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupInfo;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 54
    iget v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupInfo;->groupType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 55
    iget-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupInfo;->imagePath:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 56
    iget-wide v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupInfo;->managerUid:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 57
    return-void
.end method
