.class public Lcom/unionpay/tsmservice/request/ExchangeKeyRequestParams;
.super Lcom/unionpay/tsmservice/request/RequestParams;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/request/ExchangeKeyRequestParams;>;"
        }
    .end annotation
.end field


# instance fields
.field private mTempKey:Ljava/lang/String;

.field private mType:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 10
    new-instance v0, Lcom/unionpay/tsmservice/request/ExchangeKeyRequestParams$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/request/ExchangeKeyRequestParams$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/request/ExchangeKeyRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

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
    .locals 1

    .line 28
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 29
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/ExchangeKeyRequestParams;->mType:I

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/ExchangeKeyRequestParams;->mTempKey:Ljava/lang/String;

    .line 31
    return-void
.end method


# virtual methods
.method public getTempKey()Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/ExchangeKeyRequestParams;->mTempKey:Ljava/lang/String;

    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 40
    iget v0, p0, Lcom/unionpay/tsmservice/request/ExchangeKeyRequestParams;->mType:I

    return v0
.end method

.method public setTempKey(Ljava/lang/String;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/ExchangeKeyRequestParams;->mTempKey:Ljava/lang/String;

    .line 53
    return-void
.end method

.method public setType(I)V
    .locals 0

    .line 44
    iput p1, p0, Lcom/unionpay/tsmservice/request/ExchangeKeyRequestParams;->mType:I

    .line 45
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 35
    iget v0, p0, Lcom/unionpay/tsmservice/request/ExchangeKeyRequestParams;->mType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 36
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/ExchangeKeyRequestParams;->mTempKey:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 37
    return-void
.end method
