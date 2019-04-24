.class public Lcom/unionpay/tsmservice/AppID;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/AppID;>;"
        }
    .end annotation
.end field


# instance fields
.field mAppAid:Ljava/lang/String;

.field mAppVersion:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 11
    new-instance v0, Lcom/unionpay/tsmservice/AppID$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/AppID$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/AppID;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/AppID;->mAppAid:Ljava/lang/String;

    .line 9
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/AppID;->mAppVersion:Ljava/lang/String;

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/AppID;->mAppAid:Ljava/lang/String;

    .line 32
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/AppID;->mAppVersion:Ljava/lang/String;

    .line 33
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/AppID;->mAppAid:Ljava/lang/String;

    .line 9
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/AppID;->mAppVersion:Ljava/lang/String;

    .line 26
    iput-object p1, p0, Lcom/unionpay/tsmservice/AppID;->mAppAid:Ljava/lang/String;

    .line 27
    iput-object p2, p0, Lcom/unionpay/tsmservice/AppID;->mAppVersion:Ljava/lang/String;

    .line 28
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 53
    const/4 v0, 0x0

    return v0
.end method

.method public getAppAid()Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/unionpay/tsmservice/AppID;->mAppAid:Ljava/lang/String;

    return-object v0
.end method

.method public getAppVersion()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/unionpay/tsmservice/AppID;->mAppVersion:Ljava/lang/String;

    return-object v0
.end method

.method public setAppAid(Ljava/lang/String;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/unionpay/tsmservice/AppID;->mAppAid:Ljava/lang/String;

    .line 41
    return-void
.end method

.method public setAppVersion(Ljava/lang/String;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/unionpay/tsmservice/AppID;->mAppVersion:Ljava/lang/String;

    .line 49
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/unionpay/tsmservice/AppID;->mAppAid:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 59
    iget-object v0, p0, Lcom/unionpay/tsmservice/AppID;->mAppVersion:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 60
    return-void
.end method
