.class public Lcom/unionpay/tsmservice/data/UniteAppDetail;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/data/UniteAppDetail;>;"
        }
    .end annotation
.end field


# instance fields
.field private mApkDownloadUrl:Ljava/lang/String;

.field private mApkIcon:Ljava/lang/String;

.field private mApkName:Ljava/lang/String;

.field private mApkPackageName:Ljava/lang/String;

.field private mApkSign:Ljava/lang/String;

.field private mAppID:Ljava/lang/String;

.field private mAppIcon:Ljava/lang/String;

.field private mAppName:Ljava/lang/String;

.field private mAppProviderName:Ljava/lang/String;

.field private mCallCenterNumber:Ljava/lang/String;

.field private mCardType:Ljava/lang/String;

.field private mEmail:Ljava/lang/String;

.field private mPan:Ljava/lang/String;

.field private mPanId:Ljava/lang/String;

.field private mStatus:Lcom/unionpay/tsmservice/data/UniteAppStatus;

.field private mWebsite:Ljava/lang/String;

.field private sPan:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 27
    new-instance v0, Lcom/unionpay/tsmservice/data/UniteAppDetail$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/data/UniteAppDetail$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mAppID:Ljava/lang/String;

    .line 9
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mAppName:Ljava/lang/String;

    .line 10
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mAppIcon:Ljava/lang/String;

    .line 11
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mAppProviderName:Ljava/lang/String;

    .line 13
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mPanId:Ljava/lang/String;

    .line 14
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mPan:Ljava/lang/String;

    .line 15
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->sPan:Ljava/lang/String;

    .line 16
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mCardType:Ljava/lang/String;

    .line 18
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mCallCenterNumber:Ljava/lang/String;

    .line 19
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mEmail:Ljava/lang/String;

    .line 20
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mWebsite:Ljava/lang/String;

    .line 21
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkIcon:Ljava/lang/String;

    .line 22
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkName:Ljava/lang/String;

    .line 23
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkPackageName:Ljava/lang/String;

    .line 24
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkDownloadUrl:Ljava/lang/String;

    .line 25
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkSign:Ljava/lang/String;

    .line 43
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mAppID:Ljava/lang/String;

    .line 9
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mAppName:Ljava/lang/String;

    .line 10
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mAppIcon:Ljava/lang/String;

    .line 11
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mAppProviderName:Ljava/lang/String;

    .line 13
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mPanId:Ljava/lang/String;

    .line 14
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mPan:Ljava/lang/String;

    .line 15
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->sPan:Ljava/lang/String;

    .line 16
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mCardType:Ljava/lang/String;

    .line 18
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mCallCenterNumber:Ljava/lang/String;

    .line 19
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mEmail:Ljava/lang/String;

    .line 20
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mWebsite:Ljava/lang/String;

    .line 21
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkIcon:Ljava/lang/String;

    .line 22
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkName:Ljava/lang/String;

    .line 23
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkPackageName:Ljava/lang/String;

    .line 24
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkDownloadUrl:Ljava/lang/String;

    .line 25
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkSign:Ljava/lang/String;

    .line 46
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mAppID:Ljava/lang/String;

    .line 47
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mAppName:Ljava/lang/String;

    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mAppIcon:Ljava/lang/String;

    .line 49
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mAppProviderName:Ljava/lang/String;

    .line 50
    const-class v0, Lcom/unionpay/tsmservice/data/UniteAppStatus;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/unionpay/tsmservice/data/UniteAppStatus;

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mStatus:Lcom/unionpay/tsmservice/data/UniteAppStatus;

    .line 51
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mPanId:Ljava/lang/String;

    .line 52
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mPan:Ljava/lang/String;

    .line 53
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->sPan:Ljava/lang/String;

    .line 54
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mCardType:Ljava/lang/String;

    .line 55
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mCallCenterNumber:Ljava/lang/String;

    .line 56
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mEmail:Ljava/lang/String;

    .line 57
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mWebsite:Ljava/lang/String;

    .line 58
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkIcon:Ljava/lang/String;

    .line 59
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkName:Ljava/lang/String;

    .line 60
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkPackageName:Ljava/lang/String;

    .line 61
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkDownloadUrl:Ljava/lang/String;

    .line 62
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkSign:Ljava/lang/String;

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

.method public getApkDownloadUrl()Ljava/lang/String;
    .locals 1

    .line 213
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkDownloadUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getApkIcon()Ljava/lang/String;
    .locals 1

    .line 189
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkIcon:Ljava/lang/String;

    return-object v0
.end method

.method public getApkName()Ljava/lang/String;
    .locals 1

    .line 197
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkName:Ljava/lang/String;

    return-object v0
.end method

.method public getApkPackageName()Ljava/lang/String;
    .locals 1

    .line 205
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkPackageName:Ljava/lang/String;

    return-object v0
.end method

.method public getApkSign()Ljava/lang/String;
    .locals 1

    .line 221
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkSign:Ljava/lang/String;

    return-object v0
