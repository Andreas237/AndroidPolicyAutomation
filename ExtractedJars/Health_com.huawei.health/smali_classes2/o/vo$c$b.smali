.class Lo/vo$c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/vo;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/vo$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private d:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 169
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 170
    iput-object p1, p0, Lo/vo$c$b;->d:Landroid/os/IBinder;

    .line 171
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;I)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 244
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 245
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 248
    const-string v0, "com.huawei.android.powerkit.adapter.IPowerKitApi"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 249
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 250
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 251
    iget-object v0, p0, Lo/vo$c$b;->d:Landroid/os/IBinder;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 252
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 253
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 256
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 257
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 258
    goto :goto_0

    .line 256
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 257
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 259
    :goto_0
    return v5
.end method

.method public a(I)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 308
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 309
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 312
    const-string v0, "com.huawei.android.powerkit.adapter.IPowerKitApi"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 313
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 314
    iget-object v0, p0, Lo/vo$c$b;->d:Landroid/os/IBinder;

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 315
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 316
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 319
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 320
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 321
    goto :goto_1

    .line 319
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 320
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 322
    :goto_1
    return v5
.end method

.method public a(Lo/vr;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 266
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 267
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 270
    const-string v0, "com.huawei.android.powerkit.adapter.IPowerKitApi"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 271
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/vr;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 272
    iget-object v0, p0, Lo/vo$c$b;->d:Landroid/os/IBinder;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 273
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 274
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

    .line 277
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 278
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 279
    goto :goto_2

    .line 277
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 278
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 280
    :goto_2
    return v5
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 174
    iget-object v0, p0, Lo/vo$c$b;->d:Landroid/os/IBinder;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 185
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 186
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 189
    const-string v0, "com.huawei.android.powerkit.adapter.IPowerKitApi"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 190
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 191
    iget-object v0, p0, Lo/vo$c$b;->d:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 192
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 193
    invoke-virtual {v4}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v5

    .line 196
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 197
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 198
    goto :goto_0

    .line 196
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 197
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 199
    :goto_0
    return-object v5
.end method

.method public c(Ljava/lang/String;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 226
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 227
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 230
    const-string v0, "com.huawei.android.powerkit.adapter.IPowerKitApi"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 231
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 232
    iget-object v0, p0, Lo/vo$c$b;->d:Landroid/os/IBinder;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 233
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 234
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 237
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 238
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 239
    goto :goto_0

    .line 237
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 238
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 240
    :goto_0
    return v5
.end method

.method public c(I)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 329
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 330
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 333
    const-string v0, "com.huawei.android.powerkit.adapter.IPowerKitApi"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 334
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 335
    iget-object v0, p0, Lo/vo$c$b;->d:Landroid/os/IBinder;

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 336
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 337
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 340
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 341
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 342
    goto :goto_1

    .line 340
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 341
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 343
    :goto_1
    return v5
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 383
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 384
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 387
    const-string v0, "com.huawei.android.powerkit.adapter.IPowerKitApi"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 388
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 389
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 390
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 391
    iget-object v0, p0, Lo/vo$c$b;->d:Landroid/os/IBinder;

    const/16 v1, 0xa

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 392
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 393
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 396
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 397
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 398
    goto :goto_1

    .line 396
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 397
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 399
    :goto_1
    return v5
.end method

.method public d(Ljava/lang/String;ZLjava/lang/String;IJLjava/lang/String;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 350
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 351
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 354
    const-string v0, "com.huawei.android.powerkit.adapter.IPowerKitApi"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 355
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 356
    if-eqz p2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 357
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 358
    invoke-virtual {v3, p4}, Landroid/os/Parcel;->writeInt(I)V

    .line 359
    invoke-virtual {v3, p5, p6}, Landroid/os/Parcel;->writeLong(J)V

    .line 360
    invoke-virtual {v3, p7}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 361
    iget-object v0, p0, Lo/vo$c$b;->d:Landroid/os/IBinder;

    const/16 v1, 0x9

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 362
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 363
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

    .line 366
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 367
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 368
    goto :goto_2

    .line 366
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 367
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 369
    :goto_2
    return v5
.end method

.method public e(Ljava/lang/String;)F
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 208
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 209
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 212
    const-string v0, "com.huawei.android.powerkit.adapter.IPowerKitApi"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 213
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 214
    iget-object v0, p0, Lo/vo$c$b;->d:Landroid/os/IBinder;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 215
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 216
    invoke-virtual {v4}, Landroid/os/Parcel;->readFloat()F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 219
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 220
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 221
    goto :goto_0

    .line 219
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 220
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 222
    :goto_0
    return v5
.end method

.method public e(Lo/vr;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 287
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 288
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 291
    const-string v0, "com.huawei.android.powerkit.adapter.IPowerKitApi"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 292
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/vr;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 293
    iget-object v0, p0, Lo/vo$c$b;->d:Landroid/os/IBinder;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 294
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 295
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

    .line 298
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 299
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 300
    goto :goto_2

    .line 298
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 299
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 301
    :goto_2
    return v5
.end method
