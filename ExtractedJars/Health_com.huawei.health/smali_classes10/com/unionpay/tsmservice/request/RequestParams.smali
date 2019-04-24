.class public Lcom/unionpay/tsmservice/request/RequestParams;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# instance fields
.field private mReserve:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 16
    const/4 v0, 0x0

    return v0
.end method

.method protected getReserve()Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/RequestParams;->mReserve:Ljava/lang/String;

    return-object v0
.end method

.method protected setReserve(Ljava/lang/String;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/RequestParams;->mReserve:Ljava/lang/String;

    .line 26
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 22
    return-void
.end method
