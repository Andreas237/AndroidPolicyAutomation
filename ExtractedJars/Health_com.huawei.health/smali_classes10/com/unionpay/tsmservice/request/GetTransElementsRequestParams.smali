.class public Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams;
.super Lcom/unionpay/tsmservice/request/RequestParams;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams;>;"
        }
    .end annotation
.end field

.field public static final TRANS_TYPE_DELETE:Ljava/lang/String; = "0112"

.field public static final TRANS_TYPE_DOWNLOAD_APPLY:Ljava/lang/String; = "0101"


# instance fields
.field private mAppID:Lcom/unionpay/tsmservice/AppID;

.field private mTransType:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    new-instance v0, Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 30
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 32
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 33
    const-class v0, Lcom/unionpay/tsmservice/AppID;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/unionpay/tsmservice/AppID;

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams;->mAppID:Lcom/unionpay/tsmservice/AppID;

    .line 34
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams;->mTransType:Ljava/lang/String;

    .line 35
    return-void
.end method


# virtual methods
.method public getAppID()Lcom/unionpay/tsmservice/AppID;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams;->mAppID:Lcom/unionpay/tsmservice/AppID;

    return-object v0
.end method

.method public getTransType()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams;->mTransType:Ljava/lang/String;

    return-object v0
.end method

.method public setAppID(Lcom/unionpay/tsmservice/AppID;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams;->mAppID:Lcom/unionpay/tsmservice/AppID;

    .line 50
    return-void
.end method

.method public setTransType(Ljava/lang/String;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams;->mTransType:Ljava/lang/String;

    .line 58
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 39
    invoke-super {p0, p1, p2}, Lcom/unionpay/tsmservice/request/RequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    .line 40
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams;->mAppID:Lcom/unionpay/tsmservice/AppID;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 41
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams;->mTransType:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 42
    return-void
.end method
