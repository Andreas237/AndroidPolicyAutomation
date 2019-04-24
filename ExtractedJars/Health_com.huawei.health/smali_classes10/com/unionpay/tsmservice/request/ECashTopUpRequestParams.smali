.class public Lcom/unionpay/tsmservice/request/ECashTopUpRequestParams;
.super Lcom/unionpay/tsmservice/request/RequestParams;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/request/ECashTopUpRequestParams;>;"
        }
    .end annotation
.end field


# instance fields
.field private mAmount:Ljava/lang/String;

.field private mAppID:Lcom/unionpay/tsmservice/AppID;

.field private mEncrpytPin:Ljava/lang/String;

.field private mType:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 13
    new-instance v0, Lcom/unionpay/tsmservice/request/ECashTopUpRequestParams$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/request/ECashTopUpRequestParams$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/request/ECashTopUpRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 27
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 9
    const-string v0, "0"

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/ECashTopUpRequestParams;->mType:Ljava/lang/String;

    .line 29
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 31
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 9
    const-string v0, "0"

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/ECashTopUpRequestParams;->mType:Ljava/lang/String;

    .line 32
    const-class v0, Lcom/unionpay/tsmservice/AppID;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/unionpay/tsmservice/AppID;

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/ECashTopUpRequestParams;->mAppID:Lcom/unionpay/tsmservice/AppID;

    .line 33
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/ECashTopUpRequestParams;->mType:Ljava/lang/String;

    .line 34
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/ECashTopUpRequestParams;->mAmount:Ljava/lang/String;

    .line 35
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/ECashTopUpRequestParams;->mEncrpytPin:Ljava/lang/String;

    .line 36
    return-void
.end method


# virtual methods
.method public getAmount()Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/ECashTopUpRequestParams;->mAmount:Ljava/lang/String;

    return-object v0
.end method

.method public getAppID()Lcom/unionpay/tsmservice/AppID;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/ECashTopUpRequestParams;->mAppID:Lcom/unionpay/tsmservice/AppID;

    return-object v0
.end method

.method public getEncrpytPin()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/ECashTopUpRequestParams;->mEncrpytPin:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/ECashTopUpRequestParams;->mType:Ljava/lang/String;

    return-object v0
.end method

.method public setAmount(Ljava/lang/String;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/ECashTopUpRequestParams;->mAmount:Ljava/lang/String;

    .line 69
    return-void
.end method

.method public setAppID(Lcom/unionpay/tsmservice/AppID;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/ECashTopUpRequestParams;->mAppID:Lcom/unionpay/tsmservice/AppID;

    .line 53
    return-void
.end method

.method public setEncrpytPin(Ljava/lang/String;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/ECashTopUpRequestParams;->mEncrpytPin:Ljava/lang/String;

    .line 77
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/ECashTopUpRequestParams;->mType:Ljava/lang/String;

    .line 61
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 40
    invoke-super {p0, p1, p2}, Lcom/unionpay/tsmservice/request/RequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    .line 41
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/ECashTopUpRequestParams;->mAppID:Lcom/unionpay/tsmservice/AppID;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 42
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/ECashTopUpRequestParams;->mType:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 43
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/ECashTopUpRequestParams;->mAmount:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 44
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/ECashTopUpRequestParams;->mEncrpytPin:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 45
    return-void
.end method
