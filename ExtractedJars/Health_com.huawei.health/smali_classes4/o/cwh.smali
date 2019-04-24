.class public Lo/cwh;
.super Lo/cwz;
.source "SourceFile"


# static fields
.field private static b:Lo/cwh;

.field private static c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;>;"
        }
    .end annotation
.end field

.field private static d:Lo/dde;

.field private static e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# instance fields
.field private a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 59
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/cwh;->c:Ljava/util/Map;

    .line 64
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Integer;

    .line 65
    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 64
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lo/cwh;->e:Ljava/util/List;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 85
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 184
    new-instance v0, Lo/cwh$3;

    invoke-direct {v0, p0}, Lo/cwh$3;-><init>(Lo/cwh;)V

    iput-object v0, p0, Lo/cwh;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 86
    invoke-static {p1}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    sput-object v0, Lo/cwh;->d:Lo/dde;

    .line 87
    sget-object v0, Lo/cwh;->d:Lo/dde;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 89
    sget-object v0, Lo/cwh;->d:Lo/dde;

    iget-object v1, p0, Lo/cwh;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/16 v2, 0x1a

    invoke-virtual {v0, v2, v1}, Lo/dde;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 91
    :cond_0
    const-string v0, "HWWearableManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWWearableManager() hwDeviceConfigManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    :goto_0
    return-void
.end method

