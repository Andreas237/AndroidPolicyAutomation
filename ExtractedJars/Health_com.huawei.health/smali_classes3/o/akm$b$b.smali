.class Lo/akm$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/akm;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akm$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 151
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 152
    iput-object p1, p0, Lo/akm$b$b;->a:Landroid/os/IBinder;

    .line 153
    return-void
.end method


# virtual methods
.method public a(Lo/akk;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 233
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 234
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 236
    const-string v0, "com.huawei.health.fw.IHwStepCounterManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 237
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/akk;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 238
    iget-object v0, p0, Lo/akm$b$b;->a:Landroid/os/IBinder;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 239
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 242
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 243
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 244
    goto :goto_1

    .line 242
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 243
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 244
    throw v5

    .line 245
    :goto_1
    return-void
.end method

.method public a()[I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 181
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 182
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 185
    const-string v0, "com.huawei.health.fw.IHwStepCounterManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 186
    iget-object v0, p0, Lo/akm$b$b;->a:Landroid/os/IBinder;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 187
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 188
    invoke-virtual {v4}, Landroid/os/Parcel;->createIntArray()[I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v5

    .line 191
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 192
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 193
    goto :goto_0

    .line 191
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 192
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 193
    throw v6

    .line 194
    :goto_0
    return-object v5
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 156
    iget-object v0, p0, Lo/akm$b$b;->a:Landroid/os/IBinder;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 164
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 165
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 168
    const-string v0, "com.huawei.health.fw.IHwStepCounterManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 169
    iget-object v0, p0, Lo/akm$b$b;->a:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 170
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 171
    invoke-virtual {v4}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v5

    .line 174
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 175
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 176
    goto :goto_0

    .line 174
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 175
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 176
    throw v6

    .line 177
    :goto_0
    return-object v5
.end method

.method public b(Lo/akk;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 310
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 311
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 313
    const-string v0, "com.huawei.health.fw.IHwStepCounterManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 314
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/akk;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 315
    iget-object v0, p0, Lo/akm$b$b;->a:Landroid/os/IBinder;

    const/16 v1, 0x9

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 316
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 319
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 320
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 321
    goto :goto_1

    .line 319
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 320
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 321
    throw v5

    .line 322
    :goto_1
    return-void
.end method

.method public c()I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 198
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 199
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 202
    const-string v0, "com.huawei.health.fw.IHwStepCounterManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 203
    iget-object v0, p0, Lo/akm$b$b;->a:Landroid/os/IBinder;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 204
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 205
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 208
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 209
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 210
    goto :goto_0

    .line 208
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 209
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 210
    throw v6

    .line 211
    :goto_0
    return v5
.end method

.method public c(JJLo/akk;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 290
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 291
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 294
    const-string v0, "com.huawei.health.fw.IHwStepCounterManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 295
    invoke-virtual {v3, p1, p2}, Landroid/os/Parcel;->writeLong(J)V

    .line 296
    invoke-virtual {v3, p3, p4}, Landroid/os/Parcel;->writeLong(J)V

    .line 297
    if-eqz p5, :cond_0

    invoke-interface {p5}, Lo/akk;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 298
    iget-object v0, p0, Lo/akm$b$b;->a:Landroid/os/IBinder;

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 299
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 300
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 303
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 304
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 305
    goto :goto_2

    .line 303
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 304
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 305
    throw v6

    .line 306
    :goto_2
    return v5
.end method

.method public d()I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 215
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 216
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 219
    const-string v0, "com.huawei.health.fw.IHwStepCounterManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 220
    iget-object v0, p0, Lo/akm$b$b;->a:Landroid/os/IBinder;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 221
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 222
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 225
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 226
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 227
    goto :goto_0

    .line 225
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 226
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 227
    throw v6

    .line 228
    :goto_0
    return v5
.end method

.method public d(Lo/akk;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 249
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 250
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 252
    const-string v0, "com.huawei.health.fw.IHwStepCounterManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 253
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/akk;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 254
    iget-object v0, p0, Lo/akm$b$b;->a:Landroid/os/IBinder;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 255
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 258
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 259
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 260
    goto :goto_1

    .line 258
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 259
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 260
    throw v5

    .line 261
    :goto_1
    return-void
.end method

.method public e(Lo/akk;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 325
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 326
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 328
    const-string v0, "com.huawei.health.fw.IHwStepCounterManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 329
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/akk;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 330
    iget-object v0, p0, Lo/akm$b$b;->a:Landroid/os/IBinder;

    const/16 v1, 0xa

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 331
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 334
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 335
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 336
    goto :goto_1

    .line 334
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 335
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 336
    throw v5

    .line 337
    :goto_1
    return-void
.end method

.method public e(Landroid/os/Bundle;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 265
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 266
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 269
    const-string v0, "com.huawei.health.fw.IHwStepCounterManager"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 270
    if-eqz p1, :cond_0

    .line 271
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 272
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 275
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 277
    :goto_0
    iget-object v0, p0, Lo/akm$b$b;->a:Landroid/os/IBinder;

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 278
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 279
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 282
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 283
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 284
    goto :goto_2

    .line 282
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 283
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 284
    throw v6

    .line 285
    :goto_2
    return v5
.end method
