.class final Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;
    .locals 1

    .line 29
    new-instance v0, Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;

    invoke-direct {v0, p1}, Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 25
    invoke-virtual {p0, p1}, Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams$1;->createFromParcel(Landroid/os/Parcel;)Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;

    move-result-object v0

    return-object v0
.end method

.method public newArray(I)[Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;
    .locals 1

    .line 34
    new-array v0, p1, [Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 25
    invoke-virtual {p0, p1}, Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams$1;->newArray(I)[Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;

    move-result-object v0

    return-object v0
.end method
