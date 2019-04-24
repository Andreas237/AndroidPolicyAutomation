.class Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/unionpay/tsmservice/ITsmService;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/unionpay/tsmservice/ITsmService$Stub;
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

    .line 802
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 803
    iput-object p1, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    .line 804
    return-void
.end method


# virtual methods
.method public appDataUpdate(Lcom/unionpay/tsmservice/request/AppDataUpdateRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1266
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1267
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1270
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1271
    if-eqz p1, :cond_0

    .line 1272
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1273
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/AppDataUpdateRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1276
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1278
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1279
    if-eqz p3, :cond_2

    invoke-interface {p3}, Lcom/unionpay/tsmservice/ITsmProgressCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1280
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x14

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1281
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1282
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1285
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1286
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1287
    goto :goto_3

    .line 1285
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1286
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1288
    :goto_3
    return v5
.end method

.method public appDelete(Lcom/unionpay/tsmservice/request/AppDeleteRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1214
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1215
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1218
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1219
    if-eqz p1, :cond_0

    .line 1220
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1221
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/AppDeleteRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1224
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1226
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1227
    if-eqz p3, :cond_2

    invoke-interface {p3}, Lcom/unionpay/tsmservice/ITsmProgressCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1228
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x12

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1229
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1230
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1233
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1234
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1235
    goto :goto_3

    .line 1233
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1234
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1236
    :goto_3
    return v5
.end method

.method public appDownload(Lcom/unionpay/tsmservice/request/AppDownloadRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1162
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1163
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1166
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1167
    if-eqz p1, :cond_0

    .line 1168
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1169
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/AppDownloadRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1172
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1174
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1175
    if-eqz p3, :cond_2

    invoke-interface {p3}, Lcom/unionpay/tsmservice/ITsmProgressCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1176
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x10

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1177
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1178
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1181
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1182
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1183
    goto :goto_3

    .line 1181
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1182
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1184
    :goto_3
    return v5
.end method

.method public appDownloadApply(Lcom/unionpay/tsmservice/request/AppDownloadApplyRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1137
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1138
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1141
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1142
    if-eqz p1, :cond_0

    .line 1143
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1144
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/AppDownloadApplyRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1147
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1149
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1150
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0xf

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1151
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1152
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1155
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1156
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1157
    goto :goto_2

    .line 1155
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1156
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1158
    :goto_2
    return v5
.end method

.method public appLock(Lcom/unionpay/tsmservice/request/AppLockRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1292
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1293
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1296
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1297
    if-eqz p1, :cond_0

    .line 1298
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1299
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/AppLockRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1302
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1304
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1305
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x15

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1306
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1307
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1310
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1311
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1312
    goto :goto_2

    .line 1310
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1311
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1313
    :goto_2
    return v5
.end method

.method public appUnlock(Lcom/unionpay/tsmservice/request/AppUnlockRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1317
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1318
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1321
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1322
    if-eqz p1, :cond_0

    .line 1323
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1324
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/AppUnlockRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1327
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1329
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1330
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x16

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1331
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1332
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1335
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1336
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1337
    goto :goto_2

    .line 1335
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1336
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1338
    :goto_2
    return v5
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 807
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    return-object v0
.end method

.method public bleKeyExchange(Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1655
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1656
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1659
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1660
    if-eqz p1, :cond_0

    .line 1661
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1662
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1665
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1667
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1668
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x25

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1669
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1670
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1673
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1674
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1675
    goto :goto_2

    .line 1673
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1674
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1676
    :goto_2
    return v5
.end method

.method public checkBinCode(Lcom/unionpay/tsmservice/request/CheckBinRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 858
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 859
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 862
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 863
    if-eqz p1, :cond_0

    .line 864
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 865
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/CheckBinRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 868
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 870
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 871
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 872
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 873
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 876
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 877
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 878
    goto :goto_2

    .line 876
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 877
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 879
    :goto_2
    return v5
.end method

.method public clearEncryptData(I)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1847
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1848
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1851
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1852
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 1853
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x2d

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1854
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1855
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1858
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1859
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1860
    goto :goto_0

    .line 1858
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1859
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1861
    :goto_0
    return v5
.end method

.method public closeChannel(Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1617
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1618
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1621
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1622
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 1623
    if-eqz p2, :cond_0

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1624
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x23

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1625
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1626
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1629
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1630
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1631
    goto :goto_1

    .line 1629
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1630
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1632
    :goto_1
    return v5
.end method

.method public eCashTopUp(Lcom/unionpay/tsmservice/request/ECashTopUpRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1417
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1418
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1421
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1422
    if-eqz p1, :cond_0

    .line 1423
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1424
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/ECashTopUpRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1427
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1429
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1430
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x1a

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1431
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1432
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1435
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1436
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1437
    goto :goto_2

    .line 1435
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1436
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1438
    :goto_2
    return v5
.end method

.method public encryptData(Lcom/unionpay/tsmservice/request/EncryptDataRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 926
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 927
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 930
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 931
    if-eqz p1, :cond_0

    .line 932
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 933
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/EncryptDataRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 936
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 938
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 939
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 940
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 941
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 944
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 945
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 946
    goto :goto_2

    .line 944
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 945
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 947
    :goto_2
    return v5
.end method

.method public exchangeKey(Lcom/unionpay/tsmservice/request/ExchangeKeyRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 901
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 902
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 905
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 906
    if-eqz p1, :cond_0

    .line 907
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 908
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/ExchangeKeyRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 911
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 913
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 914
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 915
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 916
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 919
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 920
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 921
    goto :goto_2

    .line 919
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 920
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 922
    :goto_2
    return v5
.end method

.method public executeCmd(Lcom/unionpay/tsmservice/request/ExecuteCmdRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1882
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1883
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1886
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1887
    if-eqz p1, :cond_0

    .line 1888
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1889
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/ExecuteCmdRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1892
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1894
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1895
    if-eqz p3, :cond_2

    invoke-interface {p3}, Lcom/unionpay/tsmservice/ITsmProgressCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1896
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x2f

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1897
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1898
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1901
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1902
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1903
    goto :goto_3

    .line 1901
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1902
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1904
    :goto_3
    return v5
.end method

.method public getAccountBalance(Lcom/unionpay/tsmservice/request/GetAccountBalanceRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1492
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1493
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1496
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1497
    if-eqz p1, :cond_0

    .line 1498
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1499
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/GetAccountBalanceRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1502
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1504
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1505
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x1d

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1506
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1507
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1510
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1511
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1512
    goto :goto_2

    .line 1510
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1511
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1513
    :goto_2
    return v5
.end method

.method public getAccountInfo(Lcom/unionpay/tsmservice/request/GetAccountInfoRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1467
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1468
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1471
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1472
    if-eqz p1, :cond_0

    .line 1473
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1474
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/GetAccountInfoRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1477
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1479
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1480
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x1c

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1481
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1482
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1485
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1486
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1487
    goto :goto_2

    .line 1485
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1486
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1488
    :goto_2
    return v5
.end method

.method public getActiveCode(Lcom/unionpay/tsmservice/request/GetActiveCodeRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1367
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1368
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1371
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1372
    if-eqz p1, :cond_0

    .line 1373
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1374
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/GetActiveCodeRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1377
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1379
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1380
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x18

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1381
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1382
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1385
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1386
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1387
    goto :goto_2

    .line 1385
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1386
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1388
    :goto_2
    return v5
.end method

.method public getAppDetail(Lcom/unionpay/tsmservice/request/GetAppDetailRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1087
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1088
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1091
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1092
    if-eqz p1, :cond_0

    .line 1093
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1094
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/GetAppDetailRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1097
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1099
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1100
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0xd

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1101
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1102
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1105
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1106
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1107
    goto :goto_2

    .line 1105
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1106
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1108
    :goto_2
    return v5
.end method

.method public getAppList(Lcom/unionpay/tsmservice/request/GetAppListRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1012
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1013
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1016
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1017
    if-eqz p1, :cond_0

    .line 1018
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1019
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/GetAppListRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1022
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1024
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1025
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0xa

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1026
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1027
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1030
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1031
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1032
    goto :goto_2

    .line 1030
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1031
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1033
    :goto_2
    return v5
.end method

.method public getAppStatus(Lcom/unionpay/tsmservice/request/GetAppStatusRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1062
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1063
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1066
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1067
    if-eqz p1, :cond_0

    .line 1068
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1069
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/GetAppStatusRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1072
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1074
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1075
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0xc

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1076
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1077
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1080
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1081
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1082
    goto :goto_2

    .line 1080
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1081
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1083
    :goto_2
    return v5
.end method

.method public getAssociatedApp(Lcom/unionpay/tsmservice/request/GetAssociatedAppRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 969
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 970
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 973
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 974
    if-eqz p1, :cond_0

    .line 975
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 976
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/GetAssociatedAppRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 979
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 981
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 982
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 983
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 984
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 987
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 988
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 989
    goto :goto_2

    .line 987
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 988
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 990
    :goto_2
    return v5
.end method

.method public getCardInfo([Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1517
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1518
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1521
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1522
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 1523
    if-eqz p2, :cond_0

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1524
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x1e

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1525
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1526
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1529
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1530
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1531
    goto :goto_1

    .line 1529
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1530
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1532
    :goto_1
    return v5
.end method

.method public getDefaultCard(Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1555
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1556
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1559
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1560
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1561
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x20

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1562
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1563
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1566
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1567
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1568
    goto :goto_1

    .line 1566
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1567
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1569
    :goto_1
    return v5
.end method

.method public getEncryptData(Lcom/unionpay/tsmservice/request/GetEncryptDataRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1822
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1823
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1826
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1827
    if-eqz p1, :cond_0

    .line 1828
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1829
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/GetEncryptDataRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1832
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1834
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1835
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x2c

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1836
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1837
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1840
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1841
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1842
    goto :goto_2

    .line 1840
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1841
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1843
    :goto_2
    return v5
.end method

.method public getInterfaceDescriptor()Ljava/lang/String;
    .locals 1

    .line 811
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    return-object v0
.end method

.method public getPubKey(Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 883
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 884
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 887
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 888
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 889
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 890
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 891
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 894
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 895
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 896
    goto :goto_1

    .line 894
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 895
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 897
    :goto_1
    return v5
.end method

.method public getSEAppList(Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 994
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 995
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 998
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 999
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1000
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x9

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1001
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1002
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1005
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1006
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1007
    goto :goto_1

    .line 1005
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1006
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1008
    :goto_1
    return v5
.end method

.method public getSEId(Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 951
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 952
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 955
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 956
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 957
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 958
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 959
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 962
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 963
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 964
    goto :goto_1

    .line 962
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 963
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 965
    :goto_1
    return v5
.end method

.method public getSMSAuthCode(Lcom/unionpay/tsmservice/request/GetSMSAuthCodeRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1342
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1343
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1346
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1347
    if-eqz p1, :cond_0

    .line 1348
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1349
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/GetSMSAuthCodeRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1352
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1354
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1355
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x17

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1356
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1357
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1360
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1361
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1362
    goto :goto_2

    .line 1360
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1361
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1363
    :goto_2
    return v5
.end method

.method public getSupportedCardTypeList(Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 840
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 841
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 844
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 845
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 846
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 847
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 848
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 851
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 852
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 853
    goto :goto_1

    .line 851
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 852
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 854
    :goto_1
    return v5
.end method

.method public getTransElements(Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1112
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1113
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1116
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1117
    if-eqz p1, :cond_0

    .line 1118
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1119
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1122
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1124
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1125
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0xe

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1126
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1127
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1130
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1131
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1132
    goto :goto_2

    .line 1130
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1131
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1133
    :goto_2
    return v5
.end method

.method public getTransRecord(Lcom/unionpay/tsmservice/request/GetTransRecordRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1442
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1443
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1446
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1447
    if-eqz p1, :cond_0

    .line 1448
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1449
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/GetTransRecordRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1452
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1454
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1455
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x1b

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1456
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1457
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1460
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1461
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1462
    goto :goto_2

    .line 1460
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1461
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1463
    :goto_2
    return v5
.end method

.method public getUniteAppList(Lcom/unionpay/tsmservice/request/GetUniteAppListRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1037
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1038
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1041
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1042
    if-eqz p1, :cond_0

    .line 1043
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1044
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/GetUniteAppListRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1047
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1049
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1050
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0xb

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1051
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1052
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1055
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1056
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1057
    goto :goto_2

    .line 1055
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1056
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1058
    :goto_2
    return v5
.end method

.method public hideAppApply(Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1636
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1637
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1640
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1641
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 1642
    if-eqz p2, :cond_0

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1643
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x24

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1644
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1645
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1648
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1649
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1650
    goto :goto_1

    .line 1648
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1649
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1651
    :goto_1
    return v5
.end method

.method public hideKeyboard()I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1865
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1866
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1869
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1870
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x2e

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1871
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1872
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1875
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1876
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1877
    goto :goto_0

    .line 1875
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1876
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1878
    :goto_0
    return v5
.end method

.method public init(Lcom/unionpay/tsmservice/request/InitRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 815
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 816
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 819
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 820
    if-eqz p1, :cond_0

    .line 821
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 822
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/InitRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 825
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 827
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 828
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 829
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 830
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 833
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 834
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 835
    goto :goto_2

    .line 833
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 834
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 836
    :goto_2
    return v5
.end method

.method public openCardApplyActivity(Lcom/unionpay/tsmservice/request/OpenCardApplyActivityRequestParams;Lcom/unionpay/tsmservice/ITsmActivityCallback;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1680
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1681
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1684
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1685
    if-eqz p1, :cond_0

    .line 1686
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1687
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/OpenCardApplyActivityRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1690
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1692
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmActivityCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1693
    if-eqz p3, :cond_2

    invoke-interface {p3}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1694
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x26

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1695
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1696
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1699
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1700
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1701
    goto :goto_3

    .line 1699
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1700
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1702
    :goto_3
    return v5
.end method

.method public openCardDetailActivity(Lcom/unionpay/tsmservice/request/OpenCardDetailActivityRequestParams;Lcom/unionpay/tsmservice/ITsmActivityCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1706
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1707
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1710
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1711
    if-eqz p1, :cond_0

    .line 1712
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1713
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/OpenCardDetailActivityRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1716
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1718
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmActivityCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1719
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x27

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1720
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1721
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1724
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1725
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1726
    goto :goto_2

    .line 1724
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1725
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1727
    :goto_2
    return v5
.end method

.method public openChannel(Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1573
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1574
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1577
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1578
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 1579
    if-eqz p2, :cond_0

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1580
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x21

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1581
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1582
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1585
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1586
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1587
    goto :goto_1

    .line 1585
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1586
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1588
    :goto_1
    return v5
.end method

.method public openUniteCardApplyActivity(Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;Lcom/unionpay/tsmservice/ITsmActivityCallback;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1731
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1732
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1735
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1736
    if-eqz p1, :cond_0

    .line 1737
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1738
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1741
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1743
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmActivityCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1744
    if-eqz p3, :cond_2

    invoke-interface {p3}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1745
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x28

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1746
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1747
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1750
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1751
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1752
    goto :goto_3

    .line 1750
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1751
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1753
    :goto_3
    return v5
.end method

.method public openUniteCardApplyActivityWithRiskInfo(Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;Lcom/unionpay/tsmservice/ITsmActivityCallback;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1908
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1909
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1912
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1913
    if-eqz p1, :cond_0

    .line 1914
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1915
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1918
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1920
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmActivityCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1921
    if-eqz p3, :cond_2

    invoke-interface {p3}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1922
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x30

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1923
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1924
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1927
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1928
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1929
    goto :goto_3

    .line 1927
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1928
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1930
    :goto_3
    return v5
.end method

.method public sendApdu(Lcom/unionpay/tsmservice/request/SendApduRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1592
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1593
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1596
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1597
    if-eqz p1, :cond_0

    .line 1598
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1599
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/SendApduRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1602
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1604
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1605
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x22

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1606
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1607
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1610
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1611
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1612
    goto :goto_2

    .line 1610
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1611
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1613
    :goto_2
    return v5
.end method

.method public setDefaultCard(Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1536
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1537
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1540
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1541
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 1542
    if-eqz p2, :cond_0

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1543
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x1f

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1544
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1545
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1548
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1549
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1550
    goto :goto_1

    .line 1548
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1549
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1551
    :goto_1
    return v5
.end method

.method public setSafetyKeyboardBitmap(Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1798
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1799
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1802
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1803
    if-eqz p1, :cond_0

    .line 1804
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1805
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1808
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1810
    :goto_0
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x2b

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1811
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1812
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1815
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1816
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1817
    goto :goto_1

    .line 1815
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1816
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1818
    :goto_1
    return v5
.end method

.method public showSafetyKeyboard(Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;ILcom/unionpay/tsmservice/OnSafetyKeyboardCallback;Lcom/unionpay/tsmservice/ITsmActivityCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1771
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1772
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1775
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1776
    if-eqz p1, :cond_0

    .line 1777
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1778
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1781
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1783
    :goto_0
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1784
    if-eqz p3, :cond_1

    invoke-interface {p3}, Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1785
    if-eqz p4, :cond_2

    invoke-interface {p4}, Lcom/unionpay/tsmservice/ITsmActivityCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1786
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x2a

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1787
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1788
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1791
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1792
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1793
    goto :goto_3

    .line 1791
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1792
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1794
    :goto_3
    return v5
.end method

.method public unbindBleService()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1757
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1758
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1760
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1761
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x29

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1762
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1765
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1766
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1767
    goto :goto_0

    .line 1765
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1766
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v5

    .line 1768
    :goto_0
    return-void
.end method

.method public uniteAppDelete(Lcom/unionpay/tsmservice/request/UniteAppDeleteRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1240
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1241
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1244
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1245
    if-eqz p1, :cond_0

    .line 1246
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1247
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/UniteAppDeleteRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1250
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1252
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1253
    if-eqz p3, :cond_2

    invoke-interface {p3}, Lcom/unionpay/tsmservice/ITsmProgressCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1254
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x13

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1255
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1256
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1259
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1260
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1261
    goto :goto_3

    .line 1259
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1260
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1262
    :goto_3
    return v5
.end method

.method public uniteAppDownload(Lcom/unionpay/tsmservice/request/UniteAppDownloadRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1188
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1189
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1192
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1193
    if-eqz p1, :cond_0

    .line 1194
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1195
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/UniteAppDownloadRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1198
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1200
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1201
    if-eqz p3, :cond_2

    invoke-interface {p3}, Lcom/unionpay/tsmservice/ITsmProgressCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1202
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x11

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1203
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1204
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1207
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1208
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1209
    goto :goto_3

    .line 1207
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1208
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1210
    :goto_3
    return v5
.end method

.method public uniteCardActive(Lcom/unionpay/tsmservice/request/UniteCardActiveRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1392
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 1393
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 1396
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 1397
    if-eqz p1, :cond_0

    .line 1398
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1399
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/unionpay/tsmservice/request/UniteCardActiveRequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 1402
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1404
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/unionpay/tsmservice/ITsmCallback;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1405
    iget-object v0, p0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v1, 0x19

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 1406
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 1407
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 1410
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1411
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1412
    goto :goto_2

    .line 1410
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1411
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 1413
    :goto_2
    return v5
.end method
