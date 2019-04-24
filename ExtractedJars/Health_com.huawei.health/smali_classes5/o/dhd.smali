.class public Lo/dhd;
.super Lo/cwz;
.source "SourceFile"


# static fields
.field private static a:Lo/dhd;

.field private static b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private static c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field


# instance fields
.field private d:Landroid/content/Context;

.field private e:Lo/dde;

.field private f:Lo/dqi;

.field private h:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private i:Landroid/content/BroadcastReceiver;

.field private k:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 59
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/dhd;->c:Ljava/util/List;

    .line 64
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/dhd;->b:Ljava/util/List;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 79
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 219
    new-instance v0, Lo/dhd$5;

    invoke-direct {v0, p0}, Lo/dhd$5;-><init>(Lo/dhd;)V

    iput-object v0, p0, Lo/dhd;->h:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 281
    new-instance v0, Lo/dhd$3;

    invoke-direct {v0, p0}, Lo/dhd$3;-><init>(Lo/dhd;)V

    iput-object v0, p0, Lo/dhd;->i:Landroid/content/BroadcastReceiver;

    .line 342
    new-instance v0, Lo/dhd$1;

    invoke-direct {v0, p0}, Lo/dhd$1;-><init>(Lo/dhd;)V

    iput-object v0, p0, Lo/dhd;->k:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 80
    iput-object p1, p0, Lo/dhd;->d:Landroid/content/Context;

    .line 82
    iget-object v0, p0, Lo/dhd;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    iput-object v0, p0, Lo/dhd;->f:Lo/dqi;

    .line 83
    iget-object v0, p0, Lo/dhd;->f:Lo/dqi;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 84
    const-string v0, "HWLinkLossAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHwCombineMigrateMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    :cond_0
    invoke-static {p1}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    iput-object v0, p0, Lo/dhd;->e:Lo/dde;

    .line 88
    iget-object v0, p0, Lo/dhd;->e:Lo/dde;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 89
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 90
    iget-object v0, p0, Lo/dhd;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/dhd;->i:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 92
    iget-object v0, p0, Lo/dhd;->e:Lo/dde;

    iget-object v1, p0, Lo/dhd;->h:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/16 v2, 0xb

    invoke-virtual {v0, v2, v1}, Lo/dde;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 95
    invoke-direct {p0}, Lo/dhd;->c()V

    .line 96
    goto :goto_0

    .line 98
    :cond_1
    const-string v0, "HWLinkLossAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWLinkLossAlarmManager() hwDeviceConfigManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    :goto_0
    return-void
.end method

