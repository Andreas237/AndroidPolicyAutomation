.class public Lcom/huawei/sns/sdk/modelmsg/ImageInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/sns/sdk/modelmsg/ImageInfo;>;"
        }
    .end annotation
.end field


# instance fields
.field public id:J

.field public imagePath:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 45
    new-instance v0, Lcom/huawei/sns/sdk/modelmsg/ImageInfo$3;

    invoke-direct {v0}, Lcom/huawei/sns/sdk/modelmsg/ImageInfo$3;-><init>()V

    sput-object v0, Lcom/huawei/sns/sdk/modelmsg/ImageInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/sns/sdk/modelmsg/ImageInfo;->id:J

    .line 32
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/ImageInfo;->imagePath:Ljava/lang/String;

    .line 33
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/sns/sdk/modelmsg/ImageInfo$3;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Lcom/huawei/sns/sdk/modelmsg/ImageInfo;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 61
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 38
    iget-wide v0, p0, Lcom/huawei/sns/sdk/modelmsg/ImageInfo;->id:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 39
    iget-object v0, p0, Lcom/huawei/sns/sdk/modelmsg/ImageInfo;->imagePath:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 40
    return-void
.end method
