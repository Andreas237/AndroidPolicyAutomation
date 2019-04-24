.class public Lo/alm;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/alm$e;
    }
.end annotation


# static fields
.field private static c:Lo/alm;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/lang/String;

.field private d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lo/alm$e;>;"
        }
    .end annotation
.end field

.field private e:Lo/amj;

.field private h:Landroid/content/BroadcastReceiver;

.field private i:Landroid/bluetooth/BluetoothGattCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 42
    const/4 v0, 0x0

    sput-object v0, Lo/alm;->c:Lo/alm;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/alm;->d:Ljava/util/HashMap;

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alm;->a:Landroid/content/Context;

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alm;->b:Ljava/lang/String;

    .line 295
    new-instance v0, Lo/alm$4;

    invoke-direct {v0, p0}, Lo/alm$4;-><init>(Lo/alm;)V

    iput-object v0, p0, Lo/alm;->h:Landroid/content/BroadcastReceiver;

    .line 328
    new-instance v0, Lo/alm$1;

    invoke-direct {v0, p0}, Lo/alm$1;-><init>(Lo/alm;)V

    iput-object v0, p0, Lo/alm;->i:Landroid/bluetooth/BluetoothGattCallback;

    .line 62
    iput-object p1, p0, Lo/alm;->a:Landroid/content/Context;

    .line 64
    new-instance v0, Lo/amj;

    iget-object v1, p0, Lo/alm;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/amj;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/alm;->e:Lo/amj;

    .line 66
    invoke-direct {p0}, Lo/alm;->c()I

    .line 68
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 69
    const-string v0, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 70
    const-string v0, "com.huawei.health.action.DEVICE_CHANGED"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 71
    iget-object v0, p0, Lo/alm;->a:Landroid/content/Context;

    iget-object v1, p0, Lo/alm;->h:Landroid/content/BroadcastReceiver;

    const-string v2, "com.cn.customview.permissions.MY_BROADCAST"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 72
    return-void
.end method

.method static synthetic a(Lo/alm;)Landroid/content/Context;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/alm;->a:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lo/alm;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 27
    iput-object p1, p0, Lo/alm;->b:Ljava/lang/String;

    return-object p1
.end method

