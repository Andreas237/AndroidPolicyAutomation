.class public Lcom/unionpay/tsmservice/request/GetSMSAuthCodeRequestParams;
.super Lcom/unionpay/tsmservice/request/RequestParams;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/request/GetSMSAuthCodeRequestParams;>;"
        }
    .end annotation
.end field


# instance fields
.field private mAppID:Lcom/unionpay/tsmservice/AppID;

.field private mPan:Ljava/lang/String;

.field private mSisdn:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 12
    new-instance v0, Lcom/unionpay/tsmservice/request/GetSMSAuthCodeRequestParams$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/request/GetSMSAuthCodeRequestParams$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/request/GetSMSAuthCodeRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 30
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 31
    const-class v0, Lcom/unionpay/tsmservice/AppID;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/unionpay/tsmservice/AppID;

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/GetSMSAuthCodeRequestParams;->mAppID:Lcom/unionpay/tsmservice/AppID;

    .line 32
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/GetSMSAuthCodeRequestParams;->mPan:Ljava/lang/String;

    .line 33
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/GetSMSAuthCodeRequestParams;->mSisdn:Ljava/lang/String;

    .line 34
    return-void
.end method


# virtual methods
.method public getAppID()Lcom/unionpay/tsmservice/AppID;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/GetSMSAuthCodeRequestParams;->mAppID:Lcom/unionpay/tsmservice/AppID;

    return-object v0
.end method

.method public getMsisdn()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/GetSMSAuthCodeRequestParams;->mSisdn:Ljava/lang/String;

    return-object v0
.end method

.method public getPan()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/GetSMSAuthCodeRequestParams;->mPan:Ljava/lang/String;

    return-object v0
.end method

.method public setAppID(Lcom/unionpay/tsmservice/AppID;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/GetSMSAuthCodeRequestParams;->mAppID:Lcom/unionpay/tsmservice/AppID;

    .line 51
    return-void
.end method

.method public setMsisdn(Ljava/lang/String;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/GetSMSAuthCodeRequestParams;->mSisdn:Ljava/lang/String;

    .line 67
    return-void
.end method

.method public setPan(Ljava/lang/String;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/GetSMSAuthCodeRequestParams;->mPan:Ljava/lang/String;

    .line 59
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 39
    invoke-super {p0, p1, p2}, Lcom/unionpay/tsmservice/request/RequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    .line 40
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/GetSMSAuthCodeRequestParams;->mAppID:Lcom/unionpay/tsmservice/AppID;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 41
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/GetSMSAuthCodeRequestParams;->mPan:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 42
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/GetSMSAuthCodeRequestParams;->mSisdn:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 43
    return-void
.end method