.method static synthetic a(Lo/dhd;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 38
    iget-object v0, p0, Lo/dhd;->k:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method public static a()Lo/dhd;
    .locals 2

    .line 72
    sget-object v0, Lo/dhd;->a:Lo/dhd;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 73
    new-instance v0, Lo/dhd;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/dhd;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dhd;->a:Lo/dhd;

    .line 75
    :cond_0
    sget-object v0, Lo/dhd;->a:Lo/dhd;

    return-object v0
.end method

.method private a(Ljava/lang/String;Z)V
    .locals 5

    .line 189
    const-string v0, "HWLinkLossAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveBTLostRemindEnableToSharedPreference() : flag = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    iget-object v0, p0, Lo/dhd;->e:Lo/dde;

    invoke-virtual {v0, p1}, Lo/dde;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 191
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 192
    if-eqz p2, :cond_0

    .line 196
    iget-object v0, p0, Lo/dhd;->f:Lo/dqi;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 197
    const-string v0, "HWLinkLossAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "migrateBTLostRemind + "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    iget-object v0, p0, Lo/dhd;->f:Lo/dqi;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dqi;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 205
    :cond_0
    iget-object v0, p0, Lo/dhd;->f:Lo/dqi;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 206
    const-string v0, "HWLinkLossAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "migrateBTLostRemind + "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    iget-object v0, p0, Lo/dhd;->f:Lo/dqi;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dqi;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 212
    :cond_1
    const-string v0, "HWLinkLossAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveBTLostRemindEnableToSharedPreference() : deviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    :cond_2
    :goto_0
    return-void
.end method

.method private b([B)I
    .locals 3

    .line 274
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v2

    .line 275
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method private static declared-synchronized b()Ljava/lang/Object;
    .locals 3

    const-class v1, Lo/dhd;

    monitor-enter v1

    .line 354
    :try_start_0
    sget-object v0, Lo/dhd;->c:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method static synthetic c(Lo/dhd;)Lo/dde;
    .locals 1

    .line 38
    iget-object v0, p0, Lo/dhd;->e:Lo/dde;

    return-object v0
.end method

.method private c()V
    .locals 4

    .line 309
    const-string v0, "HWLinkLossAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "autoSendCommend() enter."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    iget-object v0, p0, Lo/dhd;->f:Lo/dqi;

    const-string v1, "bt_lost_remind"

    new-instance v2, Lo/dhd$4;

    invoke-direct {v2, p0}, Lo/dhd$4;-><init>(Lo/dhd;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 337
    return-void
.end method

.method private static declared-synchronized d()Ljava/lang/Object;
    .locals 3

    const-class v1, Lo/dhd;

    monitor-enter v1

    .line 362
    :try_start_0
    sget-object v0, Lo/dhd;->b:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private static e()V
    .locals 4

    .line 123
    const/4 v0, 0x0

    sput-object v0, Lo/dhd;->a:Lo/dhd;

    .line 124
    invoke-static {}, Lo/dhd;->d()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 125
    :try_start_0
    sget-object v0, Lo/dhd;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 127
    :goto_0
    invoke-static {}, Lo/dhd;->b()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 128
    :try_start_1
    sget-object v0, Lo/dhd;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 129
    monitor-exit v1

    goto :goto_1

    :catchall_1
    move-exception v3

    monitor-exit v1

    throw v3

    .line 130
    :goto_1
    return-void
.end method

.method static synthetic e(Lo/dhd;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Lo/dhd;->c()V

    return-void
.end method

.method static synthetic e(Lo/dhd;[B)V
    .locals 0

    .line 38
    invoke-direct {p0, p1}, Lo/dhd;->e([B)V

    return-void
.end method

.method private e([B)V
    .locals 9

    .line 232
    const-string v0, "HWLinkLossAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getResult(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    const/4 v0, 0x1

    aget-byte v0, p1, v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    .line 235
    :sswitch_0
    invoke-direct {p0, p1}, Lo/dhd;->b([B)I

    move-result v4

    .line 236
    const/4 v5, -0x1

    .line 237
    const v0, 0x186a0

    if-ne v0, v4, :cond_0

    .line 238
    const/4 v5, 0x0

    .line 240
    :cond_0
    invoke-static {}, Lo/dhd;->b()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    .line 241
    :try_start_0
    sget-object v0, Lo/dhd;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 242
    sget-object v0, Lo/dhd;->c:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v5, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 243
    sget-object v0, Lo/dhd;->c:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 245
    :cond_1
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 246
    :goto_0
    goto :goto_1

    .line 249
    :sswitch_1
    invoke-direct {p0, p1}, Lo/dhd;->b([B)I

    move-result v4

    .line 250
    const/4 v5, -0x1

    .line 251
    const v0, 0x186a0

    if-ne v0, v4, :cond_2

    .line 252
    const/4 v5, 0x0

    .line 254
    :cond_2
    invoke-static {}, Lo/dhd;->d()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    .line 255
    :try_start_1
    sget-object v0, Lo/dhd;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 256
    sget-object v0, Lo/dhd;->b:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v5, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 257
    sget-object v0, Lo/dhd;->b:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 259
    :cond_3
    monitor-exit v6

    goto :goto_1

    :catchall_1
    move-exception v8

    monitor-exit v6

    throw v8

    .line 260
    .line 266
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public e(Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 160
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWLinkLossAlarmManager"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " setBTLostRemindEnable"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    new-instance v4, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 162
    const/16 v0, 0xb

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 163
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 164
    invoke-virtual {v4, p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 166
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v5

    .line 167
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 168
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 169
    if-eqz p2, :cond_0

    .line 170
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_0

    .line 173
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 175
    :goto_0
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 176
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 177
    iget-object v0, p0, Lo/dhd;->e:Lo/dde;

    invoke-virtual {v0, v4}, Lo/dde;->b(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 179
    invoke-static {}, Lo/dhd;->d()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    .line 180
    :try_start_0
    sget-object v0, Lo/dhd;->b:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 181
    monitor-exit v6

    goto :goto_1

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 183
    :goto_1
    invoke-direct {p0, p1, p2}, Lo/dhd;->a(Ljava/lang/String;Z)V

    .line 184
    return-void
.end method

.method protected getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 104
    const/16 v0, 0xb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public onDataMigrate()Z
    .locals 1

    .line 372
    const/4 v0, 0x1

    return v0
.end method

.method protected onDestroy()V
    .locals 5

    .line 109
    invoke-super {p0}, Lo/cwz;->onDestroy()V

    .line 111
    :try_start_0
    invoke-static {}, Lo/dhd;->e()V

    .line 112
    iget-object v0, p0, Lo/dhd;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/dhd;->i:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 115
    goto :goto_0

    .line 113
    :catch_0
    move-exception v4

    .line 114
    const-string v0, "HWLinkLossAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mConnectStateChangedReceiver is not registered"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    :goto_0
    const-string v0, "HWLinkLossAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    return-void
.end method
