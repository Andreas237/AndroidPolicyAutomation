.class Lo/djw$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/djw;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/djw$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private d:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    iput-object p1, p0, Lo/djw$d$a;->d:Landroid/os/IBinder;

    .line 85
    return-void
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 88
    iget-object v0, p0, Lo/djw$d$a;->d:Landroid/os/IBinder;

    return-object v0
.end method

.method public b(I)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 100
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 101
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 103
    const-string v0, "com.huawei.hwservicesmgr.IOTAResultAIDLCallback"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 104
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 105
    iget-object v0, p0, Lo/djw$d$a;->d:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 106
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 110
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 111
    goto :goto_0

    .line 109
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 110
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 111
    throw v5

    .line 112
    :goto_0
    return-void
.end method

.method public e(I)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 140
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 141
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 143
    const-string v0, "com.huawei.hwservicesmgr.IOTAResultAIDLCallback"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 144
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 145
    iget-object v0, p0, Lo/djw$d$a;->d:Landroid/os/IBinder;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 146
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 150
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 151
    goto :goto_0

    .line 149
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 150
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 151
    throw v5

    .line 152
    :goto_0
    return-void
.end method

.method public e(ILjava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 119
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 120
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 122
    const-string v0, "com.huawei.hwservicesmgr.IOTAResultAIDLCallback"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 123
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 124
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 125
    iget-object v0, p0, Lo/djw$d$a;->d:Landroid/os/IBinder;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 126
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 130
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 131
    goto :goto_0

    .line 129
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 130
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 131
    throw v5

    .line 132
    :goto_0
    return-void
.end method
