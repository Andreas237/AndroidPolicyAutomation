.class final Lnet/sqlcipher/BulkCursorProxy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/sqlcipher/IBulkCursor;


# instance fields
.field private mExtras:Landroid/os/Bundle;

.field private mRemote:Landroid/os/IBinder;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    .line 196
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 197
    iput-object p1, p0, Lnet/sqlcipher/BulkCursorProxy;->mRemote:Landroid/os/IBinder;

    .line 198
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/BulkCursorProxy;->mExtras:Landroid/os/Bundle;

    .line 199
    return-void
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 203
    iget-object v0, p0, Lnet/sqlcipher/BulkCursorProxy;->mRemote:Landroid/os/IBinder;

    return-object v0
.end method

.method public close()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 307
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 308
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 310
    const-string v0, "android.content.IBulkCursor"

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 312
    iget-object v0, p0, Lnet/sqlcipher/BulkCursorProxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0xc

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 313
    invoke-static {v4}, Lnet/sqlcipher/DatabaseUtils;->readExceptionFromParcel(Landroid/os/Parcel;)V

    .line 315
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 316
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 317
    return-void
.end method

.method public count()I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 248
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 249
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 251
    const-string v0, "android.content.IBulkCursor"

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 253
    iget-object v0, p0, Lnet/sqlcipher/BulkCursorProxy;->mRemote:Landroid/os/IBinder;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v5

    .line 255
    invoke-static {v4}, Lnet/sqlcipher/DatabaseUtils;->readExceptionFromParcel(Landroid/os/Parcel;)V

    .line 258
    if-nez v5, :cond_0

    .line 259
    const/4 v6, -0x1

    goto :goto_0

    .line 261
    :cond_0
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    move-result v6

    .line 263
    :goto_0
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 264
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 265
    return v6
.end method

.method public deactivate()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 293
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 294
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 296
    const-string v0, "android.content.IBulkCursor"

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 298
    iget-object v0, p0, Lnet/sqlcipher/BulkCursorProxy;->mRemote:Landroid/os/IBinder;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 299
    invoke-static {v4}, Lnet/sqlcipher/DatabaseUtils;->readExceptionFromParcel(Landroid/os/Parcel;)V

    .line 301
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 302
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 303
    return-void
.end method

.method public deleteRow(I)Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 369
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 370
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 372
    const-string v0, "android.content.IBulkCursor"

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 374
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 376
    iget-object v0, p0, Lnet/sqlcipher/BulkCursorProxy;->mRemote:Landroid/os/IBinder;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 378
    invoke-static {v4}, Lnet/sqlcipher/DatabaseUtils;->readExceptionFromParcel(Landroid/os/Parcel;)V

    .line 380
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 382
    :goto_0
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 383
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 385
    return v5
.end method

