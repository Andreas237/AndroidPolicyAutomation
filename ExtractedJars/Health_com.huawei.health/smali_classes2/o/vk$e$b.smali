.class Lo/vk$e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/vk;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/vk$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private e:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 134
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 136
    iput-object p1, p0, Lo/vk$e$b;->e:Landroid/os/IBinder;

    .line 137
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 260
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 261
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 264
    const-string v0, "com.huawei.android.location.activityrecognition.IActivityRecognitionHardwareService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 265
    iget-object v0, p0, Lo/vk$e$b;->e:Landroid/os/IBinder;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 266
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 267
    invoke-virtual {v4}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v5

    .line 268
    goto :goto_0

    .line 269
    :catchall_0
    move-exception v6

    .line 270
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 271
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 272
    throw v6

    .line 270
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 271
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 273
    return-object v5
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 140
    iget-object v0, p0, Lo/vk$e$b;->e:Landroid/os/IBinder;

    return-object v0
.end method

.method public b(Ljava/lang/String;IJ)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 213
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 214
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 217
    const-string v0, "com.huawei.android.location.activityrecognition.IActivityRecognitionHardwareService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 218
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 219
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 220
    invoke-virtual {v3, p3, p4}, Landroid/os/Parcel;->writeLong(J)V

    .line 221
    iget-object v0, p0, Lo/vk$e$b;->e:Landroid/os/IBinder;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 222
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 223
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 224
    :goto_0
    goto :goto_1

    .line 225
    :catchall_0
    move-exception v6

    .line 226
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 227
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 228
    throw v6

    .line 226
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 227
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 229
    return v5
.end method

.method public b()[Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 151
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 152
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 155
    const-string v0, "com.huawei.android.location.activityrecognition.IActivityRecognitionHardwareService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 156
    iget-object v0, p0, Lo/vk$e$b;->e:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 157
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 158
    invoke-virtual {v4}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v5

    .line 159
    goto :goto_0

    .line 160
    :catchall_0
    move-exception v6

    .line 161
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 162
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 163
    throw v6

    .line 161
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 162
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 164
    return-object v5
.end method

.method public c()Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 298
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 299
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 302
    const-string v0, "com.huawei.android.location.activityrecognition.IActivityRecognitionHardwareService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 303
    iget-object v0, p0, Lo/vk$e$b;->e:Landroid/os/IBinder;

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 304
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 305
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 306
    :goto_0
    goto :goto_1

    .line 307
    :catchall_0
    move-exception v6

    .line 308
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 309
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 310
    throw v6

    .line 308
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 309
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 311
    return v5
.end method

.method public c(Ljava/lang/String;I)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 236
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 237
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 240
    const-string v0, "com.huawei.android.location.activityrecognition.IActivityRecognitionHardwareService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 241
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 242
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 243
    iget-object v0, p0, Lo/vk$e$b;->e:Landroid/os/IBinder;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 244
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 245
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 246
    :goto_0
    goto :goto_1

    .line 247
    :catchall_0
    move-exception v6

    .line 248
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 249
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 250
    throw v6

    .line 248
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 249
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 251
    return v5
.end method

.method public c(Lo/vi;)Z
    .locals 7
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

    .line 175
    const-string v0, "com.huawei.android.location.activityrecognition.IActivityRecognitionHardwareService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 176
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/vi;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 177
    iget-object v0, p0, Lo/vk$e$b;->e:Landroid/os/IBinder;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 178
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 179
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 180
    :goto_1
    goto :goto_2

    .line 181
    :catchall_0
    move-exception v6

    .line 182
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 183
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 184
    throw v6

    .line 182
    :goto_2
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 183
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 185
    return v5
.end method

.method public e()Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 280
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 281
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 284
    const-string v0, "com.huawei.android.location.activityrecognition.IActivityRecognitionHardwareService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 285
    iget-object v0, p0, Lo/vk$e$b;->e:Landroid/os/IBinder;

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 286
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 287
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 288
    :goto_0
    goto :goto_1

    .line 289
    :catchall_0
    move-exception v6

    .line 290
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 291
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 292
    throw v6

    .line 290
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 291
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 293
    return v5
.end method

.method public e(Lo/vi;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 192
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 193
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 196
    const-string v0, "com.huawei.android.location.activityrecognition.IActivityRecognitionHardwareService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 197
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/vi;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 198
    iget-object v0, p0, Lo/vk$e$b;->e:Landroid/os/IBinder;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 199
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 200
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 201
    :goto_1
    goto :goto_2

    .line 202
    :catchall_0
    move-exception v6

    .line 203
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 204
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 205
    throw v6

    .line 203
    :goto_2
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 204
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 206
    return v5
.end method
