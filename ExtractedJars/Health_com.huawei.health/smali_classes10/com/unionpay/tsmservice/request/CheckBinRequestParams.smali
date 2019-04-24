.class public Lcom/unionpay/tsmservice/request/CheckBinRequestParams;
.super Lcom/unionpay/tsmservice/request/RequestParams;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/request/CheckBinRequestParams;>;"
        }
    .end annotation
.end field


# instance fields
.field private mSPan:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 13
    new-instance v0, Lcom/unionpay/tsmservice/request/CheckBinRequestParams$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/request/CheckBinRequestParams$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/request/CheckBinRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

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
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/CheckBinRequestParams;->mSPan:Ljava/lang/String;

    .line 33
    return-void
.end method


# virtual methods
.method public getSPan()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/CheckBinRequestParams;->mSPan:Ljava/lang/String;

    return-object v0
.end method

.method public setSPan(Ljava/lang/String;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/CheckBinRequestParams;->mSPan:Ljava/lang/String;

    .line 47
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 37
    invoke-super {p0, p1, p2}, Lcom/unionpay/tsmservice/request/RequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    .line 38
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/CheckBinRequestParams;->mSPan:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 39
    return-void
.end method
