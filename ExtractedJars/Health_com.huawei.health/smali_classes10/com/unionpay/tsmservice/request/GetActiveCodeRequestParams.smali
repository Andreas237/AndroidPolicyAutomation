.class public Lcom/unionpay/tsmservice/request/GetActiveCodeRequestParams;
.super Lcom/unionpay/tsmservice/request/RequestParams;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/request/GetActiveCodeRequestParams;>;"
        }
    .end annotation
.end field


# instance fields
.field private mActiveType:Ljava/lang/String;

.field private mPanId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 11
    new-instance v0, Lcom/unionpay/tsmservice/request/GetActiveCodeRequestParams$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/request/GetActiveCodeRequestParams$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/request/GetActiveCodeRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/GetActiveCodeRequestParams;->mPanId:Ljava/lang/String;

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/GetActiveCodeRequestParams;->mActiveType:Ljava/lang/String;

    .line 32
    return-void
.end method


# virtual methods
.method public getActiveType()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/GetActiveCodeRequestParams;->mActiveType:Ljava/lang/String;

    return-object v0
.end method

.method public getMPanId()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/GetActiveCodeRequestParams;->mPanId:Ljava/lang/String;

    return-object v0
.end method

.method public setActiveType(Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/GetActiveCodeRequestParams;->mActiveType:Ljava/lang/String;

    .line 56
    return-void
.end method

.method public setMPanId(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/GetActiveCodeRequestParams;->mPanId:Ljava/lang/String;

    .line 48
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 37
    invoke-super {p0, p1, p2}, Lcom/unionpay/tsmservice/request/RequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    .line 38
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/GetActiveCodeRequestParams;->mPanId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 39
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/GetActiveCodeRequestParams;->mActiveType:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 40
    return-void
.end method