.method private b(Landroid/bluetooth/BluetoothAdapter;Lo/alm$e;)V
    .locals 5

    .line 129
    iget v0, p2, Lo/alm$e;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 130
    iget-object v0, p2, Lo/alm$e;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothAdapter;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v4

    .line 131
    if-eqz v4, :cond_0

    .line 132
    const-string v0, "BluetoothMonitor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "connGatt to ####"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p2, Lo/alm$e;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " for ####"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p2, Lo/alm$e;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    iget-object v0, p0, Lo/alm;->a:Landroid/content/Context;

    iget-object v1, p0, Lo/alm;->i:Landroid/bluetooth/BluetoothGattCallback;

    const/4 v2, 0x1

    invoke-virtual {v4, v0, v2, v1}, Landroid/bluetooth/BluetoothDevice;->connectGatt(Landroid/content/Context;ZLandroid/bluetooth/BluetoothGattCallback;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    iput-object v0, p2, Lo/alm$e;->k:Landroid/bluetooth/BluetoothProfile;

    .line 135
    :cond_0
    goto :goto_0

    :cond_1
    iget v0, p2, Lo/alm$e;->e:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    .line 136
    const-string v0, "BluetoothMonitor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startMonitor for classic bluetooth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    iget-object v0, p2, Lo/alm$e;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothAdapter;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v4

    .line 138
    iget-object v0, p0, Lo/alm;->e:Lo/amj;

    iget-object v1, p2, Lo/alm$e;->c:Ljava/lang/String;

    iget-object v2, p2, Lo/alm$e;->d:Ljava/lang/String;

    invoke-virtual {v0, v4, v1, v2}, Lo/amj;->c(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;)Z

    .line 139
    iget-object v0, p0, Lo/alm;->e:Lo/amj;

    invoke-virtual {v0}, Lo/amj;->c()Z

    .line 141
    :cond_2
    :goto_0
    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 239
    if-eqz p1, :cond_2

    if-eqz p2, :cond_2

    if-eqz p5, :cond_2

    .line 240
    const-string v0, "BluetoothMonitor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Device for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " was added, mac = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",name = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 242
    iget-object v4, p0, Lo/alm;->d:Ljava/util/HashMap;

    monitor-enter v4

    .line 243
    :try_start_0
    iget-object v0, p0, Lo/alm;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 244
    new-instance v5, Lo/alm$e;

    const/4 v0, 0x0

    invoke-direct {v5, v0}, Lo/alm$e;-><init>(Lo/alm$4;)V

    .line 245
    iput-object p1, v5, Lo/alm$e;->c:Ljava/lang/String;

    .line 246
    iput-object p2, v5, Lo/alm$e;->b:Ljava/lang/String;

    .line 247
    iput p3, v5, Lo/alm$e;->e:I

    .line 248
    iput-object p4, v5, Lo/alm$e;->d:Ljava/lang/String;

    .line 249
    iput-object p5, v5, Lo/alm$e;->a:Ljava/lang/String;

    .line 250
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v6

    .line 251
    invoke-virtual {v6}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 252
    invoke-direct {p0, v6, v5}, Lo/alm;->b(Landroid/bluetooth/BluetoothAdapter;Lo/alm$e;)V

    .line 254
    :cond_0
    iget-object v0, p0, Lo/alm;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 256
    :cond_1
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7

    .line 258
    :cond_2
    :goto_0
    return-void
.end method

.method private c()I
    .locals 16

    .line 196
    const/4 v9, 0x0

    .line 197
    const/4 v10, 0x0

    .line 199
    move-object/from16 v0, p0

    iget-object v11, v0, Lo/alm;->d:Ljava/util/HashMap;

    monitor-enter v11

    .line 202
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lo/alm;->a:Landroid/content/Context;

    const-string v1, "device.db"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Context;->openOrCreateDatabase(Ljava/lang/String;ILandroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v9, v0

    .line 203
    move-object v0, v9

    const-string v1, "device"

    const/4 v2, 0x5

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "productId"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "uniqueId"

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const-string v3, "mode"

    const/4 v4, 0x2

    aput-object v3, v2, v4

    const-string v3, "kind"

    const/4 v4, 0x3

    aput-object v3, v2, v4

    const-string v3, "name"

    const/4 v4, 0x4

    aput-object v3, v2, v4

    const-string v3, "auto=1"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v0 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v10, v0

    .line 206
    :goto_0
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 207
    const/4 v0, 0x0

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    .line 208
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/alm;->d:Ljava/util/HashMap;

    invoke-virtual {v0, v12}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 209
    new-instance v13, Lo/alm$e;

    const/4 v0, 0x0

    invoke-direct {v13, v0}, Lo/alm$e;-><init>(Lo/alm$4;)V

    .line 210
    iput-object v12, v13, Lo/alm$e;->c:Ljava/lang/String;

    .line 211
    const/4 v0, 0x1

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v13, Lo/alm$e;->b:Ljava/lang/String;

    .line 212
    const/4 v0, 0x2

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, v13, Lo/alm$e;->e:I

    .line 213
    const/4 v0, 0x3

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v13, Lo/alm$e;->d:Ljava/lang/String;

    .line 214
    const/4 v0, 0x4

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v13, Lo/alm$e;->a:Ljava/lang/String;

    .line 215
    const-string v0, "BluetoothMonitor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "loadDeviceList() mdi.name = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v13, Lo/alm$e;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    const/4 v0, 0x0

    iput-object v0, v13, Lo/alm$e;->k:Landroid/bluetooth/BluetoothProfile;

    .line 217
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/alm;->d:Ljava/util/HashMap;

    iget-object v1, v13, Lo/alm$e;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    :cond_0
    goto/16 :goto_0

    .line 220
    :cond_1
    invoke-interface {v10}, Landroid/database/Cursor;->close()V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 225
    if-eqz v10, :cond_2

    .line 226
    :try_start_1
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 228
    :cond_2
    if-eqz v9, :cond_6

    .line 229
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    .line 221
    :catch_0
    move-exception v12

    .line 222
    const-string v0, "BluetoothMonitor"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadDeviceList SQLiteException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 225
    if-eqz v10, :cond_3

    .line 226
    :try_start_3
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 228
    :cond_3
    if-eqz v9, :cond_6

    .line 229
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    .line 225
    :catchall_0
    move-exception v14

    if-eqz v10, :cond_4

    .line 226
    :try_start_4
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 228
    :cond_4
    if-eqz v9, :cond_5

    .line 229
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 231
    :cond_5
    throw v14

    .line 233
    :cond_6
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/alm;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move-result v0

    monitor-exit v11

    return v0

    .line 235
    :catchall_1
    move-exception v15

    monitor-exit v11

    throw v15
.end method

.method static synthetic c(Lo/alm;)Ljava/util/HashMap;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/alm;->d:Ljava/util/HashMap;

    return-object v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 8

    .line 261
    if-eqz p1, :cond_3

    .line 262
    const-string v0, "BluetoothMonitor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Device for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " was removed"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    iget-object v4, p0, Lo/alm;->d:Ljava/util/HashMap;

    monitor-enter v4

    .line 266
    :try_start_0
    iput-object p1, p0, Lo/alm;->b:Ljava/lang/String;

    .line 267
    iget-object v0, p0, Lo/alm;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/alm$e;

    .line 268
    if-eqz v5, :cond_2

    .line 269
    iget v0, v5, Lo/alm$e;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 270
    iget-object v0, v5, Lo/alm$e;->k:Landroid/bluetooth/BluetoothProfile;

    move-object v6, v0

    check-cast v6, Landroid/bluetooth/BluetoothGatt;

    .line 271
    if-eqz v6, :cond_0

    .line 272
    const-string v0, "BluetoothMonitor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "removeDevice gatt != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 273
    invoke-virtual {v6}, Landroid/bluetooth/BluetoothGatt;->disconnect()V

    goto :goto_0

    .line 275
    :cond_0
    const-string v0, "BluetoothMonitor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "removeDevice gatt == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 277
    :goto_0
    goto :goto_1

    :cond_1
    iget v0, v5, Lo/alm$e;->e:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 280
    const-string v0, "BluetoothMonitor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "removeDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    iget-object v0, p0, Lo/alm;->e:Lo/amj;

    invoke-virtual {v0}, Lo/amj;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 284
    :cond_2
    :goto_1
    monitor-exit v4

    goto :goto_2

    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7

    .line 286
    :cond_3
    :goto_2
    return-void
.end method

.method static synthetic d(Lo/alm;Ljava/lang/String;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lo/alm;->c(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lo/alm;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 27
    invoke-direct/range {p0 .. p5}, Lo/alm;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic e(Lo/alm;)Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/alm;->b:Ljava/lang/String;

    return-object v0
.end method

.method public static declared-synchronized e(Landroid/content/Context;)Lo/alm;
    .locals 2

    const-class v1, Lo/alm;

    monitor-enter v1

    .line 55
    :try_start_0
    sget-object v0, Lo/alm;->c:Lo/alm;

    if-nez v0, :cond_0

    .line 56
    new-instance v0, Lo/alm;

    invoke-direct {v0, p0}, Lo/alm;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/alm;->c:Lo/alm;

    .line 58
    :cond_0
    sget-object v0, Lo/alm;->c:Lo/alm;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v1

    throw p0
.end method

.method private e(Lo/alm$e;)V
    .locals 5

    .line 181
    const-string v0, "BluetoothMonitor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "disconnectDevice enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    iget v0, p1, Lo/alm$e;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 183
    iget-object v0, p1, Lo/alm$e;->k:Landroid/bluetooth/BluetoothProfile;

    move-object v4, v0

    check-cast v4, Landroid/bluetooth/BluetoothGatt;

    .line 184
    if-eqz v4, :cond_0

    .line 185
    const-string v0, "BluetoothMonitor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BluetoothGatt disconnect and close"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    invoke-virtual {v4}, Landroid/bluetooth/BluetoothGatt;->disconnect()V

    .line 188
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p1, Lo/alm$e;->k:Landroid/bluetooth/BluetoothProfile;

    .line 189
    goto :goto_0

    :cond_1
    iget v0, p1, Lo/alm$e;->e:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 190
    const-string v0, "BluetoothMonitor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopMonitor for classic bluetooth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    iget-object v0, p0, Lo/alm;->e:Lo/amj;

    invoke-virtual {v0}, Lo/amj;->d()V

    .line 193
    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 9

    .line 75
    const-string v0, "BluetoothMonitor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startMonitor"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    :try_start_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v4

    .line 78
    invoke-virtual {v4}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-nez v0, :cond_0

    .line 79
    const/4 v0, 0x0

    return v0

    .line 82
    :cond_0
    :try_start_1
    iget-object v5, p0, Lo/alm;->d:Ljava/util/HashMap;

    monitor-enter v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 83
    const-string v0, "BluetoothMonitor"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/alm;->d:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " device(s) to be monitored"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    iget-object v0, p0, Lo/alm;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 85
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 86
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/alm$e;

    .line 87
    iget-object v0, v7, Lo/alm$e;->k:Landroid/bluetooth/BluetoothProfile;

    if-nez v0, :cond_1

    .line 88
    invoke-direct {p0, v4, v7}, Lo/alm;->b(Landroid/bluetooth/BluetoothAdapter;Lo/alm$e;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 90
    :cond_1
    goto :goto_0

    .line 91
    :cond_2
    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception v8

    monitor-exit v5

    :try_start_3
    throw v8
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 94
    :goto_1
    goto :goto_2

    .line 92
    :catch_0
    move-exception v4

    .line 93
    const-string v0, "BluetoothMonitor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startMonitor fail "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    :goto_2
    const/4 v0, 0x1

    return v0
.end method

.method public b()V
    .locals 2

    .line 289
    iget-object v0, p0, Lo/alm;->a:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 290
    iget-object v0, p0, Lo/alm;->a:Landroid/content/Context;

    iget-object v1, p0, Lo/alm;->h:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 292
    :cond_0
    return-void
.end method

.method public d()V
    .locals 5

    .line 168
    iget-object v1, p0, Lo/alm;->d:Ljava/util/HashMap;

    monitor-enter v1

    .line 169
    :try_start_0
    iget-object v0, p0, Lo/alm;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 170
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 171
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/alm$e;

    .line 172
    iget-object v0, v3, Lo/alm$e;->k:Landroid/bluetooth/BluetoothProfile;

    if-nez v0, :cond_0

    .line 173
    goto :goto_0

    .line 175
    :cond_0
    invoke-direct {p0, v3}, Lo/alm;->e(Lo/alm$e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 176
    goto :goto_0

    .line 177
    :cond_1
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v1

    throw v4

    .line 178
    :goto_1
    return-void
.end method

.method public d(Ljava/lang/String;)Z
    .locals 9

    .line 104
    const-string v0, "BluetoothMonitor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startMonitorByDeviceInfo device info = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v4

    .line 107
    invoke-virtual {v4}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 108
    const/4 v0, 0x0

    return v0

    .line 111
    :cond_0
    iget-object v5, p0, Lo/alm;->d:Ljava/util/HashMap;

    monitor-enter v5

    .line 112
    const-string v0, "BluetoothMonitor"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/alm;->d:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " device(s) to be monitored"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    iget-object v0, p0, Lo/alm;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 114
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 115
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/alm$e;

    .line 117
    iget-object v0, v7, Lo/alm$e;->k:Landroid/bluetooth/BluetoothProfile;

    if-nez v0, :cond_2

    .line 118
    iget-object v0, v7, Lo/alm$e;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, v7, Lo/alm$e;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 119
    :cond_1
    invoke-direct {p0, v4, v7}, Lo/alm;->b(Landroid/bluetooth/BluetoothAdapter;Lo/alm$e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    :cond_2
    goto :goto_0

    .line 123
    :cond_3
    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception v8

    monitor-exit v5

    throw v8

    .line 125
    :goto_1
    const/4 v0, 0x1

    return v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 8

    .line 148
    const-string v0, "BluetoothMonitor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stopMonitorByDeviceInfo deviceInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    iget-object v4, p0, Lo/alm;->d:Ljava/util/HashMap;

    monitor-enter v4

    .line 151
    :try_start_0
    iget-object v0, p0, Lo/alm;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 152
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 153
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/alm$e;

    .line 154
    iget-object v0, v6, Lo/alm$e;->k:Landroid/bluetooth/BluetoothProfile;

    if-nez v0, :cond_0

    .line 155
    goto :goto_0

    .line 157
    :cond_0
    iget-object v0, v6, Lo/alm$e;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, v6, Lo/alm$e;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 158
    :cond_1
    invoke-direct {p0, v6}, Lo/alm;->e(Lo/alm$e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    :cond_2
    goto :goto_0

    .line 162
    :cond_3
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7

    .line 164
    :goto_1
    return-void
.end method
