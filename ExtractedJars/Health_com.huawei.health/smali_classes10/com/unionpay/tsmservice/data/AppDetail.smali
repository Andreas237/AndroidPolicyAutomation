.class public Lcom/unionpay/tsmservice/data/AppDetail;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/data/AppDetail;>;"
        }
    .end annotation
.end field


# instance fields
.field private mAppApplyId:Ljava/lang/String;

.field private mAppDesc:Ljava/lang/String;

.field private mAppID:Lcom/unionpay/tsmservice/AppID;

.field private mAppIcon:Ljava/lang/String;

.field private mAppName:Ljava/lang/String;

.field private mAppProviderAgreement:Ljava/lang/String;

.field private mAppProviderLogo:Ljava/lang/String;

.field private mAppProviderName:Ljava/lang/String;

.field private mApplyMode:Ljava/lang/String;

.field private mDownloadTimes:J

.field private mPublishData:Ljava/lang/String;

.field private mPublishStatus:Ljava/lang/String;

.field private mRechargeLowerLimit:Ljava/lang/String;

.field private mRechargeMode:Ljava/lang/String;

.field private mServicePhone:Ljava/lang/String;

.field private mStatus:Lcom/unionpay/tsmservice/data/AppStatus;

.field private mUpAgreement:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 27
    new-instance v0, Lcom/unionpay/tsmservice/data/AppDetail$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/data/AppDetail$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/data/AppDetail;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppName:Ljava/lang/String;

    .line 11
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppIcon:Ljava/lang/String;

    .line 12
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppDesc:Ljava/lang/String;

    .line 13
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppProviderLogo:Ljava/lang/String;

    .line 14
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppProviderName:Ljava/lang/String;

    .line 15
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppProviderAgreement:Ljava/lang/String;

    .line 16
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mUpAgreement:Ljava/lang/String;

    .line 17
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mApplyMode:Ljava/lang/String;

    .line 18
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mServicePhone:Ljava/lang/String;

    .line 19
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mDownloadTimes:J

    .line 20
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mPublishData:Ljava/lang/String;

    .line 21
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mPublishStatus:Ljava/lang/String;

    .line 22
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mRechargeMode:Ljava/lang/String;

    .line 23
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mRechargeLowerLimit:Ljava/lang/String;

    .line 43
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppName:Ljava/lang/String;

    .line 11
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppIcon:Ljava/lang/String;

    .line 12
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppDesc:Ljava/lang/String;

    .line 13
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppProviderLogo:Ljava/lang/String;

    .line 14
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppProviderName:Ljava/lang/String;

    .line 15
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppProviderAgreement:Ljava/lang/String;

    .line 16
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mUpAgreement:Ljava/lang/String;

    .line 17
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mApplyMode:Ljava/lang/String;

    .line 18
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mServicePhone:Ljava/lang/String;

    .line 19
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mDownloadTimes:J

    .line 20
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mPublishData:Ljava/lang/String;

    .line 21
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mPublishStatus:Ljava/lang/String;

    .line 22
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mRechargeMode:Ljava/lang/String;

    .line 23
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mRechargeLowerLimit:Ljava/lang/String;

    .line 46
    const-class v0, Lcom/unionpay/tsmservice/AppID;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/unionpay/tsmservice/AppID;

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppID:Lcom/unionpay/tsmservice/AppID;

    .line 47
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppName:Ljava/lang/String;

    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppIcon:Ljava/lang/String;

    .line 49
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppDesc:Ljava/lang/String;

    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppProviderLogo:Ljava/lang/String;

    .line 51
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppProviderName:Ljava/lang/String;

    .line 52
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppProviderAgreement:Ljava/lang/String;

    .line 53
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mUpAgreement:Ljava/lang/String;

    .line 54
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mApplyMode:Ljava/lang/String;

    .line 55
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mServicePhone:Ljava/lang/String;

    .line 56
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mDownloadTimes:J

    .line 57
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mPublishData:Ljava/lang/String;

    .line 58
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mPublishStatus:Ljava/lang/String;

    .line 59
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mRechargeMode:Ljava/lang/String;

    .line 60
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mRechargeLowerLimit:Ljava/lang/String;

    .line 61
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppApplyId:Ljava/lang/String;

    .line 62
    const-class v0, Lcom/unionpay/tsmservice/data/AppStatus;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/unionpay/tsmservice/data/AppStatus;

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mStatus:Lcom/unionpay/tsmservice/data/AppStatus;

    .line 63
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 67
    const/4 v0, 0x0

    return v0
.end method

.method public getAppApplyId()Ljava/lang/String;
    .locals 1

    .line 212
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppApplyId:Ljava/lang/String;

    return-object v0
.end method

.method public getAppDesc()Ljava/lang/String;
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppDesc:Ljava/lang/String;

    return-object v0
.end method

.method public getAppID()Lcom/unionpay/tsmservice/AppID;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppID:Lcom/unionpay/tsmservice/AppID;

    return-object v0
.end method

.method public getAppIcon()Ljava/lang/String;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppIcon:Ljava/lang/String;

    return-object v0
.end method

.method public getAppName()Ljava/lang/String;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppName:Ljava/lang/String;

    return-object v0
.end method

.method public getAppProviderAgreement()Ljava/lang/String;
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppProviderAgreement:Ljava/lang/String;

    return-object v0
