.class final Lcom/unionpay/tsmservice/result/AppDownloadApplyResult$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/unionpay/tsmservice/result/AppDownloadApplyResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/result/AppDownloadApplyResult;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/unionpay/tsmservice/result/AppDownloadApplyResult;
    .locals 1

    .line 15
    new-instance v0, Lcom/unionpay/tsmservice/result/AppDownloadApplyResult;

    invoke-direct {v0, p1}, Lcom/unionpay/tsmservice/result/AppDownloadApplyResult;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0, p1}, Lcom/unionpay/tsmservice/result/AppDownloadApplyResult$1;->createFromParcel(Landroid/os/Parcel;)Lcom/unionpay/tsmservice/result/AppDownloadApplyResult;

    move-result-object v0

    return-object v0
.end method

.method public newArray(I)[Lcom/unionpay/tsmservice/result/AppDownloadApplyResult;
    .locals 1

    .line 20
    new-array v0, p1, [Lcom/unionpay/tsmservice/result/AppDownloadApplyResult;

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0, p1}, Lcom/unionpay/tsmservice/result/AppDownloadApplyResult$1;->newArray(I)[Lcom/unionpay/tsmservice/result/AppDownloadApplyResult;

    move-result-object v0

    return-object v0
.end method
