.class final Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams;
    .locals 1

    .line 18
    new-instance v0, Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams;

    invoke-direct {v0, p1}, Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 14
    invoke-virtual {p0, p1}, Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams$1;->createFromParcel(Landroid/os/Parcel;)Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams;

    move-result-object v0

    return-object v0
.end method

.method public newArray(I)[Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams;
    .locals 1

    .line 23
    new-array v0, p1, [Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams;

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 14
    invoke-virtual {p0, p1}, Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams$1;->newArray(I)[Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams;

    move-result-object v0

    return-object v0
.end method
