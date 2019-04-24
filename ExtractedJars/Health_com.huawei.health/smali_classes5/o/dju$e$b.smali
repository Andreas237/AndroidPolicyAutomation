.class Lo/dju$e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dju;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dju$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private c:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    iput-object p1, p0, Lo/dju$e$b;->c:Landroid/os/IBinder;

    .line 103
    return-void
.end method


# virtual methods
.method public a()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 190
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 191
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 193
    const-string v0, "com.huawei.hwservicesmgr.IMusicControllerAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 194
    iget-object v0, p0, Lo/dju$e$b;->c:Landroid/os/IBinder;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 195
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 198
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 199
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 200
    goto :goto_0

    .line 198
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 199
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 200
    throw v5

    .line 201
    :goto_0
    return-void
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 106
    iget-object v0, p0, Lo/dju$e$b;->c:Landroid/os/IBinder;

    return-object v0
.end method

.method public b()Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 132
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 133
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 136
    const-string v0, "com.huawei.hwservicesmgr.IMusicControllerAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 137
    iget-object v0, p0, Lo/dju$e$b;->c:Landroid/os/IBinder;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 138
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 139
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 140
    sget-object v0, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v4}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 143
    :cond_0
    const/4 v5, 0x0

    .line 147
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 148
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 149
    goto :goto_1

    .line 147
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 148
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 149
    throw v6

    .line 150
    :goto_1
    return-object v5
.end method

.method public d(I)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 156
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 157
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 159
    const-string v0, "com.huawei.hwservicesmgr.IMusicControllerAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 160
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 161
    iget-object v0, p0, Lo/dju$e$b;->c:Landroid/os/IBinder;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 162
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 166
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 167
    goto :goto_0

    .line 165
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 166
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 167
    throw v5

    .line 168
    :goto_0
    return-void
.end method

.method public d(Lo/djq;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 173
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 174
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 176
    const-string v0, "com.huawei.hwservicesmgr.IMusicControllerAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 177
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/djq;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 178
    iget-object v0, p0, Lo/dju$e$b;->c:Landroid/os/IBinder;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 179
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 182
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 183
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 184
    goto :goto_1

    .line 182
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 183
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 184
    throw v5

    .line 185
    :goto_1
    return-void
.end method

.method public e()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 116
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 117
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 119
    const-string v0, "com.huawei.hwservicesmgr.IMusicControllerAIDL"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 120
    iget-object v0, p0, Lo/dju$e$b;->c:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 121
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 125
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 126
    goto :goto_0

    .line 124
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 125
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 126
    throw v5

    .line 127
    :goto_0
    return-void
.end method
