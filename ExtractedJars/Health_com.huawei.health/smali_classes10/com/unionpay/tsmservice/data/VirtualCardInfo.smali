.class public Lcom/unionpay/tsmservice/data/VirtualCardInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/data/VirtualCardInfo;>;"
        }
    .end annotation
.end field


# instance fields
.field private mAppID:Lcom/unionpay/tsmservice/AppID;

.field private mBalance:Ljava/lang/String;

.field private mCVN2:Ljava/lang/String;

.field private mCardNo:Ljava/lang/String;

.field private mReferenceID:Ljava/lang/String;

.field private mValidDate:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 16
    new-instance v0, Lcom/unionpay/tsmservice/data/VirtualCardInfo$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/data/VirtualCardInfo$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mReferenceID:Ljava/lang/String;

    .line 11
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mCardNo:Ljava/lang/String;

    .line 12
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mValidDate:Ljava/lang/String;

    .line 13
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mCVN2:Ljava/lang/String;

    .line 14
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mBalance:Ljava/lang/String;

    .line 32
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mReferenceID:Ljava/lang/String;

    .line 11
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mCardNo:Ljava/lang/String;

    .line 12
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mValidDate:Ljava/lang/String;

    .line 13
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mCVN2:Ljava/lang/String;

    .line 14
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mBalance:Ljava/lang/String;

    .line 35
    const-class v0, Lcom/unionpay/tsmservice/AppID;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/unionpay/tsmservice/AppID;

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mAppID:Lcom/unionpay/tsmservice/AppID;

    .line 36
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mReferenceID:Ljava/lang/String;

    .line 37
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mCardNo:Ljava/lang/String;

    .line 38
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mValidDate:Ljava/lang/String;

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mCVN2:Ljava/lang/String;

    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mBalance:Ljava/lang/String;

    .line 41
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 45
    const/4 v0, 0x0

    return v0
.end method

.method public getAppID()Lcom/unionpay/tsmservice/AppID;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mAppID:Lcom/unionpay/tsmservice/AppID;

    return-object v0
.end method

.method public getBalance()Ljava/lang/String;
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mBalance:Ljava/lang/String;

    return-object v0
.end method

.method public getCVN2()Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mCVN2:Ljava/lang/String;

    return-object v0
.end method

.method public getCardNo()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mCardNo:Ljava/lang/String;

    return-object v0
.end method

.method public getReferenceID()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mReferenceID:Ljava/lang/String;

    return-object v0
.end method

.method public getValidDate()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mValidDate:Ljava/lang/String;

    return-object v0
.end method

.method public setAppID(Lcom/unionpay/tsmservice/AppID;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mAppID:Lcom/unionpay/tsmservice/AppID;

    .line 64
    return-void
.end method

.method public setBalance(Ljava/lang/String;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mBalance:Ljava/lang/String;

    .line 104
    return-void
.end method

.method public setCVN2(Ljava/lang/String;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mCVN2:Ljava/lang/String;

    .line 96
    return-void
.end method

.method public setCardNo(Ljava/lang/String;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mCardNo:Ljava/lang/String;

    .line 80
    return-void
.end method

.method public setReferenceID(Ljava/lang/String;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mReferenceID:Ljava/lang/String;

    .line 72
    return-void
.end method

.method public setValidDate(Ljava/lang/String;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mValidDate:Ljava/lang/String;

    .line 88
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mAppID:Lcom/unionpay/tsmservice/AppID;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 51
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mReferenceID:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 52
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mCardNo:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 53
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mValidDate:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 54
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mCVN2:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 55
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/VirtualCardInfo;->mBalance:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 56
    return-void
.end method
