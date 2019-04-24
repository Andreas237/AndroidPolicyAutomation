.class public Lcom/unionpay/tsmservice/data/UpdateInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/data/UpdateInfo;>;"
        }
    .end annotation
.end field

.field public static final TYPE_MUST:Ljava/lang/String; = "02"

.field public static final TYPE_NONE:Ljava/lang/String; = "00"

.field public static final TYPE_OPTION:Ljava/lang/String; = "01"


# instance fields
.field private mClientDigest:Ljava/lang/String;

.field private mDesc:[Ljava/lang/String;

.field private mDownloadUrl:Ljava/lang/String;

.field private mType:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    new-instance v0, Lcom/unionpay/tsmservice/data/UpdateInfo$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/data/UpdateInfo$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/data/UpdateInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UpdateInfo;->mType:Ljava/lang/String;

    .line 37
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UpdateInfo;->mDownloadUrl:Ljava/lang/String;

    .line 38
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UpdateInfo;->mClientDigest:Ljava/lang/String;

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UpdateInfo;->mDesc:[Ljava/lang/String;

    .line 40
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 76
    const/4 v0, 0x0

    return v0
.end method

.method public getClientDigest()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UpdateInfo;->mClientDigest:Ljava/lang/String;

    return-object v0
.end method

.method public getDesc()[Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UpdateInfo;->mDesc:[Ljava/lang/String;

    return-object v0
.end method

.method public getDownloadUrl()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UpdateInfo;->mDownloadUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UpdateInfo;->mType:Ljava/lang/String;

    return-object v0
.end method

.method public setClientDigest(Ljava/lang/String;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/UpdateInfo;->mClientDigest:Ljava/lang/String;

    .line 64
    return-void
.end method

.method public setDesc([Ljava/lang/String;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/UpdateInfo;->mDesc:[Ljava/lang/String;

    .line 72
    return-void
.end method

.method public setDownloadUrl(Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/UpdateInfo;->mDownloadUrl:Ljava/lang/String;

    .line 56
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/UpdateInfo;->mType:Ljava/lang/String;

    .line 48
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UpdateInfo;->mType:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 82
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UpdateInfo;->mDownloadUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 83
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UpdateInfo;->mClientDigest:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 84
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UpdateInfo;->mDesc:[Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 85
    return-void
.end method
