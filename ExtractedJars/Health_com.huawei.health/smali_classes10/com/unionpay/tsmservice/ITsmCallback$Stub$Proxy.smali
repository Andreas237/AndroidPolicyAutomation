.class Lcom/unionpay/tsmservice/ITsmCallback$Stub$Proxy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/unionpay/tsmservice/ITsmCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/unionpay/tsmservice/ITsmCallback$Stub;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Proxy"
.end annotation


# instance fields
.field private mRemote:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    iput-object p1, p0, Lcom/unionpay/tsmservice/ITsmCallback$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    .line 79
    return-void
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmCallback$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    return-object v0
.end method

.method public getInterfaceDescriptor()Ljava/lang/String;
    .locals 1

    .line 86
    const-string v0, "com.unionpay.tsmservice.ITsmCallback"

    return-object v0
.end method

.method public onError(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 111
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 112
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 114
    const-string v0, "com.unionpay.tsmservice.ITsmCallback"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 115
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 116
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 117
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmCallback$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 118
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 122
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 123
    goto :goto_0

    .line 121
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 122
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v5

    .line 124
    :goto_0
    return-void
.end method

.method public onResult(Landroid/os/Bundle;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 90
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 91
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 93
    const-string v0, "com.unionpay.tsmservice.ITsmCallback"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 94
    if-eqz p1, :cond_0

    .line 95
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 96
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 99
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 101
    :goto_0
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmCallback$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 102
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 106
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 107
    goto :goto_1

    .line 105
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 106
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v5

    .line 108
    :goto_1
    return-void
.end method