.method public getColumnNames()[Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 270
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 271
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 273
    const-string v0, "android.content.IBulkCursor"

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 275
    iget-object v0, p0, Lnet/sqlcipher/BulkCursorProxy;->mRemote:Landroid/os/IBinder;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 277
    invoke-static {v4}, Lnet/sqlcipher/DatabaseUtils;->readExceptionFromParcel(Landroid/os/Parcel;)V

    .line 279
    const/4 v5, 0x0

    .line 280
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    move-result v6

    .line 281
    new-array v5, v6, [Ljava/lang/String;

    .line 282
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_0

    .line 283
    invoke-virtual {v4}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v5, v7

    .line 282
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 286
    :cond_0
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 287
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 288
    return-object v5
.end method

.method public getExtras()Landroid/os/Bundle;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 405
    iget-object v0, p0, Lnet/sqlcipher/BulkCursorProxy;->mExtras:Landroid/os/Bundle;

    if-nez v0, :cond_0

    .line 406
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 407
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 409
    const-string v0, "android.content.IBulkCursor"

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 411
    iget-object v0, p0, Lnet/sqlcipher/BulkCursorProxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0xa

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 413
    invoke-static {v4}, Lnet/sqlcipher/DatabaseUtils;->readExceptionFromParcel(Landroid/os/Parcel;)V

    .line 415
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lnet/sqlcipher/BulkCursorProxy;->mExtras:Landroid/os/Bundle;

    .line 416
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 417
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 419
    :cond_0
    iget-object v0, p0, Lnet/sqlcipher/BulkCursorProxy;->mExtras:Landroid/os/Bundle;

    return-object v0
.end method

.method public getWantsAllOnMoveCalls()Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 389
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 390
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 392
    const-string v0, "android.content.IBulkCursor"

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 394
    iget-object v0, p0, Lnet/sqlcipher/BulkCursorProxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x9

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 396
    invoke-static {v4}, Lnet/sqlcipher/DatabaseUtils;->readExceptionFromParcel(Landroid/os/Parcel;)V

    .line 398
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    move-result v5

    .line 399
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 400
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 401
    if-eqz v5, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getWindow(I)Lnet/sqlcipher/CursorWindow;
    .locals 6
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

    .line 211
    const-string v0, "android.content.IBulkCursor"

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 213
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 215
    iget-object v0, p0, Lnet/sqlcipher/BulkCursorProxy;->mRemote:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 217
    invoke-static {v4}, Lnet/sqlcipher/DatabaseUtils;->readExceptionFromParcel(Landroid/os/Parcel;)V

    .line 219
    const/4 v5, 0x0

    .line 220
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 221
    invoke-static {v4}, Lnet/sqlcipher/CursorWindow;->newFromParcel(Landroid/os/Parcel;)Lnet/sqlcipher/CursorWindow;

    move-result-object v5

    .line 224
    :cond_0
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 225
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 227
    return-object v5
.end method

.method public onMove(I)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 231
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 232
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 234
    const-string v0, "android.content.IBulkCursor"

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 236
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 238
    iget-object v0, p0, Lnet/sqlcipher/BulkCursorProxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 240
    invoke-static {v4}, Lnet/sqlcipher/DatabaseUtils;->readExceptionFromParcel(Landroid/os/Parcel;)V

    .line 242
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 243
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 244
    return-void
.end method

.method public requery(Lnet/sqlcipher/IContentObserver;Lnet/sqlcipher/CursorWindow;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 320
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 321
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 323
    const-string v0, "android.content.IBulkCursor"

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 325
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeStrongInterface(Landroid/os/IInterface;)V

    .line 326
    const/4 v0, 0x0

    invoke-virtual {p2, v3, v0}, Lnet/sqlcipher/CursorWindow;->writeToParcel(Landroid/os/Parcel;I)V

    .line 328
    iget-object v0, p0, Lnet/sqlcipher/BulkCursorProxy;->mRemote:Landroid/os/IBinder;

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v5

    .line 330
    invoke-static {v4}, Lnet/sqlcipher/DatabaseUtils;->readExceptionFromParcel(Landroid/os/Parcel;)V

    .line 333
    if-nez v5, :cond_0

    .line 334
    const/4 v6, -0x1

    goto :goto_0

    .line 336
    :cond_0
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    move-result v6

    .line 337
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lnet/sqlcipher/BulkCursorProxy;->mExtras:Landroid/os/Bundle;

    .line 340
    :goto_0
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 341
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 343
    return v6
.end method

.method public respond(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 423
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 424
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 426
    const-string v0, "android.content.IBulkCursor"

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 428
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 430
    iget-object v0, p0, Lnet/sqlcipher/BulkCursorProxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0xb

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 432
    invoke-static {v4}, Lnet/sqlcipher/DatabaseUtils;->readExceptionFromParcel(Landroid/os/Parcel;)V

    .line 434
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    move-result-object v5

    .line 435
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 436
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 437
    return-object v5
.end method

.method public updateRows(Ljava/util/Map;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 348
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 349
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 351
    const-string v0, "android.content.IBulkCursor"

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 353
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    .line 355
    iget-object v0, p0, Lnet/sqlcipher/BulkCursorProxy;->mRemote:Landroid/os/IBinder;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 357
    invoke-static {v4}, Lnet/sqlcipher/DatabaseUtils;->readExceptionFromParcel(Landroid/os/Parcel;)V

    .line 359
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 361
    :goto_0
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 362
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 364
    return v5
.end method
