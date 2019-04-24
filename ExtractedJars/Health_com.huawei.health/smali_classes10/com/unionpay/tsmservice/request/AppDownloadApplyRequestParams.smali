.class public Lcom/unionpay/tsmservice/request/AppDownloadApplyRequestParams;
.super Lcom/unionpay/tsmservice/request/RequestParams;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/request/AppDownloadApplyRequestParams;>;"
        }
    .end annotation
.end field


# instance fields
.field private mAppID:Lcom/unionpay/tsmservice/AppID;

.field private mParams:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 13
    new-instance v0, Lcom/unionpay/tsmservice/request/AppDownloadApplyRequestParams$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/request/AppDownloadApplyRequestParams$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/request/AppDownloadApplyRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 29
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 31
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 32
    const-class v0, Lcom/unionpay/tsmservice/AppID;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/unionpay/tsmservice/AppID;

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/AppDownloadApplyRequestParams;->mAppID:Lcom/unionpay/tsmservice/AppID;

    .line 33
    const-class v0, Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readHashMap(Ljava/lang/ClassLoader;)Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/AppDownloadApplyRequestParams;->mParams:Ljava/util/HashMap;

    .line 34
    return-void
.end method


# virtual methods
.method public getAppID()Lcom/unionpay/tsmservice/AppID;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/AppDownloadApplyRequestParams;->mAppID:Lcom/unionpay/tsmservice/AppID;

    return-object v0
.end method

.method public getParams()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/AppDownloadApplyRequestParams;->mParams:Ljava/util/HashMap;

    return-object v0
.end method

.method public setAppID(Lcom/unionpay/tsmservice/AppID;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/AppDownloadApplyRequestParams;->mAppID:Lcom/unionpay/tsmservice/AppID;

    .line 49
    return-void
.end method

.method public setParams(Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 56
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/AppDownloadApplyRequestParams;->mParams:Ljava/util/HashMap;

    .line 57
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 38
    invoke-super {p0, p1, p2}, Lcom/unionpay/tsmservice/request/RequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    .line 39
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/AppDownloadApplyRequestParams;->mAppID:Lcom/unionpay/tsmservice/AppID;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 40
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/AppDownloadApplyRequestParams;->mParams:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    .line 41
    return-void
.end method
