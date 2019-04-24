.class public Lcom/unionpay/tsmservice/request/GetAppStatusRequestParams;
.super Lcom/unionpay/tsmservice/request/RequestParams;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/request/GetAppStatusRequestParams;>;"
        }
    .end annotation
.end field


# instance fields
.field private mAppID:Lcom/unionpay/tsmservice/AppID;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 10
    new-instance v0, Lcom/unionpay/tsmservice/request/GetAppStatusRequestParams$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/request/GetAppStatusRequestParams$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/request/GetAppStatusRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 26
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 30
    return-void
.end method


# virtual methods
.method public getAppID()Lcom/unionpay/tsmservice/AppID;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/GetAppStatusRequestParams;->mAppID:Lcom/unionpay/tsmservice/AppID;

    return-object v0
.end method

.method public setAppID(Lcom/unionpay/tsmservice/AppID;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/GetAppStatusRequestParams;->mAppID:Lcom/unionpay/tsmservice/AppID;

    .line 38
    return-void
.end method
