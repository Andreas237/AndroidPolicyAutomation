.class Lcom/unionpay/blepayservice/Channel$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/unionpay/blepayservice/Channel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/unionpay/blepayservice/Channel;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    return-void
.end method


# virtual methods
.method public b(I)[Lcom/unionpay/blepayservice/Channel;
    .locals 1

    .line 21
    new-array v0, p1, [Lcom/unionpay/blepayservice/Channel;

    return-object v0
.end method

.method public c(Landroid/os/Parcel;)Lcom/unionpay/blepayservice/Channel;
    .locals 1

    .line 16
    new-instance v0, Lcom/unionpay/blepayservice/Channel;

    invoke-direct {v0, p1}, Lcom/unionpay/blepayservice/Channel;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/unionpay/blepayservice/Channel$5;->c(Landroid/os/Parcel;)Lcom/unionpay/blepayservice/Channel;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/unionpay/blepayservice/Channel$5;->b(I)[Lcom/unionpay/blepayservice/Channel;

    move-result-object v0

    return-object v0
.end method