.method private static declared-synchronized b()Ljava/lang/Object;
    .locals 3

    const-class v1, Lo/cwh;

    monitor-enter v1

    .line 303
    :try_start_0
    sget-object v0, Lo/cwh;->c:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private c([B)I
    .locals 4

    .line 267
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v2

    .line 269
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 270
    :catch_0
    move-exception v3

    .line 271
    const/4 v0, 0x0

    return v0
.end method

.method public static c()Lo/cwh;
    .locals 6

    .line 71
    invoke-static {}, Lo/cwh;->b()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 72
    :try_start_0
    sget-object v0, Lo/cwh;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 73
    sget-object v0, Lo/cwh;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/Integer;

    .line 74
    sget-object v0, Lo/cwh;->c:Ljava/util/Map;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    goto :goto_0

    .line 77
    :cond_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v2

    throw v5

    .line 78
    :goto_1
    sget-object v0, Lo/cwh;->b:Lo/cwh;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 79
    new-instance v0, Lo/cwh;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/cwh;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/cwh;->b:Lo/cwh;

    .line 81
    :cond_1
    sget-object v0, Lo/cwh;->b:Lo/cwh;

    return-object v0
.end method

.method static synthetic c(Lo/cwh;[B)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lo/cwh;->d([B)V

    return-void
.end method

.method private d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/nio/ByteBuffer;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 7

    .line 315
    invoke-static {}, Lo/cwh;->b()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 316
    const/4 v0, 0x0

    if-eq v0, p4, :cond_1

    .line 317
    :try_start_0
    sget-object v0, Lo/cwh;->c:Ljava/util/Map;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    .line 318
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 319
    invoke-interface {v5, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 321
    :cond_0
    const-string v0, "HWWearableManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addToList() callbacks is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 323
    :goto_0
    goto :goto_1

    .line 324
    :cond_1
    const-string v0, "HWWearableManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addToList() callback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 326
    :goto_1
    monitor-exit v4

    goto :goto_2

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 327
    :goto_2
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 328
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 329
    sget-object v0, Lo/cwh;->d:Lo/dde;

    invoke-virtual {v0, p1}, Lo/dde;->b(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 330
    return-void
.end method

.method private d([B)V
    .locals 14

    .line 200
    const/4 v4, 0x0

    .line 203
    invoke-direct {p0, p1}, Lo/cwh;->c([B)I

    move-result v7

    .line 205
    const v0, 0x186a0

    if-ne v0, v7, :cond_0

    .line 206
    const/4 v8, 0x0

    goto :goto_0

    .line 208
    :cond_0
    const/4 v8, -0x1

    .line 210
    :goto_0
    const-string v0, "HWWearableManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getResult err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    const/4 v0, 0x1

    aget-byte v0, p1, v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_3

    .line 213
    :sswitch_0
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v5

    .line 214
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v5, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 216
    :try_start_0
    new-instance v9, Lo/daz;

    invoke-direct {v9}, Lo/daz;-><init>()V

    .line 217
    invoke-virtual {v9, v6}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v10

    .line 218
    iget-object v0, v10, Lo/dba;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/daw;

    .line 219
    invoke-virtual {v12}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    .line 221
    :sswitch_1
    const/4 v8, 0x0

    .line 222
    invoke-virtual {v12}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    .line 223
    goto :goto_2

    .line 226
    :sswitch_2
    invoke-virtual {v12}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 227
    .line 233
    :goto_2
    goto :goto_1

    .line 236
    :cond_1
    goto :goto_3

    .line 234
    :catch_0
    move-exception v9

    .line 235
    const-string v0, "HWWearableManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "COMMAND_ID_GET_DATE error e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    .line 244
    :goto_3
    invoke-static {}, Lo/cwh;->b()Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9

    .line 245
    :try_start_1
    sget-object v0, Lo/cwh;->c:Ljava/util/Map;

    const/4 v1, 0x1

    aget-byte v1, p1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/util/List;

    .line 246
    const/4 v0, 0x0

    if-eq v0, v10, :cond_3

    .line 247
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 248
    const/4 v0, 0x0

    invoke-interface {v10, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, v8, v4}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 249
    const/4 v0, 0x0

    invoke-interface {v10, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_4

    .line 251
    :cond_2
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 252
    const/4 v0, 0x0

    invoke-interface {v10, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "UNKNOWN_ERROR"

    const v2, 0x186a1

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 253
    const/4 v0, 0x0

    invoke-interface {v10, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 257
    :cond_3
    :goto_4
    monitor-exit v9

    goto :goto_5

    :catchall_0
    move-exception v13

    monitor-exit v9

    throw v13

    .line 258
    :goto_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x1 -> :sswitch_1
        0x7f -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 10

    .line 138
    const-string v0, "HWWearableManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ENTER sendAccount "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v4

    .line 141
    const-string v0, "HWWearableManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendAccount ability : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    if-ne v3, v4, :cond_0

    const-string v3, "null"

    goto :goto_0

    :cond_0
    move-object v3, v4

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    const/4 v0, 0x0

    if-ne v0, v4, :cond_2

    .line 144
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 145
    const/4 v0, -0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p2, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 147
    :cond_1
    const-string v0, "HWWearableManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ability is null , Do not sendAccount "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    return-void

    .line 151
    :cond_2
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAccount()Z

    move-result v0

    if-nez v0, :cond_4

    .line 152
    const/4 v0, 0x0

    if-eq v0, p2, :cond_3

    .line 153
    const/4 v0, -0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, -0x2

    invoke-interface {p2, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 155
    :cond_3
    const-string v0, "HWWearableManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " bot SupportAccount , Do not sendAccount "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    return-void

    .line 159
    :cond_4
    new-instance v5, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 160
    const/16 v0, 0x1a

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 161
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 164
    invoke-static {p1}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 166
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v7

    .line 168
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v8

    .line 170
    .line 171
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    .line 170
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v9

    .line 173
    invoke-static {v8}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 174
    invoke-static {v7}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 175
    invoke-static {v6}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 177
    const/4 v0, 0x1

    invoke-direct {p0, v5, v9, v0, p2}, Lo/cwh;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/nio/ByteBuffer;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 178
    return-void
.end method

.method protected getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 277
    const/16 v0, 0x1a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected onDestroy()V
    .locals 7

    .line 282
    invoke-super {p0}, Lo/cwz;->onDestroy()V

    .line 284
    sget-object v0, Lo/cwh;->d:Lo/dde;

    const/16 v1, 0x1a

    invoke-virtual {v0, v1}, Lo/dde;->d(I)V

    .line 286
    invoke-static {}, Lo/cwh;->b()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 287
    const/4 v5, 0x0

    :goto_0
    :try_start_0
    sget-object v0, Lo/cwh;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 288
    sget-object v0, Lo/cwh;->c:Ljava/util/Map;

    sget-object v1, Lo/cwh;->e:Ljava/util/List;

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 289
    sget-object v0, Lo/cwh;->c:Ljava/util/Map;

    sget-object v1, Lo/cwh;->e:Ljava/util/List;

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 287
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 292
    :cond_1
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 293
    :goto_1
    const/4 v0, 0x0

    sput-object v0, Lo/cwh;->b:Lo/cwh;

    .line 294
    const-string v0, "HWWearableManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy() complete"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 295
    return-void
.end method