.end method

.method public getAppProviderLogo()Ljava/lang/String;
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppProviderLogo:Ljava/lang/String;

    return-object v0
.end method

.method public getAppProviderName()Ljava/lang/String;
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppProviderName:Ljava/lang/String;

    return-object v0
.end method

.method public getApplyMode()Ljava/lang/String;
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mApplyMode:Ljava/lang/String;

    return-object v0
.end method

.method public getDownloadTimes()J
    .locals 2

    .line 172
    iget-wide v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mDownloadTimes:J

    return-wide v0
.end method

.method public getPublishData()Ljava/lang/String;
    .locals 1

    .line 180
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mPublishData:Ljava/lang/String;

    return-object v0
.end method

.method public getPublishStatus()Ljava/lang/String;
    .locals 1

    .line 188
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mPublishStatus:Ljava/lang/String;

    return-object v0
.end method

.method public getRechargeLowerLimit()Ljava/lang/String;
    .locals 1

    .line 204
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mRechargeLowerLimit:Ljava/lang/String;

    return-object v0
.end method

.method public getRechargeMode()Ljava/lang/String;
    .locals 1

    .line 196
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mRechargeMode:Ljava/lang/String;

    return-object v0
.end method

.method public getServicePhone()Ljava/lang/String;
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mServicePhone:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Lcom/unionpay/tsmservice/data/AppStatus;
    .locals 1

    .line 220
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mStatus:Lcom/unionpay/tsmservice/data/AppStatus;

    return-object v0
.end method

.method public getUpAgreement()Ljava/lang/String;
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mUpAgreement:Ljava/lang/String;

    return-object v0
.end method

.method public setAppApplyId(Ljava/lang/String;)V
    .locals 0

    .line 216
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppApplyId:Ljava/lang/String;

    .line 217
    return-void
.end method

.method public setAppDesc(Ljava/lang/String;)V
    .locals 0

    .line 120
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppDesc:Ljava/lang/String;

    .line 121
    return-void
.end method

.method public setAppID(Lcom/unionpay/tsmservice/AppID;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppID:Lcom/unionpay/tsmservice/AppID;

    .line 97
    return-void
.end method

.method public setAppIcon(Ljava/lang/String;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppIcon:Ljava/lang/String;

    .line 113
    return-void
.end method

.method public setAppName(Ljava/lang/String;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppName:Ljava/lang/String;

    .line 105
    return-void
.end method

.method public setAppProviderAgreement(Ljava/lang/String;)V
    .locals 0

    .line 144
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppProviderAgreement:Ljava/lang/String;

    .line 145
    return-void
.end method

.method public setAppProviderLogo(Ljava/lang/String;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppProviderLogo:Ljava/lang/String;

    .line 129
    return-void
.end method

.method public setAppProviderName(Ljava/lang/String;)V
    .locals 0

    .line 136
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppProviderName:Ljava/lang/String;

    .line 137
    return-void
.end method

.method public setApplyMode(Ljava/lang/String;)V
    .locals 0

    .line 160
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mApplyMode:Ljava/lang/String;

    .line 161
    return-void
.end method

.method public setDownloadTimes(J)V
    .locals 0

    .line 176
    iput-wide p1, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mDownloadTimes:J

    .line 177
    return-void
.end method

.method public setPublishData(Ljava/lang/String;)V
    .locals 0

    .line 184
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mPublishData:Ljava/lang/String;

    .line 185
    return-void
.end method

.method public setPublishStatus(Ljava/lang/String;)V
    .locals 0

    .line 192
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mPublishStatus:Ljava/lang/String;

    .line 193
    return-void
.end method

.method public setRechargeLowerLimit(Ljava/lang/String;)V
    .locals 0

    .line 208
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mRechargeLowerLimit:Ljava/lang/String;

    .line 209
    return-void
.end method

.method public setRechargeMode(Ljava/lang/String;)V
    .locals 0

    .line 200
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mRechargeMode:Ljava/lang/String;

    .line 201
    return-void
.end method

.method public setServicePhone(Ljava/lang/String;)V
    .locals 0

    .line 168
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mServicePhone:Ljava/lang/String;

    .line 169
    return-void
.end method

.method public setStatus(Lcom/unionpay/tsmservice/data/AppStatus;)V
    .locals 0

    .line 224
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mStatus:Lcom/unionpay/tsmservice/data/AppStatus;

    .line 225
    return-void
.end method

.method public setUpAgreement(Ljava/lang/String;)V
    .locals 0

    .line 152
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mUpAgreement:Ljava/lang/String;

    .line 153
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 72
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppID:Lcom/unionpay/tsmservice/AppID;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 73
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 74
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppIcon:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 75
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppDesc:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 76
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppProviderLogo:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 77
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppProviderName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 78
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppProviderAgreement:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 79
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mUpAgreement:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 80
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mApplyMode:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 81
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mServicePhone:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 82
    iget-wide v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mDownloadTimes:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 83
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mPublishData:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 84
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mPublishStatus:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 85
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mRechargeMode:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 86
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mRechargeLowerLimit:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 87
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mAppApplyId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 88
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppDetail;->mStatus:Lcom/unionpay/tsmservice/data/AppStatus;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 89
    return-void
.end method
