.class public Lcom/huawei/sns/sdk/modelmsg/GroupMemInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/sns/sdk/modelmsg/GroupMemInfo;>;"
        }
    .end annotation
.end field


# instance fields
.field public displayName:Ljava/lang/String;

.field public imagePath:Ljava/lang/String;

.field public joinTime:Ljava/lang/String;

.field public userId:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 55
    new-instance v0, Lcom/huawei/sns/sdk/modelmsg/GroupMemInfo$4;

    invoke-direct {v0}, Lcom/huawei/sns/sdk/modelmsg/GroupMemInfo$4;-><init>()V

    sput-object v0, Lcom/huawei/sns/sdk/modelmsg/GroupMemInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupMemInfo;->userId:J

    .line 38
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupMemInfo;->displayName:Ljava/lang/String;

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupMemInfo;->imagePath:Ljava/lang/String;

    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupMemInfo;->joinTime:Ljava/lang/String;

    .line 41
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/sns/sdk/modelmsg/GroupMemInfo$4;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Lcom/huawei/sns/sdk/modelmsg/GroupMemInfo;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 71
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 46
    iget-wide v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupMemInfo;->userId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 47
    iget-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupMemInfo;->displayName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 48
    iget-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupMemInfo;->imagePath:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 49
    iget-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/GroupMemInfo;->joinTime:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 50
    return-void
.end method
