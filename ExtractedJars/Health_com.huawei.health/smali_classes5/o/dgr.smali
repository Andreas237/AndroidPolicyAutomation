.class public Lo/dgr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwservicesmgr/remote/parser/IParser;


# static fields
.field private static k:Lo/dgr;


# instance fields
.field a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field d:Lo/dhj;

.field e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private f:J

.field private g:Landroid/content/Context;

.field private h:Lcom/huawei/datatype/GpsParameter;

.field private i:Z

.field private l:Lo/dgs;

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/datatype/GPSStruct;>;"
        }
    .end annotation
.end field

.field private n:Landroid/location/Location;

.field private o:Ljava/lang/String;

.field private p:J

.field private s:Landroid/content/BroadcastReceiver;

.field private t:Ljava/lang/Object;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 6

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dgr;->i:Z

    .line 69
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/dgr;->f:J

    .line 71
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dgr;->m:Ljava/util/List;

    .line 77
    const-string v0, ""

    iput-object v0, p0, Lo/dgr;->o:Ljava/lang/String;

    .line 87
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/dgr;->t:Ljava/lang/Object;

    .line 356
    new-instance v0, Lo/dgr$5;

    invoke-direct {v0, p0}, Lo/dgr$5;-><init>(Lo/dgr;)V

    iput-object v0, p0, Lo/dgr;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 367
    new-instance v0, Lo/dgr$1;

    invoke-direct {v0, p0}, Lo/dgr$1;-><init>(Lo/dgr;)V

    iput-object v0, p0, Lo/dgr;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 375
    new-instance v0, Lo/dgr$3;

    invoke-direct {v0, p0}, Lo/dgr$3;-><init>(Lo/dgr;)V

    iput-object v0, p0, Lo/dgr;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 417
    new-instance v0, Lo/dgr$4;

    invoke-direct {v0, p0}, Lo/dgr$4;-><init>(Lo/dgr;)V

    iput-object v0, p0, Lo/dgr;->d:Lo/dhj;

    .line 474
    new-instance v0, Lo/dgr$2;

    invoke-direct {v0, p0}, Lo/dgr$2;-><init>(Lo/dgr;)V

    iput-object v0, p0, Lo/dgr;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 484
    new-instance v0, Lo/dgr$10;

    invoke-direct {v0, p0}, Lo/dgr$10;-><init>(Lo/dgr;)V

    iput-object v0, p0, Lo/dgr;->s:Landroid/content/BroadcastReceiver;

    .line 97
    iput-object p1, p0, Lo/dgr;->g:Landroid/content/Context;

    .line 98
    new-instance v0, Lo/dgs;

    invoke-direct {v0, p0}, Lo/dgs;-><init>(Lo/dgr;)V

    iput-object v0, p0, Lo/dgr;->l:Lo/dgs;

    .line 100
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 101
    iget-object v0, p0, Lo/dgr;->g:Landroid/content/Context;

    iget-object v1, p0, Lo/dgr;->s:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 102
    invoke-direct {p0}, Lo/dgr;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 103
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 104
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dgr;->o:Ljava/lang/String;

    .line 107
    :cond_0
    iget-object v0, p0, Lo/dgr;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0, v0}, Lo/dgr;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 109
    invoke-static {}, Lo/dgq;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 110
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 111
    invoke-virtual {p0}, Lo/dgr;->e()V

    .line 114
    :cond_1
    return-void
.end method

.method static synthetic a(Lo/dgr;J)J
    .locals 0

    .line 56
    iput-wide p1, p0, Lo/dgr;->f:J

    return-wide p1
.end method

.method static synthetic a(Lo/dgr;)Landroid/location/Location;
    .locals 1

    .line 56
    iget-object v0, p0, Lo/dgr;->n:Landroid/location/Location;

    return-object v0
.end method

.method public static a()Lo/dgr;
    .locals 2

    .line 90
    sget-object v0, Lo/dgr;->k:Lo/dgr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 91
    new-instance v0, Lo/dgr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/dgr;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dgr;->k:Lo/dgr;

    .line 93
    :cond_0
    sget-object v0, Lo/dgr;->k:Lo/dgr;

    return-object v0
.end method

.method static synthetic a(Lo/dgr;Z)Z
    .locals 0

    .line 56
    iput-boolean p1, p0, Lo/dgr;->i:Z

    return p1
.end method

.method static synthetic b(Lo/dgr;Landroid/location/Location;)Landroid/location/Location;
    .locals 0

    .line 56
    iput-object p1, p0, Lo/dgr;->n:Landroid/location/Location;

    return-object p1
.end method

.method static synthetic b(Lo/dgr;)Lcom/huawei/datatype/GpsParameter;
    .locals 1

    .line 56
    iget-object v0, p0, Lo/dgr;->h:Lcom/huawei/datatype/GpsParameter;

    return-object v0
.end method