.end method

.method public getAppID()Ljava/lang/String;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mAppID:Ljava/lang/String;

    return-object v0
.end method

.method public getAppIcon()Ljava/lang/String;
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mAppIcon:Ljava/lang/String;

    return-object v0
.end method

.method public getAppName()Ljava/lang/String;
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mAppName:Ljava/lang/String;

    return-object v0
.end method

.method public getAppProviderName()Ljava/lang/String;
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mAppProviderName:Ljava/lang/String;

    return-object v0
.end method

.method public getCallCenterNumber()Ljava/lang/String;
    .locals 1

    .line 173
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mCallCenterNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getCardType()Ljava/lang/String;
    .locals 1

    .line 157
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mCardType:Ljava/lang/String;

    return-object v0
.end method

.method public getEmail()Ljava/lang/String;
    .locals 1

    .line 165
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mEmail:Ljava/lang/String;

    return-object v0
.end method

.method public getMPan()Ljava/lang/String;
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mPan:Ljava/lang/String;

    return-object v0
.end method

.method public getMPanId()Ljava/lang/String;
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mPanId:Ljava/lang/String;

    return-object v0
.end method

.method public getSPan()Ljava/lang/String;
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->sPan:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Lcom/unionpay/tsmservice/data/UniteAppStatus;
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mStatus:Lcom/unionpay/tsmservice/data/UniteAppStatus;

    return-object v0
.end method

.method public getWebsite()Ljava/lang/String;
    .locals 1

    .line 181
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mWebsite:Ljava/lang/String;

    return-object v0
.end method

.method public setApkDownloadUrl(Ljava/lang/String;)V
    .locals 0

    .line 217
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkDownloadUrl:Ljava/lang/String;

    .line 218
    return-void
.end method

.method public setApkIcon(Ljava/lang/String;)V
    .locals 0

    .line 193
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkIcon:Ljava/lang/String;

    .line 194
    return-void
.end method

.method public setApkName(Ljava/lang/String;)V
    .locals 0

    .line 201
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkName:Ljava/lang/String;

    .line 202
    return-void
.end method

.method public setApkPackageName(Ljava/lang/String;)V
    .locals 0

    .line 209
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkPackageName:Ljava/lang/String;

    .line 210
    return-void
.end method

.method public setApkSign(Ljava/lang/String;)V
    .locals 0

    .line 225
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkSign:Ljava/lang/String;

    .line 226
    return-void
.end method

.method public setAppID(Ljava/lang/String;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mAppID:Ljava/lang/String;

    .line 98
    return-void
.end method

.method public setAppIcon(Ljava/lang/String;)V
    .locals 0

    .line 113
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mAppIcon:Ljava/lang/String;

    .line 114
    return-void
.end method

.method public setAppName(Ljava/lang/String;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mAppName:Ljava/lang/String;

    .line 106
    return-void
.end method

.method public setAppProviderName(Ljava/lang/String;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mAppProviderName:Ljava/lang/String;

    .line 122
    return-void
.end method

.method public setCallCenterNumber(Ljava/lang/String;)V
    .locals 0

    .line 177
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mCallCenterNumber:Ljava/lang/String;

    .line 178
    return-void
.end method

.method public setCardType(Ljava/lang/String;)V
    .locals 0

    .line 161
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mCardType:Ljava/lang/String;

    .line 162
    return-void
.end method

.method public setEmail(Ljava/lang/String;)V
    .locals 0

    .line 169
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mEmail:Ljava/lang/String;

    .line 170
    return-void
.end method

.method public setMPan(Ljava/lang/String;)V
    .locals 0

    .line 145
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mPan:Ljava/lang/String;

    .line 146
    return-void
.end method

.method public setMPanId(Ljava/lang/String;)V
    .locals 0

    .line 137
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mPanId:Ljava/lang/String;

    .line 138
    return-void
.end method

.method public setSPan(Ljava/lang/String;)V
    .locals 0

    .line 153
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->sPan:Ljava/lang/String;

    .line 154
    return-void
.end method

.method public setStatus(Lcom/unionpay/tsmservice/data/UniteAppStatus;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mStatus:Lcom/unionpay/tsmservice/data/UniteAppStatus;

    .line 130
    return-void
.end method

.method public setWebsite(Ljava/lang/String;)V
    .locals 0

    .line 185
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mWebsite:Ljava/lang/String;

    .line 186
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mAppID:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 73
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mAppName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 74
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mAppIcon:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 75
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mAppProviderName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 76
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mStatus:Lcom/unionpay/tsmservice/data/UniteAppStatus;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 77
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mPanId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 78
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mPan:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 79
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->sPan:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 80
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mCardType:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 82
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mCallCenterNumber:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 83
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mEmail:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 84
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mWebsite:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 85
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkIcon:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 86
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 87
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkPackageName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 88
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkDownloadUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 89
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->mApkSign:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 90
    return-void
.end method
