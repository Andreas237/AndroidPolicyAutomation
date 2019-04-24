.class Lo/abf$e$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/abf;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/abf$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private b:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 109
    iput-object p1, p0, Lo/abf$e$d;->b:Landroid/os/IBinder;

    .line 110
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

    .line 171
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 172
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 174
    const-string v0, "com.huawei.health.ITrackSportManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 175
    iget-object v0, p0, Lo/abf$e$d;->b:Landroid/os/IBinder;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 176
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 179
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 180
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 181
    goto :goto_0

    .line 179
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 180
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 181
    throw v5

    .line 182
    :goto_0
    return-void
.end method

.method public a(Lo/abd;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 139
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 140
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 142
    const-string v0, "com.huawei.health.ITrackSportManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 143
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/abd;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 144
    iget-object v0, p0, Lo/abf$e$d;->b:Landroid/os/IBinder;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 145
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 148
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 149
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 150
    goto :goto_1

    .line 148
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 149
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 150
    throw v5

    .line 151
    :goto_1
    return-void
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 113
    iget-object v0, p0, Lo/abf$e$d;->b:Landroid/os/IBinder;

    return-object v0
.end method

.method public b()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 216
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 217
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 219
    const-string v0, "com.huawei.health.ITrackSportManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 220
    iget-object v0, p0, Lo/abf$e$d;->b:Landroid/os/IBinder;

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 221
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 224
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 225
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 226
    goto :goto_0

    .line 224
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 225
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 226
    throw v5

    .line 227
    :goto_0
    return-void
.end method

.method public c()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 201
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 202
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 204
    const-string v0, "com.huawei.health.ITrackSportManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 205
    iget-object v0, p0, Lo/abf$e$d;->b:Landroid/os/IBinder;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 206
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 209
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 210
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 211
    goto :goto_0

    .line 209
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 210
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 211
    throw v5

    .line 212
    :goto_0
    return-void
.end method

.method public c(Lo/abd;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 155
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 156
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 158
    const-string v0, "com.huawei.health.ITrackSportManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 159
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/abd;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 160
    iget-object v0, p0, Lo/abf$e$d;->b:Landroid/os/IBinder;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 161
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 164
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 165
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 166
    goto :goto_1

    .line 164
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 165
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 166
    throw v5

    .line 167
    :goto_1
    return-void
.end method

.method public d()I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 121
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 122
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 125
    const-string v0, "com.huawei.health.ITrackSportManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 126
    iget-object v0, p0, Lo/abf$e$d;->b:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 127
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 128
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 131
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 132
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 133
    goto :goto_0

    .line 131
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 132
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 133
    throw v6

    .line 134
    :goto_0
    return v5
.end method

.method public e()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 186
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 187
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 189
    const-string v0, "com.huawei.health.ITrackSportManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 190
    iget-object v0, p0, Lo/abf$e$d;->b:Landroid/os/IBinder;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 191
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 194
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 195
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 196
    goto :goto_0

    .line 194
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 195
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 196
    throw v5

    .line 197
    :goto_0
    return-void
.end method