.method static synthetic b(Lo/dgr;Lcom/huawei/datatype/GpsParameter;)Lcom/huawei/datatype/GpsParameter;
    .locals 0

    .line 56
    iput-object p1, p0, Lo/dgr;->h:Lcom/huawei/datatype/GpsParameter;

    return-object p1
.end method

.method private b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 3

    .line 319
    invoke-static {}, Lo/dgq;->b()Ljava/util/List;

    move-result-object v1

    monitor-enter v1

    .line 320
    :try_start_0
    invoke-static {}, Lo/dgq;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 321
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 322
    :goto_0
    return-void
.end method

.method static synthetic c(Lo/dgr;)Ljava/lang/Object;
    .locals 1

    .line 56
    iget-object v0, p0, Lo/dgr;->t:Ljava/lang/Object;

    return-object v0
.end method

.method private c(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V
    .locals 4

    .line 139
    const-string v0, "HWGPSLocationManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendCommand  deviceCommand = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getDataContent()[B

    move-result-object v3

    invoke-static {v3}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 141
    return-void
.end method

.method static synthetic c(Lo/dgr;Z)V
    .locals 0

    .line 56
    invoke-direct {p0, p1}, Lo/dgr;->e(Z)V

    return-void
.end method

.method static synthetic d(Lo/dgr;)Landroid/content/Context;
    .locals 1

    .line 56
    iget-object v0, p0, Lo/dgr;->g:Landroid/content/Context;

    return-object v0
.end method

.method private d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 7

    .line 121
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    invoke-virtual {v0}, Lo/dea;->a()Ljava/util/List;

    move-result-object v4

    .line 122
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_2

    .line 123
    const-string v0, "HWGPSLocationManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCurrentDeviceInfo() deviceList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 125
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 126
    return-object v6

    .line 128
    :cond_0
    goto :goto_0

    .line 129
    :cond_1
    const-string v0, "HWGPSLocationManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentDeviceInfo() device\'s ActiveState not DeviceActiveState.DEVICE_ACTIVE_ENABLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    const/4 v0, 0x0

    return-object v0

    .line 133
    :cond_2
    const-string v0, "HWGPSLocationManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentDeviceInfo() deviceInfoList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic d(Lo/dgr;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 56
    iput-object p1, p0, Lo/dgr;->o:Ljava/lang/String;

    return-object p1
.end method

.method private e(Z)V
    .locals 9

    .line 540
    const-string v0, "HWGPSLocationManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is open:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 541
    const/4 v5, 0x1

    .line 543
    if-eqz p1, :cond_2

    .line 546
    :try_start_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-virtual {v0, v1}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    invoke-virtual {v0, v1}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_1

    .line 547
    :cond_0
    const/4 v5, 0x0

    .line 551
    :cond_1
    goto :goto_0

    .line 549
    :catch_0
    move-exception v6

    .line 550
    const-string v0, "HWGPSLocationManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkPermission:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/NoSuchMethodError;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 553
    :cond_2
    :goto_0
    if-eqz p1, :cond_3

    if-nez v5, :cond_4

    .line 554
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 555
    const-string v0, "HWGPSLocationManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "currentTime is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ";showTime is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lo/dgr;->p:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 556
    iget-wide v0, p0, Lo/dgr;->p:J

    sub-long v0, v6, v0

    const-wide/32 v2, 0x6ddd00

    cmp-long v0, v0, v2

    if-lez v0, :cond_4

    .line 557
    const-string v0, "HWGPSLocationManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is over 2hours"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 559
    iput-wide v6, p0, Lo/dgr;->p:J

    .line 561
    new-instance v8, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.action.open_gps"

    invoke-direct {v8, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 562
    const-string v0, "com.huawei.health"

    invoke-virtual {v8, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 563
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v8, v1}, Landroid/content/Context;->sendOrderedBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 566
    :cond_4
    return-void
.end method

.method static synthetic e(Lo/dgr;)Z
    .locals 1

    .line 56
    iget-boolean v0, p0, Lo/dgr;->i:Z

    return v0
.end method

.method static synthetic f(Lo/dgr;)J
    .locals 2

    .line 56
    iget-wide v0, p0, Lo/dgr;->f:J

    return-wide v0
.end method

.method static synthetic g(Lo/dgr;)Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lo/dgr;->o:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic h(Lo/dgr;)Ljava/util/List;
    .locals 1

    .line 56
    iget-object v0, p0, Lo/dgr;->m:Ljava/util/List;

    return-object v0
.end method

.method static synthetic i(Lo/dgr;)Lo/dgs;
    .locals 1

    .line 56
    iget-object v0, p0, Lo/dgr;->l:Lo/dgs;

    return-object v0
.end method


# virtual methods
.method public a(ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 12

    .line 245
    invoke-static {}, Lo/dgq;->a()Ljava/util/List;

    move-result-object v2

    monitor-enter v2

    .line 246
    :try_start_0
    new-instance v3, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v3}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 247
    const/16 v0, 0x18

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 248
    const/4 v0, 0x4

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 251
    const-string v4, ""

    .line 252
    const-string v5, ""

    .line 255
    const-string v6, ""

    .line 256
    if-eqz p1, :cond_0

    .line 257
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v6

    .line 258
    const/16 v0, 0xff

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v4

    .line 259
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 261
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v6

    .line 262
    const/16 v0, 0xf

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v4

    .line 263
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v5

    .line 267
    :goto_0
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v7

    .line 269
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v8

    .line 271
    const/4 v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v9

    .line 273
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 274
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 282
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 284
    invoke-direct {p0, v3}, Lo/dgr;->c(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 286
    invoke-static {}, Lo/dgq;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 287
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v11

    monitor-exit v2

    throw v11

    .line 288
    :goto_1
    return-void
.end method

.method public b()V
    .locals 4

    .line 530
    iget-boolean v0, p0, Lo/dgr;->i:Z

    if-eqz v0, :cond_0

    .line 531
    const-string v0, "HWGPSLocationManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegisterLocationCallback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 533
    invoke-static {}, Lo/dhg;->d()Lo/dhg;

    move-result-object v0

    const-string v1, "wearSportTrackLocation"

    invoke-virtual {v0, v1}, Lo/dhg;->d(Ljava/lang/String;)V

    .line 535
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dgr;->i:Z

    .line 537
    :cond_0
    return-void
.end method

.method public c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 148
    invoke-static {}, Lo/dgq;->e()Ljava/util/List;

    move-result-object v2

    monitor-enter v2

    .line 149
    :try_start_0
    new-instance v3, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v3}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 150
    const/16 v0, 0x18

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 151
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 154
    const/4 v0, 0x0

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v4

    .line 156
    const/16 v0, 0x81

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v5

    .line 158
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 159
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 163
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 165
    invoke-direct {p0, v3}, Lo/dgr;->c(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 167
    invoke-static {}, Lo/dgq;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 168
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v2

    throw v7

    .line 169
    :goto_0
    return-void
.end method

.method public c(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/GPSStruct;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V"
        }
    .end annotation

    .line 208
    const-string v0, "HWGPSLocationManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "gpsStructs.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    new-instance v4, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 210
    const/16 v0, 0x18

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 211
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 214
    const-string v5, ""

    .line 215
    invoke-static {v5, p1, p3}, Lo/dgq;->e(Ljava/lang/String;Ljava/util/List;Z)Ljava/lang/String;

    move-result-object v5

    .line 217
    const-string v0, "HWGPSLocationManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setGPSParameter(): gpsListValueHex = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 220
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v6

    .line 222
    const/16 v0, 0x81

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v7

    .line 224
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 225
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    const-string v0, "HWGPSLocationManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setGPSParameter(): gpsListHex = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 232
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 234
    invoke-direct {p0, v4}, Lo/dgr;->c(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 236
    invoke-static {}, Lo/dgq;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 238
    return-void
.end method

.method public d(I)V
    .locals 11

    .line 175
    invoke-static {}, Lo/dgq;->e()Ljava/util/List;

    move-result-object v4

    monitor-enter v4

    .line 176
    const-string v0, "HWGPSLocationManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGPSParameter = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    new-instance v5, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 178
    const/16 v0, 0x18

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 179
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 182
    int-to-long v0, p1

    invoke-static {v0, v1}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v6

    .line 184
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v7

    .line 186
    const/16 v0, 0x7f

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v8

    .line 188
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 189
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 194
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 196
    invoke-direct {p0, v5}, Lo/dgr;->c(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 197
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v10

    monitor-exit v4

    throw v10

    .line 198
    :goto_0
    return-void
.end method

.method public final e()V
    .locals 6

    .line 335
    const/4 v4, 0x0

    .line 337
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    invoke-virtual {v0}, Lo/dea;->c()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v5

    .line 338
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 339
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGPSSetParameter()Z

    move-result v4

    .line 341
    :cond_0
    const-string v0, "HWGPSLocationManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isSupportGPSSetParamet:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 342
    if-eqz v4, :cond_2

    .line 344
    invoke-static {}, Lo/dbf;->p()Z

    move-result v0

    if-nez v0, :cond_1

    .line 345
    const-string v0, "HWGPSLocationManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not EMUI5.0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 346
    iget-object v0, p0, Lo/dgr;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lo/dgr;->a(ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 348
    :cond_1
    const-string v0, "HWGPSLocationManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is EMUI5.0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 349
    iget-object v0, p0, Lo/dgr;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0}, Lo/dgr;->a(ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 352
    :cond_2
    iget-object v0, p0, Lo/dgr;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {p0, v0}, Lo/dgr;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 354
    :goto_0
    return-void
.end method

.method public getResult(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V
    .locals 4

    .line 327
    const-string v0, "HWGPSLocationManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getResult(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p2}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    invoke-static {p2}, Lo/dgo;->a([B)V

    .line 329
    return-void
.end method
