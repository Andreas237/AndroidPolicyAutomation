.class public Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;
.super Lcom/unionpay/tsmservice/request/RequestParams;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;>;"
        }
    .end annotation
.end field


# instance fields
.field private mAppID:Lcom/unionpay/tsmservice/AppID;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 25
    new-instance v0, Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 41
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 43
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 44
    const-class v0, Lcom/unionpay/tsmservice/AppID;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/unionpay/tsmservice/AppID;

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;->mAppID:Lcom/unionpay/tsmservice/AppID;

    .line 45
    return-void
.end method


# virtual methods
.method public getAppID()Lcom/unionpay/tsmservice/AppID;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;->mAppID:Lcom/unionpay/tsmservice/AppID;

    return-object v0
.end method

.method public setAppID(Lcom/unionpay/tsmservice/AppID;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;->mAppID:Lcom/unionpay/tsmservice/AppID;

    .line 59
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 49
    invoke-super {p0, p1, p2}, Lcom/unionpay/tsmservice/request/RequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    .line 50
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;->mAppID:Lcom/unionpay/tsmservice/AppID;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 51
    return-void
.end method
