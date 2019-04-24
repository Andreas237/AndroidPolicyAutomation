.class public Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;>;"
        }
    .end annotation
.end field


# instance fields
.field private mAppIcon:Ljava/lang/String;

.field private mAppId:Ljava/lang/String;

.field private mIdvMethods:[Lcom/unionpay/tsmservice/data/IDVMethod;

.field private mMPan:Ljava/lang/String;

.field private mMPanId:Ljava/lang/String;

.field private mResult:Ljava/lang/String;

.field private mSPan:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    new-instance v0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;->mMPanId:Ljava/lang/String;

    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;->mAppId:Ljava/lang/String;

    .line 41
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;->mAppIcon:Ljava/lang/String;

    .line 42
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;->mMPan:Ljava/lang/String;

    .line 43
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;->mSPan:Ljava/lang/String;

    .line 44
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;->mResult:Ljava/lang/String;

    .line 45
    const-class v0, Lcom/unionpay/tsmservice/data/IDVMethod;

    .line 46
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelableArray(Ljava/lang/ClassLoader;)[Landroid/os/Parcelable;

    move-result-object v2

    .line 47
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 48
    array-length v0, v2

    const-class v1, [Lcom/unionpay/tsmservice/data/IDVMethod;

    invoke-static {v2, v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;ILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/unionpay/tsmservice/data/IDVMethod;

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;->mIdvMethods:[Lcom/unionpay/tsmservice/data/IDVMethod;

    .line 51
    :cond_0
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 55
    const/4 v0, 0x0

    return v0
.end method

.method public getAppIcon()Ljava/lang/String;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;->mAppIcon:Ljava/lang/String;

    return-object v0
.end method

.method public getAppId()Ljava/lang/String;
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;->mAppId:Ljava/lang/String;

    return-object v0
.end method

.method public getIDVMethod()[Lcom/unionpay/tsmservice/data/IDVMethod;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;->mIdvMethods:[Lcom/unionpay/tsmservice/data/IDVMethod;

    return-object v0
.end method

.method public getMPan()Ljava/lang/String;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;->mMPan:Ljava/lang/String;

    return-object v0
.end method

.method public getMPanId()Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;->mMPanId:Ljava/lang/String;

    return-object v0
.end method

.method public getResult()Ljava/lang/String;
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;->mResult:Ljava/lang/String;

    return-object v0
.end method

.method public getSPan()Ljava/lang/String;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;->mSPan:Ljava/lang/String;

    return-object v0
.end method

.method public setAppIcon(Ljava/lang/String;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;->mAppIcon:Ljava/lang/String;

    .line 91
    return-void
.end method

.method public setAppId(Ljava/lang/String;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;->mAppId:Ljava/lang/String;

    .line 83
    return-void
.end method

.method public setIDVMethod([Lcom/unionpay/tsmservice/data/IDVMethod;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;->mIdvMethods:[Lcom/unionpay/tsmservice/data/IDVMethod;

    .line 123
    return-void
.end method

.method public setMPan(Ljava/lang/String;)V
    .locals 0

    .line 98
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;->mMPan:Ljava/lang/String;

    .line 99
    return-void
.end method

.method public setMPanId(Ljava/lang/String;)V
    .locals 0

    .line 74
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;->mMPanId:Ljava/lang/String;

    .line 75
    return-void
.end method

.method public setResult(Ljava/lang/String;)V
    .locals 0

    .line 114
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;->mResult:Ljava/lang/String;

    .line 115
    return-void
.end method

.method public setSPan(Ljava/lang/String;)V
    .locals 0

    .line 106
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;->mSPan:Ljava/lang/String;

    .line 107
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;->mMPanId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 61
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;->mAppId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 62
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;->mAppIcon:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 63
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;->mMPan:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 64
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;->mSPan:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 65
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;->mResult:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 66
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppUniteApplyRecord;->mIdvMethods:[Lcom/unionpay/tsmservice/data/IDVMethod;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelableArray([Landroid/os/Parcelable;I)V

    .line 67
    return-void
.end method
