.class Lo/cys$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cxx;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cys;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cys;


# direct methods
.method constructor <init>(Lo/cys;)V
    .locals 0

    .line 1276
    iput-object p1, p0, Lo/cys$1;->a:Lo/cys;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V
    .locals 17

    .line 1279
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onDeviceConnectionStateChanged with btState = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move/from16 v4, p2

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1280
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cys$1;->a:Lo/cys;

    invoke-static {v0}, Lo/cys;->d(Lo/cys;)Lo/cxx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_a

    .line 1282
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cys$1;->a:Lo/cys;

    invoke-static {v0}, Lo/cys;->d(Lo/cys;)Lo/cxx;

    move-result-object v0

    move-object/from16 v1, p1

    move/from16 v2, p2

    invoke-interface {v0, v1, v2}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V

    .line 1284
    const/4 v0, 0x3

    move/from16 v1, p2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x4

    move/from16 v1, p2

    if-ne v0, v1, :cond_4

    .line 1286
    :cond_0
    invoke-static {}, Lo/cys;->p()Ljava/util/Map;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1287
    invoke-static {}, Lo/cys;->p()Ljava/util/Map;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/cyj;

    .line 1288
    invoke-virtual {v5}, Lo/cyj;->h()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1289
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v6

    .line 1291
    invoke-static {}, Lo/cys;->n()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/cyi;

    .line 1292
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 1293
    invoke-virtual {v7}, Lo/cyi;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1295
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Stop reconnect ble for remove device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1296
    invoke-virtual {v7}, Lo/cyi;->d()V

    .line 1300
    :cond_1
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Need to remove device from device list."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1301
    invoke-static {}, Lo/cys;->m()Ljava/lang/Object;

    move-result-object v8

    monitor-enter v8

    .line 1303
    :try_start_0
    invoke-static {}, Lo/cys;->p()Ljava/util/Map;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1305
    const-string v0, "AndroidWear"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1306
    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/cxk;->d(Ljava/lang/String;)Z

    move-result v9

    .line 1307
    if-nez v9, :cond_2

    .line 1308
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Remove bond device fail."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1310
    :cond_2
    goto :goto_0

    .line 1311
    :cond_3
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "AW device do not need remove bond info."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1314
    :goto_0
    monitor-exit v8

    return-void

    .line 1315
    :catchall_0
    move-exception v10

    monitor-exit v8

    throw v10

    .line 1320
    :cond_4
    sget-object v5, Lo/cys;->d:Ljava/lang/Object;

    monitor-enter v5

    .line 1321
    const-string v0, "reconnectDevices"

    .line 1322
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    .line 1321
    invoke-static {v0, v1}, Lo/cyp;->e(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v6

    .line 1323
    const/4 v0, 0x0

    if-eq v0, v6, :cond_9

    .line 1324
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Device BTType = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceBTType()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1325
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v7

    .line 1326
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "reconnectDeviceInfo macAddress = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-virtual {v4, v7}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1328
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceBTType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_9

    .line 1330
    const/4 v0, 0x3

    move/from16 v1, p2

    if-eq v0, v1, :cond_5

    const/4 v0, 0x4

    move/from16 v1, p2

    if-ne v0, v1, :cond_9

    .line 1332
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cys$1;->a:Lo/cys;

    invoke-static {v0}, Lo/cys;->c(Lo/cys;)Lo/cxk;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cxk;->e(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v8

    .line 1333
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cys$1;->a:Lo/cys;

    const/4 v1, 0x2

    invoke-static {v0, v1, v8}, Lo/cys;->b(Lo/cys;ILandroid/bluetooth/BluetoothDevice;)Lo/cyj;

    move-result-object v9

    .line 1335
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 1336
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to reconnect BLE device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1337
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Device connected so stop reconnect."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1339
    invoke-static {}, Lo/cys;->n()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/cyi;

    .line 1340
    const/4 v0, 0x0

    if-eq v0, v10, :cond_9

    .line 1342
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Stop reconnect ble for remove device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1343
    invoke-virtual {v10, v9}, Lo/cyi;->e(Lo/cyj;)V

    .line 1344
    const/4 v0, 0x0

    if-eq v0, v9, :cond_8

    .line 1345
    invoke-virtual {v9}, Lo/cyj;->i()Z

    move-result v11

    .line 1346
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "reconnectEnableFlag info = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1347
    if-eqz v11, :cond_7

    .line 1349
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 1350
    invoke-static {}, Lo/cxn;->b()J

    move-result-wide v0

    sub-long v14, v12, v0

    .line 1351
    const-wide/32 v0, 0x493e0

    cmp-long v0, v14, v0

    if-lez v0, :cond_6

    .line 1352
    invoke-virtual {v10, v6}, Lo/cyi;->d(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    goto :goto_1

    .line 1354
    :cond_6
    invoke-static {}, Lo/cys;->q()Lo/cys$a;

    move-result-object v0

    new-instance v1, Lo/cys$1$4;

    move-object/from16 v2, p0

    invoke-direct {v1, v2, v10, v6}, Lo/cys$1$4;-><init>(Lo/cys$1;Lo/cyi;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    const-wide/32 v2, 0x493e0

    invoke-virtual {v0, v1, v2, v3}, Lo/cys$a;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1360
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "occur ble 133 error in five minutes"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1362
    :goto_1
    goto :goto_2

    .line 1363
    :cond_7
    invoke-virtual {v10}, Lo/cyi;->d()V

    .line 1365
    :goto_2
    goto :goto_3

    .line 1366
    :cond_8
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "deviceSendCommandUtil is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1373
    :cond_9
    :goto_3
    monitor-exit v5

    goto :goto_4

    :catchall_1
    move-exception v16

    monitor-exit v5

    throw v16

    .line 1375
    :goto_4
    const/4 v0, 0x2

    move/from16 v1, p2

    if-ne v0, v1, :cond_a

    .line 1376
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Device connected so stop reconnect."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1378
    invoke-static {}, Lo/cys;->n()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/cyi;

    .line 1379
    const/4 v0, 0x0

    if-eq v0, v5, :cond_a

    .line 1381
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Stop reconnect ble for remove device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1382
    invoke-virtual {v5}, Lo/cyi;->d()V

    .line 1386
    :cond_a
    return-void
.end method

.method public e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V
    .locals 2

    .line 1390
    iget-object v0, p0, Lo/cys$1;->a:Lo/cys;

    invoke-static {v0}, Lo/cys;->d(Lo/cys;)Lo/cxx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1391
    iget-object v0, p0, Lo/cys$1;->a:Lo/cys;

    invoke-static {v0}, Lo/cys;->d(Lo/cys;)Lo/cxx;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V

    .line 1393
    :cond_0
    return-void
.end method
