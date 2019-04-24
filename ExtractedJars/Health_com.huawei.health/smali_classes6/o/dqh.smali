.class public Lo/dqh;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lo/dqh;

.field private static b:Landroid/content/Context;


# instance fields
.field private e:Lo/daz;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    new-instance v0, Lo/daz;

    invoke-direct {v0}, Lo/daz;-><init>()V

    iput-object v0, p0, Lo/dqh;->e:Lo/daz;

    .line 66
    return-void
.end method

.method private c(Lcom/huawei/datatype/WearableOpenAppInfo;)V
    .locals 7

    .line 106
    sget-object v0, Lo/dqh;->b:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 108
    const-string v0, "com.huawei.bone"

    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/datatype/WearableOpenAppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 109
    invoke-virtual {p1}, Lcom/huawei/datatype/WearableOpenAppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/dqh;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 110
    :cond_0
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 111
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 112
    invoke-virtual {p1}, Lcom/huawei/datatype/WearableOpenAppInfo;->getClassName()Ljava/lang/String;

    move-result-object v6

    .line 113
    const-string v0, "com.huawei.sim.esim.view.EsimActivationActivity"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 114
    const-string v6, "com.huawei.sim.esim.view.WirelessManagerAcitivity"

    .line 116
    :cond_1
    const-string v0, "health_activity_id"

    invoke-virtual {v5, v0, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 117
    sget-object v0, Lo/dqh;->b:Landroid/content/Context;

    const-string v1, "com.huawei.health.StartHealthActivity"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 118
    invoke-virtual {v5, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 119
    const/high16 v0, 0x10000000

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 120
    sget-object v0, Lo/dqh;->b:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 121
    goto :goto_0

    .line 122
    :cond_2
    new-instance v4, Landroid/content/Intent;

    const-string v0, "android.intent.action.MAIN"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 123
    new-instance v5, Landroid/content/ComponentName;

    invoke-virtual {p1}, Lcom/huawei/datatype/WearableOpenAppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v0

    .line 124
    invoke-virtual {p1}, Lcom/huawei/datatype/WearableOpenAppInfo;->getClassName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v5, v0, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    invoke-virtual {v4, v5}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 126
    sget-object v0, Lo/dqh;->b:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 130
    :goto_0
    goto :goto_1

    .line 128
    :catch_0
    move-exception v4

    .line 129
    const-string v0, "HWWakeAppManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startActivity catch e:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    :cond_3
    :goto_1
    new-instance v4, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 134
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 135
    const/16 v0, 0x17

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 137
    const/4 v0, 0x6

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v5

    .line 138
    const/16 v0, 0x7f

    invoke-virtual {v5, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 139
    const/4 v0, 0x4

    invoke-virtual {v5, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 140
    const-wide/32 v0, 0x186a0

    invoke-static {v0, v1}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 142
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 143
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 144
    sget-object v0, Lo/dqh;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 145
    return-void
.end method

.method public static e(Landroid/content/Context;)Lo/dqh;
    .locals 4

    .line 56
    sget-object v0, Lo/dqh;->a:Lo/dqh;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 57
    sput-object p0, Lo/dqh;->b:Landroid/content/Context;

    .line 58
    const-string v0, "HWWakeAppManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getInstance() context = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    new-instance v0, Lo/dqh;

    invoke-direct {v0}, Lo/dqh;-><init>()V

    sput-object v0, Lo/dqh;->a:Lo/dqh;

    .line 61
    :cond_0
    sget-object v0, Lo/dqh;->a:Lo/dqh;

    return-object v0
.end method


# virtual methods
.method public a([B)V
    .locals 10

    .line 70
    new-instance v4, Lcom/huawei/datatype/WearableOpenAppInfo;

    invoke-direct {v4}, Lcom/huawei/datatype/WearableOpenAppInfo;-><init>()V

    .line 71
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v5

    .line 72
    const-string v0, "HWWakeAppManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleOpenApp data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v5, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 75
    :try_start_0
    iget-object v0, p0, Lo/dqh;->e:Lo/daz;

    invoke-virtual {v0, v6}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v7

    .line 76
    iget-object v0, v7, Lo/dba;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/daw;

    .line 77
    invoke-virtual {v9}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 79
    :sswitch_0
    invoke-virtual {v9}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/datatype/WearableOpenAppInfo;->setPackageName(Ljava/lang/String;)V

    .line 80
    goto :goto_1

    .line 83
    :sswitch_1
    invoke-virtual {v9}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/datatype/WearableOpenAppInfo;->setClassName(Ljava/lang/String;)V

    .line 84
    .line 90
    :goto_1
    goto :goto_0

    .line 91
    :cond_0
    invoke-direct {p0, v4}, Lo/dqh;->c(Lcom/huawei/datatype/WearableOpenAppInfo;)V
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    goto :goto_2

    .line 93
    :catch_0
    move-exception v7

    .line 94
    const-string v0, "HWWakeAppManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "COMMAND_ID_GET_DATE error e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    :goto_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method
